package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.Screen;
import com.mentalfrostbyte.jello.unmapped.Class8433;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import net.minecraft.client.Minecraft;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map.Entry;

public class Class4312 extends Screen {
   private static Minecraft field20992 = Minecraft.getInstance();
   private static float field20993;
   private float field20994;
   private Class4269 field20995;
   private Class4339 field20996;
   private Class4267 field20997;
   private int field20998 = 20;
   private int field20999 = 642;
   private int field21000 = 410;
   private int field21001 = 55;
   private int field21002 = 200;
   public boolean field21003 = true;
   private Texture field21004;

   public Class4312() {
      super("JelloChat");
      this.addToList(
         this.field20995 = new Class4269(
            this, "input", this.field20998, this.method13269() - this.field21001 - this.field20998, this.field20999, this.field21001
         )
      );
      this.addToList(
         this.field20996 = new Class4339(
            this,
            "navbar",
            this.field20998,
            this.method13269() - this.field21001 - this.field20998 * 2 - this.field21000 + 80,
            this.field21002,
            this.field21000 - 90
         )
      );
      this.addToList(
         this.field20997 = new Class4267(
            this,
            "chatView",
            this.field20998 + this.field21002,
            this.method13269() - this.field21001 - this.field20998 * 2 - this.field21000,
            this.field20999 - this.field21002,
            this.field21000
         )
      );
      int var3 = 55;
      System.out.println("loading");

      for (Entry var5 : Client.getInstance().getNetworkManager().field38429.method29510().entrySet()) {
         System.out.println("added " + ((Class8433)var5.getValue()).field36143);
         this.field20996
            .addToList(
               new Class4273(
                  this.field20996,
                  ((Class8433)var5.getValue()).field36142 + "_" + this.field20996.method13241().size(),
                  0,
                  0,
                  this.field20996.method13267(),
                  var3,
                  ((Class8433)var5.getValue()).field36141,
                  ((Class8433)var5.getValue()).field36144
               )
            );
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.method13300(false);
      this.field20999 = 642;
      this.field20995.method13268(this.field20999);
   }

   @Override
   public int method13313() {
      return 60;
   }

   public void method13359(String var1) {
      this.field20997.method13100(var1);
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      if (var1 == 256) {
         field20992.displayGuiScreen(null);
      }
   }

   @Override
   public void draw(float var1) {
      this.field20994 = Math.min(1.0F, this.field20994 + 0.1F);
      float var6 = Class9747.method38214(this.field20994, 0.0F, 1.0F, 1.0F);
      this.field20995.drawBackground(this.field21001 + this.field20998 - (int)(var6 * (float)(this.field21001 + this.field20998)));
      this.drawBackground((int)((1.0F - this.field20994) * 10.0F));
      this.method13225();
      int var7 = this.field20998;
      int var8 = this.method13269() - this.field21001 - this.field20998 * 2 - 410;
      int var9 = this.field20999;
      int var10 = this.field21000;

      try {
         if (this.field21003) {
            BufferedImage var11 = ImageUtil.method35036(var7, var8, 200, var10, 10, 14, 0, true);
            this.field21004 = TextureUtil.method32933("blur", ImageUtil.method35042(var11, 0.0F, 1.1F, 1.3F));
         }
      } catch (IOException var12) {
         var12.printStackTrace();
      }

      this.field21003 = !this.field21003;
      var1 = Class9782.method38558(this.field20994, 0.0F, 1.0F, 1.0F);
      RenderUtil.method11463((float)(var7 + 5), (float)(var8 + 5), (float)(this.field21002 - 10), (float)(var10 - 10), 25.0F, var1 * 0.4F);
      RenderUtil.method11471((float)var7, (float)var8, (float)var9, (float)var10, 10.0F);
      if (this.field21004 != null) {
         RenderUtil.method11449(
            (float)var7, (float)var8, (float)this.field21002, (float)var10, this.field21004, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
      }

      RenderUtil.method11426(
         (float)var7, (float)var8, (float)(var7 + this.field21002), (float)(var8 + 80), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.14F)
      );
      RenderUtil.method11478();
      RenderUtil.method11420(var7 + this.field21002, var8 - this.field20998, var7 + var9 + this.field20998, var8 + var10 + this.field20998);
      RenderUtil.method11467(var7, var8, var9, var10, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1));
      RenderUtil.endScissor();
      RenderUtil.method11420(var7 - this.field20998, var8 - this.field20998, var7 + this.field21002, var8 + var10 + this.field20998);
      RenderUtil.method11467(var7, var8, var9, var10, ColorUtils.applyAlpha(-2236963, var1 * 0.75F));
      RenderUtil.method11426(
         (float)(var7 + this.field21002 - 1),
         (float)var8,
         (float)(var7 + this.field21002),
         (float)(var8 + var10),
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.05F)
      );
      RenderUtil.endScissor();
      super.draw(var1);
   }
}
