package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class985 extends Class924 {
   public Class985() {
      super(TileEntityType.field21447, Class7207.field30938);
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.smoker");
   }

   @Override
   public int method3650(ItemStack var1) {
      return super.method3650(var1) / 2;
   }

   @Override
   public Class5812 method3690(int var1, PlayerInventory var2) {
      return new Class5833(var1, var2, this, this.field5252);
   }

   @Override
   public ITextComponent method2954() {
      return new TranslationTextComponent("container.smoker");
   }
}
