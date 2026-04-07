// InvalidBirdDataException.java
// Julio Colon
// 4/7/2026
// Custom exception for Palmer Penguin data

package edu.fscj.cop2800c.penguin;

public class InvalidBirdDataException extends Exception {
    public InvalidBirdDataException(String message) {
        super(message);
    }
}
