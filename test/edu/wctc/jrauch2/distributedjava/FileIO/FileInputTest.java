package edu.wctc.jrauch2.distributedjava.FileIO;

import org.junit.*;
import org.junit.rules.TemporaryFolder;

import java.io.*;

import static org.junit.Assert.*;

public class FileInputTest {
    private Writer out;
    private FileInput testFileInput;
    private File testFile;
    /**
     * JUnit rule to allow temporary folder.
     */
    @Rule
    public TemporaryFolder folder= new TemporaryFolder();

    /**
     * Set up the test file to be read and fill with data.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        testFile = folder.newFile("test.txt");
        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(testFile)));
        out.write("test line one\ntest line two\ntest line three\ntest line four");
        out.close();
        testFileInput = new FileInput(testFile);
    }

    /**
     * Close the file after read.
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        testFileInput.fileClose();
    }

    /**
     * Test that the file can be read and that the line read matches what is accepted.
     */
    @Test
    public void testCanReadFile() {
        assertEquals("The line read should be the same as the test line.", "test line one", testFileInput.fileReadLine());
    }

    /**
     * Test that fileReadLine reads anything at all.
     */
    @Test
    public void testFileReadLine() {
        assertNotNull("Should read something.", testFileInput.fileReadLine());
    }
}