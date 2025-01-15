// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4314 implements Class4252<Class5813>
{
    private static String[] field19336;
    private ItemStack field19337;
    private boolean field19338;
    private Class316 field19339;
    
    public Class4314() {
    }
    
    public Class4314(final ItemStack class8321, final boolean field19338, final Class316 field19339) {
        this.field19337 = class8321.method27641();
        this.field19338 = field19338;
        this.field19339 = field19339;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19337 = class8654.method29511();
        this.field19338 = class8654.readBoolean();
        this.field19339 = class8654.method29499(Class316.class);
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29509(this.field19337);
        class8654.writeBoolean(this.field19338);
        class8654.method29500(this.field19339);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17454(this);
    }
    
    public ItemStack method12967() {
        return this.field19337;
    }
    
    public boolean method12968() {
        return this.field19338;
    }
    
    public Class316 method12969() {
        return this.field19339;
    }
}
