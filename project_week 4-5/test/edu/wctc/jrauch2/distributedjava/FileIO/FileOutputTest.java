package edu.wctc.jrauch2.distributedjava.FileIO;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.Assert.*;

public class FileOutputTest {
    private BufferedReader in = null;
    private File testFile;
    private FileOutput testFileOutput;


    @Rule
    public TemporaryFolder folder= new TemporaryFolder();

    @Before
    public void setUp() throws Exception {
        testFile = folder.newFile("test.txt");
        testFileOutput = new FileOutput(testFile);
    }

    @After
    public void tearDown() throws Exception {
        testFileOutput.fileClose();
    }

    @Test
    public void testCanFileWrite() throws Exception {
        testFileOutput.fileWrite("test line one");
        in = new BufferedReader(new FileReader(testFile));
        assertEquals("The line read should be the same as the test line.", "test line one", in.readLine());

    }
}