// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public abstract class Class1799<T extends Entity, M extends Class5845<T>>
{
    private final Class4778<T, M> field9966;
    
    public Class1799(final Class4778<T, M> field9966) {
        this.field9966 = field9966;
    }
    
    public static <T extends LivingEntity> void method6557(final Class5845<T> class5845, final Class5845<T> class5846, final Class1932 class5847, final Class7351 class5848, final Class7807 class5849, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10) {
        if (!t.method1823()) {
            class5845.method17569(class5846);
            class5846.method17558(t, n2, n3, n7);
            class5846.method17557(t, n2, n3, n4, n5, n6);
            method6558(class5846, class5847, class5848, class5849, n, t, n8, n9, n10);
        }
    }
    
    public static <T extends LivingEntity> void method6558(final Class5845<T> class5845, final Class1932 class5846, final Class7351 class5847, final Class7807 class5848, final int n, final T t, final float n2, final float n3, final float n4) {
        class5845.method17564(class5847, class5848.method25214(Class6332.method18770(class5846)), n, Class4710.method13982(t, 0.0f), n2, n3, n4, 1.0f);
    }
    
    public M method6559() {
        return this.field9966.method13979();
    }
    
    public Class1932 method6560(final T t) {
        return this.field9966.method13950(t);
    }
    
    public abstract void method6554(final Class7351 p0, final Class7807 p1, final int p2, final T p3, final float p4, final float p5, final float p6, final float p7, final float p8, final float p9);
}
