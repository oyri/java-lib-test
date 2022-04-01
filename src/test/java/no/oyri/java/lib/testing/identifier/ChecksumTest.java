package no.oyri.java.lib.testing.identifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChecksumTest {

    @Test
    @DisplayName("Test checksum returns 0 when null input")
    public void testChecksum(){
        assertEquals(0,Checksum.getChecksum1(null));
    }

}
