package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2810<T extends Entity> extends Class2808<T> {
   private static String[] field17486;
   private final Class7219 field17487;
   private final Class7219 field17488;
   private final Class7219 field17489;
   private final Class7219 field17490;
   private final Class7219 field17491;
   private final Class7219 field17492;

   public Class2810(float var1) {
      this.field17604 = 32;
      this.field17605 = 32;
      byte var4 = 19;
      this.field17487 = new Class7219(this, 0, 20);
      this.field17487.method22675(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, var1);
      this.field17487.method22679(0.0F, 19.0F, 0.0F);
      this.field17488 = new Class7219(this, 21, 16);
      this.field17488.method22675(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, var1);
      this.field17488.method22679(0.0F, 19.0F, 3.0F);
      this.field17489 = new Class7219(this, 2, 16);
      this.field17489.method22675(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field17489.method22679(-1.0F, 20.0F, 0.0F);
      this.field17489.field31036 = (float) (Math.PI / 4);
      this.field17490 = new Class7219(this, 2, 12);
      this.field17490.method22675(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field17490.method22679(1.0F, 20.0F, 0.0F);
      this.field17490.field31036 = (float) (-Math.PI / 4);
      this.field17491 = new Class7219(this, 20, 11);
      this.field17491.method22675(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.field17491.method22679(0.0F, 16.0F, -3.0F);
      this.field17492 = new Class7219(this, 20, 21);
      this.field17492.method22675(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.field17492.method22679(0.0F, 22.0F, -3.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17487, this.field17488, this.field17489, this.field17490, this.field17491, this.field17492);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      if (!var1.isInWater()) {
         var9 = 1.5F;
      }

      this.field17488.field31036 = -var9 * 0.45F * MathHelper.sin(0.6F * var4);
   }
}
