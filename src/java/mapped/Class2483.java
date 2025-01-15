// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2483 extends Class2466
{
    public final /* synthetic */ Class2810 field14455;
    
    public Class2483(final Class2810 field14455) {
        this.field14455 = field14455;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class8322 class8700 = class8699.method29822(Class5260.field22318);
        final String[] array = new String[4];
        for (int i = 0; i < 4; ++i) {
            array[i] = class8699.method29822(Class5260.field22308);
        }
        class8699.method29827();
        class8699.method29847(9);
        class8699.method29823(Class5260.field22318, class8700);
        class8699.method29823(Class5260.field22292, (Short)9);
        final Class74 class8701 = new Class74("");
        class8701.method420(new Class71("id", "Sign"));
        class8701.method420(new Class68("x", class8700.method27704().intValue()));
        class8701.method420(new Class68("y", class8700.method27705().intValue()));
        class8701.method420(new Class68("z", class8700.method27706().intValue()));
        for (int j = 0; j < array.length; ++j) {
            class8701.method420(new Class71("Text" + (j + 1), array[j]));
        }
        class8699.method29823(Class5260.field22322, class8701);
    }
}
