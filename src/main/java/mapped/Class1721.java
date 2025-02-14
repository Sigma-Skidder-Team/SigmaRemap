package mapped;

import java.io.IOException;

public final class Class1721 implements Sink {
   public int field9386;
   public long field9387;
   public boolean field9388;
   public boolean field9389;
   public final Class7034 field9390;

   public Class1721(Class7034 var1) {
      this.field9390 = var1;
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      if (this.field9389) {
         throw new IOException("closed");
      } else {
         this.field9390.field30351.method7540(var1, var2);
         boolean var6 = this.field9388 && this.field9387 != -1L && this.field9390.field30351.method7582() > this.field9387 - 8192L;
         long var7 = this.field9390.field30351.method7595();
         if (var7 > 0L && !var6) {
            synchronized (this.field9390) {
               this.field9390.method21834(this.field9386, var7, this.field9388, false);
            }

            this.field9388 = false;
         }
      }
   }

   @Override
   public void flush() throws IOException {
      if (this.field9389) {
         throw new IOException("closed");
      } else {
         synchronized (this.field9390) {
            this.field9390.method21834(this.field9386, this.field9390.field30351.method7582(), this.field9388, false);
         }

         this.field9388 = false;
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9390.field30349.method7541();
   }

   @Override
   public void close() throws IOException {
      if (this.field9389) {
         throw new IOException("closed");
      } else {
         synchronized (this.field9390) {
            this.field9390.method21834(this.field9386, this.field9390.field30351.method7582(), this.field9388, true);
         }

         this.field9389 = true;
         this.field9390.field30353 = false;
      }
   }
}
