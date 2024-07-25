package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class class_379<T extends class_4653> extends class_5272<T> {
   private static String[] field_1542;
   private final class_1549[] field_1540;
   private final class_1549[] field_1539;
   private final ImmutableList<class_1549> field_1541;

   public class_379(float var1) {
      this.field_49928 = 64;
      this.field_49927 = 64;
      this.field_1540 = new class_1549[3];
      this.field_1540[0] = new class_1549(this, 0, 16);
      this.field_1540[0].method_7049(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, var1);
      this.field_1540[1] = new class_1549(this).method_7033(this.field_49928, this.field_49927);
      this.field_1540[1].method_7046(-2.0F, 6.9F, -0.5F);
      this.field_1540[1].method_7037(0, 22).method_7049(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, var1);
      this.field_1540[1].method_7037(24, 22).method_7049(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.field_1540[1].method_7037(24, 22).method_7049(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.field_1540[1].method_7037(24, 22).method_7049(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.field_1540[2] = new class_1549(this, 12, 22);
      this.field_1540[2].method_7049(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, var1);
      this.field_1539 = new class_1549[3];
      this.field_1539[0] = new class_1549(this, 0, 0);
      this.field_1539[0].method_7049(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.field_1539[1] = new class_1549(this, 32, 0);
      this.field_1539[1].method_7049(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var1);
      this.field_1539[1].field_8183 = -8.0F;
      this.field_1539[1].field_8181 = 4.0F;
      this.field_1539[2] = new class_1549(this, 32, 0);
      this.field_1539[2].method_7049(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var1);
      this.field_1539[2].field_8183 = 10.0F;
      this.field_1539[2].field_8181 = 4.0F;
      Builder var4 = ImmutableList.builder();
      var4.addAll(Arrays.<class_1549>asList(this.field_1539));
      var4.addAll(Arrays.<class_1549>asList(this.field_1540));
      this.field_1541 = var4.build();
   }

   public ImmutableList<class_1549> method_1865() {
      return this.field_1541;
   }

   public void method_1864(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = MathHelper.cos(var4 * 0.1F);
      this.field_1540[1].field_8191 = (0.065F + 0.05F * var9) * (float) Math.PI;
      this.field_1540[2]
         .method_7046(
            -2.0F,
            6.9F + MathHelper.cos(this.field_1540[1].field_8191) * 10.0F,
            -0.5F + MathHelper.sin(this.field_1540[1].field_8191) * 10.0F
         );
      this.field_1540[2].field_8191 = (0.265F + 0.1F * var9) * (float) Math.PI;
      this.field_1539[0].field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_1539[0].field_8191 = var6 * (float) (Math.PI / 180.0);
   }

   public void method_1866(T var1, float var2, float var3, float var4) {
      for (int var7 = 1; var7 < 3; var7++) {
         this.field_1539[var7].field_8190 = (var1.method_21511(var7 - 1) - var1.field_29605) * (float) (Math.PI / 180.0);
         this.field_1539[var7].field_8191 = var1.method_21514(var7 - 1) * (float) (Math.PI / 180.0);
      }
   }
}
