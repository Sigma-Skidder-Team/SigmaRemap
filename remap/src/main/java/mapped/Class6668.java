// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;

public final class Class6668
{
    public static final Class6668 field26340;
    public static final Class6668 field26341;
    private final boolean field26342;
    private final boolean field26343;
    private final int field26344;
    private final int field26345;
    private final boolean field26346;
    private final boolean field26347;
    private final boolean field26348;
    private final int field26349;
    private final int field26350;
    private final boolean field26351;
    private final boolean field26352;
    private final boolean field26353;
    public String field26354;
    
    private Class6668(final boolean field26342, final boolean field26343, final int field26344, final int field26345, final boolean field26346, final boolean field26347, final boolean field26348, final int field26349, final int field26350, final boolean field26351, final boolean field26352, final boolean field26353, final String field26354) {
        this.field26342 = field26342;
        this.field26343 = field26343;
        this.field26344 = field26344;
        this.field26345 = field26345;
        this.field26346 = field26346;
        this.field26347 = field26347;
        this.field26348 = field26348;
        this.field26349 = field26349;
        this.field26350 = field26350;
        this.field26351 = field26351;
        this.field26352 = field26352;
        this.field26353 = field26353;
        this.field26354 = field26354;
    }
    
    public Class6668(final Class6905 class6905) {
        this.field26342 = class6905.field27083;
        this.field26343 = class6905.field27084;
        this.field26344 = class6905.field27085;
        this.field26345 = -1;
        this.field26346 = false;
        this.field26347 = false;
        this.field26348 = false;
        this.field26349 = class6905.field27086;
        this.field26350 = class6905.field27087;
        this.field26351 = class6905.field27088;
        this.field26352 = class6905.field27089;
        this.field26353 = class6905.field27090;
    }
    
    public boolean method20282() {
        return this.field26342;
    }
    
    public boolean method20283() {
        return this.field26343;
    }
    
    public int method20284() {
        return this.field26344;
    }
    
    public int method20285() {
        return this.field26345;
    }
    
    public boolean method20286() {
        return this.field26346;
    }
    
    public boolean method20287() {
        return this.field26347;
    }
    
    public boolean method20288() {
        return this.field26348;
    }
    
    public int method20289() {
        return this.field26349;
    }
    
    public int method20290() {
        return this.field26350;
    }
    
    public boolean method20291() {
        return this.field26351;
    }
    
    public boolean method20292() {
        return this.field26352;
    }
    
    public boolean method20293() {
        return this.field26353;
    }
    
    public static Class6668 method20294(final Class6957 class6957) {
        boolean b = false;
        boolean b2 = false;
        int method35766 = -1;
        int method35767 = -1;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        int method35768 = -1;
        int method35769 = -1;
        boolean b6 = false;
        boolean b7 = false;
        boolean b8 = false;
        int n = 1;
        String s = null;
        int i = 0;
    Label_0132_Outer:
        while (i < class6957.method21362()) {
            final String method35770 = class6957.method21363(i);
            final String method35771 = class6957.method21364(i);
            while (true) {
                Label_0162: {
                    if (!method35770.equalsIgnoreCase("Cache-Control")) {
                        if (method35770.equalsIgnoreCase("Pragma")) {
                            n = 0;
                            break Label_0162;
                        }
                    }
                    else {
                        if (s == null) {
                            s = method35771;
                            break Label_0162;
                        }
                        n = 0;
                        break Label_0162;
                    }
                    ++i;
                    continue Label_0132_Outer;
                }
                int j = 0;
                while (j < method35771.length()) {
                    final int beginIndex = j;
                    j = Class9558.method35764(method35771, j, "=,;");
                    final String trim = method35771.substring(beginIndex, j).trim();
                    String s2 = null;
                    Label_0363: {
                        if (j != method35771.length()) {
                            if (method35771.charAt(j) != ',') {
                                if (method35771.charAt(j) != ';') {
                                    ++j;
                                    int method35772 = Class9558.method35765(method35771, j);
                                    if (method35772 < method35771.length() && method35771.charAt(method35772) == '\"') {
                                        final int beginIndex2 = ++method35772;
                                        j = Class9558.method35764(method35771, method35772, "\"");
                                        s2 = method35771.substring(beginIndex2, j);
                                        ++j;
                                        break Label_0363;
                                    }
                                    final int beginIndex3 = method35772;
                                    j = Class9558.method35764(method35771, method35772, ",;");
                                    s2 = method35771.substring(beginIndex3, j).trim();
                                    break Label_0363;
                                }
                            }
                        }
                        ++j;
                        s2 = null;
                    }
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        if (!"no-store".equalsIgnoreCase(trim)) {
                            if (!"max-age".equalsIgnoreCase(trim)) {
                                if (!"s-maxage".equalsIgnoreCase(trim)) {
                                    if (!"private".equalsIgnoreCase(trim)) {
                                        if (!"public".equalsIgnoreCase(trim)) {
                                            if (!"must-revalidate".equalsIgnoreCase(trim)) {
                                                if (!"max-stale".equalsIgnoreCase(trim)) {
                                                    if (!"min-fresh".equalsIgnoreCase(trim)) {
                                                        if (!"only-if-cached".equalsIgnoreCase(trim)) {
                                                            if (!"no-transform".equalsIgnoreCase(trim)) {
                                                                if (!"immutable".equalsIgnoreCase(trim)) {
                                                                    continue Label_0132_Outer;
                                                                }
                                                                b8 = true;
                                                            }
                                                            else {
                                                                b7 = true;
                                                            }
                                                        }
                                                        else {
                                                            b6 = true;
                                                        }
                                                    }
                                                    else {
                                                        method35769 = Class9558.method35766(s2, -1);
                                                    }
                                                }
                                                else {
                                                    method35768 = Class9558.method35766(s2, Integer.MAX_VALUE);
                                                }
                                            }
                                            else {
                                                b5 = true;
                                            }
                                        }
                                        else {
                                            b4 = true;
                                        }
                                    }
                                    else {
                                        b3 = true;
                                    }
                                }
                                else {
                                    method35767 = Class9558.method35766(s2, -1);
                                }
                            }
                            else {
                                method35766 = Class9558.method35766(s2, -1);
                            }
                        }
                        else {
                            b2 = true;
                        }
                    }
                    else {
                        b = true;
                    }
                }
                continue;
            }
        }
        if (n == 0) {
            s = null;
        }
        return new Class6668(b, b2, method35766, method35767, b3, b4, b5, method35768, method35769, b6, b7, b8, s);
    }
    
    @Override
    public String toString() {
        final String field26354 = this.field26354;
        return (field26354 == null) ? (this.field26354 = this.method20295()) : field26354;
    }
    
    private String method20295() {
        final StringBuilder sb = new StringBuilder();
        if (this.field26342) {
            sb.append("no-cache, ");
        }
        if (this.field26343) {
            sb.append("no-store, ");
        }
        if (this.field26344 != -1) {
            sb.append("max-age=").append(this.field26344).append(", ");
        }
        if (this.field26345 != -1) {
            sb.append("s-maxage=").append(this.field26345).append(", ");
        }
        if (this.field26346) {
            sb.append("private, ");
        }
        if (this.field26347) {
            sb.append("public, ");
        }
        if (this.field26348) {
            sb.append("must-revalidate, ");
        }
        if (this.field26349 != -1) {
            sb.append("max-stale=").append(this.field26349).append(", ");
        }
        if (this.field26350 != -1) {
            sb.append("min-fresh=").append(this.field26350).append(", ");
        }
        if (this.field26351) {
            sb.append("only-if-cached, ");
        }
        if (this.field26352) {
            sb.append("no-transform, ");
        }
        if (this.field26353) {
            sb.append("immutable, ");
        }
        if (sb.length() != 0) {
            sb.delete(sb.length() - 2, sb.length());
            return sb.toString();
        }
        return "";
    }
    
    static {
        field26340 = new Class6905().method21260().method21268();
        field26341 = new Class6905().method21265().method21263(Integer.MAX_VALUE, TimeUnit.SECONDS).method21268();
    }
}
