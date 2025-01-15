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
import net.minecraft.item.crafting.AbstractCookingRecipe;
import net.minecraft.item.crafting.CookingRecipeSerializer;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class CookingRecipeBuilder
{
    private final Item result;
    private final Ingredient ingredient;
    private final float experience;
    private final int cookingTime;
    private final Advancement.Builder advancementBuilder = Advancement.Builder.builder();
    private String group;
    private final CookingRecipeSerializer<?> recipeSerializer;

    private CookingRecipeBuilder(IItemProvider p_i2538_1_, Ingredient p_i2538_2_, float p_i2538_3_, int p_i2538_4_, CookingRecipeSerializer<?> p_i2538_5_)
    {
        this.result = p_i2538_1_.asItem();
        this.ingredient = p_i2538_2_;
        this.experience = p_i2538_3_;
        this.cookingTime = p_i2538_4_;
        this.recipeSerializer = p_i2538_5_;
    }

    public static CookingRecipeBuilder cookingRecipe(Ingredient ingredientIn, IItemProvider resultIn, float experienceIn, int cookingTimeIn, CookingRecipeSerializer<?> serializer)
    {
        return new CookingRecipeBuilder(resultIn, ingredientIn, experienceIn, cookingTimeIn, serializer);
    }

    public static CookingRecipeBuilder blastingRecipe(Ingredient ingredientIn, IItemProvider resultIn, float experienceIn, int cookingTimeIn)
    {
        return cookingRecipe(ingredientIn, resultIn, experienceIn, cookingTimeIn, IRecipeSerializer.BLASTING);
    }

    public static CookingRecipeBuilder smeltingRecipe(Ingredient ingredientIn, IItemProvider resultIn, float experienceIn, int cookingTimeIn)
    {
        return cookingRecipe(ingredientIn, resultIn, experienceIn, cookingTimeIn, IRecipeSerializer.SMELTING);
    }

    public CookingRecipeBuilder addCriterion(String name, ICriterionInstance criterionIn)
    {
        this.advancementBuilder.withCriterion(name, criterionIn);
        return this;
    }

    public void build(Consumer<IFinishedRecipe> consumerIn)
    {
        this.build(consumerIn, Registry.ITEM.getKey(this.result));
    }

    public void build(Consumer<IFinishedRecipe> consumerIn, String save)
    {
        ResourceLocation resourcelocation = Registry.ITEM.getKey(this.result);
        ResourceLocation resourcelocation1 = new ResourceLocation(save);

        if (resourcelocation1.equals(resourcelocation))
        {
            throw new IllegalStateException("Recipe " + resourcelocation1 + " should remove its 'save' argument");
        }
        else
        {
            this.build(consumerIn, resourcelocation1);
        }
    }

    public void build(Consumer<IFinishedRecipe> consumerIn, ResourceLocation id)
    {
        this.validate(id);
        this.advancementBuilder.withParentId(new ResourceLocation("recipes/root")).withCriterion("has_the_recipe", new RecipeUnlockedTrigger.Instance(id)).withRewards(AdvancementRewards.Builder.recipe(id)).withRequirementsStrategy(IRequirementsStrategy.OR);
        consumerIn.accept(new CookingRecipeBuilder.Result(id, this.group == null ? "" : this.group, this.ingredient, this.result, this.experience, this.cookingTime, this.advancementBuilder, new ResourceLocation(id.getNamespace(), "recipes/" + this.result.getGroup().getPath() + "/" + id.getPath()), this.recipeSerializer));
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
        private final float experience;
        private final int cookingTime;
        private final Advancement.Builder advancementBuilder;
        private final ResourceLocation advancementId;
        private final IRecipeSerializer <? extends AbstractCookingRecipe > serializer;

        public Result(ResourceLocation p_i3581_1_, String p_i3581_2_, Ingredient p_i3581_3_, Item p_i3581_4_, float p_i3581_5_, int p_i3581_6_, Advancement.Builder p_i3581_7_, ResourceLocation p_i3581_8_, IRecipeSerializer <? extends AbstractCookingRecipe > p_i3581_9_)
        {
            this.id = p_i3581_1_;
            this.group = p_i3581_2_;
            this.ingredient = p_i3581_3_;
            this.result = p_i3581_4_;
            this.experience = p_i3581_5_;
            this.cookingTime = p_i3581_6_;
            this.advancementBuilder = p_i3581_7_;
            this.advancementId = p_i3581_8_;
            this.serializer = p_i3581_9_;
        }

        public void serialize(JsonObject json)
        {
            if (!this.group.isEmpty())
            {
                json.addProperty("group", this.group);
            }

            json.add("ingredient", this.ingredient.serialize());
            json.addProperty("result", Registry.ITEM.getKey(this.result).toString());
            json.addProperty("experience", this.experience);
            json.addProperty("cookingtime", this.cookingTime);
        }

        public IRecipeSerializer<?> getSerializer()
        {
            return this.serializer;
        }

        public ResourceLocation getID()
        {
            return this.id;
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
