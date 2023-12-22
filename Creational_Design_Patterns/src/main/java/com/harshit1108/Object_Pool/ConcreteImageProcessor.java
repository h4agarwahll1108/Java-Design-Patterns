package com.harshit1108.Object_Pool;

// Step 2: Concrete ImageProcessor implementation
class ConcreteImageProcessor implements ImageProcessor {
    private final String processorId;

    public ConcreteImageProcessor(String processorId) {
        this.processorId = processorId;
    }

    @Override
    public void processImage(String imageName) {
        System.out.println("Processing image '" + imageName + "' using processor " + processorId);
        // Actual image processing logic
    }
}