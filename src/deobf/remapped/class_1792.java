package remapped;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class_1792 {
   public static void method_7984() {
      File var2 = new File("jello/jello.lic");
      if (var2.exists()) {
         var2.delete();
      }

      try {
         Method var3 = System.class.getMethod("exit", int.class);
         var3.invoke(null, 0);
      } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException var4) {
         var4.printStackTrace();
      }
   }
}
