package mapped;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class9230 {
   private static String[] field42480;
   private static final int field42481 = 4801587;
   private static final int field42482 = 4;
   private final List<Class5940> field42483 = new ArrayList<Class5940>();
   private final int field42484;
   private final int field42485;
   private final int field42486;

   public Class9230(DataInputStream var1) throws IOException {
      this.field42484 = var1.read() << 16 | var1.read() << 8 | var1.read();
      int var4 = var1.read();
      var1.read();
      this.field42485 = var1.read();
      this.field42486 = method34718(var1);
      if (this.field42484 == 4801587 && var4 <= 4) {
         if ((this.field42485 & 64) == 64) {
            int var5 = method34718(var1);
            var1.skipBytes(var5 - 6);
         }

         int var7 = this.field42486;

         while (var7 > 0) {
            Class5940 var6 = new Class5940(var1);
            this.field42483.add(var6);
            var7 = (int)((long)var7 - var6.method18445());
         }
      }
   }

   public List<Class5940> method34717() {
      return Collections.<Class5940>unmodifiableList(this.field42483);
   }

   public static int method34718(DataInputStream var0) throws IOException {
      int var3 = 0;

      for (int var4 = 0; var4 < 4; var4++) {
         var3 |= var0.read() & 127;
      }

      return var3;
   }
}
