package mapped;

import com.google.common.collect.ImmutableList;

public class Class2862<T extends Class1017> extends Class2855<T> {
   private final Class7219 field17735;
   private final Class7219 field17736;
   private final Class7219 field17737;
   private final Class7219 field17738;
   private final Class7219 field17739;
   private final Class7219 field17740;
   private final Class7219 field17741;
   private final Class7219 field17742;
   private final Class7219 field17743;
   private final Class7219 field17744;
   private float field17745;

   public Class2862() {
      super(false, 24.0F, 0.0F);
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17735 = new Class7219(this);
      this.field17735.method22679(0.0F, 19.0F, 0.0F);
      this.field17736 = new Class7219(this, 0, 0);
      this.field17736.method22679(0.0F, 0.0F, 0.0F);
      this.field17735.method22670(this.field17736);
      this.field17736.method22675(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, 0.0F);
      this.field17742 = new Class7219(this, 26, 7);
      this.field17742.method22675(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F);
      this.field17736.method22670(this.field17742);
      this.field17743 = new Class7219(this, 2, 0);
      this.field17743.method22679(0.0F, -2.0F, -5.0F);
      this.field17743.method22675(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.field17744 = new Class7219(this, 2, 3);
      this.field17744.method22679(0.0F, -2.0F, -5.0F);
      this.field17744.method22675(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.field17736.method22670(this.field17743);
      this.field17736.method22670(this.field17744);
      this.field17737 = new Class7219(this, 0, 18);
      this.field17737.method22679(-1.5F, -4.0F, -3.0F);
      this.field17737.field31035 = 0.0F;
      this.field17737.field31036 = -0.2618F;
      this.field17737.field31037 = 0.0F;
      this.field17735.method22670(this.field17737);
      this.field17737.method22675(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.field17738 = new Class7219(this, 0, 18);
      this.field17738.method22679(1.5F, -4.0F, -3.0F);
      this.field17738.field31035 = 0.0F;
      this.field17738.field31036 = 0.2618F;
      this.field17738.field31037 = 0.0F;
      this.field17738.field31038 = true;
      this.field17735.method22670(this.field17738);
      this.field17738.method22675(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.field17739 = new Class7219(this);
      this.field17739.method22679(1.5F, 3.0F, -2.0F);
      this.field17735.method22670(this.field17739);
      this.field17739.method22672("frontLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 1);
      this.field17740 = new Class7219(this);
      this.field17740.method22679(1.5F, 3.0F, 0.0F);
      this.field17735.method22670(this.field17740);
      this.field17740.method22672("midLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 3);
      this.field17741 = new Class7219(this);
      this.field17741.method22679(1.5F, 3.0F, 2.0F);
      this.field17735.method22670(this.field17741);
      this.field17741.method22672("backLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 5);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      super.method10997(var1, var2, var3, var4);
      this.field17745 = var1.method4427(var4);
      this.field17742.field31039 = !var1.method4440();
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17737.field31035 = 0.0F;
      this.field17743.field31035 = 0.0F;
      this.field17744.field31035 = 0.0F;
      this.field17735.field31035 = 0.0F;
      this.field17735.field31033 = 19.0F;
      boolean var9 = var1.method3226() && var1.method3433().method11349() < 1.0E-7;
      if (!var9) {
         float var10 = var4 * 2.1F;
         this.field17737.field31036 = 0.0F;
         this.field17737.field31037 = MathHelper.method37764(var10) * (float) Math.PI * 0.15F;
         this.field17738.field31035 = this.field17737.field31035;
         this.field17738.field31036 = this.field17737.field31036;
         this.field17738.field31037 = -this.field17737.field31037;
         this.field17739.field31035 = (float) (Math.PI / 4);
         this.field17740.field31035 = (float) (Math.PI / 4);
         this.field17741.field31035 = (float) (Math.PI / 4);
         this.field17735.field31035 = 0.0F;
         this.field17735.field31036 = 0.0F;
         this.field17735.field31037 = 0.0F;
      } else {
         this.field17737.field31036 = -0.2618F;
         this.field17737.field31037 = 0.0F;
         this.field17738.field31035 = 0.0F;
         this.field17738.field31036 = 0.2618F;
         this.field17738.field31037 = 0.0F;
         this.field17739.field31035 = 0.0F;
         this.field17740.field31035 = 0.0F;
         this.field17741.field31035 = 0.0F;
      }

      if (!var1.method4369()) {
         this.field17735.field31035 = 0.0F;
         this.field17735.field31036 = 0.0F;
         this.field17735.field31037 = 0.0F;
         if (!var9) {
            float var11 = MathHelper.method37764(var4 * 0.18F);
            this.field17735.field31035 = 0.1F + var11 * (float) Math.PI * 0.025F;
            this.field17743.field31035 = var11 * (float) Math.PI * 0.03F;
            this.field17744.field31035 = var11 * (float) Math.PI * 0.03F;
            this.field17739.field31035 = -var11 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.field17741.field31035 = -var11 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.field17735.field31033 = 19.0F - MathHelper.method37764(var4 * 0.18F) * 0.9F;
         }
      }

      if (this.field17745 > 0.0F) {
         this.field17735.field31035 = Class9530.method36832(this.field17735.field31035, 3.0915928F, this.field17745);
      }
   }

   @Override
   public Iterable<Class7219> method11001() {
      return ImmutableList.of();
   }

   @Override
   public Iterable<Class7219> method11002() {
      return ImmutableList.of(this.field17735);
   }
}
