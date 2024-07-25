package remapped;

import java.util.List;
import java.util.Optional;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_1013 {
   public static final class_8369 field_5305 = new class_8369("options.biomeBlendRadius", 0.0, 7.0, 1.0F, var0 -> (double)var0.field_45526, (var0, var1) -> {
      var0.field_45526 = class_9299.method_42829((int)var1.doubleValue(), 0, 7);
      MinecraftClient.getInstance().worldRenderer.method_19998();
   }, (var0, var1) -> {
      double var4 = var1.method_38570(var0);
      int var6 = (int)var4 * 2 + 1;
      return var1.method_4492(new TranslationTextComponent("options.biomeBlendRadius." + var6));
   });
   public static final class_8369 field_5266 = new class_8369("options.chat.height.focused", 0.0, 1.0, 0.0F, var0 -> var0.field_45480, (var0, var1) -> {
      var0.field_45480 = var1;
      MinecraftClient.getInstance().field_9614.method_13991().method_18693();
   }, (var0, var1) -> {
      double var4 = var1.method_38566(var1.method_38570(var0));
      return var1.method_4489(NewChatGui.method_18688(var4));
   });
   public static final class_8369 field_5222 = new class_8369("options.chat.height.unfocused", 0.0, 1.0, 0.0F, var0 -> var0.field_45488, (var0, var1) -> {
      var0.field_45488 = var1;
      MinecraftClient.getInstance().field_9614.method_13991().method_18693();
   }, (var0, var1) -> {
      double var4 = var1.method_38566(var1.method_38570(var0));
      return var1.method_4489(NewChatGui.method_18688(var4));
   });
   public static final class_8369 field_5203 = new class_8369("options.chat.opacity", 0.0, 1.0, 0.0F, var0 -> var0.field_45402, (var0, var1) -> {
      var0.field_45402 = var1;
      MinecraftClient.getInstance().field_9614.method_13991().method_18693();
   }, (var0, var1) -> {
      double var4 = var1.method_38566(var1.method_38570(var0));
      return var1.method_4490(var4 * 0.9 + 0.1);
   });
   public static final class_8369 field_5225 = new class_8369("options.chat.scale", 0.0, 1.0, 0.0F, var0 -> var0.field_45419, (var0, var1) -> {
      var0.field_45419 = var1;
      MinecraftClient.getInstance().field_9614.method_13991().method_18693();
   }, (var0, var1) -> {
      double var4 = var1.method_38566(var1.method_38570(var0));
      return (ITextComponent)(var4 != 0.0 ? var1.method_4490(var4) : class_1402.method_6480(var1.method_4483(), false));
   });
   public static final class_8369 field_5198 = new class_8369("options.chat.width", 0.0, 1.0, 0.0F, var0 -> var0.field_45388 / 4.0571431, (var0, var1) -> {
      var1 = var1 * 4.0571431;
      var0.field_45388 = var1;
      MinecraftClient.getInstance().field_9614.method_13991().method_18693();
   }, (var0, var1) -> {
      double var4 = var1.method_38566(var1.method_38570(var0));
      return var1.method_4489(NewChatGui.method_18686(var4 * 4.0571431));
   });
   public static final class_8369 field_5230 = new class_8369(
      "options.chat.line_spacing",
      0.0,
      1.0,
      0.0F,
      var0 -> var0.field_45465,
      (var0, var1) -> var0.field_45465 = var1,
      (var0, var1) -> var1.method_4490(var1.method_38566(var1.method_38570(var0)))
   );
   public static final class_8369 field_5232 = new class_8369(
      "options.chat.delay_instant",
      0.0,
      6.0,
      0.1F,
      var0 -> var0.field_45479,
      (var0, var1) -> var0.field_45479 = var1,
      (var0, var1) -> {
         double var4 = var1.method_38570(var0);
         return !(var4 <= 0.0)
            ? new TranslationTextComponent("options.chat.delay", String.format("%.1f", var4))
            : new TranslationTextComponent("options.chat.delay_none");
      }
   );
   public static final class_8369 field_5300 = new class_8369(
      "options.fov", 30.0, 110.0, 1.0F, var0 -> var0.field_45543, (var0, var1) -> var0.field_45543 = var1, (var0, var1) -> {
         double var4 = var1.method_38570(var0);
         if (var4 != 70.0) {
            return var4 != var1.method_38573() ? var1.method_4485((int)var4) : var1.method_4492(new TranslationTextComponent("options.fov.max"));
         } else {
            return var1.method_4492(new TranslationTextComponent("options.fov.min"));
         }
      }
   );
   private static final ITextComponent field_5262 = new TranslationTextComponent("options.fovEffectScale.tooltip");
   public static final class_8369 field_5224 = new class_8369(
      "options.fovEffectScale",
      0.0,
      1.0,
      0.0F,
      var0 -> Math.pow((double)var0.field_45386, 2.0),
      (var0, var1) -> var0.field_45386 = class_9299.method_42842(var1),
      (var0, var1) -> {
         var1.method_4487(MinecraftClient.getInstance().textRenderer.method_45391(field_5262, 200));
         double var4 = var1.method_38566(var1.method_38570(var0));
         return var4 != 0.0 ? var1.method_4490(var4) : var1.method_4492(new TranslationTextComponent("options.fovEffectScale.off"));
      }
   );
   private static final ITextComponent field_5268 = new TranslationTextComponent("options.screenEffectScale.tooltip");
   public static final class_8369 field_5259 = new class_8369(
      "options.screenEffectScale", 0.0, 1.0, 0.0F, var0 -> (double)var0.field_45469, (var0, var1) -> var0.field_45469 = var1.floatValue(), (var0, var1) -> {
         var1.method_4487(MinecraftClient.getInstance().textRenderer.method_45391(field_5268, 200));
         double var4 = var1.method_38566(var1.method_38570(var0));
         return var4 != 0.0 ? var1.method_4490(var4) : var1.method_4492(new TranslationTextComponent("options.screenEffectScale.off"));
      }
   );
   public static final class_8369 field_5277 = new class_8369(
      "options.framerateLimit",
      0.0,
      260.0,
      5.0F,
      var0 -> !var0.field_45502 ? (double)var0.field_45439 : field_5277.method_38569(),
      (var0, var1) -> {
         var0.field_45439 = (int)var1.doubleValue();
         var0.field_45502 = false;
         if (var0.field_45439 <= 0) {
            var0.field_45439 = (int)field_5277.method_38573();
            var0.field_45502 = true;
         }

         var0.method_40862();
         MinecraftClient.getInstance().getMainWindow().method_43194(var0.field_45439);
      },
      (var0, var1) -> {
         if (!var0.field_45502) {
            double var4 = var1.method_38570(var0);
            return var4 != var1.method_38573()
               ? var1.method_4492(new TranslationTextComponent("options.framerate", (int)var4))
               : var1.method_4492(new TranslationTextComponent("options.framerateLimit.max"));
         } else {
            return var1.method_4492(new TranslationTextComponent("of.options.framerateLimit.vsync"));
         }
      }
   );
   public static final class_8369 field_5192 = new class_8369(
      "options.gamma", 0.0, 1.0, 0.0F, var0 -> var0.brightnessGamma, (var0, var1) -> var0.brightnessGamma = var1, (var0, var1) -> {
         double var4 = var1.method_38566(var1.method_38570(var0));
         if (var4 != 0.0) {
            return var4 != 1.0 ? var1.method_4484((int)(var4 * 100.0)) : var1.method_4492(new TranslationTextComponent("options.gamma.max"));
         } else {
            return var1.method_4492(new TranslationTextComponent("options.gamma.min"));
         }
      }
   );
   public static final class_8369 field_5284 = new class_8369("options.mipmapLevels", 0.0, 4.0, 1.0F, var0 -> (double)var0.field_45577, (var0, var1) -> {
      var0.field_45577 = (int)var1.doubleValue();
      var0.method_40879();
   }, (var0, var1) -> {
      double var4 = var1.method_38570(var0);
      if (!(var4 >= 4.0)) {
         return (ITextComponent)(var4 != 0.0 ? var1.method_4485((int)var4) : class_1402.method_6480(var1.method_4483(), false));
      } else {
         return var1.method_4492(new TranslationTextComponent("of.general.max"));
      }
   });
   public static final class_8369 field_5271 = new class_1687(
      "options.mouseWheelSensitivity", 0.01, 10.0, 0.01F, var0 -> var0.field_45578, (var0, var1) -> var0.field_45578 = var1, (var0, var1) -> {
         double var4 = var1.method_38566(var1.method_38570(var0));
         return var1.method_4492(new StringTextComponent(String.format("%.2f", var1.method_38571(var4))));
      }
   );
   public static final class_4802 field_5299 = new class_4802("options.rawMouseInput", var0 -> var0.field_45409, (var0, var1) -> {
      var0.field_45409 = var1;
      Window var4 = MinecraftClient.getInstance().getMainWindow();
      if (var4 != null) {
         var4.method_43176(var1);
      }
   });
   public static final class_8369 field_5250 = new class_8369("options.renderDistance", 2.0, 16.0, 1.0F, var0 -> (double)var0.field_45537, (var0, var1) -> {
      var0.field_45537 = (int)var1.doubleValue();
      MinecraftClient.getInstance().worldRenderer.method_20018();
   }, (var0, var1) -> {
      double var4 = var1.method_38570(var0);
      return var1.method_4492(new TranslationTextComponent("options.chunks", (int)var4));
   });
   public static final class_8369 field_5227 = new class_8369(
      "options.entityDistanceScaling",
      0.5,
      5.0,
      0.25F,
      var0 -> (double)var0.field_45475,
      (var0, var1) -> var0.field_45475 = (float)var1.doubleValue(),
      (var0, var1) -> {
         double var4 = var1.method_38570(var0);
         return var1.method_4490(var4);
      }
   );
   public static final class_8369 field_5199 = new class_8369(
      "options.sensitivity", 0.0, 1.0, 0.0F, var0 -> var0.field_45561, (var0, var1) -> var0.field_45561 = var1, (var0, var1) -> {
         double var4 = var1.method_38566(var1.method_38570(var0));
         if (var4 != 0.0) {
            return var4 != 1.0 ? var1.method_4490(2.0 * var4) : var1.method_4492(new TranslationTextComponent("options.sensitivity.max"));
         } else {
            return var1.method_4492(new TranslationTextComponent("options.sensitivity.min"));
         }
      }
   );
   public static final class_8369 field_5301 = new class_8369(
      "options.accessibility.text_background_opacity", 0.0, 1.0, 0.0F, var0 -> var0.field_45563, (var0, var1) -> {
         var0.field_45563 = var1;
         MinecraftClient.getInstance().field_9614.method_13991().method_18693();
      }, (var0, var1) -> var1.method_4490(var1.method_38566(var1.method_38570(var0)))
   );
   public static final class_4001 field_5267 = new class_4001("options.ao", (var0, var1) -> {
      var0.field_45533 = class_6168.method_28279(var0.field_45533.method_28277() + var1);
      MinecraftClient.getInstance().worldRenderer.method_19998();
   }, (var0, var1) -> var1.method_4492(new TranslationTextComponent(var0.field_45533.method_28278())));
   public static final class_4001 field_5195 = new class_4001(
      "options.attackIndicator",
      (var0, var1) -> var0.field_45555 = class_8846.method_40706(var0.field_45555.method_40705() + var1),
      (var0, var1) -> var1.method_4492(new TranslationTextComponent(var0.field_45555.method_40707()))
   );
   public static final class_4001 field_5236 = new class_4001(
      "options.chat.visibility",
      (var0, var1) -> var0.field_45443 = class_1803.method_8015((var0.field_45443.method_8014() + var1) % 3),
      (var0, var1) -> var1.method_4492(new TranslationTextComponent(var0.field_45443.method_8017()))
   );
   private static final ITextComponent field_5219 = new TranslationTextComponent("options.graphics.fast.tooltip");
   private static final ITextComponent field_5281 = new TranslationTextComponent(
      "options.graphics.fabulous.tooltip", new TranslationTextComponent("options.graphics.fabulous").mergeStyle(TextFormatting.ITALIC)
   );
   private static final ITextComponent field_5270 = new TranslationTextComponent("options.graphics.fancy.tooltip");
   public static final class_4001 field_5207 = new class_4001("options.graphics", (var0, var1) -> {
      MinecraftClient var4 = MinecraftClient.getInstance();
      class_5180 var5 = var4.method_8538();
      if (var0.field_45397 == class_4615.field_22437 && var5.method_23757()) {
         var5.method_23753();
      } else {
         var0.field_45397 = var0.field_45397.method_21384();
         if (var0.field_45397 == class_4615.field_22433 && (Config.method_14424() || !GlStateManager.method_8795() || var5.method_23752())) {
            var0.field_45397 = class_4615.field_22434;
         }

         var0.method_40878();
         var4.worldRenderer.method_19998();
      }
   }, (var0, var1) -> {
      switch (var0.field_45397) {
         case field_22434:
            var1.method_4487(MinecraftClient.getInstance().textRenderer.method_45391(field_5219, 200));
            break;
         case field_22437:
            var1.method_4487(MinecraftClient.getInstance().textRenderer.method_45391(field_5270, 200));
            break;
         case field_22433:
            var1.method_4487(MinecraftClient.getInstance().textRenderer.method_45391(field_5281, 200));
      }

      TranslationTextComponent var4 = new TranslationTextComponent(var0.field_45397.method_21387());
      return var0.field_45397 == class_4615.field_22433 ? var1.method_4492(var4.mergeStyle(TextFormatting.ITALIC)) : var1.method_4492(var4);
   });
   public static final class_4001 field_5251 = new class_4001(
      "options.guiScale",
      (var0, var1) -> var0.field_45484 = class_9299.method_42788(
            var0.field_45484 + var1, MinecraftClient.getInstance().getMainWindow().method_43164(0, MinecraftClient.getInstance().method_8578()) + 1
         ),
      (var0, var1) -> var0.field_45484 != 0 ? var1.method_4485(var0.field_45484) : var1.method_4492(new TranslationTextComponent("options.guiScale.auto"))
   );
   public static final class_4001 field_5264 = new class_4001(
      "options.mainHand", (var0, var1) -> var0.field_45569 = var0.field_45569.method_7745(), (var0, var1) -> var1.method_4492(var0.field_45569.method_7747())
   );
   public static final class_4001 field_5254 = new class_4001(
      "options.narrator",
      (var0, var1) -> {
         if (!NarratorChatListener.INSTANCE.method_34346()) {
            var0.field_45459 = class_4066.field_19800;
         } else {
            var0.field_45459 = class_4066.method_18744(var0.field_45459.method_18743() + var1);
         }

         NarratorChatListener.INSTANCE.method_34348(var0.field_45459);
      },
      (var0, var1) -> !NarratorChatListener.INSTANCE.method_34346()
            ? var1.method_4492(new TranslationTextComponent("options.narrator.notavailable"))
            : var1.method_4492(var0.field_45459.method_18746())
   );
   public static final class_4001 field_5275 = new class_4001(
      "options.particles",
      (var0, var1) -> var0.field_45505 = class_9761.method_45046(var0.field_45505.method_45045() + var1),
      (var0, var1) -> var1.method_4492(new TranslationTextComponent(var0.field_45505.method_45043()))
   );
   public static final class_4001 field_5288 = new class_4001("options.renderClouds", (var0, var1) -> {
      var0.field_45551 = class_9655.method_44551(var0.field_45551.method_44549() + var1);
      if (MinecraftClient.method_8497()) {
         class_4230 var4 = MinecraftClient.getInstance().worldRenderer.method_20091();
         if (var4 != null) {
            var4.method_19712(MinecraftClient.IS_SYSTEM_MAC);
         }
      }
   }, (var0, var1) -> var1.method_4492(new TranslationTextComponent(var0.field_45551.method_44550())));
   public static final class_4001 field_5289 = new class_4001(
      "options.accessibility.text_background",
      (var0, var1) -> var0.field_45399 = !var0.field_45399,
      (var0, var1) -> var1.method_4492(
            new TranslationTextComponent(!var0.field_45399 ? "options.accessibility.text_background.everywhere" : "options.accessibility.text_background.chat")
         )
   );
   private static final ITextComponent field_5286 = new TranslationTextComponent("options.hideMatchedNames.tooltip");
   public static final class_4802 field_5256 = new class_4802("options.autoJump", var0 -> var0.field_45412, (var0, var1) -> var0.field_45412 = var1);
   public static final class_4802 field_5228 = new class_4802("options.autoSuggestCommands", var0 -> var0.field_45493, (var0, var1) -> var0.field_45493 = var1);
   public static final class_4802 field_5290 = new class_4802(
      "options.hideMatchedNames", field_5286, var0 -> var0.field_45405, (var0, var1) -> var0.field_45405 = var1
   );
   public static final class_4802 field_5239 = new class_4802("options.chat.color", var0 -> var0.field_45554, (var0, var1) -> var0.field_45554 = var1);
   public static final class_4802 field_5314 = new class_4802("options.chat.links", var0 -> var0.field_45442, (var0, var1) -> var0.field_45442 = var1);
   public static final class_4802 field_5273 = new class_4802("options.chat.links.prompt", var0 -> var0.field_45458, (var0, var1) -> var0.field_45458 = var1);
   public static final class_4802 field_5234 = new class_4802(
      "options.discrete_mouse_scroll", var0 -> var0.field_45521, (var0, var1) -> var0.field_45521 = var1
   );
   public static final class_4802 field_5258 = new class_4802("options.vsync", var0 -> var0.field_45502, (var0, var1) -> {
      var0.field_45502 = var1;
      if (MinecraftClient.getInstance().getMainWindow() != null) {
         MinecraftClient.getInstance().getMainWindow().method_43162(var0.field_45502);
      }
   });
   public static final class_4802 field_5231 = new class_4802("options.entityShadows", var0 -> var0.field_45568, (var0, var1) -> var0.field_45568 = var1);
   public static final class_4802 field_5306 = new class_4802("options.forceUnicodeFont", var0 -> var0.field_45463, (var0, var1) -> {
      var0.field_45463 = var1;
      MinecraftClient var4 = MinecraftClient.getInstance();
      if (var4.getMainWindow() != null) {
         var4.method_8540(var1);
      }
   });
   public static final class_4802 field_5307 = new class_4802("options.invertMouse", var0 -> var0.field_45535, (var0, var1) -> var0.field_45535 = var1);
   public static final class_4802 field_5309 = new class_4802("options.realmsNotifications", var0 -> var0.field_45435, (var0, var1) -> var0.field_45435 = var1);
   public static final class_4802 field_5201 = new class_4802("options.reducedDebugInfo", var0 -> var0.field_45500, (var0, var1) -> var0.field_45500 = var1);
   public static final class_4802 field_5291 = new class_4802("options.showSubtitles", var0 -> var0.field_45445, (var0, var1) -> var0.field_45445 = var1);
   public static final class_4802 field_5208 = new class_4802("options.snooper", var0 -> {
      if (!var0.field_45403) {
      }

      return false;
   }, (var0, var1) -> var0.field_45403 = var1);
   public static final class_4001 field_5303 = new class_4001(
      "key.sneak",
      (var0, var1) -> var0.field_45464 = !var0.field_45464,
      (var0, var1) -> var1.method_4492(new TranslationTextComponent(!var0.field_45464 ? "options.key.hold" : "options.key.toggle"))
   );
   public static final class_4001 field_5304 = new class_4001(
      "key.sprint",
      (var0, var1) -> var0.field_45552 = !var0.field_45552,
      (var0, var1) -> var1.method_4492(new TranslationTextComponent(!var0.field_45552 ? "options.key.hold" : "options.key.toggle"))
   );
   public static final class_4802 field_5292 = new class_4802("options.touchscreen", var0 -> var0.field_45570, (var0, var1) -> var0.field_45570 = var1);
   public static final class_4802 field_5246 = new class_4802("options.fullscreen", var0 -> var0.field_45453, (var0, var1) -> {
      var0.field_45453 = var1;
      MinecraftClient var4 = MinecraftClient.getInstance();
      if (var4.getMainWindow() != null && var4.getMainWindow().method_43174() != var0.field_45453) {
         var4.getMainWindow().method_43156();
         var0.field_45453 = var4.getMainWindow().method_43174();
      }
   });
   public static final class_4802 field_5272 = new class_4802("options.viewBobbing", var0 -> var0.field_45512, (var0, var1) -> var0.field_45512 = var1);
   private final ITextComponent field_5319;
   private Optional<List<class_7107>> field_5295 = Optional.<List<class_7107>>empty();
   private final String field_5265;
   public static final class_4001 field_5298 = new class_334("of.options.FOG_FANCY");
   public static final class_4001 field_5252 = new class_334("of.options.FOG_START");
   public static final class_8369 field_5297 = new class_6125("of.options.MIPMAP_TYPE", 0.0, 3.0, 1.0F);
   public static final class_4001 field_5280 = new class_334("of.options.SMOOTH_FPS");
   public static final class_4001 field_5245 = new class_334("of.options.CLOUDS");
   public static final class_8369 field_5221 = new class_6125("of.options.CLOUD_HEIGHT");
   public static final class_4001 field_5257 = new class_334("of.options.TREES");
   public static final class_4001 field_5215 = new class_334("of.options.RAIN");
   public static final class_4001 field_5318 = new class_334("of.options.ANIMATED_WATER");
   public static final class_4001 field_5294 = new class_334("of.options.ANIMATED_LAVA");
   public static final class_4001 field_5240 = new class_334("of.options.ANIMATED_FIRE");
   public static final class_4001 field_5194 = new class_334("of.options.ANIMATED_PORTAL");
   public static final class_8369 field_5260 = new class_6125("of.options.AO_LEVEL");
   public static final class_4001 field_5312 = new class_334("of.options.LAGOMETER");
   public static final class_4001 field_5190 = new class_334("of.options.SHOW_FPS");
   public static final class_4001 field_5205 = new class_334("of.options.AUTOSAVE_TICKS");
   public static final class_4001 field_5210 = new class_334("of.options.BETTER_GRASS");
   public static final class_4001 field_5237 = new class_334("of.options.ANIMATED_REDSTONE");
   public static final class_4001 field_5287 = new class_334("of.options.ANIMATED_EXPLOSION");
   public static final class_4001 field_5193 = new class_334("of.options.ANIMATED_FLAME");
   public static final class_4001 field_5214 = new class_334("of.options.ANIMATED_SMOKE");
   public static final class_4001 field_5296 = new class_334("of.options.WEATHER");
   public static final class_4001 field_5269 = new class_334("of.options.SKY");
   public static final class_4001 field_5285 = new class_334("of.options.STARS");
   public static final class_4001 field_5213 = new class_334("of.options.SUN_MOON");
   public static final class_4001 field_5244 = new class_334("of.options.VIGNETTE");
   public static final class_4001 field_5316 = new class_334("of.options.CHUNK_UPDATES");
   public static final class_4001 field_5274 = new class_334("of.options.CHUNK_UPDATES_DYNAMIC");
   public static final class_4001 field_5242 = new class_334("of.options.TIME");
   public static final class_4001 field_5308 = new class_334("of.options.SMOOTH_WORLD");
   public static final class_4001 field_5189 = new class_334("of.options.VOID_PARTICLES");
   public static final class_4001 field_5211 = new class_334("of.options.WATER_PARTICLES");
   public static final class_4001 field_5276 = new class_334("of.options.RAIN_SPLASH");
   public static final class_4001 field_5226 = new class_334("of.options.PORTAL_PARTICLES");
   public static final class_4001 field_5317 = new class_334("of.options.POTION_PARTICLES");
   public static final class_4001 field_5191 = new class_334("of.options.FIREWORK_PARTICLES");
   public static final class_4001 field_5196 = new class_334("of.options.PROFILER");
   public static final class_4001 field_5204 = new class_334("of.options.DRIPPING_WATER_LAVA");
   public static final class_4001 field_5209 = new class_334("of.options.BETTER_SNOW");
   public static final class_4001 field_5216 = new class_334("of.options.ANIMATED_TERRAIN");
   public static final class_4001 field_5220 = new class_334("of.options.SWAMP_COLORS");
   public static final class_4001 field_5283 = new class_334("of.options.RANDOM_ENTITIES");
   public static final class_4001 field_5243 = new class_334("of.options.SMOOTH_BIOMES");
   public static final class_4001 field_5217 = new class_334("of.options.CUSTOM_FONTS");
   public static final class_4001 field_5261 = new class_334("of.options.CUSTOM_COLORS");
   public static final class_4001 field_5233 = new class_334("of.options.SHOW_CAPES");
   public static final class_4001 field_5212 = new class_334("of.options.CONNECTED_TEXTURES");
   public static final class_4001 field_5249 = new class_334("of.options.CUSTOM_ITEMS");
   public static final class_8369 field_5293 = new class_6125("of.options.AA_LEVEL", 0.0, 16.0, 1.0F);
   public static final class_8369 field_5310 = new class_6125("of.options.AF_LEVEL", 1.0, 16.0, 1.0F);
   public static final class_4001 field_5279 = new class_334("of.options.ANIMATED_TEXTURES");
   public static final class_4001 field_5206 = new class_334("of.options.NATURAL_TEXTURES");
   public static final class_4001 field_5247 = new class_334("of.options.EMISSIVE_TEXTURES");
   public static final class_4001 field_5263 = new class_334("of.options.HELD_ITEM_TOOLTIPS");
   public static final class_4001 field_5229 = new class_334("of.options.DROPPED_ITEMS");
   public static final class_4001 field_5218 = new class_334("of.options.LAZY_CHUNK_LOADING");
   public static final class_4001 field_5253 = new class_334("of.options.CUSTOM_SKY");
   public static final class_4001 field_5235 = new class_334("of.options.FAST_MATH");
   public static final class_4001 field_5238 = new class_334("of.options.FAST_RENDER");
   public static final class_4001 field_5202 = new class_334("of.options.TRANSLUCENT_BLOCKS");
   public static final class_4001 field_5311 = new class_334("of.options.DYNAMIC_FOV");
   public static final class_4001 field_5282 = new class_334("of.options.DYNAMIC_LIGHTS");
   public static final class_4001 field_5278 = new class_334("of.options.ALTERNATE_BLOCKS");
   public static final class_4001 field_5302 = new class_334("of.options.CUSTOM_ENTITY_MODELS");
   public static final class_4001 field_5200 = new class_334("of.options.ADVANCED_TOOLTIPS");
   public static final class_4001 field_5248 = new class_334("of.options.SCREENSHOT_SIZE");
   public static final class_4001 field_5315 = new class_334("of.options.CUSTOM_GUIS");
   public static final class_4001 field_5223 = new class_334("of.options.RENDER_REGIONS");
   public static final class_4001 field_5313 = new class_334("of.options.SHOW_GL_ERRORS");
   public static final class_4001 field_5255 = new class_334("of.options.SMART_ANIMATIONS");
   public static final class_4001 field_5197 = new class_334("of.options.CHAT_BACKGROUND");
   public static final class_4001 field_5241 = new class_334("of.options.CHAT_SHADOW");

   public class_1013(String var1) {
      this.field_5319 = new TranslationTextComponent(var1);
      this.field_5265 = var1;
   }

   public abstract class_7114 method_4482(GameOptions var1, int var2, int var3, int var4);

   public ITextComponent method_4483() {
      return this.field_5319;
   }

   public void method_4487(List<class_7107> var1) {
      this.field_5295 = Optional.<List<class_7107>>of(var1);
   }

   public Optional<List<class_7107>> method_4486() {
      return this.field_5295;
   }

   public ITextComponent method_4489(int var1) {
      return new TranslationTextComponent("options.pixel_value", this.method_4483(), var1);
   }

   public ITextComponent method_4490(double var1) {
      return new TranslationTextComponent("options.percent_value", this.method_4483(), (int)(var1 * 100.0));
   }

   public ITextComponent method_4484(int var1) {
      return new TranslationTextComponent("options.percent_add_value", this.method_4483(), var1);
   }

   public ITextComponent method_4492(ITextComponent var1) {
      return new TranslationTextComponent("options.generic_value", this.method_4483(), var1);
   }

   public ITextComponent method_4485(int var1) {
      return this.method_4492(new StringTextComponent(Integer.toString(var1)));
   }

   public String method_4491() {
      return this.field_5265;
   }
}
