// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2405 extends Class2400
{
    private static String[] field14251;
    private final Class2412 field14252;
    private final Class2412 field14253;
    private final Class2412 field14254;
    private final Class2412 field14255;
    private final int field14256;
    
    public Class2405(final Class2412 class2412, final Class2412 class2413, final Class2412 class2414, final Class2412 class2415) {
        this(class2412, class2413, class2414, class2415, 20);
    }
    
    public Class2405(final Class2412 class2412, final Class2412 class2413, final Class2412 class2414, final Class2412 class2415, final int field14256) {
        this.field14252 = new Class2412(class2412);
        this.field14253 = new Class2412(class2413);
        this.field14254 = new Class2412(class2414);
        this.field14255 = new Class2412(class2415);
        this.field14256 = field14256;
        this.field14221 = true;
    }
    
    public Class2412 method9599(final float n) {
        final float n2 = 1.0f - n;
        final float n3 = n2 * n2 * n2;
        final float n4 = 3.0f * n2 * n2 * n;
        final float n5 = 3.0f * n2 * n * n;
        final float n6 = n * n * n;
        return new Class2412(this.field14252.field14278 * n3 + this.field14253.field14278 * n4 + this.field14254.field14278 * n5 + this.field14255.field14278 * n6, this.field14252.field14279 * n3 + this.field14253.field14279 * n4 + this.field14254.field14279 * n5 + this.field14255.field14279 * n6);
    }
    
    @Override
    public void method9520() {
        final float n = 1.0f / this.field14256;
        this.field14212 = new float[(this.field14256 + 1) * 2];
        for (int i = 0; i < this.field14256 + 1; ++i) {
            final Class2412 method9599 = this.method9599(i * n);
            this.field14212[i * 2] = method9599.field14278;
            this.field14212[i * 2 + 1] = method9599.field14279;
        }
    }
    
    @Override
    public Class2400 method9519(final Class7310 class7310) {
        final float[] array = new float[8];
        final float[] array2 = new float[8];
        array[0] = this.field14252.field14278;
        array[1] = this.field14252.field14279;
        array[2] = this.field14253.field14278;
        array[3] = this.field14253.field14279;
        array[4] = this.field14254.field14278;
        array[5] = this.field14254.field14279;
        array[6] = this.field14255.field14278;
        array[7] = this.field14255.field14279;
        class7310.method22419(array, 0, array2, 0, 4);
        return new Class2405(new Class2412(array2[0], array2[1]), new Class2412(array2[2], array2[3]), new Class2412(array2[4], array2[5]), new Class2412(array2[6], array2[7]));
    }
    
    @Override
    public boolean method9554() {
        return false;
    }
}
