package remapped;

import java.lang.reflect.Method;
import java.util.function.LongSupplier;

public final class class_8766 implements LongSupplier {
   private boolean field_44881;

   public class_8766(Method var1, Object var2) {
      this.field_44884 = var1;
      this.field_44883 = var2;
      this.field_44881 = false;
   }

   @Override
   public long getAsLong() {
      if (this.field_44881) {
         return -1L;
      } else {
         try {
            return (Long)this.field_44884.invoke(this.field_44883);
         } catch (Throwable var4) {
            Config.method_14317("" + var4.getClass().getName() + ": " + var4.getMessage());
            this.field_44881 = true;
            return -1L;
         }
      }
   }
}
