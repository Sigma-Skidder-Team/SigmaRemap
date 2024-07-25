package remapped;

import java.io.IOException;

public class class_8508 implements Packet<class_392> {
   private static String[] field_43550;
   private long field_43552;
   private long field_43551;

   public class_8508() {
   }

   public class_8508(long var1, long var3, boolean var5) {
      this.field_43552 = var1;
      this.field_43551 = var3;
      if (!var5) {
         this.field_43551 = -this.field_43551;
         if (this.field_43551 == 0L) {
            this.field_43551 = -1L;
         }
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_43552 = var1.readLong();
      this.field_43551 = var1.readLong();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeLong(this.field_43552);
      var1.writeLong(this.field_43551);
   }

   public void method_39181(class_392 var1) {
      var1.method_1971(this);
   }

   public long method_39180() {
      return this.field_43552;
   }

   public long method_39179() {
      return this.field_43551;
   }
}
