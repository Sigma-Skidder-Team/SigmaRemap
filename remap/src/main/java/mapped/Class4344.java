// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4344 implements Class4252<Class5813>
{
    private static String[] field19459;
    private BlockPos field19460;
    private String[] field19461;
    
    public Class4344() {
    }
    
    public Class4344(final BlockPos field19460, final Class2250 class2250, final Class2250 class2251, final Class2250 class2252, final Class2250 class2253) {
        this.field19460 = field19460;
        this.field19461 = new String[] { class2250.getString(), class2251.getString(), class2252.getString(), class2253.getString() };
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19460 = class8654.method29494();
        this.field19461 = new String[4];
        for (int i = 0; i < 4; ++i) {
            this.field19461[i] = class8654.method29513(384);
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19460);
        for (int i = 0; i < 4; ++i) {
            class8654.method29514(this.field19461[i]);
        }
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17436(this);
    }
    
    public BlockPos method13046() {
        return this.field19460;
    }
    
    public String[] method13047() {
        return this.field19461;
    }
}
