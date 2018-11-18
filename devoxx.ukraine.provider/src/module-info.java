import jigsaw.layers.example.javaconfprovider.JavaConfProvider;
import com.devoxx.JavaConfProviderImpl;

module devoxx.ukraine.provider {

    requires jigsaw.layers.Example;
    provides JavaConfProvider with JavaConfProviderImpl;
}