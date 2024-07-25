package remapped;

import com.google.common.collect.ImmutableList;

public class class_8716<T extends Entity> extends class_5272<T> {
   private static String[] field_44682;
   private final class_1549 field_44683 = new class_1549(this);

   public class_8716() {
      this(0.0F);
   }

   public class_8716(float var1) {
      byte var4 = 2;
      this.field_44683.method_7037(0, 0).method_7049(-4.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, var1);
      this.field_44683.method_7037(0, 0).method_7049(0.0F, -4.0F, 0.0F, 2.0F, 2.0F, 2.0F, var1);
      this.field_44683.method_7037(0, 0).method_7049(0.0F, 0.0F, -4.0F, 2.0F, 2.0F, 2.0F, var1);
      this.field_44683.method_7037(0, 0).method_7049(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, var1);
      this.field_44683.method_7037(0, 0).method_7049(2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, var1);
      this.field_44683.method_7037(0, 0).method_7049(0.0F, 2.0F, 0.0F, 2.0F, 2.0F, 2.0F, var1);
      this.field_44683.method_7037(0, 0).method_7049(0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F, var1);
      this.field_44683.method_7046(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_44683);
   }
}
