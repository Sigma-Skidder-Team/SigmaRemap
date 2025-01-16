// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;

import java.util.Iterator;

public class Class4732 extends Class4712<Class800, Class5926<Class800>>
{
    private static String[] field20338;
    
    public Class4732(final Class8551 class8551) {
        super(class8551, new Class5926(0.0f), 0.4f);
        this.method13978(new Class1803(this));
    }
    
    public ResourceLocation method14048(final Class800 class800) {
        return class800.method4606();
    }
    
    public void method14049(final Class800 class800, final Class7351 class801, final float n) {
        super.method13990(class800, class801, n);
        class801.method22565(0.8f, 0.8f, 0.8f);
    }
    
    public void method14050(final Class800 class800, final Class7351 class801, final float n, final float n2, final float n3) {
        super.method13985(class800, class801, n, n2, n3);
        final float method4620 = class800.method4620(n3);
        if (method4620 > 0.0f) {
            class801.method22564(0.4f * method4620, 0.15f * method4620, 0.1f * method4620);
            class801.method22566(Vector3f.ZP.rotationDegrees(MathHelper.method35706(method4620, 0.0f, 90.0f)));
            final Iterator<Entity> iterator = (Iterator<Entity>)class800.world.method7128((Class<? extends Class512>)Class512.class, new AxisAlignedBB(new BlockPos(class800)).method18495(2.0, 2.0, 2.0)).iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().method2783()) {
                    continue;
                }
                class801.method22564(0.15f * method4620, 0.0, 0.0);
                break;
            }
        }
    }
}
