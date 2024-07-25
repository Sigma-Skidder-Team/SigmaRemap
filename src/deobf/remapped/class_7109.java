package remapped;

import org.java_websocket.exceptions.InvalidDataException;

public class class_7109 extends class_7518 {
   public class_7109() {
      super(class_9252.field_47232);
   }

   @Override
   public void method_23572() throws InvalidDataException {
      super.method_23572();
      if (!class_3687.method_17150(this.method_14228())) {
         throw new class_9615(1007, "Received text is no valid utf8 string!");
      }
   }
}
