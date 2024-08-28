package mapped;

import com.google.gson.JsonObject;

public class Class4461 extends Class4457 {
   private final Class9587 field21640;
   private final Class8634 field21641;

   public Class4461(Class9587 var1, Class9587 var2, Class8634 var3) {
      super(Class4898.method15136(), var1);
      this.field21640 = var2;
      this.field21641 = var3;
   }

   public static Class4461 method14102() {
      return new Class4461(Class9587.field44822, Class9587.field44822, Class8634.field38839);
   }

   public boolean method14103(LootContext var1, ItemStack var2) {
      return this.field21640.method37227(var1) ? this.field21641.method31016(var2) : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21641.method31018());
      var4.add("villager", this.field21640.method37228(var1));
      return var4;
   }
}
