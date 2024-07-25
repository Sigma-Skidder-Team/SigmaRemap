package remapped;

import com.google.common.collect.ImmutableList;

public class class_3363<T extends class_8145> extends class_5272<T> {
   private static String[] field_16578;
   private final class_1549 field_16579;
   private final class_1549 field_16582;
   private final class_1549 field_16583;
   private final class_1549 field_16580;
   private final class_1549 field_16581;

   public class_3363() {
      this.field_49928 = 32;
      this.field_49927 = 32;
      byte var3 = 20;
      this.field_16579 = new class_1549(this, 0, 0);
      this.field_16579.method_7048(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.field_16579.method_7046(0.0F, 20.0F, 0.0F);
      this.field_16582 = new class_1549(this, 0, 13);
      this.field_16582.method_7048(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.field_16582.method_7046(0.0F, 20.0F, 8.0F);
      this.field_16583 = new class_1549(this, 22, 0);
      this.field_16583.method_7048(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.field_16583.method_7046(0.0F, 20.0F, 0.0F);
      class_1549 var4 = new class_1549(this, 20, 10);
      var4.method_7048(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F);
      var4.method_7046(0.0F, 0.0F, 8.0F);
      this.field_16582.method_7043(var4);
      class_1549 var5 = new class_1549(this, 2, 1);
      var5.method_7048(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F);
      var5.method_7046(0.0F, -4.5F, 5.0F);
      this.field_16579.method_7043(var5);
      class_1549 var6 = new class_1549(this, 0, 2);
      var6.method_7048(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F);
      var6.method_7046(0.0F, -4.5F, -1.0F);
      this.field_16582.method_7043(var6);
      this.field_16580 = new class_1549(this, -4, 0);
      this.field_16580.method_7048(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field_16580.method_7046(-1.5F, 21.5F, 0.0F);
      this.field_16580.field_8185 = (float) (-Math.PI / 4);
      this.field_16581 = new class_1549(this, 0, 0);
      this.field_16581.method_7048(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field_16581.method_7046(1.5F, 21.5F, 0.0F);
      this.field_16581.field_8185 = (float) (Math.PI / 4);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_16579, this.field_16582, this.field_16583, this.field_16580, this.field_16581);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      float var10 = 1.0F;
      if (!var1.method_37285()) {
         var9 = 1.3F;
         var10 = 1.7F;
      }

      this.field_16582.field_8190 = -var9 * 0.25F * class_9299.method_42818(var10 * 0.6F * var4);
   }
}
