// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2729 extends Class2466
{
    public final /* synthetic */ Class2831 field14906;
    
    public Class2729(final Class2831 field14906) {
        this.field14906 = field14906;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6636 class8700 = class8699.method29841().method18207(Class6636.class);
        if (class8700.method20122() != null) {
            if (class8700.method20122().equals("minecraft:brewing_stand")) {
                final Class7562[] array = class8699.method29818(Class5260.field22329, 0);
                final Class7562[] array2 = new Class7562[array.length + 1];
                for (int i = 0; i < array2.length; ++i) {
                    if (i <= 4) {
                        if (i != 4) {
                            array2[i] = array[i];
                        }
                    }
                    else {
                        array2[i] = array[i - 1];
                    }
                }
                class8699.method29821(Class5260.field22329, 0, array2);
            }
        }
    }
}
