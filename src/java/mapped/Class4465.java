package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4465 extends Class4457 {
   private final Class8634 field21649;
   private final Class8840 field21650;

   public Class4465(Class9587 var1, Class8634 var2, Class8840 var3) {
      super(Class4912.method15179(), var1);
      this.field21649 = var2;
      this.field21650 = var3;
   }

   public static Class4465 method14111() {
      return new Class4465(Class9587.field44822, Class8634.field38839, Class8840.field39936);
   }

   public boolean method14112(ItemStack var1, int var2) {
      return this.field21649.method31016(var1) ? this.field21650.method32015(var2) : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21649.method31018());
      var4.add("levels", this.field21650.method32005());
      return var4;
   }
}
