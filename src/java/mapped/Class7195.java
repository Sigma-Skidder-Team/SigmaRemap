package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class Class7195<C extends Class4729> {
   public static final Class7195<Class4728> field30888 = method22604("cave", new Class7194(Class4728.field22398, 256));
   public static final Class7195<Class4728> field30889 = method22604("nether_cave", new Class7193(Class4728.field22398));
   public static final Class7195<Class4728> field30890 = method22604("canyon", new Class7196(Class4728.field22398));
   public static final Class7195<Class4728> field30891 = method22604("underwater_canyon", new Class7197(Class4728.field22398));
   public static final Class7195<Class4728> field30892 = method22604("underwater_cave", new Class7198(Class4728.field22398));
   public static final BlockState field30893 = Blocks.AIR.method11579();
   public static final BlockState field30894 = Blocks.field37012.method11579();
   public static final FluidState field30895 = Class9479.field44066.method25049();
   public static final FluidState field30896 = Class9479.field44068.method25049();
   public Set<Block> field30897 = ImmutableSet.of(
      Blocks.STONE,
      Blocks.GRANITE,
      Blocks.DIORITE,
      Blocks.ANDESITE,
      Blocks.field36396,
      Blocks.field36397,
      new Block[]{
         Blocks.field36398,
         Blocks.field36395,
         Blocks.field36794,
         Blocks.field36730,
         Blocks.field36731,
         Blocks.field36732,
         Blocks.field36733,
         Blocks.field36734,
         Blocks.field36735,
         Blocks.field36736,
         Blocks.field36737,
         Blocks.field36738,
         Blocks.field36739,
         Blocks.field36740,
         Blocks.field36741,
         Blocks.field36742,
         Blocks.field36743,
         Blocks.field36744,
         Blocks.field36745,
         Blocks.SANDSTONE,
         Blocks.field36835,
         Blocks.MYCELIUM,
         Blocks.SNOW,
         Blocks.PACKED_ICE
      }
   );
   public Set<Fluid> field30898 = ImmutableSet.of(Class9479.field44066);
   private final Codec<Class6815<C>> field30899;
   public final int field30900;

   private static <C extends Class4729, F extends Class7195<C>> F method22604(String var0, F var1) {
      return Registry.<F>method9194(Registry.field16110, var0, (F)var1);
   }

   public Class7195(Codec<C> var1, int var2) {
      this.field30900 = var2;
      this.field30899 = var1.fieldOf("config").xmap(this::method22605, Class6815::method20775).codec();
   }

   public Class6815<C> method22605(C var1) {
      return new Class6815<C>(this, var1);
   }

   public Codec<Class6815<C>> method22606() {
      return this.field30899;
   }

   public int method22607() {
      return 4;
   }

   public boolean method22608(
      IChunk var1,
      Function<BlockPos, Biome> var2,
      long var3,
      int var5,
      int var6,
      int var7,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      BitSet var18
   ) {
      Random var21 = new Random(var3 + (long)var6 + (long)var7);
      double var22 = (double)(var6 * 16 + 8);
      double var24 = (double)(var7 * 16 + 8);
      if (!(var8 < var22 - 16.0 - var14 * 2.0)
         && !(var12 < var24 - 16.0 - var14 * 2.0)
         && !(var8 > var22 + 16.0 + var14 * 2.0)
         && !(var12 > var24 + 16.0 + var14 * 2.0)) {
         int var26 = Math.max(MathHelper.floor(var8 - var14) - var6 * 16 - 1, 0);
         int var27 = Math.min(MathHelper.floor(var8 + var14) - var6 * 16 + 1, 16);
         int var28 = Math.max(MathHelper.floor(var10 - var16) - 1, 1);
         int var29 = Math.min(MathHelper.floor(var10 + var16) + 1, this.field30900 - 8);
         int var30 = Math.max(MathHelper.floor(var12 - var14) - var7 * 16 - 1, 0);
         int var31 = Math.min(MathHelper.floor(var12 + var14) - var7 * 16 + 1, 16);
         if (this.method22611(var1, var6, var7, var26, var27, var28, var29, var30, var31)) {
            return false;
         } else {
            boolean var32 = false;
            Mutable var33 = new Mutable();
            Mutable var34 = new Mutable();
            Mutable var35 = new Mutable();

            for (int var36 = var26; var36 < var27; var36++) {
               int var37 = var36 + var6 * 16;
               double var38 = ((double)var37 + 0.5 - var8) / var14;

               for (int var40 = var30; var40 < var31; var40++) {
                  int var41 = var40 + var7 * 16;
                  double var42 = ((double)var41 + 0.5 - var12) / var14;
                  if (!(var38 * var38 + var42 * var42 >= 1.0)) {
                     MutableBoolean var44 = new MutableBoolean(false);

                     for (int var45 = var29; var45 > var28; var45--) {
                        double var46 = ((double)var45 - 0.5 - var10) / var16;
                        if (!this.method22601(var38, var46, var42, var45)) {
                           var32 |= this.method22596(var1, var2, var18, var21, var33, var34, var35, var5, var6, var7, var37, var41, var36, var45, var40, var44);
                        }
                     }
                  }
               }
            }

            return var32;
         }
      } else {
         return false;
      }
   }

   public boolean method22596(
      IChunk var1,
      Function<BlockPos, Biome> var2,
      BitSet var3,
      Random var4,
      Mutable var5,
      Mutable var6,
      Mutable var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      MutableBoolean var16
   ) {
      int var19 = var13 | var15 << 4 | var14 << 8;
      if (var3.get(var19)) {
         return false;
      } else {
         var3.set(var19);
         var5.method8372(var11, var14, var12);
         BlockState var20 = var1.getBlockState(var5);
         BlockState var21 = var1.getBlockState(var6.method8377(var5, Direction.field673));
         if (var20.method23448(Blocks.field36395) || var20.method23448(Blocks.MYCELIUM)) {
            var16.setTrue();
         }

         if (this.method22610(var20, var21)) {
            if (var14 >= 11) {
               var1.setBlockState(var5, field30894, false);
               if (var16.isTrue()) {
                  var7.method8377(var5, Direction.DOWN);
                  if (var1.getBlockState(var7).method23448(Blocks.field36396)) {
                     var1.setBlockState(var7, ((Biome)var2.apply(var5)).method32507().method24283().method28934(), false);
                  }
               }
            } else {
               var1.setBlockState(var5, field30896.getBlockState(), false);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public abstract boolean method22603(
           IChunk var1, Function<BlockPos, Biome> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9, C var10
   );

   public abstract boolean method22602(Random var1, int var2, int var3, C var4);

   public boolean method22609(BlockState var1) {
      return this.field30897.contains(var1.getBlock());
   }

   public boolean method22610(BlockState var1, BlockState var2) {
      return this.method22609(var1)
         || (var1.method23448(Blocks.SAND) || var1.method23448(Blocks.GRAVEL)) && !var2.method23449().method23486(Class8953.field40469);
   }

   public boolean method22611(IChunk var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      Mutable var12 = new Mutable();

      for (int var13 = var4; var13 < var5; var13++) {
         for (int var14 = var8; var14 < var9; var14++) {
            for (int var15 = var6 - 1; var15 <= var7 + 1; var15++) {
               if (this.field30898.contains(var1.getFluidState(var12.method8372(var13 + var2 * 16, var15, var14 + var3 * 16)).method23472())) {
                  return true;
               }

               if (var15 != var7 + 1 && !this.method22612(var4, var5, var8, var9, var13, var14)) {
                  var15 = var7;
               }
            }
         }
      }

      return false;
   }

   private boolean method22612(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var5 == var1 || var5 == var2 - 1 || var6 == var3 || var6 == var4 - 1;
   }

   public boolean method22613(int var1, int var2, double var3, double var5, int var7, int var8, float var9) {
      double var12 = (double)(var1 * 16 + 8);
      double var14 = (double)(var2 * 16 + 8);
      double var16 = var3 - var12;
      double var18 = var5 - var14;
      double var20 = (double)(var8 - var7);
      double var22 = (double)(var9 + 2.0F + 16.0F);
      return var16 * var16 + var18 * var18 - var20 * var20 <= var22 * var22;
   }

   public abstract boolean method22601(double var1, double var3, double var5, int var7);
}
