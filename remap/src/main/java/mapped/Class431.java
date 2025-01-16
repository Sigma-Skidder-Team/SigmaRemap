// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class Class431 extends Class428
{
    private static String[] field2642;
    private final Class4648 field2643;
    
    public Class431(final EntityType<? extends Class431> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2643 = new Class4649(this);
    }
    
    public Class431(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29004, class1847, n, n2, n3);
        this.field2643 = new Class4649(this);
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12028;
    }
    
    @Override
    public BlockState method2141() {
        return Class7521.field29290.getDefaultState();
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field2643.method13889(class51);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        this.field2643.method13890(class51);
    }
    
    @Override
    public void method1798(final byte b) {
        this.field2643.method13892(b);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        this.field2643.method13886();
    }
    
    @Override
    public boolean method1905() {
        return true;
    }
}
