package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;

public class WinGameScreen extends Screen {
   private static final Logger field4558 = LogManager.getLogger();
   private static final ResourceLocation field7121 = new ResourceLocation("textures/gui/title/minecraft.png");
   private static final ResourceLocation field7122 = new ResourceLocation("textures/gui/title/edition.png");
   private static final ResourceLocation field7123 = new ResourceLocation("textures/misc/vignette.png");
   private static final String field7124 = "" + TextFormatting.WHITE + TextFormatting.OBFUSCATED + TextFormatting.GREEN + TextFormatting.AQUA;
   private final boolean field7125;
   private final Runnable field7126;
   private float field7127;
   private List<Class9125> field7128;
   private IntSet field7129;
   private int field7130;
   private float field7131 = 0.5F;

   public WinGameScreen(boolean var1, Runnable var2) {
      super(NarratorChatListener.field29300);
      this.field7125 = var1;
      this.field7126 = var2;
      if (!var1) {
         this.field7131 = 0.75F;
      }
   }

   @Override
   public void tick() {
      this.mc.getMusicTicker().tick();
      this.mc.getSoundHandler().tick(false);
      float var3 = (float)(this.field7130 + this.height + this.height + 24) / this.field7131;
      if (this.field7127 > var3) {
         this.method6432();
      }
   }

   @Override
   public void method1945() {
      this.method6432();
   }

   private void method6432() {
      this.field7126.run();
      this.mc.displayGuiScreen((Screen)null);
   }

   @Override
   public void init() {
      if (this.field7128 == null) {
         this.field7128 = Lists.newArrayList();
         this.field7129 = new IntOpenHashSet();
         JSonShader var3 = null;

         try {
            short var4 = 274;
            if (this.field7125) {
               var3 = this.mc.getResourceManager().getShader(new ResourceLocation("texts/end.txt"));
               InputStream var5 = var3.getFile();
               BufferedReader var6 = new BufferedReader(new InputStreamReader(var5, StandardCharsets.UTF_8));
               Random var7 = new Random(8124371L);

               String var8;
               while ((var8 = var6.readLine()) != null) {
                  var8 = var8.replaceAll("PLAYERNAME", this.mc.getSession().getUsername());

                  int var9;
                  while ((var9 = var8.indexOf(field7124)) != -1) {
                     String var10 = var8.substring(0, var9);
                     String var11 = var8.substring(var9 + field7124.length());
                     var8 = var10 + TextFormatting.WHITE + TextFormatting.OBFUSCATED + "XXXXXXXX".substring(0, var7.nextInt(4) + 3) + var11;
                  }

                  this.field7128.addAll(this.mc.fontRenderer.method38828(new StringTextComponent(var8), 274));
                  this.field7128.add(Class9125.field41930);
               }

               var5.close();

               for (int var24 = 0; var24 < 8; var24++) {
                  this.field7128.add(Class9125.field41930);
               }
            }

            InputStream var17 = this.mc.getResourceManager().getShader(new ResourceLocation("texts/credits.txt")).getFile();
            BufferedReader var18 = new BufferedReader(new InputStreamReader(var17, StandardCharsets.UTF_8));

            String var19;
            while ((var19 = var18.readLine()) != null) {
               var19 = var19.replaceAll("PLAYERNAME", this.mc.getSession().getUsername());
               var19 = var19.replaceAll("\t", "    ");
               boolean var23;
               if (var19.startsWith("[C]")) {
                  var19 = var19.substring(3);
                  var23 = true;
               } else {
                  var23 = false;
               }

               for (Class9125 var26 : this.mc.fontRenderer.method38828(new StringTextComponent(var19), 274)) {
                  if (var23) {
                     this.field7129.add(this.field7128.size());
                  }

                  this.field7128.add(var26);
               }

               this.field7128.add(Class9125.field41930);
            }

            var17.close();
            this.field7130 = this.field7128.size() * 12;
         } catch (Exception var15) {
            field4558.error("Couldn't load credits", var15);
         } finally {
            IOUtils.closeQuietly(var3);
         }
      }
   }

   private void method6433(int var1, int var2, float var3) {
      this.mc.getTextureManager().bindTexture(AbstractGui.field6451);
      int var6 = this.width;
      float var7 = -this.field7127 * 0.5F * this.field7131;
      float var8 = (float)this.height - this.field7127 * 0.5F * this.field7131;
      float var9 = 0.015625F;
      float var10 = this.field7127 * 0.02F;
      float var11 = (float)(this.field7130 + this.height + this.height + 24) / this.field7131;
      float var12 = (var11 - 20.0F - this.field7127) * 0.005F;
      if (var12 < var10) {
         var10 = var12;
      }

      if (var10 > 1.0F) {
         var10 = 1.0F;
      }

      var10 *= var10;
      var10 = var10 * 96.0F / 255.0F;
      Tessellator var13 = Tessellator.getInstance();
      BufferBuilder var14 = var13.getBuffer();
      var14.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
      var14.pos(0.0, (double)this.height, (double)this.method5702())
         .tex(0.0F, var7 * 0.015625F)
         .color(var10, var10, var10, 1.0F)
         .endVertex();
      var14.pos((double)var6, (double)this.height, (double)this.method5702())
         .tex((float)var6 * 0.015625F, var7 * 0.015625F)
         .color(var10, var10, var10, 1.0F)
         .endVertex();
      var14.pos((double)var6, 0.0, (double)this.method5702())
         .tex((float)var6 * 0.015625F, var8 * 0.015625F)
         .color(var10, var10, var10, 1.0F)
         .endVertex();
      var14.pos(0.0, 0.0, (double)this.method5702()).tex(0.0F, var8 * 0.015625F).color(var10, var10, var10, 1.0F).endVertex();
      var13.draw();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method6433(var2, var3, var4);
      short var7 = 274;
      int var8 = this.width / 2 - 137;
      int var9 = this.height + 50;
      this.field7127 += var4;
      float var10 = -this.field7127 * this.field7131;
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, var10, 0.0F);
      this.mc.getTextureManager().bindTexture(field7121);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableAlphaTest();
      RenderSystem.enableBlend();
      this.method5694(var8, var9, (var2x, var3x) -> {
         this.blit(var1, var2x + 0, var3x, 0, 0, 155, 44);
         this.blit(var1, var2x + 155, var3x, 0, 45, 155, 44);
      });
      RenderSystem.disableBlend();
      this.mc.getTextureManager().bindTexture(field7122);
      method5699(var1, var8 + 88, var9 + 37, 0.0F, 0.0F, 98, 14, 128, 16);
      RenderSystem.disableAlphaTest();
      int var11 = var9 + 100;

      for (int var12 = 0; var12 < this.field7128.size(); var12++) {
         if (var12 == this.field7128.size() - 1) {
            float var13 = (float)var11 + var10 - (float)(this.height / 2 - 6);
            if (var13 < 0.0F) {
               RenderSystem.translatef(0.0F, -var13, 0.0F);
            }
         }

         if ((float)var11 + var10 + 12.0F + 8.0F > 0.0F && (float)var11 + var10 < (float)this.height) {
            Class9125 var17 = this.field7128.get(var12);
            if (!this.field7129.contains(var12)) {
               this.font.field45929.setSeed((long)((float)((long)var12 * 4238972211L) + this.field7127 / 4.0F));
               this.font.method38802(var1, var17, (float)var8, (float)var11, 16777215);
            } else {
               this.font.method38802(var1, var17, (float)(var8 + (274 - this.font.method38822(var17)) / 2), (float)var11, 16777215);
            }
         }

         var11 += 12;
      }

      RenderSystem.popMatrix();
      this.mc.getTextureManager().bindTexture(field7123);
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.field16000, DestFactor.field12933);
      int var16 = this.width;
      int var18 = this.height;
      Tessellator var14 = Tessellator.getInstance();
      BufferBuilder var15 = var14.getBuffer();
      var15.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
      var15.pos(0.0, (double)var18, (double)this.method5702()).tex(0.0F, 1.0F).color(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
      var15.pos((double)var16, (double)var18, (double)this.method5702()).tex(1.0F, 1.0F).color(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
      var15.pos((double)var16, 0.0, (double)this.method5702()).tex(1.0F, 0.0F).color(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
      var15.pos(0.0, 0.0, (double)this.method5702()).tex(0.0F, 0.0F).color(1.0F, 1.0F, 1.0F, 1.0F).endVertex();
      var14.draw();
      RenderSystem.disableBlend();
      super.render(var1, var2, var3, var4);
   }
}
