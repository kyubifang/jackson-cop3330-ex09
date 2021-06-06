package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_length_width_f2_and_galNeed() {
        App myApp = new App();
        int length = 15;
        int width = 24;
        int f2 = length * width;
        final int convert = Math.round((int) Math.ceil((double)f2 / 350));
        int galNeed = Math.round(convert);

        String expectedOutput = """
                You entered dimensions of 15 feet by 24 feet.
                Your ceiling would be 360 square feet.
                You will need to purchase 2 gallons of paint to cover 360 square feet.""";
        String actualOutput = myApp.generateOutputString(length, width, f2, galNeed);

        assertEquals(expectedOutput, actualOutput);
    }
}