// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.time.temporal.TemporalField;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.time.format.DateTimeFormatterBuilder;
import org.apache.logging.log4j.LogManager;
import java.nio.file.FileVisitor;
import java.nio.file.Paths;
import java.util.zip.ZipOutputStream;
import java.io.BufferedOutputStream;
import java.nio.file.OpenOption;
import java.time.LocalDateTime;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import javax.annotation.Nullable;
import net.minecraft.client.AnvilConverterException;
import java.io.File;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import com.google.common.collect.Lists;
import java.util.List;
import java.io.IOException;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import com.mojang.datafixers.DataFixer;
import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import org.apache.logging.log4j.Logger;

public class Class7952
{
    private static final Logger field32666;
    private static final DateTimeFormatter field32667;
    private final Path field32668;
    private final Path field32669;
    private final DataFixer field32670;
    
    public Class7952(final Path path, final Path field32669, final DataFixer field32670) {
        this.field32670 = field32670;
        try {
            Files.createDirectories(Files.exists(path, new LinkOption[0]) ? path.toRealPath(new LinkOption[0]) : path, (FileAttribute<?>[])new FileAttribute[0]);
        }
        catch (final IOException cause) {
            throw new RuntimeException(cause);
        }
        this.field32668 = path;
        this.field32669 = field32669;
    }
    
    public String method25784() {
        return "Anvil";
    }
    
    public List<Class1934> method25785() throws AnvilConverterException {
        if (Files.isDirectory(this.field32668, new LinkOption[0])) {
            final ArrayList arrayList = Lists.newArrayList();
            for (final File file : this.field32668.toFile().listFiles()) {
                if (file.isDirectory()) {
                    final String name = file.getName();
                    final Class8660 method25791 = this.method25791(name);
                    if (method25791 != null) {
                        if (method25791.method29551() == 19132 || method25791.method29551() == 19133) {
                            final boolean b = method25791.method29551() != this.method25786();
                            String method25792 = method25791.method29549();
                            if (StringUtils.isEmpty((CharSequence)method25792)) {
                                method25792 = name;
                            }
                            arrayList.add(new Class1934(method25791, name, method25792, 0L, b));
                        }
                    }
                }
            }
            return arrayList;
        }
        throw new Class2323(new Class2259("selectWorld.load_folder_access", new Object[0]).getString());
    }
    
    private int method25786() {
        return 19133;
    }
    
    public Class8642 method25787(final String s, final Class394 class394) {
        return method25788(this.field32668, this.field32670, s, class394);
    }
    
    public static Class8642 method25788(final Path path, final DataFixer dataFixer, final String s, final Class394 class394) {
        return new Class8642(path.toFile(), s, class394, dataFixer);
    }
    
    public boolean method25789(final String s) {
        final Class8660 method25791 = this.method25791(s);
        return method25791 != null && method25791.method29551() != this.method25786();
    }
    
    public boolean method25790(final String s, final Class732 class732) {
        return Class6512.method19598(this.field32668, this.field32670, s, class732);
    }
    
    @Nullable
    public Class8660 method25791(final String s) {
        return method25792(this.field32668, this.field32670, s);
    }
    
    @Nullable
    public static Class8660 method25792(final Path path, final DataFixer dataFixer, final String child) {
        final File file = new File(path.toFile(), child);
        if (file.exists()) {
            final File file2 = new File(file, "level.dat");
            if (file2.exists()) {
                final Class8660 method25793 = method25793(file2, dataFixer);
                if (method25793 != null) {
                    return method25793;
                }
            }
            final File file3 = new File(file, "level.dat_old");
            return file3.exists() ? method25793(file3, dataFixer) : null;
        }
        return null;
    }
    
    @Nullable
    public static Class8660 method25793(final File file, final DataFixer dataFixer) {
        try {
            final Class51 method327 = Class8097.method26590(new FileInputStream(file)).method327("Data");
            final Class51 class51 = method327.method316("Player", 10) ? method327.method327("Player") : null;
            method327.method330("Player");
            final int n = method327.method316("DataVersion", 99) ? method327.method319("DataVersion") : -1;
            return new Class8660(Class9346.method34651(dataFixer, Class1959.field10675, method327, n), dataFixer, n, class51);
        }
        catch (final Exception ex) {
            Class7952.field32666.error("Exception reading {}", (Object)file, (Object)ex);
            return null;
        }
    }
    
    public void method25794(final String child, final String s) {
        final File parent = new File(this.field32668.toFile(), child);
        if (parent.exists()) {
            final File file = new File(parent, "level.dat");
            if (file.exists()) {
                try {
                    final Class51 method26590 = Class8097.method26590(new FileInputStream(file));
                    method26590.method327("Data").method306("LevelName", s);
                    Class8097.method26591(method26590, new FileOutputStream(file));
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public boolean method25795(final String other) {
        try {
            final Path resolve = this.field32668.resolve(other);
            Files.createDirectory(resolve, (FileAttribute<?>[])new FileAttribute[0]);
            Files.deleteIfExists(resolve);
            return true;
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    public boolean method25796(final String child) {
        final File file = new File(this.field32668.toFile(), child);
        if (!file.exists()) {
            return true;
        }
        Class7952.field32666.info("Deleting level {}", (Object)child);
        for (int i = 1; i <= 5; ++i) {
            Class7952.field32666.info("Attempt {}...", (Object)i);
            if (method25797(file.listFiles())) {
                break;
            }
            Class7952.field32666.warn("Unsuccessful in deleting contents.");
            if (i < 5) {
                try {
                    Thread.sleep(500L);
                }
                catch (final InterruptedException ex) {}
            }
        }
        return file.delete();
    }
    
    private static boolean method25797(final File[] array) {
        for (final File file : array) {
            Class7952.field32666.debug("Deleting {}", (Object)file);
            if (file.isDirectory() && !method25797(file.listFiles())) {
                Class7952.field32666.warn("Couldn't delete directory {}", (Object)file);
                return false;
            }
            if (!file.delete()) {
                Class7952.field32666.warn("Couldn't delete file {}", (Object)file);
                return false;
            }
        }
        return true;
    }
    
    public boolean method25798(final String other) {
        return Files.isDirectory(this.field32668.resolve(other), new LinkOption[0]);
    }
    
    public Path method25799() {
        return this.field32668;
    }
    
    public File method25800(final String other, final String other2) {
        return this.field32668.resolve(other).resolve(other2).toFile();
    }
    
    private Path method25801(final String other) {
        return this.field32668.resolve(other);
    }
    
    public Path method25802() {
        return this.field32669;
    }
    
    public long method25803(final String s) throws IOException {
        final Path method25801 = this.method25801(s);
        final String string = LocalDateTime.now().format(Class7952.field32667) + "_" + s;
        final Path method25802 = this.method25802();
        try {
            Files.createDirectories(Files.exists(method25802, new LinkOption[0]) ? method25802.toRealPath(new LinkOption[0]) : method25802, (FileAttribute<?>[])new FileAttribute[0]);
        }
        catch (final IOException cause) {
            throw new RuntimeException(cause);
        }
        final Path resolve = method25802.resolve(Class6732.method20421(method25802, string, ".zip"));
        try (final ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(resolve, new OpenOption[0])))) {
            Files.walkFileTree(method25801, new Class8448(this, Paths.get(s, new String[0]), method25801, zipOutputStream));
        }
        return Files.size(resolve);
    }
    
    static {
        field32666 = LogManager.getLogger();
        field32667 = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).appendLiteral('_').appendValue(ChronoField.HOUR_OF_DAY, 2).appendLiteral('-').appendValue(ChronoField.MINUTE_OF_HOUR, 2).appendLiteral('-').appendValue(ChronoField.SECOND_OF_MINUTE, 2).toFormatter();
    }
}
