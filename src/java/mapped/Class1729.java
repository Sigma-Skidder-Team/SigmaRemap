// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;

public class Class1729 extends Class1728
{
    private final Class8175 field9666;
    
    public Class1729(final Class8175 field9666) {
        super(new String[] { "minecraft", "realms" });
        this.field9666 = field9666;
    }
    
    @Nullable
    @Override
    public InputStream method6104(final Class346 class346, final Class1932 class347) {
        if (class346 == Class346.field2137) {
            final File method27064 = this.field9666.method27064(class347);
            if (method27064 != null && method27064.exists()) {
                try {
                    return new FileInputStream(method27064);
                }
                catch (final FileNotFoundException ex) {}
            }
        }
        return super.method6104(class346, class347);
    }
    
    @Override
    public boolean method6099(final Class346 class346, final Class1932 class347) {
        if (class346 == Class346.field2137) {
            final File method27064 = this.field9666.method27064(class347);
            if (method27064 != null) {
                if (method27064.exists()) {
                    return true;
                }
            }
        }
        return super.method6099(class346, class347);
    }
    
    @Nullable
    @Override
    public InputStream method6107(final String s) {
        final File method27065 = this.field9666.method27065(s);
        if (method27065 != null && method27065.exists()) {
            try {
                return new FileInputStream(method27065);
            }
            catch (final FileNotFoundException ex) {}
        }
        return super.method6107(s);
    }
    
    @Override
    public Collection<Class1932> method6098(final Class346 class346, final String s, final String s2, final int n, final Predicate<String> predicate) {
        final Collection<Class1932> method6098 = super.method6098(class346, s, s2, n, predicate);
        method6098.addAll(this.field9666.method27066(s2, s, n, predicate));
        return method6098;
    }
}
