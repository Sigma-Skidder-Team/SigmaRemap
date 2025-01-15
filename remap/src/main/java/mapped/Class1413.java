// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1413 implements Runnable
{
    private static String[] field7812;
    public final /* synthetic */ int field7813;
    public final /* synthetic */ int field7814;
    public final /* synthetic */ int field7815;
    public final /* synthetic */ int field7816;
    public final /* synthetic */ double[] field7817;
    public final /* synthetic */ boolean field7818;
    public final /* synthetic */ Class8983 field7819;
    
    public Class1413(final Class8983 field7819, final int field7820, final int field7821, final int field7822, final int field7823, final double[] field7824, final boolean field7825) {
        this.field7819 = field7819;
        this.field7813 = field7820;
        this.field7814 = field7821;
        this.field7815 = field7822;
        this.field7816 = field7823;
        this.field7817 = field7824;
        this.field7818 = field7825;
    }
    
    @Override
    public void run() {
        if (this.field7813 != 0) {
            if (this.field7814 != 1) {
                for (int i = this.field7815; i < Class8983.method31976(this.field7819); i += this.field7816) {
                    Class8983.method31975(this.field7819).method26096(this.field7817, i * Class8983.method31979(this.field7819), this.field7818);
                }
            }
            else {
                for (int j = this.field7815; j < Class8983.method31976(this.field7819); j += this.field7816) {
                    Class8983.method31975(this.field7819).method26082(this.field7817, j * Class8983.method31979(this.field7819));
                }
            }
        }
        else if (this.field7814 != -1) {
            for (int k = this.field7815; k < Class8983.method31976(this.field7819); k += this.field7816) {
                Class8983.method31975(this.field7819).method26078(this.field7817, k * Class8983.method31979(this.field7819), this.field7818);
            }
        }
        else {
            for (int l = this.field7815; l < Class8983.method31976(this.field7819); l += this.field7816) {
                Class8983.method31975(this.field7819).method26074(this.field7817, l * Class8983.method31979(this.field7819));
            }
        }
    }
}
