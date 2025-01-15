// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Collection;

public class Class7333
{
    private static String[] field28328;
    private final Collection<Class9083> field28329;
    private Class7373 field28330;
    
    public Class7333() {
        this.field28329 = Lists.newArrayList();
    }
    
    public Class7333(final Collection<Class9083> collection) {
        (this.field28329 = Lists.newArrayList()).addAll(collection);
    }
    
    public void method22485(final Class9083 class9083) {
        this.field28329.add(class9083);
        if (this.field28330 != null) {
            class9083.method32766(this.field28330);
        }
    }
    
    public void method22486(final Class7373 field28330) {
        this.field28330 = field28330;
        this.field28329.forEach(class7374 -> class7374.method32766(class7373));
    }
    
    public int method22487() {
        return (int)this.field28329.stream().filter(Class9083::method32760).filter(Class9083::method32768).count();
    }
    
    public int method22488() {
        return (int)this.field28329.stream().filter(Class9083::method32760).filter(Class9083::method32769).count();
    }
    
    public int method22489() {
        return (int)this.field28329.stream().filter(Class9083::method32762).count();
    }
    
    public boolean method22490() {
        return this.method22487() > 0;
    }
    
    public boolean method22491() {
        return this.method22488() > 0;
    }
    
    public int method22492() {
        return this.field28329.size();
    }
    
    public boolean method22493() {
        return this.method22489() == this.method22492();
    }
    
    public String method22494() {
        final StringBuffer sb = new StringBuffer();
        sb.append('[');
        this.field28329.forEach(class9083 -> {
            if (class9083.method32761()) {
                if (!class9083.method32759()) {
                    if (!class9083.method32760()) {
                        sb2.append('_');
                    }
                    else {
                        sb2.append(class9083.method32768() ? 'X' : 'x');
                    }
                }
                else {
                    sb2.append('+');
                }
            }
            else {
                sb2.append(' ');
            }
            return;
        });
        sb.append(']');
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return this.method22494();
    }
}
