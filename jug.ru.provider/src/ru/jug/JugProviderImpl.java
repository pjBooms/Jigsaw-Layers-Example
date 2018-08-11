package ru.jug;

import jigsaw.layers.example.jugprovider.JUGProvider;

public class JugProviderImpl implements JUGProvider {

    @Override
    public String provide() {
        return "Hello from JUG.ru!";
    }
}
