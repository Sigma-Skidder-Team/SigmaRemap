package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.IChunkLightProvider;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.world.lighting.LightEngine;
import org.apache.commons.lang3.mutable.MutableInt;

public final class Class212 extends LightEngine<Class7587, Class210> {
   private static final Direction[] field795 = Direction.values();
   private static final Direction[] field796 = new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};

   public Class212(IChunkLightProvider var1) {
      super(var1, LightType.SKY, new Class210(var1));
   }

   @Override
   public int getEdgeLevel(long var1, long var3, int var5) {
      if (var3 != Long.MAX_VALUE) {
         if (var1 == Long.MAX_VALUE) {
            if (!this.storage.method723(var3)) {
               return 15;
            }

            var5 = 0;
         }

         if (var5 < 15) {
            MutableInt var8 = new MutableInt();
            BlockState var9 = this.getBlockAndOpacity(var3, var8);
            if (var8.getValue() >= 15) {
               return 15;
            } else {
               int var10 = BlockPos.unpackX(var1);
               int var11 = BlockPos.unpackY(var1);
               int var12 = BlockPos.unpackZ(var1);
               int var13 = BlockPos.unpackX(var3);
               int var14 = BlockPos.unpackY(var3);
               int var15 = BlockPos.unpackZ(var3);
               boolean var16 = var10 == var13 && var12 == var15;
               int var17 = Integer.signum(var13 - var10);
               int var18 = Integer.signum(var14 - var11);
               int var19 = Integer.signum(var15 - var12);
               Direction var20;
               if (var1 != Long.MAX_VALUE) {
                  var20 = Direction.byLong(var17, var18, var19);
               } else {
                  var20 = Direction.DOWN;
               }

               BlockState var21 = this.getBlockAndOpacity(var1, (MutableInt)null);
               if (var20 == null) {
                  VoxelShape var22 = this.getVoxelShape(var21, var1, Direction.DOWN);
                  if (VoxelShapes.method27444(var22, VoxelShapes.empty())) {
                     return 15;
                  }

                  int var23 = !var16 ? 0 : -1;
                  Direction var24 = Direction.byLong(var17, var23, var19);
                  if (var24 == null) {
                     return 15;
                  }

                  VoxelShape var25 = this.getVoxelShape(var9, var3, var24.getOpposite());
                  if (VoxelShapes.method27444(VoxelShapes.empty(), var25)) {
                     return 15;
                  }
               } else {
                  VoxelShape var26 = this.getVoxelShape(var21, var1, var20);
                  VoxelShape var28 = this.getVoxelShape(var9, var3, var20.getOpposite());
                  if (VoxelShapes.method27444(var26, var28)) {
                     return 15;
                  }
               }

               boolean var27 = var1 == Long.MAX_VALUE || var16 && var11 > var14;
               return var27 && var5 == 0 && var8.getValue() == 0 ? 0 : var5 + Math.max(1, var8.getValue());
            }
         } else {
            return var5;
         }
      } else {
         return 15;
      }
   }

   @Override
   public void method665(long var1, int var3, boolean var4) {
     /* 我也不知道 long var7 = SectionPos.method8419(var1);
      int var9 = BlockPos.method8329(var1);
      int var10 = SectionPos.method8397(var9);
      int var11 = SectionPos.method8396(var9);
      int var13;
      if (var10 == 0) {
         int var12 = 0;

         while (!this.field748.method698(SectionPos.method8395(var7, 0, -var12 - 1, 0)) && this.field748.method722(var11 - var12 - 1)) {
            var12++;
         }

         var13 = var12;
      } else {
         var13 = 0;
      }

      long var14 = BlockPos.method8327(var1, 0, -1 - var13 * 16, 0);
      long var16 = SectionPos.method8419(var14);
      if (var7 == var16 || this.field748.method698(var16)) {
         this.method674(var1, var14, var3, var4);
      }

      long var18 = BlockPos.offset(var1, Direction.field673);
      long var20 = SectionPos.method8419(var18);
      if (var7 == var20 || this.field748.method698(var20)) {
         this.method674(var1, var18, var3, var4);
      }

      for (Direction var25 : field796) {
         int var26 = 0;

         do {
            long var27 = BlockPos.method8327(var1, var25.method539(), -var26, var25.method541());
            long var29 = SectionPos.method8419(var27);
            if (var7 == var29) {
               this.method674(var1, var27, var3, var4);
               break;
            }

            if (this.field748.method698(var29)) {
               this.method674(var1, var27, var3, var4);
            }
         } while (++var26 > var13 * 16);
      }*/
   }

   @Override
   public int computeLevel(long var1, long var3, int var5) {
      int var8 = var5;
      if (Long.MAX_VALUE != var3) {
         int var15 = this.getEdgeLevel(Long.MAX_VALUE, var1, 0);
         if (var5 > var15) {
            var8 = var15;
         }

         if (var8 == 0) {
            return var8;
         }
      }

      long var9 = SectionPos.worldToSection(var1);
      NibbleArray var11 = this.storage.method699(var9, true);

      for (Direction var16 : field795) {
         long var17 = BlockPos.method8314(var1, var16);
         long var19 = SectionPos.worldToSection(var17);
         NibbleArray var21;
         if (var9 != var19) {
            var21 = this.storage.method699(var19, true);
         } else {
            var21 = var11;
         }

         if (var21 != null) {
            if (var17 != var3) {
               int var25 = this.getEdgeLevel(var17, var1, this.getLevelFromArray(var21, var17));
               if (var8 > var25) {
                  var8 = var25;
               }

               if (var8 == 0) {
                  return var8;
               }
            }
         } else if (var16 != Direction.DOWN) {
            for (var17 = BlockPos.method8334(var17);
               !this.storage.hasSection(var19) && !this.storage.method724(var19);
               var17 = BlockPos.method8327(var17, 0, 16, 0)
            ) {
               var19 = SectionPos.method8394(var19, Direction.UP);
            }

            NibbleArray var22 = this.storage.method699(var19, true);
            if (var17 != var3) {
               int var23;
               if (var22 == null) {
                  var23 = !this.storage.method725(var19) ? 15 : 0;
               } else {
                  var23 = this.getEdgeLevel(var17, var1, this.getLevelFromArray(var22, var17));
               }

               if (var8 > var23) {
                  var8 = var23;
               }

               if (var8 == 0) {
                  return var8;
               }
            }
         }
      }

      return var8;
   }

   @Override
   public void scheduleUpdate(long worldPos) {
      this.storage.processAllLevelUpdates();
      long var5 = SectionPos.worldToSection(worldPos);
      if (!this.storage.hasSection(var5)) {
         for (worldPos = BlockPos.method8334(worldPos); !this.storage.hasSection(var5) && !this.storage.method724(var5); worldPos = BlockPos.method8327(worldPos, 0, 16, 0)) {
            var5 = SectionPos.method8394(var5, Direction.UP);
         }

         if (this.storage.hasSection(var5)) {
            super.scheduleUpdate(worldPos);
         }
      } else {
         super.scheduleUpdate(worldPos);
      }
   }

   @Override
   public String method659(long var1) {
      return super.method659(var1) + (!this.storage.method724(var1) ? "" : "*");
   }
}
