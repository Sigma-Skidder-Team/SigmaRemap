// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2644 extends Class2466
{
    public final /* synthetic */ Class2785 field14749;
    
    public Class2644(final Class2785 field14749) {
        this.field14749 = field14749;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final String s = class8699.method29818(Class5260.field22308, 0);
        if (!s.equals("minecraft:trader_list") && !s.equals("trader_list")) {
            if (s.equals("minecraft:book_open") || s.equals("book_open")) {
                final int intValue = class8699.method29822(Class5260.field22312);
                class8699.method29828();
                class8699.method29847(45);
                class8699.method29823(Class5260.field22312, intValue);
            }
        }
        else {
            class8699.method29847(39);
            class8699.method29842();
            class8699.method29822(Class5260.field22308);
            final int intValue2 = class8699.method29822(Class5260.field22296);
            class8699.method29841().method18207(Class6639.class).method20152(intValue2);
            class8699.method29823(Class5260.field22312, intValue2);
            for (short shortValue = class8699.method29824(Class5260.field22292), n = 0; n < shortValue; ++n) {
                Class8378.method27918(class8699.method29824(Class5260.field22334));
                Class8378.method27918(class8699.method29824(Class5260.field22334));
                if (class8699.method29824(Class5260.field22294)) {
                    Class8378.method27918(class8699.method29824(Class5260.field22334));
                }
                class8699.method29824(Class5260.field22294);
                class8699.method29824(Class5260.field22296);
                class8699.method29824(Class5260.field22296);
                class8699.method29823(Class5260.field22296, 0);
                class8699.method29823(Class5260.field22296, 0);
                class8699.method29823(Class5260.field22302, 0.0f);
            }
            class8699.method29823(Class5260.field22312, 0);
            class8699.method29823(Class5260.field22312, 0);
            class8699.method29823(Class5260.field22294, false);
        }
    }
}
