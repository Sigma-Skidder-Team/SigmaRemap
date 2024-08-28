package mapped;

import javax.annotation.Nullable;

public class Class1101 extends Class1009 {
   private static String[] field6056;
   private static final Class9289<Byte> field6057 = Class9361.<Byte>method35441(Class1101.class, Class7784.field33390);

   public Class1101(Class8992<? extends Class1101> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(3, new Class2745(this, 0.4F));
      this.field5600.method20002(4, new Class2657(this));
      this.field5600.method20002(5, new Class2737(this, 0.8));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(6, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this));
      this.field5601.method20002(2, new Class2718<PlayerEntity>(this, PlayerEntity.class));
      this.field5601.method20002(3, new Class2718<Class1058>(this, Class1058.class));
   }

   @Override
   public double method3310() {
      return (double)(this.method3430() * 0.5F);
   }

   @Override
   public Class6990 method4221(Class1655 var1) {
      return new Class6993(this, var1);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field6057, (byte)0);
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.field5024.field9020) {
         this.method5290(this.field5037);
      }
   }

   public static Class7037 method5288() {
      return Class1009.method4343().method21849(Class9173.field42105, 16.0).method21849(Class9173.field42108, 0.3F);
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27119;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27121;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27120;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field27122, 0.15F, 1.0F);
   }

   @Override
   public boolean method3063() {
      return this.method5289();
   }

   @Override
   public void method2928(Class7380 var1, Vector3d var2) {
      if (!var1.method23448(Blocks.field36481)) {
         super.method2928(var1, var2);
      }
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33507;
   }

   @Override
   public boolean method3036(Class2023 var1) {
      return var1.method8627() != Class8254.field35485 ? super.method3036(var1) : false;
   }

   public boolean method5289() {
      return (this.field5063.<Byte>method35445(field6057) & 1) != 0;
   }

   public void method5290(boolean var1) {
      byte var4 = this.field5063.<Byte>method35445(field6057);
      if (!var1) {
         var4 = (byte)(var4 & -2);
      } else {
         var4 = (byte)(var4 | 1);
      }

      this.field5063.method35446(field6057, var4);
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      if (var1.method6814().nextInt(100) == 0) {
         Class1085 var8 = Class8992.field41078.method33215(this.field5024);
         var8.method3273(this.getPosX(), this.getPosY(), this.getPosZ(), this.field5031, 0.0F);
         var8.method4276(var1, var2, var3, (Class5093)null, (Class39)null);
         var8.method3311(this);
      }

      if (var4 == null) {
         var4 = new Class5092();
         if (var1.method6997() == Class2197.field14354 && var1.method6814().nextFloat() < 0.1F * var2.method38330()) {
            ((Class5092)var4).method15575(var1.method6814());
         }
      }

      if (var4 instanceof Class5092) {
         Class7144 var10 = ((Class5092)var4).field23180;
         if (var10 != null) {
            this.method3035(new Class2023(var10, Integer.MAX_VALUE));
         }
      }

      return var4;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 0.65F;
   }
}
