package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;

public class Class4289 extends Class4278 {
   private static String[] field20782;
   public Class9159 field20783;
   private int field20784 = -2434342;
   private int field20785 = -6505234;

   public Class4289(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, Class9159 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20783 = var7;
   }

   @Override
   public void draw(float var1) {
      int var4 = this.xA + 20;
      int var5 = this.yA + 5;
      int var6 = this.field20783.method34193();
      int var7 = this.heightA - 10 - Class4346.method13575();
      int var8 = MultiUtilities.applyAlpha(this.field20784, var1);
      int var9 = MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var1);
      if (this.field20783.field42046) {
         var8 = MultiUtilities.applyAlpha(-15038729, var1);
         var4 += 402 - var6;
         var9 = MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1);
      }

      RenderUtil.method11474((float)var4, (float)var5, (float)var6, (float)var7, 9.0F, var8);
      int var10 = 0;

      for (String var14 : this.field20783.field42047) {
         RenderUtil.drawString(ResourceRegistry.JelloLightFont18, (float)(var4 + 10), (float)(var5 + 5 + var10 * ResourceRegistry.JelloLightFont18.method23952()), var14, var9);
         var10++;
      }

      super.draw(var1);
   }
}
