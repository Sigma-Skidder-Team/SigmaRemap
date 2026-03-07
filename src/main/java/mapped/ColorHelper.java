package mapped;

import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;
import com.mojang.blaze3d.systems.RenderSystem;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.TrueTypeFont;

public class ColorHelper {
   private static String[] field27960;
   public static final ColorHelper field27961 = new ColorHelper(-12871171);
   public int field27962;
   public int field27963;
   public int field27964;
   public int field27965;
   public Class2218 field27966;
   public Class2218 field27967;

   public ColorHelper(int var1) {
      this(var1, MultiUtilities.method17691(var1, 0.05F));
   }

   public ColorHelper(int var1, int var2) {
      this(var1, var2, ClientColors.DEEP_TEAL.getColor());
   }

   public ColorHelper(int var1, int var2, int var3) {
      this(var1, var2, var3, ClientColors.LIGHT_GREYISH_BLUE.getColor());
   }

   public ColorHelper(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, Class2218.field14492, Class2218.field14492);
   }

   public ColorHelper(int var1, int var2, int var3, int var4, Class2218 var5, Class2218 var6) {
      this.field27962 = var1;
      this.field27963 = var2;
      this.field27964 = var3;
      this.field27965 = var4;
      this.field27966 = var5;
      this.field27967 = var6;
   }

   public ColorHelper(ColorHelper var1) {
      this(var1.field27962, var1.field27963, var1.field27964, var1.field27965, var1.field27966, var1.field27967);
   }

    public static void method11441(TrueTypeFont var0, float var1, float var2, String var3, int var4, Class2218 var5,
                                   Class2218 var6, boolean var7) {
        RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
        GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
        int var10 = 0;
        int var11 = 0;
        switch (Class7820.field33554[var5.ordinal()]) {
            case 1:
                var10 = -var0.getWidth(var3) / 2;
                break;
            case 2:
                var10 = -var0.getWidth(var3);
        }

        switch (Class7820.field33554[var6.ordinal()]) {
            case 1:
                var11 = -var0.getHeight(var3) / 2;
                break;
            case 3:
                var11 = -var0.getHeight(var3);
        }

        float var12 = (float) (var4 >> 24 & 0xFF) / 255.0F;
        float var13 = (float) (var4 >> 16 & 0xFF) / 255.0F;
        float var14 = (float) (var4 >> 8 & 0xFF) / 255.0F;
        float var15 = (float) (var4 & 0xFF) / 255.0F;
        GL11.glPushMatrix();
        boolean var16 = false;
        if ((double) GuiManager.scaleFactor == 2.0) {
            if (var0 == ResourceRegistry.JelloLightFont20) {
                var0 = ResourceRegistry.JelloLightFont40;
            } else if (var0 == ResourceRegistry.JelloLightFont25) {
                var0 = ResourceRegistry.JelloLightFont50;
            } else if (var0 == ResourceRegistry.JelloLightFont12) {
                var0 = ResourceRegistry.JelloLightFont24;
            } else if (var0 == ResourceRegistry.JelloLightFont14) {
                var0 = ResourceRegistry.JelloLightFont28;
            } else if (var0 == ResourceRegistry.JelloLightFont18) {
                var0 = ResourceRegistry.JelloLightFont36;
            } else if (var0 == ResourceRegistry.RegularFont20) {
                var0 = ResourceRegistry.RegularFont40;
            } else if (var0 == ResourceRegistry.JelloMediumFont20) {
                var0 = ResourceRegistry.JelloMediumFont40;
            } else if (var0 == ResourceRegistry.JelloMediumFont25) {
                var0 = ResourceRegistry.JelloMediumFont50;
            } else {
                var16 = true;
            }

            if (!var16) {
                float[] var17 = RenderUtil.method11416((int) var1, (int) var2);
                int var18 = (int) var17[0];
                int var19 = (int) var17[1];
                GL11.glTranslatef(var1, var2, 0.0F);
                GL11.glScalef(1.0F / GuiManager.scaleFactor, 1.0F / GuiManager.scaleFactor,
                        1.0F / GuiManager.scaleFactor);
                GL11.glTranslatef(-var1, -var2, 0.0F);
                var10 = (int) ((float) var10 * GuiManager.scaleFactor);
                var11 = (int) ((float) var11 * GuiManager.scaleFactor);
            }
        }

        RenderSystem.enableBlend();
        GL11.glBlendFunc(770, 771);
        if (var7) {
            var0.drawString((float) Math.round(var1 + (float) var10), (float) (Math.round(var2 + (float) var11) + 2),
                    var3, new org.newdawn.slick.Color(0.0F, 0.0F, 0.0F, 0.35F));
        }

        if (var3 != null) {
            var0.drawString((float) Math.round(var1 + (float) var10), (float) Math.round(var2 + (float) var11), var3,
                    new org.newdawn.slick.Color(var13, var14, var15, var12));
        }

        RenderSystem.disableBlend();
        GL11.glPopMatrix();
    }

    public int method19403() {
      return this.field27963;
   }

   public ColorHelper method19404(int var1) {
      this.field27963 = var1;
      return this;
   }

   public int method19405() {
      return this.field27962;
   }

   public ColorHelper method19406(int var1) {
      this.field27962 = var1;
      return this;
   }

   public int method19407() {
      return this.field27964;
   }

   public ColorHelper method19408(int var1) {
      this.field27964 = var1;
      return this;
   }

   public int getTextColor() {
      return this.field27965;
   }

   public ColorHelper method19410(int var1) {
      this.field27965 = var1;
      return this;
   }

   public Class2218 method19411() {
      return this.field27966;
   }

   public ColorHelper method19412(Class2218 var1) {
      this.field27966 = var1;
      return this;
   }

   public Class2218 method19413() {
      return this.field27967;
   }

   public ColorHelper method19414(Class2218 var1) {
      this.field27967 = var1;
      return this;
   }

   public ColorHelper method19415() {
      return new ColorHelper(this.field27962, this.field27963, this.field27964, this.field27965, this.field27966,
            this.field27967);
   }
}
