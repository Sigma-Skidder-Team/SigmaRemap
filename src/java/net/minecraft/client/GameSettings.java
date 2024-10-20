package net.minecraft.client;

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

import mapped.*;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.settings.NarratorStatus;
import net.minecraft.client.settings.ParticleStatus;
import net.minecraft.client.settings.PointOfView;
import net.minecraft.client.settings.SliderPercentageOption;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.Util;
import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.play.client.CClientSettingsPacket;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.util.HandSide;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.datafix.DefaultTypeReferences;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.Difficulty;
import net.optifine.CustomGuis;
import net.optifine.DynamicLights;
import net.optifine.Config;
import net.optifine.shaders.Shaders;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameSettings {
   private static final Logger field44569 = LogManager.getLogger();
   private static final Gson field44570 = new Gson();
   private static final TypeToken<List<String>> field44571 = new Class5798();
   private static final Splitter field44572 = Splitter.on(':').limit(2);
   public double field44573 = 0.5;
   public int renderDistanceChunks = -1;
   public float field44575 = 1.0F;
   public int framerateLimit = 120;
   public CloudOption cloudOption = CloudOption.field11186;
   public GraphicsFanciness graphicFanciness = GraphicsFanciness.FANCY;
   public AmbientOcclusionStatus ambientOcclusionStatus = AmbientOcclusionStatus.field16005;
   public List<String> resourcePacks = Lists.newArrayList();
   public List<String> incompatibleResourcePacks = Lists.newArrayList();
   public ChatVisibility chatVisibility = ChatVisibility.FULL;
   public double field44583 = 1.0;
   public double field44584 = 0.0;
   public double field44585 = 0.5;
   public String fullscreenResolution;
   public boolean field44587;
   public boolean field44588;
   public boolean field44589 = true;
   private final Set<Class2318> field44590 = Sets.newHashSet(Class2318.values());
   public HandSide field44591 = HandSide.RIGHT;
   public int overrideWidth;
   public int overrideHeight;
   public boolean field44594 = true;
   public double field44595 = 1.0;
   public double field44596 = 1.0;
   public double field44597 = 0.44366196F;
   public double field44598 = 1.0;
   public double field44599 = 0.0;
   public int field44600 = 4;
   private final Map<Class2266, Float> field44601 = Maps.newEnumMap(Class2266.class);
   public boolean field44602 = true;
   public Class2207 field44603 = Class2207.field14426;
   public Class2200 field44604 = Class2200.field14376;
   public boolean field_244601_E = false;
   public int biomeBlendRadius = 2;
   public double field44607 = 1.0;
   public boolean rawMouseInput = true;
   public int glDebugVerbosity = 1;
   public boolean field44610 = true;
   public boolean field44611 = true;
   public boolean field44612 = true;
   public boolean field44613 = true;
   public boolean field44614 = true;
   public boolean vsync = true;
   public boolean entityShadows = true;
   public boolean forceUnicodeFont;
   public boolean field44618;
   public boolean field44619;
   public boolean field44620 = true;
   public boolean reducedDebugInfo;
   public boolean field44622 = true;
   public boolean showSubtitles;
   public boolean field44624 = true;
   public boolean touchscreen;
   public boolean fullscreen;
   public boolean viewBobbing = true;
   public boolean field44628;
   public boolean field44629;
   public boolean field44630;
   public boolean field44631 = true;
   public final KeyBinding keyBindForward = new KeyBinding("key.forward", 87, "key.categories.movement");
   public final KeyBinding keyBindLeft = new KeyBinding("key.left", 65, "key.categories.movement");
   public final KeyBinding keyBindBack = new KeyBinding("key.back", 83, "key.categories.movement");
   public final KeyBinding keyBindRight = new KeyBinding("key.right", 68, "key.categories.movement");
   public final KeyBinding keyBindJump = new KeyBinding("key.jump", 32, "key.categories.movement");
   public final KeyBinding keyBindSneak = new Class2008("key.sneak", 340, "key.categories.movement", () -> this.field44628);
   public final KeyBinding keyBindSprint = new Class2008("key.sprint", 341, "key.categories.movement", () -> this.field44629);
   public final KeyBinding keyBindInventory = new KeyBinding("key.inventory", 69, "key.categories.inventory");
   public final KeyBinding keyBindSwapHands = new KeyBinding("key.swapOffhand", 70, "key.categories.inventory");
   public final KeyBinding keyBindDrop = new KeyBinding("key.drop", 81, "key.categories.inventory");
   public final KeyBinding keyBindUseItem = new KeyBinding("key.use", InputMappingsType.MOUSE, 1, "key.categories.gameplay");
   public final KeyBinding keyBindAttack = new KeyBinding("key.attack", InputMappingsType.MOUSE, 0, "key.categories.gameplay");
   public final KeyBinding keyBindPickBlock = new KeyBinding("key.pickItem", InputMappingsType.MOUSE, 2, "key.categories.gameplay");
   public final KeyBinding keyBindChat = new KeyBinding("key.chat", 84, "key.categories.multiplayer");
   public final KeyBinding keyBindTablist = new KeyBinding("key.playerlist", 258, "key.categories.multiplayer");
   public final KeyBinding keyBindCommand = new KeyBinding("key.command", 47, "key.categories.multiplayer");
   public final KeyBinding keyBindSocialInteractions = new KeyBinding("key.socialInteractions", 80, "key.categories.multiplayer");
   public final KeyBinding keyBindScreenshot = new KeyBinding("key.screenshot", 291, "key.categories.misc");
   public final KeyBinding keyBindTogglePerspective = new KeyBinding("key.togglePerspective", 294, "key.categories.misc");
   public final KeyBinding keyBindSmoothCamera = new KeyBinding("key.smoothCamera", InputMappings.INPUT_INVALID.getKeyCode(), "key.categories.misc");
   public final KeyBinding keyBindFullscreen = new KeyBinding("key.fullscreen", 300, "key.categories.misc");
   public final KeyBinding keyBindSpectatorOutlines = new KeyBinding("key.spectatorOutlines", InputMappings.INPUT_INVALID.getKeyCode(), "key.categories.misc");
   public final KeyBinding keyBindAdvancements = new KeyBinding("key.advancements", 76, "key.categories.misc");
   public final KeyBinding[] keyBindsHotbar = new KeyBinding[]{
      new KeyBinding("key.hotbar.1", 49, "key.categories.inventory"),
      new KeyBinding("key.hotbar.2", 50, "key.categories.inventory"),
      new KeyBinding("key.hotbar.3", 51, "key.categories.inventory"),
      new KeyBinding("key.hotbar.4", 52, "key.categories.inventory"),
      new KeyBinding("key.hotbar.5", 53, "key.categories.inventory"),
      new KeyBinding("key.hotbar.6", 54, "key.categories.inventory"),
      new KeyBinding("key.hotbar.7", 55, "key.categories.inventory"),
      new KeyBinding("key.hotbar.8", 56, "key.categories.inventory"),
      new KeyBinding("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final KeyBinding keyBindSaveToolbar = new KeyBinding("key.saveToolbarActivator", 67, "key.categories.creative");
   public final KeyBinding keyBindLoadToolbar = new KeyBinding("key.loadToolbarActivator", 88, "key.categories.creative");
   public KeyBinding[] field44658 = (KeyBinding[])ArrayUtils.addAll(
      new KeyBinding[]{
         this.keyBindAttack,
         this.keyBindUseItem,
         this.keyBindForward,
         this.keyBindLeft,
         this.keyBindBack,
         this.keyBindRight,
         this.keyBindJump,
         this.keyBindSneak,
         this.keyBindSprint,
         this.keyBindDrop,
         this.keyBindInventory,
         this.keyBindChat,
         this.keyBindTablist,
         this.keyBindPickBlock,
         this.keyBindCommand,
         this.keyBindSocialInteractions,
         this.keyBindScreenshot,
         this.keyBindTogglePerspective,
         this.keyBindSmoothCamera,
         this.keyBindFullscreen,
         this.keyBindSpectatorOutlines,
         this.keyBindSwapHands,
         this.keyBindSaveToolbar,
         this.keyBindLoadToolbar,
         this.keyBindAdvancements
      },
      this.keyBindsHotbar
   );
   public Minecraft field44659;
   private final File field44660;
   public Difficulty field44661 = Difficulty.NORMAL;
   public boolean hideGUI;
   private PointOfView field44663 = PointOfView.field12822;
   public boolean showDebugInfo;
   public boolean showDebugProfilerChart;
   public boolean showLagometer;
   public String field44667 = "";
   public boolean smoothCamera;
   public double fov = 70.0;
   public float screenEffectScale = 1.0F;
   public float fovScaleEffect = 1.0F;
   public double gamma;
   public int guiScale;
   public ParticleStatus particles = ParticleStatus.field15246;
   public NarratorStatus narrator = NarratorStatus.field11267;
   public String language = "en_us";
   public boolean syncChunkWrites;
   public int ofFogType = 1;
   public float ofFogStart = 0.8F;
   public int ofMipmapType = 0;
   public boolean ofOcclusionFancy = false;
   public boolean ofSmoothFps = false;
   public boolean ofSmoothWorld = Config.isSingleProcessor();
   public boolean ofLazyChunkLoading = Config.isSingleProcessor();
   public boolean field44685 = false;
   public boolean field44686 = false;
   public double field44687 = 1.0;
   public int ofAaLevel = 0;
   public int field44689 = 1;
   public int field44690 = 0;
   public double field44691 = 0.0;
   public int field44692 = 0;
   public int field44693 = 0;
   public int field44694 = 0;
   public int field44695 = 3;
   public int field44696 = 4000;
   public boolean field44697 = false;
   public boolean field44698 = false;
   public boolean field44699 = false;
   public boolean field44700 = true;
   public boolean field44701 = true;
   public boolean field44702 = true;
   public boolean field44703 = true;
   public int field44704 = 0;
   public int field44705 = 1;
   public boolean field44706 = false;
   public int field44707 = 0;
   public boolean field44708 = false;
   public boolean field44709 = true;
   public boolean field44710 = true;
   public boolean field44711 = true;
   public boolean field44712 = true;
   public boolean field44713 = true;
   public boolean field44714 = true;
   public int field44715 = 2;
   public boolean field44716 = true;
   public boolean field44717 = false;
   public boolean field44718 = true;
   public boolean field44719 = false;
   public boolean field44720 = false;
   public int field44721 = 0;
   public boolean field44722 = true;
   public boolean field44723 = true;
   public int field44724 = 3;
   public boolean field44725 = true;
   public boolean field44726 = true;
   public boolean field44727 = true;
   public int field44728 = 1;
   public int field44729 = 0;
   public boolean field44730 = true;
   public int field44731 = 0;
   public int field44732 = 0;
   public boolean field44733 = true;
   public boolean field44734 = true;
   public boolean field44735 = true;
   public boolean field44736 = true;
   public boolean field44737 = true;
   public boolean field44738 = true;
   public boolean field44739 = true;
   public boolean field44740 = true;
   public boolean field44741 = true;
   public boolean field44742 = true;
   public boolean field44743 = true;
   public boolean field44744 = true;
   public boolean field44745 = true;
   public boolean field44746 = true;
   public boolean field44747 = true;
   public static final int field44748 = 0;
   public static final int field44749 = 1;
   public static final int field44750 = 2;
   public static final int field44751 = 3;
   public static final int field44752 = 4;
   public static final int field44753 = 5;
   public static final int field44754 = 0;
   public static final int field44755 = 1;
   public static final int field44756 = 2;
   public static final String field44757 = "Default";
   public static final double field44758 = 4.0571431;
   private static final int[] field44759 = new int[]{0, 1, 4, 2};
   private static final int[] field44760 = new int[]{3, 1, 2};
   private static final String[] field44761 = new String[]{"options.off", "options.graphics.fast", "options.graphics.fancy"};
   public KeyBinding field44762;
   private File field44763;

   public GameSettings(Minecraft var1, File var2) {
      this.method37171();
      this.field44659 = var1;
      this.field44660 = new File(var2, "options.txt");
      if (var1.isJava64bit() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
         AbstractOption.field25333.setMaxValue(32.0F);
         long var3 = 1000000L;
         if (Runtime.getRuntime().maxMemory() >= 1500L * var3) {
            AbstractOption.field25333.setMaxValue(48.0F);
         }

         if (Runtime.getRuntime().maxMemory() >= 2500L * var3) {
            AbstractOption.field25333.setMaxValue(64.0F);
         }
      } else {
         AbstractOption.field25333.setMaxValue(16.0F);
      }

      this.renderDistanceChunks = var1.isJava64bit() ? 12 : 8;
      this.syncChunkWrites = Util.getOSType() == Util.OS.WINDOWS;
      this.field44763 = new File(var2, "optionsof.txt");
      this.framerateLimit = (int) AbstractOption.FRAMERATE_LIMIT.getMaxValue();
      this.field44762 = new KeyBinding("of.key.zoom", 67, "key.categories.misc");
      this.field44658 = (KeyBinding[])ArrayUtils.add(this.field44658, this.field44762);
      Class9831.method38795(this.field44658, new KeyBinding[]{this.field44762});
      this.renderDistanceChunks = 8;
      this.method37143();
      Config.method26779(this);
   }

   public float method37139(float var1) {
      return this.field44624 ? var1 : (float)this.field44585;
   }

   public int method37140(float var1) {
      return (int)(this.method37139(var1) * 255.0F) << 24 & 0xFF000000;
   }

   public int method37141(int var1) {
      return this.field44624 ? var1 : (int)(this.field44585 * 255.0) << 24 & 0xFF000000;
   }

   public void method37142(KeyBinding var1, InputMappingsInput var2) {
      var1.bind(var2);
      this.saveOptions();
   }

   public void method37143() {
      try {
         if (!this.field44660.exists()) {
            return;
         }

         this.field44601.clear();
         CompoundNBT var1 = new CompoundNBT();

         try (BufferedReader var2 = Files.newReader(this.field44660, Charsets.UTF_8)) {
            var2.lines().forEach(var1x -> {
               try {
                  Iterator var2x = field44572.split(var1x).iterator();
                  var1.putString((String)var2x.next(), (String)var2x.next());
               } catch (Exception var3) {
                  field44569.warn("Skipping bad option: {}", var1x);
               }
            });
         }

         CompoundNBT var23 = this.method37144(var1);
         if (!var23.contains("graphicsMode") && var23.contains("fancyGraphics")) {
            if ("true".equals(var23.getString("fancyGraphics"))) {
               this.graphicFanciness = GraphicsFanciness.FANCY;
            } else {
               this.graphicFanciness = GraphicsFanciness.FAST;
            }
         }

         for (String var4 : var23.keySet()) {
            String var5 = var23.getString(var4);

            try {
               if ("autoJump".equals(var4)) {
                  AbstractOption.field25351.method18077(this, var5);
               }

               if ("autoSuggestions".equals(var4)) {
                  AbstractOption.field25352.method18077(this, var5);
               }

               if ("chatColors".equals(var4)) {
                  AbstractOption.field25354.method18077(this, var5);
               }

               if ("chatLinks".equals(var4)) {
                  AbstractOption.field25355.method18077(this, var5);
               }

               if ("chatLinksPrompt".equals(var4)) {
                  AbstractOption.field25356.method18077(this, var5);
               }

               if ("enableVsync".equals(var4)) {
                  AbstractOption.field25358.method18077(this, var5);
                  if (this.vsync) {
                     this.framerateLimit = (int) AbstractOption.FRAMERATE_LIMIT.getMaxValue();
                  }

                  this.method37164();
               }

               if ("entityShadows".equals(var4)) {
                  AbstractOption.field25359.method18077(this, var5);
               }

               if ("forceUnicodeFont".equals(var4)) {
                  AbstractOption.field25360.method18077(this, var5);
               }

               if ("discrete_mouse_scroll".equals(var4)) {
                  AbstractOption.field25357.method18077(this, var5);
               }

               if ("invertYMouse".equals(var4)) {
                  AbstractOption.field25361.method18077(this, var5);
               }

               if ("realmsNotifications".equals(var4)) {
                  AbstractOption.REALMS_NOTIFICATIONS.method18077(this, var5);
               }

               if ("reducedDebugInfo".equals(var4)) {
                  AbstractOption.field25363.method18077(this, var5);
               }

               if ("showSubtitles".equals(var4)) {
                  AbstractOption.field25364.method18077(this, var5);
               }

               if ("snooperEnabled".equals(var4)) {
                  AbstractOption.field25365.method18077(this, var5);
               }

               if ("touchscreen".equals(var4)) {
                  AbstractOption.field25368.method18077(this, var5);
               }

               if ("fullscreen".equals(var4)) {
                  AbstractOption.field25369.method18077(this, var5);
               }

               if ("bobView".equals(var4)) {
                  AbstractOption.field25370.method18077(this, var5);
               }

               if ("toggleCrouch".equals(var4)) {
                  this.field44628 = "true".equals(var5);
               }

               if ("toggleSprint".equals(var4)) {
                  this.field44629 = "true".equals(var5);
               }

               if ("mouseSensitivity".equals(var4)) {
                  this.field44573 = (double)method37145(var5);
               }

               if ("fov".equals(var4)) {
                  this.fov = (double)(method37145(var5) * 40.0F + 70.0F);
               }

               if ("screenEffectScale".equals(var4)) {
                  this.screenEffectScale = method37145(var5);
               }

               if ("fovEffectScale".equals(var4)) {
                  this.fovScaleEffect = method37145(var5);
               }

               if ("gamma".equals(var4)) {
                  this.gamma = (double)method37145(var5);
               }

               if ("renderDistance".equals(var4)) {
                  this.renderDistanceChunks = Integer.parseInt(var5);
               }

               if ("entityDistanceScaling".equals(var4)) {
                  this.field44575 = Float.parseFloat(var5);
               }

               if ("guiScale".equals(var4)) {
                  this.guiScale = Integer.parseInt(var5);
               }

               if ("particles".equals(var4)) {
                  this.particles = ParticleStatus.method9053(Integer.parseInt(var5));
               }

               if ("maxFps".equals(var4)) {
                  this.framerateLimit = Integer.parseInt(var5);
                  if (this.vsync) {
                     this.framerateLimit = (int) AbstractOption.FRAMERATE_LIMIT.getMaxValue();
                  }

                  if (this.framerateLimit <= 0) {
                     this.framerateLimit = (int) AbstractOption.FRAMERATE_LIMIT.getMaxValue();
                  }

                  if (this.field44659.getMainWindow() != null) {
                     this.field44659.getMainWindow().setFramerateLimit(this.framerateLimit);
                  }
               }

               if ("difficulty".equals(var4)) {
                  this.field44661 = Difficulty.byId(Integer.parseInt(var5));
               }

               if ("graphicsMode".equals(var4)) {
                  this.graphicFanciness = GraphicsFanciness.method8746(Integer.parseInt(var5));
                  this.method37162();
               }

               if ("tutorialStep".equals(var4)) {
                  this.field44604 = Class2200.method8917(var5);
               }

               if ("ao".equals(var4)) {
                  if ("true".equals(var5)) {
                     this.ambientOcclusionStatus = AmbientOcclusionStatus.field16005;
                  } else if ("false".equals(var5)) {
                     this.ambientOcclusionStatus = AmbientOcclusionStatus.OFF;
                  } else {
                     this.ambientOcclusionStatus = AmbientOcclusionStatus.method9117(Integer.parseInt(var5));
                  }
               }

               if ("renderClouds".equals(var4)) {
                  if ("true".equals(var5)) {
                     this.cloudOption = CloudOption.field11186;
                  } else if ("false".equals(var5)) {
                     this.cloudOption = CloudOption.OFF;
                  } else if ("fast".equals(var5)) {
                     this.cloudOption = CloudOption.FAST;
                  }
               }

               if ("attackIndicator".equals(var4)) {
                  this.field44603 = Class2207.method8924(Integer.parseInt(var5));
               }

               if ("resourcePacks".equals(var4)) {
                  this.resourcePacks = JSONUtils.<List<String>>method32795(field44570, var5, field44571);
                  if (this.resourcePacks == null) {
                     this.resourcePacks = Lists.newArrayList();
                  }
               }

               if ("incompatibleResourcePacks".equals(var4)) {
                  this.incompatibleResourcePacks = JSONUtils.<List<String>>method32795(field44570, var5, field44571);
                  if (this.incompatibleResourcePacks == null) {
                     this.incompatibleResourcePacks = Lists.newArrayList();
                  }
               }

               if ("lastServer".equals(var4)) {
                  this.field44667 = var5;
               }

               if ("lang".equals(var4)) {
                  this.language = var5;
               }

               if ("chatVisibility".equals(var4)) {
                  this.chatVisibility = ChatVisibility.getValue(Integer.parseInt(var5));
               }

               if ("chatOpacity".equals(var4)) {
                  this.field44583 = (double)method37145(var5);
               }

               if ("chatLineSpacing".equals(var4)) {
                  this.field44584 = (double)method37145(var5);
               }

               if ("textBackgroundOpacity".equals(var4)) {
                  this.field44585 = (double)method37145(var5);
               }

               if ("backgroundForChatOnly".equals(var4)) {
                  this.field44624 = "true".equals(var5);
               }

               if ("fullscreenResolution".equals(var4)) {
                  this.fullscreenResolution = var5;
               }

               if ("hideServerAddress".equals(var4)) {
                  this.field44587 = "true".equals(var5);
               }

               if ("advancedItemTooltips".equals(var4)) {
                  this.field44588 = "true".equals(var5);
               }

               if ("pauseOnLostFocus".equals(var4)) {
                  this.field44589 = "true".equals(var5);
               }

               if ("overrideHeight".equals(var4)) {
                  this.overrideHeight = Integer.parseInt(var5);
               }

               if ("overrideWidth".equals(var4)) {
                  this.overrideWidth = Integer.parseInt(var5);
               }

               if ("heldItemTooltips".equals(var4)) {
                  this.field44594 = "true".equals(var5);
               }

               if ("chatHeightFocused".equals(var4)) {
                  this.field44598 = (double)method37145(var5);
               }

               if ("chatDelay".equals(var4)) {
                  this.field44599 = (double)method37145(var5);
               }

               if ("chatHeightUnfocused".equals(var4)) {
                  this.field44597 = (double)method37145(var5);
               }

               if ("chatScale".equals(var4)) {
                  this.field44595 = (double)method37145(var5);
               }

               if ("chatWidth".equals(var4)) {
                  this.field44596 = (double)method37145(var5);
               }

               if ("mipmapLevels".equals(var4)) {
                  this.field44600 = Integer.parseInt(var5);
               }

               if ("useNativeTransport".equals(var4)) {
                  this.field44602 = "true".equals(var5);
               }

               if ("mainHand".equals(var4)) {
                  this.field44591 = "left".equals(var5) ? HandSide.LEFT : HandSide.RIGHT;
               }

               if ("narrator".equals(var4)) {
                  this.narrator = NarratorStatus.method8191(Integer.parseInt(var5));
               }

               if ("biomeBlendRadius".equals(var4)) {
                  this.biomeBlendRadius = Integer.parseInt(var5);
               }

               if ("mouseWheelSensitivity".equals(var4)) {
                  this.field44607 = (double)method37145(var5);
               }

               if ("rawMouseInput".equals(var4)) {
                  this.rawMouseInput = "true".equals(var5);
               }

               if ("glDebugVerbosity".equals(var4)) {
                  this.glDebugVerbosity = Integer.parseInt(var5);
               }

               if ("skipMultiplayerWarning".equals(var4)) {
                  this.field44630 = "true".equals(var5);
               }

               if ("hideMatchedNames".equals(var4)) {
                  this.field44631 = "true".equals(var5);
               }

               if ("joinedFirstServer".equals(var4)) {
                  this.field_244601_E = "true".equals(var5);
               }

               if ("syncChunkWrites".equals(var4)) {
                  this.syncChunkWrites = "true".equals(var5);
               }

               for (KeyBinding var9 : this.field44658) {
                  if (var4.equals("key_" + var9.getKeyDescription())) {
                     if (Reflector.field42956.exists()) {
                        if (var5.indexOf(58) != -1) {
                           String[] var10 = var5.split(":");
                           Object var11 = Reflector.method35062(Reflector.field42956, var10[1]);
                           Reflector.call(var9, Reflector.field42931, var11, InputMappings.method38638(var10[0]));
                        } else {
                           Object var33 = Reflector.method35071(Reflector.field42957);
                           Reflector.call(var9, Reflector.field42931, var33, InputMappings.method38638(var5));
                        }
                     } else {
                        var9.bind(InputMappings.method38638(var5));
                     }
                  }
               }

               for (Class2266 var31 : Class2266.values()) {
                  if (var4.equals("soundCategory_" + var31.method8995())) {
                     this.field44601.put(var31, method37145(var5));
                  }
               }

               for (Class2318 var32 : Class2318.values()) {
                  if (var4.equals("modelPart_" + var32.method9091())) {
                     this.method37151(var32, "true".equals(var5));
                  }
               }
            } catch (Exception var21) {
               field44569.warn("Skipping bad option: {}:{}", var4, var5);
               var21.printStackTrace();
            }
         }

         KeyBinding.resetKeyBindingArrayAndHash();
      } catch (Exception var22) {
         field44569.error("Failed to load options", var22);
      }

      this.method37160();
   }

   private CompoundNBT method37144(CompoundNBT var1) {
      int var2 = 0;

      try {
         var2 = Integer.parseInt(var1.getString("version"));
      } catch (RuntimeException var4) {
      }

      return NBTUtil.update(this.field44659.getDataFixer(), DefaultTypeReferences.OPTIONS, var1, var2);
   }

   private static float method37145(String var0) {
      if ("true".equals(var0)) {
         return 1.0F;
      } else {
         return "false".equals(var0) ? 0.0F : Float.parseFloat(var0);
      }
   }

   public void saveOptions() {
      if (!Reflector.field42770.exists() || !Reflector.callBoolean(Reflector.field42770)) {
         try (PrintWriter var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.field44660), StandardCharsets.UTF_8))) {
            var1.println("version:" + SharedConstants.getVersion().getWorldVersion());
            var1.println("autoJump:" + AbstractOption.field25351.method18080(this));
            var1.println("autoSuggestions:" + AbstractOption.field25352.method18080(this));
            var1.println("chatColors:" + AbstractOption.field25354.method18080(this));
            var1.println("chatLinks:" + AbstractOption.field25355.method18080(this));
            var1.println("chatLinksPrompt:" + AbstractOption.field25356.method18080(this));
            var1.println("enableVsync:" + AbstractOption.field25358.method18080(this));
            var1.println("entityShadows:" + AbstractOption.field25359.method18080(this));
            var1.println("forceUnicodeFont:" + AbstractOption.field25360.method18080(this));
            var1.println("discrete_mouse_scroll:" + AbstractOption.field25357.method18080(this));
            var1.println("invertYMouse:" + AbstractOption.field25361.method18080(this));
            var1.println("realmsNotifications:" + AbstractOption.REALMS_NOTIFICATIONS.method18080(this));
            var1.println("reducedDebugInfo:" + AbstractOption.field25363.method18080(this));
            var1.println("snooperEnabled:" + AbstractOption.field25365.method18080(this));
            var1.println("showSubtitles:" + AbstractOption.field25364.method18080(this));
            var1.println("touchscreen:" + AbstractOption.field25368.method18080(this));
            var1.println("fullscreen:" + AbstractOption.field25369.method18080(this));
            var1.println("bobView:" + AbstractOption.field25370.method18080(this));
            var1.println("toggleCrouch:" + this.field44628);
            var1.println("toggleSprint:" + this.field44629);
            var1.println("mouseSensitivity:" + this.field44573);
            var1.println("fov:" + (this.fov - 70.0) / 40.0);
            var1.println("screenEffectScale:" + this.screenEffectScale);
            var1.println("fovEffectScale:" + this.fovScaleEffect);
            var1.println("gamma:" + this.gamma);
            var1.println("renderDistance:" + this.renderDistanceChunks);
            var1.println("entityDistanceScaling:" + this.field44575);
            var1.println("guiScale:" + this.guiScale);
            var1.println("particles:" + this.particles.method9052());
            var1.println("maxFps:" + this.framerateLimit);
            var1.println("difficulty:" + this.field44661.getId());
            var1.println("graphicsMode:" + this.graphicFanciness.func_238162_a_());
            var1.println("ao:" + this.ambientOcclusionStatus.method9115());
            var1.println("biomeBlendRadius:" + this.biomeBlendRadius);
            switch (Class9294.field42737[this.cloudOption.ordinal()]) {
               case 1:
                  var1.println("renderClouds:true");
                  break;
               case 2:
                  var1.println("renderClouds:fast");
                  break;
               case 3:
                  var1.println("renderClouds:false");
            }

            var1.println("resourcePacks:" + field44570.toJson(this.resourcePacks));
            var1.println("incompatibleResourcePacks:" + field44570.toJson(this.incompatibleResourcePacks));
            var1.println("lastServer:" + this.field44667);
            var1.println("lang:" + this.language);
            var1.println("chatVisibility:" + this.chatVisibility.getId());
            var1.println("chatOpacity:" + this.field44583);
            var1.println("chatLineSpacing:" + this.field44584);
            var1.println("textBackgroundOpacity:" + this.field44585);
            var1.println("backgroundForChatOnly:" + this.field44624);
            if (this.field44659.getMainWindow().getVideoMode().isPresent()) {
               var1.println("fullscreenResolution:" + this.field44659.getMainWindow().getVideoMode().get().method31536());
            }

            var1.println("hideServerAddress:" + this.field44587);
            var1.println("advancedItemTooltips:" + this.field44588);
            var1.println("pauseOnLostFocus:" + this.field44589);
            var1.println("overrideWidth:" + this.overrideWidth);
            var1.println("overrideHeight:" + this.overrideHeight);
            var1.println("heldItemTooltips:" + this.field44594);
            var1.println("chatHeightFocused:" + this.field44598);
            var1.println("chatDelay: " + this.field44599);
            var1.println("chatHeightUnfocused:" + this.field44597);
            var1.println("chatScale:" + this.field44595);
            var1.println("chatWidth:" + (float)this.field44596);
            var1.println("mipmapLevels:" + this.field44600);
            var1.println("useNativeTransport:" + this.field44602);
            var1.println("mainHand:" + (this.field44591 == HandSide.LEFT ? "left" : "right"));
            var1.println("attackIndicator:" + this.field44603.method8922());
            var1.println("narrator:" + this.narrator.method8189());
            var1.println("tutorialStep:" + this.field44604.method8916());
            var1.println("mouseWheelSensitivity:" + this.field44607);
            var1.println("rawMouseInput:" + AbstractOption.field25332.method18080(this));
            var1.println("glDebugVerbosity:" + this.glDebugVerbosity);
            var1.println("skipMultiplayerWarning:" + this.field44630);
            var1.println("hideMatchedNames:" + this.field44631);
            var1.println("joinedFirstServer:" + this.field_244601_E);
            var1.println("syncChunkWrites:" + this.syncChunkWrites);

            for (KeyBinding var6 : this.field44658) {
               if (Reflector.field42932.exists()) {
                  String var7 = "key_" + var6.getKeyDescription() + ":" + var6.getTranslationKey();
                  Object var8 = Reflector.call(var6, Reflector.field42932);
                  Object var9 = Reflector.method35071(Reflector.field42957);
                  var1.println(var8 != var9 ? var7 + ":" + var8 : var7);
               } else {
                  var1.println("key_" + var6.getKeyDescription() + ":" + var6.getTranslationKey());
               }
            }

            for (Class2266 var27 : Class2266.values()) {
               var1.println("soundCategory_" + var27.method8995() + ":" + this.method37147(var27));
            }

            for (Class2318 var28 : Class2318.values()) {
               var1.println("modelPart_" + var28.method9091() + ":" + this.field44590.contains(var28));
            }
         } catch (Exception var20) {
            field44569.error("Failed to save options", var20);
         }

         this.method37161();
         this.method37149();
      }
   }

   public float method37147(Class2266 var1) {
      return this.field44601.containsKey(var1) ? this.field44601.get(var1) : 1.0F;
   }

   public void method37148(Class2266 var1, float var2) {
      this.field44601.put(var1, var2);
      this.field44659.getSoundHandler().method1008(var1, var2);
   }

   public void method37149() {
      if (this.field44659.player != null) {
         int var1 = 0;

         for (Class2318 var3 : this.field44590) {
            var1 |= var3.method9090();
         }

         this.field44659
            .player
            .connection
            .sendPacket(new CClientSettingsPacket(this.language, this.renderDistanceChunks, this.chatVisibility, this.field44612, var1, this.field44591));
      }
   }

   public Set<Class2318> method37150() {
      return ImmutableSet.copyOf(this.field44590);
   }

   public void method37151(Class2318 var1, boolean var2) {
      if (var2) {
         this.field44590.add(var1);
      } else {
         this.field44590.remove(var1);
      }

      this.method37149();
   }

   public void method37152(Class2318 var1) {
      if (this.method37150().contains(var1)) {
         this.field44590.remove(var1);
      } else {
         this.field44590.add(var1);
      }

      this.method37149();
   }

   public CloudOption method37153() {
      return this.renderDistanceChunks >= 4 ? this.cloudOption : CloudOption.OFF;
   }

   public boolean method37154() {
      return this.field44602;
   }

   public void method37155(AbstractOption var1, double var2) {
      if (var1 == AbstractOption.field25379) {
         this.field44691 = var2;
      }

      if (var1 == AbstractOption.field25386) {
         this.field44687 = var2;
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25422) {
         int var4 = (int)var2;
         if (var4 > 0 && Config.isShaders()) {
            Config.method26964(Class8043.method27619("of.message.aa.shaders1"), Class8043.method27619("of.message.aa.shaders2"));
            return;
         }

         int[] var5 = new int[]{0, 2, 4, 6, 8, 12, 16};
         this.ofAaLevel = 0;

         for (int var6 = 0; var6 < var5.length; var6++) {
            if (var4 >= var5[var6]) {
               this.ofAaLevel = var5[var6];
            }
         }

         this.ofAaLevel = Config.method26830(this.ofAaLevel, 0, 16);
      }

      if (var1 == AbstractOption.field25423) {
         int var7 = (int)var2;
         if (var7 > 1 && Config.isShaders()) {
            Config.method26964(Class8043.method27619("of.message.af.shaders1"), Class8043.method27619("of.message.af.shaders2"));
            return;
         }

         this.field44689 = 1;

         while (this.field44689 * 2 <= var7) {
            this.field44689 *= 2;
         }

         this.field44689 = Config.method26830(this.field44689, 1, 16);
         this.field44659.scheduleResourcesRefresh();
      }

      if (var1 == AbstractOption.field25376) {
         int var8 = (int)var2;
         this.ofMipmapType = Config.method26830(var8, 0, 3);
         this.method37165();
      }
   }

   public double method37156(AbstractOption var1) {
      if (var1 == AbstractOption.field25379) {
         return this.field44691;
      } else if (var1 == AbstractOption.field25386) {
         return this.field44687;
      } else if (var1 == AbstractOption.field25422) {
         return (double)this.ofAaLevel;
      } else if (var1 == AbstractOption.field25423) {
         return (double)this.field44689;
      } else if (var1 == AbstractOption.field25376) {
         return (double)this.ofMipmapType;
      } else if (var1 != AbstractOption.FRAMERATE_LIMIT) {
         return Float.MAX_VALUE;
      } else {
         return (double)this.framerateLimit == AbstractOption.FRAMERATE_LIMIT.getMaxValue() && this.vsync ? 0.0 : (double)this.framerateLimit;
      }
   }

   public void method37157(AbstractOption var1, int var2) {
      if (var1 == AbstractOption.field25374) {
         switch (this.ofFogType) {
            case 1:
               this.ofFogType = 2;
               if (!Config.method26785()) {
                  this.ofFogType = 3;
               }
               break;
            case 2:
               this.ofFogType = 3;
               break;
            case 3:
               this.ofFogType = 1;
               break;
            default:
               this.ofFogType = 1;
         }
      }

      if (var1 == AbstractOption.field25375) {
         this.ofFogStart += 0.2F;
         if (this.ofFogStart > 0.81F) {
            this.ofFogStart = 0.2F;
         }
      }

      if (var1 == AbstractOption.field25377) {
         this.ofSmoothFps = !this.ofSmoothFps;
      }

      if (var1 == AbstractOption.field25403) {
         this.ofSmoothWorld = !this.ofSmoothWorld;
         Config.updateThreadPriorities();
      }

      if (var1 == AbstractOption.field25378) {
         this.field44690++;
         if (this.field44690 > 3) {
            this.field44690 = 0;
         }

         this.method37162();
      }

      if (var1 == AbstractOption.field25380) {
         this.field44692 = method37167(this.field44692, field44759);
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25428) {
         this.field44694++;
         if (this.field44694 > 2) {
            this.field44694 = 0;
         }
      }

      if (var1 == AbstractOption.field25381) {
         this.field44693++;
         if (this.field44693 > 3) {
            this.field44693 = 0;
         }
      }

      if (var1 == AbstractOption.field25382) {
         this.field44731++;
         if (this.field44731 == 1) {
            this.field44731++;
         }

         if (this.field44731 > 2) {
            this.field44731 = 0;
         }
      }

      if (var1 == AbstractOption.field25383) {
         this.field44732++;
         if (this.field44732 == 1) {
            this.field44732++;
         }

         if (this.field44732 > 2) {
            this.field44732 = 0;
         }
      }

      if (var1 == AbstractOption.field25384) {
         this.field44733 = !this.field44733;
      }

      if (var1 == AbstractOption.field25385) {
         this.field44734 = !this.field44734;
      }

      if (var1 == AbstractOption.field25391) {
         this.field44735 = !this.field44735;
      }

      if (var1 == AbstractOption.field25392) {
         this.field44736 = !this.field44736;
      }

      if (var1 == AbstractOption.field25393) {
         this.field44737 = !this.field44737;
      }

      if (var1 == AbstractOption.field25394) {
         this.field44738 = !this.field44738;
      }

      if (var1 == AbstractOption.field25404) {
         this.field44739 = !this.field44739;
      }

      if (var1 == AbstractOption.field25405) {
         this.field44740 = !this.field44740;
      }

      if (var1 == AbstractOption.field25407) {
         this.field44742 = !this.field44742;
      }

      if (var1 == AbstractOption.field25408) {
         this.field44743 = !this.field44743;
      }

      if (var1 == AbstractOption.field25409) {
         this.field44744 = !this.field44744;
      }

      if (var1 == AbstractOption.field25411) {
         this.field44745 = !this.field44745;
      }

      if (var1 == AbstractOption.field25413) {
         this.field44746 = !this.field44746;
      }

      if (var1 == AbstractOption.field25424) {
         this.field44747 = !this.field44747;
      }

      if (var1 == AbstractOption.field25406) {
         this.field44741 = !this.field44741;
      }

      if (var1 == AbstractOption.field25387) {
         this.field44697 = !this.field44697;
      }

      if (var1 == AbstractOption.field25388) {
         this.field44699 = !this.field44699;
      }

      if (var1 == AbstractOption.field25389) {
         int var3 = 900;
         this.field44696 = Math.max(this.field44696 / var3 * var3, var3);
         this.field44696 *= 2;
         if (this.field44696 > 32 * var3) {
            this.field44696 = var3;
         }
      }

      if (var1 == AbstractOption.field25390) {
         this.field44695++;
         if (this.field44695 > 3) {
            this.field44695 = 1;
         }

         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25420) {
         this.field44715++;
         if (this.field44715 > 3) {
            this.field44715 = 1;
         }

         if (this.field44715 == 2) {
            this.field44659.worldRenderer.loadRenderers();
         } else {
            this.field44659.scheduleResourcesRefresh();
         }
      }

      if (var1 == AbstractOption.field25395) {
         this.field44700 = !this.field44700;
      }

      if (var1 == AbstractOption.field25396) {
         this.field44701 = !this.field44701;
      }

      if (var1 == AbstractOption.field25397) {
         this.field44702 = !this.field44702;
      }

      if (var1 == AbstractOption.field25398) {
         this.field44703 = !this.field44703;
      }

      if (var1 == AbstractOption.field25399) {
         this.field44704++;
         if (this.field44704 > 2) {
            this.field44704 = 0;
         }
      }

      if (var1 == AbstractOption.field25400) {
         this.field44705++;
         if (this.field44705 > 5) {
            this.field44705 = 1;
         }
      }

      if (var1 == AbstractOption.field25401) {
         this.field44706 = !this.field44706;
      }

      if (var1 == AbstractOption.field25402) {
         this.field44707++;
         if (this.field44707 > 2) {
            this.field44707 = 0;
         }
      }

      if (var1 == AbstractOption.field25410) {
         this.field44698 = !this.field44698;
      }

      if (var1 == AbstractOption.field25412) {
         this.field44708 = !this.field44708;
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25414) {
         this.field44709 = !this.field44709;
         Class9680.method37849();
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25415) {
         this.field44710 = !this.field44710;
         Class9387.method35644();
      }

      if (var1 == AbstractOption.field25417) {
         this.field44711 = !this.field44711;
         Class8259.method28796();
      }

      if (var1 == AbstractOption.field25418) {
         this.field44712 = !this.field44712;
         Class9680.method37833();
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25421) {
         this.field44716 = !this.field44716;
         this.field44659.scheduleResourcesRefresh();
      }

      if (var1 == AbstractOption.field25430) {
         this.field44713 = !this.field44713;
         Class8862.method32261();
      }

      if (var1 == AbstractOption.field25419) {
         this.field44714 = !this.field44714;
      }

      if (var1 == AbstractOption.field25425) {
         this.field44717 = !this.field44717;
         Class8052.method27654();
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25426) {
         this.field44718 = !this.field44718;
         this.field44659.scheduleResourcesRefresh();
      }

      if (var1 == AbstractOption.field25431) {
         this.field44719 = !this.field44719;
         MathHelper.field45216 = this.field44719;
      }

      if (var1 == AbstractOption.field25432) {
         this.field44720 = !this.field44720;
      }

      if (var1 == AbstractOption.field25433) {
         if (this.field44721 == 0) {
            this.field44721 = 1;
         } else if (this.field44721 == 1) {
            this.field44721 = 2;
         } else if (this.field44721 == 2) {
            this.field44721 = 0;
         } else {
            this.field44721 = 0;
         }

         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.LAZY_CHUNK_LOADING) {
         this.ofLazyChunkLoading = !this.ofLazyChunkLoading;
      }

      if (var1 == AbstractOption.field25441) {
         this.field44685 = !this.field44685;
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25443) {
         this.field44686 = !this.field44686;
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25434) {
         this.field44722 = !this.field44722;
      }

      if (var1 == AbstractOption.field25436) {
         this.field44723 = !this.field44723;
         this.field44659.worldRenderer.loadRenderers();
      }

      if (var1 == AbstractOption.field25435) {
         this.field44724 = method37167(this.field44724, field44760);
         DynamicLights.method36320(this.field44659.worldRenderer);
      }

      if (var1 == AbstractOption.field25439) {
         this.field44728++;
         if (this.field44728 > 4) {
            this.field44728 = 1;
         }
      }

      if (var1 == AbstractOption.field25437) {
         this.field44725 = !this.field44725;
         this.field44659.scheduleResourcesRefresh();
      }

      if (var1 == AbstractOption.field25440) {
         this.field44726 = !this.field44726;
         CustomGuis.method21966();
      }

      if (var1 == AbstractOption.field25442) {
         this.field44727 = !this.field44727;
      }

      if (var1 == AbstractOption.field25427) {
         this.field44594 = !this.field44594;
      }

      if (var1 == AbstractOption.field25438) {
         this.field44588 = !this.field44588;
      }

      if (var1 == AbstractOption.field25444) {
         if (this.field44729 == 0) {
            this.field44729 = 5;
         } else if (this.field44729 == 5) {
            this.field44729 = 3;
         } else {
            this.field44729 = 0;
         }
      }

      if (var1 == AbstractOption.field25445) {
         this.field44730 = !this.field44730;
      }
   }

   public ITextComponent method37158(AbstractOption var1) {
      String var2 = this.method37159(var1);
      return new StringTextComponent(var2);
   }

   public String method37159(AbstractOption var1) {
      String var2 = I18n.format(var1.method17957()) + ": ";
      if (var2 == null) {
         var2 = var1.method17957();
      }

      if (var1 == AbstractOption.field25333) {
         int var12 = (int) AbstractOption.field25333.get(this);
         String var13 = I18n.format("of.options.renderDistance.tiny");
         int var5 = 2;
         if (var12 >= 4) {
            var13 = I18n.format("of.options.renderDistance.short");
            var5 = 4;
         }

         if (var12 >= 8) {
            var13 = I18n.format("of.options.renderDistance.normal");
            var5 = 8;
         }

         if (var12 >= 16) {
            var13 = I18n.format("of.options.renderDistance.far");
            var5 = 16;
         }

         if (var12 >= 32) {
            var13 = Class8043.method27619("of.options.renderDistance.extreme");
            var5 = 32;
         }

         if (var12 >= 48) {
            var13 = Class8043.method27619("of.options.renderDistance.insane");
            var5 = 48;
         }

         if (var12 >= 64) {
            var13 = Class8043.method27619("of.options.renderDistance.ludicrous");
            var5 = 64;
         }

         int var6 = this.renderDistanceChunks - var5;
         String var7 = var13;
         if (var6 > 0) {
            var7 = var13 + "+";
         }

         return var2 + var12 + " " + var7 + "";
      } else if (var1 == AbstractOption.field25374) {
         switch (this.ofFogType) {
            case 1:
               return var2 + Class8043.method27624();
            case 2:
               return var2 + Class8043.method27625();
            case 3:
               return var2 + Class8043.method27623();
            default:
               return var2 + Class8043.method27623();
         }
      } else if (var1 == AbstractOption.field25375) {
         return var2 + this.ofFogStart;
      } else if (var1 == AbstractOption.field25376) {
         switch (this.ofMipmapType) {
            case 0:
               return var2 + Class8043.method27619("of.options.mipmap.nearest");
            case 1:
               return var2 + Class8043.method27619("of.options.mipmap.linear");
            case 2:
               return var2 + Class8043.method27619("of.options.mipmap.bilinear");
            case 3:
               return var2 + Class8043.method27619("of.options.mipmap.trilinear");
            default:
               return var2 + "of.options.mipmap.nearest";
         }
      } else if (var1 == AbstractOption.field25377) {
         return this.ofSmoothFps ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25403) {
         return this.ofSmoothWorld ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25378) {
         switch (this.field44690) {
            case 1:
               return var2 + Class8043.method27624();
            case 2:
               return var2 + Class8043.method27625();
            case 3:
               return var2 + Class8043.method27623();
            default:
               return var2 + Class8043.method27626();
         }
      } else if (var1 == AbstractOption.field25380) {
         switch (this.field44692) {
            case 1:
               return var2 + Class8043.method27624();
            case 2:
               return var2 + Class8043.method27625();
            case 3:
            default:
               return var2 + Class8043.method27626();
            case 4:
               return var2 + Class8043.method27619("of.general.smart");
         }
      } else if (var1 == AbstractOption.field25428) {
         switch (this.field44694) {
            case 1:
               return var2 + Class8043.method27624();
            case 2:
               return var2 + Class8043.method27625();
            default:
               return var2 + Class8043.method27626();
         }
      } else if (var1 == AbstractOption.field25381) {
         switch (this.field44693) {
            case 1:
               return var2 + Class8043.method27624();
            case 2:
               return var2 + Class8043.method27625();
            case 3:
               return var2 + Class8043.method27623();
            default:
               return var2 + Class8043.method27626();
         }
      } else if (var1 == AbstractOption.field25382) {
         switch (this.field44731) {
            case 1:
               return var2 + Class8043.method27619("of.options.animation.dynamic");
            case 2:
               return var2 + Class8043.method27623();
            default:
               return var2 + Class8043.method27622();
         }
      } else if (var1 == AbstractOption.field25383) {
         switch (this.field44732) {
            case 1:
               return var2 + Class8043.method27619("of.options.animation.dynamic");
            case 2:
               return var2 + Class8043.method27623();
            default:
               return var2 + Class8043.method27622();
         }
      } else if (var1 == AbstractOption.field25384) {
         return this.field44733 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25385) {
         return this.field44734 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25391) {
         return this.field44735 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25392) {
         return this.field44736 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25393) {
         return this.field44737 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25394) {
         return this.field44738 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25404) {
         return this.field44739 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25405) {
         return this.field44740 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25407) {
         return this.field44742 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25408) {
         return this.field44743 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25409) {
         return this.field44744 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25411) {
         return this.field44745 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25413) {
         return this.field44746 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25424) {
         return this.field44747 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25406) {
         return this.field44741 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25387) {
         return this.field44697 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25388) {
         return this.field44699 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25389) {
         int var11 = 900;
         if (this.field44696 <= var11) {
            return var2 + Class8043.method27619("of.options.save.45s");
         } else if (this.field44696 <= 2 * var11) {
            return var2 + Class8043.method27619("of.options.save.90s");
         } else if (this.field44696 <= 4 * var11) {
            return var2 + Class8043.method27619("of.options.save.3min");
         } else if (this.field44696 <= 8 * var11) {
            return var2 + Class8043.method27619("of.options.save.6min");
         } else {
            return this.field44696 <= 16 * var11
               ? var2 + Class8043.method27619("of.options.save.12min")
               : var2 + Class8043.method27619("of.options.save.24min");
         }
      } else if (var1 == AbstractOption.field25390) {
         switch (this.field44695) {
            case 1:
               return var2 + Class8043.method27624();
            case 2:
               return var2 + Class8043.method27625();
            default:
               return var2 + Class8043.method27623();
         }
      } else if (var1 == AbstractOption.field25420) {
         switch (this.field44715) {
            case 1:
               return var2 + Class8043.method27624();
            case 2:
               return var2 + Class8043.method27625();
            default:
               return var2 + Class8043.method27623();
         }
      } else if (var1 == AbstractOption.field25395) {
         return this.field44700 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25396) {
         return this.field44701 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25397) {
         return this.field44702 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25398) {
         return this.field44703 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25399) {
         switch (this.field44704) {
            case 1:
               return var2 + Class8043.method27624();
            case 2:
               return var2 + Class8043.method27625();
            default:
               return var2 + Class8043.method27626();
         }
      } else if (var1 == AbstractOption.field25400) {
         return var2 + this.field44705;
      } else if (var1 == AbstractOption.field25401) {
         return this.field44706 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25402) {
         if (this.field44707 == 1) {
            return var2 + Class8043.method27619("of.options.time.dayOnly");
         } else {
            return this.field44707 == 2 ? var2 + Class8043.method27619("of.options.time.nightOnly") : var2 + Class8043.method27626();
         }
      } else if (var1 == AbstractOption.field25422) {
         String var10 = "";
         if (this.ofAaLevel != Config.getAntialiasingLevel()) {
            var10 = " (" + Class8043.method27619("of.general.restart") + ")";
         }

         return this.ofAaLevel == 0 ? var2 + Class8043.method27623() + var10 : var2 + this.ofAaLevel + var10;
      } else if (var1 == AbstractOption.field25423) {
         return this.field44689 == 1 ? var2 + Class8043.method27623() : var2 + this.field44689;
      } else if (var1 == AbstractOption.field25410) {
         return this.field44698 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25412) {
         return this.field44708 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25414) {
         return this.field44709 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25415) {
         return this.field44710 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25417) {
         return this.field44711 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25418) {
         return this.field44712 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25430) {
         return this.field44713 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25419) {
         return this.field44714 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25421) {
         return this.field44716 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25425) {
         return this.field44717 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25426) {
         return this.field44718 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25431) {
         return this.field44719 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25432) {
         return this.field44720 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25433) {
         if (this.field44721 == 1) {
            return var2 + Class8043.method27624();
         } else {
            return this.field44721 == 2 ? var2 + Class8043.method27625() : var2 + Class8043.method27626();
         }
      } else if (var1 == AbstractOption.LAZY_CHUNK_LOADING) {
         return this.ofLazyChunkLoading ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25441) {
         return this.field44685 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25443) {
         return this.field44686 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25434) {
         return this.field44722 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25436) {
         return this.field44723 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25435) {
         int var9 = method37169(this.field44724, field44760);
         return var2 + method37170(field44761, var9);
      } else if (var1 == AbstractOption.field25439) {
         return this.field44728 <= 1 ? var2 + Class8043.method27626() : var2 + this.field44728 + "x";
      } else if (var1 == AbstractOption.field25437) {
         return this.field44725 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25440) {
         return this.field44726 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25442) {
         return this.field44727 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25427) {
         return this.field44594 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.field25438) {
         return this.field44588 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 == AbstractOption.FRAMERATE_LIMIT) {
         double var8 = AbstractOption.FRAMERATE_LIMIT.get(this);
         if (var8 == 0.0) {
            return var2 + Class8043.method27619("of.options.framerateLimit.vsync");
         } else {
            return var8 == AbstractOption.FRAMERATE_LIMIT.getMaxValue() ? var2 + I18n.format("options.framerateLimit.max") : var2 + (int)var8 + " fps";
         }
      } else if (var1 == AbstractOption.field25444) {
         if (this.field44729 == 3) {
            return var2 + Class8043.method27623();
         } else {
            return this.field44729 == 5 ? var2 + Class8043.method27619("of.general.compact") : var2 + Class8043.method27626();
         }
      } else if (var1 == AbstractOption.field25445) {
         return this.field44730 ? var2 + Class8043.method27622() : var2 + Class8043.method27623();
      } else if (var1 instanceof SliderPercentageOption) {
         SliderPercentageOption var3 = (SliderPercentageOption)var1;
         double var4 = var3.get(this);
         return var4 == 0.0 ? var2 + I18n.format("options.off") : var2 + (int)(var4 * 100.0) + "%";
      } else {
         return null;
      }
   }

   public void method37160() {
      try {
         File var1 = this.field44763;
         if (!var1.exists()) {
            var1 = this.field44660;
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
                  this.renderDistanceChunks = Integer.valueOf(var4[1]);
                  this.renderDistanceChunks = Config.method26830(this.renderDistanceChunks, 2, 1024);
               }

               if (var4[0].equals("ofFogType") && var4.length >= 2) {
                  this.ofFogType = Integer.valueOf(var4[1]);
                  this.ofFogType = Config.method26830(this.ofFogType, 1, 3);
               }

               if (var4[0].equals("ofFogStart") && var4.length >= 2) {
                  this.ofFogStart = Float.valueOf(var4[1]);
                  if (this.ofFogStart < 0.2F) {
                     this.ofFogStart = 0.2F;
                  }

                  if (this.ofFogStart > 0.81F) {
                     this.ofFogStart = 0.8F;
                  }
               }

               if (var4[0].equals("ofMipmapType") && var4.length >= 2) {
                  this.ofMipmapType = Integer.valueOf(var4[1]);
                  this.ofMipmapType = Config.method26830(this.ofMipmapType, 0, 3);
               }

               if (var4[0].equals("ofOcclusionFancy") && var4.length >= 2) {
                  this.ofOcclusionFancy = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothFps") && var4.length >= 2) {
                  this.ofSmoothFps = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmoothWorld") && var4.length >= 2) {
                  this.ofSmoothWorld = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAoLevel") && var4.length >= 2) {
                  this.field44687 = (double)Float.valueOf(var4[1]).floatValue();
                  this.field44687 = Config.method26833(this.field44687, 0.0, 1.0);
               }

               if (var4[0].equals("ofClouds") && var4.length >= 2) {
                  this.field44690 = Integer.valueOf(var4[1]);
                  this.field44690 = Config.method26830(this.field44690, 0, 3);
                  this.method37162();
               }

               if (var4[0].equals("ofCloudsHeight") && var4.length >= 2) {
                  this.field44691 = (double)Float.valueOf(var4[1]).floatValue();
                  this.field44691 = Config.method26833(this.field44691, 0.0, 1.0);
               }

               if (var4[0].equals("ofTrees") && var4.length >= 2) {
                  this.field44692 = Integer.valueOf(var4[1]);
                  this.field44692 = method37168(this.field44692, field44759);
               }

               if (var4[0].equals("ofDroppedItems") && var4.length >= 2) {
                  this.field44694 = Integer.valueOf(var4[1]);
                  this.field44694 = Config.method26830(this.field44694, 0, 2);
               }

               if (var4[0].equals("ofRain") && var4.length >= 2) {
                  this.field44693 = Integer.valueOf(var4[1]);
                  this.field44693 = Config.method26830(this.field44693, 0, 3);
               }

               if (var4[0].equals("ofAnimatedWater") && var4.length >= 2) {
                  this.field44731 = Integer.valueOf(var4[1]);
                  this.field44731 = Config.method26830(this.field44731, 0, 2);
               }

               if (var4[0].equals("ofAnimatedLava") && var4.length >= 2) {
                  this.field44732 = Integer.valueOf(var4[1]);
                  this.field44732 = Config.method26830(this.field44732, 0, 2);
               }

               if (var4[0].equals("ofAnimatedFire") && var4.length >= 2) {
                  this.field44733 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedPortal") && var4.length >= 2) {
                  this.field44734 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedRedstone") && var4.length >= 2) {
                  this.field44735 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedExplosion") && var4.length >= 2) {
                  this.field44736 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedFlame") && var4.length >= 2) {
                  this.field44737 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedSmoke") && var4.length >= 2) {
                  this.field44738 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofVoidParticles") && var4.length >= 2) {
                  this.field44739 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofWaterParticles") && var4.length >= 2) {
                  this.field44740 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofPortalParticles") && var4.length >= 2) {
                  this.field44742 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofPotionParticles") && var4.length >= 2) {
                  this.field44743 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofFireworkParticles") && var4.length >= 2) {
                  this.field44744 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDrippingWaterLava") && var4.length >= 2) {
                  this.field44745 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedTerrain") && var4.length >= 2) {
                  this.field44746 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAnimatedTextures") && var4.length >= 2) {
                  this.field44747 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRainSplash") && var4.length >= 2) {
                  this.field44741 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofLagometer") && var4.length >= 2) {
                  this.field44697 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowFps") && var4.length >= 2) {
                  this.field44699 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAutoSaveTicks") && var4.length >= 2) {
                  this.field44696 = Integer.valueOf(var4[1]);
                  this.field44696 = Config.method26830(this.field44696, 40, 40000);
               }

               if (var4[0].equals("ofBetterGrass") && var4.length >= 2) {
                  this.field44695 = Integer.valueOf(var4[1]);
                  this.field44695 = Config.method26830(this.field44695, 1, 3);
               }

               if (var4[0].equals("ofConnectedTextures") && var4.length >= 2) {
                  this.field44715 = Integer.valueOf(var4[1]);
                  this.field44715 = Config.method26830(this.field44715, 1, 3);
               }

               if (var4[0].equals("ofWeather") && var4.length >= 2) {
                  this.field44700 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSky") && var4.length >= 2) {
                  this.field44701 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofStars") && var4.length >= 2) {
                  this.field44702 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSunMoon") && var4.length >= 2) {
                  this.field44703 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofVignette") && var4.length >= 2) {
                  this.field44704 = Integer.valueOf(var4[1]);
                  this.field44704 = Config.method26830(this.field44704, 0, 2);
               }

               if (var4[0].equals("ofChunkUpdates") && var4.length >= 2) {
                  this.field44705 = Integer.valueOf(var4[1]);
                  this.field44705 = Config.method26830(this.field44705, 1, 5);
               }

               if (var4[0].equals("ofChunkUpdatesDynamic") && var4.length >= 2) {
                  this.field44706 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofTime") && var4.length >= 2) {
                  this.field44707 = Integer.valueOf(var4[1]);
                  this.field44707 = Config.method26830(this.field44707, 0, 2);
               }

               if (var4[0].equals("ofAaLevel") && var4.length >= 2) {
                  this.ofAaLevel = Integer.valueOf(var4[1]);
                  this.ofAaLevel = Config.method26830(this.ofAaLevel, 0, 16);
               }

               if (var4[0].equals("ofAfLevel") && var4.length >= 2) {
                  this.field44689 = Integer.valueOf(var4[1]);
                  this.field44689 = Config.method26830(this.field44689, 1, 16);
               }

               if (var4[0].equals("ofProfiler") && var4.length >= 2) {
                  this.field44698 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofBetterSnow") && var4.length >= 2) {
                  this.field44708 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSwampColors") && var4.length >= 2) {
                  this.field44709 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRandomEntities") && var4.length >= 2) {
                  this.field44710 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomFonts") && var4.length >= 2) {
                  this.field44711 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomColors") && var4.length >= 2) {
                  this.field44712 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomItems") && var4.length >= 2) {
                  this.field44716 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomSky") && var4.length >= 2) {
                  this.field44713 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowCapes") && var4.length >= 2) {
                  this.field44714 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofNaturalTextures") && var4.length >= 2) {
                  this.field44717 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofEmissiveTextures") && var4.length >= 2) {
                  this.field44718 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofLazyChunkLoading") && var4.length >= 2) {
                  this.ofLazyChunkLoading = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofRenderRegions") && var4.length >= 2) {
                  this.field44685 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofSmartAnimations") && var4.length >= 2) {
                  this.field44686 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDynamicFov") && var4.length >= 2) {
                  this.field44722 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofAlternateBlocks") && var4.length >= 2) {
                  this.field44723 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofDynamicLights") && var4.length >= 2) {
                  this.field44724 = Integer.valueOf(var4[1]);
                  this.field44724 = method37168(this.field44724, field44760);
               }

               if (var4[0].equals("ofScreenshotSize") && var4.length >= 2) {
                  this.field44728 = Integer.valueOf(var4[1]);
                  this.field44728 = Config.method26830(this.field44728, 1, 4);
               }

               if (var4[0].equals("ofCustomEntityModels") && var4.length >= 2) {
                  this.field44725 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofCustomGuis") && var4.length >= 2) {
                  this.field44726 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofShowGlErrors") && var4.length >= 2) {
                  this.field44727 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofFastMath") && var4.length >= 2) {
                  this.field44719 = Boolean.valueOf(var4[1]);
                  MathHelper.field45216 = this.field44719;
               }

               if (var4[0].equals("ofFastRender") && var4.length >= 2) {
                  this.field44720 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("ofTranslucentBlocks") && var4.length >= 2) {
                  this.field44721 = Integer.valueOf(var4[1]);
                  this.field44721 = Config.method26830(this.field44721, 0, 2);
               }

               if (var4[0].equals("ofChatBackground") && var4.length >= 2) {
                  this.field44729 = Integer.valueOf(var4[1]);
               }

               if (var4[0].equals("ofChatShadow") && var4.length >= 2) {
                  this.field44730 = Boolean.valueOf(var4[1]);
               }

               if (var4[0].equals("key_" + this.field44762.getKeyDescription())) {
                  this.field44762.bind(InputMappings.method38638(var4[1]));
               }
            } catch (Exception var5) {
               Config.method26810("Skipping bad option: " + var3);
               var5.printStackTrace();
            }
         }

         Class9831.method38795(this.field44658, new KeyBinding[]{this.field44762});
         KeyBinding.resetKeyBindingArrayAndHash();
         var2.close();
      } catch (Exception var6) {
         Config.method26811("Failed to load options");
         var6.printStackTrace();
      }
   }

   public void method37161() {
      try {
         PrintWriter var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.field44763), StandardCharsets.UTF_8));
         var1.println("ofFogType:" + this.ofFogType);
         var1.println("ofFogStart:" + this.ofFogStart);
         var1.println("ofMipmapType:" + this.ofMipmapType);
         var1.println("ofOcclusionFancy:" + this.ofOcclusionFancy);
         var1.println("ofSmoothFps:" + this.ofSmoothFps);
         var1.println("ofSmoothWorld:" + this.ofSmoothWorld);
         var1.println("ofAoLevel:" + this.field44687);
         var1.println("ofClouds:" + this.field44690);
         var1.println("ofCloudsHeight:" + this.field44691);
         var1.println("ofTrees:" + this.field44692);
         var1.println("ofDroppedItems:" + this.field44694);
         var1.println("ofRain:" + this.field44693);
         var1.println("ofAnimatedWater:" + this.field44731);
         var1.println("ofAnimatedLava:" + this.field44732);
         var1.println("ofAnimatedFire:" + this.field44733);
         var1.println("ofAnimatedPortal:" + this.field44734);
         var1.println("ofAnimatedRedstone:" + this.field44735);
         var1.println("ofAnimatedExplosion:" + this.field44736);
         var1.println("ofAnimatedFlame:" + this.field44737);
         var1.println("ofAnimatedSmoke:" + this.field44738);
         var1.println("ofVoidParticles:" + this.field44739);
         var1.println("ofWaterParticles:" + this.field44740);
         var1.println("ofPortalParticles:" + this.field44742);
         var1.println("ofPotionParticles:" + this.field44743);
         var1.println("ofFireworkParticles:" + this.field44744);
         var1.println("ofDrippingWaterLava:" + this.field44745);
         var1.println("ofAnimatedTerrain:" + this.field44746);
         var1.println("ofAnimatedTextures:" + this.field44747);
         var1.println("ofRainSplash:" + this.field44741);
         var1.println("ofLagometer:" + this.field44697);
         var1.println("ofShowFps:" + this.field44699);
         var1.println("ofAutoSaveTicks:" + this.field44696);
         var1.println("ofBetterGrass:" + this.field44695);
         var1.println("ofConnectedTextures:" + this.field44715);
         var1.println("ofWeather:" + this.field44700);
         var1.println("ofSky:" + this.field44701);
         var1.println("ofStars:" + this.field44702);
         var1.println("ofSunMoon:" + this.field44703);
         var1.println("ofVignette:" + this.field44704);
         var1.println("ofChunkUpdates:" + this.field44705);
         var1.println("ofChunkUpdatesDynamic:" + this.field44706);
         var1.println("ofTime:" + this.field44707);
         var1.println("ofAaLevel:" + this.ofAaLevel);
         var1.println("ofAfLevel:" + this.field44689);
         var1.println("ofProfiler:" + this.field44698);
         var1.println("ofBetterSnow:" + this.field44708);
         var1.println("ofSwampColors:" + this.field44709);
         var1.println("ofRandomEntities:" + this.field44710);
         var1.println("ofCustomFonts:" + this.field44711);
         var1.println("ofCustomColors:" + this.field44712);
         var1.println("ofCustomItems:" + this.field44716);
         var1.println("ofCustomSky:" + this.field44713);
         var1.println("ofShowCapes:" + this.field44714);
         var1.println("ofNaturalTextures:" + this.field44717);
         var1.println("ofEmissiveTextures:" + this.field44718);
         var1.println("ofLazyChunkLoading:" + this.ofLazyChunkLoading);
         var1.println("ofRenderRegions:" + this.field44685);
         var1.println("ofSmartAnimations:" + this.field44686);
         var1.println("ofDynamicFov:" + this.field44722);
         var1.println("ofAlternateBlocks:" + this.field44723);
         var1.println("ofDynamicLights:" + this.field44724);
         var1.println("ofScreenshotSize:" + this.field44728);
         var1.println("ofCustomEntityModels:" + this.field44725);
         var1.println("ofCustomGuis:" + this.field44726);
         var1.println("ofShowGlErrors:" + this.field44727);
         var1.println("ofFastMath:" + this.field44719);
         var1.println("ofFastRender:" + this.field44720);
         var1.println("ofTranslucentBlocks:" + this.field44721);
         var1.println("ofChatBackground:" + this.field44729);
         var1.println("ofChatShadow:" + this.field44730);
         var1.println("key_" + this.field44762.getKeyDescription() + ":" + this.field44762.getTranslationKey());
         var1.close();
      } catch (Exception var2) {
         Config.method26811("Failed to save options");
         var2.printStackTrace();
      }
   }

   public void method37162() {
      switch (this.field44690) {
         case 1:
            this.cloudOption = CloudOption.FAST;
            break;
         case 2:
            this.cloudOption = CloudOption.field11186;
            break;
         case 3:
            this.cloudOption = CloudOption.OFF;
            break;
         default:
            if (this.graphicFanciness != GraphicsFanciness.FAST) {
               this.cloudOption = CloudOption.field11186;
            } else {
               this.cloudOption = CloudOption.FAST;
            }
      }

      if (this.graphicFanciness == GraphicsFanciness.FABULOUS) {
         WorldRenderer var1 = Minecraft.getInstance().worldRenderer;
         if (var1 != null) {
            Framebuffer var2 = var1.method951();
            if (var2 != null) {
               var2.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
            }
         }
      }
   }

   public void method37163() {
      this.renderDistanceChunks = 8;
      this.field44575 = 1.0F;
      this.viewBobbing = true;
      this.framerateLimit = (int) AbstractOption.FRAMERATE_LIMIT.getMaxValue();
      this.vsync = false;
      this.method37164();
      this.field44600 = 4;
      this.graphicFanciness = GraphicsFanciness.FANCY;
      this.ambientOcclusionStatus = AmbientOcclusionStatus.field16005;
      this.cloudOption = CloudOption.field11186;
      this.fov = 70.0;
      this.gamma = 0.0;
      this.guiScale = 0;
      this.particles = ParticleStatus.field15246;
      this.field44594 = true;
      this.forceUnicodeFont = false;
      this.ofFogType = 1;
      this.ofFogStart = 0.8F;
      this.ofMipmapType = 0;
      this.ofOcclusionFancy = false;
      this.field44686 = false;
      this.ofSmoothFps = false;
      Config.method26936();
      this.ofSmoothWorld = Config.isSingleProcessor();
      this.ofLazyChunkLoading = false;
      this.field44685 = false;
      this.field44719 = false;
      this.field44720 = false;
      this.field44721 = 0;
      this.field44722 = true;
      this.field44723 = true;
      this.field44724 = 3;
      this.field44728 = 1;
      this.field44725 = true;
      this.field44726 = true;
      this.field44727 = true;
      this.field44729 = 0;
      this.field44730 = true;
      this.field44687 = 1.0;
      this.ofAaLevel = 0;
      this.field44689 = 1;
      this.field44690 = 0;
      this.field44691 = 0.0;
      this.field44692 = 0;
      this.field44693 = 0;
      this.field44695 = 3;
      this.field44696 = 4000;
      this.field44697 = false;
      this.field44699 = false;
      this.field44698 = false;
      this.field44700 = true;
      this.field44701 = true;
      this.field44702 = true;
      this.field44703 = true;
      this.field44704 = 0;
      this.field44705 = 1;
      this.field44706 = false;
      this.field44707 = 0;
      this.field44708 = false;
      this.field44709 = true;
      this.field44710 = true;
      this.biomeBlendRadius = 2;
      this.field44711 = true;
      this.field44712 = true;
      this.field44716 = true;
      this.field44713 = true;
      this.field44714 = true;
      this.field44715 = 2;
      this.field44717 = false;
      this.field44718 = true;
      this.field44731 = 0;
      this.field44732 = 0;
      this.field44733 = true;
      this.field44734 = true;
      this.field44735 = true;
      this.field44736 = true;
      this.field44737 = true;
      this.field44738 = true;
      this.field44739 = true;
      this.field44740 = true;
      this.field44741 = true;
      this.field44742 = true;
      this.field44743 = true;
      this.field44744 = true;
      this.field44745 = true;
      this.field44746 = true;
      this.field44747 = true;
      Shaders.method32952("OFF");
      Shaders.field40878 = 0;
      Shaders.method33033();
      Shaders.method32950();
      this.field44659.scheduleResourcesRefresh();
      this.saveOptions();
   }

   public void method37164() {
      if (this.field44659.getMainWindow() != null) {
         this.field44659.getMainWindow().setVsync(this.vsync);
      }
   }

   public void method37165() {
      this.field44659.setMipmapLevels(this.field44600);
      this.field44659.scheduleResourcesRefresh();
   }

   public void method37166(boolean var1) {
      int var2 = var1 ? 0 : 2;
      this.field44731 = var2;
      this.field44732 = var2;
      this.field44733 = var1;
      this.field44734 = var1;
      this.field44735 = var1;
      this.field44736 = var1;
      this.field44737 = var1;
      this.field44738 = var1;
      this.field44739 = var1;
      this.field44740 = var1;
      this.field44741 = var1;
      this.field44742 = var1;
      this.field44743 = var1;
      this.field44744 = var1;
      this.particles = var1 ? ParticleStatus.field15246 : ParticleStatus.field15248;
      this.field44745 = var1;
      this.field44746 = var1;
      this.field44747 = var1;
   }

   private static int method37167(int var0, int[] var1) {
      int var2 = method37169(var0, var1);
      if (var2 < 0) {
         return var1[0];
      } else {
         if (++var2 >= var1.length) {
            var2 = 0;
         }

         return var1[var2];
      }
   }

   private static int method37168(int var0, int[] var1) {
      int var2 = method37169(var0, var1);
      return var2 < 0 ? var1[0] : var0;
   }

   private static int method37169(int var0, int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2] == var0) {
            return var2;
         }
      }

      return -1;
   }

   private static String method37170(String[] var0, int var1) {
      if (var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      return I18n.format(var0[var1]);
   }

   private void method37171() {
      if (Reflector.field42954.exists() && Reflector.field42930.exists()) {
         Object var1 = Reflector.method35071(Reflector.field42954);
         Reflector.call(this.keyBindForward, Reflector.field42930, var1);
         Reflector.call(this.keyBindLeft, Reflector.field42930, var1);
         Reflector.call(this.keyBindBack, Reflector.field42930, var1);
         Reflector.call(this.keyBindRight, Reflector.field42930, var1);
         Reflector.call(this.keyBindJump, Reflector.field42930, var1);
         Reflector.call(this.keyBindSneak, Reflector.field42930, var1);
         Reflector.call(this.keyBindSprint, Reflector.field42930, var1);
         Reflector.call(this.keyBindAttack, Reflector.field42930, var1);
         Reflector.call(this.keyBindChat, Reflector.field42930, var1);
         Reflector.call(this.keyBindTablist, Reflector.field42930, var1);
         Reflector.call(this.keyBindCommand, Reflector.field42930, var1);
         Reflector.call(this.keyBindTogglePerspective, Reflector.field42930, var1);
         Reflector.call(this.keyBindSmoothCamera, Reflector.field42930, var1);
      }
   }

   public void fillResourcePackList(ResourcePackList var1) {
      LinkedHashSet var2 = Sets.newLinkedHashSet();
      Iterator var3 = this.resourcePacks.iterator();

      while (var3.hasNext()) {
         String var4 = (String)var3.next();
         ResourcePackInfo var5 = var1.getPackInfo(var4);
         if (var5 == null && !var4.startsWith("file/")) {
            var5 = var1.getPackInfo("file/" + var4);
         }

         if (var5 == null) {
            field44569.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", var4);
            var3.remove();
         } else if (!var5.getCompatibility().isCompatible() && !this.incompatibleResourcePacks.contains(var4)) {
            field44569.warn("Removed resource pack {} from options because it is no longer compatible", var4);
            var3.remove();
         } else if (var5.getCompatibility().isCompatible() && this.incompatibleResourcePacks.contains(var4)) {
            field44569.info("Removed resource pack {} from incompatibility list because it's now compatible", var4);
            this.incompatibleResourcePacks.remove(var4);
         } else {
            var2.add(var5.getName());
         }
      }

      var1.setEnabledPacks(var2);
   }

   public PointOfView getPointOfView() {
      return this.field44663;
   }

   public void setPointOfView(PointOfView var1) {
      this.field44663 = var1;
   }
}
