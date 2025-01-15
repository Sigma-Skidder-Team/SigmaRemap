// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.util.Collection;

public class Class7908 extends Class7909<EntityType<?>>
{
    private static String[] field32477;
    private int field32478;
    private Class7909<EntityType<?>> field32479;
    
    public Class7908(final Class1932 class1932) {
        super(class1932);
        this.field32478 = -1;
    }
    
    public boolean method25615(final EntityType<?> class7499) {
        if (this.field32478 != Class8039.method26374()) {
            this.field32479 = Class8039.method26375().method18461(this.method25621());
            this.field32478 = Class8039.method26374();
        }
        return this.field32479.method25618(class7499);
    }
    
    @Override
    public Collection<EntityType<?>> method25616() {
        if (this.field32478 != Class8039.method26374()) {
            this.field32479 = Class8039.method26375().method18461(this.method25621());
            this.field32478 = Class8039.method26374();
        }
        return this.field32479.method25616();
    }
    
    @Override
    public Collection<Class6967<EntityType<?>>> method25617() {
        if (this.field32478 != Class8039.method26374()) {
            this.field32479 = Class8039.method26375().method18461(this.method25621());
            this.field32478 = Class8039.method26374();
        }
        return this.field32479.method25617();
    }
}
