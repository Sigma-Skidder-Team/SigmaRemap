package net.minecraft.advancements.criterion;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;

public class KilledTrigger extends AbstractCriterionTrigger<KilledTrigger.Instance>
{
    private final ResourceLocation id;

    public KilledTrigger(ResourceLocation p_i3460_1_)
    {
        this.id = p_i3460_1_;
    }

    public ResourceLocation getId()
    {
        return this.id;
    }

    public KilledTrigger.Instance deserializeInstance(JsonObject json, JsonDeserializationContext context)
    {
        return new KilledTrigger.Instance(this.id, EntityPredicate.deserialize(json.get("entity")), DamageSourcePredicate.deserialize(json.get("killing_blow")));
    }

    public void trigger(ServerPlayerEntity player, Entity entity, DamageSource source)
    {
        this.func_227070_a_(player.getAdvancements(), (p_226846_3_) ->
        {
            return p_226846_3_.test(player, entity, source);
        });
    }

    public static class Instance extends CriterionInstance
    {
        private final EntityPredicate entity;
        private final DamageSourcePredicate killingBlow;

        public Instance(ResourceLocation p_i1412_1_, EntityPredicate p_i1412_2_, DamageSourcePredicate p_i1412_3_)
        {
            super(p_i1412_1_);
            this.entity = p_i1412_2_;
            this.killingBlow = p_i1412_3_;
        }

        public static KilledTrigger.Instance playerKilledEntity(EntityPredicate.Builder p_203928_0_)
        {
            return new KilledTrigger.Instance(CriteriaTriggers.PLAYER_KILLED_ENTITY.id, p_203928_0_.build(), DamageSourcePredicate.ANY);
        }

        public static KilledTrigger.Instance playerKilledEntity()
        {
            return new KilledTrigger.Instance(CriteriaTriggers.PLAYER_KILLED_ENTITY.id, EntityPredicate.ANY, DamageSourcePredicate.ANY);
        }

        public static KilledTrigger.Instance playerKilledEntity(EntityPredicate.Builder p_203929_0_, DamageSourcePredicate.Builder p_203929_1_)
        {
            return new KilledTrigger.Instance(CriteriaTriggers.PLAYER_KILLED_ENTITY.id, p_203929_0_.build(), p_203929_1_.build());
        }

        public static KilledTrigger.Instance entityKilledPlayer()
        {
            return new KilledTrigger.Instance(CriteriaTriggers.ENTITY_KILLED_PLAYER.id, EntityPredicate.ANY, DamageSourcePredicate.ANY);
        }

        public boolean test(ServerPlayerEntity player, Entity entity, DamageSource source)
        {
            return !this.killingBlow.test(player, source) ? false : this.entity.test(player, entity);
        }

        public JsonElement serialize()
        {
            JsonObject jsonobject = new JsonObject();
            jsonobject.add("entity", this.entity.serialize());
            jsonobject.add("killing_blow", this.killingBlow.serialize());
            return jsonobject;
        }
    }
}
