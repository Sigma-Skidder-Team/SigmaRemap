package remapped;

import com.mojang.datafixers.util.Pair;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class class_138 {
   private static String[] field_406;

   public static void method_554(class_9633 var0) {
      if (class_3542.method_16366()) {
         Pair var3 = var0.method_44462();
         class_7025 var4 = (class_7025)var3.getFirst();
         method_553((ByteBuffer)var3.getSecond(), var4.method_32051(), var4.method_32048(), var4.method_32052());
      } else {
         class_3542.method_16474(() -> {
            Pair var3x = var0.method_44462();
            class_7025 var4x = (class_7025)var3x.getFirst();
            method_553((ByteBuffer)var3x.getSecond(), var4x.method_32051(), var4x.method_32048(), var4x.method_32052());
         });
      }
   }

   private static void method_553(ByteBuffer var0, int var1, class_2868 var2, int var3) {
      class_3542.method_16431(class_3542::method_16366);
      ((Buffer)var0).clear();
      if (var3 > 0) {
         var2.method_13179(MemoryUtil.memAddress(var0));
         if (!class_3111.method_14424()) {
            class_1920.method_8812(var1, 0, var3);
         } else {
            class_2448.method_11193(var1, 0, var3, var2, var0);
         }

         var2.method_13173();
      }
   }
}
