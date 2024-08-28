package mapped;

import java.io.IOException;

public final class Class1753 implements Class1737 {
   public final Class4916 field9484;
   public final Class4926 field9485;

   public Class1753(Class4926 var1) {
      this.field9485 = var1;
      this.field9484 = new Class4916();
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      synchronized (this.field9485.field22834) {
         if (this.field9485.field22836) {
            throw new IllegalStateException("closed");
         } else {
            while (this.field9485.field22834.method7582() == 0L) {
               if (this.field9485.field22835) {
                  return -1L;
               }

               this.field9484.method15218(this.field9485.field22834);
            }

            long var7 = this.field9485.field22834.method7633(var1, var2);
            this.field9485.field22834.notifyAll();
            return var7;
         }
      }
   }

   @Override
   public void close() throws IOException {
      synchronized (this.field9485.field22834) {
         this.field9485.field22836 = true;
         this.field9485.field22834.notifyAll();
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9484;
   }
}
