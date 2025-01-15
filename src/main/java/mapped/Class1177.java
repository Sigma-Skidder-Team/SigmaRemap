// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1177 implements Runnable
{
    private static String[] field6381;
    public final /* synthetic */ long field6382;
    public final /* synthetic */ long field6383;
    public final /* synthetic */ Class15 field6384;
    public final /* synthetic */ long field6385;
    public final /* synthetic */ long[] field6386;
    public final /* synthetic */ int field6387;
    
    public Class1177(final long field6382, final long field6383, final Class15 field6384, final long field6385, final long[] field6386, final int field6387) {
        this.field6382 = field6382;
        this.field6383 = field6383;
        this.field6384 = field6384;
        this.field6385 = field6385;
        this.field6386 = field6386;
        this.field6387 = field6387;
    }
    
    @Override
    public void run() {
        for (long field6382 = this.field6382; field6382 < this.field6383; ++field6382) {
            this.field6384.method167(this.field6385 + field6382, this.field6386[this.field6387 + (int)field6382]);
        }
    }
}
