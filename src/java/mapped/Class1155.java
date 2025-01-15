// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1155 implements Runnable
{
    private static String[] field6256;
    public final /* synthetic */ long field6257;
    public final /* synthetic */ long field6258;
    public final /* synthetic */ Class14 field6259;
    public final /* synthetic */ long field6260;
    public final /* synthetic */ Class14 field6261;
    public final /* synthetic */ long field6262;
    
    public Class1155(final long field6257, final long field6258, final Class14 field6259, final long field6260, final Class14 field6261, final long field6262) {
        this.field6257 = field6257;
        this.field6258 = field6258;
        this.field6259 = field6259;
        this.field6260 = field6260;
        this.field6261 = field6261;
        this.field6262 = field6262;
    }
    
    @Override
    public void run() {
        for (long field6257 = this.field6257; field6257 < this.field6258; ++field6257) {
            this.field6259.method197(this.field6260 + field6257, this.field6261.method192(this.field6262 + field6257));
        }
    }
}
