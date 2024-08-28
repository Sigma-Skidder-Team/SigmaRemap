package mapped;

import java.lang.reflect.Method;
import java.util.function.LongSupplier;

public final class Class9538 implements LongSupplier {
   private boolean field44406;
   public final Method field44407;
   public final Object field44408;

   public Class9538(Method var1, Object var2) {
      this.field44407 = var1;
      this.field44408 = var2;
      this.field44406 = false;
   }

   @Override
   public long getAsLong() {
      if (this.field44406) {
         return -1L;
      } else {
         try {
            return (Long)this.field44407.invoke(this.field44408);
         } catch (Throwable var4) {
            Class7944.method26811("" + var4.getClass().getName() + ": " + var4.getMessage());
            this.field44406 = true;
            return -1L;
         }
      }
   }
}
