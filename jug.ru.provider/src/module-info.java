import ru.jug.JugProviderImpl;
import jigsaw.layers.example.jugprovider.JUGProvider;

module jug.ru.provider {

    requires jigsaw.layers.Example;
    provides JUGProvider with JugProviderImpl;
}