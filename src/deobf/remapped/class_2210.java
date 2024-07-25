package remapped;

import com.google.common.collect.ImmutableList;

public class class_2210<T extends class_1775> extends class_5272<T> {
   private static String[] field_11062;
   private final class_1549 field_11067;
   private final class_1549 field_11066;
   private final class_1549 field_11070;
   private final class_1549 field_11068;
   private final class_1549 field_11063;
   private final class_1549 field_11064;
   private final class_1549 field_11069;
   private final class_1549 field_11065;
   private final class_1549 field_11061;

   public class_2210() {
      this.field_49928 = 64;
      this.field_49927 = 128;
      this.field_11067 = new class_1549(this, 0, 32);
      this.field_11067.method_7046(-4.0F, 8.0F, 0.0F);
      this.field_11067.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.field_11066 = new class_1549(this, 0, 55);
      this.field_11066.method_7046(4.0F, 8.0F, 0.0F);
      this.field_11066.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F);
      this.field_11070 = new class_1549(this, 0, 0);
      this.field_11070.method_7046(0.0F, 1.0F, 0.0F);
      this.field_11070.method_7049(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F, 0.0F);
      this.field_11068 = new class_1549(this, 16, 65);
      this.field_11068.method_7046(-8.0F, 4.0F, -8.0F);
      this.field_11068.method_7051(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method_10235(this.field_11068, 0.0F, 0.0F, -1.2217305F);
      this.field_11063 = new class_1549(this, 16, 49);
      this.field_11063.method_7046(-8.0F, -1.0F, -8.0F);
      this.field_11063.method_7051(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method_10235(this.field_11063, 0.0F, 0.0F, -1.134464F);
      this.field_11064 = new class_1549(this, 16, 33);
      this.field_11064.method_7046(-8.0F, -5.0F, -8.0F);
      this.field_11064.method_7051(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F, true);
      this.method_10235(this.field_11064, 0.0F, 0.0F, -0.87266463F);
      this.field_11069 = new class_1549(this, 16, 33);
      this.field_11069.method_7046(8.0F, -6.0F, -8.0F);
      this.field_11069.method_7049(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method_10235(this.field_11069, 0.0F, 0.0F, 0.87266463F);
      this.field_11065 = new class_1549(this, 16, 49);
      this.field_11065.method_7046(8.0F, -2.0F, -8.0F);
      this.field_11065.method_7049(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method_10235(this.field_11065, 0.0F, 0.0F, 1.134464F);
      this.field_11061 = new class_1549(this, 16, 65);
      this.field_11061.method_7046(8.0F, 3.0F, -8.0F);
      this.field_11061.method_7049(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, 0.0F);
      this.method_10235(this.field_11061, 0.0F, 0.0F, 1.2217305F);
      this.field_11070.method_7043(this.field_11068);
      this.field_11070.method_7043(this.field_11063);
      this.field_11070.method_7043(this.field_11064);
      this.field_11070.method_7043(this.field_11069);
      this.field_11070.method_7043(this.field_11065);
      this.field_11070.method_7043(this.field_11061);
   }

   public void method_10234(class_1775 var1, float var2, float var3, float var4, float var5, float var6) {
      var3 = Math.min(0.25F, var3);
      if (var1.method_37114().size() > 0) {
         this.field_11070.field_8191 = 0.0F;
         this.field_11070.field_8190 = 0.0F;
      } else {
         this.field_11070.field_8191 = var6 * (float) (Math.PI / 180.0);
         this.field_11070.field_8190 = var5 * (float) (Math.PI / 180.0);
      }

      float var9 = 1.5F;
      this.field_11070.field_8185 = 0.1F * class_9299.method_42818(var2 * 1.5F) * 4.0F * var3;
      this.field_11070.field_8181 = 2.0F;
      this.field_11070.field_8181 = this.field_11070.field_8181 - 2.0F * class_9299.method_42840(var2 * 1.5F) * 2.0F * var3;
      this.field_11066.field_8191 = class_9299.method_42818(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.field_11067.field_8191 = class_9299.method_42818(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.field_11066.field_8185 = (float) (Math.PI / 18) * class_9299.method_42840(var2 * 1.5F * 0.5F) * var3;
      this.field_11067.field_8185 = (float) (Math.PI / 18) * class_9299.method_42840(var2 * 1.5F * 0.5F + (float) Math.PI) * var3;
      this.field_11066.field_8181 = 8.0F + 2.0F * class_9299.method_42818(var2 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * var3;
      this.field_11067.field_8181 = 8.0F + 2.0F * class_9299.method_42818(var2 * 1.5F * 0.5F) * 2.0F * var3;
      this.field_11068.field_8185 = -1.2217305F;
      this.field_11063.field_8185 = -1.134464F;
      this.field_11064.field_8185 = -0.87266463F;
      this.field_11069.field_8185 = 0.87266463F;
      this.field_11065.field_8185 = 1.134464F;
      this.field_11061.field_8185 = 1.2217305F;
      float var10 = class_9299.method_42840(var2 * 1.5F + (float) Math.PI) * var3;
      this.field_11068.field_8185 += var10 * 1.3F;
      this.field_11063.field_8185 += var10 * 1.2F;
      this.field_11064.field_8185 += var10 * 0.6F;
      this.field_11069.field_8185 += var10 * 0.6F;
      this.field_11065.field_8185 += var10 * 1.2F;
      this.field_11061.field_8185 += var10 * 1.3F;
      float var11 = 1.0F;
      float var12 = 1.0F;
      this.field_11068.field_8185 = this.field_11068.field_8185 + 0.05F * class_9299.method_42818(var4 * 1.0F * -0.4F);
      this.field_11063.field_8185 = this.field_11063.field_8185 + 0.1F * class_9299.method_42818(var4 * 1.0F * 0.2F);
      this.field_11064.field_8185 = this.field_11064.field_8185 + 0.1F * class_9299.method_42818(var4 * 1.0F * 0.4F);
      this.field_11069.field_8185 = this.field_11069.field_8185 + 0.1F * class_9299.method_42818(var4 * 1.0F * 0.4F);
      this.field_11065.field_8185 = this.field_11065.field_8185 + 0.1F * class_9299.method_42818(var4 * 1.0F * 0.2F);
      this.field_11061.field_8185 = this.field_11061.field_8185 + 0.05F * class_9299.method_42818(var4 * 1.0F * -0.4F);
   }

   public void method_10235(class_1549 var1, float var2, float var3, float var4) {
      var1.field_8191 = var2;
      var1.field_8190 = var3;
      var1.field_8185 = var4;
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_11070, this.field_11066, this.field_11067);
   }
}
