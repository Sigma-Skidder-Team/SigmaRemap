package remapped;

import java.util.ArrayList;

public class class_181 implements class_1338 {
   private static String[] field_603;
   private int field_606;
   private int field_604;
   private float field_605 = 0.2F;
   private boolean field_607;

   public class_8209 method_816(class_1574 var1) {
      return this.method_817(var1, true);
   }

   public class_8209 method_817(class_1574 var1, boolean var2) {
      this.field_607 = var2;
      ArrayList var5 = new ArrayList();
      if (!var2) {
         class_2457 var6 = new class_2457(0.0F, 0.0F, (float)var1.method_7110(), (float)var1.method_7108());
         this.method_815(var1, var6, var5);
      } else {
         for (int var8 = 0; var8 < var1.method_7110(); var8++) {
            for (int var7 = 0; var7 < var1.method_7108(); var7++) {
               if (!var1.method_7106(this, var8, var7)) {
                  var5.add(new class_2457((float)var8, (float)var7, 1.0F, 1.0F));
               }
            }
         }
      }

      while (this.method_818(var5)) {
      }

      this.method_814(var5);
      return new class_8209(var5);
   }

   private boolean method_818(ArrayList var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         class_2457 var5 = (class_2457)var1.get(var4);

         for (int var6 = var4 + 1; var6 < var1.size(); var6++) {
            class_2457 var7 = (class_2457)var1.get(var6);
            if (var5.method_11315(var7)) {
               var1.remove(var5);
               var1.remove(var7);
               var1.add(var5.method_11326(var7));
               return true;
            }
         }
      }

      return false;
   }

   private void method_814(ArrayList var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         class_2457 var5 = (class_2457)var1.get(var4);

         for (int var6 = var4 + 1; var6 < var1.size(); var6++) {
            class_2457 var7 = (class_2457)var1.get(var6);
            if (var5.method_11327(var7)) {
               var5.method_11325(var7);
               var7.method_11325(var5);
            }
         }
      }
   }

   public boolean method_813(class_1574 var1, class_2457 var2) {
      if (this.field_607) {
         return true;
      } else {
         float var5 = 0.0F;
         boolean var6 = false;

         while (var5 < var2.method_11320()) {
            float var7 = 0.0F;
            boolean var8 = false;

            while (var7 < var2.method_11324()) {
               this.field_606 = (int)(var2.method_11322() + var5);
               this.field_604 = (int)(var2.method_11312() + var7);
               if (var1.method_7106(this, this.field_606, this.field_604)) {
                  return false;
               }

               var7 += 0.1F;
               if (var7 > var2.method_11324() && !var8) {
                  var7 = var2.method_11324();
                  var8 = true;
               }
            }

            var5 += 0.1F;
            if (var5 > var2.method_11320() && !var6) {
               var5 = var2.method_11320();
               var6 = true;
            }
         }

         return true;
      }
   }

   private void method_815(class_1574 var1, class_2457 var2, ArrayList var3) {
      if (this.method_813(var1, var2)) {
         var3.add(var2);
      } else {
         float var6 = var2.method_11320() / 2.0F;
         float var7 = var2.method_11324() / 2.0F;
         if (var6 < this.field_605 && var7 < this.field_605) {
            return;
         }

         this.method_815(var1, new class_2457(var2.method_11322(), var2.method_11312(), var6, var7), var3);
         this.method_815(var1, new class_2457(var2.method_11322(), var2.method_11312() + var7, var6, var7), var3);
         this.method_815(var1, new class_2457(var2.method_11322() + var6, var2.method_11312(), var6, var7), var3);
         this.method_815(var1, new class_2457(var2.method_11322() + var6, var2.method_11312() + var7, var6, var7), var3);
      }
   }

   @Override
   public class_2205 method_6178() {
      return null;
   }

   @Override
   public int method_6180() {
      return 0;
   }

   @Override
   public int method_6179() {
      return this.field_606;
   }

   @Override
   public int method_6181() {
      return this.field_604;
   }
}
