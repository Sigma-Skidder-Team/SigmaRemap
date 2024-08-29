package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;

public class Class2889<T extends Entity> extends Class2803<T> {
   private static String[] field17901;
   private final Class7219 field17902;

   public Class2889() {
      this.field17604 = 32;
      this.field17605 = 32;
      this.field17902 = new Class7219(this, 0, 0);
      this.field17902.method22675(-3.0F, -6.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
      this.field17902.method22679(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17902);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17902.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17902.field31035 = var6 * (float) (Math.PI / 180.0);
   }
}
