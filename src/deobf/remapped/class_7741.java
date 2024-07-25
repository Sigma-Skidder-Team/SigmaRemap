package remapped;

public class class_7741 extends class_4088 {
   private static String[] field_39254;
   private final class_6867 field_39252;
   private final class_4109 field_39253;

   public class_7741(int var1, class_7051 var2, class_6867 var3, class_4109 var4) {
      super((class_4165<?>)null, var1);
      this.field_39252 = var3;
      this.field_39253 = var4;
      byte var7 = 3;
      var3.method_31501(var2.field_36409);
      byte var8 = -18;
      this.method_18885(new class_3849(this, var3, 0, 8, 18, var4));
      this.method_18885(new class_2742(this, var3, 1, 8, 36, var4));
      if (var4 instanceof class_5521 && ((class_5521)var4).method_25017()) {
         for (int var9 = 0; var9 < 3; var9++) {
            for (int var10 = 0; var10 < ((class_5521)var4).method_25019(); var10++) {
               this.method_18885(new class_7934(var3, 2 + var10 + var9 * ((class_5521)var4).method_25019(), 80 + var10 * 18, 18 + var9 * 18));
            }
         }
      }

      for (int var11 = 0; var11 < 3; var11++) {
         for (int var13 = 0; var13 < 9; var13++) {
            this.method_18885(new class_7934(var2, var13 + var11 * 9 + 9, 8 + var13 * 18, 102 + var11 * 18 + -18));
         }
      }

      for (int var12 = 0; var12 < 9; var12++) {
         this.method_18885(new class_7934(var2, var12, 8 + var12 * 18, 142));
      }
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_39252.method_31502(var1) && this.field_39253.method_37330() && this.field_39253.method_37175(var1) < 8.0F;
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         int var8 = this.field_39252.method_31505();
         if (var2 >= var8) {
            if (this.method_18878(1).method_35889(var7) && !this.method_18878(1).method_35884()) {
               if (!this.method_18892(var7, 1, 2, false)) {
                  return class_6098.field_31203;
               }
            } else if (!this.method_18878(0).method_35889(var7)) {
               if (var8 <= 2 || !this.method_18892(var7, 2, var8, false)) {
                  int var9 = var8 + 27;
                  int var10 = var9 + 9;
                  if (var2 >= var9 && var2 < var10) {
                     if (!this.method_18892(var7, var8, var9, false)) {
                        return class_6098.field_31203;
                     }
                  } else if (var2 >= var8 && var2 < var9) {
                     if (!this.method_18892(var7, var9, var10, false)) {
                        return class_6098.field_31203;
                     }
                  } else if (!this.method_18892(var7, var9, var9, false)) {
                     return class_6098.field_31203;
                  }

                  return class_6098.field_31203;
               }
            } else if (!this.method_18892(var7, 0, 1, false)) {
               return class_6098.field_31203;
            }
         } else if (!this.method_18892(var7, var8, this.field_19926.size(), true)) {
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
      this.field_39252.method_31499(var1);
   }
}
