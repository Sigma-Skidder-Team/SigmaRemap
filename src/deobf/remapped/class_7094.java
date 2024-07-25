package remapped;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class class_7094 {
   private static final int field_36597 = 6144;
   private PushbackInputStream field_36596;
   private DataInputStream field_36598;
   private boolean field_36599;
   private class_7127 field_36595;

   public class_7094(InputStream var1) throws IOException {
      this.field_36596 = new PushbackInputStream(var1);
      this.field_36598 = new DataInputStream(this.field_36596);
      this.field_36599 = true;
      if (!this.method_32604()) {
         throw new IOException("no ADTS header found");
      }
   }

   public byte[] method_32606() {
      return this.field_36595.method_32742();
   }

   public byte[] method_32608() throws IOException {
      if (!this.field_36599) {
         this.method_32604();
      } else {
         this.field_36599 = false;
      }

      byte[] var3 = new byte[this.field_36595.method_32741()];
      this.field_36598.readFully(var3);
      return var3;
   }

   private boolean method_32604() throws IOException {
      boolean var3 = false;
      int var4 = 6144;

      while (!var3 && var4 > 0) {
         int var5 = this.field_36596.read();
         var4--;
         if (var5 == 255) {
            var5 = this.field_36596.read();
            if ((var5 >> 4 & 15) == 15) {
               var3 = true;
            }

            this.field_36596.unread(var5);
         }
      }

      if (var3) {
         this.field_36595 = new class_7127(this.field_36598);
      }

      return var3;
   }

   public int method_32603() {
      return this.field_36595.method_32740();
   }

   public int method_32607() {
      return this.field_36595.method_32739();
   }
}
