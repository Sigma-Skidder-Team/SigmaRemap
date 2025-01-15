// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.newdawn.slick.SlickException;
import java.util.HashMap;

public class Class7548
{
    private Class7764 field29942;
    private String field29943;
    private HashMap field29944;
    private int field29945;
    
    public Class7548(final String s) throws SlickException {
        this(s, null);
    }
    
    public Class7548(String replace, final Class2427 class2427) throws SlickException {
        this.field29944 = new HashMap();
        this.field29945 = 2;
        replace = replace.replace('\\', '/');
        this.field29943 = replace.substring(0, replace.lastIndexOf("/") + 1);
        this.method23708(replace, class2427);
    }
    
    public Class7548(final String s, final int n) throws SlickException {
        this(s, n, null);
    }
    
    public Class7548(String replace, final int field29945, final Class2427 class2427) throws SlickException {
        this.field29944 = new HashMap();
        this.field29945 = 2;
        this.field29945 = field29945;
        replace = replace.replace('\\', '/');
        this.field29943 = replace.substring(0, replace.lastIndexOf("/") + 1);
        this.method23708(replace, class2427);
    }
    
    public Class7764 method23705() {
        return this.field29942;
    }
    
    public Class7764 method23706(final String s) {
        final Class8064 class8064 = this.field29944.get(s);
        if (class8064 != null) {
            return this.field29942.method24836(class8064.field33219, class8064.field33220, class8064.field33221, class8064.field33222);
        }
        throw new RuntimeException("Unknown sprite from packed sheet: " + s);
    }
    
    public Class7765 method23707(final String key) {
        final Class7764 method23706 = this.method23706(key);
        final Class8064 class8064 = this.field29944.get(key);
        return new Class7765(method23706, class8064.field33221 / class8064.field33223, class8064.field33222 / class8064.field33224);
    }
    
    private void method23708(final String s, final Class2427 class2427) throws SlickException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Class8834.method30851(s)));
        try {
            this.field29942 = new Class7764(this.field29943 + bufferedReader.readLine(), false, this.field29945, class2427);
            while (bufferedReader.ready()) {
                if (bufferedReader.readLine() == null) {
                    break;
                }
                final Class8064 value = new Class8064(this, bufferedReader);
                this.field29944.put(value.field33225, value);
                if (bufferedReader.readLine() == null) {
                    break;
                }
            }
        }
        catch (final Exception ex) {
            Class8452.method28203(ex);
            throw new Class2324("Failed to process definitions file - invalid format?", ex);
        }
    }
}
