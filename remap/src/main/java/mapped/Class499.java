// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class499 extends TileEntity
{
    private int field2858;
    
    public Class499() {
        super(Class5412.field22558);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        class51.putInt("OutputSignal", this.field2858);
        return class51;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2858 = class51.getInt("OutputSignal");
    }
    
    public int method2537() {
        return this.field2858;
    }
    
    public void method2538(final int field2858) {
        this.field2858 = field2858;
    }
}
