package net.minecraft.advancements.criterion;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;

public class CuredZombieVillagerTrigger extends AbstractCriterionTrigger<CuredZombieVillagerTrigger.Instance>
{
    private static final ResourceLocation ID = new ResourceLocation("cured_zombie_villager");

    public ResourceLocation getId()
    {
        return ID;
    }

    public CuredZombieVillagerTrigger.Instance deserializeInstance(JsonObject json, JsonDeserializationContext context)
    {
        EntityPredicate entitypredicate = EntityPredicate.deserialize(json.get("zombie"));
        EntityPredicate entitypredicate1 = EntityPredicate.deserialize(json.get("villager"));
        return new CuredZombieVillagerTrigger.Instance(entitypredicate, entitypredicate1);
    }

    public void trigger(ServerPlayerEntity player, ZombieEntity zombie, VillagerEntity villager)
    {
        this.func_227070_a_(player.getAdvancements(), (p_226331_3_) ->
        {
            return p_226331_3_.test(player, zombie, villager);
        });
    }

    public static class Instance extends CriterionInstance
    {
        private final EntityPredicate zombie;
        private final EntityPredicate villager;

        public Instance(EntityPredicate p_i2550_1_, EntityPredicate p_i2550_2_)
        {
            super(CuredZombieVillagerTrigger.ID);
            this.zombie = p_i2550_1_;
            this.villager = p_i2550_2_;
        }

        public static CuredZombieVillagerTrigger.Instance any()
        {
            return new CuredZombieVillagerTrigger.Instance(EntityPredicate.ANY, EntityPredicate.ANY);
        }

        public boolean test(ServerPlayerEntity player, ZombieEntity zombie, VillagerEntity villager)
        {
            if (!this.zombie.test(player, zombie))
            {
                return false;
            }
            else
            {
                return this.villager.test(player, villager);
            }
        }

        public JsonElement serialize()
        {
            JsonObject jsonobject = new JsonObject();
            jsonobject.add("zombie", this.zombie.serialize());
            jsonobject.add("villager", this.villager.serialize());
            return jsonobject;
        }
    }
}
