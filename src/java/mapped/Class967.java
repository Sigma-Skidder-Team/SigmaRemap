// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class967 implements Runnable
{
    private static String[] field5145;
    public final /* synthetic */ Class1675 field5146;
    
    public Class967(final Class1675 field5146) {
        this.field5146 = field5146;
    }
    
    @Override
    public void run() {
        synchronized (this.field5146) {
            if (!this.field5146.field9494 | this.field5146.field9495) {
                return;
            }
            try {
                this.field5146.method5915();
            }
            catch (final IOException ex) {
                this.field5146.field9496 = true;
            }
            try {
                if (this.field5146.method5910()) {
                    this.field5146.method5901();
                    this.field5146.field9492 = 0;
                }
            }
            catch (final IOException ex2) {
                this.field5146.field9497 = true;
                this.field5146.field9490 = Class8753.method30276(Class8753.method30287());
            }
        }
    }
}
