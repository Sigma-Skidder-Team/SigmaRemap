// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class562 extends Screen
{
    private static final ResourceLocation field3350;
    
    public Class562() {
        super(new Class2259("demo.help.title"));
    }
    
    @Override
    public void init() {
        this.addButton(new Class654(this.width / 2 - 116, this.height / 2 + 62 - 16, 114, 20, Class8822.method30773("demo.help.buy"), class654 -> {
            class654.field3431 = false;
            Util.getOS().method980("http://www.minecraft.net/store?source=demo");
        }));
        this.addButton(new Class654(this.width / 2 + 2, this.height / 2 + 62 - 16, 114, 20, Class8822.method30773("demo.help.later"), class654 -> {
            this.minecraft.displayGuiScreen(null);
            this.minecraft.field4650.method26963();
        }));
    }
    
    @Override
    public void renderBackground() {
        super.renderBackground();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class562.field3350);
        this.blit((this.width - 248) / 2, (this.height - 166) / 2, 0, 0, 248, 166);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        final int n4 = (this.width - 248) / 2 + 10;
        final int n5 = (this.height - 166) / 2 + 8;
        this.font.method6610(this.title.getFormattedText(), (float)n4, (float)n5, 2039583);
        final int n6 = n5 + 12;
        final Class5760 field4648 = this.minecraft.gameSettings;
        this.font.method6610(Class8822.method30773("demo.help.movementShort", field4648.field23435.method1068(), field4648.field23436.method1068(), field4648.field23437.method1068(), field4648.field23438.method1068()), (float)n4, (float)n6, 5197647);
        this.font.method6610(Class8822.method30773("demo.help.movementMouse"), (float)n4, (float)(n6 + 12), 5197647);
        this.font.method6610(Class8822.method30773("demo.help.jump", field4648.field23439.method1068()), (float)n4, (float)(n6 + 24), 5197647);
        this.font.method6610(Class8822.method30773("demo.help.inventory", field4648.field23442.method1068()), (float)n4, (float)(n6 + 36), 5197647);
        this.font.method6622(Class8822.method30773("demo.help.fullWrapped"), n4, n6 + 68, 218, 2039583);
        super.render(n, n2, n3);
    }
    
    static {
        field3350 = new ResourceLocation("textures/gui/demo_background.png");
    }
}
