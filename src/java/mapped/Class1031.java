package mapped;

public abstract class Class1031 extends Class1025 {
   private static final Class9289<Byte> field5733 = Class9361.<Byte>method35441(Class1031.class, Class7784.field33390);
   public int field5734;
   private Class2031 field5735 = Class2031.field13181;

   public Class1031(Class8992<? extends Class1031> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5733, (byte)0);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.field5734 = var1.method122("SpellTicks");
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("SpellTicks", this.field5734);
   }

   @Override
   public Class2117 method4543() {
      if (!this.method4594()) {
         return !this.method4555() ? Class2117.field13794 : Class2117.field13800;
      } else {
         return Class2117.field13796;
      }
   }

   public boolean method4594() {
      return !this.field5024.field9020 ? this.field5734 > 0 : this.field5063.<Byte>method35445(field5733) > 0;
   }

   public void method4595(Class2031 var1) {
      this.field5735 = var1;
      this.field5063.method35446(field5733, (byte)Class2031.method8665(var1));
   }

   public Class2031 method4596() {
      return this.field5024.field9020 ? Class2031.method8664(this.field5063.<Byte>method35445(field5733)) : this.field5735;
   }

   @Override
   public void method4258() {
      super.method4258();
      if (this.field5734 > 0) {
         this.field5734--;
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5024.field9020 && this.method4594()) {
         Class2031 var3 = this.method4596();
         double var4 = Class2031.method8666(var3)[0];
         double var6 = Class2031.method8666(var3)[1];
         double var8 = Class2031.method8666(var3)[2];
         float var10 = this.field4965 * (float) (Math.PI / 180.0) + Class9679.method37764((float)this.field5055 * 0.6662F) * 0.25F;
         float var11 = Class9679.method37764(var10);
         float var12 = Class9679.method37763(var10);
         this.field5024
            .method6746(
               Class7940.field34068,
               this.getPosX() + (double)var11 * 0.6,
               this.getPosY() + 1.8,
               this.getPosZ() + (double)var12 * 0.6,
               var4,
               var6,
               var8
            );
         this.field5024
            .method6746(
               Class7940.field34068,
               this.getPosX() - (double)var11 * 0.6,
               this.getPosY() + 1.8,
               this.getPosZ() - (double)var12 * 0.6,
               var4,
               var6,
               var8
            );
      }
   }

   public int method4597() {
      return this.field5734;
   }

   public abstract Class9455 method4598();

   // $VF: synthetic method
   public static Class6990 method4599(Class1031 var0) {
      return var0.field5599;
   }
}
