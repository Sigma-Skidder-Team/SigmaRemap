// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;

public class Class4268 implements Class4252<Class5800>
{
    private static String[] field19146;
    private int field19147;
    private List<Class9369<?>> field19148;
    
    public Class4268() {
    }
    
    public Class4268(final int field19147, final Class9184 class9184, final boolean b) {
        this.field19147 = field19147;
        if (!b) {
            this.field19148 = class9184.method33572();
        }
        else {
            this.field19148 = class9184.method33573();
            class9184.method33580();
        }
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19147 = class8654.method29501();
        this.field19148 = Class9184.method33575(class8654);
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19147);
        Class9184.method33571(this.field19148, class8654);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17278(this);
    }
    
    public List<Class9369<?>> method12810() {
        return this.field19148;
    }
    
    public int method12811() {
        return this.field19147;
    }
}
