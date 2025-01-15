// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;

public final class Class7172 extends Class7173
{
    private static final Class8991 field27821;
    private final List<String> field27822;
    private final List<String> field27823;
    
    public Class7172(final List<String> list, final List<String> list2) {
        this.field27822 = Class7690.method24437(list);
        this.field27823 = Class7690.method24437(list2);
    }
    
    public int method21934() {
        return this.field27822.size();
    }
    
    public String method21935(final int n) {
        return this.field27822.get(n);
    }
    
    public String method21936(final int n) {
        return Class8846.method30965(this.method21935(n), true);
    }
    
    public String method21937(final int n) {
        return this.field27823.get(n);
    }
    
    public String method21938(final int n) {
        return Class8846.method30965(this.method21937(n), true);
    }
    
    @Override
    public Class8991 method21939() {
        return Class7172.field27821;
    }
    
    @Override
    public long method21940() {
        return this.method21942(null, true);
    }
    
    @Override
    public void method21941(final Class1679 class1679) throws IOException {
        this.method21942(class1679, false);
    }
    
    private long method21942(final Class1679 class1679, final boolean b) {
        long method5949 = 0L;
        Class1680 method5950;
        if (!b) {
            method5950 = class1679.method5926();
        }
        else {
            method5950 = new Class1680();
        }
        for (int i = 0; i < this.field27822.size(); ++i) {
            if (i > 0) {
                method5950.method6004(38);
            }
            method5950.method5997(this.field27822.get(i));
            method5950.method6004(61);
            method5950.method5997(this.field27823.get(i));
        }
        if (b) {
            method5949 = method5950.method5949();
            method5950.method5994();
        }
        return method5949;
    }
    
    static {
        field27821 = Class8991.method32077("application/x-www-form-urlencoded");
    }
}
