package remapped;

import org.apache.commons.lang3.mutable.MutableInt;

public final class class_2975 extends class_2309<class_2271, class_9322> {
   private static String[] field_14624;
   private static final class_240[] field_14623 = class_240.values();
   private final class_2921 field_14622 = new class_2921();

   public class_2975(class_5002 var1) {
      super(var1, class_2957.field_14440, new class_9322(var1));
   }

   private int method_13617(long var1) {
      int var5 = class_1331.method_6080(var1);
      int var6 = class_1331.method_6067(var1);
      int var7 = class_1331.method_6092(var1);
      class_6163 var8 = this.field_11553.method_23025(var5 >> 4, var7 >> 4);
      return var8 == null ? 0 : var8.method_28263(this.field_14622.method_13362(var5, var6, var7));
   }

   @Override
   public int method_27700(long var1, long var3, int var5) {
      if (var3 != Long.MAX_VALUE) {
         if (var1 != Long.MAX_VALUE) {
            if (var5 < 15) {
               int var8 = Integer.signum(class_1331.method_6080(var3) - class_1331.method_6080(var1));
               int var9 = Integer.signum(class_1331.method_6067(var3) - class_1331.method_6067(var1));
               int var10 = Integer.signum(class_1331.method_6092(var3) - class_1331.method_6092(var1));
               class_240 var11 = class_240.method_1032(var8, var9, var10);
               if (var11 != null) {
                  MutableInt var12 = new MutableInt();
                  class_2522 var13 = this.method_10615(var3, var12);
                  if (var12.getValue() < 15) {
                     class_2522 var14 = this.method_10615(var1, (MutableInt)null);
                     class_4190 var15 = this.method_10614(var14, var1, var11);
                     class_4190 var16 = this.method_10614(var13, var3, var11.method_1046());
                     return !class_3370.method_15540(var15, var16) ? var5 + Math.max(1, var12.getValue()) : 15;
                  } else {
                     return 15;
                  }
               } else {
                  return 15;
               }
            } else {
               return var5;
            }
         } else {
            return var5 + 15 - this.method_13617(var3);
         }
      } else {
         return 15;
      }
   }

   @Override
   public void method_27701(long var1, int var3, boolean var4) {
      long var7 = class_6979.method_31903(var1);

      for (class_240 var12 : field_14623) {
         long var13 = class_1331.method_6097(var1, var12);
         long var15 = class_6979.method_31903(var13);
         if (var7 == var15 || this.field_11554.method_17749(var15)) {
            this.method_27687(var1, var13, var3, var4);
         }
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

      for (class_240 var16 : field_14623) {
         long var17 = class_1331.method_6097(var1, var16);
         if (var17 != var3) {
            long var19 = class_6979.method_31903(var17);
            class_1201 var21;
            if (var9 != var19) {
               var21 = this.field_11554.method_17744(var19, true);
            } else {
               var21 = var11;
            }

            if (var21 != null) {
               int var22 = this.method_27700(var17, var1, this.method_10617(var21, var17));
               if (var8 > var22) {
                  var8 = var22;
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
   public void method_10624(class_1331 var1, int var2) {
      this.field_11554.method_17732();
      this.method_27703(Long.MAX_VALUE, var1.method_6077(), 15 - var2, true);
   }
}
