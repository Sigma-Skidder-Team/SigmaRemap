package mapped;

import com.google.common.collect.ImmutableList;

public class Class2813<T extends Entity> extends Class2803<T> {
   private static String[] field17514;
   private final Class7219 field17515;
   private final Class7219 field17516;
   private final Class7219 field17517;
   private final Class7219 field17518;
   private final Class7219 field17519;
   private final Class7219 field17520;
   private final Class7219 field17521;
   private final Class7219 field17522;
   private final Class7219 field17523;
   private final Class7219 field17524;
   private final Class7219 field17525;

   public Class2813() {
      this.field17515 = new Class7219(this, 32, 4);
      this.field17515.method22675(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.field17515.method22679(0.0F, 15.0F, -3.0F);
      this.field17516 = new Class7219(this, 0, 0);
      this.field17516.method22675(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F);
      this.field17516.method22679(0.0F, 15.0F, 0.0F);
      this.field17517 = new Class7219(this, 0, 12);
      this.field17517.method22675(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, 0.0F);
      this.field17517.method22679(0.0F, 15.0F, 9.0F);
      this.field17518 = new Class7219(this, 18, 0);
      this.field17518.method22675(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17518.method22679(-4.0F, 15.0F, 2.0F);
      this.field17519 = new Class7219(this, 18, 0);
      this.field17519.method22675(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17519.method22679(4.0F, 15.0F, 2.0F);
      this.field17520 = new Class7219(this, 18, 0);
      this.field17520.method22675(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17520.method22679(-4.0F, 15.0F, 1.0F);
      this.field17521 = new Class7219(this, 18, 0);
      this.field17521.method22675(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17521.method22679(4.0F, 15.0F, 1.0F);
      this.field17522 = new Class7219(this, 18, 0);
      this.field17522.method22675(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17522.method22679(-4.0F, 15.0F, 0.0F);
      this.field17523 = new Class7219(this, 18, 0);
      this.field17523.method22675(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17523.method22679(4.0F, 15.0F, 0.0F);
      this.field17524 = new Class7219(this, 18, 0);
      this.field17524.method22675(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17524.method22679(-4.0F, 15.0F, -1.0F);
      this.field17525 = new Class7219(this, 18, 0);
      this.field17525.method22675(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F);
      this.field17525.method22679(4.0F, 15.0F, -1.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(
         this.field17515,
         this.field17516,
         this.field17517,
         this.field17518,
         this.field17519,
         this.field17520,
         this.field17521,
         this.field17522,
         this.field17523,
         this.field17524,
         this.field17525
      );
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17515.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17515.field31035 = var6 * (float) (Math.PI / 180.0);
      float var9 = (float) (Math.PI / 4);
      this.field17518.field31037 = (float) (-Math.PI / 4);
      this.field17519.field31037 = (float) (Math.PI / 4);
      this.field17520.field31037 = -0.58119464F;
      this.field17521.field31037 = 0.58119464F;
      this.field17522.field31037 = -0.58119464F;
      this.field17523.field31037 = 0.58119464F;
      this.field17524.field31037 = (float) (-Math.PI / 4);
      this.field17525.field31037 = (float) (Math.PI / 4);
      float var10 = -0.0F;
      float var11 = (float) (Math.PI / 8);
      this.field17518.field31036 = (float) (Math.PI / 4);
      this.field17519.field31036 = (float) (-Math.PI / 4);
      this.field17520.field31036 = (float) (Math.PI / 8);
      this.field17521.field31036 = (float) (-Math.PI / 8);
      this.field17522.field31036 = (float) (-Math.PI / 8);
      this.field17523.field31036 = (float) (Math.PI / 8);
      this.field17524.field31036 = (float) (-Math.PI / 4);
      this.field17525.field31036 = (float) (Math.PI / 4);
      float var12 = -(Class9679.method37764(var2 * 0.6662F * 2.0F + 0.0F) * 0.4F) * var3;
      float var13 = -(Class9679.method37764(var2 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * var3;
      float var14 = -(Class9679.method37764(var2 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var15 = -(Class9679.method37764(var2 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      float var16 = Math.abs(Class9679.method37763(var2 * 0.6662F + 0.0F) * 0.4F) * var3;
      float var17 = Math.abs(Class9679.method37763(var2 * 0.6662F + (float) Math.PI) * 0.4F) * var3;
      float var18 = Math.abs(Class9679.method37763(var2 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * var3;
      float var19 = Math.abs(Class9679.method37763(var2 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * var3;
      this.field17518.field31036 += var12;
      this.field17519.field31036 += -var12;
      this.field17520.field31036 += var13;
      this.field17521.field31036 += -var13;
      this.field17522.field31036 += var14;
      this.field17523.field31036 += -var14;
      this.field17524.field31036 += var15;
      this.field17525.field31036 += -var15;
      this.field17518.field31037 += var16;
      this.field17519.field31037 += -var16;
      this.field17520.field31037 += var17;
      this.field17521.field31037 += -var17;
      this.field17522.field31037 += var18;
      this.field17523.field31037 += -var18;
      this.field17524.field31037 += var19;
      this.field17525.field31037 += -var19;
   }
}
