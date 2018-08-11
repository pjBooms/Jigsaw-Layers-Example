import jigsaw.layers.example.javaconfprovider.JavaConfProvider;
import ru.jug.JavaConfProviderImpl;

module joker.provider {

    requires jigsaw.layers.Example;
    provides JavaConfProvider with JavaConfProviderImpl;
}