// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1509 implements Runnable
{
    private static String[] field8400;
    public final /* synthetic */ int field8401;
    public final /* synthetic */ int field8402;
    public final /* synthetic */ int field8403;
    public final /* synthetic */ int field8404;
    public final /* synthetic */ float[] field8405;
    public final /* synthetic */ boolean field8406;
    public final /* synthetic */ Class6362 field8407;
    
    public Class1509(final Class6362 field8407, final int field8408, final int field8409, final int field8410, final int field8411, final float[] field8412, final boolean field8413) {
        this.field8407 = field8407;
        this.field8401 = field8408;
        this.field8402 = field8409;
        this.field8403 = field8410;
        this.field8404 = field8411;
        this.field8405 = field8412;
        this.field8406 = field8413;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method19003(this.field8407)];
        for (int i = this.field8401; i < this.field8402; ++i) {
            final int n = i * this.field8403;
            for (int j = 0; j < Class6362.method19001(this.field8407); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6362.method19003(this.field8407); ++k) {
                    final int n3 = 2 * k;
                    final int n4 = k * this.field8404 + n + n2;
                    array[n3] = this.field8405[n4];
                    array[n3 + 1] = this.field8405[n4 + 1];
                }
                Class6362.method19004(this.field8407).method25929(array, this.field8406);
                for (int l = 0; l < Class6362.method19003(this.field8407); ++l) {
                    final int n5 = 2 * l;
                    final int n6 = l * this.field8404 + n + n2;
                    this.field8405[n6] = array[n5];
                    this.field8405[n6 + 1] = array[n5 + 1];
                }
            }
        }
    }
}
