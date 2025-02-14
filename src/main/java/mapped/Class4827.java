package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;

import java.util.Collection;
import java.util.Collections;

public class Class4827 implements Class4826 {
   private final ItemStack field22599;

   public Class4827(ItemStack var1) {
      this.field22599 = var1;
   }

   @Override
   public Collection<ItemStack> method14917() {
      return Collections.<ItemStack>singleton(this.field22599);
   }

   @Override
   public JsonObject method14918() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("item", Registry.ITEM.getKey(this.field22599.getItem()).toString());
      return var3;
   }
}
