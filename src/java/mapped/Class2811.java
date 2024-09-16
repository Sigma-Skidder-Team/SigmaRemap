package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2811 extends Class2803<Class1114> {
   private static String[] field17493;
   private final Class7219 field17494;
   private final Class7219 field17495;
   private final Class7219 field17496;
   private final Class7219 field17497;
   private final Class7219 field17498;
   private final Class7219 field17499;

   public Class2811() {
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17494 = new Class7219(this, 0, 0);
      this.field17494.method22673(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      Class7219 var3 = new Class7219(this, 24, 0);
      var3.method22673(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.field17494.method22670(var3);
      Class7219 var4 = new Class7219(this, 24, 0);
      var4.field31038 = true;
      var4.method22673(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.field17494.method22670(var4);
      this.field17495 = new Class7219(this, 0, 16);
      this.field17495.method22673(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F);
      this.field17495.method22671(0, 34).method22673(-5.0F, 16.0F, 0.0F, 10.0F, 6.0F, 1.0F);
      this.field17496 = new Class7219(this, 42, 0);
      this.field17496.method22673(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.field17498 = new Class7219(this, 24, 16);
      this.field17498.method22679(-12.0F, 1.0F, 1.5F);
      this.field17498.method22673(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.field17497 = new Class7219(this, 42, 0);
      this.field17497.field31038 = true;
      this.field17497.method22673(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.field17499 = new Class7219(this, 24, 16);
      this.field17499.field31038 = true;
      this.field17499.method22679(12.0F, 1.0F, 1.5F);
      this.field17499.method22673(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.field17495.method22670(this.field17496);
      this.field17495.method22670(this.field17497);
      this.field17496.method22670(this.field17498);
      this.field17497.method22670(this.field17499);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17494, this.field17495);
   }

   public void method10998(Class1114 var1, float var2, float var3, float var4, float var5, float var6) {
      if (!var1.method5364()) {
         this.field17494.field31035 = var6 * (float) (Math.PI / 180.0);
         this.field17494.field31036 = var5 * (float) (Math.PI / 180.0);
         this.field17494.field31037 = 0.0F;
         this.field17494.method22679(0.0F, 0.0F, 0.0F);
         this.field17496.method22679(0.0F, 0.0F, 0.0F);
         this.field17497.method22679(0.0F, 0.0F, 0.0F);
         this.field17495.field31035 = (float) (Math.PI / 4) + MathHelper.cos(var4 * 0.1F) * 0.15F;
         this.field17495.field31036 = 0.0F;
         this.field17496.field31036 = MathHelper.cos(var4 * 1.3F) * (float) Math.PI * 0.25F;
         this.field17497.field31036 = -this.field17496.field31036;
         this.field17498.field31036 = this.field17496.field31036 * 0.5F;
         this.field17499.field31036 = -this.field17496.field31036 * 0.5F;
      } else {
         this.field17494.field31035 = var6 * (float) (Math.PI / 180.0);
         this.field17494.field31036 = (float) Math.PI - var5 * (float) (Math.PI / 180.0);
         this.field17494.field31037 = (float) Math.PI;
         this.field17494.method22679(0.0F, -2.0F, 0.0F);
         this.field17496.method22679(-3.0F, 0.0F, 3.0F);
         this.field17497.method22679(3.0F, 0.0F, 3.0F);
         this.field17495.field31035 = (float) Math.PI;
         this.field17496.field31035 = (float) (-Math.PI / 20);
         this.field17496.field31036 = (float) (-Math.PI * 2.0 / 5.0);
         this.field17498.field31036 = -1.7278761F;
         this.field17497.field31035 = this.field17496.field31035;
         this.field17497.field31036 = -this.field17496.field31036;
         this.field17499.field31036 = -this.field17498.field31036;
      }
   }
}
