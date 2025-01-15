// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public abstract class Class1805<T extends Entity & Class766, M extends Class5845<T>> extends Class1799<T, M>
{
    public Class1805(final Class4778<T, M> class4778) {
        super(class4778);
    }
    
    @Override
    public void method6554(final Class7351 class7351, final Class7807 class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (t.method4233()) {
            final float n8 = t.ticksExisted + n4;
            final Class5845<T> method6567 = this.method6567();
            method6567.method17558(t, n2, n3, n4);
            this.method6559().method17569(method6567);
            final Class4150 method6568 = class7352.method25214(Class6332.method18780(this.method6566(), this.method6565(n8), n8 * 0.01f));
            method6567.method17557(t, n2, n3, n5, n6, n7);
            method6567.method17564(class7351, method6568, n, Class1904.field10335, 0.5f, 0.5f, 0.5f, 1.0f);
        }
    }
    
    public abstract float method6565(final float p0);
    
    public abstract Class1932 method6566();
    
    public abstract Class5845<T> method6567();
}
