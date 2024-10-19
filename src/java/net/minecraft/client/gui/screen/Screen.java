package net.minecraft.client.gui.screen;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.crash.ReportedException;
import net.minecraft.util.Util;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public abstract class Screen extends FocusableGui implements IScreen, Class1190 {
   private static final Logger field4558 = LogManager.getLogger();
   private static final Set<String> field4559 = Sets.newHashSet(new String[]{"http", "https"});
   public final ITextComponent title;
   public final List<IGuiEventListener2> children = Lists.newArrayList();
   public Minecraft mc;
   public ItemRenderer field4563;
   public int width;
   public int height;
   public final List<Widget> field4566 = Lists.newArrayList();
   public boolean passEvents;
   public FontRenderer font;
   private URI field4569;

   public Screen(ITextComponent var1) {
      this.title = var1;
   }

   public ITextComponent getTextComponent() {
      return this.title;
   }

   public String getNarrationMessage() {
      return this.getTextComponent().getString();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      for (int var7 = 0; var7 < this.field4566.size(); var7++) {
         this.field4566.get(var7).render(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 == 256 && this.shouldCloseOnEsc()) {
         this.method1945();
         return true;
      } else if (var1 != 258) {
         return super.keyPressed(var1, var2, var3);
      } else {
         boolean var6 = !method2476();
         if (!this.changeFocus(var6)) {
            this.changeFocus(var6);
         }

         return false;
      }
   }

   public boolean shouldCloseOnEsc() {
      return true;
   }

   public void method1945() {
      this.mc.displayGuiScreen((Screen)null);
   }

   public <T extends Widget> T addButton(T var1) {
      this.field4566.add(var1);
      return this.<T>addListener((T)var1);
   }

   public <T extends IGuiEventListener2> T addListener(T var1) {
      this.children.add(var1);
      return (T)var1;
   }

   public void method2457(MatrixStack var1, ItemStack var2, int var3, int var4) {
      this.method2460(var1, this.method2458(var2), var3, var4);
   }

   public List<ITextComponent> method2458(ItemStack var1) {
      return var1.getTooltip(this.mc.player, !this.mc.gameSettings.field44588 ? TooltipFlags.NORMAL : TooltipFlags.field14481);
   }

   public void method2459(MatrixStack var1, ITextComponent var2, int var3, int var4) {
      this.method2461(var1, Arrays.asList(var2.func_241878_f()), var3, var4);
   }

   public void method2460(MatrixStack var1, List<ITextComponent> var2, int var3, int var4) {
      this.method2461(var1, Lists.transform(var2, ITextComponent::func_241878_f), var3, var4);
   }

   public void method2461(MatrixStack var1, List<? extends Class9125> var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         int var7 = 0;

         for (Class9125 var9 : var2) {
            int var10 = this.font.method38822(var9);
            if (var10 > var7) {
               var7 = var10;
            }
         }

         int var21 = var3 + 12;
         int var22 = var4 - 12;
         int var23 = 8;
         if (var2.size() > 1) {
            var23 += 2 + (var2.size() - 1) * 10;
         }

         if (var21 + var7 > this.width) {
            var21 -= 28 + var7;
         }

         if (var22 + var23 + 6 > this.height) {
            var22 = this.height - var23 - 6;
         }

         var1.push();
         Tessellator var15 = Tessellator.getInstance();
         BufferBuilder var16 = var15.getBuffer();
         var16.begin(7, DefaultVertexFormats.POSITION_COLOR);
         Matrix4f var17 = var1.getLast().getMatrix();
         method5689(var17, var16, var21 - 3, var22 - 4, var21 + var7 + 3, var22 - 3, 400, -267386864, -267386864);
         method5689(var17, var16, var21 - 3, var22 + var23 + 3, var21 + var7 + 3, var22 + var23 + 4, 400, -267386864, -267386864);
         method5689(var17, var16, var21 - 3, var22 - 3, var21 + var7 + 3, var22 + var23 + 3, 400, -267386864, -267386864);
         method5689(var17, var16, var21 - 4, var22 - 3, var21 - 3, var22 + var23 + 3, 400, -267386864, -267386864);
         method5689(var17, var16, var21 + var7 + 3, var22 - 3, var21 + var7 + 4, var22 + var23 + 3, 400, -267386864, -267386864);
         method5689(var17, var16, var21 - 3, var22 - 3 + 1, var21 - 3 + 1, var22 + var23 + 3 - 1, 400, 1347420415, 1344798847);
         method5689(var17, var16, var21 + var7 + 2, var22 - 3 + 1, var21 + var7 + 3, var22 + var23 + 3 - 1, 400, 1347420415, 1344798847);
         method5689(var17, var16, var21 - 3, var22 - 3, var21 + var7 + 3, var22 - 3 + 1, 400, 1347420415, 1347420415);
         method5689(var17, var16, var21 - 3, var22 + var23 + 2, var21 + var7 + 3, var22 + var23 + 3, 400, 1344798847, 1344798847);
         RenderSystem.enableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.shadeModel(7425);
         var16.finishDrawing();
         WorldVertexBufferUploader.draw(var16);
         RenderSystem.shadeModel(7424);
         RenderSystem.disableBlend();
         RenderSystem.enableTexture();
         Class7735 var18 = Class7733.method25595(Tessellator.getInstance().getBuffer());
         var1.translate(0.0, 0.0, 400.0);

         for (int var19 = 0; var19 < var2.size(); var19++) {
            Class9125 var20 = (Class9125)var2.get(var19);
            if (var20 != null) {
               this.font.method38813(var20, (float)var21, (float)var22, -1, true, var17, var18, false, 0, 15728880);
            }

            if (var19 == 0) {
               var22 += 2;
            }

            var22 += 10;
         }

         var18.finish();
         var1.pop();
      }
   }

   public void method2462(MatrixStack var1, Style var2, int var3, int var4) {
      if (var2 != null && var2.getHoverEvent() != null) {
         HoverEvent var7 = var2.getHoverEvent();
         HoverEvent$ItemHover var8 = var7.<HoverEvent$ItemHover>getParameter(HoverEvent$Action.SHOW_ITEM);
         if (var8 == null) {
            HoverEvent$EntityHover var9 = var7.<HoverEvent$EntityHover>getParameter(HoverEvent$Action.SHOW_ENTITY);
            if (var9 == null) {
               ITextComponent var10 = var7.<ITextComponent>getParameter(HoverEvent$Action.SHOW_TEXT);
               if (var10 != null) {
                  this.method2461(var1, this.mc.fontRenderer.trimStringToWidth(var10, Math.max(this.width / 2, 200)), var3, var4);
               }
            } else if (this.mc.gameSettings.field44588) {
               this.method2460(var1, var9.getTooltip(), var3, var4);
            }
         } else {
            this.method2457(var1, var8.createStack(), var3, var4);
         }
      }
   }

   public void method2463(String var1, boolean var2) {
   }

   public boolean method2464(Style var1) {
      if (var1 == null) {
         return false;
      } else {
         ClickEvent var4 = var1.getClickEvent();
         if (method2476()) {
            if (var1.getInsertion() != null) {
               this.method2463(var1.getInsertion(), false);
            }
         } else if (var4 != null) {
            if (var4.getAction() == ClickEvent$Action.OPEN_URL) {
               if (!this.mc.gameSettings.field44613) {
                  return false;
               }

               try {
                  URI var5 = new URI(var4.getValue());
                  String var6 = var5.getScheme();
                  if (var6 == null) {
                     throw new URISyntaxException(var4.getValue(), "Missing protocol");
                  }

                  if (!field4559.contains(var6.toLowerCase(Locale.ROOT))) {
                     throw new URISyntaxException(var4.getValue(), "Unsupported protocol: " + var6.toLowerCase(Locale.ROOT));
                  }

                  if (this.mc.gameSettings.field44614) {
                     this.field4569 = var5;
                     this.mc.displayGuiScreen(new Class830(this::method2473, var4.getValue(), false));
                  } else {
                     this.method2474(var5);
                  }
               } catch (URISyntaxException var7) {
                  field4558.error("Can't open url for {}", var4, var7);
               }
            } else if (var4.getAction() == ClickEvent$Action.OPEN_FILE) {
               URI var8 = new File(var4.getValue()).toURI();
               this.method2474(var8);
            } else if (var4.getAction() == ClickEvent$Action.SUGGEST_COMMAND) {
               this.method2463(var4.getValue(), true);
            } else if (var4.getAction() == ClickEvent$Action.RUN_COMMAND) {
               this.method2466(var4.getValue(), false);
            } else if (var4.getAction() == ClickEvent$Action.COPY_TO_CLIPBOARD) {
               this.mc.keyboardListener.method36350(var4.getValue());
            } else {
               field4558.error("Don't know how to handle {}", var4);
            }

            return true;
         }

         return false;
      }
   }

   public void method2465(String var1) {
      this.method2466(var1, true);
   }

   public void method2466(String var1, boolean var2) {
      if (var2) {
         this.mc.ingameGUI.getChatGUI().method5935(var1);
      }

      this.mc.player.method5389(var1);
   }

   public void init(Minecraft var1, int var2, int var3) {
      this.mc = var1;
      this.field4563 = var1.getItemRenderer();
      this.font = var1.fontRenderer;
      this.width = var2;
      this.height = var3;
      this.field4566.clear();
      this.children.clear();
      this.setListener((IGuiEventListener2)null);
      this.init();
   }

   @Override
   public List<? extends IGuiEventListener2> getEventListeners() {
      return this.children;
   }

   public void init() {
   }

   @Override
   public void tick() {
   }

   public void onClose() {
   }

   public void renderBackground(MatrixStack var1) {
      this.method2470(var1, 0);
   }

   public void method2470(MatrixStack var1, int var2) {
      if (this.mc.world == null) {
         this.method2471(var2);
      } else {
         this.method5688(var1, 0, 0, this.width, this.height, -1072689136, -804253680);
      }
   }

   public void method2471(int var1) {
      Tessellator var4 = Tessellator.getInstance();
      BufferBuilder var5 = var4.getBuffer();
      this.mc.getTextureManager().bindTexture(field6451);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var6 = 32.0F;
      var5.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
      var5.pos(0.0, (double)this.height, 0.0)
         .tex(0.0F, (float)this.height / 32.0F + (float)var1)
         .color(64, 64, 64, 255)
         .endVertex();
      var5.pos((double)this.width, (double)this.height, 0.0)
         .tex((float)this.width / 32.0F, (float)this.height / 32.0F + (float)var1)
         .color(64, 64, 64, 255)
         .endVertex();
      var5.pos((double)this.width, 0.0, 0.0).tex((float)this.width / 32.0F, (float)var1).color(64, 64, 64, 255).endVertex();
      var5.pos(0.0, 0.0, 0.0).tex(0.0F, (float)var1).color(64, 64, 64, 255).endVertex();
      var4.draw();
   }

   public boolean isPauseScreen() {
      return true;
   }

   private void method2473(boolean var1) {
      if (var1) {
         this.method2474(this.field4569);
      }

      this.field4569 = null;
      this.mc.displayGuiScreen(this);
   }

   private void method2474(URI var1) {
      Util.getOSType().openURI(var1);
   }

   public static boolean hasControlDown() {
      return !Minecraft.IS_RUNNING_ON_MAC
         ? InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 341)
            || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 345)
         : InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 343)
            || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 347);
   }

   public static boolean method2476() {
      return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 340)
         || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 344);
   }

   public static boolean method2477() {
      return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 342)
         || InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), 346);
   }

   public static boolean method2478(int var0) {
      return var0 == 88 && hasControlDown() && !method2476() && !method2477();
   }

   public static boolean method2479(int var0) {
      return var0 == 86 && hasControlDown() && !method2476() && !method2477();
   }

   public static boolean method2480(int var0) {
      return var0 == 67 && hasControlDown() && !method2476() && !method2477();
   }

   public static boolean method2481(int var0) {
      return var0 == 65 && hasControlDown() && !method2476() && !method2477();
   }

   public void resize(Minecraft var1, int var2, int var3) {
      this.init(var1, var2, var3);
   }

   public static void wrapScreenError(Runnable var0, String var1, String var2) {
      try {
         var0.run();
      } catch (Throwable var8) {
         CrashReport var6 = CrashReport.makeCrashReport(var8, var1);
         CrashReportCategory var7 = var6.makeCategory("Affected screen");
         var7.addDetail("Screen name", () -> var2);
         throw new ReportedException(var6);
      }
   }

   public boolean method2484(String var1, char var2, int var3) {
      int var6 = var1.indexOf(58);
      int var7 = var1.indexOf(47);
      if (var2 != ':') {
         return var2 == '/' ? var3 > var6 : var2 == '_' || var2 == '-' || var2 >= 'a' && var2 <= 'z' || var2 >= '0' && var2 <= '9' || var2 == '.';
      } else {
         return (var7 == -1 || var3 <= var7) && var6 == -1;
      }
   }

   @Override
   public boolean isMouseOver(double var1, double var3) {
      return true;
   }

   public void method2486(List<Path> var1) {
   }
}
