package remapped;

public final class class_8392 implements class_3354 {
   private static String[] field_42955;
   private final float field_42954;
   private final class_5797 field_42957;
   private final int field_42949;
   private final int field_42951;
   private final int field_42948;
   private final int field_42952;
   private final int field_42950;
   private final int field_42953;
   private float field_42956 = 1.0F;

   private class_8392(float var1, class_5797 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.field_42954 = var1;
      this.field_42957 = var2;
      this.field_42949 = var3;
      this.field_42951 = var4;
      this.field_42948 = var5;
      this.field_42952 = var6;
      this.field_42950 = var7;
      this.field_42953 = var8;
   }

   @Override
   public float method_15365() {
      return 1.0F / this.field_42954;
   }

   @Override
   public int method_15371() {
      return this.field_42948;
   }

   @Override
   public int method_15366() {
      return this.field_42952;
   }

   @Override
   public float method_25220() {
      return (float)this.field_42950;
   }

   @Override
   public float method_15372() {
      return class_3354.super.method_15372() + 7.0F - (float)this.field_42953;
   }

   @Override
   public void method_15364(int var1, int var2) {
      this.field_42957.method_26258(0, var1, var2, this.field_42949, this.field_42951, this.field_42948, this.field_42952, false, false);
   }

   @Override
   public boolean method_15370() {
      return this.field_42957.method_26262().method_26306() > 1;
   }

   @Override
   public float method_25218() {
      return this.field_42956;
   }
}
