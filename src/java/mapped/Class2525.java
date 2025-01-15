// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2525 extends Class2466
{
    public final /* synthetic */ Class2995 field14533;
    
    public Class2525(final Class2995 field14533) {
        this.field14533 = field14533;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        for (int intValue = class8699.method29818(Class5260.field22312, 0), i = 0; i < ((intValue != 0) ? 1 : 2); ++i) {
            final Integer[] array = class8699.method29822(Class5260.field22313);
            final String[] array2 = new String[array.length];
            for (int j = 0; j < array.length; ++j) {
                array2[j] = "viaversion:legacy/" + array[j];
            }
            class8699.method29823(Class5260.field22309, array2);
        }
    }
}
