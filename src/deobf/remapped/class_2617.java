package remapped;

public class class_2617 implements class_3354 {
   private static String[] field_12917;
   private final int field_12913;
   private final int field_12910;
   private final float field_12915;
   private final float field_12912;
   private final float field_12911;
   private final int field_12916;

   private class_2617(class_2979 var1, int var2, int var3, int var4, int var5, float var6, float var7, int var8) {
      this.field_12914 = var1;
      this.field_12913 = var3 - var2;
      this.field_12910 = var4 - var5;
      this.field_12911 = var6 / class_2979.method_13649(var1);
      this.field_12915 = (var7 + (float)var2 + class_2979.method_13654(var1)) / class_2979.method_13649(var1);
      this.field_12912 = (class_2979.method_13651(var1) - (float)var4 + class_2979.method_13648(var1)) / class_2979.method_13649(var1);
      this.field_12916 = var8;
   }

   @Override
   public int method_15371() {
      return this.field_12913;
   }

   @Override
   public int method_15366() {
      return this.field_12910;
   }

   @Override
   public float method_15365() {
      return class_2979.method_13649(this.field_12914);
   }

   @Override
   public float method_25220() {
      return this.field_12911;
   }

   @Override
   public float method_25219() {
      return this.field_12915;
   }

   @Override
   public float method_15372() {
      return this.field_12912;
   }

   @Override
   public void method_15364(int var1, int var2) {
      class_5797 var5 = new class_5797(class_5810.field_29340, this.field_12913, this.field_12910, false);
      var5.method_26261(
         class_2979.method_13647(this.field_12914),
         this.field_12916,
         this.field_12913,
         this.field_12910,
         class_2979.method_13653(this.field_12914),
         class_2979.method_13653(this.field_12914),
         class_2979.method_13654(this.field_12914),
         class_2979.method_13648(this.field_12914),
         0,
         0
      );
      var5.method_26258(0, var1, var2, 0, 0, this.field_12913, this.field_12910, false, true);
   }

   @Override
   public boolean method_15370() {
      return false;
   }
}
