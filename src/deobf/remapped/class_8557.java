package remapped;

import java.util.Random;

public class class_8557 extends class_2830 implements class_3978 {
   private static String[] field_43780;
   public static final class_7044 field_43779 = class_6023.field_30676;
   private static final class_4190[] field_43781 = new class_4190[]{
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   public class_8557(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(this.method_39380(), Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_43781[var1.<Integer>method_10313(this.method_39380())];
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, class_1331 var3) {
      return var1.method_8350(class_4783.field_23421);
   }

   public class_7044 method_39380() {
      return field_43779;
   }

   public int method_39381() {
      return 7;
   }

   public int method_39379(class_2522 var1) {
      return var1.<Integer>method_10313(this.method_39380());
   }

   public class_2522 method_39384(int var1) {
      return this.method_29260().method_10308(this.method_39380(), Integer.valueOf(var1));
   }

   public boolean method_39383(class_2522 var1) {
      return var1.<Integer>method_10313(this.method_39380()) >= this.method_39381();
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return !this.method_39383(var1);
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var2.method_25261(var3, 0) >= 9) {
         int var7 = this.method_39379(var1);
         if (var7 < this.method_39381()) {
            float var8 = method_39377(this, var2, var3);
            if (var4.nextInt((int)(25.0F / var8) + 1) == 0) {
               var2.method_7513(var3, this.method_39384(var7 + 1), 2);
            }
         }
      }
   }

   public void method_39385(World var1, class_1331 var2, class_2522 var3) {
      int var6 = this.method_39379(var3) + this.method_39378(var1);
      int var7 = this.method_39381();
      if (var6 > var7) {
         var6 = var7;
      }

      var1.method_7513(var2, this.method_39384(var6), 2);
   }

   public int method_39378(World var1) {
      return class_9299.method_42824(var1.field_33033, 2, 5);
   }

   public static float method_39377(class_6414 var0, class_6163 var1, class_1331 var2) {
      float var5 = 1.0F;
      class_1331 var6 = var2.method_6100();

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            float var9 = 0.0F;
            class_2522 var10 = var1.method_28262(var6.method_6104(var7, 0, var8));
            if (var10.method_8350(class_4783.field_23421)) {
               var9 = 1.0F;
               if (var10.<Integer>method_10313(class_1653.field_8592) > 0) {
                  var9 = 3.0F;
               }
            }

            if (var7 != 0 || var8 != 0) {
               var9 /= 4.0F;
            }

            var5 += var9;
         }
      }

      class_1331 var14 = var2.method_6094();
      class_1331 var15 = var2.method_6073();
      class_1331 var16 = var2.method_6108();
      class_1331 var17 = var2.method_6090();
      boolean var11 = var0 == var1.method_28262(var16).method_8360() || var0 == var1.method_28262(var17).method_8360();
      boolean var12 = var0 == var1.method_28262(var14).method_8360() || var0 == var1.method_28262(var15).method_8360();
      if (var11 && var12) {
         var5 /= 2.0F;
      } else {
         boolean var13 = var0 == var1.method_28262(var16.method_6094()).method_8360()
            || var0 == var1.method_28262(var17.method_6094()).method_8360()
            || var0 == var1.method_28262(var17.method_6073()).method_8360()
            || var0 == var1.method_28262(var16.method_6073()).method_8360();
         if (var13) {
            var5 /= 2.0F;
         }
      }

      return var5;
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return (var2.method_25261(var3, 0) >= 8 || var2.method_25263(var3)) && super.method_10787(var1, var2, var3);
   }

   @Override
   public void method_10784(class_2522 var1, World var2, class_1331 var3, Entity var4) {
      if (var4 instanceof class_7885 && var2.method_29537().method_1285(class_291.field_1047)) {
         var2.method_7511(var3, true, var4);
      }

      super.method_10784(var1, var2, var3, var4);
   }

   public class_8525 method_39382() {
      return class_4897.field_24621;
   }

   @Override
   public ItemStack method_29276(class_6163 var1, class_1331 var2, class_2522 var3) {
      return new ItemStack(this.method_39382());
   }

   @Override
   public boolean method_18358(class_6163 var1, class_1331 var2, class_2522 var3, boolean var4) {
      return !this.method_39383(var3);
   }

   @Override
   public boolean method_18357(World var1, Random var2, class_1331 var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, class_1331 var3, class_2522 var4) {
      this.method_39385(var1, var3, var4);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_43779);
   }
}
