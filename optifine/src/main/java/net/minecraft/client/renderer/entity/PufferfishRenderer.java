package net.minecraft.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.PufferFishBigModel;
import net.minecraft.client.renderer.entity.model.PufferFishMediumModel;
import net.minecraft.client.renderer.entity.model.PufferFishSmallModel;
import net.minecraft.entity.passive.fish.PufferfishEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class PufferfishRenderer extends MobRenderer<PufferfishEntity, EntityModel<PufferfishEntity>>
{
    private static final ResourceLocation field_203771_a = new ResourceLocation("textures/entity/fish/pufferfish.png");
    private int field_203772_j;
    private final PufferFishSmallModel<PufferfishEntity> field_203773_k = new PufferFishSmallModel<>();
    private final PufferFishMediumModel<PufferfishEntity> field_203774_l = new PufferFishMediumModel<>();
    private final PufferFishBigModel<PufferfishEntity> field_203775_m = new PufferFishBigModel<>();

    public PufferfishRenderer(EntityRendererManager p_i2003_1_)
    {
        super(p_i2003_1_, new PufferFishBigModel<>(), 0.2F);
        this.field_203772_j = 3;
    }

    public ResourceLocation getEntityTexture(PufferfishEntity entity)
    {
        return field_203771_a;
    }

    public void render(PufferfishEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn)
    {
        int i = entityIn.getPuffState();

        if (i != this.field_203772_j)
        {
            if (i == 0)
            {
                this.entityModel = this.field_203773_k;
            }
            else if (i == 1)
            {
                this.entityModel = this.field_203774_l;
            }
            else
            {
                this.entityModel = this.field_203775_m;
            }
        }

        this.field_203772_j = i;
        this.shadowSize = 0.1F + 0.1F * (float)i;
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    protected void applyRotations(PufferfishEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks)
    {
        matrixStackIn.translate(0.0D, (double)(MathHelper.cos(ageInTicks * 0.05F) * 0.08F), 0.0D);
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
    }
}
