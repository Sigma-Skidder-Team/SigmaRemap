package net.minecraft.advancements.criterion;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;

public class SummonedEntityTrigger extends AbstractCriterionTrigger<SummonedEntityTrigger.Instance>
{
    private static final ResourceLocation ID = new ResourceLocation("summoned_entity");

    public ResourceLocation getId()
    {
        return ID;
    }

    public SummonedEntityTrigger.Instance deserializeInstance(JsonObject json, JsonDeserializationContext context)
    {
        EntityPredicate entitypredicate = EntityPredicate.deserialize(json.get("entity"));
        return new SummonedEntityTrigger.Instance(entitypredicate);
    }

    public void trigger(ServerPlayerEntity player, Entity entity)
    {
        this.func_227070_a_(player.getAdvancements(), (p_227229_2_) ->
        {
            return p_227229_2_.test(player, entity);
        });
    }

    public static class Instance extends CriterionInstance
    {
        private final EntityPredicate entity;

        public Instance(EntityPredicate p_i4085_1_)
        {
            super(SummonedEntityTrigger.ID);
            this.entity = p_i4085_1_;
        }

        public static SummonedEntityTrigger.Instance summonedEntity(EntityPredicate.Builder p_203937_0_)
        {
            return new SummonedEntityTrigger.Instance(p_203937_0_.build());
        }

        public boolean test(ServerPlayerEntity player, Entity entity)
        {
            return this.entity.test(player, entity);
        }

        public JsonElement serialize()
        {
            JsonObject jsonobject = new JsonObject();
            jsonobject.add("entity", this.entity.serialize());
            return jsonobject;
        }
    }
}
