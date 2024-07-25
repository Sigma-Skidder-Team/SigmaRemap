package remapped;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class class_9767 {
   public static final String field_49602 = class_9767.class.getName();
   private static Logger field_49604 = Logger.getLogger(class_9767.class.getName());
   private static class_9767 field_49603;

   public static synchronized class_9767 method_45072() {
      if (field_49603 == null) {
         String var2 = System.getProperty(field_49602);
         if (var2 != null) {
            try {
               field_49603 = (class_9767)Class.forName(var2, true, Thread.currentThread().getContextClassLoader()).newInstance();
            } catch (Exception var4) {
               field_49604.log(
                  Level.WARNING,
                  "Unable to instantiate configured FFTFactory \"" + var2 + "\". Will fall back to standard implementation. Problem: " + var4,
                  (Throwable)var4
               );
            }
         }

         if (field_49603 == null) {
            field_49603 = new class_4140(null);
         }
      }

      return field_49603;
   }

   public abstract class_2993 method_45071(int var1);
}
