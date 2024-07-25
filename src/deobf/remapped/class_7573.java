package remapped;

import java.io.IOException;

public class class_7573 implements Packet<class_392> {
   private static String[] field_38590;
   private long field_38589;

   public class_7573() {
   }

   public class_7573(long var1) {
      this.field_38589 = var1;
   }

   public void method_34430(class_392 var1) {
      var1.method_1937(this);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_38589 = var1.readLong();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeLong(this.field_38589);
   }

   public long method_34428() {
      return this.field_38589;
   }
}
