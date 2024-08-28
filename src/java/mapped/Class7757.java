package mapped;

public class Class7757 {
   private static String[] field33324;
   private int[] field33325 = null;
   private int field33326 = 0;
   private int field33327 = 0;

   public Class7757(int var1) {
      this.field33325 = new int[var1];
   }

   public void method25713(int var1) {
      this.field33325[this.field33326] = var1;
      this.field33326++;
      if (this.field33327 < this.field33326) {
         this.field33327 = this.field33326;
      }
   }

   public void method25714(int var1, int var2) {
      this.field33325[var1] = var2;
      if (this.field33327 < var1) {
         this.field33327 = var1;
      }
   }

   public void method25715(int var1) {
      this.field33326 = var1;
   }

   public void method25716(int[] var1) {
      int var4 = var1.length;

      for (int var5 = 0; var5 < var4; var5++) {
         this.field33325[this.field33326] = var1[var5];
         this.field33326++;
      }

      if (this.field33327 < this.field33326) {
         this.field33327 = this.field33326;
      }
   }

   public int method25717(int var1) {
      return this.field33325[var1];
   }

   public int[] method25718() {
      return this.field33325;
   }

   public void method25719() {
      this.field33326 = 0;
      this.field33327 = 0;
   }

   public int method25720() {
      return this.field33327;
   }

   public int method25721() {
      return this.field33326;
   }
}
