package remapped;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public class class_3879 extends class_5823 {
   private static final long field_18885 = -1L;
   private final class_1672 field_18884;
   private long field_18880;
   private boolean field_18882;

   public class_3879(class_9485 var1, class_1672 var2) {
      super(var1, null);
      this.field_18883 = var1;
      this.field_18880 = -1L;
      this.field_18882 = true;
      this.field_18884 = var2;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      } else if (!this.field_29540) {
         if (!this.field_18882) {
            return -1L;
         } else {
            if (this.field_18880 == 0L || this.field_18880 == -1L) {
               this.method_17942();
               if (!this.field_18882) {
                  return -1L;
               }
            }

            long var6 = this.field_18883.field_48346.method_24273(var1, Math.min(var2, this.field_18880));
            if (var6 != -1L) {
               this.field_18880 -= var6;
               return var6;
            } else {
               this.method_26343(false);
               throw new ProtocolException("unexpected end of stream");
            }
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   private void method_17942() throws IOException {
      if (this.field_18880 != -1L) {
         this.field_18883.field_48346.method_36584();
      }

      try {
         this.field_18880 = this.field_18883.field_48346.method_36607();
         String var3 = this.field_18883.field_48346.method_36584().trim();
         if (this.field_18880 < 0L || !var3.isEmpty() && !var3.startsWith(";")) {
            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.field_18880 + var3 + "\"");
         }
      } catch (NumberFormatException var4) {
         throw new ProtocolException(var4.getMessage());
      }

      if (this.field_18880 == 0L) {
         this.field_18882 = false;
         class_4464.method_20711(this.field_18883.field_48345.method_36661(), this.field_18884, this.field_18883.method_43815());
         this.method_26343(true);
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field_29540) {
         if (this.field_18882 && !class_8515.method_39198(this, 100, TimeUnit.MILLISECONDS)) {
            this.method_26343(false);
         }

         this.field_29540 = true;
      }
   }
}
