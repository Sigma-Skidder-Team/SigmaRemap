// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1412 implements Runnable
{
    private static String[] field7805;
    public final /* synthetic */ int field7806;
    public final /* synthetic */ int field7807;
    public final /* synthetic */ int field7808;
    public final /* synthetic */ float[] field7809;
    public final /* synthetic */ boolean field7810;
    public final /* synthetic */ Class6710 field7811;
    
    public Class1412(final Class6710 field7811, final int field7812, final int field7813, final int field7814, final float[] field7815, final boolean field7816) {
        this.field7811 = field7811;
        this.field7806 = field7812;
        this.field7807 = field7813;
        this.field7808 = field7814;
        this.field7809 = field7815;
        this.field7810 = field7816;
    }
    
    @Override
    public void run() {
        if (this.field7806 != -1) {
            for (int i = this.field7807; i < Class6710.method20382(this.field7811); i += this.field7808) {
                Class6710.method20381(this.field7811).method34187(this.field7809, i * Class6710.method20380(this.field7811), this.field7810);
            }
        }
        else {
            for (int j = this.field7807; j < Class6710.method20382(this.field7811); j += this.field7808) {
                Class6710.method20381(this.field7811).method34183(this.field7809, j * Class6710.method20380(this.field7811), this.field7810);
            }
        }
    }
}
