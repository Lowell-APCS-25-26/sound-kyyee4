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
        int temp =0;
        for(int i =0;i<samples.length;i++){
            if(samples[i]>limit){
                samples[i]=limit;
                temp++;
            }else if(samples[i] < -limit){
                samples[i] = -limit;
                temp++;
            }
        }
        return temp;
    }

    /** Removes all silence from the beginning of this sound.
     *  Silence is represented by a vaule of 0.
     *  *Precondition*: `samples` contains at least one nonzero value
     *  *Postcondition*: the length of `samples` reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {
        /* to be implemented in part (b) */
        boolean L0 = true;
        int num0 = 0;
        for (int i =0;i<samples.length;i++){
            if (samples[i] == 0 && L0 == true){
                num0 ++;
            }else{
                L0 = false;
            }
        }
        int [] temp = new int[samples.length-num0];
        int n =0;
        for(int i = num0; i<samples.length;i++){
            temp[n] = samples[i];
            n++;
        }
        samples = temp;
    }

    public void setSamples(int[] samples) { this.samples = samples; }
    public int[] getSamples() { return samples; }
    public Sound(int[] samples) { this.samples = samples; }
    public Sound() {}
}
