package remapped;

import com.google.common.collect.ImmutableList;

public class class_2743<T extends class_8145> extends class_5272<T> {
   private static String[] field_13383;
   private final class_1549 field_13382;

   public class_2743() {
      this.field_49928 = 32;
      this.field_49927 = 32;
      this.field_13382 = new class_1549(this, 0, 0);
      this.field_13382.method_7049(-3.0F, -6.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
      this.field_13382.method_7046(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_13382);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_13382.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_13382.field_8191 = var6 * (float) (Math.PI / 180.0);
   }
}
