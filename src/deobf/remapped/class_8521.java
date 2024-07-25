package remapped;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public final class class_8521 extends Reader {
   private final class_8067 field_43611;
   private final Charset field_43613;
   private boolean field_43610;
   private Reader field_43612;

   public class_8521(class_8067 var1, Charset var2) {
      this.field_43611 = var1;
      this.field_43613 = var2;
   }

   @Override
   public int read(char[] var1, int var2, int var3) throws IOException {
      if (!this.field_43610) {
         Object var6 = this.field_43612;
         if (var6 == null) {
            Charset var7 = class_8515.method_39217(this.field_43611, this.field_43613);
            var6 = this.field_43612 = new InputStreamReader(this.field_43611.method_36574(), var7);
         }

         return var6.read(var1, var2, var3);
      } else {
         throw new IOException("Stream closed");
      }
   }

   @Override
   public void close() throws IOException {
      this.field_43610 = true;
      if (this.field_43612 == null) {
         this.field_43611.close();
      } else {
         this.field_43612.close();
      }
   }
}
