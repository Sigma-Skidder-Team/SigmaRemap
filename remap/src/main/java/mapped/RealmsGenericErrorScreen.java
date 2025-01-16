// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class RealmsGenericErrorScreen extends RealmsScreen
{
    private final RealmsScreen field_224228_a;
    private String field_224229_b;
    private String field_224230_c;
    
    public RealmsGenericErrorScreen(final RealmsServiceException class2330, final RealmsScreen field21780) {
        this.field_224228_a = field21780;
        this.func_224224_a(class2330);
    }
    
    public RealmsGenericErrorScreen(final String s, final RealmsScreen field21780) {
        this.field_224228_a = field21780;
        this.func_224225_a(s);
    }
    
    public RealmsGenericErrorScreen(final String s, final String s2, final RealmsScreen field21780) {
        this.field_224228_a = field21780;
        this.func_224227_a(s, s2);
    }
    
    private void func_224224_a(final RealmsServiceException class2330) {
        if (class2330.field14071 != -1) {
            this.field_224229_b = "Realms (" + class2330.field14071 + "):";
            final String string = "mco.errorMessage." + class2330.field14071;
            final String method15438 = RealmsScreen.getLocalizedString(string);
            this.field_224230_c = (method15438.equals(string) ? class2330.field14072 : method15438);
        }
        else {
            this.field_224229_b = "An error occurred (" + class2330.field14069 + "):";
            this.field_224230_c = class2330.field14070;
        }
    }
    
    private void func_224225_a(final String field21782) {
        this.field_224229_b = "An error occurred: ";
        this.field_224230_c = field21782;
    }
    
    private void func_224227_a(final String field21781, final String field21782) {
        this.field_224229_b = field21781;
        this.field_224230_c = field21782;
    }
    
    @Override
    public void init() {
        Realms.narrateNow(this.field_224229_b + ": " + this.field_224230_c);
        this.buttonsAdd(new RealmsButton(this, 10, this.width() / 2 - 100, this.height() - 52, 200, 20, "Ok"));
    }
    
    @Override
    public void tick() {
        super.tick();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.drawCenteredString(this.field_224229_b, this.width() / 2, 80, 16777215);
        this.drawCenteredString(this.field_224230_c, this.width() / 2, 100, 16711680);
        super.render(n, n2, n3);
    }
}
