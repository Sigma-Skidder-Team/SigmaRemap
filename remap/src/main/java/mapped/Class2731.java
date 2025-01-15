// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2731 extends Class2466
{
    private static String[] field14909;
    public final /* synthetic */ Class2836 field14910;
    
    public Class2731(final Class2836 field14910) {
        this.field14910 = field14910;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        for (int intValue = class8699.method29824(Class5260.field22312), i = 0; i < intValue; ++i) {
            class8699.method29824(Class5260.field22308);
            final Integer[] array = class8699.method29824(Class5260.field22313);
            for (int j = 0; j < array.length; ++j) {
                array[j] = Class5220.method16333(array[j]);
            }
        }
        for (int intValue2 = class8699.method29824(Class5260.field22312), k = 0; k < intValue2; ++k) {
            class8699.method29824(Class5260.field22308);
            final Integer[] array2 = class8699.method29824(Class5260.field22313);
            for (int l = 0; l < array2.length; ++l) {
                array2[l] = Class9553.method35740(array2[l]);
            }
        }
    }
}
