package mapped;

import java.io.InputStream;

public final class Class495 implements Runnable {
   private static String[] field2340;
   private final InputStream field2341;
   public final Class1782 field2342;

   public Class495(Class1782 var1, InputStream var2) {
      this.field2342 = var1;
      this.field2341 = var2;
   }

   @Override
   public void run() {
      int var3 = 0;
      byte[] var4 = new byte[16384];

      try {
         while ((var3 = this.field2341.read(var4)) != -1 && !Thread.interrupted()) {
            if (var3 > 0) {
               Class1782.method7757(this.field2342).write(var4, 0, var3);
               Class1782.method7759(this.field2342, Class1782.method7758(this.field2342) + var3);
            } else {
               Thread.sleep(20L);
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      if (!Thread.interrupted()) {
         Class1782.method7760(this.field2342, true);
         if (Class1782.method7761(this.field2342) != null && Class1782.method7757(this.field2342) != null) {
            Class1782.method7761(this.field2342).method31803(Class1782.method7757(this.field2342).method7704(), 0, Class1782.method7758(this.field2342));
         }
      }
   }
}
