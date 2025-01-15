// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1410 implements Runnable
{
    private static String[] field7791;
    public final /* synthetic */ int field7792;
    public final /* synthetic */ int field7793;
    public final /* synthetic */ int field7794;
    public final /* synthetic */ int field7795;
    public final /* synthetic */ double[][] field7796;
    public final /* synthetic */ boolean field7797;
    public final /* synthetic */ Class8983 field7798;
    
    public Class1410(final Class8983 field7798, final int field7799, final int field7800, final int field7801, final int field7802, final double[][] field7803, final boolean field7804) {
        this.field7798 = field7798;
        this.field7792 = field7799;
        this.field7793 = field7800;
        this.field7794 = field7801;
        this.field7795 = field7802;
        this.field7796 = field7803;
        this.field7797 = field7804;
    }
    
    @Override
    public void run() {
        if (this.field7792 != 0) {
            if (this.field7793 != 1) {
                for (int i = this.field7794; i < Class8983.method31976(this.field7798); i += this.field7795) {
                    Class8983.method31975(this.field7798).method26088(this.field7796[i], this.field7797);
                }
            }
            else {
                for (int j = this.field7794; j < Class8983.method31976(this.field7798); j += this.field7795) {
                    Class8983.method31975(this.field7798).method26080(this.field7796[j]);
                }
            }
        }
        else if (this.field7793 != -1) {
            for (int k = this.field7794; k < Class8983.method31976(this.field7798); k += this.field7795) {
                Class8983.method31975(this.field7798).method26076(this.field7796[k], this.field7797);
            }
        }
        else {
            for (int l = this.field7794; l < Class8983.method31976(this.field7798); l += this.field7795) {
                Class8983.method31975(this.field7798).method26072(this.field7796[l]);
            }
        }
    }
}
