package mapped;

import java.io.InputStream;

public final class Class495 implements Runnable {
   private static String[] field2340;
   private final InputStream field2341;
   public final MusicStream field2342;

   public Class495(MusicStream var1, InputStream var2) {
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
               MusicStream.method7757(this.field2342).write(var4, 0, var3);
               MusicStream.method7759(this.field2342, MusicStream.method7758(this.field2342) + var3);
            } else {

            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      if (!Thread.interrupted()) {
         MusicStream.method7760(this.field2342, true);
         if (MusicStream.method7761(this.field2342) != null && MusicStream.method7757(this.field2342) != null) {
            MusicStream.method7761(this.field2342).method31803(MusicStream.method7757(this.field2342).method7704(), 0, MusicStream.method7758(this.field2342));
         }
      }
   }
}
