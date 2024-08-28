package mapped;

public abstract class Class893 extends Class882 {
   public Class893(Class8992<? extends Class893> var1, World var2) {
      super(var1, var2);
   }

   public Class893(Class8992<? extends Class893> var1, double var2, double var4, double var6, World var8) {
      this(var1, var8);
      this.method3215(var2, var4, var6);
   }

   public Class893(Class8992<? extends Class893> var1, Class880 var2, World var3) {
      this(var1, var2.getPosX(), var2.method3442() - 0.1F, var2.getPosZ(), var3);
      this.method3459(var2);
   }

   @Override
   public boolean method3291(double var1) {
      double var5 = this.method3389().method19675() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   @Override
   public void tick() {
      super.tick();
      Class8710 var3 = Class9456.method36385(this, this::method3467);
      boolean var4 = false;
      if (var3.method31417() == Class2100.field13690) {
         BlockPos var5 = ((Class8711)var3).method31423();
         Class7380 var13 = this.field5024.method6738(var5);
         if (!var13.method23448(Blocks.field36588)) {
            if (var13.method23448(Blocks.field36886)) {
               Class944 var14 = this.field5024.method6759(var5);
               if (var14 instanceof Class957 && Class957.method3871(this)) {
                  ((Class957)var14).method3877(this);
               }

               var4 = true;
            }
         } else {
            this.method3323(var5);
            var4 = true;
         }
      }

      if (var3.method31417() != Class2100.field13689 && !var4) {
         this.method3464(var3);
      }

      this.method3240();
      Vector3d var17 = this.method3433();
      double var6 = this.getPosX() + var17.field18048;
      double var8 = this.getPosY() + var17.field18049;
      double var10 = this.getPosZ() + var17.field18050;
      this.method3468();
      float var12;
      if (!this.method3250()) {
         var12 = 0.99F;
      } else {
         for (int var15 = 0; var15 < 4; var15++) {
            float var16 = 0.25F;
            this.field5024
               .method6746(
                  Class7940.field34052,
                  var6 - var17.field18048 * 0.25,
                  var8 - var17.field18049 * 0.25,
                  var10 - var17.field18050 * 0.25,
                  var17.field18048,
                  var17.field18049,
                  var17.field18050
               );
         }

         var12 = 0.8F;
      }

      this.method3434(var17.method11344((double)var12));
      if (!this.method3247()) {
         Vector3d var18 = this.method3433();
         this.method3435(var18.field18048, var18.field18049 - (double)this.method3515(), var18.field18050);
      }

      this.method3215(var6, var8, var10);
   }

   public float method3515() {
      return 0.03F;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}
