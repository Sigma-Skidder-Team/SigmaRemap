package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_7492 {
   private final class_5799 field_38230;
   private final Random field_38231;
   private int field_38232;
   private int field_38228;

   public class_7492(class_5799 var1, Random var2) {
      this.field_38230 = var1;
      this.field_38231 = var2;
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_34064(BlockPos var1, class_6631 var2, List<class_8600> var3, class_8491 var4) {
      class_1359 var7 = new class_1359(null);
      var7.field_7394 = var1;
      var7.field_7397 = var2;
      var7.field_7395 = "wall_flat";
      class_1359 var8 = new class_1359(null);
      this.method_34058(var3, var7);
      var8.field_7394 = var7.field_7394.method_6082(8);
      var8.field_7397 = var7.field_7397;
      var8.field_7395 = "wall_window";
      if (var3.isEmpty()) {
      }

      class_4456 var9 = class_8491.method_39139(var4);
      class_4456 var10 = class_8491.method_39133(var4);
      this.field_38232 = class_8491.method_39135(var4) + 1;
      this.field_38228 = class_8491.method_39131(var4) + 1;
      int var11 = class_8491.method_39135(var4) + 1;
      int var12 = class_8491.method_39131(var4);
      this.method_34060(var3, var7, var9, Direction.field_800, this.field_38232, this.field_38228, var11, var12);
      this.method_34060(var3, var8, var9, Direction.field_800, this.field_38232, this.field_38228, var11, var12);
      class_1359 var13 = new class_1359(null);
      var13.field_7394 = var7.field_7394.method_6082(19);
      var13.field_7397 = var7.field_7397;
      var13.field_7395 = "wall_window";
      boolean var14 = false;

      for (int var15 = 0; var15 < class_4456.method_20660(var10) && !var14; var15++) {
         for (int var16 = class_4456.method_20664(var10) - 1; var16 >= 0 && !var14; var16--) {
            if (class_8491.method_39134(var10, var16, var15)) {
               var13.field_7394 = var13.field_7394.method_6099(var2.method_30489(Direction.field_800), 8 + (var15 - this.field_38228) * 8);
               var13.field_7394 = var13.field_7394.method_6099(var2.method_30489(Direction.field_804), (var16 - this.field_38232) * 8);
               this.method_34061(var3, var13);
               this.method_34060(var3, var13, var10, Direction.field_800, var16, var15, var16, var15);
               var14 = true;
            }
         }
      }

      this.method_34057(var3, var1.method_6082(16), var2, var9, var10);
      this.method_34057(var3, var1.method_6082(27), var2, var10, (class_4456)null);
      if (var3.isEmpty()) {
      }

      class_1002[] var35 = new class_1002[]{new class_2980(null), new class_8931(null), new class_441(null)};

      for (int var36 = 0; var36 < 3; var36++) {
         BlockPos var17 = var1.method_6082(8 * var36 + (var36 != 2 ? 0 : 3));
         class_4456 var18 = class_8491.method_39129(var4)[var36];
         class_4456 var19 = var36 != 2 ? var9 : var10;
         String var20 = var36 != 0 ? "carpet_south_2" : "carpet_south_1";
         String var21 = var36 != 0 ? "carpet_west_2" : "carpet_west_1";

         for (int var22 = 0; var22 < class_4456.method_20660(var19); var22++) {
            for (int var23 = 0; var23 < class_4456.method_20664(var19); var23++) {
               if (var19.method_20665(var23, var22) == 1) {
                  BlockPos var24 = var17.method_6099(var2.method_30489(Direction.field_800), 8 + (var22 - this.field_38228) * 8);
                  var24 = var24.method_6099(var2.method_30489(Direction.field_804), (var23 - this.field_38232) * 8);
                  var3.add(new class_8600(this.field_38230, "corridor_floor", var24, var2));
                  if (var19.method_20665(var23, var22 - 1) == 1 || (var18.method_20665(var23, var22 - 1) & 8388608) == 8388608) {
                     var3.add(
                        new class_8600(this.field_38230, "carpet_north", var24.method_6099(var2.method_30489(Direction.field_804), 1).method_6081(), var2)
                     );
                  }

                  if (var19.method_20665(var23 + 1, var22) == 1 || (var18.method_20665(var23 + 1, var22) & 8388608) == 8388608) {
                     var3.add(
                        new class_8600(
                           this.field_38230,
                           "carpet_east",
                           var24.method_6099(var2.method_30489(Direction.field_800), 1).method_6099(var2.method_30489(Direction.field_804), 5).method_6081(),
                           var2
                        )
                     );
                  }

                  if (var19.method_20665(var23, var22 + 1) == 1 || (var18.method_20665(var23, var22 + 1) & 8388608) == 8388608) {
                     var3.add(
                        new class_8600(
                           this.field_38230,
                           var20,
                           var24.method_6099(var2.method_30489(Direction.field_800), 5).method_6099(var2.method_30489(Direction.field_809), 1),
                           var2
                        )
                     );
                  }

                  if (var19.method_20665(var23 - 1, var22) == 1 || (var18.method_20665(var23 - 1, var22) & 8388608) == 8388608) {
                     var3.add(
                        new class_8600(
                           this.field_38230,
                           var21,
                           var24.method_6099(var2.method_30489(Direction.field_809), 1).method_6099(var2.method_30489(Direction.field_818), 1),
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

         for (int var25 = 0; var25 < class_4456.method_20660(var19); var25++) {
            for (int var26 = 0; var26 < class_4456.method_20664(var19); var26++) {
               boolean var27 = var36 == 2 && var19.method_20665(var26, var25) == 3;
               if (var19.method_20665(var26, var25) == 2 || var27) {
                  int var28 = var18.method_20665(var26, var25);
                  var27 = var27 && (var28 & 8388608) == 8388608;
                  var40.clear();
                  if ((var28 & 2097152) == 2097152) {
                     for (Direction var32 : class_9594.field_48893) {
                        if (var19.method_20665(var26 + var32.method_1041(), var25 + var32.method_1034()) == 1) {
                           var40.add(var32);
                        }
                     }
                  }

                  Direction var42 = null;
                  if (var40.isEmpty()) {
                     if ((var28 & 1048576) == 1048576) {
                        var42 = Direction.field_817;
                     }
                  } else {
                     var42 = (Direction)var40.get(this.field_38231.nextInt(var40.size()));
                  }

                  BlockPos var43 = var17.method_6099(var2.method_30489(Direction.field_800), 8 + (var25 - this.field_38228) * 8);
                  var43 = var43.method_6099(var2.method_30489(Direction.field_804), -1 + (var26 - this.field_38232) * 8);
                  byte var30;
                  if (class_8491.method_39134(var19, var26 - 1, var25) && !var4.method_39138(var19, var26 - 1, var25, var36, var30)) {
                     var3.add(new class_8600(this.field_38230, var42 != Direction.field_809 ? var37 : var38, var43, var2));
                  }

                  if (var19.method_20665(var26 + 1, var25) == 1 && !var27) {
                     BlockPos var33 = var43.method_6099(var2.method_30489(Direction.field_804), 8);
                     var3.add(new class_8600(this.field_38230, var42 != Direction.field_804 ? var37 : var38, var33, var2));
                  }

                  if (class_8491.method_39134(var19, var26, var25 + 1) && !var4.method_39138(var19, var26, var25 + 1, var36, var30)) {
                     BlockPos var45 = var43.method_6099(var2.method_30489(Direction.field_800), 7);
                     var45 = var45.method_6099(var2.method_30489(Direction.field_804), 7);
                     var3.add(new class_8600(this.field_38230, var42 != Direction.field_800 ? var37 : var38, var45, var2.method_30486(class_6631.field_34334)));
                  }

                  if (var19.method_20665(var26, var25 - 1) == 1 && !var27) {
                     BlockPos var47 = var43.method_6099(var2.method_30489(Direction.field_818), 1);
                     var47 = var47.method_6099(var2.method_30489(Direction.field_804), 7);
                     var3.add(new class_8600(this.field_38230, var42 != Direction.field_818 ? var37 : var38, var47, var2.method_30486(class_6631.field_34334)));
                  }

                  <unknown> var29;
                  if (var29_1 != 65536) {
                     if (var29_1 == 131072 && var42 != null) {
                        Direction var50 = var4.method_39130(var19, var26, var25, var36, var30);
                        boolean var34 = (var28 & 4194304) == 4194304;
                        this.method_34059(var3, var43, var2, var50, var42, var35[var36], var34);
                     } else if (var29_1 == 262144 && var42 != null && var42 != Direction.field_817) {
                        Direction var49 = var42.method_1042();
                        if (!var4.method_39138(var19, var26 + var49.method_1041(), var25 + var49.method_1034(), var36, var30)) {
                           var49 = var49.method_1046();
                        }

                        this.method_34065(var3, var43, var2, var49, var42, var35[var36]);
                     } else if (var29_1 == 262144 && var42 == Direction.field_817) {
                        this.method_34056(var3, var43, var2, var35[var36]);
                     }
                  } else {
                     this.method_34055(var3, var43, var2, var42, var35[var36]);
                  }
               }
            }
         }
      }
   }

   private void method_34060(List<class_8600> var1, class_1359 var2, class_4456 var3, Direction var4, int var5, int var6, int var7, int var8) {
      int var11 = var5;
      int var12 = var6;
      Direction var13 = var4;

      do {
         if (class_8491.method_39134(var3, var11 + var4.method_1041(), var12 + var4.method_1034())) {
            if (class_8491.method_39134(var3, var11 + var4.method_1041(), var12 + var4.method_1034())
               && class_8491.method_39134(
                  var3, var11 + var4.method_1041() + var4.method_1053().method_1041(), var12 + var4.method_1034() + var4.method_1053().method_1034()
               )) {
               this.method_34062(var1, var2);
               var11 += var4.method_1041();
               var12 += var4.method_1034();
               var4 = var4.method_1053();
            } else {
               var11 += var4.method_1041();
               var12 += var4.method_1034();
               if (var11 != var7 || var12 != var8 || var13 != var4) {
                  this.method_34061(var1, var2);
               }
            }
         } else {
            this.method_34054(var1, var2);
            var4 = var4.method_1042();
            if (var11 != var7 || var12 != var8 || var13 != var4) {
               this.method_34061(var1, var2);
            }
         }
      } while (var11 != var7 || var12 != var8 || var13 != var4);
   }

   private void method_34057(List<class_8600> var1, BlockPos var2, class_6631 var3, class_4456 var4, class_4456 var5) {
      for (int var8 = 0; var8 < class_4456.method_20660(var4); var8++) {
         for (int var9 = 0; var9 < class_4456.method_20664(var4); var9++) {
            BlockPos var10 = var2.method_6099(var3.method_30489(Direction.field_800), 8 + (var8 - this.field_38228) * 8);
            var10 = var10.method_6099(var3.method_30489(Direction.field_804), (var9 - this.field_38232) * 8);
            boolean var11 = var5 != null && class_8491.method_39134(var5, var9, var8);
            if (class_8491.method_39134(var4, var9, var8) && !var11) {
               var1.add(new class_8600(this.field_38230, "roof", var10.method_6082(3), var3));
               if (!class_8491.method_39134(var4, var9 + 1, var8)) {
                  BlockPos var12 = var10.method_6099(var3.method_30489(Direction.field_804), 6);
                  var1.add(new class_8600(this.field_38230, "roof_front", var12, var3));
               }

               if (!class_8491.method_39134(var4, var9 - 1, var8)) {
                  BlockPos var25 = var10.method_6099(var3.method_30489(Direction.field_804), 0);
                  var25 = var25.method_6099(var3.method_30489(Direction.field_800), 7);
                  var1.add(new class_8600(this.field_38230, "roof_front", var25, var3.method_30486(class_6631.field_34338)));
               }

               if (!class_8491.method_39134(var4, var9, var8 - 1)) {
                  BlockPos var27 = var10.method_6099(var3.method_30489(Direction.field_809), 1);
                  var1.add(new class_8600(this.field_38230, "roof_front", var27, var3.method_30486(class_6631.field_34335)));
               }

               if (!class_8491.method_39134(var4, var9, var8 + 1)) {
                  BlockPos var28 = var10.method_6099(var3.method_30489(Direction.field_804), 6);
                  var28 = var28.method_6099(var3.method_30489(Direction.field_800), 6);
                  var1.add(new class_8600(this.field_38230, "roof_front", var28, var3.method_30486(class_6631.field_34334)));
               }
            }
         }
      }

      if (var5 != null) {
         for (int var14 = 0; var14 < class_4456.method_20660(var4); var14++) {
            for (int var16 = 0; var16 < class_4456.method_20664(var4); var16++) {
               BlockPos var19 = var2.method_6099(var3.method_30489(Direction.field_800), 8 + (var14 - this.field_38228) * 8);
               var19 = var19.method_6099(var3.method_30489(Direction.field_804), (var16 - this.field_38232) * 8);
               boolean var23 = class_8491.method_39134(var5, var16, var14);
               if (class_8491.method_39134(var4, var16, var14) && var23) {
                  if (!class_8491.method_39134(var4, var16 + 1, var14)) {
                     BlockPos var30 = var19.method_6099(var3.method_30489(Direction.field_804), 7);
                     var1.add(new class_8600(this.field_38230, "small_wall", var30, var3));
                  }

                  if (!class_8491.method_39134(var4, var16 - 1, var14)) {
                     BlockPos var31 = var19.method_6099(var3.method_30489(Direction.field_809), 1);
                     var31 = var31.method_6099(var3.method_30489(Direction.field_800), 6);
                     var1.add(new class_8600(this.field_38230, "small_wall", var31, var3.method_30486(class_6631.field_34338)));
                  }

                  if (!class_8491.method_39134(var4, var16, var14 - 1)) {
                     BlockPos var33 = var19.method_6099(var3.method_30489(Direction.field_809), 0);
                     var33 = var33.method_6099(var3.method_30489(Direction.field_818), 1);
                     var1.add(new class_8600(this.field_38230, "small_wall", var33, var3.method_30486(class_6631.field_34335)));
                  }

                  if (!class_8491.method_39134(var4, var16, var14 + 1)) {
                     BlockPos var35 = var19.method_6099(var3.method_30489(Direction.field_804), 6);
                     var35 = var35.method_6099(var3.method_30489(Direction.field_800), 7);
                     var1.add(new class_8600(this.field_38230, "small_wall", var35, var3.method_30486(class_6631.field_34334)));
                  }

                  if (!class_8491.method_39134(var4, var16 + 1, var14)) {
                     if (!class_8491.method_39134(var4, var16, var14 - 1)) {
                        BlockPos var37 = var19.method_6099(var3.method_30489(Direction.field_804), 7);
                        var37 = var37.method_6099(var3.method_30489(Direction.field_818), 2);
                        var1.add(new class_8600(this.field_38230, "small_wall_corner", var37, var3));
                     }

                     if (!class_8491.method_39134(var4, var16, var14 + 1)) {
                        BlockPos var39 = var19.method_6099(var3.method_30489(Direction.field_804), 8);
                        var39 = var39.method_6099(var3.method_30489(Direction.field_800), 7);
                        var1.add(new class_8600(this.field_38230, "small_wall_corner", var39, var3.method_30486(class_6631.field_34334)));
                     }
                  }

                  if (!class_8491.method_39134(var4, var16 - 1, var14)) {
                     if (!class_8491.method_39134(var4, var16, var14 - 1)) {
                        BlockPos var41 = var19.method_6099(var3.method_30489(Direction.field_809), 2);
                        var41 = var41.method_6099(var3.method_30489(Direction.field_818), 1);
                        var1.add(new class_8600(this.field_38230, "small_wall_corner", var41, var3.method_30486(class_6631.field_34335)));
                     }

                     if (!class_8491.method_39134(var4, var16, var14 + 1)) {
                        BlockPos var43 = var19.method_6099(var3.method_30489(Direction.field_809), 1);
                        var43 = var43.method_6099(var3.method_30489(Direction.field_800), 8);
                        var1.add(new class_8600(this.field_38230, "small_wall_corner", var43, var3.method_30486(class_6631.field_34338)));
                     }
                  }
               }
            }
         }
      }

      for (int var15 = 0; var15 < class_4456.method_20660(var4); var15++) {
         for (int var17 = 0; var17 < class_4456.method_20664(var4); var17++) {
            BlockPos var21 = var2.method_6099(var3.method_30489(Direction.field_800), 8 + (var15 - this.field_38228) * 8);
            var21 = var21.method_6099(var3.method_30489(Direction.field_804), (var17 - this.field_38232) * 8);
            boolean var24 = var5 != null && class_8491.method_39134(var5, var17, var15);
            if (class_8491.method_39134(var4, var17, var15) && !var24) {
               if (!class_8491.method_39134(var4, var17 + 1, var15)) {
                  BlockPos var45 = var21.method_6099(var3.method_30489(Direction.field_804), 6);
                  if (class_8491.method_39134(var4, var17, var15 + 1)) {
                     if (class_8491.method_39134(var4, var17 + 1, var15 + 1)) {
                        BlockPos var13 = var45.method_6099(var3.method_30489(Direction.field_800), 5);
                        var1.add(new class_8600(this.field_38230, "roof_inner_corner", var13, var3));
                     }
                  } else {
                     BlockPos var48 = var45.method_6099(var3.method_30489(Direction.field_800), 6);
                     var1.add(new class_8600(this.field_38230, "roof_corner", var48, var3));
                  }

                  if (class_8491.method_39134(var4, var17, var15 - 1)) {
                     if (class_8491.method_39134(var4, var17 + 1, var15 - 1)) {
                        BlockPos var49 = var21.method_6099(var3.method_30489(Direction.field_804), 9);
                        var49 = var49.method_6099(var3.method_30489(Direction.field_818), 2);
                        var1.add(new class_8600(this.field_38230, "roof_inner_corner", var49, var3.method_30486(class_6631.field_34334)));
                     }
                  } else {
                     var1.add(new class_8600(this.field_38230, "roof_corner", var45, var3.method_30486(class_6631.field_34335)));
                  }
               }

               if (!class_8491.method_39134(var4, var17 - 1, var15)) {
                  BlockPos var46 = var21.method_6099(var3.method_30489(Direction.field_804), 0);
                  var46 = var46.method_6099(var3.method_30489(Direction.field_800), 0);
                  if (class_8491.method_39134(var4, var17, var15 + 1)) {
                     if (class_8491.method_39134(var4, var17 - 1, var15 + 1)) {
                        BlockPos var51 = var46.method_6099(var3.method_30489(Direction.field_800), 8);
                        var51 = var51.method_6099(var3.method_30489(Direction.field_809), 3);
                        var1.add(new class_8600(this.field_38230, "roof_inner_corner", var51, var3.method_30486(class_6631.field_34335)));
                     }
                  } else {
                     BlockPos var53 = var46.method_6099(var3.method_30489(Direction.field_800), 6);
                     var1.add(new class_8600(this.field_38230, "roof_corner", var53, var3.method_30486(class_6631.field_34334)));
                  }

                  if (class_8491.method_39134(var4, var17, var15 - 1)) {
                     if (class_8491.method_39134(var4, var17 - 1, var15 - 1)) {
                        BlockPos var54 = var46.method_6099(var3.method_30489(Direction.field_800), 1);
                        var1.add(new class_8600(this.field_38230, "roof_inner_corner", var54, var3.method_30486(class_6631.field_34338)));
                     }
                  } else {
                     var1.add(new class_8600(this.field_38230, "roof_corner", var46, var3.method_30486(class_6631.field_34338)));
                  }
               }
            }
         }
      }
   }

   private void method_34058(List<class_8600> var1, class_1359 var2) {
      Direction var5 = var2.field_7397.method_30489(Direction.field_809);
      var1.add(new class_8600(this.field_38230, "entrance", var2.field_7394.method_6099(var5, 9), var2.field_7397));
      var2.field_7394 = var2.field_7394.method_6099(var2.field_7397.method_30489(Direction.field_800), 16);
   }

   private void method_34061(List<class_8600> var1, class_1359 var2) {
      var1.add(
         new class_8600(this.field_38230, var2.field_7395, var2.field_7394.method_6099(var2.field_7397.method_30489(Direction.field_804), 7), var2.field_7397)
      );
      var2.field_7394 = var2.field_7394.method_6099(var2.field_7397.method_30489(Direction.field_800), 8);
   }

   private void method_34054(List<class_8600> var1, class_1359 var2) {
      var2.field_7394 = var2.field_7394.method_6099(var2.field_7397.method_30489(Direction.field_800), -1);
      var1.add(new class_8600(this.field_38230, "wall_corner", var2.field_7394, var2.field_7397));
      var2.field_7394 = var2.field_7394.method_6099(var2.field_7397.method_30489(Direction.field_800), -7);
      var2.field_7394 = var2.field_7394.method_6099(var2.field_7397.method_30489(Direction.field_809), -6);
      var2.field_7397 = var2.field_7397.method_30486(class_6631.field_34334);
   }

   private void method_34062(List<class_8600> var1, class_1359 var2) {
      var2.field_7394 = var2.field_7394.method_6099(var2.field_7397.method_30489(Direction.field_800), 6);
      var2.field_7394 = var2.field_7394.method_6099(var2.field_7397.method_30489(Direction.field_804), 8);
      var2.field_7397 = var2.field_7397.method_30486(class_6631.field_34335);
   }

   private void method_34055(List<class_8600> var1, BlockPos var2, class_6631 var3, Direction var4, class_1002 var5) {
      class_6631 var8 = class_6631.field_34340;
      String var9 = var5.method_4346(this.field_38231);
      if (var4 != Direction.field_804) {
         if (var4 != Direction.field_818) {
            if (var4 != Direction.field_809) {
               if (var4 != Direction.field_800) {
                  var9 = var5.method_4347(this.field_38231);
               } else {
                  var8 = var8.method_30486(class_6631.field_34334);
               }
            } else {
               var8 = var8.method_30486(class_6631.field_34338);
            }
         } else {
            var8 = var8.method_30486(class_6631.field_34335);
         }
      }

      BlockPos var10 = class_6561.method_29978(new BlockPos(1, 0, 0), class_9022.field_46145, var8, 7, 7);
      var8 = var8.method_30486(var3);
      var10 = var10.method_6078(var3);
      BlockPos var11 = var2.method_6104(var10.method_12173(), 0, var10.method_12185());
      var1.add(new class_8600(this.field_38230, var9, var11, var8));
   }

   private void method_34059(List<class_8600> var1, BlockPos var2, class_6631 var3, Direction var4, Direction var5, class_1002 var6, boolean var7) {
      if (var5 == Direction.field_804 && var4 == Direction.field_800) {
         BlockPos var31 = var2.method_6099(var3.method_30489(Direction.field_804), 1);
         var1.add(new class_8600(this.field_38230, var6.method_4345(this.field_38231, var7), var31, var3));
      } else if (var5 == Direction.field_804 && var4 == Direction.field_818) {
         BlockPos var29 = var2.method_6099(var3.method_30489(Direction.field_804), 1);
         var29 = var29.method_6099(var3.method_30489(Direction.field_800), 6);
         var1.add(new class_8600(this.field_38230, var6.method_4345(this.field_38231, var7), var29, var3, class_9022.field_46148));
      } else if (var5 == Direction.field_809 && var4 == Direction.field_818) {
         BlockPos var27 = var2.method_6099(var3.method_30489(Direction.field_804), 7);
         var27 = var27.method_6099(var3.method_30489(Direction.field_800), 6);
         var1.add(new class_8600(this.field_38230, var6.method_4345(this.field_38231, var7), var27, var3.method_30486(class_6631.field_34338)));
      } else if (var5 == Direction.field_809 && var4 == Direction.field_800) {
         BlockPos var26 = var2.method_6099(var3.method_30489(Direction.field_804), 7);
         var1.add(new class_8600(this.field_38230, var6.method_4345(this.field_38231, var7), var26, var3, class_9022.field_46144));
      } else if (var5 == Direction.field_800 && var4 == Direction.field_804) {
         BlockPos var25 = var2.method_6099(var3.method_30489(Direction.field_804), 1);
         var1.add(
            new class_8600(this.field_38230, var6.method_4345(this.field_38231, var7), var25, var3.method_30486(class_6631.field_34334), class_9022.field_46148)
         );
      } else if (var5 == Direction.field_800 && var4 == Direction.field_809) {
         BlockPos var24 = var2.method_6099(var3.method_30489(Direction.field_804), 7);
         var1.add(new class_8600(this.field_38230, var6.method_4345(this.field_38231, var7), var24, var3.method_30486(class_6631.field_34334)));
      } else if (var5 == Direction.field_818 && var4 == Direction.field_809) {
         BlockPos var22 = var2.method_6099(var3.method_30489(Direction.field_804), 7);
         var22 = var22.method_6099(var3.method_30489(Direction.field_800), 6);
         var1.add(
            new class_8600(this.field_38230, var6.method_4345(this.field_38231, var7), var22, var3.method_30486(class_6631.field_34334), class_9022.field_46144)
         );
      } else if (var5 == Direction.field_818 && var4 == Direction.field_804) {
         BlockPos var20 = var2.method_6099(var3.method_30489(Direction.field_804), 1);
         var20 = var20.method_6099(var3.method_30489(Direction.field_800), 6);
         var1.add(new class_8600(this.field_38230, var6.method_4345(this.field_38231, var7), var20, var3.method_30486(class_6631.field_34335)));
      } else if (var5 == Direction.field_800 && var4 == Direction.field_818) {
         BlockPos var18 = var2.method_6099(var3.method_30489(Direction.field_804), 1);
         var18 = var18.method_6099(var3.method_30489(Direction.field_818), 8);
         var1.add(new class_8600(this.field_38230, var6.method_4350(this.field_38231, var7), var18, var3));
      } else if (var5 == Direction.field_818 && var4 == Direction.field_800) {
         BlockPos var16 = var2.method_6099(var3.method_30489(Direction.field_804), 7);
         var16 = var16.method_6099(var3.method_30489(Direction.field_800), 14);
         var1.add(new class_8600(this.field_38230, var6.method_4350(this.field_38231, var7), var16, var3.method_30486(class_6631.field_34338)));
      } else if (var5 == Direction.field_809 && var4 == Direction.field_804) {
         BlockPos var15 = var2.method_6099(var3.method_30489(Direction.field_804), 15);
         var1.add(new class_8600(this.field_38230, var6.method_4350(this.field_38231, var7), var15, var3.method_30486(class_6631.field_34334)));
      } else if (var5 == Direction.field_804 && var4 == Direction.field_809) {
         BlockPos var13 = var2.method_6099(var3.method_30489(Direction.field_809), 7);
         var13 = var13.method_6099(var3.method_30489(Direction.field_800), 6);
         var1.add(new class_8600(this.field_38230, var6.method_4350(this.field_38231, var7), var13, var3.method_30486(class_6631.field_34335)));
      } else if (var5 == Direction.field_817 && var4 == Direction.field_804) {
         BlockPos var12 = var2.method_6099(var3.method_30489(Direction.field_804), 15);
         var1.add(new class_8600(this.field_38230, var6.method_4348(this.field_38231), var12, var3.method_30486(class_6631.field_34334)));
      } else if (var5 == Direction.field_817 && var4 == Direction.field_800) {
         BlockPos var10 = var2.method_6099(var3.method_30489(Direction.field_804), 1);
         var10 = var10.method_6099(var3.method_30489(Direction.field_818), 0);
         var1.add(new class_8600(this.field_38230, var6.method_4348(this.field_38231), var10, var3));
      }
   }

   private void method_34065(List<class_8600> var1, BlockPos var2, class_6631 var3, Direction var4, Direction var5, class_1002 var6) {
      byte var9 = 0;
      byte var10 = 0;
      class_6631 var11 = var3;
      class_9022 var12 = class_9022.field_46145;
      if (var5 == Direction.field_804 && var4 == Direction.field_800) {
         var9 = -7;
      } else if (var5 == Direction.field_804 && var4 == Direction.field_818) {
         var9 = -7;
         var10 = 6;
         var12 = class_9022.field_46148;
      } else if (var5 == Direction.field_818 && var4 == Direction.field_804) {
         var9 = 1;
         var10 = 14;
         var11 = var3.method_30486(class_6631.field_34335);
      } else if (var5 == Direction.field_818 && var4 == Direction.field_809) {
         var9 = 7;
         var10 = 14;
         var11 = var3.method_30486(class_6631.field_34335);
         var12 = class_9022.field_46148;
      } else if (var5 == Direction.field_800 && var4 == Direction.field_809) {
         var9 = 7;
         var10 = -8;
         var11 = var3.method_30486(class_6631.field_34334);
      } else if (var5 == Direction.field_800 && var4 == Direction.field_804) {
         var9 = 1;
         var10 = -8;
         var11 = var3.method_30486(class_6631.field_34334);
         var12 = class_9022.field_46148;
      } else if (var5 == Direction.field_809 && var4 == Direction.field_818) {
         var9 = 15;
         var10 = 6;
         var11 = var3.method_30486(class_6631.field_34338);
      } else if (var5 == Direction.field_809 && var4 == Direction.field_800) {
         var9 = 15;
         var12 = class_9022.field_46144;
      }

      BlockPos var13 = var2.method_6099(var3.method_30489(Direction.field_804), var9);
      var13 = var13.method_6099(var3.method_30489(Direction.field_800), var10);
      var1.add(new class_8600(this.field_38230, var6.method_4344(this.field_38231), var13, var11, var12));
   }

   private void method_34056(List<class_8600> var1, BlockPos var2, class_6631 var3, class_1002 var4) {
      BlockPos var7 = var2.method_6099(var3.method_30489(Direction.field_804), 1);
      var1.add(new class_8600(this.field_38230, var4.method_4349(this.field_38231), var7, var3, class_9022.field_46145));
   }
}
