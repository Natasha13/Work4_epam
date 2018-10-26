import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTemperatureConverter {

    @Parameterized.Parameter(0)
    public double temperatureC;
    @Parameterized.Parameter(1)
    public double temperatureK;
    @Parameterized.Parameter(2)
    public double temperatureF;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 273.2, 32},
                {-100.0, 173.2, -148.0},
                {-273.2, 0.0, -459.76},
                {273.2, 546.4, 523.76}
        });
    }

    @Test
    public void testConvertCtoK() {
        double result = TemperatureConverter.convertCtoK(temperatureC);
        Assert.assertEquals(temperatureK, result, 0.1);
    }

    @Test
    public void testConvertKtoC() {
        double result = TemperatureConverter.convertKtoC(temperatureK);
        Assert.assertEquals(temperatureC, result, 0.1);
    }

    @Test
    public void testConvertKtoF() {
        double result = TemperatureConverter.convertKtoF(temperatureK);
        Assert.assertEquals(temperatureF, result, 0.1);
    }

    @Test
    public void testConvertFtoC() {
        double result = TemperatureConverter.convertFtoC(temperatureF);
        Assert.assertEquals(temperatureC, result, 0.1);
    }

    @Test
    public void testConvertFtoK() {
        double result = TemperatureConverter.convertFtoK(temperatureF);
        Assert.assertEquals(temperatureK, result, 0.1);
    }

    @Test
    public void testConvertCtoF() {
        double result = TemperatureConverter.convertCtoF(temperatureC);
        Assert.assertEquals(temperatureF, result, 0.1);
    }
}
