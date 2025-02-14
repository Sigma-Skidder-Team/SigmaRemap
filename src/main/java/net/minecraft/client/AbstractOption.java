package net.minecraft.client;

import java.util.List;
import java.util.Optional;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import mapped.*;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.renderer.GPUWarning;
import net.minecraft.client.settings.IteratableOption;
import net.minecraft.client.settings.NarratorStatus;
import net.minecraft.client.settings.ParticleStatus;
import net.minecraft.client.settings.SliderPercentageOption;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.*;
import net.minecraft.util.text.TextFormatting;
import net.optifine.Config;
import net.optifine.config.IteratableOptionOF;

public abstract class AbstractOption {
   public static final SliderPercentageOption field25315 = new SliderPercentageOption("options.biomeBlendRadius", 0.0, 7.0, 1.0F, var0 -> (double)var0.biomeBlendRadius, (var0, var1) -> {
      var0.biomeBlendRadius = MathHelper.clamp((int)var1.doubleValue(), 0, 7);
      Minecraft.getInstance().worldRenderer.loadRenderers();
   }, (var0, var1) -> {
      double var4 = var1.get(var0);
      int var6 = (int)var4 * 2 + 1;
      return var1.method17955(new TranslationTextComponent("options.biomeBlendRadius." + var6));
   });
   public static final SliderPercentageOption field25316 = new SliderPercentageOption("options.chat.height.focused", 0.0, 1.0, 0.0F, var0 -> var0.field44598, (var0, var1) -> {
      var0.field44598 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.normalizeValue(var1.get(var0));
      return var1.method17952(Class1266.method5946(var4));
   });
   public static final SliderPercentageOption field25317 = new SliderPercentageOption("options.chat.height.unfocused", 0.0, 1.0, 0.0F, var0 -> var0.field44597, (var0, var1) -> {
      var0.field44597 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.normalizeValue(var1.get(var0));
      return var1.method17952(Class1266.method5946(var4));
   });
   public static final SliderPercentageOption field25318 = new SliderPercentageOption("options.chat.opacity", 0.0, 1.0, 0.0F, var0 -> var0.field44583, (var0, var1) -> {
      var0.field44583 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.normalizeValue(var1.get(var0));
      return var1.method17953(var4 * 0.9 + 0.1);
   });
   public static final SliderPercentageOption field25319 = new SliderPercentageOption("options.chat.scale", 0.0, 1.0, 0.0F, var0 -> var0.field44595, (var0, var1) -> {
      var0.field44595 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.normalizeValue(var1.get(var0));
      return (ITextComponent)(var4 != 0.0 ? var1.method17953(var4) : DialogTexts.method22238(var1.method17949(), false));
   });
   public static final SliderPercentageOption field25320 = new SliderPercentageOption("options.chat.width", 0.0, 1.0, 0.0F, var0 -> var0.field44596 / 4.0571431, (var0, var1) -> {
      var1 = var1 * 4.0571431;
      var0.field44596 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.normalizeValue(var1.get(var0));
      return var1.method17952(Class1266.method5945(var4 * 4.0571431));
   });
   public static final SliderPercentageOption field25321 = new SliderPercentageOption(
      "options.chat.line_spacing",
      0.0,
      1.0,
      0.0F,
      var0 -> var0.field44584,
      (var0, var1) -> var0.field44584 = var1,
      (var0, var1) -> var1.method17953(var1.normalizeValue(var1.get(var0)))
   );
   public static final SliderPercentageOption field25322 = new SliderPercentageOption(
      "options.chat.delay_instant",
      0.0,
      6.0,
      0.1F,
      var0 -> var0.field44599,
      (var0, var1) -> var0.field44599 = var1,
      (var0, var1) -> {
         double var4 = var1.get(var0);
         return !(var4 <= 0.0)
            ? new TranslationTextComponent("options.chat.delay", String.format("%.1f", var4))
            : new TranslationTextComponent("options.chat.delay_none");
      }
   );
   public static final SliderPercentageOption FOV = new SliderPercentageOption(
      "options.fov", 30.0, 110.0, 1.0F, var0 -> var0.fov, (var0, var1) -> var0.fov = var1, (var0, var1) -> {
         double var4 = var1.get(var0);
         if (var4 != 70.0) {
            return var4 != var1.getMaxValue() ? var1.method17956((int)var4) : var1.method17955(new TranslationTextComponent("options.fov.max"));
         } else {
            return var1.method17955(new TranslationTextComponent("options.fov.min"));
         }
      }
   );
   private static final ITextComponent field25324 = new TranslationTextComponent("options.fovEffectScale.tooltip");
   public static final SliderPercentageOption field25325 = new SliderPercentageOption(
      "options.fovEffectScale",
      0.0,
      1.0,
      0.0F,
      var0 -> Math.pow((double)var0.fovScaleEffect, 2.0),
      (var0, var1) -> var0.fovScaleEffect = MathHelper.sqrt(var1),
      (var0, var1) -> {
         var1.setOptionValues(Minecraft.getInstance().fontRenderer.trimStringToWidth(field25324, 200));
         double var4 = var1.normalizeValue(var1.get(var0));
         return var4 != 0.0 ? var1.method17953(var4) : var1.method17955(new TranslationTextComponent("options.fovEffectScale.off"));
      }
   );
   private static final ITextComponent field25326 = new TranslationTextComponent("options.screenEffectScale.tooltip");
   public static final SliderPercentageOption field25327 = new SliderPercentageOption(
      "options.screenEffectScale", 0.0, 1.0, 0.0F, var0 -> (double)var0.screenEffectScale, (var0, var1) -> var0.screenEffectScale = var1.floatValue(), (var0, var1) -> {
         var1.setOptionValues(Minecraft.getInstance().fontRenderer.trimStringToWidth(field25326, 200));
         double var4 = var1.normalizeValue(var1.get(var0));
         return var4 != 0.0 ? var1.method17953(var4) : var1.method17955(new TranslationTextComponent("options.screenEffectScale.off"));
      }
   );
   public static final SliderPercentageOption FRAMERATE_LIMIT = new SliderPercentageOption(
      "options.framerateLimit",
      0.0,
      260.0,
      5.0F,
      var0 -> (double)var0.framerateLimit,
      (var0, var1) -> {
         var0.framerateLimit = (int)var1.doubleValue();
         var0.vsync = false;
         if (var0.framerateLimit <= 0) {
         // 有问题   var0.field44576 = (int)field25328.method18087();
            var0.vsync = true;
         }

         var0.method37164();
         Minecraft.getInstance().getMainWindow().setFramerateLimit(var0.framerateLimit);
      },
      (var0, var1) -> {
         if (!var0.vsync) {
            double var4 = var1.get(var0);
            return var4 != var1.getMaxValue()
               ? var1.method17955(new TranslationTextComponent("options.framerate", (int)var4))
               : var1.method17955(new TranslationTextComponent("options.framerateLimit.max"));
         } else {
            return var1.method17955(new TranslationTextComponent("of.options.framerateLimit.vsync"));
         }
      }
   );
   public static final SliderPercentageOption field25329 = new SliderPercentageOption(
      "options.gamma", 0.0, 1.0, 0.0F, var0 -> var0.gamma, (var0, var1) -> var0.gamma = var1, (var0, var1) -> {
         double var4 = var1.normalizeValue(var1.get(var0));
         if (var4 != 0.0) {
            return var4 != 1.0 ? var1.method17954((int)(var4 * 100.0)) : var1.method17955(new TranslationTextComponent("options.gamma.max"));
         } else {
            return var1.method17955(new TranslationTextComponent("options.gamma.min"));
         }
      }
   );
   public static final SliderPercentageOption field25330 = new SliderPercentageOption("options.mipmapLevels", 0.0, 4.0, 1.0F, var0 -> (double)var0.field44600, (var0, var1) -> {
      var0.field44600 = (int)var1.doubleValue();
      var0.method37165();
   }, (var0, var1) -> {
      double var4 = var1.get(var0);
      if (!(var4 >= 4.0)) {
         return (ITextComponent)(var4 != 0.0 ? var1.method17956((int)var4) : DialogTexts.method22238(var1.method17949(), false));
      } else {
         return var1.method17955(new TranslationTextComponent("of.general.max"));
      }
   });
   public static final SliderPercentageOption field25331 = new Class5808(
      "options.mouseWheelSensitivity", 0.01, 10.0, 0.01F, var0 -> var0.field44607, (var0, var1) -> var0.field44607 = var1, (var0, var1) -> {
         double var4 = var1.normalizeValue(var1.get(var0));
         return var1.method17955(new StringTextComponent(String.format("%.2f", var1.denormalizeValue(var4))));
      }
   );
   public static final Class5806 field25332 = new Class5806("options.rawMouseInput", var0 -> var0.rawMouseInput, (var0, var1) -> {
      var0.rawMouseInput = var1;
      MainWindow var4 = Minecraft.getInstance().getMainWindow();
      if (var4 != null) {
         var4.setRawMouseInput(var1);
      }
   });
   public static final SliderPercentageOption field25333 = new SliderPercentageOption("options.renderDistance", 2.0, 16.0, 1.0F, var0 -> (double)var0.renderDistanceChunks, (var0, var1) -> {
      var0.renderDistanceChunks = (int)var1.doubleValue();
      Minecraft.getInstance().worldRenderer.setDisplayListEntitiesDirty();
   }, (var0, var1) -> {
      double var4 = var1.get(var0);
      return var1.method17955(new TranslationTextComponent("options.chunks", (int)var4));
   });
   public static final SliderPercentageOption field25334 = new SliderPercentageOption(
      "options.entityDistanceScaling",
      0.5,
      5.0,
      0.25F,
      var0 -> (double)var0.field44575,
      (var0, var1) -> var0.field44575 = (float)var1.doubleValue(),
      (var0, var1) -> {
         double var4 = var1.get(var0);
         return var1.method17953(var4);
      }
   );
   public static final SliderPercentageOption field25335 = new SliderPercentageOption(
      "options.sensitivity", 0.0, 1.0, 0.0F, var0 -> var0.field44573, (var0, var1) -> var0.field44573 = var1, (var0, var1) -> {
         double var4 = var1.normalizeValue(var1.get(var0));
         if (var4 != 0.0) {
            return var4 != 1.0 ? var1.method17953(2.0 * var4) : var1.method17955(new TranslationTextComponent("options.sensitivity.max"));
         } else {
            return var1.method17955(new TranslationTextComponent("options.sensitivity.min"));
         }
      }
   );
   public static final SliderPercentageOption field25336 = new SliderPercentageOption(
      "options.accessibility.text_background_opacity", 0.0, 1.0, 0.0F, var0 -> var0.field44585, (var0, var1) -> {
         var0.field44585 = var1;
         Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
      }, (var0, var1) -> var1.method17953(var1.normalizeValue(var1.get(var0)))
   );
   public static final IteratableOption field25337 = new IteratableOption("options.ao", (var0, var1) -> {
      var0.ambientOcclusionStatus = AmbientOcclusionStatus.method9117(var0.ambientOcclusionStatus.method9115() + var1);
      Minecraft.getInstance().worldRenderer.loadRenderers();
   }, (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.ambientOcclusionStatus.method9116())));
   public static final IteratableOption field25338 = new IteratableOption(
      "options.attackIndicator",
      (var0, var1) -> var0.field44603 = Class2207.method8924(var0.field44603.method8922() + var1),
      (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.field44603.method8923()))
   );
   public static final IteratableOption field25339 = new IteratableOption(
      "options.chat.visibility",
      (var0, var1) -> var0.chatVisibility = ChatVisibility.getValue((var0.chatVisibility.getId() + var1) % 3),
      (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.chatVisibility.getResourceKey()))
   );
   private static final ITextComponent FAST_GRAPHICS = new TranslationTextComponent("options.graphics.fast.tooltip");
   private static final ITextComponent FABULOUS_GRAPHICS = new TranslationTextComponent(
      "options.graphics.fabulous.tooltip", new TranslationTextComponent("options.graphics.fabulous").mergeStyle(TextFormatting.ITALIC)
   );
   private static final ITextComponent FANCY_GRAPHICS = new TranslationTextComponent("options.graphics.fancy.tooltip");
   public static final IteratableOption field25343 = new IteratableOption("options.graphics", (var0, var1) -> {
      Minecraft minecraft = Minecraft.getInstance();
      GPUWarning gpuwarning = minecraft.getGPUWarning();
      if (var0.graphicFanciness == GraphicsFanciness.FANCY && gpuwarning.method975()) {
         gpuwarning.method976();
      } else {
         var0.graphicFanciness = var0.graphicFanciness.method8745();
         if (var0.graphicFanciness == GraphicsFanciness.FABULOUS && (Config.isShaders() || !GLX.isUsingFBOs() || !GlStateManager.isFabulous() || gpuwarning.func_241701_h_())) {
            var0.graphicFanciness = GraphicsFanciness.FAST;
         }

         var0.method37162();
         minecraft.worldRenderer.loadRenderers();
      }
   }, (var0, var1) -> {
      switch (var0.graphicFanciness) {
         case FAST:
            var1.setOptionValues(Minecraft.getInstance().fontRenderer.trimStringToWidth(FAST_GRAPHICS, 200));
            break;
         case FANCY:
            var1.setOptionValues(Minecraft.getInstance().fontRenderer.trimStringToWidth(FANCY_GRAPHICS, 200));
            break;
         case FABULOUS:
            var1.setOptionValues(Minecraft.getInstance().fontRenderer.trimStringToWidth(FABULOUS_GRAPHICS, 200));
      }

      IFormattableTextComponent var4 = new TranslationTextComponent(var0.graphicFanciness.func_238164_b_());
      return var0.graphicFanciness == GraphicsFanciness.FABULOUS ? var1.method17955(var4.mergeStyle(TextFormatting.ITALIC)) : var1.method17955(var4);
   });
   public static final IteratableOption field25344 = new IteratableOption(
      "options.guiScale",
      (var0, var1) -> var0.guiScale = MathHelper.normalizeAngle(
            var0.guiScale + var1, Minecraft.getInstance().getMainWindow().calcGuiScale(0, Minecraft.getInstance().getForceUnicodeFont()) + 1
         ),
      (var0, var1) -> var0.guiScale != 0 ? var1.method17956(var0.guiScale) : var1.method17955(new TranslationTextComponent("options.guiScale.auto"))
   );
   public static final IteratableOption field25345 = new IteratableOption(
      "options.mainHand", (var0, var1) -> var0.field44591 = var0.field44591.opposite(), (var0, var1) -> var1.method17955(var0.field44591.method8921())
   );
   public static final IteratableOption field25346 = new IteratableOption(
      "options.narrator",
      (var0, var1) -> {
         if (!NarratorChatListener.INSTANCE.method20405()) {
            var0.narrator = NarratorStatus.field11267;
         } else {
            var0.narrator = NarratorStatus.method8191(var0.narrator.method8189() + var1);
         }

         NarratorChatListener.INSTANCE.method20404(var0.narrator);
      },
      (var0, var1) -> !NarratorChatListener.INSTANCE.method20405()
            ? var1.method17955(new TranslationTextComponent("options.narrator.notavailable"))
            : var1.method17955(var0.narrator.method8190())
   );
   public static final IteratableOption field25347 = new IteratableOption(
      "options.particles",
      (var0, var1) -> var0.particles = ParticleStatus.method9053(var0.particles.method9052() + var1),
      (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.particles.method9051()))
   );
   public static final IteratableOption field25348 = new IteratableOption("options.renderClouds", (var0, var1) -> {
      var0.cloudOption = CloudOption.method8175(var0.cloudOption.method8173() + var1);
      if (Minecraft.isFabulousGraphicsEnabled()) {
         Framebuffer var4 = Minecraft.getInstance().worldRenderer.method951();
         if (var4 != null) {
            var4.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
         }
      }
   }, (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.cloudOption.method8174())));
   public static final IteratableOption field25349 = new IteratableOption(
      "options.accessibility.text_background",
      (var0, var1) -> var0.field44624 = !var0.field44624,
      (var0, var1) -> var1.method17955(
            new TranslationTextComponent(!var0.field44624 ? "options.accessibility.text_background.everywhere" : "options.accessibility.text_background.chat")
         )
   );
   private static final ITextComponent field25350 = new TranslationTextComponent("options.hideMatchedNames.tooltip");
   public static final Class5806 field25351 = new Class5806("options.autoJump", var0 -> var0.field44610, (var0, var1) -> var0.field44610 = var1);
   public static final Class5806 field25352 = new Class5806("options.autoSuggestCommands", var0 -> var0.field44611, (var0, var1) -> var0.field44611 = var1);
   public static final Class5806 field25353 = new Class5806(
      "options.hideMatchedNames", field25350, var0 -> var0.field44631, (var0, var1) -> var0.field44631 = var1
   );
   public static final Class5806 field25354 = new Class5806("options.chat.color", var0 -> var0.field44612, (var0, var1) -> var0.field44612 = var1);
   public static final Class5806 field25355 = new Class5806("options.chat.links", var0 -> var0.field44613, (var0, var1) -> var0.field44613 = var1);
   public static final Class5806 field25356 = new Class5806("options.chat.links.prompt", var0 -> var0.field44614, (var0, var1) -> var0.field44614 = var1);
   public static final Class5806 field25357 = new Class5806("options.discrete_mouse_scroll", var0 -> var0.field44619, (var0, var1) -> var0.field44619 = var1);
   public static final Class5806 field25358 = new Class5806("options.vsync", var0 -> var0.vsync, (var0, var1) -> {
      var0.vsync = var1;
      if (Minecraft.getInstance().getMainWindow() != null) {
         Minecraft.getInstance().getMainWindow().setVsync(var0.vsync);
      }
   });
   public static final Class5806 field25359 = new Class5806("options.entityShadows", var0 -> var0.entityShadows, (var0, var1) -> var0.entityShadows = var1);
   public static final Class5806 field25360 = new Class5806("options.forceUnicodeFont", var0 -> var0.forceUnicodeFont, (var0, var1) -> {
      var0.forceUnicodeFont = var1;
      Minecraft var4 = Minecraft.getInstance();
      if (var4.getMainWindow() != null) {
         var4.forceUnicodeFont(var1);
      }
   });
   public static final Class5806 field25361 = new Class5806("options.invertMouse", var0 -> var0.field44618, (var0, var1) -> var0.field44618 = var1);
   public static final Class5806 REALMS_NOTIFICATIONS = new Class5806("options.realmsNotifications", var0 -> var0.field44620, (var0, var1) -> var0.field44620 = var1);
   public static final Class5806 field25363 = new Class5806("options.reducedDebugInfo", var0 -> var0.reducedDebugInfo, (var0, var1) -> var0.reducedDebugInfo = var1);
   public static final Class5806 field25364 = new Class5806("options.showSubtitles", var0 -> var0.showSubtitles, (var0, var1) -> var0.showSubtitles = var1);
   public static final Class5806 field25365 = new Class5806("options.snooper", var0 -> {
      if (!var0.field44622) {
      }

      return false;
   }, (var0, var1) -> var0.field44622 = var1);
   public static final IteratableOption field25366 = new IteratableOption(
      "key.sneak",
      (var0, var1) -> var0.field44628 = !var0.field44628,
      (var0, var1) -> var1.method17955(new TranslationTextComponent(!var0.field44628 ? "options.key.hold" : "options.key.toggle"))
   );
   public static final IteratableOption field25367 = new IteratableOption(
      "key.sprint",
      (var0, var1) -> var0.field44629 = !var0.field44629,
      (var0, var1) -> var1.method17955(new TranslationTextComponent(!var0.field44629 ? "options.key.hold" : "options.key.toggle"))
   );
   public static final Class5806 field25368 = new Class5806("options.touchscreen", var0 -> var0.touchscreen, (var0, var1) -> var0.touchscreen = var1);
   public static final Class5806 field25369 = new Class5806("options.fullscreen", var0 -> var0.fullscreen, (var0, var1) -> {
      var0.fullscreen = var1;
      Minecraft var4 = Minecraft.getInstance();
      if (var4.getMainWindow() != null && var4.getMainWindow().isFullscreen() != var0.fullscreen) {
         var4.getMainWindow().toggleFullscreen();
         var0.fullscreen = var4.getMainWindow().isFullscreen();
      }
   });
   public static final Class5806 field25370 = new Class5806("options.viewBobbing", var0 -> var0.viewBobbing, (var0, var1) -> var0.viewBobbing = var1);
   private final ITextComponent field25371;
   private Optional<List<Class9125>> field25372 = Optional.<List<Class9125>>empty();
   private final String field25373;
   public static final IteratableOption field25374 = new IteratableOptionOF("of.options.FOG_FANCY");
   public static final IteratableOption field25375 = new IteratableOptionOF("of.options.FOG_START");
   public static final SliderPercentageOption field25376 = new Class5809("of.options.MIPMAP_TYPE", 0.0, 3.0, 1.0F);
   public static final IteratableOption field25377 = new IteratableOptionOF("of.options.SMOOTH_FPS");
   public static final IteratableOption field25378 = new IteratableOptionOF("of.options.CLOUDS");
   public static final SliderPercentageOption field25379 = new Class5809("of.options.CLOUD_HEIGHT");
   public static final IteratableOption field25380 = new IteratableOptionOF("of.options.TREES");
   public static final IteratableOption field25381 = new IteratableOptionOF("of.options.RAIN");
   public static final IteratableOption field25382 = new IteratableOptionOF("of.options.ANIMATED_WATER");
   public static final IteratableOption field25383 = new IteratableOptionOF("of.options.ANIMATED_LAVA");
   public static final IteratableOption field25384 = new IteratableOptionOF("of.options.ANIMATED_FIRE");
   public static final IteratableOption field25385 = new IteratableOptionOF("of.options.ANIMATED_PORTAL");
   public static final SliderPercentageOption field25386 = new Class5809("of.options.AO_LEVEL");
   public static final IteratableOption field25387 = new IteratableOptionOF("of.options.LAGOMETER");
   public static final IteratableOption field25388 = new IteratableOptionOF("of.options.SHOW_FPS");
   public static final IteratableOption field25389 = new IteratableOptionOF("of.options.AUTOSAVE_TICKS");
   public static final IteratableOption field25390 = new IteratableOptionOF("of.options.BETTER_GRASS");
   public static final IteratableOption field25391 = new IteratableOptionOF("of.options.ANIMATED_REDSTONE");
   public static final IteratableOption field25392 = new IteratableOptionOF("of.options.ANIMATED_EXPLOSION");
   public static final IteratableOption field25393 = new IteratableOptionOF("of.options.ANIMATED_FLAME");
   public static final IteratableOption field25394 = new IteratableOptionOF("of.options.ANIMATED_SMOKE");
   public static final IteratableOption field25395 = new IteratableOptionOF("of.options.WEATHER");
   public static final IteratableOption field25396 = new IteratableOptionOF("of.options.SKY");
   public static final IteratableOption field25397 = new IteratableOptionOF("of.options.STARS");
   public static final IteratableOption field25398 = new IteratableOptionOF("of.options.SUN_MOON");
   public static final IteratableOption field25399 = new IteratableOptionOF("of.options.VIGNETTE");
   public static final IteratableOption field25400 = new IteratableOptionOF("of.options.CHUNK_UPDATES");
   public static final IteratableOption field25401 = new IteratableOptionOF("of.options.CHUNK_UPDATES_DYNAMIC");
   public static final IteratableOption field25402 = new IteratableOptionOF("of.options.TIME");
   public static final IteratableOption field25403 = new IteratableOptionOF("of.options.SMOOTH_WORLD");
   public static final IteratableOption field25404 = new IteratableOptionOF("of.options.VOID_PARTICLES");
   public static final IteratableOption field25405 = new IteratableOptionOF("of.options.WATER_PARTICLES");
   public static final IteratableOption field25406 = new IteratableOptionOF("of.options.RAIN_SPLASH");
   public static final IteratableOption field25407 = new IteratableOptionOF("of.options.PORTAL_PARTICLES");
   public static final IteratableOption field25408 = new IteratableOptionOF("of.options.POTION_PARTICLES");
   public static final IteratableOption field25409 = new IteratableOptionOF("of.options.FIREWORK_PARTICLES");
   public static final IteratableOption field25410 = new IteratableOptionOF("of.options.PROFILER");
   public static final IteratableOption field25411 = new IteratableOptionOF("of.options.DRIPPING_WATER_LAVA");
   public static final IteratableOption field25412 = new IteratableOptionOF("of.options.BETTER_SNOW");
   public static final IteratableOption field25413 = new IteratableOptionOF("of.options.ANIMATED_TERRAIN");
   public static final IteratableOption field25414 = new IteratableOptionOF("of.options.SWAMP_COLORS");
   public static final IteratableOption field25415 = new IteratableOptionOF("of.options.RANDOM_ENTITIES");
   public static final IteratableOption field25416 = new IteratableOptionOF("of.options.SMOOTH_BIOMES");
   public static final IteratableOption field25417 = new IteratableOptionOF("of.options.CUSTOM_FONTS");
   public static final IteratableOption field25418 = new IteratableOptionOF("of.options.CUSTOM_COLORS");
   public static final IteratableOption field25419 = new IteratableOptionOF("of.options.SHOW_CAPES");
   public static final IteratableOption field25420 = new IteratableOptionOF("of.options.CONNECTED_TEXTURES");
   public static final IteratableOption field25421 = new IteratableOptionOF("of.options.CUSTOM_ITEMS");
   public static final SliderPercentageOption field25422 = new Class5809("of.options.AA_LEVEL", 0.0, 16.0, 1.0F);
   public static final SliderPercentageOption field25423 = new Class5809("of.options.AF_LEVEL", 1.0, 16.0, 1.0F);
   public static final IteratableOption field25424 = new IteratableOptionOF("of.options.ANIMATED_TEXTURES");
   public static final IteratableOption field25425 = new IteratableOptionOF("of.options.NATURAL_TEXTURES");
   public static final IteratableOption field25426 = new IteratableOptionOF("of.options.EMISSIVE_TEXTURES");
   public static final IteratableOption field25427 = new IteratableOptionOF("of.options.HELD_ITEM_TOOLTIPS");
   public static final IteratableOption field25428 = new IteratableOptionOF("of.options.DROPPED_ITEMS");
   public static final IteratableOption LAZY_CHUNK_LOADING = new IteratableOptionOF("of.options.LAZY_CHUNK_LOADING");
   public static final IteratableOption field25430 = new IteratableOptionOF("of.options.CUSTOM_SKY");
   public static final IteratableOption field25431 = new IteratableOptionOF("of.options.FAST_MATH");
   public static final IteratableOption field25432 = new IteratableOptionOF("of.options.FAST_RENDER");
   public static final IteratableOption field25433 = new IteratableOptionOF("of.options.TRANSLUCENT_BLOCKS");
   public static final IteratableOption field25434 = new IteratableOptionOF("of.options.DYNAMIC_FOV");
   public static final IteratableOption field25435 = new IteratableOptionOF("of.options.DYNAMIC_LIGHTS");
   public static final IteratableOption field25436 = new IteratableOptionOF("of.options.ALTERNATE_BLOCKS");
   public static final IteratableOption field25437 = new IteratableOptionOF("of.options.CUSTOM_ENTITY_MODELS");
   public static final IteratableOption field25438 = new IteratableOptionOF("of.options.ADVANCED_TOOLTIPS");
   public static final IteratableOption field25439 = new IteratableOptionOF("of.options.SCREENSHOT_SIZE");
   public static final IteratableOption field25440 = new IteratableOptionOF("of.options.CUSTOM_GUIS");
   public static final IteratableOption field25441 = new IteratableOptionOF("of.options.RENDER_REGIONS");
   public static final IteratableOption field25442 = new IteratableOptionOF("of.options.SHOW_GL_ERRORS");
   public static final IteratableOption field25443 = new IteratableOptionOF("of.options.SMART_ANIMATIONS");
   public static final IteratableOption field25444 = new IteratableOptionOF("of.options.CHAT_BACKGROUND");
   public static final IteratableOption field25445 = new IteratableOptionOF("of.options.CHAT_SHADOW");

   public AbstractOption(String var1) {
      this.field25371 = new TranslationTextComponent(var1);
      this.field25373 = var1;
   }

   public abstract Widget createWidget(GameSettings var1, int var2, int var3, int var4);

   public ITextComponent method17949() {
      return this.field25371;
   }

   public void setOptionValues(List<Class9125> var1) {
      this.field25372 = Optional.<List<Class9125>>of(var1);
   }

   public Optional<List<Class9125>> method17951() {
      return this.field25372;
   }

   public ITextComponent method17952(int var1) {
      return new TranslationTextComponent("options.pixel_value", this.method17949(), var1);
   }

   public ITextComponent method17953(double var1) {
      return new TranslationTextComponent("options.percent_value", this.method17949(), (int)(var1 * 100.0));
   }

   public ITextComponent method17954(int var1) {
      return new TranslationTextComponent("options.percent_add_value", this.method17949(), var1);
   }

   public ITextComponent method17955(ITextComponent var1) {
      return new TranslationTextComponent("options.generic_value", this.method17949(), var1);
   }

   public ITextComponent method17956(int var1) {
      return this.method17955(new StringTextComponent(Integer.toString(var1)));
   }

   public String method17957() {
      return this.field25373;
   }
}
