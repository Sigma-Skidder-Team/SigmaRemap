// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1275 implements Runnable
{
    private static String[] field6962;
    public final /* synthetic */ long field6963;
    public final /* synthetic */ long field6964;
    public final /* synthetic */ long field6965;
    public final /* synthetic */ long field6966;
    public final /* synthetic */ Class17 field6967;
    public final /* synthetic */ long field6968;
    public final /* synthetic */ Class6733 field6969;
    
    public Class1275(final Class6733 field6969, final long field6970, final long field6971, final long field6972, final long field6973, final Class17 field6974, final long field6975) {
        this.field6969 = field6969;
        this.field6963 = field6970;
        this.field6964 = field6971;
        this.field6965 = field6972;
        this.field6966 = field6973;
        this.field6967 = field6974;
        this.field6968 = field6975;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field6963);
        for (long field6964 = this.field6964; field6964 >= this.field6965; --field6964) {
            final long n = field6964 * Class6733.method20481(this.field6969);
            final long n2 = field6964 * this.field6966;
            for (long n3 = Class6733.method20482(this.field6969) - 1L; n3 >= 0L; --n3) {
                Class8601.method29154(this.field6967, n + n3 * Class6733.method20483(this.field6969), class17, 0L, Class6733.method20484(this.field6969));
                Class6733.method20476(this.field6969).method26085(class17);
                Class8601.method29154(class17, 0L, this.field6967, n2 + n3 * this.field6968, this.field6963);
            }
        }
    }
}
