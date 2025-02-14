package mapped;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public class Class8207 {
   private Class8207() {
      throw new IllegalStateException("Utility class");
   }

   public static boolean method28508(ByteBuffer var0, Class346 var1, ByteChannel var2) throws IOException {
      ((Buffer)var0).clear();
      int var5 = var2.read(var0);
      ((Buffer)var0).flip();
      if (var5 != -1) {
         return var5 != 0;
      } else {
         var1.method1798();
         return false;
      }
   }

   public static boolean method28509(ByteBuffer var0, Class346 var1, Class1788 var2) throws IOException {
      ((Buffer)var0).clear();
      int var5 = var2.method7796(var0);
      ((Buffer)var0).flip();
      if (var5 != -1) {
         return var2.method7795();
      } else {
         var1.method1798();
         return false;
      }
   }

   public static boolean method28510(Class346 var0, ByteChannel var1) throws IOException {
      if (var0 == null) {
         return false;
      } else {
         ByteBuffer var4 = var0.field1521.peek();
         Class1788 var5 = null;
         if (var4 != null) {
            do {
               var1.write(var4);
               if (var4.remaining() > 0) {
                  return false;
               }

               var0.field1521.poll();
               var4 = var0.field1521.peek();
            } while (var4 != null);
         } else if (var1 instanceof Class1788) {
            var5 = (Class1788)var1;
            if (var5.method7793()) {
               var5.method7794();
            }
         }

         if (var0.field1521.isEmpty()
            && var0.method1768()
            && var0.method1734() != null
            && var0.method1734().method32089() != null
            && var0.method1734().method32089() == Class2026.field13154) {
            var0.method1796();
         }

         return var5 == null || !((Class1788)var1).method7793();
      }
   }
}
