// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import com.mojang.authlib.GameProfile;
import java.util.function.BooleanSupplier;
import java.util.Optional;
import com.google.common.base.Strings;
import java.util.Locale;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Random;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.net.Proxy;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

public class Class395 extends MinecraftServer implements Class396
{
    private static final Logger field2367;
    private static final Pattern field2368;
    private final List<Class5485> field2369;
    private Class1362 field2370;
    private final Class398 field2371;
    private Class1363 field2372;
    private final Class7794 field2373;
    private Class101 field2374;
    private Class2419 field2375;
    
    public Class395(final File file, final Class7794 field2373, final DataFixer dataFixer, final YggdrasilAuthenticationService yggdrasilAuthenticationService, final MinecraftSessionService minecraftSessionService, final GameProfileRepository gameProfileRepository, final Class8608 class8608, final Class6906 class8609, final String s) {
        super(file, Proxy.NO_PROXY, dataFixer, new Class7788(true), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, class8608, class8609, s);
        this.field2369 = Collections.synchronizedList((List<Class5485>)Lists.newArrayList());
        this.field2373 = field2373;
        this.field2371 = new Class398(this);
        final Class920 class8610 = new Class920(this, "Server Infinisleeper");
    }
    
    @Override
    public boolean method1435() throws IOException {
        final Class897 class897 = new Class897(this, "Server console handler");
        class897.setDaemon(true);
        class897.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Class395.field2367));
        class897.start();
        Class395.field2367.info("Starting minecraft server version " + Class9528.method35579().getName());
        if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
            Class395.field2367.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
        }
        Class395.field2367.info("Loading properties");
        final Class9277 method25121 = this.field2373.method25121();
        if (this.method1500()) {
            this.method1454("127.0.0.1");
        }
        else {
            this.method1519(method25121.field39765);
            this.method1521(method25121.field39766);
            this.method1454(method25121.field39767);
        }
        this.method1523(method25121.field39768);
        this.method1526(method25121.field39769);
        this.method1528(method25121.field39770);
        this.method1530(method25121.field39771);
        this.method1515(method25121.field39772, this.method1614());
        this.method1533(method25121.field39773);
        this.method1550(method25121.field39774);
        super.method1553((int)method25121.field39809.get());
        this.method1586(method25121.field39775);
        this.field2374 = method25121.field39778;
        Class395.field2367.info("Default game type: {}", (Object)this.field2374);
        InetAddress byName = null;
        if (!this.method1453().isEmpty()) {
            byName = InetAddress.getByName(this.method1453());
        }
        if (this.method1496() < 0) {
            this.method1497(method25121.field39783);
        }
        Class395.field2367.info("Generating keypair");
        this.method1504(Class9359.method34698());
        Class395.field2367.info("Starting Minecraft server on {}:{}", (Object)(this.method1453().isEmpty() ? "*" : this.method1453()), (Object)this.method1496());
        try {
            this.method1541().method24060(byName, this.method1496());
        }
        catch (final IOException ex) {
            Class395.field2367.warn("**** FAILED TO BIND TO PORT!");
            Class395.field2367.warn("The exception was: {}", (Object)ex.toString());
            Class395.field2367.warn("Perhaps a server is already running on that port?");
            return false;
        }
        if (!this.method1518()) {
            Class395.field2367.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
            Class395.field2367.warn("The server will make no attempt to authenticate usernames. Beware.");
            Class395.field2367.warn("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
            Class395.field2367.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
        }
        if (this.method1624()) {
            this.method1556().method29199();
        }
        if (!Class7450.method22927(this)) {
            return false;
        }
        this.method1538(new Class6766(this));
        final long method25122 = Util.method27838();
        final String field39780 = method25121.field39780;
        final String field39781 = method25121.field39782;
        long nextLong = new Random().nextLong();
        if (!field39780.isEmpty()) {
            try {
                final long long1 = Long.parseLong(field39780);
                if (long1 != 0L) {
                    nextLong = long1;
                }
            }
            catch (final NumberFormatException ex2) {
                nextLong = field39780.hashCode();
            }
        }
        final Class9505 field39782 = method25121.field39781;
        this.method1535(method25121.field39784);
        Class493.method2502(this.method1556());
        Class493.method2503(this.method1554());
        Class8608.method29191(this.method1518());
        Class395.field2367.info("Preparing level \"{}\"", (Object)this.method1501());
        JsonObject method25123 = new JsonObject();
        if (field39782 == Class9505.field40893) {
            method25123.addProperty("flat_world_options", field39781);
        }
        else if (!field39781.isEmpty()) {
            method25123 = Class9583.method35932(field39781);
        }
        this.method1438(this.method1501(), this.method1501(), nextLong, field39782, (JsonElement)method25123);
        Class395.field2367.info("Done ({})! For help, type \"help\"", (Object)String.format(Locale.ROOT, "%.3fs", (Util.method27838() - method25122) / 1.0E9));
        if (method25121.field39785 != null) {
            this.method1583().method31211(Class8878.field37337).method26724(method25121.field39785, this);
        }
        if (method25121.field39786) {
            Class395.field2367.info("Starting GS4 status listener");
            (this.field2370 = new Class1362(this)).method5629();
        }
        if (method25121.field39788) {
            Class395.field2367.info("Starting remote control listener");
            (this.field2372 = new Class1363(this)).method5629();
        }
        if (this.method1626() > 0L) {
            final Thread thread = new Thread(new Class1072(this));
            thread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8237(Class395.field2367));
            thread.setName("Server Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        Items.AIR.method11735(Class7207.field27998, Class2265.method8506());
        return true;
    }
    
    public String method1614() {
        final Class9277 method25121 = this.field2373.method25121();
        String input;
        if (method25121.field39792.isEmpty()) {
            if (Strings.isNullOrEmpty(method25121.field39791)) {
                input = "";
            }
            else {
                Class395.field2367.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
                input = method25121.field39791;
            }
        }
        else {
            input = method25121.field39792;
            if (!Strings.isNullOrEmpty(method25121.field39791)) {
                Class395.field2367.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
        }
        if (!input.isEmpty()) {
            if (!Class395.field2368.matcher(input).matches()) {
                Class395.field2367.warn("Invalid sha1 for ressource-pack-sha1");
            }
        }
        if (!method25121.field39772.isEmpty()) {
            if (input.isEmpty()) {
                Class395.field2367.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
            }
        }
        return input;
    }
    
    @Override
    public void method1540(final Class101 field2374) {
        super.method1540(field2374);
        this.field2374 = field2374;
    }
    
    @Override
    public Class9277 method1615() {
        return this.field2373.method25121();
    }
    
    @Override
    public boolean method1444() {
        return this.method1615().field39776;
    }
    
    @Override
    public Class101 method1445() {
        return this.field2374;
    }
    
    @Override
    public Class2113 method1446() {
        return this.method1615().field39777;
    }
    
    @Override
    public boolean method1447() {
        return this.method1615().field39793;
    }
    
    @Override
    public Class7689 method1491(Class7689 method1491) {
        method1491 = super.method1491(method1491);
        method1491.method24417().method16296("Is Modded", () -> this.method1492().orElse("Unknown (can't tell)"));
        method1491.method24417().method16296("Type", () -> "Dedicated Server (map_server.txt)");
        return method1491;
    }
    
    @Override
    public Optional<String> method1492() {
        final String method1490 = this.method1490();
        return "vanilla".equals(method1490) ? Optional.empty() : Optional.of("Definitely; Server brand changed to '" + method1490 + "'");
    }
    
    @Override
    public void method1468() {
        if (this.field2375 != null) {
            this.field2375.method9717();
        }
        if (this.field2372 != null) {
            this.field2372.method5630();
        }
        if (this.field2370 != null) {
            this.field2370.method5630();
        }
    }
    
    @Override
    public void method1470(final BooleanSupplier booleanSupplier) {
        super.method1470(booleanSupplier);
        this.method1617();
    }
    
    @Override
    public boolean method1471() {
        return this.method1615().field39794;
    }
    
    @Override
    public boolean method1508() {
        return this.method1615().field39795;
    }
    
    @Override
    public void method1516(final Class9037 class9037) {
        class9037.method32486("whitelist_enabled", this.method1618().method20610());
        class9037.method32486("whitelist_count", this.method1618().method20602().length);
        super.method1516(class9037);
    }
    
    public void method1616(final String s, final Class7492 class7492) {
        this.field2369.add(new Class5485(s, class7492));
    }
    
    public void method1617() {
        while (!this.field2369.isEmpty()) {
            final Class5485 class5485 = this.field2369.remove(0);
            this.method1573().method24998(class5485.field22768, class5485.field22767);
        }
    }
    
    @Override
    public boolean method1517() {
        return true;
    }
    
    @Override
    public boolean method1525() {
        return this.method1615().field39797;
    }
    
    public Class6766 method1618() {
        return (Class6766)super.method1537();
    }
    
    @Override
    public boolean method1539() {
        return true;
    }
    
    @Override
    public String method1619() {
        return this.method1453();
    }
    
    @Override
    public int method1620() {
        return this.method1496();
    }
    
    @Override
    public String method1621() {
        return this.method1532();
    }
    
    public void method1622() {
        if (this.field2375 == null) {
            this.field2375 = Class2419.method9711(this);
        }
    }
    
    @Override
    public boolean method1543() {
        return this.field2375 != null;
    }
    
    @Override
    public boolean method1544(final Class101 class101, final boolean b, final int n) {
        return false;
    }
    
    @Override
    public boolean method1531() {
        return this.method1615().field39798;
    }
    
    @Override
    public int method1548() {
        return this.method1615().field39799;
    }
    
    @Override
    public boolean method1549(final World class1847, final BlockPos class1848, final PlayerEntity class1849) {
        if (class1847.dimension.getType() != DimensionType.field2223) {
            return false;
        }
        if (this.method1618().method20603().method26211()) {
            return false;
        }
        if (this.method1618().method20597(class1849.method2844())) {
            return false;
        }
        if (this.method1548() > 0) {
            final BlockPos method6758 = class1847.method6758();
            return Math.max(MathHelper.abs(class1848.getX() - method6758.getX()), MathHelper.abs(class1848.getZ() - method6758.getZ())) <= this.method1548();
        }
        return false;
    }
    
    @Override
    public int method1448() {
        return this.method1615().field39800;
    }
    
    @Override
    public int method1449() {
        return this.method1615().field39801;
    }
    
    @Override
    public void method1553(final int n) {
        super.method1553(n);
        this.field2373.method25123(class9278 -> class9278.field39809.method26842(i));
    }
    
    @Override
    public boolean method1450() {
        return this.method1615().field39806;
    }
    
    @Override
    public boolean allowLogging() {
        return this.method1615().field39807;
    }
    
    @Override
    public int method1559() {
        return this.method1615().field39808;
    }
    
    @Override
    public int method1562() {
        return this.method1615().field39805;
    }
    
    public boolean method1624() {
        boolean method22920 = false;
        for (int n = 0; !method22920 && n <= 2; method22920 = Class7450.method22920(this), ++n) {
            if (n > 0) {
                Class395.field2367.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
                this.method1625();
            }
        }
        boolean method22921 = false;
        for (int n2 = 0; !method22921 && n2 <= 2; method22921 = Class7450.method22921(this), ++n2) {
            if (n2 > 0) {
                Class395.field2367.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
                this.method1625();
            }
        }
        boolean method22922 = false;
        for (int n3 = 0; !method22922 && n3 <= 2; method22922 = Class7450.method22922(this), ++n3) {
            if (n3 > 0) {
                Class395.field2367.warn("Encountered a problem while converting the op list, retrying in a few seconds");
                this.method1625();
            }
        }
        boolean method22923 = false;
        for (int n4 = 0; !method22923 && n4 <= 2; method22923 = Class7450.method22923(this), ++n4) {
            if (n4 > 0) {
                Class395.field2367.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
                this.method1625();
            }
        }
        boolean method22924 = false;
        for (int n5 = 0; !method22924 && n5 <= 2; method22924 = Class7450.method22925(this), ++n5) {
            if (n5 > 0) {
                Class395.field2367.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
                this.method1625();
            }
        }
        if (!method22920) {
            if (!method22921) {
                if (!method22922) {
                    if (!method22923) {
                        if (!method22924) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private void method1625() {
        try {
            Thread.sleep(5000L);
        }
        catch (final InterruptedException ex) {}
    }
    
    public long method1626() {
        return this.method1615().field39802;
    }
    
    @Override
    public String method1627() {
        return "";
    }
    
    @Override
    public String method1628(final String s) {
        this.field2371.method1635();
        this.method5380(() -> this.method1573().method24998(this.field2371.method1637(), s2));
        return this.field2371.method1636();
    }
    
    public void method1629(final boolean b) {
        this.field2373.method25123(class9278 -> class9278.field39810.method26842(b2));
    }
    
    @Override
    public void method1452() {
        super.method1452();
        Util.method27842();
    }
    
    @Override
    public boolean method1592(final GameProfile gameProfile) {
        return false;
    }
    
    static {
        field2367 = LogManager.getLogger();
        field2368 = Pattern.compile("^[a-fA-F0-9]{40}$");
    }
}
