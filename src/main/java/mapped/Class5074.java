// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5074 extends Class5046
{
    private final Class5046 field21780;
    private String field21781;
    private String field21782;
    
    public Class5074(final Class2330 class2330, final Class5046 field21780) {
        this.field21780 = field21780;
        this.method15673(class2330);
    }
    
    public Class5074(final String s, final Class5046 field21780) {
        this.field21780 = field21780;
        this.method15674(s);
    }
    
    public Class5074(final String s, final String s2, final Class5046 field21780) {
        this.field21780 = field21780;
        this.method15675(s, s2);
    }
    
    private void method15673(final Class2330 class2330) {
        if (class2330.field14071 != -1) {
            this.field21781 = "Realms (" + class2330.field14071 + "):";
            final String string = "mco.errorMessage." + class2330.field14071;
            final String method15438 = Class5046.method15438(string);
            this.field21782 = (method15438.equals(string) ? class2330.field14072 : method15438);
        }
        else {
            this.field21781 = "An error occurred (" + class2330.field14069 + "):";
            this.field21782 = class2330.field14070;
        }
    }
    
    private void method15674(final String field21782) {
        this.field21781 = "An error occurred: ";
        this.field21782 = field21782;
    }
    
    private void method15675(final String field21781, final String field21782) {
        this.field21781 = field21781;
        this.field21782 = field21782;
    }
    
    @Override
    public void method15369() {
        Class7847.method25381(this.field21781 + ": " + this.field21782);
        this.method15431(new Class5622(this, 10, this.method15421() / 2 - 100, this.method15422() - 52, 200, 20, "Ok"));
    }
    
    @Override
    public void method15375() {
        super.method15375();
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15405(this.field21781, this.method15421() / 2, 80, 16777215);
        this.method15405(this.field21782, this.method15421() / 2, 100, 16711680);
        super.method15383(n, n2, n3);
    }
}
