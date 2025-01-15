// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1626 implements Runnable
{
    private static String[] field9083;
    public final /* synthetic */ long field9084;
    public final /* synthetic */ int field9085;
    public final /* synthetic */ long field9086;
    public final /* synthetic */ int field9087;
    public final /* synthetic */ Class17 field9088;
    public final /* synthetic */ boolean field9089;
    public final /* synthetic */ Class5815 field9090;
    
    public Class1626(final Class5815 field9090, final long field9091, final int field9092, final long field9093, final int field9094, final Class17 field9095, final boolean field9096) {
        this.field9090 = field9090;
        this.field9084 = field9091;
        this.field9085 = field9092;
        this.field9086 = field9093;
        this.field9087 = field9094;
        this.field9088 = field9095;
        this.field9089 = field9096;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field9084);
        if (this.field9085 != -1) {
            for (long field9086 = this.field9086; field9086 < Class5815.method17507(this.field9090); field9086 += this.field9087) {
                final long n = field9086 * Class5815.method17497(this.field9090);
                for (long n2 = 0L; n2 < Class5815.method17505(this.field9090); ++n2) {
                    Class5815.method17500(this.field9090).method21393(this.field9088, n + n2 * Class5815.method17499(this.field9090), this.field9089);
                }
                if (Class5815.method17506(this.field9090) <= 2L) {
                    if (Class5815.method17506(this.field9090) == 2L) {
                        for (long n3 = 0L; n3 < Class5815.method17505(this.field9090); ++n3) {
                            final long n4 = n + n3 * Class5815.method17499(this.field9090);
                            class17.method171(n3, this.field9088.method137(n4));
                            class17.method171(Class5815.method17505(this.field9090) + n3, this.field9088.method137(n4 + 1L));
                        }
                        Class5815.method17502(this.field9090).method21393(class17, 0L, this.field9089);
                        Class5815.method17502(this.field9090).method21393(class17, Class5815.method17505(this.field9090), this.field9089);
                        for (long n5 = 0L; n5 < Class5815.method17505(this.field9090); ++n5) {
                            final long n6 = n + n5 * Class5815.method17499(this.field9090);
                            this.field9088.method171(n6, class17.method137(n5));
                            this.field9088.method171(n6 + 1L, class17.method137(Class5815.method17505(this.field9090) + n5));
                        }
                    }
                }
                else {
                    for (long n7 = 0L; n7 < Class5815.method17506(this.field9090); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class5815.method17505(this.field9090); ++n8) {
                            final long n9 = n + n8 * Class5815.method17499(this.field9090) + n7;
                            final long n10 = Class5815.method17505(this.field9090) + n8;
                            class17.method171(n8, this.field9088.method137(n9));
                            class17.method171(n10, this.field9088.method137(n9 + 1L));
                            class17.method171(n10 + Class5815.method17505(this.field9090), this.field9088.method137(n9 + 2L));
                            class17.method171(n10 + 2L * Class5815.method17505(this.field9090), this.field9088.method137(n9 + 3L));
                        }
                        Class5815.method17502(this.field9090).method21393(class17, 0L, this.field9089);
                        Class5815.method17502(this.field9090).method21393(class17, Class5815.method17505(this.field9090), this.field9089);
                        Class5815.method17502(this.field9090).method21393(class17, 2L * Class5815.method17505(this.field9090), this.field9089);
                        Class5815.method17502(this.field9090).method21393(class17, 3L * Class5815.method17505(this.field9090), this.field9089);
                        for (long n11 = 0L; n11 < Class5815.method17505(this.field9090); ++n11) {
                            final long n12 = n + n11 * Class5815.method17499(this.field9090) + n7;
                            final long n13 = Class5815.method17505(this.field9090) + n11;
                            this.field9088.method171(n12, class17.method137(n11));
                            this.field9088.method171(n12 + 1L, class17.method137(n13));
                            this.field9088.method171(n12 + 2L, class17.method137(n13 + Class5815.method17505(this.field9090)));
                            this.field9088.method171(n12 + 3L, class17.method137(n13 + 2L * Class5815.method17505(this.field9090)));
                        }
                    }
                }
            }
        }
        else {
            for (long field9087 = this.field9086; field9087 < Class5815.method17507(this.field9090); field9087 += this.field9087) {
                final long n14 = field9087 * Class5815.method17497(this.field9090);
                for (long n15 = 0L; n15 < Class5815.method17505(this.field9090); ++n15) {
                    Class5815.method17500(this.field9090).method21389(this.field9088, n14 + n15 * Class5815.method17499(this.field9090));
                }
                if (Class5815.method17506(this.field9090) <= 2L) {
                    if (Class5815.method17506(this.field9090) == 2L) {
                        for (long n16 = 0L; n16 < Class5815.method17505(this.field9090); ++n16) {
                            final long n17 = n14 + n16 * Class5815.method17499(this.field9090);
                            class17.method171(n16, this.field9088.method137(n17));
                            class17.method171(Class5815.method17505(this.field9090) + n16, this.field9088.method137(n17 + 1L));
                        }
                        Class5815.method17502(this.field9090).method21389(class17, 0L);
                        Class5815.method17502(this.field9090).method21389(class17, Class5815.method17505(this.field9090));
                        for (long n18 = 0L; n18 < Class5815.method17505(this.field9090); ++n18) {
                            final long n19 = n14 + n18 * Class5815.method17499(this.field9090);
                            this.field9088.method171(n19, class17.method137(n18));
                            this.field9088.method171(n19 + 1L, class17.method137(Class5815.method17505(this.field9090) + n18));
                        }
                    }
                }
                else {
                    for (long n20 = 0L; n20 < Class5815.method17506(this.field9090); n20 += 4L) {
                        for (long n21 = 0L; n21 < Class5815.method17505(this.field9090); ++n21) {
                            final long n22 = n14 + n21 * Class5815.method17499(this.field9090) + n20;
                            final long n23 = Class5815.method17505(this.field9090) + n21;
                            class17.method171(n21, this.field9088.method137(n22));
                            class17.method171(n23, this.field9088.method137(n22 + 1L));
                            class17.method171(n23 + Class5815.method17505(this.field9090), this.field9088.method137(n22 + 2L));
                            class17.method171(n23 + 2L * Class5815.method17505(this.field9090), this.field9088.method137(n22 + 3L));
                        }
                        Class5815.method17502(this.field9090).method21389(class17, 0L);
                        Class5815.method17502(this.field9090).method21389(class17, Class5815.method17505(this.field9090));
                        Class5815.method17502(this.field9090).method21389(class17, 2L * Class5815.method17505(this.field9090));
                        Class5815.method17502(this.field9090).method21389(class17, 3L * Class5815.method17505(this.field9090));
                        for (long n24 = 0L; n24 < Class5815.method17505(this.field9090); ++n24) {
                            final long n25 = n14 + n24 * Class5815.method17499(this.field9090) + n20;
                            final long n26 = Class5815.method17505(this.field9090) + n24;
                            this.field9088.method171(n25, class17.method137(n24));
                            this.field9088.method171(n25 + 1L, class17.method137(n26));
                            this.field9088.method171(n25 + 2L, class17.method137(n26 + Class5815.method17505(this.field9090)));
                            this.field9088.method171(n25 + 3L, class17.method137(n26 + 2L * Class5815.method17505(this.field9090)));
                        }
                    }
                }
            }
        }
    }
}
