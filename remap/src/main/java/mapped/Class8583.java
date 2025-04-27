// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Joiner;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import com.google.common.io.CharStreams;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Arrays;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class Class8583
{
    private final Map<String, List<String>> field36070;
    private final char field36071;
    private final int field36072;
    private List<String> field36073;
    
    public Class8583(final char field36071, final int field36072) {
        this.field36070 = Maps.newConcurrentMap();
        this.field36073 = Lists.newArrayList();
        this.field36071 = field36071;
        this.field36072 = field36072;
    }
    
    public void method29052(final String... a) {
        this.field36073 = Arrays.asList(a);
    }
    
    public List<String> method29053() {
        return this.field36073;
    }
    
    public void method29054(final String s, final String... a) {
        this.field36070.put(s, Arrays.asList(a));
    }
    
    public List<String> method29055(final String s) {
        return this.field36070.get(s);
    }
    
    public void method29056(final InputStream in) throws IOException {
        final InputStreamReader inputStreamReader = new InputStreamReader(in);
        String string;
        try {
            string = CharStreams.toString(inputStreamReader);
        }
        finally {
            inputStreamReader.close();
        }
        final StringBuilder sb = new StringBuilder();
        final String string2 = Character.toString(this.field36071);
        int n = 0;
        String str = "";
        ArrayList list = Lists.newArrayList();
        for (final String str2 : string.split("\n")) {
            if (!str2.isEmpty()) {
                final int method29060 = this.method29060(str2, ' ');
                final String s = (method29060 > 0) ? str2.substring(method29060) : str2;
                if (s.startsWith("#")) {
                    if (s.startsWith("#>")) {
                        this.field36073.add(s.startsWith("#> ") ? s.substring(3) : s.substring(2));
                    }
                    else {
                        list.add(s.startsWith("# ") ? s.substring(2) : s.substring(1));
                    }
                }
                else {
                    final int n2 = method29060 / this.field36072;
                    if (n2 <= n) {
                        final String[] split2 = str.split(Pattern.quote(string2));
                        str = this.method29059(split2, this.field36071, 0, split2.length - (n - n2 + 1));
                    }
                    str = str + ((str.length() > 0) ? string2 : "") + (str2.contains(":") ? str2.split(Pattern.quote(":"))[0] : str2).substring(method29060);
                    n = n2;
                    sb.append(str2).append('\n');
                    if (!list.isEmpty()) {
                        this.field36070.put(str, list);
                        list = Lists.newArrayList();
                    }
                }
            }
        }
    }
    
    public void method29057(final String s, final File file) throws IOException {
        final int field36072 = this.field36072;
        final String string = Character.toString(this.field36071);
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        String str = "";
        final Iterator<String> iterator = this.field36073.iterator();
        while (iterator.hasNext()) {
            sb.append("#> ").append(iterator.next()).append('\n');
        }
        for (final String str2 : s.split("\n")) {
            if (!str2.isEmpty()) {
                final int method29060 = this.method29060(str2, ' ');
                final int n2 = method29060 / field36072;
                final String s2 = (method29060 > 0) ? str2.substring(0, method29060) : "";
                if (n2 <= n) {
                    final String[] split2 = str.split(Pattern.quote(string));
                    str = this.method29059(split2, this.field36071, 0, split2.length - (n - n2 + 1));
                }
                str = str + ((str.length() > 0) ? string : "") + (str2.contains(":") ? str2.split(Pattern.quote(":"))[0] : str2).substring(method29060);
                n = n2;
                final List list = this.field36070.get(str);
                sb.append((list != null) ? this.method29058(list, s2) : "").append(str2).append('\n');
            }
        }
        OutputStreamWriter outputStreamWriter = null;
        try {
            outputStreamWriter = new FileWriter(file);
            outputStreamWriter.write(sb.toString());
            outputStreamWriter.flush();
            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                }
                catch (final IOException ex) {}
            }
        }
        finally {
            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                }
                catch (final IOException ex2) {}
            }
        }
    }
    
    private String method29058(final List<String> list, final String str) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append(str).append("# ").append(iterator.next()).append('\n');
        }
        return sb.toString();
    }
    
    private String method29059(final String[] array, final char c, final int n, final int n2) {
        final String[] array2 = new String[n2 - n];
        System.arraycopy(array, n, array2, 0, n2 - n);
        return Joiner.on(c).join(array2);
    }
    
    private int method29060(final String s, final char c) {
        int n = 0;
        for (int index = 0; index < s.length() && s.charAt(index) == c; ++index) {
            ++n;
        }
        return n;
    }
}
