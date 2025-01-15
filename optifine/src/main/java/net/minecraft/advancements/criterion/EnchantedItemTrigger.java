package net.minecraft.advancements.criterion;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class EnchantedItemTrigger extends AbstractCriterionTrigger<EnchantedItemTrigger.Instance>
{
    private static final ResourceLocation ID = new ResourceLocation("enchanted_item");

    public ResourceLocation getId()
    {
        return ID;
    }

    public EnchantedItemTrigger.Instance deserializeInstance(JsonObject json, JsonDeserializationContext context)
    {
        ItemPredicate itempredicate = ItemPredicate.deserialize(json.get("item"));
        MinMaxBounds.IntBound minmaxbounds$intbound = MinMaxBounds.IntBound.fromJson(json.get("levels"));
        return new EnchantedItemTrigger.Instance(itempredicate, minmaxbounds$intbound);
    }

    public void trigger(ServerPlayerEntity player, ItemStack item, int levelsSpent)
    {
        this.func_227070_a_(player.getAdvancements(), (p_226528_2_) ->
        {
            return p_226528_2_.test(item, levelsSpent);
        });
    }

    public static class Instance extends CriterionInstance
    {
        private final ItemPredicate item;
        private final MinMaxBounds.IntBound levels;

        public Instance(ItemPredicate p_i3323_1_, MinMaxBounds.IntBound p_i3323_2_)
        {
            super(EnchantedItemTrigger.ID);
            this.item = p_i3323_1_;
            this.levels = p_i3323_2_;
        }

        public static EnchantedItemTrigger.Instance any()
        {
            return new EnchantedItemTrigger.Instance(ItemPredicate.ANY, MinMaxBounds.IntBound.UNBOUNDED);
        }

        public boolean test(ItemStack item, int levelsIn)
        {
            if (!this.item.test(item))
            {
                return false;
            }
            else
            {
                return this.levels.test(levelsIn);
            }
        }

        public JsonElement serialize()
        {
            JsonObject jsonobject = new JsonObject();
            jsonobject.add("item", this.item.serialize());
            jsonobject.add("levels", this.levels.serialize());
            return jsonobject;
        }
    }
}
