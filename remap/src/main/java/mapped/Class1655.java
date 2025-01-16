// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import com.mojang.authlib.GameProfile;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.io.IOException;
import com.google.gson.JsonElement;
import java.io.File;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.util.UUID;
import org.apache.logging.log4j.Logger;

public class Class1655 extends MinecraftServer
{
    private static final Logger field9268;
    private final Minecraft field9269;
    private final Class8511 field9270;
    private boolean field9271;
    private int field9272;
    private Class917 field9273;
    private UUID field9274;
    private long field9275;
    public World field9276;
    public BlockPos field9277;
    public Class9592 field9278;
    
    public Class1655(final Minecraft field9269, final String s, final String s2, final Class8511 class8511, final YggdrasilAuthenticationService yggdrasilAuthenticationService, final MinecraftSessionService minecraftSessionService, final GameProfileRepository gameProfileRepository, final Class8608 class8512, final Class6906 class8513) {
        super(new File(field9269.field4652, "saves"), field9269.method5289(), field9269.method5313(), new Class7788(false), yggdrasilAuthenticationService, minecraftSessionService, gameProfileRepository, class8512, class8513, s);
        this.field9272 = -1;
        this.field9275 = 0L;
        this.field9276 = null;
        this.field9277 = null;
        this.field9278 = null;
        this.method1499(field9269.method5287().method33692());
        this.method1502(s2);
        this.method1510(field9269.method5268());
        this.method1511(class8511.method28434());
        this.method1535(256);
        this.method1538(new Class6764(this));
        this.field9269 = field9269;
        this.field9270 = (this.method1509() ? MinecraftServer.field2295 : class8511);
    }
    
    @Override
    public void method1438(final String s, final String s2, final long n, final Class9505 class9505, final JsonElement jsonElement) {
        this.method1436(s);
        final Class8642 method25787 = this.method1512().method25787(s, this);
        this.method1443(this.method1501(), method25787);
        final Class6459 method25788 = this.field2302.method21269(11);
        WorldInfo method25789 = method25787.method29394();
        if (method25789 != null) {
            method25789.method29550(s2);
        }
        else {
            method25789 = new WorldInfo(this.field9270, s2);
        }
        method25789.method29617(this.method1490(), this.method1492().isPresent());
        this.method1441(method25787.method29392(), method25789);
        this.method1439(method25787, method25789, this.field9270, method25788);
        if (this.method1481(DimensionType.field2223).method6764().method29597() == null) {
            this.method1505(this.field9269.gameSettings.field23463, true);
        }
        this.method1442(method25788);
    }
    
    @Override
    public boolean method1435() throws IOException {
        Class1655.field9268.info("Starting integrated minecraft server version " + Class9528.method35579().getName());
        this.method1519(true);
        this.method1523(true);
        this.method1526(true);
        this.method1528(true);
        this.method1530(true);
        Class1655.field9268.info("Generating keypair");
        this.method1504(Class9359.method34698());
        if (Class9570.field41424.method22605() && !Class9570.method35812(Class9570.field41424, this)) {
            return false;
        }
        this.method1438(this.method1501(), this.method1503(), this.field9270.method28435(), this.field9270.method28439(), this.field9270.method28441());
        this.method1533(this.method1498() + " - " + this.method1481(DimensionType.field2223).method6764().method29549());
        return !Class9570.field41425.method22605() || Class9570.method35812(Class9570.field41425, this);
    }
    
    @Override
    public void method1469(final BooleanSupplier booleanSupplier) {
        this.method5681();
        final boolean field9271 = this.field9271;
        this.field9271 = (Minecraft.method5277().method5269() != null && Minecraft.method5277().method5298());
        final Class5029 method1590 = this.method1590();
        if (!field9271) {
            if (this.field9271) {
                method1590.startSection("autoSave");
                Class1655.field9268.info("Saving and pausing game...");
                this.method1537().method20600();
                this.method1451(false, false, false);
                method1590.endSection();
            }
        }
        if (!this.field9271) {
            super.method1469(booleanSupplier);
            final int max = Math.max(2, this.field9269.gameSettings.field23382 - 1);
            if (max != this.method1537().method20613()) {
                Class1655.field9268.info("Changing view distance to {}, from {}", (Object)max, (Object)this.method1537().method20613());
                this.method1537().method20622(max);
            }
        }
    }
    
    @Override
    public boolean method1444() {
        return false;
    }
    
    @Override
    public Class101 method1445() {
        return this.field9270.method28436();
    }
    
    @Override
    public Class2113 method1446() {
        return (this.field9269.world != null) ? this.field9269.world.method6764().method29597() : this.field9269.gameSettings.field23463;
    }
    
    @Override
    public boolean method1447() {
        return this.field9270.method28437();
    }
    
    @Override
    public boolean method1450() {
        return true;
    }
    
    @Override
    public boolean allowLogging() {
        return true;
    }
    
    @Override
    public File method1466() {
        return this.field9269.field4652;
    }
    
    @Override
    public boolean method1517() {
        return false;
    }
    
    @Override
    public boolean method1525() {
        return false;
    }
    
    @Override
    public void method1467(final CrashReport class7689) {
        this.field9269.method5238(class7689);
    }
    
    @Override
    public CrashReport method1491(CrashReport method1491) {
        method1491 = super.method1491(method1491);
        method1491.method24417().addDetail("Type", "Integrated Server (map_client.txt)");
        method1491.method24417().addDetail("Is Modded", () -> this.method1492().orElse("Probably not. Jar signature remains and both client + server brands are untouched."));
        return method1491;
    }
    
    @Override
    public Optional<String> method1492() {
        final String method25729 = Class7932.method25729();
        if (!method25729.equals("vanilla")) {
            return Optional.of("Definitely; Client brand changed to '" + method25729 + "'");
        }
        final String method25730 = this.method1490();
        if ("vanilla".equals(method25730)) {
            return (Minecraft.class.getSigners() != null) ? Optional.empty() : Optional.of("Very likely; Jar signature invalidated");
        }
        return Optional.of("Definitely; Server brand changed to '" + method25730 + "'");
    }
    
    @Override
    public void method1516(final Class9037 class9037) {
        super.method1516(class9037);
        class9037.method32486("snooper_partner", this.field9269.method5286().method32490());
    }
    
    @Override
    public boolean method1544(final Class101 class101, final boolean b, final int i) {
        try {
            this.method1541().method24060(null, i);
            Class1655.field9268.info("Started serving on {}", (Object)i);
            this.field9272 = i;
            (this.field9273 = new Class917(this.method1532(), i + "")).start();
            this.method1537().method20614(class101);
            this.method1537().method20616(b);
            this.field9269.player.method4124(this.method1588(this.field9269.player.method2844()));
            final Iterator<Class513> iterator = this.method1537().method20623().iterator();
            while (iterator.hasNext()) {
                this.method1573().method24999(iterator.next());
            }
            return true;
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    @Override
    public void method1452() {
        super.method1452();
        if (this.field9273 != null) {
            this.field9273.interrupt();
            this.field9273 = null;
        }
    }
    
    @Override
    public void method1456(final boolean b) {
        if (!Class9570.field41385.method22623() || this.method1455()) {
            this.method5380(() -> {
                Lists.newArrayList((Iterable)this.method1537().method20623()).iterator();
                final Iterator iterator;
                while (iterator.hasNext()) {
                    final Class513 class513 = iterator.next();
                    if (class513.method1865().equals(this.field9274)) {
                        continue;
                    }
                    else {
                        this.method1537().method20581(class513);
                    }
                }
                return;
            });
        }
        super.method1456(b);
        if (this.field9273 != null) {
            this.field9273.interrupt();
            this.field9273 = null;
        }
    }
    
    @Override
    public boolean method1539() {
        return this.field9272 > -1;
    }
    
    @Override
    public int method1496() {
        return this.field9272;
    }
    
    @Override
    public void method1540(final Class101 class101) {
        super.method1540(class101);
        this.method1537().method20614(class101);
    }
    
    @Override
    public boolean method1531() {
        return true;
    }
    
    @Override
    public int method1448() {
        return 2;
    }
    
    @Override
    public int method1449() {
        return 2;
    }
    
    public void method5680(final UUID field9274) {
        this.field9274 = field9274;
    }
    
    @Override
    public boolean method1592(final GameProfile gameProfile) {
        return gameProfile.getName().equalsIgnoreCase(this.method1498());
    }
    
    private void method5681() {
        final Iterator<Class1849> iterator = this.method1482().iterator();
        while (iterator.hasNext()) {
            this.method5682(iterator.next());
        }
    }
    
    private void method5682(final Class1849 class1849) {
        if (!Config.method28921()) {
            this.method5685(class1849);
        }
        if (!Config.method28912()) {
            this.method5684(class1849);
        }
        if (this.field9276 == class1849) {
            if (this.field9277 != null) {
                this.field9278 = class1849.method6784(this.field9277);
                this.field9276 = null;
                this.field9277 = null;
            }
        }
    }
    
    public Class9592 method5683(final World field9276, final BlockPos field9277) {
        this.field9276 = field9276;
        this.field9277 = field9277;
        return this.field9278;
    }
    
    private void method5684(final Class1849 class1849) {
        final WorldInfo method6764 = class1849.method6764();
        if (method6764.method29560() || method6764.method29556()) {
            method6764.method29563(0);
            method6764.method29561(false);
            class1849.method6769(0.0f);
            method6764.method29559(0);
            method6764.method29557(false);
            class1849.method6767(0.0f);
            this.method1537().method20586(new Class4306(2, 0.0f));
            this.method1537().method20586(new Class4306(7, 0.0f));
            this.method1537().method20586(new Class4306(8, 0.0f));
        }
    }
    
    private void method5685(final Class1849 class1849) {
        if (class1849.method6764().method29564().method585() == 1) {
            final long method6755 = class1849.method6755();
            final long n = method6755 % 24000L;
            if (Config.method28920()) {
                if (n <= 1000L) {
                    class1849.method6756(method6755 - n + 1001L);
                }
                if (n >= 11000L) {
                    class1849.method6756(method6755 - n + 24001L);
                }
            }
            if (Config.method28922()) {
                if (n <= 14000L) {
                    class1849.method6756(method6755 - n + 14001L);
                }
                if (n >= 22000L) {
                    class1849.method6756(method6755 - n + 24000L + 14001L);
                }
            }
        }
    }
    
    @Override
    public boolean method1451(final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            final int method1545 = this.method1545();
            if (method1545 < this.field9275 + this.field9269.gameSettings.field23495) {
                return false;
            }
            this.field9275 = method1545;
        }
        return super.method1451(b, b2, b3);
    }
    
    static {
        field9268 = LogManager.getLogger();
    }
}
