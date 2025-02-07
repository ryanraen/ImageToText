package model;

import java.util.List;

import org.opencv.core.Mat;

// Represents an image conversion having a file path, matrix that holds the image
// a list of matrices holding sliced sub-images of individual characters, 
// a black and white polarization threshold constant, 
// a list of character templates, and the extracted text
public class ImageConversion {

    // EFFECTS: initializes filePath, extractedText as empty Strings,
    // initializes image as null, and initializes character template list
    public ImageConversion() {
        // stub
    }

    // EFFECTS: initializes filePath with given filePath, and set
    // default values for all other fields
    public ImageConversion(String filePath) {
        // stub
    }

    public String getFilePath() {
        return null; // stub
    }

    public String getExtractedText() {
        return null; // stub
    }

    // REQURES: path must be a valid file path to an image in data/images
    // MODIFIES: this
    // EFFECTS: stores path as filePath, reads the image at path,
    // and stores it in imageMat
    public void readImage(String path) {
        // stub
    }

    // REQUIRES: image must be a valid image containing lines of Robotto font plain
    // text
    // MODIFIES: this
    // EFFECTS: processes image and saves recognized text in extractedText
    public void processImage() {
        // stub
    }

    // REQUIRES: image must be a standard RGB BufferedImage
    // MODIFIES: this
    // EFFECTS: converts image to grayscale
    private void toGrayscale() {
        // stub
    }

    // REQUIRES: image must be in grayscale
    // MODIFIES: this
    // EFFECTS: convert all pixels to either black or white using numerical
    // threshold
    private void polarizeImage() {
        // stub
    }

    // REQUIRES: there must be at least 1 pixel of white margin between adjacent
    // text characters in the image
    // MODIFIES: this
    // EFFECTS: slices image into a list of sub-images containing 
    // 1 text character each
    private void sliceImage() {
        // stub
        // Note to self: slice out rows first then columns
    }

    // EFFECTS: returns resized image that matches given width and height
    private Mat resizeImage(Mat image, int width, int height) {
        return null; // stub
    }

    // REQUIRES: image must have the same dimensions as each template in templates,
    // given image matrix must contain exactly 1 recognizable English character,
    // and this character must match an existing template in templates
    // EFFECTS: compares a sliced image with all template character images and
    // assigns a similarity score out of 1 for the comparison; returns English character
    // with greatest similarity score
    private char compareWithTemplates(Mat image, List<CharacterTemplate> templates) {
        return 'a'; // stub
    }

}