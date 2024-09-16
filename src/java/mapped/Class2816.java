package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2816<T extends Entity> extends Class2803<T> {
   private static String[] field17545;
   private final Class7219 field17546;
   private final Class7219 field17547;
   private final Class7219 field17548;
   private final Class7219 field17549;
   private final Class7219 field17550;

   public Class2816() {
      this.field17604 = 32;
      this.field17605 = 32;
      byte var3 = 20;
      this.field17546 = new Class7219(this, 0, 0);
      this.field17546.method22673(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.field17546.method22679(0.0F, 20.0F, 0.0F);
      this.field17547 = new Class7219(this, 0, 13);
      this.field17547.method22673(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.field17547.method22679(0.0F, 20.0F, 8.0F);
      this.field17548 = new Class7219(this, 22, 0);
      this.field17548.method22673(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.field17548.method22679(0.0F, 20.0F, 0.0F);
      Class7219 var4 = new Class7219(this, 20, 10);
      var4.method22673(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F);
      var4.method22679(0.0F, 0.0F, 8.0F);
      this.field17547.method22670(var4);
      Class7219 var5 = new Class7219(this, 2, 1);
      var5.method22673(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F);
      var5.method22679(0.0F, -4.5F, 5.0F);
      this.field17546.method22670(var5);
      Class7219 var6 = new Class7219(this, 0, 2);
      var6.method22673(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F);
      var6.method22679(0.0F, -4.5F, -1.0F);
      this.field17547.method22670(var6);
      this.field17549 = new Class7219(this, -4, 0);
      this.field17549.method22673(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field17549.method22679(-1.5F, 21.5F, 0.0F);
      this.field17549.field31037 = (float) (-Math.PI / 4);
      this.field17550 = new Class7219(this, 0, 0);
      this.field17550.method22673(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field17550.method22679(1.5F, 21.5F, 0.0F);
      this.field17550.field31037 = (float) (Math.PI / 4);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17546, this.field17547, this.field17548, this.field17549, this.field17550);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      float var10 = 1.0F;
      if (!var1.isInWater()) {
         var9 = 1.3F;
         var10 = 1.7F;
      }

      this.field17547.field31036 = -var9 * 0.25F * MathHelper.sin(var10 * 0.6F * var4);
   }
}
