// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class2741 extends Class2466
{
    private static String[] field14927;
    public final /* synthetic */ Class2846 field14928;
    
    public Class2741(final Class2846 field14928) {
        this.field14928 = field14928;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final int intValue2 = class8699.method29818(Class5260.field22312, 1);
        final Class6651 class8700 = class8699.method29841().method18207(Class6651.class);
        class8700.method20213(intValue);
        if (Class8563.method28794().method33549().method29950(Class6493.class) != null) {
            final int method19535 = Class8563.method28794().method33549().method29950(Class6493.class).method19535(class8699.method29841());
            class8700.method20214(method19535);
            List<Class7803<Integer, Class5207>> method19536 = null;
            if (class8700.method20207() >= method19535 || Class8563.method28793().method34760()) {
                method19536 = Class8626.method29280(class8700.method20207(), method19535);
            }
            final Class5221 method19537 = class8699.method29841().method18207(Class6651.class).method20211();
            if (method19536 != null) {
                final Iterator<Class7803<Integer, Class5207>> iterator = method19536.iterator();
                while (iterator.hasNext()) {
                    method19537.method16334(((Class7803<X, Class5207>)iterator.next()).method25204());
                }
                class8699.method29821(Class5260.field22312, 0, method19535);
            }
            method19537.method16334(Class8626.method29281(method19535));
            if (intValue2 == 1) {
                class8700.method20212(Class2044.field11646);
            }
            if (intValue2 == 2) {
                class8700.method20212(Class2044.field11647);
            }
            return;
        }
        class8699.method29841().method18234(false);
    }
}
