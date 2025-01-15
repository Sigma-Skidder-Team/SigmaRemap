// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class6492 extends Class6490
{
    private Class1862 field25848;
    public Class869 field25849;
    
    public Class6492() {
        this.field25849 = Class869.method5277();
    }
    
    @Override
    public int method19527(final Class6108 class6108, final Class8322 class6109) {
        System.out.println("huuu");
        if (this.field25849.field4684 == null) {
            return 0;
        }
        final Class7096 method6701 = this.field25849.field4683.method6701(new BlockPos(class6109.method27704(), class6109.method27705(), class6109.method27706()));
        if (method6701 != null) {
            return Class4609.method13704(method6701.method21696()) << 4 | Class4609.method13703(method6701);
        }
        return 0;
    }
    
    public Class1862 method19534(final World class1847, final int n, final int n2) {
        if (this.field25848 != null) {
            if (this.field25848.method7019().field32290 == n) {
                if (this.field25848.method7019().field32291 == n2) {
                    return this.field25848;
                }
            }
        }
        return this.field25848 = class1847.method6686(n, n2);
    }
}
