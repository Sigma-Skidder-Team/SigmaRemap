package net.minecraft.client.util;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.mojang.blaze3d.platform.GLX;
import org.lwjgl.system.Pointer;

public class LWJGLMemoryUntracker {
   private static final MethodHandle field35729 = GLX.<MethodHandle>method28307(() -> {
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

   public static void untrack(long var0) {
      if (field35729 != null) {
         try {
            field35729.invoke((long)var0);
         } catch (Throwable var5) {
            throw new RuntimeException(var5);
         }
      }
   }

   public static void method29101(Pointer var0) {
      untrack(var0.address());
   }
}
