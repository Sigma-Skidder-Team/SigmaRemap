package remapped;

public enum class_5810 {
   field_29333(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true),
   field_29328(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true),
   field_29339(2, 6410, false, false, false, true, true, 255, 255, 255, 0, 8, true),
   field_29340(1, 6409, false, false, false, true, false, 0, 0, 0, 0, 255, true);

   private final int field_29336;
   private final int field_29343;
   private final boolean field_29338;
   private final boolean field_29326;
   private final boolean field_29332;
   private final boolean field_29329;
   private final boolean field_29334;
   private final int field_29330;
   private final int field_29337;
   private final int field_29335;
   private final int field_29342;
   private final int field_29331;
   private final boolean field_29341;

   private class_5810(
      int var3,
      int var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      boolean var15
   ) {
      this.field_29336 = var3;
      this.field_29343 = var4;
      this.field_29338 = var5;
      this.field_29326 = var6;
      this.field_29332 = var7;
      this.field_29329 = var8;
      this.field_29334 = var9;
      this.field_29330 = var10;
      this.field_29337 = var11;
      this.field_29335 = var12;
      this.field_29342 = var13;
      this.field_29331 = var14;
      this.field_29341 = var15;
   }

   public int method_26306() {
      return this.field_29336;
   }

   public void method_26308() {
      class_3542.method_16431(class_3542::method_16366);
      class_1920.method_8763(3333, this.method_26306());
   }

   public void method_26314() {
      class_3542.method_16431(class_3542::method_16440);
      class_1920.method_8763(3317, this.method_26306());
   }

   public int method_26312() {
      return this.field_29343;
   }

   public boolean method_26305() {
      return this.field_29334;
   }

   public int method_26309() {
      return this.field_29331;
   }

   public boolean method_26310() {
      return this.field_29329 || this.field_29334;
   }

   public int method_26303() {
      return !this.field_29329 ? this.field_29331 : this.field_29342;
   }

   public boolean method_26311() {
      return this.field_29341;
   }

   private static class_5810 method_26304(int var0) {
      switch (var0) {
         case 1:
            return field_29340;
         case 2:
            return field_29339;
         case 3:
            return field_29328;
         case 4:
         default:
            return field_29333;
      }
   }
}
