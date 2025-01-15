// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;
import java.io.IOException;
import java.io.Writer;

public class Class8687
{
    private static final int field36513 = 200;
    private boolean field36514;
    public char field36515;
    private final Class4405[] field36516;
    private int field36517;
    public Writer field36518;
    
    public Class8687(final Writer field36518) {
        this.field36514 = false;
        this.field36515 = 'i';
        this.field36516 = new Class4405[200];
        this.field36517 = 0;
        this.field36518 = field36518;
    }
    
    private Class8687 method29766(final String str) throws JSONException {
        if (str == null) {
            throw new Class2381("Null pointer");
        }
        if (this.field36515 != 'o') {
            if (this.field36515 != 'a') {
                throw new Class2381("Value out of sequence.");
            }
        }
        try {
            if (this.field36514 && this.field36515 == 'a') {
                this.field36518.write(44);
            }
            this.field36518.write(str);
        }
        catch (final IOException ex) {
            throw new Class2381(ex);
        }
        if (this.field36515 == 'o') {
            this.field36515 = 'k';
        }
        this.field36514 = true;
        return this;
    }
    
    public Class8687 method29767() throws JSONException {
        if (this.field36515 != 'i') {
            if (this.field36515 != 'o') {
                if (this.field36515 != 'a') {
                    throw new Class2381("Misplaced array.");
                }
            }
        }
        this.method29774(null);
        this.method29766("[");
        this.field36514 = false;
        return this;
    }
    
    private Class8687 method29768(final char c, final char c2) throws JSONException {
        if (this.field36515 != c) {
            throw new Class2381((c == 'a') ? "Misplaced endArray." : "Misplaced endObject.");
        }
        this.method29773(c);
        try {
            this.field36518.write(c2);
        }
        catch (final IOException ex) {
            throw new Class2381(ex);
        }
        this.field36514 = true;
        return this;
    }
    
    public Class8687 method29769() throws JSONException {
        return this.method29768('a', ']');
    }
    
    public Class8687 method29770() throws JSONException {
        return this.method29768('k', '}');
    }
    
    public Class8687 method29771(final String s) throws JSONException {
        if (s == null) {
            throw new Class2381("Null key.");
        }
        if (this.field36515 == 'k') {
            try {
                this.field36516[this.field36517 - 1].method13302(s, Boolean.TRUE);
                if (this.field36514) {
                    this.field36518.write(44);
                }
                this.field36518.write(Class4405.method13304(s));
                this.field36518.write(58);
                this.field36514 = false;
                this.field36515 = 'o';
                return this;
            }
            catch (final IOException ex) {
                throw new Class2381(ex);
            }
        }
        throw new Class2381("Misplaced key.");
    }
    
    public Class8687 method29772() throws JSONException {
        if (this.field36515 == 'i') {
            this.field36515 = 'o';
        }
        if (this.field36515 != 'o' && this.field36515 != 'a') {
            throw new Class2381("Misplaced object.");
        }
        this.method29766("{");
        this.method29774(new Class4405());
        this.field36514 = false;
        return this;
    }
    
    private void method29773(final char c) throws JSONException {
        if (this.field36517 <= 0) {
            throw new Class2381("Nesting error.");
        }
        if (((this.field36516[this.field36517 - 1] != null) ? 'k' : 'a') == c) {
            --this.field36517;
            this.field36515 = ((this.field36517 != 0) ? ((this.field36516[this.field36517 - 1] != null) ? 'k' : 'a') : 'd');
            return;
        }
        throw new Class2381("Nesting error.");
    }
    
    private void method29774(final Class4405 class4405) throws JSONException {
        if (this.field36517 < 200) {
            this.field36516[this.field36517] = class4405;
            this.field36515 = ((class4405 != null) ? 'k' : 'a');
            ++this.field36517;
            return;
        }
        throw new Class2381("Nesting too deep.");
    }
    
    public Class8687 method29775(final boolean b) throws JSONException {
        return this.method29766(b ? "true" : "false");
    }
    
    public Class8687 method29776(final double value) throws JSONException {
        return this.method29778(new Double(value));
    }
    
    public Class8687 method29777(final long i) throws JSONException {
        return this.method29766(Long.toString(i));
    }
    
    public Class8687 method29778(final Object o) throws JSONException {
        return this.method29766(Class4405.method13311(o));
    }
}
