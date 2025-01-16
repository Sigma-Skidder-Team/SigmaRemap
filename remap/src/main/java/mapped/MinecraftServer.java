// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.command.ICommandSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import java.util.function.Function;
import java.util.Comparator;
import java.lang.management.ThreadInfo;
import java.lang.management.ManagementFactory;
import com.google.common.base.Splitter;
import java.io.BufferedWriter;
import java.nio.file.OpenOption;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import javax.annotation.Nullable;
import java.nio.file.Path;
import joptsimple.OptionSet;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.AbstractOptionSpec;
import joptsimple.OptionSpecBuilder;
import java.awt.GraphicsEnvironment;
import java.util.Optional;
import java.util.UUID;
import java.nio.file.Paths;
import joptsimple.OptionSpec;
import joptsimple.OptionParser;
import java.util.Collections;
import java.util.Arrays;
import com.mojang.authlib.GameProfile;
import java.util.function.BooleanSupplier;
import java.awt.image.BufferedImage;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.io.OutputStream;

import io.netty.buffer.ByteBufOutputStream;
import org.apache.commons.lang3.Validate;
import javax.imageio.ImageIO;
import io.netty.buffer.Unpooled;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.gson.JsonElement;
import java.io.IOException;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.concurrent.Executor;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.security.KeyPair;
import java.net.Proxy;
import java.util.Map;
import com.mojang.datafixers.DataFixer;
import java.util.Random;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.io.File;
import org.apache.logging.log4j.Logger;

public abstract class MinecraftServer extends Class871<Class1634> implements Class868, ICommandSource, AutoCloseable, Runnable
{
    private static final Logger field2292;
    public static final File field2293;
    private static final CompletableFuture<Class315> field2294;
    public static final Class8511 field2295;
    private final Class7952 field2296;
    private final Class9037 field2297;
    private final File field2298;
    private final List<Runnable> field2299;
    private final Class5029 field2300;
    private final Class7639 field2301;
    public final Class6906 field2302;
    private final Class7787 field2303;
    private final Random field2304;
    private final DataFixer field2305;
    private String field2306;
    private int field2307;
    private final Map<DimensionType, Class1849> field2308;
    private Class6765 field2309;
    private volatile boolean field2310;
    private boolean field2311;
    private int field2312;
    public final Proxy field2313;
    private boolean field2314;
    private boolean field2315;
    private boolean field2316;
    private boolean field2317;
    private boolean field2318;
    private boolean field2319;
    private String field2320;
    private int field2321;
    private int field2322;
    public final long[] field2323;
    private KeyPair field2324;
    private String field2325;
    private final String field2326;
    private String field2327;
    private boolean field2328;
    private boolean field2329;
    private String field2330;
    private String field2331;
    private volatile boolean field2332;
    private long field2333;
    private ITextComponent field2334;
    private boolean field2335;
    private boolean field2336;
    private final YggdrasilAuthenticationService field2337;
    private final MinecraftSessionService field2338;
    private final GameProfileRepository field2339;
    private final Class8608 field2340;
    private long field2341;
    public final Thread field2342;
    private long field2343;
    private long field2344;
    private boolean field2345;
    private boolean field2346;
    private final Class6580 field2347;
    private final Class1920<Class1921> field2348;
    private Class7940 field2349;
    private final Class7788 field2350;
    private final Class1780 field2351;
    private final Class1792 field2352;
    private final Class6515 field2353;
    private Class8965 field2354;
    private final Class8467 field2355;
    private final Class1783 field2356;
    private final Class1782 field2357;
    private final Class1781 field2358;
    private final Class1794 field2359;
    private final Class9462 field2360;
    private boolean field2361;
    private boolean field2362;
    private boolean field2363;
    private float field2364;
    private final Executor field2365;
    private String field2366;
    
    public MinecraftServer(final File field2298, final Proxy field2299, final DataFixer field2300, final Class7788 field2301, final YggdrasilAuthenticationService field2302, final MinecraftSessionService field2303, final GameProfileRepository field2304, final Class8608 field2305, final Class6906 field2306, final String field2307) {
        super("Server");
        this.field2297 = new Class9037("server", this, Util.method27837());
        this.field2299 = Lists.newArrayList();
        this.field2300 = new Class5029(this::method1545);
        this.field2303 = new Class7787();
        this.field2304 = new Random();
        this.field2307 = -1;
        this.field2308 = Maps.newIdentityHashMap();
        this.field2310 = true;
        this.field2323 = new long[100];
        this.field2330 = "";
        this.field2331 = "";
        this.field2342 = Util.method27851(new Thread(this, "Server thread"), thread -> thread.setUncaughtExceptionHandler((p0, t2) -> MinecraftServer.field2292.error((Object)t2)));
        this.field2343 = Util.method27837();
        this.field2347 = new Class6581(Class346.field2138, this.field2342);
        this.field2348 = new Class1920<Class1921>(Class1921::new);
        this.field2351 = new Class1780();
        this.field2352 = new Class1792();
        this.field2353 = new Class6515(this);
        this.field2355 = new Class8467(this);
        this.field2356 = new Class1783();
        this.field2357 = new Class1782(this.field2356);
        this.field2358 = new Class1781();
        this.field2359 = new Class1794(this);
        this.field2360 = new Class9462();
        this.field2313 = field2299;
        this.field2350 = field2301;
        this.field2337 = field2302;
        this.field2338 = field2303;
        this.field2339 = field2304;
        this.field2340 = field2305;
        this.field2298 = field2298;
        this.field2301 = new Class7639(this);
        this.field2302 = field2306;
        this.field2296 = new Class7952(field2298.toPath(), field2298.toPath().resolve("../backups"), field2300);
        this.field2305 = field2300;
        this.field2347.method19930(this.field2352);
        this.field2347.method19930(this.field2356);
        this.field2347.method19930(this.field2351);
        this.field2347.method19930(this.field2357);
        this.field2347.method19930(this.field2359);
        this.field2347.method19930(this.field2358);
        this.field2365 = Util.method27841();
        this.field2326 = field2307;
    }
    
    private void method1434(final Class8213 class8213) {
        final Class6359 class8214 = class8213.method27208(Class6359::new, "scoreboard");
        class8214.method18934(this.method1579());
        this.method1579().method19623(new Class1327(class8214));
    }
    
    public abstract boolean method1435() throws IOException;
    
    public void method1436(final String s) {
        if (this.method1512().method25789(s)) {
            MinecraftServer.field2292.info("Converting map!");
            this.method1437(new Class2259("menu.convertingLevel", new Object[0]));
            this.method1512().method25790(s, new Class733(this));
        }
        if (this.field2362) {
            MinecraftServer.field2292.info("Forcing world upgrade!");
            final WorldInfo method25791 = this.method1512().method25791(this.method1501());
            if (method25791 != null) {
                final Class9495 class9495 = new Class9495(this.method1501(), this.method1512(), method25791, this.field2363);
                ITextComponent class9496 = null;
                while (!class9495.method35338()) {
                    final ITextComponent method25792 = class9495.method35344();
                    if (class9496 != method25792) {
                        class9496 = method25792;
                        MinecraftServer.field2292.info(class9495.method35344().getString());
                    }
                    final int method25793 = class9495.method35341();
                    if (method25793 > 0) {
                        final int i = class9495.method35342() + class9495.method35343();
                        MinecraftServer.field2292.info("{}% completed ({} / {} chunks)...", (Object) MathHelper.method35642(i / (float)method25793 * 100.0f), (Object)i, (Object)method25793);
                    }
                    if (this.method1536()) {
                        class9495.method35335();
                    }
                    else {
                        try {
                            Thread.sleep(1000L);
                        }
                        catch (final InterruptedException ex) {}
                    }
                }
            }
        }
    }
    
    public synchronized void method1437(final ITextComponent field2334) {
        this.field2334 = field2334;
    }
    
    public void method1438(final String s, final String s2, final long n, final Class9505 class9505, final JsonElement jsonElement) {
        this.method1436(s);
        this.method1437(new Class2259("menu.loadingLevel", new Object[0]));
        final Class8642 method25787 = this.method1512().method25787(s, this);
        this.method1443(this.method1501(), method25787);
        WorldInfo method25788 = method25787.method29394();
        Class8511 field2295;
        if (method25788 != null) {
            method25788.method29550(s2);
            field2295 = new Class8511(method25788);
        }
        else {
            if (!this.method1509()) {
                field2295 = new Class8511(n, this.method1445(), this.method1444(), this.method1447(), class9505);
                field2295.method28433(jsonElement);
                if (this.field2329) {
                    field2295.method28431();
                }
            }
            else {
                field2295 = MinecraftServer.field2295;
            }
            method25788 = new WorldInfo(field2295, s2);
        }
        method25788.method29617(this.method1490(), this.method1492().isPresent());
        this.method1441(method25787.method29392(), method25788);
        final Class6459 method25789 = this.field2302.method21269(11);
        this.method1439(method25787, method25788, field2295, method25789);
        this.method1505(this.method1446(), true);
        this.method1442(method25789);
    }
    
    public void method1439(final Class8642 class8642, final WorldInfo class8643, final Class8511 class8644, final Class6459 class8645) {
        if (this.method1509()) {
            class8643.method29531(MinecraftServer.field2295);
        }
        final Class1849 class8646 = new Class1849(this, this.field2365, class8642, class8643, DimensionType.field2223, this.field2300, class8645);
        this.field2308.put(DimensionType.field2223, class8646);
        final Class8213 method6918 = class8646.method6918();
        this.method1434(method6918);
        this.field2354 = new Class8965(method6918);
        class8646.getWorldBorder().method34811(class8643);
        final Class1849 method6919 = this.method1481(DimensionType.field2223);
        if (!class8643.method29576()) {
            try {
                method6919.method6876(class8644);
                if (class8643.method29570() == Class9505.field40898) {
                    this.method1440(class8643);
                }
                class8643.method29577(true);
            }
            catch (final Throwable t) {
                final CrashReport method6920 = CrashReport.makeCrashReport(t, "Exception initializing level");
                try {
                    method6919.method6779(method6920);
                }
                catch (final Throwable t2) {}
                throw new ReportedException(method6920);
            }
            class8643.method29577(true);
        }
        this.method1537().method20579(method6919);
        if (class8643.method29610() != null) {
            this.method1584().method28266(class8643.method29610());
        }
        for (final DimensionType class8647 : DimensionType.method1269()) {
            if (class8647 != DimensionType.field2223) {
                this.field2308.put(class8647, new Class1850(method6919, this, this.field2365, class8642, class8647, this.field2300, class8645));
            }
        }
    }
    
    private void method1440(final WorldInfo class8660) {
        class8660.method29566(false);
        class8660.method29575(true);
        class8660.method29561(false);
        class8660.method29557(false);
        class8660.method29555(1000000000);
        class8660.method29547(6000L);
        class8660.method29567(Class101.field301);
        class8660.method29569(false);
        class8660.method29598(Class2113.field12290);
        class8660.method29600(true);
        class8660.method29578().method31211(Class8878.field37324).method26724(false, this);
    }
    
    public void method1441(final File parent, final WorldInfo class8660) {
        this.field2348.method7613(new Class7939());
        this.field2349 = new Class7940(new File(parent, "datapacks"));
        this.field2348.method7613(this.field2349);
        this.field2348.method7606();
        final ArrayList arrayList = Lists.newArrayList();
        for (final String s : class8660.method29609()) {
            final Class1921 method7612 = this.field2348.method7612(s);
            if (method7612 == null) {
                MinecraftServer.field2292.warn("Missing data pack {}", (Object)s);
            }
            else {
                arrayList.add(method7612);
            }
        }
        this.field2348.method7608(arrayList);
        this.method1569(class8660);
        this.method1599();
    }
    
    public void method1442(final Class6459 class6459) {
        this.method1437(new Class2259("menu.generatingTerrain", new Object[0]));
        final Class1849 method1481 = this.method1481(DimensionType.field2223);
        MinecraftServer.field2292.info("Preparing start region for dimension " + DimensionType.method1276(method1481.dimension.getType()));
        final BlockPos method1482 = method1481.method6758();
        class6459.method19317(new Class7859(method1482));
        final Class1909 method1483 = method1481.method6904();
        method1483.method7422().method7263(500);
        this.field2343 = Util.method27837();
        method1483.method7441(Class9105.field38565, new Class7859(method1482), 11, Class315.field1875);
        while (method1483.method7424() != 441) {
            this.field2343 = Util.method27837() + 10L;
            this.method1458();
        }
        this.field2343 = Util.method27837() + 10L;
        this.method1458();
        for (final DimensionType class6460 : DimensionType.method1269()) {
            final Class6358 class6461 = this.method1481(class6460).method6918().method27209(Class6358::new, "chunks");
            if (class6461 == null) {
                continue;
            }
            final Class1849 method1484 = this.method1481(class6460);
            final LongIterator iterator2 = class6461.method18933().iterator();
            while (iterator2.hasNext()) {
                method1484.method6904().method7407(new Class7859(iterator2.nextLong()), true);
            }
        }
        this.field2343 = Util.method27837() + 10L;
        this.method1458();
        class6459.method19319();
        method1483.method7422().method7263(5);
    }
    
    public void method1443(final String s, final Class8642 class8642) {
        if (new File(class8642.method29392(), "resources.zip").isFile()) {
            try {
                this.method1515("level://" + URLEncoder.encode(s, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
            }
            catch (final UnsupportedEncodingException ex) {
                MinecraftServer.field2292.warn("Something went wrong url encoding {}", (Object)s);
            }
        }
    }
    
    public abstract boolean method1444();
    
    public abstract Class101 method1445();
    
    public abstract Class2113 method1446();
    
    public abstract boolean method1447();
    
    public abstract int method1448();
    
    public abstract int method1449();
    
    public abstract boolean method1450();
    
    public boolean method1451(final boolean b, final boolean b2, final boolean b3) {
        boolean b4 = false;
        for (final Class1849 class1849 : this.method1482()) {
            if (!b) {
                MinecraftServer.field2292.info("Saving chunks for level '{}'/{}", (Object)class1849.method6764().method29549(), (Object) DimensionType.method1276(class1849.dimension.getType()));
            }
            try {
                class1849.method6879(null, b2, class1849.field10092 && !b3);
            }
            catch (final Class2337 class1850) {
                MinecraftServer.field2292.warn(class1850.getMessage());
            }
            b4 = true;
        }
        final Class1849 method1481 = this.method1481(DimensionType.field2223);
        final WorldInfo method1482 = method1481.method6764();
        method1481.getWorldBorder().method34810(method1482);
        method1482.method29611(this.method1584().method28265());
        method1481.method6917().method29390(method1482, this.method1537().method20575());
        return b4;
    }
    
    @Override
    public void close() {
        this.method1452();
    }
    
    public void method1452() {
        MinecraftServer.field2292.info("Stopping server");
        if (this.method1541() != null) {
            this.method1541().method24062();
        }
        if (this.field2309 != null) {
            MinecraftServer.field2292.info("Saving players");
            this.field2309.method20600();
            this.field2309.method20617();
        }
        MinecraftServer.field2292.info("Saving worlds");
        for (final Class1849 class1849 : this.method1482()) {
            if (class1849 != null) {
                class1849.field10092 = false;
            }
        }
        this.method1451(false, true, false);
        for (final Class1849 class1850 : this.method1482()) {
            if (class1850 != null) {
                try {
                    class1850.close();
                }
                catch (final IOException ex) {
                    MinecraftServer.field2292.error("Exception closing the level", (Throwable)ex);
                }
            }
        }
        if (this.field2297.method32488()) {
            this.field2297.method32489();
        }
    }
    
    public String method1453() {
        return this.field2306;
    }
    
    public void method1454(final String field2306) {
        this.field2306 = field2306;
    }
    
    public boolean method1455() {
        return this.field2310;
    }
    
    public void method1456(final boolean b) {
        this.field2310 = false;
        if (b) {
            try {
                this.field2342.join();
            }
            catch (final InterruptedException ex) {
                MinecraftServer.field2292.error("Error while shutting down", (Throwable)ex);
            }
        }
    }
    
    @Override
    public void run() {
        try {
            try {
                Label_0291: {
                    if (this.method1435()) {
                        this.field2343 = Util.method27837();
                        this.field2303.method24991(new StringTextComponent(this.field2320));
                        this.field2303.method24995(new Class9315(Class9528.method35579().getName(), Class9528.method35579().getProtocolVersion()));
                        this.method1463(this.field2303);
                        while (this.field2310) {
                            final long l = Util.method27837() - this.field2343;
                            if (l > 2000L && this.field2343 - this.field2333 >= 15000L) {
                                final long i = l / 50L;
                                MinecraftServer.field2292.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", (Object)l, (Object)i);
                                this.field2343 += i * 50L;
                                this.field2333 = this.field2343;
                            }
                            this.field2343 += 50L;
                            if (this.field2335) {
                                this.field2335 = false;
                                this.field2300.method15305().method19596();
                            }
                            this.field2300.method15295();
                            this.field2300.startSection("tick");
                            this.method1469(this::method1457);
                            this.field2300.method15300("nextTickWait");
                            this.field2345 = true;
                            this.field2344 = Math.max(Util.method27837() + 50L, this.field2343);
                            this.method1458();
                            this.field2300.endSection();
                            this.field2300.method15296();
                            this.field2332 = true;
                        }
                        break Label_0291;
                    }
                    this.method1467(null);
                    try {
                        this.field2311 = true;
                        this.method1452();
                    }
                    catch (final Throwable t) {
                        MinecraftServer.field2292.error("Exception stopping the server", t);
                    }
                    finally {
                        this.method1468();
                    }
                }
            }
            catch (final Throwable t2) {
                MinecraftServer.field2292.error("Encountered an unexpected exception", t2);
                CrashReport class7689;
                if (t2 instanceof ReportedException) {
                    class7689 = this.method1491(((ReportedException)t2).method9500());
                }
                else {
                    class7689 = this.method1491(new CrashReport("Exception in server tick loop", t2));
                }
                final File file = new File(new File(this.method1466(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
                if (class7689.method24416(file)) {
                    MinecraftServer.field2292.error("This crash report has been saved to: {}", (Object)file.getAbsolutePath());
                }
                else {
                    MinecraftServer.field2292.error("We were unable to save this crash report to disk.");
                }
                this.method1467(class7689);
                try {
                    this.field2311 = true;
                    this.method1452();
                }
                catch (final Throwable t3) {
                    MinecraftServer.field2292.error("Exception stopping the server", t3);
                }
                finally {
                    this.method1468();
                }
            }
            return;
        }
        finally {
            try {
                this.field2311 = true;
                this.method1452();
            }
            catch (final Throwable t4) {
                MinecraftServer.field2292.error("Exception stopping the server", t4);
            }
            finally {
                this.method1468();
            }
        }
        throw;
    }
    
    private boolean method1457() {
        return this.method5373() || Util.method27837() < (this.field2345 ? this.field2344 : this.field2343);
    }
    
    public void method1458() {
        this.method5383();
        this.method5384(() -> !this.method1457());
    }
    
    public Class1634 method1459(final Runnable runnable) {
        return new Class1634(this.field2312, runnable);
    }
    
    public boolean method1460(final Class1634 class1634) {
        return class1634.method5679() + 3 < this.field2312 || this.method1457();
    }
    
    @Override
    public boolean method1461() {
        return this.field2345 = this.method1462();
    }
    
    private boolean method1462() {
        if (!super.method1461()) {
            if (this.method1457()) {
                final Iterator<Class1849> iterator = this.method1482().iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().method6904().method7431()) {
                        continue;
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void run(final Class1634 class1634) {
        this.method1590().method15302("runTask");
        super.run(class1634);
    }
    
    public void method1463(final Class7787 class7787) {
        File input = this.method1478("server-icon.png");
        if (!input.exists()) {
            input = this.method1512().method25800(this.method1501(), "icon.png");
        }
        if (input.isFile()) {
            final ByteBuf buffer = Unpooled.buffer();
            try {
                final BufferedImage read = ImageIO.read(input);
                Validate.validState(read.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
                Validate.validState(read.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
                ImageIO.write(read, "PNG", (OutputStream)new ByteBufOutputStream(buffer));
                class7787.method24996("data:image/png;base64," + (Object)StandardCharsets.UTF_8.decode(Base64.getEncoder().encode(buffer.nioBuffer())));
            }
            catch (final Exception ex) {
                MinecraftServer.field2292.error("Couldn't load server icon", (Throwable)ex);
            }
            finally {
                buffer.release();
            }
        }
    }
    
    public boolean method1464() {
        return this.field2346 = (this.field2346 || this.method1465().isFile());
    }
    
    public File method1465() {
        return this.method1512().method25800(this.method1501(), "icon.png");
    }
    
    public File method1466() {
        return new File(".");
    }
    
    public void method1467(final CrashReport class7689) {
    }
    
    public void method1468() {
    }
    
    public void method1469(final BooleanSupplier booleanSupplier) {
        final long method27838 = Util.method27838();
        ++this.field2312;
        this.method1470(booleanSupplier);
        if (method27838 - this.field2341 >= 5000000000L) {
            this.field2341 = method27838;
            this.field2303.method24993(new Class8499(this.method1485(), this.method1484()));
            final GameProfile[] a = new GameProfile[Math.min(this.method1484(), 12)];
            final int method27839 = MathHelper.method35658(this.field2304, 0, this.method1484() - a.length);
            for (int i = 0; i < a.length; ++i) {
                a[i] = this.field2309.method20623().get(method27839 + i).method2844();
            }
            Collections.shuffle(Arrays.asList(a));
            this.field2303.method24992().method28400(a);
        }
        if (this.field2312 % 6000 == 0) {
            MinecraftServer.field2292.debug("Autosave started");
            this.field2300.startSection("save");
            this.field2309.method20600();
            this.method1451(true, false, false);
            this.field2300.endSection();
            MinecraftServer.field2292.debug("Autosave finished");
        }
        this.field2300.startSection("snooper");
        if (!this.field2297.method32488()) {
            if (this.field2312 > 100) {
                this.field2297.method32484();
            }
        }
        if (this.field2312 % 6000 == 0) {
            this.field2297.method32485();
        }
        this.field2300.endSection();
        this.field2300.startSection("tallying");
        final long[] field2323 = this.field2323;
        final int n = this.field2312 % 100;
        final long n2 = Util.method27838() - method27838;
        field2323[n] = n2;
        this.field2364 = this.field2364 * 0.8f + n2 / 1000000.0f * 0.19999999f;
        this.field2360.method35167(Util.method27838() - method27838);
        this.field2300.endSection();
    }
    
    public void method1470(final BooleanSupplier booleanSupplier) {
        this.field2300.startSection("commandFunctions");
        this.method1567().method6507();
        this.field2300.method15300("levels");
        for (final Class1849 class1849 : this.method1482()) {
            if (class1849.dimension.getType() == DimensionType.field2223 || this.method1471()) {
                this.field2300.method15298(() -> class1850.method6764().method29549() + " " + Registry.field226.getKey(class1850.field10063.method20487()));
                if (this.field2312 % 20 == 0) {
                    this.field2300.startSection("timeSync");
                    this.field2309.method20587(new Class4345(class1849.method6754(), class1849.method6755(), class1849.method6765().method31216(Class8878.field37324)), class1849.dimension.getType());
                    this.field2300.endSection();
                }
                this.field2300.startSection("tick");
                try {
                    class1849.method6862(booleanSupplier);
                }
                catch (final Throwable t) {
                    final CrashReport method24421 = CrashReport.makeCrashReport(t, "Exception ticking world");
                    class1849.method6779(method24421);
                    throw new ReportedException(method24421);
                }
                this.field2300.endSection();
                this.field2300.endSection();
            }
        }
        this.field2300.method15300("connection");
        this.method1541().method24063();
        this.field2300.method15300("players");
        this.field2309.method20585();
        if (Class9528.field41021) {
            Class8564.field35990.method28797();
        }
        this.field2300.method15300("server gui refresh");
        for (int i = 0; i < this.field2299.size(); ++i) {
            this.field2299.get(i).run();
        }
        this.field2300.endSection();
    }
    
    public boolean method1471() {
        return true;
    }
    
    public void method1472(final Runnable runnable) {
        this.field2299.add(runnable);
    }
    
    public static void main(final String[] array) {
        final OptionParser optionParser = new OptionParser();
        final OptionSpecBuilder accepts = optionParser.accepts("nogui");
        final OptionSpecBuilder accepts2 = optionParser.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
        final OptionSpecBuilder accepts3 = optionParser.accepts("demo");
        final OptionSpecBuilder accepts4 = optionParser.accepts("bonusChest");
        final OptionSpecBuilder accepts5 = optionParser.accepts("forceUpgrade");
        final OptionSpecBuilder accepts6 = optionParser.accepts("eraseCache");
        final AbstractOptionSpec forHelp = optionParser.accepts("help").forHelp();
        final ArgumentAcceptingOptionSpec withRequiredArg = optionParser.accepts("singleplayer").withRequiredArg();
        final ArgumentAcceptingOptionSpec defaultsTo = optionParser.accepts("universe").withRequiredArg().defaultsTo((Object)".", (Object[])new String[0]);
        final ArgumentAcceptingOptionSpec withRequiredArg2 = optionParser.accepts("world").withRequiredArg();
        final ArgumentAcceptingOptionSpec defaultsTo2 = optionParser.accepts("port").withRequiredArg().ofType((Class)Integer.class).defaultsTo((Object)(-1), (Object[])new Integer[0]);
        final ArgumentAcceptingOptionSpec withRequiredArg3 = optionParser.accepts("serverId").withRequiredArg();
        final NonOptionArgumentSpec nonOptions = optionParser.nonOptions();
        try {
            final OptionSet parse = optionParser.parse(array);
            if (parse.has((OptionSpec)forHelp)) {
                optionParser.printHelpOn((OutputStream)System.err);
                return;
            }
            final Path value = Paths.get("server.properties", new String[0]);
            final Class7794 class7794 = new Class7794(value);
            class7794.method25122();
            final Path value2 = Paths.get("eula.txt", new String[0]);
            final Class8546 class7795 = new Class8546(value2);
            if (parse.has((OptionSpec)accepts2)) {
                MinecraftServer.field2292.info("Initialized '" + value.toAbsolutePath().toString() + "' and '" + value2.toAbsolutePath().toString() + "'");
                return;
            }
            if (!class7795.method28691()) {
                MinecraftServer.field2292.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
                return;
            }
            CrashReport.method24422();
            Class9280.method34254();
            Class9280.method34257();
            final String s = (String)parse.valueOf((OptionSpec)defaultsTo);
            final YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, UUID.randomUUID().toString());
            final MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
            final GameProfileRepository profileRepository = yggdrasilAuthenticationService.createProfileRepository();
            final Class395 class7796 = new Class395(new File(s), class7794, Class5494.method16768(), yggdrasilAuthenticationService, minecraftSessionService, profileRepository, new Class8608(profileRepository, new File(s, MinecraftServer.field2293.getName())), Class6460::new, Optional.ofNullable(parse.valueOf((OptionSpec)withRequiredArg2)).orElse(class7794.method25121().field39779));
            class7796.method1499((String)parse.valueOf((OptionSpec)withRequiredArg));
            class7796.method1497((int)parse.valueOf((OptionSpec)defaultsTo2));
            class7796.method1510(parse.has((OptionSpec)accepts3));
            class7796.method1511(parse.has((OptionSpec)accepts4));
            class7796.method1474(parse.has((OptionSpec)accepts5));
            class7796.method1475(parse.has((OptionSpec)accepts6));
            class7796.method1473((String)parse.valueOf((OptionSpec)withRequiredArg3));
            if (!parse.has((OptionSpec)accepts) && !parse.valuesOf((OptionSpec)nonOptions).contains("nogui") && !GraphicsEnvironment.isHeadless()) {
                class7796.method1622();
            }
            class7796.method1476();
            final Class926 hook = new Class926("Server Shutdown Thread", class7796);
            hook.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(MinecraftServer.field2292));
            Runtime.getRuntime().addShutdownHook(hook);
        }
        catch (final Exception ex) {
            MinecraftServer.field2292.fatal("Failed to start the minecraft server", (Throwable)ex);
        }
    }
    
    public void method1473(final String field2366) {
        this.field2366 = field2366;
    }
    
    public void method1474(final boolean field2362) {
        this.field2362 = field2362;
    }
    
    public void method1475(final boolean field2363) {
        this.field2363 = field2363;
    }
    
    public void method1476() {
        this.field2342.start();
    }
    
    public boolean method1477() {
        return !this.field2342.isAlive();
    }
    
    public File method1478(final String child) {
        return new File(this.method1466(), child);
    }
    
    public void method1479(final String s) {
        MinecraftServer.field2292.info(s);
    }
    
    public void method1480(final String s) {
        MinecraftServer.field2292.warn(s);
    }
    
    public Class1849 method1481(final DimensionType class383) {
        return this.field2308.get(class383);
    }
    
    public Iterable<Class1849> method1482() {
        return this.field2308.values();
    }
    
    public String method1483() {
        return Class9528.method35579().getName();
    }
    
    public int method1484() {
        return this.field2309.method20608();
    }
    
    public int method1485() {
        return this.field2309.method20609();
    }
    
    public String[] method1486() {
        return this.field2309.method20590();
    }
    
    public boolean method1487() {
        return false;
    }
    
    public void method1488(final String s) {
        MinecraftServer.field2292.error(s);
    }
    
    public void method1489(final String s) {
        if (this.method1487()) {
            MinecraftServer.field2292.info(s);
        }
    }
    
    public String method1490() {
        return "vanilla";
    }
    
    public CrashReport method1491(final CrashReport class7689) {
        if (this.field2309 != null) {
            class7689.method24417().addDetail("Player Count", () -> this.field2309.method20608() + " / " + this.field2309.method20609() + "; " + this.field2309.method20623());
        }
        class7689.method24417().addDetail("Data Packs", () -> {
            final StringBuilder sb = new StringBuilder();
            this.field2348.method7611().iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final Class1921 class7690 = iterator.next();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(class7690.method7621());
                if (class7690.method7619().method8043()) {
                    continue;
                }
                else {
                    sb.append(" (incompatible)");
                }
            }
            return sb.toString();
        });
        if (this.field2366 != null) {
            class7689.method24417().addDetail("Server Id", () -> this.field2366);
        }
        return class7689;
    }
    
    public abstract Optional<String> method1492();
    
    public boolean method1493() {
        return this.field2298 != null;
    }
    
    @Override
    public void sendMessage(final ITextComponent class2250) {
        MinecraftServer.field2292.info(class2250.getString());
    }
    
    public KeyPair method1495() {
        return this.field2324;
    }
    
    public int method1496() {
        return this.field2307;
    }
    
    public void method1497(final int field2307) {
        this.field2307 = field2307;
    }
    
    public String method1498() {
        return this.field2325;
    }
    
    public void method1499(final String field2325) {
        this.field2325 = field2325;
    }
    
    public boolean method1500() {
        return this.field2325 != null;
    }
    
    public String method1501() {
        return this.field2326;
    }
    
    public void method1502(final String field2327) {
        this.field2327 = field2327;
    }
    
    public String method1503() {
        return this.field2327;
    }
    
    public void method1504(final KeyPair field2324) {
        this.field2324 = field2324;
    }
    
    public void method1505(final Class2113 class2113, final boolean b) {
        for (final Class1849 class2114 : this.method1482()) {
            final WorldInfo method6764 = class2114.method6764();
            if (!b && method6764.method29599()) {
                continue;
            }
            if (!method6764.method29568()) {
                if (!this.method1500()) {
                    method6764.method29598(class2113);
                    class2114.method6734(this.method1508(), this.field2316);
                }
                else {
                    method6764.method29598(class2113);
                    class2114.method6734(class2114.method6954() != Class2113.field12290, true);
                }
            }
            else {
                method6764.method29598(Class2113.field12293);
                class2114.method6734(true, true);
            }
        }
        this.method1537().method20623().forEach(this::method1507);
    }
    
    public void method1506(final boolean b) {
        final Iterator<Class1849> iterator = this.method1482().iterator();
        while (iterator.hasNext()) {
            iterator.next().method6764().method29600(b);
        }
        this.method1537().method20623().forEach(this::method1507);
    }
    
    private void method1507(final Class513 class513) {
        final WorldInfo method6764 = class513.method2940().method6764();
        class513.field3039.method17469(new Class4315(method6764.method29597(), method6764.method29599()));
    }
    
    public boolean method1508() {
        return true;
    }
    
    public boolean method1509() {
        return this.field2328;
    }
    
    public void method1510(final boolean field2328) {
        this.field2328 = field2328;
    }
    
    public void method1511(final boolean field2329) {
        this.field2329 = field2329;
    }
    
    public Class7952 method1512() {
        return this.field2296;
    }
    
    public String method1513() {
        return this.field2330;
    }
    
    public String method1514() {
        return this.field2331;
    }
    
    public void method1515(final String field2330, final String field2331) {
        this.field2330 = field2330;
        this.field2331 = field2331;
    }
    
    @Override
    public void method1516(final Class9037 class9037) {
        class9037.method32486("whitelist_enabled", false);
        class9037.method32486("whitelist_count", 0);
        if (this.field2309 != null) {
            class9037.method32486("players_current", this.method1484());
            class9037.method32486("players_max", this.method1485());
            class9037.method32486("players_seen", this.method1481(DimensionType.field2223).method6917().method29398().length);
        }
        class9037.method32486("uses_auth", this.field2314);
        class9037.method32486("gui_state", this.method1543() ? "enabled" : "disabled");
        class9037.method32486("run_time", (Util.method27837() - class9037.method32491()) / 60L * 1000L);
        class9037.method32486("avg_tick_ms", (int)(MathHelper.method35661(this.field2323) * 1.0E-6));
        int i = 0;
        for (final Class1849 class9038 : this.method1482()) {
            if (class9038 == null) {
                continue;
            }
            final WorldInfo method6764 = class9038.method6764();
            class9037.method32486("world[" + i + "][dimension]", class9038.dimension.getType());
            class9037.method32486("world[" + i + "][mode]", method6764.method29564());
            class9037.method32486("world[" + i + "][difficulty]", class9038.method6954());
            class9037.method32486("world[" + i + "][hardcore]", method6764.method29568());
            class9037.method32486("world[" + i + "][generator_name]", method6764.method29570().method35398());
            class9037.method32486("world[" + i + "][generator_version]", method6764.method29570().method35402());
            class9037.method32486("world[" + i + "][height]", this.field2321);
            class9037.method32486("world[" + i + "][chunks_loaded]", class9038.method6904().method7439());
            ++i;
        }
        class9037.method32486("worlds", i);
    }
    
    public abstract boolean method1517();
    
    public boolean method1518() {
        return this.field2314;
    }
    
    public void method1519(final boolean field2314) {
        this.field2314 = field2314;
    }
    
    public boolean method1520() {
        return this.field2315;
    }
    
    public void method1521(final boolean field2315) {
        this.field2315 = field2315;
    }
    
    public boolean method1522() {
        return this.field2316;
    }
    
    public void method1523(final boolean field2316) {
        this.field2316 = field2316;
    }
    
    public boolean method1524() {
        return this.field2317;
    }
    
    public abstract boolean method1525();
    
    public void method1526(final boolean field2317) {
        this.field2317 = field2317;
    }
    
    public boolean method1527() {
        return this.field2318;
    }
    
    public void method1528(final boolean field2318) {
        this.field2318 = field2318;
    }
    
    public boolean method1529() {
        return this.field2319;
    }
    
    public void method1530(final boolean field2319) {
        this.field2319 = field2319;
    }
    
    public abstract boolean method1531();
    
    public String method1532() {
        return this.field2320;
    }
    
    public void method1533(final String field2320) {
        this.field2320 = field2320;
    }
    
    public int method1534() {
        return this.field2321;
    }
    
    public void method1535(final int field2321) {
        this.field2321 = field2321;
    }
    
    public boolean method1536() {
        return this.field2311;
    }
    
    public Class6765 method1537() {
        return this.field2309;
    }
    
    public void method1538(final Class6765 field2309) {
        this.field2309 = field2309;
    }
    
    public abstract boolean method1539();
    
    public void method1540(final Class101 class101) {
        final Iterator<Class1849> iterator = this.method1482().iterator();
        while (iterator.hasNext()) {
            iterator.next().method6764().method29567(class101);
        }
    }
    
    @Nullable
    public Class7639 method1541() {
        return this.field2301;
    }
    
    public boolean method1542() {
        return this.field2332;
    }
    
    public boolean method1543() {
        return false;
    }
    
    public abstract boolean method1544(final Class101 p0, final boolean p1, final int p2);
    
    public int method1545() {
        return this.field2312;
    }
    
    public void method1546() {
        this.field2335 = true;
    }
    
    public Class9037 method1547() {
        return this.field2297;
    }
    
    public int method1548() {
        return 16;
    }
    
    public boolean method1549(final World class1847, final BlockPos class1848, final PlayerEntity class1849) {
        return false;
    }
    
    public void method1550(final boolean field2336) {
        this.field2336 = field2336;
    }
    
    public boolean method1551() {
        return this.field2336;
    }
    
    public int method1552() {
        return this.field2322;
    }
    
    public void method1553(final int field2322) {
        this.field2322 = field2322;
    }
    
    public MinecraftSessionService method1554() {
        return this.field2338;
    }
    
    public GameProfileRepository method1555() {
        return this.field2339;
    }
    
    public Class8608 method1556() {
        return this.field2340;
    }
    
    public Class7787 method1557() {
        return this.field2303;
    }
    
    public void method1558() {
        this.field2341 = 0L;
    }
    
    public int method1559() {
        return 29999984;
    }
    
    @Override
    public boolean method1560() {
        return super.method1560() && !this.method1536();
    }
    
    @Override
    public Thread method1561() {
        return this.field2342;
    }
    
    public int method1562() {
        return 256;
    }
    
    public long method1563() {
        return this.field2343;
    }
    
    public DataFixer method1564() {
        return this.field2305;
    }
    
    public int method1565(final Class1849 class1849) {
        return (class1849 == null) ? 10 : class1849.method6765().method31217(Class8878.field37331);
    }
    
    public Class1781 method1566() {
        return this.field2358;
    }
    
    public Class1794 method1567() {
        return this.field2359;
    }
    
    public void method1568() {
        if (this.method5374()) {
            this.method1537().method20600();
            this.field2348.method7606();
            this.method1569(this.method1481(DimensionType.field2223).method6764());
            this.method1537().method20626();
            this.method1599();
        }
        else {
            this.execute(this::method1568);
        }
    }
    
    private void method1569(final WorldInfo class8660) {
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.field2348.method7611());
        for (final Class1921 class8661 : this.field2348.method7609()) {
            if (!class8660.method29608().contains(class8661.method7621()) && !arrayList.contains(class8661)) {
                MinecraftServer.field2292.info("Found new data pack {}, loading it automatically", (Object)class8661.method7621());
                class8661.method7624().method8128((List<Class1921>)arrayList, class8661, class8662 -> class8662, false);
            }
        }
        this.field2348.method7608(arrayList);
        final ArrayList arrayList2 = Lists.newArrayList();
        this.field2348.method7611().forEach(class8663 -> list.add(class8663.method7620()));
        final CompletableFuture<Class315> method19928 = this.field2347.method19928(this.field2365, this, arrayList2, MinecraftServer.field2294);
        this.method5384(method19928::isDone);
        try {
            method19928.get();
        }
        catch (final Exception ex) {
            MinecraftServer.field2292.error("Failed to reload data packs", (Throwable)ex);
        }
        class8660.method29609().clear();
        class8660.method29608().clear();
        this.field2348.method7611().forEach(class8665 -> class8664.method29609().add(class8665.method7621()));
        this.field2348.method7609().forEach(class8667 -> {
            if (!this.field2348.method7611().contains(class8667)) {
                class8666.method29608().add(class8667.method7621());
            }
        });
    }
    
    public void method1570(final Class7492 class7492) {
        if (this.method1585()) {
            final Class6765 method1537 = class7492.method23255().method1537();
            final Class8010 method1538 = method1537.method20601();
            if (method1538.method26203()) {
                for (final Class513 class7493 : Lists.newArrayList((Iterable)method1537.method20623())) {
                    if (method1538.method26226(class7493.method2844())) {
                        continue;
                    }
                    class7493.field3039.method17463(new Class2259("multiplayer.disconnect.not_whitelisted", new Object[0]));
                }
            }
        }
    }
    
    public Class6580 method1571() {
        return this.field2347;
    }
    
    public Class1920<Class1921> method1572() {
        return this.field2348;
    }
    
    public Class7788 method1573() {
        return this.field2350;
    }
    
    public Class7492 method1574() {
        return new Class7492(this, (this.method1481(DimensionType.field2223) != null) ? new Vec3d(this.method1481(DimensionType.field2223).method6758()) : Vec3d.ZERO, Vec2f.ZERO, this.method1481(DimensionType.field2223), 4, "Server", new StringTextComponent("Server"), this, null);
    }
    
    @Override
    public boolean shouldReceiveFeedback() {
        return true;
    }
    
    @Override
    public boolean shouldReceiveErrors() {
        return true;
    }
    
    public Class1780 method1577() {
        return this.field2351;
    }
    
    public Class1792 method1578() {
        return this.field2352;
    }
    
    public Class6515 method1579() {
        return this.field2353;
    }
    
    public Class8965 method1580() {
        if (this.field2354 != null) {
            return this.field2354;
        }
        throw new NullPointerException("Called before server init");
    }
    
    public Class1782 method1581() {
        return this.field2357;
    }
    
    public Class1783 method1582() {
        return this.field2356;
    }
    
    public Class8878 method1583() {
        return this.method1481(DimensionType.field2223).method6765();
    }
    
    public Class8467 method1584() {
        return this.field2355;
    }
    
    public boolean method1585() {
        return this.field2361;
    }
    
    public void method1586(final boolean field2361) {
        this.field2361 = field2361;
    }
    
    public float method1587() {
        return this.field2364;
    }
    
    public int method1588(final GameProfile gameProfile) {
        if (!this.method1537().method20597(gameProfile)) {
            return 0;
        }
        final Class6023 class6023 = this.method1537().method20603().method26207(gameProfile);
        if (class6023 != null) {
            return class6023.method17945();
        }
        if (this.method1592(gameProfile)) {
            return 4;
        }
        if (!this.method1500()) {
            return this.method1448();
        }
        return this.method1537().method20627() ? 4 : 0;
    }
    
    public Class9462 method1589() {
        return this.field2360;
    }
    
    public Class5029 method1590() {
        return this.field2300;
    }
    
    public Executor method1591() {
        return this.field2365;
    }
    
    public abstract boolean method1592(final GameProfile p0);
    
    public void method1593(final Path path) throws IOException {
        final Path resolve = path.resolve("levels");
        for (final Map.Entry<DimensionType, V> entry : this.field2308.entrySet()) {
            final ResourceLocation method1276 = DimensionType.method1276(entry.getKey());
            final Path resolve2 = resolve.resolve(method1276.method7798()).resolve(method1276.method7797());
            Files.createDirectories(resolve2, (FileAttribute<?>[])new FileAttribute[0]);
            ((Class1849)entry.getValue()).method6930(resolve2);
        }
        this.method1596(path.resolve("gamerules.txt"));
        this.method1597(path.resolve("classpath.txt"));
        this.method1595(path.resolve("example_crash.txt"));
        this.method1594(path.resolve("stats.txt"));
        this.method1598(path.resolve("threads.txt"));
    }
    
    private void method1594(final Path path) throws IOException {
        try (final BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0])) {
            bufferedWriter.write(String.format("pending_tasks: %d\n", this.method5375()));
            bufferedWriter.write(String.format("average_tick_time: %f\n", this.method1587()));
            bufferedWriter.write(String.format("tick_times: %s\n", Arrays.toString(this.field2323)));
            bufferedWriter.write(String.format("queue: %s\n", Util.method27841()));
        }
    }
    
    private void method1595(final Path path) throws IOException {
        final CrashReport class7689 = new CrashReport("Server dump", new Exception("dummy"));
        this.method1491(class7689);
        try (final BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0])) {
            bufferedWriter.write(class7689.method24414());
        }
    }
    
    private void method1596(final Path path) throws IOException {
        try (final BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0])) {
            final ArrayList arrayList = Lists.newArrayList();
            Class8878.method31214(new Class8303(this, arrayList, this.method1583()));
            final Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                bufferedWriter.write((String)iterator.next());
            }
        }
    }
    
    private void method1597(final Path path) throws IOException {
        try (final BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0])) {
            final Iterator iterator = Splitter.on(System.getProperty("path.separator")).split((CharSequence)System.getProperty("java.class.path")).iterator();
            while (iterator.hasNext()) {
                bufferedWriter.write((String)iterator.next());
                bufferedWriter.write("\n");
            }
        }
    }
    
    private void method1598(final Path path) throws IOException {
        final ThreadInfo[] dumpAllThreads = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);
        Arrays.sort(dumpAllThreads, Comparator.comparing((Function<? super ThreadInfo, ? extends Comparable>)ThreadInfo::getThreadName));
        try (final BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0])) {
            final ThreadInfo[] array = dumpAllThreads;
            for (int length = array.length, i = 0; i < length; ++i) {
                bufferedWriter.write(array[i].toString());
                bufferedWriter.write(10);
            }
        }
    }
    
    private void method1599() {
        Block.field17391.forEach(BlockState::method21695);
    }
    
    static {
        field2292 = LogManager.getLogger();
        field2293 = new File("usercache.json");
        field2294 = CompletableFuture.completedFuture(Class315.field1875);
        field2295 = new Class8511("North Carolina".hashCode(), Class101.field298, true, false, Class9505.field40892).method28431();
    }
}
