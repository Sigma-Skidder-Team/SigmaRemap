// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

import java.nio.file.Path;

public class Class3696 extends Class3693<EntityType<?>>
{
    public Class3696(final Class7203 class7203) {
        super(class7203, Registry.field210);
    }
    
    @Override
    public void method11365() {
        this.method11368(Class8039.field33099).method26978(EntityType.field29023, EntityType.field29032, EntityType.field29049);
        this.method11368(Class8039.field33100).method26978(EntityType.field28980, EntityType.field29045, EntityType.field29056, EntityType.field29044, EntityType.field28991, EntityType.field29047);
        ((Class3693<EntityType<Class798>>)this).method11368((Class7909<EntityType<Class798>>)Class8039.field33101).method26977(EntityType.field28961);
        this.method11368(Class8039.field33102).method26978(EntityType.field28959, EntityType.field29029);
    }
    
    @Override
    public Path method11367(final ResourceLocation class1932) {
        return this.field17010.method22099().resolve("data/" + class1932.method7798() + "/tags/entity_types/" + class1932.method7797() + ".json");
    }
    
    @Override
    public String method11338() {
        return "Entity Type Tags";
    }
    
    @Override
    public void method11366(final Class6208<EntityType<?>> class6208) {
        Class8039.method26370(class6208);
    }
}
