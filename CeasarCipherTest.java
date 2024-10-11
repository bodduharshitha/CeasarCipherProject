import org.junit.Assert;
import org.junit.Test;

public class CeasarCipherTest {

    @Test
    public void testCipher() {
        CeasarCipher cc = new CeasarCipher();
        String message = "how are you doing today";
        int offset = 12;
        String expectedCipheredMessage = "tai mdq kag pauzs fapmk";
        
        // Test the cipher method
        String actualCipheredMessage = cc.cipher(message, offset);
        Assert.assertEquals(expectedCipheredMessage, actualCipheredMessage);
    }
}
