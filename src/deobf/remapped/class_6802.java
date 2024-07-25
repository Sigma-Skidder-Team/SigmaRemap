package remapped;

import com.google.common.collect.ImmutableList;

public class class_6802<T extends Entity> extends class_5272<T> {
   private static String[] field_35055;
   private final class_1549 field_35056;
   private final class_1549 field_35053;
   private final class_1549 field_35058;
   private final class_1549 field_35059;
   private final class_1549 field_35054;
   private final class_1549 field_35057;

   public class_6802() {
      this.field_49928 = 32;
      this.field_49927 = 32;
      byte var3 = 23;
      this.field_35056 = new class_1549(this, 0, 27);
      this.field_35056.method_7048(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F);
      this.field_35056.method_7046(0.0F, 23.0F, 0.0F);
      this.field_35053 = new class_1549(this, 24, 6);
      this.field_35053.method_7048(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.field_35053.method_7046(0.0F, 20.0F, 0.0F);
      this.field_35058 = new class_1549(this, 28, 6);
      this.field_35058.method_7048(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.field_35058.method_7046(0.0F, 20.0F, 0.0F);
      this.field_35057 = new class_1549(this, -3, 0);
      this.field_35057.method_7048(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F);
      this.field_35057.method_7046(0.0F, 22.0F, 1.5F);
      this.field_35059 = new class_1549(this, 25, 0);
      this.field_35059.method_7048(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.field_35059.method_7046(-1.5F, 22.0F, -1.5F);
      this.field_35054 = new class_1549(this, 25, 0);
      this.field_35054.method_7048(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.field_35054.method_7046(1.5F, 22.0F, -1.5F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_35056, this.field_35053, this.field_35058, this.field_35057, this.field_35059, this.field_35054);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_35059.field_8185 = -0.2F + 0.4F * MathHelper.sin(var4 * 0.2F);
      this.field_35054.field_8185 = 0.2F - 0.4F * MathHelper.sin(var4 * 0.2F);
   }
}
