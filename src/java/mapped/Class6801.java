// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6801 implements Class6802
{
    private static String[] field26740;
    public int field26741;
    
    public Class6801(final int field26741) {
        this.field26741 = field26741;
    }
    
    @Override
    public void method20822(final Class4803 class4803) {
        if (class4803.method14250().size() > 0) {
            int n = 0;
            int n2 = 0;
            int max = 0;
            for (int i = 0; i < class4803.method14250().size(); ++i) {
                final Class4803 class4804 = class4803.method14250().get(i);
                if (n + class4804.method14276() + this.field26741 > class4803.method14276()) {
                    n = 0;
                    n2 += max;
                }
                class4804.method14275(n2);
                class4804.method14273(n);
                n += class4804.method14276() + this.field26741;
                max = Math.max(class4804.method14278(), max);
            }
        }
    }
}
