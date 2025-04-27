// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8376 implements Class8375
{
    private static String[] field34347;
    private final Class2412 field34348;
    private float field34349;
    private final Class5202 field34350;
    private Class2400 field34351;
    
    public Class8376(final Class2400 class2400, final Class7310 class2401, final Class5202 field34350) {
        this.field34350 = field34350;
        this.field34349 = field34350.method16281();
        final float method16282 = field34350.method16282();
        final float method16283 = field34350.method16284();
        final float[] array = { method16282, method16283 };
        field34350.method16271().method22419(array, 0, array, 0, 1);
        class2401.method22419(array, 0, array, 0, 1);
        final float[] array2 = { method16282, method16283 - this.field34349 };
        field34350.method16271().method22419(array2, 0, array2, 0, 1);
        class2401.method22419(array2, 0, array2, 0, 1);
        this.field34348 = new Class2412(array[0], array[1]);
        this.field34349 = new Class2412(array2[0], array2[1]).method9649(this.field34348);
    }
    
    @Override
    public Class2412 method27916(final float n, final float n2) {
        float n3 = this.field34348.method9649(new Class2412(n, n2)) / this.field34349;
        if (n3 > 0.99f) {
            n3 = 0.99f;
        }
        return new Class2412(n3, 0.0f);
    }
}
