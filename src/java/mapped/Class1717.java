package mapped;

import java.io.IOException;

public class Class1717 implements Class1716 {
   public final Class1716 field9374;
   public final Class4918 field9375;

   public Class1717(Class4918 var1, Class1716 var2) {
      this.field9375 = var1;
      this.field9374 = var2;
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      Class4676.method14644(var1.field9423, 0L, var2);

      while (var2 > 0L) {
         long var6 = 0L;

         for (Class9174 var8 = var1.field9422; var6 < 65536L; var8 = var8.field42126) {
            int var9 = var1.field9422.field42123 - var1.field9422.field42122;
            var6 += (long)var9;
            if (var6 >= var2) {
               var6 = var2;
               break;
            }
         }

         boolean var15 = false;
         this.field9375.method15219();

         try {
            this.field9374.method7540(var1, var6);
            var2 -= var6;
            var15 = true;
         } catch (IOException var13) {
            throw this.field9375.method15228(var13);
         } finally {
            this.field9375.method15227(var15);
         }
      }
   }

   @Override
   public void flush() throws IOException {
      boolean var3 = false;
      this.field9375.method15219();

      try {
         this.field9374.flush();
         var3 = true;
      } catch (IOException var8) {
         throw this.field9375.method15228(var8);
      } finally {
         this.field9375.method15227(var3);
      }
   }

   @Override
   public void close() throws IOException {
      boolean var3 = false;
      this.field9375.method15219();

      try {
         this.field9374.close();
         var3 = true;
      } catch (IOException var8) {
         throw this.field9375.method15228(var8);
      } finally {
         this.field9375.method15227(var3);
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9375;
   }

   @Override
   public String toString() {
      return "AsyncTimeout.sink(" + this.field9374 + ")";
   }
}
