package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class6998 extends Class6997 {
   private static String[] field30273;

   public Class6998(Class1088 var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean method21668() {
      return true;
   }

   @Override
   public Class9597 method21644(int var1) {
      this.field30257 = new Class6761();
      return new Class9597(this.field30257, var1);
   }

   @Override
   public boolean method21672(BlockPos var1) {
      if (this.field30243 instanceof Class1088) {
         Class1088 var4 = (Class1088)this.field30243;
         if (Class1088.method5064(var4)) {
            return this.field30244.getBlockState(var1).method23448(Blocks.WATER);
         }
      }

      return !this.field30244.getBlockState(var1.down()).isAir();
   }
}
