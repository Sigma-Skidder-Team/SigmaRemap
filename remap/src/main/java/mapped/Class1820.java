// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public abstract class Class1820<T extends LivingEntity, M extends Class5860<T>> extends Class1799<T, M>
{
    public Class1820(final Class4710<T, M> class4710) {
        super(class4710);
    }
    
    public abstract int method6585(final T p0);
    
    public abstract void method6586(final Class7351 p0, final Class7807 p1, final int p2, final Entity p3, final float p4, final float p5, final float p6, final float p7);
    
    public void method6551(final Class7351 class7351, final Class7807 class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final int method6585 = this.method6585(t);
        final Random random = new Random(t.getEntityId());
        if (method6585 > 0) {
            for (int i = 0; i < method6585; ++i) {
                class7351.method22567();
                final Class6300 method6586 = this.method6559().method17595(random);
                final Class9536 method6587 = method6586.method18648(random);
                method6586.method18645(class7351);
                final float nextFloat = random.nextFloat();
                final float nextFloat2 = random.nextFloat();
                final float nextFloat3 = random.nextFloat();
                class7351.method22564(MathHelper.method35700(nextFloat, method6587.field41046, method6587.field41049) / 16.0f, MathHelper.method35700(nextFloat2, method6587.field41047, method6587.field41050) / 16.0f, MathHelper.method35700(nextFloat3, method6587.field41048, method6587.field41051) / 16.0f);
                this.method6586(class7351, class7352, n, t, -1.0f * (nextFloat * 2.0f - 1.0f), -1.0f * (nextFloat2 * 2.0f - 1.0f), -1.0f * (nextFloat3 * 2.0f - 1.0f), n4);
                class7351.method22568();
            }
        }
    }
}
