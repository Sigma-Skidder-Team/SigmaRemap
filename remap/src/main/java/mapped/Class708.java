// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class708 extends Class703
{
    public Class708(final Screen class527, final Class5760 class528) {
        super(class527, class528, new Class2259("options.skinCustomisation.title"));
    }
    
    @Override
    public void init() {
        int n = 0;
        for (final Class189 class189 : Class189.values()) {
            this.addButton(new Class654(this.width / 2 - 155 + n % 2 * 160, this.height / 6 + 24 * (n >> 1), 150, 20, this.method3915(class189), class190 -> {
                this.field3869.method17127(class189);
                class190.method3367(this.method3915(class189));
            }));
            ++n;
        }
        this.addButton(new Class657(this.width / 2 - 155 + n % 2 * 160, this.height / 6 + 24 * (n >> 1), 150, 20, Class6469.field25725, Class6469.field25725.method19486(this.field3869), class654 -> {
            Class6469.field25725.method19485(this.field3869, 1);
            this.field3869.method17121();
            class654.method3367(Class6469.field25725.method19486(this.field3869));
            this.field3869.method17124();
        }));
        if (++n % 2 == 1) {
            ++n;
        }
        this.addButton(new Class654(this.width / 2 - 100, this.height / 6 + 24 * (n >> 1), 200, 20, Class8822.method30773("of.options.skinCustomisation.ofCape"), class654 -> this.minecraft.displayGuiScreen(new Class702(this))));
        this.addButton(new Class654(this.width / 2 - 100, this.height / 6 + 24 * (n + 2 >> 1), 200, 20, Class8822.method30773("gui.done"), class654 -> this.minecraft.displayGuiScreen(this.field3868)));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 20, 16777215);
        super.render(n, n2, n3);
    }
    
    private String method3915(final Class189 class189) {
        String str;
        if (!this.field3869.method17125().contains(class189)) {
            str = Class8822.method30773("options.off");
        }
        else {
            str = Class8822.method30773("options.on");
        }
        return class189.method830().getFormattedText() + ": " + str;
    }
}
