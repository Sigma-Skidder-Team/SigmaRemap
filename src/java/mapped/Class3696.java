// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.file.Path;

public class Class3696 extends Class3693<Class7499<?>>
{
    public Class3696(final Class7203 class7203) {
        super(class7203, Class90.field210);
    }
    
    @Override
    public void method11365() {
        this.method11368(Class8039.field33099).method26978(Class7499.field29023, Class7499.field29032, Class7499.field29049);
        this.method11368(Class8039.field33100).method26978(Class7499.field28980, Class7499.field29045, Class7499.field29056, Class7499.field29044, Class7499.field28991, Class7499.field29047);
        ((Class3693<Class7499<Class798>>)this).method11368((Class7909<Class7499<Class798>>)Class8039.field33101).method26977(Class7499.field28961);
        this.method11368(Class8039.field33102).method26978(Class7499.field28959, Class7499.field29029);
    }
    
    @Override
    public Path method11367(final Class1932 class1932) {
        return this.field17010.method22099().resolve("data/" + class1932.method7798() + "/tags/entity_types/" + class1932.method7797() + ".json");
    }
    
    @Override
    public String method11338() {
        return "Entity Type Tags";
    }
    
    @Override
    public void method11366(final Class6208<Class7499<?>> class6208) {
        Class8039.method26370(class6208);
    }
}
