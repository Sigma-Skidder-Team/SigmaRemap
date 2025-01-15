// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2493 extends Class2466
{
    public final /* synthetic */ Class3035 field14472;
    
    public Class2493(final Class3035 field14472) {
        this.field14472 = field14472;
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
                        class8699.method29823(Class5260.field22338, (Class7562[])(Object)class8699.method29822((Class5260<T>)Class5260.field22337));
                        class8699.method29823(Class5260.field22334, (Class7562)class8699.method29822((Class5260<T>)Class5260.field22333));
                        class8699.method29824(Class5260.field22302);
                        class8699.method29824(Class5260.field22312);
                    }
                }
                else {
                    final int n = class8699.method29824(Class5260.field22312) * class8699.method29824(Class5260.field22312);
                    class8699.method29824(Class5260.field22308);
                    for (int j = 0; j < n; ++j) {
                        class8699.method29823(Class5260.field22338, (Class7562[])(Object)class8699.method29822((Class5260<T>)Class5260.field22337));
                    }
                    class8699.method29823(Class5260.field22334, (Class7562)class8699.method29822((Class5260<T>)Class5260.field22333));
                }
            }
            else {
                class8699.method29824(Class5260.field22308);
                for (int intValue2 = class8699.method29824(Class5260.field22312), k = 0; k < intValue2; ++k) {
                    class8699.method29823(Class5260.field22338, (Class7562[])(Object)class8699.method29822((Class5260<T>)Class5260.field22337));
                }
                class8699.method29823(Class5260.field22334, (Class7562)class8699.method29822((Class5260<T>)Class5260.field22333));
            }
        }
    }
}
