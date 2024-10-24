package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.server.TicketType;

import java.util.Comparator;
import java.util.Optional;

public class Class3634 {
   private static String[] field19667;
   private final ServerWorld field19668;

   public Class3634(ServerWorld var1) {
      this.field19668 = var1;
   }

   public Optional<TeleportationRepositioner> method12331(BlockPos var1, boolean var2) {
      Class1653 var5 = this.field19668.method6951();
      int var6 = !var2 ? 128 : 16;
      var5.method6682(this.field19668, var1, var6);
      Optional<Class9343> var7 = var5.method6665(var0 -> var0 == Class4913.field22770, var1, var6, Class2093.field13637)
         .sorted(Comparator.<Class9343>comparingDouble(var1x -> var1x.method35355().distanceSq(var1)).thenComparingInt(var0 -> var0.method35355().getY()))
         .filter(var1x -> this.field19668.getBlockState(var1x.method35355()).hasProperty(BlockStateProperties.field39712))
         .findFirst();
      return var7.<TeleportationRepositioner>map(
         var1x -> {
            BlockPos var4 = var1x.method35355();
            this.field19668.getChunkProvider().registerTicket(TicketType.PORTAL, new ChunkPos(var4), 3, var4);
            BlockState var5x = this.field19668.getBlockState(var4);
            return Class7215.method22658(
               var4, var5x.<Direction.Axis>get(BlockStateProperties.field39712), 21, Direction.Axis.Y, 21, var2x -> this.field19668.getBlockState(var2x) == var5x
            );
         }
      );
   }

   public Optional<TeleportationRepositioner> method12332(BlockPos var1, Direction.Axis var2) {
      Direction var5 = Direction.getFacingFromAxis(Direction.AxisDirection.POSITIVE, var2);
      double var6 = -1.0;
      BlockPos var8 = null;
      double var9 = -1.0;
      BlockPos var11 = null;
      WorldBorder var12 = this.field19668.getWorldBorder();
      int var13 = this.field19668.method6998() - 1;
      BlockPos.Mutable var14 = var1.method8354();

      for (BlockPos.Mutable var16 : BlockPos.method8365(var1, 16, Direction.EAST, Direction.SOUTH)) {
         int var17 = Math.min(var13, this.field19668.method6736(Heightmap.Type.MOTION_BLOCKING, var16.getX(), var16.getZ()));
         boolean var18 = true;
         if (var12.contains(var16) && var12.contains(var16.method8380(var5, 1))) {
            var16.method8380(var5.getOpposite(), 1);

            for (int var19 = var17; var19 >= 0; var19--) {
               var16.method8308(var19);
               if (this.field19668.method7007(var16)) {
                  int var20 = var19;

                  while (var19 > 0 && this.field19668.method7007(var16.method8379(Direction.DOWN))) {
                     var19--;
                  }

                  if (var19 + 4 <= var13) {
                     int var21 = var20 - var19;
                     if (var21 <= 0 || var21 >= 3) {
                        var16.method8308(var19);
                        if (this.method12333(var16, var14, var5, 0)) {
                           double var22 = var1.distanceSq(var16);
                           if (this.method12333(var16, var14, var5, -1) && this.method12333(var16, var14, var5, 1) && (var6 == -1.0 || var6 > var22)) {
                              var6 = var22;
                              var8 = var16.toImmutable();
                           }

                           if (var6 == -1.0 && (var9 == -1.0 || var9 > var22)) {
                              var9 = var22;
                              var11 = var16.toImmutable();
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 == -1.0 && var9 != -1.0) {
         var8 = var11;
         var6 = var9;
      }

      if (var6 == -1.0) {
         var8 = new BlockPos(var1.getX(), MathHelper.clamp(var1.getY(), 70, this.field19668.method6998() - 10), var1.getZ())
            .toImmutable();
         Direction var24 = var5.rotateY();
         if (!var12.contains(var8)) {
            return Optional.<TeleportationRepositioner>empty();
         }

         for (int var27 = -1; var27 < 2; var27++) {
            for (int var30 = 0; var30 < 2; var30++) {
               for (int var32 = -1; var32 < 3; var32++) {
                  BlockState var33 = var32 >= 0 ? Blocks.AIR.getDefaultState() : Blocks.field36527.getDefaultState();
                  var14.method8378(var8, var30 * var5.getXOffset() + var27 * var24.getXOffset(), var32, var30 * var5.getZOffset() + var27 * var24.getZOffset());
                  this.field19668.setBlockState(var14, var33);
               }
            }
         }
      }

      for (int var25 = -1; var25 < 3; var25++) {
         for (int var28 = -1; var28 < 4; var28++) {
            if (var25 == -1 || var25 == 2 || var28 == -1 || var28 == 3) {
               var14.method8378(var8, var25 * var5.getXOffset(), var28, var25 * var5.getZOffset());
               this.field19668.setBlockState(var14, Blocks.field36527.getDefaultState(), 3);
            }
         }
      }

      BlockState var26 = Blocks.field36588.getDefaultState().with(Class3401.field19060, var2);

      for (int var29 = 0; var29 < 2; var29++) {
         for (int var31 = 0; var31 < 3; var31++) {
            var14.method8378(var8, var29 * var5.getXOffset(), var31, var29 * var5.getZOffset());
            this.field19668.setBlockState(var14, var26, 18);
         }
      }

      return Optional.<TeleportationRepositioner>of(new TeleportationRepositioner(var8.toImmutable(), 2, 3));
   }

   private boolean method12333(BlockPos var1, BlockPos.Mutable var2, Direction var3, int var4) {
      Direction var7 = var3.rotateY();

      for (int var8 = -1; var8 < 3; var8++) {
         for (int var9 = -1; var9 < 4; var9++) {
            var2.method8378(var1, var3.getXOffset() * var8 + var7.getXOffset() * var4, var9, var3.getZOffset() * var8 + var7.getZOffset() * var4);
            if (var9 < 0 && !this.field19668.getBlockState(var2).getMaterial().isSolid()) {
               return false;
            }

            if (var9 >= 0 && !this.field19668.method7007(var2)) {
               return false;
            }
         }
      }

      return true;
   }
}
