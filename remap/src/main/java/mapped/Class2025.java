// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2025 implements Class2022
{
    field11537;
    
    private static final Class1846 field11538;
    
    @Override
    public int method8068() {
        return 5;
    }
    
    @Override
    public int method8069() {
        return 8;
    }
    
    @Override
    public float method8070() {
        return 6.0f;
    }
    
    @Override
    public float method8071() {
        return 1.0f;
    }
    
    @Override
    public void method8072(final int n, final int n2) {
        Class2025.field11538.method6652(0, n, n2, false);
    }
    
    @Override
    public boolean method8073() {
        return true;
    }
    
    static {
        field11538 = Util.method27851(new Class1846(Class2235.field13729, 5, 8, false), class1846 -> {
            int i = 0;
            while (i < 8) {
                int j = 0;
                while (j < 5) {
                    if (j != 0) {
                        if (j + 1 != 5) {
                            if (i != 0) {
                                if (i + 1 == 8) {}
                            }
                        }
                    }
                    class1846.method6648(j, i, -1);
                    ++j;
                }
                ++i;
            }
            class1846.method6667();
        });
    }
}
