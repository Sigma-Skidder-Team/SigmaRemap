package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class5846 extends Slot {
   public Class5846(IInventory var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean canTakeStack(PlayerEntity var1) {
      return super.canTakeStack(var1) && this.getHasStack() ? this.getStack().method32145("CustomCreativeLock") == null : !this.getHasStack();
   }
}
