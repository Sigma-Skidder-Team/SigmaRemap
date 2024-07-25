package remapped;

import java.io.IOException;

public final class class_6376 implements class_5322 {
   public final class_245 field_32577;

   public class_6376(class_249 var1) {
      this.field_32575 = var1;
      this.field_32577 = new class_245();
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      synchronized (this.field_32575.field_885) {
         if (this.field_32575.field_888) {
            throw new IllegalStateException("closed");
         } else {
            while (this.field_32575.field_885.method_32468() == 0L) {
               if (this.field_32575.field_883) {
                  return -1L;
               }

               this.field_32577.method_1076(this.field_32575.field_885);
            }

            long var7 = this.field_32575.field_885.method_24273(var1, var2);
            this.field_32575.field_885.notifyAll();
            return var7;
         }
      }
   }

   @Override
   public void close() throws IOException {
      synchronized (this.field_32575.field_885) {
         this.field_32575.field_888 = true;
         this.field_32575.field_885.notifyAll();
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_32577;
   }
}
