package mapped;

import java.io.EOFException;
import java.io.IOException;

public final class Class1754 implements Class1737 {
   private final Class1734 field9486;
   private final Class1734 field9487;
   private final long field9488;
   public boolean field9489;
   public boolean field9490;
   public static final boolean field9491 = !FramedStream.class.desiredAssertionStatus();
   public final FramedStream field9492;

   public Class1754(FramedStream var1, long var2) {
      this.field9492 = var1;
      this.field9486 = new Class1734();
      this.field9487 = new Class1734();
      this.field9488 = var2;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      } else {
         long var7;
         synchronized (this.field9492) {
            this.method7672();
            this.method7674();
            if (this.field9487.method7582() == 0L) {
               return -1L;
            }

            var7 = this.field9487.method7633(var1, Math.min(var2, this.field9487.method7582()));
            this.field9492.unacknowledgedBytesRead += var7;
            if (this.field9492.unacknowledgedBytesRead >= (long)(this.field9492.connection.field9568.method31385() / 2)) {
               this.field9492.connection.method7718(this.field9492.id, this.field9492.unacknowledgedBytesRead);
               this.field9492.unacknowledgedBytesRead = 0L;
            }
         }

         synchronized (this.field9492.connection) {
            this.field9492.connection.field9566 += var7;
            if (this.field9492.connection.field9566 >= (long)(this.field9492.connection.field9568.method31385() / 2)) {
               this.field9492.connection.method7718(0, this.field9492.connection.field9566);
               this.field9492.connection.field9566 = 0L;
            }

            return var7;
         }
      }
   }

   private void method7672() throws IOException {
      this.field9492.field45338.method15219();

      try {
         while (this.field9487.method7582() == 0L && !this.field9490 && !this.field9489 && this.field9492.field45340 == null) {
            this.field9492.method37998();
         }
      } finally {
         this.field9492.field45338.method15231();
      }
   }

   public void method7673(Class1735 var1, long var2) throws IOException {
      if (!field9491 && Thread.holdsLock(this.field9492)) {
         throw new AssertionError();
      } else {
         while (var2 > 0L) {
            boolean var7;
            boolean var8;
            synchronized (this.field9492) {
               var7 = this.field9490;
               var8 = var2 + this.field9487.method7582() > this.field9488;
            }

            if (var8) {
               var1.method7627(var2);
               this.field9492.method37989(Class2077.field13530);
               return;
            }

            if (var7) {
               var1.method7627(var2);
               return;
            }

            long var10 = var1.method7633(this.field9486, var2);
            if (var10 == -1L) {
               throw new EOFException();
            }

            var2 -= var10;
            synchronized (this.field9492) {
               boolean var13 = this.field9487.method7582() == 0L;
               this.field9487.method7563(this.field9486);
               if (var13) {
                  this.field9492.notifyAll();
               }
            }
         }
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9492.field45338;
   }

   @Override
   public void close() throws IOException {
      synchronized (this.field9492) {
         this.field9489 = true;
         this.field9487.method7626();
         this.field9492.notifyAll();
      }

      this.field9492.method37995();
   }

   private void method7674() throws IOException {
      if (!this.field9489) {
         if (this.field9492.field45340 != null) {
            throw new Class2461(this.field9492.field45340);
         }
      } else {
         throw new IOException("stream closed");
      }
   }
}
