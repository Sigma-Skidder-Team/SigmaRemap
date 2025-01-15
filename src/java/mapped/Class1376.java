// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1376 implements Runnable
{
    private static String[] field7560;
    public final /* synthetic */ int field7561;
    public final /* synthetic */ int field7562;
    public final /* synthetic */ int field7563;
    public final /* synthetic */ int field7564;
    public final /* synthetic */ double[][] field7565;
    public final /* synthetic */ boolean field7566;
    public final /* synthetic */ Class8983 field7567;
    
    public Class1376(final Class8983 field7567, final int field7568, final int field7569, final int field7570, final int field7571, final double[][] field7572, final boolean field7573) {
        this.field7567 = field7567;
        this.field7561 = field7568;
        this.field7562 = field7569;
        this.field7563 = field7570;
        this.field7564 = field7571;
        this.field7565 = field7572;
        this.field7566 = field7573;
    }
    
    @Override
    public void run() {
        if (this.field7561 != 0) {
            if (this.field7562 != 1) {
                for (int i = this.field7563; i < Class8983.method31976(this.field7567); i += this.field7564) {
                    Class8983.method31975(this.field7567).method26096(this.field7565[i], 0, this.field7566);
                }
            }
            else {
                for (int j = this.field7563; j < Class8983.method31976(this.field7567); j += this.field7564) {
                    Class8983.method31975(this.field7567).method26080(this.field7565[j]);
                }
            }
        }
        else if (this.field7562 != -1) {
            for (int k = this.field7563; k < Class8983.method31976(this.field7567); k += this.field7564) {
                Class8983.method31975(this.field7567).method26076(this.field7565[k], this.field7566);
            }
        }
        else {
            for (int l = this.field7563; l < Class8983.method31976(this.field7567); l += this.field7564) {
                Class8983.method31975(this.field7567).method26072(this.field7565[l]);
            }
        }
    }
}
