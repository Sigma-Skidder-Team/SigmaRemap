package remapped;

import org.apache.commons.lang3.mutable.MutableInt;

public final class class_6818 extends class_2309<class_8759, class_5936> {
   private static final Direction[] field_35161 = Direction.values();
   private static final Direction[] field_35160 = new Direction[]{Direction.field_818, Direction.field_800, Direction.field_809, Direction.field_804};

   public class_6818(class_5002 var1) {
      super(var1, class_2957.field_14437, new class_5936(var1));
   }

   @Override
   public int method_27700(long var1, long var3, int var5) {
      if (var3 != Long.MAX_VALUE) {
         if (var1 == Long.MAX_VALUE) {
            if (!this.field_11554.method_27142(var3)) {
               return 15;
            }

            var5 = 0;
         }

         if (var5 < 15) {
            MutableInt var8 = new MutableInt();
            class_2522 var9 = this.method_10615(var3, var8);
            if (var8.getValue() >= 15) {
               return 15;
            } else {
               int var10 = BlockPos.method_6080(var1);
               int var11 = BlockPos.method_6067(var1);
               int var12 = BlockPos.method_6092(var1);
               int var13 = BlockPos.method_6080(var3);
               int var14 = BlockPos.method_6067(var3);
               int var15 = BlockPos.method_6092(var3);
               boolean var16 = var10 == var13 && var12 == var15;
               int var17 = Integer.signum(var13 - var10);
               int var18 = Integer.signum(var14 - var11);
               int var19 = Integer.signum(var15 - var12);
               Direction var20;
               if (var1 != Long.MAX_VALUE) {
                  var20 = Direction.method_1032(var17, var18, var19);
               } else {
                  var20 = Direction.field_802;
               }

               class_2522 var21 = this.method_10615(var1, (MutableInt)null);
               if (var20 == null) {
                  class_4190 var22 = this.method_10614(var21, var1, Direction.field_802);
                  if (class_3370.method_15540(var22, class_3370.method_15536())) {
                     return 15;
                  }

                  int var23 = !var16 ? 0 : -1;
                  Direction var24 = Direction.method_1032(var17, var23, var19);
                  if (var24 == null) {
                     return 15;
                  }

                  class_4190 var25 = this.method_10614(var9, var3, var24.method_1046());
                  if (class_3370.method_15540(class_3370.method_15536(), var25)) {
                     return 15;
                  }
               } else {
                  class_4190 var26 = this.method_10614(var21, var1, var20);
                  class_4190 var28 = this.method_10614(var9, var3, var20.method_1046());
                  if (class_3370.method_15540(var26, var28)) {
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
   public void method_27701(long var1, int var3, boolean var4) {
      long var7 = class_6979.method_31903(var1);
      int var9 = BlockPos.method_6067(var1);
      int var10 = class_6979.method_31913(var9);
      int var11 = class_6979.method_31915(var9);
      int var13;
      if (var10 == 0) {
         int var12 = 0;

         while (!this.field_11554.method_17749(class_6979.method_31927(var7, 0, -var12 - 1, 0)) && this.field_11554.method_27138(var11 - var12 - 1)) {
            var12++;
         }

         var13 = var12;
      } else {
         var13 = 0;
      }

      long var14 = BlockPos.method_6096(var1, 0, -1 - var13 * 16, 0);
      long var16 = class_6979.method_31903(var14);
      if (var7 == var16 || this.field_11554.method_17749(var16)) {
         this.method_27687(var1, var14, var3, var4);
      }

      long var18 = BlockPos.method_6097(var1, Direction.field_817);
      long var20 = class_6979.method_31903(var18);
      if (var7 == var20 || this.field_11554.method_17749(var20)) {
         this.method_27687(var1, var18, var3, var4);
      }

      for (Direction var25 : field_35160) {
         int var26 = 0;

         do {
            long var27 = BlockPos.method_6096(var1, var25.method_1041(), -var26, var25.method_1034());
            long var29 = class_6979.method_31903(var27);
            if (var7 == var29) {
               this.method_27687(var1, var27, var3, var4);
               break;
            }

            if (this.field_11554.method_17749(var29)) {
               this.method_27687(var1, var27, var3, var4);
            }
         } while (++var26 > var13 * 16);
      }
   }

   @Override
   public int method_27695(long var1, long var3, int var5) {
      int var8 = var5;
      if (Long.MAX_VALUE != var3) {
         int var15 = this.method_27700(Long.MAX_VALUE, var1, 0);
         if (var5 > var15) {
            var8 = var15;
         }

         if (var8 == 0) {
            return var8;
         }
      }

      long var9 = class_6979.method_31903(var1);
      class_1201 var11 = this.field_11554.method_17744(var9, true);

      for (Direction var16 : field_35161) {
         long var17 = BlockPos.method_6097(var1, var16);
         long var19 = class_6979.method_31903(var17);
         class_1201 var21;
         if (var9 != var19) {
            var21 = this.field_11554.method_17744(var19, true);
         } else {
            var21 = var11;
         }

         if (var21 != null) {
            if (var17 != var3) {
               int var25 = this.method_27700(var17, var1, this.method_10617(var21, var17));
               if (var8 > var25) {
                  var8 = var25;
               }

               if (var8 == 0) {
                  return var8;
               }
            }
         } else if (var16 != Direction.field_802) {
            for (var17 = BlockPos.method_6087(var17);
               !this.field_11554.method_17749(var19) && !this.field_11554.method_27137(var19);
               var17 = BlockPos.method_6096(var17, 0, 16, 0)
            ) {
               var19 = class_6979.method_31928(var19, Direction.field_817);
            }

            class_1201 var22 = this.field_11554.method_17744(var19, true);
            if (var17 != var3) {
               int var23;
               if (var22 == null) {
                  var23 = !this.field_11554.method_27140(var19) ? 15 : 0;
               } else {
                  var23 = this.method_27700(var17, var1, this.method_10617(var22, var17));
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
   public void method_27702(long var1) {
      this.field_11554.method_17732();
      long var5 = class_6979.method_31903(var1);
      if (!this.field_11554.method_17749(var5)) {
         for (var1 = BlockPos.method_6087(var1);
            !this.field_11554.method_17749(var5) && !this.field_11554.method_27137(var5);
            var1 = BlockPos.method_6096(var1, 0, 16, 0)
         ) {
            var5 = class_6979.method_31928(var5, Direction.field_817);
         }

         if (this.field_11554.method_17749(var5)) {
            super.method_27702(var1);
         }
      } else {
         super.method_27702(var1);
      }
   }

   @Override
   public String method_10620(long var1) {
      return super.method_10620(var1) + (!this.field_11554.method_27137(var1) ? "" : "*");
   }
}
