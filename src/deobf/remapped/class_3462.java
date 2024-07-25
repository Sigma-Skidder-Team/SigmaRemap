package remapped;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public class class_3462 extends class_5823 {
   private long field_16963;

   public class_3462(class_9485 var1, long var2) throws IOException {
      super(var1, null);
      this.field_16962 = var1;
      this.field_16963 = var2;
      if (this.field_16963 == 0L) {
         this.method_26343(true);
      }
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (var2 >= 0L) {
         if (!this.field_29540) {
            if (this.field_16963 != 0L) {
               long var6 = this.field_16962.field_48346.method_24273(var1, Math.min(this.field_16963, var2));
               if (var6 != -1L) {
                  this.field_16963 -= var6;
                  if (this.field_16963 == 0L) {
                     this.method_26343(true);
                  }

                  return var6;
               } else {
                  this.method_26343(false);
                  throw new ProtocolException("unexpected end of stream");
               }
            } else {
               return -1L;
            }
         } else {
            throw new IllegalStateException("closed");
         }
      } else {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field_29540) {
         if (this.field_16963 != 0L && !class_8515.method_39198(this, 100, TimeUnit.MILLISECONDS)) {
            this.method_26343(false);
         }

         this.field_29540 = true;
      }
   }
}
