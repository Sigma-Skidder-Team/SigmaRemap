package remapped;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class class_8380 extends RuntimeException {
   private static final Method field_42884;
   private IOException field_42883;

   public class_8380(IOException var1) {
      super(var1);
      this.field_42883 = var1;
   }

   public IOException method_38626() {
      return this.field_42883;
   }

   public void method_38627(IOException var1) {
      this.method_38625(var1, this.field_42883);
      this.field_42883 = var1;
   }

   private void method_38625(IOException var1, IOException var2) {
      if (field_42884 != null) {
         try {
            field_42884.invoke(var1, var2);
         } catch (IllegalAccessException | InvocationTargetException var6) {
         }
      }
   }

   static {
      Method var6;
      try {
         var6 = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
      } catch (Exception var8) {
         var6 = null;
      }

      field_42884 = var6;
   }
}
