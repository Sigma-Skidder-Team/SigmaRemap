// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class1835<T extends LivingEntity, M extends Class5853<T>, A extends Class5853<T>> extends Class1834<T, M, A>
{
    private static String[] field10017;
    
    public Class1835(final Class4778<T, M> class4778, final A a, final A a2) {
        super(class4778, a, a2);
    }
    
    @Override
    public void method6601(final A a, final Class2215 class2215) {
        this.method6602(a);
        switch (Class8823.field37102[class2215.ordinal()]) {
            case 1: {
                a.field23993.field25187 = true;
                a.field23994.field25187 = true;
                break;
            }
            case 2: {
                a.field23995.field25187 = true;
                a.field23996.field25187 = true;
                a.field23997.field25187 = true;
                break;
            }
            case 3: {
                a.field23995.field25187 = true;
                a.field23998.field25187 = true;
                a.field23999.field25187 = true;
                break;
            }
            case 4: {
                a.field23998.field25187 = true;
                a.field23999.field25187 = true;
                break;
            }
        }
    }
    
    @Override
    public void method6602(final A a) {
        a.method17584(false);
    }
}
