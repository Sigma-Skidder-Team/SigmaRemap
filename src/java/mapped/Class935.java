// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class935 implements Runnable
{
    private static String[] field4926;
    public final /* synthetic */ long field4927;
    public final /* synthetic */ int field4928;
    public final /* synthetic */ long field4929;
    public final /* synthetic */ int field4930;
    public final /* synthetic */ Class17 field4931;
    public final /* synthetic */ boolean field4932;
    public final /* synthetic */ Class7568 field4933;
    
    public Class935(final Class7568 field4933, final long field4934, final int field4935, final long field4936, final int field4937, final Class17 field4938, final boolean field4939) {
        this.field4933 = field4933;
        this.field4927 = field4934;
        this.field4928 = field4935;
        this.field4929 = field4936;
        this.field4930 = field4937;
        this.field4931 = field4938;
        this.field4932 = field4939;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field4927);
        if (this.field4928 != -1) {
            for (long field4929 = this.field4929; field4929 < Class7568.method23788(this.field4933); field4929 += this.field4930) {
                final long n = field4929 * Class7568.method23784(this.field4933);
                for (long n2 = 0L; n2 < Class7568.method23785(this.field4933); ++n2) {
                    Class7568.method23779(this.field4933).method30728(this.field4931, n + n2 * Class7568.method23786(this.field4933), this.field4932);
                }
                if (Class7568.method23787(this.field4933) <= 2L) {
                    if (Class7568.method23787(this.field4933) == 2L) {
                        for (long n3 = 0L; n3 < Class7568.method23785(this.field4933); ++n3) {
                            final long n4 = n + n3 * Class7568.method23786(this.field4933);
                            class17.method171(n3, this.field4931.method137(n4));
                            class17.method171(Class7568.method23785(this.field4933) + n3, this.field4931.method137(n4 + 1L));
                        }
                        Class7568.method23781(this.field4933).method30728(class17, 0L, this.field4932);
                        Class7568.method23781(this.field4933).method30728(class17, Class7568.method23785(this.field4933), this.field4932);
                        for (long n5 = 0L; n5 < Class7568.method23785(this.field4933); ++n5) {
                            final long n6 = n + n5 * Class7568.method23786(this.field4933);
                            this.field4931.method171(n6, class17.method137(n5));
                            this.field4931.method171(n6 + 1L, class17.method137(Class7568.method23785(this.field4933) + n5));
                        }
                    }
                }
                else {
                    for (long n7 = 0L; n7 < Class7568.method23787(this.field4933); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class7568.method23785(this.field4933); ++n8) {
                            final long n9 = n + n8 * Class7568.method23786(this.field4933) + n7;
                            final long n10 = Class7568.method23785(this.field4933) + n8;
                            class17.method171(n8, this.field4931.method137(n9));
                            class17.method171(n10, this.field4931.method137(n9 + 1L));
                            class17.method171(n10 + Class7568.method23785(this.field4933), this.field4931.method137(n9 + 2L));
                            class17.method171(n10 + 2L * Class7568.method23785(this.field4933), this.field4931.method137(n9 + 3L));
                        }
                        Class7568.method23781(this.field4933).method30728(class17, 0L, this.field4932);
                        Class7568.method23781(this.field4933).method30728(class17, Class7568.method23785(this.field4933), this.field4932);
                        Class7568.method23781(this.field4933).method30728(class17, 2L * Class7568.method23785(this.field4933), this.field4932);
                        Class7568.method23781(this.field4933).method30728(class17, 3L * Class7568.method23785(this.field4933), this.field4932);
                        for (long n11 = 0L; n11 < Class7568.method23785(this.field4933); ++n11) {
                            final long n12 = n + n11 * Class7568.method23786(this.field4933) + n7;
                            final long n13 = Class7568.method23785(this.field4933) + n11;
                            this.field4931.method171(n12, class17.method137(n11));
                            this.field4931.method171(n12 + 1L, class17.method137(n13));
                            this.field4931.method171(n12 + 2L, class17.method137(n13 + Class7568.method23785(this.field4933)));
                            this.field4931.method171(n12 + 3L, class17.method137(n13 + 2L * Class7568.method23785(this.field4933)));
                        }
                    }
                }
            }
        }
        else {
            for (long field4930 = this.field4929; field4930 < Class7568.method23788(this.field4933); field4930 += this.field4930) {
                final long n14 = field4930 * Class7568.method23784(this.field4933);
                for (long n15 = 0L; n15 < Class7568.method23785(this.field4933); ++n15) {
                    Class7568.method23779(this.field4933).method30724(this.field4931, n14 + n15 * Class7568.method23786(this.field4933), this.field4932);
                }
                if (Class7568.method23787(this.field4933) <= 2L) {
                    if (Class7568.method23787(this.field4933) == 2L) {
                        for (long n16 = 0L; n16 < Class7568.method23785(this.field4933); ++n16) {
                            final long n17 = n14 + n16 * Class7568.method23786(this.field4933);
                            class17.method171(n16, this.field4931.method137(n17));
                            class17.method171(Class7568.method23785(this.field4933) + n16, this.field4931.method137(n17 + 1L));
                        }
                        Class7568.method23781(this.field4933).method30724(class17, 0L, this.field4932);
                        Class7568.method23781(this.field4933).method30724(class17, Class7568.method23785(this.field4933), this.field4932);
                        for (long n18 = 0L; n18 < Class7568.method23785(this.field4933); ++n18) {
                            final long n19 = n14 + n18 * Class7568.method23786(this.field4933);
                            this.field4931.method171(n19, class17.method137(n18));
                            this.field4931.method171(n19 + 1L, class17.method137(Class7568.method23785(this.field4933) + n18));
                        }
                    }
                }
                else {
                    for (long n20 = 0L; n20 < Class7568.method23787(this.field4933); n20 += 4L) {
                        for (long n21 = 0L; n21 < Class7568.method23785(this.field4933); ++n21) {
                            final long n22 = n14 + n21 * Class7568.method23786(this.field4933) + n20;
                            final long n23 = Class7568.method23785(this.field4933) + n21;
                            class17.method171(n21, this.field4931.method137(n22));
                            class17.method171(n23, this.field4931.method137(n22 + 1L));
                            class17.method171(n23 + Class7568.method23785(this.field4933), this.field4931.method137(n22 + 2L));
                            class17.method171(n23 + 2L * Class7568.method23785(this.field4933), this.field4931.method137(n22 + 3L));
                        }
                        Class7568.method23781(this.field4933).method30724(class17, 0L, this.field4932);
                        Class7568.method23781(this.field4933).method30724(class17, Class7568.method23785(this.field4933), this.field4932);
                        Class7568.method23781(this.field4933).method30724(class17, 2L * Class7568.method23785(this.field4933), this.field4932);
                        Class7568.method23781(this.field4933).method30724(class17, 3L * Class7568.method23785(this.field4933), this.field4932);
                        for (long n24 = 0L; n24 < Class7568.method23785(this.field4933); ++n24) {
                            final long n25 = n14 + n24 * Class7568.method23786(this.field4933) + n20;
                            final long n26 = Class7568.method23785(this.field4933) + n24;
                            this.field4931.method171(n25, class17.method137(n24));
                            this.field4931.method171(n25 + 1L, class17.method137(n26));
                            this.field4931.method171(n25 + 2L, class17.method137(n26 + Class7568.method23785(this.field4933)));
                            this.field4931.method171(n25 + 3L, class17.method137(n26 + 2L * Class7568.method23785(this.field4933)));
                        }
                    }
                }
            }
        }
    }
}
