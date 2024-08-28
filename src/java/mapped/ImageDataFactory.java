package mapped;

import java.security.AccessController;

public class ImageDataFactory {
   private static boolean field39050 = true;
   private static boolean field39051 = false;
   private static final String field39052 = "org.newdawn.slick.pngloader";

   private static void checkProperty() {
      if (!field39051) {
         field39051 = true;

         try {
            AccessController.doPrivileged(new PrivilegedAction());
         } catch (Throwable var3) {
         }
      }
   }

   public static LoadableImageData getImageDataFor(String var0) {
      checkProperty();
      var0 = var0.toLowerCase();
      if (!var0.endsWith(".tga")) {
         if (!var0.endsWith(".png")) {
            return new Class6958();
         } else {
            Class6959 var3 = new Class6959();
            if (field39050) {
               var3.method21472(new PNGImageData());
            }

            var3.method21472(new Class6958());
            return var3;
         }
      } else {
         return new Class6960();
      }
   }

   // $VF: synthetic method
   public static boolean method31205(boolean var0) {
      field39050 = var0;
      return var0;
   }

   // $VF: synthetic method
   public static boolean method31206() {
      return field39050;
   }
}
