// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;

public class Class4364 implements Class4252<Class5800>
{
    private static String[] field19555;
    private int field19556;
    private byte field19557;
    
    public Class4364() {
    }
    
    public Class4364(final Entity class399, final byte field19557) {
        this.field19556 = class399.method1643();
        this.field19557 = field19557;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19556 = class8654.method29501();
        this.field19557 = class8654.readByte();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19556);
        class8654.writeByte(this.field19557);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17283(this);
    }
    
    public Entity method13127(final Class1847 class1847) {
        return class1847.method6741(this.field19556);
    }
    
    public byte method13128() {
        return this.field19557;
    }
}
