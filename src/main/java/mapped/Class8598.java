package mapped;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Class8598 {
   private static final boolean field38687 = false;
   public static String field38688 = "tga";
   public static String field38689 = "png";
   public static String field38690 = "jpg";

   public static String[] method30748() {
      return Class8728.method31497();
   }

   public static void method30749(Image var0, String var1, OutputStream var2) throws Class2451 {
      method30750(var0, var1, var2, false);
   }

   public static void method30750(Image var0, String var1, OutputStream var2, boolean var3) throws Class2451 {
      try {
         Class8579 var6 = Class8728.method31498(var1);
         var6.method30661(var0, var1, var2, var3);
      } catch (IOException var7) {
         throw new Class2451("Unable to write out the image in format: " + var1, var7);
      }
   }

   public static void method30751(Image var0, String var1) throws Class2451 {
      method30752(var0, var1, false);
   }

   public static void method30752(Image var0, String var1, boolean var2) throws Class2451 {
      try {
         int var5 = var1.lastIndexOf(46);
         if (var5 < 0) {
            throw new Class2451("Unable to determine format from: " + var1);
         } else {
            String var6 = var1.substring(var5 + 1);
            method30750(var0, var6, new FileOutputStream(var1), var2);
         }
      } catch (IOException var7) {
         throw new Class2451("Unable to write to the destination: " + var1, var7);
      }
   }

   public static void method30753(Image var0, String var1, String var2) throws Class2451 {
      method30754(var0, var1, var2, false);
   }

   public static void method30754(Image var0, String var1, String var2, boolean var3) throws Class2451 {
      try {
         method30750(var0, var1, new FileOutputStream(var2), var3);
      } catch (IOException var7) {
         throw new Class2451("Unable to write to the destination: " + var2, var7);
      }
   }
}
