import org.junit.Assert;
import org.junit.Test;

public class TestTemperatureConverterSimple {

    @Test
    public void testConvertCtoK1() {
        double result = TemperatureConverter.convertCtoK(0.0);
        Assert.assertEquals(273.2, result, 0.1);
    }

    @Test
    public void testConvertCtoK2() {
        double result = TemperatureConverter.convertCtoK(-100.0);
        Assert.assertEquals(173.2, result, 0.1);
    }

    @Test
    public void testConvertKtoC1() {
        double result = TemperatureConverter.convertKtoC(173.2);
        Assert.assertEquals(-100.0, result, 0.01);
    }

    @Test
    public void testConvertKtoC2() {
        double result = TemperatureConverter.convertKtoC(273.2);
        Assert.assertEquals(0.0, result, 0.01);
    }
}
