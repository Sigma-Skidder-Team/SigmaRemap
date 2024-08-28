package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class Class1802 extends Reader {
   private static final Charset field9707 = Charset.forName("UTF-8");
   private static final Charset field9708 = Charset.forName("UTF-16BE");
   private static final Charset field9709 = Charset.forName("UTF-16LE");
   public PushbackInputStream field9710;
   public InputStreamReader field9711 = null;
   private static final int field9712 = 3;

   public Class1802(InputStream var1) {
      this.field9710 = new PushbackInputStream(var1, 3);
   }

   public String method7873() {
      return this.field9711.getEncoding();
   }

   public void method7874() throws IOException {
      if (this.field9711 == null) {
         byte[] var3 = new byte[3];
         int var4 = this.field9710.read(var3, 0, var3.length);
         Charset var5;
         int var6;
         if (var3[0] == -17 && var3[1] == -69 && var3[2] == -65) {
            var5 = field9707;
            var6 = var4 - 3;
         } else if (var3[0] == -2 && var3[1] == -1) {
            var5 = field9708;
            var6 = var4 - 2;
         } else if (var3[0] == -1 && var3[1] == -2) {
            var5 = field9709;
            var6 = var4 - 2;
         } else {
            var5 = field9707;
            var6 = var4;
         }

         if (var6 > 0) {
            this.field9710.unread(var3, var4 - var6, var6);
         }

         CharsetDecoder var7 = var5.newDecoder().onUnmappableCharacter(CodingErrorAction.REPORT);
         this.field9711 = new InputStreamReader(this.field9710, var7);
      }
   }

   @Override
   public void close() throws IOException {
      this.method7874();
      this.field9711.close();
   }

   @Override
   public int read(char[] var1, int var2, int var3) throws IOException {
      this.method7874();
      return this.field9711.read(var1, var2, var3);
   }
}
