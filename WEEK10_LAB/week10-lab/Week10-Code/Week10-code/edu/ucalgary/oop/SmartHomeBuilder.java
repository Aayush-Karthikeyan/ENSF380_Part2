package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.List;

public class SmartHomeBuilder {
    private List<SmartDevice<?>> devices = new ArrayList<>();
    
    // TODO: Implement addDevice functionality
    // Should add the provided device to the devices list
    // Should return this builder instance to allow method chaining
    // Example: builder.addDevice(light).addDevice(thermostat)
    public SmartHomeBuilder addDevice(SmartDevice<?> device) {
        // Student to implement
        // Add the device to the devices list
        // Return this for method chaining (an example is given in Lesson 24, 04_Builder)
        devices.add(device);
        return this;
    }
    
    // TODO: Implement build functionality
    // Should validate that at least one device has been added
    // Should throw IllegalStateException if no devices are registered
    // Should create and return a new SmartHome instance with the devices
    // The SmartHome constructor requires a List<SmartDevice<?>>
    public SmartHome build() {
        // Student to implement
        // Check if devices list is empty
        // If empty, throw new IllegalStateException("No devices registered. Add at least one device before building.")
        // Otherwise, create and return a new SmartHome(devices)
        if (devices.isEmpty()) {
            throw new IllegalStateException("No devices registered. Add at least one device before building");
        }
        else {
            return new SmartHome(devices);
        }
    }
}
