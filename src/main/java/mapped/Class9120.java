package mapped;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class Class9120 {
   private static final int field41918 = 6144;
   private PushbackInputStream field41919;
   private DataInputStream field41920;
   private boolean field41921;
   private Class9129 field41922;

   public Class9120(InputStream var1) throws IOException {
      this.field41919 = new PushbackInputStream(var1);
      this.field41920 = new DataInputStream(this.field41919);
      this.field41921 = true;
      if (!this.method34014()) {
         throw new IOException("no ADTS header found");
      }
   }

   public byte[] method34012() {
      return this.field41922.method34064();
   }

   public byte[] method34013() throws IOException {
      if (!this.field41921) {
         this.method34014();
      } else {
         this.field41921 = false;
      }

      byte[] var3 = new byte[this.field41922.method34063()];
      this.field41920.readFully(var3);
      return var3;
   }

   private boolean method34014() throws IOException {
      boolean var3 = false;
      int var4 = 6144;

      while (!var3 && var4 > 0) {
         int var5 = this.field41919.read();
         var4--;
         if (var5 == 255) {
            var5 = this.field41919.read();
            if ((var5 >> 4 & 15) == 15) {
               var3 = true;
            }

            this.field41919.unread(var5);
         }
      }

      if (var3) {
         this.field41922 = new Class9129(this.field41920);
      }

      return var3;
   }

   public int method34015() {
      return this.field41922.method34065();
   }

   public int method34016() {
      return this.field41922.method34066();
   }
}
