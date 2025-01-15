// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4343 implements Class4252<Class5800>
{
    private static String[] field19457;
    public int field19458;
    
    public Class4343() {
    }
    
    public Class4343(final Entity class399) {
        this.field19458 = class399.method1643();
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19458 = class8654.method29501();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19458);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17336(this);
    }
    
    @Nullable
    public Entity method13045(final Class1847 class1847) {
        return class1847.method6741(this.field19458);
    }
}
