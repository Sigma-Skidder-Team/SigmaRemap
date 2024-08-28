package mapped;

import com.google.gson.JsonObject;

public class Class4483 extends Class4457 {
   private final ResourceLocation field21677;

   public Class4483(Class9587 var1, ResourceLocation var2) {
      super(Class4890.method15111(), var1);
      this.field21677 = var2;
   }

   public static Class4483 method14147(ResourceLocation var0) {
      return new Class4483(Class9587.field44822, var0);
   }

   public boolean method14148(ResourceLocation var1) {
      return this.field21677.equals(var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.addProperty("loot_table", this.field21677.toString());
      return var4;
   }
}
