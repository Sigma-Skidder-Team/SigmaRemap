package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public abstract class Class2921<U extends Class4698> extends Class2898<U> {
   public Class2921(Codec<U> var1) {
      super(var1);
   }

   @Override
   public boolean method11213(Class1658 var1, ChunkGenerator var2, Random var3, BlockPos var4, U var5) {
      BlockState var8 = this.method11254(var3, var4, (U)var5);
      int var9 = 0;

      for (int var10 = 0; var10 < this.method11252((U)var5); var10++) {
         BlockPos var11 = this.method11253(var3, var4, (U)var5);
         if (var1.method7007(var11) && var11.getY() < 255 && var8.method23443(var1, var11) && this.method11251(var1, var11, (U)var5)) {
            var1.setBlockState(var11, var8, 2);
            var9++;
         }
      }

      return var9 > 0;
   }

   public abstract boolean method11251(Class1660 var1, BlockPos var2, U var3);

   public abstract int method11252(U var1);

   public abstract BlockPos method11253(Random var1, BlockPos var2, U var3);

   public abstract BlockState method11254(Random var1, BlockPos var2, U var3);
}
