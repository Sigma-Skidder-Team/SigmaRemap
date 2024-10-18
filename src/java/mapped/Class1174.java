package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class1174 extends Class1155<Class1174> {
   public final Class1285 field6359;

   public Class1174(Class1285 var1) {
      this.field6359 = var1;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      Class9537 var13 = Class1324.method6302(this.field6359.field6849)
         .method38129()
         .get(Class1324.method6302(this.field6359.field6849).method38129().size() - var2 - 1);
      BlockState var14 = var13.method36906();
      Item var15 = var14.getBlock().method11581();
      if (var15 == Items.AIR) {
         if (!var14.isIn(Blocks.WATER)) {
            if (var14.isIn(Blocks.LAVA)) {
               var15 = Items.LAVA_BUCKET;
            }
         } else {
            var15 = Items.WATER_BUCKET;
         }
      }

      ItemStack var16 = new ItemStack(var15);
      this.method5596(var1, var4, var3, var16);
      this.field6359.field6849.font.func_243248_b(var1, var15.method11731(var16), (float)(var4 + 18 + 5), (float)(var3 + 3), 16777215);
      String var17;
      if (var2 != 0) {
         if (var2 != Class1324.method6302(this.field6359.field6849).method38129().size() - 1) {
            var17 = I18n.format("createWorld.customize.flat.layer", var13.method36905());
         } else {
            var17 = I18n.format("createWorld.customize.flat.layer.bottom", var13.method36905());
         }
      } else {
         var17 = I18n.format("createWorld.customize.flat.layer.top", var13.method36905());
      }

      this.field6359
         .field6849
         .font
         .method38801(var1, var17, (float)(var4 + 2 + 213 - this.field6359.field6849.font.getStringWidth(var17)), (float)(var3 + 3), 16777215);
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         this.field6359.method6024(this);
         return true;
      }
   }

   private void method5596(MatrixStack var1, int var2, int var3, ItemStack var4) {
      this.method5597(var1, var2 + 1, var3 + 1);
      RenderSystem.enableRescaleNormal();
      if (!var4.isEmpty()) {
         this.field6359.field6849.field4563.method791(var4, var2 + 2, var3 + 2);
      }

      RenderSystem.disableRescaleNormal();
   }

   private void method5597(MatrixStack var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      Class1285.method6107(this.field6359).getTextureManager().bindTexture(AbstractGui.field6452);
      AbstractGui.method5697(var1, var2, var3, this.field6359.field6849.method5702(), 0.0F, 0.0F, 18, 18, 128, 128);
   }
}
