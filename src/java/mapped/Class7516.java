package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.util.Util;

public class Class7516 {
   private static String[] field32242;
   private static final Vector3f field32243 = Util.<Vector3f>make(new Vector3f(0.2F, 1.0F, -0.7F), Vector3f::method25280);
   private static final Vector3f field32244 = Util.<Vector3f>make(new Vector3f(-0.2F, 1.0F, 0.7F), Vector3f::method25280);
   private static final Vector3f field32245 = Util.<Vector3f>make(new Vector3f(0.2F, 1.0F, -0.7F), Vector3f::method25280);
   private static final Vector3f field32246 = Util.<Vector3f>make(new Vector3f(-0.2F, -1.0F, 0.7F), Vector3f::method25280);

   public static void method24498() {
      RenderSystem.enableLighting();
      RenderSystem.enableColorMaterial();
      RenderSystem.colorMaterial(1032, 5634);
   }

   public static void method24499() {
      RenderSystem.disableLighting();
      RenderSystem.disableColorMaterial();
   }

   public static void method24500(Matrix4f var0) {
      RenderSystem.method27928(field32245, field32246, var0);
   }

   public static void method24501(Matrix4f var0) {
      RenderSystem.method27928(field32243, field32244, var0);
   }

   public static void method24502() {
      RenderSystem.method27929(field32243, field32244);
   }

   public static void method24503() {
      RenderSystem.method27930(field32243, field32244);
   }
}
