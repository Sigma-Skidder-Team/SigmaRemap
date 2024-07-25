package remapped;

import java.io.EOFException;
import java.io.IOException;

public final class class_4679 implements class_5322 {
   private final class_7059 field_22807;
   private final class_7059 field_22804;
   private final long field_22808;
   public boolean field_22810;
   public boolean field_22805;

   public class_4679(class_9388 var1, long var2) {
      this.field_22811 = var1;
      this.field_22807 = new class_7059();
      this.field_22804 = new class_7059();
      this.field_22808 = var2;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (var2 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      } else {
         long var7;
         synchronized (this.field_22811) {
            this.method_21631();
            this.method_21634();
            if (this.field_22804.method_32468() == 0L) {
               return -1L;
            }

            var7 = this.field_22804.method_24273(var1, Math.min(var2, this.field_22804.method_32468()));
            this.field_22811.field_47974 += var7;
            if (this.field_22811.field_47974 >= (long)(this.field_22811.field_47980.field_13205.method_25452() / 2)) {
               this.field_22811.field_47980.method_12115(this.field_22811.field_47976, this.field_22811.field_47974);
               this.field_22811.field_47974 = 0L;
            }
         }

         synchronized (this.field_22811.field_47980) {
            this.field_22811.field_47980.field_13206 += var7;
            if (this.field_22811.field_47980.field_13206 >= (long)(this.field_22811.field_47980.field_13205.method_25452() / 2)) {
               this.field_22811.field_47980.method_12115(0, this.field_22811.field_47980.field_13206);
               this.field_22811.field_47980.field_13206 = 0L;
            }

            return var7;
         }
      }
   }

   private void method_21631() throws IOException {
      this.field_22811.field_47975.method_6243();

      try {
         while (this.field_22804.method_32468() == 0L && !this.field_22805 && !this.field_22810 && this.field_22811.field_47986 == null) {
            this.field_22811.method_43428();
         }
      } finally {
         this.field_22811.field_47975.method_23549();
      }
   }

   public void method_21632(class_8067 var1, long var2) throws IOException {
      if (!field_22809 && Thread.holdsLock(this.field_22811)) {
         throw new AssertionError();
      } else {
         while (var2 > 0L) {
            boolean var7;
            boolean var8;
            synchronized (this.field_22811) {
               var7 = this.field_22805;
               var8 = var2 + this.field_22804.method_32468() > this.field_22808;
            }

            if (var8) {
               var1.method_36583(var2);
               this.field_22811.method_43426(class_1692.field_8755);
               return;
            }

            if (var7) {
               var1.method_36583(var2);
               return;
            }

            long var10 = var1.method_24273(this.field_22807, var2);
            if (var10 == -1L) {
               throw new EOFException();
            }

            var2 -= var10;
            synchronized (this.field_22811) {
               boolean var13 = this.field_22804.method_32468() == 0L;
               this.field_22804.method_18237(this.field_22807);
               if (var13) {
                  this.field_22811.notifyAll();
               }
            }
         }
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_22811.field_47975;
   }

   @Override
   public void close() throws IOException {
      synchronized (this.field_22811) {
         this.field_22810 = true;
         this.field_22804.method_32455();
         this.field_22811.notifyAll();
      }

      this.field_22811.method_43427();
   }

   private void method_21634() throws IOException {
      if (!this.field_22810) {
         if (this.field_22811.field_47986 != null) {
            throw new class_7199(this.field_22811.field_47986);
         }
      } else {
         throw new IOException("stream closed");
      }
   }
}
