package mapped;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.ITextProperties;

public interface Class7502 {
   int method24459();

   ITextProperties method24460(int var1);

   default ITextProperties method24461(int var1) {
      return var1 >= 0 && var1 < this.method24459() ? this.method24460(var1) : ITextProperties.field_240651_c_;
   }

   static Class7502 method24462(ItemStack var0) {
      Item var3 = var0.getItem();
      if (var3 != Items.field38048) {
         return (Class7502)(var3 != Items.field38047 ? Class870.field4819 : new Class7504(var0));
      } else {
         return new Class7501(var0);
      }
   }
}
