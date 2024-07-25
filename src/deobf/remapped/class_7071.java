package remapped;

import java.io.IOException;

public class class_7071 extends class_6926 {
   private long field_36503;
   private long[] field_36504;
   private long[] field_36506;

   public class_7071() {
      super("Sample To Group Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_36503 = var1.method_27524(4);
      int var4 = (int)var1.method_27524(4);
      this.field_36504 = new long[var4];
      this.field_36506 = new long[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field_36504[var5] = var1.method_27524(4);
         this.field_36506[var5] = var1.method_27524(4);
      }
   }

   public long method_32566() {
      return this.field_36503;
   }

   public long[] method_32568() {
      return this.field_36504;
   }

   public long[] method_32567() {
      return this.field_36506;
   }
}
