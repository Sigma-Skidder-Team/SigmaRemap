// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.net.URISyntaxException;
import java.net.URI;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public final class Class8846
{
    private static final char[] field37178;
    public static final String field37179 = " \"':;<=>@[]^`{}|/\\?#";
    public static final String field37180 = " \"':;<=>@[]^`{}|/\\?#";
    public static final String field37181 = " \"<>^`{}|/\\?#";
    public static final String field37182 = "[]";
    public static final String field37183 = " \"'<>#";
    public static final String field37184 = " \"'<>#&=";
    public static final String field37185 = "\\^`{|}";
    public static final String field37186 = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String field37187 = "";
    public static final String field37188 = " \"#<>\\^`{|}";
    public final String field37189;
    private final String field37190;
    private final String field37191;
    public final String field37192;
    public final int field37193;
    private final List<String> field37194;
    private final List<String> field37195;
    private final String field37196;
    private final String field37197;
    
    public Class8846(final Class9085 class9085) {
        this.field37189 = class9085.field38469;
        this.field37190 = method30965(class9085.field38470, false);
        this.field37191 = method30965(class9085.field38471, false);
        this.field37192 = class9085.field38472;
        this.field37193 = class9085.method32793();
        this.field37194 = this.method30966(class9085.field38474, false);
        this.field37195 = ((class9085.field38475 == null) ? null : this.method30966(class9085.field38475, true));
        this.field37196 = ((class9085.field38476 == null) ? null : method30965(class9085.field38476, false));
        this.field37197 = class9085.toString();
    }
    
    public URL method30928() {
        try {
            return new URL(this.field37197);
        }
        catch (final MalformedURLException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    public URI method30929() {
        final String string = this.method30958().method32814().toString();
        try {
            return new URI(string);
        }
        catch (final URISyntaxException cause) {
            final String s = string;
            final String s2 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";
            final String s3 = "";
            final String replaceAll = s.replaceAll(s2, s3);
            final String replaceAll2 = replaceAll;
            return URI.create(replaceAll2);
        }
        try {
            final String s = string;
            final String s2 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";
            final String s3 = "";
            final String replaceAll2;
            final String replaceAll = replaceAll2 = s.replaceAll(s2, s3);
            return URI.create(replaceAll2);
        }
        catch (final Exception ex) {
            final URISyntaxException cause;
            throw new RuntimeException(cause);
        }
    }
    
    public String method30930() {
        return this.field37189;
    }
    
    public boolean method30931() {
        return this.field37189.equals("https");
    }
    
    public String method30932() {
        if (!this.field37190.isEmpty()) {
            final int beginIndex = this.field37189.length() + 3;
            return this.field37197.substring(beginIndex, Class7690.method24450(this.field37197, beginIndex, this.field37197.length(), ":@"));
        }
        return "";
    }
    
    public String method30933() {
        return this.field37190;
    }
    
    public String method30934() {
        if (!this.field37191.isEmpty()) {
            return this.field37197.substring(this.field37197.indexOf(58, this.field37189.length() + 3) + 1, this.field37197.indexOf(64));
        }
        return "";
    }
    
    public String method30935() {
        return this.field37191;
    }
    
    public String method30936() {
        return this.field37192;
    }
    
    public int method30937() {
        return this.field37193;
    }
    
    public static int method30938(final String s) {
        if (s.equals("http")) {
            return 80;
        }
        if (!s.equals("https")) {
            return -1;
        }
        return 443;
    }
    
    public int method30939() {
        return this.field37194.size();
    }
    
    public String method30940() {
        final int index = this.field37197.indexOf(47, this.field37189.length() + 3);
        return this.field37197.substring(index, Class7690.method24450(this.field37197, index, this.field37197.length(), "?#"));
    }
    
    public static void method30941(final StringBuilder sb, final List<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            sb.append('/');
            sb.append((String)list.get(i));
        }
    }
    
    public List<String> method30942() {
        final int index = this.field37197.indexOf(47, this.field37189.length() + 3);
        final int method24450 = Class7690.method24450(this.field37197, index, this.field37197.length(), "?#");
        final ArrayList list = new ArrayList();
        int method24451;
        for (int i = index; i < method24450; i = method24451) {
            ++i;
            method24451 = Class7690.method24451(this.field37197, i, method24450, '/');
            list.add(this.field37197.substring(i, method24451));
        }
        return list;
    }
    
    public List<String> method30943() {
        return this.field37194;
    }
    
    @Nullable
    public String method30944() {
        if (this.field37195 != null) {
            final int beginIndex = this.field37197.indexOf(63) + 1;
            return this.field37197.substring(beginIndex, Class7690.method24451(this.field37197, beginIndex + 1, this.field37197.length(), '#'));
        }
        return null;
    }
    
    public static void method30945(final StringBuilder sb, final List<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            final String str = list.get(i);
            final String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }
    
    public static List<String> method30946(final String s) {
        final ArrayList list = new ArrayList();
        int n;
        for (int i = 0; i <= s.length(); i = n + 1) {
            n = s.indexOf(38, i);
            if (n == -1) {
                n = s.length();
            }
            final int index = s.indexOf(61, i);
            if (index != -1 && index <= n) {
                list.add(s.substring(i, index));
                list.add(s.substring(index + 1, n));
            }
            else {
                list.add(s.substring(i, n));
                list.add(null);
            }
        }
        return list;
    }
    
    @Nullable
    public String method30947() {
        if (this.field37195 != null) {
            final StringBuilder sb = new StringBuilder();
            method30945(sb, this.field37195);
            return sb.toString();
        }
        return null;
    }
    
    public int method30948() {
        return (this.field37195 == null) ? 0 : (this.field37195.size() / 2);
    }
    
    @Nullable
    public String method30949(final String s) {
        if (this.field37195 != null) {
            for (int i = 0; i < this.field37195.size(); i += 2) {
                if (s.equals(this.field37195.get(i))) {
                    return this.field37195.get(i + 1);
                }
            }
            return null;
        }
        return null;
    }
    
    public Set<String> method30950() {
        if (this.field37195 != null) {
            final LinkedHashSet s = new LinkedHashSet();
            for (int i = 0; i < this.field37195.size(); i += 2) {
                s.add(this.field37195.get(i));
            }
            return (Set<String>)Collections.unmodifiableSet((Set<?>)s);
        }
        return Collections.emptySet();
    }
    
    public List<String> method30951(final String s) {
        if (this.field37195 != null) {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < this.field37195.size(); i += 2) {
                if (s.equals(this.field37195.get(i))) {
                    list.add(this.field37195.get(i + 1));
                }
            }
            return (List<String>)Collections.unmodifiableList((List<?>)list);
        }
        return Collections.emptyList();
    }
    
    public String method30952(final int n) {
        if (this.field37195 != null) {
            return this.field37195.get(n * 2);
        }
        throw new IndexOutOfBoundsException();
    }
    
    public String method30953(final int n) {
        if (this.field37195 != null) {
            return this.field37195.get(n * 2 + 1);
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Nullable
    public String method30954() {
        if (this.field37196 != null) {
            return this.field37197.substring(this.field37197.indexOf(35) + 1);
        }
        return null;
    }
    
    @Nullable
    public String method30955() {
        return this.field37196;
    }
    
    public String method30956() {
        return this.method30959("/...").method32787("").method32789("").method32815().toString();
    }
    
    @Nullable
    public Class8846 method30957(final String s) {
        final Class9085 method30959 = this.method30959(s);
        return (method30959 == null) ? null : method30959.method32815();
    }
    
    public Class9085 method30958() {
        final Class9085 class9085 = new Class9085();
        class9085.field38469 = this.field37189;
        class9085.field38470 = this.method30932();
        class9085.field38471 = this.method30934();
        class9085.field38472 = this.field37192;
        class9085.field38473 = ((this.field37193 == method30938(this.field37189)) ? -1 : this.field37193);
        class9085.field38474.clear();
        class9085.field38474.addAll(this.method30942());
        class9085.method32804(this.method30944());
        class9085.field38476 = this.method30954();
        return class9085;
    }
    
    @Nullable
    public Class9085 method30959(final String s) {
        final Class9085 class9085 = new Class9085();
        return (class9085.method32816(this, s) != Class2054.field11720) ? null : class9085;
    }
    
    @Nullable
    public static Class8846 method30960(final String s) {
        final Class9085 class9085 = new Class9085();
        return (class9085.method32816(null, s) != Class2054.field11720) ? null : class9085.method32815();
    }
    
    @Nullable
    public static Class8846 method30961(final URL url) {
        return method30960(url.toString());
    }
    
    public static Class8846 method30962(final String s) throws MalformedURLException, UnknownHostException {
        final Class9085 class9085 = new Class9085();
        final Class2054 method32816 = class9085.method32816(null, s);
        switch (Class9028.field38170[method32816.ordinal()]) {
            case 1: {
                return class9085.method32815();
            }
            case 2: {
                throw new UnknownHostException("Invalid host: " + s);
            }
            default: {
                throw new MalformedURLException("Invalid URL: " + method32816 + " for " + s);
            }
        }
    }
    
    @Nullable
    public static Class8846 method30963(final URI uri) {
        return method30960(uri.toString());
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class8846 && ((Class8846)o).field37197.equals(this.field37197);
    }
    
    @Override
    public int hashCode() {
        return this.field37197.hashCode();
    }
    
    @Override
    public String toString() {
        return this.field37197;
    }
    
    @Nullable
    public String method30964() {
        if (!Class7690.method24455(this.field37192)) {
            return Class8268.method27453().method27454(this.field37192);
        }
        return null;
    }
    
    public static String method30965(final String s, final boolean b) {
        return method30967(s, 0, s.length(), b);
    }
    
    private List<String> method30966(final List<String> list, final boolean b) {
        final int size = list.size();
        final ArrayList list2 = new ArrayList(size);
        for (int i = 0; i < size; ++i) {
            final String s = list.get(i);
            list2.add((Object)((s == null) ? null : method30965(s, b)));
        }
        return Collections.unmodifiableList((List<? extends String>)list2);
    }
    
    public static String method30967(final String s, final int beginIndex, final int endIndex, final boolean b) {
        for (int i = beginIndex; i < endIndex; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '%' || (char1 == '+' && b)) {
                final Class1680 class1680 = new Class1680();
                class1680.method5998(s, beginIndex, i);
                method30968(class1680, s, i, endIndex, b);
                return class1680.method5980();
            }
        }
        return s.substring(beginIndex, endIndex);
    }
    
    public static void method30968(final Class1680 class1680, final String s, final int n, final int n2, final boolean b) {
        int codePoint;
        for (int i = n; i < n2; i += Character.charCount(codePoint)) {
            codePoint = s.codePointAt(i);
            if (codePoint == 37 && i + 2 < n2) {
                final int method30970 = method30970(s.charAt(i + 1));
                final int method30971 = method30970(s.charAt(i + 2));
                if (method30970 != -1 && method30971 != -1) {
                    class1680.method6004((method30970 << 4) + method30971);
                    i += 2;
                    continue;
                }
            }
            else if (codePoint == 43) {
                if (b) {
                    class1680.method6004(32);
                    continue;
                }
            }
            class1680.method5999(codePoint);
        }
    }
    
    public static boolean method30969(final String s, final int index, final int n) {
        if (index + 2 < n) {
            if (s.charAt(index) == '%') {
                if (method30970(s.charAt(index + 1)) != -1) {
                    if (method30970(s.charAt(index + 2)) != -1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static int method30970(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        }
        return -1;
    }
    
    public static String method30971(final String s, final int beginIndex, final int endIndex, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        int i = beginIndex;
        while (i < endIndex) {
            final int codePoint = s.codePointAt(i);
            Label_0032: {
                if (codePoint >= 32) {
                    if (codePoint != 127) {
                        if (codePoint < 128 || !b4) {
                            if (s2.indexOf(codePoint) == -1) {
                                if (codePoint == 37) {
                                    if (!b) {
                                        break Label_0032;
                                    }
                                    if (b2) {
                                        if (!method30969(s, i, endIndex)) {
                                            break Label_0032;
                                        }
                                    }
                                }
                                if (codePoint != 43 || !b3) {
                                    i += Character.charCount(codePoint);
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            final Class1680 class1680 = new Class1680();
            class1680.method5998(s, beginIndex, i);
            method30972(class1680, s, i, endIndex, s2, b, b2, b3, b4);
            return class1680.method5980();
        }
        return s.substring(beginIndex, endIndex);
    }
    
    public static void method30972(final Class1680 class1680, final String s, final int n, final int n2, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        Class1680 class1681 = null;
        int codePoint;
        for (int i = n; i < n2; i += Character.charCount(codePoint)) {
            codePoint = s.codePointAt(i);
            if (b) {
                if (codePoint == 9) {
                    continue;
                }
                if (codePoint == 10) {
                    continue;
                }
                if (codePoint == 12) {
                    continue;
                }
                if (codePoint == 13) {
                    continue;
                }
            }
            if (codePoint == 43 && b3) {
                class1680.method5997(b ? "+" : "%2B");
            }
            else {
                Label_0041: {
                    if (codePoint >= 32) {
                        if (codePoint != 127) {
                            if (codePoint < 128 || !b4) {
                                if (s2.indexOf(codePoint) == -1) {
                                    if (codePoint == 37) {
                                        if (!b) {
                                            break Label_0041;
                                        }
                                        if (b2) {
                                            if (!method30969(s, i, n2)) {
                                                break Label_0041;
                                            }
                                        }
                                    }
                                    class1680.method5999(codePoint);
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (class1681 == null) {
                    class1681 = new Class1680();
                }
                class1681.method5999(codePoint);
                while (!class1681.method5951()) {
                    final int n3 = class1681.method5964() & 0xFF;
                    class1680.method6004(37);
                    class1680.method6004(Class8846.field37178[n3 >> 4 & 0xF]);
                    class1680.method6004(Class8846.field37178[n3 & 0xF]);
                }
            }
        }
    }
    
    public static String method30973(final String s, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        return method30971(s, 0, s.length(), s2, b, b2, b3, b4);
    }
    
    static {
        field37178 = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
}
