package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.SmithingRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;

public class Class6509 implements Class6504<SmithingRecipe> {
   public SmithingRecipe method19700(ResourceLocation var1, JsonObject var2) {
      Ingredient var5 = Ingredient.method344(JSONUtils.method32782(var2, "base"));
      Ingredient var6 = Ingredient.method344(JSONUtils.method32782(var2, "addition"));
      ItemStack var7 = Class4852.method14987(JSONUtils.method32782(var2, "result"));
      return new SmithingRecipe(var1, var5, var6, var7);
   }

   public SmithingRecipe method19699(ResourceLocation var1, PacketBuffer var2) {
      Ingredient var5 = Ingredient.method343(var2);
      Ingredient var6 = Ingredient.method343(var2);
      ItemStack var7 = var2.readItemStack();
      return new SmithingRecipe(var1, var5, var6, var7);
   }

   public void method19698(PacketBuffer var1, SmithingRecipe var2) {
      SmithingRecipe.method14973(var2).method335(var1);
      SmithingRecipe.method14974(var2).method335(var1);
      var1.writeItemStack(SmithingRecipe.method14975(var2));
   }
}
