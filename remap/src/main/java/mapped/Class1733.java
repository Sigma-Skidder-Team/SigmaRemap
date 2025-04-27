// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.function.Predicate;
import java.io.Closeable;
import org.apache.commons.io.IOUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Enumeration;
import java.util.Locale;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import java.util.zip.ZipFile;
import com.google.common.base.Splitter;

public class Class1733 extends Class1732
{
    public static final Splitter field9680;
    private ZipFile field9681;
    
    public Class1733(final File file) {
        super(file);
    }
    
    private ZipFile method6131() throws IOException {
        if (this.field9681 == null) {
            this.field9681 = new ZipFile(this.field9679);
        }
        return this.field9681;
    }
    
    @Override
    public InputStream method6127(final String name) throws IOException {
        final ZipFile method6131 = this.method6131();
        final ZipEntry entry = method6131.getEntry(name);
        if (entry != null) {
            return method6131.getInputStream(entry);
        }
        throw new Class2349(this.field9679, name);
    }
    
    @Override
    public boolean method6128(final String name) {
        try {
            return this.method6131().getEntry(name) != null;
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    @Override
    public Set<String> method6100(final Class346 class346) {
        ZipFile method6131;
        try {
            method6131 = this.method6131();
        }
        catch (final IOException ex) {
            return Collections.emptySet();
        }
        final Enumeration<? extends ZipEntry> entries = method6131.entries();
        final HashSet hashSet = Sets.newHashSet();
        while (entries.hasMoreElements()) {
            final String name = entries.nextElement().getName();
            if (name.startsWith(class346.method1028() + "/")) {
                final ArrayList arrayList = Lists.newArrayList(Class1733.field9680.split(name));
                if (arrayList.size() <= 1) {
                    continue;
                }
                final String s = (String)arrayList.get(1);
                if (s.equals(s.toLowerCase(Locale.ROOT))) {
                    hashSet.add(s);
                }
                else {
                    this.method6129(s);
                }
            }
        }
        return hashSet;
    }
    
    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }
    
    @Override
    public void close() {
        if (this.field9681 != null) {
            IOUtils.closeQuietly(this.field9681);
            this.field9681 = null;
        }
    }
    
    @Override
    public Collection<ResourceLocation> method6098(final Class346 class346, final String str, final String str2, final int n, final Predicate<String> predicate) {
        ZipFile method6131;
        try {
            method6131 = this.method6131();
        }
        catch (final IOException ex) {
            return Collections.emptySet();
        }
        final Enumeration<? extends ZipEntry> entries = method6131.entries();
        final ArrayList arrayList = Lists.newArrayList();
        final String string = class346.method1028() + "/" + str + "/";
        final String string2 = string + str2 + "/";
        while (entries.hasMoreElements()) {
            final ZipEntry zipEntry = entries.nextElement();
            if (!zipEntry.isDirectory()) {
                final String name = zipEntry.getName();
                if (name.endsWith(".mcmeta") || !name.startsWith(string2)) {
                    continue;
                }
                final String substring = name.substring(string.length());
                final String[] split = substring.split("/");
                if (split.length < n + 1 || !predicate.test(split[split.length - 1])) {
                    continue;
                }
                arrayList.add(new ResourceLocation(str, substring));
            }
        }
        return arrayList;
    }
    
    static {
        field9680 = Splitter.on('/').omitEmptyStrings().limit(3);
    }
}
