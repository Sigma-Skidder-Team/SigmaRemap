// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1220 implements Runnable
{
    private static String[] field6624;
    public final /* synthetic */ long field6625;
    public final /* synthetic */ long field6626;
    public final /* synthetic */ Class23 field6627;
    public final /* synthetic */ long field6628;
    public final /* synthetic */ boolean[] field6629;
    public final /* synthetic */ int field6630;
    
    public Class1220(final long field6625, final long field6626, final Class23 field6627, final long field6628, final boolean[] field6629, final int field6630) {
        this.field6625 = field6625;
        this.field6626 = field6626;
        this.field6627 = field6627;
        this.field6628 = field6628;
        this.field6629 = field6629;
        this.field6630 = field6630;
    }
    
    @Override
    public void run() {
        for (long field6625 = this.field6625; field6625 < this.field6626; ++field6625) {
            this.field6627.method157(this.field6628 + field6625, this.field6629[this.field6630 + (int)field6625]);
        }
    }
}
