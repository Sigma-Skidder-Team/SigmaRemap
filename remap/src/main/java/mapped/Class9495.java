// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import java.util.regex.Matcher;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList;

import java.util.List;

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
       this.field40840 = new Class2259("optimizeWorld.stage.counting");
        this.field40828 = class7953.method29549();
        this.field40829 = field40829;
        (this.field40830 = class7952.method25787(s, null)).method29395(class7953);
        this.field40842 = new Class8213(new File(DimensionType.field2223.method1272(this.field40830.method29392()), "data"), this.field40830.method29400());
        this.field40832 = this.field40830.method29392();
        (this.field40831 = Class9495.field40827.newThread(this::method35336)).setUncaughtExceptionHandler((p0, t2) -> {
            Class9495.field40826.error("Error upgrading world", t2);
            this.field40840 = new Class2259("optimizeWorld.stage.failed");
            this.field40834 = true;
        });
        this.field40831.start();
        field40839 = null;
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
        if (this.field40836 == 0) {
            this.field40834 = true;
        }
        else {
            final float n = (float)this.field40836;
            final long method29394 = Util.method27837();
            this.field40840 = new Class2259("optimizeWorld.stage.upgrading");
            while (this.field40833) {
                boolean b = false;
                float field40835 = 0.0f;
                this.field40835 = field40835;
                if (!b) {
                    this.field40833 = false;
                }
            }
            this.field40842.method27214();
            Class9495.field40826.info("World optimizaton finished after {} ms", Util.method27837() - method29394);
            this.field40834 = true;
        }
    }
    
    private List<ChunkPos> method35337(final DimensionType class383) {
        final File file = new File(class383.method1272(this.field40832), "region");
        final File[] listFiles = file.listFiles((p0, s) -> s.endsWith(".mca"));
        if (listFiles == null) {
            return ImmutableList.of();
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
                            final ChunkPos class385 = new ChunkPos(j + n, k + n2);
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
        return this.field40839.getFloat(class383);
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
