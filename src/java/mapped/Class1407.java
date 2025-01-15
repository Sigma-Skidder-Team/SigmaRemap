// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1407 implements Runnable
{
    private static String[] field7773;
    public final /* synthetic */ int field7774;
    public final /* synthetic */ int field7775;
    public final /* synthetic */ float[][][] field7776;
    public final /* synthetic */ Class6362 field7777;
    
    public Class1407(final Class6362 field7777, final int field7778, final int field7779, final float[][][] field7780) {
        this.field7777 = field7777;
        this.field7774 = field7778;
        this.field7775 = field7779;
        this.field7776 = field7780;
    }
    
    @Override
    public void run() {
        for (int i = this.field7774; i < this.field7775; ++i) {
            for (int j = 0; j < Class6362.method18998(this.field7777); ++j) {
                Class6362.method19000(this.field7777).method25937(this.field7776[i][j]);
            }
        }
    }
}
