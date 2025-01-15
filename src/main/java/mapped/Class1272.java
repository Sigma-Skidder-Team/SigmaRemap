// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1272 implements Runnable
{
    private static String[] field6943;
    public final /* synthetic */ int field6944;
    public final /* synthetic */ int field6945;
    public final /* synthetic */ int field6946;
    public final /* synthetic */ float[] field6947;
    public final /* synthetic */ float[] field6948;
    public final /* synthetic */ int field6949;
    
    public Class1272(final int field6944, final int field6945, final int field6946, final float[] field6947, final float[] field6948, final int field6949) {
        this.field6944 = field6944;
        this.field6945 = field6945;
        this.field6946 = field6946;
        this.field6947 = field6947;
        this.field6948 = field6948;
        this.field6949 = field6949;
    }
    
    @Override
    public void run() {
        final int n = this.field6944 + this.field6945;
        int i = this.field6946;
        while (i > 512) {
            i >>= 2;
            Class9133.method33273(i, this.field6947, n - i, this.field6948, this.field6949 - (i >> 1));
        }
        Class9133.method33271(i, 1, this.field6947, n - i, this.field6949, this.field6948);
        int n2 = 0;
        final int n3 = this.field6944 - i;
        for (int j = this.field6945 - i; j > 0; j -= i) {
            ++n2;
            Class9133.method33271(i, Class9133.method33269(i, j, n2, this.field6947, this.field6944, this.field6949, this.field6948), this.field6947, n3 + j, this.field6949, this.field6948);
        }
    }
}
