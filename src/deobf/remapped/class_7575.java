package remapped;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_7575 {
   private static String[] field_38600;
   private static final int field_38597 = 4801587;
   private static final int field_38598 = 4;
   private final List<class_371> field_38595 = new ArrayList<class_371>();
   private final int field_38599;
   private final int field_38596;
   private final int field_38594;

   public class_7575(DataInputStream var1) throws IOException {
      this.field_38599 = var1.read() << 16 | var1.read() << 8 | var1.read();
      int var4 = var1.read();
      var1.read();
      this.field_38596 = var1.read();
      this.field_38594 = method_34432(var1);
      if (this.field_38599 == 4801587 && var4 <= 4) {
         if ((this.field_38596 & 64) == 64) {
            int var5 = method_34432(var1);
            var1.skipBytes(var5 - 6);
         }

         int var7 = this.field_38594;

         while (var7 > 0) {
            class_371 var6 = new class_371(var1);
            this.field_38595.add(var6);
            var7 = (int)((long)var7 - var6.method_1827());
         }
      }
   }

   public List<class_371> method_34433() {
      return Collections.<class_371>unmodifiableList(this.field_38595);
   }

   public static int method_34432(DataInputStream var0) throws IOException {
      int var3 = 0;

      for (int var4 = 0; var4 < 4; var4++) {
         var3 |= var0.read() & 127;
      }

      return var3;
   }
}
