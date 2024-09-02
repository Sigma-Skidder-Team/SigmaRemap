package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4490 extends Class4457 {
   private final Class8634 field21692;

   public Class4490(Class9587 var1, Class8634 var2) {
      super(Class4903.method15154(), var1);
      this.field21692 = var2;
   }

   public static Class4490 method14161(Class8634 var0) {
      return new Class4490(Class9587.field44822, var0);
   }

   public boolean method14162(ItemStack var1) {
      return this.field21692.method31016(var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21692.method31018());
      return var4;
   }
}
