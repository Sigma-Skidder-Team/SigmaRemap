package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;

public class Class4191 extends Class4188 {
   private final boolean field20483;
   private final boolean field20484;
   private boolean field20485;
   private final int field20486;

   public Class4191(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33425, var2);
      this.field20483 = var2.getBoolean("hr");
      this.field20484 = var2.getBoolean("sc");
      this.field20485 = var2.getBoolean("hps");
      this.field20486 = var2.method122("Num");
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putBoolean("hr", this.field20483);
      var1.putBoolean("sc", this.field20484);
      var1.putBoolean("hps", this.field20485);
      var1.method102("Num", this.field20486);
   }

   public Class4191(int var1, Random var2, Class9764 var3, Direction var4, Class102 var5) {
      super(Class7792.field33425, var1, var5);
      this.method12939(var4);
      this.field20444 = var3;
      this.field20483 = var2.nextInt(3) == 0;
      this.field20484 = !this.field20483 && var2.nextInt(23) == 0;
      if (this.method12938().method544() != Class113.field415) {
         this.field20486 = var3.method38398() / 5;
      } else {
         this.field20486 = var3.method38400() / 5;
      }
   }

   public static Class9764 method12972(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5) {
      Class9764 var8 = new Class9764(var2, var3, var4, var2, var3 + 3 - 1, var4);

      int var9;
      for (var9 = var1.nextInt(3) + 2; var9 > 0; var9--) {
         int var10 = var9 * 5;
         switch (Class7441.field32015[var5.ordinal()]) {
            case 1:
            default:
               var8.field45681 = var2 + 3 - 1;
               var8.field45680 = var4 - (var10 - 1);
               break;
            case 2:
               var8.field45681 = var2 + 3 - 1;
               var8.field45683 = var4 + var10 - 1;
               break;
            case 3:
               var8.field45678 = var2 - (var10 - 1);
               var8.field45683 = var4 + 3 - 1;
               break;
            case 4:
               var8.field45681 = var2 + var10 - 1;
               var8.field45683 = var4 + 3 - 1;
         }

         if (Class4178.method12918(var0, var8) == null) {
            break;
         }
      }

      return var9 > 0 ? var8 : null;
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      int var6 = this.method12916();
      int var7 = var3.nextInt(4);
      Direction var8 = this.method12938();
      if (var8 != null) {
         switch (Class7441.field32015[var8.ordinal()]) {
            case 1:
            default:
               if (var7 <= 1) {
                  Class6883.method20959(
                     var1, var2, var3, this.field20444.field45678, this.field20444.field45679 - 1 + var3.nextInt(3), this.field20444.field45680 - 1, var8, var6
                  );
               } else if (var7 == 2) {
                  Class6883.method20959(
                     var1,
                     var2,
                     var3,
                     this.field20444.field45678 - 1,
                     this.field20444.field45679 - 1 + var3.nextInt(3),
                     this.field20444.field45680,
                     Direction.WEST,
                     var6
                  );
               } else {
                  Class6883.method20959(
                     var1,
                     var2,
                     var3,
                     this.field20444.field45681 + 1,
                     this.field20444.field45679 - 1 + var3.nextInt(3),
                     this.field20444.field45680,
                     Direction.EAST,
                     var6
                  );
               }
               break;
            case 2:
               if (var7 <= 1) {
                  Class6883.method20959(
                     var1, var2, var3, this.field20444.field45678, this.field20444.field45679 - 1 + var3.nextInt(3), this.field20444.field45683 + 1, var8, var6
                  );
               } else if (var7 == 2) {
                  Class6883.method20959(
                     var1,
                     var2,
                     var3,
                     this.field20444.field45678 - 1,
                     this.field20444.field45679 - 1 + var3.nextInt(3),
                     this.field20444.field45683 - 3,
                     Direction.WEST,
                     var6
                  );
               } else {
                  Class6883.method20959(
                     var1,
                     var2,
                     var3,
                     this.field20444.field45681 + 1,
                     this.field20444.field45679 - 1 + var3.nextInt(3),
                     this.field20444.field45683 - 3,
                     Direction.EAST,
                     var6
                  );
               }
               break;
            case 3:
               if (var7 <= 1) {
                  Class6883.method20959(
                     var1, var2, var3, this.field20444.field45678 - 1, this.field20444.field45679 - 1 + var3.nextInt(3), this.field20444.field45680, var8, var6
                  );
               } else if (var7 == 2) {
                  Class6883.method20959(
                     var1,
                     var2,
                     var3,
                     this.field20444.field45678,
                     this.field20444.field45679 - 1 + var3.nextInt(3),
                     this.field20444.field45680 - 1,
                     Direction.NORTH,
                     var6
                  );
               } else {
                  Class6883.method20959(
                     var1,
                     var2,
                     var3,
                     this.field20444.field45678,
                     this.field20444.field45679 - 1 + var3.nextInt(3),
                     this.field20444.field45683 + 1,
                     Direction.SOUTH,
                     var6
                  );
               }
               break;
            case 4:
               if (var7 <= 1) {
                  Class6883.method20959(
                     var1, var2, var3, this.field20444.field45681 + 1, this.field20444.field45679 - 1 + var3.nextInt(3), this.field20444.field45680, var8, var6
                  );
               } else if (var7 == 2) {
                  Class6883.method20959(
                     var1,
                     var2,
                     var3,
                     this.field20444.field45681 - 3,
                     this.field20444.field45679 - 1 + var3.nextInt(3),
                     this.field20444.field45680 - 1,
                     Direction.NORTH,
                     var6
                  );
               } else {
                  Class6883.method20959(
                     var1,
                     var2,
                     var3,
                     this.field20444.field45681 - 3,
                     this.field20444.field45679 - 1 + var3.nextInt(3),
                     this.field20444.field45683 + 1,
                     Direction.SOUTH,
                     var6
                  );
               }
         }
      }

      if (var6 < 8) {
         if (var8 != Direction.NORTH && var8 != Direction.SOUTH) {
            for (int var11 = this.field20444.field45678 + 3; var11 + 3 <= this.field20444.field45681; var11 += 5) {
               int var12 = var3.nextInt(5);
               if (var12 == 0) {
                  Class6883.method20959(var1, var2, var3, var11, this.field20444.field45679, this.field20444.field45680 - 1, Direction.NORTH, var6 + 1);
               } else if (var12 == 1) {
                  Class6883.method20959(var1, var2, var3, var11, this.field20444.field45679, this.field20444.field45683 + 1, Direction.SOUTH, var6 + 1);
               }
            }
         } else {
            for (int var9 = this.field20444.field45680 + 3; var9 + 3 <= this.field20444.field45683; var9 += 5) {
               int var10 = var3.nextInt(5);
               if (var10 == 0) {
                  Class6883.method20959(var1, var2, var3, this.field20444.field45678 - 1, this.field20444.field45679, var9, Direction.WEST, var6 + 1);
               } else if (var10 == 1) {
                  Class6883.method20959(var1, var2, var3, this.field20444.field45681 + 1, this.field20444.field45679, var9, Direction.EAST, var6 + 1);
               }
            }
         }
      }
   }

   @Override
   public boolean method12933(ISeedReader var1, Class9764 var2, Random var3, int var4, int var5, int var6, ResourceLocation var7) {
      BlockPos var10 = new BlockPos(this.method12920(var4, var6), this.method12921(var5), this.method12922(var4, var6));
      if (var2.method38396(var10) && var1.getBlockState(var10).isAir() && !var1.getBlockState(var10.down()).isAir()) {
         BlockState var11 = Blocks.RAIL.method11579().method23465(Class3430.field19191, !var3.nextBoolean() ? Class96.field248 : Class96.field247);
         this.method12923(var1, var11, var4, var5, var6, var2);
         Class991 var12 = new Class991(var1.method6970(), (double)var10.getX() + 0.5, (double)var10.getY() + 0.5, (double)var10.getZ() + 0.5);
         var12.method3626(var7, var3.nextLong());
         var1.method6916(var12);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      if (this.method12919(var1, var5)) {
         return false;
      } else {
         int var14 = this.field20486 * 5 - 1;
         BlockState var15 = this.method12967();
         this.method12927(var1, var5, 0, 0, 0, 2, 1, var14, field20443, field20443, false);
         this.method12929(var1, var5, var4, 0.8F, 0, 2, 0, 2, 2, var14, field20443, field20443, false, false);
         if (this.field20484) {
            this.method12929(var1, var5, var4, 0.6F, 0, 0, 0, 2, 1, var14, Blocks.COBWEB.method11579(), field20443, false, true);
         }

         for (int var16 = 0; var16 < this.field20486; var16++) {
            int var17 = 2 + var16 * 5;
            this.method12973(var1, var5, 0, 0, var17, 2, 2, var4);
            this.method12974(var1, var5, var4, 0.1F, 0, 2, var17 - 1);
            this.method12974(var1, var5, var4, 0.1F, 2, 2, var17 - 1);
            this.method12974(var1, var5, var4, 0.1F, 0, 2, var17 + 1);
            this.method12974(var1, var5, var4, 0.1F, 2, 2, var17 + 1);
            this.method12974(var1, var5, var4, 0.05F, 0, 2, var17 - 2);
            this.method12974(var1, var5, var4, 0.05F, 2, 2, var17 - 2);
            this.method12974(var1, var5, var4, 0.05F, 0, 2, var17 + 2);
            this.method12974(var1, var5, var4, 0.05F, 2, 2, var17 + 2);
            if (var4.nextInt(100) == 0) {
               this.method12933(var1, var5, var4, 2, 0, var17 - 1, Class8793.field39553);
            }

            if (var4.nextInt(100) == 0) {
               this.method12933(var1, var5, var4, 0, 0, var17 + 1, Class8793.field39553);
            }

            if (this.field20484 && !this.field20485) {
               int var18 = this.method12921(0);
               int var19 = var17 - 1 + var4.nextInt(3);
               int var20 = this.method12920(1, var19);
               int var21 = this.method12922(1, var19);
               BlockPos var22 = new BlockPos(var20, var18, var21);
               if (var5.method38396(var22) && this.method12925(var1, 1, 0, var19, var5)) {
                  this.field20485 = true;
                  var1.setBlockState(var22, Blocks.field36532.method11579(), 2);
                  TileEntity var23 = var1.getTileEntity(var22);
                  if (var23 instanceof Class960) {
                     ((Class960)var23).method3911().method24790(EntityType.field41013);
                  }
               }
            }
         }

         for (int var24 = 0; var24 <= 2; var24++) {
            for (int var26 = 0; var26 <= var14; var26++) {
               byte var28 = -1;
               BlockState var30 = this.method12924(var1, var24, -1, var26, var5);
               if (var30.isAir() && this.method12925(var1, var24, -1, var26, var5)) {
                  byte var32 = -1;
                  this.method12923(var1, var15, var24, -1, var26, var5);
               }
            }
         }

         if (this.field20483) {
            BlockState var25 = Blocks.RAIL.method11579().method23465(Class3430.field19191, Class96.field247);

            for (int var27 = 0; var27 <= var14; var27++) {
               BlockState var29 = this.method12924(var1, 1, -1, var27, var5);
               if (!var29.isAir() && var29.method23409(var1, new BlockPos(this.method12920(1, var27), this.method12921(-1), this.method12922(1, var27)))
                  )
                {
                  float var31 = !this.method12925(var1, 1, 0, var27, var5) ? 0.9F : 0.7F;
                  this.method12930(var1, var5, var4, var31, 1, 0, var27, var25);
               }
            }
         }

         return true;
      }
   }

   private void method12973(ISeedReader var1, Class9764 var2, int var3, int var4, int var5, int var6, int var7, Random var8) {
      if (this.method12969(var1, var2, var3, var7, var6, var5)) {
         BlockState var11 = this.method12967();
         BlockState var12 = this.method12968();
         this.method12927(var1, var2, var3, var4, var5, var3, var6 - 1, var5, var12.method23465(Class3239.field18683, Boolean.valueOf(true)), field20443, false);
         this.method12927(var1, var2, var7, var4, var5, var7, var6 - 1, var5, var12.method23465(Class3239.field18681, Boolean.valueOf(true)), field20443, false);
         if (var8.nextInt(4) != 0) {
            this.method12927(var1, var2, var3, var6, var5, var7, var6, var5, var11, field20443, false);
            this.method12930(
               var1, var2, var8, 0.05F, var3 + 1, var6, var5 - 1, Blocks.WALL_TORCH.method11579().method23465(Class3382.field18985, Direction.NORTH)
            );
            this.method12930(
               var1, var2, var8, 0.05F, var3 + 1, var6, var5 + 1, Blocks.WALL_TORCH.method11579().method23465(Class3382.field18985, Direction.SOUTH)
            );
         } else {
            this.method12927(var1, var2, var3, var6, var5, var3, var6, var5, var11, field20443, false);
            this.method12927(var1, var2, var7, var6, var5, var7, var6, var5, var11, field20443, false);
         }
      }
   }

   private void method12974(ISeedReader var1, Class9764 var2, Random var3, float var4, int var5, int var6, int var7) {
      if (this.method12925(var1, var5, var6, var7, var2)) {
         this.method12930(var1, var2, var3, var4, var5, var6, var7, Blocks.COBWEB.method11579());
      }
   }
}
