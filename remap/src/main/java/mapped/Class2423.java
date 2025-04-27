// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2423 implements Class2422
{
    private static String[] field14329;
    private final float[][] field14330;
    
    public Class2423(final Class2422 class2422) {
        this.field14330 = new float[class2422.method9733() * 6 * 3][2];
        int n = 0;
        for (int i = 0; i < class2422.method9733(); ++i) {
            float n2 = 0.0f;
            float n3 = 0.0f;
            for (int j = 0; j < 3; ++j) {
                final float[] method9734 = class2422.method9734(i, j);
                n2 += method9734[0];
                n3 += method9734[1];
            }
            final float n4 = n2 / 3.0f;
            final float n5 = n3 / 3.0f;
            for (int k = 0; k < 3; ++k) {
                int n6 = k + 1;
                if (n6 > 2) {
                    n6 = 0;
                }
                final float[] method9735 = class2422.method9734(i, k);
                final float[] method9736 = class2422.method9734(i, n6);
                method9735[0] = (method9735[0] + method9736[0]) / 2.0f;
                method9735[1] = (method9735[1] + method9736[1]) / 2.0f;
                this.field14330[n * 3][0] = n4;
                this.field14330[n * 3][1] = n5;
                this.field14330[n * 3 + 1][0] = method9735[0];
                this.field14330[n * 3 + 1][1] = method9735[1];
                this.field14330[n * 3 + 2][0] = method9736[0];
                this.field14330[n * 3 + 2][1] = method9736[1];
                ++n;
            }
            for (int l = 0; l < 3; ++l) {
                int n7 = l + 1;
                if (n7 > 2) {
                    n7 = 0;
                }
                final float[] method9737 = class2422.method9734(i, l);
                final float[] method9738 = class2422.method9734(i, n7);
                method9738[0] = (method9737[0] + method9738[0]) / 2.0f;
                method9738[1] = (method9737[1] + method9738[1]) / 2.0f;
                this.field14330[n * 3][0] = n4;
                this.field14330[n * 3][1] = n5;
                this.field14330[n * 3 + 1][0] = method9737[0];
                this.field14330[n * 3 + 1][1] = method9737[1];
                this.field14330[n * 3 + 2][0] = method9738[0];
                this.field14330[n * 3 + 2][1] = method9738[1];
                ++n;
            }
        }
    }
    
    @Override
    public void method9735(final float n, final float n2) {
    }
    
    @Override
    public int method9733() {
        return this.field14330.length / 3;
    }
    
    @Override
    public float[] method9734(final int n, final int n2) {
        final float[] array = this.field14330[n * 3 + n2];
        return new float[] { array[0], array[1] };
    }
    
    @Override
    public void method9736() {
    }
    
    @Override
    public boolean method9737() {
        return true;
    }
}
