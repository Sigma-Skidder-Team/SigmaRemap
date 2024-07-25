package remapped;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.lwjgl.system.Pointer;

public class class_4208 {
   private static final MethodHandle field_20454 = class_3776.<MethodHandle>method_17485(() -> {
      try {
         Lookup var2 = MethodHandles.lookup();
         Class var3 = Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
         Method var4 = var3.getDeclaredMethod("untrack", long.class);
         var4.setAccessible(true);
         Field var5 = Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
         var5.setAccessible(true);
         Object var6 = var5.get(null);
         return var3.isInstance(var6) ? var2.unreflect(var4) : null;
      } catch (NoSuchFieldException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException var7) {
         throw new RuntimeException(var7);
      }
   });

   public static void method_19578(long var0) {
      if (field_20454 != null) {
         try {
            field_20454.invoke((long)var0);
         } catch (Throwable var5) {
            throw new RuntimeException(var5);
         }
      }
   }

   public static void method_19579(Pointer var0) {
      method_19578(var0.address());
   }
}
