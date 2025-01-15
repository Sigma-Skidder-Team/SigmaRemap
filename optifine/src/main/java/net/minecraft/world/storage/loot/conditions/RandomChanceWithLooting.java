package net.minecraft.world.storage.loot.conditions;

import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameter;
import net.minecraft.world.storage.loot.LootParameters;

public class RandomChanceWithLooting implements ILootCondition
{
    private final float chance;
    private final float lootingMultiplier;

    private RandomChanceWithLooting(float p_i2301_1_, float p_i2301_2_)
    {
        this.chance = p_i2301_1_;
        this.lootingMultiplier = p_i2301_2_;
    }

    public Set < LootParameter<? >> getRequiredParameters()
    {
        return ImmutableSet.of(LootParameters.KILLER_ENTITY);
    }

    public boolean test(LootContext p_test_1_)
    {
        Entity entity = p_test_1_.get(LootParameters.KILLER_ENTITY);
        int i = 0;

        if (entity instanceof LivingEntity)
        {
            i = EnchantmentHelper.getLootingModifier((LivingEntity)entity);
        }

        return p_test_1_.getRandom().nextFloat() < this.chance + (float)i * this.lootingMultiplier;
    }

    public static ILootCondition.IBuilder builder(float chanceIn, float lootingMultiplierIn)
    {
        return () ->
        {
            return new RandomChanceWithLooting(chanceIn, lootingMultiplierIn);
        };
    }

    public static class Serializer extends ILootCondition.AbstractSerializer<RandomChanceWithLooting>
    {
        protected Serializer()
        {
            super(new ResourceLocation("random_chance_with_looting"), RandomChanceWithLooting.class);
        }

        public void serialize(JsonObject json, RandomChanceWithLooting value, JsonSerializationContext context)
        {
            json.addProperty("chance", value.chance);
            json.addProperty("looting_multiplier", value.lootingMultiplier);
        }

        public RandomChanceWithLooting deserialize(JsonObject json, JsonDeserializationContext context)
        {
            return new RandomChanceWithLooting(JSONUtils.getFloat(json, "chance"), JSONUtils.getFloat(json, "looting_multiplier"));
        }
    }
}
