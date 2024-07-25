package remapped;

import org.java_websocket.exceptions.InvalidDataException;

public class class_6668 implements class_7159 {
   @Override
   public void method_32857(class_3106 var1) throws InvalidDataException {
   }

   @Override
   public void method_32850(class_3106 var1) {
   }

   @Override
   public boolean method_32855(String var1) {
      return true;
   }

   @Override
   public boolean method_32851(String var1) {
      return true;
   }

   @Override
   public void method_32852(class_3106 var1) throws InvalidDataException {
      if (var1.method_14224() || var1.method_14223() || var1.method_14230()) {
         throw new class_7703("bad rsv RSV1: " + var1.method_14224() + " RSV2: " + var1.method_14223() + " RSV3: " + var1.method_14230());
      }
   }

   @Override
   public String method_32858() {
      return "";
   }

   @Override
   public String method_32854() {
      return "";
   }

   @Override
   public class_7159 method_32856() {
      return new class_6668();
   }

   @Override
   public void method_32853() {
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }

   @Override
   public int hashCode() {
      return this.getClass().hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 != null && this.getClass() == var1.getClass();
   }
}
