// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;

public final class Class1032 implements Runnable
{
    private static String[] field5531;
    private final InputStream field5532;
    public final /* synthetic */ Class1750 field5533;
    
    public Class1032(final Class1750 field5533, final InputStream field5534) {
        this.field5533 = field5533;
        this.field5532 = field5534;
    }
    
    @Override
    public void run() {
        final byte[] array = new byte[16384];
        try {
            int read;
            while ((read = this.field5532.read(array)) != -1 && !Thread.interrupted()) {
                if (read > 0) {
                    Class1750.method6181(this.field5533).write(array, 0, read);
                    Class1750.method6183(this.field5533, Class1750.method6182(this.field5533) + read);
                }
                else {
                    Thread.sleep(20L);
                }
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        if (!Thread.interrupted()) {
            Class1750.method6184(this.field5533, true);
            if (Class1750.method6185(this.field5533) != null && Class1750.method6181(this.field5533) != null) {
                Class1750.method6185(this.field5533).method27560(Class1750.method6181(this.field5533).method6073(), 0, Class1750.method6182(this.field5533));
            }
        }
    }
}
