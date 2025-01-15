package net.minecraft.client.particle;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderTypeBuffers;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.optifine.Config;
import net.optifine.shaders.Program;
import net.optifine.shaders.Shaders;

public class ItemPickupParticle extends Particle
{
    private final RenderTypeBuffers renderTypeBuffers;
    private final Entity item;
    private final Entity target;
    private int age;
    private final EntityRendererManager renderManager;

    public ItemPickupParticle(EntityRendererManager p_i174_1_, RenderTypeBuffers p_i174_2_, World p_i174_3_, Entity p_i174_4_, Entity p_i174_5_)
    {
        this(p_i174_1_, p_i174_2_, p_i174_3_, p_i174_4_, p_i174_5_, p_i174_4_.getMotion());
    }

    private ItemPickupParticle(EntityRendererManager p_i175_1_, RenderTypeBuffers p_i175_2_, World p_i175_3_, Entity p_i175_4_, Entity p_i175_5_, Vec3d p_i175_6_)
    {
        super(p_i175_3_, p_i175_4_.getPosX(), p_i175_4_.getPosY(), p_i175_4_.getPosZ(), p_i175_6_.x, p_i175_6_.y, p_i175_6_.z);
        this.renderTypeBuffers = p_i175_2_;
        this.item = p_i175_4_;
        this.target = p_i175_5_;
        this.renderManager = p_i175_1_;
    }

    public IParticleRenderType getRenderType()
    {
        return IParticleRenderType.CUSTOM;
    }

    public void renderParticle(IVertexBuilder buffer, ActiveRenderInfo renderInfo, float partialTicks)
    {
        Program program = null;

        if (Config.isShaders())
        {
            program = Shaders.activeProgram;
            Shaders.nextEntity(this.item);
        }

        float f = ((float)this.age + partialTicks) / 3.0F;
        f = f * f;
        double d0 = MathHelper.lerp((double)partialTicks, this.target.lastTickPosX, this.target.getPosX());
        double d1 = MathHelper.lerp((double)partialTicks, this.target.lastTickPosY, this.target.getPosY()) + 0.5D;
        double d2 = MathHelper.lerp((double)partialTicks, this.target.lastTickPosZ, this.target.getPosZ());
        double d3 = MathHelper.lerp((double)f, this.item.getPosX(), d0);
        double d4 = MathHelper.lerp((double)f, this.item.getPosY(), d1);
        double d5 = MathHelper.lerp((double)f, this.item.getPosZ(), d2);
        IRenderTypeBuffer.Impl irendertypebuffer$impl = this.renderTypeBuffers.getBufferSource();
        Vec3d vec3d = renderInfo.getProjectedView();
        this.renderManager.renderEntityStatic(this.item, d3 - vec3d.getX(), d4 - vec3d.getY(), d5 - vec3d.getZ(), this.item.rotationYaw, partialTicks, new MatrixStack(), irendertypebuffer$impl, this.renderManager.getPackedLight(this.item, partialTicks));
        irendertypebuffer$impl.finish();

        if (Config.isShaders())
        {
            Shaders.setEntityId((Entity)null);
            Shaders.useProgram(program);
        }
    }

    public void tick()
    {
        ++this.age;

        if (this.age == 3)
        {
            this.setExpired();
        }
    }
}
