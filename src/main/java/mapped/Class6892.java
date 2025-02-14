package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.util.Args;

public class Class6892 extends InputStreamEntity {
   private final long field29867;
   private final InputStream field29868;
   private final Class7424 field29869;

   public Class6892(InputStream var1, long var2, Class7424 var4) {
      super(var1);
      this.field29868 = var1;
      this.field29867 = var2;
      this.field29869 = var4;
   }

   public void writeTo(OutputStream var1) throws IOException {
      Args.notNull(var1, "Output stream");
      InputStream var4 = this.field29868;

      try {
         byte[] var5 = new byte[4096];
         int var12;
         if (this.field29867 < 0L) {
            while ((var12 = var4.read(var5)) != -1) {
               var1.write(var5, 0, var12);
               this.field29869.field31909 += (long)var12;
            }
         } else {
            long var7 = this.field29867;

            while (var7 > 0L) {
               var12 = var4.read(var5, 0, (int)Math.min(4096L, var7));
               if (var12 == -1) {
                  break;
               }

               var1.write(var5, 0, var12);
               this.field29869.field31909 += (long)var12;
               var7 -= (long)var12;
               var1.flush();
            }
         }
      } finally {
         var4.close();
      }
   }
}
