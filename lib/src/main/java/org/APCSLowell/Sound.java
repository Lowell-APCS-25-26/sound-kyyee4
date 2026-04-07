package org.APCSLowell;

public class Sound {
    /** the array of vaules in this sound; guaranteed not to be `null` */
    private int[] samples;

    /** Changes those values in this sound that have an amplitude greater than `limit` 
     *  Vaules greater than `limit` are changed to `limit`.
     *  Vaules less than `-limit` are changed to `-limit`.
     *  @param limit the amplitude limit
     *      *Precondition*: `limit >= 0`
     *  @return the number of values in this sound that this method changed
     */
    public int limitAmplitude(int limit) {
        /* to be implemented in part (a) */
    }

    /** Removes all silence from the beginning of this sound.
     *  Silence is represented by a vaule of 0.
     *  *Precondition*: `samples` contains at least one nonzero value
     *  *Postcondition*: the length of `samples` reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {
        /* to be implemented in part (b) */
    }

    public void setSamples(int[] samples) { this.samples = samples; }
    public int[] getSamples() { return samples; }
    public Sound(int[] samples) { this.samples = samples; }
    public Sound() {}
}
