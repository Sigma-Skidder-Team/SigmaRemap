package mapped;

public class Class2891<T extends Entity> extends Class2802<T> {
   private static String[] field17446;
   private boolean field17911;
   private final Class7219 field17912 = new Class7219(this).method22684(64, 128);

   public Class2891(float var1) {
      super(var1, 64, 128);
      this.field17912.method22679(0.0F, -2.0F, 0.0F);
      this.field17912.method22671(0, 0).method22675(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, -0.25F);
      this.field17455.method22670(this.field17912);
      this.field17447 = new Class7219(this).method22684(64, 128);
      this.field17447.method22679(0.0F, 0.0F, 0.0F);
      this.field17447.method22671(0, 0).method22675(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.field17448 = new Class7219(this).method22684(64, 128);
      this.field17448.method22679(-5.0F, -10.03125F, -5.0F);
      this.field17448.method22671(0, 64).method22673(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F);
      this.field17447.method22670(this.field17448);
      this.field17447.method22670(this.field17455);
      Class7219 var4 = new Class7219(this).method22684(64, 128);
      var4.method22679(1.75F, -4.0F, 2.0F);
      var4.method22671(0, 76).method22673(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F);
      var4.field31035 = -0.05235988F;
      var4.field31037 = 0.02617994F;
      this.field17448.method22670(var4);
      Class7219 var5 = new Class7219(this).method22684(64, 128);
      var5.method22679(1.75F, -4.0F, 2.0F);
      var5.method22671(0, 87).method22673(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F);
      var5.field31035 = -0.10471976F;
      var5.field31037 = 0.05235988F;
      var4.method22670(var5);
      Class7219 var6 = new Class7219(this).method22684(64, 128);
      var6.method22679(1.75F, -2.0F, 2.0F);
      var6.method22671(0, 95).method22675(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.25F);
      var6.field31035 = (float) (-Math.PI / 15);
      var6.field31037 = 0.10471976F;
      var5.method22670(var6);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      this.field17455.method22679(0.0F, -2.0F, 0.0F);
      float var9 = 0.01F * (float)(var1.method3205() % 10);
      this.field17455.field31035 = MathHelper.sin((float)var1.ticksExisted * var9) * 4.5F * (float) (Math.PI / 180.0);
      this.field17455.field31036 = 0.0F;
      this.field17455.field31037 = MathHelper.cos((float)var1.ticksExisted * var9) * 2.5F * (float) (Math.PI / 180.0);
      if (this.field17911) {
         this.field17455.method22679(0.0F, 1.0F, -1.5F);
         this.field17455.field31035 = -0.9F;
      }
   }

   public Class7219 method11206() {
      return this.field17455;
   }

   public void method11207(boolean var1) {
      this.field17911 = var1;
   }
}
