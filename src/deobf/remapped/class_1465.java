package remapped;

public class class_1465 extends class_4088 {
   private static String[] field_7876;
   private final class_6867 field_7877;
   private final int field_7875;

   private class_1465(class_4165<?> var1, int var2, class_7051 var3, int var4) {
      this(var1, var2, var3, new class_4657(9 * var4), var4);
   }

   public static class_1465 method_6773(int var0, class_7051 var1) {
      return new class_1465(class_4165.field_20257, var0, var1, 1);
   }

   public static class_1465 method_6772(int var0, class_7051 var1) {
      return new class_1465(class_4165.field_20251, var0, var1, 2);
   }

   public static class_1465 method_6775(int var0, class_7051 var1) {
      return new class_1465(class_4165.field_20259, var0, var1, 3);
   }

   public static class_1465 method_6769(int var0, class_7051 var1) {
      return new class_1465(class_4165.field_20261, var0, var1, 4);
   }

   public static class_1465 method_6774(int var0, class_7051 var1) {
      return new class_1465(class_4165.field_20252, var0, var1, 5);
   }

   public static class_1465 method_6770(int var0, class_7051 var1) {
      return new class_1465(class_4165.field_20256, var0, var1, 6);
   }

   public static class_1465 method_6776(int var0, class_7051 var1, class_6867 var2) {
      return new class_1465(class_4165.field_20259, var0, var1, var2, 3);
   }

   public static class_1465 method_6771(int var0, class_7051 var1, class_6867 var2) {
      return new class_1465(class_4165.field_20256, var0, var1, var2, 6);
   }

   public class_1465(class_4165<?> var1, int var2, class_7051 var3, class_6867 var4, int var5) {
      super(var1, var2);
      method_18858(var4, var5 * 9);
      this.field_7877 = var4;
      this.field_7875 = var5;
      var4.method_31501(var3.field_36409);
      int var8 = (this.field_7875 - 4) * 18;

      for (int var9 = 0; var9 < this.field_7875; var9++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.method_18885(new class_7934(var4, var10 + var9 * 9, 8 + var10 * 18, 18 + var9 * 18));
         }
      }

      for (int var11 = 0; var11 < 3; var11++) {
         for (int var13 = 0; var13 < 9; var13++) {
            this.method_18885(new class_7934(var3, var13 + var11 * 9 + 9, 8 + var13 * 18, 103 + var11 * 18 + var8));
         }
      }

      for (int var12 = 0; var12 < 9; var12++) {
         this.method_18885(new class_7934(var3, var12, 8 + var12 * 18, 161 + var8));
      }
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_7877.method_31502(var1);
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 >= this.field_7875 * 9) {
            if (!this.method_18892(var7, 0, this.field_7875 * 9, false)) {
               return class_6098.field_31203;
            }
         } else if (!this.method_18892(var7, this.field_7875 * 9, this.field_19926.size(), true)) {
            return class_6098.field_31203;
         }

         if (!var7.method_28022()) {
            var6.method_35887();
         } else {
            var6.method_35896(class_6098.field_31203);
         }
      }

      return var5;
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      this.field_7877.method_31499(var1);
   }

   public class_6867 method_6778() {
      return this.field_7877;
   }

   public int method_6777() {
      return this.field_7875;
   }
}
