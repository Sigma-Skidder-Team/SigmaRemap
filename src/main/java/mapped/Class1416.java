// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1416 implements Runnable
{
    private static String[] field7828;
    public final /* synthetic */ int field7829;
    public final /* synthetic */ long field7830;
    public final /* synthetic */ int field7831;
    public final /* synthetic */ Class17 field7832;
    public final /* synthetic */ boolean field7833;
    public final /* synthetic */ Class8788 field7834;
    
    public Class1416(final Class8788 field7834, final int field7835, final long field7836, final int field7837, final Class17 field7838, final boolean field7839) {
        this.field7834 = field7834;
        this.field7829 = field7835;
        this.field7830 = field7836;
        this.field7831 = field7837;
        this.field7832 = field7838;
        this.field7833 = field7839;
    }
    
    @Override
    public void run() {
        if (this.field7829 != -1) {
            for (long field7830 = this.field7830; field7830 < Class8788.method30615(this.field7834); field7830 += this.field7831) {
                Class8788.method30611(this.field7834).method21393(this.field7832, field7830 * Class8788.method30614(this.field7834), this.field7833);
            }
        }
        else {
            for (long field7831 = this.field7830; field7831 < Class8788.method30615(this.field7834); field7831 += this.field7831) {
                Class8788.method30611(this.field7834).method21389(this.field7832, field7831 * Class8788.method30614(this.field7834));
            }
        }
    }
}
