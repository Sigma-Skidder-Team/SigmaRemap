package mapped;

import com.mentalfrostbyte.jello.util.MultiUtilities;
import lol.ClientColors;
import net.minecraft.client.Minecraft;

import java.util.List;

public class CategoryDrawPart extends CategoryDrawPartBackground {
   private List<String> categoryList;
   private int field32401;
   public int index;
   public int field32403;

   public CategoryDrawPart(List<String> categoryList, int var2) {
      super(var2);
      this.categoryList = categoryList;
      this.method24729();
   }

   public void method24727(int var1, String var2) {
      if (var1 < this.categoryList.size()) {
         this.categoryList.set(var1, var2);
      }
   }

   public void method24728(List<String> var1) {
      this.categoryList = var1;
      if (this.index < 0) {
         this.index = 0;
      }

      if (this.index > this.categoryList.size()) {
         this.index = this.categoryList.size();
      }

      this.method24729();
   }

   private void method24729() {
      this.field32401 = 0;

      for (String category : this.categoryList) {
         this.field32401 = Math.max(this.field32401, this.fontRenderer.getWidth(category));
      }
   }

   @Override
   public void method24718(float partialTicks) {
      RenderUtil.renderBackgroundBox(
         (float)this.getStartX(),
         (float)this.getStartY(),
         (float)this.getWidth(),
         (float)this.method24725(),
         MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.color, partialTicks * 0.6F)
      );
      this.field32403 = this.field32403 + this.method24733();
      int var4 = this.getStartX() + 4;
      int var5 = this.getStartY() + this.field32403 + 4;
      int var6 = this.getWidth() - 8;
      byte var7 = 25;
      int var8 = -15781024;
      int var9 = -15626304;
      RenderUtil.method11432(var4, var5, var4 + var6, var5 + var7, var8, var9, var9, var8);
      float var10 = 6;

      for (String categoryName : this.categoryList) {
         int color = ClientColors.LIGHT_GREYISH_BLUE.color;
         if (categoryName.startsWith("§7")) {
            categoryName = categoryName.substring("§7".length());
            color = ClientColors.MID_GREY.color;
         }

         RenderUtil.drawString(
            this.fontRenderer,
            (float)(7 + this.getStartX()),
                 this.getStartY() + var10,
            categoryName,
            MultiUtilities.applyAlpha(color, Math.min(1.0F, partialTicks * 1.7F))
         );
         var10 += 25;
      }
   }

   @Override
   public int getWidth() {
      return Math.max(super.getWidth(), this.field32401 + 14);
   }

   @Override
   public int method24725() {
      return this.categoryList.size() * 25 + 8;
   }

   public void method24730() {
      this.index--;
      if (this.index < 0) {
         this.index = this.categoryList.size() - 1;
      }
   }

   public void method24731() {
      this.index++;
      if (this.index > this.categoryList.size() - 1) {
         this.index = 0;
      }
   }

   public boolean isAnimating() {
      return this.field32398.calcPercent() == 1.0F;
   }

   public int method24733() {
      float var3 = (float)(this.index * 25);
      float var4 = Math.abs(var3 - (float)this.field32403);
      boolean var5 = var3 - (float)this.field32403 != var4;
      float var6 = 60.0F / (float) Minecraft.getFps();
      float var7 = Math.min(var4 * 0.8F, var4 * 0.3F * var6);
      if (var5) {
         var7 *= -1.0F;
      }

      if (var7 > 0.0F && var7 < 1.0F) {
         var7 = 1.0F;
      }

      if (var7 < 0.0F && var7 > -1.0F) {
         var7 = -1.0F;
      }

      return Math.round(var7);
   }
}
