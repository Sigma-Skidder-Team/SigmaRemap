package remapped;

import java.io.IOException;

public class class_8542 extends class_5823 {
   private boolean field_43726;

   public class_8542(class_9485 var1) {
      super(var1, null);
      this.field_43725 = var1;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (var2 >= 0L) {
         if (!this.field_29540) {
            if (!this.field_43726) {
               long var6 = this.field_43725.field_48346.method_24273(var1, var2);
               if (var6 != -1L) {
                  return var6;
               } else {
                  this.field_43726 = true;
                  this.method_26343(true);
                  return -1L;
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
         if (!this.field_43726) {
            this.method_26343(false);
         }

         this.field_29540 = true;
      }
   }
}
