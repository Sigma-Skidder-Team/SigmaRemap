package remapped;

public class class_7351 {
   private static String[] field_37576;
   public int field_37579;
   public String field_37578;
   public long field_37577;

   public class_7351(int var1, String var2, long var3) {
      this.field_37579 = var1;
      this.field_37578 = var2;
      this.field_37577 = var3;
   }

   public float method_33495() {
      return (float)(this.field_37579 >> 16 & 0xFF) / 255.0F;
   }

   public float method_33493() {
      return (float)(this.field_37579 >> 8 & 0xFF) / 255.0F;
   }

   public float method_33494() {
      return (float)(this.field_37579 & 0xFF) / 255.0F;
   }

   public float method_33492() {
      return (float)(this.field_37579 >> 24 & 0xFF) / 255.0F;
   }
}
