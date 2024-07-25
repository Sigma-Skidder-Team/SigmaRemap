package remapped;

public abstract class class_8388 extends class_5783 {
   public double field_42909;
   public double field_42910;
   public double field_42911;

   public class_8388(class_6629<? extends class_8388> var1, World var2) {
      super(var1, var2);
   }

   public class_8388(class_6629<? extends class_8388> var1, double var2, double var4, double var6, double var8, double var10, double var12, World var14) {
      this(var1, var14);
      this.method_37144(var2, var4, var6, this.field_41701, this.field_41755);
      this.method_37351();
      double var17 = (double)class_9299.method_42842(var8 * var8 + var10 * var10 + var12 * var12);
      if (var17 != 0.0) {
         this.field_42909 = var8 / var17 * 0.1;
         this.field_42910 = var10 / var17 * 0.1;
         this.field_42911 = var12 / var17 * 0.1;
      }
   }

   public class_8388(class_6629<? extends class_8388> var1, class_5834 var2, double var3, double var5, double var7, World var9) {
      this(var1, var2.method_37302(), var2.method_37309(), var2.method_37156(), var3, var5, var7, var9);
      this.method_26159(var2);
      this.method_37395(var2.field_41701, var2.field_41755);
   }

   @Override
   public void method_37329() {
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = this.method_37241().method_18906() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   @Override
   public void method_37123() {
      Entity var3 = this.method_26166();
      if (this.field_41768.field_33055 || (var3 == null || !var3.field_41751) && this.field_41768.method_22559(this.method_37075())) {
         super.method_37123();
         if (this.method_38646()) {
            this.method_37178(1);
         }

         class_7474 var4 = class_8462.method_38935(this, this::method_26164);
         if (var4.method_33990() != class_1430.field_7721) {
            this.method_26160(var4);
         }

         this.method_37097();
         class_1343 var5 = this.method_37098();
         double var6 = this.method_37302() + var5.field_7336;
         double var8 = this.method_37309() + var5.field_7333;
         double var10 = this.method_37156() + var5.field_7334;
         class_8462.method_38933(this, 0.2F);
         float var12 = this.method_38644();
         if (this.method_37285()) {
            for (int var13 = 0; var13 < 4; var13++) {
               float var14 = 0.25F;
               this.field_41768
                  .method_43361(
                     class_3090.field_15340,
                     var6 - var5.field_7336 * 0.25,
                     var8 - var5.field_7333 * 0.25,
                     var10 - var5.field_7334 * 0.25,
                     var5.field_7336,
                     var5.field_7333,
                     var5.field_7334
                  );
            }

            var12 = 0.8F;
         }

         this.method_37215(var5.method_6214(this.field_42909, this.field_42910, this.field_42911).method_6209((double)var12));
         this.field_41768.method_43361(this.method_38645(), var6, var8 + 0.5, var10, 0.0, 0.0, 0.0);
         this.method_37256(var6, var8, var10);
      } else {
         this.method_37204();
      }
   }

   @Override
   public boolean method_26164(Entity var1) {
      return super.method_26164(var1) && !var1.field_41731;
   }

   public boolean method_38646() {
      return true;
   }

   public class_5079 method_38645() {
      return class_3090.field_15376;
   }

   public float method_38644() {
      return 0.95F;
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25946("power", this.method_37272(new double[]{this.field_42909, this.field_42910, this.field_42911}));
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      if (var1.method_25939("power", 9)) {
         class_3416 var4 = var1.method_25927("power", 6);
         if (var4.size() == 3) {
            this.field_42909 = var4.method_15763(0);
            this.field_42910 = var4.method_15763(1);
            this.field_42911 = var4.method_15763(2);
         }
      }
   }

   @Override
   public boolean method_37167() {
      return true;
   }

   @Override
   public float method_37355() {
      return 1.0F;
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         this.method_37138();
         Entity var5 = var1.method_28372();
         if (var5 == null) {
            return false;
         } else {
            class_1343 var6 = var5.method_37246();
            this.method_37215(var6);
            this.field_42909 = var6.field_7336 * 0.1;
            this.field_42910 = var6.field_7333 * 0.1;
            this.field_42911 = var6.field_7334 * 0.1;
            this.method_26159(var5);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public float method_37193() {
      return 1.0F;
   }

   @Override
   public class_6310<?> method_37142() {
      Entity var3 = this.method_26166();
      int var4 = var3 != null ? var3.method_37145() : 0;
      return new class_6589(
         this.method_37145(),
         this.method_37328(),
         this.method_37302(),
         this.method_37309(),
         this.method_37156(),
         this.field_41755,
         this.field_41701,
         this.method_37387(),
         var4,
         new class_1343(this.field_42909, this.field_42910, this.field_42911)
      );
   }
}
