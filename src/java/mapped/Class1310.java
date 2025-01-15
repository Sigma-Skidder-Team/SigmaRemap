// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1310 implements Runnable
{
    private static String[] field7181;
    public final /* synthetic */ int field7182;
    public final /* synthetic */ int field7183;
    public final /* synthetic */ int field7184;
    public final /* synthetic */ int field7185;
    public final /* synthetic */ float[] field7186;
    public final /* synthetic */ Class6362 field7187;
    
    public Class1310(final Class6362 field7187, final int field7188, final int field7189, final int field7190, final int field7191, final float[] field7192) {
        this.field7187 = field7187;
        this.field7182 = field7188;
        this.field7183 = field7189;
        this.field7184 = field7190;
        this.field7185 = field7191;
        this.field7186 = field7192;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method18998(this.field7187)];
        for (int i = this.field7182; i < this.field7183; ++i) {
            final int n = i * this.field7184;
            for (int j = 0; j < Class6362.method19001(this.field7187); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6362.method18998(this.field7187); ++k) {
                    final int n3 = n + k * this.field7185 + n2;
                    final int n4 = 2 * k;
                    array[n4] = this.field7186[n3];
                    array[n4 + 1] = this.field7186[n3 + 1];
                }
                Class6362.method19002(this.field7187).method25925(array);
                for (int l = 0; l < Class6362.method18998(this.field7187); ++l) {
                    final int n5 = n + l * this.field7185 + n2;
                    final int n6 = 2 * l;
                    this.field7186[n5] = array[n6];
                    this.field7186[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
