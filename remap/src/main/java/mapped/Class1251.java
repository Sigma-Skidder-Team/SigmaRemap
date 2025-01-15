// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1251 implements Runnable
{
    private static String[] field6805;
    public final /* synthetic */ long field6806;
    public final /* synthetic */ int field6807;
    public final /* synthetic */ long field6808;
    public final /* synthetic */ int field6809;
    public final /* synthetic */ Class17 field6810;
    public final /* synthetic */ boolean field6811;
    public final /* synthetic */ Class7796 field6812;
    
    public Class1251(final Class7796 field6812, final long field6813, final int field6814, final long field6815, final int field6816, final Class17 field6817, final boolean field6818) {
        this.field6812 = field6812;
        this.field6806 = field6813;
        this.field6807 = field6814;
        this.field6808 = field6815;
        this.field6809 = field6816;
        this.field6810 = field6817;
        this.field6811 = field6818;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field6806);
        if (this.field6807 != -1) {
            if (Class7796.method25154(this.field6812) <= 2L) {
                if (Class7796.method25154(this.field6812) == 2L) {
                    for (long field6808 = this.field6808; field6808 < Class7796.method25152(this.field6812); field6808 += this.field6809) {
                        final long n = field6808 * Class7796.method25153(this.field6812);
                        for (long n2 = 0L; n2 < Class7796.method25155(this.field6812); ++n2) {
                            final long n3 = n2 * Class7796.method25151(this.field6812) + n;
                            class17.method171(n2, this.field6810.method137(n3));
                            class17.method171(Class7796.method25155(this.field6812) + n2, this.field6810.method137(n3 + 1L));
                        }
                        Class7796.method25150(this.field6812).method18043(class17, 0L, this.field6811);
                        Class7796.method25150(this.field6812).method18043(class17, Class7796.method25155(this.field6812), this.field6811);
                        for (long n4 = 0L; n4 < Class7796.method25155(this.field6812); ++n4) {
                            final long n5 = n4 * Class7796.method25151(this.field6812) + n;
                            this.field6810.method171(n5, class17.method137(n4));
                            this.field6810.method171(n5 + 1L, class17.method137(Class7796.method25155(this.field6812) + n4));
                        }
                    }
                }
            }
            else {
                for (long field6809 = this.field6808; field6809 < Class7796.method25152(this.field6812); field6809 += this.field6809) {
                    final long n6 = field6809 * Class7796.method25153(this.field6812);
                    for (long n7 = 0L; n7 < Class7796.method25154(this.field6812); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class7796.method25155(this.field6812); ++n8) {
                            final long n9 = n8 * Class7796.method25151(this.field6812) + n6 + n7;
                            final long n10 = Class7796.method25155(this.field6812) + n8;
                            class17.method171(n8, this.field6810.method137(n9));
                            class17.method171(n10, this.field6810.method137(n9 + 1L));
                            class17.method171(n10 + Class7796.method25155(this.field6812), this.field6810.method137(n9 + 2L));
                            class17.method171(n10 + 2L * Class7796.method25155(this.field6812), this.field6810.method137(n9 + 3L));
                        }
                        Class7796.method25150(this.field6812).method18043(class17, 0L, this.field6811);
                        Class7796.method25150(this.field6812).method18043(class17, Class7796.method25155(this.field6812), this.field6811);
                        Class7796.method25150(this.field6812).method18043(class17, 2L * Class7796.method25155(this.field6812), this.field6811);
                        Class7796.method25150(this.field6812).method18043(class17, 3L * Class7796.method25155(this.field6812), this.field6811);
                        for (long n11 = 0L; n11 < Class7796.method25155(this.field6812); ++n11) {
                            final long n12 = n11 * Class7796.method25151(this.field6812) + n6 + n7;
                            final long n13 = Class7796.method25155(this.field6812) + n11;
                            this.field6810.method171(n12, class17.method137(n11));
                            this.field6810.method171(n12 + 1L, class17.method137(n13));
                            this.field6810.method171(n12 + 2L, class17.method137(n13 + Class7796.method25155(this.field6812)));
                            this.field6810.method171(n12 + 3L, class17.method137(n13 + 2L * Class7796.method25155(this.field6812)));
                        }
                    }
                }
            }
        }
        else if (Class7796.method25154(this.field6812) <= 2L) {
            if (Class7796.method25154(this.field6812) == 2L) {
                for (long field6810 = this.field6808; field6810 < Class7796.method25152(this.field6812); field6810 += this.field6809) {
                    final long n14 = field6810 * Class7796.method25153(this.field6812);
                    for (long n15 = 0L; n15 < Class7796.method25155(this.field6812); ++n15) {
                        final long n16 = n15 * Class7796.method25151(this.field6812) + n14;
                        class17.method171(n15, this.field6810.method137(n16));
                        class17.method171(Class7796.method25155(this.field6812) + n15, this.field6810.method137(n16 + 1L));
                    }
                    Class7796.method25150(this.field6812).method18039(class17, 0L, this.field6811);
                    Class7796.method25150(this.field6812).method18039(class17, Class7796.method25155(this.field6812), this.field6811);
                    for (long n17 = 0L; n17 < Class7796.method25155(this.field6812); ++n17) {
                        final long n18 = n17 * Class7796.method25151(this.field6812) + n14;
                        this.field6810.method171(n18, class17.method137(n17));
                        this.field6810.method171(n18 + 1L, class17.method137(Class7796.method25155(this.field6812) + n17));
                    }
                }
            }
        }
        else {
            for (long field6811 = this.field6808; field6811 < Class7796.method25152(this.field6812); field6811 += this.field6809) {
                final long n19 = field6811 * Class7796.method25153(this.field6812);
                for (long n20 = 0L; n20 < Class7796.method25154(this.field6812); n20 += 4L) {
                    for (long n21 = 0L; n21 < Class7796.method25155(this.field6812); ++n21) {
                        final long n22 = n21 * Class7796.method25151(this.field6812) + n19 + n20;
                        final long n23 = Class7796.method25155(this.field6812) + n21;
                        class17.method171(n21, this.field6810.method137(n22));
                        class17.method171(n23, this.field6810.method137(n22 + 1L));
                        class17.method171(n23 + Class7796.method25155(this.field6812), this.field6810.method137(n22 + 2L));
                        class17.method171(n23 + 2L * Class7796.method25155(this.field6812), this.field6810.method137(n22 + 3L));
                    }
                    Class7796.method25150(this.field6812).method18039(class17, 0L, this.field6811);
                    Class7796.method25150(this.field6812).method18039(class17, Class7796.method25155(this.field6812), this.field6811);
                    Class7796.method25150(this.field6812).method18039(class17, 2L * Class7796.method25155(this.field6812), this.field6811);
                    Class7796.method25150(this.field6812).method18039(class17, 3L * Class7796.method25155(this.field6812), this.field6811);
                    for (long n24 = 0L; n24 < Class7796.method25155(this.field6812); ++n24) {
                        final long n25 = n24 * Class7796.method25151(this.field6812) + n19 + n20;
                        final long n26 = Class7796.method25155(this.field6812) + n24;
                        this.field6810.method171(n25, class17.method137(n24));
                        this.field6810.method171(n25 + 1L, class17.method137(n26));
                        this.field6810.method171(n25 + 2L, class17.method137(n26 + Class7796.method25155(this.field6812)));
                        this.field6810.method171(n25 + 3L, class17.method137(n26 + 2L * Class7796.method25155(this.field6812)));
                    }
                }
            }
        }
    }
}
