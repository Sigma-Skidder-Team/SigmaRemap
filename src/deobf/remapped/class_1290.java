package remapped;

import com.google.common.collect.ImmutableList;

public class class_1290<T extends Entity> extends class_5272<T> {
   private static String[] field_7107;
   private final class_1549 field_7109;
   private final class_1549 field_7108;
   private final class_1549 field_7105;
   private final class_1549 field_7106;

   public class_1290(int var1) {
      this.field_7109 = new class_1549(this, 0, var1);
      this.field_7108 = new class_1549(this, 32, 0);
      this.field_7105 = new class_1549(this, 32, 4);
      this.field_7106 = new class_1549(this, 32, 8);
      if (var1 <= 0) {
         this.field_7109.method_7048(-4.0F, 16.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      } else {
         this.field_7109.method_7048(-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F);
         this.field_7108.method_7048(-3.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F);
         this.field_7105.method_7048(1.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F);
         this.field_7106.method_7048(0.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_7109, this.field_7108, this.field_7105, this.field_7106);
   }
}
