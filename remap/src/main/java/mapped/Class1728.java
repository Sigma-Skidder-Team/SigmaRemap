// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.nio.file.FileSystemNotFoundException;
import java.util.Collections;
import java.nio.file.FileSystems;
import java.io.File;
import javax.annotation.Nullable;
import java.util.stream.Stream;
import java.nio.file.FileVisitOption;
import java.net.URI;
import java.util.Enumeration;
import java.util.HashSet;
import java.nio.file.NoSuchFileException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.net.URL;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.function.Predicate;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.OpenOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.io.InputStream;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.nio.file.FileSystem;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import java.nio.file.Path;

public class Class1728 implements Class1727
{
    public static Path field9659;
    private static final Logger field9660;
    public static Class<?> field9661;
    private static final Map<Class346, FileSystem> field9662;
    public final Set<String> field9663;
    private static final boolean field9664;
    private static final boolean field9665;
    
    public Class1728(final String... array) {
        this.field9663 = (Set<String>)ImmutableSet.copyOf((Object[])array);
    }
    
    @Override
    public InputStream method6096(final String other) throws IOException {
        if (!other.contains("/") && !other.contains("\\")) {
            if (Class1728.field9659 != null) {
                final Path resolve = Class1728.field9659.resolve(other);
                if (Files.exists(resolve, new LinkOption[0])) {
                    return Files.newInputStream(resolve, new OpenOption[0]);
                }
            }
            return this.method6107(other);
        }
        throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
    }
    
    @Override
    public InputStream method6097(final Class346 class346, final ResourceLocation class347) throws IOException {
        final InputStream method6104 = this.method6104(class346, class347);
        if (method6104 == null) {
            throw new FileNotFoundException(class347.method7797());
        }
        return method6104;
    }
    
    @Override
    public Collection<ResourceLocation> method6098(final Class346 class346, final String s, final String s2, final int n, final Predicate<String> predicate) {
        final HashSet hashSet = Sets.newHashSet();
        if (Class1728.field9659 != null) {
            try {
                method6103(hashSet, n, s, Class1728.field9659.resolve(class346.method1028()), s2, predicate);
            }
            catch (final IOException ex) {}
            if (class346 == Class346.field2137) {
                Enumeration<URL> resources = null;
                try {
                    resources = Class1728.field9661.getClassLoader().getResources(class346.method1028() + "/");
                }
                catch (final IOException ex2) {}
                while (resources != null && resources.hasMoreElements()) {
                    try {
                        final URI uri = resources.nextElement().toURI();
                        if (!"file".equals(uri.getScheme())) {
                            continue;
                        }
                        method6103(hashSet, n, s, Paths.get(uri), s2, predicate);
                    }
                    catch (final URISyntaxException | IOException ex3) {}
                }
            }
        }
        try {
            final URL resource = Class1728.class.getResource("/" + class346.method1028() + "/.mcassetsroot");
            if (resource == null) {
                Class1728.field9660.error("Couldn't find .mcassetsroot, cannot load vanilla resources");
                return hashSet;
            }
            final URI uri2 = resource.toURI();
            if ("file".equals(uri2.getScheme())) {
                method6103(hashSet, n, s, Paths.get(new URL(resource.toString().substring(0, resource.toString().length() - ".mcassetsroot".length())).toURI()), s2, predicate);
            }
            else if ("jar".equals(uri2.getScheme())) {
                method6103(hashSet, n, "minecraft", Class1728.field9662.get(class346).getPath("/" + class346.method1028(), new String[0]), s2, predicate);
            }
            else {
                Class1728.field9660.error("Unsupported scheme {} trying to list vanilla resources (NYI?)", (Object)uri2);
            }
        }
        catch (final FileNotFoundException | NoSuchFileException ex4) {}
        catch (final URISyntaxException | IOException ex5) {
            Class1728.field9660.error("Couldn't get a list of all vanilla resources", (Throwable)ex5);
        }
        return hashSet;
    }
    
    private static void method6103(final Collection<ResourceLocation> collection, final int maxDepth, final String other, final Path path, final String other2, final Predicate<String> predicate) throws IOException {
        try (final Stream<Path> walk = Files.walk(path.resolve(other).resolve(other2), maxDepth, new FileVisitOption[0])) {
            walk.filter(path2 -> {
                final boolean b;
                if (!path2.endsWith(".mcmeta")) {
                    if (!(!Files.isRegularFile(path2, new LinkOption[0]))) {
                        if (!(!predicate2.test(path2.getFileName().toString()))) {
                            return b;
                        }
                    }
                }
                return b;
            }).map(path4 -> new ResourceLocation(s, path3.relativize(path4).toString().replaceAll("\\\\", "/"))).forEach(collection::add);
        }
    }
    
    @Nullable
    public InputStream method6104(final Class346 class346, final ResourceLocation class347) {
        final String method6105 = method6105(class346, class347);
        final InputStream method6106 = Class7667.method24302(method6105);
        if (method6106 != null) {
            return method6106;
        }
        if (Class1728.field9659 != null) {
            final Path resolve = Class1728.field9659.resolve(class346.method1028() + "/" + class347.method7798() + "/" + class347.method7797());
            if (Files.exists(resolve, new LinkOption[0])) {
                try {
                    return Files.newInputStream(resolve, new OpenOption[0]);
                }
                catch (final IOException ex) {}
            }
        }
        try {
            final URL resource = Class1728.class.getResource(method6105);
            return method6106(method6105, resource) ? (Class1728.field9665 ? this.method6109(class346, method6105) : resource.openStream()) : null;
        }
        catch (final IOException ex2) {
            return Class1728.class.getResourceAsStream(method6105);
        }
    }
    
    private static String method6105(final Class346 class346, final ResourceLocation class347) {
        return "/" + class346.method1028() + "/" + class347.method7798() + "/" + class347.method7797();
    }
    
    private static boolean method6106(final String s, final URL url) throws IOException {
        return url != null && (url.getProtocol().equals("jar") || method6108(new File(url.getFile()), s));
    }
    
    @Nullable
    public InputStream method6107(final String s) {
        return Class1728.field9665 ? this.method6109(Class346.field2138, "/" + s) : Class1728.class.getResourceAsStream("/" + s);
    }
    
    @Override
    public boolean method6099(final Class346 class346, final ResourceLocation class347) {
        final String method6105 = method6105(class346, class347);
        if (Class7667.method24302(method6105) != null) {
            return true;
        }
        if (Class1728.field9659 != null && Files.exists(Class1728.field9659.resolve(class346.method1028() + "/" + class347.method7798() + "/" + class347.method7797()), new LinkOption[0])) {
            return true;
        }
        try {
            return method6106(method6105, Class1728.class.getResource(method6105));
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    @Override
    public Set<String> method6100(final Class346 class346) {
        return this.field9663;
    }
    
    @Nullable
    @Override
    public <T> T method6101(final Class5092<T> class5092) throws IOException {
        try (final InputStream method6096 = this.method6096("pack.mcmeta")) {
            return Class1732.method6130(class5092, method6096);
        }
        catch (final RuntimeException | FileNotFoundException ex) {
            return null;
        }
    }
    
    @Override
    public String method6102() {
        return "Default";
    }
    
    @Override
    public void close() {
    }
    
    private static boolean method6108(final File file, final String suffix) throws IOException {
        String s = file.getPath();
        if (!s.startsWith("file:")) {
            return Class1735.method6132(file, suffix);
        }
        if (Class1728.field9664) {
            s = s.replace("\\", "/");
        }
        return s.endsWith(suffix);
    }
    
    private InputStream method6109(final Class346 class346, final String s) {
        try {
            final FileSystem fileSystem = Class1728.field9662.get(class346);
            return (fileSystem != null) ? Files.newInputStream(fileSystem.getPath(s, new String[0]), new OpenOption[0]) : Class1728.class.getResourceAsStream(s);
        }
        catch (final IOException ex) {
            return Class1728.class.getResourceAsStream(s);
        }
    }
    
    static {
        field9660 = LogManager.getLogger();
        field9662 = Util.method27851(Maps.newHashMap(), hashMap -> {
            synchronized (Class1728.class) {
                Class346.values();
                final Class346[] array;
                int i = 0;
                for (int length = array.length; i < length; ++i) {
                    final Class346 key = array[i];
                    Class1728.class.getResource("/" + key.method1028() + "/.mcassetsroot");
                    try {
                        final URL url;
                        url.toURI();
                        final URI uri;
                        if ("jar".equals(uri.getScheme())) {
                            FileSystem value;
                            try {
                                value = FileSystems.getFileSystem(uri);
                            }
                            catch (final FileSystemNotFoundException ex) {
                                value = FileSystems.newFileSystem(uri, Collections.emptyMap());
                            }
                            hashMap.put(key, value);
                        }
                    }
                    catch (final URISyntaxException | IOException ex2) {
                        Class1728.field9660.error("Couldn't get a list of all vanilla resources", (Throwable)ex2);
                    }
                }
            }
            return;
        });
        field9664 = (Util.method27845() == Class306.field1833);
        field9665 = Class9570.field41282.method22623();
    }
}
