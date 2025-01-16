package net.minecraft.client.renderer.entity;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.renderer.entity.layers.MooshroomMushroomLayer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;

public class MooshroomRenderer extends MobRenderer<MooshroomEntity, CowModel<MooshroomEntity>>
{
    private static final Map<MooshroomEntity.Type, ResourceLocation> field_217774_a = Util.make(Maps.newHashMap(), (p_217773_0_) ->
    {
        p_217773_0_.put(MooshroomEntity.Type.BROWN, new ResourceLocation("textures/entity/cow/brown_mooshroom.png"));
        p_217773_0_.put(MooshroomEntity.Type.RED, new ResourceLocation("textures/entity/cow/red_mooshroom.png"));
    });

    public MooshroomRenderer(EntityRendererManager p_i2729_1_)
    {
        super(p_i2729_1_, new CowModel<>(), 0.7F);
        this.addLayer(new MooshroomMushroomLayer<>(this));
    }

    public ResourceLocation getEntityTexture(MooshroomEntity entity)
    {
        return field_217774_a.get(entity.getMooshroomType());
    }
}