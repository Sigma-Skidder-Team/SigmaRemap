// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

import com.mentalfrostbyte.Client;
import com.mojang.authlib.AuthenticationService;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;

import java.util.function.Supplier;
import com.google.common.collect.Multimap;
import java.util.regex.Matcher;
import java.util.Base64;
import java.util.regex.Pattern;
import com.mojang.authlib.GameProfile;
import java.util.Random;
import java.nio.ByteOrder;
import javax.annotation.Nullable;
import java.net.SocketAddress;
import com.mojang.authlib.GameProfileRepository;
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.List;
import java.io.IOException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.util.UUID;
import com.google.common.collect.Queues;
import java.util.Queue;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.net.Proxy;
import java.util.concurrent.atomic.AtomicReference;
import com.mojang.datafixers.DataFixer;
import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.Logger;

public class Minecraft extends Class871<Runnable> implements Class868, Class870
{
    private static Minecraft field4621;
    private static final Logger field4622;
    public static final boolean field4623;
    public static final ResourceLocation field4624;
    public static final ResourceLocation field4625;
    private static final CompletableFuture<Class315> field4626;
    private final File field4627;
    private final PropertyMap field4628;
    private final Class1663 field4629;
    private final DataFixer field4630;
    private final Class390 field4631;
    public final Class1925 window;
    public final Class6742 timer;
    private final Class9037 field4634;
    private final Class3442 field4635;
    public final Class1656 worldRenderer;
    private final Class8551 field4637;
    private final ItemRenderer field4638;
    private final Class9458 field4639;
    public final Class1793 field4640;
    private final Class1659 field4641;
    public Class9212 field4642;
    public final FontRenderer fontRenderer;
    public final Class1660 field4644;
    public final Class7282 field4645;
    private final AtomicReference<Class6461> field4646;
    public final Class685 field4647;
    public final Class5760 gameSettings;
    private final Class8653 field4649;
    public final Class8161 field4650;
    public final Class7335 field4651;
    public final File field4652;
    private final String field4653;
    private final String field4654;
    private final Proxy field4655;
    private final Class7952 field4656;
    public final Class9462 field4657;
    private final boolean field4658;
    private final boolean field4659;
    private final Class5029 field4660;
    private final Class6580 field4661;
    private final Class7937 field4662;
    public final Class1920<Class1922> field4663;
    private final Class1661 field4664;
    private final Class7860 field4665;
    private final Class6457 field4666;
    public final Class6153 field4667;
    private final Class1784 field4668;
    private final Class8086 field4669;
    private final Class1903 field4670;
    private final Class1791 field4671;
    private final MinecraftSessionService field4672;
    private final Class7665 field4673;
    private final Class1790 field4674;
    private final Class1658 field4675;
    private final Class1786 field4676;
    private final Class1787 field4677;
    private final Class690 field4678;
    private final Class7899 field4679;
    private final Class9106 field4680;
    public static byte[] memoryReserve;
    public PlayerController playerController;
    public ClientWorld world;
    public ClientPlayerEntity player;
    private IntegratedServer integratedServer;
    private ServerData currentServerData;
    private NetworkManager field4687;
    private boolean field4688;
    public Entity field4689;
    public Entity field4690;
    public RayTraceResult field4691;
    public int field4692;
    public int field4693;
    private boolean field4694;
    private float field4695;
    private long field4696;
    private long field4697;
    private int field4698;
    public boolean field4699;
    public Screen currentScreen;
    public Class566 field4701;
    private boolean field4702;
    private Thread field4703;
    private volatile boolean field4704;
    private CrashReport field4705;
    private static int field4706;
    public String field4707;
    public boolean field4708;
    public boolean field4709;
    public boolean field4710;
    private boolean field4711;
    private final Queue<Runnable> field4712;
    private CompletableFuture<Void> field4713;
    private String field4714;
    public boolean field4715;
    
    public Minecraft(final Class9408 class9408) {
        super("Client");
        this.timer = new Class6742(20.0f, 0L);
        this.field4634 = new Class9037("client", this, Util.method27837());
        this.field4641 = new Class1659();
        this.field4646 = new AtomicReference<Class6461>();
        this.field4657 = new Class9462();
        this.field4660 = new Class5029(() -> this.timer.field26527);
        this.field4679 = new Class7899(this);
        this.field4696 = Util.method27838();
        this.field4704 = true;
        this.field4707 = "";
        this.field4710 = true;
        this.field4712 = Queues.newConcurrentLinkedQueue();
        this.field4714 = "root";
        this.field4715 = true;
        Minecraft.field4621 = this;
        this.field4652 = class9408.field40379.field37230;
        final File field37232 = class9408.field40379.field37232;
        this.field4627 = class9408.field40379.field37231;
        this.field4653 = class9408.field40380.field23928;
        this.field4654 = class9408.field40380.field23929;
        this.field4628 = class9408.field40377.field34929;
        this.field4662 = new Class7937(new File(this.field4652, "server-resource-packs"), class9408.field40379.method31008());
        (this.field4663 = new Class1920<Class1922>(Minecraft::method5334)).method7613(this.field4662);
        this.field4663.method7613(new Class7940(this.field4627));
        this.field4655 = class9408.field40377.field34930;
        this.field4672 = new YggdrasilAuthenticationService(this.field4655, UUID.randomUUID().toString()).createMinecraftSessionService();
        this.field4642 = class9408.field40377.field34927;
        Minecraft.field4622.info("Setting user: {}", (Object)this.field4642.method33692());
        Minecraft.field4622.debug("(Session ID is {})", (Object)this.field4642.method33690());
        this.method5279();
        this.field4659 = class9408.field40380.field23927;
        this.field4658 = method5233();
        this.integratedServer = null;
        String field37233;
        int field37234;
        if (class9408.field40381.field32507 != null) {
            field37233 = class9408.field40381.field32507;
            field37234 = class9408.field40381.field32508;
        }
        else {
            field37233 = null;
            field37234 = 0;
        }
        if (System.getProperty("java.version").contains("74")) {
            this.method5253();
        }
        Class9280.method34254();
        Class9280.method34257();
        Class2261.field13818 = Class350::method1063;
        this.field4630 = Class5494.method16768();
        this.field4678 = new Class690(this);
        this.field4680 = new Class9106(this);
        this.field4703 = Thread.currentThread();
        this.gameSettings = new Class5760(this, this.field4652);
        this.field4649 = new Class8653(this.field4652, this.field4630);
        this.method5237();
        Minecraft.field4622.info("Backend library: {}", (Object) RenderSystem.method30077());
        Class9154 field37235;
        if (this.gameSettings.field23399 > 0 && this.gameSettings.field23398 > 0) {
            field37235 = new Class9154(this.gameSettings.field23398, this.gameSettings.field23399, class9408.field40378.field38789, class9408.field40378.field38790, class9408.field40378.field38791);
        }
        else {
            field37235 = class9408.field40378;
        }
        Util.field34268 = RenderSystem.method30079();
        this.field4631 = new Class390(this);
        this.window = this.field4631.method1413(field37235, this.gameSettings.field23392, this.method5228());
        this.method5326(true);
        try {
            this.window.method7665(this.method5293().method25740().method6097(Class346.field2137, new ResourceLocation("icons/icon_16x16.png")), this.method5293().method25740().method6097(Class346.field2137, new ResourceLocation("icons/icon_32x32.png")));
        }
        catch (final IOException ex) {
            Minecraft.field4622.error("Couldn't set icon", (Throwable)ex);
        }
        this.window.method7678(this.gameSettings.field23383);
        (this.field4650 = new Class8161(this)).method26954(this.window.getHandle());
        (this.field4651 = new Class7335(this)).method22506(this.window.getHandle());
        RenderSystem.method30080(this.gameSettings.field23413, false);
        (this.field4667 = new Class6153(this.window.method7692(), this.window.method7693(), true, Minecraft.field4623)).method18398(0.0f, 0.0f, 0.0f, 0.0f);
        this.field4661 = new Class6581(Class346.field2137, this.field4703);
        this.gameSettings.method17146(this.field4663);
        this.field4663.method7606();
        this.field4664 = new Class1661(this.gameSettings.field23476);
        this.field4661.method19930(this.field4664);
        this.field4629 = new Class1663(this.field4661);
        this.field4661.method19930(this.field4629);
        this.field4673 = new Class7665(this.field4629, new File(field37232, "skins"), this.field4672);
        this.field4656 = new Class7952(this.field4652.toPath().resolve("saves"), this.field4652.toPath().resolve("backups"), this.field4630);
        this.field4668 = new Class1784(this.field4661, this.gameSettings);
        this.field4661.method19930(this.field4668);
        this.field4671 = new Class1791(this.field4642);
        this.field4661.method19930(this.field4671);
        this.field4669 = new Class8086(this);
        this.field4670 = new Class1903(this.field4629, this.method5240());
        this.field4661.method19930(this.field4670.method7378());
        final FontRenderer method7376 = this.field4670.method7376(Minecraft.field4624);
        if (method7376 == null) {
            throw new IllegalStateException("Default font is null");
        }
        (this.fontRenderer = method7376).method6625(this.field4664.method5843());
        this.field4661.method19930(new Class1788());
        this.field4661.method19930(new Class1777());
        this.window.method7667("Startup");
        RenderSystem.method30086(0, 0, this.window.method7692(), this.window.method7693());
        this.window.method7667("Post startup");
        this.field4665 = Class7860.method25439();
        this.field4666 = Class6457.method19306(this.field4665);
        this.field4674 = new Class1790(this.field4629, this.field4665, this.gameSettings.field23405);
        this.field4661.method19930(this.field4674);
        this.field4638 = new ItemRenderer(this.field4629, this.field4674, this.field4666);
        this.field4637 = new Class8551(this.field4629, this.field4638, this.field4661, this.fontRenderer, this.gameSettings);
        this.field4639 = new Class9458(this);
        this.field4661.method19930(this.field4638);
        this.field4635 = new Class3442();
        this.field4644 = new Class1660(this, this.field4661, this.field4635);
        this.field4661.method19930(this.field4644);
        this.field4675 = new Class1658(this.field4674.method6453(), this.field4665);
        this.field4661.method19930(this.field4675);
        this.worldRenderer = new Class1656(this, this.field4635);
        this.field4661.method19930(this.worldRenderer);
        this.method5231();
        this.field4661.method19930(this.field4641);
        this.field4640 = new Class1793(this.world, this.field4629);
        this.field4661.method19930(this.field4640);
        this.field4676 = new Class1786(this.field4629);
        this.field4661.method19930(this.field4676);
        this.field4677 = new Class1787(this.field4629);
        this.field4661.method19930(this.field4677);
        Client.getInstance().method35175();
        this.field4647 = new Class685(this);
        this.field4645 = new Class7282(this);
        RenderSystem.method30081(this::method5232);
        if (this.gameSettings.field23430 && !this.window.method7691()) {
            this.window.method7685();
            this.gameSettings.field23430 = this.window.method7691();
        }
        this.window.method7672(this.gameSettings.field23419);
        this.window.method7702(this.gameSettings.field23412);
        this.window.method7671();
        this.method5248();
        if (field37233 != null) {
            this.displayGuiScreen(new Class694(new MainMenu(), this, field37233, field37234));
        }
        else {
            this.displayGuiScreen(new MainMenu(true));
        }
        Class567.method3306(this);
        this.method5245(new Class568(this, this.field4661.method19929(Util.method27841(), this, Minecraft.field4626, (List<Class1727>)this.field4663.method7611().stream().map((Function<? super Class1922, ?>)Class1921::method7620).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())), optional -> Util.method27855(optional, this::method5230, () -> {
            this.field4664.method5842(list);
            if (Class9528.field41021) {
                this.method5242();
            }
        }), false));
    }
    
    public void method5227() {
        this.window.method7689(this.method5228());
    }
    
    private String method5228() {
        final StringBuilder sb = new StringBuilder((Client.getInstance().getClientMode() == ClientMode.JELLO) ? "Jello for Sigma 5.0" : "Sigma 5.0");
        final Class5799 method5269 = this.method5269();
        if (method5269 != null && method5269.getNetworkManager().method11187()) {
            sb.append(" - ");
            if (this.integratedServer != null && !this.integratedServer.method1539()) {
                sb.append(Class8822.method30773("title.singleplayer", new Object[0]));
            }
            else if (this.method5311()) {
                sb.append(Class8822.method30773("title.multiplayer.realms", new Object[0]));
            }
            else if (this.integratedServer == null && (this.currentServerData == null || !this.currentServerData.method35871())) {
                sb.append(Class8822.method30773("title.multiplayer.other", new Object[0]));
            }
            else {
                sb.append(Class8822.method30773("title.multiplayer.lan", new Object[0]));
            }
        }
        return sb.toString();
    }
    
    public boolean method5229() {
        return false;
    }
    
    private void method5230(final Throwable t) {
        if (this.field4663.method7611().size() > 1) {
            if (t instanceof Class2370) {
                final StringTextComponent class2260 = new StringTextComponent(((Class2370)t).method9501().method6102());
            }
            Minecraft.field4622.info("Caught error loading resourcepacks, removing all selected resourcepacks", t);
            this.field4663.method7608((Collection<Class1922>)Collections.emptyList());
            this.gameSettings.field23387.clear();
            this.gameSettings.field23388.clear();
            this.gameSettings.method17121();
            this.method5241().thenRun(() -> Class6865.method20981(this.method5318(), Class2174.field12899, new Class2259("resourcePack.load_fail", new Object[0]), class2261));
        }
        else {
            Util.method27844(t);
        }
    }
    
    public void run() {
        this.field4703 = Thread.currentThread();
        try {
            int n = 0;
            while (this.field4704) {
                if (this.field4705 != null) {
                    method5239(this.field4705);
                    return;
                }
                try {
                    this.method5247(n == 0);
                    Client.getInstance().method35180();
                }
                catch (final OutOfMemoryError outOfMemoryError) {
                    if (n != 0) {
                        throw outOfMemoryError;
                    }
                    this.method5250();
                    this.displayGuiScreen(new Class734());
                    System.gc();
                    Minecraft.field4622.fatal("Out of memory", (Throwable)outOfMemoryError);
                    n = 1;
                }
            }
        }
        catch (final ReportedException class2365) {
            this.method5275(class2365.method9500());
            this.method5250();
            Minecraft.field4622.fatal("Reported exception thrown!", (Throwable)class2365);
            method5239(class2365.method9500());
        }
        catch (final Throwable t) {
            final CrashReport method5275 = this.method5275(new CrashReport("Unexpected error", t));
            Minecraft.field4622.fatal("Unreported exception thrown!", t);
            this.method5250();
            method5239(method5275);
        }
    }
    
    private void method5231() {
        final Class8922 class8922 = new Class8922(class8925 -> class8925.method27668(null, TooltipFlags.NORMAL).stream().map(class8926 -> TextFormatting.getTextWithoutFormattingCodes(class8926.getString()).trim()).filter(s -> !s.isEmpty()), class8927 -> Stream.of(Registry.field211.getKey(class8927.method27622())));
        final Class8923 class8923 = new Class8923(class8928 -> Class7855.method25402().method18463(class8928.method27622()).stream());
        final NonNullList<Object> method8506 = NonNullList.create();
        final Iterator<Object> iterator = Registry.field211.iterator();
        while (iterator.hasNext()) {
            iterator.next().method11735(Class7207.field27998, (NonNullList<ItemStack>)method8506);
        }
        method8506.forEach(class8931 -> {
            class8929.method31458(class8931);
            class8930.method31458(class8931);
            return;
        });
        final Class8922<Class9586> class8924 = new Class8922<Class9586>(class8932 -> class8932.method35945().stream().flatMap(class8933 -> class8933.getRecipeOutput().method27668(null, TooltipFlags.NORMAL).stream()).map(class8934 -> TextFormatting.getTextWithoutFormattingCodes(class8934.getString()).trim()).filter(s2 -> !s2.isEmpty()), class8935 -> class8935.method35945().stream().map(class8936 -> Registry.field211.getKey(class8936.getRecipeOutput().getItem())));
        this.field4641.method5798(Class1659.field9375, class8922);
        this.field4641.method5798(Class1659.field9376, class8923);
        this.field4641.method5798(Class1659.field9377, class8924);
    }
    
    private void method5232(final int n, final long n2) {
        this.gameSettings.field23419 = false;
        this.gameSettings.method17121();
    }
    
    private static boolean method5233() {
        final String[] array = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
        for (int length = array.length, i = 0; i < length; ++i) {
            final String property = System.getProperty(array[i]);
            if (property != null && property.contains("64")) {
                return true;
            }
        }
        return false;
    }
    
    public Class6153 method5234() {
        return this.field4667;
    }
    
    public String method5235() {
        return this.field4653;
    }
    
    public String method5236() {
        return this.field4654;
    }
    
    private void method5237() {
        final Class905 class905 = new Class905(this, "Timer hack thread");
        class905.setDaemon(true);
        class905.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Minecraft.field4622));
        class905.start();
    }
    
    public void method5238(final CrashReport field4705) {
        this.field4705 = field4705;
    }
    
    public static void method5239(final CrashReport class7689) {
        final File file = new File(new File(getInstance().field4652, "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
        Class9280.method34259(class7689.method24414());
        if (class7689.method24415() != null) {
            Class9280.method34259("#@!@# Game crashed! Crash report saved to: #@!@# " + class7689.method24415());
            System.exit(-1);
        }
        else if (class7689.method24416(file)) {
            Class9280.method34259("#@!@# Game crashed! Crash report saved to: #@!@# " + file.getAbsolutePath());
            System.exit(-1);
        }
        else {
            Class9280.method34259("#@?@# Game crashed! Crash report could not be saved. #@?@#");
            System.exit(-2);
        }
    }
    
    public boolean method5240() {
        return this.gameSettings.field23421;
    }
    
    public CompletableFuture<Void> method5241() {
        if (this.field4713 != null) {
            return this.field4713;
        }
        final CompletableFuture field4713 = new CompletableFuture();
        if (this.field4701 instanceof Class567) {
            return this.field4713 = field4713;
        }
        this.field4663.method7606();
        this.method5245(new Class568(this, this.field4661.method19929(Util.method27841(), this, Minecraft.field4626, (List<Class1727>)this.field4663.method7611().stream().map((Function<? super Class1922, ?>)Class1921::method7620).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())), optional -> Util.method27855(optional, this::method5230, () -> {
            this.field4664.method5842(list);
            this.worldRenderer.loadRenderers();
            completableFuture.complete(null);
        }), true));
        return field4713;
    }
    
    private void method5242() {
        boolean b = false;
        final Class9509 method5787 = this.method5305().method5787();
        final Class6313 method5788 = method5787.method35429().method6452();
        final Iterator<Object> iterator = Registry.BLOCK.iterator();
        while (iterator.hasNext()) {
            for (final BlockState class7096 : iterator.next().method11876().method32902()) {
                if (class7096.method21710() == Class2115.field12307 && method5787.method35428(class7096) == method5788) {
                    Minecraft.field4622.debug("Missing model for: {}", (Object)class7096);
                    b = true;
                }
            }
        }
        final TextureAtlasSprite method5789 = method5788.method18696();
        final Iterator<Object> iterator3 = Registry.BLOCK.iterator();
        while (iterator3.hasNext()) {
            for (final BlockState class7097 : iterator3.next().method11876().method32902()) {
                final TextureAtlasSprite method5790 = method5787.method35427(class7097);
                if (!class7097.method21706() && method5790 == method5789) {
                    Minecraft.field4622.debug("Missing particle icon for: {}", (Object)class7097);
                    b = true;
                }
            }
        }
        final NonNullList<Object> method5791 = NonNullList.create();
        for (final Item class7098 : Registry.field211) {
            method5791.clear();
            class7098.method11735(Class7207.field27998, (NonNullList<ItemStack>)method5791);
            for (final ItemStack class7099 : method5791) {
                final String method5792 = class7099.method27649();
                if (new Class2259(method5792, new Object[0]).getString().toLowerCase(Locale.ROOT).equals(class7098.getTranslationKey())) {
                    Minecraft.field4622.debug("Missing translation for: {} {} {}", (Object)class7099, (Object)method5792, (Object)class7099.getItem());
                }
            }
        }
        if (b | Class4970.method15157()) {
            throw new IllegalStateException("Your game data is foobar, fix the errors above!");
        }
    }
    
    public Class7952 method5243() {
        return this.field4656;
    }
    
    public void displayGuiScreen(Screen field4700) {
        if (this.currentScreen != null) {
            this.currentScreen.removed();
        }
        if (field4700 == null && this.world == null) {
            field4700 = new MainMenu();
        }
        else if (field4700 == null && this.player.method2664() <= 0.0f) {
            if (this.player.method4128()) {
                field4700 = new Class533(null, this.world.method6764().method29568());
            }
            else {
                this.player.method2842();
            }
        }
        if (field4700 instanceof MainMenu || field4700 instanceof Class720) {
            this.gameSettings.field23466 = false;
            this.field4647.method3807().method3760(true);
        }
        this.currentScreen = field4700;
        Client.getInstance().getScreenManager().method32155();
        if (field4700 != null) {
            this.field4650.method26964();
            Class350.method1054();
            field4700.init(this, this.window.method7696(), this.window.method7697());
            this.field4699 = false;
            NarratorChatListener.field32404.method25556(field4700.getNarrationMessage());
        }
        else {
            this.field4668.method6429();
            this.field4650.method26963();
        }
        this.method5227();
    }
    
    public void method5245(final Class566 field4701) {
        this.field4701 = field4701;
    }
    
    public void method5246() {
        try {
            Minecraft.field4622.info("Stopping!");
            try {
                NarratorChatListener.field32404.method25562();
            }
            catch (final Throwable t) {}
            try {
                if (this.world != null) {
                    this.world.method6751();
                }
                this.method5264();
            }
            catch (final Throwable t2) {}
            if (this.currentScreen != null) {
                this.currentScreen.removed();
            }
            this.close();
        }
        finally {
            Util.field34268 = System::nanoTime;
            if (this.field4705 == null) {
                System.exit(0);
            }
        }
    }
    
    @Override
    public void close() {
        try {
            this.field4674.close();
            this.field4670.close();
            this.field4644.close();
            this.worldRenderer.close();
            this.field4668.method6427();
            this.field4663.close();
            this.field4640.method6474();
            this.field4677.close();
            this.field4676.close();
            this.field4629.close();
            Util.method27842();
        }
        catch (final Throwable t) {
            Minecraft.field4622.error("Shutdown failure!", t);
            throw t;
        }
        finally {
            this.field4631.close();
            this.window.close();
        }
    }
    
    private void method5247(final boolean b) {
        this.window.method7667("Pre render");
        final long method27838 = Util.method27838();
        this.field4660.method15295();
        if (this.window.method7663()) {
            this.method5253();
        }
        if (this.field4713 != null && !(this.field4701 instanceof Class567)) {
            final CompletableFuture<Void> field4713 = this.field4713;
            this.field4713 = null;
            this.method5241().thenRun(() -> completableFuture.complete(null));
        }
        Runnable runnable;
        while ((runnable = this.field4712.poll()) != null) {
            runnable.run();
        }
        if (b) {
            this.timer.method20527(Util.method27837());
            this.field4660.startSection("scheduledExecutables");
            this.method5383();
            this.field4660.endSection();
        }
        this.field4660.startSection("tick");
        if (b) {
            for (int i = 0; i < Math.min(10, this.timer.field26527); ++i) {
                this.method5260();
            }
        }
        this.field4650.method26956();
        this.window.method7667("Render");
        this.field4660.method15300("sound");
        this.field4668.method6424(this.field4644.method5833());
        this.field4660.endSection();
        this.field4660.startSection("render");
        RenderSystem.pushMatrix();
        RenderSystem.method30056(16640, Minecraft.field4623);
        this.field4667.method18395(true);
        Class9111.method32953();
        this.field4660.startSection("display");
        RenderSystem.enableTexture();
        this.field4660.endSection();
        if (!this.field4699) {
            this.field4660.method15300("gameRenderer");
            this.field4644.method5817(this.field4694 ? this.field4695 : this.timer.field26528, method27838, b);
            this.field4660.method15300("toasts");
            this.field4678.method3849();
            this.field4660.endSection();
        }
        this.field4660.method15296();
        if (this.gameSettings.field23466 && this.gameSettings.field23467 && !this.gameSettings.field23464) {
            this.field4660.method15305().method19596();
            this.method5252();
        }
        else {
            this.field4660.method15305().method19594();
        }
        this.field4667.method18397();
        RenderSystem.popMatrix();
        RenderSystem.pushMatrix();
        this.field4667.method18399(this.window.method7692(), this.window.method7693());
        RenderSystem.popMatrix();
        this.field4660.method15295();
        this.field4660.startSection("updateDisplay");
        this.window.method7680();
        final int method27839 = this.method5249();
        if (method27839 < Class6469.field25712.method19473()) {
            RenderSystem.method29994(method27839);
        }
        this.field4660.method15300("yield");
        Thread.yield();
        this.field4660.endSection();
        this.window.method7667("Post render");
        ++this.field4698;
        final boolean field4714 = this.method5284() && ((this.currentScreen != null && this.currentScreen.method2991()) || (this.field4701 != null && this.field4701.method3305())) && !this.integratedServer.method1539();
        if (this.field4694 != field4714) {
            if (this.field4694) {
                this.field4695 = this.timer.field26528;
            }
            else {
                this.timer.field26528 = this.field4695;
            }
            this.field4694 = field4714;
        }
        final long method27840 = Util.method27838();
        this.field4657.method35167(method27840 - this.field4696);
        this.field4696 = method27840;
        while (Util.method27837() >= this.field4697 + 1000L) {
            Minecraft.field4706 = this.field4698;
            this.field4707 = String.format("%d fps T: %s%s%s%s B: %d", Minecraft.field4706, (this.gameSettings.field23383 == Class6469.field25712.method19473()) ? "inf" : Integer.valueOf(this.gameSettings.field23383), this.gameSettings.field23419 ? " vsync" : "", this.gameSettings.field23385 ? "" : " fast", (this.gameSettings.field23384 == Class2202.field13405) ? "" : ((this.gameSettings.field23384 == Class2202.field13406) ? " fast-clouds" : " fancy-clouds"), this.gameSettings.field23410);
            this.field4697 += 1000L;
            this.field4698 = 0;
            this.field4634.method32485();
            if (!this.field4634.method32488()) {
                this.field4634.method32484();
            }
        }
        this.field4660.method15296();
    }
    
    @Override
    public void method5248() {
        this.window.method7688(this.window.method7687(this.gameSettings.field23473, this.method5240()));
        if (this.currentScreen != null) {
            this.currentScreen.method2970(this, this.window.method7696(), this.window.method7697());
            Client.getInstance().getScreenManager().method32153();
        }
        this.method5234().method18387(this.window.method7692(), this.window.method7693(), Minecraft.field4623);
        this.field4644.method5806(this.window.method7692(), this.window.method7693());
        this.field4650.method26961();
    }
    
    private int method5249() {
        return (this.world != null || (this.currentScreen == null && this.field4701 == null)) ? this.window.method7679() : ((Client.getInstance().getClientMode() == ClientMode.JELLO) ? 120 : 60);
    }
    
    public void method5250() {
        try {
            Minecraft.memoryReserve = new byte[0];
            this.worldRenderer.method5750();
        }
        catch (final Throwable t) {}
        try {
            System.gc();
            if (this.field4688 && this.integratedServer != null) {
                this.integratedServer.method1456(true);
            }
            this.method5265(new Class729(new Class2259("menu.savingLevel", new Object[0])));
        }
        catch (final Throwable t2) {}
        System.gc();
    }
    
    public void method5251(int n) {
        final List<Class1943> method17084 = this.field4660.method15305().method19595().method17084(this.field4714);
        if (!method17084.isEmpty()) {
            final Class1943 class1943 = method17084.remove(0);
            if (n == 0) {
                if (!class1943.field10595.isEmpty()) {
                    final int lastIndex = this.field4714.lastIndexOf(30);
                    if (lastIndex >= 0) {
                        this.field4714 = this.field4714.substring(0, lastIndex);
                    }
                }
            }
            else if (--n < method17084.size() && !"unspecified".equals(((Class1943)method17084.get(n)).field10595)) {
                if (!this.field4714.isEmpty()) {
                    this.field4714 += '\u001e';
                }
                this.field4714 += ((Class1943)method17084.get(n)).field10595;
            }
        }
    }
    
    private void method5252() {
        if (this.field4660.method15305().method19593()) {
            final List<Class1943> method17084 = this.field4660.method15305().method19595().method17084(this.field4714);
            final Class1943 class1943 = method17084.remove(0);
            RenderSystem.method30056(256, Minecraft.field4623);
            RenderSystem.method30057(5889);
            RenderSystem.method30058();
            RenderSystem.method30061(0.0, this.window.method7692(), this.window.method7693(), 0.0, 1000.0, 3000.0);
            RenderSystem.method30057(5888);
            RenderSystem.method30058();
            RenderSystem.translatef(0.0f, 0.0f, -2000.0f);
            RenderSystem.method30072(1.0f);
            RenderSystem.disableTexture();
            final Tessellator method17085 = Tessellator.getInstance();
            final BufferBuilder method17086 = method17085.getBuffer();
            final int n = this.window.method7692() - 160 - 10;
            final int n2 = this.window.method7693() - 320;
            RenderSystem.enableBlend();
            method17086.begin(7, DefaultVertexFormats.POSITION_COLOR);
            method17086.pos(n - 176.0f, n2 - 96.0f - 16.0f, 0.0).method12399(200, 0, 0, 0).endVertex();
            method17086.pos(n - 176.0f, n2 + 320, 0.0).method12399(200, 0, 0, 0).endVertex();
            method17086.pos(n + 176.0f, n2 + 320, 0.0).method12399(200, 0, 0, 0).endVertex();
            method17086.pos(n + 176.0f, n2 - 96.0f - 16.0f, 0.0).method12399(200, 0, 0, 0).endVertex();
            method17085.draw();
            RenderSystem.disableBlend();
            double n3 = 0.0;
            for (final Class1943 class1944 : method17084) {
                final int n4 = MathHelper.floor(class1944.field10592 / 4.0) + 1;
                method17086.begin(6, DefaultVertexFormats.POSITION_COLOR);
                final int method17087 = class1944.method7893();
                final int n5 = method17087 >> 16 & 0xFF;
                final int n6 = method17087 >> 8 & 0xFF;
                final int n7 = method17087 & 0xFF;
                method17086.pos(n, n2, 0.0).method12399(n5, n6, n7, 255).endVertex();
                for (int i = n4; i >= 0; --i) {
                    final float n8 = (float)((n3 + class1944.field10592 * i / n4) * 6.2831854820251465 / 100.0);
                    method17086.pos(n + MathHelper.sin(n8) * 160.0f, n2 - MathHelper.cos(n8) * 160.0f * 0.5f, 0.0).method12399(n5, n6, n7, 255).endVertex();
                }
                method17085.draw();
                method17086.begin(5, DefaultVertexFormats.POSITION_COLOR);
                for (int j = n4; j >= 0; --j) {
                    final float n9 = (float)((n3 + class1944.field10592 * j / n4) * 6.2831854820251465 / 100.0);
                    final float n10 = MathHelper.sin(n9) * 160.0f;
                    final float n11 = MathHelper.cos(n9) * 160.0f * 0.5f;
                    if (n11 <= 0.0f) {
                        method17086.pos(n + n10, n2 - n11, 0.0).method12399(n5 >> 1, n6 >> 1, n7 >> 1, 255).endVertex();
                        method17086.pos(n + n10, n2 - n11 + 10.0f, 0.0).method12399(n5 >> 1, n6 >> 1, n7 >> 1, 255).endVertex();
                    }
                }
                method17085.draw();
                n3 += class1944.field10592;
            }
            final DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
            RenderSystem.enableTexture();
            final String method17088 = Class5756.method17107(class1943.field10595);
            String string = "";
            if (!"unspecified".equals(method17088)) {
                string += "[0] ";
            }
            String s;
            if (method17088.isEmpty()) {
                s = string + "ROOT ";
            }
            else {
                s = string + method17088 + ' ';
            }
            this.fontRenderer.drawStringWithShadow(s, (float)(n - 160), (float)(n2 - 80 - 16), 16777215);
            final String string2 = decimalFormat.format(class1943.field10593) + "%";
            this.fontRenderer.drawStringWithShadow(string2, (float)(n + 160 - this.fontRenderer.getStringWidth(string2)), (float)(n2 - 80 - 16), 16777215);
            for (int k = 0; k < method17084.size(); ++k) {
                final Class1943 class1945 = method17084.get(k);
                final StringBuilder sb = new StringBuilder();
                if ("unspecified".equals(class1945.field10595)) {
                    sb.append("[?] ");
                }
                else {
                    sb.append("[").append(k + 1).append("] ");
                }
                this.fontRenderer.drawStringWithShadow(sb.append(class1945.field10595).toString(), (float)(n - 160), (float)(n2 + 80 + k * 8 + 20), class1945.method7893());
                final String string3 = decimalFormat.format(class1945.field10592) + "%";
                this.fontRenderer.drawStringWithShadow(string3, (float)(n + 160 - 50 - this.fontRenderer.getStringWidth(string3)), (float)(n2 + 80 + k * 8 + 20), class1945.method7893());
                final String string4 = decimalFormat.format(class1945.field10593) + "%";
                this.fontRenderer.drawStringWithShadow(string4, (float)(n + 160 - this.fontRenderer.getStringWidth(string4)), (float)(n2 + 80 + k * 8 + 20), class1945.method7893());
            }
        }
    }
    
    public void method5253() {
        if (this.field4704) {
            Client.getInstance().shutdown();
        }
        this.field4704 = false;
    }
    
    public boolean method5254() {
        return this.field4704;
    }
    
    public void method5255(final boolean b) {
        if (this.currentScreen == null) {
            if (this.method5284() && !this.integratedServer.method1539()) {
                this.displayGuiScreen(new Class551(!b));
                this.field4668.method6425();
            }
            else {
                this.displayGuiScreen(new Class551(true));
            }
        }
    }
    
    private void method5256(final boolean b) {
        if (!b) {
            this.field4693 = 0;
        }
        if (this.field4693 <= 0 && !this.player.method2756()) {
            if (b && this.field4691 != null && this.field4691.getType() == RayTraceResult.Type.BLOCK) {
                final BlockRayTraceResult blockRayTraceResult = (BlockRayTraceResult)this.field4691;
                final BlockPos method21447 = blockRayTraceResult.getPos();
                if (!this.world.getBlockState(method21447).method21706()) {
                    final Direction method21448 = blockRayTraceResult.getFace();
                    if (this.playerController.method27314(method21447, method21448)) {
                        this.field4640.method6487(method21447, method21448);
                        this.player.method2707(Class316.field1877);
                    }
                }
            }
            else {
                this.playerController.method27313();
            }
        }
    }
    
    private void method5257() {
        final Class5748 class5748 = new Class5748(Class1958.field10671);
        Client.getInstance().getEventBus().post(class5748);
        if (class5748.isCancelled()) {
            return;
        }
        if (this.field4693 <= 0) {
            if (this.field4691 == null) {
                Minecraft.field4622.error("Null returned as 'hitResult', this shouldn't happen!");
                if (this.playerController.method27331()) {
                    this.field4693 = 10;
                }
            }
            else if (!this.player.method4134()) {
                Class5714 class5749 = null;
                if (this.field4691.getType() == RayTraceResult.Type.ENTITY) {
                    class5749 = new Class5750(((EntityRayTraceResult)this.field4691).getEntity(), true);
                    Client.getInstance().getEventBus().post(class5749);
                    if (class5749.isCancelled()) {
                        return;
                    }
                }
                final boolean equals = ViaManager.field40167.equals(Class7906.field32452);
                if (equals) {
                    this.player.method2707(Class316.field1877);
                }
                switch (Class8853.field37235[this.field4691.getType().ordinal()]) {
                    case 1: {
                        this.playerController.method27321(this.player, ((EntityRayTraceResult)this.field4691).getEntity());
                        if (class5749 != null) {
                            ((Class5750)class5749).method17060();
                            Client.getInstance().getEventBus().post(class5749);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final BlockRayTraceResult class5750 = (BlockRayTraceResult)this.field4691;
                        final BlockPos method21447 = class5750.getPos();
                        if (!this.world.getBlockState(method21447).method21706()) {
                            this.playerController.method27312(method21447, class5750.getFace());
                            break;
                        }
                    }
                    case 3: {
                        if (this.playerController.method27331()) {
                            this.field4693 = 10;
                        }
                        this.player.method2905();
                        break;
                    }
                }
                if (!equals) {
                    this.player.method2707(Class316.field1877);
                }
            }
        }
    }
    
    private void method5258() {
        final Class5748 class5748 = new Class5748(Class1958.field10672);
        Client.getInstance().getEventBus().post(class5748);
        if (class5748.isCancelled()) {
            return;
        }
        if (!this.playerController.method27337()) {
            this.field4692 = 4;
            if (!this.player.method4134()) {
                if (this.field4691 == null) {
                    Minecraft.field4622.warn("Null returned as 'hitResult', this shouldn't happen!");
                }
                for (final Class316 class5749 : Class316.values()) {
                    final ItemStack method2715 = this.player.method2715(class5749);
                    if (this.field4691 != null) {
                        switch (Class8853.field37235[this.field4691.getType().ordinal()]) {
                            case 1: {
                                final EntityRayTraceResult class5750 = (EntityRayTraceResult)this.field4691;
                                final Entity method2716 = class5750.getEntity();
                                Class2201 class5751 = this.playerController.method27323(this.player, method2716, class5750, class5749);
                                if (!class5751.method8374()) {
                                    class5751 = this.playerController.method27322(this.player, method2716, class5749);
                                }
                                if (class5751.method8374()) {
                                    if (class5751.method8375()) {
                                        this.player.method2707(class5749);
                                    }
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                final BlockRayTraceResult class5752 = (BlockRayTraceResult)this.field4691;
                                final int method2717 = method2715.method27690();
                                final Class2201 method2718 = this.playerController.method27319(this.player, this.world, class5749, class5752);
                                if (method2718.method8374()) {
                                    if (method2718.method8375()) {
                                        this.player.method2707(class5749);
                                        if (!method2715.method27620() && (method2715.method27690() != method2717 || this.playerController.method27332())) {
                                            this.field4644.field9384.method35156(class5749);
                                        }
                                    }
                                    return;
                                }
                                if (method2718 == Class2201.field13403) {
                                    return;
                                }
                                break;
                            }
                        }
                    }
                    if (!method2715.method27620()) {
                        final Class2201 method2719 = this.playerController.method27320(this.player, this.world, class5749);
                        if (method2719.method8374()) {
                            if (method2719.method8375() && ViaManager.method34762() > Class7906.field32452.method25613()) {
                                this.player.method2707(class5749);
                            }
                            this.field4644.field9384.method35156(class5749);
                            return;
                        }
                    }
                }
            }
        }
    }
    
    public Class8086 method5259() {
        return this.field4669;
    }
    
    public void method5260() {
        if (this.field4692 > 0) {
            --this.field4692;
        }
        this.field4660.startSection("gui");
        if (!this.field4694) {
            this.field4647.method3801();
        }
        this.field4660.endSection();
        this.field4644.method5807(1.0f);
        this.field4680.method32919(this.world, this.field4691);
        this.field4660.startSection("gameMode");
        if (!this.field4694 && this.world != null) {
            this.playerController.method27316();
        }
        this.field4660.method15300("textures");
        if (this.world != null) {
            this.field4629.method5857();
        }
        if (this.currentScreen == null && this.player != null) {
            if (this.player.method2664() <= 0.0f && !(this.currentScreen instanceof Class533)) {
                this.displayGuiScreen(null);
            }
            else if (this.player.method2783() && this.world != null) {
                this.displayGuiScreen(new Class536());
            }
        }
        else if (this.currentScreen != null && this.currentScreen instanceof Class536 && !this.player.method2783()) {
            this.displayGuiScreen(null);
        }
        if (this.currentScreen != null) {
            this.field4693 = 10000;
        }
        if (this.currentScreen != null) {
            Screen.method3053(() -> this.currentScreen.tick(), "Ticking screen", this.currentScreen.getClass().getCanonicalName());
        }
        if (!this.gameSettings.field23466) {
            this.field4647.method3814();
        }
        if (this.field4701 == null && (this.currentScreen == null || this.currentScreen.passEvents)) {
            this.field4660.method15300("Keybindings");
            this.method5261();
            if (this.field4693 > 0) {
                --this.field4693;
            }
        }
        if (this.world != null) {
            this.field4660.method15300("gameRenderer");
            if (!this.field4694) {
                this.field4644.method5804();
            }
            this.field4660.method15300("levelRenderer");
            if (!this.field4694) {
                this.worldRenderer.method5718();
            }
            this.field4660.method15300("level");
            if (!this.field4694) {
                if (this.world.method6848() > 0) {
                    this.world.method6786(this.world.method6848() - 1);
                }
                this.world.method6807();
            }
        }
        else if (this.field4644.method5805() != null) {
            this.field4644.method5800();
        }
        if (!this.field4694) {
            this.field4669.method26545();
        }
        this.field4668.method6428(this.field4694);
        if (this.world != null) {
            if (!this.field4694) {
                this.world.method6734(this.world.method6954() != Class2113.field12290, true);
                this.field4680.method32925();
                try {
                    this.world.method6805(() -> true);
                }
                catch (final Throwable t) {
                    final CrashReport method24421 = CrashReport.makeCrashReport(t, "Exception in world tick");
                    if (this.world == null) {
                        method24421.makeCategory("Affected level").addDetail("Problem", "Level is null!");
                    }
                    else {
                        this.world.method6779(method24421);
                    }
                    throw new ReportedException(method24421);
                }
            }
            this.field4660.method15300("animateTick");
            if (!this.field4694 && this.world != null) {
                this.world.method6825(MathHelper.floor(this.player.getPosX()), MathHelper.floor(this.player.getPosY()), MathHelper.floor(this.player.getPosZ()));
            }
            this.field4660.method15300("particles");
            if (!this.field4694) {
                this.field4640.method6481();
            }
        }
        else if (this.field4687 != null) {
            this.field4660.method15300("pendingConnection");
            this.field4687.method11179();
        }
        this.field4660.method15300("keyboard");
        this.field4651.method22509();
        this.field4660.endSection();
    }
    
    private void method5261() {
        while (this.gameSettings.field23452.method1058()) {
            final Class5760 field4648 = this.gameSettings;
            ++field4648.field23465;
            if (this.gameSettings.field23465 > 2) {
                this.gameSettings.field23465 = 0;
            }
            if (this.gameSettings.field23465 == 0) {
                this.field4644.method5802(this.method5303());
            }
            else if (this.gameSettings.field23465 == 1) {
                this.field4644.method5802(null);
            }
            this.worldRenderer.method5755();
        }
        while (this.gameSettings.field23453.method1058()) {
            this.gameSettings.field23470 = !this.gameSettings.field23470;
        }
        for (int i = 0; i < 9; ++i) {
            final boolean method1056 = this.gameSettings.field23458.method1056();
            final boolean method1057 = this.gameSettings.field23459.method1056();
            if (this.gameSettings.field23457[i].method1058()) {
                if (this.player.isSpectator()) {
                    this.field4647.method3810().method3320(i);
                }
                else if (!this.player.method2889() || this.currentScreen != null || (!method1057 && !method1056)) {
                    this.player.inventory.field2743 = i;
                }
                else {
                    Class525.method3019(this, i, method1057, method1056);
                }
            }
        }
        while (this.gameSettings.field23442.method1058()) {
            if (this.playerController.method27334()) {
                this.player.method4118();
            }
            else {
                this.field4680.method32921();
                this.displayGuiScreen(new Class518(this.player));
            }
        }
        while (this.gameSettings.field23456.method1058()) {
            this.displayGuiScreen(new Class557(this.player.field4069.method17374()));
        }
        while (this.gameSettings.field23443.method1058()) {
            if (!this.player.isSpectator()) {
                this.method5269().method17292(new Class4399(Class2003.field11246, BlockPos.ZERO, Direction.DOWN));
            }
        }
        while (this.gameSettings.field23444.method1058()) {
            if (!this.player.isSpectator() && this.player.method2821(Screen.method3046())) {
                this.player.method2707(Class316.field1877);
            }
        }
        if (this.gameSettings.field23389 != Class2047.field11663) {
            while (this.gameSettings.field23448.method1058()) {
                this.displayGuiScreen(new ChatScreen(""));
            }
            if (this.currentScreen == null && this.field4701 == null && this.gameSettings.field23450.method1058()) {
                this.displayGuiScreen(new ChatScreen("/"));
            }
        }
        if (this.player.method2756()) {
            if (!this.gameSettings.field23445.method1056() && !this.gameSettings.field23445.method1056()) {
                final Class5751 class5751 = new Class5751();
                Client.getInstance().getEventBus().post(class5751);
                if (!class5751.isCancelled()) {
                    this.playerController.method27329(this.player);
                }
            }
            while (this.gameSettings.field23446.method1058()) {}
            while (this.gameSettings.field23445.method1058()) {}
            while (this.gameSettings.field23447.method1058()) {}
        }
        else {
            while (this.gameSettings.field23446.method1058()) {
                this.method5257();
            }
            while (this.gameSettings.field23445.method1058()) {
                this.method5258();
            }
            while (this.gameSettings.field23447.method1058()) {
                this.method5273();
            }
        }
        if (this.gameSettings.field23445.method1056() && this.field4692 == 0 && !this.player.method2756()) {
            this.method5258();
        }
        this.method5256(this.currentScreen == null && this.gameSettings.field23446.method1056() && this.field4650.method26962());
    }
    
    public void method5262(final String s, final String s2, Class8511 class8511) {
        this.method5264();
        final Class8642 method25787 = this.field4656.method25787(s, null);
        WorldInfo method25788 = method25787.method29394();
        if (method25788 == null && class8511 != null) {
            method25788 = new WorldInfo(class8511, s);
            method25787.method29395(method25788);
        }
        if (class8511 == null) {
            class8511 = new Class8511(method25788);
        }
        this.field4646.set(null);
        try {
            final YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(this.field4655, UUID.randomUUID().toString());
            final MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
            final GameProfileRepository profileRepository = yggdrasilAuthenticationService.createProfileRepository();
            final Class8608 class8512 = new Class8608(profileRepository, new File(this.field4652, MinecraftServer.field2293.getName()));
            Class493.method2502(class8512);
            Class493.method2503(minecraftSessionService);
            Class8608.method29191(false);
            (this.integratedServer = new IntegratedServer(this, s, s2, class8511, yggdrasilAuthenticationService, minecraftSessionService, profileRepository, class8512, n -> {
                final Class6461 newValue = new Class6461(n + 0);
                newValue.method19323();
                this.field4646.set(newValue);
                return new Class6458(newValue, this.field4712::add);
            })).method1476();
            this.field4688 = true;
        }
        catch (final Throwable t) {
            final CrashReport method25789 = CrashReport.makeCrashReport(t, "Starting integrated server");
            final CrashReportCategory method25790 = method25789.makeCategory("Starting integrated server");
            method25790.addDetail("Level ID", s);
            method25790.addDetail("Level Name", s2);
            throw new ReportedException(method25789);
        }
        while (this.field4646.get() == null) {
            Thread.yield();
        }
        final Class695 class8513 = new Class695(this.field4646.get());
        this.displayGuiScreen(class8513);
        while (!this.integratedServer.method1542()) {
            class8513.tick();
            this.method5247(false);
            try {
                Thread.sleep(16L);
            }
            catch (final InterruptedException ex) {}
            if (this.field4705 != null) {
                method5239(this.field4705);
                return;
            }
        }
        final SocketAddress method25791 = this.integratedServer.method1541().method24061();
        final NetworkManager method25792 = NetworkManager.method11184(method25791);
        method25792.method11173(new Class5808(method25792, this, null, p0 -> {}));
        method25792.method11174(new Class4398(method25791.toString(), 0, Class2208.field13457));
        method25792.method11174(new Class4327(this.method5287().method33694()));
        this.field4687 = method25792;
    }
    
    public void method5263(final ClientWorld field4683) {
        final Class731 class731 = new Class731();
        class731.method4036(new Class2259("connect.joining", new Object[0]));
        this.method5266(class731);
        this.method5267(this.world = field4683);
        Client.getInstance().getEventBus().post(new Class5732());
        if (!this.field4688) {
            final YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(this.field4655, UUID.randomUUID().toString());
            final MinecraftSessionService minecraftSessionService = ((AuthenticationService)yggdrasilAuthenticationService).createMinecraftSessionService();
            Class493.method2502(new Class8608(((AuthenticationService)yggdrasilAuthenticationService).createProfileRepository(), new File(this.field4652, MinecraftServer.field2293.getName())));
            Class493.method2503(minecraftSessionService);
            Class8608.method29191(false);
        }
    }
    
    public void method5264() {
        this.method5265(new Class731());
    }
    
    public void method5265(final Screen class527) {
        final Class5799 method5269 = this.method5269();
        if (method5269 != null) {
            this.method5382();
            method5269.method17270();
        }
        final IntegratedServer field4685 = this.integratedServer;
        this.integratedServer = null;
        this.field4644.method5821();
        this.playerController = null;
        NarratorChatListener.field32404.method25561();
        this.method5266(class527);
        if (this.world != null) {
            if (field4685 != null) {
                while (!field4685.method1477()) {
                    this.method5247(false);
                }
            }
            this.field4662.method25744();
            this.field4647.method3812();
            this.currentServerData = null;
            this.field4688 = false;
            this.field4679.method25568();
        }
        this.world = null;
        this.method5267(null);
        this.player = null;
    }
    
    private void method5266(final Screen class527) {
        this.field4669.method26547();
        this.field4668.method6426();
        this.field4689 = null;
        this.field4687 = null;
        this.displayGuiScreen(class527);
        this.method5247(false);
    }
    
    private void method5267(final ClientWorld clientWorld) {
        this.worldRenderer.method5700(clientWorld);
        this.field4640.method6485(clientWorld);
        Class9550.field41126.method35730(clientWorld);
        this.method5227();
    }
    
    public final boolean method5268() {
        return this.field4659;
    }
    
    @Nullable
    public Class5799 method5269() {
        return (this.player == null) ? null : this.player.field4069;
    }
    
    public static boolean method5270() {
        return !Minecraft.field4621.gameSettings.field23464;
    }
    
    public static boolean method5271() {
        return Minecraft.field4621.gameSettings.field23385;
    }
    
    public static boolean method5272() {
        return Minecraft.field4621.gameSettings.field23386 != Class2007.field11398;
    }
    
    private void method5273() {
        final Class5748 class5748 = new Class5748(Class1958.field10673);
        Client.getInstance().getEventBus().post(class5748);
        if (class5748.isCancelled()) {
            return;
        }
        if (this.field4691 != null && this.field4691.getType() != RayTraceResult.Type.MISS) {
            final boolean field27304 = this.player.field3025.field27304;
            TileEntity method6727 = null;
            final RayTraceResult.Type method6728 = this.field4691.getType();
            ItemStack class5749;
            if (method6728 == RayTraceResult.Type.BLOCK) {
                final BlockPos method6729 = ((BlockRayTraceResult)this.field4691).getPos();
                final BlockState method6730 = this.world.getBlockState(method6729);
                final Block method6731 = method6730.getBlock();
                if (method6730.method21706()) {
                    return;
                }
                class5749 = method6731.method11862(this.world, method6729, method6730);
                if (class5749.method27620()) {
                    return;
                }
                if (field27304 && Screen.method3046() && method6731.method11802()) {
                    method6727 = this.world.getTileEntity(method6729);
                }
            }
            else {
                if (method6728 != RayTraceResult.Type.ENTITY || !field27304) {
                    return;
                }
                final Entity method6732 = ((EntityRayTraceResult)this.field4691).getEntity();
                if (method6732 instanceof Class861) {
                    class5749 = new ItemStack(Items.field31340);
                }
                else if (method6732 instanceof Class863) {
                    class5749 = new ItemStack(Items.field31551);
                }
                else if (method6732 instanceof Class862) {
                    final ItemStack method6733 = ((Class862)method6732).method5198();
                    if (method6733.method27620()) {
                        class5749 = new ItemStack(Items.field31515);
                    }
                    else {
                        class5749 = method6733.method27641();
                    }
                }
                else if (method6732 instanceof Class428) {
                    Item class5750 = null;
                    switch (Class8853.field37236[((Class428)method6732).method2139().ordinal()]) {
                        case 1: {
                            class5750 = Items.field31373;
                            break;
                        }
                        case 2: {
                            class5750 = Items.field31372;
                            break;
                        }
                        case 3: {
                            class5750 = Items.field31537;
                            break;
                        }
                        case 4: {
                            class5750 = Items.field31538;
                            break;
                        }
                        case 5: {
                            class5750 = Items.field31553;
                            break;
                        }
                        default: {
                            class5750 = Items.field31352;
                            break;
                        }
                    }
                    class5749 = new ItemStack(class5750);
                }
                else if (method6732 instanceof Class423) {
                    class5749 = new ItemStack(((Class423)method6732).method2040());
                }
                else if (method6732 instanceof Class857) {
                    class5749 = new ItemStack(Items.field31546);
                }
                else if (method6732 instanceof Class858) {
                    class5749 = new ItemStack(Items.field31572);
                }
                else {
                    final Class3831 method6734 = Class3831.method11771(method6732.getType());
                    if (method6734 == null) {
                        return;
                    }
                    class5749 = new ItemStack(method6734);
                }
            }
            if (class5749.method27620()) {
                String s = "";
                if (method6728 == RayTraceResult.Type.BLOCK) {
                    s = Registry.BLOCK.getKey(this.world.getBlockState(((BlockRayTraceResult)this.field4691).getPos()).method21696()).toString();
                }
                else if (method6728 == RayTraceResult.Type.ENTITY) {
                    s = Registry.field210.getKey(((EntityRayTraceResult)this.field4691).getEntity().getType()).toString();
                }
                Minecraft.field4622.warn("Picking on: [{}] {} gave null item", (Object)method6728, (Object)s);
            }
            else {
                final Class464 field27305 = this.player.inventory;
                if (method6727 != null) {
                    this.method5274(class5749, method6727);
                }
                final int method6735 = field27305.method2353(class5749);
                if (field27304) {
                    field27305.method2350(class5749);
                    this.playerController.method27327(this.player.method2715(Class316.field1877), 36 + field27305.field2743);
                }
                else if (method6735 != -1) {
                    if (Class464.method2352(method6735)) {
                        field27305.field2743 = method6735;
                    }
                    else {
                        this.playerController.method27338(method6735);
                    }
                }
            }
        }
    }
    
    private ItemStack method5274(final ItemStack class8321, final TileEntity class8322) {
        final CompoundNBT method2180 = class8322.method2180(new CompoundNBT());
        if (class8321.getItem() instanceof Class4046 && method2180.contains("Owner")) {
            class8321.method27658().put("SkullOwner", method2180.getCompound("Owner"));
            return class8321;
        }
        class8321.method27676("BlockEntityTag", method2180);
        final CompoundNBT class8323 = new CompoundNBT();
        final ListNBT class8324 = new ListNBT();
        ((AbstractList<StringNBT>)class8324).add(StringNBT.method290("\"(+NBT)\""));
        class8323.put("Lore", class8324);
        class8321.method27676("display", class8323);
        return class8321;
    }
    
    public CrashReport method5275(final CrashReport class7689) {
        method5276(this.field4664, this.field4653, this.gameSettings, class7689);
        if (this.world != null) {
            this.world.method6779(class7689);
        }
        return class7689;
    }
    
    public static void method5276(final Class1661 class1661, final String s, final Class5760 class1662, final CrashReport class1663) {
        final CrashReportCategory method24417 = class1663.method24417();
        method24417.addDetail("Launched Version", () -> s2);
        method24417.addDetail("Backend library", RenderSystem::method30077);
        method24417.addDetail("Backend API", RenderSystem::method30078);
        method24417.addDetail("GL Caps", RenderSystem::method30085);
        method24417.addDetail("Using VBOs", () -> "Yes");
        method24417.addDetail("Is Modded", () -> {
            Class7932.method25729();
            final String s3;
            if (!"vanilla".equals(s3)) {
                return "Definitely; Client brand changed to '" + s3 + "'";
            }
            else {
                return (Minecraft.class.getSigners() == null) ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.";
            }
        });
        method24417.addDetail("Type", "Client (map_client.txt)");
        if (class1662 != null) {
            method24417.addDetail("Resource Packs", () -> {
                final StringBuilder sb = new StringBuilder();
                class1664.field23387.iterator();
                final Iterator iterator;
                while (iterator.hasNext()) {
                    final String str = iterator.next();
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    if (class1664.field23388.contains(str)) {
                        sb.append(" (incompatible)");
                    }
                }
                return sb.toString();
            });
        }
        if (class1661 != null) {
            method24417.addDetail("Current Language", () -> class1665.method5845().toString());
        }
        method24417.addDetail("CPU", Class7691::method24459);
    }
    
    public static Minecraft getInstance() {
        return Minecraft.field4621;
    }
    
    public CompletableFuture<Void> method5278() {
        return this.method5377(this::method5241).thenCompose(completableFuture -> completableFuture);
    }
    
    @Override
    public void method1516(final Class9037 class9037) {
        class9037.method32486("fps", Minecraft.field4706);
        class9037.method32486("vsync_enabled", this.gameSettings.field23419);
        class9037.method32486("display_frequency", this.window.method7662());
        class9037.method32486("display_type", this.window.method7691() ? "fullscreen" : "windowed");
        class9037.method32486("run_time", (Util.method27837() - class9037.method32491()) / 60L * 1000L);
        class9037.method32486("current_action", this.method5280());
        class9037.method32486("language", (this.gameSettings.field23476 == null) ? "en_us" : this.gameSettings.field23476);
        class9037.method32486("endianness", (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) ? "little" : "big");
        class9037.method32486("subtitles", this.gameSettings.field23427);
        class9037.method32486("touch", this.gameSettings.field23429 ? "touch" : "mouse");
        int i = 0;
        for (final Class1922 class9038 : this.field4663.method7611()) {
            if (!class9038.method7622() && !class9038.method7623()) {
                class9037.method32486("resource_pack[" + i++ + "]", class9038.method7621());
            }
        }
        class9037.method32486("resource_packs", i);
        if (this.integratedServer != null) {
            class9037.method32486("snooper_partner", this.integratedServer.method1547().method32490());
        }
    }
    
    private void method5279() {
        new Thread(() -> {
            while (true) {
                int n = 0;
                long millis = 0L;
                if (n == 0) {
                    millis = 60000 + new Random().nextInt(30000);
                }
                ++n;
                try {
                    Thread.sleep(millis);
                }
                catch (final InterruptedException ex) {
                    ex.printStackTrace();
                }
                final GameProfile gameProfile = new GameProfile(UUID.fromString("53e07708-1fe7-4488-b2d2-8d1a82af37b7"), "steve");
                this.field4672.fillProfileProperties(gameProfile, false);
                if (gameProfile.getProperties().containsKey((Object)"textures")) {
                    gameProfile.getProperties().get((Object)"textures").forEach(property -> {
                        Pattern.compile("http://textures.minecraft.net/texture/([a-f0-9]+)").matcher(new String(Base64.getDecoder().decode(property.getValue())));
                        final Matcher matcher;
                        if (matcher.find() && !matcher.group(1).equals("41b483a411e2f7c09b55e49ce0ab6f5868d223bc6c40d68ade95f71e5dff30aa")) {
                            this.field4715 = (0 != 0);
                        }
                    });
                }
            }
        }).start();
    }
    
    private String method5280() {
        if (this.integratedServer != null) {
            return this.integratedServer.method1539() ? "hosting_lan" : "singleplayer";
        }
        if (this.currentServerData != null) {
            return this.currentServerData.method35871() ? "playing_lan" : "multiplayer";
        }
        return "out_of_game";
    }
    
    public void method5281(final ServerData field4686) {
        this.currentServerData = field4686;
    }
    
    @Nullable
    public ServerData method5282() {
        return this.currentServerData;
    }
    
    public boolean method5283() {
        return this.field4688;
    }
    
    public boolean method5284() {
        return this.field4688 && this.integratedServer != null;
    }
    
    @Nullable
    public IntegratedServer method5285() {
        return this.integratedServer;
    }
    
    public Class9037 method5286() {
        return this.field4634;
    }
    
    public Class9212 method5287() {
        return this.field4642;
    }
    
    public PropertyMap method5288() {
        if (this.field4628.isEmpty()) {
            this.field4628.putAll((Multimap)this.method5301().fillProfileProperties(this.field4642.method33694(), false).getProperties());
        }
        return this.field4628;
    }
    
    public Proxy method5289() {
        return this.field4655;
    }
    
    public Class1663 method5290() {
        return this.field4629;
    }
    
    public Class6582 method5291() {
        return this.field4661;
    }
    
    public Class1920<Class1922> method5292() {
        return this.field4663;
    }
    
    public Class7937 method5293() {
        return this.field4662;
    }
    
    public File method5294() {
        return this.field4627;
    }
    
    public Class1661 method5295() {
        return this.field4664;
    }
    
    public Function<ResourceLocation, TextureAtlasSprite> method5296(final ResourceLocation class1932) {
        return this.field4674.method6457(class1932)::method6338;
    }
    
    public boolean method5297() {
        return this.field4658;
    }
    
    public boolean method5298() {
        return this.field4694;
    }
    
    public Class1784 method5299() {
        return this.field4668;
    }
    
    public Class264 method5300() {
        if (this.currentScreen instanceof Class697) {
            return Class264.field1264;
        }
        if (this.player == null) {
            return Class264.field1261;
        }
        if (this.player.world.dimension instanceof Class6739) {
            return Class264.field1265;
        }
        if (this.player.world.dimension instanceof Class6738) {
            return this.field4647.method3813().method3334() ? Class264.field1266 : Class264.field1267;
        }
        final Class2140 method9870 = this.player.world.method6959(new BlockPos(this.player)).method9870();
        if (!this.field4669.method26548(Class264.field1268) && (!this.player.method1712() || this.field4669.method26548(Class264.field1262) || (method9870 != Class2140.field12596 && method9870 != Class2140.field12598))) {
            return (this.player.field3025.field27304 && this.player.field3025.field27303) ? Class264.field1263 : Class264.field1262;
        }
        return Class264.field1268;
    }
    
    public MinecraftSessionService method5301() {
        return this.field4672;
    }
    
    public Class7665 method5302() {
        return this.field4673;
    }
    
    @Nullable
    public Entity method5303() {
        return this.field4689;
    }
    
    public void method5304(final Entity field4689) {
        this.field4689 = field4689;
        this.field4644.method5802(field4689);
    }
    
    @Override
    public Thread method1561() {
        return this.field4703;
    }
    
    @Override
    public Runnable method1601(final Runnable runnable) {
        return runnable;
    }
    
    @Override
    public boolean method1600(final Runnable runnable) {
        return true;
    }
    
    public Class1658 method5305() {
        return this.field4675;
    }
    
    public Class8551 method5306() {
        return this.field4637;
    }
    
    public ItemRenderer getItemRenderer() {
        return this.field4638;
    }
    
    public Class9458 method5308() {
        return this.field4639;
    }
    
    public <T> Class8924<T> method5309(final Class9201<T> class9201) {
        return this.field4641.method5799(class9201);
    }
    
    public Class9462 method5310() {
        return this.field4657;
    }
    
    public boolean method5311() {
        return this.field4702;
    }
    
    public void method5312(final boolean field4702) {
        this.field4702 = field4702;
    }
    
    public DataFixer method5313() {
        return this.field4630;
    }
    
    public float method5314() {
        return this.timer.field26528;
    }
    
    public float method5315() {
        return this.timer.field26529;
    }
    
    public Class7860 method5316() {
        return this.field4665;
    }
    
    public boolean method5317() {
        return (this.player != null && this.player.method2896()) || this.gameSettings.field23425;
    }
    
    public Class690 method5318() {
        return this.field4678;
    }
    
    public Class9106 method5319() {
        return this.field4680;
    }
    
    public boolean method5320() {
        return this.field4711;
    }
    
    public Class8653 method5321() {
        return this.field4649;
    }
    
    public Class1790 method5322() {
        return this.field4674;
    }
    
    public Class1903 method5323() {
        return this.field4670;
    }
    
    public Class1786 method5324() {
        return this.field4676;
    }
    
    public Class1787 method5325() {
        return this.field4677;
    }
    
    @Override
    public void method5326(final boolean field4711) {
        this.field4711 = field4711;
    }
    
    public IProfiler method5327() {
        return this.field4660;
    }
    
    public Class7899 method5328() {
        return this.field4679;
    }
    
    public Class1791 method5329() {
        return this.field4671;
    }
    
    @Nullable
    public Class566 method5330() {
        return this.field4701;
    }
    
    public boolean method5331() {
        return false;
    }
    
    public Class1925 method5332() {
        return this.window;
    }
    
    public Class3442 method5333() {
        return this.field4635;
    }
    
    private static Class1922 method5334(final String s, final boolean b, final Supplier<Class1727> supplier, final Class1727 class1727, final Class8545 class1728, final Class2043 class1729) {
        final int method28689 = class1728.method28689();
        Supplier<Class1727> supplier2 = supplier;
        if (method28689 <= 3) {
            supplier2 = method5335(supplier);
        }
        if (method28689 <= 4) {
            supplier2 = method5336(supplier2);
        }
        return new Class1922(s, b, supplier2, class1727, class1728, class1729);
    }
    
    private static Supplier<Class1727> method5335(final Supplier<Class1727> supplier) {
        return (Supplier<Class1727>)(() -> new Class1730(supplier2.get(), Class1730.field9669));
    }
    
    private static Supplier<Class1727> method5336(final Supplier<Class1727> supplier) {
        return (Supplier<Class1727>)(() -> new Class1731(supplier2.get()));
    }
    
    public void method5337(final int n) {
        this.field4674.method6458(n);
    }
    
    public static int method5338() {
        return Minecraft.field4706;
    }
    
    static {
        field4622 = LogManager.getLogger();
        field4623 = (Util.method27845() == Class306.field1834);
        field4624 = new ResourceLocation("default");
        field4625 = new ResourceLocation("alt");
        field4626 = CompletableFuture.completedFuture(Class315.field1875);
        Minecraft.memoryReserve = new byte[10485760];
    }
}
