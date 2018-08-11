package jigsaw.layers.example;

import jigsaw.layers.example.javaconfprovider.JavaConfProvider;

import java.util.ServiceLoader;

public class JavaConfCollector
{
    public static void main(String[] args) {
        var services = ServiceLoader.load(JavaConfProvider.class);
        services.stream()
                .map(ServiceLoader.Provider::get)
                .forEach(confProvider ->
                        System.out.println(confProvider.provide())
                );
    }
}
