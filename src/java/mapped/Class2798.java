package mapped;

public class Class2798<T extends Class1006 & Class1022> extends Class2797<T> {
   private static String[] field17431;

   public Class2798() {
      this(0.0F, false);
   }

   public Class2798(float var1, boolean var2) {
      super(var1);
      if (!var2) {
         this.field17435 = new Class7219(this, 40, 16);
         this.field17435.method22675(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.field17435.method22679(-5.0F, 2.0F, 0.0F);
         this.field17436 = new Class7219(this, 40, 16);
         this.field17436.field31038 = true;
         this.field17436.method22675(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.field17436.method22679(5.0F, 2.0F, 0.0F);
         this.field17437 = new Class7219(this, 0, 16);
         this.field17437.method22675(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.field17437.method22679(-2.0F, 12.0F, 0.0F);
         this.field17438 = new Class7219(this, 0, 16);
         this.field17438.field31038 = true;
         this.field17438.method22675(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.field17438.method22679(2.0F, 12.0F, 0.0F);
      }
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      this.field17440 = Class2278.field14836;
      this.field17439 = Class2278.field14836;
      ItemStack var7 = var1.getHeldItem(Hand.MAIN_HAND);
      if (var7.getItem() == Items.field37796 && var1.method4307()) {
         if (var1.method2967() != Class2205.field14418) {
            this.field17439 = Class2278.field14839;
         } else {
            this.field17440 = Class2278.field14839;
         }
      }

      super.method10997((T)var1, var2, var3, var4);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      ItemStack var9 = var1.method3090();
      if (var1.method4307() && (var9.isEmpty() || var9.getItem() != Items.field37796)) {
         float var10 = MathHelper.sin(this.field17600 * (float) Math.PI);
         float var11 = MathHelper.sin((1.0F - (1.0F - this.field17600) * (1.0F - this.field17600)) * (float) Math.PI);
         this.field17435.field31037 = 0.0F;
         this.field17436.field31037 = 0.0F;
         this.field17435.field31036 = -(0.1F - var10 * 0.6F);
         this.field17436.field31036 = 0.1F - var10 * 0.6F;
         this.field17435.field31035 = (float) (-Math.PI / 2);
         this.field17436.field31035 = (float) (-Math.PI / 2);
         this.field17435.field31035 -= var10 * 1.2F - var11 * 0.4F;
         this.field17436.field31035 -= var10 * 1.2F - var11 * 0.4F;
         Class7972.method27108(this.field17435, this.field17436, var4);
      }
   }

   @Override
   public void method11010(Class2205 var1, MatrixStack var2) {
      float var5 = var1 != Class2205.field14418 ? -1.0F : 1.0F;
      Class7219 var6 = this.method11011(var1);
      var6.field31032 += var5;
      var6.method22682(var2);
      var6.field31032 -= var5;
   }
}
