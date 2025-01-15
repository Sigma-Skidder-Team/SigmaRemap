// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2570 extends Class2466
{
    private static String[] field14612;
    public final /* synthetic */ Class2802 field14613;
    
    public Class2570(final Class2802 field14613) {
        this.field14613 = field14613;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final byte byteValue = class8699.method29818(Class5260.field22289, 0);
        if (byteValue == 0 || byteValue == 2) {
            class8699.method29823(Class5260.field22308, Class8672.method29685(class8699.method29822(Class5260.field22308)));
            final String s = class8699.method29822(Class5260.field22308);
            String string = class8699.method29822(Class5260.field22308);
            class8699.method29824(Class5260.field22289);
            class8699.method29824(Class5260.field22308);
            class8699.method29824(Class5260.field22308);
            int i = class8699.method29822(Class5260.field22289);
            if (i == -1) {
                i = 21;
            }
            if (Class8563.method28792().method23291()) {
                i = this.field14613.field15040.method16328(s).ordinal();
                string = this.field14613.field15040.method16328(s).toString() + string;
            }
            class8699.method29823(Class5260.field22312, i);
            class8699.method29823(Class5260.field22308, Class8672.method29685(s));
            class8699.method29823(Class5260.field22308, Class8672.method29685(string));
        }
        if (byteValue != 0) {
            if (byteValue != 3) {
                if (byteValue != 4) {
                    return;
                }
            }
        }
        final String[] array = class8699.method29822(Class5260.field22309);
        for (int j = 0; j < array.length; ++j) {
            array[j] = this.field14613.field15040.method16329(array[j]);
        }
        class8699.method29823(Class5260.field22309, array);
    }
}
