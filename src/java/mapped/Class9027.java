package mapped;

import io.netty.buffer.ByteBuf;
import java.util.SortedSet;
import java.util.UUID;

public interface Class9027<T> {
   int method33426(T var1);

   int method33415(UUID var1);

   @Deprecated
   default boolean method33416(UUID var1) {
      return this.method33424(var1);
   }

   boolean method33424(UUID var1);

   String method33417();

   void method33425(T var1, ByteBuf var2);

   void method33418(UUID var1, ByteBuf var2);

   Class6852 method33420(String var1, Class2080 var2, Class2326 var3);

   Class6852 method33421(String var1, float var2, Class2080 var3, Class2326 var4);

   SortedSet<Integer> method33422();
}
