// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2556 extends Class2466
{
    public final /* synthetic */ Class2783 field14590;
    
    public Class2556(final Class2783 field14590) {
        this.field14590 = field14590;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        for (int intValue = class8699.method29824(Class5260.field22312), i = 0; i < intValue; ++i) {
            class8699.method29824(Class5260.field22308);
            final String s = class8699.method29824(Class5260.field22308);
            if (!s.equals("crafting_shapeless")) {
                if (!s.equals("crafting_shaped")) {
                    if (s.equals("smelting")) {
                        class8699.method29824(Class5260.field22308);
                        final Class7562[] array = class8699.method29824(Class5260.field22337);
                        for (int j = 0; j < array.length; ++j) {
                            Class9553.method35739(array[j]);
                        }
                        Class9553.method35739(class8699.method29824(Class5260.field22333));
                        class8699.method29824(Class5260.field22302);
                        class8699.method29824(Class5260.field22312);
                    }
                }
                else {
                    final int n = class8699.method29824(Class5260.field22312) * class8699.method29824(Class5260.field22312);
                    class8699.method29824(Class5260.field22308);
                    for (int k = 0; k < n; ++k) {
                        final Class7562[] array2 = class8699.method29824(Class5260.field22337);
                        for (int l = 0; l < array2.length; ++l) {
                            Class9553.method35739(array2[l]);
                        }
                    }
                    Class9553.method35739(class8699.method29824(Class5260.field22333));
                }
            }
            else {
                class8699.method29824(Class5260.field22308);
                for (int intValue2 = class8699.method29824(Class5260.field22312), n2 = 0; n2 < intValue2; ++n2) {
                    final Class7562[] array3 = class8699.method29824(Class5260.field22337);
                    for (int n3 = 0; n3 < array3.length; ++n3) {
                        Class9553.method35739(array3[n3]);
                    }
                }
                Class9553.method35739(class8699.method29824(Class5260.field22333));
            }
        }
    }
}
