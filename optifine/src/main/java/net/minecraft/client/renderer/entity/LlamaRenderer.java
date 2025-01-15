package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.LlamaDecorLayer;
import net.minecraft.client.renderer.entity.model.LlamaModel;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.util.ResourceLocation;

public class LlamaRenderer extends MobRenderer<LlamaEntity, LlamaModel<LlamaEntity>>
{
    private static final ResourceLocation[] LLAMA_TEXTURES = new ResourceLocation[] {new ResourceLocation("textures/entity/llama/creamy.png"), new ResourceLocation("textures/entity/llama/white.png"), new ResourceLocation("textures/entity/llama/brown.png"), new ResourceLocation("textures/entity/llama/gray.png")};

    public LlamaRenderer(EntityRendererManager p_i303_1_)
    {
        super(p_i303_1_, new LlamaModel<>(0.0F), 0.7F);
        this.addLayer(new LlamaDecorLayer(this));
    }

    public ResourceLocation getEntityTexture(LlamaEntity entity)
    {
        return LLAMA_TEXTURES[entity.getVariant()];
    }
}
