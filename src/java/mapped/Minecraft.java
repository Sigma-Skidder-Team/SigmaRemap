package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.impl.Class4401;
import com.mentalfrostbyte.jello.event.impl.Class4403;
import com.mentalfrostbyte.jello.event.impl.Class4418;
import com.mentalfrostbyte.jello.event.impl.Class4429;
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

public class Minecraft extends Class317<Runnable> implements Class315, Class1643 {
   private static Minecraft field1270;
   private static final Logger LOGGER = LogManager.getLogger();
   public static final boolean IS_RUNNING_ON_MAC = Util.getOSType() == OS.OSX;
   public static final ResourceLocation field1273 = new ResourceLocation("default");
   public static final ResourceLocation field1274 = new ResourceLocation("uniform");
   public static final ResourceLocation field1275 = new ResourceLocation("alt");
   private static final CompletableFuture<Class2341> field1276 = CompletableFuture.<Class2341>completedFuture(Class2341.field16010);
   private static final ITextComponent field1277 = new TranslationTextComponent("multiplayer.socialInteractions.not_available");
   private final File field1278;
   private final PropertyMap field1279;
   private final TextureManager textureManager;
   private final DataFixer field1281;
   private final Class1700 virtualScreen;
   public final Class1815 mainWindow;
   public final Class8917 timer = new Class8917(20.0F, 0L);
   private final Class7998 field1285 = new Class7998("client", this, Util.milliTime());
   private final Class7911 field1286;
   public final Class264 worldRenderer;
   private final Class8853 field1288;
   private final Class216 field1289;
   private final Class9641 field1290;
   public final Class302 particles;
   private final Class266 field1292 = new Class266();
   public final Session session;
   public final Class9834 field1294;
   public final Class214 gameRenderer;
   public final Class8023 field1296;
   private final AtomicReference<Class7245> field1297 = new AtomicReference<Class7245>();
   public final Class1268 ingameGUI;
   public final Class9574 gameSettings;
   private final Class8044 field1300;
   public final Class9511 mouseHelper;
   public final Class9453 field1302;
   public final File field1303;
   private final String field1304;
   private final String field1305;
   private final Proxy field1306;
   private final SaveFormat saveFormat;
   public final Class9789 field1308 = new Class9789();
   private final boolean field1309;
   private final boolean field1310;
   private final boolean field1311;
   private final boolean field1312;
   private final Class192 resourceManager;
   private final Class7653 field1314;
   public final Class313 resourcePackRepository;
   private final Class267 field1316;
   private final Class8396 field1317;
   private final Class9003 field1318;
   public final Framebuffer framebuffer;
   private final Class274 soundHandler;
   private final Class9052 field1321;
   private final Class1654 fontResourceMananger;
   private final Class271 field1323;
   private final Class270 field1324;
   private final MinecraftSessionService field1325;
   private final SocialInteractionsService field1326;
   private final Class9758 field1327;
   private final Class280 modelManager;
   private final Class217 field1329;
   private final Class278 paintingSprites;
   private final Class279 potionSprites;
   private final Class1264 toastGui;
   private final Class8274 field1333 = new Class8274(this);
   private final Class9557 field1334;
   private final Class9645 field1335;
   public static byte[] field1336 = new byte[10485760];
   public PlayerController field1337;
   public Class1656 world;
   public ClientPlayerEntity player;
   private Class1644 field1340;
   private Class7730 field1341;
   private NetworkManager field1342;
   private boolean field1343;
   public Entity field1344;
   public Entity field1345;
   public Class8710 field1346;
   public int field1347;
   public int field1348;
   private boolean isGamePaused;
   private float renderPartialTicksPaused;
   private long field1351 = Util.nanoTime();
   private long field1352;
   private int field1353;
   public boolean skipRenderWorld;
   public Screen currentScreen;
   public LoadingGui loadingGuiIn;
   private boolean field1357;
   private Thread field1358;
   public boolean field1359 = true;
   private volatile boolean field1360 = true;
   private Class4526 crashReporter;
   private static int field1362;
   public String field1363 = "";
   public boolean field1364;
   public boolean field1365;
   public boolean field1366 = true;
   private boolean field1367;
   private final Queue<Runnable> queueChunkTracking = Queues.newConcurrentLinkedQueue();
   private CompletableFuture<Void> futureRefreshResources;
   private Class7600 field1370;
   private Class7165 profiler = Class7167.field30819;
   private int field1372;
   private final Class7684 field1373 = new Class7684(Util.nanoTimeSupplier, () -> this.field1372);
   private Class7740 profilerResult;
   private String field1375 = "root";

   public Minecraft(Class8051 var1) {
      super("Client");
      field1270 = this;
      this.field1303 = var1.field34579.field35579;
      File var2 = var1.field34579.field35581;
      this.field1278 = var1.field34579.field35580;
      this.field1304 = var1.field34580.field33254;
      this.field1305 = var1.field34580.field33255;
      this.field1279 = var1.field34577.field35342;
      this.field1314 = new Class7653(new File(this.field1303, "server-resource-packs"), var1.field34579.method28943());
      this.resourcePackRepository = new Class313(Minecraft::method1582, this.field1314, new Class7652(this.field1278, Class7725.field33170));
      this.field1306 = var1.field34577.field35343;
      YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService(this.field1306);
      this.field1325 = var3.createMinecraftSessionService();
      this.field1326 = this.method1456(var3, var1);
      this.session = var1.field34577.field35340;
      LOGGER.info("Setting user: {}", this.session.getUsername());
      LOGGER.debug("(Session ID is {})", this.session.toString());
      this.method1525();
      this.field1310 = var1.field34580.field33253;
      this.field1311 = !var1.field34580.field33256;
      this.field1312 = !var1.field34580.field33257;
      this.field1309 = method1463();
      this.field1340 = null;
      String var4;
      int var5;
      if (this.method1510() && var1.field34581.field30903 != null) {
         var4 = var1.field34581.field30903;
         var5 = var1.field34581.field30904;
      } else {
         var4 = null;
         var5 = 0;
      }

      if (System.getProperty("java.version").contains("74")) {
         this.shutdown();
      }

      KeybindTextComponent.func_240696_a_(KeyBinding::method8516);
      this.field1281 = Class4497.method14181();
      this.toastGui = new Class1264(this);
      this.field1334 = new Class9557(this);
      this.field1358 = Thread.currentThread();
      this.gameSettings = new Class9574(this, this.field1303);
      this.field1300 = new Class8044(this.field1303, this.field1281);
      LOGGER.info("Backend library: {}", RenderSystem.method27898());
      Class9790 var6;
      if (this.gameSettings.field44593 > 0 && this.gameSettings.field44592 > 0) {
         var6 = new Class9790(
            this.gameSettings.field44592, this.gameSettings.field44593, var1.field34578.field45782, var1.field34578.field45783, var1.field34578.field45784
         );
      } else {
         var6 = var1.field34578;
      }

      Util.nanoTimeSupplier = RenderSystem.method27900();
      this.virtualScreen = new Class1700(this);
      this.mainWindow = this.virtualScreen.method7329(var6, this.gameSettings.field44586, this.method1455());
      this.method1573(true);

      try {
         InputStream var7 = this.method1539().method25146().method1223(Class1946.field12610, new ResourceLocation("icons/icon_16x16.png"));
         InputStream var8 = this.method1539().method25146().method1223(Class1946.field12610, new ResourceLocation("icons/icon_32x32.png"));
         this.mainWindow.method8013(var7, var8);
      } catch (IOException var9) {
         LOGGER.error("Couldn't set icon", var9);
      }

      this.mainWindow.method8027(this.gameSettings.field44576);
      this.mouseHelper = new Class9511(this);
      this.mouseHelper.method36733(this.mainWindow.method8039());
      this.field1302 = new Class9453(this);
      this.field1302.method36348(this.mainWindow.method8039());
      RenderSystem.method27901(this.gameSettings.field44609, false);
      this.framebuffer = new Framebuffer(this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight(), true, IS_RUNNING_ON_MAC);
      this.framebuffer.method29115(0.0F, 0.0F, 0.0F, 0.0F);
      this.resourceManager = new Class193(Class1946.field12610);
      this.resourcePackRepository.method1262();
      this.gameSettings.method37172(this.resourcePackRepository);
      this.field1316 = new Class267(this.gameSettings.field44676);
      this.resourceManager.method587(this.field1316);
      this.textureManager = new TextureManager(this.resourceManager);
      this.resourceManager.method587(this.textureManager);
      this.field1327 = new Class9758(this.textureManager, new File(var2, "skins"), this.field1325);
      this.saveFormat = new SaveFormat(this.field1303.toPath().resolve("saves"), this.field1303.toPath().resolve("backups"), this.field1281);
      this.soundHandler = new Class274(this.resourceManager, this.gameSettings);
      this.resourceManager.method587(this.soundHandler);
      this.field1323 = new Class271(this.session);
      this.resourceManager.method587(this.field1323);
      this.field1321 = new Class9052(this);
      this.fontResourceMananger = new Class1654(this.textureManager);
      this.field1294 = this.fontResourceMananger.method6707();
      this.resourceManager.method587(this.fontResourceMananger.method6708());
      this.method1460(this.method1469());
      this.resourceManager.method587(new Class273());
      this.resourceManager.method587(new Class275());
      this.mainWindow.setRenderPhase("Startup");
      RenderSystem.method27907(0, 0, this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight());
      this.mainWindow.setRenderPhase("Post startup");
      this.field1317 = Class8396.method29463();
      this.field1318 = Class9003.method33257(this.field1317);
      this.modelManager = new Class280(this.textureManager, this.field1317, this.gameSettings.field44600);
      this.resourceManager.method587(this.modelManager);
      this.field1289 = new Class216(this.textureManager, this.modelManager, this.field1318);
      this.field1288 = new Class8853(this.textureManager, this.field1289, this.resourceManager, this.field1294, this.gameSettings);
      this.field1290 = new Class9641(this);
      this.resourceManager.method587(this.field1289);
      this.field1286 = new Class7911();
      this.gameRenderer = new Class214(this, this.resourceManager, this.field1286);
      this.resourceManager.method587(this.gameRenderer);
      this.field1335 = new Class9645(this, this.field1326);
      this.field1329 = new Class217(this.modelManager.method1025(), this.field1317);
      this.resourceManager.method587(this.field1329);
      this.worldRenderer = new Class264(this, this.field1286);
      this.resourceManager.method587(this.worldRenderer);
      this.method1461();
      this.resourceManager.method587(this.field1292);
      this.particles = new Class302(this.world, this.textureManager);
      this.resourceManager.method587(this.particles);
      this.paintingSprites = new Class278(this.textureManager);
      this.resourceManager.method587(this.paintingSprites);
      this.potionSprites = new Class279(this.textureManager);
      this.resourceManager.method587(this.potionSprites);
      this.field1324 = new Class270();
      this.resourceManager.method587(this.field1324);
      Client.getInstance().start();
      this.ingameGUI = new Class1268(this);
      this.field1296 = new Class8023(this);
      RenderSystem.method27902(this::method1462);
      if (this.gameSettings.field44626 && !this.mainWindow.method8040()) {
         this.mainWindow.method8034();
         this.gameSettings.field44626 = this.mainWindow.method8040();
      }

      this.mainWindow.method8020(this.gameSettings.field44615);
      this.mainWindow.method8051(this.gameSettings.field44608);
      this.mainWindow.method8019();
      this.method1481();
      if (var4 != null) {
         this.displayGuiScreen(new Class1314(new MainMenuScreen(), this, var4, var5));
      } else {
         this.displayGuiScreen(new MainMenuScreen(true));
      }

      ResourceLoadProgressGui.method5677(this);
      List<Class303> var10 = this.resourcePackRepository.method1273();
      this.setLoadingGui(
         new Class1272(
            this, this.resourceManager.method586(Util.method38492(), this, field1276, var10), var1x -> Util.method38514(var1x, this::method1458, () -> {
                  if (SharedConstants.field42545) {
                     this.method1471();
                  }
               }), false
         )
      );
   }

   public void setDefaultMinecraftTitle() {
      this.mainWindow.method8038(this.method1455());
   }

   private String method1455() {
      StringBuilder var1 = new StringBuilder(Client.getInstance().getClientMode() == ClientMode.JELLO ? "Jello for Sigma 5.0" : "Sigma 5.0");
      var1.append(" ");
      var1.append(SharedConstants.method34773().getName());
      ClientPlayNetHandler var2 = this.getClientPlayNetHandler();
      if (var2 != null && var2.method15589().method30707()) {
         var1.append(" - ");
         if (this.field1340 != null && !this.field1340.method1369()) {
            var1.append(Class9088.method33883("title.singleplayer"));
         } else if (this.method1559()) {
            var1.append(Class9088.method33883("title.multiplayer.realms"));
         } else if (this.field1340 != null || this.field1341 != null && this.field1341.method25582()) {
            var1.append(Class9088.method33883("title.multiplayer.lan"));
         } else {
            var1.append(Class9088.method33883("title.multiplayer.other"));
         }
      }

      return var1.toString();
   }

   private SocialInteractionsService method1456(YggdrasilAuthenticationService var1, Class8051 var2) {
      try {
         return var1.createSocialInteractionsService(var2.field34577.field35340.getToken());
      } catch (AuthenticationException var4) {
         LOGGER.error("Failed to verify authentication", var4);
         return new OfflineSocialInteractions();
      }
   }

   public boolean method1457() {
      return false;
   }

   private void method1458(Throwable var1) {
      if (this.resourcePackRepository.method1269().size() > 1) {
         StringTextComponent var2;
         if (var1 instanceof Class2507) {
            var2 = new StringTextComponent(((Class2507)var1).method10488().method1228());
         } else {
            var2 = null;
         }

         this.method1459(var1, var2);
      } else {
         Util.method38498(var1);
      }
   }

   public void method1459(Throwable var1, ITextComponent var2) {
      LOGGER.info("Caught error loading resourcepacks, removing all selected resourcepacks", var1);
      this.resourcePackRepository.method1264(Collections.<String>emptyList());
      this.gameSettings.field44580.clear();
      this.gameSettings.field44581.clear();
      this.gameSettings.method37146();
      this.reloadResources().thenRun(() -> {
         Class1264 var2x = this.method1566();
         Class7603.method24907(var2x, Class1906.field11199, new TranslationTextComponent("resourcePack.load_fail"), var2);
      });
   }

   public void run() {
      this.field1358 = Thread.currentThread();

      try {
         boolean var1 = false;

         while (this.field1360) {
            if (this.crashReporter != null) {
               method1468(this.crashReporter);
               return;
            }

            try {
               Class9487 var7 = Class9487.method36636("Renderer");
               boolean var3 = this.method1478();
               this.method1479(var3, var7);
               this.profiler.method22501();
               this.runGameLoop(!var1);
               Client.getInstance().method19925();
               this.profiler.method22502();
               this.method1480(var3, var7);
            } catch (OutOfMemoryError var4) {
               if (var1) {
                  throw var4;
               }

               this.method1484();
               this.displayGuiScreen(new Class1322());
               System.gc();
               LOGGER.fatal("Out of memory", var4);
               var1 = true;
            }
         }
      } catch (Class2506 var5) {
         this.method1521(var5.method10487());
         this.method1484();
         LOGGER.fatal("Reported exception thrown!", var5);
         method1468(var5.method10487());
      } catch (Throwable var6) {
         Class4526 var2 = this.method1521(new Class4526("Unexpected error", var6));
         LOGGER.fatal("Unreported exception thrown!", var6);
         this.method1484();
         method1468(var2);
      }
   }

   public void method1460(boolean var1) {
      this.fontResourceMananger.method6706(var1 ? ImmutableMap.of(field1273, field1274) : ImmutableMap.of());
   }

   private void method1461() {
      Class7013 var1 = new Class7013<ItemStack>(
         var0 -> var0.method32153((PlayerEntity)null, Class2215.field14480)
               .stream()
               .<String>map(var0x -> TextFormatting.getTextWithoutFormattingCodes(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty()),
         var0 -> Stream.<ResourceLocation>of(Registry.field16075.method9181(var0.method32107()))
      );
      Class7012 var2 = new Class7012<ItemStack>(var0 -> Class5985.method18561().method27138(var0.method32107()).stream());
      Class25 var3 = Class25.method67();

      for (Class3257 var5 : Registry.field16075) {
         var5.method11737(Class7401.field31670, var3);
      }

      var3.forEach(var2x -> {
         var1.method21734(var2x);
         var2.method21734(var2x);
      });
      Class7013 var6 = new Class7013<Class9266>(
         var0 -> var0.method34892()
               .stream()
               .<ITextComponent>flatMap(var0x -> var0x.method14966().method32153((PlayerEntity)null, Class2215.field14480).stream())
               .<String>map(var0x -> TextFormatting.getTextWithoutFormattingCodes(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty()),
         var0 -> var0.method34892().stream().<ResourceLocation>map(var0x -> Registry.field16075.method9181(var0x.method14966().method32107()))
      );
      this.field1292.method961(Class266.field1030, var1);
      this.field1292.method961(Class266.field1031, var2);
      this.field1292.method961(Class266.field1032, var6);
   }

   private void method1462(int var1, long var2) {
      this.gameSettings.field44615 = false;
      this.gameSettings.method37146();
   }

   private static boolean method1463() {
      String[] var0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String var4 : var0) {
         String var5 = System.getProperty(var4);
         if (var5 != null && var5.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public Framebuffer method1464() {
      return this.framebuffer;
   }

   public String method1465() {
      return this.field1304;
   }

   public String method1466() {
      return this.field1305;
   }

   public void method1467(Class4526 var1) {
      this.crashReporter = var1;
   }

   public static void method1468(Class4526 var0) {
      File var1 = new File(getInstance().field1303, "crash-reports");
      File var2 = new File(var1, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
      Class7729.method25572(var0.method14406());
      if (var0.method14407() != null) {
         Class7729.method25572("#@!@# Game crashed! Crash report saved to: #@!@# " + var0.method14407());
         System.exit(-1);
      } else if (var0.method14408(var2)) {
         Class7729.method25572("#@!@# Game crashed! Crash report saved to: #@!@# " + var2.getAbsolutePath());
         System.exit(-1);
      } else {
         Class7729.method25572("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean method1469() {
      return this.gameSettings.field44617;
   }

   public CompletableFuture<Void> reloadResources() {
      if (this.futureRefreshResources != null) {
         return this.futureRefreshResources;
      } else {
         CompletableFuture var1 = new CompletableFuture();
         if (this.loadingGuiIn instanceof ResourceLoadProgressGui) {
            this.futureRefreshResources = var1;
            return var1;
         } else {
            this.resourcePackRepository.method1262();
            List var2 = this.resourcePackRepository.method1273();
            this.setLoadingGui(
               new Class1272(
                  this,
                  this.resourceManager.method586(Util.method38492(), this, field1276, var2),
                  var2x -> Util.method38514(var2x, this::method1458, () -> {
                        this.worldRenderer.method868();
                        var1.complete((Void)null);
                     }),
                  true
               )
            );
            return var1;
         }
      }
   }

   private void method1471() {
      boolean var1 = false;
      Class9736 var2 = this.method1553().method806();
      Class7202 var3 = var2.method38154().method1024();

      for (Block var5 : Registry.field16072) {
         UnmodifiableIterator var6 = var5.method11577().method35392().iterator();

         while (var6.hasNext()) {
            Class7380 var7 = (Class7380)var6.next();
            if (var7.method23397() == Class1855.field9887) {
               Class7202 var8 = var2.method38153(var7);
               if (var8 == var3) {
                  LOGGER.debug("Missing model for: {}", var7);
                  var1 = true;
               }
            }
         }
      }

      Class1713 var13 = var3.method22624();

      for (Block var16 : Registry.field16072) {
         UnmodifiableIterator var18 = var16.method11577().method35392().iterator();

         while (var18.hasNext()) {
            Class7380 var20 = (Class7380)var18.next();
            Class1713 var9 = var2.method38152(var20);
            if (!var20.method23393() && var9 == var13) {
               LOGGER.debug("Missing particle icon for: {}", var20);
               var1 = true;
            }
         }
      }

      Class25<ItemStack> var15 = Class25.method67();

      for (Class3257 var19 : Registry.field16075) {
         var15.clear();
         var19.method11737(Class7401.field31670, var15);

         for (ItemStack var22 : var15) {
            String var10 = var22.method32134();
            String var11 = new TranslationTextComponent(var10).getString();
            if (var11.toLowerCase(Locale.ROOT).equals(var19.method11719())) {
               LOGGER.debug("Missing translation for: {} {} {}", var22, var10, var22.method32107());
            }
         }
      }

      var1 |= Class7541.method24656();
      if (var1) {
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
         guiScreenIn.method2467(this, this.mainWindow.getScaledWidth(), this.mainWindow.getScaledHeight());
         this.skipRenderWorld = false;
         NarratorChatListener.INSTANCE.say(guiScreenIn.getNarrationMessage());
      } else {
         this.soundHandler.resume();
         this.mouseHelper.grabMouse();
      }

      this.setDefaultMinecraftTitle();
   }

   public void setLoadingGui(LoadingGui loadingGuiIn) {
      this.loadingGuiIn = loadingGuiIn;
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

      if (this.futureRefreshResources != null && !(this.loadingGuiIn instanceof ResourceLoadProgressGui)) {
         CompletableFuture completablefuture = this.futureRefreshResources;
         this.futureRefreshResources = null;
         this.reloadResources().thenRun(() -> completablefuture.complete((Void)null));
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
      this.field1353++;
      boolean var11 = this.method1530()
         && (this.currentScreen != null && this.currentScreen.method2472() || this.loadingGuiIn != null && this.loadingGuiIn.method5676())
         && !this.field1340.method1369();
      if (this.isGamePaused != var11) {
         if (this.isGamePaused) {
            this.renderPartialTicksPaused = this.timer.renderPartialTicks;
         } else {
            this.timer.renderPartialTicks = this.renderPartialTicksPaused;
         }

         this.isGamePaused = var11;
      }

      long var7 = Util.nanoTime();
      this.field1308.method38592(var7 - this.field1351);
      this.field1351 = var7;
      this.profiler.startSection("fpsUpdate");

      while (Util.milliTime() >= this.field1352 + 1000L) {
         field1362 = this.field1353;
         this.field1363 = String.format(
            "%d fps T: %s%s%s%s B: %d",
            field1362,
            (double)this.gameSettings.field44576 == AbstractOption.FRAMERATE_LIMIT.getMaxValue() ? "inf" : this.gameSettings.field44576,
            this.gameSettings.field44615 ? " vsync" : "",
            this.gameSettings.field44578.toString(),
            this.gameSettings.field44577 == Class1904.field11184 ? "" : (this.gameSettings.field44577 == Class1904.field11185 ? " fast-clouds" : " fancy-clouds"),
            this.gameSettings.field44606
         );
         this.field1352 += 1000L;
         this.field1353 = 0;
         this.field1285.method27297();
         if (!this.field1285.method27300()) {
            this.field1285.method27296();
         }
      }

      this.profiler.endSection();
   }

   private boolean method1478() {
      return this.gameSettings.showDebugInfo && this.gameSettings.field44665 && !this.gameSettings.field44662;
   }

   private void method1479(boolean var1, Class9487 var2) {
      if (var1) {
         if (!this.field1373.method25291()) {
            this.field1372 = 0;
            this.field1373.method25293();
         }

         this.field1372++;
      } else {
         this.field1373.method25292();
      }

      this.profiler = Class9487.method36637(this.field1373.method25294(), var2);
   }

   private void method1480(boolean var1, Class9487 var2) {
      if (var2 != null) {
         var2.method36635();
      }

      if (var1) {
         this.profilerResult = this.field1373.method25295();
      } else {
         this.profilerResult = null;
      }

      this.profiler = this.field1373.method25294();
   }

   @Override
   public void method1481() {
      int var1 = this.mainWindow.method8036(this.gameSettings.field44673, this.method1469());
      this.mainWindow.method8037((double)var1);
      if (this.currentScreen != null) {
         this.currentScreen.method2482(this, this.mainWindow.getScaledWidth(), this.mainWindow.getScaledHeight());
         Client.getInstance().getGuiManager().method33479();
      }

      Framebuffer var2 = this.method1464();
      var2.method29103(this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight(), IS_RUNNING_ON_MAC);
      this.gameRenderer.method740(this.mainWindow.getFramebufferWidth(), this.mainWindow.getFramebufferHeight());
      this.mouseHelper.method36740();
   }

   @Override
   public void method1482() {
      this.mouseHelper.method36744();
   }

   private int getFramerateLimit() {
      return this.world == null && (this.currentScreen != null || this.loadingGuiIn != null)
         ? Math.min(120, Math.max(this.mainWindow.method8028(), 60))
         : this.mainWindow.method8028();
   }

   public void method1484() {
      try {
         field1336 = new byte[0];
         this.worldRenderer.method917();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.field1343 && this.field1340 != null) {
            this.field1340.method1296(true);
         }

         this.method1506(new Class1310(new TranslationTextComponent("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public void method1485(int var1) {
      if (this.profilerResult != null) {
         List var2 = this.profilerResult.method25626(this.field1375);
         if (!var2.isEmpty()) {
            Class2012 var3 = (Class2012)var2.remove(0);
            if (var1 == 0) {
               if (!var3.field13085.isEmpty()) {
                  int var4 = this.field1375.lastIndexOf(30);
                  if (var4 >= 0) {
                     this.field1375 = this.field1375.substring(0, var4);
                  }
               }
            } else {
               var1--;
               if (var1 < var2.size() && !"unspecified".equals(((Class2012)var2.get(var1)).field13085)) {
                  if (!this.field1375.isEmpty()) {
                     this.field1375 = this.field1375 + '\u001e';
                  }

                  this.field1375 = this.field1375 + ((Class2012)var2.get(var1)).field13085;
               }
            }
         }
      }
   }

   private void func_238183_a_(MatrixStack var1, Class7740 var2) {
      List<Class2012> var3 = var2.method25626(this.field1375);
      Class2012 var4 = (Class2012)var3.remove(0);
      RenderSystem.clear(256, IS_RUNNING_ON_MAC);
      RenderSystem.method27878(5889);
      RenderSystem.method27879();
      RenderSystem.method27882(0.0, (double)this.mainWindow.getFramebufferWidth(), (double)this.mainWindow.getFramebufferHeight(), 0.0, 1000.0, 3000.0);
      RenderSystem.method27878(5888);
      RenderSystem.method27879();
      RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
      RenderSystem.method27893(1.0F);
      RenderSystem.method27862();
      Class9352 var5 = Class9352.method35409();
      Class5425 var6 = var5.method35411();
      short var7 = 160;
      int var8 = this.mainWindow.getFramebufferWidth() - 160 - 10;
      int var9 = this.mainWindow.getFramebufferHeight() - 320;
      RenderSystem.enableBlend();
      var6.method17063(7, Class9337.field43342);
      var6.method17025((double)((float)var8 - 176.0F), (double)((float)var9 - 96.0F - 16.0F), 0.0).method17026(200, 0, 0, 0).method17031();
      var6.method17025((double)((float)var8 - 176.0F), (double)(var9 + 320), 0.0).method17026(200, 0, 0, 0).method17031();
      var6.method17025((double)((float)var8 + 176.0F), (double)(var9 + 320), 0.0).method17026(200, 0, 0, 0).method17031();
      var6.method17025((double)((float)var8 + 176.0F), (double)((float)var9 - 96.0F - 16.0F), 0.0).method17026(200, 0, 0, 0).method17031();
      var5.method35410();
      RenderSystem.disableBlend();
      double var10 = 0.0;

      for (Class2012 var13 : var3) {
         int var14 = MathHelper.method37769(var13.field13082 / 4.0) + 1;
         var6.method17063(6, Class9337.field43342);
         int var15 = var13.method8536();
         int var16 = var15 >> 16 & 0xFF;
         int var17 = var15 >> 8 & 0xFF;
         int var18 = var15 & 0xFF;
         var6.method17025((double)var8, (double)var9, 0.0).method17026(var16, var17, var18, 255).method17031();

         for (int var19 = var14; var19 >= 0; var19--) {
            float var20 = (float)((var10 + var13.field13082 * (double)var19 / (double)var14) * (float) (Math.PI * 2) / 100.0);
            float var21 = MathHelper.method37763(var20) * 160.0F;
            float var22 = MathHelper.method37764(var20) * 160.0F * 0.5F;
            var6.method17025((double)((float)var8 + var21), (double)((float)var9 - var22), 0.0).method17026(var16, var17, var18, 255).method17031();
         }

         var5.method35410();
         var6.method17063(5, Class9337.field43342);

         for (int var32 = var14; var32 >= 0; var32--) {
            float var36 = (float)((var10 + var13.field13082 * (double)var32 / (double)var14) * (float) (Math.PI * 2) / 100.0);
            float var37 = MathHelper.method37763(var36) * 160.0F;
            float var38 = MathHelper.method37764(var36) * 160.0F * 0.5F;
            if (!(var38 > 0.0F)) {
               var6.method17025((double)((float)var8 + var37), (double)((float)var9 - var38), 0.0)
                  .method17026(var16 >> 1, var17 >> 1, var18 >> 1, 255)
                  .method17031();
               var6.method17025((double)((float)var8 + var37), (double)((float)var9 - var38 + 10.0F), 0.0)
                  .method17026(var16 >> 1, var17 >> 1, var18 >> 1, 255)
                  .method17031();
            }
         }

         var5.method35410();
         var10 += var13.field13082;
      }

      DecimalFormat var23 = new DecimalFormat("##0.00");
      var23.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
      RenderSystem.enableTexture();
      String var24 = Class7740.method25634(var4.field13085);
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
      this.field1294.method38799(var1, var25, (float)(var8 - 160), (float)(var9 - 80 - 16), 16777215);
      var25 = var23.format(var4.field13083) + "%";
      this.field1294.method38799(var1, var25, (float)(var8 + 160 - this.field1294.method38820(var25)), (float)(var9 - 80 - 16), 16777215);

      for (int var29 = 0; var29 < var3.size(); var29++) {
         Class2012 var30 = (Class2012)var3.get(var29);
         StringBuilder var31 = new StringBuilder();
         if ("unspecified".equals(var30.field13085)) {
            var31.append("[?] ");
         } else {
            var31.append("[").append(var29 + 1).append("] ");
         }

         String var33 = var31.append(var30.field13085).toString();
         this.field1294.method38799(var1, var33, (float)(var8 - 160), (float)(var9 + 80 + var29 * 8 + 20), var30.method8536());
         var33 = var23.format(var30.field13082) + "%";
         this.field1294
            .method38799(var1, var33, (float)(var8 + 160 - 50 - this.field1294.method38820(var33)), (float)(var9 + 80 + var29 * 8 + 20), var30.method8536());
         var33 = var23.format(var30.field13083) + "%";
         this.field1294
            .method38799(var1, var33, (float)(var8 + 160 - this.field1294.method38820(var33)), (float)(var9 + 80 + var29 * 8 + 20), var30.method8536());
      }
   }

   public void shutdown() {
      if (this.field1360) {
         Client.getInstance().shutdown();
      }

      this.field1360 = false;
   }

   public boolean method1488() {
      return this.field1360;
   }

   public void method1489(boolean var1) {
      if (this.currentScreen == null) {
         boolean var2 = this.method1530() && !this.field1340.method1369();
         if (var2) {
            this.displayGuiScreen(new Class834(!var1));
            this.soundHandler.method1003();
         } else {
            this.displayGuiScreen(new Class834(true));
         }
      }
   }

   private void method1490(boolean var1) {
      if (!var1) {
         this.field1348 = 0;
      }

      if (this.field1348 <= 0 && !this.player.method3148()) {
         if (var1 && this.field1346 != null && this.field1346.method31417() == Class2100.field13690) {
            Class8711 var2 = (Class8711)this.field1346;
            BlockPos var3 = var2.method31423();
            if (!this.world.method6738(var3).method23393()) {
               Direction var4 = var2.method31424();
               if (this.field1337.method23134(var3, var4)) {
                  this.particles.method1207(var3, var4);
                  this.player.swingArm(Hand.field182);
               }
            }
         } else {
            this.field1337.method23133();
         }
      }
   }

   private void method1491() {
      Class4429 var1 = new Class4429(Class2116.field13790);
      Client.getInstance().getEventManager().call(var1);
      if (!var1.isCancelled()) {
         if (this.field1348 <= 0) {
            if (this.field1346 == null) {
               LOGGER.error("Null returned as 'hitResult', this shouldn't happen!");
               if (this.field1337.method23151()) {
                  this.field1348 = 10;
               }
            } else if (!this.player.method5410()) {
               Class4403 var2 = null;
               if (this.field1346.method31417() == Class2100.field13691) {
                  var2 = new Class4403(((Class8709)this.field1346).method31416(), true);
                  Client.getInstance().getEventManager().call(var2);
                  if (var2.isCancelled()) {
                     return;
                  }
               }


               switch (Class9158.field42043[this.field1346.method31417().ordinal()]) {
                  case 1:
                     this.field1337.method23141(this.player, ((Class8709)this.field1346).method31416());
                     if (var2 != null) {
                        var2.method13938();
                        Client.getInstance().getEventManager().call(var2);
                     }
                     break;
                  case 2:
                     Class8711 var4 = (Class8711)this.field1346;
                     BlockPos var5 = var4.method31423();
                     if (!this.world.method6738(var5).method23393()) {
                        this.field1337.method23132(var5, var4.method31424());
                        break;
                     }
                  case 3:
                     if (this.field1337.method23151()) {
                        this.field1348 = 10;
                     }

                     this.player.method2975();
               }

               this.player.swingArm(Hand.field182);
            }
         }
      }
   }

   private void method1492() {
      Class4429 var1 = new Class4429(Class2116.field13791);
      Client.getInstance().getEventManager().call(var1);
      if (!var1.isCancelled()) {
         if (!this.field1337.method23158()) {
            this.field1347 = 4;
            if (!this.player.method5410()) {
               if (this.field1346 == null) {
                  LOGGER.warn("Null returned as 'hitResult', this shouldn't happen!");
               }

               for (Hand var5 : Hand.values()) {
                  ItemStack var6 = this.player.getHeldItem(var5);
                  if (this.field1346 != null) {
                     switch (Class9158.field42043[this.field1346.method31417().ordinal()]) {
                        case 1:
                           Class8709 var7 = (Class8709)this.field1346;
                           Entity var8 = var7.method31416();
                           ActionResultType var9 = this.field1337.method23143(this.player, var8, var7, var5);
                           if (!var9.isSuccessOrConsume()) {
                              var9 = this.field1337.method23142(this.player, var8, var5);
                           }

                           if (var9.isSuccessOrConsume()) {
                              if (var9.isSuccess()) {
                                 this.player.swingArm(var5);
                              }

                              return;
                           }
                           break;
                        case 2:
                           Class8711 var10 = (Class8711)this.field1346;
                           int var11 = var6.method32179();
                           ActionResultType var12 = this.field1337.method23139(this.player, this.world, var5, var10);
                           if (var12.isSuccessOrConsume()) {
                              if (var12.isSuccess()) {
                                 this.player.swingArm(var5);
                                 if (!var6.method32105() && (var6.method32179() != var11 || this.field1337.method23152())) {
                                    this.gameRenderer.field806.method37593(var5);
                                 }
                              }

                              return;
                           }

                           if (var12 == ActionResultType.field14821) {
                              return;
                           }
                     }
                  }

                  if (!var6.method32105()) {
                     ActionResultType var13 = this.field1337.method23140(this.player, this.world, var5);
                     if (var13.isSuccessOrConsume()) {
                        if (var13.isSuccess()) {
                           this.player.swingArm(var5);
                        }

                        this.gameRenderer.field806.method37593(var5);
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public Class9052 method1493() {
      return this.field1321;
   }

   public void runTick() {
      if (this.field1347 > 0) {
         this.field1347--;
      }

      this.profiler.startSection("gui");
      if (!this.isGamePaused) {
         this.ingameGUI.method5983();
      }

      this.profiler.endSection();
      this.gameRenderer.method741(1.0F);
      this.field1334.method37025(this.world, this.field1346);
      this.profiler.startSection("gameMode");
      if (!this.isGamePaused && this.world != null) {
         this.field1337.method23136();
      }

      this.profiler.endStartSection("textures");
      if (this.world != null) {
         this.textureManager.method1080();
      }

      if (this.currentScreen == null && this.player != null) {
         if (this.player.getShouldBeDead() && !(this.currentScreen instanceof DeathScreen)) {
            this.displayGuiScreen((Screen)null);
         } else if (this.player.isSleeping() && this.world != null) {
            this.displayGuiScreen(new Class1332());
         }
      } else if (this.currentScreen != null && this.currentScreen instanceof Class1332 && !this.player.isSleeping()) {
         this.displayGuiScreen((Screen)null);
      }

      if (this.currentScreen != null) {
         this.field1348 = 10000;
      }

      if (this.currentScreen != null) {
         Screen.method2483(() -> this.currentScreen.method1919(), "Ticking screen", this.currentScreen.getClass().getCanonicalName());
      }

      if (!this.gameSettings.showDebugInfo) {
         this.ingameGUI.method5996();
      }

      if (this.loadingGuiIn == null && (this.currentScreen == null || this.currentScreen.field4567)) {
         this.profiler.endStartSection("Keybindings");
         this.method1496();
         if (this.field1348 > 0) {
            this.field1348--;
         }
      }

      if (this.world != null) {
         this.profiler.endStartSection("gameRenderer");
         if (!this.isGamePaused) {
            this.gameRenderer.method738();
         }

         this.profiler.endStartSection("levelRenderer");
         if (!this.isGamePaused) {
            this.worldRenderer.method885();
         }

         this.profiler.endStartSection("level");
         if (!this.isGamePaused) {
            if (this.world.method6876() > 0) {
               this.world.method6809(this.world.method6876() - 1);
            }

            this.world.method6836();
         }
      } else if (this.gameRenderer.method739() != null) {
         this.gameRenderer.method733();
      }

      if (!this.isGamePaused) {
         this.field1321.method33666();
      }

      this.soundHandler.method1006(this.isGamePaused);
      if (this.world != null) {
         if (!this.isGamePaused) {
            if (!this.gameSettings.field44605 && this.method1495()) {
               TranslationTextComponent var1 = new TranslationTextComponent("tutorial.socialInteractions.title");
               TranslationTextComponent var2 = new TranslationTextComponent(
                  "tutorial.socialInteractions.description", Class9557.method37037("socialInteractions")
               );
               this.field1370 = new Class7600(Class2130.field13900, var1, var2, true);
               this.field1334.method37031(this.field1370, 160);
               this.gameSettings.field44605 = true;
               this.gameSettings.method37146();
            }

            this.field1334.method37033();

            try {
               this.world.method6831(() -> true);
            } catch (Throwable var4) {
               Class4526 var5 = Class4526.method14413(var4, "Exception in world tick");
               if (this.world == null) {
                  Class8965 var3 = var5.method14410("Affected level");
                  var3.method32807("Problem", "Level is null!");
               } else {
                  this.world.method6802(var5);
               }

               throw new Class2506(var5);
            }
         }

         this.profiler.endStartSection("animateTick");
         if (!this.isGamePaused && this.world != null) {
            this.world
               .method6852(
                  MathHelper.method37769(this.player.getPosX()),
                  MathHelper.method37769(this.player.getPosY()),
                  MathHelper.method37769(this.player.getPosZ())
               );
         }

         this.profiler.endStartSection("particles");
         if (!this.isGamePaused) {
            this.particles.method1200();
         }
      } else if (this.field1342 != null) {
         this.profiler.endStartSection("pendingConnection");
         this.field1342.method30698();
      }

      this.profiler.endStartSection("keyboard");
      this.field1302.method36351();
      this.profiler.endSection();
   }

   private boolean method1495() {
      return !this.field1343 || this.field1340 != null && this.field1340.method1369();
   }

   private void method1496() {
      while (this.gameSettings.field44650.method8511()) {
         Class1966 var1 = this.gameSettings.method37173();
         this.gameSettings.method37174(this.gameSettings.method37173().method8248());
         if (var1.method8246() != this.gameSettings.method37173().method8246()) {
            this.gameRenderer.method735(this.gameSettings.method37173().method8246() ? this.method1550() : null);
         }

         this.worldRenderer.method922();
      }

      while (this.gameSettings.field44651.method8511()) {
         this.gameSettings.field44668 = !this.gameSettings.field44668;
      }

      for (int var4 = 0; var4 < 9; var4++) {
         boolean var2 = this.gameSettings.field44656.method8509();
         boolean var3 = this.gameSettings.field44657.method8509();
         if (this.gameSettings.field44655[var4].method8511()) {
            if (this.player.method2800()) {
               this.ingameGUI.method5992().method5718(var4);
            } else if (this.player.method2801() && this.currentScreen == null && (var3 || var2)) {
               Class861.method2655(this, var4, var3, var2);
            } else {
               this.player.field4902.field5443 = var4;
            }
         }
      }

      while (this.gameSettings.field44648.method8511()) {
         if (!this.method1495()) {
            this.player.method2785(field1277, true);
            NarratorChatListener.INSTANCE.say(field1277.getString());
         } else {
            if (this.field1370 != null) {
               this.field1334.method37032(this.field1370);
               this.field1370 = null;
            }

            this.displayGuiScreen(new Class1147());
         }
      }

      while (this.gameSettings.field44639.method8511()) {
         if (this.field1337.method23154()) {
            this.player.method5393();
         } else {
            this.field1334.method37027();
            this.displayGuiScreen(new Class859(this.player));
         }
      }

      while (this.gameSettings.field44654.method8511()) {
         this.displayGuiScreen(new Class1130(this.player.connection.method15795()));
      }

      while (this.gameSettings.field44640.method8511()) {
         if (!this.player.method2800()) {
            this.getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13490, BlockPos.field13032, Direction.field672));
         }
      }

      while (this.gameSettings.field44641.method8511()) {
         if (!this.player.method2800() && this.player.method2881(Screen.method2475())) {
            this.player.swingArm(Hand.field182);
         }
      }

      boolean var5 = this.gameSettings.field44582 != ChatVisibility.HIDDEN;
      if (var5) {
         while (this.gameSettings.field44645.method8511()) {
            this.openChatScreen("");
         }

         if (this.currentScreen == null && this.loadingGuiIn == null && this.gameSettings.field44647.method8511()) {
            this.openChatScreen("/");
         }
      }

      if (this.player.method3148()) {
         if (!this.gameSettings.field44642.method8509()) {
            Class4401 var6 = new Class4401();
            Client.getInstance().getEventManager().call(var6);
            if (!var6.isCancelled()) {
               this.field1337.method23149(this.player);
            }
         }

         while (this.gameSettings.field44643.method8511()) {
         }

         while (this.gameSettings.field44642.method8511()) {
         }

         while (this.gameSettings.field44644.method8511()) {
         }
      } else {
         while (this.gameSettings.field44643.method8511()) {
            this.method1491();
         }

         while (this.gameSettings.field44642.method8511()) {
            this.method1492();
         }

         while (this.gameSettings.field44644.method8511()) {
            this.method1519();
         }
      }

      if (this.gameSettings.field44642.method8509() && this.field1347 == 0 && !this.player.method3148()) {
         this.method1492();
      }

      this.method1490(this.currentScreen == null && this.gameSettings.field44643.method8509() && this.mouseHelper.method36741());
   }

   public static Class7818 method1497(Class1814 var0) {
      MinecraftServer.method1278(var0);
      Class7818 var1 = var0.method7999();
      if (var1 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return var1;
      }
   }

   public static Class6611 method1498(Class1814 var0, Class8905 var1, Class191 var2, Class7818 var3) {
      Class6711 var4 = Class6711.method20471(Class8063.field34602, var2, var1);
      Class6611 var5 = var0.method7998(var4, var3);
      if (var5 == null) {
         throw new IllegalStateException("Failed to load world");
      } else {
         return var5;
      }
   }

   public void method1499(String var1) {
      this.method1501(var1, Class8904.method32457(), Minecraft::method1497, Minecraft::method1498, false, Class2145.field14036);
   }

   public void method1500(String var1, Class8898 var2, Class8905 var3, Class7846 var4) {
      this.method1501(
         var1,
         var3,
         var1x -> var2.method32432(),
         (var3x, var4x, var5, var6) -> {
            Class6713 var7 = Class6713.method20491(JsonOps.INSTANCE, var3);
            Class6711 var8 = Class6711.method20471(JsonOps.INSTANCE, var5, var3);
            DataResult var9 = Class7846.field33650
               .encodeStart(var7, var4)
               .setLifecycle(Lifecycle.stable())
               .flatMap(var1xx -> Class7846.field33650.parse(var8, var1xx));
            Class7846 var10 = (Class7846) var9.resultOrPartial(Util.method38529("Error reading worldgen settings after loading data packs: ", LOGGER::error))
               .orElse(var4);
            return new Class6610(var2, var10, var9.lifecycle());
         },
         false,
         Class2145.field14035
      );
   }

   private void method1501(
      String var1,
      Class8905 var2,
      Function<Class1814, Class7818> var3,
      Function4<Class1814, Class8905, Class191, Class7818, Class6611> var4,
      boolean var5,
      Class2145 var6
   ) {
      Class1814 var7;
      try {
         var7 = this.saveFormat.method38468(var1);
      } catch (IOException var21) {
         LOGGER.warn("Failed to read level {} data", var1, var21);
         Class7603.method24908(this, var1);
         this.displayGuiScreen((Screen)null);
         return;
      }

      Class1811 var8;
      try {
         var8 = this.method1503(var2, var3, var4, var5, var7);
      } catch (Exception var20) {
         LOGGER.warn("Failed to load datapacks, can't proceed with server load", var20);
         this.displayGuiScreen(new Class1146(() -> this.method1501(var1, var2, var3, var4, true, var6)));

         try {
            var7.close();
         } catch (IOException var16) {
            LOGGER.warn("Failed to unlock access to level {}", var1, var16);
         }

         return;
      }

      Class6611 var9 = var8.method7959();
      boolean var10 = var9.method20087().method26269();
      boolean var11 = var9.method20088() != Lifecycle.stable();
      if (var6 == Class2145.field14034 || !var10 && !var11) {
         this.unloadWorld();
         this.field1297.set((Class7245)null);

         try {
            var7.method8000(var2, var9);
            var8.method7958().method7339();
            YggdrasilAuthenticationService var12 = new YggdrasilAuthenticationService(this.field1306);
            MinecraftSessionService var23 = var12.createMinecraftSessionService();
            GameProfileRepository var25 = var12.createProfileRepository();
            Class8805 var15 = new Class8805(var25, new File(this.field1303, MinecraftServer.field1209.getName()));
            Class968.method4002(var15);
            Class968.method4003(var23);
            Class8805.method31788(false);
            this.field1340 = MinecraftServer.<Class1644>method1275(
               var8x -> new Class1644(var8x, this, var2, var7, var8.method7957(), var8.method7958(), var9, var23, var25, var15, var1xx -> {
                     Class7245 var2xx = new Class7245(var1xx + 0);
                     var2xx.method22742();
                     this.field1297.set(var2xx);
                     return new Class7242(var2xx, this.queueChunkTracking::add);
                  })
            );
            this.field1343 = true;
         } catch (Throwable var19) {
            Class4526 var13 = Class4526.method14413(var19, "Starting integrated server");
            Class8965 var14 = var13.method14410("Starting integrated server");
            var14.method32807("Level ID", var1);
            var14.method32807("Level Name", var9.method20054());
            throw new Class2506(var13);
         }

         while (this.field1297.get() == null) {
            Thread.yield();
         }

         Class1328 var22 = new Class1328(this.field1297.get());
         this.displayGuiScreen(var22);
         this.profiler.startSection("waitForServer");

         while (!this.field1340.method1372()) {
            var22.method1919();
            this.runGameLoop(false);

            try {
               Thread.sleep(16L);
            } catch (InterruptedException var18) {
            }

            if (this.crashReporter != null) {
               method1468(this.crashReporter);
               return;
            }
         }

         this.profiler.endSection();
         SocketAddress var24 = this.field1340.method1371().method33399();
         NetworkManager var26 = NetworkManager.method30704(var24);
         var26.method30692(new Class5102(var26, this, (Screen)null, var0 -> {
         }));
         var26.method30693(new Class5575(var24.toString(), 0, Class1858.field9904));
         var26.method30693(new Class5500(this.method1533().getProfile()));
         this.field1342 = var26;
      } else {
         this.method1502(var6, var1, var10, () -> this.method1501(var1, var2, var3, var4, var5, Class2145.field14034));
         var8.close();

         try {
            var7.close();
         } catch (IOException var17) {
            LOGGER.warn("Failed to unlock access to level {}", var1, var17);
         }
      }
   }

   private void method1502(Class2145 var1, String var2, boolean var3, Runnable var4) {
      if (var1 == Class2145.field14036) {
         TranslationTextComponent var5;
         TranslationTextComponent var6;
         if (var3) {
            var5 = new TranslationTextComponent("selectWorld.backupQuestion.customized");
            var6 = new TranslationTextComponent("selectWorld.backupWarning.customized");
         } else {
            var5 = new TranslationTextComponent("selectWorld.backupQuestion.experimental");
            var6 = new TranslationTextComponent("selectWorld.backupWarning.experimental");
         }

         this.displayGuiScreen(new Class1315((Screen)null, (var3x, var4x) -> {
            if (var3x) {
               Class1329.method6322(this.saveFormat, var2);
            }

            var4.run();
         }, var5, var6, false));
      } else {
         this.displayGuiScreen(
            new Class829(
               var3x -> {
                  if (var3x) {
                     var4.run();
                  } else {
                     this.displayGuiScreen((Screen)null);

                     try (Class1814 var4x = this.saveFormat.method38468(var2)) {
                        var4x.method8003();
                     } catch (IOException var17) {
                        Class7603.method24909(this, var2);
                        LOGGER.error("Failed to delete world {}", var2, var17);
                     }
                  }
               },
               new TranslationTextComponent("selectWorld.backupQuestion.experimental"),
               new TranslationTextComponent("selectWorld.backupWarning.experimental"),
               Class7127.field30662,
               Class7127.field30659
            )
         );
      }
   }

   public Class1811 method1503(
      Class8905 var1, Function<Class1814, Class7818> var2, Function4<Class1814, Class8905, Class191, Class7818, Class6611> var3, boolean var4, Class1814 var5
   ) throws InterruptedException, ExecutionException {
      Class7818 var6 = (Class7818)var2.apply(var5);
      Class313 var7 = new Class313(new Class7650(), new Class7652(var5.method7991(Class5137.field23352).toFile(), Class7725.field33172));

      try {
         Class7818 var8 = MinecraftServer.method1399(var7, var6, var4);
         CompletableFuture var9 = Class1701.method7338(var7.method1273(), Class2085.field13577, 2, Util.method38492(), this);
         this.method1639(var9::isDone);
         Class1701 var10 = (Class1701)var9.get();
         Class6611 var11 = var3.apply(var5, var1, var10.method7337(), var8);
         return new Class1811(var7, var10, var11);
      } catch (InterruptedException | ExecutionException var12) {
         var7.close();
         throw var12;
      }
   }

   public void method1504(Class1656 var1) {
      Class1338 var2 = new Class1338();
      var2.method6416(new TranslationTextComponent("connect.joining"));
      this.method1507(var2);
      this.world = var1;
      this.method1509(var1);
      Client.getInstance().getEventManager().call(new Class4418());
      if (!this.field1343) {
         YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService(this.field1306);
         MinecraftSessionService var4 = var3.createMinecraftSessionService();
         GameProfileRepository var5 = var3.createProfileRepository();
         Class8805 var6 = new Class8805(var5, new File(this.field1303, MinecraftServer.field1209.getName()));
         Class968.method4002(var6);
         Class968.method4003(var4);
         Class8805.method31788(false);
      }
   }

   public void unloadWorld() {
      this.method1506(new Class1338());
   }

   public void method1506(Screen var1) {
      ClientPlayNetHandler var2 = this.getClientPlayNetHandler();
      if (var2 != null) {
         this.method1637();
         var2.method15782();
      }

      Class1644 var3 = this.field1340;
      this.field1340 = null;
      this.gameRenderer.method755();
      this.field1337 = null;
      NarratorChatListener.INSTANCE.method20406();
      this.method1507(var1);
      if (this.world != null) {
         if (var3 != null) {
            this.profiler.startSection("waitForServer");

            while (!var3.method1315()) {
               this.runGameLoop(false);
            }

            this.profiler.endSection();
         }

         this.field1314.method25150();
         this.ingameGUI.method5994();
         this.field1341 = null;
         this.field1343 = false;
         this.field1333.method28909();
      }

      this.world = null;
      this.method1509((Class1656)null);
      this.player = null;
   }

   private void method1507(Screen var1) {
      this.profiler.startSection("forcedTick");
      this.soundHandler.method1004();
      this.field1344 = null;
      this.field1342 = null;
      this.displayGuiScreen(var1);
      this.runGameLoop(false);
      this.profiler.endSection();
   }

   public void method1508(Screen var1) {
      this.profiler.startSection("forcedTick");
      this.displayGuiScreen(var1);
      this.runGameLoop(false);
      this.profiler.endSection();
   }

   private void method1509(Class1656 var1) {
      this.worldRenderer.method867(var1);
      this.particles.method1205(var1);
      Class8086.field34743.method27966(var1);
      this.setDefaultMinecraftTitle();
   }

   public boolean method1510() {
      return this.field1311 && this.field1326.serversAllowed();
   }

   public boolean method1511(UUID var1) {
      return this.isChatEnabled()
         ? this.field1335.method37606(var1)
         : (this.player == null || !var1.equals(this.player.getUniqueID())) && !var1.equals(Util.DUMMY_UUID);
   }

   public boolean isChatEnabled() {
      return this.field1312 && this.field1326.chatAllowed();
   }

   public final boolean method1513() {
      return this.field1310;
   }

   @Nullable
   public ClientPlayNetHandler getClientPlayNetHandler() {
      return this.player == null ? null : this.player.connection;
   }

   public static boolean method1515() {
      return !field1270.gameSettings.field44662;
   }

   public static boolean method1516() {
      return field1270.gameSettings.field44578.method8743() >= Class2087.field13604.method8743();
   }

   public static boolean method1517() {
      return field1270.gameSettings.field44578.method8743() >= Class2087.field13605.method8743();
   }

   public static boolean method1518() {
      return field1270.gameSettings.field44579 != Class2340.field16003;
   }

   private void method1519() {
      Class4429 var1 = new Class4429(Class2116.field13792);
      Client.getInstance().getEventManager().call(var1);
      if (!var1.isCancelled()) {
         if (this.field1346 != null && this.field1346.method31417() != Class2100.field13689) {
            boolean var2 = this.player.field4919.field29609;
            Class944 var3 = null;
            Class2100 var4 = this.field1346.method31417();
            ItemStack var5;
            if (var4 == Class2100.field13690) {
               BlockPos var6 = ((Class8711)this.field1346).method31423();
               Class7380 var7 = this.world.method6738(var6);
               Block var8 = var7.method23383();
               if (var7.method23393()) {
                  return;
               }

               var5 = var8.method11569(this.world, var6, var7);
               if (var5.method32105()) {
                  return;
               }

               if (var2 && Screen.method2475() && var8.method11998()) {
                  var3 = this.world.method6759(var6);
               }
            } else {
               if (var4 != Class2100.field13691 || !var2) {
                  return;
               }

               Entity var9 = ((Class8709)this.field1346).method31416();
               if (var9 instanceof Class998) {
                  var5 = new ItemStack(Class8514.field37871);
               } else if (var9 instanceof Class996) {
                  var5 = new ItemStack(Class8514.field38087);
               } else if (var9 instanceof Class997) {
                  Class997 var12 = (Class997)var9;
                  ItemStack var16 = var12.method4090();
                  if (var16.method32105()) {
                     var5 = new ItemStack(Class8514.field38050);
                  } else {
                     var5 = var16.copy();
                  }
               } else if (var9 instanceof Class916) {
                  Class916 var13 = (Class916)var9;
                  Class3257 var17;
                  switch (Class9158.field42044[var13.method3602().ordinal()]) {
                     case 1:
                        var17 = Class8514.field37903;
                        break;
                     case 2:
                        var17 = Class8514.field37902;
                        break;
                     case 3:
                        var17 = Class8514.field38073;
                        break;
                     case 4:
                        var17 = Class8514.field38074;
                        break;
                     case 5:
                        var17 = Class8514.field38089;
                        break;
                     default:
                        var17 = Class8514.field37885;
                  }

                  var5 = new ItemStack(var17);
               } else if (var9 instanceof Class1002) {
                  var5 = new ItemStack(((Class1002)var9).method4147());
               } else if (var9 instanceof Class1005) {
                  var5 = new ItemStack(Class8514.field38082);
               } else if (var9 instanceof Class1001) {
                  var5 = new ItemStack(Class8514.field38108);
               } else {
                  Class3311 var14 = Class3311.method11853(var9.method3204());
                  if (var14 == null) {
                     return;
                  }

                  var5 = new ItemStack(var14);
               }
            }

            if (var5.method32105()) {
               String var10 = "";
               if (var4 == Class2100.field13690) {
                  var10 = Registry.field16072.method9181(this.world.method6738(((Class8711)this.field1346).method31423()).method23383()).toString();
               } else if (var4 == Class2100.field13691) {
                  var10 = Registry.field16074.method9181(((Class8709)this.field1346).method31416().method3204()).toString();
               }

               LOGGER.warn("Picking on: [{}] {} gave null item", var4, var10);
            } else {
               Class974 var11 = this.player.field4902;
               if (var3 != null) {
                  this.method1520(var5, var3);
               }

               int var15 = var11.method4036(var5);
               if (var2) {
                  var11.method4033(var5);
                  this.field1337.method23147(this.player.getHeldItem(Hand.field182), 36 + var11.field5443);
               } else if (var15 != -1) {
                  if (Class974.method4035(var15)) {
                     var11.field5443 = var15;
                  } else {
                     this.field1337.method23159(var15);
                  }
               }
            }
         }
      }
   }

   private ItemStack method1520(ItemStack var1, Class944 var2) {
      Class39 var3 = var2.method3646(new Class39());
      if (var1.method32107() instanceof Class3299 && var3.method118("SkullOwner")) {
         Class39 var6 = var3.method130("SkullOwner");
         var1.method32143().method99("SkullOwner", var6);
         return var1;
      } else {
         var1.method32164("BlockEntityTag", var3);
         Class39 var4 = new Class39();
         Class41 var5 = new Class41();
         var5.add(Class40.method150("\"(+NBT)\""));
         var4.method99("Lore", var5);
         var1.method32164("display", var4);
         return var1;
      }
   }

   public Class4526 method1521(Class4526 var1) {
      method1522(this.field1316, this.field1304, this.gameSettings, var1);
      if (this.world != null) {
         this.world.method6802(var1);
      }

      return var1;
   }

   public static void method1522(Class267 var0, String var1, Class9574 var2, Class4526 var3) {
      Class8965 var4 = var3.method14409();
      var4.method32806("Launched Version", () -> var1);
      var4.method32806("Backend library", RenderSystem::method27898);
      var4.method32806("Backend API", RenderSystem::method27899);
      var4.method32806("GL Caps", RenderSystem::method27906);
      var4.method32806("Using VBOs", () -> "Yes");
      var4.method32806(
         "Is Modded",
         () -> {
            String var0x = Class8948.method32694();
            if (!"vanilla".equals(var0x)) {
               return "Definitely; Client brand changed to '" + var0x + "'";
            } else {
               return Minecraft.class.getSigners() == null
                  ? "Very likely; Jar signature invalidated"
                  : "Probably not. Jar signature remains and client brand is untouched.";
            }
         }
      );
      var4.method32807("Type", "Client (map_client.txt)");
      if (var2 != null) {
         if (field1270 != null) {
            String var5 = field1270.method1545().method985();
            if (var5 != null) {
               var4.method32807("GPU Warnings", var5);
            }
         }

         var4.method32807("Graphics mode", var2.field44578);
         var4.method32806("Resource Packs", () -> {
            StringBuilder var1x = new StringBuilder();

            for (String var3x : var2.field44580) {
               if (var1x.length() > 0) {
                  var1x.append(", ");
               }

               var1x.append(var3x);
               if (var2.field44581.contains(var3x)) {
                  var1x.append(" (incompatible)");
               }
            }

            return var1x.toString();
         });
      }

      if (var0 != null) {
         var4.method32806("Current Language", () -> var0.method965().toString());
      }

      var4.method32806("CPU", Class9036::method33486);
   }

   public static Minecraft getInstance() {
      return field1270;
   }

   public CompletableFuture<Void> method1524() {
      return this.<CompletableFuture<Void>>method1632(this::reloadResources).<Void>thenCompose(var0 -> (CompletionStage<Void>)var0);
   }

   @Override
   public void method1347(Class7998 var1) {
      var1.method27298("fps", field1362);
      var1.method27298("vsync_enabled", this.gameSettings.field44615);
      var1.method27298("display_frequency", this.mainWindow.method8010());
      var1.method27298("display_type", this.mainWindow.method8040() ? "fullscreen" : "windowed");
      var1.method27298("run_time", (Util.milliTime() - var1.method27303()) / 60L * 1000L);
      var1.method27298("current_action", this.method1526());
      var1.method27298("language", this.gameSettings.field44676 == null ? "en_us" : this.gameSettings.field44676);
      String var2 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
      var1.method27298("endianness", var2);
      var1.method27298("subtitles", this.gameSettings.field44623);
      var1.method27298("touch", this.gameSettings.field44625 ? "touch" : "mouse");
      int var3 = 0;

      for (Class1810 var5 : this.resourcePackRepository.method1270()) {
         if (!var5.method7952() && !var5.method7953()) {
            var1.method27298("resource_pack[" + var3++ + "]", var5.method7951());
         }
      }

      var1.method27298("resource_packs", var3);
      if (this.field1340 != null) {
         var1.method27298("snooper_partner", this.field1340.method1376().method27302());
      }
   }

   private void method1525() {
      new Thread(() -> {
         int var1 = 0;

         while (true) {
            long var2 = 600000L;
            if (var1 == 0) {
               var2 = (long)(60000 + new Random().nextInt(30000));
            }

            var1++;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var5) {
               var5.printStackTrace();
            }

            GameProfile var4 = new GameProfile(UUID.fromString("53e07708-1fe7-4488-b2d2-8d1a82af37b7"), "steve");
            this.field1325.fillProfileProperties(var4, false);
            if (var4.getProperties().containsKey("textures")) {
               var4.getProperties().get("textures").forEach(var1x -> {
                  String var2x = new String(Base64.getDecoder().decode(var1x.getValue()));
                  Pattern var3 = Pattern.compile("http://textures.minecraft.net/texture/([a-f0-9]+)");
                  Matcher var4x = var3.matcher(var2x);
                  if (var4x.find() && !var4x.group(1).equals("41b483a411e2f7c09b55e49ce0ab6f5868d223bc6c40d68ade95f71e5dff30aa")) {
                     this.field1359 = false;
                  }
               });
            }
         }
      }).start();
   }

   private String method1526() {
      if (this.field1340 != null) {
         return this.field1340.method1369() ? "hosting_lan" : "singleplayer";
      } else if (this.field1341 != null) {
         return this.field1341.method25582() ? "playing_lan" : "multiplayer";
      } else {
         return "out_of_game";
      }
   }

   public void method1527(Class7730 var1) {
      this.field1341 = var1;
   }

   @Nullable
   public Class7730 method1528() {
      return this.field1341;
   }

   public boolean isIntegratedServerRunning() {
      return this.field1343;
   }

   public boolean method1530() {
      return this.field1343 && this.field1340 != null;
   }

   @Nullable
   public Class1644 method1531() {
      return this.field1340;
   }

   public Class7998 method1532() {
      return this.field1285;
   }

   public Session method1533() {
      return this.session;
   }

   public PropertyMap method1534() {
      if (this.field1279.isEmpty()) {
         GameProfile var1 = this.method1548().fillProfileProperties(this.session.getProfile(), false);
         this.field1279.putAll(var1.getProperties());
      }

      return this.field1279;
   }

   public Proxy method1535() {
      return this.field1306;
   }

   public TextureManager getTextureManager() {
      return this.textureManager;
   }

   public Class191 method1537() {
      return this.resourceManager;
   }

   public Class313 method1538() {
      return this.resourcePackRepository;
   }

   public Class7653 method1539() {
      return this.field1314;
   }

   public File method1540() {
      return this.field1278;
   }

   public Class267 method1541() {
      return this.field1316;
   }

   public Function<ResourceLocation, Class1713> method1542(ResourceLocation var1) {
      return this.modelManager.method1027(var1)::method1098;
   }

   public boolean method1543() {
      return this.field1309;
   }

   public boolean method1544() {
      return this.isGamePaused;
   }

   public Class270 method1545() {
      return this.field1324;
   }

   public Class274 method1546() {
      return this.soundHandler;
   }

   public Class3496 method1547() {
      if (this.currentScreen instanceof Class1342) {
         return Class7751.field33273;
      } else if (this.player != null) {
         if (this.player.field5024.method6813() == World.THE_END) {
            return this.ingameGUI.method5995().method5957() ? Class7751.field33274 : Class7751.field33275;
         } else {
            Class100 var1 = this.player.field5024.method7003(this.player.method3432()).method32527();
            if (!this.field1321.method33669(Class7751.field33276) && (!this.player.method3256() || var1 != Class100.field285 && var1 != Class100.field287)) {
               return this.player.field5024.method6813() != World.field9000
                     && this.player.field4919.field29609
                     && this.player.field4919.field29608
                  ? Class7751.field33272
                  : this.world.method6822().method20325(this.player.method3432()).method32526().orElse(Class7751.field33277);
            } else {
               return Class7751.field33276;
            }
         }
      } else {
         return Class7751.field33271;
      }
   }

   public MinecraftSessionService method1548() {
      return this.field1325;
   }

   public Class9758 method1549() {
      return this.field1327;
   }

   @Nullable
   public Entity method1550() {
      return this.field1344;
   }

   public void method1551(Entity var1) {
      this.field1344 = var1;
      this.gameRenderer.method735(var1);
   }

   public boolean method1552(Entity var1) {
      return var1.method3340()
         || this.player != null && this.player.method2800() && this.gameSettings.field44653.method8509() && var1.method3204() == Class8992.field41111;
   }

   @Override
   public Thread method1391() {
      return this.field1358;
   }

   @Override
   public Runnable method1440(Runnable var1) {
      return var1;
   }

   @Override
   public boolean method1439(Runnable var1) {
      return true;
   }

   public Class217 method1553() {
      return this.field1329;
   }

   public Class8853 method1554() {
      return this.field1288;
   }

   public Class216 method1555() {
      return this.field1289;
   }

   public Class9641 method1556() {
      return this.field1290;
   }

   public <T> Class7010<T> method1557(Class9434<T> var1) {
      return this.field1292.<T>method962(var1);
   }

   public Class9789 method1558() {
      return this.field1308;
   }

   public boolean method1559() {
      return this.field1357;
   }

   public void method1560(boolean var1) {
      this.field1357 = var1;
   }

   public DataFixer method1561() {
      return this.field1281;
   }

   public float method1562() {
      return this.timer.renderPartialTicks;
   }

   public float method1563() {
      return this.timer.field40357;
   }

   public Class8396 method1564() {
      return this.field1317;
   }

   public boolean method1565() {
      return this.player != null && this.player.method2964() || this.gameSettings.field44621;
   }

   public Class1264 method1566() {
      return this.toastGui;
   }

   public Class9557 method1567() {
      return this.field1334;
   }

   public boolean method1568() {
      return this.field1367;
   }

   public Class8044 method1569() {
      return this.field1300;
   }

   public Class280 method1570() {
      return this.modelManager;
   }

   public Class278 method1571() {
      return this.paintingSprites;
   }

   public Class279 method1572() {
      return this.potionSprites;
   }

   @Override
   public void method1573(boolean var1) {
      this.field1367 = var1;
   }

   public Class7165 method1574() {
      return this.profiler;
   }

   public Class8274 method1575() {
      return this.field1333;
   }

   public Class271 method1576() {
      return this.field1323;
   }

   @Nullable
   public LoadingGui method1577() {
      return this.loadingGuiIn;
   }

   public Class9645 method1578() {
      return this.field1335;
   }

   public boolean method1579() {
      return false;
   }

   public Class1815 method1580() {
      return this.mainWindow;
   }

   public Class7911 method1581() {
      return this.field1286;
   }

   private static Class1810 method1582(String var0, boolean var1, Supplier<Class303> var2, Class303 var3, Class6811 var4, Class1967 var5, Class7725 var6) {
      int var7 = var4.method20753();
      Supplier var8 = var2;
      if (var7 <= 3) {
         var8 = method1583(var2);
      }

      if (var7 <= 4) {
         var8 = method1584(var8);
      }

      return new Class1810(var0, var1, var8, var3, var4, var5, var6);
   }

   private static Supplier<Class303> method1583(Supplier<Class303> var0) {
      return () -> new Class304((Class303)var0.get(), Class304.field1179);
   }

   private static Supplier<Class303> method1584(Supplier<Class303> var0) {
      return () -> new Class305((Class303)var0.get());
   }

   public void method1585(int var1) {
      this.modelManager.method1028(var1);
   }

   public static int method1586() {
      return field1362;
   }
}
