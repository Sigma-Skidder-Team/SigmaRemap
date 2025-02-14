package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;

public class Class4669 implements Class4664 {
   private final ResourceLocation field22231;
   private final String field22232;
   private final Ingredient field22233;
   private final Item field22234;
   private final float field22235;
   private final int field22236;
   private final Class7999 field22237;
   private final ResourceLocation field22238;
   private final Class6504<? extends Class4847> field22239;

   public Class4669(
           ResourceLocation var1, String var2, Ingredient var3, Item var4, float var5, int var6, Class7999 var7, ResourceLocation var8, Class6504<? extends Class4847> var9
   ) {
      this.field22231 = var1;
      this.field22232 = var2;
      this.field22233 = var3;
      this.field22234 = var4;
      this.field22235 = var5;
      this.field22236 = var6;
      this.field22237 = var7;
      this.field22238 = var8;
      this.field22239 = var9;
   }

   @Override
   public void method14632(JsonObject var1) {
      if (!this.field22232.isEmpty()) {
         var1.addProperty("group", this.field22232);
      }

      var1.add("ingredient", this.field22233.method336());
      var1.addProperty("result", Registry.ITEM.getKey(this.field22234).toString());
      var1.addProperty("experience", this.field22235);
      var1.addProperty("cookingtime", this.field22236);
   }

   @Override
   public Class6504<?> method14633() {
      return this.field22239;
   }

   @Override
   public ResourceLocation method14634() {
      return this.field22231;
   }

   @Nullable
   @Override
   public JsonObject method14635() {
      return this.field22237.method27318();
   }

   @Nullable
   @Override
   public ResourceLocation method14636() {
      return this.field22238;
   }
}
