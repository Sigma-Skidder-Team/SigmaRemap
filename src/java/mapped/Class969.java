// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class969 implements Runnable
{
    private static String[] field5155;
    public final /* synthetic */ int field5156;
    public final /* synthetic */ int field5157;
    public final /* synthetic */ int field5158;
    public final /* synthetic */ float[][] field5159;
    public final /* synthetic */ float[][] field5160;
    public final /* synthetic */ Class8328 field5161;
    
    public Class969(final Class8328 field5161, final int field5162, final int field5163, final int field5164, final float[][] field5165, final float[][] field5166) {
        this.field5161 = field5161;
        this.field5156 = field5162;
        this.field5157 = field5163;
        this.field5158 = field5164;
        this.field5159 = field5165;
        this.field5160 = field5166;
    }
    
    @Override
    public void run() {
        for (int i = this.field5156; i < this.field5157; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < this.field5158; ++j) {
                final int n2 = 2 * j;
                this.field5159[i][n2] = this.field5160[j][n];
                this.field5159[i][n2 + 1] = this.field5160[j][n + 1];
            }
        }
    }
}
