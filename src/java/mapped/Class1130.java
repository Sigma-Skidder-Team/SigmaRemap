// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1130 implements Runnable
{
    private static String[] field6103;
    public final /* synthetic */ int field6104;
    public final /* synthetic */ int field6105;
    public final /* synthetic */ int field6106;
    public final /* synthetic */ int field6107;
    public final /* synthetic */ float[] field6108;
    public final /* synthetic */ boolean field6109;
    public final /* synthetic */ Class8328 field6110;
    
    public Class1130(final Class8328 field6110, final int field6111, final int field6112, final int field6113, final int field6114, final float[] field6115, final boolean field6116) {
        this.field6110 = field6110;
        this.field6104 = field6111;
        this.field6105 = field6112;
        this.field6106 = field6113;
        this.field6107 = field6114;
        this.field6108 = field6115;
        this.field6109 = field6116;
    }
    
    @Override
    public void run() {
        if (this.field6104 != 0) {
            if (this.field6105 != 1) {
                for (int i = this.field6106; i < Class8328.method27760(this.field6110); i += this.field6107) {
                    Class8328.method27759(this.field6110).method25949(this.field6108, i * Class8328.method27763(this.field6110), this.field6109);
                }
            }
            else {
                for (int j = this.field6106; j < Class8328.method27760(this.field6110); j += this.field6107) {
                    Class8328.method27759(this.field6110).method25935(this.field6108, j * Class8328.method27763(this.field6110));
                }
            }
        }
        else if (this.field6105 != -1) {
            for (int k = this.field6106; k < Class8328.method27760(this.field6110); k += this.field6107) {
                Class8328.method27759(this.field6110).method25931(this.field6108, k * Class8328.method27763(this.field6110), this.field6109);
            }
        }
        else {
            for (int l = this.field6106; l < Class8328.method27760(this.field6110); l += this.field6107) {
                Class8328.method27759(this.field6110).method25927(this.field6108, l * Class8328.method27763(this.field6110));
            }
        }
    }
}
