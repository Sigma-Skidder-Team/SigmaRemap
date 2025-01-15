// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1293 implements Runnable
{
    private static String[] field7063;
    public final /* synthetic */ long field7064;
    public final /* synthetic */ int field7065;
    public final /* synthetic */ long field7066;
    public final /* synthetic */ int field7067;
    public final /* synthetic */ Class17 field7068;
    public final /* synthetic */ boolean field7069;
    public final /* synthetic */ Class4406 field7070;
    
    public Class1293(final Class4406 field7070, final long field7071, final int field7072, final long field7073, final int field7074, final Class17 field7075, final boolean field7076) {
        this.field7070 = field7070;
        this.field7064 = field7071;
        this.field7065 = field7072;
        this.field7066 = field7073;
        this.field7067 = field7074;
        this.field7068 = field7075;
        this.field7069 = field7076;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field7064);
        if (Class4406.method13336(this.field7070) <= 2L) {
            if (Class4406.method13336(this.field7070) == 2L) {
                for (long n = 0L; n < Class4406.method13337(this.field7070); ++n) {
                    final long n2 = n * Class4406.method13336(this.field7070) + 2L * this.field7066;
                    final long n3 = n;
                    class17.method171(n3, this.field7068.method137(n2));
                    class17.method171(n3 + Class4406.method13337(this.field7070), this.field7068.method137(n2 + 1L));
                }
                if (this.field7065 != -1) {
                    Class4406.method13335(this.field7070).method30728(class17, 0L, this.field7069);
                    Class4406.method13335(this.field7070).method30728(class17, Class4406.method13337(this.field7070), this.field7069);
                }
                else {
                    Class4406.method13335(this.field7070).method30724(class17, 0L, this.field7069);
                    Class4406.method13335(this.field7070).method30724(class17, Class4406.method13337(this.field7070), this.field7069);
                }
                for (long n4 = 0L; n4 < Class4406.method13337(this.field7070); ++n4) {
                    final long n5 = n4 * Class4406.method13336(this.field7070) + 2L * this.field7066;
                    final long n6 = n4;
                    this.field7068.method171(n5, class17.method137(n6));
                    this.field7068.method171(n5 + 1L, class17.method137(n6 + Class4406.method13337(this.field7070)));
                }
            }
        }
        else if (this.field7065 != -1) {
            for (long n7 = 4L * this.field7066; n7 < Class4406.method13336(this.field7070); n7 += 4 * this.field7067) {
                for (long n8 = 0L; n8 < Class4406.method13337(this.field7070); ++n8) {
                    final long n9 = n8 * Class4406.method13336(this.field7070) + n7;
                    final long n10 = Class4406.method13337(this.field7070) + n8;
                    class17.method171(n8, this.field7068.method137(n9));
                    class17.method171(n10, this.field7068.method137(n9 + 1L));
                    class17.method171(n10 + Class4406.method13337(this.field7070), this.field7068.method137(n9 + 2L));
                    class17.method171(n10 + 2L * Class4406.method13337(this.field7070), this.field7068.method137(n9 + 3L));
                }
                Class4406.method13335(this.field7070).method30728(class17, 0L, this.field7069);
                Class4406.method13335(this.field7070).method30728(class17, Class4406.method13337(this.field7070), this.field7069);
                Class4406.method13335(this.field7070).method30728(class17, 2L * Class4406.method13337(this.field7070), this.field7069);
                Class4406.method13335(this.field7070).method30728(class17, 3L * Class4406.method13337(this.field7070), this.field7069);
                for (long n11 = 0L; n11 < Class4406.method13337(this.field7070); ++n11) {
                    final long n12 = n11 * Class4406.method13336(this.field7070) + n7;
                    final long n13 = Class4406.method13337(this.field7070) + n11;
                    this.field7068.method171(n12, class17.method137(n11));
                    this.field7068.method171(n12 + 1L, class17.method137(n13));
                    this.field7068.method171(n12 + 2L, class17.method137(n13 + Class4406.method13337(this.field7070)));
                    this.field7068.method171(n12 + 3L, class17.method137(n13 + 2L * Class4406.method13337(this.field7070)));
                }
            }
        }
        else {
            for (long n14 = 4L * this.field7066; n14 < Class4406.method13336(this.field7070); n14 += 4 * this.field7067) {
                for (long n15 = 0L; n15 < Class4406.method13337(this.field7070); ++n15) {
                    final long n16 = n15 * Class4406.method13336(this.field7070) + n14;
                    final long n17 = Class4406.method13337(this.field7070) + n15;
                    class17.method171(n15, this.field7068.method137(n16));
                    class17.method171(n17, this.field7068.method137(n16 + 1L));
                    class17.method171(n17 + Class4406.method13337(this.field7070), this.field7068.method137(n16 + 2L));
                    class17.method171(n17 + 2L * Class4406.method13337(this.field7070), this.field7068.method137(n16 + 3L));
                }
                Class4406.method13335(this.field7070).method30724(class17, 0L, this.field7069);
                Class4406.method13335(this.field7070).method30724(class17, Class4406.method13337(this.field7070), this.field7069);
                Class4406.method13335(this.field7070).method30724(class17, 2L * Class4406.method13337(this.field7070), this.field7069);
                Class4406.method13335(this.field7070).method30724(class17, 3L * Class4406.method13337(this.field7070), this.field7069);
                for (long n18 = 0L; n18 < Class4406.method13337(this.field7070); ++n18) {
                    final long n19 = n18 * Class4406.method13336(this.field7070) + n14;
                    final long n20 = Class4406.method13337(this.field7070) + n18;
                    this.field7068.method171(n19, class17.method137(n18));
                    this.field7068.method171(n19 + 1L, class17.method137(n20));
                    this.field7068.method171(n19 + 2L, class17.method137(n20 + Class4406.method13337(this.field7070)));
                    this.field7068.method171(n19 + 3L, class17.method137(n20 + 2L * Class4406.method13337(this.field7070)));
                }
            }
        }
    }
}
