package remapped;

public class class_553 implements class_4091 {
   private class_2733 field_3295;
   private class_9873 field_3296;
   private class_9514[] field_3293;
   private class_1549 field_3291;
   private class_1549 field_3292;
   private class_8830 field_3294;

   public class_553(class_2733 var1, class_9873 var2, class_9514[] var3) {
      this.field_3295 = var1;
      this.field_3296 = var2;
      this.field_3293 = var3;
      class_222 var6 = var1.method_12298();
      if (!var6.method_942().isPresent()) {
         this.field_3294 = new class_3681();
      } else {
         this.field_3294 = new class_5958();
      }
   }

   @Override
   public class_3999 method_16829(String var1) {
      class_3527 var4 = this.method_18896(var1);
      if (var4 == null) {
         class_3999 var5 = this.field_3294.method_40627(var1);
         return var5 == null ? null : var5;
      } else {
         return var4;
      }
   }

   @Override
   public class_1549 method_18897(String var1) {
      if (var1 == null) {
         return null;
      } else if (var1.indexOf(":") < 0) {
         if (this.field_3291 != null && var1.equals("this")) {
            return this.field_3291;
         } else if (this.field_3292 != null && var1.equals("part")) {
            return this.field_3292;
         } else {
            class_1549 var9 = this.field_3295.method_12291(this.field_3296, var1);
            if (var9 != null) {
               return var9;
            } else {
               for (int var10 = 0; var10 < this.field_3293.length; var10++) {
                  class_9514 var11 = this.field_3293[var10];
                  class_1549 var12 = var11.method_43912();
                  if (var1.equals(var12.method_7036())) {
                     return var12;
                  }

                  class_1549 var13 = var12.method_7044(var1);
                  if (var13 != null) {
                     return var13;
                  }
               }

               return null;
            }
         }
      } else {
         String[] var4 = class_3111.method_14302(var1, ":");
         class_1549 var5 = this.method_18897(var4[0]);

         for (int var6 = 1; var6 < var4.length; var6++) {
            String var7 = var4[var6];
            class_1549 var8 = var5.method_7044(var7);
            if (var8 == null) {
               return null;
            }

            var5 = var8;
         }

         return var5;
      }
   }

   @Override
   public class_3527 method_18896(String var1) {
      String[] var4 = class_3111.method_14302(var1, ".");
      if (var4.length == 2) {
         String var5 = var4[0];
         String var6 = var4[1];
         class_1549 var7 = this.method_18897(var5);
         if (var7 != null) {
            class_6689 var8 = class_6689.method_30676(var6);
            return var8 != null ? new class_3527(var1, var7, var8) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void method_2658(class_1549 var1) {
      this.field_3292 = var1;
   }

   public void method_2660(class_1549 var1) {
      this.field_3291 = var1;
   }
}
