package remapped;

import java.util.Random;

public class class_6011 extends class_1829 {
   private static String[] field_30619;
   public float field_30616;
   public float field_30611;
   public float field_30618;
   public float field_30610;
   public float field_30612;
   public float field_30613;
   public float field_30609;
   public float field_30608;
   private float field_30614;
   private float field_30620;
   private float field_30606;
   private float field_30607;
   private float field_30615;
   private float field_30617;

   public class_6011(class_6629<? extends class_6011> var1, World var2) {
      super(var1, var2);
      this.field_41717.setSeed((long)this.method_37145());
      this.field_30620 = 1.0F / (this.field_41717.nextFloat() + 1.0F) * 0.2F;
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_9228(this, this));
      this.field_29916.method_3485(1, new class_1607(this, null));
   }

   public static class_1313 method_27440() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 10.0);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.5F;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2229;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2668;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2581;
   }

   @Override
   public float method_26439() {
      return 0.4F;
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public void method_26606() {
      super.method_26606();
      this.field_30611 = this.field_30616;
      this.field_30610 = this.field_30618;
      this.field_30613 = this.field_30612;
      this.field_30608 = this.field_30609;
      this.field_30612 = this.field_30612 + this.field_30620;
      if ((double)this.field_30612 > Math.PI * 2) {
         if (!this.field_41768.field_33055) {
            this.field_30612 = (float)((double)this.field_30612 - (Math.PI * 2));
            if (this.field_41717.nextInt(10) == 0) {
               this.field_30620 = 1.0F / (this.field_41717.nextFloat() + 1.0F) * 0.2F;
            }

            this.field_41768.method_29587(this, (byte)19);
         } else {
            this.field_30612 = (float) (Math.PI * 2);
         }
      }

      if (!this.method_37134()) {
         this.field_30609 = class_9299.method_42804(class_9299.method_42818(this.field_30612)) * (float) Math.PI * 0.25F;
         if (!this.field_41768.field_33055) {
            double var5 = this.method_37098().field_7333;
            if (!this.isPotionActive(Effects.LevitationEffect)) {
               if (!this.method_37078()) {
                  var5 -= 0.08;
               }
            } else {
               var5 = 0.05 * (double)(this.method_26553(Effects.LevitationEffect).method_10333() + 1);
            }

            this.method_37214(0.0, var5 * 0.98F, 0.0);
         }

         this.field_30616 = (float)((double)this.field_30616 + (double)(-90.0F - this.field_30616) * 0.02);
      } else {
         if (!(this.field_30612 < (float) Math.PI)) {
            this.field_30609 = 0.0F;
            this.field_30614 *= 0.9F;
            this.field_30606 *= 0.99F;
         } else {
            float var3 = this.field_30612 / (float) Math.PI;
            this.field_30609 = class_9299.method_42818(var3 * var3 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if (!((double)var3 > 0.75)) {
               this.field_30606 *= 0.8F;
            } else {
               this.field_30614 = 1.0F;
               this.field_30606 = 1.0F;
            }
         }

         if (!this.field_41768.field_33055) {
            this.method_37214(
               (double)(this.field_30607 * this.field_30614), (double)(this.field_30615 * this.field_30614), (double)(this.field_30617 * this.field_30614)
            );
         }

         class_1343 var7 = this.method_37098();
         float var4 = class_9299.method_42842(method_37266(var7));
         this.field_29605 = this.field_29605
            + (-((float)class_9299.method_42821(var7.field_7336, var7.field_7334)) * (180.0F / (float)Math.PI) - this.field_29605) * 0.1F;
         this.field_41701 = this.field_29605;
         this.field_30618 = (float)((double)this.field_30618 + Math.PI * (double)this.field_30606 * 1.5);
         this.field_30616 = this.field_30616
            + (-((float)class_9299.method_42821((double)var4, var7.field_7333)) * (180.0F / (float)Math.PI) - this.field_30616) * 0.1F;
      }
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (super.method_37181(var1, var2) && this.method_26531() != null) {
         this.method_27438();
         return true;
      } else {
         return false;
      }
   }

   private class_1343 method_27441(class_1343 var1) {
      class_1343 var4 = var1.method_6212(this.field_30611 * (float) (Math.PI / 180.0));
      return var4.method_6192(-this.field_29611 * (float) (Math.PI / 180.0));
   }

   private void method_27438() {
      this.method_37155(class_463.field_2032, this.method_26439(), this.method_26547());
      class_1343 var3 = this.method_27441(new class_1343(0.0, -1.0, 0.0)).method_6214(this.method_37302(), this.method_37309(), this.method_37156());

      for (int var4 = 0; var4 < 30; var4++) {
         class_1343 var5 = this.method_27441(
            new class_1343((double)this.field_41717.nextFloat() * 0.6 - 0.3, -1.0, (double)this.field_41717.nextFloat() * 0.6 - 0.3)
         );
         class_1343 var6 = var5.method_6209(0.3 + (double)(this.field_41717.nextFloat() * 2.0F));
         ((class_6331)this.field_41768)
            .method_28957(
               class_3090.field_15368, var3.field_7336, var3.field_7333 + 0.5, var3.field_7334, 0, var6.field_7336, var6.field_7333, var6.field_7334, 0.1F
            );
      }
   }

   @Override
   public void method_26431(class_1343 var1) {
      this.method_37226(class_7412.field_37839, this.method_37098());
   }

   public static boolean method_27439(class_6629<class_6011> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var3.method_12165() > 45 && var3.method_12165() < var1.method_22552();
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 19) {
         super.method_37336(var1);
      } else {
         this.field_30612 = 0.0F;
      }
   }

   public void method_27444(float var1, float var2, float var3) {
      this.field_30607 = var1;
      this.field_30615 = var2;
      this.field_30617 = var3;
   }

   public boolean method_27442() {
      return this.field_30607 != 0.0F || this.field_30615 != 0.0F || this.field_30617 != 0.0F;
   }
}
