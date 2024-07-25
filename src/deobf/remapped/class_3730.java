package remapped;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class class_3730 {
   public static String method_17283(String var0) {
      String var3;
      try {
         var3 = ResourceBundle.getBundle("javax.vecmath.ExceptionStrings").getString(var0);
      } catch (MissingResourceException var5) {
         System.err.println("VecMathI18N: Error looking up: " + var0);
         var3 = var0;
      }

      return var3;
   }
}
