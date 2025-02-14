package mapped;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Class2503 extends RuntimeException {
   private static final Method field16608;
   private IOException field16609;

   public Class2503(IOException var1) {
      super(var1);
      this.field16609 = var1;
   }

   public IOException method10484() {
      return this.field16609;
   }

   public void method10485(IOException var1) {
      this.method10486(var1, this.field16609);
      this.field16609 = var1;
   }

   private void method10486(IOException var1, IOException var2) {
      if (field16608 != null) {
         try {
            field16608.invoke(var1, var2);
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

      field16608 = var6;
   }
}
