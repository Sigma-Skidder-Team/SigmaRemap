package mapped;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class986 extends Class924 {
   public Class986() {
      super(TileEntityType.field21421, Class7207.field30936);
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.furnace");
   }

   @Override
   public Container method3690(int var1, PlayerInventory var2) {
      return new Class5832(var1, var2, this, this.field5252);
   }

   @Override
   public ITextComponent method2954() {
      return new TranslationTextComponent("container.furnace");
   }
}
