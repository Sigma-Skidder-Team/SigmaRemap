package remapped;

public class class_2048 extends AbstractMinecartEntity {
   private int field_10361 = -1;

   public class_2048(class_6629<? extends class_2048> var1, World var2) {
      super(var1, var2);
   }

   public class_2048(World var1, double var2, double var4, double var6) {
      super(class_6629.field_34282, var1, var2, var4, var6);
   }

   @Override
   public class_3481 method_4737() {
      return class_3481.field_17067;
   }

   @Override
   public class_2522 method_4752() {
      return class_4783.field_23252.method_29260();
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.field_10361 <= 0) {
         if (this.field_10361 == 0) {
            this.method_9573(method_37266(this.method_37098()));
         }
      } else {
         this.field_10361--;
         this.world.method_43361(class_3090.field_15376, this.method_37302(), this.method_37309() + 0.5, this.method_37156(), 0.0, 0.0, 0.0);
      }

      if (this.field_41744) {
         double var3 = method_37266(this.method_37098());
         if (var3 >= 0.01F) {
            this.method_9573(var3);
         }
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      Entity var5 = var1.method_28353();
      if (var5 instanceof class_6749) {
         class_6749 var6 = (class_6749)var5;
         if (var6.method_37264()) {
            this.method_9573(var6.method_37098().method_6221());
         }
      }

      return super.attackEntityFrom(var1, var2);
   }

   @Override
   public void method_4743(DamageSource var1) {
      double var4 = method_37266(this.method_37098());
      if (!var1.method_28360() && !var1.method_28367() && !(var4 >= 0.01F)) {
         super.method_4743(var1);
         if (!var1.method_28367() && this.world.method_29537().method_1285(class_291.field_1024)) {
            this.method_37312(class_4783.field_23252);
         }
      } else if (this.field_10361 < 0) {
         this.method_9575();
         this.field_10361 = this.field_41717.nextInt(20) + this.field_41717.nextInt(20);
      }
   }

   public void method_9573(double var1) {
      if (!this.world.field_33055) {
         double var5 = Math.sqrt(var1);
         if (var5 > 5.0) {
            var5 = 5.0;
         }

         this.world
            .method_29573(
               this,
               this.method_37302(),
               this.method_37309(),
               this.method_37156(),
               (float)(4.0 + this.field_41717.nextDouble() * 1.5 * var5),
               class_7298.field_37309
            );
         this.method_37204();
      }
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      if (var1 >= 3.0F) {
         float var5 = var1 / 10.0F;
         this.method_9573((double)(var5 * var5));
      }

      return super.method_37270(var1, var2);
   }

   @Override
   public void method_4758(int var1, int var2, int var3, boolean var4) {
      if (var4 && this.field_10361 < 0) {
         this.method_9575();
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 10) {
         super.method_37336(var1);
      } else {
         this.method_9575();
      }
   }

   public void method_9575() {
      this.field_10361 = 80;
      if (!this.world.field_33055) {
         this.world.method_29587(this, (byte)10);
         if (!this.method_37378()) {
            this.world
               .method_29528(
                  (class_704)null, this.method_37302(), this.method_37309(), this.method_37156(), class_463.field_2660, class_562.field_3322, 1.0F, 1.0F
               );
         }
      }
   }

   public int method_9572() {
      return this.field_10361;
   }

   public boolean method_9574() {
      return this.field_10361 > -1;
   }

   @Override
   public float method_37083(class_2730 var1, class_6163 var2, BlockPos var3, class_2522 var4, class_4774 var5, float var6) {
      return this.method_9574() && (var4.method_8349(class_2351.field_11745) || var2.method_28262(var3.method_6081()).method_8349(class_2351.field_11745))
         ? 0.0F
         : super.method_37083(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_37348(class_2730 var1, class_6163 var2, BlockPos var3, class_2522 var4, float var5) {
      return this.method_9574() && (var4.method_8349(class_2351.field_11745) || var2.method_28262(var3.method_6081()).method_8349(class_2351.field_11745))
         ? false
         : super.method_37348(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.contains("TNTFuse", 99)) {
         this.field_10361 = var1.method_25947("TNTFuse");
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("TNTFuse", this.field_10361);
   }
}
