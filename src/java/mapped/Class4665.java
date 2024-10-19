package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;

public class Class4665 implements Class4664 {
   private final ResourceLocation field22207;
   private final String field22208;
   private final Class120 field22209;
   private final Item field22210;
   private final int field22211;
   private final Class7999 field22212;
   private final ResourceLocation field22213;
   private final Class6504<?> field22214;

   public Class4665(ResourceLocation var1, Class6504<?> var2, String var3, Class120 var4, Item var5, int var6, Class7999 var7, ResourceLocation var8) {
      this.field22207 = var1;
      this.field22214 = var2;
      this.field22208 = var3;
      this.field22209 = var4;
      this.field22210 = var5;
      this.field22211 = var6;
      this.field22212 = var7;
      this.field22213 = var8;
   }

   @Override
   public void method14632(JsonObject var1) {
      if (!this.field22208.isEmpty()) {
         var1.addProperty("group", this.field22208);
      }

      var1.add("ingredient", this.field22209.method336());
      var1.addProperty("result", Registry.ITEM.getKey(this.field22210).toString());
      var1.addProperty("count", this.field22211);
   }

   @Override
   public ResourceLocation method14634() {
      return this.field22207;
   }

   @Override
   public Class6504<?> method14633() {
      return this.field22214;
   }

   @Nullable
   @Override
   public JsonObject method14635() {
      return this.field22212.method27318();
   }

   @Nullable
   @Override
   public ResourceLocation method14636() {
      return this.field22213;
   }
}
