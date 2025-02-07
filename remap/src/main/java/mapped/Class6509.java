// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6509 implements Class6507
{
    private static String[] field25884;
    
    @Override
    public void method19597(final CustomGuiScreen customGuiScreen, final CustomGuiScreen class4804) {
        int n = 0;
        int n2 = 0;
        for (final CustomGuiScreen class4805 : customGuiScreen.method14250()) {
            if (class4805.method14272() + class4805.method14276() > n) {
                n = class4805.method14272() + class4805.method14276();
            }
            if (class4805.method14274() + class4805.method14278() <= n2) {
                continue;
            }
            n2 = class4805.method14274() + class4805.method14278();
        }
        customGuiScreen.method14277(n);
        customGuiScreen.method14279(n2);
    }
}
