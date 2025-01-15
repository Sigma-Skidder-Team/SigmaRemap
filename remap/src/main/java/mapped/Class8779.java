// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public class Class8779
{
    private static String[] field36914;
    private final DamageSource field36915;
    private final int field36916;
    private final float field36917;
    private final float field36918;
    private final String field36919;
    private final float field36920;
    
    public Class8779(final DamageSource field36915, final int field36916, final float field36917, final float field36918, final String field36919, final float field36920) {
        this.field36915 = field36915;
        this.field36916 = field36916;
        this.field36917 = field36918;
        this.field36918 = field36917;
        this.field36919 = field36919;
        this.field36920 = field36920;
    }
    
    public DamageSource method30537() {
        return this.field36915;
    }
    
    public float method30538() {
        return this.field36917;
    }
    
    public boolean method30539() {
        return this.field36915.method25714() instanceof LivingEntity;
    }
    
    @Nullable
    public String method30540() {
        return this.field36919;
    }
    
    @Nullable
    public ITextComponent method30541() {
        return (this.method30537().method25714() != null) ? this.method30537().method25714().getDisplayName() : null;
    }
    
    public float method30542() {
        return (this.field36915 != DamageSource.field32574) ? this.field36920 : Float.MAX_VALUE;
    }
}
