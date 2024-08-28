package mapped;

import com.google.gson.JsonObject;

public class Class4482 extends Class4457 {
   private final Class8634 field21676;

   public Class4482(Class9587 var1, Class8634 var2) {
      super(Class4888.method15105(), var1);
      this.field21676 = var2;
   }

   public static Class4482 method14145(Class3303 var0) {
      return new Class4482(Class9587.field44822, Class9735.method38146().method38147(var0).method38151());
   }

   public boolean method14146(ItemStack var1) {
      return this.field21676.method31016(var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21676.method31018());
      return var4;
   }
}
