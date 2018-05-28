package nl.han.toetsapplicatie.module.plugin;

import nl.han.toetsapplicatie.module.model.Vraag;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;

public class PluginLoader {

    private static HashMap<String, Class> classLoaderHashMap = new HashMap<>();

    public static Class getClass(Vraag vraag) throws ClassNotFoundException {
        if (classLoaderHashMap.containsKey(vraag.getPlugin())) {
            return classLoaderHashMap.get(vraag.getPlugin());
        }

        File folder = new File("./plugins");
        File[] files = folder.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                int index = files[i].getName().lastIndexOf('.');
                if (index > 0) {
                    String extension = files[i].getName().substring(index + 1);
                    if (extension.toLowerCase().equals("jar")) {
                        File jar = files[i];
                        URLClassLoader cl = null;
                        try {
                            cl = URLClassLoader.newInstance(new URL[]{jar.toURI().toURL()});
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }

                        try {
                            Class questionClass = cl.loadClass(vraag.getPlugin());
                            classLoaderHashMap.put(vraag.getPlugin(), questionClass);

                            return questionClass;
                        } catch (ClassNotFoundException e) {

                        }
                    }
                }
            }
        }

        throw new ClassNotFoundException();
    }

    public static Plugin getPlugin(Vraag vraag) throws ClassNotFoundException {
        try {
            Plugin pl = (Plugin) getClass(vraag).newInstance();
            pl.initialize(vraag.getData());
            return pl;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        throw new ClassNotFoundException();
    }
}

