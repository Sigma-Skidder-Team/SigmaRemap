// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8374 implements Class8375
{
    private static String[] field34341;
    private final Class2412 field34342;
    private final Class2412 field34343;
    private final Class5202 field34344;
    private final Class2402 field34345;
    private Class2400 field34346;
    
    public Class8374(final Class2400 class2400, final Class7310 class2401, final Class5202 field34344) {
        this.field34344 = field34344;
        final float method16282 = field34344.method16282();
        final float method16283 = field34344.method16284();
        final float method16284 = field34344.method16283();
        final float n = field34344.method16285() - method16283;
        final float n2 = method16284 - method16282;
        final float[] array = { method16282, method16283 + n / 2.0f };
        field34344.method16271().method22419(array, 0, array, 0, 1);
        class2401.method22419(array, 0, array, 0, 1);
        final float[] array2 = { method16282 + n2, method16283 + n / 2.0f };
        field34344.method16271().method22419(array2, 0, array2, 0, 1);
        class2401.method22419(array2, 0, array2, 0, 1);
        this.field34342 = new Class2412(array[0], array[1]);
        this.field34343 = new Class2412(array2[0], array2[1]);
        this.field34345 = new Class2402(this.field34342, this.field34343);
    }
    
    @Override
    public Class2412 method27916(final float n, final float n2) {
        final Class2412 class2412 = new Class2412();
        this.field34345.method9583(new Class2412(n, n2), class2412);
        return new Class2412(class2412.method9649(this.field34342) / this.field34345.method9570(), 0.0f);
    }
}
