package remapped;

import java.io.IOException;

public class class_2669 implements Packet<class_1243> {
   private static String[] field_13122;
   private long field_13123;

   public class_2669() {
   }

   public class_2669(long var1) {
      this.field_13123 = var1;
   }

   public void method_12030(class_1243 var1) {
      var1.method_5574(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_13123 = var1.readLong();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeLong(this.field_13123);
   }

   public long method_12028() {
      return this.field_13123;
   }
}
