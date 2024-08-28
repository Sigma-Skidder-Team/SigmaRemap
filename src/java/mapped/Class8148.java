package mapped;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Class8148 {
   public static String method28252(String var0) {
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
