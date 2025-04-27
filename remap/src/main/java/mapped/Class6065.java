// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Iterator;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.regex.Pattern;
import java.util.Queue;
import java.io.Writer;
import java.util.Map;

public final class Class6065 implements Class6063
{
    private static final Map<Character, String> field24657;
    public static final int field24658 = 1;
    public static final int field24659 = 10;
    private static final char[] field24660;
    private static final Map<String, String> field24661;
    private final Writer field24662;
    private final Class7653<Class4119> field24663;
    private Class4119 field24664;
    private final Queue<Class6287> field24665;
    private Class6287 field24666;
    private final Class7653<Integer> field24667;
    private Integer field24668;
    private int field24669;
    private boolean field24670;
    private boolean field24671;
    private boolean field24672;
    private int field24673;
    private boolean field24674;
    private boolean field24675;
    private boolean field24676;
    private final Boolean field24677;
    private final Boolean field24678;
    private final boolean field24679;
    private int field24680;
    private final int field24681;
    private int field24682;
    private final char[] field24683;
    private final boolean field24684;
    private final Map<String, String> field24685;
    private String field24686;
    private String field24687;
    private Class9420 field24688;
    private Class2031 field24689;
    private static final Pattern field24690;
    private static final Pattern field24691;
    
    public Class6065(final Writer field24662, final Class7902 class7902) {
        this.field24662 = field24662;
        this.field24663 = new Class7653<Class4119>(100);
        this.field24664 = new Class4126(this, null);
        this.field24665 = new ArrayBlockingQueue<Class6287>(100);
        this.field24666 = null;
        this.field24667 = new Class7653<Integer>(10);
        this.field24668 = null;
        this.field24669 = 0;
        this.field24671 = false;
        this.field24672 = false;
        this.field24673 = 0;
        this.field24674 = true;
        this.field24675 = true;
        this.field24676 = false;
        this.field24677 = class7902.method25584();
        this.field24678 = class7902.method25586();
        this.field24679 = class7902.method25573();
        this.field24680 = 2;
        if (class7902.method25578() > 1) {
            if (class7902.method25578() < 10) {
                this.field24680 = class7902.method25578();
            }
        }
        this.field24681 = class7902.method25580();
        this.field24682 = 80;
        if (class7902.method25588() > this.field24680 * 2) {
            this.field24682 = class7902.method25588();
        }
        this.field24683 = class7902.method25591().method8223().toCharArray();
        this.field24684 = class7902.method25590();
        this.field24685 = new LinkedHashMap<String, String>();
        this.field24686 = null;
        this.field24687 = null;
        this.field24688 = null;
        this.field24689 = null;
    }
    
    @Override
    public void method18052(final Class6287 class6287) throws IOException {
        this.field24665.add(class6287);
        while (!this.method18054()) {
            this.field24666 = this.field24665.poll();
            this.field24664.method12368();
            this.field24666 = null;
        }
    }
    
    private boolean method18054() {
        if (this.field24665.isEmpty()) {
            return true;
        }
        final Class6287 class6287 = this.field24665.peek();
        if (class6287 instanceof Class6291) {
            return this.method18055(1);
        }
        if (!(class6287 instanceof Class6294)) {
            return class6287 instanceof Class6295 && this.method18055(3);
        }
        return this.method18055(2);
    }
    
    private boolean method18055(final int n) {
        int n2 = 0;
        final Iterator<Object> iterator = this.field24665.iterator();
        iterator.next();
        while (iterator.hasNext()) {
            final Class6287 class6287 = iterator.next();
            if (!(class6287 instanceof Class6291) && !(class6287 instanceof Class6293)) {
                if (!(class6287 instanceof Class6299) && !(class6287 instanceof Class6288)) {
                    if (class6287 instanceof Class6298) {
                        n2 = -1;
                    }
                }
                else {
                    --n2;
                }
            }
            else {
                ++n2;
            }
            if (n2 >= 0) {
                continue;
            }
            return false;
        }
        return this.field24665.size() < n + 1;
    }
    
    private void method18056(final boolean b, final boolean b2) {
        this.field24667.method24253(this.field24668);
        if (this.field24668 != null) {
            if (!b2) {
                this.field24668 += this.field24680;
            }
        }
        else if (!b) {
            this.field24668 = 0;
        }
        else {
            this.field24668 = this.field24680;
        }
    }
    
    private void method18057(final boolean field24670, final boolean field24671, final boolean field24672) throws IOException {
        this.field24670 = field24670;
        this.field24671 = field24671;
        this.field24672 = field24672;
        if (!(this.field24666 instanceof Class6296)) {
            if (!(this.field24666 instanceof Class6297) && !(this.field24666 instanceof Class6293)) {
                throw new Class2395("expected NodeEvent, but got " + this.field24666);
            }
            this.method18068("&");
            this.method18069();
            if (!(this.field24666 instanceof Class6297)) {
                if (!(this.field24666 instanceof Class6294)) {
                    if (this.field24669 == 0) {
                        if (!this.field24677) {
                            if (!((Class6295)this.field24666).method18625()) {
                                if (!this.method18065()) {
                                    this.method18063();
                                    return;
                                }
                            }
                        }
                    }
                    this.method18061();
                }
                else {
                    if (this.field24669 == 0) {
                        if (!this.field24677) {
                            if (!((Class6294)this.field24666).method18625()) {
                                if (!this.method18064()) {
                                    this.method18062();
                                    return;
                                }
                            }
                        }
                    }
                    this.method18060();
                }
            }
            else {
                this.method18059();
            }
        }
        else {
            this.method18058();
        }
    }
    
    private void method18058() throws IOException {
        if (((Class6292)this.field24666).method18621() != null) {
            this.method18068("*");
            this.field24664 = this.field24663.method24254();
            return;
        }
        throw new Class2395("anchor is not specified for alias");
    }
    
    private void method18059() throws IOException {
        this.method18056(true, false);
        this.method18071();
        this.field24668 = this.field24667.method24254();
        this.field24664 = this.field24663.method24254();
    }
    
    private void method18060() throws IOException {
        this.method18081("[", true, true, false);
        ++this.field24669;
        this.method18056(true, false);
        if (this.field24678) {
            this.method18082();
        }
        this.field24664 = new Class4124(this, null);
    }
    
    private void method18061() throws IOException {
        this.method18081("{", true, true, false);
        ++this.field24669;
        this.method18056(true, false);
        if (this.field24678) {
            this.method18082();
        }
        this.field24664 = new Class4128(this, null);
    }
    
    private void method18062() throws IOException {
        this.method18056(false, this.field24671 && !this.field24675);
        this.field24664 = new Class4122(this, null);
    }
    
    private void method18063() throws IOException {
        this.method18056(false, false);
        this.field24664 = new Class4118(this, null);
    }
    
    private boolean method18064() {
        if (this.field24666 instanceof Class6294) {
            if (!this.field24665.isEmpty()) {
                return this.field24665.peek() instanceof Class6290;
            }
        }
        return false;
    }
    
    private boolean method18065() {
        if (this.field24666 instanceof Class6295) {
            if (!this.field24665.isEmpty()) {
                return this.field24665.peek() instanceof Class6289;
            }
        }
        return false;
    }
    
    private boolean method18066() {
        if (!(this.field24666 instanceof Class6291) || this.field24665.isEmpty()) {
            return false;
        }
        final Class6287 class6287 = this.field24665.peek();
        if (!(class6287 instanceof Class6297)) {
            return false;
        }
        final Class6297 class6288 = (Class6297)class6287;
        if (class6288.method18621() == null) {
            if (class6288.method18626() == null) {
                if (class6288.method18629() != null) {
                    return class6288.method18628().length() == 0;
                }
            }
        }
        return false;
    }
    
    private boolean method18067() {
        int n = 0;
        if (this.field24666 instanceof Class6292) {
            if (((Class6292)this.field24666).method18621() != null) {
                if (this.field24686 == null) {
                    this.field24686 = method18076(((Class6292)this.field24666).method18621());
                }
                n += this.field24686.length();
            }
        }
        String s = null;
        if (!(this.field24666 instanceof Class6297)) {
            if (this.field24666 instanceof Class6293) {
                s = ((Class6293)this.field24666).method18622();
            }
        }
        else {
            s = ((Class6297)this.field24666).method18626();
        }
        if (s != null) {
            if (this.field24687 == null) {
                this.field24687 = this.method18075(s);
            }
            n += this.field24687.length();
        }
        if (this.field24666 instanceof Class6297) {
            if (this.field24688 == null) {
                this.field24688 = this.method18077(((Class6297)this.field24666).method18628());
            }
            n += this.field24688.field40411.length();
        }
        if (n < 128) {
            if (!(this.field24666 instanceof Class6296)) {
                if (this.field24666 instanceof Class6297) {
                    if (!this.field24688.field40412) {
                        if (!this.field24688.field40413) {
                            return true;
                        }
                    }
                }
                if (!this.method18064()) {
                    return this.method18065();
                }
            }
            return true;
        }
        return false;
    }
    
    private void method18068(final String str) throws IOException {
        final Class6292 class6292 = (Class6292)this.field24666;
        if (class6292.method18621() != null) {
            if (this.field24686 == null) {
                this.field24686 = method18076(class6292.method18621());
            }
            this.method18081(str + this.field24686, true, false, false);
            this.field24686 = null;
            return;
        }
        this.field24686 = null;
    }
    
    private void method18069() throws IOException {
        String s;
        if (!(this.field24666 instanceof Class6297)) {
            final Class6293 class6293 = (Class6293)this.field24666;
            s = class6293.method18622();
            if (!this.field24677 || s == null) {
                if (class6293.method18623()) {
                    this.field24687 = null;
                    return;
                }
            }
        }
        else {
            final Class6297 class6294 = (Class6297)this.field24666;
            s = class6294.method18626();
            if (this.field24689 == null) {
                this.field24689 = this.method18070();
            }
            Label_0120: {
                if (!this.field24677 || s == null) {
                    if (this.field24689 != null || !class6294.method18629().method32636()) {
                        if (this.field24689 == null) {
                            break Label_0120;
                        }
                        if (!class6294.method18629().method32637()) {
                            break Label_0120;
                        }
                    }
                    this.field24687 = null;
                    return;
                }
            }
            if (class6294.method18629().method32636()) {
                if (s == null) {
                    s = "!";
                    this.field24687 = null;
                }
            }
        }
        if (s != null) {
            if (this.field24687 == null) {
                this.field24687 = this.method18075(s);
            }
            this.method18081(this.field24687, true, false, false);
            this.field24687 = null;
            return;
        }
        throw new Class2395("tag is not specified");
    }
    
    private Class2031 method18070() {
        final Class6297 class6297 = (Class6297)this.field24666;
        if (this.field24688 == null) {
            this.field24688 = this.method18077(class6297.method18628());
        }
        if ((class6297.method18630() || class6297.method18627() != Class2031.field11575) && !this.field24677) {
            Label_0039: {
                if (class6297.method18630()) {
                    if (class6297.method18629().method32636()) {
                        if (this.field24672) {
                            if (this.field24688.field40412) {
                                break Label_0039;
                            }
                            if (this.field24688.field40413) {
                                break Label_0039;
                            }
                        }
                        if (this.field24669 == 0 || !this.field24688.field40414) {
                            if (this.field24669 != 0) {
                                break Label_0039;
                            }
                            if (!this.field24688.field40415) {
                                break Label_0039;
                            }
                        }
                        return null;
                    }
                }
            }
            if (!class6297.method18630()) {
                if (class6297.method18627() == Class2031.field11577 || class6297.method18627() == Class2031.field11578) {
                    if (this.field24669 == 0) {
                        if (!this.field24672) {
                            if (this.field24688.field40417) {
                                return class6297.method18627();
                            }
                        }
                    }
                }
            }
            if (class6297.method18630() || class6297.method18627() == Class2031.field11576) {
                if (this.field24688.field40416) {
                    if (!this.field24672 || !this.field24688.field40413) {
                        return Class2031.field11576;
                    }
                }
            }
            return Class2031.field11575;
        }
        return Class2031.field11575;
    }
    
    private void method18071() throws IOException {
        final Class6297 class6297 = (Class6297)this.field24666;
        if (this.field24688 == null) {
            this.field24688 = this.method18077(class6297.method18628());
        }
        if (this.field24689 == null) {
            this.field24689 = this.method18070();
        }
        final boolean b = !this.field24672 && this.field24684;
        if (this.field24689 == null) {
            this.method18092(this.field24688.field40411, b);
        }
        else {
            switch (Class9460.field40670[this.field24689.ordinal()]) {
                case 1: {
                    this.method18088(this.field24688.field40411, b);
                    break;
                }
                case 2: {
                    this.method18087(this.field24688.field40411, b);
                    break;
                }
                case 3: {
                    this.method18090(this.field24688.field40411, b);
                    break;
                }
                case 4: {
                    this.method18091(this.field24688.field40411);
                    break;
                }
                default: {
                    throw new Class2386("Unexpected style: " + this.field24689);
                }
            }
        }
        this.field24688 = null;
        this.field24689 = null;
    }
    
    private String method18072(final Class2206 obj) {
        if (obj.method8383() == 1) {
            return obj.method8385();
        }
        throw new Class2395("unsupported YAML version: " + obj);
    }
    
    private String method18073(final String s) {
        if (s.length() == 0) {
            throw new Class2395("tag handle must not be empty");
        }
        if (s.charAt(0) != '!' || s.charAt(s.length() - 1) != '!') {
            throw new Class2395("tag handle must start and end with '!': " + s);
        }
        if (!"!".equals(s) && !Class6065.field24690.matcher(s).matches()) {
            throw new Class2395("invalid character in the tag handle: " + s);
        }
        return s;
    }
    
    private String method18074(final String s) {
        if (s.length() != 0) {
            final StringBuilder sb = new StringBuilder();
            final int beginIndex = 0;
            int i = 0;
            if (s.charAt(0) == '!') {
                i = 1;
            }
            while (i < s.length()) {
                ++i;
            }
            if (beginIndex < i) {
                sb.append(s, beginIndex, i);
            }
            return sb.toString();
        }
        throw new Class2395("tag prefix must not be empty");
    }
    
    private String method18075(final String anObject) {
        if (anObject.length() == 0) {
            throw new Class2395("tag must not be empty");
        }
        if ("!".equals(anObject)) {
            return anObject;
        }
        String str = null;
        String substring = anObject;
        for (final String s : this.field24685.keySet()) {
            if (!anObject.startsWith(s)) {
                continue;
            }
            if (!"!".equals(s) && s.length() >= anObject.length()) {
                continue;
            }
            str = s;
        }
        if (str != null) {
            substring = anObject.substring(str.length());
            str = this.field24685.get(str);
        }
        final int length = substring.length();
        final String s2 = (length <= 0) ? "" : substring.substring(0, length);
        if (str == null) {
            return "!<" + s2 + ">";
        }
        return str + s2;
    }
    
    public static String method18076(final String s) {
        if (s.length() == 0) {
            throw new Class2395("anchor must not be empty");
        }
        if (Class6065.field24691.matcher(s).matches()) {
            return s;
        }
        throw new Class2395("invalid character in the anchor: " + s);
    }
    
    private Class9420 method18077(final String s) {
        if (s.length() != 0) {
            boolean b = false;
            boolean b2 = false;
            boolean b3 = false;
            boolean b4 = false;
            int n = 0;
            boolean b5 = false;
            boolean b6 = false;
            boolean b7 = false;
            boolean b8 = false;
            boolean b9 = false;
            if (s.startsWith("---") || s.startsWith("...")) {
                b = true;
                b2 = true;
            }
            int n2 = 1;
            int n3 = (s.length() == 1 || Class6942.field27190.method21321(s.codePointAt(1))) ? 1 : 0;
            int n4 = 0;
            int n5 = 0;
            int i = 0;
            while (i < s.length()) {
                final int codePoint = s.codePointAt(i);
                if (i != 0) {
                    if (",?[]{}".indexOf(codePoint) != -1) {
                        b2 = true;
                    }
                    if (codePoint == 58) {
                        b2 = true;
                        if (n3 != 0) {
                            b = true;
                        }
                    }
                    if (codePoint == 35) {
                        if (n2 != 0) {
                            b2 = true;
                            b = true;
                        }
                    }
                }
                else {
                    if ("#,[]{}&*!|>'\"%@`".indexOf(codePoint) != -1) {
                        b2 = true;
                        b = true;
                    }
                    if (codePoint == 63 || codePoint == 58) {
                        b2 = true;
                        if (n3 != 0) {
                            b = true;
                        }
                    }
                    if (codePoint == 45) {
                        if (n3 != 0) {
                            b2 = true;
                            b = true;
                        }
                    }
                }
                final boolean method21321 = Class6942.field27186.method21321(codePoint);
                if (method21321) {
                    b3 = true;
                }
                Label_0234: {
                    if (codePoint != 10) {
                        if (32 > codePoint || codePoint > 126) {
                            if (codePoint != 133) {
                                if (codePoint < 160 || codePoint > 55295) {
                                    if (codePoint < 57344 || codePoint > 65533) {
                                        if (codePoint < 65536 || codePoint > 1114111) {
                                            b4 = true;
                                            break Label_0234;
                                        }
                                    }
                                }
                            }
                            if (!this.field24679) {
                                b4 = true;
                            }
                        }
                    }
                }
                if (codePoint != 32) {
                    if (!method21321) {
                        n4 = 0;
                        n5 = 0;
                    }
                    else {
                        if (i == 0) {
                            b5 = true;
                        }
                        if (i == s.length() - 1) {
                            b7 = true;
                        }
                        if (n4 != 0) {
                            b9 = true;
                        }
                        n4 = 0;
                        n5 = 1;
                    }
                }
                else {
                    if (i == 0) {
                        n = 1;
                    }
                    if (i == s.length() - 1) {
                        b6 = true;
                    }
                    if (n5 != 0) {
                        b8 = true;
                    }
                    n4 = 1;
                    n5 = 0;
                }
                i += Character.charCount(codePoint);
                n2 = ((Class6942.field27191.method21321(codePoint) || method21321) ? 1 : 0);
                n3 = 1;
                if (i + 1 >= s.length()) {
                    continue;
                }
                final int index = i + Character.charCount(s.codePointAt(i));
                if (index >= s.length()) {
                    continue;
                }
                n3 = ((Class6942.field27191.method21321(s.codePointAt(index)) || method21321) ? 1 : 0);
            }
            boolean b10 = true;
            boolean b11 = true;
            boolean b12 = true;
            boolean b13 = true;
            Label_0778: {
                if (n == 0) {
                    if (!b5) {
                        if (!b6) {
                            if (!b7) {
                                break Label_0778;
                            }
                        }
                    }
                }
                b11 = (b10 = false);
            }
            if (b6) {
                b13 = false;
            }
            if (b8) {
                b11 = (b10 = (b12 = false));
            }
            if (b9 || b4) {
                b11 = (b10 = (b12 = (b13 = false)));
            }
            if (b3) {
                b10 = false;
            }
            if (b2) {
                b10 = false;
            }
            if (b) {
                b11 = false;
            }
            return new Class9420(s, false, b3, b10, b11, b12, b13);
        }
        return new Class9420(s, true, false, false, true, true, false);
    }
    
    public void method18078() throws IOException {
        this.field24662.flush();
    }
    
    public void method18079() {
    }
    
    public void method18080() throws IOException {
        this.method18078();
    }
    
    public void method18081(final String str, final boolean b, final boolean field24674, final boolean b2) throws IOException {
        if (!this.field24674) {
            if (b) {
                ++this.field24673;
                this.field24662.write(Class6065.field24660);
            }
        }
        this.field24674 = field24674;
        this.field24675 = (this.field24675 && b2);
        this.field24673 += str.length();
        this.field24676 = false;
        this.field24662.write(str);
    }
    
    public void method18082() throws IOException {
        int intValue;
        if (this.field24668 == null) {
            intValue = 0;
        }
        else {
            intValue = this.field24668;
        }
        Label_0057: {
            if (this.field24675) {
                if (this.field24673 <= intValue) {
                    if (this.field24673 != intValue) {
                        break Label_0057;
                    }
                    if (this.field24674) {
                        break Label_0057;
                    }
                }
            }
            this.method18084(null);
        }
        this.method18083(intValue - this.field24673);
    }
    
    private void method18083(final int n) throws IOException {
        if (n > 0) {
            this.field24674 = true;
            final char[] cbuf = new char[n];
            for (int i = 0; i < cbuf.length; ++i) {
                cbuf[i] = ' ';
            }
            this.field24673 += n;
            this.field24662.write(cbuf);
        }
    }
    
    private void method18084(final String str) throws IOException {
        this.field24674 = true;
        this.field24675 = true;
        this.field24673 = 0;
        if (str != null) {
            this.field24662.write(str);
        }
        else {
            this.field24662.write(this.field24683);
        }
    }
    
    public void method18085(final String str) throws IOException {
        this.field24662.write("%YAML ");
        this.field24662.write(str);
        this.method18084(null);
    }
    
    public void method18086(final String str, final String str2) throws IOException {
        this.field24662.write("%TAG ");
        this.field24662.write(str);
        this.field24662.write(Class6065.field24660);
        this.field24662.write(str2);
        this.method18084(null);
    }
    
    private void method18087(final String s, final boolean b) throws IOException {
        this.method18081("'", true, false, false);
        int n = 0;
        boolean method21321 = false;
        int n2 = 0;
        for (int i = 0; i <= s.length(); ++i) {
            int char1 = 0;
            if (i < s.length()) {
                char1 = s.charAt(i);
            }
            if (n == 0) {
                if (!method21321) {
                    if (Class6942.field27186.method21323(char1, "\u0000 '")) {
                        if (n2 < i) {
                            final int len = i - n2;
                            this.field24673 += len;
                            this.field24662.write(s, n2, len);
                            n2 = i;
                        }
                    }
                }
                else if (char1 == 0 || Class6942.field27186.method21322(char1)) {
                    if (s.charAt(n2) == '\n') {
                        this.method18084(null);
                    }
                    for (final char c : s.substring(n2, i).toCharArray()) {
                        if (c != '\n') {
                            this.method18084(String.valueOf(c));
                        }
                        else {
                            this.method18084(null);
                        }
                    }
                    this.method18082();
                    n2 = i;
                }
            }
            else if (char1 == 0 || char1 != 32) {
                Label_0222: {
                    if (n2 + 1 == i) {
                        if (this.field24673 > this.field24682) {
                            if (b) {
                                if (n2 != 0) {
                                    if (i != s.length()) {
                                        this.method18082();
                                        break Label_0222;
                                    }
                                }
                            }
                        }
                    }
                    final int len2 = i - n2;
                    this.field24673 += len2;
                    this.field24662.write(s, n2, len2);
                }
                n2 = i;
            }
            if (char1 == 39) {
                this.field24673 += 2;
                this.field24662.write("''");
                n2 = i + 1;
            }
            if (char1 != 0) {
                n = ((char1 == 32) ? 1 : 0);
                method21321 = Class6942.field27186.method21321(char1);
            }
        }
        this.method18081("'", false, false, false);
    }
    
    private void method18088(final String str, final boolean b) throws IOException {
        this.method18081("\"", true, false, false);
        int index = 0;
        for (int i = 0; i <= str.length(); ++i) {
            Character value = null;
            if (i < str.length()) {
                value = str.charAt(i);
            }
            Label_0066: {
                if (value != null) {
                    if ("\"\\\u0085\u2028\u2029\ufeff".indexOf(value) == -1) {
                        if (' ' <= value) {
                            if (value <= '~') {
                                break Label_0066;
                            }
                        }
                    }
                }
                if (index < i) {
                    final int len = i - index;
                    this.field24673 += len;
                    this.field24662.write(str, index, len);
                    index = i;
                }
                if (value != null) {
                    String str2;
                    if (!Class6065.field24657.containsKey(value)) {
                        if (this.field24679 && Class8028.method26320(value)) {
                            str2 = String.valueOf(value);
                        }
                        else if (value > '\u00ff') {
                            if (value >= '\ud800' && value <= '\udbff') {
                                if (i + 1 >= str.length()) {
                                    final String string = "000" + Integer.toString(value, 16);
                                    str2 = "\\u" + string.substring(string.length() - 4);
                                }
                                else {
                                    final String string2 = "000" + Long.toHexString(Character.toCodePoint(value, str.charAt(++i)));
                                    str2 = "\\U" + string2.substring(string2.length() - 8);
                                }
                            }
                            else {
                                final String string3 = "000" + Integer.toString(value, 16);
                                str2 = "\\u" + string3.substring(string3.length() - 4);
                            }
                        }
                        else {
                            final String string4 = "0" + Integer.toString(value, 16);
                            str2 = "\\x" + string4.substring(string4.length() - 2);
                        }
                    }
                    else {
                        str2 = "\\" + Class6065.field24657.get(value);
                    }
                    this.field24673 += str2.length();
                    this.field24662.write(str2);
                    index = i + 1;
                }
            }
            if (0 < i) {
                if (i < str.length() - 1) {
                    if (value == ' ' || index >= i) {
                        if (this.field24673 + (i - index) > this.field24682) {
                            if (b) {
                                String string5;
                                if (index < i) {
                                    string5 = str.substring(index, i) + "\\";
                                }
                                else {
                                    string5 = "\\";
                                }
                                if (index < i) {
                                    index = i;
                                }
                                this.field24673 += string5.length();
                                this.field24662.write(string5);
                                this.method18082();
                                this.field24674 = false;
                                this.field24675 = false;
                                if (str.charAt(index) == ' ') {
                                    final String str3 = "\\";
                                    this.field24673 += str3.length();
                                    this.field24662.write(str3);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.method18081("\"", false, false, false);
    }
    
    private String method18089(final String s) {
        final StringBuilder sb = new StringBuilder();
        if (Class6942.field27186.method21323(s.charAt(0), " ")) {
            sb.append(this.field24680);
        }
        if (!Class6942.field27186.method21322(s.charAt(s.length() - 1))) {
            if (s.length() == 1 || Class6942.field27186.method21321(s.charAt(s.length() - 2))) {
                sb.append("+");
            }
        }
        else {
            sb.append("-");
        }
        return sb.toString();
    }
    
    public void method18090(final String s, final boolean b) throws IOException {
        final String method18089 = this.method18089(s);
        this.method18081(">" + method18089, true, false, false);
        if (method18089.length() > 0) {
            if (method18089.charAt(method18089.length() - 1) == '+') {
                this.field24676 = true;
            }
        }
        this.method18084(null);
        int n = 1;
        int n2 = 0;
        boolean method18090 = true;
        int n3 = 0;
        for (int i = 0; i <= s.length(); ++i) {
            int char1 = 0;
            if (i < s.length()) {
                char1 = s.charAt(i);
            }
            if (!method18090) {
                if (n2 == 0) {
                    if (Class6942.field27186.method21323(char1, "\u0000 ")) {
                        final int len = i - n3;
                        this.field24673 += len;
                        this.field24662.write(s, n3, len);
                        if (char1 == 0) {
                            this.method18084(null);
                        }
                        n3 = i;
                    }
                }
                else if (char1 != 32) {
                    Label_0429: {
                        if (n3 + 1 == i) {
                            if (this.field24673 > this.field24682) {
                                if (b) {
                                    this.method18082();
                                    break Label_0429;
                                }
                            }
                        }
                        final int len2 = i - n3;
                        this.field24673 += len2;
                        this.field24662.write(s, n3, len2);
                    }
                    n3 = i;
                }
            }
            else if (char1 == 0 || Class6942.field27186.method21322(char1)) {
                if (n == 0) {
                    if (char1 != 0) {
                        if (char1 != 32) {
                            if (s.charAt(n3) == '\n') {
                                this.method18084(null);
                            }
                        }
                    }
                }
                n = ((char1 == 32) ? 1 : 0);
                for (final char c : s.substring(n3, i).toCharArray()) {
                    if (c != '\n') {
                        this.method18084(String.valueOf(c));
                    }
                    else {
                        this.method18084(null);
                    }
                }
                if (char1 != 0) {
                    this.method18082();
                }
                n3 = i;
            }
            if (char1 != 0) {
                method18090 = Class6942.field27186.method21321(char1);
                n2 = ((char1 == 32) ? 1 : 0);
            }
        }
    }
    
    public void method18091(final String str) throws IOException {
        final String method18089 = this.method18089(str);
        this.method18081("|" + method18089, true, false, false);
        if (method18089.length() > 0) {
            if (method18089.charAt(method18089.length() - 1) == '+') {
                this.field24676 = true;
            }
        }
        this.method18084(null);
        boolean method18090 = true;
        int n = 0;
        for (int i = 0; i <= str.length(); ++i) {
            int char1 = 0;
            if (i < str.length()) {
                char1 = str.charAt(i);
            }
            if (!method18090) {
                if (char1 == 0 || Class6942.field27186.method21321(char1)) {
                    this.field24662.write(str, n, i - n);
                    if (char1 == 0) {
                        this.method18084(null);
                    }
                    n = i;
                }
            }
            else if (char1 == 0 || Class6942.field27186.method21322(char1)) {
                for (final char c : str.substring(n, i).toCharArray()) {
                    if (c != '\n') {
                        this.method18084(String.valueOf(c));
                    }
                    else {
                        this.method18084(null);
                    }
                }
                if (char1 != 0) {
                    this.method18082();
                }
                n = i;
            }
            if (char1 != 0) {
                method18090 = Class6942.field27186.method21321(char1);
            }
        }
    }
    
    public void method18092(final String s, final boolean b) throws IOException {
        if (this.field24670) {
            this.field24676 = true;
        }
        if (s.length() != 0) {
            if (!this.field24674) {
                ++this.field24673;
                this.field24662.write(Class6065.field24660);
            }
            this.field24674 = false;
            this.field24675 = false;
            int n = 0;
            boolean method21321 = false;
            int n2 = 0;
            for (int i = 0; i <= s.length(); ++i) {
                int char1 = 0;
                if (i < s.length()) {
                    char1 = s.charAt(i);
                }
                if (n == 0) {
                    if (!method21321) {
                        if (Class6942.field27186.method21323(char1, "\u0000 ")) {
                            final int len = i - n2;
                            this.field24673 += len;
                            this.field24662.write(s, n2, len);
                            n2 = i;
                        }
                    }
                    else if (Class6942.field27186.method21322(char1)) {
                        if (s.charAt(n2) == '\n') {
                            this.method18084(null);
                        }
                        for (final char c : s.substring(n2, i).toCharArray()) {
                            if (c != '\n') {
                                this.method18084(String.valueOf(c));
                            }
                            else {
                                this.method18084(null);
                            }
                        }
                        this.method18082();
                        this.field24674 = false;
                        this.field24675 = false;
                        n2 = i;
                    }
                }
                else if (char1 != 32) {
                    Label_0244: {
                        if (n2 + 1 == i) {
                            if (this.field24673 > this.field24682) {
                                if (b) {
                                    this.method18082();
                                    this.field24674 = false;
                                    this.field24675 = false;
                                    break Label_0244;
                                }
                            }
                        }
                        final int len2 = i - n2;
                        this.field24673 += len2;
                        this.field24662.write(s, n2, len2);
                    }
                    n2 = i;
                }
                if (char1 != 0) {
                    n = ((char1 == 32) ? 1 : 0);
                    method21321 = Class6942.field27186.method21321(char1);
                }
            }
        }
    }
    
    static {
        field24657 = new HashMap<Character, String>();
        field24660 = new char[] { ' ' };
        Class6065.field24657.put('\0', Class6065.\ub168\u4ab4\u772f\u52b3\u6e08\u5afc[32]);
        Class6065.field24657.put('\u0007', "a");
        Class6065.field24657.put('\b', "b");
        Class6065.field24657.put('\t', "t");
        Class6065.field24657.put('\n', "n");
        Class6065.field24657.put('\u000b', "v");
        Class6065.field24657.put('\f', "f");
        Class6065.field24657.put('\r', "r");
        Class6065.field24657.put('\u001b', "e");
        Class6065.field24657.put('\"', Class6065.\ub168\u4ab4\u772f\u52b3\u6e08\u5afc[29]);
        Class6065.field24657.put('\\', Class6065.\ub168\u4ab4\u772f\u52b3\u6e08\u5afc[31]);
        Class6065.field24657.put('\u0085', "N");
        Class6065.field24657.put(' ', "_");
        Class6065.field24657.put('\u2028', "L");
        Class6065.field24657.put('\u2029', "P");
        (field24661 = new LinkedHashMap<String, String>()).put(Class6065.\ub168\u4ab4\u772f\u52b3\u6e08\u5afc[6], Class6065.\ub168\u4ab4\u772f\u52b3\u6e08\u5afc[6]);
        Class6065.field24661.put("tag:yaml.org,2002:", "!!");
        field24690 = Pattern.compile("^![-_\\w]*!$");
        field24691 = Pattern.compile("^[-_\\w]*$");
    }
}
