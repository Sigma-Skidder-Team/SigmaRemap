package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;

public class Class4489 extends Class4457 {
   private final Class8634 field21691;

   public Class4489(Class9587 var1, Class8634 var2) {
      super(Class4911.method15176(), var1);
      this.field21691 = var2;
   }

   public static Class4489 method14158() {
      return new Class4489(Class9587.field44822, Class8634.field38839);
   }

   public static Class4489 method14159(IItemProvider var0) {
      return new Class4489(
         Class9587.field44822,
         new Class8634(
            (ITag<Item>)null,
            var0.asItem(),
            Class8840.field39936,
            Class8840.field39936,
            Class8605.field38716,
            Class8605.field38716,
            (Class8812)null,
            Class8811.field39645
         )
      );
   }

   public boolean method14160(ItemStack var1) {
      return this.field21691.method31016(var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21691.method31018());
      return var4;
   }
}
