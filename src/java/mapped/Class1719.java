package mapped;

import java.io.IOException;

public final class Class1719 implements Class1716 {
   private final Class4921 field9380;
   private boolean field9381;
   public final Class7933 field9382;

   public Class1719(Class7933 var1) {
      this.field9382 = var1;
      this.field9380 = new Class4921(this.field9382.field34015.method7541());
   }

   @Override
   public Class4916 method7541() {
      return this.field9380;
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      if (!this.field9381) {
         if (var2 != 0L) {
            this.field9382.field34015.method7578(var2);
            this.field9382.field34015.method7565("\r\n");
            this.field9382.field34015.method7540(var1, var2);
            this.field9382.field34015.method7565("\r\n");
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public synchronized void flush() throws IOException {
      if (!this.field9381) {
         this.field9382.field34015.flush();
      }
   }

   @Override
   public synchronized void close() throws IOException {
      if (!this.field9381) {
         this.field9381 = true;
         this.field9382.field34015.method7565("0\r\n\r\n");
         this.field9382.method26683(this.field9380);
         this.field9382.field34016 = 3;
      }
   }
}
