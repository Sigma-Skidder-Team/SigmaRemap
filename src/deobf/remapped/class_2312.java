package remapped;

import org.java_websocket.exceptions.InvalidDataException;

public abstract class class_2312 extends class_6668 {
   @Override
   public void method_32852(class_3106 var1) throws InvalidDataException {
      if (!(var1 instanceof class_7518) || !var1.method_14223() && !var1.method_14230()) {
         if (var1 instanceof class_9113 && (var1.method_14224() || var1.method_14223() || var1.method_14230())) {
            throw new class_7703("bad rsv RSV1: " + var1.method_14224() + " RSV2: " + var1.method_14223() + " RSV3: " + var1.method_14230());
         }
      } else {
         throw new class_7703("bad rsv RSV1: " + var1.method_14224() + " RSV2: " + var1.method_14223() + " RSV3: " + var1.method_14230());
      }
   }
}
