package remapped;

import java.io.IOException;
import java.io.OutputStream;

public class class_7193 extends OutputStream {
   public class_7193(class_6628 var1) {
      this.field_36981 = var1;
   }

   @Override
   public void write(int var1) throws IOException {
      if (!this.field_36981.field_34205) {
         this.field_36981.field_34204.method_32494((byte)var1);
         this.field_36981.method_18243();
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field_36981.field_34205) {
         this.field_36981.field_34204.method_32489(var1, var2, var3);
         this.field_36981.method_18243();
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public void flush() throws IOException {
      if (!this.field_36981.field_34205) {
         this.field_36981.flush();
      }
   }

   @Override
   public void close() throws IOException {
      this.field_36981.close();
   }

   @Override
   public String toString() {
      return this.field_36981 + ".outputStream()";
   }
}
