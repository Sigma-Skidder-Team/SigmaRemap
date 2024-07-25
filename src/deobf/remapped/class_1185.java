package remapped;

import java.io.IOException;
import java.io.InputStream;

public class class_1185 extends InputStream {
   public class_1185(class_7085 var1) {
      this.field_6651 = var1;
   }

   @Override
   public int read() throws IOException {
      if (!this.field_6651.field_36573) {
         if (this.field_6651.field_36576.field_36433 == 0L) {
            long var3 = this.field_6651.field_36574.method_24273(this.field_6651.field_36576, 8192L);
            if (var3 == -1L) {
               return -1;
            }
         }

         return this.field_6651.field_36576.method_36602() & 0xFF;
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field_6651.field_36573) {
         class_189.method_830((long)var1.length, (long)var2, (long)var3);
         if (this.field_6651.field_36576.field_36433 == 0L) {
            long var6 = this.field_6651.field_36574.method_24273(this.field_6651.field_36576, 8192L);
            if (var6 == -1L) {
               return -1;
            }
         }

         return this.field_6651.field_36576.method_36578(var1, var2, var3);
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public int available() throws IOException {
      if (!this.field_6651.field_36573) {
         return (int)Math.min(this.field_6651.field_36576.field_36433, 2147483647L);
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public void close() throws IOException {
      this.field_6651.close();
   }

   @Override
   public String toString() {
      return this.field_6651 + ".inputStream()";
   }
}
