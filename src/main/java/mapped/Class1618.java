// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1618 implements Runnable
{
    private static String[] field9038;
    public final /* synthetic */ int field9039;
    public final /* synthetic */ int field9040;
    public final /* synthetic */ int field9041;
    public final /* synthetic */ float[][] field9042;
    public final /* synthetic */ boolean field9043;
    public final /* synthetic */ Class6710 field9044;
    
    public Class1618(final Class6710 field9044, final int field9045, final int field9046, final int field9047, final float[][] field9048, final boolean field9049) {
        this.field9044 = field9044;
        this.field9039 = field9045;
        this.field9040 = field9046;
        this.field9041 = field9047;
        this.field9042 = field9048;
        this.field9043 = field9049;
    }
    
    @Override
    public void run() {
        if (this.field9039 != -1) {
            for (int i = this.field9040; i < Class6710.method20382(this.field9044); i += this.field9041) {
                Class6710.method20381(this.field9044).method34185(this.field9042[i], this.field9043);
            }
        }
        else {
            for (int j = this.field9040; j < Class6710.method20382(this.field9044); j += this.field9041) {
                Class6710.method20381(this.field9044).method34181(this.field9042[j], this.field9043);
            }
        }
    }
}
