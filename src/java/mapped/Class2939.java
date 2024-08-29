package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class2939 extends Class2898<Class4734> {
   public Class2939(Codec<Class4734> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4734 var5) {
      int var8 = var3.nextInt(var5.field22423 + 1);
      Mutable var9 = new Mutable();

      for (int var10 = 0; var10 < var8; var10++) {
         this.method11282(var9, var3, var4, Math.min(var10, 7));
         if (var5.field22422.method19540(var1.getBlockState(var9), var3) && !this.method11284(var1, var9)) {
            var1.setBlockState(var9, var5.field22424, 2);
         }
      }

      return true;
   }

   private void method11282(Mutable var1, Random var2, BlockPos var3, int var4) {
      int var7 = this.method11283(var2, var4);
      int var8 = this.method11283(var2, var4);
      int var9 = this.method11283(var2, var4);
      var1.method8378(var3, var7, var8, var9);
   }

   private int method11283(Random var1, int var2) {
      return Math.round((var1.nextFloat() - var1.nextFloat()) * (float)var2);
   }

   private boolean method11284(Class1660 var1, BlockPos var2) {
      Mutable var5 = new Mutable();

      for (Direction var9 : Direction.values()) {
         var5.method8377(var2, var9);
         if (var1.getBlockState(var5).isAir()) {
            return true;
         }
      }

      return false;
   }
}
