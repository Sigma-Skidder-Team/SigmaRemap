package remapped;

import java.io.IOException;

public class class_9751 extends class_7866 {
   private String field_49550;
   private String field_49547;
   private long field_49548;
   private long field_49546;
   private long[] field_49545;

   @Override
   public void method_35605(class_6041 var1) throws IOException {
      this.field_49550 = var1.method_27539(100, "UTF-8");
      this.field_49547 = var1.method_27539(100, "UTF-8");
      this.field_49548 = var1.method_27524(8);
      this.field_49546 = var1.method_27524(8);
      int var4 = var1.method_27531();
      this.field_49545 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_49545[var5] = var1.method_27524(4);
      }
   }

   public String method_45023() {
      return this.field_49550;
   }

   public String method_45024() {
      return this.field_49547;
   }

   public long method_45020() {
      return this.field_49548;
   }

   public long method_45022() {
      return this.field_49546;
   }

   public long[] method_45021() {
      return this.field_49545;
   }
}
