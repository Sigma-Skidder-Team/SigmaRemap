package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;

public class Class2805<T extends Entity> extends Class2803<T> {
   private static String[] field17460;
   private final Class7219 field17461;
   private final Class7219 field17462;
   private final Class7219 field17463;

   public Class2805() {
      this.field17604 = 64;
      this.field17605 = 64;
      float var3 = 18.0F;
      float var4 = -8.0F;
      this.field17461 = new Class7219(this, 22, 0);
      this.field17461.method22673(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F);
      this.field17461.method22679(0.0F, 22.0F, -5.0F);
      Class7219 var5 = new Class7219(this, 51, 0);
      var5.method22673(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F);
      var5.field31035 = (float) (Math.PI / 3);
      this.field17461.method22670(var5);
      Class7219 var6 = new Class7219(this, 48, 20);
      var6.field31038 = true;
      var6.method22673(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var6.method22679(2.0F, -2.0F, 4.0F);
      var6.field31035 = (float) (Math.PI / 3);
      var6.field31037 = (float) (Math.PI * 2.0 / 3.0);
      this.field17461.method22670(var6);
      Class7219 var7 = new Class7219(this, 48, 20);
      var7.method22673(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var7.method22679(-2.0F, -2.0F, 4.0F);
      var7.field31035 = (float) (Math.PI / 3);
      var7.field31037 = (float) (-Math.PI * 2.0 / 3.0);
      this.field17461.method22670(var7);
      this.field17462 = new Class7219(this, 0, 19);
      this.field17462.method22673(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F);
      this.field17462.method22679(0.0F, -2.5F, 11.0F);
      this.field17462.field31035 = -0.10471976F;
      this.field17461.method22670(this.field17462);
      this.field17463 = new Class7219(this, 19, 20);
      this.field17463.method22673(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F);
      this.field17463.method22679(0.0F, 0.0F, 9.0F);
      this.field17463.field31035 = 0.0F;
      this.field17462.method22670(this.field17463);
      Class7219 var8 = new Class7219(this, 0, 0);
      var8.method22673(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F);
      var8.method22679(0.0F, -4.0F, -3.0F);
      Class7219 var9 = new Class7219(this, 0, 13);
      var9.method22673(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F);
      var8.method22670(var9);
      this.field17461.method22670(var8);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17461);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17461.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17461.field31036 = var5 * (float) (Math.PI / 180.0);
      if (Entity.method3234(var1.getVec()) > 1.0E-7) {
         this.field17461.field31035 = this.field17461.field31035 + -0.05F + -0.05F * MathHelper.cos(var4 * 0.3F);
         this.field17462.field31035 = -0.1F * MathHelper.cos(var4 * 0.3F);
         this.field17463.field31035 = -0.2F * MathHelper.cos(var4 * 0.3F);
      }
   }
}
