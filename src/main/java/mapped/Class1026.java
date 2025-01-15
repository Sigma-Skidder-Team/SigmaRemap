// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1026 implements Runnable
{
    private static String[] field5497;
    public final /* synthetic */ long field5498;
    public final /* synthetic */ long field5499;
    public final /* synthetic */ Class13 field5500;
    public final /* synthetic */ long field5501;
    public final /* synthetic */ String[] field5502;
    public final /* synthetic */ int field5503;
    
    public Class1026(final long field5498, final long field5499, final Class13 field5500, final long field5501, final String[] field5502, final int field5503) {
        this.field5498 = field5498;
        this.field5499 = field5499;
        this.field5500 = field5500;
        this.field5501 = field5501;
        this.field5502 = field5502;
        this.field5503 = field5503;
    }
    
    @Override
    public void run() {
        for (long field5498 = this.field5498; field5498 < this.field5499; ++field5498) {
            this.field5500.method154(this.field5501 + field5498, this.field5502[this.field5503 + (int)field5498]);
        }
    }
}
