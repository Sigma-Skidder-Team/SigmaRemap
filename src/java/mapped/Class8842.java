// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.nio.file.LinkOption;
import java.nio.file.FileVisitOption;
import java.util.stream.Stream;
import java.util.Objects;
import javax.annotation.Nullable;
import java.io.BufferedWriter;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collection;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import com.google.common.base.Charsets;
import java.nio.file.OpenOption;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map;
import java.nio.file.Path;
import org.apache.logging.log4j.Logger;

public class Class8842
{
    private static final Logger field37160;
    private final Path field37161;
    private final Path field37162;
    private int field37163;
    private final Map<Path, String> field37164;
    private final Map<Path, String> field37165;
    private final Set<Path> field37166;
    
    public Class8842(final Path field37161, final String other) throws IOException {
        this.field37164 = Maps.newHashMap();
        this.field37165 = Maps.newHashMap();
        this.field37166 = Sets.newHashSet();
        this.field37161 = field37161;
        final Path resolve = field37161.resolve(".cache");
        Files.createDirectories(resolve, (FileAttribute<?>[])new FileAttribute[0]);
        this.field37162 = resolve.resolve(other);
        this.method30889().forEach(path -> {
            final String s = this.field37164.put(path, "");
            return;
        });
        if (Files.isReadable(this.field37162)) {
            IOUtils.readLines(Files.newInputStream(this.field37162, new OpenOption[0]), Charsets.UTF_8).forEach(s2 -> {
                s2.indexOf(32);
                final int endIndex;
                this.field37164.put(path2.resolve(s2.substring(endIndex + 1)), s2.substring(0, endIndex));
            });
        }
    }
    
    public void method30883() throws IOException {
        this.method30888();
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = Files.newBufferedWriter(this.field37162, new OpenOption[0]);
        }
        catch (final IOException ex) {
            Class8842.field37160.warn("Unable write cachefile {}: {}", (Object)this.field37162, (Object)ex.toString());
            return;
        }
        IOUtils.writeLines((Collection)this.field37165.entrySet().stream().map(entry -> entry.getValue() + ' ' + this.field37161.relativize((Path)entry.getKey())).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()), System.lineSeparator(), (Writer)bufferedWriter);
        bufferedWriter.close();
        Class8842.field37160.debug("Caching: cache hits: {}, created: {} removed: {}", (Object)this.field37163, (Object)(this.field37165.size() - this.field37163), (Object)this.field37164.size());
    }
    
    @Nullable
    public String method30884(final Path path) {
        return this.field37164.get(path);
    }
    
    public void method30885(final Path path, final String b) {
        this.field37165.put(path, b);
        if (Objects.equals(this.field37164.remove(path), b)) {
            ++this.field37163;
        }
    }
    
    public boolean method30886(final Path path) {
        return this.field37164.containsKey(path);
    }
    
    public void method30887(final Path path) {
        this.field37166.add(path);
    }
    
    private void method30888() throws IOException {
        this.method30889().forEach(path -> {
            if (this.method30886(path) && !this.field37166.contains(path)) {
                try {
                    Files.delete(path);
                }
                catch (final IOException ex) {
                    Class8842.field37160.debug("Unable to delete: {} ({})", (Object)path, (Object)ex.toString());
                }
            }
        });
    }
    
    private Stream<Path> method30889() throws IOException {
        return Files.walk(this.field37161, new FileVisitOption[0]).filter(path -> !Objects.equals(this.field37162, path) && !Files.isDirectory(path, new LinkOption[0]));
    }
    
    static {
        field37160 = LogManager.getLogger();
    }
}
