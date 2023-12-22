package com.harshit1108.Object_Pool;

import java.util.ArrayList;
import java.util.List;

// Step 3: Object Pool Management
class ImageProcessorPool {
    private final List<ImageProcessor> availableProcessors;
    private final List<ImageProcessor> inUseProcessors;

    public ImageProcessorPool(int poolSize) {
        availableProcessors = new ArrayList<>();
        inUseProcessors = new ArrayList<>();

        for (int i = 0; i < poolSize; i++) {
            availableProcessors.add(new ConcreteImageProcessor("Processor-" + (i + 1)));
        }
    }

    public synchronized ImageProcessor acquireProcessor() {
        //we can implement different logic also
        if (availableProcessors.isEmpty()) {
            // Create a new processor if the pool is empty
            ConcreteImageProcessor newProcessor = new ConcreteImageProcessor("Processor-" + (inUseProcessors.size() + 1));
            inUseProcessors.add(newProcessor);
            return newProcessor;
        } else {
            // Reuse an available processor
            ImageProcessor processor = availableProcessors.remove(0);
            inUseProcessors.add(processor);
            return processor;
        }
    }

    public synchronized void releaseProcessor(ImageProcessor processor) {
        // Release the processor back to the pool
        inUseProcessors.remove(processor);
        availableProcessors.add(processor);
    }
}