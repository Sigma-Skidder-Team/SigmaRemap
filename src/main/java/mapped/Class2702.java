// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2702 extends Class2466
{
    public final /* synthetic */ Class3084 field14861;
    
    public Class2702(final Class3084 field14861) {
        this.field14861 = field14861;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final short shortValue = class8699.method29818(Class5260.field22292, 0);
        final short shortValue2 = class8699.method29818(Class5260.field22304, 0);
        final short shortValue3 = class8699.method29818(Class5260.field22304, 1);
        final Class6636 class8700 = class8699.method29841().method18207(Class6636.class);
        if (class8700.method20122() != null) {
            if (class8700.method20122().equalsIgnoreCase("minecraft:enchanting_table")) {
                if (shortValue2 > 3) {
                    if (shortValue2 < 7) {
                        final short s = (short)(shortValue3 >> 8);
                        class8699.method29837(class8699.method29848(), new Class2440(this, shortValue, shortValue2, (short)(shortValue3 & 0xFF))).method29833(Class5224.class);
                        class8699.method29821(Class5260.field22304, 0, (short)(shortValue2 + 3));
                        class8699.method29821(Class5260.field22304, 1, s);
                    }
                }
            }
        }
    }
}
