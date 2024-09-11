package mapped;

import com.mojang.blaze3d.platform.GLX;

public class PlatformDescriptors {
   private static String[] field41358;

   public static String method33485() {
      return GlStateManager.method23860(7936);
   }

   public static String getCpuInfo() {
      return GLX.method28304();
   }

   public static String method33487() {
      return GlStateManager.method23860(7937);
   }

   public static String method33488() {
      return GlStateManager.method23860(7938);
   }
}
