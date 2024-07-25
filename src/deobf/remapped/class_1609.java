package remapped;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class class_1609 extends class_4040 implements class_2354 {
   private static final UUID field_8353 = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final class_9343 field_8347 = new class_9343(field_8353, "Drinking speed penalty", -0.25, class_9342.field_47679);
   private static final class_7821<Boolean> field_8352 = class_8073.<Boolean>method_36641(class_1609.class, class_2734.field_13347);
   private int field_8351;
   private class_9625<class_4040> field_8348;
   private class_2978<class_704> field_8349;

   public class_1609(class_6629<? extends class_1609> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_8348 = new class_9625<class_4040>(
         this, class_4040.class, true, var1 -> var1 != null && this.method_18600() && var1.method_37387() != class_6629.field_34220
      );
      this.field_8349 = new class_2978<class_704>(this, class_704.class, 10, true, false, (Predicate<class_5834>)null);
      this.field_29916.method_3485(1, new class_787(this));
      this.field_29916.method_3485(2, new class_1837(this, 1.0, 60, 10.0F));
      this.field_29916.method_3485(2, new class_2889(this, 1.0));
      this.field_29916.method_3485(3, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(3, new class_9691(this));
      this.field_29908.method_3485(1, new class_8420(this, class_4040.class));
      this.field_29908.method_3485(2, this.field_8348);
      this.field_29908.method_3485(3, this.field_8349);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.method_37372().method_36634(field_8352, false);
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2199;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2874;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2244;
   }

   public void method_7189(boolean var1) {
      this.method_37372().method_36633(field_8352, var1);
   }

   public boolean method_7190() {
      return this.method_37372().<Boolean>method_36640(field_8352);
   }

   public static class_1313 method_7188() {
      return class_1173.method_5201().method_5984(class_7331.field_37468, 26.0).method_5984(class_7331.field_37465, 0.25);
   }

   @Override
   public void method_26606() {
      if (!this.field_41768.field_33055 && this.method_37330()) {
         this.field_8348.method_44424();
         if (this.field_8348.method_44423() > 0) {
            this.field_8349.method_13645(false);
         } else {
            this.field_8349.method_13645(true);
         }

         if (!this.method_7190()) {
            class_6004 var7 = null;
            if (this.field_41717.nextFloat() < 0.15F && this.method_37261(class_6503.field_33094) && !this.method_26480(Effects.field_19720)) {
               var7 = class_3697.field_18136;
            } else if (this.field_41717.nextFloat() < 0.15F
               && (this.method_37264() || this.method_26429() != null && this.method_26429().method_28360())
               && !this.method_26480(Effects.field_19745)) {
               var7 = class_3697.field_18121;
            } else if (this.field_41717.nextFloat() < 0.05F && this.method_26551() < this.method_26465()) {
               var7 = class_3697.field_18117;
            } else if (this.field_41717.nextFloat() < 0.5F
               && this.method_17809() != null
               && !this.method_26480(Effects.field_19739)
               && this.method_17809().method_37275(this) > 121.0) {
               var7 = class_3697.field_18143;
            }

            if (var7 != null) {
               this.method_37349(class_6943.field_35707, class_9541.method_43999(new class_6098(class_4897.field_25157), var7));
               this.field_8351 = this.method_26446().method_28004();
               this.method_7189(true);
               if (!this.method_37378()) {
                  this.field_41768
                     .method_29528(
                        (class_704)null,
                        this.method_37302(),
                        this.method_37309(),
                        this.method_37156(),
                        class_463.field_2010,
                        this.method_37197(),
                        1.0F,
                        0.8F + this.field_41717.nextFloat() * 0.4F
                     );
               }

               class_9747 var8 = this.method_26561(class_7331.field_37465);
               var8.method_45004(field_8347);
               var8.method_45011(field_8347);
            }
         } else if (this.field_8351-- <= 0) {
            this.method_7189(false);
            class_6098 var3 = this.method_26446();
            this.method_37349(class_6943.field_35707, class_6098.field_31203);
            if (var3.method_27960() == class_4897.field_25157) {
               List var4 = class_9541.method_43993(var3);
               if (var4 != null) {
                  for (class_2250 var6 : var4) {
                     this.method_26558(new class_2250(var6));
                  }
               }
            }

            this.method_26561(class_7331.field_37465).method_45004(field_8347);
         }

         if (this.field_41717.nextFloat() < 7.5E-4F) {
            this.field_41768.method_29587(this, (byte)15);
         }
      }

      super.method_26606();
   }

   @Override
   public class_8461 method_18591() {
      return class_463.field_2039;
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 15) {
         super.method_37336(var1);
      } else {
         for (int var4 = 0; var4 < this.field_41717.nextInt(35) + 10; var4++) {
            this.field_41768
               .method_43361(
                  class_3090.field_15342,
                  this.method_37302() + this.field_41717.nextGaussian() * 0.13F,
                  this.method_37241().field_19939 + 0.5 + this.field_41717.nextGaussian() * 0.13F,
                  this.method_37156() + this.field_41717.nextGaussian() * 0.13F,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }
   }

   @Override
   public float method_26477(class_6199 var1, float var2) {
      var2 = super.method_26477(var1, var2);
      if (var1.method_28372() == this) {
         var2 = 0.0F;
      }

      if (var1.method_28352()) {
         var2 = (float)((double)var2 * 0.15);
      }

      return var2;
   }

   @Override
   public void method_10805(class_5834 var1, float var2) {
      if (!this.method_7190()) {
         class_1343 var5 = var1.method_37098();
         double var6 = var1.method_37302() + var5.field_7336 - this.method_37302();
         double var8 = var1.method_37388() - 1.1F - this.method_37309();
         double var10 = var1.method_37156() + var5.field_7334 - this.method_37156();
         float var12 = class_9299.method_42842(var6 * var6 + var10 * var10);
         class_6004 var13 = class_3697.field_18138;
         if (!(var1 instanceof class_4040)) {
            if (var12 >= 8.0F && !var1.method_26480(Effects.field_19743)) {
               var13 = class_3697.field_18113;
            } else if (var1.method_26551() >= 8.0F && !var1.method_26480(Effects.field_19718)) {
               var13 = class_3697.field_18125;
            } else if (var12 <= 3.0F && !var1.method_26480(Effects.field_19737) && this.field_41717.nextFloat() < 0.25F) {
               var13 = class_3697.field_18112;
            }
         } else {
            if (!(var1.method_26551() <= 4.0F)) {
               var13 = class_3697.field_18129;
            } else {
               var13 = class_3697.field_18117;
            }

            this.method_26860((class_5834)null);
         }

         class_8011 var14 = new class_8011(this.field_41768, this);
         var14.method_15852(class_9541.method_43999(new class_6098(class_4897.field_25226), var13));
         var14.field_41755 -= -20.0F;
         var14.method_26161(var6, var8 + (double)(var12 * 0.2F), var10, 0.75F, 8.0F);
         if (!this.method_37378()) {
            this.field_41768
               .method_29528(
                  (class_704)null,
                  this.method_37302(),
                  this.method_37309(),
                  this.method_37156(),
                  class_463.field_2818,
                  this.method_37197(),
                  1.0F,
                  0.8F + this.field_41717.nextFloat() * 0.4F
               );
         }

         this.field_41768.method_7509(var14);
      }
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 1.62F;
   }

   @Override
   public void method_18602(int var1, boolean var2) {
   }

   @Override
   public boolean method_21357() {
      return false;
   }
}
