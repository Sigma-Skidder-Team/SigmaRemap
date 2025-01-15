// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;

import java.util.ArrayList;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import com.google.common.collect.Lists;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import java.util.Locale;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.ReentrantLock;
import java.io.File;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

public class Class7937 implements Class7938
{
    private static final Logger field32606;
    private static final Pattern field32607;
    private final Class1728 field32608;
    private final File field32609;
    private final ReentrantLock field32610;
    private final Class8175 field32611;
    private CompletableFuture<?> field32612;
    private Class1922 field32613;
    
    public Class7937(final File field32609, final Class8175 field32610) {
        this.field32610 = new ReentrantLock();
        this.field32609 = field32609;
        this.field32611 = field32610;
        this.field32608 = new Class1729(field32610);
    }
    
    @Override
    public <T extends Class1921> void method25739(final Map<String, T> map, final Class6712<T> class6712) {
        final Class1921 method7615 = Class1921.method7615("vanilla", true, () -> this.field32608, class6712, Class2043.field11643);
        if (method7615 != null) {
            map.put("vanilla", (T)method7615);
        }
        if (this.field32613 != null) {
            map.put("server", (T)this.field32613);
        }
        final File method7616 = this.field32611.method27064(new Class1932("resourcepacks/programmer_art.zip"));
        if (method7616 != null) {
            if (method7616.isFile()) {
                final Class1921 method7617 = Class1921.method7615("programer_art", false, () -> new Class1734(this, file), class6712, Class2043.field11642);
                if (method7617 != null) {
                    map.put("programer_art", (T)method7617);
                }
            }
        }
    }
    
    public Class1728 method25740() {
        return this.field32608;
    }
    
    public static Map<String, String> method25741() {
        final HashMap hashMap = Maps.newHashMap();
        hashMap.put("X-Minecraft-Username", Class869.method5277().method5287().method33692());
        hashMap.put("X-Minecraft-UUID", Class869.method5277().method5287().method33691());
        hashMap.put("X-Minecraft-Version", Class9528.method35579().getName());
        hashMap.put("X-Minecraft-Version-ID", Class9528.method35579().getId());
        hashMap.put("X-Minecraft-Pack-Format", String.valueOf(Class9528.method35579().getPackVersion()));
        hashMap.put("User-Agent", "Minecraft Java/" + Class9528.method35579().getName());
        return hashMap;
    }
    
    public CompletableFuture<?> method25742(final String s, final String input) {
        final String sha1Hex = DigestUtils.sha1Hex(s);
        final String s2 = Class7937.field32607.matcher(input).matches() ? input : "";
        this.field32610.lock();
        CompletableFuture<?> field32612;
        try {
            this.method25744();
            this.method25746();
            final File file = new File(this.field32609, sha1Hex);
            CompletableFuture<?> completableFuture;
            if (file.exists()) {
                completableFuture = CompletableFuture.completedFuture("");
            }
            else {
                final Class731 class731 = new Class731();
                final Map<String, String> method25741 = method25741();
                final Class869 method25742 = Class869.method5277();
                method25742.method5380(() -> class732.method5244(class733));
                completableFuture = Class7676.method24364(file, s, method25741, 104857600, class731, method25742.method5289());
            }
            this.field32612 = completableFuture.thenCompose(p2 -> {
                Object o2;
                if (this.method25745(s3, obj)) {
                    o2 = this.method25747(obj);
                }
                else {
                    new RuntimeException("Hash check failure for file " + obj + ", see log");
                    final Throwable t;
                    o2 = Class8349.method27843(t);
                }
                return o2;
            }).whenComplete((p1, t3) -> {
                if (t3 != null) {
                    Class7937.field32606.warn("Pack application failed: {}, deleting file {}", (Object)t3.getMessage(), (Object)file2);
                    method25743(file2);
                }
                return;
            });
            field32612 = this.field32612;
        }
        finally {
            this.field32610.unlock();
        }
        return field32612;
    }
    
    private static void method25743(final File file) {
        try {
            Files.delete(file.toPath());
        }
        catch (final IOException ex) {
            Class7937.field32606.warn("Failed to delete file {}: {}", (Object)file, (Object)ex.getMessage());
        }
    }
    
    public void method25744() {
        this.field32610.lock();
        try {
            if (this.field32612 != null) {
                this.field32612.cancel(true);
            }
            this.field32612 = null;
            if (this.field32613 != null) {
                this.field32613 = null;
                Class869.method5277().method5278();
            }
        }
        finally {
            this.field32610.unlock();
        }
    }
    
    private boolean method25745(final String s, final File file) {
        try (final FileInputStream fileInputStream = new FileInputStream(file)) {
            final String sha1Hex = DigestUtils.sha1Hex((InputStream)fileInputStream);
            if (s.isEmpty()) {
                Class7937.field32606.info("Found file {} without verification hash", (Object)file);
                return true;
            }
            if (sha1Hex.toLowerCase(Locale.ROOT).equals(s.toLowerCase(Locale.ROOT))) {
                Class7937.field32606.info("Found file {} matching requested hash {}", (Object)file, (Object)s);
                return true;
            }
            Class7937.field32606.warn("File {} had wrong hash (expected {}, found {}).", (Object)file, (Object)s, (Object)sha1Hex);
            return false;
        }
        catch (final IOException ex) {
            Class7937.field32606.warn("File {} couldn't be hashed.", (Object)file, (Object)ex);
        }
        return false;
    }
    
    private void method25746() {
        try {
            final ArrayList arrayList = Lists.newArrayList((Iterable)FileUtils.listFiles(this.field32609, TrueFileFilter.TRUE, (IOFileFilter)null));
            arrayList.sort(LastModifiedFileComparator.LASTMODIFIED_REVERSE);
            int n = 0;
            for (final File file : arrayList) {
                if (n++ >= 10) {
                    Class7937.field32606.info("Deleting old server resource pack {}", (Object)file.getName());
                    FileUtils.deleteQuietly(file);
                }
            }
        }
        catch (final IllegalArgumentException ex) {
            Class7937.field32606.error("Error while deleting old server resource pack : {}", (Object)ex.getMessage());
        }
    }
    
    public CompletableFuture<Void> method25747(final File file) {
        Class8545 class8545 = null;
        Class1846 method6637 = null;
        Object message = null;
        try (final Class1733 class8546 = new Class1733(file)) {
            class8545 = class8546.method6101((Class5092<Class8545>)Class8545.field35888);
            try (final InputStream method6638 = class8546.method6096("pack.png")) {
                method6637 = Class1846.method6637(method6638);
            }
            catch (final IllegalArgumentException | IOException ex) {
                Class7937.field32606.info("Could not read pack.png: {}", (Object)((Throwable)ex).getMessage());
            }
        }
        catch (final IOException ex2) {
            message = ex2.getMessage();
        }
        if (message != null) {
            return (CompletableFuture<Void>)Class8349.method27843(new RuntimeException(String.format("Invalid resourcepack at %s: %s", file, message)));
        }
        Class7937.field32606.info("Applying server pack {}", (Object)file);
        this.field32613 = new Class1922("server", true, () -> new Class1733(file2), (ITextComponent)new Class2259("resourcePack.server.name", new Object[0]), class8545.method28688(), Class2009.method8044(class8545.method28689()), Class2043.field11642, true, method6637);
        return Class869.method5277().method5278();
    }
    
    static {
        field32606 = LogManager.getLogger();
        field32607 = Pattern.compile("^[a-fA-F0-9]{40}$");
    }
}
