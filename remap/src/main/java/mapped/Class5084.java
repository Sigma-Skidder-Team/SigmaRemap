// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5084 extends RealmsScreen
{
    private final Class2039 field21901;
    private final String field21902;
    private final String field21903;
    public final RealmsConfirmResultListener field21904;
    public final String field21905;
    public final String field21906;
    private final String field21907;
    public final int field21908;
    private final boolean field21909;
    
    public Class5084(final RealmsConfirmResultListener field21904, final Class2039 field21905, final String field21906, final String field21907, final boolean field21908, final int field21909) {
        this.field21904 = field21904;
        this.field21908 = field21909;
        this.field21901 = field21905;
        this.field21902 = field21906;
        this.field21903 = field21907;
        this.field21909 = field21908;
        this.field21905 = RealmsScreen.getLocalizedString("gui.yes");
        this.field21906 = RealmsScreen.getLocalizedString("gui.no");
        this.field21907 = RealmsScreen.getLocalizedString("mco.gui.ok");
    }
    
    @Override
    public void init() {
        Realms.method25383(this.field21901.field11630, this.field21902, this.field21903);
        if (!this.field21909) {
            this.buttonsAdd(new Class5613(this, 0, this.width() / 2 - 50, Class7869.method25488(8), 100, 20, this.field21907));
        }
        else {
            this.buttonsAdd(new Class5668(this, 0, this.width() / 2 - 105, Class7869.method25488(8), 100, 20, this.field21905));
            this.buttonsAdd(new Class5614(this, 1, this.width() / 2 + 5, Class7869.method25488(8), 100, 20, this.field21906));
        }
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        this.field21904.confirmResult(false, this.field21908);
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.drawCenteredString(this.field21901.field11630, this.width() / 2, Class7869.method25488(2), this.field21901.field11629);
        this.drawCenteredString(this.field21902, this.width() / 2, Class7869.method25488(4), 16777215);
        this.drawCenteredString(this.field21903, this.width() / 2, Class7869.method25488(6), 16777215);
        super.render(n, n2, n3);
    }
}
