package mapped;

import java.util.Random;

public class Class3211 extends Block {
   private static String[] field18618;
   public static final Class8554 field18619 = Class8820.field39741;
   private final Class3393 field18620;

   public Class3211(Class3393 var1, AbstractBlock var2) {
      super(var2);
      this.field18620 = var1;
      this.method11578(this.field18612.method35393().method23465(field18619, Integer.valueOf(0)));
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.<Integer>method23463(field18619) < 5;
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.up();
      if (var2.method7007(var7) && var7.getY() < 256) {
         int var8 = var1.<Integer>method23463(field18619);
         if (var8 < 5) {
            boolean var9 = false;
            boolean var10 = false;
            BlockState var11 = var2.getBlockState(var3.down());
            Block var12 = var11.getBlock();
            if (var12 == Blocks.field36651) {
               var9 = true;
            } else if (var12 != this.field18620) {
               if (var11.isAir()) {
                  var9 = true;
               }
            } else {
               int var13 = 1;

               for (int var14 = 0; var14 < 4; var14++) {
                  Block var15 = var2.getBlockState(var3.method8340(var13 + 1)).getBlock();
                  if (var15 != this.field18620) {
                     if (var15 == Blocks.field36651) {
                        var10 = true;
                     }
                     break;
                  }

                  var13++;
               }

               if (var13 < 2 || var13 <= var4.nextInt(!var10 ? 4 : 5)) {
                  var9 = true;
               }
            }

            if (var9 && method11592(var2, var7, (Direction)null) && var2.method7007(var3.method8339(2))) {
               var2.setBlockState(var3, this.field18620.method12004(var2, var3), 2);
               this.method11590(var2, var7, var8);
            } else if (var8 >= 4) {
               this.method11591(var2, var3);
            } else {
               int var18 = var4.nextInt(4);
               if (var10) {
                  var18++;
               }

               boolean var19 = false;

               for (int var20 = 0; var20 < var18; var20++) {
                  Direction var16 = Class76.field161.method247(var4);
                  BlockPos var17 = var3.method8349(var16);
                  if (var2.method7007(var17) && var2.method7007(var17.down()) && method11592(var2, var17, var16.method536())) {
                     this.method11590(var2, var17, var8 + 1);
                     var19 = true;
                  }
               }

               if (!var19) {
                  this.method11591(var2, var3);
               } else {
                  var2.setBlockState(var3, this.field18620.method12004(var2, var3), 2);
               }
            }
         }
      }
   }

   private void method11590(World var1, BlockPos var2, int var3) {
      var1.setBlockState(var2, this.method11579().method23465(field18619, Integer.valueOf(var3)), 2);
      var1.playEvent(1033, var2, 0);
   }

   private void method11591(World var1, BlockPos var2) {
      var1.setBlockState(var2, this.method11579().method23465(field18619, Integer.valueOf(5)), 2);
      var1.playEvent(1034, var2, 0);
   }

   private static boolean method11592(Class1662 var0, BlockPos var1, Direction var2) {
      for (Direction var6 : Class76.field161) {
         if (var6 != var2 && !var0.method7007(var1.method8349(var6))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 != Direction.field673 && !var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.down());
      if (var6.getBlock() != this.field18620 && !var6.method23448(Blocks.field36651)) {
         if (var6.isAir()) {
            boolean var7 = false;

            for (Direction var9 : Class76.field161) {
               BlockState var10 = var2.getBlockState(var3.method8349(var9));
               if (!var10.method23448(this.field18620)) {
                  if (!var10.isAir()) {
                     return false;
                  }
               } else {
                  if (var7) {
                     return false;
                  }

                  var7 = true;
               }
            }

            return var7;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18619);
   }

   public static void method11593(Class1660 var0, BlockPos var1, Random var2, int var3) {
      var0.setBlockState(var1, ((Class3393) Blocks.field36878).method12004(var0, var1), 2);
      method11594(var0, var1, var2, var1, var3, 0);
   }

   private static void method11594(Class1660 var0, BlockPos var1, Random var2, BlockPos var3, int var4, int var5) {
      Class3393 var8 = (Class3393) Blocks.field36878;
      int var9 = var2.nextInt(4) + 1;
      if (var5 == 0) {
         var9++;
      }

      for (int var10 = 0; var10 < var9; var10++) {
         BlockPos var11 = var1.method8339(var10 + 1);
         if (!method11592(var0, var11, (Direction)null)) {
            return;
         }

         var0.setBlockState(var11, var8.method12004(var0, var11), 2);
         var0.setBlockState(var11.down(), var8.method12004(var0, var11.down()), 2);
      }

      boolean var15 = false;
      if (var5 < 4) {
         int var16 = var2.nextInt(4);
         if (var5 == 0) {
            var16++;
         }

         for (int var12 = 0; var12 < var16; var12++) {
            Direction var13 = Class76.field161.method247(var2);
            BlockPos var14 = var1.method8339(var9).method8349(var13);
            if (Math.abs(var14.getX() - var3.getX()) < var4
               && Math.abs(var14.getZ() - var3.getZ()) < var4
               && var0.method7007(var14)
               && var0.method7007(var14.down())
               && method11592(var0, var14, var13.method536())) {
               var15 = true;
               var0.setBlockState(var14, var8.method12004(var0, var14), 2);
               var0.setBlockState(var14.method8349(var13.method536()), var8.method12004(var0, var14.method8349(var13.method536())), 2);
               method11594(var0, var14, var2, var3, var4, var5 + 1);
            }
         }
      }

      if (!var15) {
         var0.setBlockState(var1.method8339(var9), Blocks.field36879.method11579().method23465(field18619, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, Class882 var4) {
      if (var4.getType().method33228(Class8613.field38738)) {
         BlockPos var7 = var3.getPos();
         var1.method7180(var7, true, var4);
      }
   }
}
