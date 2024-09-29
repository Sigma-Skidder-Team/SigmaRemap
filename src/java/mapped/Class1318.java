package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameType;

import java.util.List;
import java.util.Optional;

public class Class1318 extends Screen {
   private static final ResourceLocation field6962 = new ResourceLocation("textures/gui/container/gamemode_switcher.png");
   private static final int field6963 = Class2150.values().length * 30 - 5;
   private static final ITextComponent field6964 = new TranslationTextComponent(
      "debug.gamemodes.select_next", new TranslationTextComponent("debug.gamemodes.press_f4").mergeStyle(TextFormatting.AQUA)
   );
   private final Optional<Class2150> field6965;
   private Optional<Class2150> field6966 = Optional.<Class2150>empty();
   private int field6967;
   private int field6968;
   private boolean field6969;
   private final List<Class1198> field6970 = Lists.newArrayList();

   public Class1318() {
      super(NarratorChatListener.field29300);
      this.field6965 = Class2150.method8860(this.method6256());
   }

   private GameType method6256() {
      GameType var3 = Minecraft.getInstance().playerController.getCurrentGameType();
      GameType var4 = Minecraft.getInstance().playerController.method23156();
      if (var4 == GameType.field11101) {
         if (var3 != GameType.field11103) {
            var4 = GameType.field11103;
         } else {
            var4 = GameType.field11102;
         }
      }

      return var4;
   }

   @Override
   public void init() {
      super.init();
      this.field6966 = !this.field6965.isPresent() ? Class2150.method8860(this.mc.playerController.getCurrentGameType()) : this.field6965;

      for (int var3 = 0; var3 < Class2150.field14059.length; var3++) {
         Class2150 var4 = Class2150.field14059[var3];
         this.field6970.add(new Class1198(this, var4, this.width / 2 - field6963 / 2 + var3 * 30, this.height / 2 - 30));
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      if (!this.method6259()) {
         var1.push();
         RenderSystem.enableBlend();
         this.mc.getTextureManager().bindTexture(field6962);
         int var7 = this.width / 2 - 62;
         int var8 = this.height / 2 - 30 - 27;
         method5699(var1, var7, var8, 0.0F, 0.0F, 125, 75, 128, 128);
         var1.pop();
         super.render(var1, var2, var3, var4);
         this.field6966.ifPresent(var2x -> drawCenteredString(var1, this.font, Class2150.method8863(var2x), this.width / 2, this.height / 2 - 30 - 20, -1));
         drawCenteredString(var1, this.font, field6964, this.width / 2, this.height / 2 + 5, 16777215);
         if (!this.field6969) {
            this.field6967 = var2;
            this.field6968 = var3;
            this.field6969 = true;
         }

         boolean var9 = this.field6967 == var2 && this.field6968 == var3;

         for (Class1198 var11 : this.field6970) {
            var11.render(var1, var2, var3, var4);
            this.field6966.ifPresent(var1x -> var11.method5748(var1x == Class1198.method5751(var11)));
            if (!var9 && var11.method5737()) {
               this.field6966 = Optional.<Class2150>of(Class1198.method5751(var11));
            }
         }
      }
   }

   private void method6257() {
      method6258(this.mc, this.field6966);
   }

   private static void method6258(Minecraft var0, Optional<Class2150> var1) {
      if (var0.playerController != null && var0.player != null && var1.isPresent()) {
         Optional var4 = Class2150.method8860(var0.playerController.getCurrentGameType());
         Class2150 var5 = (Class2150)var1.get();
         if (var4.isPresent() && var0.player.method3424(2) && var5 != var4.get()) {
            var0.player.method5389(Class2150.method8861(var5));
         }
      }
   }

   private boolean method6259() {
      if (InputMappings.isKeyDown(this.mc.getMainWindow().getHandle(), 292)) {
         return false;
      } else {
         this.method6257();
         this.mc.displayGuiScreen((Screen)null);
         return true;
      }
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 == 293 && this.field6966.isPresent()) {
         this.field6969 = false;
         this.field6966 = Class2150.method8862(this.field6966.get());
         return true;
      } else {
         return super.keyPressed(var1, var2, var3);
      }
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   // $VF: synthetic method
   public static ResourceLocation method6262() {
      return field6962;
   }
}
