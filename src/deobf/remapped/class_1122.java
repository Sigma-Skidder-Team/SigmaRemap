package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.util.Args;

public class class_1122 extends InputStreamEntity {
   private final long field_6412;
   private final InputStream field_6414;
   private final class_1938 field_6413;

   public class_1122(InputStream var1, long var2, class_1938 var4) {
      super(var1);
      this.field_6414 = var1;
      this.field_6412 = var2;
      this.field_6413 = var4;
   }

   public void writeTo(OutputStream var1) throws IOException {
      Args.notNull(var1, "Output stream");
      InputStream var4 = this.field_6414;

      try {
         byte[] var5 = new byte[4096];
         int var12;
         if (this.field_6412 < 0L) {
            while ((var12 = var4.read(var5)) != -1) {
               var1.write(var5, 0, var12);
               this.field_6413.field_9903 += (long)var12;
            }
         } else {
            long var7 = this.field_6412;

            while (var7 > 0L) {
               var12 = var4.read(var5, 0, (int)Math.min(4096L, var7));
               if (var12 == -1) {
                  break;
               }

               var1.write(var5, 0, var12);
               this.field_6413.field_9903 += (long)var12;
               var7 -= (long)var12;
               var1.flush();
            }
         }
      } finally {
         var4.close();
      }
   }
}
