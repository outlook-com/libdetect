package io.marlinski.libdetect;/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

public class libdetectTest {

    /**
     * This test assumes that nothing else local to the machine the test is run on is listening on TEST_PORT or
     * TEST_PORT + 1. The test will start a TCP server on TEST_PORT, then the discovery event should fire. It should not
     * fire for TEST_PORT + 1 because nothing will be listening on there.
     */
    @Test public void libdetectBasic() throws Exception {


    }
}