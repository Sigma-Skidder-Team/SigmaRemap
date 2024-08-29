package mapped;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public interface Class1662 extends Class1663, Class1668, Class1683 {
   @Nullable
   Class1670 method6724(int var1, int var2, Class9176 var3, boolean var4);

   @Deprecated
   boolean method6843(int var1, int var2);

   int method6736(Class101 var1, int var2, int var3);

   int method6808();

   Class6668 getBiomeManager();

   default Biome getBiome(BlockPos var1) {
      return this.getBiomeManager().method20323(var1);
   }

   default Stream<BlockState> method7004(Class6488 var1) {
      int var4 = MathHelper.floor(var1.field28449);
      int var5 = MathHelper.floor(var1.field28452);
      int var6 = MathHelper.floor(var1.field28450);
      int var7 = MathHelper.floor(var1.field28453);
      int var8 = MathHelper.floor(var1.field28451);
      int var9 = MathHelper.floor(var1.field28454);
      return !this.method7019(var4, var6, var8, var5, var7, var9) ? Stream.<BlockState>empty() : this.method7035(var1);
   }

   @Override
   default int method6878(BlockPos var1, Class8980 var2) {
      return var2.method32943(this.getBiome(var1), (double)var1.getX(), (double)var1.getZ());
   }

   @Override
   default Biome method7005(int var1, int var2, int var3) {
      Class1670 var6 = this.method6724(var1 >> 2, var3 >> 2, Class9176.field42136, false);
      return var6 != null && var6.method7077() != null ? var6.method7077().method7005(var1, var2, var3) : this.method6871(var1, var2, var3);
   }

   Biome method6871(int var1, int var2, int var3);

   boolean method6714();

   @Deprecated
   int method6776();

   Class9535 method6812();

   default BlockPos method7006(Class101 var1, BlockPos var2) {
      return new BlockPos(var2.getX(), this.method6736(var1, var2.getX(), var2.getZ()), var2.getZ());
   }

   default boolean method7007(BlockPos var1) {
      return this.getBlockState(var1).isAir();
   }

   default boolean method7008(BlockPos var1) {
      if (var1.getY() < this.method6776()) {
         BlockPos var4 = new BlockPos(var1.getX(), this.method6776(), var1.getZ());
         if (this.method7022(var4)) {
            for (BlockPos var5 = var4.method8313(); var5.getY() > var1.getY(); var5 = var5.method8313()) {
               BlockState var6 = this.getBlockState(var5);
               if (var6.method23387(this, var5) > 0 && !var6.method23384().method31085()) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return this.method7022(var1);
      }
   }

   @Deprecated
   default float method7009(BlockPos var1) {
      return this.method6812().method36890(this.method7015(var1));
   }

   default int method7010(BlockPos var1, Direction var2) {
      return this.getBlockState(var1).method23407(this, var1, var2);
   }

   default Class1670 method7011(BlockPos var1) {
      return this.method6824(var1.getX() >> 4, var1.getZ() >> 4);
   }

   default Class1670 method6824(int var1, int var2) {
      return this.method6724(var1, var2, Class9176.field42145, true);
   }

   default Class1670 method7012(int var1, int var2, Class9176 var3) {
      return this.method6724(var1, var2, var3, true);
   }

   @Nullable
   @Override
   default Class1665 method6769(int var1, int var2) {
      return this.method6724(var1, var2, Class9176.field42133, false);
   }

   default boolean method7013(BlockPos var1) {
      return this.method6739(var1).method23486(Class8953.field40469);
   }

   default boolean method7014(Class6488 var1) {
      int var4 = MathHelper.floor(var1.field28449);
      int var5 = MathHelper.method37774(var1.field28452);
      int var6 = MathHelper.floor(var1.field28450);
      int var7 = MathHelper.method37774(var1.field28453);
      int var8 = MathHelper.floor(var1.field28451);
      int var9 = MathHelper.method37774(var1.field28454);
      Mutable var10 = new Mutable();

      for (int var11 = var4; var11 < var5; var11++) {
         for (int var12 = var6; var12 < var7; var12++) {
            for (int var13 = var8; var13 < var9; var13++) {
               BlockState var14 = this.getBlockState(var10.method8372(var11, var12, var13));
               if (!var14.method23449().method23474()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int method7015(BlockPos var1) {
      return this.method7016(var1, this.method6808());
   }

   default int method7016(BlockPos var1, int var2) {
      return var1.getX() >= -30000000 && var1.getZ() >= -30000000 && var1.getX() < 30000000 && var1.getZ() < 30000000
         ? this.method7021(var1, var2)
         : 15;
   }

   @Deprecated
   default boolean method7017(BlockPos var1) {
      return this.method6843(var1.getX() >> 4, var1.getZ() >> 4);
   }

   @Deprecated
   default boolean method7018(BlockPos var1, BlockPos var2) {
      return this.method7019(var1.getX(), var1.getY(), var1.getZ(), var2.getX(), var2.getY(), var2.getZ());
   }

   @Deprecated
   default boolean method7019(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for (int var9 = var1; var9 <= var4; var9++) {
            for (int var10 = var3; var10 <= var6; var10++) {
               if (!this.method6843(var9, var10)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
