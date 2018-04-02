package edu.wctc.jrauch2.week9.djclassproject.FileIO;

import java.io.*;

/**
 * This class outputs to a file.
 * @since  1.0 12/27/17
 * @author Matt Green, Joshua Rauch
 * @version 1.2
 */
public class FileOutput {

    Writer out = null;
    private String fileName;
    private File file;

    /**
     *
     * @param fileName The name of the to write to.
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     *
     * @param file The actual file to write to.
     */
    public FileOutput(File file) {
        this.file = file;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + file + " "  + e);
        }
    }

    /**
     *
     * @param line The string to write on a line in the file.
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * Close the file.
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}