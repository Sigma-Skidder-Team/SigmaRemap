// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.nio.file.InvalidPathException;
import java.io.FileOutputStream;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import java.io.File;
import java.nio.file.Path;
import com.mojang.datafixers.DataFixer;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1795 implements Class1657
{
    private static final Logger field9945;
    private final Map<ResourceLocation, Class6585> field9946;
    private final DataFixer field9947;
    private final MinecraftServer field9948;
    private final Path field9949;
    
    public Class1795(final MinecraftServer field9948, final File file, final DataFixer field9949) {
        this.field9946 = Maps.newHashMap();
        this.field9948 = field9948;
        this.field9947 = field9949;
        this.field9949 = file.toPath().resolve("generated").normalize();
        field9948.method1571().method19930(this);
    }
    
    public Class6585 method6518(final ResourceLocation class1932) {
        Class6585 method6519 = this.method6519(class1932);
        if (method6519 == null) {
            method6519 = new Class6585();
            this.field9946.put(class1932, method6519);
        }
        return method6519;
    }
    
    @Nullable
    public Class6585 method6519(final ResourceLocation key) {
        return this.field9946.computeIfAbsent(key, class1932 -> {
            this.method6521(class1932);
            final Class6585 class1933;
            return (class1933 == null) ? this.method6520(class1932) : class1933;
        });
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        this.field9946.clear();
    }
    
    @Nullable
    private Class6585 method6520(final ResourceLocation class1932) {
        final ResourceLocation class1933 = new ResourceLocation(class1932.method7798(), "structures/" + class1932.method7797() + ".nbt");
        try (final Class1671 method19933 = this.field9948.method1571().method19933(class1933)) {
            return this.method6522(method19933.method5887());
        }
        catch (final FileNotFoundException ex) {
            return null;
        }
        catch (final Throwable t3) {
            Class1795.field9945.error("Couldn't load structure {}: {}", (Object)class1932, (Object)t3.toString());
            return null;
        }
    }
    
    @Nullable
    private Class6585 method6521(final ResourceLocation class1932) {
        if (!this.field9949.toFile().isDirectory()) {
            return null;
        }
        final Path method6526 = this.method6526(class1932, ".nbt");
        try (final FileInputStream fileInputStream = new FileInputStream(method6526.toFile())) {
            return this.method6522(fileInputStream);
        }
        catch (final FileNotFoundException ex) {
            return null;
        }
        catch (final IOException ex2) {
            Class1795.field9945.error("Couldn't load structure from {}", (Object)method6526, (Object)ex2);
            return null;
        }
    }
    
    private Class6585 method6522(final InputStream inputStream) throws IOException {
        return this.method6523(Class8097.method26590(inputStream));
    }
    
    public Class6585 method6523(final Class51 class51) {
        if (!class51.method316("DataVersion", 99)) {
            class51.method298("DataVersion", 500);
        }
        final Class6585 class52 = new Class6585();
        class52.method19969(Class9346.method34651(this.field9947, Class1959.field10680, class51, class51.method319("DataVersion")));
        return class52;
    }
    
    public boolean method6524(final ResourceLocation class1932) {
        final Class6585 class1933 = this.field9946.get(class1932);
        if (class1933 == null) {
            return false;
        }
        final Path method6526 = this.method6526(class1932, ".nbt");
        final Path parent = method6526.getParent();
        if (parent == null) {
            return false;
        }
        try {
            Files.createDirectories(Files.exists(parent, new LinkOption[0]) ? parent.toRealPath(new LinkOption[0]) : parent, (FileAttribute<?>[])new FileAttribute[0]);
        }
        catch (final IOException ex) {
            Class1795.field9945.error("Failed to create parent directory: {}", (Object)parent);
            return false;
        }
        final Class51 method6527 = class1933.method19968(new Class51());
        try (final FileOutputStream fileOutputStream = new FileOutputStream(method6526.toFile())) {
            Class8097.method26591(method6527, fileOutputStream);
            return true;
        }
        catch (final Throwable t3) {
            return false;
        }
    }
    
    public Path method6525(final ResourceLocation obj, final String s) {
        try {
            return Class6732.method20424(this.field9949.resolve(obj.method7798()).resolve("structures"), obj.method7797(), s);
        }
        catch (final InvalidPathException ex) {
            throw new Class2357("Invalid resource path: " + obj, ex);
        }
    }
    
    private Path method6526(final ResourceLocation obj, final String s) {
        if (!obj.method7797().contains("//")) {
            final Path method6525 = this.method6525(obj, s);
            if (method6525.startsWith(this.field9949)) {
                if (Class6732.method20422(method6525)) {
                    if (Class6732.method20423(method6525)) {
                        return method6525;
                    }
                }
            }
            throw new Class2357("Invalid resource path: " + method6525);
        }
        throw new Class2357("Invalid resource path: " + obj);
    }
    
    public void method6527(final ResourceLocation class1932) {
        this.field9946.remove(class1932);
    }
    
    static {
        field9945 = LogManager.getLogger();
    }
}
