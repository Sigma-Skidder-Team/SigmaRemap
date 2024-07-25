package remapped;

import com.google.common.collect.ImmutableList;

public class class_7834<T extends class_8145> extends class_5272<T> {
   private static String[] field_39729;
   private final class_1549 field_39728;

   public class_7834() {
      this.field_49928 = 64;
      this.field_49927 = 32;
      this.field_39728 = new class_1549(this);
      this.field_39728.method_7037(0, 0).method_7049(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F, 0.0F);
      this.field_39728.method_7037(0, 10).method_7049(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F, 0.0F);
      this.field_39728.method_7037(20, 0).method_7049(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F);
      this.field_39728.method_7046(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_39728);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_39728.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_39728.field_8191 = var6 * (float) (Math.PI / 180.0);
   }
}
