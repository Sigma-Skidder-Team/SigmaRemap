// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1365 implements Runnable
{
    private static String[] field7493;
    public final /* synthetic */ long field7494;
    public final /* synthetic */ int field7495;
    public final /* synthetic */ long field7496;
    public final /* synthetic */ int field7497;
    public final /* synthetic */ Class17 field7498;
    public final /* synthetic */ boolean field7499;
    public final /* synthetic */ Class8788 field7500;
    
    public Class1365(final Class8788 field7500, final long field7501, final int field7502, final long field7503, final int field7504, final Class17 field7505, final boolean field7506) {
        this.field7500 = field7500;
        this.field7494 = field7501;
        this.field7495 = field7502;
        this.field7496 = field7503;
        this.field7497 = field7504;
        this.field7498 = field7505;
        this.field7499 = field7506;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field7494);
        if (Class8788.method30614(this.field7500) <= 2L) {
            if (Class8788.method30614(this.field7500) == 2L) {
                for (long n = 0L; n < Class8788.method30615(this.field7500); ++n) {
                    final long n2 = n * Class8788.method30614(this.field7500) + 2L * this.field7496;
                    final long n3 = n;
                    class17.method171(n3, this.field7498.method137(n2));
                    class17.method171(n3 + Class8788.method30615(this.field7500), this.field7498.method137(n2 + 1L));
                }
                if (this.field7495 != -1) {
                    Class8788.method30613(this.field7500).method21393(class17, 0L, this.field7499);
                    Class8788.method30613(this.field7500).method21393(class17, Class8788.method30615(this.field7500), this.field7499);
                }
                else {
                    Class8788.method30613(this.field7500).method21389(class17, 0L);
                    Class8788.method30613(this.field7500).method21389(class17, Class8788.method30615(this.field7500));
                }
                for (long n4 = 0L; n4 < Class8788.method30615(this.field7500); ++n4) {
                    final long n5 = n4 * Class8788.method30614(this.field7500) + 2L * this.field7496;
                    final long n6 = n4;
                    this.field7498.method171(n5, class17.method137(n6));
                    this.field7498.method171(n5 + 1L, class17.method137(n6 + Class8788.method30615(this.field7500)));
                }
            }
        }
        else if (this.field7495 != -1) {
            for (long n7 = 4L * this.field7496; n7 < Class8788.method30614(this.field7500); n7 += 4L * this.field7497) {
                for (long n8 = 0L; n8 < Class8788.method30615(this.field7500); ++n8) {
                    final long n9 = n8 * Class8788.method30614(this.field7500) + n7;
                    final long n10 = Class8788.method30615(this.field7500) + n8;
                    class17.method171(n8, this.field7498.method137(n9));
                    class17.method171(n10, this.field7498.method137(n9 + 1L));
                    class17.method171(n10 + Class8788.method30615(this.field7500), this.field7498.method137(n9 + 2L));
                    class17.method171(n10 + 2L * Class8788.method30615(this.field7500), this.field7498.method137(n9 + 3L));
                }
                Class8788.method30613(this.field7500).method21393(class17, 0L, this.field7499);
                Class8788.method30613(this.field7500).method21393(class17, Class8788.method30615(this.field7500), this.field7499);
                Class8788.method30613(this.field7500).method21393(class17, 2L * Class8788.method30615(this.field7500), this.field7499);
                Class8788.method30613(this.field7500).method21393(class17, 3L * Class8788.method30615(this.field7500), this.field7499);
                for (long n11 = 0L; n11 < Class8788.method30615(this.field7500); ++n11) {
                    final long n12 = n11 * Class8788.method30614(this.field7500) + n7;
                    final long n13 = Class8788.method30615(this.field7500) + n11;
                    this.field7498.method171(n12, class17.method137(n11));
                    this.field7498.method171(n12 + 1L, class17.method137(n13));
                    this.field7498.method171(n12 + 2L, class17.method137(n13 + Class8788.method30615(this.field7500)));
                    this.field7498.method171(n12 + 3L, class17.method137(n13 + 2L * Class8788.method30615(this.field7500)));
                }
            }
        }
        else {
            for (long n14 = 4L * this.field7496; n14 < Class8788.method30614(this.field7500); n14 += 4L * this.field7497) {
                for (long n15 = 0L; n15 < Class8788.method30615(this.field7500); ++n15) {
                    final long n16 = n15 * Class8788.method30614(this.field7500) + n14;
                    final long n17 = Class8788.method30615(this.field7500) + n15;
                    class17.method171(n15, this.field7498.method137(n16));
                    class17.method171(n17, this.field7498.method137(n16 + 1L));
                    class17.method171(n17 + Class8788.method30615(this.field7500), this.field7498.method137(n16 + 2L));
                    class17.method171(n17 + 2L * Class8788.method30615(this.field7500), this.field7498.method137(n16 + 3L));
                }
                Class8788.method30613(this.field7500).method21389(class17, 0L);
                Class8788.method30613(this.field7500).method21389(class17, Class8788.method30615(this.field7500));
                Class8788.method30613(this.field7500).method21389(class17, 2L * Class8788.method30615(this.field7500));
                Class8788.method30613(this.field7500).method21389(class17, 3L * Class8788.method30615(this.field7500));
                for (long n18 = 0L; n18 < Class8788.method30615(this.field7500); ++n18) {
                    final long n19 = n18 * Class8788.method30614(this.field7500) + n14;
                    final long n20 = Class8788.method30615(this.field7500) + n18;
                    this.field7498.method171(n19, class17.method137(n18));
                    this.field7498.method171(n19 + 1L, class17.method137(n20));
                    this.field7498.method171(n19 + 2L, class17.method137(n20 + Class8788.method30615(this.field7500)));
                    this.field7498.method171(n19 + 3L, class17.method137(n20 + 2L * Class8788.method30615(this.field7500)));
                }
            }
        }
    }
}
