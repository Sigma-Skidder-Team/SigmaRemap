// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7073 extends Class7074
{
    private static String[] field27545;
    private final Class179 field27546;
    
    public Class7073(final Class1847 class1847, final Class354 class1848, final Class179 field27546, final Class8321 class1849, final Class179 class1850) {
        super(class1847, null, Class316.field1877, class1849, new Class7005(new Class5487(class1848.method1074() + 0.5, class1848.method1075(), class1848.method1076() + 0.5), class1850, class1848, false));
        this.field27546 = field27546;
    }
    
    @Override
    public Class354 method21639() {
        return this.field27553.method21447();
    }
    
    @Override
    public boolean method21640() {
        return this.field27554.method6701(this.field27553.method21447()).method21750(this);
    }
    
    @Override
    public boolean method21641() {
        return this.method21640();
    }
    
    @Override
    public Class179 method21642() {
        return Class179.field511;
    }
    
    @Override
    public Class179[] method21643() {
        switch (Class7648.field30373[this.field27546.ordinal()]) {
            default: {
                return new Class179[] { Class179.field511, Class179.field513, Class179.field516, Class179.field514, Class179.field515, Class179.field512 };
            }
            case 2: {
                return new Class179[] { Class179.field511, Class179.field512, Class179.field513, Class179.field516, Class179.field514, Class179.field515 };
            }
            case 3: {
                return new Class179[] { Class179.field511, Class179.field513, Class179.field516, Class179.field515, Class179.field512, Class179.field514 };
            }
            case 4: {
                return new Class179[] { Class179.field511, Class179.field514, Class179.field516, Class179.field515, Class179.field512, Class179.field513 };
            }
            case 5: {
                return new Class179[] { Class179.field511, Class179.field515, Class179.field514, Class179.field512, Class179.field513, Class179.field516 };
            }
            case 6: {
                return new Class179[] { Class179.field511, Class179.field516, Class179.field514, Class179.field512, Class179.field513, Class179.field515 };
            }
        }
    }
    
    @Override
    public Class179 method21644() {
        return (this.field27546.method790() != Class111.field352) ? this.field27546 : Class179.field513;
    }
    
    @Override
    public boolean method21645() {
        return false;
    }
    
    @Override
    public float method21646() {
        return (float)(this.field27546.method780() * 90);
    }
}
