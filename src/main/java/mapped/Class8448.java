// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;
import com.google.common.io.Files;
import java.util.zip.ZipEntry;
import java.nio.file.FileVisitResult;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipOutputStream;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public class Class8448 extends SimpleFileVisitor<Path>
{
    private static String[] field34704;
    public final /* synthetic */ Path field34705;
    public final /* synthetic */ Path field34706;
    public final /* synthetic */ ZipOutputStream field34707;
    public final /* synthetic */ Class7952 field34708;
    
    public Class8448(final Class7952 field34708, final Path field34709, final Path field34710, final ZipOutputStream field34711) {
        this.field34708 = field34708;
        this.field34705 = field34709;
        this.field34706 = field34710;
        this.field34707 = field34711;
    }
    
    @Override
    public FileVisitResult visitFile(final Path path, final BasicFileAttributes basicFileAttributes) throws IOException {
        this.field34707.putNextEntry(new ZipEntry(this.field34705.resolve(this.field34706.relativize(path)).toString().replace('\\', '/')));
        Files.asByteSource(path.toFile()).copyTo((OutputStream)this.field34707);
        this.field34707.closeEntry();
        return FileVisitResult.CONTINUE;
    }
}
