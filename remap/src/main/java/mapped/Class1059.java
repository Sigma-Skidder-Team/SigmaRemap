// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1059 implements Runnable
{
    private static String[] field5693;
    public final /* synthetic */ long field5694;
    public final /* synthetic */ long field5695;
    public final /* synthetic */ Class19 field5696;
    public final /* synthetic */ long field5697;
    public final /* synthetic */ int[] field5698;
    public final /* synthetic */ int field5699;
    
    public Class1059(final long field5694, final long field5695, final Class19 field5696, final long field5697, final int[] field5698, final int field5699) {
        this.field5694 = field5694;
        this.field5695 = field5695;
        this.field5696 = field5696;
        this.field5697 = field5697;
        this.field5698 = field5698;
        this.field5699 = field5699;
    }
    
    @Override
    public void run() {
        for (long field5694 = this.field5694; field5694 < this.field5695; ++field5694) {
            this.field5696.method165(this.field5697 + field5694, this.field5698[this.field5699 + (int)field5694]);
        }
    }
}
