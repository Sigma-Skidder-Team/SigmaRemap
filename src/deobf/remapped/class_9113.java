package remapped;

import org.java_websocket.exceptions.InvalidDataException;

public abstract class class_9113 extends class_5148 {
   public class_9113(class_9252 var1) {
      super(var1);
   }

   @Override
   public void method_23572() throws InvalidDataException {
      if (this.method_14229()) {
         if (!this.method_14224()) {
            if (!this.method_14223()) {
               if (this.method_14230()) {
                  throw new class_7703("Control frame cant have rsv3==true set");
               }
            } else {
               throw new class_7703("Control frame cant have rsv2==true set");
            }
         } else {
            throw new class_7703("Control frame cant have rsv1==true set");
         }
      } else {
         throw new class_7703("Control frame cant have fin==false set");
      }
   }
}
