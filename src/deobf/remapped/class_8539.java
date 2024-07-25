package remapped;

public class class_8539<T extends class_9668> extends class_6484<T> {
   private static String[] field_43709;

   public class_8539() {
      super(12, 0.0F, true, 16.0F, 4.0F, 2.25F, 2.0F, 24);
      this.field_49928 = 128;
      this.field_49927 = 64;
      this.field_33024 = new class_1549(this, 0, 0);
      this.field_33024.method_7049(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F);
      this.field_33024.method_7046(0.0F, 10.0F, -16.0F);
      this.field_33024.method_7037(0, 44).method_7049(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F);
      this.field_33024.method_7037(26, 0).method_7049(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      class_1549 var3 = this.field_33024.method_7037(26, 0);
      var3.field_8197 = true;
      var3.method_7049(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field_33021 = new class_1549(this);
      this.field_33021.method_7037(0, 19).method_7049(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, 0.0F);
      this.field_33021.method_7037(39, 0).method_7049(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F, 0.0F);
      this.field_33021.method_7046(-2.0F, 9.0F, 12.0F);
      byte var4 = 10;
      this.field_33022 = new class_1549(this, 50, 22);
      this.field_33022.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.field_33022.method_7046(-3.5F, 14.0F, 6.0F);
      this.field_33027 = new class_1549(this, 50, 22);
      this.field_33027.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.field_33027.method_7046(3.5F, 14.0F, 6.0F);
      this.field_33023 = new class_1549(this, 50, 40);
      this.field_33023.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.field_33023.method_7046(-2.5F, 14.0F, -7.0F);
      this.field_33026 = new class_1549(this, 50, 40);
      this.field_33026.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.field_33026.method_7046(2.5F, 14.0F, -7.0F);
      this.field_33022.field_8183--;
      this.field_33027.field_8183++;
      this.field_33022.field_8187 += 0.0F;
      this.field_33027.field_8187 += 0.0F;
      this.field_33023.field_8183--;
      this.field_33026.field_8183++;
      this.field_33023.field_8187--;
      this.field_33026.field_8187--;
   }

   public void method_39311(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_29700((T)var1, var2, var3, var4, var5, var6);
      float var9 = var4 - (float)var1.field_41697;
      float var10 = var1.method_44710(var9);
      var10 *= var10;
      float var11 = 1.0F - var10;
      this.field_33021.field_8191 = (float) (Math.PI / 2) - var10 * (float) Math.PI * 0.35F;
      this.field_33021.field_8181 = 9.0F * var11 + 11.0F * var10;
      this.field_33023.field_8181 = 14.0F * var11 - 6.0F * var10;
      this.field_33023.field_8187 = -8.0F * var11 - 4.0F * var10;
      this.field_33023.field_8191 -= var10 * (float) Math.PI * 0.45F;
      this.field_33026.field_8181 = this.field_33023.field_8181;
      this.field_33026.field_8187 = this.field_33023.field_8187;
      this.field_33026.field_8191 -= var10 * (float) Math.PI * 0.45F;
      if (!this.field_33204) {
         this.field_33024.field_8181 = 10.0F * var11 - 14.0F * var10;
         this.field_33024.field_8187 = -16.0F * var11 - 3.0F * var10;
      } else {
         this.field_33024.field_8181 = 10.0F * var11 - 9.0F * var10;
         this.field_33024.field_8187 = -16.0F * var11 - 7.0F * var10;
      }

      this.field_33024.field_8191 += var10 * (float) Math.PI * 0.15F;
   }
}
