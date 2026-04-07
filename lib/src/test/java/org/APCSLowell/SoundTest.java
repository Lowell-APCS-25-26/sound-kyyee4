package org.APCSLowell;

import org.junit.Test;
import static org.junit.Assert.*;

public class SoundTest {
    @Test
    public void partA1() {
        Sound temp = new Sound();
        temp.setSamples(new int[] { 40, 2532, 17, -2300, -17, -4000, 2000 });
        int result = temp.limitAmplitude(2000);
        String failMsg = "Failed - Input=" + temp.getSamples() + ", Expected 3, Output = " + result;
        assertEquals(failMsg, 3, result);
    }

    @Test
    public void partA2() {
        Sound temp = new Sound();
        temp.setSamples(new int[] { 1048, -420, 33, 15, -32, 2030, 3223 });
        int result = temp.limitAmplitude(2000);
        // answer {1048, -420, 33, 15, -32, 2000, 2000};
        String failMsg = "Failed - Input=" + temp.getSamples() + ", Expected 2, Output = " + result;
        assertEquals(failMsg, 2, result);
    }

    @Test
    public void partA3() {
        Sound temp = new Sound();
        temp.setSamples(new int[] { 40, 2532, 17, -2300, -17, -4000, 2000 });
        // int [] samples = {40, 2532, 17, -2300, -17, -4000, 2000};
        int result = temp.limitAmplitude(0);
        // answer [40, 2000, 17, -2000, -17, -2000, 2000]
        String failMsg = "Failed - Input=" + temp.getSamples() + ", Expected 7, Output = " + result;
        assertEquals(failMsg, 7, result);
    }

    @Test
    public void partA4() {
        Sound temp = new Sound();
        temp.setSamples(new int[] {});
        // int [] samples = {40, 2532, 17, -2300, -17, -4000, 2000};
        int result = temp.limitAmplitude(1);
        // answer [40, 2000, 17, -2000, -17, -2000, 2000]
        String failMsg = "Failed - Input=" + temp.getSamples() + ", Expected 0, Output = " + result;
        assertEquals(failMsg, 0, result);
        // Failed - Input {} limitAmplitude(1) Expected Output 0
    }

    @Test
    public void partB1() {
        Sound temp = new Sound();
        temp.setSamples(new int[] { 0, 2532, 17, -2300, -17, -4000, 2000 });
        temp.trimSilenceFromBeginning();
        int[] answer = new int[] { 2532, 17, -2300, -17, -4000, 2000 };
        for (int i = 0; i < answer.length; i++) {
            String failMsg = "Test failed. Expected " + answer[i] + " at sample index " + i + ", but found "
                    + temp.getSamples()[i];
            assertEquals(failMsg, temp.getSamples()[i], answer[i]);
        }
    }

    @Test
    public void partB2() {
        Sound temp = new Sound();
        temp.setSamples(new int[] { 0, 0, 0, 0, 2532, 17, -2300, -17, 0, 0, 0, -4000, 2000, 0, 0, 0 });
        temp.trimSilenceFromBeginning();
        int[] answer = new int[] { 2532, 17, -2300, -17, 0, 0, 0, -4000, 2000, 0, 0, 0 };
        for (int i = 0; i < answer.length; i++) {
            String failMsg = "Test failed. Expected " + answer[i] + " at sample index " + i + ", but found "
                    + temp.getSamples()[i];
            assertEquals(failMsg, temp.getSamples()[i], answer[i]);
        }
    }

    @Test
    public void partB3() {
        Sound temp = new Sound();
        temp.setSamples(new int[] { 1 });
        temp.trimSilenceFromBeginning();
        int[] answer = new int[] { 1 };
        for (int i = 0; i < answer.length; i++) {
            String failMsg = "Test failed. Expected " + answer[i] + " at sample index " + i + ", but found "
                    + temp.getSamples()[i];
            assertEquals(failMsg, temp.getSamples()[i], answer[i]);
        }
        // Failed - Input {1} Expected Output <nothing> but samples should be {1}
    }
}
