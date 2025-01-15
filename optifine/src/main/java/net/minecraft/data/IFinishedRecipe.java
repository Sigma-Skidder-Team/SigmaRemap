package net.minecraft.data;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public interface IFinishedRecipe
{
    void serialize(JsonObject json);

default JsonObject getRecipeJson()
    {
        JsonObject jsonobject = new JsonObject();
        jsonobject.addProperty("type", Registry.RECIPE_SERIALIZER.getKey(this.getSerializer()).toString());
        this.serialize(jsonobject);
        return jsonobject;
    }

    ResourceLocation getID();

    IRecipeSerializer<?> getSerializer();

    @Nullable
    JsonObject getAdvancementJson();

    @Nullable
    ResourceLocation getAdvancementID();
}
