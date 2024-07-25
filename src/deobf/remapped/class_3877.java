package remapped;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public class class_3877 {
   private class_3877() {
      throw new IllegalStateException("Utility class");
   }

   public static boolean method_17934(ByteBuffer var0, class_5913 var1, ByteChannel var2) throws IOException {
      ((Buffer)var0).clear();
      int var5 = var2.read(var0);
      ((Buffer)var0).flip();
      if (var5 != -1) {
         return var5 != 0;
      } else {
         var1.method_27024();
         return false;
      }
   }

   public static boolean method_17935(ByteBuffer var0, class_5913 var1, class_3775 var2) throws IOException {
      ((Buffer)var0).clear();
      int var5 = var2.method_17470(var0);
      ((Buffer)var0).flip();
      if (var5 != -1) {
         return var2.method_17472();
      } else {
         var1.method_27024();
         return false;
      }
   }

   public static boolean method_17936(class_5913 var0, ByteChannel var1) throws IOException {
      if (var0 == null) {
         return false;
      } else {
         ByteBuffer var4 = var0.field_30007.peek();
         class_3775 var5 = null;
         if (var4 != null) {
            do {
               var1.write(var4);
               if (var4.remaining() > 0) {
                  return false;
               }

               var0.field_30007.poll();
               var4 = var0.field_30007.peek();
            } while (var4 != null);
         } else if (var1 instanceof class_3775) {
            var5 = (class_3775)var1;
            if (var5.method_17469()) {
               var5.method_17471();
            }
         }

         if (var0.field_30007.isEmpty()
            && var0.method_22166()
            && var0.method_22174() != null
            && var0.method_22174().method_33038() != null
            && var0.method_22174().method_33038() == class_5282.field_27019) {
            var0.method_27041();
         }

         return var5 == null || !((class_3775)var1).method_17469();
      }
   }
}
