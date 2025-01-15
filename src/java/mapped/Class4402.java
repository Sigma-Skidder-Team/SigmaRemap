// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4402 implements Class4252<Class5800>
{
    private static String[] field19721;
    private int field19722;
    private Class2215 field19723;
    private Class8321 field19724;
    
    public Class4402() {
        this.field19724 = Class8321.field34174;
    }
    
    public Class4402(final int field19722, final Class2215 field19723, final Class8321 class8321) {
        this.field19724 = Class8321.field34174;
        this.field19722 = field19722;
        this.field19723 = field19723;
        this.field19724 = class8321.method27641();
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19722 = class8654.method29501();
        this.field19723 = class8654.method29499(Class2215.class);
        this.field19724 = class8654.method29511();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19722);
        class8654.method29500(this.field19723);
        class8654.method29509(this.field19724);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17315(this);
    }
    
    public Class8321 method13247() {
        return this.field19724;
    }
    
    public int method13248() {
        return this.field19722;
    }
    
    public Class2215 method13249() {
        return this.field19723;
    }
}
