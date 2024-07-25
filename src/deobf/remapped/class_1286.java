package remapped;

public class class_1286<T extends class_8031> extends class_6484<T> {
   private static String[] field_7058;
   private float field_7059;

   public class_1286() {
      super(12, 0.0F, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
      this.field_33024 = new class_1549(this, 0, 0);
      this.field_33024.method_7049(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.6F);
      this.field_33024.method_7046(0.0F, 6.0F, -8.0F);
      this.field_33021 = new class_1549(this, 28, 8);
      this.field_33021.method_7049(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 1.75F);
      this.field_33021.method_7046(0.0F, 5.0F, 2.0F);
      float var3 = 0.5F;
      this.field_33022 = new class_1549(this, 0, 16);
      this.field_33022.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.field_33022.method_7046(-3.0F, 12.0F, 7.0F);
      this.field_33027 = new class_1549(this, 0, 16);
      this.field_33027.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.field_33027.method_7046(3.0F, 12.0F, 7.0F);
      this.field_33023 = new class_1549(this, 0, 16);
      this.field_33023.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.field_33023.method_7046(-3.0F, 12.0F, -5.0F);
      this.field_33026 = new class_1549(this, 0, 16);
      this.field_33026.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
      this.field_33026.method_7046(3.0F, 12.0F, -5.0F);
   }

   public void method_5737(T var1, float var2, float var3, float var4) {
      super.method_29702((T)var1, var2, var3, var4);
      this.field_33024.field_8181 = 6.0F + var1.method_36472(var4) * 9.0F;
      this.field_7059 = var1.method_36479(var4);
   }

   public void method_5736(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_29700((T)var1, var2, var3, var4, var5, var6);
      this.field_33024.field_8191 = this.field_7059;
   }
}
