package mapped;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class Class1722 implements Class1716 {
   private final Class1733 field9391;
   private final Deflater field9392;
   private final Class1720 field9393;
   private boolean field9394;
   private final CRC32 field9395 = new CRC32();

   public Class1722(Class1716 var1) {
      if (var1 != null) {
         this.field9392 = new Deflater(-1, true);
         this.field9391 = Class7001.method21697(var1);
         this.field9393 = new Class1720(this.field9391, this.field9392);
         this.method7545();
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      if (var2 >= 0L) {
         if (var2 != 0L) {
            this.method7547(var1, var2);
            this.field9393.method7540(var1, var2);
         }
      } else {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      }
   }

   @Override
   public void flush() throws IOException {
      this.field9393.flush();
   }

   @Override
   public Class4916 method7541() {
      return this.field9391.method7541();
   }

   @Override
   public void close() throws IOException {
      if (!this.field9394) {
         Throwable var3 = null;

         try {
            this.field9393.method7543();
            this.method7546();
         } catch (Throwable var5) {
            var3 = var5;
         }

         try {
            this.field9392.end();
         } catch (Throwable var7) {
            if (var3 == null) {
               var3 = var7;
            }
         }

         try {
            this.field9391.close();
         } catch (Throwable var6) {
            if (var3 == null) {
               var3 = var6;
            }
         }

         this.field9394 = true;
         if (var3 != null) {
            Class4676.method14648(var3);
         }
      }
   }

   public Deflater method7544() {
      return this.field9392;
   }

   private void method7545() {
      Class1734 var3 = this.field9391.method7559();
      var3.method7571(8075);
      var3.method7570(8);
      var3.method7570(0);
      var3.method7573(0);
      var3.method7570(0);
      var3.method7570(0);
   }

   private void method7546() throws IOException {
      this.field9391.method7574((int)this.field9395.getValue());
      this.field9391.method7574((int)this.field9392.getBytesRead());
   }

   private void method7547(Class1734 var1, long var2) {
      for (Class9174 var6 = var1.field9422; var2 > 0L; var6 = var6.field42126) {
         int var7 = (int)Math.min(var2, (long)(var6.field42123 - var6.field42122));
         this.field9395.update(var6.field42121, var6.field42122, var7);
         var2 -= (long)var7;
      }
   }
}
