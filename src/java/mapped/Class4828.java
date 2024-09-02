package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Collection;

public class Class4828 implements Class4826 {
   private final ITag<Item> field22600;

   public Class4828(ITag<Item> var1) {
      this.field22600 = var1;
   }

   @Override
   public Collection<ItemStack> method14917() {
      ArrayList var3 = Lists.newArrayList();

      for (Item var5 : this.field22600.method24918()) {
         var3.add(new ItemStack(var5));
      }

      return var3;
   }

   @Override
   public JsonObject method14918() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("tag", Class9443.method36296().method32658().method27136(this.field22600).toString());
      return var3;
   }
}
