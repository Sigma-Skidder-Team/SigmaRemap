package mapped;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public final class Class1801 extends Reader {
   private final Class1735 field9703;
   private final Charset field9704;
   private boolean field9705;
   private Reader field9706;

   public Class1801(Class1735 var1, Charset var2) {
      this.field9703 = var1;
      this.field9704 = var2;
   }

   @Override
   public int read(char[] var1, int var2, int var3) throws IOException {
      if (!this.field9705) {
         Reader var6 = this.field9706;
         if (var6 == null) {
            Charset var7 = Class9474.method36560(this.field9703, this.field9704);
            var6 = this.field9706 = new InputStreamReader(this.field9703.method7586(), var7);
         }

         return var6.read(var1, var2, var3);
      } else {
         throw new IOException("Stream closed");
      }
   }

   @Override
   public void close() throws IOException {
      this.field9705 = true;
      if (this.field9706 == null) {
         this.field9703.close();
      } else {
         this.field9706.close();
      }
   }
}
