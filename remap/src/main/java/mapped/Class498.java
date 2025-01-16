// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class498 extends TileEntity
{
    private ResourceLocation field2855;
    private ResourceLocation field2856;
    private String field2857;
    
    public Class498(final Class5412<?> class5412) {
        super(class5412);
        this.field2855 = new ResourceLocation("empty");
        this.field2856 = new ResourceLocation("empty");
        this.field2857 = "minecraft:air";
    }
    
    public Class498() {
        this(Class5412.field22571);
    }
    
    public ResourceLocation method2531() {
        return this.field2855;
    }
    
    public ResourceLocation method2532() {
        return this.field2856;
    }
    
    public String method2533() {
        return this.field2857;
    }
    
    public void method2534(final ResourceLocation field2855) {
        this.field2855 = field2855;
    }
    
    public void method2535(final ResourceLocation field2856) {
        this.field2856 = field2856;
    }
    
    public void method2536(final String field2857) {
        this.field2857 = field2857;
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        class51.method306("attachement_type", this.field2855.toString());
        class51.method306("target_pool", this.field2856.toString());
        class51.method306("final_state", this.field2857);
        return class51;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        this.field2855 = new ResourceLocation(class51.method323("attachement_type"));
        this.field2856 = new ResourceLocation(class51.method323("target_pool"));
        this.field2857 = class51.method323("final_state");
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 12, this.method2196());
    }
    
    @Override
    public Class51 method2196() {
        return this.method2180(new Class51());
    }
}
