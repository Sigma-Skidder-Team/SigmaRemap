// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import com.mojang.authlib.AuthenticationService;
import net.minecraft.entity.Entity;
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

public class Class869 extends Class871<Runnable> implements Class868, Class870
{
    private static Class869 field4621;
    private static final Logger field4622;
    public static final boolean field4623;
    public static final Class1932 field4624;
    public static final Class1932 field4625;
    private static final CompletableFuture<Class315> field4626;
    private final File field4627;
    private final PropertyMap field4628;
    private final Class1663 field4629;
    private final DataFixer field4630;
    private final Class390 field4631;
    public final Class1925 field4632;
    public final Class6742 field4633;
    private final Class9037 field4634;
    private final Class3442 field4635;
    public final Class1656 field4636;
    private final Class8551 field4637;
    private final Class1796 field4638;
    private final Class9458 field4639;
    public final Class1793 field4640;
    private final Class1659 field4641;
    public Class9212 field4642;
    public final Class1844 field4643;
    public final Class1660 field4644;
    public final Class7282 field4645;
    private final AtomicReference<Class6461> field4646;
    public final Class685 field4647;
    public final Class5760 field4648;
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
    public static byte[] field4681;
    public Class8245 field4682;
    public Class1848 field4683;
    public Class756 field4684;
    private Class1655 field4685;
    private Class9575 field4686;
    private Class3641 field4687;
    private boolean field4688;
    public Entity field4689;
    public Entity field4690;
    public Class7006 field4691;
    public int field4692;
    public int field4693;
    private boolean field4694;
    private float field4695;
    private long field4696;
    private long field4697;
    private int field4698;
    public boolean field4699;
    public Class527 field4700;
    public Class566 field4701;
    private boolean field4702;
    private Thread field4703;
    private volatile boolean field4704;
    private Class7689 field4705;
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
    
    public Class869(final Class9408 class9408) {
        super("Client");
        this.field4633 = new Class6742(20.0f, 0L);
        this.field4634 = new Class9037("client", this, Class8349.method27837());
        this.field4641 = new Class1659();
        this.field4646 = new AtomicReference<Class6461>();
        this.field4657 = new Class9462();
        this.field4660 = new Class5029(() -> this.field4633.field26527);
        this.field4679 = new Class7899(this);
        this.field4696 = Class8349.method27838();
        this.field4704 = true;
        this.field4707 = "";
        this.field4710 = true;
        this.field4712 = Queues.newConcurrentLinkedQueue();
        this.field4714 = "root";
        this.field4715 = true;
        Class869.field4621 = this;
        this.field4652 = class9408.field40379.field37230;
        final File field37232 = class9408.field40379.field37232;
        this.field4627 = class9408.field40379.field37231;
        this.field4653 = class9408.field40380.field23928;
        this.field4654 = class9408.field40380.field23929;
        this.field4628 = class9408.field40377.field34929;
        this.field4662 = new Class7937(new File(this.field4652, "server-resource-packs"), class9408.field40379.method31008());
        (this.field4663 = new Class1920<Class1922>(Class869::method5334)).method7613(this.field4662);
        this.field4663.method7613(new Class7940(this.field4627));
        this.field4655 = class9408.field40377.field34930;
        this.field4672 = new YggdrasilAuthenticationService(this.field4655, UUID.randomUUID().toString()).createMinecraftSessionService();
        this.field4642 = class9408.field40377.field34927;
        Class869.field4622.info("Setting user: {}", (Object)this.field4642.method33692());
        Class869.field4622.debug("(Session ID is {})", (Object)this.field4642.method33690());
        this.method5279();
        this.field4659 = class9408.field40380.field23927;
        this.field4658 = method5233();
        this.field4685 = null;
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
        this.field4648 = new Class5760(this, this.field4652);
        this.field4649 = new Class8653(this.field4652, this.field4630);
        this.method5237();
        Class869.field4622.info("Backend library: {}", (Object)Class8726.method30077());
        Class9154 field37235;
        if (this.field4648.field23399 > 0 && this.field4648.field23398 > 0) {
            field37235 = new Class9154(this.field4648.field23398, this.field4648.field23399, class9408.field40378.field38789, class9408.field40378.field38790, class9408.field40378.field38791);
        }
        else {
            field37235 = class9408.field40378;
        }
        Class8349.field34268 = Class8726.method30079();
        this.field4631 = new Class390(this);
        this.field4632 = this.field4631.method1413(field37235, this.field4648.field23392, this.method5228());
        this.method5326(true);
        try {
            this.field4632.method7665(this.method5293().method25740().method6097(Class346.field2137, new Class1932("icons/icon_16x16.png")), this.method5293().method25740().method6097(Class346.field2137, new Class1932("icons/icon_32x32.png")));
        }
        catch (final IOException ex) {
            Class869.field4622.error("Couldn't set icon", (Throwable)ex);
        }
        this.field4632.method7678(this.field4648.field23383);
        (this.field4650 = new Class8161(this)).method26954(this.field4632.method7690());
        (this.field4651 = new Class7335(this)).method22506(this.field4632.method7690());
        Class8726.method30080(this.field4648.field23413, false);
        (this.field4667 = new Class6153(this.field4632.method7692(), this.field4632.method7693(), true, Class869.field4623)).method18398(0.0f, 0.0f, 0.0f, 0.0f);
        this.field4661 = new Class6581(Class346.field2137, this.field4703);
        this.field4648.method17146(this.field4663);
        this.field4663.method7606();
        this.field4664 = new Class1661(this.field4648.field23476);
        this.field4661.method19930(this.field4664);
        this.field4629 = new Class1663(this.field4661);
        this.field4661.method19930(this.field4629);
        this.field4673 = new Class7665(this.field4629, new File(field37232, "skins"), this.field4672);
        this.field4656 = new Class7952(this.field4652.toPath().resolve("saves"), this.field4652.toPath().resolve("backups"), this.field4630);
        this.field4668 = new Class1784(this.field4661, this.field4648);
        this.field4661.method19930(this.field4668);
        this.field4671 = new Class1791(this.field4642);
        this.field4661.method19930(this.field4671);
        this.field4669 = new Class8086(this);
        this.field4670 = new Class1903(this.field4629, this.method5240());
        this.field4661.method19930(this.field4670.method7378());
        final Class1844 method7376 = this.field4670.method7376(Class869.field4624);
        if (method7376 == null) {
            throw new IllegalStateException("Default font is null");
        }
        (this.field4643 = method7376).method6625(this.field4664.method5843());
        this.field4661.method19930(new Class1788());
        this.field4661.method19930(new Class1777());
        this.field4632.method7667("Startup");
        Class8726.method30086(0, 0, this.field4632.method7692(), this.field4632.method7693());
        this.field4632.method7667("Post startup");
        this.field4665 = Class7860.method25439();
        this.field4666 = Class6457.method19306(this.field4665);
        this.field4674 = new Class1790(this.field4629, this.field4665, this.field4648.field23405);
        this.field4661.method19930(this.field4674);
        this.field4638 = new Class1796(this.field4629, this.field4674, this.field4666);
        this.field4637 = new Class8551(this.field4629, this.field4638, this.field4661, this.field4643, this.field4648);
        this.field4639 = new Class9458(this);
        this.field4661.method19930(this.field4638);
        this.field4635 = new Class3442();
        this.field4644 = new Class1660(this, this.field4661, this.field4635);
        this.field4661.method19930(this.field4644);
        this.field4675 = new Class1658(this.field4674.method6453(), this.field4665);
        this.field4661.method19930(this.field4675);
        this.field4636 = new Class1656(this, this.field4635);
        this.field4661.method19930(this.field4636);
        this.method5231();
        this.field4661.method19930(this.field4641);
        this.field4640 = new Class1793(this.field4683, this.field4629);
        this.field4661.method19930(this.field4640);
        this.field4676 = new Class1786(this.field4629);
        this.field4661.method19930(this.field4676);
        this.field4677 = new Class1787(this.field4629);
        this.field4661.method19930(this.field4677);
        Class9463.method35173().method35175();
        this.field4647 = new Class685(this);
        this.field4645 = new Class7282(this);
        Class8726.method30081(this::method5232);
        if (this.field4648.field23430 && !this.field4632.method7691()) {
            this.field4632.method7685();
            this.field4648.field23430 = this.field4632.method7691();
        }
        this.field4632.method7672(this.field4648.field23419);
        this.field4632.method7702(this.field4648.field23412);
        this.field4632.method7671();
        this.method5248();
        if (field37233 != null) {
            this.method5244(new Class694(new Class548(), this, field37233, field37234));
        }
        else {
            this.method5244(new Class548(true));
        }
        Class567.method3306(this);
        this.method5245(new Class568(this, this.field4661.method19929(Class8349.method27841(), this, Class869.field4626, (List<Class1727>)this.field4663.method7611().stream().map((Function<? super Class1922, ?>)Class1921::method7620).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())), optional -> Class8349.method27855(optional, this::method5230, () -> {
            this.field4664.method5842(list);
            if (Class9528.field41021) {
                this.method5242();
            }
        }), false));
    }
    
    public void method5227() {
        this.field4632.method7689(this.method5228());
    }
    
    private String method5228() {
        final StringBuilder sb = new StringBuilder((Class9463.method35173().method35209() == Class2209.field13464) ? "Jello for Sigma 5.0" : "Sigma 5.0");
        final Class5799 method5269 = this.method5269();
        if (method5269 != null && method5269.method17369().method11187()) {
            sb.append(" - ");
            if (this.field4685 != null && !this.field4685.method1539()) {
                sb.append(Class8822.method30773("title.singleplayer", new Object[0]));
            }
            else if (this.method5311()) {
                sb.append(Class8822.method30773("title.multiplayer.realms", new Object[0]));
            }
            else if (this.field4685 == null && (this.field4686 == null || !this.field4686.method35871())) {
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
                final Class2260 class2260 = new Class2260(((Class2370)t).method9501().method6102());
            }
            Class869.field4622.info("Caught error loading resourcepacks, removing all selected resourcepacks", t);
            this.field4663.method7608((Collection<Class1922>)Collections.emptyList());
            this.field4648.field23387.clear();
            this.field4648.field23388.clear();
            this.field4648.method17121();
            this.method5241().thenRun(() -> Class6865.method20981(this.method5318(), Class2174.field12899, new Class2259("resourcePack.load_fail", new Object[0]), class2261));
        }
        else {
            Class8349.method27844(t);
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
                    Class9463.method35173().method35180();
                }
                catch (final OutOfMemoryError outOfMemoryError) {
                    if (n != 0) {
                        throw outOfMemoryError;
                    }
                    this.method5250();
                    this.method5244(new Class734());
                    System.gc();
                    Class869.field4622.fatal("Out of memory", (Throwable)outOfMemoryError);
                    n = 1;
                }
            }
        }
        catch (final Class2365 class2365) {
            this.method5275(class2365.method9500());
            this.method5250();
            Class869.field4622.fatal("Reported exception thrown!", (Throwable)class2365);
            method5239(class2365.method9500());
        }
        catch (final Throwable t) {
            final Class7689 method5275 = this.method5275(new Class7689("Unexpected error", t));
            Class869.field4622.fatal("Unreported exception thrown!", t);
            this.method5250();
            method5239(method5275);
        }
    }
    
    private void method5231() {
        final Class8922 class8922 = new Class8922(class8925 -> class8925.method27668(null, Class1980.field10972).stream().map(class8926 -> Class2116.method8259(class8926.getString()).trim()).filter(s -> !s.isEmpty()), class8927 -> Stream.of(Class90.field211.method503(class8927.method27622())));
        final Class8923 class8923 = new Class8923(class8928 -> Class7855.method25402().method18463(class8928.method27622()).stream());
        final Class2265<Object> method8506 = Class2265.method8506();
        final Iterator<Object> iterator = Class90.field211.iterator();
        while (iterator.hasNext()) {
            iterator.next().method11735(Class7207.field27998, (Class2265<Class8321>)method8506);
        }
        method8506.forEach(class8931 -> {
            class8929.method31458(class8931);
            class8930.method31458(class8931);
            return;
        });
        final Class8922<Class9586> class8924 = new Class8922<Class9586>(class8932 -> class8932.method35945().stream().flatMap(class8933 -> class8933.method11292().method27668(null, Class1980.field10972).stream()).map(class8934 -> Class2116.method8259(class8934.getString()).trim()).filter(s2 -> !s2.isEmpty()), class8935 -> class8935.method35945().stream().map(class8936 -> Class90.field211.method503(class8936.method11292().method27622())));
        this.field4641.method5798(Class1659.field9375, class8922);
        this.field4641.method5798(Class1659.field9376, class8923);
        this.field4641.method5798(Class1659.field9377, class8924);
    }
    
    private void method5232(final int n, final long n2) {
        this.field4648.field23419 = false;
        this.field4648.method17121();
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
        class905.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8239(Class869.field4622));
        class905.start();
    }
    
    public void method5238(final Class7689 field4705) {
        this.field4705 = field4705;
    }
    
    public static void method5239(final Class7689 class7689) {
        final File file = new File(new File(method5277().field4652, "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
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
        return this.field4648.field23421;
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
        this.method5245(new Class568(this, this.field4661.method19929(Class8349.method27841(), this, Class869.field4626, (List<Class1727>)this.field4663.method7611().stream().map((Function<? super Class1922, ?>)Class1921::method7620).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())), optional -> Class8349.method27855(optional, this::method5230, () -> {
            this.field4664.method5842(list);
            this.field4636.method5701();
            completableFuture.complete(null);
        }), true));
        return field4713;
    }
    
    private void method5242() {
        boolean b = false;
        final Class9509 method5787 = this.method5305().method5787();
        final Class6313 method5788 = method5787.method35429().method6452();
        final Iterator<Object> iterator = Class90.field208.iterator();
        while (iterator.hasNext()) {
            for (final Class7096 class7096 : iterator.next().method11876().method32902()) {
                if (class7096.method21710() == Class2115.field12307 && method5787.method35428(class7096) == method5788) {
                    Class869.field4622.debug("Missing model for: {}", (Object)class7096);
                    b = true;
                }
            }
        }
        final Class1912 method5789 = method5788.method18696();
        final Iterator<Object> iterator3 = Class90.field208.iterator();
        while (iterator3.hasNext()) {
            for (final Class7096 class7097 : iterator3.next().method11876().method32902()) {
                final Class1912 method5790 = method5787.method35427(class7097);
                if (!class7097.method21706() && method5790 == method5789) {
                    Class869.field4622.debug("Missing particle icon for: {}", (Object)class7097);
                    b = true;
                }
            }
        }
        final Class2265<Object> method5791 = Class2265.method8506();
        for (final Class3820 class7098 : Class90.field211) {
            method5791.clear();
            class7098.method11735(Class7207.field27998, (Class2265<Class8321>)method5791);
            for (final Class8321 class7099 : method5791) {
                final String method5792 = class7099.method27649();
                if (new Class2259(method5792, new Object[0]).getString().toLowerCase(Locale.ROOT).equals(class7098.method11717())) {
                    Class869.field4622.debug("Missing translation for: {} {} {}", (Object)class7099, (Object)method5792, (Object)class7099.method27622());
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
    
    public void method5244(Class527 field4700) {
        if (this.field4700 != null) {
            this.field4700.method2971();
        }
        if (field4700 == null && this.field4683 == null) {
            field4700 = new Class548();
        }
        else if (field4700 == null && this.field4684.method2664() <= 0.0f) {
            if (this.field4684.method4128()) {
                field4700 = new Class533(null, this.field4683.method6764().method29568());
            }
            else {
                this.field4684.method2842();
            }
        }
        if (field4700 instanceof Class548 || field4700 instanceof Class720) {
            this.field4648.field23466 = false;
            this.field4647.method3807().method3760(true);
        }
        this.field4700 = field4700;
        Class9463.method35173().method35193().method32155();
        if (field4700 != null) {
            this.field4650.method26964();
            Class350.method1054();
            field4700.method3038(this, this.field4632.method7696(), this.field4632.method7697());
            this.field4699 = false;
            Class7895.field32404.method25556(field4700.method3027());
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
            Class869.field4622.info("Stopping!");
            try {
                Class7895.field32404.method25562();
            }
            catch (final Throwable t) {}
            try {
                if (this.field4683 != null) {
                    this.field4683.method6751();
                }
                this.method5264();
            }
            catch (final Throwable t2) {}
            if (this.field4700 != null) {
                this.field4700.method2971();
            }
            this.close();
        }
        finally {
            Class8349.field34268 = System::nanoTime;
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
            this.field4636.close();
            this.field4668.method6427();
            this.field4663.close();
            this.field4640.method6474();
            this.field4677.close();
            this.field4676.close();
            this.field4629.close();
            Class8349.method27842();
        }
        catch (final Throwable t) {
            Class869.field4622.error("Shutdown failure!", t);
            throw t;
        }
        finally {
            this.field4631.close();
            this.field4632.close();
        }
    }
    
    private void method5247(final boolean b) {
        this.field4632.method7667("Pre render");
        final long method27838 = Class8349.method27838();
        this.field4660.method15295();
        if (this.field4632.method7663()) {
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
            this.field4633.method20527(Class8349.method27837());
            this.field4660.method15297("scheduledExecutables");
            this.method5383();
            this.field4660.method15299();
        }
        this.field4660.method15297("tick");
        if (b) {
            for (int i = 0; i < Math.min(10, this.field4633.field26527); ++i) {
                this.method5260();
            }
        }
        this.field4650.method26956();
        this.field4632.method7667("Render");
        this.field4660.method15300("sound");
        this.field4668.method6424(this.field4644.method5833());
        this.field4660.method15299();
        this.field4660.method15297("render");
        Class8726.method30059();
        Class8726.method30056(16640, Class869.field4623);
        this.field4667.method18395(true);
        Class9111.method32953();
        this.field4660.method15297("display");
        Class8726.method30040();
        this.field4660.method15299();
        if (!this.field4699) {
            this.field4660.method15300("gameRenderer");
            this.field4644.method5817(this.field4694 ? this.field4695 : this.field4633.field26528, method27838, b);
            this.field4660.method15300("toasts");
            this.field4678.method3849();
            this.field4660.method15299();
        }
        this.field4660.method15296();
        if (this.field4648.field23466 && this.field4648.field23467 && !this.field4648.field23464) {
            this.field4660.method15305().method19596();
            this.method5252();
        }
        else {
            this.field4660.method15305().method19594();
        }
        this.field4667.method18397();
        Class8726.method30060();
        Class8726.method30059();
        this.field4667.method18399(this.field4632.method7692(), this.field4632.method7693());
        Class8726.method30060();
        this.field4660.method15295();
        this.field4660.method15297("updateDisplay");
        this.field4632.method7680();
        final int method27839 = this.method5249();
        if (method27839 < Class6469.field25712.method19473()) {
            Class8726.method29994(method27839);
        }
        this.field4660.method15300("yield");
        Thread.yield();
        this.field4660.method15299();
        this.field4632.method7667("Post render");
        ++this.field4698;
        final boolean field4714 = this.method5284() && ((this.field4700 != null && this.field4700.method2991()) || (this.field4701 != null && this.field4701.method3305())) && !this.field4685.method1539();
        if (this.field4694 != field4714) {
            if (this.field4694) {
                this.field4695 = this.field4633.field26528;
            }
            else {
                this.field4633.field26528 = this.field4695;
            }
            this.field4694 = field4714;
        }
        final long method27840 = Class8349.method27838();
        this.field4657.method35167(method27840 - this.field4696);
        this.field4696 = method27840;
        while (Class8349.method27837() >= this.field4697 + 1000L) {
            Class869.field4706 = this.field4698;
            this.field4707 = String.format("%d fps T: %s%s%s%s B: %d", Class869.field4706, (this.field4648.field23383 == Class6469.field25712.method19473()) ? "inf" : Integer.valueOf(this.field4648.field23383), this.field4648.field23419 ? " vsync" : "", this.field4648.field23385 ? "" : " fast", (this.field4648.field23384 == Class2202.field13405) ? "" : ((this.field4648.field23384 == Class2202.field13406) ? " fast-clouds" : " fancy-clouds"), this.field4648.field23410);
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
        this.field4632.method7688(this.field4632.method7687(this.field4648.field23473, this.method5240()));
        if (this.field4700 != null) {
            this.field4700.method2970(this, this.field4632.method7696(), this.field4632.method7697());
            Class9463.method35173().method35193().method32153();
        }
        this.method5234().method18387(this.field4632.method7692(), this.field4632.method7693(), Class869.field4623);
        this.field4644.method5806(this.field4632.method7692(), this.field4632.method7693());
        this.field4650.method26961();
    }
    
    private int method5249() {
        return (this.field4683 != null || (this.field4700 == null && this.field4701 == null)) ? this.field4632.method7679() : ((Class9463.method35173().method35209() == Class2209.field13464) ? 120 : 60);
    }
    
    public void method5250() {
        try {
            Class869.field4681 = new byte[0];
            this.field4636.method5750();
        }
        catch (final Throwable t) {}
        try {
            System.gc();
            if (this.field4688 && this.field4685 != null) {
                this.field4685.method1456(true);
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
            Class8726.method30056(256, Class869.field4623);
            Class8726.method30057(5889);
            Class8726.method30058();
            Class8726.method30061(0.0, this.field4632.method7692(), this.field4632.method7693(), 0.0, 1000.0, 3000.0);
            Class8726.method30057(5888);
            Class8726.method30058();
            Class8726.method30065(0.0f, 0.0f, -2000.0f);
            Class8726.method30072(1.0f);
            Class8726.method30041();
            final Class7392 method17085 = Class7392.method22694();
            final Class4148 method17086 = method17085.method22696();
            final int n = this.field4632.method7692() - 160 - 10;
            final int n2 = this.field4632.method7693() - 320;
            Class8726.method30011();
            method17086.method12390(7, Class9237.field39615);
            method17086.method12432(n - 176.0f, n2 - 96.0f - 16.0f, 0.0).method12399(200, 0, 0, 0).method12397();
            method17086.method12432(n - 176.0f, n2 + 320, 0.0).method12399(200, 0, 0, 0).method12397();
            method17086.method12432(n + 176.0f, n2 + 320, 0.0).method12399(200, 0, 0, 0).method12397();
            method17086.method12432(n + 176.0f, n2 - 96.0f - 16.0f, 0.0).method12399(200, 0, 0, 0).method12397();
            method17085.method22695();
            Class8726.method30012();
            double n3 = 0.0;
            for (final Class1943 class1944 : method17084) {
                final int n4 = MathHelper.floor(class1944.field10592 / 4.0) + 1;
                method17086.method12390(6, Class9237.field39615);
                final int method17087 = class1944.method7893();
                final int n5 = method17087 >> 16 & 0xFF;
                final int n6 = method17087 >> 8 & 0xFF;
                final int n7 = method17087 & 0xFF;
                method17086.method12432(n, n2, 0.0).method12399(n5, n6, n7, 255).method12397();
                for (int i = n4; i >= 0; --i) {
                    final float n8 = (float)((n3 + class1944.field10592 * i / n4) * 6.2831854820251465 / 100.0);
                    method17086.method12432(n + MathHelper.sin(n8) * 160.0f, n2 - MathHelper.cos(n8) * 160.0f * 0.5f, 0.0).method12399(n5, n6, n7, 255).method12397();
                }
                method17085.method22695();
                method17086.method12390(5, Class9237.field39615);
                for (int j = n4; j >= 0; --j) {
                    final float n9 = (float)((n3 + class1944.field10592 * j / n4) * 6.2831854820251465 / 100.0);
                    final float n10 = MathHelper.sin(n9) * 160.0f;
                    final float n11 = MathHelper.cos(n9) * 160.0f * 0.5f;
                    if (n11 <= 0.0f) {
                        method17086.method12432(n + n10, n2 - n11, 0.0).method12399(n5 >> 1, n6 >> 1, n7 >> 1, 255).method12397();
                        method17086.method12432(n + n10, n2 - n11 + 10.0f, 0.0).method12399(n5 >> 1, n6 >> 1, n7 >> 1, 255).method12397();
                    }
                }
                method17085.method22695();
                n3 += class1944.field10592;
            }
            final DecimalFormat decimalFormat = new DecimalFormat("##0.00");
            decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
            Class8726.method30040();
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
            this.field4643.method6609(s, (float)(n - 160), (float)(n2 - 80 - 16), 16777215);
            final String string2 = decimalFormat.format(class1943.field10593) + "%";
            this.field4643.method6609(string2, (float)(n + 160 - this.field4643.method6617(string2)), (float)(n2 - 80 - 16), 16777215);
            for (int k = 0; k < method17084.size(); ++k) {
                final Class1943 class1945 = method17084.get(k);
                final StringBuilder sb = new StringBuilder();
                if ("unspecified".equals(class1945.field10595)) {
                    sb.append("[?] ");
                }
                else {
                    sb.append("[").append(k + 1).append("] ");
                }
                this.field4643.method6609(sb.append(class1945.field10595).toString(), (float)(n - 160), (float)(n2 + 80 + k * 8 + 20), class1945.method7893());
                final String string3 = decimalFormat.format(class1945.field10592) + "%";
                this.field4643.method6609(string3, (float)(n + 160 - 50 - this.field4643.method6617(string3)), (float)(n2 + 80 + k * 8 + 20), class1945.method7893());
                final String string4 = decimalFormat.format(class1945.field10593) + "%";
                this.field4643.method6609(string4, (float)(n + 160 - this.field4643.method6617(string4)), (float)(n2 + 80 + k * 8 + 20), class1945.method7893());
            }
        }
    }
    
    public void method5253() {
        if (this.field4704) {
            Class9463.method35173().method35178();
        }
        this.field4704 = false;
    }
    
    public boolean method5254() {
        return this.field4704;
    }
    
    public void method5255(final boolean b) {
        if (this.field4700 == null) {
            if (this.method5284() && !this.field4685.method1539()) {
                this.method5244(new Class551(!b));
                this.field4668.method6425();
            }
            else {
                this.method5244(new Class551(true));
            }
        }
    }
    
    private void method5256(final boolean b) {
        if (!b) {
            this.field4693 = 0;
        }
        if (this.field4693 <= 0 && !this.field4684.method2756()) {
            if (b && this.field4691 != null && this.field4691.method21449() == Class2165.field12881) {
                final Class7005 class7005 = (Class7005)this.field4691;
                final BlockPos method21447 = class7005.method21447();
                if (!this.field4683.method6701(method21447).method21706()) {
                    final Direction method21448 = class7005.method21448();
                    if (this.field4682.method27314(method21447, method21448)) {
                        this.field4640.method6487(method21447, method21448);
                        this.field4684.method2707(Class316.field1877);
                    }
                }
            }
            else {
                this.field4682.method27313();
            }
        }
    }
    
    private void method5257() {
        final Class5748 class5748 = new Class5748(Class1958.field10671);
        Class9463.method35173().method35188().method21097(class5748);
        if (class5748.method16962()) {
            return;
        }
        if (this.field4693 <= 0) {
            if (this.field4691 == null) {
                Class869.field4622.error("Null returned as 'hitResult', this shouldn't happen!");
                if (this.field4682.method27331()) {
                    this.field4693 = 10;
                }
            }
            else if (!this.field4684.method4134()) {
                Class5714 class5749 = null;
                if (this.field4691.method21449() == Class2165.field12882) {
                    class5749 = new Class5750(((Class7007)this.field4691).method21452(), true);
                    Class9463.method35173().method35188().method21097(class5749);
                    if (class5749.method16962()) {
                        return;
                    }
                }
                final boolean equals = Class9367.field40167.equals(Class7906.field32452);
                if (equals) {
                    this.field4684.method2707(Class316.field1877);
                }
                switch (Class8853.field37235[this.field4691.method21449().ordinal()]) {
                    case 1: {
                        this.field4682.method27321(this.field4684, ((Class7007)this.field4691).method21452());
                        if (class5749 != null) {
                            ((Class5750)class5749).method17060();
                            Class9463.method35173().method35188().method21097(class5749);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final Class7005 class5750 = (Class7005)this.field4691;
                        final BlockPos method21447 = class5750.method21447();
                        if (!this.field4683.method6701(method21447).method21706()) {
                            this.field4682.method27312(method21447, class5750.method21448());
                            break;
                        }
                    }
                    case 3: {
                        if (this.field4682.method27331()) {
                            this.field4693 = 10;
                        }
                        this.field4684.method2905();
                        break;
                    }
                }
                if (!equals) {
                    this.field4684.method2707(Class316.field1877);
                }
            }
        }
    }
    
    private void method5258() {
        final Class5748 class5748 = new Class5748(Class1958.field10672);
        Class9463.method35173().method35188().method21097(class5748);
        if (class5748.method16962()) {
            return;
        }
        if (!this.field4682.method27337()) {
            this.field4692 = 4;
            if (!this.field4684.method4134()) {
                if (this.field4691 == null) {
                    Class869.field4622.warn("Null returned as 'hitResult', this shouldn't happen!");
                }
                for (final Class316 class5749 : Class316.values()) {
                    final Class8321 method2715 = this.field4684.method2715(class5749);
                    if (this.field4691 != null) {
                        switch (Class8853.field37235[this.field4691.method21449().ordinal()]) {
                            case 1: {
                                final Class7007 class5750 = (Class7007)this.field4691;
                                final Entity method2716 = class5750.method21452();
                                Class2201 class5751 = this.field4682.method27323(this.field4684, method2716, class5750, class5749);
                                if (!class5751.method8374()) {
                                    class5751 = this.field4682.method27322(this.field4684, method2716, class5749);
                                }
                                if (class5751.method8374()) {
                                    if (class5751.method8375()) {
                                        this.field4684.method2707(class5749);
                                    }
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                final Class7005 class5752 = (Class7005)this.field4691;
                                final int method2717 = method2715.method27690();
                                final Class2201 method2718 = this.field4682.method27319(this.field4684, this.field4683, class5749, class5752);
                                if (method2718.method8374()) {
                                    if (method2718.method8375()) {
                                        this.field4684.method2707(class5749);
                                        if (!method2715.method27620() && (method2715.method27690() != method2717 || this.field4682.method27332())) {
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
                        final Class2201 method2719 = this.field4682.method27320(this.field4684, this.field4683, class5749);
                        if (method2719.method8374()) {
                            if (method2719.method8375() && Class9367.method34762() > Class7906.field32452.method25613()) {
                                this.field4684.method2707(class5749);
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
        this.field4660.method15297("gui");
        if (!this.field4694) {
            this.field4647.method3801();
        }
        this.field4660.method15299();
        this.field4644.method5807(1.0f);
        this.field4680.method32919(this.field4683, this.field4691);
        this.field4660.method15297("gameMode");
        if (!this.field4694 && this.field4683 != null) {
            this.field4682.method27316();
        }
        this.field4660.method15300("textures");
        if (this.field4683 != null) {
            this.field4629.method5857();
        }
        if (this.field4700 == null && this.field4684 != null) {
            if (this.field4684.method2664() <= 0.0f && !(this.field4700 instanceof Class533)) {
                this.method5244(null);
            }
            else if (this.field4684.method2783() && this.field4683 != null) {
                this.method5244(new Class536());
            }
        }
        else if (this.field4700 != null && this.field4700 instanceof Class536 && !this.field4684.method2783()) {
            this.method5244(null);
        }
        if (this.field4700 != null) {
            this.field4693 = 10000;
        }
        if (this.field4700 != null) {
            Class527.method3053(() -> this.field4700.method2992(), "Ticking screen", this.field4700.getClass().getCanonicalName());
        }
        if (!this.field4648.field23466) {
            this.field4647.method3814();
        }
        if (this.field4701 == null && (this.field4700 == null || this.field4700.field3155)) {
            this.field4660.method15300("Keybindings");
            this.method5261();
            if (this.field4693 > 0) {
                --this.field4693;
            }
        }
        if (this.field4683 != null) {
            this.field4660.method15300("gameRenderer");
            if (!this.field4694) {
                this.field4644.method5804();
            }
            this.field4660.method15300("levelRenderer");
            if (!this.field4694) {
                this.field4636.method5718();
            }
            this.field4660.method15300("level");
            if (!this.field4694) {
                if (this.field4683.method6848() > 0) {
                    this.field4683.method6786(this.field4683.method6848() - 1);
                }
                this.field4683.method6807();
            }
        }
        else if (this.field4644.method5805() != null) {
            this.field4644.method5800();
        }
        if (!this.field4694) {
            this.field4669.method26545();
        }
        this.field4668.method6428(this.field4694);
        if (this.field4683 != null) {
            if (!this.field4694) {
                this.field4683.method6734(this.field4683.method6954() != Class2113.field12290, true);
                this.field4680.method32925();
                try {
                    this.field4683.method6805(() -> true);
                }
                catch (final Throwable t) {
                    final Class7689 method24421 = Class7689.method24421(t, "Exception in world tick");
                    if (this.field4683 == null) {
                        method24421.method24418("Affected level").method16297("Problem", "Level is null!");
                    }
                    else {
                        this.field4683.method6779(method24421);
                    }
                    throw new Class2365(method24421);
                }
            }
            this.field4660.method15300("animateTick");
            if (!this.field4694 && this.field4683 != null) {
                this.field4683.method6825(MathHelper.floor(this.field4684.method1938()), MathHelper.floor(this.field4684.method1941()), MathHelper.floor(this.field4684.method1945()));
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
        this.field4660.method15299();
    }
    
    private void method5261() {
        while (this.field4648.field23452.method1058()) {
            final Class5760 field4648 = this.field4648;
            ++field4648.field23465;
            if (this.field4648.field23465 > 2) {
                this.field4648.field23465 = 0;
            }
            if (this.field4648.field23465 == 0) {
                this.field4644.method5802(this.method5303());
            }
            else if (this.field4648.field23465 == 1) {
                this.field4644.method5802(null);
            }
            this.field4636.method5755();
        }
        while (this.field4648.field23453.method1058()) {
            this.field4648.field23470 = !this.field4648.field23470;
        }
        for (int i = 0; i < 9; ++i) {
            final boolean method1056 = this.field4648.field23458.method1056();
            final boolean method1057 = this.field4648.field23459.method1056();
            if (this.field4648.field23457[i].method1058()) {
                if (this.field4684.method1639()) {
                    this.field4647.method3810().method3320(i);
                }
                else if (!this.field4684.method2889() || this.field4700 != null || (!method1057 && !method1056)) {
                    this.field4684.field3006.field2743 = i;
                }
                else {
                    Class525.method3019(this, i, method1057, method1056);
                }
            }
        }
        while (this.field4648.field23442.method1058()) {
            if (this.field4682.method27334()) {
                this.field4684.method4118();
            }
            else {
                this.field4680.method32921();
                this.method5244(new Class518(this.field4684));
            }
        }
        while (this.field4648.field23456.method1058()) {
            this.method5244(new Class557(this.field4684.field4069.method17374()));
        }
        while (this.field4648.field23443.method1058()) {
            if (!this.field4684.method1639()) {
                this.method5269().method17292(new Class4399(Class2003.field11246, BlockPos.ZERO, Direction.DOWN));
            }
        }
        while (this.field4648.field23444.method1058()) {
            if (!this.field4684.method1639() && this.field4684.method2821(Class527.method3046())) {
                this.field4684.method2707(Class316.field1877);
            }
        }
        if (this.field4648.field23389 != Class2047.field11663) {
            while (this.field4648.field23448.method1058()) {
                this.method5244(new Class535(""));
            }
            if (this.field4700 == null && this.field4701 == null && this.field4648.field23450.method1058()) {
                this.method5244(new Class535("/"));
            }
        }
        if (this.field4684.method2756()) {
            if (!this.field4648.field23445.method1056() && !this.field4648.field23445.method1056()) {
                final Class5751 class5751 = new Class5751();
                Class9463.method35173().method35188().method21097(class5751);
                if (!class5751.method16962()) {
                    this.field4682.method27329(this.field4684);
                }
            }
            while (this.field4648.field23446.method1058()) {}
            while (this.field4648.field23445.method1058()) {}
            while (this.field4648.field23447.method1058()) {}
        }
        else {
            while (this.field4648.field23446.method1058()) {
                this.method5257();
            }
            while (this.field4648.field23445.method1058()) {
                this.method5258();
            }
            while (this.field4648.field23447.method1058()) {
                this.method5273();
            }
        }
        if (this.field4648.field23445.method1056() && this.field4692 == 0 && !this.field4684.method2756()) {
            this.method5258();
        }
        this.method5256(this.field4700 == null && this.field4648.field23446.method1056() && this.field4650.method26962());
    }
    
    public void method5262(final String s, final String s2, Class8511 class8511) {
        this.method5264();
        final Class8642 method25787 = this.field4656.method25787(s, null);
        Class8660 method25788 = method25787.method29394();
        if (method25788 == null && class8511 != null) {
            method25788 = new Class8660(class8511, s);
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
            final Class8608 class8512 = new Class8608(profileRepository, new File(this.field4652, Class394.field2293.getName()));
            Class493.method2502(class8512);
            Class493.method2503(minecraftSessionService);
            Class8608.method29191(false);
            (this.field4685 = new Class1655(this, s, s2, class8511, yggdrasilAuthenticationService, minecraftSessionService, profileRepository, class8512, n -> {
                final Class6461 newValue = new Class6461(n + 0);
                newValue.method19323();
                this.field4646.set(newValue);
                return new Class6458(newValue, this.field4712::add);
            })).method1476();
            this.field4688 = true;
        }
        catch (final Throwable t) {
            final Class7689 method25789 = Class7689.method24421(t, "Starting integrated server");
            final Class5204 method25790 = method25789.method24418("Starting integrated server");
            method25790.method16297("Level ID", s);
            method25790.method16297("Level Name", s2);
            throw new Class2365(method25789);
        }
        while (this.field4646.get() == null) {
            Thread.yield();
        }
        final Class695 class8513 = new Class695(this.field4646.get());
        this.method5244(class8513);
        while (!this.field4685.method1542()) {
            class8513.method2992();
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
        final SocketAddress method25791 = this.field4685.method1541().method24061();
        final Class3641 method25792 = Class3641.method11184(method25791);
        method25792.method11173(new Class5808(method25792, this, null, p0 -> {}));
        method25792.method11174(new Class4398(method25791.toString(), 0, Class2208.field13457));
        method25792.method11174(new Class4327(this.method5287().method33694()));
        this.field4687 = method25792;
    }
    
    public void method5263(final Class1848 field4683) {
        final Class731 class731 = new Class731();
        class731.method4036(new Class2259("connect.joining", new Object[0]));
        this.method5266(class731);
        this.method5267(this.field4683 = field4683);
        Class9463.method35173().method35188().method21097(new Class5732());
        if (!this.field4688) {
            final YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(this.field4655, UUID.randomUUID().toString());
            final MinecraftSessionService minecraftSessionService = ((AuthenticationService)yggdrasilAuthenticationService).createMinecraftSessionService();
            Class493.method2502(new Class8608(((AuthenticationService)yggdrasilAuthenticationService).createProfileRepository(), new File(this.field4652, Class394.field2293.getName())));
            Class493.method2503(minecraftSessionService);
            Class8608.method29191(false);
        }
    }
    
    public void method5264() {
        this.method5265(new Class731());
    }
    
    public void method5265(final Class527 class527) {
        final Class5799 method5269 = this.method5269();
        if (method5269 != null) {
            this.method5382();
            method5269.method17270();
        }
        final Class1655 field4685 = this.field4685;
        this.field4685 = null;
        this.field4644.method5821();
        this.field4682 = null;
        Class7895.field32404.method25561();
        this.method5266(class527);
        if (this.field4683 != null) {
            if (field4685 != null) {
                while (!field4685.method1477()) {
                    this.method5247(false);
                }
            }
            this.field4662.method25744();
            this.field4647.method3812();
            this.field4686 = null;
            this.field4688 = false;
            this.field4679.method25568();
        }
        this.field4683 = null;
        this.method5267(null);
        this.field4684 = null;
    }
    
    private void method5266(final Class527 class527) {
        this.field4669.method26547();
        this.field4668.method6426();
        this.field4689 = null;
        this.field4687 = null;
        this.method5244(class527);
        this.method5247(false);
    }
    
    private void method5267(final Class1848 class1848) {
        this.field4636.method5700(class1848);
        this.field4640.method6485(class1848);
        Class9550.field41126.method35730(class1848);
        this.method5227();
    }
    
    public final boolean method5268() {
        return this.field4659;
    }
    
    @Nullable
    public Class5799 method5269() {
        return (this.field4684 == null) ? null : this.field4684.field4069;
    }
    
    public static boolean method5270() {
        return !Class869.field4621.field4648.field23464;
    }
    
    public static boolean method5271() {
        return Class869.field4621.field4648.field23385;
    }
    
    public static boolean method5272() {
        return Class869.field4621.field4648.field23386 != Class2007.field11398;
    }
    
    private void method5273() {
        final Class5748 class5748 = new Class5748(Class1958.field10673);
        Class9463.method35173().method35188().method21097(class5748);
        if (class5748.method16962()) {
            return;
        }
        if (this.field4691 != null && this.field4691.method21449() != Class2165.field12880) {
            final boolean field27304 = this.field4684.field3025.field27304;
            Class436 method6727 = null;
            final Class2165 method6728 = this.field4691.method21449();
            Class8321 class5749;
            if (method6728 == Class2165.field12881) {
                final BlockPos method6729 = ((Class7005)this.field4691).method21447();
                final Class7096 method6730 = this.field4683.method6701(method6729);
                final Class3833 method6731 = method6730.method21696();
                if (method6730.method21706()) {
                    return;
                }
                class5749 = method6731.method11862(this.field4683, method6729, method6730);
                if (class5749.method27620()) {
                    return;
                }
                if (field27304 && Class527.method3046() && method6731.method11802()) {
                    method6727 = this.field4683.method6727(method6729);
                }
            }
            else {
                if (method6728 != Class2165.field12882 || !field27304) {
                    return;
                }
                final Entity method6732 = ((Class7007)this.field4691).method21452();
                if (method6732 instanceof Class861) {
                    class5749 = new Class8321(Class7739.field31340);
                }
                else if (method6732 instanceof Class863) {
                    class5749 = new Class8321(Class7739.field31551);
                }
                else if (method6732 instanceof Class862) {
                    final Class8321 method6733 = ((Class862)method6732).method5198();
                    if (method6733.method27620()) {
                        class5749 = new Class8321(Class7739.field31515);
                    }
                    else {
                        class5749 = method6733.method27641();
                    }
                }
                else if (method6732 instanceof Class428) {
                    Class3820 class5750 = null;
                    switch (Class8853.field37236[((Class428)method6732).method2139().ordinal()]) {
                        case 1: {
                            class5750 = Class7739.field31373;
                            break;
                        }
                        case 2: {
                            class5750 = Class7739.field31372;
                            break;
                        }
                        case 3: {
                            class5750 = Class7739.field31537;
                            break;
                        }
                        case 4: {
                            class5750 = Class7739.field31538;
                            break;
                        }
                        case 5: {
                            class5750 = Class7739.field31553;
                            break;
                        }
                        default: {
                            class5750 = Class7739.field31352;
                            break;
                        }
                    }
                    class5749 = new Class8321(class5750);
                }
                else if (method6732 instanceof Class423) {
                    class5749 = new Class8321(((Class423)method6732).method2040());
                }
                else if (method6732 instanceof Class857) {
                    class5749 = new Class8321(Class7739.field31546);
                }
                else if (method6732 instanceof Class858) {
                    class5749 = new Class8321(Class7739.field31572);
                }
                else {
                    final Class3831 method6734 = Class3831.method11771(method6732.method1642());
                    if (method6734 == null) {
                        return;
                    }
                    class5749 = new Class8321(method6734);
                }
            }
            if (class5749.method27620()) {
                String s = "";
                if (method6728 == Class2165.field12881) {
                    s = Class90.field208.method503(this.field4683.method6701(((Class7005)this.field4691).method21447()).method21696()).toString();
                }
                else if (method6728 == Class2165.field12882) {
                    s = Class90.field210.method503(((Class7007)this.field4691).method21452().method1642()).toString();
                }
                Class869.field4622.warn("Picking on: [{}] {} gave null item", (Object)method6728, (Object)s);
            }
            else {
                final Class464 field27305 = this.field4684.field3006;
                if (method6727 != null) {
                    this.method5274(class5749, method6727);
                }
                final int method6735 = field27305.method2353(class5749);
                if (field27304) {
                    field27305.method2350(class5749);
                    this.field4682.method27327(this.field4684.method2715(Class316.field1877), 36 + field27305.field2743);
                }
                else if (method6735 != -1) {
                    if (Class464.method2352(method6735)) {
                        field27305.field2743 = method6735;
                    }
                    else {
                        this.field4682.method27338(method6735);
                    }
                }
            }
        }
    }
    
    private Class8321 method5274(final Class8321 class8321, final Class436 class8322) {
        final Class51 method2180 = class8322.method2180(new Class51());
        if (class8321.method27622() instanceof Class4046 && method2180.method315("Owner")) {
            class8321.method27658().method295("SkullOwner", method2180.method327("Owner"));
            return class8321;
        }
        class8321.method27676("BlockEntityTag", method2180);
        final Class51 class8323 = new Class51();
        final Class52 class8324 = new Class52();
        ((AbstractList<Class50>)class8324).add(Class50.method290("\"(+NBT)\""));
        class8323.method295("Lore", class8324);
        class8321.method27676("display", class8323);
        return class8321;
    }
    
    public Class7689 method5275(final Class7689 class7689) {
        method5276(this.field4664, this.field4653, this.field4648, class7689);
        if (this.field4683 != null) {
            this.field4683.method6779(class7689);
        }
        return class7689;
    }
    
    public static void method5276(final Class1661 class1661, final String s, final Class5760 class1662, final Class7689 class1663) {
        final Class5204 method24417 = class1663.method24417();
        method24417.method16296("Launched Version", () -> s2);
        method24417.method16296("Backend library", Class8726::method30077);
        method24417.method16296("Backend API", Class8726::method30078);
        method24417.method16296("GL Caps", Class8726::method30085);
        method24417.method16296("Using VBOs", () -> "Yes");
        method24417.method16296("Is Modded", () -> {
            Class7932.method25729();
            final String s3;
            if (!"vanilla".equals(s3)) {
                return "Definitely; Client brand changed to '" + s3 + "'";
            }
            else {
                return (Class869.class.getSigners() == null) ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and client brand is untouched.";
            }
        });
        method24417.method16297("Type", "Client (map_client.txt)");
        if (class1662 != null) {
            method24417.method16296("Resource Packs", () -> {
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
            method24417.method16296("Current Language", () -> class1665.method5845().toString());
        }
        method24417.method16296("CPU", Class7691::method24459);
    }
    
    public static Class869 method5277() {
        return Class869.field4621;
    }
    
    public CompletableFuture<Void> method5278() {
        return this.method5377(this::method5241).thenCompose(completableFuture -> completableFuture);
    }
    
    @Override
    public void method1516(final Class9037 class9037) {
        class9037.method32486("fps", Class869.field4706);
        class9037.method32486("vsync_enabled", this.field4648.field23419);
        class9037.method32486("display_frequency", this.field4632.method7662());
        class9037.method32486("display_type", this.field4632.method7691() ? "fullscreen" : "windowed");
        class9037.method32486("run_time", (Class8349.method27837() - class9037.method32491()) / 60L * 1000L);
        class9037.method32486("current_action", this.method5280());
        class9037.method32486("language", (this.field4648.field23476 == null) ? "en_us" : this.field4648.field23476);
        class9037.method32486("endianness", (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) ? "little" : "big");
        class9037.method32486("subtitles", this.field4648.field23427);
        class9037.method32486("touch", this.field4648.field23429 ? "touch" : "mouse");
        int i = 0;
        for (final Class1922 class9038 : this.field4663.method7611()) {
            if (!class9038.method7622() && !class9038.method7623()) {
                class9037.method32486("resource_pack[" + i++ + "]", class9038.method7621());
            }
        }
        class9037.method32486("resource_packs", i);
        if (this.field4685 != null) {
            class9037.method32486("snooper_partner", this.field4685.method1547().method32490());
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
        if (this.field4685 != null) {
            return this.field4685.method1539() ? "hosting_lan" : "singleplayer";
        }
        if (this.field4686 != null) {
            return this.field4686.method35871() ? "playing_lan" : "multiplayer";
        }
        return "out_of_game";
    }
    
    public void method5281(final Class9575 field4686) {
        this.field4686 = field4686;
    }
    
    @Nullable
    public Class9575 method5282() {
        return this.field4686;
    }
    
    public boolean method5283() {
        return this.field4688;
    }
    
    public boolean method5284() {
        return this.field4688 && this.field4685 != null;
    }
    
    @Nullable
    public Class1655 method5285() {
        return this.field4685;
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
    
    public Function<Class1932, Class1912> method5296(final Class1932 class1932) {
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
        if (this.field4700 instanceof Class697) {
            return Class264.field1264;
        }
        if (this.field4684 == null) {
            return Class264.field1261;
        }
        if (this.field4684.field2391.field10063 instanceof Class6739) {
            return Class264.field1265;
        }
        if (this.field4684.field2391.field10063 instanceof Class6738) {
            return this.field4647.method3813().method3334() ? Class264.field1266 : Class264.field1267;
        }
        final Class2140 method9870 = this.field4684.field2391.method6959(new BlockPos(this.field4684)).method9870();
        if (!this.field4669.method26548(Class264.field1268) && (!this.field4684.method1712() || this.field4669.method26548(Class264.field1262) || (method9870 != Class2140.field12596 && method9870 != Class2140.field12598))) {
            return (this.field4684.field3025.field27304 && this.field4684.field3025.field27303) ? Class264.field1263 : Class264.field1262;
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
    
    public Class1796 method5307() {
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
        return this.field4633.field26528;
    }
    
    public float method5315() {
        return this.field4633.field26529;
    }
    
    public Class7860 method5316() {
        return this.field4665;
    }
    
    public boolean method5317() {
        return (this.field4684 != null && this.field4684.method2896()) || this.field4648.field23425;
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
    
    public Class5028 method5327() {
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
        return this.field4632;
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
        return Class869.field4706;
    }
    
    static {
        field4622 = LogManager.getLogger();
        field4623 = (Class8349.method27845() == Class306.field1834);
        field4624 = new Class1932("default");
        field4625 = new Class1932("alt");
        field4626 = CompletableFuture.completedFuture(Class315.field1875);
        Class869.field4681 = new byte[10485760];
    }
}
