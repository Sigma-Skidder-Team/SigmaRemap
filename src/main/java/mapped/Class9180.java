package mapped;

public class Class9180 {
   private static String[] field42158;
   public int field42159;
   public String field42160;
   public long field42161;

   public Class9180(int var1, String var2, long var3) {
      this.field42159 = var1;
      this.field42160 = var2;
      this.field42161 = var3;
   }

   public float method34331() {
      return (float)(this.field42159 >> 16 & 0xFF) / 255.0F;
   }

   public float method34332() {
      return (float)(this.field42159 >> 8 & 0xFF) / 255.0F;
   }

   public float method34333() {
      return (float)(this.field42159 & 0xFF) / 255.0F;
   }

   public float method34334() {
      return (float)(this.field42159 >> 24 & 0xFF) / 255.0F;
   }
}
