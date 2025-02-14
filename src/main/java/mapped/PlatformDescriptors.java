package mapped;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;

public class PlatformDescriptors {
   private static String[] field41358;

   public static String method33485() {
      return GlStateManager.getString(7936);
   }

   public static String getCpuInfo() {
      return GLX.method28304();
   }

   public static String method33487() {
      return GlStateManager.getString(7937);
   }

   public static String method33488() {
      return GlStateManager.getString(7938);
   }
}
