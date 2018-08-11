package jigsaw.layers.example;

import jigsaw.layers.example.jugprovider.JUGProvider;

import java.lang.module.ModuleFinder;
import java.nio.file.Paths;
import java.util.ServiceLoader;
import java.util.Set;

public class JUGCollector
{
    public static void main(String[] args) {
        var services = ServiceLoader.load(JUGProvider.class);
        services.stream().map(ServiceLoader.Provider::get).forEach(jugProvider ->
                System.out.println(jugProvider.provide()));
    }
}
