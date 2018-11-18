import jigsaw.layers.example.javaconfprovider.JavaConfProvider;
import org.geecon.JavaConfProviderImpl;

module geecon.prague.provider {

    requires jigsaw.layers.Example;
    provides JavaConfProvider with JavaConfProviderImpl;
}