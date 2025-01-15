// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1366 implements Runnable
{
    private static String[] field7501;
    public final /* synthetic */ int field7502;
    public final /* synthetic */ int field7503;
    public final /* synthetic */ int field7504;
    public final /* synthetic */ double[] field7505;
    public final /* synthetic */ boolean field7506;
    public final /* synthetic */ Class8983 field7507;
    
    public Class1366(final Class8983 field7507, final int field7508, final int field7509, final int field7510, final double[] field7511, final boolean field7512) {
        this.field7507 = field7507;
        this.field7502 = field7508;
        this.field7503 = field7509;
        this.field7504 = field7510;
        this.field7505 = field7511;
        this.field7506 = field7512;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class8983.method31976(this.field7507)];
        for (int i = this.field7502; i < this.field7503; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8983.method31976(this.field7507); ++j) {
                final int n2 = 2 * j;
                final int n3 = j * this.field7504 + n;
                array[n2] = this.field7505[n3];
                array[n2 + 1] = this.field7505[n3 + 1];
            }
            Class8983.method31977(this.field7507).method26076(array, this.field7506);
            for (int k = 0; k < Class8983.method31976(this.field7507); ++k) {
                final int n4 = 2 * k;
                final int n5 = k * this.field7504 + n;
                this.field7505[n5] = array[n4];
                this.field7505[n5 + 1] = array[n4 + 1];
            }
        }
    }
}
