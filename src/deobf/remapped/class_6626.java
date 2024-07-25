package remapped;

import java.io.IOException;

public final class class_6626 implements class_4131 {
   public final class_245 field_34200;

   public class_6626(class_249 var1) {
      this.field_34201 = var1;
      this.field_34200 = new class_245();
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      synchronized (this.field_34201.field_885) {
         if (this.field_34201.field_883) {
            throw new IllegalStateException("closed");
         } else {
            while (var2 > 0L) {
               if (this.field_34201.field_888) {
                  throw new IOException("source is closed");
               }

               long var7 = this.field_34201.field_886 - this.field_34201.field_885.method_32468();
               if (var7 == 0L) {
                  this.field_34200.method_1076(this.field_34201.field_885);
               } else {
                  long var9 = Math.min(var7, var2);
                  this.field_34201.field_885.method_19191(var1, var9);
                  var2 -= var9;
                  this.field_34201.field_885.notifyAll();
               }
            }
         }
      }
   }

   @Override
   public void flush() throws IOException {
      synchronized (this.field_34201.field_885) {
         if (this.field_34201.field_883) {
            throw new IllegalStateException("closed");
         } else if (this.field_34201.field_888 && this.field_34201.field_885.method_32468() > 0L) {
            throw new IOException("source is closed");
         }
      }
   }

   @Override
   public void close() throws IOException {
      synchronized (this.field_34201.field_885) {
         if (!this.field_34201.field_883) {
            if (this.field_34201.field_888 && this.field_34201.field_885.method_32468() > 0L) {
               throw new IOException("source is closed");
            } else {
               this.field_34201.field_883 = true;
               this.field_34201.field_885.notifyAll();
            }
         }
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_34200;
   }
}
