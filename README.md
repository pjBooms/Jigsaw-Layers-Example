# Jigsaw Layers Example
Very short example on using Jigsaw Layers (used in the presentation "Escaping the Jar Hell with Jigsaw Layers").

The example contains four commits:

1. jigsaw.layers.Example module added that collects Java conferences via JavaConfProvider service interface
2. Devoxx Belgium Java conference provider added
3. Devoxx Ukraine Java conference provider added
4. Jigsaw layer created that loads `devoxx.ukraine.provider` module into a separate layer

# How to build and run
You need JDK 10+ to run this example.

1. Open the project in the IntelliJ IDEA (CE is enough).

2. Build Project

3. Create a run configuration:
   - Choose `jigsaw.layers.example.JavaConfCollector` as the main class
   - Use `devoxx.belgium.provider` as the classpath nodule
   - Use `out/production/devoxx.ukraine.provider` as Program arguments
   - Use the root project directory as Working directory

4. Run. You should get the following:

```
Hello from Devoxx Ukraine!
Hello from Devoxx Belgium!
```
