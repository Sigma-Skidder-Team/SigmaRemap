package mapped;

import java.io.IOException;

public final class Class1724 implements Class1716 {
   public final Class4916 field9403;
   public final Class4926 field9404;

   public Class1724(Class4926 var1) {
      this.field9404 = var1;
      this.field9403 = new Class4916();
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      synchronized (this.field9404.field22834) {
         if (this.field9404.field22835) {
            throw new IllegalStateException("closed");
         } else {
            while (var2 > 0L) {
               if (this.field9404.field22836) {
                  throw new IOException("source is closed");
               }

               long var7 = this.field9404.field22833 - this.field9404.field22834.method7582();
               if (var7 == 0L) {
                  this.field9403.method15218(this.field9404.field22834);
               } else {
                  long var9 = Math.min(var7, var2);
                  this.field9404.field22834.method7540(var1, var9);
                  var2 -= var9;
                  this.field9404.field22834.notifyAll();
               }
            }
         }
      }
   }

   @Override
   public void flush() throws IOException {
      synchronized (this.field9404.field22834) {
         if (this.field9404.field22835) {
            throw new IllegalStateException("closed");
         } else if (this.field9404.field22836 && this.field9404.field22834.method7582() > 0L) {
            throw new IOException("source is closed");
         }
      }
   }

   @Override
   public void close() throws IOException {
      synchronized (this.field9404.field22834) {
         if (!this.field9404.field22835) {
            if (this.field9404.field22836 && this.field9404.field22834.method7582() > 0L) {
               throw new IOException("source is closed");
            } else {
               this.field9404.field22835 = true;
               this.field9404.field22834.notifyAll();
            }
         }
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9403;
   }
}
