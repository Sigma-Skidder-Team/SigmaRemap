// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2451 extends Class2449<Boolean, Void>
{
    private static String[] field14408;
    public final /* synthetic */ Class3048 field14409;
    
    public Class2451(final Class3048 field14409, final Class5260 class5260) {
        this.field14409 = field14409;
        super(class5260);
    }
    
    public Void method9792(final Class8699 class8699, final Boolean b) throws Exception {
        final Class6634 class8700 = class8699.method29841().method18207(Class6634.class);
        if (!b) {
            final int intValue = class8699.method29818(Class5260.field22296, 0);
            final int intValue2 = class8699.method29818(Class5260.field22296, 1);
            class8699.method29839();
            final Class8699 method29836 = class8699.method29836(64);
            if (intValue2 != -1) {
                method29836.method29823(Class5260.field22312, intValue2);
                method29836.method29823(Class5260.field22313, new Integer[] { intValue });
                class8700.method20103().put(intValue, intValue2);
            }
            else {
                if (!class8700.method20103().containsKey(intValue)) {
                    return null;
                }
                method29836.method29823(Class5260.field22312, class8700.method20103().remove(intValue));
                method29836.method29823(Class5260.field22313, new Integer[0]);
            }
            method29836.method29833(Class5224.class);
        }
        return null;
    }
}
