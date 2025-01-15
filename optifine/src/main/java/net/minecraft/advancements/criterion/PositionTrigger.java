package net.minecraft.advancements.criterion;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;

public class PositionTrigger extends AbstractCriterionTrigger<PositionTrigger.Instance>
{
    private final ResourceLocation id;

    public PositionTrigger(ResourceLocation p_i3698_1_)
    {
        this.id = p_i3698_1_;
    }

    public ResourceLocation getId()
    {
        return this.id;
    }

    public PositionTrigger.Instance deserializeInstance(JsonObject json, JsonDeserializationContext context)
    {
        LocationPredicate locationpredicate = LocationPredicate.deserialize(json);
        return new PositionTrigger.Instance(this.id, locationpredicate);
    }

    public void trigger(ServerPlayerEntity player)
    {
        this.func_227070_a_(player.getAdvancements(), (p_226923_1_) ->
        {
            return p_226923_1_.test(player.getServerWorld(), player.getPosX(), player.getPosY(), player.getPosZ());
        });
    }

    public static class Instance extends CriterionInstance
    {
        private final LocationPredicate location;

        public Instance(ResourceLocation p_i2070_1_, LocationPredicate p_i2070_2_)
        {
            super(p_i2070_1_);
            this.location = p_i2070_2_;
        }

        public static PositionTrigger.Instance forLocation(LocationPredicate p_203932_0_)
        {
            return new PositionTrigger.Instance(CriteriaTriggers.LOCATION.id, p_203932_0_);
        }

        public static PositionTrigger.Instance sleptInBed()
        {
            return new PositionTrigger.Instance(CriteriaTriggers.SLEPT_IN_BED.id, LocationPredicate.ANY);
        }

        public static PositionTrigger.Instance func_215120_d()
        {
            return new PositionTrigger.Instance(CriteriaTriggers.HERO_OF_THE_VILLAGE.id, LocationPredicate.ANY);
        }

        public boolean test(ServerWorld world, double x, double y, double z)
        {
            return this.location.test(world, x, y, z);
        }

        public JsonElement serialize()
        {
            return this.location.serialize();
        }
    }
}
