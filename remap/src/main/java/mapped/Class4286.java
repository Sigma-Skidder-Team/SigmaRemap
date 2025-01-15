// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;
import java.util.List;

public class Class4286 implements Class4252<Class5800>
{
    private static String[] field19223;
    private int field19224;
    private int[] field19225;
    
    public Class4286() {
    }
    
    public Class4286(final Entity class399) {
        this.field19224 = class399.method1643();
        final List<Entity> method1908 = class399.method1908();
        this.field19225 = new int[method1908.size()];
        for (int i = 0; i < method1908.size(); ++i) {
            this.field19225[i] = ((Entity)method1908.get(i)).method1643();
        }
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19224 = class8654.method29501();
        this.field19225 = class8654.method29489();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19224);
        class8654.method29488(this.field19225);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17299(this);
    }
    
    public int[] method12872() {
        return this.field19225;
    }
    
    public int method12873() {
        return this.field19224;
    }
}
