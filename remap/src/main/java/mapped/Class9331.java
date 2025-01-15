// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.StringUtils;
import java.io.IOException;
import java.io.InputStream;

public class Class9331
{
    private final Class2032 field40053;
    private final String field40054;
    private final int field40055;
    private int field40056;
    
    private Class9331(final Class2032 field40053, final int field40054, final String field40055) {
        this.field40053 = field40053;
        this.field40055 = field40054;
        this.field40054 = field40055;
    }
    
    public void method34569(final Class1927 class1927) {
        Class8726.method29989(Class8726::method29984);
        ++this.field40056;
        Class8933.method31526(class1927.method7722(), this.field40055);
    }
    
    public void method34570() {
        Class8726.method29989(Class8726::method29984);
        --this.field40056;
        if (this.field40056 <= 0) {
            Class8933.method31527(this.field40055);
            this.field40053.method8094().remove(this.field40054);
        }
    }
    
    public String method34571() {
        return this.field40054;
    }
    
    public static Class9331 method34572(final Class2032 class2032, final String s, final InputStream inputStream) throws IOException {
        Class8726.method29989(Class8726::method29984);
        final String method32109 = Class8995.method32109(inputStream);
        if (method32109 == null) {
            throw new IOException("Could not load program " + class2032.method8091());
        }
        final int method32110 = Class8933.method31528(Class2032.method8095(class2032));
        Class8933.method31529(method32110, method32109);
        Class8933.method31530(method32110);
        if (Class8933.method31531(method32110, 35713) != 0) {
            final Class9331 class2033 = new Class9331(class2032, method32110, s);
            class2032.method8094().put(s, class2033);
            return class2033;
        }
        throw new IOException("Couldn't compile " + class2032.method8091() + " program: " + StringUtils.trim(Class8933.method31568(method32110, 32768)));
    }
}
