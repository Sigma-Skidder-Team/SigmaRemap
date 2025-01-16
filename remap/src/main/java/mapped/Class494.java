// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class494 extends TileEntity implements Class439
{
    private final Class4648 field2840;
    
    public Class494() {
        super(Class5412.field22549);
        this.field2840 = new Class4650(this);
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2840.method13889(class51);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        this.field2840.method13890(class51);
        return class51;
    }
    
    @Override
    public void method2229() {
        this.field2840.method13886();
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 1, this.method2196());
    }
    
    @Override
    public CompoundNBT method2196() {
        final CompoundNBT method2180 = this.method2180(new CompoundNBT());
        method2180.remove("SpawnPotentials");
        return method2180;
    }
    
    @Override
    public boolean method2200(final int n, final int n2) {
        return this.field2840.method13892(n) || super.method2200(n, n2);
    }
    
    @Override
    public boolean method2178() {
        return true;
    }
    
    public Class4648 method2509() {
        return this.field2840;
    }
}
