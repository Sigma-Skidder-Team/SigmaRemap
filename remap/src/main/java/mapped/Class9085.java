// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.net.InetAddress;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class Class9085
{
    public String field38469;
    public String field38470;
    public String field38471;
    public String field38472;
    public int field38473;
    public final List<String> field38474;
    public List<String> field38475;
    public String field38476;
    
    public Class9085() {
        this.field38470 = "";
        this.field38471 = "";
        this.field38473 = -1;
        (this.field38474 = new ArrayList<String>()).add("");
    }
    
    public Class9085 method32786(final String str) {
        if (str != null) {
            if (!str.equalsIgnoreCase("http")) {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.field38469 = "https";
            }
            else {
                this.field38469 = "http";
            }
            return this;
        }
        throw new NullPointerException("scheme == null");
    }
    
    public Class9085 method32787(final String s) {
        if (s != null) {
            this.field38470 = Class8846.method30973(s, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
        throw new NullPointerException("username == null");
    }
    
    public Class9085 method32788(final String s) {
        if (s != null) {
            this.field38470 = Class8846.method30973(s, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }
        throw new NullPointerException("encodedUsername == null");
    }
    
    public Class9085 method32789(final String s) {
        if (s != null) {
            this.field38471 = Class8846.method30973(s, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
        throw new NullPointerException("password == null");
    }
    
    public Class9085 method32790(final String s) {
        if (s != null) {
            this.field38471 = Class8846.method30973(s, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }
        throw new NullPointerException("encodedPassword == null");
    }
    
    public Class9085 method32791(final String str) {
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        final String method32825 = method32825(str, 0, str.length());
        if (method32825 != null) {
            this.field38472 = method32825;
            return this;
        }
        throw new IllegalArgumentException("unexpected host: " + str);
    }
    
    public Class9085 method32792(final int n) {
        if (n > 0 && n <= 65535) {
            this.field38473 = n;
            return this;
        }
        throw new IllegalArgumentException("unexpected port: " + n);
    }
    
    public int method32793() {
        return (this.field38473 == -1) ? Class8846.method30938(this.field38469) : this.field38473;
    }
    
    public Class9085 method32794(final String s) {
        if (s != null) {
            this.method32818(s, 0, s.length(), false, false);
            return this;
        }
        throw new NullPointerException("pathSegment == null");
    }
    
    public Class9085 method32795(final String s) {
        if (s != null) {
            return this.method32798(s, false);
        }
        throw new NullPointerException("pathSegments == null");
    }
    
    public Class9085 method32796(final String s) {
        if (s != null) {
            this.method32818(s, 0, s.length(), false, true);
            return this;
        }
        throw new NullPointerException("encodedPathSegment == null");
    }
    
    public Class9085 method32797(final String s) {
        if (s != null) {
            return this.method32798(s, true);
        }
        throw new NullPointerException("encodedPathSegments == null");
    }
    
    private Class9085 method32798(final String s, final boolean b) {
        int n = 0;
        do {
            final int method24450 = Class7690.method24450(s, n, s.length(), "/\\");
            this.method32818(s, n, method24450, method24450 < s.length(), b);
            n = method24450 + 1;
        } while (n <= s.length());
        return this;
    }
    
    public Class9085 method32799(final int n, final String str) {
        if (str == null) {
            throw new NullPointerException("pathSegment == null");
        }
        final String method30971 = Class8846.method30971(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true);
        if (!this.method32819(method30971) && !this.method32820(method30971)) {
            this.field38474.set(n, method30971);
            return this;
        }
        throw new IllegalArgumentException("unexpected path segment: " + str);
    }
    
    public Class9085 method32800(final int n, final String str) {
        if (str == null) {
            throw new NullPointerException("encodedPathSegment == null");
        }
        final String method30971 = Class8846.method30971(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true);
        this.field38474.set(n, method30971);
        if (!this.method32819(method30971) && !this.method32820(method30971)) {
            return this;
        }
        throw new IllegalArgumentException("unexpected path segment: " + str);
    }
    
    public Class9085 method32801(final int n) {
        this.field38474.remove(n);
        if (this.field38474.isEmpty()) {
            this.field38474.add("");
        }
        return this;
    }
    
    public Class9085 method32802(final String str) {
        if (str == null) {
            throw new NullPointerException("encodedPath == null");
        }
        if (str.startsWith("/")) {
            this.method32817(str, 0, str.length());
            return this;
        }
        throw new IllegalArgumentException("unexpected encodedPath: " + str);
    }
    
    public Class9085 method32803(final String s) {
        this.field38475 = ((s == null) ? null : Class8846.method30946(Class8846.method30973(s, " \"'<>#", false, false, true, true)));
        return this;
    }
    
    public Class9085 method32804(final String s) {
        this.field38475 = ((s == null) ? null : Class8846.method30946(Class8846.method30973(s, " \"'<>#", true, false, true, true)));
        return this;
    }
    
    public Class9085 method32805(final String s, final String s2) {
        if (s != null) {
            if (this.field38475 == null) {
                this.field38475 = new ArrayList<String>();
            }
            this.field38475.add(Class8846.method30973(s, " \"'<>#&=", false, false, true, true));
            this.field38475.add((s2 == null) ? null : Class8846.method30973(s2, " \"'<>#&=", false, false, true, true));
            return this;
        }
        throw new NullPointerException("name == null");
    }
    
    public Class9085 method32806(final String s, final String s2) {
        if (s != null) {
            if (this.field38475 == null) {
                this.field38475 = new ArrayList<String>();
            }
            this.field38475.add(Class8846.method30973(s, " \"'<>#&=", true, false, true, true));
            this.field38475.add((s2 == null) ? null : Class8846.method30973(s2, " \"'<>#&=", true, false, true, true));
            return this;
        }
        throw new NullPointerException("encodedName == null");
    }
    
    public Class9085 method32807(final String s, final String s2) {
        this.method32809(s);
        this.method32805(s, s2);
        return this;
    }
    
    public Class9085 method32808(final String s, final String s2) {
        this.method32810(s);
        this.method32806(s, s2);
        return this;
    }
    
    public Class9085 method32809(final String s) {
        if (s == null) {
            throw new NullPointerException("name == null");
        }
        if (this.field38475 != null) {
            this.method32811(Class8846.method30973(s, " \"'<>#&=", false, false, true, true));
            return this;
        }
        return this;
    }
    
    public Class9085 method32810(final String s) {
        if (s == null) {
            throw new NullPointerException("encodedName == null");
        }
        if (this.field38475 != null) {
            this.method32811(Class8846.method30973(s, " \"'<>#&=", true, false, true, true));
            return this;
        }
        return this;
    }
    
    private void method32811(final String s) {
        for (int i = this.field38475.size() - 2; i >= 0; i -= 2) {
            if (s.equals(this.field38475.get(i))) {
                this.field38475.remove(i + 1);
                this.field38475.remove(i);
                if (this.field38475.isEmpty()) {
                    this.field38475 = null;
                    return;
                }
            }
        }
    }
    
    public Class9085 method32812(final String s) {
        this.field38476 = ((s == null) ? null : Class8846.method30973(s, "", false, false, false, false));
        return this;
    }
    
    public Class9085 method32813(final String s) {
        this.field38476 = ((s == null) ? null : Class8846.method30973(s, "", true, false, false, false));
        return this;
    }
    
    public Class9085 method32814() {
        for (int i = 0; i < this.field38474.size(); ++i) {
            this.field38474.set(i, Class8846.method30973(this.field38474.get(i), "[]", true, true, false, true));
        }
        if (this.field38475 != null) {
            for (int j = 0; j < this.field38475.size(); ++j) {
                final String s = this.field38475.get(j);
                if (s != null) {
                    this.field38475.set(j, Class8846.method30973(s, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (this.field38476 != null) {
            this.field38476 = Class8846.method30973(this.field38476, " \"#<>\\^`{|}", true, true, false, false);
        }
        return this;
    }
    
    public Class8846 method32815() {
        if (this.field38469 == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.field38472 != null) {
            return new Class8846(this);
        }
        throw new IllegalStateException("host == null");
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.field38469);
        sb.append("://");
        if (!this.field38470.isEmpty() || !this.field38471.isEmpty()) {
            sb.append(this.field38470);
            if (!this.field38471.isEmpty()) {
                sb.append(':');
                sb.append(this.field38471);
            }
            sb.append('@');
        }
        if (this.field38472.indexOf(58) == -1) {
            sb.append(this.field38472);
        }
        else {
            sb.append('[');
            sb.append(this.field38472);
            sb.append(']');
        }
        final int method32793 = this.method32793();
        if (method32793 != Class8846.method30938(this.field38469)) {
            sb.append(':');
            sb.append(method32793);
        }
        Class8846.method30941(sb, this.field38474);
        if (this.field38475 != null) {
            sb.append('?');
            Class8846.method30945(sb, this.field38475);
        }
        if (this.field38476 != null) {
            sb.append('#');
            sb.append(this.field38476);
        }
        return sb.toString();
    }
    
    public Class2054 method32816(final Class8846 class8846, final String s) {
        int method24447 = Class7690.method24447(s, 0, s.length());
        final int method24448 = Class7690.method24448(s, method24447, s.length());
        if (method32822(s, method24447, method24448) != -1) {
            if (s.regionMatches(true, method24447, "https:", 0, 6)) {
                this.field38469 = "https";
                method24447 += "https:".length();
            }
            else {
                if (!s.regionMatches(true, method24447, "http:", 0, 5)) {
                    return Class2054.field11722;
                }
                this.field38469 = "http";
                method24447 += "http:".length();
            }
        }
        else {
            if (class8846 == null) {
                return Class2054.field11721;
            }
            this.field38469 = class8846.field37189;
        }
        int n = 0;
        int n2 = 0;
        final int method24449 = method32823(s, method24447, method24448);
        if (method24449 >= 2 || class8846 == null || !class8846.field37189.equals(this.field38469)) {
            int n3 = method24447 + method24449;
            int method24450 = 0;
        Label_0448:
            while (true) {
                method24450 = Class7690.method24450(s, n3, method24448, "@/\\?#");
                switch ((method24450 != method24448) ? s.charAt(method24450) : -1) {
                    case 64: {
                        if (n2 == 0) {
                            final int method24451 = Class7690.method24451(s, n3, method24450, ':');
                            final String method24452 = Class8846.method30971(s, n3, method24451, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            this.field38470 = ((n != 0) ? (this.field38470 + "%40" + method24452) : method24452);
                            if (method24451 != method24450) {
                                n2 = 1;
                                this.field38471 = Class8846.method30971(s, method24451 + 1, method24450, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            }
                            n = 1;
                        }
                        else {
                            this.field38471 = this.field38471 + "%40" + Class8846.method30971(s, n3, method24450, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        }
                        n3 = method24450 + 1;
                        continue;
                    }
                    case -1:
                    case 35:
                    case 47:
                    case 63:
                    case 92: {
                        break Label_0448;
                    }
                }
            }
            final int method24453 = method32824(s, n3, method24450);
            if (method24453 + 1 < method24450) {
                this.field38472 = method32825(s, n3, method24453);
                this.field38473 = method32829(s, method24453 + 1, method24450);
                if (this.field38473 == -1) {
                    return Class2054.field11723;
                }
            }
            else {
                this.field38472 = method32825(s, n3, method24453);
                this.field38473 = Class8846.method30938(this.field38469);
            }
            if (this.field38472 == null) {
                return Class2054.field11724;
            }
            method24447 = method24450;
        }
        else {
            this.field38470 = class8846.method30932();
            this.field38471 = class8846.method30934();
            this.field38472 = class8846.field37192;
            this.field38473 = class8846.field37193;
            this.field38474.clear();
            this.field38474.addAll(class8846.method30942());
            if (method24447 == method24448 || s.charAt(method24447) == '#') {
                this.method32804(class8846.method30944());
            }
        }
        final int method24454 = Class7690.method24450(s, method24447, method24448, "?#");
        this.method32817(s, method24447, method24454);
        int n4 = method24454;
        if (n4 < method24448 && s.charAt(n4) == '?') {
            final int method24455 = Class7690.method24451(s, n4, method24448, '#');
            this.field38475 = Class8846.method30946(Class8846.method30971(s, n4 + 1, method24455, " \"'<>#", true, false, true, true));
            n4 = method24455;
        }
        if (n4 < method24448 && s.charAt(n4) == '#') {
            this.field38476 = Class8846.method30971(s, n4 + 1, method24448, "", true, false, false, false);
        }
        return Class2054.field11720;
    }
    
    private void method32817(final String s, int index, final int n) {
        if (index != n) {
            final char char1 = s.charAt(index);
            if (char1 != '/' && char1 != '\\') {
                this.field38474.set(this.field38474.size() - 1, "");
            }
            else {
                this.field38474.clear();
                this.field38474.add("");
                ++index;
            }
            int i = index;
            while (i < n) {
                final int method24450 = Class7690.method24450(s, i, n, "/\\");
                final boolean b = method24450 < n;
                this.method32818(s, i, method24450, b, true);
                i = method24450;
                if (!b) {
                    continue;
                }
                ++i;
            }
        }
    }
    
    private void method32818(final String s, final int n, final int n2, final boolean b, final boolean b2) {
        final String method30971 = Class8846.method30971(s, n, n2, " \"<>^`{}|/\\?#", b2, false, false, true);
        if (this.method32819(method30971)) {
            return;
        }
        if (!this.method32820(method30971)) {
            if (!this.field38474.get(this.field38474.size() - 1).isEmpty()) {
                this.field38474.add(method30971);
            }
            else {
                this.field38474.set(this.field38474.size() - 1, method30971);
            }
            if (b) {
                this.field38474.add("");
            }
            return;
        }
        this.method32821();
    }
    
    private boolean method32819(final String s) {
        return s.equals(".") || s.equalsIgnoreCase("%2e");
    }
    
    private boolean method32820(final String s) {
        if (!s.equals("..")) {
            if (!s.equalsIgnoreCase("%2e.")) {
                if (!s.equalsIgnoreCase(".%2e")) {
                    if (!s.equalsIgnoreCase("%2e%2e")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private void method32821() {
        if (this.field38474.remove(this.field38474.size() - 1).isEmpty() && !this.field38474.isEmpty()) {
            this.field38474.set(this.field38474.size() - 1, "");
        }
        else {
            this.field38474.add("");
        }
    }
    
    private static int method32822(final String s, final int index, final int n) {
        if (n - index < 2) {
            return -1;
        }
        final char char1 = s.charAt(index);
        if ((char1 < 'a' || char1 > 'z') && (char1 < 'A' || char1 > 'Z')) {
            return -1;
        }
        for (int i = index + 1; i < n; ++i) {
            final char char2 = s.charAt(i);
            if (char2 < 'a' || char2 > 'z') {
                if (char2 < 'A' || char2 > 'Z') {
                    if (char2 < '0' || char2 > '9') {
                        if (char2 != '+') {
                            if (char2 != '-') {
                                if (char2 != '.') {
                                    if (char2 != ':') {
                                        return -1;
                                    }
                                    return i;
                                }
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    private static int method32823(final String s, int i, final int n) {
        int n2 = 0;
        while (i < n) {
            final char char1 = s.charAt(i);
            if (char1 != '\\' && char1 != '/') {
                break;
            }
            ++n2;
            ++i;
        }
        return n2;
    }
    
    private static int method32824(final String s, final int n, final int n2) {
        for (int i = n; i < n2; ++i) {
            switch (s.charAt(i)) {
                case '[': {
                    while (++i < n2) {
                        if (s.charAt(i) == ']') {
                            break;
                        }
                    }
                    break;
                }
                case ':': {
                    return i;
                }
            }
        }
        return n2;
    }
    
    private static String method32825(final String s, final int n, final int n2) {
        final String method30967 = Class8846.method30967(s, n, n2, false);
        if (!method30967.contains(":")) {
            return Class7690.method24452(method30967);
        }
        final InetAddress inetAddress = (method30967.startsWith("[") && method30967.endsWith("]")) ? method32826(method30967, 1, method30967.length() - 1) : method32826(method30967, 0, method30967.length());
        if (inetAddress == null) {
            return null;
        }
        final byte[] address = inetAddress.getAddress();
        if (address.length != 16) {
            throw new AssertionError();
        }
        return method32828(address);
    }
    
    @Nullable
    private static InetAddress method32826(final String s, final int n, final int n2) {
        final byte[] array = new byte[16];
        int n3 = 0;
        int fromIndex = -1;
        int n4 = -1;
        int i = n;
        while (i < n2) {
            if (n3 == array.length) {
                return null;
            }
            if (i + 2 <= n2 && s.regionMatches(i, "::", 0, 2)) {
                if (fromIndex != -1) {
                    return null;
                }
                i += 2;
                n3 += 2;
                fromIndex = n3;
                if (i == n2) {
                    break;
                }
            }
            else if (n3 != 0) {
                if (s.regionMatches(i, ":", 0, 1)) {
                    ++i;
                }
                else {
                    if (!s.regionMatches(i, ".", 0, 1)) {
                        return null;
                    }
                    if (!method32827(s, n4, n2, array, n3 - 2)) {
                        return null;
                    }
                    n3 += 2;
                    break;
                }
            }
            int n5 = 0;
            n4 = i;
            while (i < n2) {
                final int method30970 = Class8846.method30970(s.charAt(i));
                if (method30970 == -1) {
                    break;
                }
                n5 = (n5 << 4) + method30970;
                ++i;
            }
            final int n6 = i - n4;
            if (n6 == 0 || n6 > 4) {
                return null;
            }
            array[n3++] = (byte)(n5 >>> 8 & 0xFF);
            array[n3++] = (byte)(n5 & 0xFF);
        }
        if (n3 != array.length) {
            if (fromIndex == -1) {
                return null;
            }
            System.arraycopy(array, fromIndex, array, array.length - (n3 - fromIndex), n3 - fromIndex);
            Arrays.fill(array, fromIndex, fromIndex + (array.length - n3), (byte)0);
        }
        try {
            return InetAddress.getByAddress(array);
        }
        catch (final UnknownHostException ex) {
            throw new AssertionError();
        }
    }
    
    private static boolean method32827(final String s, final int n, final int n2, final byte[] array, final int n3) {
        int n4 = n3;
        int i = n;
        while (i < n2) {
            if (n4 == array.length) {
                return false;
            }
            if (n4 != n3) {
                if (s.charAt(i) != '.') {
                    return false;
                }
                ++i;
            }
            int n5 = 0;
            final int n6 = i;
            while (i < n2) {
                final char char1 = s.charAt(i);
                if (char1 < '0') {
                    break;
                }
                if (char1 > '9') {
                    break;
                }
                if (n5 == 0 && n6 != i) {
                    return false;
                }
                n5 = n5 * 10 + char1 - 48;
                if (n5 > 255) {
                    return false;
                }
                ++i;
            }
            if (i - n6 == 0) {
                return false;
            }
            array[n4++] = (byte)n5;
        }
        return n4 == n3 + 4;
    }
    
    private static String method32828(final byte[] array) {
        int n = -1;
        int n2 = 0;
        for (int i = 0; i < array.length; i += 2) {
            final int n3 = i;
            while (i < 16) {
                if (array[i] != 0) {
                    break;
                }
                if (array[i + 1] != 0) {
                    break;
                }
                i += 2;
            }
            final int n4 = i - n3;
            if (n4 > n2) {
                if (n4 >= 4) {
                    n = n3;
                    n2 = n4;
                }
            }
        }
        final Class1680 class1680 = new Class1680();
        int j = 0;
        while (j < array.length) {
            if (j != n) {
                if (j > 0) {
                    class1680.method6004(58);
                }
                class1680.method6012((array[j] & 0xFF) << 8 | (array[j + 1] & 0xFF));
                j += 2;
            }
            else {
                class1680.method6004(58);
                j += n2;
                if (j != 16) {
                    continue;
                }
                class1680.method6004(58);
            }
        }
        return class1680.method5980();
    }
    
    private static int method32829(final String s, final int n, final int n2) {
        try {
            final int int1 = Integer.parseInt(Class8846.method30971(s, n, n2, "", false, false, false, true));
            if (int1 > 0 && int1 <= 65535) {
                return int1;
            }
            return -1;
        }
        catch (final NumberFormatException ex) {
            return -1;
        }
    }
}
