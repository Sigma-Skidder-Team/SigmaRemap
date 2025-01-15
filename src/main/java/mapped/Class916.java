// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.sound.sampled.SourceDataLine;

public class Class916 extends Thread
{
    private static String[] field4878;
    public final /* synthetic */ Class2416 field4879;
    
    public Class916(final Class2416 field4879) {
        this.field4879 = field4879;
    }
    
    @Override
    public void run() {
        synchronized (this.field4879) {
            if (!Class2416.access$200(this.field4879)) {
                Class2416.method9696(this.field4879).drain();
            }
            else {
                Class2416.method9696(this.field4879).flush();
            }
            Class2416.method9696(this.field4879).stop();
            Class2416.method9696(this.field4879).close();
            Class2416.method9700(this.field4879, null);
        }
    }
}
