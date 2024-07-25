package remapped;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_1549 {
   public float field_8198 = 64.0F;
   public float field_8202 = 32.0F;
   private int field_8192;
   private int field_8186;
   public float field_8183;
   public float field_8181;
   public float field_8187;
   public float field_8191;
   public float field_8190;
   public float field_8185;
   public boolean field_8197;
   public boolean field_8200 = true;
   public final ObjectList<class_9230> field_8184 = new ObjectArrayList();
   public final ObjectList<class_1549> field_8189 = new ObjectArrayList();
   public List field_8188 = new ArrayList();
   public boolean field_8204 = false;
   public float field_8201 = 1.0F;
   public float field_8182 = 1.0F;
   public float field_8193 = 1.0F;
   private Identifier field_8203 = null;
   private String field_8199 = null;
   private class_4776 field_8194;
   private class_4316 field_8196 = class_3111.method_14387();

   public class_1549(class_9873 var1) {
      var1.accept(this);
      this.method_7033(var1.field_49928, var1.field_49927);
   }

   public class_1549(class_9873 var1, int var2, int var3) {
      this(var1.field_49928, var1.field_49927, var2, var3);
      var1.accept(this);
   }

   public class_1549(int var1, int var2, int var3, int var4) {
      this.method_7033(var1, var2);
      this.method_7037(var3, var4);
   }

   private class_1549() {
   }

   public class_1549 method_7038() {
      class_1549 var3 = new class_1549();
      var3.method_7034(this);
      return var3;
   }

   public void method_7034(class_1549 var1) {
      this.field_8191 = var1.field_8191;
      this.field_8190 = var1.field_8190;
      this.field_8185 = var1.field_8185;
      this.field_8183 = var1.field_8183;
      this.field_8181 = var1.field_8181;
      this.field_8187 = var1.field_8187;
   }

   public void method_7043(class_1549 var1) {
      this.field_8189.add(var1);
   }

   public class_1549 method_7037(int var1, int var2) {
      this.field_8192 = var1;
      this.field_8186 = var2;
      return this;
   }

   public class_1549 method_7054(String var1, float var2, float var3, float var4, int var5, int var6, int var7, float var8, int var9, int var10) {
      this.method_7037(var9, var10);
      this.method_7053(this.field_8192, this.field_8186, var2, var3, var4, (float)var5, (float)var6, (float)var7, var8, var8, var8, this.field_8197, false);
      return this;
   }

   public class_1549 method_7048(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_7053(this.field_8192, this.field_8186, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, this.field_8197, false);
      return this;
   }

   public class_1549 method_7052(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      this.method_7053(this.field_8192, this.field_8186, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, false);
      return this;
   }

   public void method_7049(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_7053(this.field_8192, this.field_8186, var1, var2, var3, var4, var5, var6, var7, var7, var7, this.field_8197, false);
   }

   public void method_7050(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.method_7053(this.field_8192, this.field_8186, var1, var2, var3, var4, var5, var6, var7, var8, var9, this.field_8197, false);
   }

   public void method_7051(float var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8) {
      this.method_7053(this.field_8192, this.field_8186, var1, var2, var3, var4, var5, var6, var7, var7, var7, var8, false);
   }

   private void method_7053(
      int var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13
   ) {
      this.field_8184.add(new class_9230(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, this.field_8198, this.field_8202));
   }

   public void method_7046(float var1, float var2, float var3) {
      this.field_8183 = var1;
      this.field_8181 = var2;
      this.field_8187 = var3;
   }

   public void method_7060(class_7966 var1, class_7907 var2, int var3, int var4) {
      this.method_7061(var1, var2, var3, var4, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void method_7061(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.field_8200 && (!this.field_8184.isEmpty() || !this.field_8189.isEmpty() || !this.field_8188.isEmpty())) {
         class_3581 var11 = null;
         class_3758 var12 = null;
         if (this.field_8203 != null) {
            if (this.field_8196.field_20923) {
               return;
            }

            var12 = var2.method_35733();
            if (var12 != null) {
               var11 = var12.method_17419();
               var2 = var12.method_17417(this.field_8203, var2);
            }
         }

         if (this.field_8194 != null) {
            this.field_8194.method_22013();
         }

         var1.method_36063();
         this.method_7057(var1);
         this.method_7059(var1.method_36058(), var2, var3, var4, var5, var6, var7, var8);
         int var13 = this.field_8189.size();

         for (int var14 = 0; var14 < var13; var14++) {
            class_1549 var15 = (class_1549)this.field_8189.get(var14);
            var15.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         int var17 = this.field_8188.size();

         for (int var18 = 0; var18 < var17; var18++) {
            class_4905 var16 = (class_4905)this.field_8188.get(var18);
            var16.method_22453(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         var1.method_36064();
         if (var11 != null) {
            var12.method_11645(var11);
         }
      }
   }

   public void method_7057(class_7966 var1) {
      var1.method_36065((double)(this.field_8183 / 16.0F), (double)(this.field_8181 / 16.0F), (double)(this.field_8187 / 16.0F));
      if (this.field_8185 != 0.0F) {
         var1.method_36060(class_2426.field_12076.method_11062(this.field_8185));
      }

      if (this.field_8190 != 0.0F) {
         var1.method_36060(class_2426.field_12074.method_11062(this.field_8190));
      }

      if (this.field_8191 != 0.0F) {
         var1.method_36060(class_2426.field_12080.method_11062(this.field_8191));
      }
   }

   private void method_7059(class_6279 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      class_8107 var11 = var1.method_28620();
      class_6555 var12 = var1.method_28618();
      int var13 = this.field_8184.size();

      for (int var14 = 0; var14 < var13; var14++) {
         class_9230 var15 = (class_9230)this.field_8184.get(var14);
         int var16 = class_9230.method_42583(var15).length;

         for (int var17 = 0; var17 < var16; var17++) {
            class_1900 var18 = class_9230.method_42583(var15)[var17];
            if (var18 != null) {
               class_2426 var19 = var2.method_35754(var18.field_9703);
               var19.method_11059(var12);
               float var20 = var19.method_11057();
               float var21 = var19.method_11061();
               float var22 = var19.method_11055();

               for (int var23 = 0; var23 < 4; var23++) {
                  class_3802 var24 = var18.field_9701[var23];
                  float var25 = var24.field_18605.method_11057() / 16.0F;
                  float var26 = var24.field_18605.method_11061() / 16.0F;
                  float var27 = var24.field_18605.method_11055() / 16.0F;
                  float var28 = var11.method_36805(var25, var26, var27, 1.0F);
                  float var29 = var11.method_36812(var25, var26, var27, 1.0F);
                  float var30 = var11.method_36815(var25, var26, var27, 1.0F);
                  var2.method_35744(var28, var29, var30, var5, var6, var7, var8, var24.field_18604, var24.field_18606, var4, var3, var20, var21, var22);
               }
            }
         }
      }
   }

   public class_1549 method_7033(int var1, int var2) {
      this.field_8198 = (float)var1;
      this.field_8202 = (float)var2;
      return this;
   }

   public class_9230 method_7047(Random var1) {
      return (class_9230)this.field_8184.get(var1.nextInt(this.field_8184.size()));
   }

   public void method_7039(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.field_8188.add(new class_4905(this, this.field_8192, this.field_8186, var1, var2, var3, var4, var5, var6, var7));
   }

   public Identifier method_7045() {
      return this.field_8203;
   }

   public void method_7058(Identifier var1) {
      this.field_8203 = var1;
   }

   public String method_7036() {
      return this.field_8199;
   }

   public void method_7035(String var1) {
      this.field_8199 = var1;
   }

   public void method_7055(int[][] var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.field_8184.add(new class_9230(var1, var2, var3, var4, var5, var6, var7, var8, var8, var8, this.field_8197, this.field_8198, this.field_8202));
   }

   public class_1549 method_7041(int var1) {
      if (this.field_8189 == null) {
         return null;
      } else {
         return var1 >= 0 && var1 < this.field_8189.size() ? (class_1549)this.field_8189.get(var1) : null;
      }
   }

   public class_1549 method_7042(String var1) {
      if (var1 == null) {
         return null;
      } else {
         if (this.field_8189 != null) {
            for (int var4 = 0; var4 < this.field_8189.size(); var4++) {
               class_1549 var5 = (class_1549)this.field_8189.get(var4);
               if (var1.equals(var5.method_7036())) {
                  return var5;
               }
            }
         }

         return null;
      }
   }

   public class_1549 method_7044(String var1) {
      if (var1 != null) {
         class_1549 var4 = this.method_7042(var1);
         if (var4 != null) {
            return var4;
         } else {
            if (this.field_8189 != null) {
               for (int var5 = 0; var5 < this.field_8189.size(); var5++) {
                  class_1549 var6 = (class_1549)this.field_8189.get(var5);
                  class_1549 var7 = var6.method_7044(var1);
                  if (var7 != null) {
                     return var7;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public void method_7040(class_4776 var1) {
      this.field_8194 = var1;
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer();
      var3.append(
         "id: "
            + this.field_8199
            + ", boxes: "
            + (this.field_8184 == null ? null : this.field_8184.size())
            + ", submodels: "
            + (this.field_8189 == null ? null : this.field_8189.size())
      );
      return var3.toString();
   }
}
