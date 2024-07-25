package remapped;

public class class_9449 extends class_4088 {
   private static String[] field_48223;
   private final class_6867 field_48225;
   private final class_6844 field_48226;
   private final class_7934 field_48224;

   public class_9449(int var1, class_7051 var2) {
      this(var1, var2, new class_4657(5), new class_4799(2));
   }

   public class_9449(int var1, class_7051 var2, class_6867 var3, class_6844 var4) {
      super(class_4165.field_20249, var1);
      method_18858(var3, 5);
      method_18867(var4, 2);
      this.field_48225 = var3;
      this.field_48226 = var4;
      this.method_18885(new class_8120(var3, 0, 56, 51));
      this.method_18885(new class_8120(var3, 1, 79, 58));
      this.method_18885(new class_8120(var3, 2, 102, 51));
      this.field_48224 = this.method_18885(new class_6537(var3, 3, 79, 17));
      this.method_18885(new class_4804(var3, 4, 17, 17));
      this.method_18859(var4);

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.method_18885(new class_7934(var2, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.method_18885(new class_7934(var2, var9, 8 + var9 * 18, 142));
      }
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_48225.method_31502(var1);
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      class_6098 var5 = class_6098.field_31203;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         class_6098 var7 = var6.method_35898();
         var5 = var7.method_27973();
         if ((var2 < 0 || var2 > 2) && var2 != 3 && var2 != 4) {
            if (!class_4804.method_22135(var5)) {
               if (!this.field_48224.method_35889(var7)) {
                  if (class_8120.method_36947(var5) && var5.method_27997() == 1) {
                     if (!this.method_18892(var7, 0, 3, false)) {
                        return class_6098.field_31203;
                     }
                  } else if (var2 >= 5 && var2 < 32) {
                     if (!this.method_18892(var7, 32, 41, false)) {
                        return class_6098.field_31203;
                     }
                  } else if (var2 >= 32 && var2 < 41) {
                     if (!this.method_18892(var7, 5, 32, false)) {
                        return class_6098.field_31203;
                     }
                  } else if (!this.method_18892(var7, 5, 41, false)) {
                     return class_6098.field_31203;
                  }
               } else if (!this.method_18892(var7, 3, 4, false)) {
                  return class_6098.field_31203;
               }
            } else if (this.method_18892(var7, 4, 5, false) || this.field_48224.method_35889(var7) && !this.method_18892(var7, 3, 4, false)) {
               return class_6098.field_31203;
            }
         } else {
            if (!this.method_18892(var7, 5, 41, true)) {
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

         var6.method_35892(var1, var7);
      }

      return var5;
   }

   public int method_43700() {
      return this.field_48226.method_31408(1);
   }

   public int method_43701() {
      return this.field_48226.method_31408(0);
   }
}
