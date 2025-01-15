// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1088 implements Runnable
{
    public final /* synthetic */ Class8437[] field5870;
    public final /* synthetic */ Class4963 field5871;
    
    public Class1088(final Class4963 field5871, final Class8437[] field5872) {
        this.field5871 = field5871;
        this.field5870 = field5872;
    }
    
    @Override
    public void run() {
        if (this.field5871.field21328 == Class2086.field12061) {
            try {
                this.field5871.method15005(this.field5870);
                return;
            }
            catch (final Class2354 cause) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException("Transport not open");
        }
        throw new RuntimeException("Transport not open");
    }
}
