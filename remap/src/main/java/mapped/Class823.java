// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class823 implements Class822
{
    private static String[] field4394;
    private final Class450 field4395;
    private final PlayerEntity field4396;
    private Class57 field4397;
    private int field4398;
    
    public Class823(final PlayerEntity field4396) {
        this.field4397 = new Class57();
        this.field4396 = field4396;
        this.field4395 = new Class450(this);
    }
    
    @Nullable
    @Override
    public PlayerEntity method4823() {
        return this.field4396;
    }
    
    @Override
    public void method4822(final PlayerEntity playerEntity) {
    }
    
    @Override
    public Class57 method4825() {
        return this.field4397;
    }
    
    @Override
    public void method4826(final Class57 field4397) {
        this.field4397 = field4397;
    }
    
    @Override
    public void method4828(final Class9017 class9017) {
        class9017.method32289();
    }
    
    @Override
    public void method4831(final ItemStack class8321) {
    }
    
    @Override
    public World method4838() {
        return this.field4396.world;
    }
    
    @Override
    public int method4821() {
        return this.field4398;
    }
    
    @Override
    public void method4827(final int field4398) {
        this.field4398 = field4398;
    }
    
    @Override
    public boolean method4830() {
        return true;
    }
    
    @Override
    public Class7795 method4832() {
        return Class8520.field35681;
    }
}
