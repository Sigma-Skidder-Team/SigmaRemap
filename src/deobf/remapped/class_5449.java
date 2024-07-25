package remapped;

import java.security.AccessController;

public class class_5449 {
   private static boolean field_27777 = true;
   private static boolean field_27778 = false;
   private static final String field_27775 = "org.newdawn.slick.pngloader";

   private static void method_24836() {
      if (!field_27778) {
         field_27778 = true;

         try {
            AccessController.doPrivileged(new class_6347());
         } catch (Throwable var3) {
         }
      }
   }

   public static class_7411 method_24832(String var0) {
      method_24836();
      var0 = var0.toLowerCase();
      if (!var0.endsWith(".tga")) {
         if (!var0.endsWith(".png")) {
            return new class_4585();
         } else {
            class_4123 var3 = new class_4123();
            if (field_27777) {
               var3.method_19138(new class_8700());
            }

            var3.method_19138(new class_4585());
            return var3;
         }
      } else {
         return new class_2489();
      }
   }
}
