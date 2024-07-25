package remapped;

import java.io.IOException;
import java.io.RandomAccessFile;

public class class_2179 implements class_5322 {
   private final class_245 field_10847;
   private class_5085 field_10845;
   private long field_10848;

   public class_2179(class_6219 var1) {
      this.field_10846 = var1;
      this.field_10847 = new class_245();
      this.field_10845 = new class_5085(this.field_10846.field_31773.getChannel());
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (this.field_10845 == null) {
         throw new IllegalStateException("closed");
      } else {
         long var7;
         byte var9;
         synchronized (this.field_10846) {
            while (true) {
               var7 = this.field_10846.field_31761;
               if (this.field_10848 == this.field_10846.field_31761) {
                  if (this.field_10846.field_31762) {
                     return -1L;
                  }

                  if (this.field_10846.field_31768 != null) {
                     this.field_10847.method_1076(this.field_10846);
                     continue;
                  }

                  this.field_10846.field_31768 = Thread.currentThread();
                  var9 = 1;
                  break;
               }

               long var10 = var7 - this.field_10846.field_31759.method_32468();
               if (this.field_10848 >= var10) {
                  long var12 = Math.min(var2, var7 - this.field_10848);
                  this.field_10846.field_31759.method_32472(var1, this.field_10848 - var10, var12);
                  this.field_10848 += var12;
                  return var12;
               }

               var9 = 2;
               break;
            }
         }

         if (var9 == 2) {
            long var38 = Math.min(var2, var7 - this.field_10848);
            this.field_10845.method_23371(32L + this.field_10848, var1, var38);
            this.field_10848 += var38;
            return var38;
         } else {
            long var17;
            try {
               long var15 = this.field_10846.field_31767.method_24273(this.field_10846.field_31758, this.field_10846.field_31769);
               if (var15 != -1L) {
                  var17 = Math.min(var15, var2);
                  this.field_10846.field_31758.method_32472(var1, 0L, var17);
                  this.field_10848 += var17;
                  this.field_10845.method_23372(32L + var7, this.field_10846.field_31758.clone(), var15);
                  synchronized (this.field_10846) {
                     this.field_10846.field_31759.method_19191(this.field_10846.field_31758, var15);
                     if (this.field_10846.field_31759.method_32468() > this.field_10846.field_31769) {
                        this.field_10846.field_31759.method_36583(this.field_10846.field_31759.method_32468() - this.field_10846.field_31769);
                     }

                     this.field_10846.field_31761 += var15;
                  }

                  return var17;
               }

               this.field_10846.method_28442(var7);
               var17 = -1L;
            } finally {
               synchronized (this.field_10846) {
                  this.field_10846.field_31768 = null;
                  this.field_10846.notifyAll();
               }
            }

            return var17;
         }
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_10847;
   }

   @Override
   public void close() throws IOException {
      if (this.field_10845 != null) {
         this.field_10845 = null;
         RandomAccessFile var3 = null;
         synchronized (this.field_10846) {
            this.field_10846.field_31765--;
            if (this.field_10846.field_31765 == 0) {
               var3 = this.field_10846.field_31773;
               this.field_10846.field_31773 = null;
            }
         }

         if (var3 != null) {
            class_8515.method_39200(var3);
         }
      }
   }
}
