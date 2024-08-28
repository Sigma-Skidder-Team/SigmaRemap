package mapped;

import java.io.IOException;

public abstract class Class1740 implements Class1737 {
   private final Class1737 field9444;

   public Class1740(Class1737 var1) {
      if (var1 != null) {
         this.field9444 = var1;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final Class1737 method7662() {
      return this.field9444;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      return this.field9444.method7633(var1, var2);
   }

   @Override
   public Class4916 method7541() {
      return this.field9444.method7541();
   }

   @Override
   public void close() throws IOException {
      this.field9444.close();
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "(" + this.field9444.toString() + ")";
   }
}
