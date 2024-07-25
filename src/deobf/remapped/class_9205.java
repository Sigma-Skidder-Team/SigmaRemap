package remapped;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public class class_9205 extends class_2089 implements IRenderable, class_5888 {
   private static final Identifier field_47096 = new Identifier("textures/gui/recipe_book.png");
   private final List<class_2285> field_47099 = Lists.newArrayList();
   private boolean field_47098;
   private int field_47090;
   private int field_47094;
   private MinecraftClient field_47100;
   private class_7735 field_47093;
   private class_8932<?> field_47097;
   private float field_47092;
   private boolean field_47091;

   public void method_42465(MinecraftClient var1, class_7735 var2, int var3, int var4, int var5, int var6, float var7) {
      this.field_47100 = var1;
      this.field_47093 = var2;
      if (var1.field_9632.field_3874 instanceof class_8383) {
         this.field_47091 = true;
      }

      boolean var10 = var1.field_9632.method_27334().method_5079((class_3954<?>)var1.field_9632.field_3874);
      List var11 = var2.method_35011(true);
      List var12 = !var10 ? var2.method_35011(false) : Collections.emptyList();
      int var13 = var11.size();
      int var14 = var13 + var12.size();
      int var15 = var14 > 16 ? 5 : 4;
      int var16 = (int)Math.ceil((double)((float)var14 / (float)var15));
      this.field_47090 = var3;
      this.field_47094 = var4;
      byte var17 = 25;
      float var18 = (float)(this.field_47090 + Math.min(var14, var15) * 25);
      float var19 = (float)(var5 + 50);
      if (var18 > var19) {
         this.field_47090 = (int)((float)this.field_47090 - var7 * (float)((int)((var18 - var19) / var7)));
      }

      float var20 = (float)(this.field_47094 + var16 * 25);
      float var21 = (float)(var6 + 50);
      if (var20 > var21) {
         this.field_47094 = (int)((float)this.field_47094 - var7 * (float)class_9299.method_42816((var20 - var21) / var7));
      }

      float var22 = (float)this.field_47094;
      float var23 = (float)(var6 - 100);
      if (var22 < var23) {
         this.field_47094 = (int)((float)this.field_47094 - var7 * (float)class_9299.method_42816((var22 - var23) / var7));
      }

      this.field_47098 = true;
      this.field_47099.clear();

      for (int var24 = 0; var24 < var14; var24++) {
         boolean var25 = var24 < var13;
         class_8932 var26 = !var25 ? (class_8932)var12.get(var24 - var13) : (class_8932)var11.get(var24);
         int var27 = this.field_47090 + 4 + 25 * (var24 % var15);
         int var28 = this.field_47094 + 5 + 25 * (var24 / var15);
         if (!this.field_47091) {
            this.field_47099.add(new class_2285((int)this, var27, var28, (boolean)var26, var25));
         } else {
            this.field_47099.add(new class_4538((int)this, var27, var28, (boolean)var26, var25));
         }
      }

      this.field_47097 = null;
   }

   @Override
   public boolean method_26942(boolean var1) {
      return false;
   }

   public class_7735 method_42466() {
      return this.field_47093;
   }

   public class_8932<?> method_42471() {
      return this.field_47097;
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         for (class_2285 var9 : this.field_47099) {
            if (var9.method_26940(var1, var3, var5)) {
               this.field_47097 = class_2285.method_10531(var9);
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean method_26937(double var1, double var3) {
      return false;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_47098) {
         this.field_47092 += var4;
         class_3542.method_16488();
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_47100.method_8577().method_35674(field_47096);
         class_3542.method_16438();
         class_3542.method_16413(0.0F, 0.0F, 170.0F);
         int var7 = this.field_47099.size() > 16 ? 5 : 4;
         int var8 = Math.min(this.field_47099.size(), var7);
         int var9 = class_9299.method_42816((float)this.field_47099.size() / (float)var7);
         byte var10 = 24;
         byte var11 = 4;
         byte var12 = 82;
         short var13 = 208;
         this.method_42469(var1, var8, var9, 24, 4, 82, 208);
         class_3542.method_16448();

         for (class_2285 var15 : this.field_47099) {
            var15.method_6767(var1, var2, var3, var4);
         }

         class_3542.method_16489();
      }
   }

   private void method_42469(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method_9781(var1, this.field_47090, this.field_47094, var6, var7, var5, var5);
      this.method_9781(var1, this.field_47090 + var5 * 2 + var2 * var4, this.field_47094, var6 + var4 + var5, var7, var5, var5);
      this.method_9781(var1, this.field_47090, this.field_47094 + var5 * 2 + var3 * var4, var6, var7 + var4 + var5, var5, var5);
      this.method_9781(
         var1, this.field_47090 + var5 * 2 + var2 * var4, this.field_47094 + var5 * 2 + var3 * var4, var6 + var4 + var5, var7 + var4 + var5, var5, var5
      );

      for (int var10 = 0; var10 < var2; var10++) {
         this.method_9781(var1, this.field_47090 + var5 + var10 * var4, this.field_47094, var6 + var5, var7, var4, var5);
         this.method_9781(var1, this.field_47090 + var5 + (var10 + 1) * var4, this.field_47094, var6 + var5, var7, var5, var5);

         for (int var11 = 0; var11 < var3; var11++) {
            if (var10 == 0) {
               this.method_9781(var1, this.field_47090, this.field_47094 + var5 + var11 * var4, var6, var7 + var5, var5, var4);
               this.method_9781(var1, this.field_47090, this.field_47094 + var5 + (var11 + 1) * var4, var6, var7 + var5, var5, var5);
            }

            this.method_9781(var1, this.field_47090 + var5 + var10 * var4, this.field_47094 + var5 + var11 * var4, var6 + var5, var7 + var5, var4, var4);
            this.method_9781(var1, this.field_47090 + var5 + (var10 + 1) * var4, this.field_47094 + var5 + var11 * var4, var6 + var5, var7 + var5, var5, var4);
            this.method_9781(var1, this.field_47090 + var5 + var10 * var4, this.field_47094 + var5 + (var11 + 1) * var4, var6 + var5, var7 + var5, var4, var5);
            this.method_9781(
               var1,
               this.field_47090 + var5 + (var10 + 1) * var4 - 1,
               this.field_47094 + var5 + (var11 + 1) * var4 - 1,
               var6 + var5,
               var7 + var5,
               var5 + 1,
               var5 + 1
            );
            if (var10 == var2 - 1) {
               this.method_9781(
                  var1, this.field_47090 + var5 * 2 + var2 * var4, this.field_47094 + var5 + var11 * var4, var6 + var4 + var5, var7 + var5, var5, var4
               );
               this.method_9781(
                  var1, this.field_47090 + var5 * 2 + var2 * var4, this.field_47094 + var5 + (var11 + 1) * var4, var6 + var4 + var5, var7 + var5, var5, var5
               );
            }
         }

         this.method_9781(var1, this.field_47090 + var5 + var10 * var4, this.field_47094 + var5 * 2 + var3 * var4, var6 + var5, var7 + var4 + var5, var4, var5);
         this.method_9781(
            var1, this.field_47090 + var5 + (var10 + 1) * var4, this.field_47094 + var5 * 2 + var3 * var4, var6 + var5, var7 + var4 + var5, var5, var5
         );
      }
   }

   public void method_42474(boolean var1) {
      this.field_47098 = var1;
   }

   public boolean method_42468() {
      return this.field_47098;
   }
}
