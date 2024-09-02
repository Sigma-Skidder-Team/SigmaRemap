package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import org.apache.commons.lang3.mutable.MutableInt;

public final class Class212 extends Class200<Class7587, Class210> {
   private static final Direction[] field795 = Direction.values();
   private static final Direction[] field796 = new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};

   public Class212(Class1704 var1) {
      super(var1, Class1977.field12881, new Class210(var1));
   }

   @Override
   public int method655(long var1, long var3, int var5) {
      if (var3 != Long.MAX_VALUE) {
         if (var1 == Long.MAX_VALUE) {
            if (!this.field748.method723(var3)) {
               return 15;
            }

            var5 = 0;
         }

         if (var5 < 15) {
            MutableInt var8 = new MutableInt();
            BlockState var9 = this.method647(var3, var8);
            if (var8.getValue() >= 15) {
               return 15;
            } else {
               int var10 = BlockPos.method8328(var1);
               int var11 = BlockPos.method8329(var1);
               int var12 = BlockPos.method8330(var1);
               int var13 = BlockPos.method8328(var3);
               int var14 = BlockPos.method8329(var3);
               int var15 = BlockPos.method8330(var3);
               boolean var16 = var10 == var13 && var12 == var15;
               int var17 = Integer.signum(var13 - var10);
               int var18 = Integer.signum(var14 - var11);
               int var19 = Integer.signum(var15 - var12);
               Direction var20;
               if (var1 != Long.MAX_VALUE) {
                  var20 = Direction.method548(var17, var18, var19);
               } else {
                  var20 = Direction.DOWN;
               }

               BlockState var21 = this.method647(var1, (MutableInt)null);
               if (var20 == null) {
                  VoxelShape var22 = this.method648(var21, var1, Direction.DOWN);
                  if (VoxelShapes.method27444(var22, VoxelShapes.method27425())) {
                     return 15;
                  }

                  int var23 = !var16 ? 0 : -1;
                  Direction var24 = Direction.method548(var17, var23, var19);
                  if (var24 == null) {
                     return 15;
                  }

                  VoxelShape var25 = this.method648(var9, var3, var24.method536());
                  if (VoxelShapes.method27444(VoxelShapes.method27425(), var25)) {
                     return 15;
                  }
               } else {
                  VoxelShape var26 = this.method648(var21, var1, var20);
                  VoxelShape var28 = this.method648(var9, var3, var20.method536());
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
     /* 我也不知道 long var7 = Class2002.method8419(var1);
      int var9 = BlockPos.method8329(var1);
      int var10 = Class2002.method8397(var9);
      int var11 = Class2002.method8396(var9);
      int var13;
      if (var10 == 0) {
         int var12 = 0;

         while (!this.field748.method698(Class2002.method8395(var7, 0, -var12 - 1, 0)) && this.field748.method722(var11 - var12 - 1)) {
            var12++;
         }

         var13 = var12;
      } else {
         var13 = 0;
      }

      long var14 = BlockPos.method8327(var1, 0, -1 - var13 * 16, 0);
      long var16 = Class2002.method8419(var14);
      if (var7 == var16 || this.field748.method698(var16)) {
         this.method674(var1, var14, var3, var4);
      }

      long var18 = BlockPos.method8314(var1, Direction.field673);
      long var20 = Class2002.method8419(var18);
      if (var7 == var20 || this.field748.method698(var20)) {
         this.method674(var1, var18, var3, var4);
      }

      for (Direction var25 : field796) {
         int var26 = 0;

         do {
            long var27 = BlockPos.method8327(var1, var25.method539(), -var26, var25.method541());
            long var29 = Class2002.method8419(var27);
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
   public int method651(long var1, long var3, int var5) {
      int var8 = var5;
      if (Long.MAX_VALUE != var3) {
         int var15 = this.method655(Long.MAX_VALUE, var1, 0);
         if (var5 > var15) {
            var8 = var15;
         }

         if (var8 == 0) {
            return var8;
         }
      }

      long var9 = Class2002.method8419(var1);
      Class6785 var11 = this.field748.method699(var9, true);

      for (Direction var16 : field795) {
         long var17 = BlockPos.method8314(var1, var16);
         long var19 = Class2002.method8419(var17);
         Class6785 var21;
         if (var9 != var19) {
            var21 = this.field748.method699(var19, true);
         } else {
            var21 = var11;
         }

         if (var21 != null) {
            if (var17 != var3) {
               int var25 = this.method655(var17, var1, this.method653(var21, var17));
               if (var8 > var25) {
                  var8 = var25;
               }

               if (var8 == 0) {
                  return var8;
               }
            }
         } else if (var16 != Direction.DOWN) {
            for (var17 = BlockPos.method8334(var17);
               !this.field748.method698(var19) && !this.field748.method724(var19);
               var17 = BlockPos.method8327(var17, 0, 16, 0)
            ) {
               var19 = Class2002.method8394(var19, Direction.field673);
            }

            Class6785 var22 = this.field748.method699(var19, true);
            if (var17 != var3) {
               int var23;
               if (var22 == null) {
                  var23 = !this.field748.method725(var19) ? 15 : 0;
               } else {
                  var23 = this.method655(var17, var1, this.method653(var22, var17));
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
   public void method644(long var1) {
      this.field748.method716();
      long var5 = Class2002.method8419(var1);
      if (!this.field748.method698(var5)) {
         for (var1 = BlockPos.method8334(var1); !this.field748.method698(var5) && !this.field748.method724(var5); var1 = BlockPos.method8327(var1, 0, 16, 0)) {
            var5 = Class2002.method8394(var5, Direction.field673);
         }

         if (this.field748.method698(var5)) {
            super.method644(var1);
         }
      } else {
         super.method644(var1);
      }
   }

   @Override
   public String method659(long var1) {
      return super.method659(var1) + (!this.field748.method724(var1) ? "" : "*");
   }
}
