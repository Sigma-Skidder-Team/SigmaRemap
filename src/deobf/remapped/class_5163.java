package remapped;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.newdawn.slick.SlickException;

public class class_5163 {
   private static final boolean field_26590 = false;
   public static String field_26589 = "tga";
   public static String field_26591 = "png";
   public static String field_26587 = "jpg";

   public static String[] method_23659() {
      return class_5687.method_25721();
   }

   public static void method_23662(class_8112 var0, String var1, OutputStream var2) throws SlickException {
      method_23663(var0, var1, var2, false);
   }

   public static void method_23663(class_8112 var0, String var1, OutputStream var2, boolean var3) throws SlickException {
      try {
         class_5106 var6 = class_5687.method_25723(var1);
         var6.method_23425(var0, var1, var2, var3);
      } catch (IOException var7) {
         throw new class_1162("Unable to write out the image in format: " + var1, var7);
      }
   }

   public static void method_23661(class_8112 var0, String var1) throws SlickException {
      method_23666(var0, var1, false);
   }

   public static void method_23666(class_8112 var0, String var1, boolean var2) throws SlickException {
      try {
         int var5 = var1.lastIndexOf(46);
         if (var5 < 0) {
            throw new class_1162("Unable to determine format from: " + var1);
         } else {
            String var6 = var1.substring(var5 + 1);
            method_23663(var0, var6, new FileOutputStream(var1), var2);
         }
      } catch (IOException var7) {
         throw new class_1162("Unable to write to the destination: " + var1, var7);
      }
   }

   public static void method_23664(class_8112 var0, String var1, String var2) throws SlickException {
      method_23665(var0, var1, var2, false);
   }

   public static void method_23665(class_8112 var0, String var1, String var2, boolean var3) throws SlickException {
      try {
         method_23663(var0, var1, new FileOutputStream(var2), var3);
      } catch (IOException var7) {
         throw new class_1162("Unable to write to the destination: " + var2, var7);
      }
   }
}
