// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1317 implements Runnable
{
    private static String[] field7225;
    public final /* synthetic */ long field7226;
    public final /* synthetic */ int field7227;
    public final /* synthetic */ long field7228;
    public final /* synthetic */ long field7229;
    public final /* synthetic */ Class17 field7230;
    public final /* synthetic */ boolean field7231;
    public final /* synthetic */ Class9033 field7232;
    
    public Class1317(final Class9033 field7232, final long field7233, final int field7234, final long field7235, final long field7236, final Class17 field7237, final boolean field7238) {
        this.field7232 = field7232;
        this.field7226 = field7233;
        this.field7227 = field7234;
        this.field7228 = field7235;
        this.field7229 = field7236;
        this.field7230 = field7237;
        this.field7231 = field7238;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field7226);
        if (Class9033.method32455(this.field7232) <= 2L) {
            if (Class9033.method32455(this.field7232) == 2L) {
                for (long n = 0L; n < Class9033.method32456(this.field7232); ++n) {
                    final long n2 = n * Class9033.method32455(this.field7232) + 2L * this.field7228;
                    final long n3 = n;
                    class17.method171(n3, this.field7230.method137(n2));
                    class17.method171(n3 + Class9033.method32456(this.field7232), this.field7230.method137(n2 + 1L));
                }
                if (this.field7227 != -1) {
                    Class9033.method32454(this.field7232).method18043(class17, 0L, this.field7231);
                    Class9033.method32454(this.field7232).method18043(class17, Class9033.method32456(this.field7232), this.field7231);
                }
                else {
                    Class9033.method32454(this.field7232).method18039(class17, 0L, this.field7231);
                    Class9033.method32454(this.field7232).method18039(class17, Class9033.method32456(this.field7232), this.field7231);
                }
                for (long n4 = 0L; n4 < Class9033.method32456(this.field7232); ++n4) {
                    final long n5 = n4 * Class9033.method32455(this.field7232) + 2L * this.field7228;
                    final long n6 = n4;
                    this.field7230.method171(n5, class17.method137(n6));
                    this.field7230.method171(n5 + 1L, class17.method137(n6 + Class9033.method32456(this.field7232)));
                }
            }
        }
        else if (this.field7227 != -1) {
            for (long n7 = 4L * this.field7228; n7 < Class9033.method32455(this.field7232); n7 += 4L * this.field7229) {
                for (long n8 = 0L; n8 < Class9033.method32456(this.field7232); ++n8) {
                    final long n9 = n8 * Class9033.method32455(this.field7232) + n7;
                    final long n10 = Class9033.method32456(this.field7232) + n8;
                    class17.method171(n8, this.field7230.method137(n9));
                    class17.method171(n10, this.field7230.method137(n9 + 1L));
                    class17.method171(n10 + Class9033.method32456(this.field7232), this.field7230.method137(n9 + 2L));
                    class17.method171(n10 + 2L * Class9033.method32456(this.field7232), this.field7230.method137(n9 + 3L));
                }
                Class9033.method32454(this.field7232).method18041(class17, this.field7231);
                Class9033.method32454(this.field7232).method18043(class17, Class9033.method32456(this.field7232), this.field7231);
                Class9033.method32454(this.field7232).method18043(class17, 2L * Class9033.method32456(this.field7232), this.field7231);
                Class9033.method32454(this.field7232).method18043(class17, 3L * Class9033.method32456(this.field7232), this.field7231);
                for (long n11 = 0L; n11 < Class9033.method32456(this.field7232); ++n11) {
                    final long n12 = n11 * Class9033.method32455(this.field7232) + n7;
                    final long n13 = Class9033.method32456(this.field7232) + n11;
                    this.field7230.method171(n12, class17.method137(n11));
                    this.field7230.method171(n12 + 1L, class17.method137(n13));
                    this.field7230.method171(n12 + 2L, class17.method137(n13 + Class9033.method32456(this.field7232)));
                    this.field7230.method171(n12 + 3L, class17.method137(n13 + 2L * Class9033.method32456(this.field7232)));
                }
            }
        }
        else {
            for (long n14 = 4L * this.field7228; n14 < Class9033.method32455(this.field7232); n14 += 4L * this.field7229) {
                for (long n15 = 0L; n15 < Class9033.method32456(this.field7232); ++n15) {
                    final long n16 = n15 * Class9033.method32455(this.field7232) + n14;
                    final long n17 = Class9033.method32456(this.field7232) + n15;
                    class17.method171(n15, this.field7230.method137(n16));
                    class17.method171(n17, this.field7230.method137(n16 + 1L));
                    class17.method171(n17 + Class9033.method32456(this.field7232), this.field7230.method137(n16 + 2L));
                    class17.method171(n17 + 2L * Class9033.method32456(this.field7232), this.field7230.method137(n16 + 3L));
                }
                Class9033.method32454(this.field7232).method18039(class17, 0L, this.field7231);
                Class9033.method32454(this.field7232).method18039(class17, Class9033.method32456(this.field7232), this.field7231);
                Class9033.method32454(this.field7232).method18039(class17, 2L * Class9033.method32456(this.field7232), this.field7231);
                Class9033.method32454(this.field7232).method18039(class17, 3L * Class9033.method32456(this.field7232), this.field7231);
                for (long n18 = 0L; n18 < Class9033.method32456(this.field7232); ++n18) {
                    final long n19 = n18 * Class9033.method32455(this.field7232) + n14;
                    final long n20 = Class9033.method32456(this.field7232) + n18;
                    this.field7230.method171(n19, class17.method137(n18));
                    this.field7230.method171(n19 + 1L, class17.method137(n20));
                    this.field7230.method171(n19 + 2L, class17.method137(n20 + Class9033.method32456(this.field7232)));
                    this.field7230.method171(n19 + 3L, class17.method137(n20 + 2L * Class9033.method32456(this.field7232)));
                }
            }
        }
    }
}
