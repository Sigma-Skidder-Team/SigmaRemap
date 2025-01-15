// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2561 extends Class2466
{
    public final /* synthetic */ Class3039 field14597;
    
    public Class2561(final Class3039 field14597) {
        this.field14597 = field14597;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final short shortValue = class8699.method29818(Class5260.field22292, 0);
        final short shortValue2 = class8699.method29818(Class5260.field22304, 0);
        int n = (shortValue2 == 45 && shortValue == 0) ? 1 : 0;
        final Class6636 class8700 = class8699.method29841().method18207(Class6636.class);
        if (class8700.method20122() != null) {
            if (class8700.method20122().equals("minecraft:brewing_stand")) {
                if (shortValue2 == 4) {
                    n = 1;
                }
                if (shortValue2 > 4) {
                    class8699.method29821(Class5260.field22304, 0, (short)(shortValue2 - 1));
                }
            }
        }
        if (n != 0) {
            class8699.method29837(22, new Class2445(this, shortValue, shortValue2)).method29833(Class5224.class);
            class8699.method29821(Class5260.field22289, 0, (Byte)0);
            class8699.method29821(Class5260.field22289, 1, (Byte)0);
            class8699.method29821(Class5260.field22304, 0, (Short)(-999));
        }
    }
}
