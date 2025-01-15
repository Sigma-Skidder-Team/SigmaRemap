// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class1843<T extends LivingEntity> extends Class1799<T, Class5871<T>>
{
    private static String[] field10026;
    private final Class5845<T> field10027;
    
    public Class1843(final Class4778<T, Class5871<T>> class4778) {
        super(class4778);
        this.field10027 = new Class5871<T>(0);
    }
    
    public void method6551(final Class7351 class7351, final Class7807 class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!t.method1823()) {
            this.method6559().method17569(this.field10027);
            this.field10027.method17558(t, n2, n3, n4);
            this.field10027.method17557(t, n2, n3, n5, n6, n7);
            this.field10027.method17564(class7351, class7352.method25214(Class6332.method18773(this.method6560(t))), n, Class4710.method13982(t, 0.0f), 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}
