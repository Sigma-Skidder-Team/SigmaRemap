package remapped;

import com.google.common.collect.ImmutableList;

public class class_7916<T extends class_6092> extends class_5272<T> {
   private static String[] field_40464;
   private final class_1549 field_40465;
   private final class_1549 field_40466 = new class_1549(64, 64, 0, 0);
   private final class_1549 field_40463;

   public class_7916() {
      super(RenderLayer::method_16753);
      this.field_40465 = new class_1549(64, 64, 0, 28);
      this.field_40463 = new class_1549(64, 64, 0, 52);
      this.field_40466.method_7048(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F);
      this.field_40466.method_7046(0.0F, 24.0F, 0.0F);
      this.field_40465.method_7048(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F);
      this.field_40465.method_7046(0.0F, 24.0F, 0.0F);
      this.field_40463.method_7048(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      this.field_40463.method_7046(0.0F, 12.0F, 0.0F);
   }

   public void method_35817(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var4 - (float)var1.field_41697;
      float var10 = (0.5F + var1.method_27923(var9)) * (float) Math.PI;
      float var11 = -1.0F + MathHelper.sin(var10);
      float var12 = 0.0F;
      if (var10 > (float) Math.PI) {
         var12 = MathHelper.sin(var4 * 0.1F) * 0.7F;
      }

      this.field_40466.method_7046(0.0F, 16.0F + MathHelper.sin(var10) * 8.0F + var12, 0.0F);
      if (!(var1.method_27923(var9) > 0.3F)) {
         this.field_40466.field_8190 = 0.0F;
      } else {
         this.field_40466.field_8190 = var11 * var11 * var11 * var11 * (float) Math.PI * 0.125F;
      }

      this.field_40463.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_40463.field_8190 = (var1.field_29618 - 180.0F - var1.field_29605) * (float) (Math.PI / 180.0);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_40465, this.field_40466);
   }

   public class_1549 method_35819() {
      return this.field_40465;
   }

   public class_1549 method_35818() {
      return this.field_40466;
   }

   public class_1549 method_35820() {
      return this.field_40463;
   }
}
