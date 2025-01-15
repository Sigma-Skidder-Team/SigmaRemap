// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4401 implements Class4252<Class5813>
{
    private static String[] field19717;
    private int field19718;
    private String field19719;
    private boolean field19720;
    
    public Class4401() {
    }
    
    public Class4401(final int field19718, final String field19719, final boolean field19720) {
        this.field19718 = field19718;
        this.field19719 = field19719;
        this.field19720 = field19720;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19718 = class8654.method29501();
        this.field19719 = class8654.method29513(32767);
        this.field19720 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19718);
        class8654.method29514(this.field19719);
        class8654.writeBoolean(this.field19720);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17448(this);
    }
    
    @Nullable
    public Class865 method13244(final Class1847 class1847) {
        final Class399 method6741 = class1847.method6741(this.field19718);
        return (method6741 instanceof Class429) ? ((Class429)method6741).method2149() : null;
    }
    
    public String method13245() {
        return this.field19719;
    }
    
    public boolean method13246() {
        return this.field19720;
    }
}
