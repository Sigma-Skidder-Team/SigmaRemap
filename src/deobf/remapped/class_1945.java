package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class class_1945 extends Reader {
   private static final Charset field_9919 = Charset.forName("UTF-8");
   private static final Charset field_9917 = Charset.forName("UTF-16BE");
   private static final Charset field_9914 = Charset.forName("UTF-16LE");
   public PushbackInputStream field_9915;
   public InputStreamReader field_9916 = null;
   private static final int field_9920 = 3;

   public class_1945(InputStream var1) {
      this.field_9915 = new PushbackInputStream(var1, 3);
   }

   public String method_8993() {
      return this.field_9916.getEncoding();
   }

   public void method_8994() throws IOException {
      if (this.field_9916 == null) {
         byte[] var3 = new byte[3];
         int var4 = this.field_9915.read(var3, 0, var3.length);
         Charset var5;
         int var6;
         if (var3[0] == -17 && var3[1] == -69 && var3[2] == -65) {
            var5 = field_9919;
            var6 = var4 - 3;
         } else if (var3[0] == -2 && var3[1] == -1) {
            var5 = field_9917;
            var6 = var4 - 2;
         } else if (var3[0] == -1 && var3[1] == -2) {
            var5 = field_9914;
            var6 = var4 - 2;
         } else {
            var5 = field_9919;
            var6 = var4;
         }

         if (var6 > 0) {
            this.field_9915.unread(var3, var4 - var6, var6);
         }

         CharsetDecoder var7 = var5.newDecoder().onUnmappableCharacter(CodingErrorAction.REPORT);
         this.field_9916 = new InputStreamReader(this.field_9915, var7);
      }
   }

   @Override
   public void close() throws IOException {
      this.method_8994();
      this.field_9916.close();
   }

   @Override
   public int read(char[] var1, int var2, int var3) throws IOException {
      this.method_8994();
      return this.field_9916.read(var1, var2, var3);
   }
}
