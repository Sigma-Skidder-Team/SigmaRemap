package remapped;

import java.io.IOException;

public class class_1369 implements class_6310<class_7394> {
   private static String[] field_7444;
   private long field_7445;

   public class_1369() {
   }

   public class_1369(long var1) {
      this.field_7445 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_7445 = var1.readLong();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeLong(this.field_7445);
   }

   public void method_6340(class_7394 var1) {
      var1.method_33673(this);
   }

   public long method_6339() {
      return this.field_7445;
   }
}
