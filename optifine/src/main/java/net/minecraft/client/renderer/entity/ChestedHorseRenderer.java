package net.minecraft.client.renderer.entity;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.renderer.entity.model.HorseArmorChestsModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.horse.AbstractChestedHorseEntity;
import net.minecraft.util.ResourceLocation;

public class ChestedHorseRenderer<T extends AbstractChestedHorseEntity> extends AbstractHorseRenderer<T, HorseArmorChestsModel<T>>
{
    private static final Map < EntityType<?>, ResourceLocation > field_195635_a = Maps.newHashMap(ImmutableMap.of(EntityType.DONKEY, new ResourceLocation("textures/entity/horse/donkey.png"), EntityType.MULE, new ResourceLocation("textures/entity/horse/mule.png")));

    public ChestedHorseRenderer(EntityRendererManager p_i3445_1_, float p_i3445_2_)
    {
        super(p_i3445_1_, new HorseArmorChestsModel<>(0.0F), p_i3445_2_);
    }

    public ResourceLocation getEntityTexture(T entity)
    {
        return field_195635_a.get(entity.getType());
    }
}
