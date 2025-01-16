// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import java.util.regex.Matcher;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList;

import java.util.List;

import com.google.common.collect.ImmutableMap$Builder;
import java.io.IOException;
import java.util.ListIterator;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
import it.unimi.dsi.fastutil.Hash$Strategy;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap;
import java.util.regex.Pattern;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import java.io.File;
import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.Logger;

public class Class9495
{
    private static final Logger field40826;
    private static final ThreadFactory field40827;
    private final String field40828;
    private final boolean field40829;
    private final Class8642 field40830;
    private final Thread field40831;
    private final File field40832;
    private volatile boolean field40833;
    private volatile boolean field40834;
    private volatile float field40835;
    private volatile int field40836;
    private volatile int field40837;
    private volatile int field40838;
    private final Object2FloatMap<DimensionType> field40839;
    private volatile ITextComponent field40840;
    private static final Pattern field40841;
    private final Class8213 field40842;
    
    public Class9495(final String s, final Class7952 class7952, final WorldInfo class7953, final boolean field40829) {
        this.field40833 = true;
        this.field40839 = (Object2FloatMap<DimensionType>)Object2FloatMaps.synchronize((Object2FloatMap)new Object2FloatOpenCustomHashMap((Hash$Strategy) Util.method27852()));
        this.field40840 = new Class2259("optimizeWorld.stage.counting", new Object[0]);
        this.field40828 = class7953.method29549();
        this.field40829 = field40829;
        (this.field40830 = class7952.method25787(s, null)).method29395(class7953);
        this.field40842 = new Class8213(new File(DimensionType.field2223.method1272(this.field40830.method29392()), "data"), this.field40830.method29400());
        this.field40832 = this.field40830.method29392();
        (this.field40831 = Class9495.field40827.newThread(this::method35336)).setUncaughtExceptionHandler((p0, t2) -> {
            Class9495.field40826.error("Error upgrading world", t2);
            this.field40840 = new Class2259("optimizeWorld.stage.failed", new Object[0]);
            this.field40834 = true;
            return;
        });
        this.field40831.start();
    }
    
    public void method35335() {
        this.field40833 = false;
        try {
            this.field40831.join();
        }
        catch (final InterruptedException ex) {}
    }
    
    private void method35336() {
        final File method29392 = this.field40830.method29392();
        this.field40836 = 0;
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        for (final DimensionType class383 : DimensionType.method1269()) {
            final List<Class7859> method29393 = this.method35337(class383);
            builder.put((Object)class383, (Object)method29393.listIterator());
            this.field40836 += method29393.size();
        }
        if (this.field40836 == 0) {
            this.field40834 = true;
        }
        else {
            final float n = (float)this.field40836;
            final ImmutableMap build = builder.build();
            final ImmutableMap$Builder builder2 = ImmutableMap.builder();
            for (final DimensionType class384 : DimensionType.method1269()) {
                builder2.put((Object)class384, (Object)new Class387(new File(class384.method1272(method29392), "region"), this.field40830.method29400()));
            }
            final ImmutableMap build2 = builder2.build();
            final long method29394 = Util.method27837();
            this.field40840 = new Class2259("optimizeWorld.stage.upgrading", new Object[0]);
            while (this.field40833) {
                boolean b = false;
                float field40835 = 0.0f;
                for (final DimensionType class385 : DimensionType.method1269()) {
                    final ListIterator listIterator = (ListIterator)build.get((Object)class385);
                    final Class387 class386 = (Class387)build2.get((Object)class385);
                    if (listIterator.hasNext()) {
                        final Class7859 class387 = listIterator.next();
                        boolean b2 = false;
                        try {
                            final CompoundNBT method29395 = class386.method1309(class387);
                            if (method29395 != null) {
                                final int method29396 = Class387.method1308(method29395);
                                final CompoundNBT method29397 = class386.method1307(class385, () -> this.field40842, method29395);
                                final CompoundNBT method29398 = method29397.getCompound("Level");
                                final Class7859 class388 = new Class7859(method29398.getInt("xPos"), method29398.getInt("zPos"));
                                if (!class388.equals(class387)) {
                                    Class9495.field40826.warn("Chunk {} has invalid position {}", (Object)class387, (Object)class388);
                                }
                                boolean b3 = method29396 < Class9528.method35579().getWorldVersion();
                                if (this.field40829) {
                                    final boolean b4 = b3 || method29398.contains("Heightmaps");
                                    method29398.remove("Heightmaps");
                                    b3 = (b4 || method29398.contains("isLightOn"));
                                    method29398.remove("isLightOn");
                                }
                                if (b3) {
                                    class386.method1310(class387, method29397);
                                    b2 = true;
                                }
                            }
                        }
                        catch (final ReportedException class389) {
                            if (!(class389.getCause() instanceof IOException)) {
                                throw class389;
                            }
                            goto Label_0560;
                        }
                        catch (final IOException ex) {
                            Class9495.field40826.error("Error upgrading chunk {}", (Object)class387, (Object)ex);
                        }
                        if (b2) {
                            ++this.field40837;
                        }
                        else {
                            ++this.field40838;
                        }
                        b = true;
                    }
                    final float n2 = listIterator.nextIndex() / n;
                    this.field40839.put((Object)class385, n2);
                    field40835 += n2;
                }
                this.field40835 = field40835;
                if (!b) {
                    this.field40833 = false;
                }
            }
            this.field40840 = new Class2259("optimizeWorld.stage.finished", new Object[0]);
            for (final Class387 class390 : build2.values()) {
                try {
                    class390.close();
                }
                catch (final IOException ex2) {
                    Class9495.field40826.error("Error upgrading chunk", (Throwable)ex2);
                }
            }
            this.field40842.method27214();
            Class9495.field40826.info("World optimizaton finished after {} ms", (Object)(Util.method27837() - method29394));
            this.field40834 = true;
        }
    }
    
    private List<Class7859> method35337(final DimensionType class383) {
        final File file = new File(class383.method1272(this.field40832), "region");
        final File[] listFiles = file.listFiles((p0, s) -> s.endsWith(".mca"));
        if (listFiles == null) {
            return (List<Class7859>)ImmutableList.of();
        }
        final ArrayList arrayList = Lists.newArrayList();
        for (final File file2 : listFiles) {
            final Matcher matcher = Class9495.field40841.matcher(file2.getName());
            if (matcher.matches()) {
                final int n = Integer.parseInt(matcher.group(1)) << 5;
                final int n2 = Integer.parseInt(matcher.group(2)) << 5;
                try (final Class1924 class384 = new Class1924(file2, file)) {
                    for (int j = 0; j < 32; ++j) {
                        for (int k = 0; k < 32; ++k) {
                            final Class7859 class385 = new Class7859(j + n, k + n2);
                            if (class384.method7649(class385)) {
                                arrayList.add(class385);
                            }
                        }
                    }
                }
                catch (final Throwable t3) {}
            }
        }
        return arrayList;
    }
    
    public boolean method35338() {
        return this.field40834;
    }
    
    public float method35339(final DimensionType class383) {
        return this.field40839.getFloat((Object)class383);
    }
    
    public float method35340() {
        return this.field40835;
    }
    
    public int method35341() {
        return this.field40836;
    }
    
    public int method35342() {
        return this.field40837;
    }
    
    public int method35343() {
        return this.field40838;
    }
    
    public ITextComponent method35344() {
        return this.field40840;
    }
    
    static {
        field40826 = LogManager.getLogger();
        field40827 = new ThreadFactoryBuilder().setDaemon(true).build();
        field40841 = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
    }
}
