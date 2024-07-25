package remapped;

import java.util.Optional;

public class class_1722 extends class_3954<class_6946> {
   private static String[] field_8894;
   private final class_6946 field_8892 = new class_6946(this, 3, 3);
   private final class_7143 field_8893 = new class_7143();
   private final class_9210 field_8891;
   private final class_704 field_8890;

   public class_1722(int var1, class_7051 var2) {
      this(var1, var2, class_9210.field_47106);
   }

   public class_1722(int var1, class_7051 var2, class_9210 var3) {
      super(class_4165.field_20250, var1);
      this.field_8891 = var3;
      this.field_8890 = var2.field_36409;
      this.method_18885(new class_8725(var2.field_36409, this.field_8892, this.field_8893, 0, 124, 35));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 3; var7++) {
            this.method_18885(new class_7934(this.field_8892, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.method_18885(new class_7934(var2, var10 + var8 * 9 + 9, 8 + var10 * 18, 84 + var8 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.method_18885(new class_7934(var2, var9, 8 + var9 * 18, 142));
      }
   }

   public static void method_7714(int var0, World var1, class_704 var2, class_6946 var3, class_7143 var4) {
      if (!var1.field_33055) {
         class_9359 var7 = (class_9359)var2;
         class_6098 var8 = class_6098.field_31203;
         Optional var9 = var1.method_29522().method_1705().<class_6946, class_1504>method_23138(class_1510.field_7997, var3, var1);
         if (var9.isPresent()) {
            class_1504 var10 = (class_1504)var9.get();
            if (var4.method_41425(var1, var7, var10)) {
               var8 = var10.method_41042(var3);
            }
         }

         var4.method_31503(0, var8);
         var7.field_47794.method_4156(new class_5491(var0, 0, var8));
      }
   }

   @Override
   public void method_18853(class_6867 var1) {
      this.field_8891.method_42533((var1x, var2) -> method_7714(this.field_19925, var1x, this.field_8890, this.field_8892, this.field_8893));
   }

   @Override
   public void method_18269(class_534 var1) {
      this.field_8892.method_18279(var1);
   }

   @Override
   public void method_18270() {
      this.field_8892.method_24975();
      this.field_8893.method_24975();
   }

   @Override
   public boolean method_18267(class_8932<? super class_6946> var1) {
      return var1.method_41052(this.field_8892, this.field_8890.field_41768);
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      this.field_8891.method_42533((var2, var3) -> this.method_18887(var1, var2, this.field_8892));
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return method_18872(this.field_8891, var1, class_4783.field_23794);
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 != 0) {
            if (var2 >= 10 && var2 < 46) {
               if (!this.method_18892(var7, 1, 10, false)) {
                  if (var2 >= 37) {
                     if (!this.method_18892(var7, 10, 37, false)) {
                        return class_6098.field_31203;
                     }
                  } else if (!this.method_18892(var7, 37, 46, false)) {
                     return class_6098.field_31203;
                  }
               }
            } else if (!this.method_18892(var7, 10, 46, false)) {
               return class_6098.field_31203;
            }
         } else {
            this.field_8891.method_42533((var2x, var3) -> var7.method_27960().method_11236(var7, var2x, var1));
            if (!this.method_18892(var7, 10, 46, true)) {
               return class_6098.field_31203;
            }

            var6.method_35888(var7, var5);
         }

         if (!var7.method_28022()) {
            var6.method_35887();
         } else {
            var6.method_35896(class_6098.field_31203);
         }

         if (var7.method_27997() == var5.method_27997()) {
            return class_6098.field_31203;
         }

         class_6098 var8 = var6.method_35892(var1, var7);
         if (var2 == 0) {
            var1.method_3153(var8, false);
         }
      }

      return var5;
   }

   @Override
   public boolean method_18873(class_6098 var1, class_7934 var2) {
      return var2.field_40591 != this.field_8893 && super.method_18873(var1, var2);
   }

   @Override
   public int method_18262() {
      return 0;
   }

   @Override
   public int method_18268() {
      return this.field_8892.method_31781();
   }

   @Override
   public int method_18266() {
      return this.field_8892.method_31782();
   }

   @Override
   public int method_18265() {
      return 10;
   }

   @Override
   public class_4269 method_18263() {
      return class_4269.field_20684;
   }
}
