// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;

public class Class4305 implements Class4252<Class5800>
{
    private static String[] field19305;
    private int field19306;
    private int field19307;
    
    public Class4305() {
    }
    
    public Class4305(final Entity class399, final Entity class400) {
        this.field19306 = class399.method1643();
        this.field19307 = ((class400 == null) ? 0 : class400.method1643());
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19306 = class8654.readInt();
        this.field19307 = class8654.readInt();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeInt(this.field19306);
        class8654.writeInt(this.field19307);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17300(this);
    }
    
    public int method12946() {
        return this.field19306;
    }
    
    public int method12947() {
        return this.field19307;
    }
}
