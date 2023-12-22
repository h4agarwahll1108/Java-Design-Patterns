package com.harshit1108.Object_Pool;
/**
Object pool pattern is a software creational design pattern which is used in situations
where the cost of initializing a class instance is very high.
Basically, an Object pool is a container which contains some amount of objects. So,
when an object is taken from the pool, it is not available in the pool until it is put back.
 */
public class Main {

    public static void main(String[] args) {
        // Step 4: Client requests ImageProcessor objects from the pool
        ImageProcessorPool processorPool = new ImageProcessorPool(2);

        ImageProcessor processor1 = processorPool.acquireProcessor();
        processor1.processImage("image1.jpg");
        processorPool.releaseProcessor(processor1);

        ImageProcessor processor2 = processorPool.acquireProcessor();
        processor2.processImage("image2.jpg");
        processorPool.releaseProcessor(processor2);

        ImageProcessor processor3 = processorPool.acquireProcessor();
        processor3.processImage("image3.jpg");
        processorPool.releaseProcessor(processor3);

        ImageProcessor processor4 = processorPool.acquireProcessor();
        processor4.processImage("image4.jpg");
        processorPool.releaseProcessor(processor4);
    }
}
