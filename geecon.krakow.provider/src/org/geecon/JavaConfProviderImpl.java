package org.geecon;

import jigsaw.layers.example.javaconfprovider.JavaConfProvider;

public class JavaConfProviderImpl implements JavaConfProvider {

    @Override
    public String provide() {
        return "Hello from GeeCON Krakow!";
    }
}
