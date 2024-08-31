package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class Class929 extends Class927 implements Class930 {
   private static String[] field5260;
   private final BlockState field5266;
   private final Class1660 field5267;
   private final BlockPos field5268;
   private boolean field5269;

   public Class929(BlockState var1, Class1660 var2, BlockPos var3, ItemStack var4) {
      super(var4);
      this.field5266 = var1;
      this.field5267 = var2;
      this.field5268 = var3;
   }

   @Override
   public int method3630() {
      return 1;
   }

   @Override
   public int[] method3653(Direction var1) {
      return var1 != Direction.DOWN ? new int[0] : new int[]{0};
   }

   @Override
   public boolean method3654(int var1, ItemStack var2, Direction var3) {
      return false;
   }

   @Override
   public boolean method3655(int var1, ItemStack var2, Direction var3) {
      return !this.field5269 && var3 == Direction.DOWN && var2.getItem() == Items.field37934;
   }

   @Override
   public void method3622() {
      Class3475.method12171(this.field5266, this.field5267, this.field5268);
      this.field5269 = true;
   }
}
