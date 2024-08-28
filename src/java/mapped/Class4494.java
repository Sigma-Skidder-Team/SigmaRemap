package mapped;

import com.google.gson.JsonObject;

public class Class4494 extends Class4457 {
   private final Class8634 field21700;
   private final Class9587 field21701;

   public Class4494(Class9587 var1, Class8634 var2, Class9587 var3) {
      super(Class4896.method15129(), var1);
      this.field21700 = var2;
      this.field21701 = var3;
   }

   public static Class4494 method14172(Class9587 var0, Class9735 var1, Class9587 var2) {
      return new Class4494(var0, var1.method38151(), var2);
   }

   public boolean method14173(ItemStack var1, LootContext var2) {
      return this.field21700.method31016(var1) ? this.field21701.method37227(var2) : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21700.method31018());
      var4.add("entity", this.field21701.method37228(var1));
      return var4;
   }
}
