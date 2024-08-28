package mapped;

public class Class8893 {
   private static String[] field40239;
   private int field40240;
   private int field40241;
   private int field40242;
   private int field40243;
   private int field40244;
   private int field40245;
   private int field40246;
   private int field40247;
   private int field40248;
   private int field40249;
   private int field40250;

   public Class8893(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field40240 = var1;
      this.field40241 = var2;
      this.field40242 = var3;
      this.field40243 = var4 - var1 + 1;
      this.field40244 = var5 - var2 + 1;
      this.field40245 = var6 - var3 + 1;
      this.field40246 = this.field40243 * this.field40244 * this.field40245;
   }

   public boolean method32365() {
      if (this.field40247 != this.field40246) {
         this.field40248 = this.field40247 % this.field40243;
         int var3 = this.field40247 / this.field40243;
         this.field40249 = var3 % this.field40244;
         this.field40250 = var3 / this.field40244;
         this.field40247++;
         return true;
      } else {
         return false;
      }
   }

   public int method32366() {
      return this.field40240 + this.field40248;
   }

   public int method32367() {
      return this.field40241 + this.field40249;
   }

   public int method32368() {
      return this.field40242 + this.field40250;
   }

   public int method32369() {
      int var3 = 0;
      if (this.field40248 == 0 || this.field40248 == this.field40243 - 1) {
         var3++;
      }

      if (this.field40249 == 0 || this.field40249 == this.field40244 - 1) {
         var3++;
      }

      if (this.field40250 == 0 || this.field40250 == this.field40245 - 1) {
         var3++;
      }

      return var3;
   }
}
