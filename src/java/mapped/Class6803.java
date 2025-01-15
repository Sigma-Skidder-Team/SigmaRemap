// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6803 implements Class6802
{
    private static String[] field26742;
    public int field26743;
    public int field26744;
    
    public Class6803(final int n) {
        this(n, 0);
    }
    
    public Class6803(final int field26743, final int field26744) {
        this.field26743 = field26743;
        this.field26744 = field26744;
    }
    
    private Class4803 method20823(final Class4803[] array) {
        Class4803 class4803 = array[0];
        for (final Class4803 class4804 : array) {
            if (class4804.method14278() > class4803.method14278()) {
                class4803 = class4804;
            }
        }
        return class4803;
    }
    
    @Override
    public void method20822(final Class4803 class4803) {
        if (class4803.method14250().size() > 0) {
            for (int i = 0; i < class4803.method14250().size(); i += this.field26743) {
                final Class4803 class4804 = class4803.method14250().get(i);
                if (i > 0) {
                    if (i % this.field26743 == 0) {
                        final Class4803[] array = new Class4803[this.field26743];
                        for (int j = 0; j < this.field26743; ++j) {
                            array[j] = class4803.method14250().get(i - this.field26743 + j);
                        }
                        class4804.method14270((class4804, class4805) -> class4804.method14275(class4803.method14274() + class4804.method14278() + this.field26744));
                    }
                }
                final Class4803[] array2 = new Class4803[this.field26743];
                array2[0] = class4804;
                for (int k = 1; k < this.field26743; ++k) {
                    array2[k] = class4803.method14250().get(i + k);
                    this.method20823(array2).method14270((class4804, class4805) -> class4804.method14275(class4804.method14274() + class4804.method14278() / 2));
                }
            }
        }
    }
}
