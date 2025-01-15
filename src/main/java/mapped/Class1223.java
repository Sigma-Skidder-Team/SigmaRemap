// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1223 implements Runnable
{
    private static String[] field6645;
    public final /* synthetic */ long field6646;
    public final /* synthetic */ long field6647;
    public final /* synthetic */ Class13 field6648;
    public final /* synthetic */ long field6649;
    public final /* synthetic */ Class13 field6650;
    public final /* synthetic */ long field6651;
    
    public Class1223(final long field6646, final long field6647, final Class13 field6648, final long field6649, final Class13 field6650, final long field6651) {
        this.field6646 = field6646;
        this.field6647 = field6647;
        this.field6648 = field6648;
        this.field6649 = field6649;
        this.field6650 = field6650;
        this.field6651 = field6651;
    }
    
    @Override
    public void run() {
        for (long field6646 = this.field6646; field6646 < this.field6647; ++field6646) {
            this.field6648.method154(this.field6649 + field6646, this.field6650.method182(this.field6651 + field6646));
        }
    }
}
