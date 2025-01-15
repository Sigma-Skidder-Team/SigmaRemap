// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.nio.file.Path;
import java.util.Collections;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.nio.file.LinkOption;
import java.nio.file.Files;
import java.nio.file.FileVisitOption;
import java.util.Collection;
import java.util.function.Predicate;
import java.io.File;

public class Class8174 extends Class8175
{
    private final File field33678;
    
    public Class8174(final File field33678) {
        this.field33678 = field33678;
    }
    
    @Override
    public File method27064(final Class1932 class1932) {
        return new File(this.field33678, class1932.toString().replace(':', '/'));
    }
    
    @Override
    public File method27065(final String child) {
        return new File(this.field33678, child);
    }
    
    @Override
    public Collection<Class1932> method27066(final String other, final String other2, final int maxDepth, final Predicate<String> predicate) {
        final Path resolve = this.field33678.toPath().resolve(other2);
        try (final Stream<Path> walk = Files.walk(resolve.resolve(other), maxDepth, new FileVisitOption[0])) {
            return (Collection)walk.filter(path -> Files.isRegularFile(path, new LinkOption[0])).filter(path2 -> !path2.endsWith(".mcmeta")).filter(path3 -> predicate2.test(path3.getFileName().toString())).map(path5 -> new Class1932(s, path4.relativize(path5).toString().replaceAll("\\\\", "/"))).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
        }
        catch (final NoSuchFileException ex) {}
        catch (final IOException ex2) {
            Class8174.field33679.warn("Unable to getFiles on {}", (Object)other, (Object)ex2);
        }
        return (Collection<Class1932>)Collections.emptyList();
    }
}
