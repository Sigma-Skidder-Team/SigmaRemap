package mapped;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Class8280 {
   public static final String field35575 = Class8280.class.getName();
   private static Logger field35576 = Logger.getLogger(Class8280.class.getName());
   private static Class8280 field35577;

   public static synchronized Class8280 method28942() {
      if (field35577 == null) {
         String var2 = System.getProperty(field35575);
         if (var2 != null) {
            try {
               field35577 = (Class8280)Class.forName(var2, true, Thread.currentThread().getContextClassLoader()).newInstance();
            } catch (Exception var4) {
               field35576.log(
                  Level.WARNING,
                  "Unable to instantiate configured FFTFactory \"" + var2 + "\". Will fall back to standard implementation. Problem: " + var4,
                  (Throwable)var4
               );
            }
         }

         if (field35577 == null) {
            field35577 = new Class8279();
         }
      }

      return field35577;
   }

   public abstract Transform method28941(int var1);
}
