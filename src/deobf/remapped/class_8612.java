package remapped;

import java.util.OptionalInt;

public class class_8612 extends class_5783 implements class_3713 {
   private static final class_7821<class_6098> field_44174 = class_8073.<class_6098>method_36641(class_8612.class, class_2734.field_13357);
   private static final class_7821<OptionalInt> field_44171 = class_8073.<OptionalInt>method_36641(class_8612.class, class_2734.field_13356);
   private static final class_7821<Boolean> field_44176 = class_8073.<Boolean>method_36641(class_8612.class, class_2734.field_13347);
   private int field_44170;
   private int field_44172;
   public class_5834 field_44173;

   public class_8612(class_6629<? extends class_8612> var1, class_6486 var2) {
      super(var1, var2);
   }

   public class_8612(class_6486 var1, double var2, double var4, double var6, class_6098 var8) {
      super(class_6629.field_34280, var1);
      this.field_44170 = 0;
      this.method_37256(var2, var4, var6);
      byte var11 = 1;
      if (!var8.method_28022() && var8.method_28002()) {
         this.field_41735.method_36633(field_44174, var8.method_27973());
         var11 += var8.method_27978("Fireworks").method_25950("Flight");
      }

      this.method_37214(this.field_41717.nextGaussian() * 0.001, 0.05, this.field_41717.nextGaussian() * 0.001);
      this.field_44172 = 10 * var11 + this.field_41717.nextInt(6) + this.field_41717.nextInt(7);
   }

   public class_8612(class_6486 var1, class_8145 var2, double var3, double var5, double var7, class_6098 var9) {
      this(var1, var3, var5, var7, var9);
      this.method_26159(var2);
   }

   public class_8612(class_6486 var1, class_6098 var2, class_5834 var3) {
      this(var1, var3, var3.method_37302(), var3.method_37309(), var3.method_37156(), var2);
      this.field_41735.method_36633(field_44171, OptionalInt.of(var3.method_37145()));
      this.field_44173 = var3;
   }

   public class_8612(class_6486 var1, class_6098 var2, double var3, double var5, double var7, boolean var9) {
      this(var1, var3, var5, var7, var2);
      this.field_41735.method_36633(field_44176, var9);
   }

   public class_8612(class_6486 var1, class_6098 var2, class_8145 var3, double var4, double var6, double var8, boolean var10) {
      this(var1, var2, var4, var6, var8, var10);
      this.method_26159(var3);
   }

   @Override
   public void method_37329() {
      this.field_41735.method_36634(field_44174, class_6098.field_31203);
      this.field_41735.method_36634(field_44171, OptionalInt.empty());
      this.field_41735.method_36634(field_44176, false);
   }

   @Override
   public boolean method_37176(double var1) {
      return var1 < 4096.0 && !this.method_39586();
   }

   @Override
   public boolean method_37185(double var1, double var3, double var5) {
      return super.method_37185(var1, var3, var5) && !this.method_39586();
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.method_39586()) {
         if (!this.method_39583()) {
            double var9 = !this.field_41744 ? 1.15 : 1.0;
            this.method_37215(this.method_37098().method_6210(var9, 1.0, var9).method_6214(0.0, 0.04, 0.0));
         }

         class_1343 var3 = this.method_37098();
         this.method_37226(class_7412.field_37839, var3);
         this.method_37215(var3);
      } else {
         if (this.field_44173 == null) {
            this.field_41735.<OptionalInt>method_36640(field_44171).ifPresent(var1 -> {
               class_8145 var4x = this.field_41768.method_29534(var1);
               if (var4x instanceof class_5834) {
                  this.field_44173 = (class_5834)var4x;
               }
            });
         }

         if (this.field_44173 != null) {
            if (this.field_44173.method_26618()) {
               class_1343 var11 = this.field_44173.method_37246();
               double var4 = 1.5;
               double var6 = 0.1;
               class_1343 var8 = this.field_44173.method_37098();
               this.field_44173
                  .method_37215(
                     var8.method_6214(
                        var11.field_7336 * 0.1 + (var11.field_7336 * 1.5 - var8.field_7336) * 0.5,
                        var11.field_7333 * 0.1 + (var11.field_7333 * 1.5 - var8.field_7333) * 0.5,
                        var11.field_7334 * 0.1 + (var11.field_7334 * 1.5 - var8.field_7334) * 0.5
                     )
                  );
            }

            this.method_37256(this.field_44173.method_37302(), this.field_44173.method_37309(), this.field_44173.method_37156());
            this.method_37215(this.field_44173.method_37098());
         }
      }

      class_7474 var12 = class_8462.method_38935(this, this::method_26164);
      if (!this.field_41731) {
         this.method_26160(var12);
         this.field_41763 = true;
      }

      this.method_26167();
      if (this.field_44170 == 0 && !this.method_37378()) {
         this.field_41768
            .method_29528(
               (class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2316, class_562.field_3325, 3.0F, 1.0F
            );
      }

      this.field_44170++;
      if (this.field_41768.field_33055 && this.field_44170 % 2 < 2) {
         this.field_41768
            .method_43361(
               class_3090.field_15366,
               this.method_37302(),
               this.method_37309() - 0.3,
               this.method_37156(),
               this.field_41717.nextGaussian() * 0.05,
               -this.method_37098().field_7333 * 0.5,
               this.field_41717.nextGaussian() * 0.05
            );
      }

      if (!this.field_41768.field_33055 && this.field_44170 > this.field_44172) {
         this.method_39584();
      }
   }

   private void method_39584() {
      this.field_41768.method_29587(this, (byte)17);
      this.method_39585();
      this.method_37204();
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      if (!this.field_41768.field_33055) {
         this.method_39584();
      }
   }

   @Override
   public void method_26165(class_9529 var1) {
      class_1331 var4 = new class_1331(var1.method_43955());
      this.field_41768.method_28262(var4).method_8326(this.field_41768, var4, this);
      if (!this.field_41768.method_22567() && this.method_39587()) {
         this.method_39584();
      }

      super.method_26165(var1);
   }

   private boolean method_39587() {
      class_6098 var3 = this.field_41735.<class_6098>method_36640(field_44174);
      class_5734 var4 = !var3.method_28022() ? var3.method_28021("Fireworks") : null;
      class_3416 var5 = var4 == null ? null : var4.method_25927("Explosions", 10);
      return var5 != null && !var5.isEmpty();
   }

   private void method_39585() {
      float var3 = 0.0F;
      class_6098 var4 = this.field_41735.<class_6098>method_36640(field_44174);
      class_5734 var5 = !var4.method_28022() ? var4.method_28021("Fireworks") : null;
      class_3416 var6 = var5 == null ? null : var5.method_25927("Explosions", 10);
      if (var6 != null && !var6.isEmpty()) {
         var3 = 5.0F + (float)(var6.size() * 2);
      }

      if (var3 > 0.0F) {
         if (this.field_44173 != null) {
            this.field_44173.method_37181(class_6199.method_28363(this, this.method_26166()), 5.0F + (float)(var6.size() * 2));
         }

         double var7 = 5.0;
         class_1343 var9 = this.method_37245();

         for (class_5834 var11 : this.field_41768.<class_5834>method_25868(class_5834.class, this.method_37241().method_18898(5.0))) {
            if (var11 != this.field_44173 && !(this.method_37275(var11) > 25.0)) {
               boolean var12 = false;

               for (int var13 = 0; var13 < 2; var13++) {
                  class_1343 var14 = new class_1343(var11.method_37302(), var11.method_37080(0.5 * (double)var13), var11.method_37156());
                  class_9529 var15 = this.field_41768.method_28265(new class_972(var9, var14, class_3132.field_15553, class_9583.field_48747, this));
                  if (var15.method_33990() == class_1430.field_7721) {
                     var12 = true;
                     break;
                  }
               }

               if (var12) {
                  float var16 = var3 * (float)Math.sqrt((5.0 - (double)this.method_37175(var11)) / 5.0);
                  var11.method_37181(class_6199.method_28363(this, this.method_26166()), var16);
               }
            }
         }
      }
   }

   private boolean method_39586() {
      return this.field_41735.<OptionalInt>method_36640(field_44171).isPresent();
   }

   public boolean method_39583() {
      return this.field_41735.<Boolean>method_36640(field_44176);
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 == 17 && this.field_41768.field_33055) {
         if (this.method_39587()) {
            class_6098 var4 = this.field_41735.<class_6098>method_36640(field_44174);
            class_5734 var5 = !var4.method_28022() ? var4.method_28021("Fireworks") : null;
            class_1343 var6 = this.method_37098();
            this.field_41768
               .method_29536(this.method_37302(), this.method_37309(), this.method_37156(), var6.field_7336, var6.field_7333, var6.field_7334, var5);
         } else {
            for (int var7 = 0; var7 < this.field_41717.nextInt(3) + 2; var7++) {
               this.field_41768
                  .method_43361(
                     class_3090.field_15343,
                     this.method_37302(),
                     this.method_37309(),
                     this.method_37156(),
                     this.field_41717.nextGaussian() * 0.05,
                     0.005,
                     this.field_41717.nextGaussian() * 0.05
                  );
            }
         }
      }

      super.method_37336(var1);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("Life", this.field_44170);
      var1.method_25931("LifeTime", this.field_44172);
      class_6098 var4 = this.field_41735.<class_6098>method_36640(field_44174);
      if (!var4.method_28022()) {
         var1.method_25946("FireworksItem", var4.method_27998(new class_5734()));
      }

      var1.method_25934("ShotAtAngle", this.field_41735.<Boolean>method_36640(field_44176));
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.field_44170 = var1.method_25947("Life");
      this.field_44172 = var1.method_25947("LifeTime");
      class_6098 var4 = class_6098.method_28015(var1.method_25937("FireworksItem"));
      if (!var4.method_28022()) {
         this.field_41735.method_36633(field_44174, var4);
      }

      if (var1.method_25938("ShotAtAngle")) {
         this.field_41735.method_36633(field_44176, var1.method_25933("ShotAtAngle"));
      }
   }

   @Override
   public class_6098 method_17246() {
      class_6098 var3 = this.field_41735.<class_6098>method_36640(field_44174);
      return !var3.method_28022() ? var3 : new class_6098(class_4897.field_24479);
   }

   @Override
   public boolean method_37394() {
      return false;
   }

   @Override
   public class_6310<?> method_37142() {
      return new class_6589(this);
   }
}
