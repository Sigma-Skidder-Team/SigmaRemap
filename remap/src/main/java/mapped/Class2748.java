// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2748 extends Class2466
{
    public final /* synthetic */ Class2952 field14940;
    
    public Class2748(final Class2952 field14940) {
        this.field14940 = field14940;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29824(Class5260.field22312);
        int n = 0;
        for (int i = 0; i < intValue; ++i) {
            final String s = class8699.method29822(Class5260.field22308);
            final String s2 = class8699.method29822(Class5260.field22308);
            if (!Class8378.method27922().contains(s2)) {
                class8699.method29823(Class5260.field22308, s2);
                class8699.method29823(Class5260.field22308, s);
                if (!s2.equals("crafting_shapeless")) {
                    if (!s2.equals("crafting_shaped")) {
                        if (s2.equals("smelting")) {
                            class8699.method29824(Class5260.field22308);
                            final Class7562[] array = class8699.method29824(Class5260.field22338);
                            for (int length = array.length, j = 0; j < length; ++j) {
                                Class8378.method27918(array[j]);
                            }
                            Class8378.method27918(class8699.method29824(Class5260.field22334));
                            class8699.method29824(Class5260.field22302);
                            class8699.method29824(Class5260.field22312);
                        }
                    }
                    else {
                        final int n2 = class8699.method29824(Class5260.field22312) * class8699.method29824(Class5260.field22312);
                        class8699.method29824(Class5260.field22308);
                        for (int k = 0; k < n2; ++k) {
                            final Class7562[] array2 = class8699.method29824(Class5260.field22338);
                            for (int length2 = array2.length, l = 0; l < length2; ++l) {
                                Class8378.method27918(array2[l]);
                            }
                        }
                        Class8378.method27918(class8699.method29824(Class5260.field22334));
                    }
                }
                else {
                    class8699.method29824(Class5260.field22308);
                    for (int intValue2 = class8699.method29824(Class5260.field22312), n3 = 0; n3 < intValue2; ++n3) {
                        final Class7562[] array3 = class8699.method29824(Class5260.field22338);
                        for (int length3 = array3.length, n4 = 0; n4 < length3; ++n4) {
                            Class8378.method27918(array3[n4]);
                        }
                    }
                    Class8378.method27918(class8699.method29824(Class5260.field22334));
                }
            }
            else {
                ++n;
            }
        }
        class8699.method29821(Class5260.field22312, 0, intValue - n);
    }
}
