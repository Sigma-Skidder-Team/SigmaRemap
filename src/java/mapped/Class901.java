package mapped;

public abstract class Class901 extends Class882 {
   public double field5141;
   public double field5142;
   public double field5143;

   public Class901(EntityType<? extends Class901> var1, World var2) {
      super(var1, var2);
   }

   public Class901(EntityType<? extends Class901> var1, double var2, double var4, double var6, double var8, double var10, double var12, World var14) {
      this(var1, var14);
      this.method3273(var2, var4, var6, this.rotationYaw, this.rotationPitch);
      this.method3216();
      double var17 = (double) MathHelper.method37766(var8 * var8 + var10 * var10 + var12 * var12);
      if (var17 != 0.0) {
         this.field5141 = var8 / var17 * 0.1;
         this.field5142 = var10 / var17 * 0.1;
         this.field5143 = var12 / var17 * 0.1;
      }
   }

   public Class901(EntityType<? extends Class901> var1, Class880 var2, double var3, double var5, double var7, World var9) {
      this(var1, var2.getPosX(), var2.getPosY(), var2.getPosZ(), var3, var5, var7, var9);
      this.method3459(var2);
      this.method3214(var2.rotationYaw, var2.rotationPitch);
   }

   @Override
   public void registerData() {
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = this.getBoundingBox().method19675() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   @Override
   public void tick() {
      Entity var3 = this.method3460();
      if (this.world.field9020 || (var3 == null || !var3.removed) && this.world.method7017(this.getPosition())) {
         super.tick();
         if (this.method3529()) {
            this.method3221(1);
         }

         RayTraceResult var4 = Class9456.method36385(this, this::method3467);
         if (var4.getType() != RayTraceResult.Type.MISS) {
            this.method3464(var4);
         }

         this.method3240();
         Vector3d var5 = this.method3433();
         double var6 = this.getPosX() + var5.field18048;
         double var8 = this.getPosY() + var5.field18049;
         double var10 = this.getPosZ() + var5.field18050;
         Class9456.method36388(this, 0.2F);
         float var12 = this.method3531();
         if (this.method3250()) {
            for (int var13 = 0; var13 < 4; var13++) {
               float var14 = 0.25F;
               this.world
                  .method6746(
                     Class7940.field34052,
                     var6 - var5.field18048 * 0.25,
                     var8 - var5.field18049 * 0.25,
                     var10 - var5.field18050 * 0.25,
                     var5.field18048,
                     var5.field18049,
                     var5.field18050
                  );
            }

            var12 = 0.8F;
         }

         this.method3434(var5.method11339(this.field5141, this.field5142, this.field5143).method11344((double)var12));
         this.world.method6746(this.method3530(), var6, var8 + 0.5, var10, 0.0, 0.0, 0.0);
         this.setPosition(var6, var8, var10);
      } else {
         this.method2904();
      }
   }

   @Override
   public boolean method3467(Entity var1) {
      return super.method3467(var1) && !var1.noClip;
   }

   public boolean method3529() {
      return true;
   }

   public Class7436 method3530() {
      return Class7940.field34092;
   }

   public float method3531() {
      return 0.95F;
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.put("power", this.method3298(new double[]{this.field5141, this.field5142, this.field5143}));
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.method119("power", 9)) {
         ListNBT var4 = var1.method131("power", 6);
         if (var4.size() == 3) {
            this.field5141 = var4.method158(0);
            this.field5142 = var4.method158(1);
            this.field5143 = var4.method158(2);
         }
      }
   }

   @Override
   public boolean method3139() {
      return true;
   }

   @Override
   public float method3319() {
      return 1.0F;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         this.method3141();
         Entity var5 = var1.method31109();
         if (var5 == null) {
            return false;
         } else {
            Vector3d var6 = var5.method3320();
            this.method3434(var6);
            this.field5141 = var6.field18048 * 0.1;
            this.field5142 = var6.field18049 * 0.1;
            this.field5143 = var6.field18050 * 0.1;
            this.method3459(var5);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public float method3267() {
      return 1.0F;
   }

   @Override
   public Packet<?> method2835() {
      Entity var3 = this.method3460();
      int var4 = var3 != null ? var3.method3205() : 0;
      return new Class5487(
         this.method3205(),
         this.getUniqueID(),
         this.getPosX(),
         this.getPosY(),
         this.getPosZ(),
         this.rotationPitch,
         this.rotationYaw,
         this.getType(),
         var4,
         new Vector3d(this.field5141, this.field5142, this.field5143)
      );
   }
}
