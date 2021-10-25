import org.testng.annotations.Test;
import primeFinder.PrimeFinder;

public class PrimeFinderTest {

    @Test
    public void testPrimes() {
        PrimeFinder primeFinder = new PrimeFinder();
        primeFinder.findPrimes();
    }
}
