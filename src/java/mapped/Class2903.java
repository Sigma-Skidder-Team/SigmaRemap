package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;

import java.util.*;

public class Class2903 extends Class2898<Class4733> {
   public Class2903(Codec<Class4733> var1) {
      super(var1);
   }

   public static boolean method11226(Class1680 var0, BlockPos var1) {
      return method11233(var0, var1) || var0.method6815(var1, var0x -> var0x.isIn(BlockTags.field32751));
   }

   private static boolean method11227(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> var0x.isIn(Blocks.VINE));
   }

   private static boolean method11228(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> var0x.isIn(Blocks.WATER));
   }

   public static boolean method11229(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> var0x.isAir() || var0x.isIn(BlockTags.LEAVES));
   }

   private static boolean method11230(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> {
         Block var3 = var0x.getBlock();
         return method11219(var3) || var3 == Blocks.FARMLAND;
      });
   }

   private static boolean method11231(Class1680 var0, BlockPos var1) {
      return var0.method6815(var1, var0x -> {
         Material var3 = var0x.getMaterial();
         return var3 == Material.TALL_PLANTS;
      });
   }

   public static void method11232(Class1681 var0, BlockPos var1, BlockState var2) {
      var0.setBlockState(var1, var2, 19);
   }

   public static boolean method11233(Class1680 var0, BlockPos var1) {
      return method11229(var0, var1) || method11231(var0, var1) || method11228(var0, var1);
   }

   private boolean method11234(Class1679 var1, Random var2, BlockPos var3, Set<BlockPos> var4, Set<BlockPos> var5, MutableBoundingBox var6, Class4733 var7) {
      int var10 = var7.field22416.method21066(var2);
      int var11 = var7.field22415.method20788(var2, var10, var7);
      int var12 = var10 - var11;
      int var13 = var7.field22415.method20787(var2, var12);
      BlockPos var14;
      if (var7.field22414) {
         var14 = var3;
      } else {
         int var15 = var1.method7006(Heightmap.Type.OCEAN_FLOOR, var3).getY();
         int var16 = var1.method7006(Heightmap.Type.WORLD_SURFACE, var3).getY();
         if (var16 - var15 > var7.field22418) {
            return false;
         }

         int var17;
         if (var7.field22420 != Heightmap.Type.OCEAN_FLOOR) {
            if (var7.field22420 != Heightmap.Type.WORLD_SURFACE) {
               var17 = var1.method7006(var7.field22420, var3).getY();
            } else {
               var17 = var16;
            }
         } else {
            var17 = var15;
         }

         var14 = new BlockPos(var3.getX(), var17, var3.getZ());
      }

      if (var14.getY() < 1 || var14.getY() + var10 + 1 > 256) {
         return false;
      } else if (!method11230(var1, var14.down())) {
         return false;
      } else {
         OptionalInt var18 = var7.field22417.method24959();
         int var19 = this.method11235(var1, var10, var14, var7);
         if (var19 < var10 && (!var18.isPresent() || var19 < var18.getAsInt())) {
            return false;
         } else {
            List<Class9359> var20 = var7.field22416.method21065(var1, var2, var19, var14, var4, var6, var7);
            var20.forEach(var8 -> var7.field22415.method20793(var1, var2, var7, var19, var8, var11, var13, var5, var6));
            return true;
         }
      }
   }

   private int method11235(Class1680 var1, int var2, BlockPos var3, Class4733 var4) {
      BlockPos.Mutable var7 = new BlockPos.Mutable();

      for (int var8 = 0; var8 <= var2 + 1; var8++) {
         int var9 = var4.field22417.method24953(var2, var8);

         for (int var10 = -var9; var10 <= var9; var10++) {
            for (int var11 = -var9; var11 <= var9; var11++) {
               var7.method8378(var3, var10, var8, var11);
               if (!method11226(var1, var7) || !var4.field22419 && method11227(var1, var7)) {
                  return var8 - 2;
               }
            }
         }
      }

      return var2;
   }

   @Override
   public void method11217(Class1681 var1, BlockPos var2, BlockState var3) {
      method11232(var1, var2, var3);
   }

   public final boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4733 var5) {
      HashSet var8 = Sets.newHashSet();
      HashSet var9 = Sets.newHashSet();
      HashSet var10 = Sets.newHashSet();
      MutableBoundingBox var11 = MutableBoundingBox.method38386();
      boolean var12 = this.method11234(var1, var3, var4, var8, var9, var11, var5);
      if (var11.field45678 <= var11.field45681 && var12 && !var8.isEmpty()) {
         if (!var5.field22413.isEmpty()) {
            ArrayList var13 = Lists.newArrayList(var8);
            ArrayList var14 = Lists.newArrayList(var9);
            var13.sort(Comparator.comparingInt(Vector3i::getY));
            var14.sort(Comparator.comparingInt(Vector3i::getY));
            var5.field22413.forEach(var6 -> var6.method22269(var1, var3, var13, var14, var10, var11));
         }

         Class7938 var15 = this.method11236(var1, var11, var8, var10);
         Class8969.method32900(var1, 3, var15, var11.field45678, var11.field45679, var11.field45680);
         return true;
      } else {
         return false;
      }
   }

   private Class7938 method11236(IWorld var1, MutableBoundingBox var2, Set<BlockPos> var3, Set<BlockPos> var4) {
      ArrayList var7 = Lists.newArrayList();
      Class7937 var8 = new Class7937(var2.method38398(), var2.method38399(), var2.method38400());
      byte var9 = 6;

      for (int var10 = 0; var10 < 6; var10++) {
         var7.add(Sets.newHashSet());
      }

      BlockPos.Mutable var23 = new BlockPos.Mutable();

      for (BlockPos var12 : Lists.newArrayList(var4)) {
         if (var2.method38396(var12)) {
            var8.method26718(var12.getX() - var2.field45678, var12.getY() - var2.field45679, var12.getZ() - var2.field45680, true, true);
         }
      }

      for (BlockPos var26 : Lists.newArrayList(var3)) {
         if (var2.method38396(var26)) {
            var8.method26718(var26.getX() - var2.field45678, var26.getY() - var2.field45679, var26.getZ() - var2.field45680, true, true);
         }

         for (Direction var16 : Direction.values()) {
            var23.method8377(var26, var16);
            if (!var3.contains(var23)) {
               BlockState var17 = var1.getBlockState(var23);
               if (var17.method23462(BlockStateProperties.field39747)) {
                  ((Set)var7.get(0)).add(var23.toImmutable());
                  method11232(var1, var23, var17.with(BlockStateProperties.field39747, Integer.valueOf(1)));
                  if (var2.method38396(var23)) {
                     var8.method26718(
                        var23.getX() - var2.field45678, var23.getY() - var2.field45679, var23.getZ() - var2.field45680, true, true
                     );
                  }
               }
            }
         }
      }

      for (int var25 = 1; var25 < 6; var25++) {
         Set<BlockPos> var27 = (Set<BlockPos>) var7.get(var25 - 1);
         Set var28 = (Set)var7.get(var25);

         for (BlockPos var30 : var27) {
            if (var2.method38396(var30)) {
               var8.method26718(var30.getX() - var2.field45678, var30.getY() - var2.field45679, var30.getZ() - var2.field45680, true, true);
            }

            for (Direction var19 : Direction.values()) {
               var23.method8377(var30, var19);
               if (!var27.contains(var23) && !var28.contains(var23)) {
                  BlockState var20 = var1.getBlockState(var23);
                  if (var20.method23462(BlockStateProperties.field39747)) {
                     int var21 = var20.<Integer>get(BlockStateProperties.field39747);
                     if (var21 > var25 + 1) {
                        BlockState var22 = var20.with(BlockStateProperties.field39747, Integer.valueOf(var25 + 1));
                        method11232(var1, var23, var22);
                        if (var2.method38396(var23)) {
                           var8.method26718(
                              var23.getX() - var2.field45678, var23.getY() - var2.field45679, var23.getZ() - var2.field45680, true, true
                           );
                        }

                        var28.add(var23.toImmutable());
                     }
                  }
               }
            }
         }
      }

      return var8;
   }
}
