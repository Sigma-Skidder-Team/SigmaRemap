// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2330 extends Exception
{
    public final int field14069;
    public final String field14070;
    public final int field14071;
    public final String field14072;
    
    public Class2330(final int field14069, final String s, final Class8669 class8669) {
        super(s);
        this.field14069 = field14069;
        this.field14070 = s;
        this.field14071 = class8669.method29678();
        this.field14072 = class8669.method29677();
    }
    
    public Class2330(final int field14069, final String s, final int field14070, final String field14071) {
        super(s);
        this.field14069 = field14069;
        this.field14070 = s;
        this.field14071 = field14070;
        this.field14072 = field14071;
    }
    
    @Override
    public String toString() {
        if (this.field14071 != -1) {
            final String string = "mco.errorMessage." + this.field14071;
            final String method15438 = Class5046.method15438(string);
            return (method15438.equals(string) ? this.field14072 : method15438) + " - " + this.field14071;
        }
        return "Realms (" + this.field14069 + ") " + this.field14070;
    }
}
