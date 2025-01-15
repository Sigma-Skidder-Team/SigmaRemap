// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1077 implements Runnable
{
    private static String[] field5798;
    public final /* synthetic */ long field5799;
    public final /* synthetic */ long field5800;
    public final /* synthetic */ Class16 field5801;
    public final /* synthetic */ long field5802;
    public final /* synthetic */ short[] field5803;
    public final /* synthetic */ int field5804;
    
    public Class1077(final long field5799, final long field5800, final Class16 field5801, final long field5802, final short[] field5803, final int field5804) {
        this.field5799 = field5799;
        this.field5800 = field5800;
        this.field5801 = field5801;
        this.field5802 = field5802;
        this.field5803 = field5803;
        this.field5804 = field5804;
    }
    
    @Override
    public void run() {
        for (long field5799 = this.field5799; field5799 < this.field5800; ++field5799) {
            this.field5801.method163(this.field5802 + field5799, this.field5803[this.field5804 + (int)field5799]);
        }
    }
}
