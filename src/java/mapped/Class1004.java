package mapped;

import javax.annotation.Nullable;

public class Class1004 extends Entity {
   private static final Class9289<Integer> field5562 = Class9361.<Integer>method35441(Class1004.class, Class7784.field33391);
   private Class880 field5563;
   private int field5564 = 80;

   public Class1004(Class8992<? extends Class1004> var1, Class1655 var2) {
      super(var1, var2);
      this.field5019 = true;
   }

   public Class1004(Class1655 var1, double var2, double var4, double var6, Class880 var8) {
      this(Class8992.field41069, var1);
      this.method3215(var2, var4, var6);
      double var11 = var1.field9016.nextDouble() * (float) (Math.PI * 2);
      this.method3435(-Math.sin(var11) * 0.02, 0.2F, -Math.cos(var11) * 0.02);
      this.method4182(80);
      this.field5025 = var2;
      this.field5026 = var4;
      this.field5027 = var6;
      this.field5563 = var8;
   }

   @Override
   public void method2850() {
      this.field5063.method35442(field5562, 80);
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public boolean method3139() {
      return !this.field5041;
   }

   @Override
   public void tick() {
      if (!this.method3247()) {
         this.method3434(this.method3433().method11339(0.0, -0.04, 0.0));
      }

      this.move(Class2107.field13742, this.method3433());
      this.method3434(this.method3433().method11344(0.98));
      if (this.field5036) {
         this.method3434(this.method3433().method11347(0.7, -0.5, 0.7));
      }

      this.field5564--;
      if (this.field5564 > 0) {
         this.method3257();
         if (this.field5024.field9020) {
            this.field5024.method6746(Class7940.field34092, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), 0.0, 0.0, 0.0);
         }
      } else {
         this.method2904();
         if (!this.field5024.field9020) {
            this.method4180();
         }
      }
   }

   private void method4180() {
      float var3 = 4.0F;
      this.field5024.method6755(this, this.getPosX(), this.method3440(0.0625), this.getPosZ(), 4.0F, Class2141.field14015);
   }

   @Override
   public void method2724(Class39 var1) {
      var1.method101("Fuse", (short)this.method4184());
   }

   @Override
   public void method2723(Class39 var1) {
      this.method4182(var1.method121("Fuse"));
   }

   @Nullable
   public Class880 method4181() {
      return this.field5563;
   }

   @Override
   public float method3181(Class2090 var1, Class8847 var2) {
      return 0.15F;
   }

   public void method4182(int var1) {
      this.field5063.method35446(field5562, var1);
      this.field5564 = var1;
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5562.equals(var1)) {
         this.field5564 = this.method4183();
      }
   }

   public int method4183() {
      return this.field5063.<Integer>method35445(field5562);
   }

   public int method4184() {
      return this.field5564;
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}
