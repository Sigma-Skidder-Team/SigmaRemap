package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_1996 extends class_2612 implements class_1768 {
   public final class_5664 field_10143;
   private List<class_6220> field_10142 = new ArrayList<class_6220>();
   private boolean field_10145;
   private boolean field_10140;
   private float field_10144 = 1.0F;

   public class_1996(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_5664 var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_10143 = var7;
      this.field_10140 = true;
      ((class_3407)var1).field_16773 = 1.0F;
      this.field_10140 = true;
      this.method_32105(false);
      this.method_9266();
   }

   public void method_9266() {
      int var3 = 0;

      for (class_9128 var5 : SigmaMainClass.method_3328().method_3298().method_844(this.field_10143)) {
         int var9 = class_314.method_1444(-3487030, 0.0F);
         byte var10 = 30;
         class_590 var12 = new class_590(!var5.method_42015() ? 1895167477 : -14047489, !var5.method_42015() ? var9 : -14042881)
            .method_2765(!var5.method_42015() ? class_1255.field_6929.field_6917 : class_1255.field_6918.field_6917);
         var12.method_2776(class_6206.field_31724);
         class_6220 var13;
         this.method_11850()
            .method_32148(
               var13 = new class_6220(
                  this.method_11850(),
                  var5.method_41992() + "Button",
                  0,
                  var3 * 30,
                  this.method_32109(),
                  30,
                  var12,
                  var5.method_41992(),
                  class_5320.field_27152
               )
            );
         if (!var5.method_42015()) {
            var13.method_28444(22);
         } else {
            var13.method_28444(30);
         }

         this.field_10142.add(var13);
         var13.method_32100(
            (var3x, var4) -> {
               class_6220 var7 = (class_6220)var3x;
               if (var4 != 0) {
                  if (var4 == 1) {
                     class_3407 var8 = (class_3407)this.method_32167();
                     var8.method_15729(var5);
                  }
               } else {
                  var5.method_41999();
                  class_590 var9x = new class_590(!var5.method_42015() ? 1895167477 : -14047489, !var5.method_42015() ? var9 : -14042881)
                     .method_2765(!var5.method_42015() ? class_1255.field_6929.field_6917 : class_1255.field_6918.field_6917);
                  if (!var5.method_42015()) {
                     var7.method_28444(22);
                  } else {
                     var7.method_28444(30);
                  }

                  var9x.method_2776(class_6206.field_31724);
                  var7.method_32113(var9x);
               }
            }
         );
         var13.method_32135(new class_8395());
         var3++;
      }

      this.method_11850().method_32153(new class_8348(1));
   }

   private float method_9268() {
      return this.field_10144 * this.field_10144 * (3.0F - 2.0F * this.field_10144);
   }

   private float method_9267(float var1, float var2, float var3, float var4) {
      var1 /= var4 / 2.0F;
      if (!(var1 < 1.0F)) {
         var1--;
         return -var3 / 2.0F * (var1 * (var1 - 2.0F) - 1.0F) + var2;
      } else {
         return var3 / 2.0F * var1 * var1 + var2;
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      class_3407 var5 = (class_3407)this.field_36283;
      class_1893.method_8510();
      float var6 = (float)(0.07F * (60.0 / (double)class_1893.method_8501()));
      this.field_10144 = this.field_10144 + (!this.method_7901() ? 0.0F : (!this.field_10140 ? var6 : -var6));
      this.field_10144 = Math.max(0.0F, Math.min(1.0F, this.field_10144));
      var5.field_16773 = this.method_9267(this.field_10144, 0.0F, 1.0F, 1.0F);
      if (this.method_7901()) {
         this.method_32104(true);
         if (!(var5.field_16773 <= 0.0F)) {
            if (var5.field_16773 >= 1.0F) {
               this.field_10145 = false;
               this.field_10140 = true;
               this.method_32187(true);
               this.method_32177(true);
               this.method_32119(true);
               var5.field_16773 = 1.0F;
            }
         } else {
            this.field_10145 = false;
            this.field_10140 = false;
            this.method_32187(false);
            this.method_32177(false);
            this.method_32119(false);
            var5.field_16773 = 0.0F;
         }
      }
   }

   @Override
   public void method_32178(float var1) {
      this.method_32130();
      super.method_32178(var1 * ((class_3407)this.field_36283).field_16773);
   }

   @Override
   public boolean method_7901() {
      return this.field_10145;
   }

   @Override
   public void method_7903() {
      this.field_10145 = true;
   }

   @Override
   public boolean method_7904() {
      return this.field_10140;
   }

   @Override
   public void method_7902(boolean var1) {
      if (var1 != this.method_7904()) {
         this.method_7903();
      }
   }

   public int method_9265(class_9128 var1) {
      int var4 = 0;

      for (class_6220 var6 : this.field_10142) {
         var4++;
         if (var6.method_32176().equals(var1.method_41992() + "Button")) {
            break;
         }
      }

      return var4 * 30;
   }
}
