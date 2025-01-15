// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1134 implements Runnable
{
    private static String[] field6128;
    public final /* synthetic */ long field6129;
    public final /* synthetic */ int field6130;
    public final /* synthetic */ long field6131;
    public final /* synthetic */ int field6132;
    public final /* synthetic */ Class17 field6133;
    public final /* synthetic */ boolean field6134;
    public final /* synthetic */ Class7568 field6135;
    
    public Class1134(final Class7568 field6135, final long field6136, final int field6137, final long field6138, final int field6139, final Class17 field6140, final boolean field6141) {
        this.field6135 = field6135;
        this.field6129 = field6136;
        this.field6130 = field6137;
        this.field6131 = field6138;
        this.field6132 = field6139;
        this.field6133 = field6140;
        this.field6134 = field6141;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field6129);
        if (this.field6130 != -1) {
            if (Class7568.method23787(this.field6135) <= 2L) {
                if (Class7568.method23787(this.field6135) == 2L) {
                    for (long field6131 = this.field6131; field6131 < Class7568.method23785(this.field6135); field6131 += this.field6132) {
                        final long n = field6131 * Class7568.method23786(this.field6135);
                        for (long n2 = 0L; n2 < Class7568.method23788(this.field6135); ++n2) {
                            final long n3 = n2 * Class7568.method23784(this.field6135) + n;
                            class17.method171(n2, this.field6133.method137(n3));
                            class17.method171(Class7568.method23788(this.field6135) + n2, this.field6133.method137(n3 + 1L));
                        }
                        Class7568.method23783(this.field6135).method30728(class17, 0L, this.field6134);
                        Class7568.method23783(this.field6135).method30728(class17, Class7568.method23788(this.field6135), this.field6134);
                        for (long n4 = 0L; n4 < Class7568.method23788(this.field6135); ++n4) {
                            final long n5 = n4 * Class7568.method23784(this.field6135) + n;
                            this.field6133.method171(n5, class17.method137(n4));
                            this.field6133.method171(n5 + 1L, class17.method137(Class7568.method23788(this.field6135) + n4));
                        }
                    }
                }
            }
            else {
                for (long field6132 = this.field6131; field6132 < Class7568.method23785(this.field6135); field6132 += this.field6132) {
                    final long n6 = field6132 * Class7568.method23786(this.field6135);
                    for (long n7 = 0L; n7 < Class7568.method23787(this.field6135); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class7568.method23788(this.field6135); ++n8) {
                            final long n9 = n8 * Class7568.method23784(this.field6135) + n6 + n7;
                            final long n10 = Class7568.method23788(this.field6135) + n8;
                            class17.method171(n8, this.field6133.method137(n9));
                            class17.method171(n10, this.field6133.method137(n9 + 1L));
                            class17.method171(n10 + Class7568.method23788(this.field6135), this.field6133.method137(n9 + 2L));
                            class17.method171(n10 + 2L * Class7568.method23788(this.field6135), this.field6133.method137(n9 + 3L));
                        }
                        Class7568.method23783(this.field6135).method30728(class17, 0L, this.field6134);
                        Class7568.method23783(this.field6135).method30728(class17, Class7568.method23788(this.field6135), this.field6134);
                        Class7568.method23783(this.field6135).method30728(class17, 2L * Class7568.method23788(this.field6135), this.field6134);
                        Class7568.method23783(this.field6135).method30728(class17, 3L * Class7568.method23788(this.field6135), this.field6134);
                        for (long n11 = 0L; n11 < Class7568.method23788(this.field6135); ++n11) {
                            final long n12 = n11 * Class7568.method23784(this.field6135) + n6 + n7;
                            final long n13 = Class7568.method23788(this.field6135) + n11;
                            this.field6133.method171(n12, class17.method137(n11));
                            this.field6133.method171(n12 + 1L, class17.method137(n13));
                            this.field6133.method171(n12 + 2L, class17.method137(n13 + Class7568.method23788(this.field6135)));
                            this.field6133.method171(n12 + 3L, class17.method137(n13 + 2L * Class7568.method23788(this.field6135)));
                        }
                    }
                }
            }
        }
        else if (Class7568.method23787(this.field6135) <= 2L) {
            if (Class7568.method23787(this.field6135) == 2L) {
                for (long field6133 = this.field6131; field6133 < Class7568.method23785(this.field6135); field6133 += this.field6132) {
                    final long n14 = field6133 * Class7568.method23786(this.field6135);
                    for (long n15 = 0L; n15 < Class7568.method23788(this.field6135); ++n15) {
                        final long n16 = n15 * Class7568.method23784(this.field6135) + n14;
                        class17.method171(n15, this.field6133.method137(n16));
                        class17.method171(Class7568.method23788(this.field6135) + n15, this.field6133.method137(n16 + 1L));
                    }
                    Class7568.method23783(this.field6135).method30724(class17, 0L, this.field6134);
                    Class7568.method23783(this.field6135).method30724(class17, Class7568.method23788(this.field6135), this.field6134);
                    for (long n17 = 0L; n17 < Class7568.method23788(this.field6135); ++n17) {
                        final long n18 = n17 * Class7568.method23784(this.field6135) + n14;
                        this.field6133.method171(n18, class17.method137(n17));
                        this.field6133.method171(n18 + 1L, class17.method137(Class7568.method23788(this.field6135) + n17));
                    }
                }
            }
        }
        else {
            for (long field6134 = this.field6131; field6134 < Class7568.method23785(this.field6135); field6134 += this.field6132) {
                final long n19 = field6134 * Class7568.method23786(this.field6135);
                for (long n20 = 0L; n20 < Class7568.method23787(this.field6135); n20 += 4L) {
                    for (long n21 = 0L; n21 < Class7568.method23788(this.field6135); ++n21) {
                        final long n22 = n21 * Class7568.method23784(this.field6135) + n19 + n20;
                        final long n23 = Class7568.method23788(this.field6135) + n21;
                        class17.method171(n21, this.field6133.method137(n22));
                        class17.method171(n23, this.field6133.method137(n22 + 1L));
                        class17.method171(n23 + Class7568.method23788(this.field6135), this.field6133.method137(n22 + 2L));
                        class17.method171(n23 + 2L * Class7568.method23788(this.field6135), this.field6133.method137(n22 + 3L));
                    }
                    Class7568.method23783(this.field6135).method30724(class17, 0L, this.field6134);
                    Class7568.method23783(this.field6135).method30724(class17, Class7568.method23788(this.field6135), this.field6134);
                    Class7568.method23783(this.field6135).method30724(class17, 2L * Class7568.method23788(this.field6135), this.field6134);
                    Class7568.method23783(this.field6135).method30724(class17, 3L * Class7568.method23788(this.field6135), this.field6134);
                    for (long n24 = 0L; n24 < Class7568.method23788(this.field6135); ++n24) {
                        final long n25 = n24 * Class7568.method23784(this.field6135) + n19 + n20;
                        final long n26 = Class7568.method23788(this.field6135) + n24;
                        this.field6133.method171(n25, class17.method137(n24));
                        this.field6133.method171(n25 + 1L, class17.method137(n26));
                        this.field6133.method171(n25 + 2L, class17.method137(n26 + Class7568.method23788(this.field6135)));
                        this.field6133.method171(n25 + 3L, class17.method137(n26 + 2L * Class7568.method23788(this.field6135)));
                    }
                }
            }
        }
    }
}
