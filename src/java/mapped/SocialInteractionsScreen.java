package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;

public class SocialInteractionsScreen extends Screen {
   public static final ResourceLocation field6215 = new ResourceLocation("textures/gui/social_interactions.png");
   private static final ITextComponent field6216 = new TranslationTextComponent("gui.socialInteractions.tab_all");
   private static final ITextComponent field6217 = new TranslationTextComponent("gui.socialInteractions.tab_hidden");
   private static final ITextComponent field6218 = new TranslationTextComponent("gui.socialInteractions.tab_blocked");
   private static final ITextComponent field6219 = field6216.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field6220 = field6217.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field6221 = field6218.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field6222 = new TranslationTextComponent("gui.socialInteractions.search_hint")
      .mergeStyle(TextFormatting.ITALIC)
      .mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field6223 = new TranslationTextComponent("gui.socialInteractions.search_empty").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field6224 = new TranslationTextComponent("gui.socialInteractions.empty_hidden").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field6225 = new TranslationTextComponent("gui.socialInteractions.empty_blocked").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field6226 = new TranslationTextComponent("gui.socialInteractions.blocking_hint");
   private Class1297 field6227;
   private TextFieldWidget field6228;
   private String field6229 = "";
   private Class2332 field6230 = Class2332.field15951;
   private Button field6231;
   private Button field6232;
   private Button field6233;
   private Button field6234;
   private ITextComponent field6235;
   private int field6236;
   private boolean field6237;
   private Runnable field6238;

   public SocialInteractionsScreen() {
      super(new TranslationTextComponent("gui.socialInteractions.title"));
      this.method5488(Minecraft.getInstance());
   }

   private int method5482() {
      return Math.max(52, this.height - 128 - 16);
   }

   private int method5483() {
      return this.method5482() / 16;
   }

   private int method5484() {
      return 80 + this.method5483() * 16 - 8;
   }

   private int method5485() {
      return (this.width - 238) / 2;
   }

   @Override
   public String getNarrationMessage() {
      return super.getNarrationMessage() + ". " + this.field6235.getString();
   }

   @Override
   public void tick() {
      super.tick();
      this.field6228.method5633();
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      if (!this.field6237) {
         this.field6227 = new Class1297(this, this.mc, this.width, this.height, 88, this.method5484(), 36);
      } else {
         this.field6227.updateSize(this.width, this.height, 88, this.method5484());
      }

      int var3 = this.field6227.method6022() / 3;
      int var4 = this.field6227.method6053();
      int var5 = this.field6227.method6054();
      int var6 = this.font.method38821(field6226) + 40;
      int var7 = 64 + 16 * this.method5483();
      int var8 = (this.width - var6) / 2;
      this.field6231 = this.<Button>addButton(new Button(var4, 45, var3, 20, field6216, var1 -> this.method5486(Class2332.field15951)));
      this.field6232 = this.<Button>addButton(
         new Button((var4 + var5 - var3) / 2 + 1, 45, var3, 20, field6217, var1 -> this.method5486(Class2332.field15952))
      );
      this.field6233 = this.<Button>addButton(new Button(var5 - var3 + 1, 45, var3, 20, field6218, var1 -> this.method5486(Class2332.field15953)));
      this.field6234 = this.<Button>addButton(new Button(var8, var7, var6, 20, field6226, var1 -> this.mc.displayGuiScreen(new Class830(var1x -> {
            if (var1x) {
               Util.getOSType().openLink("https://aka.ms/javablocking");
            }

            this.mc.displayGuiScreen(this);
         }, "https://aka.ms/javablocking", true))));
      String var9 = this.field6228 == null ? "" : this.field6228.getText();
      this.field6228 = new Class1301(this, this.font, this.method5485() + 28, 78, 196, 16, field6222);
      this.field6228.method5657(16);
      this.field6228.method5661(false);
      this.field6228.method5671(true);
      this.field6228.method5662(16777215);
      this.field6228.method5635(var9);
      this.field6228.method5631(this::method5487);
      this.children.add(this.field6228);
      this.children.add(this.field6227);
      this.field6237 = true;
      this.method5486(this.field6230);
   }

   private void method5486(Class2332 var1) {
      this.field6230 = var1;
      this.field6231.setMessage(field6216);
      this.field6232.setMessage(field6217);
      this.field6233.setMessage(field6218);
      Collection<UUID> var4;
      switch (Class3627.field19645[var1.ordinal()]) {
         case 1:
            this.field6231.setMessage(field6219);
            var4 = this.mc.player.connection.method15791();
            break;
         case 2:
            this.field6232.setMessage(field6220);
            var4 = this.mc.func_244599_aA().method37609();
            break;
         case 3:
            this.field6233.setMessage(field6221);
            FilterManager var5 = this.mc.func_244599_aA();
            var4 = this.mc.player.connection.method15791().stream().filter(var5::method37608).collect(Collectors.toSet());
            break;
         default:
            var4 = ImmutableList.of();
      }

      this.field6230 = var1;
      this.field6227.method6134(var4, this.field6227.method6044());
      if (!this.field6228.getText().isEmpty() && this.field6227.method6137() && !this.field6228.method5746()) {
         NarratorChatListener.INSTANCE.say(field6223.getString());
      } else if (var4.isEmpty()) {
         if (var1 == Class2332.field15952) {
            NarratorChatListener.INSTANCE.say(field6224.getString());
         } else if (var1 == Class2332.field15953) {
            NarratorChatListener.INSTANCE.say(field6225.getString());
         }
      }
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public void renderBackground(MatrixStack var1) {
      int var4 = this.method5485() + 3;
      super.renderBackground(var1);
      this.mc.getTextureManager().bindTexture(field6215);
      this.blit(var1, var4, 64, 1, 1, 236, 8);
      int var5 = this.method5483();

      for (int var6 = 0; var6 < var5; var6++) {
         this.blit(var1, var4, 72 + 16 * var6, 1, 10, 236, 16);
      }

      this.blit(var1, var4, 72 + 16 * var5, 1, 27, 236, 8);
      this.blit(var1, var4 + 10, 76, 243, 1, 12, 12);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method5488(this.mc);
      this.renderBackground(var1);
      if (this.field6235 != null) {
         drawString(var1, this.mc.fontRenderer, this.field6235, this.method5485() + 8, 35, -1);
      }

      if (!this.field6227.method6137()) {
         this.field6227.render(var1, var2, var3, var4);
      } else if (!this.field6228.getText().isEmpty()) {
         drawCenteredString(var1, this.mc.fontRenderer, field6223, this.width / 2, (78 + this.method5484()) / 2, -1);
      } else {
         switch (Class3627.field19645[this.field6230.ordinal()]) {
            case 2:
               drawCenteredString(var1, this.mc.fontRenderer, field6224, this.width / 2, (78 + this.method5484()) / 2, -1);
               break;
            case 3:
               drawCenteredString(var1, this.mc.fontRenderer, field6225, this.width / 2, (78 + this.method5484()) / 2, -1);
         }
      }

      if (!this.field6228.method5746() && this.field6228.getText().isEmpty()) {
         drawString(var1, this.mc.fontRenderer, field6222, this.field6228.field6477, this.field6228.field6478, -1);
      } else {
         this.field6228.render(var1, var2, var3, var4);
      }

      this.field6234.field6483 = this.field6230 == Class2332.field15953;
      super.render(var1, var2, var3, var4);
      if (this.field6238 != null) {
         this.field6238.run();
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.field6228.method5746()) {
         this.field6228.mouseClicked(var1, var3, var5);
      }

      return super.mouseClicked(var1, var3, var5) || this.field6227.mouseClicked(var1, var3, var5);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (!this.field6228.method5746() && this.mc.gameSettings.keyBindSocialInteractions.matchesKey(var1, var2)) {
         this.mc.displayGuiScreen((Screen)null);
         return true;
      } else {
         return super.keyPressed(var1, var2, var3);
      }
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   private void method5487(String var1) {
      var1 = var1.toLowerCase(Locale.ROOT);
      if (!var1.equals(this.field6229)) {
         this.field6227.method6136(var1);
         this.field6229 = var1;
         this.method5486(this.field6230);
      }
   }

   private void method5488(Minecraft var1) {
      int var4 = var1.getConnection().method15790().size();
      if (this.field6236 != var4) {
         String var5 = "";
         ServerData var6 = var1.getCurrentServerData();
         if (!var1.isIntegratedServerRunning()) {
            if (var6 != null) {
               var5 = var6.serverName;
            }
         } else {
            var5 = var1.getIntegratedServer().method1362();
         }

         if (var4 <= 1) {
            this.field6235 = new TranslationTextComponent("gui.socialInteractions.server_label.single", var5, var4);
         } else {
            this.field6235 = new TranslationTextComponent("gui.socialInteractions.server_label.multiple", var5, var4);
         }

         this.field6236 = var4;
      }
   }

   public void method5489(NetworkPlayerInfo var1) {
      this.field6227.method6138(var1, this.field6230);
   }

   public void method5490(UUID var1) {
      this.field6227.method6139(var1);
   }

   public void method5491(Runnable var1) {
      this.field6238 = var1;
   }

   // $VF: synthetic method
   public static TextFieldWidget method5497(SocialInteractionsScreen var0) {
      return var0.field6228;
   }

   // $VF: synthetic method
   public static Class1297 method5498(SocialInteractionsScreen var0) {
      return var0.field6227;
   }

   // $VF: synthetic method
   public static ITextComponent method5499() {
      return field6223;
   }
}
