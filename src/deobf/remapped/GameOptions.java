package remapped;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameOptions {
   private static final Logger field_45573 = LogManager.getLogger();
   private static final Gson field_45429 = new Gson();
   private static final TypeToken<List<String>> field_45525 = new class_4451();
   private static final Splitter field_45483 = Splitter.on(':').limit(2);
   public double field_45561 = 0.5;
   public int field_45537 = -1;
   public float field_45475 = 1.0F;
   public int field_45439 = 120;
   public class_9655 field_45551 = class_9655.field_49167;
   public class_4615 field_45397 = class_4615.field_22437;
   public class_6168 field_45533 = class_6168.field_31562;
   public List<String> field_45387 = Lists.newArrayList();
   public List<String> field_45401 = Lists.newArrayList();
   public class_1803 field_45443 = class_1803.field_9182;
   public double field_45402 = 1.0;
   public double field_45465 = 0.0;
   public double field_45563 = 0.5;
   public String field_45422;
   public boolean field_45513;
   public boolean field_45482;
   public boolean field_45426 = true;
   private final Set<class_7742> field_45503 = Sets.newHashSet(class_7742.values());
   public class_1736 field_45569 = class_1736.field_8943;
   public int field_45491;
   public int field_45424;
   public boolean field_45477 = true;
   public double field_45419 = 1.0;
   public double field_45388 = 1.0;
   public double field_45488 = 0.44366196F;
   public double field_45480 = 1.0;
   public double field_45479 = 0.0;
   public int field_45577 = 4;
   private final Map<class_562, Float> field_45576 = Maps.newEnumMap(class_562.class);
   public boolean field_45544 = true;
   public class_8846 field_45555 = class_8846.field_45243;
   public class_6240 field_45410 = class_6240.field_31935;
   public boolean field_45519 = false;
   public int field_45526 = 2;
   public double field_45578 = 1.0;
   public boolean field_45409 = true;
   public int field_45542 = 1;
   public boolean field_45412 = true;
   public boolean field_45493 = true;
   public boolean field_45554 = true;
   public boolean field_45442 = true;
   public boolean field_45458 = true;
   public boolean field_45502 = true;
   public boolean field_45568 = true;
   public boolean field_45463;
   public boolean field_45535;
   public boolean field_45521;
   public boolean field_45435 = true;
   public boolean field_45500;
   public boolean field_45403 = true;
   public boolean field_45445;
   public boolean field_45399 = true;
   public boolean field_45570;
   public boolean field_45453;
   public boolean field_45512 = true;
   public boolean field_45464;
   public boolean field_45552;
   public boolean field_45481;
   public boolean field_45405 = true;
   public final class_5916 keyForward = new class_5916("key.forward", 87, "key.categories.movement");
   public final class_5916 keyLeft = new class_5916("key.left", 65, "key.categories.movement");
   public final class_5916 keyBack = new class_5916("key.back", 83, "key.categories.movement");
   public final class_5916 keyRight = new class_5916("key.right", 68, "key.categories.movement");
   public final class_5916 keyJump = new class_5916("key.jump", 32, "key.categories.movement");
   public final class_5916 keySneak = new class_2949("key.sneak", 340, "key.categories.movement", () -> this.field_45464);
   public final class_5916 keySprint = new class_2949("key.sprint", 341, "key.categories.movement", () -> this.field_45552);
   public final class_5916 keyInventory = new class_5916("key.inventory", 69, "key.categories.inventory");
   public final class_5916 keySwapOffHand = new class_5916("key.swapOffhand", 70, "key.categories.inventory");
   public final class_5916 keyDrop = new class_5916("key.drop", 81, "key.categories.inventory");
   public final class_5916 keyUse = new class_5916("key.use", class_8863.field_45320, 1, "key.categories.gameplay");
   public final class_5916 keyAttack = new class_5916("key.attack", class_8863.field_45320, 0, "key.categories.gameplay");
   public final class_5916 keyPickItem = new class_5916("key.pickItem", class_8863.field_45320, 2, "key.categories.gameplay");
   public final class_5916 keyOpenChat = new class_5916("key.chat", 84, "key.categories.multiplayer");
   public final class_5916 keyPlayerList = new class_5916("key.playerlist", 258, "key.categories.multiplayer");
   public final class_5916 keyTypeCommand = new class_5916("key.command", 47, "key.categories.multiplayer");
   public final class_5916 keySnowflakeMenu = new class_5916("key.socialInteractions", 80, "key.categories.multiplayer");
   public final class_5916 keyScreenshot = new class_5916("key.screenshot", 291, "key.categories.misc");
   public final class_5916 keyPerspectiveSwitch = new class_5916("key.togglePerspective", 294, "key.categories.misc");
   public final class_5916 keySmoothCamera = new class_5916("key.smoothCamera", class_9732.field_49455.method_16988(), "key.categories.misc");
   public final class_5916 keyFullScreen = new class_5916("key.fullscreen", 300, "key.categories.misc");
   public final class_5916 keySpectatorOutlines = new class_5916("key.spectatorOutlines", class_9732.field_49455.method_16988(), "key.categories.misc");
   public final class_5916 keyAdvancements = new class_5916("key.advancements", 76, "key.categories.misc");
   public final class_5916[] hotbarKeys = new class_5916[]{
      new class_5916("key.hotbar.1", 49, "key.categories.inventory"),
      new class_5916("key.hotbar.2", 50, "key.categories.inventory"),
      new class_5916("key.hotbar.3", 51, "key.categories.inventory"),
      new class_5916("key.hotbar.4", 52, "key.categories.inventory"),
      new class_5916("key.hotbar.5", 53, "key.categories.inventory"),
      new class_5916("key.hotbar.6", 54, "key.categories.inventory"),
      new class_5916("key.hotbar.7", 55, "key.categories.inventory"),
      new class_5916("key.hotbar.8", 56, "key.categories.inventory"),
      new class_5916("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final class_5916 field_45562 = new class_5916("key.saveToolbarActivator", 67, "key.categories.creative");
   public final class_5916 field_45486 = new class_5916("key.loadToolbarActivator", 88, "key.categories.creative");
   public class_5916[] field_45395 = (class_5916[])ArrayUtils.addAll(
      new class_5916[]{
         this.keyAttack,
         this.keyUse,
         this.keyForward,
         this.keyLeft,
         this.keyBack,
         this.keyRight,
         this.keyJump,
         this.keySneak,
         this.keySprint,
         this.keyDrop,
         this.keyInventory,
         this.keyOpenChat,
         this.keyPlayerList,
         this.keyPickItem,
         this.keyTypeCommand,
         this.keySnowflakeMenu,
         this.keyScreenshot,
         this.keyPerspectiveSwitch,
         this.keySmoothCamera,
         this.keyFullScreen,
         this.keySpectatorOutlines,
         this.keySwapOffHand,
         this.field_45562,
         this.field_45486,
         this.keyAdvancements
      },
      this.hotbarKeys
   );
   public MinecraftClient field_45495;
   private final File field_45579;
   public class_423 field_45494 = class_423.field_1789;
   public boolean field_45567;
   private class_9193 field_45440 = class_9193.field_47031;
   public boolean field_45470;
   public boolean field_45471;
   public boolean field_45549;
   public String field_45414 = "";
   public boolean field_45499;
   public double field_45543 = 70.0;
   public float field_45469 = 1.0F;
   public float field_45386 = 1.0F;
   public double field_45391;
   public int field_45484;
   public class_9761 field_45505 = class_9761.field_49571;
   public class_4066 field_45459 = class_4066.field_19800;
   public String field_45437 = "en_us";
   public boolean field_45514;
   public int field_45497 = 1;
   public float field_45428 = 0.8F;
   public int field_45545 = 0;
   public boolean field_45418 = false;
   public boolean field_45432 = false;
   public boolean field_45446 = class_3111.method_14411();
   public boolean field_45406 = class_3111.method_14411();
   public boolean field_45538 = false;
   public boolean field_45478 = false;
   public double field_45438 = 1.0;
   public int field_45527 = 0;
   public int field_45528 = 1;
   public int field_45550 = 0;
   public double field_45398 = 0.0;
   public int field_45553 = 0;
   public int field_45394 = 0;
   public int field_45448 = 0;
   public int field_45449 = 3;
   public int field_45476 = 4000;
   public boolean field_45509 = false;
   public boolean field_45523 = false;
   public boolean field_45385 = false;
   public boolean field_45540 = true;
   public boolean field_45547 = true;
   public boolean field_45425 = true;
   public boolean field_45580 = true;
   public int field_45404 = 0;
   public int field_45536 = 1;
   public boolean field_45474 = false;
   public int field_45492 = 0;
   public boolean field_45468 = false;
   public boolean field_45531 = true;
   public boolean field_45490 = true;
   public boolean field_45427 = true;
   public boolean field_45408 = true;
   public boolean field_45413 = true;
   public boolean field_45518 = true;
   public int field_45529 = 2;
   public boolean field_45417 = true;
   public boolean field_45507 = false;
   public boolean field_45431 = true;
   public boolean field_45454 = false;
   public boolean field_45546 = false;
   public int field_45532 = 0;
   public boolean field_45524 = true;
   public boolean field_45506 = true;
   public int field_45571 = 3;
   public boolean field_45539 = true;
   public boolean field_45511 = true;
   public boolean field_45558 = true;
   public int field_45487 = 1;
   public int field_45574 = 0;
   public boolean field_45472 = true;
   public int field_45520 = 0;
   public int field_45389 = 0;
   public boolean field_45508 = true;
   public boolean field_45566 = true;
   public boolean field_45392 = true;
   public boolean field_45447 = true;
   public boolean field_45473 = true;
   public boolean field_45461 = true;
   public boolean field_45501 = true;
   public boolean field_45489 = true;
   public boolean field_45510 = true;
   public boolean field_45572 = true;
   public boolean field_45433 = true;
   public boolean field_45557 = true;
   public boolean field_45498 = true;
   public boolean field_45456 = true;
   public boolean field_45516 = true;
   public static final int field_45430 = 0;
   public static final int field_45485 = 1;
   public static final int field_45390 = 2;
   public static final int field_45517 = 3;
   public static final int field_45462 = 4;
   public static final int field_45452 = 5;
   public static final int field_45396 = 0;
   public static final int field_45407 = 1;
   public static final int field_45455 = 2;
   public static final String field_45515 = "Default";
   public static final double field_45522 = 4.0571431;
   private static final int[] field_45436 = new int[]{0, 1, 4, 2};
   private static final int[] field_45423 = new int[]{3, 1, 2};
   private static final String[] field_45466 = new String[]{field_45400[234], "options.graphics.fast", "options.graphics.fancy"};
   public class_5916 field_45548;
   private File field_45457;

   public GameOptions(MinecraftClient var1, File var2) {
      this.method_40876();
      this.field_45495 = var1;
      this.field_45579 = new File(var2, "options.txt");
      if (var1.method_8533() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
         class_1013.field_5250.method_38574(32.0F);
         long var3 = 1000000L;
         if (Runtime.getRuntime().maxMemory() >= 1500L * var3) {
            class_1013.field_5250.method_38574(48.0F);
         }

         if (Runtime.getRuntime().maxMemory() >= 2500L * var3) {
            class_1013.field_5250.method_38574(64.0F);
         }
      } else {
         class_1013.field_5250.method_38574(16.0F);
      }

      this.field_45537 = var1.method_8533() ? 12 : 8;
      this.field_45514 = Util.getOperatingSystem() == OperatingSystem.WINDOWS;
      this.field_45457 = new File(var2, "optionsof.txt");
      this.field_45439 = (int)class_1013.field_5277.method_38573();
      this.field_45548 = new class_5916("of.key.zoom", 67, "key.categories.misc");
      this.field_45395 = (class_5916[])ArrayUtils.add(this.field_45395, this.field_45548);
      class_9835.method_45329(this.field_45395, new class_5916[]{this.field_45548});
      this.field_45537 = 8;
      this.method_40869();
      class_3111.method_14436(this);
   }

   public float method_40872(float var1) {
      return this.field_45399 ? var1 : (float)this.field_45563;
   }

   public int method_40888(float var1) {
      return (int)(this.method_40872(var1) * 255.0F) << 24 & 0xFF000000;
   }

   public int method_40881(int var1) {
      return this.field_45399 ? var1 : (int)(this.field_45563 * 255.0) << 24 & 0xFF000000;
   }

   public void method_40863(class_5916 var1, class_3654 var2) {
      var1.method_27057(var2);
      this.method_40873();
   }

   public void method_40869() {
      try {
         if (!this.field_45579.exists()) {
            return;
         }

         this.field_45576.clear();
         class_5734 var1 = new class_5734();

         try (BufferedReader var2 = Files.newReader(this.field_45579, Charsets.UTF_8)) {
            var2.lines().forEach(var1x -> {
               try {
                  Iterator var2x = field_45483.split(var1x).iterator();
                  var1.method_25941((String)var2x.next(), (String)var2x.next());
               } catch (Exception var3) {
                  field_45573.warn("Skipping bad option: {}", var1x);
               }
            });
         }

         class_5734 var23 = this.method_40868(var1);
         if (!var23.method_25938("graphicsMode") && var23.method_25938("fancyGraphics")) {
            if ("true".equals(var23.method_25965("fancyGraphics"))) {
               this.field_45397 = class_4615.field_22437;
            } else {
               this.field_45397 = class_4615.field_22434;
            }
         }

         for (String var4 : var23.method_25952()) {
            String var5 = var23.method_25965(var4);

            try {
               if ("autoJump".equals(var4)) {
                  class_1013.field_5256.method_22125(this, var5);
               }

               if ("autoSuggestions".equals(var4)) {
                  class_1013.field_5228.method_22125(this, var5);
               }

               if ("chatColors".equals(var4)) {
                  class_1013.field_5239.method_22125(this, var5);
               }

               if ("chatLinks".equals(var4)) {
                  class_1013.field_5314.method_22125(this, var5);
               }

               if ("chatLinksPrompt".equals(var4)) {
                  class_1013.field_5273.method_22125(this, var5);
               }

               if ("enableVsync".equals(var4)) {
                  class_1013.field_5258.method_22125(this, var5);
                  if (this.field_45502) {
                     this.field_45439 = (int)class_1013.field_5277.method_38573();
                  }

                  this.method_40862();
               }

               if ("entityShadows".equals(var4)) {
                  class_1013.field_5231.method_22125(this, var5);
               }

               if ("forceUnicodeFont".equals(var4)) {
                  class_1013.field_5306.method_22125(this, var5);
               }

               if ("discrete_mouse_scroll".equals(var4)) {
                  class_1013.field_5234.method_22125(this, var5);
               }

               if ("invertYMouse".equals(var4)) {
                  class_1013.field_5307.method_22125(this, var5);
               }

               if ("realmsNotifications".equals(var4)) {
                  class_1013.field_5309.method_22125(this, var5);
               }

               if ("reducedDebugInfo".equals(var4)) {
                  class_1013.field_5201.method_22125(this, var5);
               }

               if ("showSubtitles".equals(var4)) {
                  class_1013.field_5291.method_22125(this, var5);
               }

               if ("snooperEnabled".equals(var4)) {
                  class_1013.field_5208.method_22125(this, var5);
               }

               if ("touchscreen".equals(var4)) {
                  class_1013.field_5292.method_22125(this, var5);
               }

               if ("fullscreen".equals(var4)) {
                  class_1013.field_5246.method_22125(this, var5);
               }

               if ("bobView".equals(var4)) {
                  class_1013.field_5272.method_22125(this, var5);
               }

               if ("toggleCrouch".equals(var4)) {
                  this.field_45464 = "true".equals(var5);
               }

               if ("toggleSprint".equals(var4)) {
                  this.field_45552 = "true".equals(var5);
               }

               if ("mouseSensitivity".equals(var4)) {
                  this.field_45561 = (double)method_40894(var5);
               }

               if ("fov".equals(var4)) {
                  this.field_45543 = (double)(method_40894(var5) * 40.0F + 70.0F);
               }

               if ("screenEffectScale".equals(var4)) {
                  this.field_45469 = method_40894(var5);
               }

               if ("fovEffectScale".equals(var4)) {
                  this.field_45386 = method_40894(var5);
               }

               if ("gamma".equals(var4)) {
                  this.field_45391 = (double)method_40894(var5);
               }

               if ("renderDistance".equals(var4)) {
                  this.field_45537 = Integer.parseInt(var5);
               }

               if ("entityDistanceScaling".equals(var4)) {
                  this.field_45475 = Float.parseFloat(var5);
               }

               if ("guiScale".equals(var4)) {
                  this.field_45484 = Integer.parseInt(var5);
               }

               if ("particles".equals(var4)) {
                  this.field_45505 = class_9761.method_45046(Integer.parseInt(var5));
               }

               if ("maxFps".equals(var4)) {
                  this.field_45439 = Integer.parseInt(var5);
                  if (this.field_45502) {
                     this.field_45439 = (int)class_1013.field_5277.method_38573();
                  }

                  if (this.field_45439 <= 0) {
                     this.field_45439 = (int)class_1013.field_5277.method_38573();
                  }

                  if (this.field_45495.method_8552() != null) {
                     this.field_45495.method_8552().method_43194(this.field_45439);
                  }
               }

               if ("difficulty".equals(var4)) {
                  this.field_45494 = class_423.method_2100(Integer.parseInt(var5));
               }

               if ("graphicsMode".equals(var4)) {
                  this.field_45397 = class_4615.method_21385(Integer.parseInt(var5));
                  this.method_40878();
               }

               if ("tutorialStep".equals(var4)) {
                  this.field_45410 = class_6240.method_28502(var5);
               }

               if ("ao".equals(var4)) {
                  if ("true".equals(var5)) {
                     this.field_45533 = class_6168.field_31562;
                  } else if ("false".equals(var5)) {
                     this.field_45533 = class_6168.field_31559;
                  } else {
                     this.field_45533 = class_6168.method_28279(Integer.parseInt(var5));
                  }
               }

               if ("renderClouds".equals(var4)) {
                  if ("true".equals(var5)) {
                     this.field_45551 = class_9655.field_49167;
                  } else if ("false".equals(var5)) {
                     this.field_45551 = class_9655.field_49168;
                  } else if ("fast".equals(var5)) {
                     this.field_45551 = class_9655.field_49170;
                  }
               }

               if ("attackIndicator".equals(var4)) {
                  this.field_45555 = class_8846.method_40706(Integer.parseInt(var5));
               }

               if ("resourcePacks".equals(var4)) {
                  this.field_45387 = class_6539.<List<String>>method_29765(field_45429, var5, field_45525);
                  if (this.field_45387 == null) {
                     this.field_45387 = Lists.newArrayList();
                  }
               }

               if ("incompatibleResourcePacks".equals(var4)) {
                  this.field_45401 = class_6539.<List<String>>method_29765(field_45429, var5, field_45525);
                  if (this.field_45401 == null) {
                     this.field_45401 = Lists.newArrayList();
                  }
               }

               if ("lastServer".equals(var4)) {
                  this.field_45414 = var5;
               }

               if ("lang".equals(var4)) {
                  this.field_45437 = var5;
               }

               if ("chatVisibility".equals(var4)) {
                  this.field_45443 = class_1803.method_8015(Integer.parseInt(var5));
               }

               if ("chatOpacity".equals(var4)) {
                  this.field_45402 = (double)method_40894(var5);
               }

               if ("chatLineSpacing".equals(var4)) {
                  this.field_45465 = (double)method_40894(var5);
               }

               if ("textBackgroundOpacity".equals(var4)) {
                  this.field_45563 = (double)method_40894(var5);
               }

               if ("backgroundForChatOnly".equals(var4)) {
                  this.field_45399 = "true".equals(var5);
               }

               if ("fullscreenResolution".equals(var4)) {
                  this.field_45422 = var5;
               }

               if ("hideServerAddress".equals(var4)) {
                  this.field_45513 = "true".equals(var5);
               }

               if ("advancedItemTooltips".equals(var4)) {
                  this.field_45482 = "true".equals(var5);
               }

               if ("pauseOnLostFocus".equals(var4)) {
                  this.field_45426 = "true".equals(var5);
               }

               if ("overrideHeight".equals(var4)) {
                  this.field_45424 = Integer.parseInt(var5);
               }

               if ("overrideWidth".equals(var4)) {
                  this.field_45491 = Integer.parseInt(var5);
               }

               if ("heldItemTooltips".equals(var4)) {
                  this.field_45477 = "true".equals(var5);
               }

               if ("chatHeightFocused".equals(var4)) {
                  this.field_45480 = (double)method_40894(var5);
               }

               if ("chatDelay".equals(var4)) {
                  this.field_45479 = (double)method_40894(var5);
               }

               if ("chatHeightUnfocused".equals(var4)) {
                  this.field_45488 = (double)method_40894(var5);
               }

               if ("chatScale".equals(var4)) {
                  this.field_45419 = (double)method_40894(var5);
               }

               if ("chatWidth".equals(var4)) {
                  this.field_45388 = (double)method_40894(var5);
               }

               if ("mipmapLevels".equals(var4)) {
                  this.field_45577 = Integer.parseInt(var5);
               }

               if ("useNativeTransport".equals(var4)) {
                  this.field_45544 = "true".equals(var5);
               }

               if ("mainHand".equals(var4)) {
                  this.field_45569 = "left".equals(var5) ? class_1736.field_8940 : class_1736.field_8943;
               }

               if ("narrator".equals(var4)) {
                  this.field_45459 = class_4066.method_18744(Integer.parseInt(var5));
               }

               if ("biomeBlendRadius".equals(var4)) {
                  this.field_45526 = Integer.parseInt(var5);
               }

               if ("mouseWheelSensitivity".equals(var4)) {
                  this.field_45578 = (double)method_40894(var5);
               }

               if ("rawMouseInput".equals(var4)) {
                  this.field_45409 = "true".equals(var5);
               }

               if ("glDebugVerbosity".equals(var4)) {
                  this.field_45542 = Integer.parseInt(var5);
               }

               if ("skipMultiplayerWarning".equals(var4)) {
                  this.field_45481 = "true".equals(var5);
               }

               if ("hideMatchedNames".equals(var4)) {
                  this.field_45405 = "true".equals(var5);
               }

               if ("joinedFirstServer".equals(var4)) {
                  this.field_45519 = "true".equals(var5);
               }

               if ("syncChunkWrites".equals(var4)) {
                  this.field_45514 = "true".equals(var5);
               }

               for (class_5916 var9 : this.field_45395) {
                  if (var4.equals("key_" + var9.method_27055())) {
                     if (class_7860.field_39927.method_3596()) {
                        if (var5.indexOf(58) != -1) {
                           String[] var10 = var5.split(":");
                           Object var11 = class_7860.method_35556(class_7860.field_39927, var10[1]);
                           class_7860.method_35555(var9, class_7860.field_39865, var11, class_9732.method_44939(var10[0]));
                        } else {
                           Object var33 = class_7860.method_35559(class_7860.field_39991);
                           class_7860.method_35555(var9, class_7860.field_39865, var33, class_9732.method_44939(var5));
                        }
                     } else {
                        var9.method_27057(class_9732.method_44939(var5));
                     }
                  }
               }

               for (class_562 var31 : class_562.values()) {
                  if (var4.equals("soundCategory_" + var31.method_2681())) {
                     this.field_45576.put(var31, method_40894(var5));
                  }
               }

               for (class_7742 var32 : class_7742.values()) {
                  if (var4.equals("modelPart_" + var32.method_35039())) {
                     this.method_40875(var32, "true".equals(var5));
                  }
               }
            } catch (Exception var21) {
               field_45573.warn("Skipping bad option: {}:{}", var4, var5);
               var21.printStackTrace();
            }
         }

         class_5916.method_27067();
      } catch (Exception var22) {
         field_45573.error("Failed to load options", var22);
      }

      this.method_40865();
   }

   private class_5734 method_40868(class_5734 var1) {
      int var2 = 0;

      try {
         var2 = Integer.parseInt(var1.method_25965("version"));
      } catch (RuntimeException var4) {
      }

      return class_4338.method_20179(this.field_45495.method_8496(), class_5397.field_27550, var1, var2);
   }

   private static float method_40894(String var0) {
      if ("true".equals(var0)) {
         return 1.0F;
      } else {
         return "false".equals(var0) ? 0.0F : Float.parseFloat(var0);
      }
   }

   public void method_40873() {
      if (!class_7860.field_39853.method_3596() || !class_7860.method_35566(class_7860.field_39853)) {
         try (PrintWriter var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.field_45579), StandardCharsets.UTF_8))) {
            var1.println("version:" + class_7665.method_34674().getWorldVersion());
            var1.println("autoJump:" + class_1013.field_5256.method_22129(this));
            var1.println("autoSuggestions:" + class_1013.field_5228.method_22129(this));
            var1.println("chatColors:" + class_1013.field_5239.method_22129(this));
            var1.println("chatLinks:" + class_1013.field_5314.method_22129(this));
            var1.println("chatLinksPrompt:" + class_1013.field_5273.method_22129(this));
            var1.println("enableVsync:" + class_1013.field_5258.method_22129(this));
            var1.println("entityShadows:" + class_1013.field_5231.method_22129(this));
            var1.println("forceUnicodeFont:" + class_1013.field_5306.method_22129(this));
            var1.println("discrete_mouse_scroll:" + class_1013.field_5234.method_22129(this));
            var1.println("invertYMouse:" + class_1013.field_5307.method_22129(this));
            var1.println("realmsNotifications:" + class_1013.field_5309.method_22129(this));
            var1.println("reducedDebugInfo:" + class_1013.field_5201.method_22129(this));
            var1.println("snooperEnabled:" + class_1013.field_5208.method_22129(this));
            var1.println("showSubtitles:" + class_1013.field_5291.method_22129(this));
            var1.println("touchscreen:" + class_1013.field_5292.method_22129(this));
            var1.println("fullscreen:" + class_1013.field_5246.method_22129(this));
            var1.println("bobView:" + class_1013.field_5272.method_22129(this));
            var1.println("toggleCrouch:" + this.field_45464);
            var1.println("toggleSprint:" + this.field_45552);
            var1.println("mouseSensitivity:" + this.field_45561);
            var1.println("fov:" + (this.field_45543 - 70.0) / 40.0);
            var1.println("screenEffectScale:" + this.field_45469);
            var1.println("fovEffectScale:" + this.field_45386);
            var1.println("gamma:" + this.field_45391);
            var1.println("renderDistance:" + this.field_45537);
            var1.println("entityDistanceScaling:" + this.field_45475);
            var1.println("guiScale:" + this.field_45484);
            var1.println("particles:" + this.field_45505.method_45045());
            var1.println("maxFps:" + this.field_45439);
            var1.println("difficulty:" + this.field_45494.method_2097());
            var1.println("graphicsMode:" + this.field_45397.method_21386());
            var1.println("ao:" + this.field_45533.method_28277());
            var1.println("biomeBlendRadius:" + this.field_45526);
            switch (this.field_45551) {
               case field_49167:
                  var1.println("renderClouds:true");
                  break;
               case field_49170:
                  var1.println("renderClouds:fast");
                  break;
               case field_49168:
                  var1.println("renderClouds:false");
            }

            var1.println("resourcePacks:" + field_45429.toJson(this.field_45387));
            var1.println("incompatibleResourcePacks:" + field_45429.toJson(this.field_45401));
            var1.println("lastServer:" + this.field_45414);
            var1.println("lang:" + this.field_45437);
            var1.println("chatVisibility:" + this.field_45443.method_8014());
            var1.println("chatOpacity:" + this.field_45402);
            var1.println("chatLineSpacing:" + this.field_45465);
            var1.println("textBackgroundOpacity:" + this.field_45563);
            var1.println("backgroundForChatOnly:" + this.field_45399);
            if (this.field_45495.method_8552().method_43175().isPresent()) {
               var1.println("fullscreenResolution:" + this.field_45495.method_8552().method_43175().get().method_25889());
            }

            var1.println("hideServerAddress:" + this.field_45513);
            var1.println("advancedItemTooltips:" + this.field_45482);
            var1.println("pauseOnLostFocus:" + this.field_45426);
            var1.println("overrideWidth:" + this.field_45491);
            var1.println("overrideHeight:" + this.field_45424);
            var1.println("heldItemTooltips:" + this.field_45477);
            var1.println("chatHeightFocused:" + this.field_45480);
            var1.println("chatDelay: " + this.field_45479);
            var1.println("chatHeightUnfocused:" + this.field_45488);
            var1.println("chatScale:" + this.field_45419);
            var1.println("chatWidth:" + (float)this.field_45388);
            var1.println("mipmapLevels:" + this.field_45577);
            var1.println("useNativeTransport:" + this.field_45544);
            var1.println("mainHand:" + (this.field_45569 == class_1736.field_8940 ? "left" : "right"));
            var1.println("attackIndicator:" + this.field_45555.method_40705());
            var1.println("narrator:" + this.field_45459.method_18743());
            var1.println("tutorialStep:" + this.field_45410.method_28503());
            var1.println("mouseWheelSensitivity:" + this.field_45578);
            var1.println("rawMouseInput:" + class_1013.field_5299.method_22129(this));
            var1.println("glDebugVerbosity:" + this.field_45542);
            var1.println("skipMultiplayerWarning:" + this.field_45481);
            var1.println("hideMatchedNames:" + this.field_45405);
            var1.println("joinedFirstServer:" + this.field_45519);
            var1.println("syncChunkWrites:" + this.field_45514);

            for (class_5916 var6 : this.field_45395) {
               if (class_7860.field_39844.method_3596()) {
                  String var7 = "key_" + var6.method_27055() + ":" + var6.method_27069();
                  Object var8 = class_7860.method_35555(var6, class_7860.field_39844);
                  Object var9 = class_7860.method_35559(class_7860.field_39991);
                  var1.println(var8 != var9 ? var7 + ":" + var8 : var7);
               } else {
                  var1.println("key_" + var6.method_27055() + ":" + var6.method_27069());
               }
            }

            for (class_562 var27 : class_562.values()) {
               var1.println("soundCategory_" + var27.method_2681() + ":" + this.method_40885(var27));
            }

            for (class_7742 var28 : class_7742.values()) {
               var1.println("modelPart_" + var28.method_35039() + ":" + this.field_45503.contains(var28));
            }
         } catch (Exception var20) {
            field_45573.error("Failed to save options", var20);
         }

         this.method_40891();
         this.method_40870();
      }
   }

   public float method_40885(class_562 var1) {
      return this.field_45576.containsKey(var1) ? this.field_45576.get(var1) : 1.0F;
   }

   public void method_40886(class_562 var1, float var2) {
      this.field_45576.put(var1, var2);
      this.field_45495.method_8590().method_16349(var1, var2);
   }

   public void method_40870() {
      if (this.field_45495.field_9632 != null) {
         int var1 = 0;

         for (class_7742 var3 : this.field_45503) {
            var1 |= var3.method_35037();
         }

         this.field_45495
            .field_9632
            .field_30532
            .method_4813(new class_8244(this.field_45437, this.field_45537, this.field_45443, this.field_45554, var1, this.field_45569));
      }
   }

   public Set<class_7742> method_40883() {
      return ImmutableSet.copyOf(this.field_45503);
   }

   public void method_40875(class_7742 var1, boolean var2) {
      if (var2) {
         this.field_45503.add(var1);
      } else {
         this.field_45503.remove(var1);
      }

      this.method_40870();
   }

   public void method_40864(class_7742 var1) {
      if (this.method_40883().contains(var1)) {
         this.field_45503.remove(var1);
      } else {
         this.field_45503.add(var1);
      }

      this.method_40870();
   }

   public class_9655 method_40860() {
      return this.field_45537 >= 4 ? this.field_45551 : class_9655.field_49168;
   }

   public boolean method_40877() {
      return this.field_45544;
   }

   public void method_40893(class_1013 var1, double var2) {
      if (var1 == class_1013.field_5221) {
         this.field_45398 = var2;
      }

      if (var1 == class_1013.field_5260) {
         this.field_45438 = var2;
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5293) {
         int var4 = (int)var2;
         if (var4 > 0 && class_3111.method_14424()) {
            class_3111.method_14428(class_3458.method_15912("of.message.aa.shaders1"), class_3458.method_15912("of.message.aa.shaders2"));
            return;
         }

         int[] var5 = new int[]{0, 2, 4, 6, 8, 12, 16};
         this.field_45527 = 0;

         for (int var6 = 0; var6 < var5.length; var6++) {
            if (var4 >= var5[var6]) {
               this.field_45527 = var5[var6];
            }
         }

         this.field_45527 = class_3111.method_14263(this.field_45527, 0, 16);
      }

      if (var1 == class_1013.field_5310) {
         int var7 = (int)var2;
         if (var7 > 1 && class_3111.method_14424()) {
            class_3111.method_14428(class_3458.method_15912("of.message.af.shaders1"), class_3458.method_15912("of.message.af.shaders2"));
            return;
         }

         this.field_45528 = 1;

         while (this.field_45528 * 2 <= var7) {
            this.field_45528 *= 2;
         }

         this.field_45528 = class_3111.method_14263(this.field_45528, 1, 16);
         this.field_45495.reloadResourcesConcurrently();
      }

      if (var1 == class_1013.field_5297) {
         int var8 = (int)var2;
         this.field_45545 = class_3111.method_14263(var8, 0, 3);
         this.method_40879();
      }
   }

   public double method_40895(class_1013 var1) {
      if (var1 == class_1013.field_5221) {
         return this.field_45398;
      } else if (var1 == class_1013.field_5260) {
         return this.field_45438;
      } else if (var1 == class_1013.field_5293) {
         return (double)this.field_45527;
      } else if (var1 == class_1013.field_5310) {
         return (double)this.field_45528;
      } else if (var1 == class_1013.field_5297) {
         return (double)this.field_45545;
      } else if (var1 != class_1013.field_5277) {
         return Float.MAX_VALUE;
      } else {
         return (double)this.field_45439 == class_1013.field_5277.method_38573() && this.field_45502 ? 0.0 : (double)this.field_45439;
      }
   }

   public void method_40892(class_1013 var1, int var2) {
      if (var1 == class_1013.field_5298) {
         switch (this.field_45497) {
            case 1:
               this.field_45497 = 2;
               if (!class_3111.method_14408()) {
                  this.field_45497 = 3;
               }
               break;
            case 2:
               this.field_45497 = 3;
               break;
            case 3:
               this.field_45497 = 1;
               break;
            default:
               this.field_45497 = 1;
         }
      }

      if (var1 == class_1013.field_5252) {
         this.field_45428 += 0.2F;
         if (this.field_45428 > 0.81F) {
            this.field_45428 = 0.2F;
         }
      }

      if (var1 == class_1013.field_5280) {
         this.field_45432 = !this.field_45432;
      }

      if (var1 == class_1013.field_5308) {
         this.field_45446 = !this.field_45446;
         class_3111.method_14430();
      }

      if (var1 == class_1013.field_5245) {
         this.field_45550++;
         if (this.field_45550 > 3) {
            this.field_45550 = 0;
         }

         this.method_40878();
      }

      if (var1 == class_1013.field_5257) {
         this.field_45553 = method_40889(this.field_45553, field_45436);
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5229) {
         this.field_45448++;
         if (this.field_45448 > 2) {
            this.field_45448 = 0;
         }
      }

      if (var1 == class_1013.field_5215) {
         this.field_45394++;
         if (this.field_45394 > 3) {
            this.field_45394 = 0;
         }
      }

      if (var1 == class_1013.field_5318) {
         this.field_45520++;
         if (this.field_45520 == 1) {
            this.field_45520++;
         }

         if (this.field_45520 > 2) {
            this.field_45520 = 0;
         }
      }

      if (var1 == class_1013.field_5294) {
         this.field_45389++;
         if (this.field_45389 == 1) {
            this.field_45389++;
         }

         if (this.field_45389 > 2) {
            this.field_45389 = 0;
         }
      }

      if (var1 == class_1013.field_5240) {
         this.field_45508 = !this.field_45508;
      }

      if (var1 == class_1013.field_5194) {
         this.field_45566 = !this.field_45566;
      }

      if (var1 == class_1013.field_5237) {
         this.field_45392 = !this.field_45392;
      }

      if (var1 == class_1013.field_5287) {
         this.field_45447 = !this.field_45447;
      }

      if (var1 == class_1013.field_5193) {
         this.field_45473 = !this.field_45473;
      }

      if (var1 == class_1013.field_5214) {
         this.field_45461 = !this.field_45461;
      }

      if (var1 == class_1013.field_5189) {
         this.field_45501 = !this.field_45501;
      }

      if (var1 == class_1013.field_5211) {
         this.field_45489 = !this.field_45489;
      }

      if (var1 == class_1013.field_5226) {
         this.field_45572 = !this.field_45572;
      }

      if (var1 == class_1013.field_5317) {
         this.field_45433 = !this.field_45433;
      }

      if (var1 == class_1013.field_5191) {
         this.field_45557 = !this.field_45557;
      }

      if (var1 == class_1013.field_5204) {
         this.field_45498 = !this.field_45498;
      }

      if (var1 == class_1013.field_5216) {
         this.field_45456 = !this.field_45456;
      }

      if (var1 == class_1013.field_5279) {
         this.field_45516 = !this.field_45516;
      }

      if (var1 == class_1013.field_5276) {
         this.field_45510 = !this.field_45510;
      }

      if (var1 == class_1013.field_5312) {
         this.field_45509 = !this.field_45509;
      }

      if (var1 == class_1013.field_5190) {
         this.field_45385 = !this.field_45385;
      }

      if (var1 == class_1013.field_5205) {
         short var3 = 900;
         this.field_45476 = Math.max(this.field_45476 / var3 * var3, var3);
         this.field_45476 *= 2;
         if (this.field_45476 > 32 * var3) {
            this.field_45476 = var3;
         }
      }

      if (var1 == class_1013.field_5210) {
         this.field_45449++;
         if (this.field_45449 > 3) {
            this.field_45449 = 1;
         }

         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5212) {
         this.field_45529++;
         if (this.field_45529 > 3) {
            this.field_45529 = 1;
         }

         if (this.field_45529 == 2) {
            this.field_45495.worldRenderer.method_19998();
         } else {
            this.field_45495.reloadResourcesConcurrently();
         }
      }

      if (var1 == class_1013.field_5296) {
         this.field_45540 = !this.field_45540;
      }

      if (var1 == class_1013.field_5269) {
         this.field_45547 = !this.field_45547;
      }

      if (var1 == class_1013.field_5285) {
         this.field_45425 = !this.field_45425;
      }

      if (var1 == class_1013.field_5213) {
         this.field_45580 = !this.field_45580;
      }

      if (var1 == class_1013.field_5244) {
         this.field_45404++;
         if (this.field_45404 > 2) {
            this.field_45404 = 0;
         }
      }

      if (var1 == class_1013.field_5316) {
         this.field_45536++;
         if (this.field_45536 > 5) {
            this.field_45536 = 1;
         }
      }

      if (var1 == class_1013.field_5274) {
         this.field_45474 = !this.field_45474;
      }

      if (var1 == class_1013.field_5242) {
         this.field_45492++;
         if (this.field_45492 > 2) {
            this.field_45492 = 0;
         }
      }

      if (var1 == class_1013.field_5196) {
         this.field_45523 = !this.field_45523;
      }

      if (var1 == class_1013.field_5209) {
         this.field_45468 = !this.field_45468;
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5220) {
         this.field_45531 = !this.field_45531;
         class_9300.method_42896();
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5283) {
         this.field_45490 = !this.field_45490;
         class_8192.method_37528();
      }

      if (var1 == class_1013.field_5217) {
         this.field_45427 = !this.field_45427;
         class_4077.method_18798();
      }

      if (var1 == class_1013.field_5261) {
         this.field_45408 = !this.field_45408;
         class_9300.method_42905();
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5249) {
         this.field_45417 = !this.field_45417;
         this.field_45495.reloadResourcesConcurrently();
      }

      if (var1 == class_1013.field_5253) {
         this.field_45413 = !this.field_45413;
         class_6167.method_28270();
      }

      if (var1 == class_1013.field_5233) {
         this.field_45518 = !this.field_45518;
      }

      if (var1 == class_1013.field_5206) {
         this.field_45507 = !this.field_45507;
         class_3475.method_15968();
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5247) {
         this.field_45431 = !this.field_45431;
         this.field_45495.reloadResourcesConcurrently();
      }

      if (var1 == class_1013.field_5235) {
         this.field_45454 = !this.field_45454;
         class_9299.field_47437 = this.field_45454;
      }

      if (var1 == class_1013.field_5238) {
         this.field_45546 = !this.field_45546;
      }

      if (var1 == class_1013.field_5202) {
         if (this.field_45532 == 0) {
            this.field_45532 = 1;
         } else if (this.field_45532 == 1) {
            this.field_45532 = 2;
         } else if (this.field_45532 == 2) {
            this.field_45532 = 0;
         } else {
            this.field_45532 = 0;
         }

         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5218) {
         this.field_45406 = !this.field_45406;
      }

      if (var1 == class_1013.field_5223) {
         this.field_45538 = !this.field_45538;
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5255) {
         this.field_45478 = !this.field_45478;
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5311) {
         this.field_45524 = !this.field_45524;
      }

      if (var1 == class_1013.field_5278) {
         this.field_45506 = !this.field_45506;
         this.field_45495.worldRenderer.method_19998();
      }

      if (var1 == class_1013.field_5282) {
         this.field_45571 = method_40889(this.field_45571, field_45423);
         class_8421.method_38769(this.field_45495.worldRenderer);
      }

      if (var1 == class_1013.field_5248) {
         this.field_45487++;
         if (this.field_45487 > 4) {
            this.field_45487 = 1;
         }
      }

      if (var1 == class_1013.field_5302) {
         this.field_45539 = !this.field_45539;
         this.field_45495.reloadResourcesConcurrently();
      }

      if (var1 == class_1013.field_5315) {
         this.field_45511 = !this.field_45511;
         class_1322.method_6046();
      }

      if (var1 == class_1013.field_5313) {
         this.field_45558 = !this.field_45558;
      }

      if (var1 == class_1013.field_5263) {
         this.field_45477 = !this.field_45477;
      }

      if (var1 == class_1013.field_5200) {
         this.field_45482 = !this.field_45482;
      }

      if (var1 == class_1013.field_5197) {
         if (this.field_45574 == 0) {
            this.field_45574 = 5;
         } else if (this.field_45574 == 5) {
            this.field_45574 = 3;
         } else {
            this.field_45574 = 0;
         }
      }

      if (var1 == class_1013.field_5241) {
         this.field_45472 = !this.field_45472;
      }
   }

   public ITextComponent method_40882(class_1013 var1) {
      String var2 = this.method_40887(var1);
      return new StringTextComponent(var2);
   }

   public String method_40887(class_1013 var1) {
      String var2 = class_6956.method_31803(var1.method_4491()) + ": ";
      if (var2 == null) {
         var2 = var1.method_4491();
      }

      if (var1 == class_1013.field_5250) {
         int var12 = (int)class_1013.field_5250.method_38570(this);
         String var13 = class_6956.method_31803("of.options.renderDistance.tiny");
         byte var5 = 2;
         if (var12 >= 4) {
            var13 = class_6956.method_31803("of.options.renderDistance.short");
            var5 = 4;
         }

         if (var12 >= 8) {
            var13 = class_6956.method_31803("of.options.renderDistance.normal");
            var5 = 8;
         }

         if (var12 >= 16) {
            var13 = class_6956.method_31803("of.options.renderDistance.far");
            var5 = 16;
         }

         if (var12 >= 32) {
            var13 = class_3458.method_15912("of.options.renderDistance.extreme");
            var5 = 32;
         }

         if (var12 >= 48) {
            var13 = class_3458.method_15912("of.options.renderDistance.insane");
            var5 = 48;
         }

         if (var12 >= 64) {
            var13 = class_3458.method_15912("of.options.renderDistance.ludicrous");
            var5 = 64;
         }

         int var6 = this.field_45537 - var5;
         String var7 = var13;
         if (var6 > 0) {
            var7 = var13 + "+";
         }

         return var2 + var12 + " " + var7 + "";
      } else if (var1 == class_1013.field_5298) {
         switch (this.field_45497) {
            case 1:
               return var2 + class_3458.method_15903();
            case 2:
               return var2 + class_3458.method_15906();
            case 3:
               return var2 + class_3458.method_15902();
            default:
               return var2 + class_3458.method_15902();
         }
      } else if (var1 == class_1013.field_5252) {
         return var2 + this.field_45428;
      } else if (var1 == class_1013.field_5297) {
         switch (this.field_45545) {
            case 0:
               return var2 + class_3458.method_15912("of.options.mipmap.nearest");
            case 1:
               return var2 + class_3458.method_15912("of.options.mipmap.linear");
            case 2:
               return var2 + class_3458.method_15912("of.options.mipmap.bilinear");
            case 3:
               return var2 + class_3458.method_15912("of.options.mipmap.trilinear");
            default:
               return var2 + "of.options.mipmap.nearest";
         }
      } else if (var1 == class_1013.field_5280) {
         return this.field_45432 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5308) {
         return this.field_45446 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5245) {
         switch (this.field_45550) {
            case 1:
               return var2 + class_3458.method_15903();
            case 2:
               return var2 + class_3458.method_15906();
            case 3:
               return var2 + class_3458.method_15902();
            default:
               return var2 + class_3458.method_15911();
         }
      } else if (var1 == class_1013.field_5257) {
         switch (this.field_45553) {
            case 1:
               return var2 + class_3458.method_15903();
            case 2:
               return var2 + class_3458.method_15906();
            case 3:
            default:
               return var2 + class_3458.method_15911();
            case 4:
               return var2 + class_3458.method_15912("of.general.smart");
         }
      } else if (var1 == class_1013.field_5229) {
         switch (this.field_45448) {
            case 1:
               return var2 + class_3458.method_15903();
            case 2:
               return var2 + class_3458.method_15906();
            default:
               return var2 + class_3458.method_15911();
         }
      } else if (var1 == class_1013.field_5215) {
         switch (this.field_45394) {
            case 1:
               return var2 + class_3458.method_15903();
            case 2:
               return var2 + class_3458.method_15906();
            case 3:
               return var2 + class_3458.method_15902();
            default:
               return var2 + class_3458.method_15911();
         }
      } else if (var1 == class_1013.field_5318) {
         switch (this.field_45520) {
            case 1:
               return var2 + class_3458.method_15912("of.options.animation.dynamic");
            case 2:
               return var2 + class_3458.method_15902();
            default:
               return var2 + class_3458.method_15907();
         }
      } else if (var1 == class_1013.field_5294) {
         switch (this.field_45389) {
            case 1:
               return var2 + class_3458.method_15912("of.options.animation.dynamic");
            case 2:
               return var2 + class_3458.method_15902();
            default:
               return var2 + class_3458.method_15907();
         }
      } else if (var1 == class_1013.field_5240) {
         return this.field_45508 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5194) {
         return this.field_45566 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5237) {
         return this.field_45392 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5287) {
         return this.field_45447 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5193) {
         return this.field_45473 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5214) {
         return this.field_45461 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5189) {
         return this.field_45501 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5211) {
         return this.field_45489 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5226) {
         return this.field_45572 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5317) {
         return this.field_45433 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5191) {
         return this.field_45557 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5204) {
         return this.field_45498 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5216) {
         return this.field_45456 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5279) {
         return this.field_45516 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5276) {
         return this.field_45510 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5312) {
         return this.field_45509 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5190) {
         return this.field_45385 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5205) {
         short var11 = 900;
         if (this.field_45476 <= var11) {
            return var2 + class_3458.method_15912("of.options.save.45s");
         } else if (this.field_45476 <= 2 * var11) {
            return var2 + class_3458.method_15912("of.options.save.90s");
         } else if (this.field_45476 <= 4 * var11) {
            return var2 + class_3458.method_15912("of.options.save.3min");
         } else if (this.field_45476 <= 8 * var11) {
            return var2 + class_3458.method_15912("of.options.save.6min");
         } else {
            return this.field_45476 <= 16 * var11
               ? var2 + class_3458.method_15912("of.options.save.12min")
               : var2 + class_3458.method_15912("of.options.save.24min");
         }
      } else if (var1 == class_1013.field_5210) {
         switch (this.field_45449) {
            case 1:
               return var2 + class_3458.method_15903();
            case 2:
               return var2 + class_3458.method_15906();
            default:
               return var2 + class_3458.method_15902();
         }
      } else if (var1 == class_1013.field_5212) {
         switch (this.field_45529) {
            case 1:
               return var2 + class_3458.method_15903();
            case 2:
               return var2 + class_3458.method_15906();
            default:
               return var2 + class_3458.method_15902();
         }
      } else if (var1 == class_1013.field_5296) {
         return this.field_45540 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5269) {
         return this.field_45547 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5285) {
         return this.field_45425 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5213) {
         return this.field_45580 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5244) {
         switch (this.field_45404) {
            case 1:
               return var2 + class_3458.method_15903();
            case 2:
               return var2 + class_3458.method_15906();
            default:
               return var2 + class_3458.method_15911();
         }
      } else if (var1 == class_1013.field_5316) {
         return var2 + this.field_45536;
      } else if (var1 == class_1013.field_5274) {
         return this.field_45474 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5242) {
         if (this.field_45492 == 1) {
            return var2 + class_3458.method_15912("of.options.time.dayOnly");
         } else {
            return this.field_45492 == 2 ? var2 + class_3458.method_15912("of.options.time.nightOnly") : var2 + class_3458.method_15911();
         }
      } else if (var1 == class_1013.field_5293) {
         String var10 = "";
         if (this.field_45527 != class_3111.method_14447()) {
            var10 = " (" + class_3458.method_15912("of.general.restart") + ")";
         }

         return this.field_45527 == 0 ? var2 + class_3458.method_15902() + var10 : var2 + this.field_45527 + var10;
      } else if (var1 == class_1013.field_5310) {
         return this.field_45528 == 1 ? var2 + class_3458.method_15902() : var2 + this.field_45528;
      } else if (var1 == class_1013.field_5196) {
         return this.field_45523 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5209) {
         return this.field_45468 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5220) {
         return this.field_45531 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5283) {
         return this.field_45490 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5217) {
         return this.field_45427 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5261) {
         return this.field_45408 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5253) {
         return this.field_45413 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5233) {
         return this.field_45518 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5249) {
         return this.field_45417 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5206) {
         return this.field_45507 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5247) {
         return this.field_45431 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5235) {
         return this.field_45454 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5238) {
         return this.field_45546 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5202) {
         if (this.field_45532 == 1) {
            return var2 + class_3458.method_15903();
         } else {
            return this.field_45532 == 2 ? var2 + class_3458.method_15906() : var2 + class_3458.method_15911();
         }
      } else if (var1 == class_1013.field_5218) {
         return this.field_45406 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5223) {
         return this.field_45538 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5255) {
         return this.field_45478 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5311) {
         return this.field_45524 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5278) {
         return this.field_45506 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5282) {
         int var9 = method_40871(this.field_45571, field_45423);
         return var2 + method_40890(field_45466, var9);
      } else if (var1 == class_1013.field_5248) {
         return this.field_45487 <= 1 ? var2 + class_3458.method_15911() : var2 + this.field_45487 + "x";
      } else if (var1 == class_1013.field_5302) {
         return this.field_45539 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5315) {
         return this.field_45511 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5313) {
         return this.field_45558 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5263) {
         return this.field_45477 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5200) {
         return this.field_45482 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 == class_1013.field_5277) {
         double var8 = class_1013.field_5277.method_38570(this);
         if (var8 == 0.0) {
            return var2 + class_3458.method_15912("of.options.framerateLimit.vsync");
         } else {
            return var8 == class_1013.field_5277.method_38573() ? var2 + class_6956.method_31803("options.framerateLimit.max") : var2 + (int)var8 + " fps";
         }
      } else if (var1 == class_1013.field_5197) {
         if (this.field_45574 == 3) {
            return var2 + class_3458.method_15902();
         } else {
            return this.field_45574 == 5 ? var2 + class_3458.method_15912("of.general.compact") : var2 + class_3458.method_15911();
         }
      } else if (var1 == class_1013.field_5241) {
         return this.field_45472 ? var2 + class_3458.method_15907() : var2 + class_3458.method_15902();
      } else if (var1 instanceof class_8369) {
         class_8369 var3 = (class_8369)var1;
         double var4 = var3.method_38570(this);
         return var4 == 0.0 ? var2 + class_6956.method_31803("options.off") : var2 + (int)(var4 * 100.0) + "%";
      } else {
         return null;
      }
   }

   public void method_40865() {
      try {
         File var1 = this.field_45457;
         if (!var1.exists()) {
            var1 = this.field_45579;
         }

         if (!var1.exists()) {
            return;
         }

         BufferedReader var2 = new BufferedReader(new InputStreamReader(new FileInputStream(var1), StandardCharsets.UTF_8));
         String var3 = "";

         while ((var3 = var2.readLine()) != null) {
            try {
               String[] var4 = var3.split(":");
               if (var4[0].equals("ofRenderDistanceChunks") && var4.length >= 2) {
                  this.field_45537 = Integer.valueOf(var4[1]);
                  this.field_45537 = class_3111.method_14263(this.field_45537, 2, 1024);
               }

               if (var4[0].equals("ofFogType") && var4.length >= 2) {
                  this.field_45497 = Integer.valueOf(var4[1]);
                  this.field_45497 = class_3111.method_14263(this.field_45497, 1, 3);
               }

               if (var4[0].equals("ofFogStart") && var4.length >= 2) {
                  this.field_45428 = Float.valueOf(var4[1]);
                  if (this.field_45428 < 0.2F) {
                     this.field_45428 = 0.2F;
                  }

                  if (this.field_45428 > 0.81F) {
                     this.field_45428 = 0.8F;
                  }
               }

               if (var4[0].equals("ofMipmapType") && var4.length >= 2) {
                  this.field_45545 = Integer.valueOf(var4[1]);
                  this.field_45545 = class_3111.method_14263(this.field_45545, 0, 3);
               }

               if (var4[0].equals("ofOcclusionFancy") && var4.length >= 2) {
                  this.field_45418 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothFps") && var4.length >= 2) {
                  this.field_45432 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothWorld") && var4.length >= 2) {
                  this.field_45446 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAoLevel") && var4.length >= 2) {
                  this.field_45438 = (double)Float.valueOf(var4[1]).floatValue();
                  this.field_45438 = class_3111.method_14261(this.field_45438, 0.0, 1.0);
               }

               if (var4[0].equals("ofClouds") && var4.length >= 2) {
                  this.field_45550 = Integer.valueOf(var4[1]);
                  this.field_45550 = class_3111.method_14263(this.field_45550, 0, 3);
                  this.method_40878();
               }

               if (var4[0].equals("ofCloudsHeight") && var4.length >= 2) {
                  this.field_45398 = (double)Float.valueOf(var4[1]).floatValue();
                  this.field_45398 = class_3111.method_14261(this.field_45398, 0.0, 1.0);
               }

               if (var4[0].equals("ofTrees") && var4.length >= 2) {
                  this.field_45553 = Integer.valueOf(var4[1]);
                  this.field_45553 = method_40874(this.field_45553, field_45436);
               }

               if (var4[0].equals("ofDroppedItems") && var4.length >= 2) {
                  this.field_45448 = Integer.valueOf(var4[1]);
                  this.field_45448 = class_3111.method_14263(this.field_45448, 0, 2);
               }

               if (var4[0].equals("ofRain") && var4.length >= 2) {
                  this.field_45394 = Integer.valueOf(var4[1]);
                  this.field_45394 = class_3111.method_14263(this.field_45394, 0, 3);
               }

               if (var4[0].equals("ofAnimatedWater") && var4.length >= 2) {
                  this.field_45520 = Integer.valueOf(var4[1]);
                  this.field_45520 = class_3111.method_14263(this.field_45520, 0, 2);
               }

               if (var4[0].equals("ofAnimatedLava") && var4.length >= 2) {
                  this.field_45389 = Integer.valueOf(var4[1]);
                  this.field_45389 = class_3111.method_14263(this.field_45389, 0, 2);
               }

               if (var4[0].equals("ofAnimatedFire") && var4.length >= 2) {
                  this.field_45508 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedPortal") && var4.length >= 2) {
                  this.field_45566 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedRedstone") && var4.length >= 2) {
                  this.field_45392 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedExplosion") && var4.length >= 2) {
                  this.field_45447 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedFlame") && var4.length >= 2) {
                  this.field_45473 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedSmoke") && var4.length >= 2) {
                  this.field_45461 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofVoidParticles") && var4.length >= 2) {
                  this.field_45501 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofWaterParticles") && var4.length >= 2) {
                  this.field_45489 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofPortalParticles") && var4.length >= 2) {
                  this.field_45572 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofPotionParticles") && var4.length >= 2) {
                  this.field_45433 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofFireworkParticles") && var4.length >= 2) {
                  this.field_45557 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDrippingWaterLava") && var4.length >= 2) {
                  this.field_45498 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedTerrain") && var4.length >= 2) {
                  this.field_45456 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedTextures") && var4.length >= 2) {
                  this.field_45516 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRainSplash") && var4.length >= 2) {
                  this.field_45510 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofLagometer") && var4.length >= 2) {
                  this.field_45509 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowFps") && var4.length >= 2) {
                  this.field_45385 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAutoSaveTicks") && var4.length >= 2) {
                  this.field_45476 = Integer.valueOf(var4[1]);
                  this.field_45476 = class_3111.method_14263(this.field_45476, 40, 40000);
               }

               if (var4[0].equals("ofBetterGrass") && var4.length >= 2) {
                  this.field_45449 = Integer.valueOf(var4[1]);
                  this.field_45449 = class_3111.method_14263(this.field_45449, 1, 3);
               }

               if (var4[0].equals("ofConnectedTextures") && var4.length >= 2) {
                  this.field_45529 = Integer.valueOf(var4[1]);
                  this.field_45529 = class_3111.method_14263(this.field_45529, 1, 3);
               }

               if (var4[0].equals("ofWeather") && var4.length >= 2) {
                  this.field_45540 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSky") && var4.length >= 2) {
                  this.field_45547 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofStars") && var4.length >= 2) {
                  this.field_45425 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSunMoon") && var4.length >= 2) {
                  this.field_45580 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofVignette") && var4.length >= 2) {
                  this.field_45404 = Integer.valueOf(var4[1]);
                  this.field_45404 = class_3111.method_14263(this.field_45404, 0, 2);
               }

               if (var4[0].equals("ofChunkUpdates") && var4.length >= 2) {
                  this.field_45536 = Integer.valueOf(var4[1]);
                  this.field_45536 = class_3111.method_14263(this.field_45536, 1, 5);
               }

               if (var4[0].equals("ofChunkUpdatesDynamic") && var4.length >= 2) {
                  this.field_45474 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofTime") && var4.length >= 2) {
                  this.field_45492 = Integer.valueOf(var4[1]);
                  this.field_45492 = class_3111.method_14263(this.field_45492, 0, 2);
               }

               if (var4[0].equals("ofAaLevel") && var4.length >= 2) {
                  this.field_45527 = Integer.valueOf(var4[1]);
                  this.field_45527 = class_3111.method_14263(this.field_45527, 0, 16);
               }

               if (var4[0].equals("ofAfLevel") && var4.length >= 2) {
                  this.field_45528 = Integer.valueOf(var4[1]);
                  this.field_45528 = class_3111.method_14263(this.field_45528, 1, 16);
               }

               if (var4[0].equals("ofProfiler") && var4.length >= 2) {
                  this.field_45523 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofBetterSnow") && var4.length >= 2) {
                  this.field_45468 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSwampColors") && var4.length >= 2) {
                  this.field_45531 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRandomEntities") && var4.length >= 2) {
                  this.field_45490 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomFonts") && var4.length >= 2) {
                  this.field_45427 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomColors") && var4.length >= 2) {
                  this.field_45408 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomItems") && var4.length >= 2) {
                  this.field_45417 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomSky") && var4.length >= 2) {
                  this.field_45413 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowCapes") && var4.length >= 2) {
                  this.field_45518 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofNaturalTextures") && var4.length >= 2) {
                  this.field_45507 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofEmissiveTextures") && var4.length >= 2) {
                  this.field_45431 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofLazyChunkLoading") && var4.length >= 2) {
                  this.field_45406 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRenderRegions") && var4.length >= 2) {
                  this.field_45538 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmartAnimations") && var4.length >= 2) {
                  this.field_45478 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDynamicFov") && var4.length >= 2) {
                  this.field_45524 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAlternateBlocks") && var4.length >= 2) {
                  this.field_45506 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDynamicLights") && var4.length >= 2) {
                  this.field_45571 = Integer.valueOf(var4[1]);
                  this.field_45571 = method_40874(this.field_45571, field_45423);
               }

               if (var4[0].equals("ofScreenshotSize") && var4.length >= 2) {
                  this.field_45487 = Integer.valueOf(var4[1]);
                  this.field_45487 = class_3111.method_14263(this.field_45487, 1, 4);
               }

               if (var4[0].equals("ofCustomEntityModels") && var4.length >= 2) {
                  this.field_45539 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomGuis") && var4.length >= 2) {
                  this.field_45511 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowGlErrors") && var4.length >= 2) {
                  this.field_45558 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofFastMath") && var4.length >= 2) {
                  this.field_45454 = Boolean.valueOf(var4[1]);
                  class_9299.field_47437 = this.field_45454;
               }

               if (var4[0].equals("ofFastRender") && var4.length >= 2) {
                  this.field_45546 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofTranslucentBlocks") && var4.length >= 2) {
                  this.field_45532 = Integer.valueOf(var4[1]);
                  this.field_45532 = class_3111.method_14263(this.field_45532, 0, 2);
               }

               if (var4[0].equals("ofChatBackground") && var4.length >= 2) {
                  this.field_45574 = Integer.valueOf(var4[1]);
               }

               if (var4[0].equals("ofChatShadow") && var4.length >= 2) {
                  this.field_45472 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("key_" + this.field_45548.method_27055())) {
                  this.field_45548.method_27057(class_9732.method_44939(var4[1]));
               }
            } catch (Exception var5) {
               class_3111.method_14277("Skipping bad option: " + var3);
               var5.printStackTrace();
            }
         }

         class_9835.method_45329(this.field_45395, new class_5916[]{this.field_45548});
         class_5916.method_27067();
         var2.close();
      } catch (Exception var6) {
         class_3111.method_14317("Failed to load options");
         var6.printStackTrace();
      }
   }

   public void method_40891() {
      try {
         PrintWriter var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.field_45457), StandardCharsets.UTF_8));
         var1.println("ofFogType:" + this.field_45497);
         var1.println("ofFogStart:" + this.field_45428);
         var1.println("ofMipmapType:" + this.field_45545);
         var1.println("ofOcclusionFancy:" + this.field_45418);
         var1.println("ofSmoothFps:" + this.field_45432);
         var1.println("ofSmoothWorld:" + this.field_45446);
         var1.println("ofAoLevel:" + this.field_45438);
         var1.println("ofClouds:" + this.field_45550);
         var1.println("ofCloudsHeight:" + this.field_45398);
         var1.println("ofTrees:" + this.field_45553);
         var1.println("ofDroppedItems:" + this.field_45448);
         var1.println("ofRain:" + this.field_45394);
         var1.println("ofAnimatedWater:" + this.field_45520);
         var1.println("ofAnimatedLava:" + this.field_45389);
         var1.println("ofAnimatedFire:" + this.field_45508);
         var1.println("ofAnimatedPortal:" + this.field_45566);
         var1.println("ofAnimatedRedstone:" + this.field_45392);
         var1.println("ofAnimatedExplosion:" + this.field_45447);
         var1.println("ofAnimatedFlame:" + this.field_45473);
         var1.println("ofAnimatedSmoke:" + this.field_45461);
         var1.println("ofVoidParticles:" + this.field_45501);
         var1.println("ofWaterParticles:" + this.field_45489);
         var1.println("ofPortalParticles:" + this.field_45572);
         var1.println("ofPotionParticles:" + this.field_45433);
         var1.println("ofFireworkParticles:" + this.field_45557);
         var1.println("ofDrippingWaterLava:" + this.field_45498);
         var1.println("ofAnimatedTerrain:" + this.field_45456);
         var1.println("ofAnimatedTextures:" + this.field_45516);
         var1.println("ofRainSplash:" + this.field_45510);
         var1.println("ofLagometer:" + this.field_45509);
         var1.println("ofShowFps:" + this.field_45385);
         var1.println("ofAutoSaveTicks:" + this.field_45476);
         var1.println("ofBetterGrass:" + this.field_45449);
         var1.println("ofConnectedTextures:" + this.field_45529);
         var1.println("ofWeather:" + this.field_45540);
         var1.println("ofSky:" + this.field_45547);
         var1.println("ofStars:" + this.field_45425);
         var1.println("ofSunMoon:" + this.field_45580);
         var1.println("ofVignette:" + this.field_45404);
         var1.println("ofChunkUpdates:" + this.field_45536);
         var1.println("ofChunkUpdatesDynamic:" + this.field_45474);
         var1.println("ofTime:" + this.field_45492);
         var1.println("ofAaLevel:" + this.field_45527);
         var1.println("ofAfLevel:" + this.field_45528);
         var1.println("ofProfiler:" + this.field_45523);
         var1.println("ofBetterSnow:" + this.field_45468);
         var1.println("ofSwampColors:" + this.field_45531);
         var1.println("ofRandomEntities:" + this.field_45490);
         var1.println("ofCustomFonts:" + this.field_45427);
         var1.println("ofCustomColors:" + this.field_45408);
         var1.println("ofCustomItems:" + this.field_45417);
         var1.println("ofCustomSky:" + this.field_45413);
         var1.println("ofShowCapes:" + this.field_45518);
         var1.println("ofNaturalTextures:" + this.field_45507);
         var1.println("ofEmissiveTextures:" + this.field_45431);
         var1.println("ofLazyChunkLoading:" + this.field_45406);
         var1.println("ofRenderRegions:" + this.field_45538);
         var1.println("ofSmartAnimations:" + this.field_45478);
         var1.println("ofDynamicFov:" + this.field_45524);
         var1.println("ofAlternateBlocks:" + this.field_45506);
         var1.println("ofDynamicLights:" + this.field_45571);
         var1.println("ofScreenshotSize:" + this.field_45487);
         var1.println("ofCustomEntityModels:" + this.field_45539);
         var1.println("ofCustomGuis:" + this.field_45511);
         var1.println("ofShowGlErrors:" + this.field_45558);
         var1.println("ofFastMath:" + this.field_45454);
         var1.println("ofFastRender:" + this.field_45546);
         var1.println("ofTranslucentBlocks:" + this.field_45532);
         var1.println("ofChatBackground:" + this.field_45574);
         var1.println("ofChatShadow:" + this.field_45472);
         var1.println("key_" + this.field_45548.method_27055() + ":" + this.field_45548.method_27069());
         var1.close();
      } catch (Exception var2) {
         class_3111.method_14317("Failed to save options");
         var2.printStackTrace();
      }
   }

   public void method_40878() {
      switch (this.field_45550) {
         case 1:
            this.field_45551 = class_9655.field_49170;
            break;
         case 2:
            this.field_45551 = class_9655.field_49167;
            break;
         case 3:
            this.field_45551 = class_9655.field_49168;
            break;
         default:
            if (this.field_45397 != class_4615.field_22434) {
               this.field_45551 = class_9655.field_49167;
            } else {
               this.field_45551 = class_9655.field_49170;
            }
      }

      if (this.field_45397 == class_4615.field_22433) {
         WorldRenderer var1 = MinecraftClient.getInstance().worldRenderer;
         if (var1 != null) {
            class_4230 var2 = var1.method_20091();
            if (var2 != null) {
               var2.method_19712(MinecraftClient.IS_SYSTEM_MAC);
            }
         }
      }
   }

   public void method_40866() {
      this.field_45537 = 8;
      this.field_45475 = 1.0F;
      this.field_45512 = true;
      this.field_45439 = (int)class_1013.field_5277.method_38573();
      this.field_45502 = false;
      this.method_40862();
      this.field_45577 = 4;
      this.field_45397 = class_4615.field_22437;
      this.field_45533 = class_6168.field_31562;
      this.field_45551 = class_9655.field_49167;
      this.field_45543 = 70.0;
      this.field_45391 = 0.0;
      this.field_45484 = 0;
      this.field_45505 = class_9761.field_49571;
      this.field_45477 = true;
      this.field_45463 = false;
      this.field_45497 = 1;
      this.field_45428 = 0.8F;
      this.field_45545 = 0;
      this.field_45418 = false;
      this.field_45478 = false;
      this.field_45432 = false;
      class_3111.method_14344();
      this.field_45446 = class_3111.method_14411();
      this.field_45406 = false;
      this.field_45538 = false;
      this.field_45454 = false;
      this.field_45546 = false;
      this.field_45532 = 0;
      this.field_45524 = true;
      this.field_45506 = true;
      this.field_45571 = 3;
      this.field_45487 = 1;
      this.field_45539 = true;
      this.field_45511 = true;
      this.field_45558 = true;
      this.field_45574 = 0;
      this.field_45472 = true;
      this.field_45438 = 1.0;
      this.field_45527 = 0;
      this.field_45528 = 1;
      this.field_45550 = 0;
      this.field_45398 = 0.0;
      this.field_45553 = 0;
      this.field_45394 = 0;
      this.field_45449 = 3;
      this.field_45476 = 4000;
      this.field_45509 = false;
      this.field_45385 = false;
      this.field_45523 = false;
      this.field_45540 = true;
      this.field_45547 = true;
      this.field_45425 = true;
      this.field_45580 = true;
      this.field_45404 = 0;
      this.field_45536 = 1;
      this.field_45474 = false;
      this.field_45492 = 0;
      this.field_45468 = false;
      this.field_45531 = true;
      this.field_45490 = true;
      this.field_45526 = 2;
      this.field_45427 = true;
      this.field_45408 = true;
      this.field_45417 = true;
      this.field_45413 = true;
      this.field_45518 = true;
      this.field_45529 = 2;
      this.field_45507 = false;
      this.field_45431 = true;
      this.field_45520 = 0;
      this.field_45389 = 0;
      this.field_45508 = true;
      this.field_45566 = true;
      this.field_45392 = true;
      this.field_45447 = true;
      this.field_45473 = true;
      this.field_45461 = true;
      this.field_45501 = true;
      this.field_45489 = true;
      this.field_45510 = true;
      this.field_45572 = true;
      this.field_45433 = true;
      this.field_45557 = true;
      this.field_45498 = true;
      this.field_45456 = true;
      this.field_45516 = true;
      class_6588.method_30319("OFF");
      class_6588.field_33631 = 0;
      class_6588.method_30259();
      class_6588.method_30272();
      this.field_45495.reloadResourcesConcurrently();
      this.method_40873();
   }

   public void method_40862() {
      if (this.field_45495.method_8552() != null) {
         this.field_45495.method_8552().method_43162(this.field_45502);
      }
   }

   public void method_40879() {
      this.field_45495.method_8571(this.field_45577);
      this.field_45495.reloadResourcesConcurrently();
   }

   public void method_40896(boolean var1) {
      int var2 = var1 ? 0 : 2;
      this.field_45520 = var2;
      this.field_45389 = var2;
      this.field_45508 = var1;
      this.field_45566 = var1;
      this.field_45392 = var1;
      this.field_45447 = var1;
      this.field_45473 = var1;
      this.field_45461 = var1;
      this.field_45501 = var1;
      this.field_45489 = var1;
      this.field_45510 = var1;
      this.field_45572 = var1;
      this.field_45433 = var1;
      this.field_45557 = var1;
      this.field_45505 = var1 ? class_9761.field_49571 : class_9761.field_49573;
      this.field_45498 = var1;
      this.field_45456 = var1;
      this.field_45516 = var1;
   }

   private static int method_40889(int var0, int[] var1) {
      int var2 = method_40871(var0, var1);
      if (var2 < 0) {
         return var1[0];
      } else {
         if (++var2 >= var1.length) {
            var2 = 0;
         }

         return var1[var2];
      }
   }

   private static int method_40874(int var0, int[] var1) {
      int var2 = method_40871(var0, var1);
      return var2 < 0 ? var1[0] : var0;
   }

   private static int method_40871(int var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == var0) {
            return var2;
         }
      }

      return -1;
   }

   private static String method_40890(String[] var0, int var1) {
      if (var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      return class_6956.method_31803(var0[var1]);
   }

   private void method_40876() {
      if (class_7860.field_40013.method_7978() && class_7860.field_40068.method_3596()) {
         Object var1 = class_7860.method_35559(class_7860.field_40013);
         class_7860.method_35555(this.keyForward, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyLeft, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyBack, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyRight, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyJump, class_7860.field_40068, var1);
         class_7860.method_35555(this.keySneak, class_7860.field_40068, var1);
         class_7860.method_35555(this.keySprint, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyAttack, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyOpenChat, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyPlayerList, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyTypeCommand, class_7860.field_40068, var1);
         class_7860.method_35555(this.keyPerspectiveSwitch, class_7860.field_40068, var1);
         class_7860.method_35555(this.keySmoothCamera, class_7860.field_40068, var1);
      }
   }

   public void method_40861(class_6354 var1) {
      LinkedHashSet var2 = Sets.newLinkedHashSet();
      Iterator var3 = this.field_45387.iterator();

      while (var3.hasNext()) {
         String var4 = (String)var3.next();
         class_5522 var5 = var1.method_29120(var4);
         if (var5 == null && !var4.startsWith("file/")) {
            var5 = var1.method_29120("file/" + var4);
         }

         if (var5 == null) {
            field_45573.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", var4);
            var3.remove();
         } else if (!var5.method_25022().method_9602() && !this.field_45401.contains(var4)) {
            field_45573.warn("Removed resource pack {} from options because it is no longer compatible", var4);
            var3.remove();
         } else if (var5.method_25022().method_9602() && this.field_45401.contains(var4)) {
            field_45573.info("Removed resource pack {} from incompatibility list because it's now compatible", var4);
            this.field_45401.remove(var4);
         } else {
            var2.add(var5.method_25023());
         }
      }

      var1.method_29121(var2);
   }

   public class_9193 method_40867() {
      return this.field_45440;
   }

   public void method_40884(class_9193 var1) {
      this.field_45440 = var1;
   }
}
