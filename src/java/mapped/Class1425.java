// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1425 implements Runnable
{
    private static String[] field7879;
    public final /* synthetic */ int field7880;
    public final /* synthetic */ int field7881;
    public final /* synthetic */ float[][] field7882;
    public final /* synthetic */ Class6874 field7883;
    
    public Class1425(final Class6874 field7883, final int field7884, final int field7885, final float[][] field7886) {
        this.field7883 = field7883;
        this.field7880 = field7884;
        this.field7881 = field7885;
        this.field7882 = field7886;
    }
    
    @Override
    public void run() {
        for (int i = this.field7880; i < this.field7881; ++i) {
            Class6874.method21034(this.field7883).method30445(this.field7882[i]);
        }
    }
}
