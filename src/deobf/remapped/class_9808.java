package remapped;

import java.io.IOException;

public class class_9808 implements Packet<class_1243> {
   private static String[] field_49725;
   private boolean field_49726;

   public class_9808() {
   }

   public class_9808(class_964 var1) {
      this.field_49726 = var1.field_4942;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      byte var4 = var1.readByte();
      this.field_49726 = false;
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      byte var4 = 0;
      if (this.field_49726) {
         var4 = (byte)(var4 | 2);
      }

      var1.writeByte(var4);
   }

   public void method_45233(class_1243 var1) {
      var1.method_5542(this);
   }

   public boolean method_45232() {
      return this.field_49726;
   }
}
