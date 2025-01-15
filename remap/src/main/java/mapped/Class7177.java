// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;

public final class Class7177 extends Class7173
{
    public static final Class8991 field27835;
    public static final Class8991 field27836;
    public static final Class8991 field27837;
    public static final Class8991 field27838;
    public static final Class8991 field27839;
    private static final byte[] field27840;
    private static final byte[] field27841;
    private static final byte[] field27842;
    private final Class1929 field27843;
    private final Class8991 field27844;
    private final Class8991 field27845;
    private final List<Class8391> field27846;
    private long field27847;
    
    public Class7177(final Class1929 field27843, final Class8991 class8991, final List<Class8391> list) {
        this.field27847 = -1L;
        this.field27843 = field27843;
        this.field27844 = class8991;
        this.field27845 = Class8991.method32077(class8991 + "; boundary=" + field27843.method7743());
        this.field27846 = Class7690.method24437(list);
    }
    
    public Class8991 method21948() {
        return this.field27844;
    }
    
    public String method21949() {
        return this.field27843.method7743();
    }
    
    public int method21950() {
        return this.field27846.size();
    }
    
    public List<Class8391> method21951() {
        return this.field27846;
    }
    
    public Class8391 method21952(final int n) {
        return this.field27846.get(n);
    }
    
    @Override
    public Class8991 method21939() {
        return this.field27845;
    }
    
    @Override
    public long method21940() throws IOException {
        final long field27847 = this.field27847;
        if (field27847 == -1L) {
            return this.field27847 = this.method21953(null, true);
        }
        return field27847;
    }
    
    @Override
    public void method21941(final Class1679 class1679) throws IOException {
        this.method21953(class1679, false);
    }
    
    private long method21953(Class1679 class1679, final boolean b) throws IOException {
        long n = 0L;
        Class1679 class1680 = null;
        if (b) {
            class1680 = (class1679 = new Class1680());
        }
        for (int i = 0; i < this.field27846.size(); ++i) {
            final Class8391 class1681 = this.field27846.get(i);
            final Class6957 field34391 = class1681.field34391;
            final Class7173 field34392 = class1681.field34392;
            class1679.method5928(Class7177.field27842);
            class1679.method5927(this.field27843);
            class1679.method5928(Class7177.field27841);
            if (field34391 != null) {
                for (int j = 0; j < field34391.method21362(); ++j) {
                    class1679.method5932(field34391.method21363(j)).method5928(Class7177.field27840).method5932(field34391.method21364(j)).method5928(Class7177.field27841);
                }
            }
            final Class8991 method21939 = field34392.method21939();
            if (method21939 != null) {
                class1679.method5932("Content-Type: ").method5932(method21939.toString()).method5928(Class7177.field27841);
            }
            final long method21940 = field34392.method21940();
            if (method21940 == -1L) {
                if (b) {
                    ((Class1680)class1680).method5994();
                    return -1L;
                }
            }
            else {
                class1679.method5932("Content-Length: ").method5944(method21940).method5928(Class7177.field27841);
            }
            class1679.method5928(Class7177.field27841);
            if (!b) {
                field34392.method21941(class1679);
            }
            else {
                n += method21940;
            }
            class1679.method5928(Class7177.field27841);
        }
        class1679.method5928(Class7177.field27842);
        class1679.method5927(this.field27843);
        class1679.method5928(Class7177.field27842);
        class1679.method5928(Class7177.field27841);
        if (b) {
            n += ((Class1680)class1680).method5949();
            ((Class1680)class1680).method5994();
        }
        return n;
    }
    
    public static StringBuilder method21954(final StringBuilder sb, final String s) {
        sb.append('\"');
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            switch (char1) {
                case 10: {
                    sb.append("%0A");
                    break;
                }
                case 13: {
                    sb.append("%0D");
                    break;
                }
                case 34: {
                    sb.append("%22");
                    break;
                }
                default: {
                    sb.append(char1);
                    break;
                }
            }
        }
        sb.append('\"');
        return sb;
    }
    
    static {
        field27835 = Class8991.method32077("multipart/mixed");
        field27836 = Class8991.method32077("multipart/alternative");
        field27837 = Class8991.method32077("multipart/digest");
        field27838 = Class8991.method32077("multipart/parallel");
        field27839 = Class8991.method32077("multipart/form-data");
        field27840 = new byte[] { 58, 32 };
        field27841 = new byte[] { 13, 10 };
        field27842 = new byte[] { 45, 45 };
    }
}
