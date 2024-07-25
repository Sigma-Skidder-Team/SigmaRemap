package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class class_7677<T extends class_3845> extends class_6484<T> {
   private static String[] field_39024;
   private final class_1549 field_39023;

   public class_7677(float var1) {
      super(12, var1, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
      this.field_49928 = 128;
      this.field_49927 = 64;
      this.field_33024 = new class_1549(this, 3, 0);
      this.field_33024.method_7049(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F);
      this.field_33024.method_7046(0.0F, 19.0F, -10.0F);
      this.field_33021 = new class_1549(this);
      this.field_33021.method_7037(7, 37).method_7049(-9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F, 0.0F);
      this.field_33021.method_7037(31, 1).method_7049(-5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F, 0.0F);
      this.field_33021.method_7046(0.0F, 11.0F, -10.0F);
      this.field_39023 = new class_1549(this);
      this.field_39023.method_7037(70, 33).method_7049(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F, 0.0F);
      this.field_39023.method_7046(0.0F, 11.0F, -10.0F);
      boolean var4 = true;
      this.field_33022 = new class_1549(this, 1, 23);
      this.field_33022.method_7049(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.field_33022.method_7046(-3.5F, 22.0F, 11.0F);
      this.field_33027 = new class_1549(this, 1, 12);
      this.field_33027.method_7049(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.field_33027.method_7046(3.5F, 22.0F, 11.0F);
      this.field_33023 = new class_1549(this, 27, 30);
      this.field_33023.method_7049(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.field_33023.method_7046(-5.0F, 21.0F, -4.0F);
      this.field_33026 = new class_1549(this, 27, 24);
      this.field_33026.method_7049(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.field_33026.method_7046(5.0F, 21.0F, -4.0F);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return Iterables.concat(super.method_6902(), ImmutableList.of(this.field_39023));
   }

   public void method_34790(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_29700((T)var1, var2, var3, var4, var5, var6);
      this.field_33022.field_8191 = class_9299.method_42840(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.field_33027.field_8191 = class_9299.method_42840(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.field_33023.field_8185 = class_9299.method_42840(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.field_33026.field_8185 = class_9299.method_42840(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.field_33023.field_8191 = 0.0F;
      this.field_33026.field_8191 = 0.0F;
      this.field_33023.field_8190 = 0.0F;
      this.field_33026.field_8190 = 0.0F;
      this.field_33022.field_8190 = 0.0F;
      this.field_33027.field_8190 = 0.0F;
      this.field_39023.field_8191 = (float) (Math.PI / 2);
      if (!var1.method_37285() && var1.method_37360()) {
         float var9 = !var1.method_17862() ? 1.0F : 4.0F;
         float var10 = !var1.method_17862() ? 1.0F : 2.0F;
         float var11 = 5.0F;
         this.field_33023.field_8190 = class_9299.method_42840(var9 * var2 * 5.0F + (float) Math.PI) * 8.0F * var3 * var10;
         this.field_33023.field_8185 = 0.0F;
         this.field_33026.field_8190 = class_9299.method_42840(var9 * var2 * 5.0F) * 8.0F * var3 * var10;
         this.field_33026.field_8185 = 0.0F;
         this.field_33022.field_8190 = class_9299.method_42840(var2 * 5.0F + (float) Math.PI) * 3.0F * var3;
         this.field_33022.field_8191 = 0.0F;
         this.field_33027.field_8190 = class_9299.method_42840(var2 * 5.0F) * 3.0F * var3;
         this.field_33027.field_8191 = 0.0F;
      }

      this.field_39023.field_8200 = !this.field_33204 && var1.method_17856();
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      boolean var11 = this.field_39023.field_8200;
      if (var11) {
         var1.method_36063();
         var1.method_36065(0.0, -0.08F, 0.0);
      }

      super.method_45499(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var11) {
         var1.method_36064();
      }
   }
}
