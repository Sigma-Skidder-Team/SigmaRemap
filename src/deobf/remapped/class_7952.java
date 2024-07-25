package remapped;

public class class_7952 extends class_4088 {
   private static String[] field_40683;
   private final class_6867 field_40684;

   public class_7952(int var1, class_7051 var2) {
      this(var1, var2, new class_4657(5));
   }

   public class_7952(int var1, class_7051 var2, class_6867 var3) {
      super(class_4165.field_20265, var1);
      this.field_40684 = var3;
      method_18858(var3, 5);
      var3.method_31501(var2.field_36409);
      byte var6 = 51;

      for (int var7 = 0; var7 < 5; var7++) {
         this.method_18885(new class_7934(var3, var7, 44 + var7 * 18, 20));
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.method_18885(new class_7934(var2, var8 + var9 * 9 + 9, 8 + var8 * 18, var9 * 18 + 51));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.method_18885(new class_7934(var2, var10, 8 + var10 * 18, 109));
      }
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_40684.method_31502(var1);
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 >= this.field_40684.method_31505()) {
            if (!this.method_18892(var7, 0, this.field_40684.method_31505(), false)) {
               return class_6098.field_31203;
            }
         } else if (!this.method_18892(var7, this.field_40684.method_31505(), this.field_19926.size(), true)) {
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
      this.field_40684.method_31499(var1);
   }
}
