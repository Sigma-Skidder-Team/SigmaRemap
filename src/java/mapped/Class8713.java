// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.annotation.Nullable;
import java.util.regex.Pattern;

public final class Class8713
{
    private static final Pattern field36605;
    private static final Pattern field36606;
    private static final Pattern field36607;
    private static final Pattern field36608;
    private final String field36609;
    private final String field36610;
    private final long field36611;
    private final String field36612;
    private final String field36613;
    private final boolean field36614;
    private final boolean field36615;
    private final boolean field36616;
    private final boolean field36617;
    
    private Class8713(final String field36609, final String field36610, final long field36611, final String field36612, final String field36613, final boolean field36614, final boolean field36615, final boolean field36616, final boolean field36617) {
        this.field36609 = field36609;
        this.field36610 = field36610;
        this.field36611 = field36611;
        this.field36612 = field36612;
        this.field36613 = field36613;
        this.field36614 = field36614;
        this.field36615 = field36615;
        this.field36617 = field36616;
        this.field36616 = field36617;
    }
    
    public Class8713(final Class7294 class7294) {
        if (class7294.field28260 == null) {
            throw new NullPointerException("builder.name == null");
        }
        if (class7294.field28261 == null) {
            throw new NullPointerException("builder.value == null");
        }
        if (class7294.field28263 != null) {
            this.field36609 = class7294.field28260;
            this.field36610 = class7294.field28261;
            this.field36611 = class7294.field28262;
            this.field36612 = class7294.field28263;
            this.field36613 = class7294.field28264;
            this.field36614 = class7294.field28265;
            this.field36615 = class7294.field28266;
            this.field36616 = class7294.field28267;
            this.field36617 = class7294.field28268;
            return;
        }
        throw new NullPointerException("builder.domain == null");
    }
    
    public String method29911() {
        return this.field36609;
    }
    
    public String method29912() {
        return this.field36610;
    }
    
    public boolean method29913() {
        return this.field36616;
    }
    
    public long method29914() {
        return this.field36611;
    }
    
    public boolean method29915() {
        return this.field36617;
    }
    
    public String method29916() {
        return this.field36612;
    }
    
    public String method29917() {
        return this.field36613;
    }
    
    public boolean method29918() {
        return this.field36615;
    }
    
    public boolean method29919() {
        return this.field36614;
    }
    
    public boolean method29920(final Class8846 class8846) {
        return (this.field36617 ? class8846.method30936().equals(this.field36612) : method29921(class8846.method30936(), this.field36612)) && method29922(class8846, this.field36613) && (!this.field36614 || class8846.method30931());
    }
    
    private static boolean method29921(final String s, final String s2) {
        if (!s.equals(s2)) {
            if (s.endsWith(s2)) {
                if (s.charAt(s.length() - s2.length() - 1) == '.') {
                    if (!Class7690.method24455(s)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    private static boolean method29922(final Class8846 class8846, final String s) {
        final String method30940 = class8846.method30940();
        if (!method30940.equals(s)) {
            if (method30940.startsWith(s)) {
                if (s.endsWith("/")) {
                    return true;
                }
                if (method30940.charAt(s.length()) == '/') {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Nullable
    public static Class8713 method29923(final Class8846 class8846, final String s) {
        return method29924(System.currentTimeMillis(), class8846, s);
    }
    
    @Nullable
    public static Class8713 method29924(final long n, final Class8846 class8846, final String s) {
        final int n2 = 0;
        final int length = s.length();
        final int method24451 = Class7690.method24451(s, n2, length, ';');
        final int method24452 = Class7690.method24451(s, n2, method24451, '=');
        if (method24452 == method24451) {
            return null;
        }
        final String method24453 = Class7690.method24449(s, n2, method24452);
        if (method24453.isEmpty() || Class7690.method24454(method24453) != -1) {
            return null;
        }
        final String method24454 = Class7690.method24449(s, method24452 + 1, method24451);
        if (Class7690.method24454(method24454) != -1) {
            return null;
        }
        long method24455 = 253402300799999L;
        long method24456 = -1L;
        String method24457 = null;
        String s2 = null;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        int method24458;
        for (int i = method24451 + 1; i < length; i = method24458 + 1) {
            method24458 = Class7690.method24451(s, i, length, ';');
            final int method24459 = Class7690.method24451(s, i, method24458, '=');
            final String method24460 = Class7690.method24449(s, i, method24459);
            final String s3 = (method24459 < method24458) ? Class7690.method24449(s, method24459 + 1, method24458) : "";
            if (method24460.equalsIgnoreCase("expires")) {
                try {
                    method24455 = method29925(s3, 0, s3.length());
                    b4 = true;
                }
                catch (final IllegalArgumentException ex) {}
            }
            else if (method24460.equalsIgnoreCase("max-age")) {
                try {
                    method24456 = method29927(s3);
                    b4 = true;
                }
                catch (final NumberFormatException ex2) {}
            }
            else if (method24460.equalsIgnoreCase("domain")) {
                try {
                    method24457 = method29928(s3);
                    b3 = false;
                }
                catch (final IllegalArgumentException ex3) {}
            }
            else if (method24460.equalsIgnoreCase("path")) {
                s2 = s3;
            }
            else if (method24460.equalsIgnoreCase("secure")) {
                b = true;
            }
            else if (method24460.equalsIgnoreCase("httponly")) {
                b2 = true;
            }
        }
        if (method24456 == Long.MIN_VALUE) {
            method24455 = Long.MIN_VALUE;
        }
        else if (method24456 != -1L) {
            method24455 = n + ((method24456 <= 9223372036854775L) ? (method24456 * 1000L) : Long.MAX_VALUE);
            if (method24455 < n || method24455 > 253402300799999L) {
                method24455 = 253402300799999L;
            }
        }
        final String method24461 = class8846.method30936();
        if (method24457 == null) {
            method24457 = method24461;
        }
        else if (!method29921(method24461, method24457)) {
            return null;
        }
        if (method24461.length() != method24457.length() && Class8268.method27453().method27454(method24457) == null) {
            return null;
        }
        if (s2 == null || !s2.startsWith("/")) {
            final String method24462 = class8846.method30940();
            final int lastIndex = method24462.lastIndexOf(47);
            s2 = ((lastIndex != 0) ? method24462.substring(0, lastIndex) : "/");
        }
        return new Class8713(method24453, method24454, method24455, method24457, s2, b, b2, b3, b4);
    }
    
    private static long method29925(final String input, int i, final int n) {
        i = method29926(input, i, n, false);
        int int1 = -1;
        int int2 = -1;
        int int3 = -1;
        int int4 = -1;
        int n2 = -1;
        int int5 = -1;
        final Matcher matcher = Class8713.field36608.matcher(input);
        while (i < n) {
            final int method29926 = method29926(input, i + 1, n, true);
            matcher.region(i, method29926);
            if (int1 == -1 && matcher.usePattern(Class8713.field36608).matches()) {
                int1 = Integer.parseInt(matcher.group(1));
                int2 = Integer.parseInt(matcher.group(2));
                int3 = Integer.parseInt(matcher.group(3));
            }
            else if (int4 == -1 && matcher.usePattern(Class8713.field36607).matches()) {
                int4 = Integer.parseInt(matcher.group(1));
            }
            else if (n2 == -1 && matcher.usePattern(Class8713.field36606).matches()) {
                n2 = Class8713.field36606.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            }
            else if (int5 == -1) {
                if (matcher.usePattern(Class8713.field36605).matches()) {
                    int5 = Integer.parseInt(matcher.group(1));
                }
            }
            i = method29926(input, method29926 + 1, n, false);
        }
        if (int5 >= 70) {
            if (int5 <= 99) {
                int5 += 1900;
            }
        }
        if (int5 >= 0) {
            if (int5 <= 69) {
                int5 += 2000;
            }
        }
        if (int5 < 1601) {
            throw new IllegalArgumentException();
        }
        if (n2 == -1) {
            throw new IllegalArgumentException();
        }
        if (int4 < 1 || int4 > 31) {
            throw new IllegalArgumentException();
        }
        if (int1 < 0 || int1 > 23) {
            throw new IllegalArgumentException();
        }
        if (int2 < 0 || int2 > 59) {
            throw new IllegalArgumentException();
        }
        if (int3 >= 0 && int3 <= 59) {
            final GregorianCalendar gregorianCalendar = new GregorianCalendar(Class7690.field30554);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, int5);
            gregorianCalendar.set(2, n2 - 1);
            gregorianCalendar.set(5, int4);
            gregorianCalendar.set(11, int1);
            gregorianCalendar.set(12, int2);
            gregorianCalendar.set(13, int3);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }
    
    private static int method29926(final String s, final int n, final int n2, final boolean b) {
        for (int i = n; i < n2; ++i) {
            final char char1 = s.charAt(i);
            boolean b2 = false;
            Label_0136: {
                if (char1 >= ' ' || char1 == '\t') {
                    if (char1 < '\u007f') {
                        if (char1 < '0' || char1 > '9') {
                            if (char1 < 'a' || char1 > 'z') {
                                if (char1 < 'A' || char1 > 'Z') {
                                    if (char1 != ':') {
                                        b2 = false;
                                        break Label_0136;
                                    }
                                }
                            }
                        }
                    }
                }
                b2 = true;
            }
            if (b2 == !b) {
                return i;
            }
        }
        return n2;
    }
    
    private static long method29927(final String s) {
        try {
            final long long1 = Long.parseLong(s);
            return (long1 <= 0L) ? Long.MIN_VALUE : long1;
        }
        catch (final NumberFormatException ex) {
            if (s.matches("-?\\d+")) {
                return s.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }
        throw;
    }
    
    private static String method29928(String substring) {
        if (substring.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (substring.startsWith(".")) {
            substring = substring.substring(1);
        }
        final String method24452 = Class7690.method24452(substring);
        if (method24452 != null) {
            return method24452;
        }
        throw new IllegalArgumentException();
    }
    
    public static List<Class8713> method29929(final Class8846 class8846, final Class6957 class8847) {
        final List<String> values = class8847.values("Set-Cookie");
        List<? extends Class8713> list = null;
        for (int i = 0; i < values.size(); ++i) {
            final Class8713 method29923 = method29923(class8846, values.get(i));
            if (method29923 != null) {
                if (list == null) {
                    list = new ArrayList<Class8713>();
                }
                list.add(method29923);
            }
        }
        return (List<Class8713>)((list == null) ? Collections.emptyList() : Collections.unmodifiableList((List<?>)list));
    }
    
    @Override
    public String toString() {
        return this.toString(false);
    }
    
    public String toString(final boolean b) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.field36609);
        sb.append('=');
        sb.append(this.field36610);
        if (this.field36616) {
            if (this.field36611 != Long.MIN_VALUE) {
                sb.append("; expires=").append(Class6525.method19744(new Date(this.field36611)));
            }
            else {
                sb.append("; max-age=0");
            }
        }
        if (!this.field36617) {
            sb.append("; domain=");
            if (b) {
                sb.append(".");
            }
            sb.append(this.field36612);
        }
        sb.append("; path=").append(this.field36613);
        if (this.field36614) {
            sb.append("; secure");
        }
        if (this.field36615) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class8713) {
            final Class8713 class8713 = (Class8713)o;
            if (class8713.field36609.equals(this.field36609)) {
                if (class8713.field36610.equals(this.field36610)) {
                    if (class8713.field36612.equals(this.field36612)) {
                        if (class8713.field36613.equals(this.field36613)) {
                            if (class8713.field36611 == this.field36611) {
                                if (class8713.field36614 == this.field36614) {
                                    if (class8713.field36615 == this.field36615) {
                                        if (class8713.field36616 == this.field36616) {
                                            if (class8713.field36617 == this.field36617) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * 17 + this.field36609.hashCode()) + this.field36610.hashCode()) + this.field36612.hashCode()) + this.field36613.hashCode()) + (int)(this.field36611 ^ this.field36611 >>> 32)) + (this.field36614 ? 0 : 1)) + (this.field36615 ? 0 : 1)) + (this.field36616 ? 0 : 1)) + (this.field36617 ? 0 : 1);
    }
    
    static {
        field36605 = Pattern.compile("(\\d{2,4})[^\\d]*");
        field36606 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        field36607 = Pattern.compile("(\\d{1,2})[^\\d]*");
        field36608 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }
}
