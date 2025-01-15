// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class2658 extends Class2466
{
    private static String[] field14776;
    public final /* synthetic */ Class2921 field14777;
    
    public Class2658(final Class2921 field14777) {
        this.field14777 = field14777;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Class2137 method33331 = Class9140.method33331(class8699.method29818(Class5260.field22312, 1), class8699.method29818(Class8794.field36974, 0));
        if (method33331 != null) {
            class8699.method29821(Class5260.field22312, 1, method33331.method8296());
        }
        class8699.method29841().method18207(Class6642.class).method20166(intValue, method33331);
        Class9140.method33332(intValue, method33331, class8699.method29818(Class8794.field36974, 0), class8699.method29841());
    }
}
