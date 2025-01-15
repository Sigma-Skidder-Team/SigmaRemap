package net.minecraft.data;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
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
import net.minecraft.tags.Tag;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapelessRecipeBuilder
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final Item result;
    private final int count;
    private final List<Ingredient> ingredients = Lists.newArrayList();
    private final Advancement.Builder advancementBuilder = Advancement.Builder.builder();
    private String group;

    public ShapelessRecipeBuilder(IItemProvider p_i2767_1_, int p_i2767_2_)
    {
        this.result = p_i2767_1_.asItem();
        this.count = p_i2767_2_;
    }

    public static ShapelessRecipeBuilder shapelessRecipe(IItemProvider resultIn)
    {
        return new ShapelessRecipeBuilder(resultIn, 1);
    }

    public static ShapelessRecipeBuilder shapelessRecipe(IItemProvider resultIn, int countIn)
    {
        return new ShapelessRecipeBuilder(resultIn, countIn);
    }

    public ShapelessRecipeBuilder addIngredient(Tag<Item> tagIn)
    {
        return this.addIngredient(Ingredient.fromTag(tagIn));
    }

    public ShapelessRecipeBuilder addIngredient(IItemProvider itemIn)
    {
        return this.addIngredient(itemIn, 1);
    }

    public ShapelessRecipeBuilder addIngredient(IItemProvider itemIn, int quantity)
    {
        for (int i = 0; i < quantity; ++i)
        {
            this.addIngredient(Ingredient.fromItems(itemIn));
        }

        return this;
    }

    public ShapelessRecipeBuilder addIngredient(Ingredient ingredientIn)
    {
        return this.addIngredient(ingredientIn, 1);
    }

    public ShapelessRecipeBuilder addIngredient(Ingredient ingredientIn, int quantity)
    {
        for (int i = 0; i < quantity; ++i)
        {
            this.ingredients.add(ingredientIn);
        }

        return this;
    }

    public ShapelessRecipeBuilder addCriterion(String name, ICriterionInstance criterionIn)
    {
        this.advancementBuilder.withCriterion(name, criterionIn);
        return this;
    }

    public ShapelessRecipeBuilder setGroup(String groupIn)
    {
        this.group = groupIn;
        return this;
    }

    public void build(Consumer<IFinishedRecipe> consumerIn)
    {
        this.build(consumerIn, Registry.ITEM.getKey(this.result));
    }

    public void build(Consumer<IFinishedRecipe> consumerIn, String save)
    {
        ResourceLocation resourcelocation = Registry.ITEM.getKey(this.result);

        if ((new ResourceLocation(save)).equals(resourcelocation))
        {
            throw new IllegalStateException("Shapeless Recipe " + save + " should remove its 'save' argument");
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
        consumerIn.accept(new ShapelessRecipeBuilder.Result(id, this.result, this.count, this.group == null ? "" : this.group, this.ingredients, this.advancementBuilder, new ResourceLocation(id.getNamespace(), "recipes/" + this.result.getGroup().getPath() + "/" + id.getPath())));
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
        private final Item result;
        private final int count;
        private final String group;
        private final List<Ingredient> ingredients;
        private final Advancement.Builder advancementBuilder;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation p_i1344_1_, Item p_i1344_2_, int p_i1344_3_, String p_i1344_4_, List<Ingredient> p_i1344_5_, Advancement.Builder p_i1344_6_, ResourceLocation p_i1344_7_)
        {
            this.id = p_i1344_1_;
            this.result = p_i1344_2_;
            this.count = p_i1344_3_;
            this.group = p_i1344_4_;
            this.ingredients = p_i1344_5_;
            this.advancementBuilder = p_i1344_6_;
            this.advancementId = p_i1344_7_;
        }

        public void serialize(JsonObject json)
        {
            if (!this.group.isEmpty())
            {
                json.addProperty("group", this.group);
            }

            JsonArray jsonarray = new JsonArray();

            for (Ingredient ingredient : this.ingredients)
            {
                jsonarray.add(ingredient.serialize());
            }

            json.add("ingredients", jsonarray);
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", Registry.ITEM.getKey(this.result).toString());

            if (this.count > 1)
            {
                jsonobject.addProperty("count", this.count);
            }

            json.add("result", jsonobject);
        }

        public IRecipeSerializer<?> getSerializer()
        {
            return IRecipeSerializer.CRAFTING_SHAPELESS;
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
