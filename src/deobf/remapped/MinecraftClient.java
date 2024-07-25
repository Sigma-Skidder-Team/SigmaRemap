package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;
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
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.KeybindTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinecraftClient extends ReentrantThreadExecutor<Runnable> implements SnooperListener, WindowEventHandler {
   private static MinecraftClient instance;
   private static final Logger LOGGER = LogManager.getLogger();
   public static final boolean IS_SYSTEM_MAC = Util.getOperatingSystem() == OperatingSystem.OSX;
   public static final Identifier DEFAULT_FONT_ID = new Identifier("default");
   public static final Identifier UNICODE_FONT_ID = new Identifier("uniform");
   public static final Identifier ALT_TEXT_RENDERER_ID = new Identifier("alt");
   private static final CompletableFuture<Unit> COMPLETED_UNIT_FUTURE = CompletableFuture.<Unit>completedFuture(Unit.INSTANCE);
   private static final ITextComponent field_9671 = new TranslationTextComponent("multiplayer.socialInteractions.not_available");
   private final File resourcePackDir;
   private final PropertyMap sessionPropertyMap;
   private final TextureManager textureManager;
   private final DataFixer dataFixer;
   private final WindowProvider windowProvider;
   public final Window window;
   public final RenderTickCounter field_9616 = new RenderTickCounter(20.0F, 0L);
   private final Snooper field_9606 = new Snooper("client", this, Util.getMeasuringTimeMs());
   private final class_3017 field_9576;
   public final WorldRenderer worldRenderer;
   private final EntityRenderDispatcher field_9586;
   private final class_8765 field_9667;
   private final class_9164 field_9604;
   public final class_9326 field_9572;
   private final SearchManager field_9615 = new SearchManager();
   public final Session session;
   public final TextRenderer textRenderer;
   public final GameRenderer gameRenderer;
   public final class_3372 field_9612;
   private final AtomicReference<class_6730> field_9594 = new AtomicReference<class_6730>();
   public final class_3062 field_9614;
   public final GameOptions gameOptions;
   private final class_3459 field_9593;
   public final class_8671 field_9625;
   public final class_8455 field_9600;
   public final File runDirectory;
   private final String field_9597;
   private final String field_9622;
   private final Proxy field_9660;
   private final class_9663 field_9609;
   public final class_9703 field_9629 = new class_9703();
   private final boolean field_9666;
   private final boolean field_9580;
   private final boolean field_9583;
   private final boolean field_9664;
   private final class_550 field_9656;
   private final ClientBuiltinResourcePackProvider builtinPackProvider;
   public final class_6354 field_9653;
   private final class_2435 field_9585;
   private final class_4468 field_9624;
   private final class_6662 field_9640;
   public final class_4230 field_9596;
   private final class_3541 field_9611;
   private final class_6826 field_9568;
   private final class_950 field_9637;
   private final class_9545 field_9649;
   private final class_5180 field_9636;
   private final MinecraftSessionService field_9641;
   private final SocialInteractionsService field_9648;
   private final class_9593 field_9651;
   private final class_7458 field_9639;
   private final class_856 field_9642;
   private final class_4642 field_9665;
   private final class_3944 field_9618;
   private final class_9184 field_9627;
   private final class_4128 field_9645 = new class_4128(this);
   private final class_8827 field_9578;
   private final class_9186 field_9613;
   public static byte[] field_9608 = new byte[10485760];
   public class_9153 field_9647;
   public class_174 field_9601;
   public class_5989 field_9632;
   private class_7762 field_9646;
   private class_2560 field_9598;
   private class_5121 field_9670;
   private boolean field_9672;
   public Entity field_9669;
   public Entity field_9662;
   public class_7474 field_9587;
   public int field_9570;
   public int field_9582;
   private boolean field_9579;
   private float field_9621;
   private long field_9633 = Util.getMeasuringTimeNano();
   private long field_9661;
   private int field_9617;
   public boolean field_9589;
   public Screen field_9623;
   public class_7621 field_9610;
   private boolean field_9654;
   private Thread field_9644;
   public boolean field_9591 = true;
   private volatile boolean field_9619 = true;
   private class_159 field_9588;
   private static int field_9626;
   public String field_9584 = "";
   public boolean field_9569;
   public boolean field_9605;
   public boolean field_9631 = true;
   private boolean field_9630;
   private final Queue<Runnable> field_9571 = Queues.newConcurrentLinkedQueue();
   private CompletableFuture<Void> field_9655;
   private class_2297 field_9599;
   private class_3492 field_9592 = class_8677.field_44535;
   private int field_9643;
   private final class_2434 field_9674 = new class_2434(Util.nanoTimeSupplier, () -> this.field_9643);
   private class_2578 field_9581;
   private String field_9659 = "root";

   public MinecraftClient(RunArgs var1) {
      super("Client");
      instance = this;
      this.runDirectory = var1.directories.field_20153;
      File var2 = var1.directories.field_20151;
      this.resourcePackDir = var1.directories.field_20150;
      this.field_9597 = var1.field_17025.field_12806;
      this.field_9622 = var1.field_17025.field_12807;
      this.sessionPropertyMap = var1.field_17027.field_19113;
      this.builtinPackProvider = new ClientBuiltinResourcePackProvider(new File(this.runDirectory, "server-resource-packs"), var1.directories.getResourceIndex());
      this.field_9653 = new class_6354(MinecraftClient::method_8560, this.builtinPackProvider, new class_8936(this.resourcePackDir, class_2541.field_12597));
      this.field_9660 = var1.field_17027.field_19111;
      YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService(this.field_9660);
      this.field_9641 = var3.createMinecraftSessionService();
      this.field_9648 = this.method_8613(var3, var1);
      this.session = var1.field_17027.field_19110;
      LOGGER.info("Setting user: {}", this.session.method_5366());
      LOGGER.debug("(Session ID is {})", this.session.method_5369());
      this.method_8542();
      this.field_9580 = var1.field_17025.field_12804;
      this.field_9583 = !var1.field_17025.field_12805;
      this.field_9664 = !var1.field_17025.field_12809;
      this.field_9666 = method_8617();
      this.field_9646 = null;
      String var4;
      int var5;
      if (this.method_8537() && var1.field_17024.field_7977 != null) {
         var4 = var1.field_17024.field_7977;
         var5 = var1.field_17024.field_7975;
      } else {
         var4 = null;
         var5 = 0;
      }

      if (System.getProperty("java.version").contains("74")) {
         this.method_8512();
      }

      KeybindTextComponent.func_240696_a_(class_5916::method_27071);
      this.dataFixer = class_148.method_580();
      this.field_9627 = new class_9184(this);
      this.field_9578 = new class_8827(this);
      this.field_9644 = Thread.currentThread();
      this.gameOptions = new GameOptions(this, this.runDirectory);
      this.field_9593 = new class_3459(this.runDirectory, this.dataFixer);
      LOGGER.info("Backend library: {}", class_3542.method_16385());
      class_9706 var6;
      if (this.gameOptions.field_45424 > 0 && this.gameOptions.field_45491 > 0) {
         var6 = new class_9706(
            this.gameOptions.field_45491, this.gameOptions.field_45424, var1.field_17022.field_49357, var1.field_17022.field_49359, var1.field_17022.field_49360
         );
      } else {
         var6 = var1.field_17022;
      }

      Util.nanoTimeSupplier = class_3542.method_16454();
      this.windowProvider = new WindowProvider(this);
      this.window = this.windowProvider.method_43609(var6, this.gameOptions.field_45422, this.method_8504());
      this.method_32778(true);

      try {
         InputStream var7 = this.method_8606().method_25060().䴂쬫ಽ䩉㐖쬫(class_3168.field_15844, new Identifier("icons/icon_16x16.png"));
         InputStream var8 = this.method_8606().method_25060().䴂쬫ಽ䩉㐖쬫(class_3168.field_15844, new Identifier("icons/icon_32x32.png"));
         this.window.method_43183(var7, var8);
      } catch (IOException var9) {
         LOGGER.error("Couldn't set icon", var9);
      }

      this.window.method_43194(this.gameOptions.field_45439);
      this.field_9625 = new class_8671(this);
      this.field_9625.method_39837(this.window.method_43181());
      this.field_9600 = new class_8455(this);
      this.field_9600.method_38893(this.window.method_43181());
      class_3542.method_16478(this.gameOptions.field_45542, false);
      this.field_9596 = new class_4230(this.window.method_43178(), this.window.method_43198(), true, IS_SYSTEM_MAC);
      this.field_9596.method_19709(0.0F, 0.0F, 0.0F, 0.0F);
      this.field_9656 = new class_9483(class_3168.field_15844);
      this.field_9653.method_29122();
      this.gameOptions.method_40861(this.field_9653);
      this.field_9585 = new class_2435(this.gameOptions.field_45437);
      this.field_9656.method_2649(this.field_9585);
      this.textureManager = new TextureManager(this.field_9656);
      this.field_9656.method_2649(this.textureManager);
      this.field_9651 = new class_9593(this.textureManager, new File(var2, "skins"), this.field_9641);
      this.field_9609 = new class_9663(this.runDirectory.toPath().resolve("saves"), this.runDirectory.toPath().resolve("backups"), this.dataFixer);
      this.field_9611 = new class_3541(this.field_9656, this.gameOptions);
      this.field_9656.method_2649(this.field_9611);
      this.field_9649 = new class_9545(this.session);
      this.field_9656.method_2649(this.field_9649);
      this.field_9568 = new class_6826(this);
      this.field_9637 = new class_950(this.textureManager);
      this.textRenderer = this.field_9637.method_4190();
      this.field_9656.method_2649(this.field_9637.method_4189());
      this.method_8540(this.method_8578());
      this.field_9656.method_2649(new class_3205());
      this.field_9656.method_2649(new class_451());
      this.window.method_43182("Startup");
      class_3542.method_16406(0, 0, this.window.method_43178(), this.window.method_43198());
      this.window.method_43182("Post startup");
      this.field_9624 = class_4468.method_20751();
      this.field_9640 = class_6662.method_30588(this.field_9624);
      this.field_9639 = new class_7458(this.textureManager, this.field_9624, this.gameOptions.field_45577);
      this.field_9656.method_2649(this.field_9639);
      this.field_9667 = new class_8765(this.textureManager, this.field_9639, this.field_9640);
      this.field_9586 = new EntityRenderDispatcher(this.textureManager, this.field_9667, this.field_9656, this.textRenderer, this.gameOptions);
      this.field_9604 = new class_9164(this);
      this.field_9656.method_2649(this.field_9667);
      this.field_9576 = new class_3017();
      this.gameRenderer = new GameRenderer(this, this.field_9656, this.field_9576);
      this.field_9656.method_2649(this.gameRenderer);
      this.field_9613 = new class_9186(this, this.field_9648);
      this.field_9642 = new class_856(this.field_9639.method_33946(), this.field_9624);
      this.field_9656.method_2649(this.field_9642);
      this.worldRenderer = new WorldRenderer(this, this.field_9576);
      this.field_9656.method_2649(this.worldRenderer);
      this.method_8495();
      this.field_9656.method_2649(this.field_9615);
      this.field_9572 = new class_9326(this.field_9601, this.textureManager);
      this.field_9656.method_2649(this.field_9572);
      this.field_9665 = new class_4642(this.textureManager);
      this.field_9656.method_2649(this.field_9665);
      this.field_9618 = new class_3944(this.textureManager);
      this.field_9656.method_2649(this.field_9618);
      this.field_9636 = new class_5180();
      this.field_9656.method_2649(this.field_9636);
      SigmaMainClass.getInstance().method_3317();
      this.field_9614 = new class_3062(this);
      this.field_9612 = new class_3372(this);
      class_3542.method_16416(this::method_8547);
      if (this.gameOptions.field_45453 && !this.window.method_43174()) {
         this.window.method_43156();
         this.gameOptions.field_45453 = this.window.method_43174();
      }

      this.window.method_43162(this.gameOptions.field_45502);
      this.window.method_43176(this.gameOptions.field_45409);
      this.window.method_43172();
      this.method_32777();
      if (var4 != null) {
         this.method_8609(new class_501(new class_1876(), this, var4, var5));
      } else {
         this.method_8609(new class_1876(true));
      }

      class_2789.method_12674(this);
      List var10 = this.field_9653.method_29115();
      this.method_8494(
         new class_6340(
            this,
            this.field_9656.method_2650(Util.getMainWorkerExecutor(), this, COMPLETED_UNIT_FUTURE, var10),
            var1x -> Util.method_44691(var1x, this::method_8573, () -> {
                  if (class_7665.field_38958) {
                     this.method_8585();
                  }
               }),
            false
         )
      );
   }

   public void method_8545() {
      this.window.method_43185(this.method_8504());
   }

   private String method_8504() {
      StringBuilder var1 = new StringBuilder(SigmaMainClass.getInstance().method_3312() == class_6015.field_30645 ? "Jello for Sigma 5.0" : "Sigma 5.0");
      var1.append(" ");
      var1.append(class_7665.method_34674().getName());
      class_1092 var2 = this.method_8614();
      if (var2 != null && var2.method_9091().method_23493()) {
         var1.append(" - ");
         if (this.field_9646 != null && !this.field_9646.method_1624()) {
            var1.append(class_6956.method_31803("title.singleplayer"));
         } else if (this.method_8534()) {
            var1.append(class_6956.method_31803("title.multiplayer.realms"));
         } else if (this.field_9646 != null || this.field_9598 != null && this.field_9598.method_11626()) {
            var1.append(class_6956.method_31803("title.multiplayer.lan"));
         } else {
            var1.append(class_6956.method_31803("title.multiplayer.other"));
         }
      }

      return var1.toString();
   }

   private SocialInteractionsService method_8613(YggdrasilAuthenticationService var1, RunArgs var2) {
      try {
         return var1.createSocialInteractionsService(var2.field_17027.field_19110.method_5365());
      } catch (AuthenticationException var4) {
         LOGGER.error("Failed to verify authentication", var4);
         return new OfflineSocialInteractions();
      }
   }

   public boolean method_8522() {
      return false;
   }

   private void method_8573(Throwable var1) {
      if (this.field_9653.method_29123().size() > 1) {
         StringTextComponent var2;
         if (var1 instanceof class_1782) {
            var2 = new StringTextComponent(((class_1782)var1).method_7938().method_37470());
         } else {
            var2 = null;
         }

         this.method_8615(var1, var2);
      } else {
         Util.throwUnchecked(var1);
      }
   }

   public void method_8615(Throwable var1, ITextComponent var2) {
      LOGGER.info("Caught error loading resourcepacks, removing all selected resourcepacks", var1);
      this.field_9653.method_29121(Collections.<String>emptyList());
      this.gameOptions.field_45387.clear();
      this.gameOptions.field_45401.clear();
      this.gameOptions.method_40873();
      this.method_8524().thenRun(() -> {
         class_9184 var2x = this.method_8519();
         class_4201.method_19562(var2x, class_200.field_671, new TranslationTextComponent("resourcePack.load_fail"), var2);
      });
   }

   public void run() {
      this.field_9644 = Thread.currentThread();

      try {
         boolean var1 = false;

         while (this.field_9619) {
            if (this.field_9588 != null) {
               method_8608(this.field_9588);
               return;
            }

            try {
               class_8576 var7 = class_8576.method_39452("Renderer");
               boolean var3 = this.method_8605();
               this.method_8576(var3, var7);
               this.field_9592.method_16059();
               this.method_8544(!var1);
               SigmaMainClass.getInstance().method_3330();
               this.field_9592.method_16052();
               this.method_8603(var3, var7);
            } catch (OutOfMemoryError var4) {
               if (var1) {
                  throw var4;
               }

               this.method_8593();
               this.method_8609(new class_899());
               System.gc();
               LOGGER.fatal("Out of memory", var4);
               var1 = true;
            }
         }
      } catch (class_3297 var5) {
         this.method_8546(var5.method_15119());
         this.method_8593();
         LOGGER.fatal("Reported exception thrown!", var5);
         method_8608(var5.method_15119());
      } catch (Throwable var6) {
         class_159 var2 = this.method_8546(new class_159("Unexpected error", var6));
         LOGGER.fatal("Unreported exception thrown!", var6);
         this.method_8593();
         method_8608(var2);
      }
   }

   public void method_8540(boolean var1) {
      this.field_9637.method_4191(var1 ? ImmutableMap.of(DEFAULT_FONT_ID, UNICODE_FONT_ID) : ImmutableMap.of());
   }

   private void method_8495() {
      class_7622 var1 = new class_7622<class_6098>(
         var0 -> var0.method_28012((class_704)null, class_2575.field_12746)
               .stream()
               .<String>map(var0x -> TextFormatting.getTextWithoutFormattingCodes(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty()),
         var0 -> Stream.<Identifier>of(class_8669.field_44382.method_39797(var0.method_27960()))
      );
      class_4594 var2 = new class_4594<class_6098>(var0 -> class_391.method_1891().method_43143(var0.method_27960()).stream());
      class_2831 var3 = class_2831.method_12874();

      for (class_2451 var5 : class_8669.field_44382) {
         var5.method_11239(class_8230.field_42264, var3);
      }

      var3.forEach(var2x -> {
         var1.method_5709(var2x);
         var2.method_5709(var2x);
      });
      class_7622 var6 = new class_7622<class_7735>(
         var0 -> var0.method_35016()
               .stream()
               .<ITextComponent>flatMap(var0x -> var0x.method_41044().method_28012((class_704)null, class_2575.field_12746).stream())
               .<String>map(var0x -> TextFormatting.getTextWithoutFormattingCodes(var0x.getString()).trim())
               .filter(var0x -> !var0x.isEmpty()),
         var0 -> var0.method_35016().stream().<Identifier>map(var0x -> class_8669.field_44382.method_39797(var0x.method_41044().method_27960()))
      );
      this.field_9615.method_3534(SearchManager.field_4279, var1);
      this.field_9615.method_3534(SearchManager.field_4275, var2);
      this.field_9615.method_3534(SearchManager.field_4278, var6);
   }

   private void method_8547(int var1, long var2) {
      this.gameOptions.field_45502 = false;
      this.gameOptions.method_40873();
   }

   private static boolean method_8617() {
      String[] var0 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (String var4 : var0) {
         String var5 = System.getProperty(var4);
         if (var5 != null && var5.contains("64")) {
            return true;
         }
      }

      return false;
   }

   public class_4230 method_8584() {
      return this.field_9596;
   }

   public String method_8559() {
      return this.field_9597;
   }

   public String method_8539() {
      return this.field_9622;
   }

   public void method_8555(class_159 var1) {
      this.field_9588 = var1;
   }

   public static void method_8608(class_159 var0) {
      File var1 = new File(getInstance().runDirectory, "crash-reports");
      File var2 = new File(var1, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
      class_2557.method_11619(var0.method_632());
      if (var0.method_636() != null) {
         class_2557.method_11619("#@!@# Game crashed! Crash report saved to: #@!@# " + var0.method_636());
         System.exit(-1);
      } else if (var0.method_641(var2)) {
         class_2557.method_11619("#@!@# Game crashed! Crash report saved to: #@!@# " + var2.getAbsolutePath());
         System.exit(-1);
      } else {
         class_2557.method_11619("#@?@# Game crashed! Crash report could not be saved. #@?@#");
         System.exit(-2);
      }
   }

   public boolean method_8578() {
      return this.gameOptions.field_45463;
   }

   public CompletableFuture<Void> method_8524() {
      if (this.field_9655 != null) {
         return this.field_9655;
      } else {
         CompletableFuture var1 = new CompletableFuture();
         if (this.field_9610 instanceof class_2789) {
            this.field_9655 = var1;
            return var1;
         } else {
            this.field_9653.method_29122();
            List var2 = this.field_9653.method_29115();
            this.method_8494(
               new class_6340(
                  this,
                  this.field_9656.method_2650(Util.getMainWorkerExecutor(), this, COMPLETED_UNIT_FUTURE, var2),
                  var2x -> Util.method_44691(var2x, this::method_8573, () -> {
                        this.worldRenderer.method_19998();
                        var1.complete((Void)null);
                     }),
                  true
               )
            );
            return var1;
         }
      }
   }

   private void method_8585() {
      boolean var1 = false;
      class_9524 var2 = this.method_8505().method_3716();
      class_7373 var3 = var2.method_43945().method_33942();

      for (class_6414 var5 : class_8669.field_44462) {
         UnmodifiableIterator var6 = var5.method_29306().method_36441().iterator();

         while (var6.hasNext()) {
            class_2522 var7 = (class_2522)var6.next();
            if (var7.method_8352() == class_7537.field_38469) {
               class_7373 var8 = var2.method_43946(var7);
               if (var8 == var3) {
                  LOGGER.debug("Missing model for: {}", var7);
                  var1 = true;
               }
            }
         }
      }

      class_5155 var13 = var3.method_33587();

      for (class_6414 var16 : class_8669.field_44462) {
         UnmodifiableIterator var18 = var16.method_29306().method_36441().iterator();

         while (var18.hasNext()) {
            class_2522 var20 = (class_2522)var18.next();
            class_5155 var9 = var2.method_43938(var20);
            if (!var20.method_8345() && var9 == var13) {
               LOGGER.debug("Missing particle icon for: {}", var20);
               var1 = true;
            }
         }
      }

      class_2831 var15 = class_2831.method_12874();

      for (class_2451 var19 : class_8669.field_44382) {
         var15.clear();
         var19.method_11239(class_8230.field_42264, var15);

         for (class_6098 var22 : var15) {
            String var10 = var22.method_27958();
            String var11 = new TranslationTextComponent(var10).getString();
            if (var11.toLowerCase(Locale.ROOT).equals(var19.method_11216())) {
               LOGGER.debug("Missing translation for: {} {} {}", var22, var10, var22.method_27960());
            }
         }
      }

      var1 |= class_2150.method_10037();
      if (var1) {
         throw new IllegalStateException("Your game data is foobar, fix the errors above!");
      }
   }

   public class_9663 method_8591() {
      return this.field_9609;
   }

   private void method_8548(String var1) {
      if (this.method_8566() || this.method_8514()) {
         this.method_8609(new class_5766(var1));
      } else if (this.field_9632 != null) {
         this.field_9632.method_26286(new TranslationTextComponent("chat.cannotSend").mergeStyle(TextFormatting.RED), Util.NIL_UUID);
      }
   }

   public void method_8609(Screen var1) {
      if (this.field_9623 != null) {
         this.field_9623.method_1162();
      }

      if (var1 == null && this.field_9601 == null) {
         var1 = new class_1876();
      } else if (var1 == null && this.field_9632.method_26450()) {
         if (this.field_9632.method_27329()) {
            var1 = new class_7696((ITextComponent)null, this.field_9601.method_749().method_8659());
         } else {
            this.field_9632.method_3205();
         }
      }

      if (var1 instanceof class_1876 || var1 instanceof class_4145) {
         this.gameOptions.field_45470 = false;
         this.field_9614.method_13991().method_18690(true);
      }

      this.field_9623 = (Screen)var1;
      SigmaMainClass.getInstance().method_3299().method_30988();
      if (var1 != null) {
         this.field_9625.method_39844();
         class_5916.method_27064();
         ((Screen)var1).method_1164(this, this.window.method_43165(), this.window.method_43177());
         this.field_9589 = false;
         class_7542.field_38482.method_34341(((Screen)var1).method_1165());
      } else {
         this.field_9611.method_16346();
         this.field_9625.method_39834();
      }

      this.method_8545();
   }

   public void method_8494(class_7621 var1) {
      this.field_9610 = var1;
   }

   public void method_8523() {
      try {
         LOGGER.info("Stopping!");

         try {
            class_7542.field_38482.method_34343();
         } catch (Throwable var7) {
         }

         try {
            if (this.field_9601 != null) {
               this.field_9601.method_29519();
            }

            this.method_8499();
         } catch (Throwable var6) {
         }

         if (this.field_9623 != null) {
            this.field_9623.method_1162();
         }

         this.close();
      } finally {
         Util.nanoTimeSupplier = System::nanoTime;
         if (this.field_9588 == null) {
            System.exit(0);
         }
      }
   }

   @Override
   public void close() {
      try {
         this.field_9639.close();
         this.field_9637.close();
         this.gameRenderer.close();
         this.worldRenderer.close();
         this.field_9611.method_16329();
         this.field_9653.close();
         this.field_9572.method_43060();
         this.field_9618.close();
         this.field_9665.close();
         this.textureManager.close();
         this.field_9656.close();
         Util.shutdownExecutors();
      } catch (Throwable var5) {
         LOGGER.error("Shutdown failure!", var5);
         throw var5;
      } finally {
         this.windowProvider.close();
         this.window.close();
      }
   }

   private void method_8544(boolean var1) {
      this.window.method_43182("Pre render");
      long var2 = Util.getMeasuringTimeNano();
      if (this.window.method_43187()) {
         this.method_8512();
      }

      if (this.field_9655 != null && !(this.field_9610 instanceof class_2789)) {
         CompletableFuture var4 = this.field_9655;
         this.field_9655 = null;
         this.method_8524().thenRun(() -> var4.complete((Void)null));
      }

      Runnable var9;
      while ((var9 = this.field_9571.poll()) != null) {
         var9.run();
      }

      if (var1) {
         int var5 = this.field_9616.method_29172(Util.getMeasuringTimeMs());
         this.field_9592.method_16056("scheduledExecutables");
         this.method_34454();
         this.field_9592.method_16054();
         this.field_9592.method_16056("tick");

         for (int var6 = 0; var6 < Math.min(10, var5); var6++) {
            this.field_9592.method_16055("clientTick");
            this.method_8492();
         }

         this.field_9592.method_16054();
      }

      this.field_9625.method_39846();
      this.window.method_43182("Render");
      this.field_9592.method_16056("sound");
      this.field_9611.method_16348(this.gameRenderer.method_35949());
      this.field_9592.method_16054();
      this.field_9592.method_16056("render");
      class_3542.method_16438();
      class_3542.method_16402(16640, IS_SYSTEM_MAC);
      this.field_9596.method_19717(true);
      class_6377.method_29162();
      this.field_9592.method_16056("display");
      class_3542.method_16432();
      class_3542.method_16361();
      this.field_9592.method_16054();
      if (!this.field_9589) {
         this.field_9592.method_16050("gameRenderer");
         this.gameRenderer.method_35945(this.field_9579 ? this.field_9621 : this.field_9616.field_32600, var2, var1);
         this.field_9592.method_16050("toasts");
         this.field_9627.method_42331(new class_7966());
         this.field_9592.method_16054();
      }

      if (this.field_9581 != null) {
         this.field_9592.method_16056("fpsPie");
         this.method_8525(new class_7966(), this.field_9581);
         this.field_9592.method_16054();
      }

      this.field_9592.method_16056("blit");
      this.field_9596.method_19723();
      class_3542.method_16489();
      class_3542.method_16438();
      this.field_9596.method_19713(this.window.method_43178(), this.window.method_43198());
      class_3542.method_16489();
      this.field_9592.method_16050("updateDisplay");
      this.window.method_43154();
      int var10 = this.method_8507();
      if ((double)var10 < class_1013.field_5277.method_38573()) {
         class_3542.method_16422(var10);
      }

      this.field_9592.method_16050("yield");
      Thread.yield();
      this.field_9592.method_16054();
      this.window.method_43182("Post render");
      this.field_9617++;
      boolean var11 = this.method_8520()
         && (this.field_9623 != null && this.field_9623.method_1161() || this.field_9610 != null && this.field_9610.method_34549())
         && !this.field_9646.method_1624();
      if (this.field_9579 != var11) {
         if (this.field_9579) {
            this.field_9621 = this.field_9616.field_32600;
         } else {
            this.field_9616.field_32600 = this.field_9621;
         }

         this.field_9579 = var11;
      }

      long var7 = Util.getMeasuringTimeNano();
      this.field_9629.method_44836(var7 - this.field_9633);
      this.field_9633 = var7;
      this.field_9592.method_16056("fpsUpdate");

      while (Util.getMeasuringTimeMs() >= this.field_9661 + 1000L) {
         field_9626 = this.field_9617;
         this.field_9584 = String.format(
            "%d fps T: %s%s%s%s B: %d",
            field_9626,
            (double)this.gameOptions.field_45439 == class_1013.field_5277.method_38573() ? "inf" : this.gameOptions.field_45439,
            this.gameOptions.field_45502 ? " vsync" : "",
            this.gameOptions.field_45397.toString(),
            this.gameOptions.field_45551 == class_9655.field_49168
               ? ""
               : (this.gameOptions.field_45551 == class_9655.field_49170 ? " fast-clouds" : " fancy-clouds"),
            this.gameOptions.field_45526
         );
         this.field_9661 += 1000L;
         this.field_9617 = 0;
         this.field_9606.method_15246();
         if (!this.field_9606.method_15248()) {
            this.field_9606.method_15250();
         }
      }

      this.field_9592.method_16054();
   }

   private boolean method_8605() {
      return this.gameOptions.field_45470 && this.gameOptions.field_45471 && !this.gameOptions.field_45567;
   }

   private void method_8576(boolean var1, class_8576 var2) {
      if (var1) {
         if (!this.field_9674.method_11087()) {
            this.field_9643 = 0;
            this.field_9674.method_11089();
         }

         this.field_9643++;
      } else {
         this.field_9674.method_11090();
      }

      this.field_9592 = class_8576.method_39453(this.field_9674.method_11091(), var2);
   }

   private void method_8603(boolean var1, class_8576 var2) {
      if (var2 != null) {
         var2.method_39451();
      }

      if (var1) {
         this.field_9581 = this.field_9674.method_11086();
      } else {
         this.field_9581 = null;
      }

      this.field_9592 = this.field_9674.method_11091();
   }

   @Override
   public void method_32777() {
      int var1 = this.window.method_43164(this.gameOptions.field_45484, this.method_8578());
      this.window.method_43169((double)var1);
      if (this.field_9623 != null) {
         this.field_9623.method_1191(this, this.window.method_43165(), this.window.method_43177());
         SigmaMainClass.getInstance().method_3299().method_30991();
      }

      class_4230 var2 = this.method_8584();
      var2.method_19708(this.window.method_43178(), this.window.method_43198(), IS_SYSTEM_MAC);
      this.gameRenderer.method_35943(this.window.method_43178(), this.window.method_43198());
      this.field_9625.method_39833();
   }

   @Override
   public void method_32779() {
      this.field_9625.method_39840();
   }

   private int method_8507() {
      return this.field_9601 == null && (this.field_9623 != null || this.field_9610 != null)
         ? Math.min(120, Math.max(this.window.method_43186(), 60))
         : this.window.method_43186();
   }

   public void method_8593() {
      try {
         field_9608 = new byte[0];
         this.worldRenderer.method_20034();
      } catch (Throwable var3) {
      }

      try {
         System.gc();
         if (this.field_9672 && this.field_9646 != null) {
            this.field_9646.method_1641(true);
         }

         this.method_8500(new class_6476(new TranslationTextComponent("menu.savingLevel")));
      } catch (Throwable var2) {
      }

      System.gc();
   }

   public void method_8595(int var1) {
      if (this.field_9581 != null) {
         List var2 = this.field_9581.method_11742(this.field_9659);
         if (!var2.isEmpty()) {
            class_692 var3 = (class_692)var2.remove(0);
            if (var1 == 0) {
               if (!var3.field_3801.isEmpty()) {
                  int var4 = this.field_9659.lastIndexOf(30);
                  if (var4 >= 0) {
                     this.field_9659 = this.field_9659.substring(0, var4);
                  }
               }
            } else {
               var1--;
               if (var1 < var2.size() && !"unspecified".equals(((class_692)var2.get(var1)).field_3801)) {
                  if (!this.field_9659.isEmpty()) {
                     this.field_9659 = this.field_9659 + '\u001e';
                  }

                  this.field_9659 = this.field_9659 + ((class_692)var2.get(var1)).field_3801;
               }
            }
         }
      }
   }

   private void method_8525(class_7966 var1, class_2578 var2) {
      List var3 = var2.method_11742(this.field_9659);
      class_692 var4 = (class_692)var3.remove(0);
      class_3542.method_16402(256, IS_SYSTEM_MAC);
      class_3542.method_16463(5889);
      class_3542.method_16476();
      class_3542.method_16376(0.0, (double)this.window.method_43178(), (double)this.window.method_43198(), 0.0, 1000.0, 3000.0);
      class_3542.method_16463(5888);
      class_3542.method_16476();
      class_3542.method_16413(0.0F, 0.0F, -2000.0F);
      class_3542.method_16484(1.0F);
      class_3542.method_16354();
      class_8042 var5 = class_8042.method_36499();
      class_9633 var6 = var5.method_36501();
      short var7 = 160;
      int var8 = this.window.method_43178() - 160 - 10;
      int var9 = this.window.method_43198() - 320;
      class_3542.method_16488();
      var6.method_44471(7, class_7985.field_40903);
      var6.method_35761((double)((float)var8 - 176.0F), (double)((float)var9 - 96.0F - 16.0F), 0.0).method_35743(200, 0, 0, 0).method_35735();
      var6.method_35761((double)((float)var8 - 176.0F), (double)(var9 + 320), 0.0).method_35743(200, 0, 0, 0).method_35735();
      var6.method_35761((double)((float)var8 + 176.0F), (double)(var9 + 320), 0.0).method_35743(200, 0, 0, 0).method_35735();
      var6.method_35761((double)((float)var8 + 176.0F), (double)((float)var9 - 96.0F - 16.0F), 0.0).method_35743(200, 0, 0, 0).method_35735();
      var5.method_36500();
      class_3542.method_16448();
      double var10 = 0.0;

      for (class_692 var13 : var3) {
         int var14 = class_9299.method_42847(var13.field_3803 / 4.0) + 1;
         var6.method_44471(6, class_7985.field_40903);
         int var15 = var13.method_3124();
         int var16 = var15 >> 16 & 0xFF;
         int var17 = var15 >> 8 & 0xFF;
         int var18 = var15 & 0xFF;
         var6.method_35761((double)var8, (double)var9, 0.0).method_35743(var16, var17, var18, 255).method_35735();

         for (int var19 = var14; var19 >= 0; var19--) {
            float var20 = (float)((var10 + var13.field_3803 * (double)var19 / (double)var14) * (float) (Math.PI * 2) / 100.0);
            float var21 = class_9299.method_42818(var20) * 160.0F;
            float var22 = class_9299.method_42840(var20) * 160.0F * 0.5F;
            var6.method_35761((double)((float)var8 + var21), (double)((float)var9 - var22), 0.0).method_35743(var16, var17, var18, 255).method_35735();
         }

         var5.method_36500();
         var6.method_44471(5, class_7985.field_40903);

         for (int var32 = var14; var32 >= 0; var32--) {
            float var36 = (float)((var10 + var13.field_3803 * (double)var32 / (double)var14) * (float) (Math.PI * 2) / 100.0);
            float var37 = class_9299.method_42818(var36) * 160.0F;
            float var38 = class_9299.method_42840(var36) * 160.0F * 0.5F;
            if (!(var38 > 0.0F)) {
               var6.method_35761((double)((float)var8 + var37), (double)((float)var9 - var38), 0.0)
                  .method_35743(var16 >> 1, var17 >> 1, var18 >> 1, 255)
                  .method_35735();
               var6.method_35761((double)((float)var8 + var37), (double)((float)var9 - var38 + 10.0F), 0.0)
                  .method_35743(var16 >> 1, var17 >> 1, var18 >> 1, 255)
                  .method_35735();
            }
         }

         var5.method_36500();
         var10 += var13.field_3803;
      }

      DecimalFormat var23 = new DecimalFormat("##0.00");
      var23.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
      class_3542.method_16432();
      String var24 = class_2578.method_11738(var4.field_3801);
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
      this.textRenderer.method_45390(var1, var25, (float)(var8 - 160), (float)(var9 - 80 - 16), 16777215);
      var25 = var23.format(var4.field_3802) + "%";
      this.textRenderer.method_45390(var1, var25, (float)(var8 + 160 - this.textRenderer.method_45395(var25)), (float)(var9 - 80 - 16), 16777215);

      for (int var29 = 0; var29 < var3.size(); var29++) {
         class_692 var30 = (class_692)var3.get(var29);
         StringBuilder var31 = new StringBuilder();
         if ("unspecified".equals(var30.field_3801)) {
            var31.append("[?] ");
         } else {
            var31.append("[").append(var29 + 1).append("] ");
         }

         String var33 = var31.append(var30.field_3801).toString();
         this.textRenderer.method_45390(var1, var33, (float)(var8 - 160), (float)(var9 + 80 + var29 * 8 + 20), var30.method_3124());
         var33 = var23.format(var30.field_3803) + "%";
         this.textRenderer
            .method_45390(var1, var33, (float)(var8 + 160 - 50 - this.textRenderer.method_45395(var33)), (float)(var9 + 80 + var29 * 8 + 20), var30.method_3124());
         var33 = var23.format(var30.field_3802) + "%";
         this.textRenderer
            .method_45390(var1, var33, (float)(var8 + 160 - this.textRenderer.method_45395(var33)), (float)(var9 + 80 + var29 * 8 + 20), var30.method_3124());
      }
   }

   public void method_8512() {
      if (this.field_9619) {
         SigmaMainClass.getInstance().method_3324();
      }

      this.field_9619 = false;
   }

   public boolean method_8570() {
      return this.field_9619;
   }

   public void method_8597(boolean var1) {
      if (this.field_9623 == null) {
         boolean var2 = this.method_8520() && !this.field_9646.method_1624();
         if (var2) {
            this.method_8609(new class_2794(!var1));
            this.field_9611.method_16340();
         } else {
            this.method_8609(new class_2794(true));
         }
      }
   }

   private void method_8553(boolean var1) {
      if (!var1) {
         this.field_9582 = 0;
      }

      if (this.field_9582 <= 0 && !this.field_9632.method_26554()) {
         if (var1 && this.field_9587 != null && this.field_9587.method_33990() == class_1430.field_7717) {
            class_9529 var2 = (class_9529)this.field_9587;
            class_1331 var3 = var2.method_43955();
            if (!this.field_9601.method_28262(var3).method_8345()) {
               Direction var4 = var2.method_43956();
               if (this.field_9647.method_42163(var3, var4)) {
                  this.field_9572.method_43058(var3, var4);
                  this.field_9632.method_26597(class_2584.field_12791);
               }
            }
         } else {
            this.field_9647.method_42135();
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_8610() {
      class_8706 var1 = new class_8706(class_3237.field_16098);
      SigmaMainClass.getInstance().method_3302().method_7914(var1);
      if (!var1.method_29716()) {
         if (this.field_9582 <= 0) {
            if (this.field_9587 == null) {
               LOGGER.error("Null returned as 'hitResult', this shouldn't happen!");
               if (this.field_9647.method_42149()) {
                  this.field_9582 = 10;
               }
            } else if (!this.field_9632.method_27320()) {
               class_3645 var2 = null;
               if (this.field_9587.method_33990() == class_1430.field_7718) {
                  var2 = new class_3645(((class_5631)this.field_9587).method_25524(), true);
                  SigmaMainClass.getInstance().method_3302().method_7914(var2);
                  if (var2.method_29716()) {
                     return;
                  }
               }

               boolean var3 = class_3347.method_15348().equals(class_412.field_1747);
               if (var3) {
                  this.field_9632.method_26597(class_2584.field_12791);
               }

               switch (this.field_9587.method_33990()) {
                  case field_7718:
                     this.field_9647.method_42138(this.field_9632, ((class_5631)this.field_9587).method_25524());
                     if (var2 != null) {
                        var2.method_16974();
                        SigmaMainClass.getInstance().method_3302().method_7914(var2);
                     }
                     break;
                  case field_7717:
                     class_9529 var4 = (class_9529)this.field_9587;
                     class_1331 var5 = var4.method_43955();
                     if (!this.field_9601.method_28262(var5).method_8345()) {
                        this.field_9647.method_42142(var5, var4.method_43956());
                        break;
                     }
                  case field_7721:
                     if (this.field_9647.method_42149()) {
                        this.field_9582 = 10;
                     }

                     this.field_9632.method_3164();
               }

               if (!var3) {
                  this.field_9632.method_26597(class_2584.field_12791);
               }
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_8565() {
      class_8706 var1 = new class_8706(class_3237.field_16101);
      SigmaMainClass.getInstance().method_3302().method_7914(var1);
      if (!var1.method_29716()) {
         if (!this.field_9647.method_42156()) {
            this.field_9570 = 4;
            if (!this.field_9632.method_27320()) {
               if (this.field_9587 == null) {
                  LOGGER.warn("Null returned as 'hitResult', this shouldn't happen!");
               }

               for (class_2584 var5 : class_2584.values()) {
                  class_6098 var6 = this.field_9632.method_26617(var5);
                  if (this.field_9587 != null) {
                     switch (this.field_9587.method_33990()) {
                        case field_7718:
                           class_5631 var7 = (class_5631)this.field_9587;
                           Entity var8 = var7.method_25524();
                           class_6910 var9 = this.field_9647.method_42145(this.field_9632, var8, var7, var5);
                           if (!var9.method_31662()) {
                              var9 = this.field_9647.method_42144(this.field_9632, var8, var5);
                           }

                           if (var9.method_31662()) {
                              if (var9.method_31661()) {
                                 this.field_9632.method_26597(var5);
                              }

                              return;
                           }
                           break;
                        case field_7717:
                           class_9529 var10 = (class_9529)this.field_9587;
                           int var11 = var6.method_27997();
                           class_6910 var12 = this.field_9647.method_42147(this.field_9632, this.field_9601, var5, var10);
                           if (var12.method_31662()) {
                              if (var12.method_31661()) {
                                 this.field_9632.method_26597(var5);
                                 if (!var6.method_28022() && (var6.method_27997() != var11 || this.field_9647.method_42140())) {
                                    this.gameRenderer.field_40622.method_42250(var5);
                                 }
                              }

                              return;
                           }

                           if (var12 == class_6910.field_35517) {
                              return;
                           }
                     }
                  }

                  if (!var6.method_28022()) {
                     class_6910 var13 = this.field_9647.method_42155(this.field_9632, this.field_9601, var5);
                     if (var13.method_31662()) {
                        if (var13.method_31661()) {
                           this.field_9632.method_26597(var5);
                        }

                        this.gameRenderer.field_40622.method_42250(var5);
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public class_6826 method_8575() {
      return this.field_9568;
   }

   public void method_8492() {
      if (this.field_9570 > 0) {
         this.field_9570--;
      }

      this.field_9592.method_16056("gui");
      if (!this.field_9579) {
         this.field_9614.method_13990();
      }

      this.field_9592.method_16054();
      this.gameRenderer.method_35938(1.0F);
      this.field_9578.method_40534(this.field_9601, this.field_9587);
      this.field_9592.method_16056("gameMode");
      if (!this.field_9579 && this.field_9601 != null) {
         this.field_9647.method_42137();
      }

      this.field_9592.method_16050("textures");
      if (this.field_9601 != null) {
         this.textureManager.method_80();
      }

      if (this.field_9623 == null && this.field_9632 != null) {
         if (this.field_9632.method_26450() && !(this.field_9623 instanceof class_7696)) {
            this.method_8609((Screen)null);
         } else if (this.field_9632.method_26507() && this.field_9601 != null) {
            this.method_8609(new class_1086());
         }
      } else if (this.field_9623 != null && this.field_9623 instanceof class_1086 && !this.field_9632.method_26507()) {
         this.method_8609((Screen)null);
      }

      if (this.field_9623 != null) {
         this.field_9582 = 10000;
      }

      if (this.field_9623 != null) {
         Screen.method_1181(() -> this.field_9623.method_5312(), "Ticking screen", this.field_9623.getClass().getCanonicalName());
      }

      if (!this.gameOptions.field_45470) {
         this.field_9614.method_13978();
      }

      if (this.field_9610 == null && (this.field_9623 == null || this.field_9623.field_951)) {
         this.field_9592.method_16050("Keybindings");
         this.method_8556();
         if (this.field_9582 > 0) {
            this.field_9582--;
         }
      }

      if (this.field_9601 != null) {
         this.field_9592.method_16050("gameRenderer");
         if (!this.field_9579) {
            this.gameRenderer.method_35958();
         }

         this.field_9592.method_16050("levelRenderer");
         if (!this.field_9579) {
            this.worldRenderer.method_20084();
         }

         this.field_9592.method_16050("level");
         if (!this.field_9579) {
            if (this.field_9601.method_744() > 0) {
               this.field_9601.method_29591(this.field_9601.method_744() - 1);
            }

            this.field_9601.method_737();
         }
      } else if (this.gameRenderer.method_35930() != null) {
         this.gameRenderer.method_35922();
      }

      if (!this.field_9579) {
         this.field_9568.method_31309();
      }

      this.field_9611.method_16330(this.field_9579);
      if (this.field_9601 != null) {
         if (!this.field_9579) {
            if (!this.gameOptions.field_45519 && this.method_8612()) {
               TranslationTextComponent var1 = new TranslationTextComponent("tutorial.socialInteractions.title");
               TranslationTextComponent var2 = new TranslationTextComponent(
                  "tutorial.socialInteractions.description", class_8827.method_40532("socialInteractions")
               );
               this.field_9599 = new class_2297(class_7856.field_39810, var1, var2, true);
               this.field_9578.method_40540(this.field_9599, 160);
               this.gameOptions.field_45519 = true;
               this.gameOptions.method_40873();
            }

            this.field_9578.method_40536();

            try {
               this.field_9601.method_751(() -> true);
            } catch (Throwable var4) {
               class_159 var5 = class_159.method_643(var4, "Exception in world tick");
               if (this.field_9601 == null) {
                  class_6544 var3 = var5.method_639("Affected level");
                  var3.method_29850("Problem", "Level is null!");
               } else {
                  this.field_9601.method_29548(var5);
               }

               throw new class_3297(var5);
            }
         }

         this.field_9592.method_16050("animateTick");
         if (!this.field_9579 && this.field_9601 != null) {
            this.field_9601
               .method_732(
                  class_9299.method_42847(this.field_9632.method_37302()),
                  class_9299.method_42847(this.field_9632.method_37309()),
                  class_9299.method_42847(this.field_9632.method_37156())
               );
         }

         this.field_9592.method_16050("particles");
         if (!this.field_9579) {
            this.field_9572.method_43057();
         }
      } else if (this.field_9670 != null) {
         this.field_9592.method_16050("pendingConnection");
         this.field_9670.method_23483();
      }

      this.field_9592.method_16050("keyboard");
      this.field_9600.method_38892();
      this.field_9592.method_16054();
   }

   private boolean method_8612() {
      return !this.field_9672 || this.field_9646 != null && this.field_9646.method_1624();
   }

   private void method_8556() {
      while (this.gameOptions.keyPerspectiveSwitch.isPressed()) {
         class_9193 var1 = this.gameOptions.method_40867();
         this.gameOptions.method_40884(this.gameOptions.method_40867().method_42382());
         if (var1.method_42383() != this.gameOptions.method_40867().method_42383()) {
            this.gameRenderer.method_35951(this.gameOptions.method_40867().method_42383() ? this.method_8516() : null);
         }

         this.worldRenderer.method_20018();
      }

      while (this.gameOptions.keySmoothCamera.isPressed()) {
         this.gameOptions.field_45499 = !this.gameOptions.field_45499;
      }

      for (int var4 = 0; var4 < 9; var4++) {
         boolean var2 = this.gameOptions.field_45562.isKeyDown();
         boolean var3 = this.gameOptions.field_45486.isKeyDown();
         if (this.gameOptions.hotbarKeys[var4].isPressed()) {
            if (this.field_9632.method_37221()) {
               this.field_9614.method_14004().method_38560(var4);
            } else if (this.field_9632.method_3186() && this.field_9623 == null && (var3 || var2)) {
               class_2546.method_11590(this, var4, var3, var2);
            } else {
               this.field_9632.field_3853.field_36404 = var4;
            }
         }
      }

      while (this.gameOptions.keySnowflakeMenu.isPressed()) {
         if (!this.method_8612()) {
            this.field_9632.method_3251(field_9671, true);
            class_7542.field_38482.method_34341(field_9671.getString());
         } else {
            if (this.field_9599 != null) {
               this.field_9578.method_40541(this.field_9599);
               this.field_9599 = null;
            }

            this.method_8609(new class_1840());
         }
      }

      while (this.gameOptions.keyInventory.isPressed()) {
         if (this.field_9647.method_42161()) {
            this.field_9632.method_27311();
         } else {
            this.field_9578.method_40535();
            this.method_8609(new class_3431(this.field_9632));
         }
      }

      while (this.gameOptions.keyAdvancements.isPressed()) {
         this.method_8609(new class_9044(this.field_9632.field_30532.method_4796()));
      }

      while (this.gameOptions.keySwapOffHand.isPressed()) {
         if (!this.field_9632.method_37221()) {
            this.method_8614().method_4813(new class_1586(class_7500.field_38260, class_1331.field_7306, Direction.field_802));
         }
      }

      while (this.gameOptions.keyDrop.isPressed()) {
         if (!this.field_9632.method_37221() && this.field_9632.method_3235(Screen.method_1185())) {
            this.field_9632.method_26597(class_2584.field_12791);
         }
      }

      boolean var5 = this.gameOptions.field_45443 != class_1803.field_9186;
      if (var5) {
         while (this.gameOptions.keyOpenChat.isPressed()) {
            this.method_8548("");
         }

         if (this.field_9623 == null && this.field_9610 == null && this.gameOptions.keyTypeCommand.isPressed()) {
            this.method_8548("/");
         }
      }

      if (this.field_9632.method_26554()) {
         if (!this.gameOptions.keyUse.isKeyDown()) {
            class_4996 var6 = new class_4996();
            SigmaMainClass.getInstance().method_3302().method_7914(var6);
            if (!var6.method_29716()) {
               this.field_9647.method_42139(this.field_9632);
            }
         }

         while (this.gameOptions.keyAttack.isPressed()) {
         }

         while (this.gameOptions.keyUse.isPressed()) {
         }

         while (this.gameOptions.keyPickItem.isPressed()) {
         }
      } else {
         while (this.gameOptions.keyAttack.isPressed()) {
            this.method_8610();
         }

         while (this.gameOptions.keyUse.isPressed()) {
            this.method_8565();
         }

         while (this.gameOptions.keyPickItem.isPressed()) {
            this.method_8543();
         }
      }

      if (this.gameOptions.keyUse.isKeyDown() && this.field_9570 == 0 && !this.field_9632.method_26554()) {
         this.method_8565();
      }

      this.method_8553(this.field_9623 == null && this.gameOptions.keyAttack.isKeyDown() && this.field_9625.method_39843());
   }

   public static class_2805 method_8582(class_3676 var0) {
      class_341.method_1666(var0);
      class_2805 var1 = var0.method_17073();
      if (var1 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return var1;
      }
   }

   public static class_5684 method_8527(class_3676 var0, class_7522 var1, class_7832 var2, class_2805 var3) {
      class_888 var4 = class_888.method_3825(class_3504.field_17178, var2, var1);
      class_5684 var5 = var0.method_17072(var4, var3);
      if (var5 == null) {
         throw new IllegalStateException("Failed to load world");
      } else {
         return var5;
      }
   }

   public void method_8599(String var1) {
      this.method_8513(var1, class_6322.method_28810(), MinecraftClient::method_8582, MinecraftClient::method_8527, false, class_8272.field_42427);
   }

   public void method_8518(String var1, class_6292 var2, class_7522 var3, class_2904 var4) {
      this.method_8513(
         var1,
         var3,
         var1x -> var2.method_28713(),
         (var3x, var4x, var5, var6) -> {
            class_8876 var7 = class_8876.method_40843(JsonOps.INSTANCE, var3);
            class_888 var8 = class_888.method_3825(JsonOps.INSTANCE, var5, var3);
            DataResult var9 = class_2904.field_14169
               .encodeStart(var7, var4)
               .setLifecycle(Lifecycle.stable())
               .flatMap(var1xx -> class_2904.field_14169.parse(var8, var1xx));
            class_2904 var10 = var9.resultOrPartial(Util.method_44690("Error reading worldgen settings after loading data packs: ", LOGGER::error))
               .orElse(var4);
            return new class_5056(var2, var10, var9.lifecycle());
         },
         false,
         class_8272.field_42425
      );
   }

   private void method_8513(
      String var1,
      class_7522 var2,
      Function<class_3676, class_2805> var3,
      Function4<class_3676, class_7522, class_7832, class_2805, class_5684> var4,
      boolean var5,
      class_8272 var6
   ) {
      class_3676 var7;
      try {
         var7 = this.field_9609.method_44633(var1);
      } catch (IOException var21) {
         LOGGER.warn("Failed to read level {} data", var1, var21);
         class_4201.method_19563(this, var1);
         this.method_8609((Screen)null);
         return;
      }

      class_4266 var8;
      try {
         var8 = this.method_8572(var2, var3, var4, var5, var7);
      } catch (Exception var20) {
         LOGGER.warn("Failed to load datapacks, can't proceed with server load", var20);
         this.method_8609(new class_9588(() -> this.method_8513(var1, var2, var3, var4, true, var6)));

         try {
            var7.close();
         } catch (IOException var16) {
            LOGGER.warn("Failed to unlock access to level {}", var1, var16);
         }

         return;
      }

      class_5684 var9 = var8.method_19864();
      boolean var10 = var9.method_25703().method_13301();
      boolean var11 = var9.method_25710() != Lifecycle.stable();
      if (var6 == class_8272.field_42426 || !var10 && !var11) {
         this.method_8499();
         this.field_9594.set((class_6730)null);

         try {
            var7.method_17065(var2, var9);
            var8.method_19863().method_28748();
            YggdrasilAuthenticationService var12 = new YggdrasilAuthenticationService(this.field_9660);
            MinecraftSessionService var23 = var12.createMinecraftSessionService();
            GameProfileRepository var25 = var12.createProfileRepository();
            class_5969 var15 = new class_5969(var25, new File(this.runDirectory, class_341.field_1312.getName()));
            class_4797.method_22114(var15);
            class_4797.method_22111(var23);
            class_5969.method_27263(false);
            this.field_9646 = class_341.<class_7762>method_1648(
               var8x -> new class_7762(var8x, this, var2, var7, var8.method_19862(), var8.method_19863(), var9, var23, var25, var15, var1xx -> {
                     class_6730 var2xx = new class_6730(var1xx + 0);
                     var2xx.method_30872();
                     this.field_9594.set(var2xx);
                     return new class_1582(var2xx, this.field_9571::add);
                  })
            );
            this.field_9672 = true;
         } catch (Throwable var19) {
            class_159 var13 = class_159.method_643(var19, "Starting integrated server");
            class_6544 var14 = var13.method_639("Starting integrated server");
            var14.method_29850("Level ID", var1);
            var14.method_29850("Level Name", var9.method_25716());
            throw new class_3297(var13);
         }

         while (this.field_9594.get() == null) {
            Thread.yield();
         }

         class_2681 var22 = new class_2681(this.field_9594.get());
         this.method_8609(var22);
         this.field_9592.method_16056("waitForServer");

         while (!this.field_9646.method_1636()) {
            var22.method_5312();
            this.method_8544(false);

            try {
               Thread.sleep(16L);
            } catch (InterruptedException var18) {
            }

            if (this.field_9588 != null) {
               method_8608(this.field_9588);
               return;
            }
         }

         this.field_9592.method_16054();
         SocketAddress var24 = this.field_9646.method_1679().method_30821();
         class_5121 var26 = class_5121.method_23484(var24);
         var26.method_23495(new class_261(var26, this, (Screen)null, var0 -> {
         }));
         var26.method_23485(new class_8135(var24.toString(), 0, class_5776.field_29174));
         var26.method_23485(new class_4014(this.method_8502().method_5370()));
         this.field_9670 = var26;
      } else {
         this.method_8549(var6, var1, var10, () -> this.method_8513(var1, var2, var3, var4, var5, class_8272.field_42426));
         var8.close();

         try {
            var7.close();
         } catch (IOException var17) {
            LOGGER.warn("Failed to unlock access to level {}", var1, var17);
         }
      }
   }

   private void method_8549(class_8272 var1, String var2, boolean var3, Runnable var4) {
      if (var1 == class_8272.field_42427) {
         TranslationTextComponent var5;
         TranslationTextComponent var6;
         if (var3) {
            var5 = new TranslationTextComponent("selectWorld.backupQuestion.customized");
            var6 = new TranslationTextComponent("selectWorld.backupWarning.customized");
         } else {
            var5 = new TranslationTextComponent("selectWorld.backupQuestion.experimental");
            var6 = new TranslationTextComponent("selectWorld.backupWarning.experimental");
         }

         this.method_8609(new class_7262((Screen)null, (var3x, var4x) -> {
            if (var3x) {
               class_7404.method_33719(this.field_9609, var2);
            }

            var4.run();
         }, var5, var6, false));
      } else {
         this.method_8609(
            new class_9640(
               var3x -> {
                  if (var3x) {
                     var4.run();
                  } else {
                     this.method_8609((Screen)null);

                     try (class_3676 var4x = this.field_9609.method_44633(var2)) {
                        var4x.method_17074();
                     } catch (IOException var17) {
                        class_4201.method_19560(this, var2);
                        LOGGER.error("Failed to delete world {}", var2, var17);
                     }
                  }
               },
               new TranslationTextComponent("selectWorld.backupQuestion.experimental"),
               new TranslationTextComponent("selectWorld.backupWarning.experimental"),
               class_1402.field_7631,
               class_1402.field_7633
            )
         );
      }
   }

   public class_4266 method_8572(
      class_7522 var1,
      Function<class_3676, class_2805> var2,
      Function4<class_3676, class_7522, class_7832, class_2805, class_5684> var3,
      boolean var4,
      class_3676 var5
   ) throws InterruptedException, ExecutionException {
      class_2805 var6 = (class_2805)var2.apply(var5);
      class_6354 var7 = new class_6354(new class_2362(), new class_8936(var5.method_17064(class_263.field_924).toFile(), class_2541.field_12594));

      try {
         class_2805 var8 = class_341.method_1673(var7, var6, var4);
         CompletableFuture var9 = class_6298.method_28747(var7.method_29115(), class_9019.field_46137, 2, Util.getMainWorkerExecutor(), this);
         this.method_34461(var9::isDone);
         class_6298 var10 = (class_6298)var9.get();
         class_5684 var11 = (class_5684)var3.apply(var5, var1, var10.method_28743(), var8);
         return new class_4266(var7, var10, var11, null);
      } catch (InterruptedException | ExecutionException var12) {
         var7.close();
         throw var12;
      }
   }

   public void method_8508(class_174 var1) {
      class_7152 var2 = new class_7152();
      var2.樽鱀ၝ藸鶲轐(new TranslationTextComponent("connect.joining"));
      this.method_8600(var2);
      this.field_9601 = var1;
      this.method_8594(var1);
      SigmaMainClass.getInstance().method_3302().method_7914(new class_717());
      if (!this.field_9672) {
         YggdrasilAuthenticationService var3 = new YggdrasilAuthenticationService(this.field_9660);
         MinecraftSessionService var4 = var3.createMinecraftSessionService();
         GameProfileRepository var5 = var3.createProfileRepository();
         class_5969 var6 = new class_5969(var5, new File(this.runDirectory, class_341.field_1312.getName()));
         class_4797.method_22114(var6);
         class_4797.method_22111(var4);
         class_5969.method_27263(false);
      }
   }

   public void method_8499() {
      this.method_8500(new class_7152());
   }

   public void method_8500(Screen var1) {
      class_1092 var2 = this.method_8614();
      if (var2 != null) {
         this.method_34459();
         var2.method_4818();
      }

      class_7762 var3 = this.field_9646;
      this.field_9646 = null;
      this.gameRenderer.method_35925();
      this.field_9647 = null;
      class_7542.field_38482.method_34347();
      this.method_8600(var1);
      if (this.field_9601 != null) {
         if (var3 != null) {
            this.field_9592.method_16056("waitForServer");

            while (!var3.method_1668()) {
               this.method_8544(false);
            }

            this.field_9592.method_16054();
         }

         this.builtinPackProvider.method_25058();
         this.field_9614.method_13988();
         this.field_9598 = null;
         this.field_9672 = false;
         this.field_9645.method_19172();
      }

      this.field_9601 = null;
      this.method_8594((class_174)null);
      this.field_9632 = null;
   }

   private void method_8600(Screen var1) {
      this.field_9592.method_16056("forcedTick");
      this.field_9611.method_16335();
      this.field_9669 = null;
      this.field_9670 = null;
      this.method_8609(var1);
      this.method_8544(false);
      this.field_9592.method_16054();
   }

   public void method_8580(Screen var1) {
      this.field_9592.method_16056("forcedTick");
      this.method_8609(var1);
      this.method_8544(false);
      this.field_9592.method_16054();
   }

   private void method_8594(class_174 var1) {
      this.worldRenderer.method_20092(var1);
      this.field_9572.method_43041(var1);
      class_3569.field_17468.method_16588(var1);
      this.method_8545();
   }

   public boolean method_8537() {
      return this.field_9583 && this.field_9648.serversAllowed();
   }

   public boolean method_8526(UUID var1) {
      return this.method_8514()
         ? this.field_9613.method_42337(var1)
         : (this.field_9632 == null || !var1.equals(this.field_9632.method_37328())) && !var1.equals(Util.NIL_UUID);
   }

   public boolean method_8514() {
      return this.field_9664 && this.field_9648.chatAllowed();
   }

   public final boolean method_8493() {
      return this.field_9580;
   }

   @Nullable
   public class_1092 method_8614() {
      return this.field_9632 == null ? null : this.field_9632.field_30532;
   }

   public static boolean method_8616() {
      return !instance.gameOptions.field_45567;
   }

   public static boolean method_8528() {
      return instance.gameOptions.field_45397.method_21386() >= class_4615.field_22437.method_21386();
   }

   public static boolean method_8497() {
      return instance.gameOptions.field_45397.method_21386() >= class_4615.field_22433.method_21386();
   }

   public static boolean method_8541() {
      return instance.gameOptions.field_45533 != class_6168.field_31559;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_8543() {
      class_8706 var1 = new class_8706(class_3237.field_16097);
      SigmaMainClass.getInstance().method_3302().method_7914(var1);
      if (!var1.method_29716()) {
         if (this.field_9587 != null && this.field_9587.method_33990() != class_1430.field_7721) {
            boolean var2 = this.field_9632.field_3876.field_4944;
            class_3757 var3 = null;
            class_1430 var4 = this.field_9587.method_33990();
            class_6098 var5;
            if (var4 == class_1430.field_7717) {
               class_1331 var6 = ((class_9529)this.field_9587).method_43955();
               class_2522 var7 = this.field_9601.method_28262(var6);
               class_6414 var8 = var7.method_8360();
               if (var7.method_8345()) {
                  return;
               }

               var5 = var8.method_29276(this.field_9601, var6, var7);
               if (var5.method_28022()) {
                  return;
               }

               if (var2 && Screen.method_1185() && var8.method_10802()) {
                  var3 = this.field_9601.method_28260(var6);
               }
            } else {
               if (var4 != class_1430.field_7718 || !var2) {
                  return;
               }

               Entity var9 = ((class_5631)this.field_9587).method_25524();
               if (var9 instanceof class_5490) {
                  var5 = new class_6098(class_4897.field_24370);
               } else if (var9 instanceof class_8008) {
                  var5 = new class_6098(class_4897.field_25274);
               } else if (var9 instanceof class_7451) {
                  class_7451 var12 = (class_7451)var9;
                  class_6098 var16 = var12.method_33905();
                  if (var16.method_28022()) {
                     var5 = new class_6098(class_4897.field_24463);
                  } else {
                     var5 = var16.method_27973();
                  }
               } else if (var9 instanceof class_1080) {
                  class_1080 var13 = (class_1080)var9;
                  class_2451 var17;
                  switch (var13.method_4737()) {
                     case field_17068:
                        var17 = class_4897.field_24550;
                        break;
                     case field_17064:
                        var17 = class_4897.field_24906;
                        break;
                     case field_17067:
                        var17 = class_4897.field_24375;
                        break;
                     case field_17063:
                        var17 = class_4897.field_24473;
                        break;
                     case field_17069:
                        var17 = class_4897.field_25292;
                        break;
                     default:
                        var17 = class_4897.field_24547;
                  }

                  var5 = new class_6098(var17);
               } else if (var9 instanceof class_9149) {
                  var5 = new class_6098(((class_9149)var9).method_42090());
               } else if (var9 instanceof class_9399) {
                  var5 = new class_6098(class_4897.field_24960);
               } else if (var9 instanceof class_3577) {
                  var5 = new class_6098(class_4897.field_24665);
               } else {
                  class_3003 var14 = class_3003.method_13715(var9.method_37387());
                  if (var14 == null) {
                     return;
                  }

                  var5 = new class_6098(var14);
               }
            }

            if (var5.method_28022()) {
               String var10 = "";
               if (var4 == class_1430.field_7717) {
                  var10 = class_8669.field_44462
                     .method_39797(this.field_9601.method_28262(((class_9529)this.field_9587).method_43955()).method_8360())
                     .toString();
               } else if (var4 == class_1430.field_7718) {
                  var10 = class_8669.field_44400.method_39797(((class_5631)this.field_9587).method_25524().method_37387()).toString();
               }

               LOGGER.warn("Picking on: [{}] {} gave null item", var4, var10);
            } else {
               class_7051 var11 = this.field_9632.field_3853;
               if (var3 != null) {
                  this.method_8568(var5, var3);
               }

               int var15 = var11.method_32407(var5);
               if (var2) {
                  var11.method_32427(var5);
                  this.field_9647.method_42148(this.field_9632.method_26617(class_2584.field_12791), 36 + var11.field_36404);
               } else if (var15 != -1) {
                  if (class_7051.method_32417(var15)) {
                     var11.field_36404 = var15;
                  } else {
                     this.field_9647.method_42128(var15);
                  }
               }
            }
         }
      }
   }

   private class_6098 method_8568(class_6098 var1, class_3757 var2) {
      class_5734 var3 = var2.method_17396(new class_5734());
      if (var1.method_27960() instanceof class_3571 && var3.method_25938("SkullOwner")) {
         class_5734 var6 = var3.method_25937("SkullOwner");
         var1.method_27994().method_25946("SkullOwner", var6);
         return var1;
      } else {
         var1.method_27954("BlockEntityTag", var3);
         class_5734 var4 = new class_5734();
         class_3416 var5 = new class_3416();
         var5.add(class_473.method_2261("\"(+NBT)\""));
         var4.method_25946("Lore", var5);
         var1.method_27954("display", var4);
         return var1;
      }
   }

   public class_159 method_8546(class_159 var1) {
      method_8489(this.field_9585, this.field_9597, this.gameOptions, var1);
      if (this.field_9601 != null) {
         this.field_9601.method_29548(var1);
      }

      return var1;
   }

   public static void method_8489(class_2435 var0, String var1, GameOptions var2, class_159 var3) {
      class_6544 var4 = var3.method_629();
      var4.method_29851("Launched Version", () -> var1);
      var4.method_29851("Backend library", class_3542::method_16385);
      var4.method_29851("Backend API", class_3542::method_16461);
      var4.method_29851("GL Caps", class_3542::method_16369);
      var4.method_29851("Using VBOs", () -> "Yes");
      var4.method_29851(
         "Is Modded",
         () -> {
            String var0x = class_6489.method_29605();
            if (!"vanilla".equals(var0x)) {
               return "Definitely; Client brand changed to '" + var0x + "'";
            } else {
               return MinecraftClient.class.getSigners() == null
                  ? "Very likely; Jar signature invalidated"
                  : "Probably not. Jar signature remains and client brand is untouched.";
            }
         }
      );
      var4.method_29850("Type", "Client (map_client.txt)");
      if (var2 != null) {
         if (instance != null) {
            String var5 = instance.method_8538().method_23751();
            if (var5 != null) {
               var4.method_29850("GPU Warnings", var5);
            }
         }

         var4.method_29850("Graphics mode", var2.field_45397);
         var4.method_29851("Resource Packs", () -> {
            StringBuilder var1x = new StringBuilder();

            for (String var3x : var2.field_45387) {
               if (var1x.length() > 0) {
                  var1x.append(", ");
               }

               var1x.append(var3x);
               if (var2.field_45401.contains(var3x)) {
                  var1x.append(" (incompatible)");
               }
            }

            return var1x.toString();
         });
      }

      if (var0 != null) {
         var4.method_29851("Current Language", () -> var0.method_11096().toString());
      }

      var4.method_29851("CPU", class_6765::method_31015);
   }

   public static MinecraftClient getInstance() {
      return instance;
   }

   public CompletableFuture<Void> reloadResourcesConcurrently() {
      return this.<CompletableFuture<Void>>method_34452(this::method_8524).<Void>thenCompose(var0 -> (CompletionStage<Void>)var0);
   }

   @Override
   public void addSnooperInfo(Snooper var1) {
      var1.method_15252("fps", field_9626);
      var1.method_15252("vsync_enabled", this.gameOptions.field_45502);
      var1.method_15252("display_frequency", this.window.method_43197());
      var1.method_15252("display_type", this.window.method_43174() ? "fullscreen" : "windowed");
      var1.method_15252("run_time", (Util.getMeasuringTimeMs() - var1.method_15251()) / 60L * 1000L);
      var1.method_15252("current_action", this.method_8602());
      var1.method_15252("language", this.gameOptions.field_45437 == null ? "en_us" : this.gameOptions.field_45437);
      String var2 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
      var1.method_15252("endianness", var2);
      var1.method_15252("subtitles", this.gameOptions.field_45445);
      var1.method_15252("touch", this.gameOptions.field_45570 ? "touch" : "mouse");
      int var3 = 0;

      for (class_5522 var5 : this.field_9653.method_29125()) {
         if (!var5.method_25024() && !var5.method_25029()) {
            var1.method_15252("resource_pack[" + var3++ + "]", var5.method_25023());
         }
      }

      var1.method_15252("resource_packs", var3);
      if (this.field_9646 != null) {
         var1.method_15252("snooper_partner", this.field_9646.method_1756().method_15249());
      }
   }

   private void method_8542() {
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
            this.field_9641.fillProfileProperties(var4, false);
            if (var4.getProperties().containsKey("textures")) {
               var4.getProperties().get("textures").forEach(var1x -> {
                  String var2x = new String(Base64.getDecoder().decode(var1x.getValue()));
                  Pattern var3 = Pattern.compile("http://textures.minecraft.net/texture/([a-f0-9]+)");
                  Matcher var4x = var3.matcher(var2x);
                  if (var4x.find() && !var4x.group(1).equals("41b483a411e2f7c09b55e49ce0ab6f5868d223bc6c40d68ade95f71e5dff30aa")) {
                     this.field_9591 = false;
                  }
               });
            }
         }
      }).start();
   }

   private String method_8602() {
      if (this.field_9646 != null) {
         return this.field_9646.method_1624() ? "hosting_lan" : "singleplayer";
      } else if (this.field_9598 != null) {
         return this.field_9598.method_11626() ? "playing_lan" : "multiplayer";
      } else {
         return "out_of_game";
      }
   }

   public void method_8604(class_2560 var1) {
      this.field_9598 = var1;
   }

   @Nullable
   public class_2560 method_8530() {
      return this.field_9598;
   }

   public boolean method_8566() {
      return this.field_9672;
   }

   public boolean method_8520() {
      return this.field_9672 && this.field_9646 != null;
   }

   @Nullable
   public class_7762 method_8515() {
      return this.field_9646;
   }

   public Snooper method_8611() {
      return this.field_9606;
   }

   public Session method_8502() {
      return this.session;
   }

   public PropertyMap method_8579() {
      if (this.sessionPropertyMap.isEmpty()) {
         GameProfile var1 = this.method_8517().fillProfileProperties(this.session.method_5370(), false);
         this.sessionPropertyMap.putAll(var1.getProperties());
      }

      return this.sessionPropertyMap;
   }

   public Proxy method_8607() {
      return this.field_9660;
   }

   public TextureManager method_8577() {
      return this.textureManager;
   }

   public class_7832 method_8498() {
      return this.field_9656;
   }

   public class_6354 method_8521() {
      return this.field_9653;
   }

   public ClientBuiltinResourcePackProvider method_8606() {
      return this.builtinPackProvider;
   }

   public File method_8536() {
      return this.resourcePackDir;
   }

   public class_2435 method_8561() {
      return this.field_9585;
   }

   public Function<Identifier, class_5155> method_8490(Identifier var1) {
      return this.field_9639.method_33947(var1)::method_38528;
   }

   public boolean method_8533() {
      return this.field_9666;
   }

   public boolean method_8564() {
      return this.field_9579;
   }

   public class_5180 method_8538() {
      return this.field_9636;
   }

   public class_3541 method_8590() {
      return this.field_9611;
   }

   public class_75 method_8506() {
      if (this.field_9623 instanceof class_3129) {
         return class_2623.field_12931;
      } else if (this.field_9632 != null) {
         if (this.field_9632.field_41768.method_29545() == World.field_33038) {
            return this.field_9614.method_13972().method_21876() ? class_2623.field_12932 : class_2623.field_12929;
         } else {
            class_8862 var1 = this.field_9632.field_41768.method_22561(this.field_9632.method_37075()).method_28887();
            if (!this.field_9568.method_31308(class_2623.field_12930)
               && (!this.field_9632.method_37179() || var1 != class_8862.field_45309 && var1 != class_8862.field_45297)) {
               return this.field_9632.field_41768.method_29545() != World.field_33029
                     && this.field_9632.field_3876.field_4944
                     && this.field_9632.field_3876.field_4941
                  ? class_2623.field_12925
                  : this.field_9601.method_22564().method_3725(this.field_9632.method_37075()).method_28879().orElse(class_2623.field_12928);
            } else {
               return class_2623.field_12930;
            }
         }
      } else {
         return class_2623.field_12927;
      }
   }

   public MinecraftSessionService method_8517() {
      return this.field_9641;
   }

   public class_9593 method_8557() {
      return this.field_9651;
   }

   @Nullable
   public Entity method_8516() {
      return this.field_9669;
   }

   public void method_8550(Entity var1) {
      this.field_9669 = var1;
      this.gameRenderer.method_35951(var1);
   }

   public boolean method_8563(Entity var1) {
      return var1.method_37116()
         || this.field_9632 != null
            && this.field_9632.method_37221()
            && this.gameOptions.keySpectatorOutlines.isKeyDown()
            && var1.method_37387() == class_6629.field_34300;
   }

   @Override
   public Thread method_34460() {
      return this.field_9644;
   }

   @Override
   public Runnable method_34462(Runnable var1) {
      return var1;
   }

   @Override
   public boolean method_34463(Runnable var1) {
      return true;
   }

   public class_856 method_8505() {
      return this.field_9642;
   }

   public EntityRenderDispatcher method_8587() {
      return this.field_9586;
   }

   public class_8765 method_8511() {
      return this.field_9667;
   }

   public class_9164 method_8574() {
      return this.field_9604;
   }

   public <T> class_1272<T> method_8532(class_8358<T> var1) {
      return this.field_9615.<T>method_3536(var1);
   }

   public class_9703 method_8592() {
      return this.field_9629;
   }

   public boolean method_8534() {
      return this.field_9654;
   }

   public void method_8509(boolean var1) {
      this.field_9654 = var1;
   }

   public DataFixer method_8496() {
      return this.dataFixer;
   }

   public float method_8554() {
      return this.field_9616.field_32600;
   }

   public float method_8491() {
      return this.field_9616.field_32599;
   }

   public class_4468 method_8569() {
      return this.field_9624;
   }

   public boolean method_8503() {
      return this.field_9632 != null && this.field_9632.method_3179() || this.gameOptions.field_45500;
   }

   public class_9184 method_8519() {
      return this.field_9627;
   }

   public class_8827 method_8531() {
      return this.field_9578;
   }

   public boolean method_8558() {
      return this.field_9630;
   }

   public class_3459 method_8598() {
      return this.field_9593;
   }

   public class_7458 method_8535() {
      return this.field_9639;
   }

   public class_4642 method_8581() {
      return this.field_9665;
   }

   public class_3944 method_8551() {
      return this.field_9618;
   }

   @Override
   public void method_32778(boolean var1) {
      this.field_9630 = var1;
   }

   public class_3492 method_8562() {
      return this.field_9592;
   }

   public class_4128 method_8583() {
      return this.field_9645;
   }

   public class_9545 method_8601() {
      return this.field_9649;
   }

   @Nullable
   public class_7621 method_8529() {
      return this.field_9610;
   }

   public class_9186 method_8586() {
      return this.field_9613;
   }

   public boolean method_8567() {
      return false;
   }

   public Window method_8552() {
      return this.window;
   }

   public class_3017 method_8589() {
      return this.field_9576;
   }

   private static class_5522 method_8560(
      String var0, boolean var1, Supplier<class_8169> var2, class_8169 var3, class_975 var4, class_1154 var5, class_2541 var6
   ) {
      int var7 = var4.method_4267();
      Supplier var8 = var2;
      if (var7 <= 3) {
         var8 = method_8588(var2);
      }

      if (var7 <= 4) {
         var8 = method_8596(var8);
      }

      return new class_5522(var0, var1, var8, var3, var4, var5, var6);
   }

   private static Supplier<class_8169> method_8588(Supplier<class_8169> var0) {
      return () -> new class_2127((class_8169)var0.get(), class_2127.field_10649);
   }

   private static Supplier<class_8169> method_8596(Supplier<class_8169> var0) {
      return () -> new class_3300((class_8169)var0.get());
   }

   public void method_8571(int var1) {
      this.field_9639.method_33949(var1);
   }

   public static int method_8501() {
      return field_9626;
   }
}
