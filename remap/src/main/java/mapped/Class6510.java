// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6510 implements Class6507
{
    private static String[] field25885;
    
    @Override
    public void method19597(final CustomGuiScreen customGuiScreen, final CustomGuiScreen class4804) {
        customGuiScreen.method14273(0);
        customGuiScreen.method14275(0);
        if (class4804 == null) {
            customGuiScreen.method14277(Minecraft.getInstance().window.method7694());
            customGuiScreen.method14279(Minecraft.getInstance().window.method7695());
        }
        else {
            customGuiScreen.method14277(class4804.method14276());
            customGuiScreen.method14279(class4804.method14278());
        }
    }
}
