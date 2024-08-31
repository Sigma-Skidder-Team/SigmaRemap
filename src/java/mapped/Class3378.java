package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class3378 extends Class3377 {
   private static String[] field18977;
   public static final Class8554 field18978 = Class8820.field39740;

   public Class3378(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18978, Integer.valueOf(0)));
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.method11522(var1, var2, var3, var4);
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if ((var4.nextInt(3) == 0 || this.method11970(var2, var3, 4))
         && var2.method7015(var3) > 11 - var1.<Integer>method23463(field18978) - var1.getOpacity(var2, var3)
         && this.method11969(var1, var2, var3)) {
         Mutable var7 = new Mutable();

         for (Direction var11 : Direction.values()) {
            var7.method8377(var3, var11);
            BlockState var12 = var2.getBlockState(var7);
            if (var12.method23448(this) && !this.method11969(var12, var2, var7)) {
               var2.method6860().method20726(var7, this, MathHelper.method37782(var4, 20, 40));
            }
         }
      } else {
         var2.method6860().method20726(var3, this, MathHelper.method37782(var4, 20, 40));
      }
   }

   private boolean method11969(BlockState var1, World var2, BlockPos var3) {
      int var6 = var1.<Integer>method23463(field18978);
      if (var6 >= 3) {
         this.method11968(var1, var2, var3);
         return true;
      } else {
         var2.setBlockState(var3, var1.method23465(field18978, Integer.valueOf(var6 + 1)), 2);
         return false;
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (var4 == this && this.method11970(var2, var3, 2)) {
         this.method11968(var1, var2, var3);
      }

      super.method11506(var1, var2, var3, var4, var5, var6);
   }

   private boolean method11970(Class1665 var1, BlockPos var2, int var3) {
      int var6 = 0;
      Mutable var7 = new Mutable();

      for (Direction var11 : Direction.values()) {
         var7.method8377(var2, var11);
         if (var1.getBlockState(var7).method23448(this)) {
            if (++var6 >= var3) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18978);
   }

   @Override
   public ItemStack getItem(Class1665 var1, BlockPos var2, BlockState var3) {
      return ItemStack.EMPTY;
   }
}
