package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.List;
import javax.annotation.Nullable;

public class Class4666 implements Class4664 {
   private final ResourceLocation field22215;
   private final Item field22216;
   private final int field22217;
   private final String field22218;
   private final List<Ingredient> field22219;
   private final Class7999 field22220;
   private final ResourceLocation field22221;

   public Class4666(ResourceLocation var1, Item var2, int var3, String var4, List<Ingredient> var5, Class7999 var6, ResourceLocation var7) {
      this.field22215 = var1;
      this.field22216 = var2;
      this.field22217 = var3;
      this.field22218 = var4;
      this.field22219 = var5;
      this.field22220 = var6;
      this.field22221 = var7;
   }

   @Override
   public void method14632(JsonObject var1) {
      if (!this.field22218.isEmpty()) {
         var1.addProperty("group", this.field22218);
      }

      JsonArray var4 = new JsonArray();

      for (Ingredient var6 : this.field22219) {
         var4.add(var6.method336());
      }

      var1.add("ingredients", var4);
      JsonObject var7 = new JsonObject();
      var7.addProperty("item", Registry.ITEM.getKey(this.field22216).toString());
      if (this.field22217 > 1) {
         var7.addProperty("count", this.field22217);
      }

      var1.add("result", var7);
   }

   @Override
   public Class6504<?> method14633() {
      return Class6504.field28471;
   }

   @Override
   public ResourceLocation method14634() {
      return this.field22215;
   }

   @Nullable
   @Override
   public JsonObject method14635() {
      return this.field22220.method27318();
   }

   @Nullable
   @Override
   public ResourceLocation method14636() {
      return this.field22221;
   }
}
