package remapped;

public final class class_8361 implements class_1720<class_1366> {
   private static String[] field_42833;

   public void method_38548(class_8248 var1, class_1366 var2) {
      var1.writeFloat(var2.method_6280());
      var1.writeFloat(var2.method_6284());
      var1.writeFloat(var2.method_6281());
   }

   public class_1366 method_38551(class_8248 var1) {
      return new class_1366(var1.readFloat(), var1.readFloat(), var1.readFloat());
   }

   public class_1366 method_38550(class_1366 var1) {
      return var1;
   }
}
