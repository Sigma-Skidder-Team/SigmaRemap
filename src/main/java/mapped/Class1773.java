package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class1773 extends InputStream {
   public final Class1736 field9598;

   public Class1773(Class1736 var1) {
      this.field9598 = var1;
   }

   @Override
   public int read() throws IOException {
      if (!this.field9598.field9426) {
         if (this.field9598.field9424.field9423 == 0L) {
            long var3 = this.field9598.field9425.method7633(this.field9598.field9424, 8192L);
            if (var3 == -1L) {
               return -1;
            }
         }

         return this.field9598.field9424.method7596() & 0xFF;
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field9598.field9426) {
         Class4676.method14644((long)var1.length, (long)var2, (long)var3);
         if (this.field9598.field9424.field9423 == 0L) {
            long var6 = this.field9598.field9425.method7633(this.field9598.field9424, 8192L);
            if (var6 == -1L) {
               return -1;
            }
         }

         return this.field9598.field9424.method7625(var1, var2, var3);
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public int available() throws IOException {
      if (!this.field9598.field9426) {
         return (int)Math.min(this.field9598.field9424.field9423, 2147483647L);
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public void close() throws IOException {
      this.field9598.close();
   }

   @Override
   public String toString() {
      return this.field9598 + ".inputStream()";
   }
}
