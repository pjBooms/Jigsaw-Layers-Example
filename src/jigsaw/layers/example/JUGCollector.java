package jigsaw.layers.example;

import jigsaw.layers.example.jugprovider.JUGProvider;

import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.ServiceLoader;
import java.util.Set;

public class JUGCollector
{
    private static ModuleLayer loadJugNskLayer(String from) {
        var finder = ModuleFinder.of(Paths.get(from));
        var parent = ModuleLayer.boot();
        var cf = parent.configuration().resolve(finder, ModuleFinder.of(), Set.of("jug.nsk.provider"));
        return parent.defineModulesWithOneLoader(cf, ClassLoader.getSystemClassLoader());
    }

    public static void main(String[] args) {
        var layer = loadJugNskLayer(args[0]);
        var services = ServiceLoader.load(layer, JUGProvider.class);
        services.stream().map(ServiceLoader.Provider::get).forEach(jugProvider ->
                System.out.println(jugProvider.provide()));
    }
}
