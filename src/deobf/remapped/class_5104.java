package remapped;

public class class_5104 extends class_4088 {
   private static String[] field_26333;
   private final class_6867 field_26332;

   public class_5104(int var1, class_7051 var2) {
      this(var1, var2, new class_4657(27));
   }

   public class_5104(int var1, class_7051 var2, class_6867 var3) {
      super(class_4165.field_20246, var1);
      method_18858(var3, 27);
      this.field_26332 = var3;
      var3.method_31501(var2.field_36409);
      byte var6 = 3;
      byte var7 = 9;

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var9 = 0; var9 < 9; var9++) {
            this.method_18885(new class_1415(var3, var9 + var8 * 9, 8 + var9 * 18, 18 + var8 * 18));
         }
      }

      for (int var10 = 0; var10 < 3; var10++) {
         for (int var12 = 0; var12 < 9; var12++) {
            this.method_18885(new class_7934(var2, var12 + var10 * 9 + 9, 8 + var12 * 18, 84 + var10 * 18));
         }
      }

      for (int var11 = 0; var11 < 9; var11++) {
         this.method_18885(new class_7934(var2, var11, 8 + var11 * 18, 142));
      }
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_26332.method_31502(var1);
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 >= this.field_26332.method_31505()) {
            if (!this.method_18892(var7, 0, this.field_26332.method_31505(), false)) {
               return class_6098.field_31203;
            }
         } else if (!this.method_18892(var7, this.field_26332.method_31505(), this.field_19926.size(), true)) {
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
      this.field_26332.method_31499(var1);
   }
}
