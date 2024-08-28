package mapped;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class Class1108 extends Class1006 implements Class1008 {
   private static final Class9289<Integer> field6081 = Class9361.<Integer>method35441(Class1108.class, Class7784.field33391);
   public float field6082;
   public float field6083;
   public float field6084;
   private boolean field6085;

   public Class1108(Class8992<? extends Class1108> var1, World var2) {
      super(var1, var2);
      this.field5596 = new Class6841(this);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2735(this));
      this.field5600.method20002(2, new Class2620(this));
      this.field5600.method20002(3, new Class2621(this));
      this.field5600.method20002(5, new Class2601(this));
      this.field5601
         .method20002(1, new Class2709<PlayerEntity>(this, PlayerEntity.class, 10, true, false, var1 -> Math.abs(var1.getPosY() - this.getPosY()) <= 4.0));
      this.field5601.method20002(3, new Class2709<Class1058>(this, Class1058.class, true));
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field6081, 1);
   }

   public void method5318(int var1, boolean var2) {
      this.field5063.method35446(field6081, var1);
      this.method3216();
      this.method3385();
      this.method3085(Class9173.field42105).method38661((double)(var1 * var1));
      this.method3085(Class9173.field42108).method38661((double)(0.2F + 0.1F * (float)var1));
      this.method3085(Class9173.field42110).method38661((double)var1);
      if (var2) {
         this.method3043(this.method3075());
      }

      this.field5594 = var1;
   }

   public int method5319() {
      return this.field5063.<Integer>method35445(field6081);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("Size", this.method5319() - 1);
      var1.method115("wasOnGround", this.field6085);
   }

   @Override
   public void method2723(Class39 var1) {
      int var4 = var1.method122("Size");
      if (var4 < 0) {
         var4 = 0;
      }

      this.method5318(var4 + 1, false);
      super.method2723(var1);
      this.field6085 = var1.method132("wasOnGround");
   }

   public boolean method5320() {
      return this.method5319() <= 1;
   }

   public Class7436 method5321() {
      return Class7940.field34083;
   }

   @Override
   public boolean method4256() {
      return this.method5319() > 0;
   }

   @Override
   public void tick() {
      this.field6083 = this.field6083 + (this.field6082 - this.field6083) * 0.5F;
      this.field6084 = this.field6083;
      super.tick();
      if (this.field5036 && !this.field6085) {
         int var3 = this.method5319();

         for (int var4 = 0; var4 < var3 * 8; var4++) {
            float var5 = this.field5054.nextFloat() * (float) (Math.PI * 2);
            float var6 = this.field5054.nextFloat() * 0.5F + 0.5F;
            float var7 = MathHelper.method37763(var5) * (float)var3 * 0.5F * var6;
            float var8 = MathHelper.method37764(var5) * (float)var3 * 0.5F * var6;
            this.field5024.method6746(this.method5321(), this.getPosX() + (double)var7, this.getPosY(), this.getPosZ() + (double)var8, 0.0, 0.0, 0.0);
         }

         this.method2863(this.method5327(), this.method3099(), ((this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         this.field6082 = -0.5F;
      } else if (!this.field5036 && this.field6085) {
         this.field6082 = 1.0F;
      }

      this.field6085 = this.field5036;
      this.method5322();
   }

   public void method5322() {
      this.field6082 *= 0.6F;
   }

   public int method5323() {
      return this.field5054.nextInt(20) + 10;
   }

   @Override
   public void method3385() {
      double var3 = this.getPosX();
      double var5 = this.getPosY();
      double var7 = this.getPosZ();
      super.method3385();
      this.method3215(var3, var5, var7);
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field6081.equals(var1)) {
         this.method3385();
         this.field5031 = this.field4967;
         this.field4965 = this.field4967;
         if (this.method3250() && this.field5054.nextInt(20) == 0) {
            this.method2925();
         }
      }

      super.method3155(var1);
   }

   @Override
   public Class8992<? extends Class1108> method3204() {
      return (Class8992<? extends Class1108>)super.method3204();
   }

   @Override
   public void method2904() {
      int var3 = this.method5319();
      if (!this.field5024.field9020 && var3 > 1 && this.getShouldBeDead()) {
         ITextComponent var4 = this.method3380();
         boolean var5 = this.method4305();
         float var6 = (float)var3 / 4.0F;
         int var7 = var3 / 2;
         int var8 = 2 + this.field5054.nextInt(3);

         for (int var9 = 0; var9 < var8; var9++) {
            float var10 = ((float)(var9 % 2) - 0.5F) * var6;
            float var11 = ((float)(var9 / 2) - 0.5F) * var6;
            Class1108 var12 = this.method3204().method33215(this.field5024);
            if (this.method4282()) {
               var12.method4278();
            }

            var12.method3379(var4);
            var12.method4302(var5);
            var12.method3363(this.method3362());
            var12.method5318(var7, true);
            var12.method3273(
               this.getPosX() + (double)var10, this.getPosY() + 0.5, this.getPosZ() + (double)var11, this.field5054.nextFloat() * 360.0F, 0.0F
            );
            this.field5024.method6916(var12);
         }
      }

      super.method2904();
   }

   @Override
   public void method3101(Entity var1) {
      super.method3101(var1);
      if (var1 instanceof Class1058 && this.method5325()) {
         this.method5324((Class880)var1);
      }
   }

   @Override
   public void method3279(PlayerEntity var1) {
      if (this.method5325()) {
         this.method5324(var1);
      }
   }

   public void method5324(Class880 var1) {
      if (this.method3066()) {
         int var4 = this.method5319();
         if (this.getDistanceSq(var1) < 0.6 * (double)var4 * 0.6 * (double)var4
            && this.method3135(var1)
            && var1.method2741(Class8654.method31115(this), this.method5326())) {
            this.method2863(Class6067.field27072, 1.0F, (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F);
            this.method3399(this, var1);
         }
      }
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 0.625F * var2.field39969;
   }

   public boolean method5325() {
      return !this.method5320() && this.method3138();
   }

   public float method5326() {
      return (float)this.method3086(Class9173.field42110);
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return !this.method5320() ? Class6067.field27074 : Class6067.field27103;
   }

   @Override
   public Class9455 method2880() {
      return !this.method5320() ? Class6067.field27073 : Class6067.field27102;
   }

   public Class9455 method5327() {
      return !this.method5320() ? Class6067.field27076 : Class6067.field27105;
   }

   @Override
   public ResourceLocation method4242() {
      return this.method5319() != 1 ? Class8793.field39533 : this.method3204().method33212();
   }

   public static boolean method5328(Class8992<Class1108> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      if (var1.method6997() != Class2197.field14351) {
         if (Objects.equals(var1.method7178(var3), Optional.<RegistryKey<Biome>>of(Class9495.field44127))
            && var3.getY() > 50
            && var3.getY() < 70
            && var4.nextFloat() < 0.5F
            && var4.nextFloat() < var1.method7000()
            && var1.method7015(var3) <= var4.nextInt(8)) {
            return method4264(var0, var1, var2, var3, var4);
         }

         if (!(var1 instanceof Class1658)) {
            return false;
         }

         Class7481 var7 = new Class7481(var3);
         boolean var8 = Class2420.method10375(var7.field32174, var7.field32175, ((Class1658)var1).method6967(), 987234911L).nextInt(10) == 0;
         if (var4.nextInt(10) == 0 && var8 && var3.getY() < 40) {
            return method4264(var0, var1, var2, var3, var4);
         }
      }

      return false;
   }

   @Override
   public float method3099() {
      return 0.4F * (float)this.method5319();
   }

   @Override
   public int method4259() {
      return 0;
   }

   public boolean method5329() {
      return this.method5319() > 0;
   }

   @Override
   public void method2914() {
      Vector3d var3 = this.method3433();
      this.method3435(var3.field18048, (double)this.method3103(), var3.field18050);
      this.field5078 = true;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      int var8 = this.field5054.nextInt(3);
      if (var8 < 2 && this.field5054.nextFloat() < 0.5F * var2.method38330()) {
         var8++;
      }

      int var9 = 1 << var8;
      this.method5318(var9, true);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   private float method5330() {
      float var3 = !this.method5320() ? 0.8F : 1.4F;
      return ((this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F) * var3;
   }

   public Class9455 method5331() {
      return !this.method5320() ? Class6067.field27075 : Class6067.field27104;
   }

   @Override
   public Class8847 method2981(Class2090 var1) {
      return super.method2981(var1).method32099(0.255F * (float)this.method5319());
   }

   // $VF: synthetic method
   public static float method5333(Class1108 var0) {
      return var0.method5330();
   }
}
