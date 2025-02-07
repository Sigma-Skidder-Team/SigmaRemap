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
    
    private CustomGuiScreen method20823(final CustomGuiScreen[] array) {
        CustomGuiScreen customGuiScreen = array[0];
        for (final CustomGuiScreen class4804 : array) {
            if (class4804.method14278() > customGuiScreen.method14278()) {
                customGuiScreen = class4804;
            }
        }
        return customGuiScreen;
    }
    
    @Override
    public void method20822(final CustomGuiScreen customGuiScreen) {
        if (customGuiScreen.method14250().size() > 0) {
            for (int i = 0; i < customGuiScreen.method14250().size(); i += this.field26743) {
                final CustomGuiScreen class4804 = customGuiScreen.method14250().get(i);
                if (i > 0) {
                    if (i % this.field26743 == 0) {
                        final CustomGuiScreen[] array = new CustomGuiScreen[this.field26743];
                        for (int j = 0; j < this.field26743; ++j) {
                            array[j] = customGuiScreen.method14250().get(i - this.field26743 + j);
                        }
                        class4804.method14270((class4804, class4805) -> class4804.method14275(customGuiScreen.method14274() + class4804.method14278() + this.field26744));
                    }
                }
                final CustomGuiScreen[] array2 = new CustomGuiScreen[this.field26743];
                array2[0] = class4804;
                for (int k = 1; k < this.field26743; ++k) {
                    array2[k] = customGuiScreen.method14250().get(i + k);
                    this.method20823(array2).method14270((class4804, class4805) -> class4804.method14275(class4804.method14274() + class4804.method14278() / 2));
                }
            }
        }
    }
}
