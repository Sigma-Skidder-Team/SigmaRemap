package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Screen;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ColorUtils;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class CreditsScreen extends Screen {
   private float field21072 = 0.0F;
   private int field21073 = 0;
   private int field21074 = 0;
   private boolean field21075 = true;

   public CreditsScreen() {
      super("Credits");
      this.method13300(false);
   }

   @Override
   public void draw(float var1) {
      super.draw(var1);
      int var4 = ResourcesDecrypter.mentalfrostbytePNG.getImageWidth();
      int var5 = ResourcesDecrypter.mentalfrostbytePNG.getImageHeight();
      var4 = Math.min(var4, (int)((float) Minecraft.getInstance().mainWindow.getHeight() / 1.65F));
      var5 = Math.min(var5, (int)((float) Minecraft.getInstance().mainWindow.getHeight() / 1.65F));
      this.method13416();
      RenderUtil.drawRect(
         0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.9F * this.field21072)
      );
      float var6 = EasingFunctions.easeOutBack(!((double)this.field21072 < 0.5) ? (float)((double)this.field21072 - 0.5) * 2.0F : 0.0F, 0.0F, 1.0F, 1.0F);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.method13267() / 2), (float)(this.method13269() / 2), 0.0F);
      GL11.glScaled((double)var6, (double)var6, 0.0);
      GL11.glTranslatef((float)(-this.method13267() / 2), (float)(-this.method13269() / 2), 0.0F);
      String var7 = "##Jello \n";
      String var8 = "Jello by MF";
      ClientResource var9 = ResourceRegistry.JelloLightFont25;
      RenderUtil.drawString(
         var9, (float)((this.method13267() - var9.method23942(var8)) / 2), (float)(this.method13269() - 110), var8, ClientColors.DEEP_TEAL.getColor
      );
      GL11.glPopMatrix();
      RenderUtil.method11449(
         (float)(this.method13267() / 2) - ((float)var4 - (float)var4 * (this.field21072 - 1.0F) * this.field21072) / 2.0F,
         (float)(
            (double)(Math.max((float)var5 * 1.2F, (float)(this.method13269() / 2)) - (float)var5)
               - (double)var5
                  * Math.sin((double)(this.field21072 * this.field21072) * Math.PI)
                  * Math.sin((double)(this.field21072 * this.field21072) * Math.PI)
         ),
         (float)var4 - (float)var4 * (this.field21072 - 1.0F) * this.field21072,
         (float)var5 - (float)var5 * (this.field21072 - 1.0F) * this.field21072,
         ResourcesDecrypter.mentalfrostbytePNG,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, Math.min(1.0F, this.field21072))
      );
      if (!((double)this.field21072 < 0.986)) {
         this.field21072 = 1.0F;
      } else {
         this.field21072 = (float)Math.max(
            0.0,
            Math.min(
               1.0,
               (double)this.field21072
                  + 0.05 * (double)(30.0F / (float) Minecraft.getFps())
                  - (double)(this.field21072 * 0.04F * (30.0F / (float) Minecraft.getFps()))
            )
         );
      }
   }

   private void method13416() {
      int var3 = this.method13309() * -1;
      float var4 = (float)this.method13310() / (float)this.method13267() * -114.0F;
      if (this.field21075) {
         this.field21073 = (int)var4;
         this.field21074 = var3;
         this.field21075 = false;
      }

      float var5 = var4 - (float)this.field21073;
      float var6 = (float)(var3 - this.field21074);
      RenderUtil.method11455(
         (float)this.field21074, (float)this.field21073, (float)(this.method13267() * 2), (float)(this.method13269() + 114), ResourcesDecrypter.panoramaPNG
      );
      float var7 = 0.5F;
      if (var4 != (float)this.field21073) {
         this.field21073 = (int)((float)this.field21073 + var5 * var7);
      }

      if (var3 != this.field21074) {
         this.field21074 = (int)((float)this.field21074 + var6 * var7);
      }
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen());
      }
   }
}
