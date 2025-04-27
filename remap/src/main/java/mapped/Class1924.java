// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import org.apache.logging.log4j.LogManager;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayInputStream;
import java.io.BufferedInputStream;
import javax.annotation.Nullable;
import java.io.InputStream;
import java.io.DataInputStream;
import java.nio.file.StandardOpenOption;
import java.nio.file.OpenOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.io.IOException;
import java.io.File;
import java.nio.IntBuffer;
import java.nio.file.Path;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.Logger;

public class Class1924 implements AutoCloseable
{
    private static final Logger field10467;
    private static final ByteBuffer field10468;
    private final FileChannel field10469;
    private final Path field10470;
    private final Class8057 field10471;
    private final ByteBuffer field10472;
    private final IntBuffer field10473;
    private final IntBuffer field10474;
    private final Class8603 field10475;
    
    public Class1924(final File file, final File file2) throws IOException {
        this(file.toPath(), file2.toPath(), Class8057.field33147);
    }
    
    public Class1924(final Path path, final Path path2, final Class8057 field10471) throws IOException {
        this.field10472 = ByteBuffer.allocateDirect(8192);
        this.field10475 = new Class8603();
        this.field10471 = field10471;
        if (Files.isDirectory(path2)) {
            this.field10470 = path2;
            (this.field10473 = this.field10472.asIntBuffer()).limit();
            this.field10472.position();
            this.field10474 = this.field10472.asIntBuffer();
            this.field10469 = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
            this.field10475.method29170(0, 2);
            this.field10472.position();
            final int read = this.field10469.read(this.field10472, 0L);
            if (read != -1) {
                if (read != 8192) {
                    Class1924.field10467.warn("Region file {} has truncated header: {}", path, read);
                }
                for (int i = 0; i < 1024; ++i) {
                    final int value = this.field10473.get(i);
                    if (value != 0) {
                        this.field10475.method29170(method7647(value), method7646(value));
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Expected directory, got " + path2.toAbsolutePath());
    }
    
    private Path method7638(final ChunkPos class7859) {
        return this.field10470.resolve("c." + class7859.field32290 + "." + class7859.field32291 + ".mcc");
    }
    
    @Nullable
    public synchronized DataInputStream method7639(final ChunkPos class7859) throws IOException {
        final int method7655 = this.method7655(class7859);
        if (method7655 == 0) {
            return null;
        }
        final int method7656 = method7647(method7655);
        final int n = method7646(method7655) * 4096;
        final ByteBuffer allocate = ByteBuffer.allocate(n);
        this.field10469.read(allocate, method7656 * 4096L);
        allocate.flip();
        if (allocate.remaining() < 5) {
            Class1924.field10467.error("Chunk {} header is truncated: expected {} but read {}", class7859, n, allocate.remaining());
            return null;
        }
        final int int1 = allocate.getInt();
        final byte value = allocate.get();
        if (int1 == 0) {
            Class1924.field10467.warn("Chunk {} is allocated, but stream is missing", class7859);
            return null;
        }
        final int i = int1 - 1;
        if (method7640(value)) {
            if (i != 0) {
                Class1924.field10467.warn("Chunk has both internal and external streams");
            }
            return this.method7643(class7859, method7641(value));
        }
        if (i > allocate.remaining()) {
            Class1924.field10467.error("Chunk {} stream is truncated: expected {} but read {}", class7859, i, allocate.remaining());
            return null;
        }
        if (i >= 0) {
            return this.method7642(class7859, value, method7644(allocate, i));
        }
        Class1924.field10467.error("Declared size {} of chunk {} is negative", int1, class7859);
        return null;
    }
    
    private static boolean method7640(final byte b) {
        return false;
    }
    
    private static byte method7641(final byte b) {
        return (byte)(b & 0xFFFFFF7F);
    }
    
    @Nullable
    private DataInputStream method7642(final ChunkPos class7859, final byte b, final InputStream inputStream) throws IOException {
        final Class8057 method26430 = Class8057.method26430(b);
        if (method26430 != null) {
            return new DataInputStream(new BufferedInputStream(method26430.method26434(inputStream)));
        }
        Class1924.field10467.error("Chunk {} has invalid chunk stream version {}", class7859, b);
        return null;
    }
    
    @Nullable
    private DataInputStream method7643(final ChunkPos class7859, final byte b) throws IOException {
        final Path method7638 = this.method7638(class7859);
        if (Files.isRegularFile(method7638)) {
            return this.method7642(class7859, b, Files.newInputStream(method7638));
        }
        Class1924.field10467.error("External chunk path {} is not file", method7638);
        return null;
    }
    
    private static ByteArrayInputStream method7644(final ByteBuffer byteBuffer, final int length) {
        return new ByteArrayInputStream(byteBuffer.array(), byteBuffer.position(), length);
    }
    
    private int method7645(final int n, final int n2) {
        return n << 8 | n2;
    }
    
    private static int method7646(final int n) {
        return n & 0xFF;
    }
    
    private static int method7647(final int n) {
        return n >> 8;
    }
    
    private static int method7648(final int n) {
        return (n + 4096 - 1) / 4096;
    }
    
    public boolean method7649(final ChunkPos class7859) {
        final int method7655 = this.method7655(class7859);
        if (method7655 == 0) {
            return false;
        }
        final int method7656 = method7647(method7655);
        final int method7657 = method7646(method7655);
        final ByteBuffer allocate = ByteBuffer.allocate(5);
        try {
            this.field10469.read(allocate, method7656 * 4096L);
            allocate.flip();
            if (allocate.remaining() != 5) {
                return false;
            }
            final int int1 = allocate.getInt();
            final byte value = allocate.get();
            if (method7640(value)) {
                if (!Class8057.method26431(method7641(value))) {
                    return false;
                }
                return Files.isRegularFile(this.method7638(class7859));
            }
            else {
                if (!Class8057.method26431(value)) {
                    return false;
                }
                if (int1 == 0) {
                    return false;
                }
                final int n = int1 - 1;
                return n >= 0 && n <= 4096 * method7657;
            }
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    public DataOutputStream method7650(final ChunkPos class7859) throws IOException {
        return new DataOutputStream(new BufferedOutputStream(this.field10471.method26433(new Class1724(this, class7859))));
    }
    
    public synchronized void method7651(final ChunkPos class7859, final ByteBuffer byteBuffer) throws IOException {
        final int method7657 = method7657(class7859);
        final int value = this.field10473.get(method7657);
        final int method7658 = method7647(value);
        final int method7659 = method7646(value);
        final int remaining = byteBuffer.remaining();
        int method7660 = method7648(remaining);
        int n;
        Class9149 method7661;
        if (method7660 < 256) {
            n = this.field10475.method29172(method7660);
            method7661 = (() -> Files.deleteIfExists(this.method7638(class7860)));
            this.field10469.write(byteBuffer, n * 4096L);
        }
        else {
            final Path method7662 = this.method7638(class7859);
            Class1924.field10467.warn("Saving oversized chunk {} ({} bytes} to external file {}", class7859, remaining, method7662);
            method7660 = 1;
            n = this.field10475.method29172(method7660);
            method7661 = this.method7653(method7662, byteBuffer);
            this.field10469.write(this.method7652(), n * 4096L);
        }
        final int n2 = (int)(Util.method27839() / 1000L);
        this.field10473.put(method7657, this.method7645(n, method7660));
        this.field10474.put(method7657, n2);
        this.method7654();
        method7661.run();
        if (method7658 != 0) {
            this.field10475.method29171(method7658, method7659);
        }
    }
    
    private ByteBuffer method7652() {
        final ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(1);
        allocate.put((byte)(this.field10471.method26432() | 0x80));
        allocate.flip();
        return allocate;
    }
    
    private Class9149 method7653(final Path path, final ByteBuffer byteBuffer) throws IOException {
        try (final FileChannel open = FileChannel.open(Files.createTempFile(this.field10470, "tmp", null, new FileAttribute[0]), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            byteBuffer.position();
            open.write(byteBuffer);
        }
        return () -> Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
    
    private void method7654() throws IOException {
        this.field10472.position();
        this.field10469.write(this.field10472, 0L);
    }
    
    private int method7655(final ChunkPos class7859) {
        return this.field10473.get(method7657(class7859));
    }
    
    public boolean method7656(final ChunkPos class7859) {
        return this.method7655(class7859) != 0;
    }
    
    private static int method7657(final ChunkPos class7859) {
        return class7859.method25432() + class7859.method25433() * 32;
    }
    
    @Override
    public void close() throws IOException {
        try {
            this.method7658();
            try {
                this.method7654();
            }
            finally {
                try {
                    this.field10469.force(true);
                }
                finally {
                    this.field10469.close();
                }
            }
        }
        finally {
            Label_0164: {
                try {
                    this.method7654();
                    try {
                        this.field10469.force(true);
                    }
                    finally {
                        this.field10469.close();
                    }
                    break Label_0164;
                }
                finally {
                    try {
                        this.field10469.force(true);
                    }
                    finally {
                        this.field10469.close();
                    }
                }
            }
        }
    }
    
    private void method7658() throws IOException {
        final int n = (int)this.field10469.size();
        final int n2 = method7648(n) * 4096;
        if (n != n2) {
            final ByteBuffer duplicate = Class1924.field10468.duplicate();
            duplicate.position();
            this.field10469.write(duplicate, n2 - 1);
        }
    }
    
    static {
        field10467 = LogManager.getLogger();
        field10468 = ByteBuffer.allocateDirect(1);
    }
}
