package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.network.play.client.CUpdateSignPacket;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.stream.IntStream;

public class Class831 extends Screen {
   private final Class2848 field4610 = new Class2848();
   private final Class954 field4611;
   private int field4612;
   private int field4613;
   private Class9079 field4614;
   private final String[] field4615;

   public Class831(Class954 var1) {
      super(new TranslationTextComponent("sign.edit"));
      this.field4615 = IntStream.range(0, 4).<ITextComponent>mapToObj(var1::method3835).<String>map(ITextComponent::getString).<String>toArray(String[]::new);
      this.field4611 = var1;
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.<Button>addButton(new Button(this.width / 2 - 100, this.height / 4 + 120, 200, 20, DialogTexts.DONE, var1 -> this.method2541()));
      this.field4611.method3839(false);
      this.field4614 = new Class9079(() -> this.field4615[this.field4613], var1 -> {
         this.field4615[this.field4613] = var1;
         this.field4611.method3836(this.field4613, new StringTextComponent(var1));
      }, Class9079.method33827(this.mc), Class9079.method33829(this.mc), var1 -> this.mc.fontRenderer.getStringWidth(var1) <= 90);
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
      ClientPlayNetHandler var3 = this.mc.getConnection();
      if (var3 != null) {
         var3.sendPacket(new CUpdateSignPacket(this.field4611.getPos(), this.field4615[0], this.field4615[1], this.field4615[2], this.field4615[3]));
      }

      this.field4611.method3839(true);
   }

   @Override
   public void tick() {
      this.field4612++;
      if (!this.field4611.method3786().method13796(this.field4611.getBlockState().getBlock())) {
         this.method2541();
      }
   }

   private void method2541() {
      this.field4611.markDirty();
      this.mc.displayGuiScreen((Screen)null);
   }

   @Override
   public boolean charTyped(char var1, int var2) {
      this.field4614.method33831(var1);
      return true;
   }

   @Override
   public void method1945() {
      this.method2541();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 265) {
         if (var1 != 264 && var1 != 257 && var1 != 335) {
            return !this.field4614.method33832(var1) ? super.keyPressed(var1, var2, var3) : true;
         } else {
            this.field4613 = this.field4613 + 1 & 3;
            this.field4614.method33847();
            return true;
         }
      } else {
         this.field4613 = this.field4613 - 1 & 3;
         this.field4614.method33847();
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      RenderHelper.setupGuiFlatDiffuseLighting();
      this.renderBackground(var1);
      drawCenteredString(var1, this.font, this.title, this.width / 2, 40, 16777215);
      var1.push();
      var1.translate((double)(this.width / 2), 0.0, 50.0);
      float var7 = 93.75F;
      var1.scale(93.75F, -93.75F, 93.75F);
      var1.translate(0.0, -1.3125, 0.0);
      BlockState var8 = this.field4611.getBlockState();
      boolean var9 = var8.getBlock() instanceof SignBlock;
      if (!var9) {
         var1.translate(0.0, -0.3125, 0.0);
      }

      boolean var10 = this.field4612 / 6 % 2 == 0;
      float var11 = 0.6666667F;
      var1.push();
      var1.scale(0.6666667F, -0.6666667F, -0.6666667F);
      Class7735 var12 = this.mc.getRenderTypeBuffers().getBufferSource();
      Class7826 var13 = Class5947.method18473(var8.getBlock());
      IVertexBuilder var14 = var13.method26200(var12, this.field4610::method11028);
      this.field4610.field17650.render(var1, var14, 15728880, OverlayTexture.NO_OVERLAY);
      if (var9) {
         this.field4610.field17651.render(var1, var14, 15728880, OverlayTexture.NO_OVERLAY);
      }

      var1.pop();
      float var15 = 0.010416667F;
      var1.translate(0.0, 0.33333334F, 0.046666667F);
      var1.scale(0.010416667F, -0.010416667F, 0.010416667F);
      int var16 = this.field4611.method3844().method314();
      int var17 = this.field4614.method33849();
      int var18 = this.field4614.method33851();
      int var19 = this.field4613 * 10 - this.field4615.length * 5;
      Matrix4f var20 = var1.getLast().getMatrix();

      for (int var21 = 0; var21 < this.field4615.length; var21++) {
         String var22 = this.field4615[var21];
         if (var22 != null) {
            if (this.font.method38829()) {
               var22 = this.font.method38806(var22);
            }

            float var23 = (float)(-this.mc.fontRenderer.getStringWidth(var22) / 2);
            this.mc
               .fontRenderer
               .method38811(var22, var23, (float)(var21 * 10 - this.field4615.length * 5), var16, false, var20, var12, false, 0, 15728880, false);
            if (var21 == this.field4613 && var17 >= 0 && var10) {
               int var24 = this.mc.fontRenderer.getStringWidth(var22.substring(0, Math.max(Math.min(var17, var22.length()), 0)));
               int var25 = var24 - this.mc.fontRenderer.getStringWidth(var22) / 2;
               if (var17 >= var22.length()) {
                  this.mc.fontRenderer.method38811("_", (float)var25, (float)var19, var16, false, var20, var12, false, 0, 15728880, false);
               }
            }
         }
      }

      var12.finish();

      for (int var33 = 0; var33 < this.field4615.length; var33++) {
         String var34 = this.field4615[var33];
         if (var34 != null && var33 == this.field4613 && var17 >= 0) {
            int var35 = this.mc.fontRenderer.getStringWidth(var34.substring(0, Math.max(Math.min(var17, var34.length()), 0)));
            int var36 = var35 - this.mc.fontRenderer.getStringWidth(var34) / 2;
            if (var10 && var17 < var34.length()) {
               fill(var1, var36, var19 - 1, var36 + 1, var19 + 9, 0xFF000000 | var16);
            }

            if (var18 != var17) {
               int var37 = Math.min(var17, var18);
               int var26 = Math.max(var17, var18);
               int var27 = this.mc.fontRenderer.getStringWidth(var34.substring(0, var37)) - this.mc.fontRenderer.getStringWidth(var34) / 2;
               int var28 = this.mc.fontRenderer.getStringWidth(var34.substring(0, var26)) - this.mc.fontRenderer.getStringWidth(var34) / 2;
               int var29 = Math.min(var27, var28);
               int var30 = Math.max(var27, var28);
               Tessellator var31 = Tessellator.getInstance();
               BufferBuilder var32 = var31.getBuffer();
               RenderSystem.disableTexture();
               RenderSystem.method27857();
               RenderSystem.logicOp(Class2270.field14769);
               var32.begin(7, DefaultVertexFormats.POSITION_COLOR);
               var32.pos(var20, (float)var29, (float)(var19 + 9), 0.0F).color(0, 0, 255, 255).endVertex();
               var32.pos(var20, (float)var30, (float)(var19 + 9), 0.0F).color(0, 0, 255, 255).endVertex();
               var32.pos(var20, (float)var30, (float)var19, 0.0F).color(0, 0, 255, 255).endVertex();
               var32.pos(var20, (float)var29, (float)var19, 0.0F).color(0, 0, 255, 255).endVertex();
               var32.finishDrawing();
               WorldVertexBufferUploader.draw(var32);
               RenderSystem.method27858();
               RenderSystem.enableTexture();
            }
         }
      }

      var1.pop();
      RenderHelper.setupGui3DDiffuseLighting();
      super.render(var1, var2, var3, var4);
   }
}
