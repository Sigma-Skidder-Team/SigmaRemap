// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1456 implements Runnable
{
    private static String[] field8070;
    public final /* synthetic */ int field8071;
    public final /* synthetic */ int field8072;
    public final /* synthetic */ float[] field8073;
    public final /* synthetic */ boolean field8074;
    public final /* synthetic */ Class6710 field8075;
    
    public Class1456(final Class6710 field8075, final int field8076, final int field8077, final float[] field8078, final boolean field8079) {
        this.field8075 = field8075;
        this.field8071 = field8076;
        this.field8072 = field8077;
        this.field8073 = field8078;
        this.field8074 = field8079;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6710.method20382(this.field8075)];
        for (int i = this.field8071; i < this.field8072; ++i) {
            for (int j = 0; j < Class6710.method20382(this.field8075); ++j) {
                array[j] = this.field8073[j * Class6710.method20380(this.field8075) + i];
            }
            Class6710.method20383(this.field8075).method34185(array, this.field8074);
            for (int k = 0; k < Class6710.method20382(this.field8075); ++k) {
                this.field8073[k * Class6710.method20380(this.field8075) + i] = array[k];
            }
        }
    }
}
