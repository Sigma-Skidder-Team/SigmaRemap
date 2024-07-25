package remapped;

import com.mojang.datafixers.util.Pair;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class class_7995 implements AutoCloseable {
   private static String[] field_40965;
   private int field_40969;
   private final class_2868 field_40964;
   private int field_40968;
   private class_6076 field_40966;
   private class_5584 field_40963;
   private int field_40967;

   public class_7995(class_2868 var1) {
      this.field_40964 = var1;
      RenderSystem.method_16355(var1x -> this.field_40969 = var1x);
   }

   public void method_36280() {
      GlStateManager.method_8760(34962, this.field_40969);
   }

   public void method_36285(class_9633 var1) {
      if (RenderSystem.method_16366()) {
         this.method_36286(var1);
      } else {
         RenderSystem.method_16474(() -> this.method_36286(var1));
      }
   }

   public CompletableFuture<Void> method_36278(class_9633 var1) {
      if (RenderSystem.method_16366()) {
         this.method_36286(var1);
         return CompletableFuture.<Void>completedFuture((Void)null);
      } else {
         return CompletableFuture.runAsync(() -> this.method_36286(var1), var0 -> RenderSystem.method_16474(var0::run));
      }
   }

   private void method_36286(class_9633 var1) {
      Pair var4 = var1.method_44462();
      this.field_40967 = 0;
      class_7025 var5 = (class_7025)var4.getFirst();
      if (var5.method_32051() != 7) {
         this.field_40967 = var5.method_32051();
      }

      if (this.field_40966 == null) {
         if (this.field_40969 != -1) {
            ByteBuffer var6 = (ByteBuffer)var4.getSecond();
            this.field_40968 = var6.remaining() / this.field_40964.method_13168();
            this.method_36280();
            RenderSystem.method_16417(34962, var6, 35044);
            method_36279();
         }
      } else {
         ByteBuffer var7 = (ByteBuffer)var4.getSecond();
         this.field_40966.method_27831(var7, this.field_40963);
      }
   }

   public void method_36283(class_8107 var1, int var2) {
      RenderSystem.method_16438();
      RenderSystem.method_16476();
      RenderSystem.multMatrix(var1);
      if (this.field_40967 > 0) {
         var2 = this.field_40967;
      }

      if (this.field_40966 == null) {
         RenderSystem.method_16400(var2, 0, this.field_40968);
      } else {
         this.field_40966.method_27819(var2, this.field_40963);
      }

      RenderSystem.method_16489();
   }

   public void method_36282(int var1) {
      if (this.field_40967 > 0) {
         var1 = this.field_40967;
      }

      if (this.field_40966 == null) {
         RenderSystem.method_16400(var1, 0, this.field_40968);
      } else {
         this.field_40966.method_27819(var1, this.field_40963);
      }
   }

   public static void method_36279() {
      GlStateManager.method_8760(34962, 0);
   }

   @Override
   public void close() {
      if (this.field_40969 >= 0) {
         RenderSystem.method_16462(this.field_40969);
         this.field_40969 = -1;
      }
   }

   public void method_36287(class_6076 var1) {
      if (var1 != null) {
         this.close();
         this.field_40966 = var1;
         this.field_40963 = new class_5584();
      }
   }

   public class_6076 method_36284() {
      return this.field_40966;
   }
}
