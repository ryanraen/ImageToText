package model;

import java.util.ArrayList;
import java.util.List;

// Represents a list of previous image conversion instances
public class ConversionHistory {
    private List<ImageConversion> conversions;

    // EFFECTS: initializes list of previous converions as empty list
    public ConversionHistory() {
        this.conversions = new ArrayList<>();
    }

    public List<ImageConversion> getConversions() {
        return this.conversions;
    }

    // EFFECTS: adds the given conversion to the conversion history
    public void addConversion(ImageConversion conversion) {
        this.conversions.add(conversion);
    }

    // REQUIRES: index <= size of list conversion history
    // EFFECTS: returns the index-th (starting from 1) most recent conversion
    public ImageConversion getByIndex(int index) {
        return conversions.get(conversions.size() - index);
    }

    // EFFECTS: retrieves the least recent (earliest) conversion instance
    // that has the given file path; returns null if not found
    public ImageConversion getByFilePath(String filePath) {
        for (ImageConversion conv : conversions) {
            if (conv.getFilePath().equals(filePath)) {
                return conv;
            }
        }
        return null;
    }

    // MODIFIES: this
    // EFFECTS: clears conversion history
    public void clear() {
        conversions.clear();
    }

    // MODIFIES: this
    // EFFECTS: deletes the least recent conversion instance that
    // has the given file path and returns true; 
    // returns null if not found
    public Boolean deleteByFilePath(String filePath) {
        for (int i = 0; i < conversions.size(); i++) {
            if (conversions.get(i).getFilePath().equals(filePath)) {
                conversions.remove(i);
                return true;
            }
        }
        return null;
    }

}
