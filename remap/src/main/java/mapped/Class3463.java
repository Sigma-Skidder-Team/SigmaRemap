// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.List;

public class Class3463 extends Class3446
{
    private static String[] field16321;
    private final Class834 field16322;
    private int field16323;
    private int field16324;
    
    public Class3463(final Class834 field16322) {
        this.field16322 = field16322;
        this.field16324 = this.method11027(field16322);
    }
    
    public int method11027(final Class834 class834) {
        return 200 + class834.method2633().nextInt(200) % 20;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16322.method4966()) {
            return false;
        }
        if (this.field16322.method4960()) {
            return true;
        }
        if (this.field16324 <= 0) {
            this.field16324 = this.method11027(this.field16322);
            final List<Entity> method6739 = this.field16322.world.method6739(this.field16322.getClass(), this.field16322.getBoundingBox().grow(8.0, 8.0, 8.0), class834 -> class834.method4965() || !class834.method4960());
            method6739.stream().filter(Class834::method4965).findAny().orElse(this.field16322).method4969(method6739.stream().filter(class835 -> !class835.method4960()));
            return this.field16322.method4960();
        }
        --this.field16324;
        return false;
    }
    
    @Override
    public boolean method11017() {
        return this.field16322.method4960() && this.field16322.method4967();
    }
    
    @Override
    public void method11015() {
        this.field16323 = 0;
    }
    
    @Override
    public void method11018() {
        this.field16322.method4962();
    }
    
    @Override
    public void method11016() {
        final int field16323 = this.field16323 - 1;
        this.field16323 = field16323;
        if (field16323 <= 0) {
            this.field16323 = 10;
            this.field16322.method4968();
        }
    }
}
