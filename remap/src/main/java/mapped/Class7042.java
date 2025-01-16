// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.Enumeration;
import java.util.regex.Pattern;
import com.google.common.base.Joiner;
import java.util.ArrayDeque;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.util.zip.ZipFile;
import java.io.File;

public class Class7042 implements Class7038
{
    public File field27414;
    public ZipFile field27415;
    public String field27416;
    
    public Class7042(final String s, final File field27414) {
        this.field27414 = field27414;
        this.field27415 = null;
        this.field27416 = "";
    }
    
    @Override
    public void method21533() {
        if (this.field27415 != null) {
            try {
                this.field27415.close();
            }
            catch (final Exception ex) {}
            this.field27415 = null;
        }
    }
    
    @Override
    public InputStream method21531(final String s) {
        try {
            if (this.field27415 == null) {
                this.field27415 = new ZipFile(this.field27414);
                this.field27416 = this.method21535(this.field27415);
            }
            String str = Class9518.method35517(s, "/");
            if (str.contains("..")) {
                str = this.method21534(str);
            }
            final ZipEntry entry = this.field27415.getEntry(this.field27416 + str);
            return (entry == null) ? null : this.field27415.getInputStream(entry);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    private String method21534(final String s) {
        final ArrayDeque arrayDeque = new ArrayDeque();
        final String[] method28937 = Config.method28937(s, "/");
        for (int i = 0; i < method28937.length; ++i) {
            final String s2 = method28937[i];
            if (!s2.equals("..")) {
                arrayDeque.add(s2);
            }
            else {
                if (arrayDeque.isEmpty()) {
                    return "";
                }
                arrayDeque.removeLast();
            }
        }
        return Joiner.on('/').join((Iterable)arrayDeque);
    }
    
    private String method21535(final ZipFile zipFile) {
        final ZipEntry entry = zipFile.getEntry("shaders/");
        if (entry != null && entry.isDirectory()) {
            return "";
        }
        final Pattern compile = Pattern.compile("([^/]+/)shaders/");
        final Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            final Matcher matcher = compile.matcher(((ZipEntry)entries.nextElement()).getName());
            if (!matcher.matches()) {
                continue;
            }
            final String group = matcher.group(1);
            if (group == null) {
                continue;
            }
            if (!group.equals("shaders/")) {
                return group;
            }
            return "";
        }
        return "";
    }
    
    @Override
    public boolean method21532(final String s) {
        try {
            if (this.field27415 == null) {
                this.field27415 = new ZipFile(this.field27414);
                this.field27416 = this.method21535(this.field27415);
            }
            return this.field27415.getEntry(this.field27416 + Class9518.method35517(s, "/")) != null;
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    @Override
    public String method21530() {
        return this.field27414.getName();
    }
}
