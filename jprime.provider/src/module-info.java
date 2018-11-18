import jigsaw.layers.example.javaconfprovider.JavaConfProvider;
import bg.jug.JavaConfProviderImpl;

module jprime.provider {

    requires jigsaw.layers.Example;
    provides JavaConfProvider with JavaConfProviderImpl;
}