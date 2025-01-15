// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7310
{
    private float[] field28293;
    
    public Class7310() {
        this.field28293 = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f };
    }
    
    public Class7310(final Class7310 class7310) {
        this.field28293 = new float[9];
        for (int i = 0; i < 9; ++i) {
            this.field28293[i] = class7310.field28293[i];
        }
    }
    
    public Class7310(final Class7310 class7310, final Class7310 class7311) {
        this(class7310);
        this.method22420(class7311);
    }
    
    public Class7310(final float[] array) {
        if (array.length == 6) {
            this.field28293 = new float[] { array[0], array[1], array[2], array[3], array[4], array[5], 0.0f, 0.0f, 1.0f };
            return;
        }
        throw new RuntimeException("The parameter must be a float array of length 6.");
    }
    
    public Class7310(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.field28293 = new float[] { n, n2, n3, n4, n5, n6, 0.0f, 0.0f, 1.0f };
    }
    
    public void method22419(final float[] array, final int n, final float[] array2, final int n2, final int n3) {
        final float[] array3 = (array != array2) ? array2 : new float[n3 * 2];
        for (int i = 0; i < n3 * 2; i += 2) {
            for (int j = 0; j < 6; j += 3) {
                array3[i + j / 3] = array[i + n] * this.field28293[j] + array[i + n + 1] * this.field28293[j + 1] + 1.0f * this.field28293[j + 2];
            }
        }
        if (array == array2) {
            for (int k = 0; k < n3 * 2; k += 2) {
                array2[k + n2] = array3[k];
                array2[k + n2 + 1] = array3[k + 1];
            }
        }
    }
    
    public Class7310 method22420(final Class7310 class7310) {
        final float[] field28293 = new float[9];
        final float n = this.field28293[0] * class7310.field28293[0] + this.field28293[1] * class7310.field28293[3];
        final float n2 = this.field28293[0] * class7310.field28293[1] + this.field28293[1] * class7310.field28293[4];
        final float n3 = this.field28293[0] * class7310.field28293[2] + this.field28293[1] * class7310.field28293[5] + this.field28293[2];
        final float n4 = this.field28293[3] * class7310.field28293[0] + this.field28293[4] * class7310.field28293[3];
        final float n5 = this.field28293[3] * class7310.field28293[1] + this.field28293[4] * class7310.field28293[4];
        final float n6 = this.field28293[3] * class7310.field28293[2] + this.field28293[4] * class7310.field28293[5] + this.field28293[5];
        field28293[0] = n;
        field28293[1] = n2;
        field28293[2] = n3;
        field28293[3] = n4;
        field28293[4] = n5;
        field28293[5] = n6;
        this.field28293 = field28293;
        return this;
    }
    
    @Override
    public String toString() {
        return ("Transform[[" + this.field28293[0] + "," + this.field28293[1] + "," + this.field28293[2] + "][" + this.field28293[3] + "," + this.field28293[4] + "," + this.field28293[5] + "][" + this.field28293[6] + "," + this.field28293[7] + "," + this.field28293[8] + "]]").toString();
    }
    
    public float[] method22421() {
        return this.field28293;
    }
    
    public static Class7310 method22422(final float n) {
        return new Class7310((float)Class6882.method21086(n), -(float)Class6882.method21085(n), 0.0f, (float)Class6882.method21085(n), (float)Class6882.method21086(n), 0.0f);
    }
    
    public static Class7310 method22423(final float n, final float n2, final float n3) {
        final Class7310 method22422 = method22422(n);
        final float n4 = method22422.field28293[3];
        final float n5 = 1.0f - method22422.field28293[4];
        method22422.field28293[2] = n2 * n5 + n3 * n4;
        method22422.field28293[5] = n3 * n5 - n2 * n4;
        return method22422;
    }
    
    public static Class7310 method22424(final float n, final float n2) {
        return new Class7310(1.0f, 0.0f, n, 0.0f, 1.0f, n2);
    }
    
    public static Class7310 method22425(final float n, final float n2) {
        return new Class7310(n, 0.0f, 0.0f, 0.0f, n2, 0.0f);
    }
    
    public Class2412 method22426(final Class2412 class2412) {
        final float[] array = { class2412.field14278, class2412.field14279 };
        final float[] array2 = new float[2];
        this.method22419(array, 0, array2, 0, 1);
        return new Class2412(array2[0], array2[1]);
    }
}
