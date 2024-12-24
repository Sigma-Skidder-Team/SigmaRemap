package mapped;

import java.io.IOException;
import java.util.zip.Deflater;

public final class Class1720 implements Sink {
   private final Class1733 field9383;
   private final Deflater field9384;
   private boolean field9385;

   public Class1720(Sink var1, Deflater var2) {
      this(Class7001.method21697(var1), var2);
   }

   public Class1720(Class1733 var1, Deflater var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field9383 = var1;
            this.field9384 = var2;
         } else {
            throw new IllegalArgumentException("inflater == null");
         }
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      Class4676.method14644(var1.field9423, 0L, var2);

      while (var2 > 0L) {
         Class9174 var6 = var1.field9422;
         int var7 = (int)Math.min(var2, (long)(var6.field42123 - var6.field42122));
         this.field9384.setInput(var6.field42121, var6.field42122, var7);
         this.method7542(false);
         var1.field9423 -= (long)var7;
         var6.field42122 += var7;
         if (var6.field42122 == var6.field42123) {
            var1.field9422 = var6.method34280();
            Class5996.method18608(var6);
         }

         var2 -= (long)var7;
      }
   }


   private void method7542(boolean var1) throws IOException {
      Class1734 var4 = this.field9383.method7559();

      while (true) {
         Class9174 var5 = var4.method7632(1);
         int var6 = !var1
            ? this.field9384.deflate(var5.field42121, var5.field42123, 8192 - var5.field42123)
            : this.field9384.deflate(var5.field42121, var5.field42123, 8192 - var5.field42123, 2);
         if (var6 <= 0) {
            if (this.field9384.needsInput()) {
               if (var5.field42122 == var5.field42123) {
                  var4.field9422 = var5.method34280();
                  Class5996.method18608(var5);
               }

               return;
            }
         } else {
            var5.field42123 += var6;
            var4.field9423 += (long)var6;
            this.field9383.method7580();
         }
      }
   }

   @Override
   public void flush() throws IOException {
      this.method7542(true);
      this.field9383.flush();
   }

   public void method7543() throws IOException {
      this.field9384.finish();
      this.method7542(false);
   }

   @Override
   public void close() throws IOException {
      if (!this.field9385) {
         Throwable var3 = null;

         try {
            this.method7543();
         } catch (Throwable var5) {
            var3 = var5;
         }

         try {
            this.field9384.end();
         } catch (Throwable var7) {
            if (var3 == null) {
               var3 = var7;
            }
         }

         try {
            this.field9383.close();
         } catch (Throwable var6) {
            if (var3 == null) {
               var3 = var6;
            }
         }

         this.field9385 = true;
         if (var3 != null) {
            Class4676.method14648(var3);
         }
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9383.method7541();
   }

   @Override
   public String toString() {
      return "DeflaterSink(" + this.field9383 + ")";
   }
}
