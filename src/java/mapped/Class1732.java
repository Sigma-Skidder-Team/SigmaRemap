package mapped;

import java.io.IOException;
import java.io.OutputStream;

public final class Class1732 implements Class1716 {
   public final Class4916 field9418;
   public final OutputStream field9419;

   public Class1732(Class4916 var1, OutputStream var2) {
      this.field9418 = var1;
      this.field9419 = var2;
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      Class4676.method14644(var1.field9423, 0L, var2);

      while (var2 > 0L) {
         this.field9418.method15217();
         Class9174 var6 = var1.field9422;
         int var7 = (int)Math.min(var2, (long)(var6.field42123 - var6.field42122));
         this.field9419.write(var6.field42121, var6.field42122, var7);
         var6.field42122 += var7;
         var2 -= (long)var7;
         var1.field9423 -= (long)var7;
         if (var6.field42122 == var6.field42123) {
            var1.field9422 = var6.method34280();
            Class5996.method18608(var6);
         }
      }
   }

   @Override
   public void flush() throws IOException {
      this.field9419.flush();
   }

   @Override
   public void close() throws IOException {
      this.field9419.close();
   }

   @Override
   public Class4916 method7541() {
      return this.field9418;
   }

   @Override
   public String toString() {
      return "sink(" + this.field9419 + ")";
   }
}
