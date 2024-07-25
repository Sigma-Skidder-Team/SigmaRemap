package remapped;

import java.io.IOException;
import java.io.InputStream;

public class class_1204 extends InputStream {
   private static String[] field_6720;
   private final class_5987 field_6718;
   private class_8587 field_6719;
   private volatile int field_6721;
   private volatile int field_6717;
   private volatile boolean field_6716;
   private Thread field_6722;

   public class_1204(InputStream var1, class_5987 var2) {
      this.field_6718 = var2;
      this.field_6719 = new class_8587(this);
      this.field_6721 = 0;
      this.field_6717 = 0;
      this.field_6716 = false;
      this.field_6722 = new Thread(new class_7605(this, var1));
      this.field_6722.start();
   }

   public int method_5328() {
      return this.field_6721;
   }

   public int method_5333() {
      return this.field_6717;
   }

   @Override
   public void close() throws IOException {
      this.field_6719.close();
      this.field_6722.interrupt();
      this.field_6722 = null;
      this.field_6719 = null;
      this.field_6721 = 0;
      this.field_6717 = 0;
      this.field_6716 = false;
      super.close();
   }

   @Override
   public int available() throws IOException {
      return this.field_6721 - this.field_6717;
   }

   @Override
   public int read() throws IOException {
      if (this.field_6716 && this.field_6717 > this.field_6721) {
         return -1;
      } else {
         while (this.field_6721 < this.field_6717 || this.field_6719.method_39488().length <= this.field_6717) {
            try {
               Thread.sleep(100L);
               if (this.field_6716) {
                  return -1;
               }
            } catch (Exception var4) {
            }
         }

         return this.field_6719.method_39488()[this.field_6717++] & 0xFF;
      }
   }

   @Override
   public int read(byte[] var1) throws IOException {
      return this.read(var1, 0, var1.length);
   }

   @Override
   public void reset() throws IOException {
      this.field_6717 = 0;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      while (this.field_6721 < this.field_6717 + var3) {
         try {
            Thread.sleep(100L);
            if (this.field_6716) {
               return -1;
            }
         } catch (Exception var7) {
         }
      }

      byte[] var6 = this.field_6719.method_39488();
      System.arraycopy(var6, this.field_6717, var1, var2, var3);
      this.field_6717 += var3;
      return var3;
   }

   @Override
   public long skip(long var1) throws IOException {
      this.field_6717 = (int)((long)this.field_6717 + var1);
      return var1;
   }
}
