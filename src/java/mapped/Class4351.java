// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class Class4351 implements Class4252<Class5800>
{
    private Class7795 field19487;
    private Class286 field19488;
    private int field19489;
    private float field19490;
    private float field19491;
    
    public Class4351() {
    }
    
    public Class4351(final Class7795 field19487, final Class286 field19488, final Class399 class399, final float field19489, final float field19490) {
        Validate.notNull((Object)field19487, "sound", new Object[0]);
        this.field19487 = field19487;
        this.field19488 = field19488;
        this.field19489 = class399.method1643();
        this.field19490 = field19489;
        this.field19491 = field19490;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19487 = Class90.field205.method499(class8654.method29501());
        this.field19488 = class8654.method29499(Class286.class);
        this.field19489 = class8654.method29501();
        this.field19490 = class8654.readFloat();
        this.field19491 = class8654.readFloat();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(Class90.field205.method504(this.field19487));
        class8654.method29500(this.field19488);
        class8654.method29505(this.field19489);
        class8654.writeFloat(this.field19490);
        class8654.writeFloat(this.field19491);
    }
    
    public Class7795 method13068() {
        return this.field19487;
    }
    
    public Class286 method13069() {
        return this.field19488;
    }
    
    public int method13070() {
        return this.field19489;
    }
    
    public float method13071() {
        return this.field19490;
    }
    
    public float method13072() {
        return this.field19491;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17345(this);
    }
}
