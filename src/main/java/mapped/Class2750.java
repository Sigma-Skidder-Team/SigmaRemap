// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class2750 extends Class2466
{
    private static String[] field14943;
    public final /* synthetic */ Class3014 field14944;
    
    public Class2750(final Class3014 field14944) {
        this.field14944 = field14944;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22296, 0);
        int n = 0;
        Label_0058: {
            if (intValue != 37) {
                if (intValue != 38) {
                    if (intValue != 46) {
                        if (intValue != 36) {
                            break Label_0058;
                        }
                        n = 2;
                        break Label_0058;
                    }
                }
            }
            n = 1;
        }
        final Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = class8699.method29822(Class5260.field22312);
        }
        final Class8087 method21327 = Class6948.method21327(intValue, array);
        if (method21327 != null && method21327.method26549() != -1) {
            if (method21327.method26549() == 11) {
                final int intValue2 = class8699.method29818(Class5260.field22296, 1);
                final float floatValue = class8699.method29818(Class5260.field22302, 6);
                if (intValue2 == 0) {
                    class8699.method29821(Class5260.field22296, 1, 1);
                    class8699.method29821(Class5260.field22302, 6, 0.0f);
                    final List<Class9348> method21328 = method21327.method26550();
                    for (int j = 0; j < 3; ++j) {
                        float f = class8699.method29818(Class5260.field22302, j + 3) * floatValue;
                        if (f == 0.0f) {
                            if (j == 0) {
                                f = 1.0f;
                            }
                        }
                        method21328.get(j).method34658(f);
                        class8699.method29821(Class5260.field22302, j + 3, 0.0f);
                    }
                }
            }
            class8699.method29821(Class5260.field22296, 0, method21327.method26549());
            for (final Class9348 class8700 : method21327.method26550()) {
                class8699.method29823(class8700.method34655(), class8700.method34656());
            }
            return;
        }
        class8699.method29839();
    }
}
