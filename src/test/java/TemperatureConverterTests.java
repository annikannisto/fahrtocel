import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTests {

    private TemperatureConverter converter;

    @Before
    public void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Testi 32°F → 0°C
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.001);
        // Testi 212°F → 100°C
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.001);
        // Testi -40°F → -40°C
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        // Testi 0°C → 32°F
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.001);
        // Testi 100°C → 212°F
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.001);
        // Testi -40°C → -40°F
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    public void testIsExtremeTemperature() {
        // Testi lämpötila -50°C, joka on äärimmäinen
        assertTrue(converter.isExtremeTemperature(-50));
        // Testi lämpötila 20°C, joka ei ole äärimmäinen
        assertFalse(converter.isExtremeTemperature(20));
        // Testi lämpötila 60°C, joka on äärimmäinen
        assertTrue(converter.isExtremeTemperature(60));
    }

    @Test
    public void testKelvinToFahrenheit() {
        // Test 300.1 K → 80.51 °F
        assertEquals(80.51, converter.kelvinToFah(300.1), 0.001);
        // Test 273.15 K → 32.0 °F (Freezing point of water)
        assertEquals(32.0, converter.kelvinToFah(273.15), 0.001);
        // Test 0 K → -459.67 °F (Absolute zero)
        assertEquals(-459.67, converter.kelvinToFah(0), 0.001);
    }


}
