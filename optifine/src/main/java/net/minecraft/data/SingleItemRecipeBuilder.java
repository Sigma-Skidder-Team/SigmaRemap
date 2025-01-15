package net.minecraft.data;

import com.google.gson.JsonObject;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.advancements.criterion.RecipeUnlockedTrigger;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class SingleItemRecipeBuilder
{
    private final Item result;
    private final Ingredient ingredient;
    private final int count;
    private final Advancement.Builder advancementBuilder = Advancement.Builder.builder();
    private String group;
    private final IRecipeSerializer<?> serializer;

    public SingleItemRecipeBuilder(IRecipeSerializer<?> p_i3916_1_, Ingredient p_i3916_2_, IItemProvider p_i3916_3_, int p_i3916_4_)
    {
        this.serializer = p_i3916_1_;
        this.result = p_i3916_3_.asItem();
        this.ingredient = p_i3916_2_;
        this.count = p_i3916_4_;
    }

    public static SingleItemRecipeBuilder stonecuttingRecipe(Ingredient ingredientIn, IItemProvider resultIn)
    {
        return new SingleItemRecipeBuilder(IRecipeSerializer.STONECUTTING, ingredientIn, resultIn, 1);
    }

    public static SingleItemRecipeBuilder stonecuttingRecipe(Ingredient ingredientIn, IItemProvider resultIn, int countIn)
    {
        return new SingleItemRecipeBuilder(IRecipeSerializer.STONECUTTING, ingredientIn, resultIn, countIn);
    }

    public SingleItemRecipeBuilder addCriterion(String name, ICriterionInstance criterionIn)
    {
        this.advancementBuilder.withCriterion(name, criterionIn);
        return this;
    }

    public void build(Consumer<IFinishedRecipe> consumerIn, String save)
    {
        ResourceLocation resourcelocation = Registry.ITEM.getKey(this.result);

        if ((new ResourceLocation(save)).equals(resourcelocation))
        {
            throw new IllegalStateException("Single Item Recipe " + save + " should remove its 'save' argument");
        }
        else
        {
            this.build(consumerIn, new ResourceLocation(save));
        }
    }

    public void build(Consumer<IFinishedRecipe> consumerIn, ResourceLocation id)
    {
        this.validate(id);
        this.advancementBuilder.withParentId(new ResourceLocation("recipes/root")).withCriterion("has_the_recipe", new RecipeUnlockedTrigger.Instance(id)).withRewards(AdvancementRewards.Builder.recipe(id)).withRequirementsStrategy(IRequirementsStrategy.OR);
        consumerIn.accept(new SingleItemRecipeBuilder.Result(id, this.serializer, this.group == null ? "" : this.group, this.ingredient, this.result, this.count, this.advancementBuilder, new ResourceLocation(id.getNamespace(), "recipes/" + this.result.getGroup().getPath() + "/" + id.getPath())));
    }

    private void validate(ResourceLocation id)
    {
        if (this.advancementBuilder.getCriteria().isEmpty())
        {
            throw new IllegalStateException("No way of obtaining recipe " + id);
        }
    }

    public static class Result implements IFinishedRecipe
    {
        private final ResourceLocation id;
        private final String group;
        private final Ingredient ingredient;
        private final Item result;
        private final int count;
        private final Advancement.Builder advancementBuilder;
        private final ResourceLocation advancementId;
        private final IRecipeSerializer<?> serializer;

        public Result(ResourceLocation p_i3743_1_, IRecipeSerializer<?> p_i3743_2_, String p_i3743_3_, Ingredient p_i3743_4_, Item p_i3743_5_, int p_i3743_6_, Advancement.Builder p_i3743_7_, ResourceLocation p_i3743_8_)
        {
            this.id = p_i3743_1_;
            this.serializer = p_i3743_2_;
            this.group = p_i3743_3_;
            this.ingredient = p_i3743_4_;
            this.result = p_i3743_5_;
            this.count = p_i3743_6_;
            this.advancementBuilder = p_i3743_7_;
            this.advancementId = p_i3743_8_;
        }

        public void serialize(JsonObject json)
        {
            if (!this.group.isEmpty())
            {
                json.addProperty("group", this.group);
            }

            json.add("ingredient", this.ingredient.serialize());
            json.addProperty("result", Registry.ITEM.getKey(this.result).toString());
            json.addProperty("count", this.count);
        }

        public ResourceLocation getID()
        {
            return this.id;
        }

        public IRecipeSerializer<?> getSerializer()
        {
            return this.serializer;
        }

        @Nullable
        public JsonObject getAdvancementJson()
        {
            return this.advancementBuilder.serialize();
        }

        @Nullable
        public ResourceLocation getAdvancementID()
        {
            return this.advancementId;
        }
    }
}
