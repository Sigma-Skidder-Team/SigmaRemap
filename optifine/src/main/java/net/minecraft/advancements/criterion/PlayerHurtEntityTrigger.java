package net.minecraft.advancements.criterion;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;

public class PlayerHurtEntityTrigger extends AbstractCriterionTrigger<PlayerHurtEntityTrigger.Instance>
{
    private static final ResourceLocation ID = new ResourceLocation("player_hurt_entity");

    public ResourceLocation getId()
    {
        return ID;
    }

    public PlayerHurtEntityTrigger.Instance deserializeInstance(JsonObject json, JsonDeserializationContext context)
    {
        DamagePredicate damagepredicate = DamagePredicate.deserialize(json.get("damage"));
        EntityPredicate entitypredicate = EntityPredicate.deserialize(json.get("entity"));
        return new PlayerHurtEntityTrigger.Instance(damagepredicate, entitypredicate);
    }

    public void trigger(ServerPlayerEntity player, Entity entityIn, DamageSource source, float amountDealt, float amountTaken, boolean blocked)
    {
        this.func_227070_a_(player.getAdvancements(), (p_226956_6_) ->
        {
            return p_226956_6_.test(player, entityIn, source, amountDealt, amountTaken, blocked);
        });
    }

    public static class Instance extends CriterionInstance
    {
        private final DamagePredicate damage;
        private final EntityPredicate entity;

        public Instance(DamagePredicate p_i1796_1_, EntityPredicate p_i1796_2_)
        {
            super(PlayerHurtEntityTrigger.ID);
            this.damage = p_i1796_1_;
            this.entity = p_i1796_2_;
        }

        public static PlayerHurtEntityTrigger.Instance forDamage(DamagePredicate.Builder p_203936_0_)
        {
            return new PlayerHurtEntityTrigger.Instance(p_203936_0_.build(), EntityPredicate.ANY);
        }

        public boolean test(ServerPlayerEntity player, Entity entity, DamageSource source, float dealt, float taken, boolean blocked)
        {
            if (!this.damage.test(player, source, dealt, taken, blocked))
            {
                return false;
            }
            else
            {
                return this.entity.test(player, entity);
            }
        }

        public JsonElement serialize()
        {
            JsonObject jsonobject = new JsonObject();
            jsonobject.add("damage", this.damage.serialize());
            jsonobject.add("entity", this.entity.serialize());
            return jsonobject;
        }
    }
}
