package mapped;

import com.mojang.datafixers.util.Pair;
import org.lwjgl.system.MemoryUtil;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Class4395 {
   private static String[] field21479;

   public static void method13895(Class5425 var0) {
      if (RenderSystem.method27803()) {
         Pair var3 = var0.method17070();
         Class9105 var4 = (Class9105)var3.getFirst();
         method13896((ByteBuffer)var3.getSecond(), var4.method33953(), var4.method33951(), var4.method33952());
      } else {
         RenderSystem.method27810(() -> {
            Pair var3x = var0.method17070();
            Class9105 var4x = (Class9105)var3x.getFirst();
            method13896((ByteBuffer)var3x.getSecond(), var4x.method33953(), var4x.method33951(), var4x.method33952());
         });
      }
   }

   private static void method13896(ByteBuffer var0, int var1, Class7831 var2, int var3) {
      RenderSystem.method27808(RenderSystem::method27803);
      ((Buffer)var0).clear();
      if (var3 > 0) {
         var2.method26218(MemoryUtil.memAddress(var0));
         if (!Class7944.method26921()) {
            Class7414.method23854(var1, 0, var3);
         } else {
            Class7698.method25387(var1, 0, var3, var2, var0);
         }

         var2.method26219();
      }
   }
}
