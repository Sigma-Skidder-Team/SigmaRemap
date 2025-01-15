package net.minecraft.item.crafting;

import com.google.gson.JsonObject;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public abstract class SingleItemRecipe implements IRecipe<IInventory>
{
    protected final Ingredient ingredient;
    protected final ItemStack result;
    private final IRecipeType<?> type;
    private final IRecipeSerializer<?> serializer;
    protected final ResourceLocation id;
    protected final String group;

    public SingleItemRecipe(IRecipeType<?> p_i1465_1_, IRecipeSerializer<?> p_i1465_2_, ResourceLocation p_i1465_3_, String p_i1465_4_, Ingredient p_i1465_5_, ItemStack p_i1465_6_)
    {
        this.type = p_i1465_1_;
        this.serializer = p_i1465_2_;
        this.id = p_i1465_3_;
        this.group = p_i1465_4_;
        this.ingredient = p_i1465_5_;
        this.result = p_i1465_6_;
    }

    public IRecipeType<?> getType()
    {
        return this.type;
    }

    public IRecipeSerializer<?> getSerializer()
    {
        return this.serializer;
    }

    public ResourceLocation getId()
    {
        return this.id;
    }

    public String getGroup()
    {
        return this.group;
    }

    public ItemStack getRecipeOutput()
    {
        return this.result;
    }

    public NonNullList<Ingredient> getIngredients()
    {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        nonnulllist.add(this.ingredient);
        return nonnulllist;
    }

    public boolean canFit(int width, int height)
    {
        return true;
    }

    public ItemStack getCraftingResult(IInventory inv)
    {
        return this.result.copy();
    }

    public static class Serializer<T extends SingleItemRecipe> implements IRecipeSerializer<T>
    {
        final SingleItemRecipe.Serializer.IRecipeFactory<T> factory;

        protected Serializer(SingleItemRecipe.Serializer.IRecipeFactory<T> p_i2813_1_)
        {
            this.factory = p_i2813_1_;
        }

        public T read(ResourceLocation recipeId, JsonObject json)
        {
            String s = JSONUtils.getString(json, "group", "");
            Ingredient ingredient;

            if (JSONUtils.isJsonArray(json, "ingredient"))
            {
                ingredient = Ingredient.deserialize(JSONUtils.getJsonArray(json, "ingredient"));
            }
            else
            {
                ingredient = Ingredient.deserialize(JSONUtils.getJsonObject(json, "ingredient"));
            }

            String s1 = JSONUtils.getString(json, "result");
            int i = JSONUtils.getInt(json, "count");
            ItemStack itemstack = new ItemStack(Registry.ITEM.getOrDefault(new ResourceLocation(s1)), i);
            return this.factory.create(recipeId, s, ingredient, itemstack);
        }

        public T read(ResourceLocation recipeId, PacketBuffer buffer)
        {
            String s = buffer.readString(32767);
            Ingredient ingredient = Ingredient.read(buffer);
            ItemStack itemstack = buffer.readItemStack();
            return this.factory.create(recipeId, s, ingredient, itemstack);
        }

        public void write(PacketBuffer buffer, T recipe)
        {
            buffer.writeString(recipe.group);
            recipe.ingredient.write(buffer);
            buffer.writeItemStack(recipe.result);
        }

        interface IRecipeFactory<T extends SingleItemRecipe>
        {
            T create(ResourceLocation p_create_1_, String p_create_2_, Ingredient p_create_3_, ItemStack p_create_4_);
        }
    }
}
