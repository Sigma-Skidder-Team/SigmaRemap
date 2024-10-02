package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class1782 extends InputStream {
   private static String[] field9616;
   private final Class8807 field9617;
   private Class1764 field9618;
   private volatile int field9619;
   private volatile int field9620;
   private volatile boolean field9621;
   private Thread field9622;

   public Class1782(InputStream var1, Class8807 var2) {
      this.field9617 = var2;
      this.field9618 = new Class1764(this);
      this.field9619 = 0;
      this.field9620 = 0;
      this.field9621 = false;
      this.field9622 = new Thread(new Class495(this, var1));
      this.field9622.start();
   }

   public int method7755() {
      return this.field9619;
   }

   public int method7756() {
      return this.field9620;
   }

   @Override
   public void close() throws IOException {
      this.field9618.close();
      this.field9622.interrupt();
      this.field9622 = null;
      this.field9618 = null;
      this.field9619 = 0;
      this.field9620 = 0;
      this.field9621 = false;
      super.close();
   }

   @Override
   public int available() throws IOException {
      return this.field9619 - this.field9620;
   }

   @Override
   public int read() throws IOException {
      if (this.field9621 && this.field9620 > this.field9619) {
         return -1;
      } else {
         while (this.field9619 < this.field9620 || this.field9618.method7704().length <= this.field9620) {
            try {
               if (this.field9621) {
                  return -1;
               }
            } catch (Exception var4) {
            }
         }

         return this.field9618.method7704()[this.field9620++] & 0xFF;
      }
   }

   @Override
   public int read(byte[] var1) throws IOException {
      return this.read(var1, 0, var1.length);
   }

   @Override
   public void reset() throws IOException {
      this.field9620 = 0;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      while (this.field9619 < this.field9620 + var3) {
         try {
            if (this.field9621) {
               return -1;
            }
         } catch (Exception var7) {
         }
      }

      byte[] var6 = this.field9618.method7704();
      System.arraycopy(var6, this.field9620, var1, var2, var3);
      this.field9620 += var3;
      return var3;
   }

   @Override
   public long skip(long var1) throws IOException {
      this.field9620 = (int)((long)this.field9620 + var1);
      return var1;
   }

   // $VF: synthetic method
   public static Class1764 method7757(Class1782 var0) {
      return var0.field9618;
   }

   // $VF: synthetic method
   public static int method7758(Class1782 var0) {
      return var0.field9619;
   }

   // $VF: synthetic method
   public static int method7759(Class1782 var0, int var1) {
      return var0.field9619 = var1;
   }

   // $VF: synthetic method
   public static boolean method7760(Class1782 var0, boolean var1) {
      return var0.field9621 = var1;
   }

   // $VF: synthetic method
   public static Class8807 method7761(Class1782 var0) {
      return var0.field9617;
   }
}
