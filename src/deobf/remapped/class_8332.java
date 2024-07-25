package remapped;

import io.netty.buffer.ByteBuf;
import java.util.SortedSet;
import java.util.UUID;

public interface class_8332<T> {
   int method_38377(T var1);

   int method_38378(UUID var1);

   @Deprecated
   default boolean method_38371(UUID var1) {
      return this.method_38379(var1);
   }

   boolean method_38379(UUID var1);

   String method_38380();

   void method_38375(T var1, ByteBuf var2);

   void method_38376(UUID var1, ByteBuf var2);

   class_1033 method_38373(String var1, class_7754 var2, class_3704 var3);

   class_1033 method_38372(String var1, float var2, class_7754 var3, class_3704 var4);

   SortedSet<Integer> method_38374();
}
