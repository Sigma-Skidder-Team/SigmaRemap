// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public abstract class Class6159 extends Class6172
{
    public Class1912 field24910;
    
    public Class6159(final World class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3);
    }
    
    public Class6159(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(class1847, n, n2, n3, n4, n5, n6);
    }
    
    public void method18423(final Class1912 field24910) {
        this.field24910 = field24910;
    }
    
    @Override
    public float method18424() {
        return this.field24910.method7497();
    }
    
    @Override
    public float method18425() {
        return this.field24910.method7498();
    }
    
    @Override
    public float method18426() {
        return this.field24910.method7500();
    }
    
    @Override
    public float method18427() {
        return this.field24910.method7501();
    }
    
    public void method18428(final Class7805 class7805) {
        this.method18423(class7805.method25210(this.field24949));
    }
    
    public void method18429(final Class7805 class7805) {
        this.method18423(class7805.method25209(this.field24950, this.field24951));
    }
}
