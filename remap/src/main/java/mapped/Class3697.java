// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.file.Path;

public class Class3697 extends Class3693<Class7255>
{
    public Class3697(final Class7203 class7203) {
        super(class7203, Registry.field206);
    }
    
    @Override
    public void method11365() {
        this.method11368(Class7324.field28319).method26978(Class7558.field29976, Class7558.field29975);
        this.method11368(Class7324.field28320).method26978(Class7558.field29978, Class7558.field29977);
    }
    
    @Override
    public Path method11367(final ResourceLocation class1932) {
        return this.field17010.method22099().resolve("data/" + class1932.method7798() + "/tags/fluids/" + class1932.method7797() + ".json");
    }
    
    @Override
    public String method11338() {
        return "Fluid Tags";
    }
    
    @Override
    public void method11366(final Class6208<Class7255> class6208) {
        Class7324.method22477(class6208);
    }
}
