// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2568 extends Class2466
{
    public final /* synthetic */ Class3067 field14609;
    
    public Class2568(final Class3067 field14609) {
        this.field14609 = field14609;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        for (int intValue = class8699.method29824(Class5260.field22312), i = 0; i < intValue; ++i) {
            final String replace = class8699.method29824(Class5260.field22308).replace("minecraft:", "");
            final String s = class8699.method29824(Class5260.field22308);
            final String s2 = replace;
            switch (s2) {
                case "crafting_shapeless": {
                    class8699.method29824(Class5260.field22308);
                    for (int intValue2 = class8699.method29824(Class5260.field22312), j = 0; j < intValue2; ++j) {
                        final Class7562[] array = class8699.method29824(Class5260.field22338);
                        for (int length = array.length, k = 0; k < length; ++k) {
                            Class9560.method35772(array[k]);
                        }
                    }
                    Class9560.method35772(class8699.method29824(Class5260.field22334));
                    break;
                }
                case "crafting_shaped": {
                    final int n2 = class8699.method29824(Class5260.field22312) * class8699.method29824(Class5260.field22312);
                    class8699.method29824(Class5260.field22308);
                    for (int l = 0; l < n2; ++l) {
                        final Class7562[] array2 = class8699.method29824(Class5260.field22338);
                        for (int length2 = array2.length, n3 = 0; n3 < length2; ++n3) {
                            Class9560.method35772(array2[n3]);
                        }
                    }
                    Class9560.method35772(class8699.method29824(Class5260.field22334));
                    break;
                }
                case "blasting":
                case "smoking":
                case "campfire_cooking":
                case "smelting": {
                    class8699.method29824(Class5260.field22308);
                    final Class7562[] array3 = class8699.method29824(Class5260.field22338);
                    for (int length3 = array3.length, n4 = 0; n4 < length3; ++n4) {
                        Class9560.method35772(array3[n4]);
                    }
                    Class9560.method35772(class8699.method29824(Class5260.field22334));
                    class8699.method29824(Class5260.field22302);
                    class8699.method29824(Class5260.field22312);
                    break;
                }
                case "stonecutting": {
                    class8699.method29824(Class5260.field22308);
                    final Class7562[] array4 = class8699.method29824(Class5260.field22338);
                    for (int length4 = array4.length, n5 = 0; n5 < length4; ++n5) {
                        Class9560.method35772(array4[n5]);
                    }
                    Class9560.method35772(class8699.method29824(Class5260.field22334));
                    break;
                }
            }
        }
    }
}
