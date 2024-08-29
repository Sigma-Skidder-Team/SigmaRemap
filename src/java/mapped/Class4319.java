package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4307;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import org.lwjgl.opengl.GL11;

public class Class4319 extends Class4307 {
   private float field21072 = 0.0F;
   private int field21073 = 0;
   private int field21074 = 0;
   private boolean field21075 = true;

   public Class4319() {
      super("Credits");
      this.method13300(false);
   }

   @Override
   public void method13027(float var1) {
      super.method13027(var1);
      int var4 = ResourcesDecrypter.mentalfrostbytePNG.getImageWidth();
      int var5 = ResourcesDecrypter.mentalfrostbytePNG.getImageHeight();
      var4 = Math.min(var4, (int)((float) Minecraft.getInstance().mainWindow.method8044() / 1.65F));
      var5 = Math.min(var5, (int)((float) Minecraft.getInstance().mainWindow.method8044() / 1.65F));
      this.method13416();
      Class3192.method11426(
         0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(Class1979.field12896.field12910, 0.9F * this.field21072)
      );
      float var6 = Class9747.method38214(!((double)this.field21072 < 0.5) ? (float)((double)this.field21072 - 0.5) * 2.0F : 0.0F, 0.0F, 1.0F, 1.0F);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.method13267() / 2), (float)(this.method13269() / 2), 0.0F);
      GL11.glScaled((double)var6, (double)var6, 0.0);
      GL11.glTranslatef((float)(-this.method13267() / 2), (float)(-this.method13269() / 2), 0.0F);
      String var7 = "##Jello \n";
      String var8 = "Jello by MF";
      ClientResource var9 = ResourceRegistry.JelloLightFont25;
      Class3192.method11439(
         var9, (float)((this.method13267() - var9.method23942(var8)) / 2), (float)(this.method13269() - 110), var8, Class1979.field12891.field12910
      );
      GL11.glPopMatrix();
      Class3192.method11449(
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
         Class5628.method17688(Class1979.field12896.field12910, Math.min(1.0F, this.field21072))
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
      Class3192.method11455(
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
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(new MainMenuScreen());
      }
   }
}
