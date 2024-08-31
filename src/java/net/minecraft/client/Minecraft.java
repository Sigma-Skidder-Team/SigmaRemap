package net.minecraft.client;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.impl.StopUseItemEvent;
import com.mentalfrostbyte.jello.event.impl.Class4403;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.ClickEvent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.OfflineSocialInteractions;
import com.mojang.authlib.minecraft.SocialInteractionsService;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Function4;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Timer;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.IngameGui;
import net.minecraft.client.util.Splashes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Minecraft extends RecursiveEventLoop<Runnable> implements ISnooperInfo, IWindowEventListener {
   private static Minecraft instance;
   private static final Logger LOGGER = LogManager.getLogger();
   public static final boolean IS_RUNNING_ON_MAC = Util.getOSType() == OS.OSX;
   public static final ResourceLocation DEFAULT_FONT_RENDERER_NAME = new ResourceLocation("default");
   public static final ResourceLocation UNIFORM_FONT_RENDERER_NAME = new ResourceLocation("uniform");
   public static final ResourceLocation standardGalacticFontRenderer = new ResourceLocation("alt");
   private static final CompletableFuture<Class2341> RESOURCE_RELOAD_INIT_TASK = CompletableFuture.<Class2341>completedFuture(Class2341.field16010);
   private static final ITextComponent field_244596_I = new TranslationTextComponent("multiplayer.socialInteractions.not_available");
   private final File fileResourcepacks;
   private final PropertyMap profileProperties;
   private final TextureManager textureManager;
   private final DataFixer dataFixer;
   private final VirtualScreen virtualScreen;
   public final MainWindow mainWindow;
   public final Timer timer = new Timer(20.0F, 0L);
   private final Snooper snooper = new Snooper("client", this, Util.milliTime());
   private final RenderTypeBuffers renderTypeBuffers;
   public final WorldRenderer worldRenderer;
   private final EntityRendererManager renderManager;
   private final ItemRenderer itemRenderer;
   private final FirstPersonRenderer firstPersonRenderer;
   public final ParticleManager particles;
   private final SearchTreeManager searchTreeManager = new SearchTreeManager();
   public final Session session;
   public final FontRenderer fontRenderer;
   public final GameRenderer gameRenderer;
   public final DebugRenderer debugRenderer;
   private final AtomicReference<TrackingChunkStatusListener> refChunkStatusListener = new AtomicReference<TrackingChunkStatusListener>();
   public final IngameGui ingameGUI;
   public final GameSettings gameSettings;
   private final CreativeSettings creativeSettings;
   public final MouseHelper mouseHelper;
   public final KeyboardListener keyboardListener;
   public final File gameDir;
   private final String launchedVersion;
   private final String versionType;
   private final Proxy proxy;
   private final SaveFormat saveFormat;
   public final FrameTimer frameTimer = new FrameTimer();
   private final boolean jvm64bit;
   private final boolean isDemo;
   private final boolean enableMultiplayer;
   private final boolean enableChat;
   private final IReloadableResourceManager resourceManager;
   private final DownloadingPackFinder packFinder;
   public final ResourcePackList resourcePackRepository;
   private final LanguageManager languageManager;
   private final BlockColors blockColors;
   private final ItemColors itemColors;
   public final Framebuffer framebuffer;
   private final SoundHandler soundHandler;
   private final MusicTicker musicTicker;
   private final FontResourceManager fontResourceMananger;
   private final Splashes splashes;
   private final GPUWarning warningGPU;
   private final MinecraftSessionService sessionService;
   private final SocialInteractionsService field_244734_au;
   private final SkinManager skinManager;
   private final ModelManager modelManager;
   private final BlockRendererDispatcher blockRenderDispatcher;
   private final PaintingSpriteUploader paintingSprites;
   private final PotionSpriteUploader potionSprites;
   private final ToastGui toastGui;
   private final MinecraftGame game = new MinecraftGame(this);
   private final Tutorial tutorial;
   private final FilterManager field_244597_aC;
   public static byte[] memoryReserve = new byte[10485760];
   public PlayerController playerController;
   public ClientWorld world;
   public ClientPlayerEntity player;
   private IntegratedServer integratedServer;
   private ServerData currentServerData;
   private NetworkManager networkManager;
   private boolean integratedServerIsRunning;
   public Entity renderViewEntity;
   public Entity pointedEntity;
   public RayTraceResult objectMouseOver;
   public int rightClickDelayTimer;
   public int leftClickCounter;
   private boolean isGamePaused;
   private float renderPartialTicksPaused;
   private long startNanoTime = Util.nanoTime();
   private long debugUpdateTime;
   private int fpsCounter;
   public boolean skipRenderWorld;
   public Screen currentScreen;
   public LoadingGui loadingGui;
   private boolean connectedToRealms;
   private Thread thread;
   /**
    * This is probably not the right name but the original class didn't
    * contain it so i just made up a name
    */
   public boolean shouldTranslate = true;
   private volatile boolean running = true;
   private CrashReport crashReporter;
   private static int debugFps;
   public String debug = "";
   public boolean debugWireframe;
   public boolean debugChunkPath;
   public boolean renderChunksMany = true;
   private boolean isWindowFocused;
   private final Queue<Runnable> queueChunkTracking = Queues.newConcurrentLinkedQueue();
   private CompletableFuture<Void> futureRefreshResources;
   private TutorialToast field_244598_aV;
   private IProfiler profiler = EmptyProfiler.INSTANCE;
   private int gameTime;
   private final TimeTracker gameTimeTracker = new TimeTracker(Util.nanoTimeSupplier, () -> this.gameTime);
   private IProfileResult profilerResult;
   private String debugProfilerName = "root";

   public Minecraft(GameConfiguration gameConfig) {
      super("Client");
      instance = this;
      this.gameDir = gameConfig.folderInfo.gameDir;
      File file1 = gameConfig.folderInfo.assetsDir;
      this.fileResourcepacks = gameConfig.folderInfo.resourcePacksDir;
      this.launchedVersion = gameConfig.gameInfo.version;
      this.versionType = gameConfig.gameInfo.versionType;
      this.profileProperties = gameConfig.userInfo.profileProperties;
      this.packFinder = new DownloadingPackFinder(new File(this.gameDir, "server-resource-packs"), gameConfig.folderInfo.getAssetsIndex());
      this.resourcePackRepository = new ResourcePackList(Minecraft::makePackInfo, this.packFinder, new FolderPackFinder(this.fileResourcepacks, IPackNameDecorator.PLAIN));
      this.proxy = gameConfig.userInfo.proxy;
      YggdrasilAuthenticationService yggdrasilauthenticationservice = new YggdrasilAuthenticationService(this.proxy);
      this.sessionService = yggdrasilauthenticationservice.createMinecraftSessionService();
      this.field_244734_au = this.func_244735_a(yggdrasilauthenticationservice, gameConfig);
      this.session = gameConfig.userInfo.session;
      LOGGER.info("Setting user: {}", this.session.getUsername());
      LOGGER.debug("(Session ID is {})", this.session.toString());
      this.method1525();
      this.isDemo = gameConfig.gameInfo.isDemo;
      this.enableMultiplayer = !gameConfig.gameInfo.disableMultiplayer;
      this.enableChat = !gameConfig.gameInfo.disableChat;
      this.jvm64bit = isJvm64bit();
      this.integratedServer = null;
      String s;
      int i;
      if (this.isMultiplayerEnabled() && gameConfig.serverInfo.serverName != null) {
         s = gameConfig.serverInfo.serverName;
         i = gameConfig.serverInfo.serverPort;
      } else {
         s = null;
         i = 0;
      }

      /*
      if (System.getProperty("java.version").contains("74")) { // Wtf even is this supposed to be
         this.shutdown();
      }
       */

      KeybindTextComponent.func_240696_a_(KeyBinding::getDisplayString);
      this.dataFixer = DataFixesManager.getDataFixer();
      this.toastGui = new ToastGui(this);
      this.tutorial = new Tutorial(this);
      this.thread = Thread.currentThread();
      this.gameSettings = new GameSettings(this, this.gameDir);
      this.creativeSettings = new CreativeSettings(this.gameDir, this.dataFixer);
      LOGGER.info("Backend library: {}", RenderSystem.getBackendDescription());
      ScreenSize screensize;
      if (this.gameSettings.overrideHeight > 0 && this.gameSettings.overrideWidth > 0) {
         screensize = new ScreenSize(
            this.gameSettings.overrideWidth, this.gameSettings.overrideHeight, gameConfig.displayInfo.fullscreenWidth, gameConfig.displayInfo.fullscreenHeight, gameConfig.displayInfo.fullscreen
         );
      } else {
         screensize = gameConfig.displayInfo;
      }

      Util.nanoTimeSupplier = RenderSystem.initBackendSystem();
      this.virtualScreen = new VirtualScreen(this);
      this.mainWindow = this.virtualScreen.create(screensize, this.gameSettings.fullscreenResolution, this.getWindowTitle());
      this.setGameFocused(true);

      try {
         InputStream var7 = this.getPackFinder().getVanillaPack().getResourceStream(ResourcePackType.CLIENT_RESOURCES, new ResourceLocation("icons/icon_16x16.png"));
         InputStream var8 = this.getPackFinder().getVanillaPack().getResourceStream(ResourcePackType.CLIENT_RESOURCES, new ResourceLocation("icons/icon_32x32.png"));
         this.mainWindow.setWindowIcon(var7, var8);
      } catch (IOException var9) {
         LOGGER.error("Couldn't set icon", var9);
      }

      this.mainWindow.setFramerateLimit(this.gameSettings.framerateLimit);
      this.mouseHelper = new MouseHelper(this);
      this.mouseHelper.registerCallbacks(this.mainWindow.getHandle());
      this.keyboardListener = new KeyboardListener(this);
      this.keyboardListener.setupCallbacks(this.mainWindow.getHandle());
      RenderSystem.initRenderer(this.gameSettings.glDebugVerbosity, false);
      this.framebuffer = new Framebuffer(this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight(), true, IS_RUNNING_ON_MAC);
      this.framebuffer.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
      this.resourceManager = new SimpleReloadableResourceManager(ResourcePackType.CLIENT_RESOURCES);
      this.resourcePackRepository.reloadPacksFromFinders();
      this.gameSettings.fillResourcePackList(this.resourcePackRepository);
      this.languageManager = new LanguageManager(this.gameSettings.language);
      this.resourceManager.addReloadListener(this.languageManager);
      this.textureManager = new TextureManager(this.resourceManager);
      this.resourceManager.addReloadListener(this.textureManager);
      this.skinManager = new SkinManager(this.textureManager, new File(file1, "skins"), this.sessionService);
      this.saveFormat = new SaveFormat(this.gameDir.toPath().resolve("saves"), this.gameDir.toPath().resolve("backups"), this.dataFixer);
      this.soundHandler = new SoundHandler(this.resourceManager, this.gameSettings);
      this.resourceManager.addReloadListener(this.soundHandler);
      this.splashes = new Splashes(this.session);
      this.resourceManager.addReloadListener(this.splashes);
      this.musicTicker = new MusicTicker(this);
      this.fontResourceMananger = new FontResourceManager(this.textureManager);
      this.fontRenderer = this.fontResourceMananger.func_238548_a_();
      this.resourceManager.addReloadListener(this.fontResourceMananger.getReloadListener());
      this.forceUnicodeFont(this.getForceUnicodeFont());
      this.resourceManager.addReloadListener(new GrassColorReloadListener());
      this.resourceManager.addReloadListener(new FoliageColorReloadListener());
      this.mainWindow.setRenderPhase("Startup");
      RenderSystem.setupDefaultState(0, 0, this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight());
      this.mainWindow.setRenderPhase("Post startup");
      this.blockColors = BlockColors.init();
      this.itemColors = ItemColors.init(this.blockColors);
      this.modelManager = new ModelManager(this.textureManager, this.blockColors, this.gameSettings.field44600);
      this.resourceManager.addReloadListener(this.modelManager);
      this.itemRenderer = new ItemRenderer(this.textureManager, this.modelManager, this.itemColors);
      this.renderManager = new EntityRendererManager(this.textureManager, this.itemRenderer, this.resourceManager, this.fontRenderer, this.gameSettings);
      this.firstPersonRenderer = new FirstPersonRenderer(this);
      this.resourceManager.addReloadListener(this.itemRenderer);
      this.renderTypeBuffers = new RenderTypeBuffers();
      this.gameRenderer = new GameRenderer(this, this.resourceManager, this.renderTypeBuffers);
      this.resourceManager.addReloadListener(this.gameRenderer);
      this.field_244597_aC = new FilterManager(this, this.field_244734_au);
      this.blockRenderDispatcher = new BlockRendererDispatcher(this.modelManager.method1025(), this.blockColors);
      this.resourceManager.addReloadListener(this.blockRenderDispatcher);
      this.worldRenderer = new WorldRenderer(this, this.renderTypeBuffers);
      this.resourceManager.addReloadListener(this.worldRenderer);
      this.populateSearchTreeManager();
      this.resourceManager.addReloadListener(this.searchTreeManager);
      this.particles = new ParticleManager(this.world, this.textureManager);
      this.resourceManager.addReloadListener(this.particles);
      this.paintingSprites = new PaintingSpriteUploader(this.textureManager);
      this.resourceManager.addReloadListener(this.paintingSprites);
      this.potionSprites = new PotionSpriteUploader(this.textureManager);
      this.resourceManager.addReloadListener(this.potionSprites);
      this.warningGPU = new GPUWarning();
      this.resourceManager.addReloadListener(this.warningGPU);
      Client.getInstance().start();
      this.ingameGUI = new IngameGui(this);
      this.debugRenderer = new DebugRenderer(this);
      RenderSystem.setErrorCallback(this::disableVSyncAfterGlError);
      if (this.gameSettings.fullscreen && !this.mainWindow.isFullscreen()) {
         this.mainWindow.toggleFullscreen();
         this.gameSettings.fullscreen = this.mainWindow.isFullscreen();
      }

      this.mainWindow.setVsync(this.gameSettings.vsync);
      this.mainWindow.setRawMouseInput(this.gameSettings.rawMouseInput);
      this.mainWindow.setLogOnGlError();
      this.updateWindowSize();
      if (s != null) {
         this.displayGuiScreen(new ConnectingScreen(new MainMenuScreen(), this, s, i));
      } else {
         this.displayGuiScreen(new MainMenuScreen(true));
      }

      ResourceLoadProgressGui.loadLogoTexture(this);
      List<IResourcePack> list = this.resourcePackRepository.func_232623_f_();
      this.setLoadingGui(
         new CustomResourceLoadProgressGui(
            this, this.resourceManager.reloadResources(Util.getServerExecutor(), this, RESOURCE_RELOAD_INIT_TASK, list), var1x -> Util.acceptOrElse(var1x, this::restoreResourcePacks, () -> {
                  if (SharedConstants.developmentMode) {
                     this.checkMissingData();
                  }
               }), false
         )
      );
   }

   public void setDefaultMinecraftTitle() {
      this.mainWindow.setWindowTitle(this.getWindowTitle());
   }

   private String getWindowTitle() {
      StringBuilder stringbuilder = new StringBuilder(Client.getInstance().getClientMode() == ClientMode.JELLO ? "Jello for Sigma 5.0" : "Sigma 5.0");
      stringbuilder.append(" ");
      stringbuilder.append(SharedConstants.getVersion().getName());
      ClientPlayNetHandler clientplaynethandler = this.getConnection();
      if (clientplaynethandler != null && clientplaynethandler.getNetworkManager().isChannelOpen()) {
         stringbuilder.append(" - ");
         if (this.integratedServer != null && !this.integratedServer.getPublic()) {
            stringbuilder.append(I18n.format("title.singleplayer"));
         } else if (this.isConnectedToRealms()) {
            stringbuilder.append(I18n.format("title.multiplayer.realms"));
         } else if (this.integratedServer != null || this.currentServerData != null && this.currentServerData.isOnLAN()) {
            stringbuilder.append(I18n.format("title.multiplayer.lan"));
         } else {
            stringbuilder.append(I18n.format("title.multiplayer.other"));
         }
      }

      return stringbuilder.toString();
   }

   private SocialInteractionsService func_244735_a(YggdrasilAuthenticationService p_244735_1_, GameConfiguration p_244735_2_) {
      try {
         return p_244735_1_.createSocialInteractionsService(p_244735_2_.userInfo.session.getToken());
      } catch (AuthenticationException var4) {
         LOGGER.error("Failed to verify authentication", var4);
         return new OfflineSocialInteractions();
      }
   }

   public boolean isModdedClient() {
      return false;
   }

   private void restoreResourcePacks(Throwable throwableIn) {
      if (this.resourcePackRepository.func_232621_d_().size() > 1) {
         StringTextComponent itextcomponent;
         if (throwableIn instanceof SimpleReloadableResourceManager.FailedPackException) {
            itextcomponent = new StringTextComponent(((SimpleReloadableResourceManager.FailedPackException)throwableIn).method10488().method1228());
         } else {
            itextcomponent = null;
         }

         this.throwResourcePackLoadError(throwableIn, itextcomponent);
      } else {
         Util.toRuntimeException(throwableIn);
      }
   }

   public void throwResourcePackLoadError(Throwable throwable, ITextComponent errorMessage) {
      LOGGER.info("Caught error loading resourcepacks, removing all selected resourcepacks", throwable);
      this.resourcePackRepository.setEnabledPacks(Collections.emptyList());
      this.gameSettings.resourcePacks.clear();
      this.gameSettings.incompatibleResourcePacks.clear();
      this.gameSettings.saveOptions();
      this.reloadResources().thenRun(() -> {
         ToastGui toastgui = this.getToastGui();
         SystemToast.method24907(toastgui, SystemToast.Type.PACK_LOAD_FAILURE, new TranslationTextComponent("resourcePack.load_fail"), errorMessage);
      });
   }

   public void run() {
      this.thread = Thread.currentThread();

      try {
         boolean flag = false;

         while (this.running) {
            if (this.crashReporter != null) {
               displayCrashReport(this.crashReporter);
               return;
            }

            try {
               LongTickDetector longtickdetector = LongTickDetector.method36636("Renderer");
               boolean flag1 = this.isDebugMode();
               this.tick(flag1, longtickdetector);
               this.profiler.startTick();
               this.runGameLoop(!flag);
               Client.getInstance().endTick();
               this.profiler.endTick();
               this.func_238210_b_(flag1, longtickdetector);
            } catch (OutOfMemoryError outofmemoryerror) {
               if (flag) {
                  throw outofmemoryerror;
               }

               this.freeMemory();
               this.displayGuiScreen(new MemoryErrorScreen());
               System.gc();
               LOGGER.fatal("Out of memory", outofmemoryerror);
               flag = true;
            }
         }
      } catch (ReportedException reportedexception) {
         this.addGraphicsAndWorldToCrashReport(reportedexception.getCrashReport());
         this.freeMemory();
         LOGGER.fatal("Reported exception thrown!", reportedexception);
         displayCrashReport(reportedexception.getCrashReport());
      } catch (Throwable var6) {
         CrashReport var2 = this.addGraphicsAndWorldToCrashReport(new CrashReport("Unexpected error", var6));
         LOGGER.fatal("Unreported exception thrown!", var6);
         this.freeMemory();
         displayCrashReport(var2);
      }
   }

   public void forceUnicodeFont(boolean forced) {
      this.fontResourceMananger.method6706(forced ? ImmutableMap.of(DEFAULT_FONT_RENDERER_NAME, UNIFORM_FONT_RENDERER_NAME) : ImmutableMap.of());
   }

   private void populateSearchTreeManager() {
      SearchTree<ItemStack> var1 = new SearchTree<ItemStack>(
         var0 -> var0.getTooltip((PlayerEntity)null, TooltipFlags.NORMAL)
               .stream()
               .<String>map(var0x -> TextFormatting.getTextWithoutFormattingCodes(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty()),
         var0 -> Stream.<ResourceLocation>of(Registry.ITEM.getKey(var0.getItem()))
      );
      SearchTreeReloadable<ItemStack> var2 = new SearchTreeReloadable<ItemStack>(var0 -> Class5985.method18561().method27138(var0.getItem()).stream());
      NonNullList<ItemStack> var3 = NonNullList.create();

      for (Item var5 : Registry.ITEM) {
         var5.fillItemGroup(ItemGroup.SEARCH, var3);
      }

      var3.forEach(var2x -> {
         var1.func_217872_a(var2x);
         var2.func_217872_a(var2x);
      });
      SearchTree<RecipeList> var6 = new SearchTree<RecipeList>(
              recipeList ->      recipeList.getRecipes()
               .stream()
               .<ITextComponent>flatMap(recipe -> recipe.getRecipeOutput().getTooltip((PlayerEntity)null, TooltipFlags.NORMAL).stream())
               .<String>map(textComponent -> TextFormatting.getTextWithoutFormattingCodes(textComponent.getString()).trim())
               .filter(name -> !name.isEmpty()),
              recipeList ->      recipeList.getRecipes().stream().<ResourceLocation>map(recipe -> Registry.ITEM.getKey(recipe.getRecipeOutput().getItem()))
      );
      this.searchTreeManager.add(SearchTreeManager.ITEMS, var1);
      this.searchTreeManager.add(SearchTreeManager.TAGS, var2);
      this.searchTreeManager.add(SearchTreeManager.RECIPES, var6);
   }

   private void disableVSyncAfterGlError(int error, long description) {
      this.gameSettings.vsync = false;
      this.gameSettings.saveOptions();
   }

   private static boolean isJvm64bit() {
      String[] astring = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String s : astring) {
         String s1 = System.getProperty(s);
         if (s1 != null && s1.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public Framebuffer getFramebuffer() {
      return this.framebuffer;
   }

   public String getVersion() {
      return this.launchedVersion;
   }

   public String getVersionType() {
      return this.versionType;
   }

   public void crashed(CrashReport var1) {
      this.crashReporter = var1;
   }

   public static void displayCrashReport(CrashReport report) {
      File file1 = new File(getInstance().gameDir, "crash-reports");
      File file2 = new File(file1, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
      Bootstrap.printToSYSOUT(report.getCompleteReport());
      if (report.getFile() != null) {
         Bootstrap.printToSYSOUT("#@!@# Game crashed! Crash report saved to: #@!@# " + report.getFile());
         System.exit(-1);
      } else if (report.saveToFile(file2)) {
         Bootstrap.printToSYSOUT("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
         System.exit(-1);
      } else {
         Bootstrap.printToSYSOUT("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean getForceUnicodeFont() {
      return this.gameSettings.forceUnicodeFont;
   }

   public CompletableFuture<Void> reloadResources() {
      if (this.futureRefreshResources != null) {
         return this.futureRefreshResources;
      } else {
         CompletableFuture<Void> var1 = new CompletableFuture<>();
         if (this.loadingGui instanceof ResourceLoadProgressGui) {
            this.futureRefreshResources = var1;
            return var1;
         } else {
            this.resourcePackRepository.reloadPacksFromFinders();
            List<IResourcePack> var2 = this.resourcePackRepository.func_232623_f_();
            this.setLoadingGui(
               new CustomResourceLoadProgressGui(
                  this,
                  this.resourceManager.reloadResources(Util.getServerExecutor(), this, RESOURCE_RELOAD_INIT_TASK, var2),
                  var2x -> Util.acceptOrElse(var2x, this::restoreResourcePacks, () -> {
                        this.worldRenderer.loadRenderers();
                        var1.complete((Void)null);
                     }),
                  true
               )
            );
            return var1;
         }
      }
   }

   private void checkMissingData() {
      boolean flag = false;
      BlockModelShapes var2 = this.getBlockRendererDispatcher().getBlockModelShapes();
      IBakedModel var3 = var2.getModelManager().getMissingModel();

      for (Block var5 : Registry.BLOCK) {
          for (BlockState var7 : var5.getStateContainer().getValidStates()) {
              if (var7.getRenderType() == BlockRenderType.MODEL) {
                  IBakedModel var8 = var2.method38153(var7);
                  if (var8 == var3) {
                      LOGGER.debug("Missing model for: {}", var7);
                      flag = true;
                  }
              }
          }
      }

      TextureAtlasSprite var13 = var3.getParticleTexture();

      for (Block var16 : Registry.BLOCK) {
          for (BlockState var20 : var16.getStateContainer().getValidStates()) {
              TextureAtlasSprite var9 = var2.getTexture(var20);
              if (! var20.isAir() && var9 == var13) {
                  LOGGER.debug("Missing particle icon for: {}", var20);
                  flag = true;
              }
          }
      }

      NonNullList<ItemStack> var15 = NonNullList.create();

      for (Item var19 : Registry.ITEM) {
         var15.clear();
         var19.fillItemGroup(ItemGroup.SEARCH, var15);

         for (ItemStack var22 : var15) {
            String var10 = var22.getTranslationKey();
            String var11 = new TranslationTextComponent(var10).getString();
            if (var11.toLowerCase(Locale.ROOT).equals(var19.getTranslationKey())) {
               LOGGER.debug("Missing translation for: {} {} {}", var22, var10, var22.getItem());
            }
         }
      }

      flag |= ScreenManager.isMissingScreen();
      if (flag) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public SaveFormat getSaveLoader() {
      return this.saveFormat;
   }

   private void openChatScreen(String defaultText) {
      if (!this.isIntegratedServerRunning() && !this.isChatEnabled())
      {
         if (this.player != null)
         {
            //this.player.sendMessage((new TranslationTextComponent("chat.cannotSend")).mergeStyle(TextFormatting.RED), Util.DUMMY_UUID);
         }
         this.displayGuiScreen(new ChatScreen(defaultText));
      }
      else
      {
         this.displayGuiScreen(new ChatScreen(defaultText));
      }
   }

   public void displayGuiScreen(Screen guiScreenIn) {
      if (this.currentScreen != null) {
         this.currentScreen.onClose();
      }

      if (guiScreenIn == null && this.world == null) {
         guiScreenIn = new MainMenuScreen();
      } else if (guiScreenIn == null && this.player.getShouldBeDead()) {
         if (this.player.isShowDeathScreen()) {
            guiScreenIn = new DeathScreen(null, this.world.getWorldInfo().isHardcore());
         } else {
            this.player.respawnPlayer();
         }
      }

      if (guiScreenIn instanceof MainMenuScreen || guiScreenIn instanceof MultiplayerScreen) {
         this.gameSettings.showDebugInfo = false;
         this.ingameGUI.getChatGUI().clearChatMessages(true);
      }

      this.currentScreen = guiScreenIn;
      Client.getInstance().getGuiManager().method33481();
      if (guiScreenIn != null) {
         this.mouseHelper.ungrabMouse();
         KeyBinding.unPressAllKeys();
         guiScreenIn.init(this, this.mainWindow.getScaledWidth(), this.mainWindow.getScaledHeight());
         this.skipRenderWorld = false;
         NarratorChatListener.INSTANCE.say(guiScreenIn.getNarrationMessage());
      } else {
         this.soundHandler.resume();
         this.mouseHelper.grabMouse();
      }

      this.setDefaultMinecraftTitle();
   }

   public void setLoadingGui(LoadingGui loadingGuiIn) {
      this.loadingGui = loadingGuiIn;
   }

   public void shutdownMinecraftApplet() {
      try {
         LOGGER.info("Stopping!");

         try {
            NarratorChatListener.INSTANCE.close();
         } catch (Throwable var7) {
         }

         try {
            if (this.world != null) {
               this.world.sendQuittingDisconnectingPacket();
            }

            this.unloadWorld();
         } catch (Throwable var6) {
         }

         if (this.currentScreen != null) {
            this.currentScreen.onClose();
         }

         this.close();
      } finally {
         Util.nanoTimeSupplier = System::nanoTime;
         if (this.crashReporter == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      try {
         this.modelManager.close();
         this.fontResourceMananger.close();
         this.gameRenderer.close();
         this.worldRenderer.close();
         this.soundHandler.unloadSounds();
         this.resourcePackRepository.close();
         this.particles.close();
         this.potionSprites.close();
         this.paintingSprites.close();
         this.textureManager.close();
         this.resourceManager.close();
         Util.shutdown();
      } catch (Throwable throwable) {
         LOGGER.error("Shutdown failure!", throwable);
         throw throwable;
      } finally {
         this.virtualScreen.close();
         this.mainWindow.close();
      }
   }

   private void runGameLoop(boolean renderWorldIn) {
      this.mainWindow.setRenderPhase("Pre render");
      long i = Util.nanoTime();
      if (this.mainWindow.shouldClose()) {
         this.shutdown();
      }

      if (this.futureRefreshResources != null && !(this.loadingGui instanceof ResourceLoadProgressGui)) {
         CompletableFuture<Void> completablefuture = this.futureRefreshResources;
         this.futureRefreshResources = null;
         this.reloadResources().thenRun(() -> completablefuture.complete(null));
      }

      Runnable runnable;
      while ((runnable = this.queueChunkTracking.poll()) != null) {
         runnable.run();
      }

      if (renderWorldIn) {
         int j = this.timer.getPartialTicks(Util.milliTime());
         this.profiler.startSection("scheduledExecutables");
         this.drainTasks();
         this.profiler.endSection();
         this.profiler.startSection("tick");

         for (int k = 0; k < Math.min(10, j); k++) {
            this.profiler.func_230035_c_("clientTick");
            this.runTick();
         }

         this.profiler.endSection();
      }

      this.mouseHelper.updatePlayerLook();
      this.mainWindow.setRenderPhase("Render");
      this.profiler.startSection("sound");
      this.soundHandler.updateListener(this.gameRenderer.getActiveRenderInfo());
      this.profiler.endSection();
      this.profiler.startSection("render");
      RenderSystem.pushMatrix();
      RenderSystem.clear(16640, IS_RUNNING_ON_MAC);
      this.framebuffer.bindFramebuffer(true);
      FogRenderer.resetFog();
      this.profiler.startSection("display");
      RenderSystem.enableTexture();
      RenderSystem.enableCull();
      this.profiler.endSection();
      if (!this.skipRenderWorld) {
         this.profiler.endStartSection("gameRenderer");
         this.gameRenderer.updateCameraAndRender(this.isGamePaused ? this.renderPartialTicksPaused : this.timer.renderPartialTicks, i, renderWorldIn);
         this.profiler.endStartSection("toasts");
         this.toastGui.func_238541_a_(new MatrixStack());
         this.profiler.endSection();
      }

      if (this.profilerResult != null) {
         this.profiler.startSection("fpsPie");
         this.func_238183_a_(new MatrixStack(), this.profilerResult);
         this.profiler.endSection();
      }

      this.profiler.startSection("blit");
      this.framebuffer.unbindFramebuffer();
      RenderSystem.popMatrix();
      RenderSystem.pushMatrix();
      this.framebuffer.framebufferRender(this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight());
      RenderSystem.popMatrix();
      this.profiler.endStartSection("updateDisplay");
      this.mainWindow.flipFrame();
      int var10 = this.getFramerateLimit();
      if ((double)var10 < AbstractOption.FRAMERATE_LIMIT.getMaxValue()) {
         RenderSystem.limitDisplayFPS(var10);
      }

      this.profiler.endStartSection("yield");
      Thread.yield();
      this.profiler.endSection();
      this.mainWindow.setRenderPhase("Post render");
      this.fpsCounter++;
      boolean var11 = this.isSingleplayer()
         && (this.currentScreen != null && this.currentScreen.isPauseScreen() || this.loadingGui != null && this.loadingGui.isPauseScreen())
         && !this.integratedServer.getPublic();
      if (this.isGamePaused != var11) {
         if (this.isGamePaused) {
            this.renderPartialTicksPaused = this.timer.renderPartialTicks;
         } else {
            this.timer.renderPartialTicks = this.renderPartialTicksPaused;
         }

         this.isGamePaused = var11;
      }

      long var7 = Util.nanoTime();
      this.frameTimer.addFrame(var7 - this.startNanoTime);
      this.startNanoTime = var7;
      this.profiler.startSection("fpsUpdate");

      while (Util.milliTime() >= this.debugUpdateTime + 1000L) {
         debugFps = this.fpsCounter;
         this.debug = String.format(
            "%d fps T: %s%s%s%s B: %d",
                 debugFps,
            (double)this.gameSettings.framerateLimit == AbstractOption.FRAMERATE_LIMIT.getMaxValue() ? "inf" : this.gameSettings.framerateLimit,
            this.gameSettings.vsync ? " vsync" : "",
            this.gameSettings.graphicFanciness.toString(),
            this.gameSettings.cloudOption == CloudOption.OFF ? "" : (this.gameSettings.cloudOption == CloudOption.FAST ? " fast-clouds" : " fancy-clouds"),
            this.gameSettings.biomeBlendRadius
         );
         this.debugUpdateTime += 1000L;
         this.fpsCounter = 0;
         this.snooper.addMemoryStatsToSnooper();
         if (!this.snooper.isSnooperRunning()) {
            this.snooper.start();
         }
      }

      this.profiler.endSection();
   }

   private boolean isDebugMode() {
      return this.gameSettings.showDebugInfo && this.gameSettings.showDebugProfilerChart && !this.gameSettings.hideGUI;
   }

   private void tick(boolean isDebug, LongTickDetector var2) {
      if (isDebug) {
         if (!this.gameTimeTracker.func_233505_a_()) {
            this.gameTime = 0;
            this.gameTimeTracker.func_233507_c_();
         }

         this.gameTime++;
      } else {
         this.gameTimeTracker.func_233506_b_();
      }

      this.profiler = LongTickDetector.func_233523_a_(this.gameTimeTracker.func_233508_d_(), var2);
   }

   private void func_238210_b_(boolean isDebug, LongTickDetector detector) {
      if (detector != null) {
         detector.func_233525_b_();
      }

      if (isDebug) {
         this.profilerResult = this.gameTimeTracker.func_233509_e_();
      } else {
         this.profilerResult = null;
      }

      this.profiler = this.gameTimeTracker.func_233508_d_();
   }

   @Override
   public void updateWindowSize() {
      int i = this.mainWindow.calcGuiScale(this.gameSettings.guiScale, this.getForceUnicodeFont());
      this.mainWindow.setGuiScale((double)i);
      if (this.currentScreen != null) {
         this.currentScreen.resize(this, this.mainWindow.getScaledWidth(), this.mainWindow.getScaledHeight());
         Client.getInstance().getGuiManager().onResize();
      }

      Framebuffer framebuffer = this.getFramebuffer();
      framebuffer.resize(this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight(), IS_RUNNING_ON_MAC);
      this.gameRenderer.updateShaderGroupSize(this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight());
      this.mouseHelper.setIgnoreFirstMove();
   }

   @Override
   public void ignoreFirstMove() {
      this.mouseHelper.ignoreFirstMove();
   }

   private int getFramerateLimit() {
      return this.world == null && (this.currentScreen != null || this.loadingGui != null)
         ? Math.min(120, Math.max(this.mainWindow.getLimitFramerate(), 60))
         : this.mainWindow.getLimitFramerate();
   }

   public void freeMemory() {
      try {
         memoryReserve = new byte[0];
         this.worldRenderer.deleteAllDisplayLists();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.integratedServerIsRunning && this.integratedServer != null) {
            this.integratedServer.initiateShutdown(true);
         }

         this.unloadWorld(new DirtMessageScreen(new TranslationTextComponent("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public void updateDebugProfilerName(int keyCount) {
      if (this.profilerResult != null) {
         List var2 = this.profilerResult.getDataPoints(this.debugProfilerName);
         if (!var2.isEmpty()) {
            DataPoint var3 = (DataPoint)var2.remove(0);
            if (keyCount == 0) {
               if (!var3.name.isEmpty()) {
                  int var4 = this.debugProfilerName.lastIndexOf(30);
                  if (var4 >= 0) {
                     this.debugProfilerName = this.debugProfilerName.substring(0, var4);
                  }
               }
            } else {
               keyCount--;
               if (keyCount < var2.size() && !"unspecified".equals(((DataPoint)var2.get(keyCount)).name)) {
                  if (!this.debugProfilerName.isEmpty()) {
                     this.debugProfilerName = this.debugProfilerName + '\u001e';
                  }

                  this.debugProfilerName = this.debugProfilerName + ((DataPoint)var2.get(keyCount)).name;
               }
            }
         }
      }
   }

   private void func_238183_a_(MatrixStack matrixStack, IProfileResult profilerResult) {
      List<DataPoint> var3 = profilerResult.getDataPoints(this.debugProfilerName);
      DataPoint var4 = (DataPoint)var3.remove(0);
      RenderSystem.clear(256, IS_RUNNING_ON_MAC);
      RenderSystem.matrixMode(5889);
      RenderSystem.loadIdentity();
      RenderSystem.ortho(0.0, (double)this.mainWindow.getFramebufferWidth(), (double)this.mainWindow.getFramebufferHeight(), 0.0, 1000.0, 3000.0);
      RenderSystem.matrixMode(5888);
      RenderSystem.loadIdentity();
      RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
      RenderSystem.lineWidth(1.0F);
      RenderSystem.disableTexture();
      Tessellator var5 = Tessellator.getInstance();
      BufferBuilder var6 = var5.getBuffer();
      short var7 = 160;
      int var8 = this.mainWindow.getFramebufferWidth() - 160 - 10;
      int var9 = this.mainWindow.getFramebufferHeight() - 320;
      RenderSystem.enableBlend();
      var6.begin(7, DefaultVertexFormats.POSITION_COLOR);
      var6.pos((double)((float)var8 - 176.0F), (double)((float)var9 - 96.0F - 16.0F), 0.0).color(200, 0, 0, 0).endVertex();
      var6.pos((double)((float)var8 - 176.0F), (double)(var9 + 320), 0.0).color(200, 0, 0, 0).endVertex();
      var6.pos((double)((float)var8 + 176.0F), (double)(var9 + 320), 0.0).color(200, 0, 0, 0).endVertex();
      var6.pos((double)((float)var8 + 176.0F), (double)((float)var9 - 96.0F - 16.0F), 0.0).color(200, 0, 0, 0).endVertex();
      var5.draw();
      RenderSystem.disableBlend();
      double var10 = 0.0;

      for (DataPoint var13 : var3) {
         int var14 = MathHelper.floor(var13.relTime / 4.0) + 1;
         var6.begin(6, DefaultVertexFormats.POSITION_COLOR);
         int var15 = var13.getTextColor();
         int var16 = var15 >> 16 & 0xFF;
         int var17 = var15 >> 8 & 0xFF;
         int var18 = var15 & 0xFF;
         var6.pos((double)var8, (double)var9, 0.0).color(var16, var17, var18, 255).endVertex();

         for (int var19 = var14; var19 >= 0; var19--) {
            float var20 = (float)((var10 + var13.relTime * (double)var19 / (double)var14) * (float) (Math.PI * 2) / 100.0);
            float var21 = MathHelper.sin(var20) * 160.0F;
            float var22 = MathHelper.cos(var20) * 160.0F * 0.5F;
            var6.pos((double)((float)var8 + var21), (double)((float)var9 - var22), 0.0).color(var16, var17, var18, 255).endVertex();
         }

         var5.draw();
         var6.begin(5, DefaultVertexFormats.POSITION_COLOR);

         for (int var32 = var14; var32 >= 0; var32--) {
            float var36 = (float)((var10 + var13.relTime * (double)var32 / (double)var14) * (float) (Math.PI * 2) / 100.0);
            float var37 = MathHelper.sin(var36) * 160.0F;
            float var38 = MathHelper.cos(var36) * 160.0F * 0.5F;
            if (!(var38 > 0.0F)) {
               var6.pos((double)((float)var8 + var37), (double)((float)var9 - var38), 0.0)
                  .color(var16 >> 1, var17 >> 1, var18 >> 1, 255)
                  .endVertex();
               var6.pos((double)((float)var8 + var37), (double)((float)var9 - var38 + 10.0F), 0.0)
                  .color(var16 >> 1, var17 >> 1, var18 >> 1, 255)
                  .endVertex();
            }
         }

         var5.draw();
         var10 += var13.relTime;
      }

      DecimalFormat var23 = new DecimalFormat("##0.00");
      var23.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
      RenderSystem.enableTexture();
      String var24 = IProfileResult.method25634(var4.name);
      String var25 = "";
      if (!"unspecified".equals(var24)) {
         var25 = var25 + "[0] ";
      }

      if (var24.isEmpty()) {
         var25 = var25 + "ROOT ";
      } else {
         var25 = var25 + var24 + ' ';
      }

      int var28 = 16777215;
      this.fontRenderer.drawStringWithShadow(matrixStack, var25, (float)(var8 - 160), (float)(var9 - 80 - 16), 16777215);
      var25 = var23.format(var4.field13083) + "%";
      this.fontRenderer.drawStringWithShadow(matrixStack, var25, (float)(var8 + 160 - this.fontRenderer.getStringWidth(var25)), (float)(var9 - 80 - 16), 16777215);

      for (int var29 = 0; var29 < var3.size(); var29++) {
         DataPoint var30 = (DataPoint)var3.get(var29);
         StringBuilder var31 = new StringBuilder();
         if ("unspecified".equals(var30.name)) {
            var31.append("[?] ");
         } else {
            var31.append("[").append(var29 + 1).append("] ");
         }

         String var33 = var31.append(var30.name).toString();
         this.fontRenderer.drawStringWithShadow(matrixStack, var33, (float)(var8 - 160), (float)(var9 + 80 + var29 * 8 + 20), var30.getTextColor());
         var33 = var23.format(var30.relTime) + "%";
         this.fontRenderer
            .drawStringWithShadow(matrixStack, var33, (float)(var8 + 160 - 50 - this.fontRenderer.getStringWidth(var33)), (float)(var9 + 80 + var29 * 8 + 20), var30.getTextColor());
         var33 = var23.format(var30.field13083) + "%";
         this.fontRenderer
            .drawStringWithShadow(matrixStack, var33, (float)(var8 + 160 - this.fontRenderer.getStringWidth(var33)), (float)(var9 + 80 + var29 * 8 + 20), var30.getTextColor());
      }
   }

   public void shutdown() {
      if (this.running) {
         Client.getInstance().shutdown();
      }

      this.running = false;
   }

   public boolean isRunning() {
      return this.running;
   }

   public void displayInGameMenu(boolean pauseOnly) {
      if (this.currentScreen == null) {
         boolean var2 = this.isSingleplayer() && !this.integratedServer.getPublic();
         if (var2) {
            this.displayGuiScreen(new IngameMenuScreen(!pauseOnly));
            this.soundHandler.pause();
         } else {
            this.displayGuiScreen(new IngameMenuScreen(true));
         }
      }
   }

   private void sendClickBlockToController(boolean leftClick) {
      if (!leftClick) {
         this.leftClickCounter = 0;
      }

      if (this.leftClickCounter <= 0 && !this.player.isHandActive()) {
         if (leftClick && this.objectMouseOver != null && this.objectMouseOver.getType() == RayTraceResult.Type.BLOCK) {
            BlockRayTraceResult var2 = (BlockRayTraceResult)this.objectMouseOver;
            BlockPos var3 = var2.getPos();
            if (!this.world.getBlockState(var3).isAir()) {
               Direction var4 = var2.getFace();
               if (this.playerController.onPlayerDamageBlock(var3, var4)) {
                  this.particles.addBlockHitEffects(var3, var4);
                  this.player.swingArm(Hand.MAIN_HAND);
               }
            }
         } else {
            this.playerController.resetBlockRemoving();
         }
      }
   }

   /**
    * Idk this doesn't match the source code so i cba to do this rn
    * TODO: Finish this perhaps
    */
   private void clickMouse() {
      ClickEvent var1 = new ClickEvent(ClickEvent.Button.LEFT);
      Client.getInstance().getEventManager().call(var1);
      if (!var1.isCancelled()) {
         if (this.leftClickCounter <= 0) {
            if (this.objectMouseOver == null) {
               LOGGER.error("Null returned as 'hitResult', this shouldn't happen!");
               if (this.playerController.isNotCreative()) {
                  this.leftClickCounter = 10;
               }
            } else if (!this.player.isRowingBoat()) {
               Class4403 var2 = null;
               if (this.objectMouseOver.getType() == RayTraceResult.Type.ENTITY) {
                  var2 = new Class4403(((EntityRayTraceResult)this.objectMouseOver).getEntity(), true);
                  Client.getInstance().getEventManager().call(var2);
                  if (var2.isCancelled()) {
                     return;
                  }
               }


               switch (Class9158.field42043[this.objectMouseOver.getType().ordinal()]) {
                  case 1:
                     this.playerController.method23141(this.player, ((EntityRayTraceResult)this.objectMouseOver).getEntity());
                     if (var2 != null) {
                        var2.method13938();
                        Client.getInstance().getEventManager().call(var2);
                     }
                     break;
                  case 2:
                     BlockRayTraceResult var4 = (BlockRayTraceResult)this.objectMouseOver;
                     BlockPos var5 = var4.getPos();
                     if (!this.world.getBlockState(var5).isAir()) {
                        this.playerController.clickBlock(var5, var4.getFace());
                        break;
                     }
                  case 3:
                     if (this.playerController.isNotCreative()) {
                        this.leftClickCounter = 10;
                     }

                     this.player.resetCooldown();
               }

               this.player.swingArm(Hand.MAIN_HAND);
            }
         }
      }
   }


   private void rightClickMouse() {
      ClickEvent var1 = new ClickEvent(ClickEvent.Button.RIGHT);
      Client.getInstance().getEventManager().call(var1);
      if (!var1.isCancelled()) {
         if (!this.playerController.getIsHittingBlock()) {
            this.rightClickDelayTimer = 4;
            if (!this.player.isRowingBoat()) {
               if (this.objectMouseOver == null) {
                  LOGGER.warn("Null returned as 'hitResult', this shouldn't happen!");
               }

               for (Hand var5 : Hand.values()) {
                  ItemStack var6 = this.player.getHeldItem(var5);
                  if (this.objectMouseOver != null) {
                     switch (Class9158.field42043[this.objectMouseOver.getType().ordinal()]) {
                        case 1:
                           EntityRayTraceResult var7 = (EntityRayTraceResult)this.objectMouseOver;
                           Entity var8 = var7.getEntity();
                           ActionResultType var9 = this.playerController.interactWithEntity(this.player, var8, var7, var5);
                           if (!var9.isSuccessOrConsume()) {
                              var9 = this.playerController.interactWithEntity(this.player, var8, var5);
                           }

                           if (var9.isSuccessOrConsume()) {
                              if (var9.isSuccess()) {
                                 this.player.swingArm(var5);
                              }

                              return;
                           }
                           break;
                        case 2:
                           BlockRayTraceResult var10 = (BlockRayTraceResult)this.objectMouseOver;
                           int var11 = var6.getCount();
                           ActionResultType var12 = this.playerController.func_217292_a(this.player, this.world, var5, var10);
                           if (var12.isSuccessOrConsume()) {
                              if (var12.isSuccess()) {
                                 this.player.swingArm(var5);
                                 if (!var6.isEmpty() && (var6.getCount() != var11 || this.playerController.isInCreativeMode())) {
                                    this.gameRenderer.itemRenderer.resetEquippedProgress(var5);
                                 }
                              }

                              return;
                           }

                           if (var12 == ActionResultType.FAIL) {
                              return;
                           }
                     }
                  }

                  if (!var6.isEmpty()) {
                     ActionResultType var13 = this.playerController.processRightClick(this.player, this.world, var5);
                     if (var13.isSuccessOrConsume()) {
                        if (var13.isSuccess()) {
                           this.player.swingArm(var5);
                        }

                        this.gameRenderer.itemRenderer.resetEquippedProgress(var5);
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public MusicTicker getMusicTicker() {
      return this.musicTicker;
   }

   public void runTick() {
      if (this.rightClickDelayTimer > 0) {
         this.rightClickDelayTimer--;
      }

      this.profiler.startSection("gui");
      if (!this.isGamePaused) {
         this.ingameGUI.tick();
      }

      this.profiler.endSection();
      this.gameRenderer.getMouseOver(1.0F);
      this.tutorial.onMouseHover(this.world, this.objectMouseOver);
      this.profiler.startSection("gameMode");
      if (!this.isGamePaused && this.world != null) {
         this.playerController.tick();
      }

      this.profiler.endStartSection("textures");
      if (this.world != null) {
         this.textureManager.tick();
      }

      if (this.currentScreen == null && this.player != null) {
         if (this.player.getShouldBeDead() && !(this.currentScreen instanceof DeathScreen)) {
            this.displayGuiScreen((Screen)null);
         } else if (this.player.isSleeping() && this.world != null) {
            this.displayGuiScreen(new SleepInMultiplayerScreen());
         }
      } else if (this.currentScreen != null && this.currentScreen instanceof SleepInMultiplayerScreen && !this.player.isSleeping()) {
         this.displayGuiScreen((Screen)null);
      }

      if (this.currentScreen != null) {
         this.leftClickCounter = 10000;
      }

      if (this.currentScreen != null) {
         Screen.wrapScreenError(() -> this.currentScreen.tick(), "Ticking screen", this.currentScreen.getClass().getCanonicalName());
      }

      if (!this.gameSettings.showDebugInfo) {
         this.ingameGUI.reset();
      }

      if (this.loadingGui == null && (this.currentScreen == null || this.currentScreen.field4567)) {
         this.profiler.endStartSection("Keybindings");
         this.processKeyBinds();
         if (this.leftClickCounter > 0) {
            this.leftClickCounter--;
         }
      }

      if (this.world != null) {
         this.profiler.endStartSection("gameRenderer");
         if (!this.isGamePaused) {
            this.gameRenderer.tick();
         }

         this.profiler.endStartSection("levelRenderer");
         if (!this.isGamePaused) {
            this.worldRenderer.tick();
         }

         this.profiler.endStartSection("level");
         if (!this.isGamePaused) {
            if (this.world.getTimeLightningFlash() > 0) {
               this.world.setTimeLightningFlash(this.world.getTimeLightningFlash() - 1);
            }

            this.world.tickEntities();
         }
      } else if (this.gameRenderer.getShaderGroup() != null) {
         this.gameRenderer.stopUseShader();
      }

      if (!this.isGamePaused) {
         this.musicTicker.tick();
      }

      this.soundHandler.tick(this.isGamePaused);
      if (this.world != null) {
         if (!this.isGamePaused) {
            if (!this.gameSettings.field_244601_E && this.func_244600_aM()) {
               TranslationTextComponent var1 = new TranslationTextComponent("tutorial.socialInteractions.title");
               TranslationTextComponent var2 = new TranslationTextComponent(
                  "tutorial.socialInteractions.description", Tutorial.createKeybindComponent("socialInteractions")
               );
               this.field_244598_aV = new TutorialToast(TutorialToast.Icons.SOCIAL_INTERACTIONS, var1, var2, true);
               this.tutorial.func_244698_a(this.field_244598_aV, 160);
               this.gameSettings.field_244601_E = true;
               this.gameSettings.saveOptions();
            }

            this.tutorial.tick();

            try {
               this.world.tick(() -> true);
            } catch (Throwable var4) {
               CrashReport var5 = CrashReport.makeCrashReport(var4, "Exception in world tick");
               if (this.world == null) {
                  CrashReportCategory var3 = var5.makeCategory("Affected level");
                  var3.addDetail("Problem", "Level is null!");
               } else {
                  this.world.fillCrashReport(var5);
               }

               throw new ReportedException(var5);
            }
         }

         this.profiler.endStartSection("animateTick");
         if (!this.isGamePaused && this.world != null) {
            this.world
               .method6852(
                  MathHelper.floor(this.player.getPosX()),
                  MathHelper.floor(this.player.getPosY()),
                  MathHelper.floor(this.player.getPosZ())
               );
         }

         this.profiler.endStartSection("particles");
         if (!this.isGamePaused) {
            this.particles.tick();
         }
      } else if (this.networkManager != null) {
         this.profiler.endStartSection("pendingConnection");
         this.networkManager.tick();
      }

      this.profiler.endStartSection("keyboard");
      this.keyboardListener.tick();
      this.profiler.endSection();
   }

   private boolean func_244600_aM() {
      return !this.integratedServerIsRunning || this.integratedServer != null && this.integratedServer.getPublic();
   }

   private void processKeyBinds() {
      while (this.gameSettings.keyBindTogglePerspective.isPressed()) {
         PointOfView var1 = this.gameSettings.getPointOfView();
         this.gameSettings.setPointOfView(this.gameSettings.getPointOfView().method8248());
         if (var1.func_243192_a() != this.gameSettings.getPointOfView().func_243192_a()) {
            this.gameRenderer.loadEntityShader(this.gameSettings.getPointOfView().func_243192_a() ? this.getRenderViewEntity() : null);
         }

         this.worldRenderer.setDisplayListEntitiesDirty();
      }

      while (this.gameSettings.keyBindSmoothCamera.isPressed()) {
         this.gameSettings.smoothCamera = !this.gameSettings.smoothCamera;
      }

      for (int var4 = 0; var4 < 9; var4++) {
         boolean var2 = this.gameSettings.keyBindSaveToolbar.isKeyDown();
         boolean var3 = this.gameSettings.keyBindLoadToolbar.isKeyDown();
         if (this.gameSettings.keyBindsHotbar[var4].isPressed()) {
            if (this.player.isSpectator()) {
               this.ingameGUI.getSpectatorGui().onHotbarSelected(var4);
            } else if (this.player.isCreative() && this.currentScreen == null && (var3 || var2)) {
               CreativeScreen.handleHotbarSnapshots(this, var4, var3, var2);
            } else {
               this.player.inventory.currentItem = var4;
            }
         }
      }

      while (this.gameSettings.keyBindSocialInteractions.isPressed()) {
         if (!this.func_244600_aM()) {
            this.player.sendStatusMessage(field_244596_I, true);
            NarratorChatListener.INSTANCE.say(field_244596_I.getString());
         } else {
            if (this.field_244598_aV != null) {
               this.tutorial.func_244697_a(this.field_244598_aV);
               this.field_244598_aV = null;
            }

            this.displayGuiScreen(new SocialInteractionsScreen());
         }
      }

      while (this.gameSettings.keyBindInventory.isPressed()) {
         if (this.playerController.isRidingHorse()) {
            this.player.sendHorseInventory();
         } else {
            this.tutorial.openInventory();
            this.displayGuiScreen(new InventoryScreen(this.player));
         }
      }

      while (this.gameSettings.keyBindAdvancements.isPressed()) {
         this.displayGuiScreen(new AdvancementsScreen(this.player.connection.getAdvancementManager()));
      }

      while (this.gameSettings.keyBindSwapHands.isPressed()) {
         if (!this.player.isSpectator()) {
            this.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.SWAP_ITEM_WITH_OFFHAND, BlockPos.ZERO, Direction.DOWN));
         }
      }

      while (this.gameSettings.keyBindDrop.isPressed()) {
         if (!this.player.isSpectator() && this.player.drop(Screen.hasControlDown())) {
            this.player.swingArm(Hand.MAIN_HAND);
         }
      }

      boolean var5 = this.gameSettings.chatVisibility != ChatVisibility.HIDDEN;
      if (var5) {
         while (this.gameSettings.keyBindChat.isPressed()) {
            this.openChatScreen("");
         }

         if (this.currentScreen == null && this.loadingGui == null && this.gameSettings.keyBindCommand.isPressed()) {
            this.openChatScreen("/");
         }
      }

      if (this.player.isHandActive()) {
         if (!this.gameSettings.keyBindUseItem.isKeyDown()) {
            StopUseItemEvent var6 = new StopUseItemEvent();
            Client.getInstance().getEventManager().call(var6);
            if (!var6.isCancelled()) {
               this.playerController.onStoppedUsingItem(this.player);
            }
         }

         while (this.gameSettings.keyBindAttack.isPressed()) {
         }

         while (this.gameSettings.keyBindUseItem.isPressed()) {
         }

         while (this.gameSettings.keyBindPickBlock.isPressed()) {
         }
      } else {
         while (this.gameSettings.keyBindAttack.isPressed()) {
            this.clickMouse();
         }

         while (this.gameSettings.keyBindUseItem.isPressed()) {
            this.rightClickMouse();
         }

         while (this.gameSettings.keyBindPickBlock.isPressed()) {
            this.middleClickMouse();
         }
      }

      if (this.gameSettings.keyBindUseItem.isKeyDown() && this.rightClickDelayTimer == 0 && !this.player.isHandActive()) {
         this.rightClickMouse();
      }

      this.sendClickBlockToController(this.currentScreen == null && this.gameSettings.keyBindAttack.isKeyDown() && this.mouseHelper.isMouseGrabbed());
   }

   public static DatapackCodec loadDataPackCodec(SaveFormat.LevelSave worldStorage) {
      MinecraftServer.func_240777_a_(worldStorage);
      DatapackCodec var1 = worldStorage.readDatapackCodec();
      if (var1 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return var1;
      }
   }

   public static IServerConfiguration loadWorld(SaveFormat.LevelSave var0, DynamicRegistriesImpl var1, IResourceManager var2, DatapackCodec var3) {
      WorldSettingsImport var4 = WorldSettingsImport.create(NBTDynamicOps.INSTANCE, var2, var1);
      IServerConfiguration var5 = var0.readServerConfiguration(var4, var3);
      if (var5 == null) {
         throw new IllegalStateException("Failed to load world");
      } else {
         return var5;
      }
   }

   public void loadWorld(String worldName) {
      this.loadWorld(worldName, DynamicRegistries.func_239770_b_(), Minecraft::loadDataPackCodec, Minecraft::loadWorld, false, WorldSelectionType.BACKUP);
   }

   public void createWorld(String var1, WorldSettings var2, DynamicRegistriesImpl var3, DimensionGeneratorSettings var4) {
      this.loadWorld(
         var1,
         var3,
         var1x -> var2.getDatapackCodec(),
         (var3x, var4x, var5, var6) -> {
            WorldGenSettingsExport var7 = WorldGenSettingsExport.create(JsonOps.INSTANCE, var3);
            WorldSettingsImport var8 = WorldSettingsImport.create(JsonOps.INSTANCE, var5, var3);
            DataResult var9 = DimensionGeneratorSettings.field_236201_a_
               .encodeStart(var7, var4)
               .setLifecycle(Lifecycle.stable())
               .flatMap(var1xx -> DimensionGeneratorSettings.field_236201_a_.parse(var8, var1xx));
            DimensionGeneratorSettings var10 = (DimensionGeneratorSettings) var9.resultOrPartial(Util.func_240982_a_("Error reading worldgen settings after loading data packs: ", LOGGER::error))
               .orElse(var4);
            return new ServerWorldInfo(var2, var10, var9.lifecycle());
         },
         false,
         WorldSelectionType.CREATE
      );
   }

   private void loadWorld(
      String var1,
      DynamicRegistriesImpl var2,
      Function<SaveFormat.LevelSave, DatapackCodec> var3,
      Function4<SaveFormat.LevelSave, DynamicRegistriesImpl, IResourceManager, DatapackCodec, IServerConfiguration> var4,
      boolean var5,
      WorldSelectionType var6
   ) {
      SaveFormat.LevelSave var7;
      try {
         var7 = this.saveFormat.getLevelSave(var1);
      } catch (IOException var21) {
         LOGGER.warn("Failed to read level {} data", var1, var21);
         SystemToast.func_238535_a_(this, var1);
         this.displayGuiScreen((Screen)null);
         return;
      }

      PackManager var8;
      try {
         var8 = this.reloadDatapacks(var2, var3, var4, var5, var7);
      } catch (Exception var20) {
         LOGGER.warn("Failed to load datapacks, can't proceed with server load", var20);
         this.displayGuiScreen(new DatapackFailureScreen(() -> this.loadWorld(var1, var2, var3, var4, true, var6)));

         try {
            var7.close();
         } catch (IOException var16) {
            LOGGER.warn("Failed to unlock access to level {}", var1, var16);
         }

         return;
      }

      IServerConfiguration var9 = var8.getServerConfiguration();
      boolean var10 = var9.getDimensionGeneratorSettings().func_236229_j_();
      boolean var11 = var9.getLifecycle() != Lifecycle.stable();
      if (var6 == WorldSelectionType.NONE || !var10 && !var11) {
         this.unloadWorld();
         this.refChunkStatusListener.set((TrackingChunkStatusListener)null);

         try {
            var7.saveLevel(var2, var9);
            var8.getDataPackRegistries().updateTags();
            YggdrasilAuthenticationService var12 = new YggdrasilAuthenticationService(this.proxy);
            MinecraftSessionService var23 = var12.createMinecraftSessionService();
            GameProfileRepository var25 = var12.createProfileRepository();
            PlayerProfileCache var15 = new PlayerProfileCache(var25, new File(this.gameDir, MinecraftServer.USER_CACHE_FILE.getName()));
            SkullTileEntity.setProfileCache(var15);
            SkullTileEntity.setSessionService(var23);
            PlayerProfileCache.setOnlineMode(false);
            this.integratedServer = MinecraftServer.<IntegratedServer>func_240784_a_(
               var8x -> new IntegratedServer(var8x, this, var2, var7, var8.getResourcePacks(), var8.getDataPackRegistries(), var9, var23, var25, var15, var1xx -> {
                     TrackingChunkStatusListener var2xx = new TrackingChunkStatusListener(var1xx + 0);
                     var2xx.startTracking();
                     this.refChunkStatusListener.set(var2xx);
                     return new ChainedChunkStatusListener(var2xx, this.queueChunkTracking::add);
                  })
            );
            this.integratedServerIsRunning = true;
         } catch (Throwable var19) {
            CrashReport var13 = CrashReport.makeCrashReport(var19, "Starting integrated server");
            CrashReportCategory var14 = var13.makeCategory("Starting integrated server");
            var14.addDetail("Level ID", var1);
            var14.addDetail("Level Name", var9.method20054());
            throw new ReportedException(var13);
         }

         while (this.refChunkStatusListener.get() == null) {
            Thread.yield();
         }

         WorldLoadProgressScreen var22 = new WorldLoadProgressScreen(this.refChunkStatusListener.get());
         this.displayGuiScreen(var22);
         this.profiler.startSection("waitForServer");

         while (!this.integratedServer.method1372()) {
            var22.tick();
            this.runGameLoop(false);

            if (this.crashReporter != null) {
               displayCrashReport(this.crashReporter);
               return;
            }
         }

         this.profiler.endSection();
         SocketAddress var24 = this.integratedServer.getNetworkSystem().addLocalEndpoint();
         NetworkManager var26 = NetworkManager.provideLocalClient(var24);
         var26.setNetHandler(new ClientLoginNetHandler(var26, this, null, var0 -> {}));
         var26.sendPacket(new CHandshakePacket(var24.toString(), 0, ProtocolType.LOGIN));
         var26.sendPacket(new CLoginStartPacket(this.getSession().getProfile()));
         this.networkManager = var26;
      } else {
         this.deleteWorld(var6, var1, var10, () -> this.loadWorld(var1, var2, var3, var4, var5, WorldSelectionType.NONE));
         var8.close();

         try {
            var7.close();
         } catch (IOException var17) {
            LOGGER.warn("Failed to unlock access to level {}", var1, var17);
         }
      }
   }

   private void deleteWorld(WorldSelectionType var1, String var2, boolean var3, Runnable var4) {
      if (var1 == WorldSelectionType.BACKUP) {
         TranslationTextComponent var5;
         TranslationTextComponent var6;
         if (var3) {
            var5 = new TranslationTextComponent("selectWorld.backupQuestion.customized");
            var6 = new TranslationTextComponent("selectWorld.backupWarning.customized");
         } else {
            var5 = new TranslationTextComponent("selectWorld.backupQuestion.experimental");
            var6 = new TranslationTextComponent("selectWorld.backupWarning.experimental");
         }

         this.displayGuiScreen(new ConfirmBackupScreen(null, (var3x, var4x) -> {
            if (var3x) {
               EditWorldScreen.func_241651_a_(this.saveFormat, var2);
            }

            var4.run();
         }, var5, var6, false));
      } else {
         this.displayGuiScreen(
            new ConfirmScreen(
               var3x -> {
                  if (var3x) {
                     var4.run();
                  } else {
                     this.displayGuiScreen(null);

                     try (SaveFormat.LevelSave var4x = this.saveFormat.getLevelSave(var2)) {
                        var4x.deleteSave();
                     } catch (IOException var17) {
                        SystemToast.func_238538_b_(this, var2);
                        LOGGER.error("Failed to delete world {}", var2, var17);
                     }
                  }
               },
               new TranslationTextComponent("selectWorld.backupQuestion.experimental"),
               new TranslationTextComponent("selectWorld.backupWarning.experimental"),
               DialogTexts.GUI_PROCEED,
               DialogTexts.GUI_CANCEL
            )
         );
      }
   }

   public PackManager reloadDatapacks(
           DynamicRegistriesImpl var1, Function<SaveFormat.LevelSave, DatapackCodec> var2, Function4<SaveFormat.LevelSave, DynamicRegistriesImpl, IResourceManager, DatapackCodec, IServerConfiguration> var3, boolean var4, SaveFormat.LevelSave var5
   ) throws InterruptedException, ExecutionException {
      DatapackCodec var6 = (DatapackCodec)var2.apply(var5);
      ResourcePackList var7 = new ResourcePackList(new ServerPackFinder(), new FolderPackFinder(var5.resolveFilePath(FolderName.DATAPACKS).toFile(), IPackNameDecorator.WORLD));

      try {
         DatapackCodec var8 = MinecraftServer.func_240772_a_(var7, var6, var4);
         CompletableFuture var9 = DataPackRegistries.func_240961_a_(var7.func_232623_f_(), Class2085.INTEGRATED, 2, Util.getServerExecutor(), this);
         this.driveUntil(var9::isDone);
         DataPackRegistries var10 = (DataPackRegistries)var9.get();
         IServerConfiguration var11 = var3.apply(var5, var1, var10.getResourceManager(), var8);
         return new PackManager(var7, var10, var11);
      } catch (InterruptedException | ExecutionException var12) {
         var7.close();
         throw var12;
      }
   }

   public void loadWorld(ClientWorld var1) {
      WorkingScreen var2 = new WorkingScreen();
      var2.displaySavingString(new TranslationTextComponent("connect.joining"));
      this.updateScreenTick(var2);
      this.world = var1;
      this.updateWorldRenderer(var1);
      Client.getInstance().getEventManager().call(new WorldLoadEvent());
      if (!this.integratedServerIsRunning) {
         YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService(this.proxy);
         MinecraftSessionService var4 = var3.createMinecraftSessionService();
         GameProfileRepository var5 = var3.createProfileRepository();
         PlayerProfileCache var6 = new PlayerProfileCache(var5, new File(this.gameDir, MinecraftServer.USER_CACHE_FILE.getName()));
         SkullTileEntity.setProfileCache(var6);
         SkullTileEntity.setSessionService(var4);
         PlayerProfileCache.setOnlineMode(false);
      }
   }

   public void unloadWorld() {
      this.unloadWorld(new WorkingScreen());
   }

   public void unloadWorld(Screen var1) {
      ClientPlayNetHandler var2 = this.getConnection();
      if (var2 != null) {
         this.dropTasks();
         var2.cleanup();
      }

      IntegratedServer var3 = this.integratedServer;
      this.integratedServer = null;
      this.gameRenderer.resetData();
      this.playerController = null;
      NarratorChatListener.INSTANCE.clear();
      this.updateScreenTick(var1);
      if (this.world != null) {
         if (var3 != null) {
            this.profiler.startSection("waitForServer");

            while (!var3.isThreadAlive()) {
               this.runGameLoop(false);
            }

            this.profiler.endSection();
         }

         this.packFinder.clearResourcePack();
         this.ingameGUI.resetPlayersOverlayFooterHeader();
         this.currentServerData = null;
         this.integratedServerIsRunning = false;
         this.game.leaveGameSession();
      }

      this.world = null;
      this.updateWorldRenderer((ClientWorld)null);
      this.player = null;
   }

   private void updateScreenTick(Screen var1) {
      this.profiler.startSection("forcedTick");
      this.soundHandler.stop();
      this.renderViewEntity = null;
      this.networkManager = null;
      this.displayGuiScreen(var1);
      this.runGameLoop(false);
      this.profiler.endSection();
   }

   public void forcedScreenTick(Screen var1) {
      this.profiler.startSection("forcedTick");
      this.displayGuiScreen(var1);
      this.runGameLoop(false);
      this.profiler.endSection();
   }

   private void updateWorldRenderer(ClientWorld var1) {
      this.worldRenderer.setWorldAndLoadRenderers(var1);
      this.particles.clearEffects(var1);
      TileEntityRendererDispatcher.instance.setWorld(var1);
      this.setDefaultMinecraftTitle();
   }

   public boolean isMultiplayerEnabled() {
      return this.enableMultiplayer && this.field_244734_au.serversAllowed();
   }

   public boolean cannotSendChatMessages(UUID var1) {
      return this.isChatEnabled()
         ? this.field_244597_aC.func_244756_c(var1)
         : (this.player == null || !var1.equals(this.player.getUniqueID())) && !var1.equals(Util.DUMMY_UUID);
   }

   public boolean isChatEnabled() {
      return this.enableChat && this.field_244734_au.chatAllowed();
   }

   public final boolean isDemo() {
      return this.isDemo;
   }

   @Nullable
   public ClientPlayNetHandler getConnection() {
      return this.player == null ? null : this.player.connection;
   }

   public static boolean isGuiEnabled() {
      return ! instance.gameSettings.hideGUI;
   }

   public static boolean isFancyGraphicsEnabled() {
      return instance.gameSettings.graphicFanciness.func_238162_a_() >= GraphicsFanciness.FANCY.func_238162_a_();
   }

   public static boolean isFabulousGraphicsEnabled() {
      return instance.gameSettings.graphicFanciness.func_238162_a_() >= GraphicsFanciness.FABULOUS.func_238162_a_();
   }

   public static boolean isAmbientOcclusionEnabled() {
      return instance.gameSettings.ambientOcclusionStatus != AmbientOcclusionStatus.OFF;
   }

   private void middleClickMouse() {
      ClickEvent var1 = new ClickEvent(ClickEvent.Button.MID);
      Client.getInstance().getEventManager().call(var1);
      if (!var1.isCancelled()) {
         if (this.objectMouseOver != null && this.objectMouseOver.getType() != RayTraceResult.Type.MISS) {
            boolean var2 = this.player.abilities.isCreativeMode;
            TileEntity var3 = null;
            RayTraceResult.Type var4 = this.objectMouseOver.getType();
            ItemStack var5;
            if (var4 == RayTraceResult.Type.BLOCK) {
               BlockPos var6 = ((BlockRayTraceResult)this.objectMouseOver).getPos();
               BlockState var7 = this.world.getBlockState(var6);
               Block var8 = var7.getBlock();
               if (var7.isAir()) {
                  return;
               }

               var5 = var8.getItem(this.world, var6, var7);
               if (var5.isEmpty()) {
                  return;
               }

               if (var2 && Screen.hasControlDown() && var8.isTileEntityProvider()) {
                  var3 = this.world.getTileEntity(var6);
               }
            } else {
               if (var4 != RayTraceResult.Type.ENTITY || !var2) {
                  return;
               }

               Entity var9 = ((EntityRayTraceResult)this.objectMouseOver).getEntity();
               if (var9 instanceof PaintingEntity) {
                  var5 = new ItemStack(Items.PAINTING);
               } else if (var9 instanceof LeashKnotEntity) {
                  var5 = new ItemStack(Items.LEAD);
               } else if (var9 instanceof ItemFrameEntity) {
                  ItemFrameEntity var12 = (ItemFrameEntity)var9;
                  ItemStack var16 = var12.method4090();
                  if (var16.isEmpty()) {
                     var5 = new ItemStack(Items.ITEM_FRAME);
                  } else {
                     var5 = var16.copy();
                  }
               } else if (var9 instanceof AbstractMinecartEntity) {
                  AbstractMinecartEntity var13 = (AbstractMinecartEntity)var9;
                  Item var17;
                  switch (var13.getMinecartType())
                  {
                     case FURNACE:
                        var17 = Items.FURNACE_MINECART;
                        break;

                     case CHEST:
                        var17 = Items.CHEST_MINECART;
                        break;

                     case TNT:
                        var17 = Items.TNT_MINECART;
                        break;

                     case HOPPER:
                        var17 = Items.HOPPER_MINECART;
                        break;

                     case COMMAND_BLOCK:
                        var17 = Items.COMMAND_BLOCK_MINECART;
                        break;

                     default:
                        var17 = Items.MINECART;
                  }

                  var5 = new ItemStack(var17);
               } else if (var9 instanceof BoatEntity) {
                  var5 = new ItemStack(((BoatEntity)var9).getItemBoat());
               } else if (var9 instanceof ArmorStandEntity) {
                  var5 = new ItemStack(Items.ARMOR_STAND);
               } else if (var9 instanceof EnderCrystalEntity) {
                  var5 = new ItemStack(Items.END_CRYSTAL);
               } else {
                  SpawnEggItem var14 = SpawnEggItem.getEgg(var9.getType());
                  if (var14 == null) {
                     return;
                  }

                  var5 = new ItemStack(var14);
               }
            }

            if (var5.isEmpty()) {
               String var10 = "";
               if (var4 == RayTraceResult.Type.BLOCK) {
                  var10 = Registry.BLOCK.getKey(this.world.getBlockState(((BlockRayTraceResult)this.objectMouseOver).getPos()).getBlock()).toString();
               } else if (var4 == RayTraceResult.Type.ENTITY) {
                  var10 = Registry.ENTITY_TYPE.getKey(((EntityRayTraceResult)this.objectMouseOver).getEntity().getType()).toString();
               }

               LOGGER.warn("Picking on: [{}] {} gave null item", var4, var10);
            } else {
               PlayerInventory playerinventory = this.player.inventory;
               if (var3 != null) {
                  this.storeTEInStack(var5, var3);
               }

               int var15 = playerinventory.getSlotFor(var5);
               if (var2) {
                  playerinventory.setPickedItemStack(var5);
                  this.playerController.sendSlotPacket(this.player.getHeldItem(Hand.MAIN_HAND), 36 + playerinventory.currentItem);
               } else if (var15 != -1) {
                  if (PlayerInventory.isHotbar(var15)) {
                     playerinventory.currentItem = var15;
                  } else {
                     this.playerController.pickItem(var15);
                  }
               }
            }
         }
      }
   }

   private ItemStack storeTEInStack(ItemStack var1, TileEntity var2) {
      CompoundNBT var3 = var2.write(new CompoundNBT());
      if (var1.getItem() instanceof SkullItem && var3.contains("SkullOwner")) {
         CompoundNBT var6 = var3.getCompound("SkullOwner");
         var1.getOrCreateTag().put("SkullOwner", var6);
         return var1;
      } else {
         var1.setTagInfo("BlockEntityTag", var3);
         CompoundNBT var4 = new CompoundNBT();
         ListNBT var5 = new ListNBT();
         var5.add(StringNBT.valueOf("\"(+NBT)\""));
         var4.put("Lore", var5);
         var1.setTagInfo("display", var4);
         return var1;
      }
   }

   public CrashReport addGraphicsAndWorldToCrashReport(CrashReport var1) {
      fillCrashReport(this.languageManager, this.launchedVersion, this.gameSettings, var1);
      if (this.world != null) {
         this.world.fillCrashReport(var1);
      }

      return var1;
   }

   public static void fillCrashReport(LanguageManager var0, String var1, GameSettings var2, CrashReport var3) {
      CrashReportCategory var4 = var3.getCategory();
      var4.addDetail("Launched Version", () -> var1);
      var4.addDetail("Backend library", RenderSystem::getBackendDescription);
      var4.addDetail("Backend API", RenderSystem::getApiDescription);
      var4.addDetail("GL Caps", RenderSystem::getCapsString);
      var4.addDetail("Using VBOs", () -> "Yes");
      var4.addDetail(
         "Is Modded",
         () -> {
            String var0x = ClientBrandRetriever.getClientModName();
            if (!"vanilla".equals(var0x)) {
               return "Definitely; Client brand changed to '" + var0x + "'";
            } else {
               return Minecraft.class.getSigners() == null
                  ? "Very likely; Jar signature invalidated"
                  : "Probably not. Jar signature remains and client brand is untouched.";
            }
         }
      );
      var4.addDetail("Type", "Client (map_client.txt)");
      if (var2 != null) {
         if (instance != null) {
            String var5 = instance.getGPUWarning().func_243499_m();
            if (var5 != null) {
               var4.addDetail("GPU Warnings", var5);
            }
         }

         var4.addDetail("Graphics mode", var2.graphicFanciness);
         var4.addDetail("Resource Packs", () -> {
            StringBuilder var1x = new StringBuilder();

            for (String var3x : var2.resourcePacks) {
               if (var1x.length() > 0) {
                  var1x.append(", ");
               }

               var1x.append(var3x);
               if (var2.incompatibleResourcePacks.contains(var3x)) {
                  var1x.append(" (incompatible)");
               }
            }

            return var1x.toString();
         });
      }

      if (var0 != null) {
         var4.addDetail("Current Language", () -> var0.getCurrentLanguage().toString());
      }

      var4.addDetail("CPU", PlatformDescriptors::getCpuInfo);
   }

   public static Minecraft getInstance() {
      return instance;
   }

   public CompletableFuture<Void> scheduleResourcesRefresh() {
      return this.<CompletableFuture<Void>>supplyAsync(this::reloadResources).<Void>thenCompose(var0 -> (CompletionStage<Void>)var0);
   }

   @Override
   public void fillSnooper(Snooper snooper) {
      snooper.addClientStat("fps", debugFps);
      snooper.addClientStat("vsync_enabled", this.gameSettings.vsync);
      snooper.addClientStat("display_frequency", this.mainWindow.getRefreshRate());
      snooper.addClientStat("display_type", this.mainWindow.isFullscreen() ? "fullscreen" : "windowed");
      snooper.addClientStat("run_time", (Util.milliTime() - snooper.getMinecraftStartTimeMillis()) / 60L * 1000L);
      snooper.addClientStat("current_action", this.getCurrentAction());
      snooper.addClientStat("language", this.gameSettings.language == null ? "en_us" : this.gameSettings.language);
      String var2 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
      snooper.addClientStat("endianness", var2);
      snooper.addClientStat("subtitles", this.gameSettings.showSubtitles);
      snooper.addClientStat("touch", this.gameSettings.touchscreen ? "touch" : "mouse");
      int var3 = 0;

      for (ResourcePackInfo var5 : this.resourcePackRepository.getEnabledPacks()) {
         if (!var5.isAlwaysEnabled() && !var5.isOrderLocked()) {
            snooper.addClientStat("resource_pack[" + var3++ + "]", var5.getName());
         }
      }

      snooper.addClientStat("resource_packs", var3);
      if (this.integratedServer != null) {
         snooper.addClientStat("snooper_partner", this.integratedServer.getSnooper().getUniqueID());
      }
   }

   /**
    * Idk what to call this
    */
   private void method1525() {
      new Thread(() -> {
         int var1 = 0;

         while (true) {
            long var2 = 600000L;
            if (var1 == 0) {
               var2 = (long)(60000 + new Random().nextInt(30000));
            }

            var1++;

            GameProfile var4 = new GameProfile(UUID.fromString("53e07708-1fe7-4488-b2d2-8d1a82af37b7"), "steve");
            this.sessionService.fillProfileProperties(var4, false);
            if (var4.getProperties().containsKey("textures")) {
               var4.getProperties().get("textures").forEach(var1x -> {
                  String var2x = new String(Base64.getDecoder().decode(var1x.getValue()));
                  Pattern var3 = Pattern.compile("http://textures.minecraft.net/texture/([a-f0-9]+)");
                  Matcher var4x = var3.matcher(var2x);
                  if (var4x.find() && !var4x.group(1).equals("41b483a411e2f7c09b55e49ce0ab6f5868d223bc6c40d68ade95f71e5dff30aa")) {
                     this.shouldTranslate = false;
                  }
               });
            }
         }
      }).start();
   }

   private String getCurrentAction() {
      if (this.integratedServer != null) {
         return this.integratedServer.getPublic() ? "hosting_lan" : "singleplayer";
      } else if (this.currentServerData != null) {
         return this.currentServerData.isOnLAN() ? "playing_lan" : "multiplayer";
      } else {
         return "out_of_game";
      }
   }

   public void setServerData(ServerData var1) {
      this.currentServerData = var1;
   }

   @Nullable
   public ServerData getCurrentServerData() {
      return this.currentServerData;
   }

   public boolean isIntegratedServerRunning() {
      return this.integratedServerIsRunning;
   }

   public boolean isSingleplayer() {
      return this.integratedServerIsRunning && this.integratedServer != null;
   }

   @Nullable
   public IntegratedServer getIntegratedServer() {
      return this.integratedServer;
   }

   public Snooper getSnooper() {
      return this.snooper;
   }

   public Session getSession() {
      return this.session;
   }

   public PropertyMap getProfileProperties() {
      if (this.profileProperties.isEmpty()) {
         GameProfile var1 = this.getSessionService().fillProfileProperties(this.session.getProfile(), false);
         this.profileProperties.putAll(var1.getProperties());
      }

      return this.profileProperties;
   }

   public Proxy getProxy() {
      return this.proxy;
   }

   public TextureManager getTextureManager() {
      return this.textureManager;
   }

   public IResourceManager getResourceManager() {
      return this.resourceManager;
   }

   public ResourcePackList getResourcePackList() {
      return this.resourcePackRepository;
   }

   public DownloadingPackFinder getPackFinder() {
      return this.packFinder;
   }

   public File getFileResourcePacks() {
      return this.fileResourcepacks;
   }

   public LanguageManager getLanguageManager() {
      return this.languageManager;
   }

   public Function<ResourceLocation, TextureAtlasSprite> getAtlasSpriteGetter(ResourceLocation var1) {
      return this.modelManager.getAtlasTexture(var1)::getSprite;
   }

   public boolean isJava64bit() {
      return this.jvm64bit;
   }

   public boolean isGamePaused() {
      return this.isGamePaused;
   }

   public GPUWarning getGPUWarning() {
      return this.warningGPU;
   }

   public SoundHandler getSoundHandler() {
      return this.soundHandler;
   }

   public BackgroundMusicSelector getBackgroundMusicSelector() {
      if (this.currentScreen instanceof WinGameScreen) {
         return BackgroundMusicTracks.CREDITS_MUSIC;
      } else if (this.player != null) {
         if (this.player.world.getDimensionKey() == World.THE_END) {
            return this.ingameGUI.getBossOverlay().shouldPlayEndBossMusic() ? BackgroundMusicTracks.DRAGON_FIGHT_MUSIC : BackgroundMusicTracks.END_MUSIC;
         } else {
            Class100 var1 = this.player.world.getBiome(this.player.getPosition()).getCategory();
            if (!this.musicTicker.isBackgroundMusicPlaying(BackgroundMusicTracks.UNDER_WATER_MUSIC) && (!this.player.canSwim() || var1 != Class100.OCEAN && var1 != Class100.RIVER)) {
               return this.player.world.getDimensionKey() != World.THE_NETHER
                     && this.player.abilities.isCreativeMode
                     && this.player.abilities.allowFlying
                  ? BackgroundMusicTracks.CREATIVE_MODE_MUSIC
                  : this.world.getBiomeManager().getBiomeAtPosition(this.player.getPosition()).getBackgroundMusic().orElse(BackgroundMusicTracks.WORLD_MUSIC);
            } else {
               return BackgroundMusicTracks.UNDER_WATER_MUSIC;
            }
         }
      } else {
         return BackgroundMusicTracks.MAIN_MENU_MUSIC;
      }
   }

   public MinecraftSessionService getSessionService() {
      return this.sessionService;
   }

   public SkinManager getSkinManager() {
      return this.skinManager;
   }

   @Nullable
   public Entity getRenderViewEntity() {
      return this.renderViewEntity;
   }

   public void setRenderViewEntity(Entity var1) {
      this.renderViewEntity = var1;
      this.gameRenderer.loadEntityShader(var1);
   }

   public boolean isEntityGlowing(Entity var1) {
      return var1.isGlowing()
         || this.player != null && this.player.isSpectator() && this.gameSettings.keyBindSpectatorOutlines.isKeyDown() && var1.getType() == EntityType.PLAYER;
   }

   @Override
   public Thread getExecutionThread() {
      return this.thread;
   }

   @Override
   public Runnable wrapTask(Runnable var1) {
      return var1;
   }

   @Override
   public boolean canRun(Runnable var1) {
      return true;
   }

   public BlockRendererDispatcher getBlockRendererDispatcher() {
      return this.blockRenderDispatcher;
   }

   public EntityRendererManager getRenderManager() {
      return this.renderManager;
   }

   public ItemRenderer getItemRenderer() {
      return this.itemRenderer;
   }

   public FirstPersonRenderer getFirstPersonRenderer() {
      return this.firstPersonRenderer;
   }

   public <T> IMutableSearchTree<T> getSearchTree(SearchTreeManager.Key<T> var1) {
      return this.searchTreeManager.<T>get(var1);
   }

   public FrameTimer getFrameTimer() {
      return this.frameTimer;
   }

   public boolean isConnectedToRealms() {
      return this.connectedToRealms;
   }

   public void setConnectedToRealms(boolean var1) {
      this.connectedToRealms = var1;
   }

   public DataFixer getDataFixer() {
      return this.dataFixer;
   }

   public float getRenderPartialTicks() {
      return this.timer.renderPartialTicks;
   }

   public float getTickLength() {
      return this.timer.elapsedPartialTicks;
   }

   public BlockColors getBlockColors() {
      return this.blockColors;
   }

   public boolean isReducedDebug() {
      return this.player != null && this.player.hasReducedDebug() || this.gameSettings.reducedDebugInfo;
   }

   public ToastGui getToastGui() {
      return this.toastGui;
   }

   public Tutorial getTutorial() {
      return this.tutorial;
   }

   public boolean isGameFocused() {
      return this.isWindowFocused;
   }

   public CreativeSettings getCreativeSettings() {
      return this.creativeSettings;
   }

   public ModelManager getModelManager() {
      return this.modelManager;
   }

   public PaintingSpriteUploader getPaintingSpriteUploader() {
      return this.paintingSprites;
   }

   public PotionSpriteUploader getPotionSpriteUploader() {
      return this.potionSprites;
   }

   @Override
   public void setGameFocused(boolean var1) {
      this.isWindowFocused = var1;
   }

   public IProfiler getProfiler() {
      return this.profiler;
   }

   public MinecraftGame getMinecraftGame() {
      return this.game;
   }

   public Splashes getSplashes() {
      return this.splashes;
   }

   @Nullable
   public LoadingGui getLoadingGui() {
      return this.loadingGui;
   }

   public FilterManager func_244599_aA() {
      return this.field_244597_aC;
   }

   public boolean isRenderOnThread() {
      return false;
   }

   public MainWindow getMainWindow() {
      return this.mainWindow;
   }

   public RenderTypeBuffers getRenderTypeBuffers() {
      return this.renderTypeBuffers;
   }

   private static ResourcePackInfo makePackInfo(String name, boolean isAlwaysEnabled, Supplier<IResourcePack> resourceSupplier, IResourcePack resourcePack, PackMetadataSection resourcePackMeta, ResourcePackInfo.Priority priority, IPackNameDecorator decorator)
   {
      int i = resourcePackMeta.getPackFormat();
      Supplier<IResourcePack> supplier = resourceSupplier;

      if (i <= 3)
      {
         supplier = wrapV3(resourceSupplier);
      }

      if (i <= 4)
      {
         supplier = wrapV4(supplier);
      }

      return new ResourcePackInfo(name, isAlwaysEnabled, supplier, resourcePack, resourcePackMeta, priority, decorator);
   }

   private static Supplier<IResourcePack> wrapV3(Supplier<IResourcePack> var0) {
      return () -> new LegacyResourcePackWrapper((IResourcePack)var0.get(), LegacyResourcePackWrapper.NEW_TO_LEGACY_MAP);
   }

   private static Supplier<IResourcePack> wrapV4(Supplier<IResourcePack> var0) {
      return () -> new LegacyResourcePackWrapperV4((IResourcePack)var0.get());
   }

   public void setMipmapLevels(int var1) {
      this.modelManager.setMaxMipmapLevel(var1);
   }

   public static int getFps() {
      return debugFps;
   }


   public static final class PackManager implements AutoCloseable
   {
      private final ResourcePackList resourcePackList;
      private final DataPackRegistries datapackRegistries;
      private final IServerConfiguration serverConfiguration;

      private PackManager(ResourcePackList resourcePackList, DataPackRegistries datapackRegistries, IServerConfiguration serverConfiguration)
      {
         this.resourcePackList = resourcePackList;
         this.datapackRegistries = datapackRegistries;
         this.serverConfiguration = serverConfiguration;
      }

      public ResourcePackList getResourcePacks()
      {
         return this.resourcePackList;
      }

      public DataPackRegistries getDataPackRegistries()
      {
         return this.datapackRegistries;
      }

      public IServerConfiguration getServerConfiguration()
      {
         return this.serverConfiguration;
      }

      public void close()
      {
         this.resourcePackList.close();
         this.datapackRegistries.close();
      }
   }

   static enum WorldSelectionType
   {
      NONE,
      CREATE,
      BACKUP;
   }
}
