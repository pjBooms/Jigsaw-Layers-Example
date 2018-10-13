package jigsaw.layers.example;

import jigsaw.layers.example.javaconfprovider.JavaConfProvider;

import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.ServiceLoader;
import java.util.Set;

public class JavaConfCollector
{
    private static ModuleLayer createLayer(String from, String module) {
        var finder = ModuleFinder.of(Paths.get(from));
        var parent = ModuleLayer.boot();
        var cf = parent.configuration().resolve(finder, ModuleFinder.of(), Set.of(module));
        return parent.defineModulesWithOneLoader(cf, ClassLoader.getSystemClassLoader());
    }

    public static void main(String[] args) {
        var layer = createLayer(args[0], "geecon.prague.provider");
        var services = ServiceLoader.load(layer, JavaConfProvider.class);
        services.stream()
                .map(ServiceLoader.Provider::get)
                .forEach(confProvider ->
                        System.out.println(confProvider.provide())
                );
    }
}
