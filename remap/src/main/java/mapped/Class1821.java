// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public class Class1821<T extends LivingEntity, M extends Class5860<T>> extends Class1820<T, M>
{
    private static String[] field10000;
    private final Class8551 field10001;
    private Class405 field10002;
    
    public Class1821(final Class4710<T, M> class4710) {
        super(class4710);
        this.field10001 = class4710.method13959();
    }
    
    @Override
    public int method6585(final T t) {
        return t.method2702();
    }
    
    @Override
    public void method6586(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final Entity class7353, final float n2, final float n3, final float n4, final float n5) {
        final float method35640 = MathHelper.method35640(n2 * n2 + n4 * n4);
        this.field10002 = new Class405(class7353.world, class7353.getPosX(), class7353.getPosY(), class7353.getPosZ());
        this.field10002.rotationYaw = (float)(Math.atan2(n2, n4) * 57.2957763671875);
        this.field10002.rotationPitch = (float)(Math.atan2(n3, method35640) * 57.2957763671875);
        this.field10002.prevRotationYaw = this.field10002.rotationYaw;
        this.field10002.prevRotationPitch = this.field10002.rotationPitch;
        this.field10001.method28706(this.field10002, 0.0, 0.0, 0.0, 0.0f, n5, class7351, class7352, n);
    }
}
