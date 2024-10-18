package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IBlockReader;

public abstract class Class4188 extends Class4178 {
   public Class102 field20479;

   public Class4188(Class7792 var1, int var2, Class102 var3) {
      super(var1, var2);
      this.field20479 = var3;
   }

   public Class4188(Class7792 var1, CompoundNBT var2) {
      super(var1, var2);
      this.field20479 = Class102.method293(var2.getInt("MST"));
   }

   @Override
   public void method12897(CompoundNBT var1) {
      var1.putInt("MST", this.field20479.ordinal());
   }

   public BlockState method12967() {
      switch (Class7441.field32016[this.field20479.ordinal()]) {
         case 1:
         default:
            return Blocks.field36400.getDefaultState();
         case 2:
            return Blocks.field36405.getDefaultState();
      }
   }

   public BlockState method12968() {
      switch (Class7441.field32016[this.field20479.ordinal()]) {
         case 1:
         default:
            return Blocks.OAK_FENCE.getDefaultState();
         case 2:
            return Blocks.field36871.getDefaultState();
      }
   }

   public boolean method12969(IBlockReader var1, MutableBoundingBox var2, int var3, int var4, int var5, int var6) {
      for (int var9 = var3; var9 <= var4; var9++) {
         if (this.method12924(var1, var9, var5 + 1, var6, var2).isAir()) {
            return false;
         }
      }

      return true;
   }
}
