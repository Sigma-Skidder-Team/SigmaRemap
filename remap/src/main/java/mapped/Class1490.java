// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class Class1490 implements Runnable
{
    private static String[] field8285;
    private final boolean field8286;
    
    public Class1490(final boolean field8286) {
        this.field8286 = field8286;
    }
    
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (Client.method35173().method35209() == Class2209.field13463) {
                try {
                    Thread.sleep(200L);
                    continue;
                }
                catch (final InterruptedException ex) {
                    break;
                }
            }
            Class6466.field25695 = this.field8286;
            break;
        }
    }
}
