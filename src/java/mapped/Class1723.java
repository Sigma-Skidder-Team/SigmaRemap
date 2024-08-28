package mapped;

import java.io.IOException;

public final class Class1723 implements Class1716 {
   private static String[] field9396;
   private static final long field9397 = 16384L;
   private final Class1734 field9398;
   public boolean field9399;
   public boolean field9400;
   public static final boolean field9401 = !Class9698.class.desiredAssertionStatus();
   public final Class9698 field9402;

   public Class1723(Class9698 var1) {
      this.field9402 = var1;
      this.field9398 = new Class1734();
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      if (!field9401 && Thread.holdsLock(this.field9402)) {
         throw new AssertionError();
      } else {
         this.field9398.method7540(var1, var2);

         while (this.field9398.method7582() >= 16384L) {
            this.method7548(false);
         }
      }
   }

   private void method7548(boolean var1) throws IOException {
      long var6;
      synchronized (this.field9402) {
         this.field9402.field45339.method15219();

         try {
            while (this.field9402.field45330 <= 0L && !this.field9400 && !this.field9399 && this.field9402.field45340 == null) {
               this.field9402.method37998();
            }
         } finally {
            this.field9402.field45339.method15231();
         }

         this.field9402.method37997();
         var6 = Math.min(this.field9402.field45330, this.field9398.method7582());
         this.field9402.field45330 -= var6;
      }

      this.field9402.field45339.method15219();

      try {
         this.field9402.field45332.method7714(this.field9402.field45331, var1 && var6 == this.field9398.method7582(), this.field9398, var6);
      } finally {
         this.field9402.field45339.method15231();
      }
   }

   @Override
   public void flush() throws IOException {
      if (!field9401 && Thread.holdsLock(this.field9402)) {
         throw new AssertionError();
      } else {
         synchronized (this.field9402) {
            this.field9402.method37997();
         }

         while (this.field9398.method7582() > 0L) {
            this.method7548(false);
            this.field9402.field45332.method7723();
         }
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9402.field45339;
   }

   @Override
   public void close() throws IOException {
      if (!field9401 && Thread.holdsLock(this.field9402)) {
         throw new AssertionError();
      } else {
         synchronized (this.field9402) {
            if (this.field9399) {
               return;
            }
         }

         if (!this.field9402.field45337.field9400) {
            if (this.field9398.method7582() > 0L) {
               while (this.field9398.method7582() > 0L) {
                  this.method7548(true);
               }
            } else {
               this.field9402.field45332.method7714(this.field9402.field45331, true, null, 0L);
            }
         }

         synchronized (this.field9402) {
            this.field9399 = true;
         }

         this.field9402.field45332.method7723();
         this.field9402.method37995();
      }
   }
}
