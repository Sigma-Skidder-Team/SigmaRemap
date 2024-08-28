package mapped;

import java.io.IOException;
import java.io.OutputStream;

public class Class1766 extends OutputStream {
   public final Class1755 field9553;

   public Class1766(Class1755 var1) {
      this.field9553 = var1;
   }

   @Override
   public void write(int var1) throws IOException {
      if (!this.field9553.field9495) {
         this.field9553.field9493.method7570((byte)var1);
         this.field9553.method7580();
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field9553.field9495) {
         this.field9553.field9493.method7631(var1, var2, var3);
         this.field9553.method7580();
      } else {
         throw new IOException("closed");
      }
   }

   @Override
   public void flush() throws IOException {
      if (!this.field9553.field9495) {
         this.field9553.flush();
      }
   }

   @Override
   public void close() throws IOException {
      this.field9553.close();
   }

   @Override
   public String toString() {
      return this.field9553 + ".outputStream()";
   }
}
