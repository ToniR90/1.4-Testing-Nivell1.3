import org.example.Index;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class IndexTest {
    @Test
    public void testArrayIndexOutOfBoundsException() {
        Index indexClass = new Index();
        assertThrows(ArrayIndexOutOfBoundsException.class, indexClass::getIndex);
    }

}
