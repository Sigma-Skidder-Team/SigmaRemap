package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class9215 {
   private final Class8761 field42405;
   private final Random field42406;
   private int field42407;
   private int field42408;

   public Class9215(Class8761 var1, Random var2) {
      this.field42405 = var1;
      this.field42406 = var2;
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method34521(BlockPos var1, Class80 var2, List<Class4187> var3, Class9467 var4) {
      Class7085 var7 = new Class7085();
      var7.field30487 = var1;
      var7.field30486 = var2;
      var7.field30488 = "wall_flat";
      Class7085 var8 = new Class7085();
      this.method34524(var3, var7);
      var8.field30487 = var7.field30487.method8339(8);
      var8.field30486 = var7.field30486;
      var8.field30488 = "wall_window";
      if (var3.isEmpty()) {
      }

      Class8390 var9 = Class9467.method36505(var4);
      Class8390 var10 = Class9467.method36506(var4);
      this.field42407 = Class9467.method36507(var4) + 1;
      this.field42408 = Class9467.method36508(var4) + 1;
      int var11 = Class9467.method36507(var4) + 1;
      int var12 = Class9467.method36508(var4);
      this.method34522(var3, var7, var9, Direction.SOUTH, this.field42407, this.field42408, var11, var12);
      this.method34522(var3, var8, var9, Direction.SOUTH, this.field42407, this.field42408, var11, var12);
      Class7085 var13 = new Class7085();
      var13.field30487 = var7.field30487.method8339(19);
      var13.field30486 = var7.field30486;
      var13.field30488 = "wall_window";
      boolean var14 = false;

      for (int var15 = 0; var15 < Class8390.method29410(var10) && !var14; var15++) {
         for (int var16 = Class8390.method29409(var10) - 1; var16 >= 0 && !var14; var16--) {
            if (Class9467.method36498(var10, var16, var15)) {
               var13.field30487 = var13.field30487.method8350(var2.method252(Direction.SOUTH), 8 + (var15 - this.field42408) * 8);
               var13.field30487 = var13.field30487.method8350(var2.method252(Direction.EAST), (var16 - this.field42407) * 8);
               this.method34525(var3, var13);
               this.method34522(var3, var13, var10, Direction.SOUTH, var16, var15, var16, var15);
               var14 = true;
            }
         }
      }

      this.method34523(var3, var1.method8339(16), var2, var9, var10);
      this.method34523(var3, var1.method8339(27), var2, var10, (Class8390)null);
      if (var3.isEmpty()) {
      }

      Class6025[] var35 = new Class6025[]{new Class6026(), new Class6024(), new Class6023()};

      for (int var36 = 0; var36 < 3; var36++) {
         BlockPos var17 = var1.method8339(8 * var36 + (var36 != 2 ? 0 : 3));
         Class8390 var18 = Class9467.method36509(var4)[var36];
         Class8390 var19 = var36 != 2 ? var9 : var10;
         String var20 = var36 != 0 ? "carpet_south_2" : "carpet_south_1";
         String var21 = var36 != 0 ? "carpet_west_2" : "carpet_west_1";

         for (int var22 = 0; var22 < Class8390.method29410(var19); var22++) {
            for (int var23 = 0; var23 < Class8390.method29409(var19); var23++) {
               if (var19.method29406(var23, var22) == 1) {
                  BlockPos var24 = var17.method8350(var2.method252(Direction.SOUTH), 8 + (var22 - this.field42408) * 8);
                  var24 = var24.method8350(var2.method252(Direction.EAST), (var23 - this.field42407) * 8);
                  var3.add(new Class4187(this.field42405, "corridor_floor", var24, var2));
                  if (var19.method29406(var23, var22 - 1) == 1 || (var18.method29406(var23, var22 - 1) & 8388608) == 8388608) {
                     var3.add(new Class4187(this.field42405, "carpet_north", var24.method8350(var2.method252(Direction.EAST), 1).method8311(), var2));
                  }

                  if (var19.method29406(var23 + 1, var22) == 1 || (var18.method29406(var23 + 1, var22) & 8388608) == 8388608) {
                     var3.add(
                        new Class4187(
                           this.field42405,
                           "carpet_east",
                           var24.method8350(var2.method252(Direction.SOUTH), 1).method8350(var2.method252(Direction.EAST), 5).method8311(),
                           var2
                        )
                     );
                  }

                  if (var19.method29406(var23, var22 + 1) == 1 || (var18.method29406(var23, var22 + 1) & 8388608) == 8388608) {
                     var3.add(
                        new Class4187(
                           this.field42405,
                           var20,
                           var24.method8350(var2.method252(Direction.SOUTH), 5).method8350(var2.method252(Direction.WEST), 1),
                           var2
                        )
                     );
                  }

                  if (var19.method29406(var23 - 1, var22) == 1 || (var18.method29406(var23 - 1, var22) & 8388608) == 8388608) {
                     var3.add(
                        new Class4187(
                           this.field42405,
                           var21,
                           var24.method8350(var2.method252(Direction.WEST), 1).method8350(var2.method252(Direction.NORTH), 1),
                           var2
                        )
                     );
                  }
               }
            }
         }

         String var37 = var36 != 0 ? "indoors_wall_2" : "indoors_wall_1";
         String var38 = var36 != 0 ? "indoors_door_2" : "indoors_door_1";
         ArrayList var40 = Lists.newArrayList();

         for (int var25 = 0; var25 < Class8390.method29410(var19); var25++) {
            for (int var26 = 0; var26 < Class8390.method29409(var19); var26++) {
               boolean var27 = var36 == 2 && var19.method29406(var26, var25) == 3;
               if (var19.method29406(var26, var25) == 2 || var27) {
                  int var28 = var18.method29406(var26, var25);
                  int var29_1 =var28 & 983040;
                  int var30 = var28 & '\uffff';
                  var27 = var27 && (var28 & 8388608) == 8388608;
                  var40.clear();
                  if ((var28 & 2097152) == 2097152) {
                     for (Direction var32 : Class76.field161) {
                        if (var19.method29406(var26 + var32.method539(), var25 + var32.method541()) == 1) {
                           var40.add(var32);
                        }
                     }
                  }

                  Direction var42 = null;
                  if (var40.isEmpty()) {
                     if ((var28 & 1048576) == 1048576) {
                        var42 = Direction.field673;
                     }
                  } else {
                     var42 = (Direction)var40.get(this.field42406.nextInt(var40.size()));
                  }

                  BlockPos var43 = var17.method8350(var2.method252(Direction.SOUTH), 8 + (var25 - this.field42408) * 8);
                  var43 = var43.method8350(var2.method252(Direction.EAST), -1 + (var26 - this.field42407) * 8);

                  if (Class9467.method36498(var19, var26 - 1, var25) && !var4.method36499(var19, var26 - 1, var25, var36, var30)) {
                     var3.add(new Class4187(this.field42405, var42 != Direction.WEST ? var37 : var38, var43, var2));
                  }

                  if (var19.method29406(var26 + 1, var25) == 1 && !var27) {
                     BlockPos var33 = var43.method8350(var2.method252(Direction.EAST), 8);
                     var3.add(new Class4187(this.field42405, var42 != Direction.EAST ? var37 : var38, var33, var2));
                  }

                  if (Class9467.method36498(var19, var26, var25 + 1) && !var4.method36499(var19, var26, var25 + 1, var36, var30)) {
                     BlockPos var45 = var43.method8350(var2.method252(Direction.SOUTH), 7);
                     var45 = var45.method8350(var2.method252(Direction.EAST), 7);
                     var3.add(new Class4187(this.field42405, var42 != Direction.SOUTH ? var37 : var38, var45, var2.method250(Class80.field186)));
                  }

                  if (var19.method29406(var26, var25 - 1) == 1 && !var27) {
                     BlockPos var47 = var43.method8350(var2.method252(Direction.NORTH), 1);
                     var47 = var47.method8350(var2.method252(Direction.EAST), 7);
                     var3.add(new Class4187(this.field42405, var42 != Direction.NORTH ? var37 : var38, var47, var2.method250(Class80.field186)));
                  }

                  if (var29_1 != 65536) {
                     if (var29_1 == 131072 && var42 != null) {
                        Direction var50 = var4.method36500(var19, var26, var25, var36, var30);
                        boolean var34 = (var28 & 4194304) == 4194304;
                        this.method34529(var3, var43, var2, var50, var42, var35[var36], var34);
                     } else if (var29_1 == 262144 && var42 != null && var42 != Direction.field673) {
                        Direction var49 = var42.method537();
                        if (!var4.method36499(var19, var26 + var49.method539(), var25 + var49.method541(), var36, var30)) {
                           var49 = var49.method536();
                        }

                        this.method34530(var3, var43, var2, var49, var42, var35[var36]);
                     } else if (var29_1 == 262144 && var42 == Direction.field673) {
                        this.method34531(var3, var43, var2, var35[var36]);
                     }
                  } else {
                     this.method34528(var3, var43, var2, var42, var35[var36]);
                  }
               }
            }
         }
      }
   }

   private void method34522(List<Class4187> var1, Class7085 var2, Class8390 var3, Direction var4, int var5, int var6, int var7, int var8) {
      int var11 = var5;
      int var12 = var6;
      Direction var13 = var4;

      do {
         if (Class9467.method36498(var3, var11 + var4.method539(), var12 + var4.method541())) {
            if (Class9467.method36498(var3, var11 + var4.method539(), var12 + var4.method541())
               && Class9467.method36498(var3, var11 + var4.method539() + var4.method538().method539(), var12 + var4.method541() + var4.method538().method541())
               )
             {
               this.method34527(var1, var2);
               var11 += var4.method539();
               var12 += var4.method541();
               var4 = var4.method538();
            } else {
               var11 += var4.method539();
               var12 += var4.method541();
               if (var11 != var7 || var12 != var8 || var13 != var4) {
                  this.method34525(var1, var2);
               }
            }
         } else {
            this.method34526(var1, var2);
            var4 = var4.method537();
            if (var11 != var7 || var12 != var8 || var13 != var4) {
               this.method34525(var1, var2);
            }
         }
      } while (var11 != var7 || var12 != var8 || var13 != var4);
   }

   private void method34523(List<Class4187> var1, BlockPos var2, Class80 var3, Class8390 var4, Class8390 var5) {
      for (int var8 = 0; var8 < Class8390.method29410(var4); var8++) {
         for (int var9 = 0; var9 < Class8390.method29409(var4); var9++) {
            BlockPos var10 = var2.method8350(var3.method252(Direction.SOUTH), 8 + (var8 - this.field42408) * 8);
            var10 = var10.method8350(var3.method252(Direction.EAST), (var9 - this.field42407) * 8);
            boolean var11 = var5 != null && Class9467.method36498(var5, var9, var8);
            if (Class9467.method36498(var4, var9, var8) && !var11) {
               var1.add(new Class4187(this.field42405, "roof", var10.method8339(3), var3));
               if (!Class9467.method36498(var4, var9 + 1, var8)) {
                  BlockPos var12 = var10.method8350(var3.method252(Direction.EAST), 6);
                  var1.add(new Class4187(this.field42405, "roof_front", var12, var3));
               }

               if (!Class9467.method36498(var4, var9 - 1, var8)) {
                  BlockPos var25 = var10.method8350(var3.method252(Direction.EAST), 0);
                  var25 = var25.method8350(var3.method252(Direction.SOUTH), 7);
                  var1.add(new Class4187(this.field42405, "roof_front", var25, var3.method250(Class80.field187)));
               }

               if (!Class9467.method36498(var4, var9, var8 - 1)) {
                  BlockPos var27 = var10.method8350(var3.method252(Direction.WEST), 1);
                  var1.add(new Class4187(this.field42405, "roof_front", var27, var3.method250(Class80.field188)));
               }

               if (!Class9467.method36498(var4, var9, var8 + 1)) {
                  BlockPos var28 = var10.method8350(var3.method252(Direction.EAST), 6);
                  var28 = var28.method8350(var3.method252(Direction.SOUTH), 6);
                  var1.add(new Class4187(this.field42405, "roof_front", var28, var3.method250(Class80.field186)));
               }
            }
         }
      }

      if (var5 != null) {
         for (int var14 = 0; var14 < Class8390.method29410(var4); var14++) {
            for (int var16 = 0; var16 < Class8390.method29409(var4); var16++) {
               BlockPos var19 = var2.method8350(var3.method252(Direction.SOUTH), 8 + (var14 - this.field42408) * 8);
               var19 = var19.method8350(var3.method252(Direction.EAST), (var16 - this.field42407) * 8);
               boolean var23 = Class9467.method36498(var5, var16, var14);
               if (Class9467.method36498(var4, var16, var14) && var23) {
                  if (!Class9467.method36498(var4, var16 + 1, var14)) {
                     BlockPos var30 = var19.method8350(var3.method252(Direction.EAST), 7);
                     var1.add(new Class4187(this.field42405, "small_wall", var30, var3));
                  }

                  if (!Class9467.method36498(var4, var16 - 1, var14)) {
                     BlockPos var31 = var19.method8350(var3.method252(Direction.WEST), 1);
                     var31 = var31.method8350(var3.method252(Direction.SOUTH), 6);
                     var1.add(new Class4187(this.field42405, "small_wall", var31, var3.method250(Class80.field187)));
                  }

                  if (!Class9467.method36498(var4, var16, var14 - 1)) {
                     BlockPos var33 = var19.method8350(var3.method252(Direction.WEST), 0);
                     var33 = var33.method8350(var3.method252(Direction.NORTH), 1);
                     var1.add(new Class4187(this.field42405, "small_wall", var33, var3.method250(Class80.field188)));
                  }

                  if (!Class9467.method36498(var4, var16, var14 + 1)) {
                     BlockPos var35 = var19.method8350(var3.method252(Direction.EAST), 6);
                     var35 = var35.method8350(var3.method252(Direction.SOUTH), 7);
                     var1.add(new Class4187(this.field42405, "small_wall", var35, var3.method250(Class80.field186)));
                  }

                  if (!Class9467.method36498(var4, var16 + 1, var14)) {
                     if (!Class9467.method36498(var4, var16, var14 - 1)) {
                        BlockPos var37 = var19.method8350(var3.method252(Direction.EAST), 7);
                        var37 = var37.method8350(var3.method252(Direction.NORTH), 2);
                        var1.add(new Class4187(this.field42405, "small_wall_corner", var37, var3));
                     }

                     if (!Class9467.method36498(var4, var16, var14 + 1)) {
                        BlockPos var39 = var19.method8350(var3.method252(Direction.EAST), 8);
                        var39 = var39.method8350(var3.method252(Direction.SOUTH), 7);
                        var1.add(new Class4187(this.field42405, "small_wall_corner", var39, var3.method250(Class80.field186)));
                     }
                  }

                  if (!Class9467.method36498(var4, var16 - 1, var14)) {
                     if (!Class9467.method36498(var4, var16, var14 - 1)) {
                        BlockPos var41 = var19.method8350(var3.method252(Direction.WEST), 2);
                        var41 = var41.method8350(var3.method252(Direction.NORTH), 1);
                        var1.add(new Class4187(this.field42405, "small_wall_corner", var41, var3.method250(Class80.field188)));
                     }

                     if (!Class9467.method36498(var4, var16, var14 + 1)) {
                        BlockPos var43 = var19.method8350(var3.method252(Direction.WEST), 1);
                        var43 = var43.method8350(var3.method252(Direction.SOUTH), 8);
                        var1.add(new Class4187(this.field42405, "small_wall_corner", var43, var3.method250(Class80.field187)));
                     }
                  }
               }
            }
         }
      }

      for (int var15 = 0; var15 < Class8390.method29410(var4); var15++) {
         for (int var17 = 0; var17 < Class8390.method29409(var4); var17++) {
            BlockPos var21 = var2.method8350(var3.method252(Direction.SOUTH), 8 + (var15 - this.field42408) * 8);
            var21 = var21.method8350(var3.method252(Direction.EAST), (var17 - this.field42407) * 8);
            boolean var24 = var5 != null && Class9467.method36498(var5, var17, var15);
            if (Class9467.method36498(var4, var17, var15) && !var24) {
               if (!Class9467.method36498(var4, var17 + 1, var15)) {
                  BlockPos var45 = var21.method8350(var3.method252(Direction.EAST), 6);
                  if (Class9467.method36498(var4, var17, var15 + 1)) {
                     if (Class9467.method36498(var4, var17 + 1, var15 + 1)) {
                        BlockPos var13 = var45.method8350(var3.method252(Direction.SOUTH), 5);
                        var1.add(new Class4187(this.field42405, "roof_inner_corner", var13, var3));
                     }
                  } else {
                     BlockPos var48 = var45.method8350(var3.method252(Direction.SOUTH), 6);
                     var1.add(new Class4187(this.field42405, "roof_corner", var48, var3));
                  }

                  if (Class9467.method36498(var4, var17, var15 - 1)) {
                     if (Class9467.method36498(var4, var17 + 1, var15 - 1)) {
                        BlockPos var49 = var21.method8350(var3.method252(Direction.EAST), 9);
                        var49 = var49.method8350(var3.method252(Direction.NORTH), 2);
                        var1.add(new Class4187(this.field42405, "roof_inner_corner", var49, var3.method250(Class80.field186)));
                     }
                  } else {
                     var1.add(new Class4187(this.field42405, "roof_corner", var45, var3.method250(Class80.field188)));
                  }
               }

               if (!Class9467.method36498(var4, var17 - 1, var15)) {
                  BlockPos var46 = var21.method8350(var3.method252(Direction.EAST), 0);
                  var46 = var46.method8350(var3.method252(Direction.SOUTH), 0);
                  if (Class9467.method36498(var4, var17, var15 + 1)) {
                     if (Class9467.method36498(var4, var17 - 1, var15 + 1)) {
                        BlockPos var51 = var46.method8350(var3.method252(Direction.SOUTH), 8);
                        var51 = var51.method8350(var3.method252(Direction.WEST), 3);
                        var1.add(new Class4187(this.field42405, "roof_inner_corner", var51, var3.method250(Class80.field188)));
                     }
                  } else {
                     BlockPos var53 = var46.method8350(var3.method252(Direction.SOUTH), 6);
                     var1.add(new Class4187(this.field42405, "roof_corner", var53, var3.method250(Class80.field186)));
                  }

                  if (Class9467.method36498(var4, var17, var15 - 1)) {
                     if (Class9467.method36498(var4, var17 - 1, var15 - 1)) {
                        BlockPos var54 = var46.method8350(var3.method252(Direction.SOUTH), 1);
                        var1.add(new Class4187(this.field42405, "roof_inner_corner", var54, var3.method250(Class80.field187)));
                     }
                  } else {
                     var1.add(new Class4187(this.field42405, "roof_corner", var46, var3.method250(Class80.field187)));
                  }
               }
            }
         }
      }
   }

   private void method34524(List<Class4187> var1, Class7085 var2) {
      Direction var5 = var2.field30486.method252(Direction.WEST);
      var1.add(new Class4187(this.field42405, "entrance", var2.field30487.method8350(var5, 9), var2.field30486));
      var2.field30487 = var2.field30487.method8350(var2.field30486.method252(Direction.SOUTH), 16);
   }

   private void method34525(List<Class4187> var1, Class7085 var2) {
      var1.add(new Class4187(this.field42405, var2.field30488, var2.field30487.method8350(var2.field30486.method252(Direction.EAST), 7), var2.field30486));
      var2.field30487 = var2.field30487.method8350(var2.field30486.method252(Direction.SOUTH), 8);
   }

   private void method34526(List<Class4187> var1, Class7085 var2) {
      var2.field30487 = var2.field30487.method8350(var2.field30486.method252(Direction.SOUTH), -1);
      var1.add(new Class4187(this.field42405, "wall_corner", var2.field30487, var2.field30486));
      var2.field30487 = var2.field30487.method8350(var2.field30486.method252(Direction.SOUTH), -7);
      var2.field30487 = var2.field30487.method8350(var2.field30486.method252(Direction.WEST), -6);
      var2.field30486 = var2.field30486.method250(Class80.field186);
   }

   private void method34527(List<Class4187> var1, Class7085 var2) {
      var2.field30487 = var2.field30487.method8350(var2.field30486.method252(Direction.SOUTH), 6);
      var2.field30487 = var2.field30487.method8350(var2.field30486.method252(Direction.EAST), 8);
      var2.field30486 = var2.field30486.method250(Class80.field188);
   }

   private void method34528(List<Class4187> var1, BlockPos var2, Class80 var3, Direction var4, Class6025 var5) {
      Class80 var8 = Class80.field185;
      String var9 = var5.method18650(this.field42406);
      if (var4 != Direction.EAST) {
         if (var4 != Direction.NORTH) {
            if (var4 != Direction.WEST) {
               if (var4 != Direction.SOUTH) {
                  var9 = var5.method18651(this.field42406);
               } else {
                  var8 = var8.method250(Class80.field186);
               }
            } else {
               var8 = var8.method250(Class80.field187);
            }
         } else {
            var8 = var8.method250(Class80.field188);
         }
      }

      BlockPos var10 = Class8969.method32908(new BlockPos(1, 0, 0), Class2089.field13614, var8, 7, 7);
      var8 = var8.method250(var3);
      var10 = var10.method8352(var3);
      BlockPos var11 = var2.method8336(var10.getX(), 0, var10.getZ());
      var1.add(new Class4187(this.field42405, var9, var11, var8));
   }

   private void method34529(List<Class4187> var1, BlockPos var2, Class80 var3, Direction var4, Direction var5, Class6025 var6, boolean var7) {
      if (var5 == Direction.EAST && var4 == Direction.SOUTH) {
         BlockPos var31 = var2.method8350(var3.method252(Direction.EAST), 1);
         var1.add(new Class4187(this.field42405, var6.method18652(this.field42406, var7), var31, var3));
      } else if (var5 == Direction.EAST && var4 == Direction.NORTH) {
         BlockPos var29 = var2.method8350(var3.method252(Direction.EAST), 1);
         var29 = var29.method8350(var3.method252(Direction.SOUTH), 6);
         var1.add(new Class4187(this.field42405, var6.method18652(this.field42406, var7), var29, var3, Class2089.field13615));
      } else if (var5 == Direction.WEST && var4 == Direction.NORTH) {
         BlockPos var27 = var2.method8350(var3.method252(Direction.EAST), 7);
         var27 = var27.method8350(var3.method252(Direction.SOUTH), 6);
         var1.add(new Class4187(this.field42405, var6.method18652(this.field42406, var7), var27, var3.method250(Class80.field187)));
      } else if (var5 == Direction.WEST && var4 == Direction.SOUTH) {
         BlockPos var26 = var2.method8350(var3.method252(Direction.EAST), 7);
         var1.add(new Class4187(this.field42405, var6.method18652(this.field42406, var7), var26, var3, Class2089.field13616));
      } else if (var5 == Direction.SOUTH && var4 == Direction.EAST) {
         BlockPos var25 = var2.method8350(var3.method252(Direction.EAST), 1);
         var1.add(new Class4187(this.field42405, var6.method18652(this.field42406, var7), var25, var3.method250(Class80.field186), Class2089.field13615));
      } else if (var5 == Direction.SOUTH && var4 == Direction.WEST) {
         BlockPos var24 = var2.method8350(var3.method252(Direction.EAST), 7);
         var1.add(new Class4187(this.field42405, var6.method18652(this.field42406, var7), var24, var3.method250(Class80.field186)));
      } else if (var5 == Direction.NORTH && var4 == Direction.WEST) {
         BlockPos var22 = var2.method8350(var3.method252(Direction.EAST), 7);
         var22 = var22.method8350(var3.method252(Direction.SOUTH), 6);
         var1.add(new Class4187(this.field42405, var6.method18652(this.field42406, var7), var22, var3.method250(Class80.field186), Class2089.field13616));
      } else if (var5 == Direction.NORTH && var4 == Direction.EAST) {
         BlockPos var20 = var2.method8350(var3.method252(Direction.EAST), 1);
         var20 = var20.method8350(var3.method252(Direction.SOUTH), 6);
         var1.add(new Class4187(this.field42405, var6.method18652(this.field42406, var7), var20, var3.method250(Class80.field188)));
      } else if (var5 == Direction.SOUTH && var4 == Direction.NORTH) {
         BlockPos var18 = var2.method8350(var3.method252(Direction.EAST), 1);
         var18 = var18.method8350(var3.method252(Direction.NORTH), 8);
         var1.add(new Class4187(this.field42405, var6.method18653(this.field42406, var7), var18, var3));
      } else if (var5 == Direction.NORTH && var4 == Direction.SOUTH) {
         BlockPos var16 = var2.method8350(var3.method252(Direction.EAST), 7);
         var16 = var16.method8350(var3.method252(Direction.SOUTH), 14);
         var1.add(new Class4187(this.field42405, var6.method18653(this.field42406, var7), var16, var3.method250(Class80.field187)));
      } else if (var5 == Direction.WEST && var4 == Direction.EAST) {
         BlockPos var15 = var2.method8350(var3.method252(Direction.EAST), 15);
         var1.add(new Class4187(this.field42405, var6.method18653(this.field42406, var7), var15, var3.method250(Class80.field186)));
      } else if (var5 == Direction.EAST && var4 == Direction.WEST) {
         BlockPos var13 = var2.method8350(var3.method252(Direction.WEST), 7);
         var13 = var13.method8350(var3.method252(Direction.SOUTH), 6);
         var1.add(new Class4187(this.field42405, var6.method18653(this.field42406, var7), var13, var3.method250(Class80.field188)));
      } else if (var5 == Direction.field673 && var4 == Direction.EAST) {
         BlockPos var12 = var2.method8350(var3.method252(Direction.EAST), 15);
         var1.add(new Class4187(this.field42405, var6.method18654(this.field42406), var12, var3.method250(Class80.field186)));
      } else if (var5 == Direction.field673 && var4 == Direction.SOUTH) {
         BlockPos var10 = var2.method8350(var3.method252(Direction.EAST), 1);
         var10 = var10.method8350(var3.method252(Direction.NORTH), 0);
         var1.add(new Class4187(this.field42405, var6.method18654(this.field42406), var10, var3));
      }
   }

   private void method34530(List<Class4187> var1, BlockPos var2, Class80 var3, Direction var4, Direction var5, Class6025 var6) {
      byte var9 = 0;
      byte var10 = 0;
      Class80 var11 = var3;
      Class2089 var12 = Class2089.field13614;
      if (var5 == Direction.EAST && var4 == Direction.SOUTH) {
         var9 = -7;
      } else if (var5 == Direction.EAST && var4 == Direction.NORTH) {
         var9 = -7;
         var10 = 6;
         var12 = Class2089.field13615;
      } else if (var5 == Direction.NORTH && var4 == Direction.EAST) {
         var9 = 1;
         var10 = 14;
         var11 = var3.method250(Class80.field188);
      } else if (var5 == Direction.NORTH && var4 == Direction.WEST) {
         var9 = 7;
         var10 = 14;
         var11 = var3.method250(Class80.field188);
         var12 = Class2089.field13615;
      } else if (var5 == Direction.SOUTH && var4 == Direction.WEST) {
         var9 = 7;
         var10 = -8;
         var11 = var3.method250(Class80.field186);
      } else if (var5 == Direction.SOUTH && var4 == Direction.EAST) {
         var9 = 1;
         var10 = -8;
         var11 = var3.method250(Class80.field186);
         var12 = Class2089.field13615;
      } else if (var5 == Direction.WEST && var4 == Direction.NORTH) {
         var9 = 15;
         var10 = 6;
         var11 = var3.method250(Class80.field187);
      } else if (var5 == Direction.WEST && var4 == Direction.SOUTH) {
         var9 = 15;
         var12 = Class2089.field13616;
      }

      BlockPos var13 = var2.method8350(var3.method252(Direction.EAST), var9);
      var13 = var13.method8350(var3.method252(Direction.SOUTH), var10);
      var1.add(new Class4187(this.field42405, var6.method18655(this.field42406), var13, var11, var12));
   }

   private void method34531(List<Class4187> var1, BlockPos var2, Class80 var3, Class6025 var4) {
      BlockPos var7 = var2.method8350(var3.method252(Direction.EAST), 1);
      var1.add(new Class4187(this.field42405, var4.method18656(this.field42406), var7, var3, Class2089.field13614));
   }
}
