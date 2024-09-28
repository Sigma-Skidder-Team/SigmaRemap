package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class Class975 extends Class927 implements Class930 {
   private static String[] field5260;
   private final BlockState field5447;
   private final IWorld field5448;
   private final BlockPos field5449;
   private boolean field5450;

   public Class975(BlockState var1, IWorld var2, BlockPos var3) {
      super(1);
      this.field5447 = var1;
      this.field5448 = var2;
      this.field5449 = var3;
   }

   @Override
   public int getInventoryStackLimit() {
      return 1;
   }

   @Override
   public int[] method3653(Direction var1) {
      return var1 != Direction.UP ? new int[0] : new int[]{0};
   }

   @Override
   public boolean method3654(int var1, ItemStack var2, Direction var3) {
      return !this.field5450 && var3 == Direction.UP && Class3475.field19327.containsKey(var2.getItem());
   }

   @Override
   public boolean method3655(int var1, ItemStack var2, Direction var3) {
      return false;
   }

   @Override
   public void markDirty() {
      ItemStack var3 = this.getStackInSlot(0);
      if (!var3.isEmpty()) {
         this.field5450 = true;
         BlockState var4 = Class3475.method12172(this.field5447, this.field5448, this.field5449, var3);
         this.field5448.playEvent(1500, this.field5449, var4 == this.field5447 ? 0 : 1);
         this.removeStackFromSlot(0);
      }
   }
}
