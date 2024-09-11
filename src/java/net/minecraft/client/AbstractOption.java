package net.minecraft.client;

import java.util.List;
import java.util.Optional;

import mapped.*;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class AbstractOption {
   public static final Class5807 field25315 = new Class5807("options.biomeBlendRadius", 0.0, 7.0, 1.0F, var0 -> (double)var0.biomeBlendRadius, (var0, var1) -> {
      var0.biomeBlendRadius = MathHelper.method37775((int)var1.doubleValue(), 0, 7);
      Minecraft.getInstance().worldRenderer.loadRenderers();
   }, (var0, var1) -> {
      double var4 = var1.getValue(var0);
      int var6 = (int)var4 * 2 + 1;
      return var1.method17955(new TranslationTextComponent("options.biomeBlendRadius." + var6));
   });
   public static final Class5807 field25316 = new Class5807("options.chat.height.focused", 0.0, 1.0, 0.0F, var0 -> var0.field44598, (var0, var1) -> {
      var0.field44598 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.method18083(var1.getValue(var0));
      return var1.method17952(Class1266.method5946(var4));
   });
   public static final Class5807 field25317 = new Class5807("options.chat.height.unfocused", 0.0, 1.0, 0.0F, var0 -> var0.field44597, (var0, var1) -> {
      var0.field44597 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.method18083(var1.getValue(var0));
      return var1.method17952(Class1266.method5946(var4));
   });
   public static final Class5807 field25318 = new Class5807("options.chat.opacity", 0.0, 1.0, 0.0F, var0 -> var0.field44583, (var0, var1) -> {
      var0.field44583 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.method18083(var1.getValue(var0));
      return var1.method17953(var4 * 0.9 + 0.1);
   });
   public static final Class5807 field25319 = new Class5807("options.chat.scale", 0.0, 1.0, 0.0F, var0 -> var0.field44595, (var0, var1) -> {
      var0.field44595 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.method18083(var1.getValue(var0));
      return (ITextComponent)(var4 != 0.0 ? var1.method17953(var4) : DialogTexts.method22238(var1.method17949(), false));
   });
   public static final Class5807 field25320 = new Class5807("options.chat.width", 0.0, 1.0, 0.0F, var0 -> var0.field44596 / 4.0571431, (var0, var1) -> {
      var1 = var1 * 4.0571431;
      var0.field44596 = var1;
      Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
   }, (var0, var1) -> {
      double var4 = var1.method18083(var1.getValue(var0));
      return var1.method17952(Class1266.method5945(var4 * 4.0571431));
   });
   public static final Class5807 field25321 = new Class5807(
      "options.chat.line_spacing",
      0.0,
      1.0,
      0.0F,
      var0 -> var0.field44584,
      (var0, var1) -> var0.field44584 = var1,
      (var0, var1) -> var1.method17953(var1.method18083(var1.getValue(var0)))
   );
   public static final Class5807 field25322 = new Class5807(
      "options.chat.delay_instant",
      0.0,
      6.0,
      0.1F,
      var0 -> var0.field44599,
      (var0, var1) -> var0.field44599 = var1,
      (var0, var1) -> {
         double var4 = var1.getValue(var0);
         return !(var4 <= 0.0)
            ? new TranslationTextComponent("options.chat.delay", String.format("%.1f", var4))
            : new TranslationTextComponent("options.chat.delay_none");
      }
   );
   public static final Class5807 FOV = new Class5807(
      "options.fov", 30.0, 110.0, 1.0F, var0 -> var0.field44669, (var0, var1) -> var0.field44669 = var1, (var0, var1) -> {
         double var4 = var1.getValue(var0);
         if (var4 != 70.0) {
            return var4 != var1.getMaxValue() ? var1.method17956((int)var4) : var1.method17955(new TranslationTextComponent("options.fov.max"));
         } else {
            return var1.method17955(new TranslationTextComponent("options.fov.min"));
         }
      }
   );
   private static final ITextComponent field25324 = new TranslationTextComponent("options.fovEffectScale.tooltip");
   public static final Class5807 field25325 = new Class5807(
      "options.fovEffectScale",
      0.0,
      1.0,
      0.0F,
      var0 -> Math.pow((double)var0.field44671, 2.0),
      (var0, var1) -> var0.field44671 = MathHelper.sqrt(var1),
      (var0, var1) -> {
         var1.method17950(Minecraft.getInstance().fontRenderer.method38828(field25324, 200));
         double var4 = var1.method18083(var1.getValue(var0));
         return var4 != 0.0 ? var1.method17953(var4) : var1.method17955(new TranslationTextComponent("options.fovEffectScale.off"));
      }
   );
   private static final ITextComponent field25326 = new TranslationTextComponent("options.screenEffectScale.tooltip");
   public static final Class5807 field25327 = new Class5807(
      "options.screenEffectScale", 0.0, 1.0, 0.0F, var0 -> (double)var0.field44670, (var0, var1) -> var0.field44670 = var1.floatValue(), (var0, var1) -> {
         var1.method17950(Minecraft.getInstance().fontRenderer.method38828(field25326, 200));
         double var4 = var1.method18083(var1.getValue(var0));
         return var4 != 0.0 ? var1.method17953(var4) : var1.method17955(new TranslationTextComponent("options.screenEffectScale.off"));
      }
   );
   public static final Class5807 FRAMERATE_LIMIT = new Class5807(
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
            double var4 = var1.getValue(var0);
            return var4 != var1.getMaxValue()
               ? var1.method17955(new TranslationTextComponent("options.framerate", (int)var4))
               : var1.method17955(new TranslationTextComponent("options.framerateLimit.max"));
         } else {
            return var1.method17955(new TranslationTextComponent("of.options.framerateLimit.vsync"));
         }
      }
   );
   public static final Class5807 field25329 = new Class5807(
      "options.gamma", 0.0, 1.0, 0.0F, var0 -> var0.gamma, (var0, var1) -> var0.gamma = var1, (var0, var1) -> {
         double var4 = var1.method18083(var1.getValue(var0));
         if (var4 != 0.0) {
            return var4 != 1.0 ? var1.method17954((int)(var4 * 100.0)) : var1.method17955(new TranslationTextComponent("options.gamma.max"));
         } else {
            return var1.method17955(new TranslationTextComponent("options.gamma.min"));
         }
      }
   );
   public static final Class5807 field25330 = new Class5807("options.mipmapLevels", 0.0, 4.0, 1.0F, var0 -> (double)var0.field44600, (var0, var1) -> {
      var0.field44600 = (int)var1.doubleValue();
      var0.method37165();
   }, (var0, var1) -> {
      double var4 = var1.getValue(var0);
      if (!(var4 >= 4.0)) {
         return (ITextComponent)(var4 != 0.0 ? var1.method17956((int)var4) : DialogTexts.method22238(var1.method17949(), false));
      } else {
         return var1.method17955(new TranslationTextComponent("of.general.max"));
      }
   });
   public static final Class5807 field25331 = new Class5808(
      "options.mouseWheelSensitivity", 0.01, 10.0, 0.01F, var0 -> var0.field44607, (var0, var1) -> var0.field44607 = var1, (var0, var1) -> {
         double var4 = var1.method18083(var1.getValue(var0));
         return var1.method17955(new StringTextComponent(String.format("%.2f", var1.method18084(var4))));
      }
   );
   public static final Class5806 field25332 = new Class5806("options.rawMouseInput", var0 -> var0.rawMouseInput, (var0, var1) -> {
      var0.rawMouseInput = var1;
      MainWindow var4 = Minecraft.getInstance().getMainWindow();
      if (var4 != null) {
         var4.setRawMouseInput(var1);
      }
   });
   public static final Class5807 field25333 = new Class5807("options.renderDistance", 2.0, 16.0, 1.0F, var0 -> (double)var0.field44574, (var0, var1) -> {
      var0.field44574 = (int)var1.doubleValue();
      Minecraft.getInstance().worldRenderer.setDisplayListEntitiesDirty();
   }, (var0, var1) -> {
      double var4 = var1.getValue(var0);
      return var1.method17955(new TranslationTextComponent("options.chunks", (int)var4));
   });
   public static final Class5807 field25334 = new Class5807(
      "options.entityDistanceScaling",
      0.5,
      5.0,
      0.25F,
      var0 -> (double)var0.field44575,
      (var0, var1) -> var0.field44575 = (float)var1.doubleValue(),
      (var0, var1) -> {
         double var4 = var1.getValue(var0);
         return var1.method17953(var4);
      }
   );
   public static final Class5807 field25335 = new Class5807(
      "options.sensitivity", 0.0, 1.0, 0.0F, var0 -> var0.field44573, (var0, var1) -> var0.field44573 = var1, (var0, var1) -> {
         double var4 = var1.method18083(var1.getValue(var0));
         if (var4 != 0.0) {
            return var4 != 1.0 ? var1.method17953(2.0 * var4) : var1.method17955(new TranslationTextComponent("options.sensitivity.max"));
         } else {
            return var1.method17955(new TranslationTextComponent("options.sensitivity.min"));
         }
      }
   );
   public static final Class5807 field25336 = new Class5807(
      "options.accessibility.text_background_opacity", 0.0, 1.0, 0.0F, var0 -> var0.field44585, (var0, var1) -> {
         var0.field44585 = var1;
         Minecraft.getInstance().ingameGUI.getChatGUI().method5933();
      }, (var0, var1) -> var1.method17953(var1.method18083(var1.getValue(var0)))
   );
   public static final Class5804 field25337 = new Class5804("options.ao", (var0, var1) -> {
      var0.ambientOcclusionStatus = AmbientOcclusionStatus.method9117(var0.ambientOcclusionStatus.method9115() + var1);
      Minecraft.getInstance().worldRenderer.loadRenderers();
   }, (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.ambientOcclusionStatus.method9116())));
   public static final Class5804 field25338 = new Class5804(
      "options.attackIndicator",
      (var0, var1) -> var0.field44603 = Class2207.method8924(var0.field44603.method8922() + var1),
      (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.field44603.method8923()))
   );
   public static final Class5804 field25339 = new Class5804(
      "options.chat.visibility",
      (var0, var1) -> var0.chatVisibility = ChatVisibility.getValue((var0.chatVisibility.getId() + var1) % 3),
      (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.chatVisibility.getResourceKey()))
   );
   private static final ITextComponent field25340 = new TranslationTextComponent("options.graphics.fast.tooltip");
   private static final ITextComponent field25341 = new TranslationTextComponent(
      "options.graphics.fabulous.tooltip", new TranslationTextComponent("options.graphics.fabulous").mergeStyle(TextFormatting.ITALIC)
   );
   private static final ITextComponent field25342 = new TranslationTextComponent("options.graphics.fancy.tooltip");
   public static final Class5804 field25343 = new Class5804("options.graphics", (var0, var1) -> {
      Minecraft var4 = Minecraft.getInstance();
      GPUWarning var5 = var4.getGPUWarning();
      if (var0.graphicFanciness == GraphicsFanciness.FANCY && var5.method975()) {
         var5.method976();
      } else {
         var0.graphicFanciness = var0.graphicFanciness.method8745();
         if (var0.graphicFanciness == GraphicsFanciness.FABULOUS && (Class7944.method26921() || !GlStateManager.method23862() || var5.method980())) {
            var0.graphicFanciness = GraphicsFanciness.field13603;
         }

         var0.method37162();
         var4.worldRenderer.loadRenderers();
      }
   }, (var0, var1) -> {
      switch (Class9496.field44201[var0.graphicFanciness.ordinal()]) {
         case 1:
            var1.method17950(Minecraft.getInstance().fontRenderer.method38828(field25340, 200));
            break;
         case 2:
            var1.method17950(Minecraft.getInstance().fontRenderer.method38828(field25342, 200));
            break;
         case 3:
            var1.method17950(Minecraft.getInstance().fontRenderer.method38828(field25341, 200));
      }

      TranslationTextComponent var4 = new TranslationTextComponent(var0.graphicFanciness.method8744());
      return var0.graphicFanciness == GraphicsFanciness.FABULOUS ? var1.method17955(var4.mergeStyle(TextFormatting.ITALIC)) : var1.method17955(var4);
   });
   public static final Class5804 field25344 = new Class5804(
      "options.guiScale",
      (var0, var1) -> var0.guiScale = MathHelper.normalizeAngle(
            var0.guiScale + var1, Minecraft.getInstance().getMainWindow().calcGuiScale(0, Minecraft.getInstance().getForceUnicodeFont()) + 1
         ),
      (var0, var1) -> var0.guiScale != 0 ? var1.method17956(var0.guiScale) : var1.method17955(new TranslationTextComponent("options.guiScale.auto"))
   );
   public static final Class5804 field25345 = new Class5804(
      "options.mainHand", (var0, var1) -> var0.field44591 = var0.field44591.method8920(), (var0, var1) -> var1.method17955(var0.field44591.method8921())
   );
   public static final Class5804 field25346 = new Class5804(
      "options.narrator",
      (var0, var1) -> {
         if (!NarratorChatListener.INSTANCE.method20405()) {
            var0.field44675 = Class1911.field11267;
         } else {
            var0.field44675 = Class1911.method8191(var0.field44675.method8189() + var1);
         }

         NarratorChatListener.INSTANCE.method20404(var0.field44675);
      },
      (var0, var1) -> !NarratorChatListener.INSTANCE.method20405()
            ? var1.method17955(new TranslationTextComponent("options.narrator.notavailable"))
            : var1.method17955(var0.field44675.method8190())
   );
   public static final Class5804 field25347 = new Class5804(
      "options.particles",
      (var0, var1) -> var0.field44674 = Class2294.method9053(var0.field44674.method9052() + var1),
      (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.field44674.method9051()))
   );
   public static final Class5804 field25348 = new Class5804("options.renderClouds", (var0, var1) -> {
      var0.cloudOption = CloudOption.method8175(var0.cloudOption.method8173() + var1);
      if (Minecraft.isFabulousGraphicsEnabled()) {
         Framebuffer var4 = Minecraft.getInstance().worldRenderer.method951();
         if (var4 != null) {
            var4.method29119(Minecraft.IS_RUNNING_ON_MAC);
         }
      }
   }, (var0, var1) -> var1.method17955(new TranslationTextComponent(var0.cloudOption.method8174())));
   public static final Class5804 field25349 = new Class5804(
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
   public static final Class5806 field25359 = new Class5806("options.entityShadows", var0 -> var0.field44616, (var0, var1) -> var0.field44616 = var1);
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
   public static final Class5804 field25366 = new Class5804(
      "key.sneak",
      (var0, var1) -> var0.field44628 = !var0.field44628,
      (var0, var1) -> var1.method17955(new TranslationTextComponent(!var0.field44628 ? "options.key.hold" : "options.key.toggle"))
   );
   public static final Class5804 field25367 = new Class5804(
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
   public static final Class5806 field25370 = new Class5806("options.viewBobbing", var0 -> var0.field44627, (var0, var1) -> var0.field44627 = var1);
   private final ITextComponent field25371;
   private Optional<List<Class9125>> field25372 = Optional.<List<Class9125>>empty();
   private final String field25373;
   public static final Class5804 field25374 = new Class5803("of.options.FOG_FANCY");
   public static final Class5804 field25375 = new Class5803("of.options.FOG_START");
   public static final Class5807 field25376 = new Class5809("of.options.MIPMAP_TYPE", 0.0, 3.0, 1.0F);
   public static final Class5804 field25377 = new Class5803("of.options.SMOOTH_FPS");
   public static final Class5804 field25378 = new Class5803("of.options.CLOUDS");
   public static final Class5807 field25379 = new Class5809("of.options.CLOUD_HEIGHT");
   public static final Class5804 field25380 = new Class5803("of.options.TREES");
   public static final Class5804 field25381 = new Class5803("of.options.RAIN");
   public static final Class5804 field25382 = new Class5803("of.options.ANIMATED_WATER");
   public static final Class5804 field25383 = new Class5803("of.options.ANIMATED_LAVA");
   public static final Class5804 field25384 = new Class5803("of.options.ANIMATED_FIRE");
   public static final Class5804 field25385 = new Class5803("of.options.ANIMATED_PORTAL");
   public static final Class5807 field25386 = new Class5809("of.options.AO_LEVEL");
   public static final Class5804 field25387 = new Class5803("of.options.LAGOMETER");
   public static final Class5804 field25388 = new Class5803("of.options.SHOW_FPS");
   public static final Class5804 field25389 = new Class5803("of.options.AUTOSAVE_TICKS");
   public static final Class5804 field25390 = new Class5803("of.options.BETTER_GRASS");
   public static final Class5804 field25391 = new Class5803("of.options.ANIMATED_REDSTONE");
   public static final Class5804 field25392 = new Class5803("of.options.ANIMATED_EXPLOSION");
   public static final Class5804 field25393 = new Class5803("of.options.ANIMATED_FLAME");
   public static final Class5804 field25394 = new Class5803("of.options.ANIMATED_SMOKE");
   public static final Class5804 field25395 = new Class5803("of.options.WEATHER");
   public static final Class5804 field25396 = new Class5803("of.options.SKY");
   public static final Class5804 field25397 = new Class5803("of.options.STARS");
   public static final Class5804 field25398 = new Class5803("of.options.SUN_MOON");
   public static final Class5804 field25399 = new Class5803("of.options.VIGNETTE");
   public static final Class5804 field25400 = new Class5803("of.options.CHUNK_UPDATES");
   public static final Class5804 field25401 = new Class5803("of.options.CHUNK_UPDATES_DYNAMIC");
   public static final Class5804 field25402 = new Class5803("of.options.TIME");
   public static final Class5804 field25403 = new Class5803("of.options.SMOOTH_WORLD");
   public static final Class5804 field25404 = new Class5803("of.options.VOID_PARTICLES");
   public static final Class5804 field25405 = new Class5803("of.options.WATER_PARTICLES");
   public static final Class5804 field25406 = new Class5803("of.options.RAIN_SPLASH");
   public static final Class5804 field25407 = new Class5803("of.options.PORTAL_PARTICLES");
   public static final Class5804 field25408 = new Class5803("of.options.POTION_PARTICLES");
   public static final Class5804 field25409 = new Class5803("of.options.FIREWORK_PARTICLES");
   public static final Class5804 field25410 = new Class5803("of.options.PROFILER");
   public static final Class5804 field25411 = new Class5803("of.options.DRIPPING_WATER_LAVA");
   public static final Class5804 field25412 = new Class5803("of.options.BETTER_SNOW");
   public static final Class5804 field25413 = new Class5803("of.options.ANIMATED_TERRAIN");
   public static final Class5804 field25414 = new Class5803("of.options.SWAMP_COLORS");
   public static final Class5804 field25415 = new Class5803("of.options.RANDOM_ENTITIES");
   public static final Class5804 field25416 = new Class5803("of.options.SMOOTH_BIOMES");
   public static final Class5804 field25417 = new Class5803("of.options.CUSTOM_FONTS");
   public static final Class5804 field25418 = new Class5803("of.options.CUSTOM_COLORS");
   public static final Class5804 field25419 = new Class5803("of.options.SHOW_CAPES");
   public static final Class5804 field25420 = new Class5803("of.options.CONNECTED_TEXTURES");
   public static final Class5804 field25421 = new Class5803("of.options.CUSTOM_ITEMS");
   public static final Class5807 field25422 = new Class5809("of.options.AA_LEVEL", 0.0, 16.0, 1.0F);
   public static final Class5807 field25423 = new Class5809("of.options.AF_LEVEL", 1.0, 16.0, 1.0F);
   public static final Class5804 field25424 = new Class5803("of.options.ANIMATED_TEXTURES");
   public static final Class5804 field25425 = new Class5803("of.options.NATURAL_TEXTURES");
   public static final Class5804 field25426 = new Class5803("of.options.EMISSIVE_TEXTURES");
   public static final Class5804 field25427 = new Class5803("of.options.HELD_ITEM_TOOLTIPS");
   public static final Class5804 field25428 = new Class5803("of.options.DROPPED_ITEMS");
   public static final Class5804 field25429 = new Class5803("of.options.LAZY_CHUNK_LOADING");
   public static final Class5804 field25430 = new Class5803("of.options.CUSTOM_SKY");
   public static final Class5804 field25431 = new Class5803("of.options.FAST_MATH");
   public static final Class5804 field25432 = new Class5803("of.options.FAST_RENDER");
   public static final Class5804 field25433 = new Class5803("of.options.TRANSLUCENT_BLOCKS");
   public static final Class5804 field25434 = new Class5803("of.options.DYNAMIC_FOV");
   public static final Class5804 field25435 = new Class5803("of.options.DYNAMIC_LIGHTS");
   public static final Class5804 field25436 = new Class5803("of.options.ALTERNATE_BLOCKS");
   public static final Class5804 field25437 = new Class5803("of.options.CUSTOM_ENTITY_MODELS");
   public static final Class5804 field25438 = new Class5803("of.options.ADVANCED_TOOLTIPS");
   public static final Class5804 field25439 = new Class5803("of.options.SCREENSHOT_SIZE");
   public static final Class5804 field25440 = new Class5803("of.options.CUSTOM_GUIS");
   public static final Class5804 field25441 = new Class5803("of.options.RENDER_REGIONS");
   public static final Class5804 field25442 = new Class5803("of.options.SHOW_GL_ERRORS");
   public static final Class5804 field25443 = new Class5803("of.options.SMART_ANIMATIONS");
   public static final Class5804 field25444 = new Class5803("of.options.CHAT_BACKGROUND");
   public static final Class5804 field25445 = new Class5803("of.options.CHAT_SHADOW");

   public AbstractOption(String var1) {
      this.field25371 = new TranslationTextComponent(var1);
      this.field25373 = var1;
   }

   public abstract Widget createWidget(GameSettings var1, int var2, int var3, int var4);

   public ITextComponent method17949() {
      return this.field25371;
   }

   public void method17950(List<Class9125> var1) {
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
