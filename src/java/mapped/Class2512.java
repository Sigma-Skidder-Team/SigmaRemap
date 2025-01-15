// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class2512 extends Class2466
{
    private static String[] field14508;
    public final /* synthetic */ Class2847 field14509;
    
    public Class2512(final Class2847 field14509) {
        this.field14509 = field14509;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final List<Class7276> list = class8699.method29818(Class8794.field36974, 0);
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Class6634 class8700 = class8699.method29841().method18207(Class6634.class);
        final Class1974 class8701 = class8700.method20101().get(intValue);
        if (class8701 == null) {
            class8700.method20096(intValue, list);
            class8699.method29839();
        }
        else {
            Class9392.method34924(class8701, list);
        }
    }
}
