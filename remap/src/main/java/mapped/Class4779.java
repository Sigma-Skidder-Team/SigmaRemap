// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public class Class4779 extends Class4710<Class857, Class5866>
{
    public static final ResourceLocation field20408;
    
    public Class4779(final Class8551 class8551) {
        super(class8551, new Class5867(), 0.0f);
        this.method13978((Class1799<Class857, Class5866>)new Class1835((Class4778<LivingEntity, Class5853>)this, new Class5866(0.5f), new Class5866(1.0f)));
        this.method13978(new Class1823<Class857, Class5866>(this));
        this.method13978(new Class1801<Class857, Class5866>(this));
        this.method13978(new Class1831<Class857, Class5866>(this));
    }
    
    public ResourceLocation method14136(final Class857 class857) {
        return Class4779.field20408;
    }
    
    public void method14137(final Class857 class857, final MatrixStack class858, final float n, final float n2, final float n3) {
        class858.method22566(Vector3f.YP.rotationDegrees(180.0f - n2));
        final float n4 = class857.world.method6754() - class857.field4582 + n3;
        if (n4 < 5.0f) {
            class858.method22566(Vector3f.YP.rotationDegrees(MathHelper.sin(n4 / 1.5f * 3.1415927f) * 3.0f));
        }
    }
    
    public boolean method14138(final Class857 class857) {
        final double method28715 = this.field20283.method28715(class857);
        final float n = class857.method1814() ? 32.0f : 64.0f;
        return method28715 < n * n && class857.method1876();
    }
    
    @Nullable
    public Class6332 method14139(final Class857 class857, final boolean b, final boolean b2) {
        if (!class857.method5166()) {
            return super.method13981(class857, b, b2);
        }
        final ResourceLocation method14136 = this.method14136(class857);
        if (!b2) {
            return b ? Class6332.method18769(method14136, false) : null;
        }
        return Class6332.method18772(method14136, false);
    }
    
    static {
        field20408 = new ResourceLocation("textures/entity/armorstand/wood.png");
    }
}
