package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4472 extends Class4457 {
   private final Class8634 field21661;

   public Class4472(Class9587 var1, Class8634 var2) {
      super(Class4878.method15070(), var1);
      this.field21661 = var2;
   }

   public static Class4472 method14126(IItemProvider var0) {
      return new Class4472(Class9587.field44822, Class9735.method38146().method38147(var0).method38151());
   }

   public boolean method14127(ItemStack var1) {
      return this.field21661.method31016(var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21661.method31018());
      return var4;
   }
}
