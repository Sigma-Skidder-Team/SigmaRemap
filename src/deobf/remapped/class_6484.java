package remapped;

import com.google.common.collect.ImmutableList;

public class class_6484<T extends class_8145> extends class_1498<T> {
   private static String[] field_33025;
   public class_1549 field_33024 = new class_1549(this, 0, 0);
   public class_1549 field_33021;
   public class_1549 field_33022;
   public class_1549 field_33027;
   public class_1549 field_33023;
   public class_1549 field_33026;

   public class_6484(int var1, float var2, boolean var3, float var4, float var5, float var6, float var7, int var8) {
      super(var3, var4, var5, var6, var7, (float)var8);
      this.field_33024.method_7049(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, var2);
      this.field_33024.method_7046(0.0F, (float)(18 - var1), -6.0F);
      this.field_33021 = new class_1549(this, 28, 8);
      this.field_33021.method_7049(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, var2);
      this.field_33021.method_7046(0.0F, (float)(17 - var1), 2.0F);
      this.field_33022 = new class_1549(this, 0, 16);
      this.field_33022.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field_33022.method_7046(-3.0F, (float)(24 - var1), 7.0F);
      this.field_33027 = new class_1549(this, 0, 16);
      this.field_33027.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field_33027.method_7046(3.0F, (float)(24 - var1), 7.0F);
      this.field_33023 = new class_1549(this, 0, 16);
      this.field_33023.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field_33023.method_7046(-3.0F, (float)(24 - var1), -5.0F);
      this.field_33026 = new class_1549(this, 0, 16);
      this.field_33026.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.field_33026.method_7046(3.0F, (float)(24 - var1), -5.0F);
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of(this.field_33024);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_33021, this.field_33022, this.field_33027, this.field_33023, this.field_33026);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_33024.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_33024.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_33021.field_8191 = (float) (Math.PI / 2);
      this.field_33022.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3;
      this.field_33027.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_33023.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_33026.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3;
   }
}
