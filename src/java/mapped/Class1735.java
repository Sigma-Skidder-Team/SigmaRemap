// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.HashSet;
import java.util.Locale;
import java.io.FileFilter;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import com.google.common.base.CharMatcher;
import org.apache.logging.log4j.Logger;

public class Class1735 extends Class1732
{
    private static final Logger field9683;
    private static final boolean field9684;
    private static final CharMatcher field9685;
    
    public Class1735(final File file) {
        super(file);
    }
    
    public static boolean method6132(final File file, final String suffix) throws IOException {
        String s = file.getCanonicalPath();
        if (Class1735.field9684) {
            s = Class1735.field9685.replaceFrom((CharSequence)s, '/');
        }
        return s.endsWith(suffix);
    }
    
    @Override
    public InputStream method6127(final String s) throws IOException {
        final File method6133 = this.method6133(s);
        if (method6133 != null) {
            return new FileInputStream(method6133);
        }
        throw new Class2349(this.field9679, s);
    }
    
    @Override
    public boolean method6128(final String s) {
        return this.method6133(s) != null;
    }
    
    @Nullable
    private File method6133(final String child) {
        try {
            final File file = new File(this.field9679, child);
            if (file.isFile() && method6132(file, child)) {
                return file;
            }
        }
        catch (final IOException ex) {}
        return null;
    }
    
    @Override
    public Set<String> method6100(final Class346 class346) {
        final HashSet hashSet = Sets.newHashSet();
        final File file = new File(this.field9679, class346.method1028());
        final File[] listFiles = file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY);
        if (listFiles != null) {
            final File[] array = listFiles;
            for (int length = array.length, i = 0; i < length; ++i) {
                final String method6126 = Class1732.method6126(file, array[i]);
                if (!method6126.equals(method6126.toLowerCase(Locale.ROOT))) {
                    this.method6129(method6126);
                }
                else {
                    hashSet.add(method6126.substring(0, method6126.length() - 1));
                }
            }
        }
        return hashSet;
    }
    
    @Override
    public void close() throws IOException {
    }
    
    @Override
    public Collection<Class1932> method6098(final Class346 class346, final String child, final String s, final int n, final Predicate<String> predicate) {
        final File parent = new File(this.field9679, class346.method1028());
        final ArrayList arrayList = Lists.newArrayList();
        this.method6134(new File(new File(parent, child), s), n, child, arrayList, s + "/", predicate);
        return arrayList;
    }
    
    private void method6134(final File file, final int n, final String s, final List<Class1932> list, final String s2, final Predicate<String> predicate) {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (final File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (n > 0) {
                        this.method6134(file2, n - 1, s, list, s2 + file2.getName() + "/", predicate);
                    }
                }
                else if (!file2.getName().endsWith(".mcmeta") && predicate.test(file2.getName())) {
                    try {
                        list.add(new Class1932(s, s2 + file2.getName()));
                    }
                    catch (final Class2357 class2357) {
                        Class1735.field9683.error(class2357.getMessage());
                    }
                }
            }
        }
    }
    
    static {
        field9683 = LogManager.getLogger();
        field9684 = (Class8349.method27845() == Class306.field1833);
        field9685 = CharMatcher.is('\\');
    }
}
