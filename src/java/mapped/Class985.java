package mapped;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class985 extends Class924 {
   public Class985() {
      super(TileEntityType.field21447, IRecipeType.SMOKING);
   }

   @Override
   public ITextComponent getDefaultName() {
      return new TranslationTextComponent("container.smoker");
   }

   @Override
   public int method3650(ItemStack var1) {
      return super.method3650(var1) / 2;
   }

   @Override
   public Container createMenu(int var1, PlayerInventory var2) {
      return new Class5833(var1, var2, this, this.field5252);
   }

   @Override
   public ITextComponent getDefaultName2() {
      return new TranslationTextComponent("container.smoker");
   }
}
