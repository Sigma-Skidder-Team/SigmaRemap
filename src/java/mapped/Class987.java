package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class987 extends Class924 {
   public Class987() {
      super(TileEntityType.field21448, Class7207.field30937);
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.blast_furnace");
   }

   @Override
   public int method3650(ItemStack var1) {
      return super.method3650(var1) / 2;
   }

   @Override
   public Container method3690(int var1, PlayerInventory var2) {
      return new Class5834(var1, var2, this, this.field5252);
   }

   @Override
   public ITextComponent method2954() {
      return new TranslationTextComponent("container.blast_furnace");
   }
}
