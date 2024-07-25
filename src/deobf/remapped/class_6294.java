package remapped;

public class class_6294 {
   private static String[] field_32165;
   private long field_32168;
   private long field_32167;
   private boolean field_32169;

   public class_6294(class_9450 var1) {
      this.field_32166 = var1;
      this.field_32168 = 0L;
      this.field_32167 = 0L;
      this.field_32169 = false;
   }

   public void method_28724() {
      this.field_32169 = true;
      this.field_32168 = System.currentTimeMillis();
   }

   public void method_28726() {
      this.field_32169 = false;
   }

   public void method_28728() {
      this.field_32167 = 0L;
      this.field_32168 = System.currentTimeMillis();
   }

   public long method_28723() {
      if (this.field_32169) {
         this.field_32167 = this.field_32167 + (System.currentTimeMillis() - this.field_32168);
         this.field_32168 = System.currentTimeMillis();
      }

      return this.field_32167;
   }

   public boolean method_28727() {
      return this.field_32169;
   }
}
