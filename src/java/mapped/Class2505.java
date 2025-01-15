// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2505 extends Class2466
{
    public final /* synthetic */ Class2994 field14495;
    
    public Class2505(final Class2994 field14495) {
        this.field14495 = field14495;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29822(Class5260.field22312);
        class8699.method29823(Class5260.field22312, intValue + 5);
        for (int i = 0; i < intValue; ++i) {
            class8699.method29824(Class5260.field22308);
            final Integer[] array = class8699.method29824(Class5260.field22313);
            for (int j = 0; j < array.length; ++j) {
                array[j] = Class5213.method16326(array[j]);
            }
        }
        class8699.method29823(Class5260.field22308, "minecraft:signs");
        class8699.method29823(Class5260.field22313, new Integer[] { Class5213.method16326(150), Class5213.method16326(155) });
        class8699.method29823(Class5260.field22308, "minecraft:wall_signs");
        class8699.method29823(Class5260.field22313, new Integer[] { Class5213.method16326(155) });
        class8699.method29823(Class5260.field22308, "minecraft:standing_signs");
        class8699.method29823(Class5260.field22313, new Integer[] { Class5213.method16326(150) });
        class8699.method29823(Class5260.field22308, "minecraft:fences");
        class8699.method29823(Class5260.field22313, new Integer[] { 189, 248, 472, 473, 474, 475 });
        class8699.method29823(Class5260.field22308, "minecraft:walls");
        class8699.method29823(Class5260.field22313, new Integer[] { 271, 272 });
        final int intValue2 = class8699.method29822(Class5260.field22312);
        class8699.method29823(Class5260.field22312, intValue2 + 2);
        for (int k = 0; k < intValue2; ++k) {
            class8699.method29824(Class5260.field22308);
            final Integer[] array2 = class8699.method29824(Class5260.field22313);
            for (int l = 0; l < array2.length; ++l) {
                array2[l] = Class8378.method27919(array2[l]);
            }
        }
        class8699.method29823(Class5260.field22308, "minecraft:signs");
        class8699.method29823(Class5260.field22313, new Integer[] { Class8378.method27919(541) });
        class8699.method29823(Class5260.field22308, "minecraft:arrows");
        class8699.method29823(Class5260.field22313, new Integer[] { 526, 825, 826 });
        for (int intValue3 = class8699.method29824(Class5260.field22312), n = 0; n < intValue3; ++n) {
            class8699.method29824(Class5260.field22308);
            class8699.method29824(Class5260.field22313);
        }
        class8699.method29823(Class5260.field22312, 0);
    }
}
