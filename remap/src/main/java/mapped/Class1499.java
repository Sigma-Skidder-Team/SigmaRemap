// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1499 implements Runnable
{
    private static String[] field8334;
    public final /* synthetic */ long field8335;
    public final /* synthetic */ int field8336;
    public final /* synthetic */ int field8337;
    public final /* synthetic */ long field8338;
    public final /* synthetic */ Class17 field8339;
    public final /* synthetic */ boolean field8340;
    public final /* synthetic */ Class8983 field8341;
    
    public Class1499(final Class8983 field8341, final long field8342, final int field8343, final int field8344, final long field8345, final Class17 field8346, final boolean field8347) {
        this.field8341 = field8341;
        this.field8335 = field8342;
        this.field8336 = field8343;
        this.field8337 = field8344;
        this.field8338 = field8345;
        this.field8339 = field8346;
        this.field8340 = field8347;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field8335);
        if (this.field8336 != -1) {
            if (Class8983.method31980(this.field8341) <= 4 * this.field8337) {
                if (Class8983.method31980(this.field8341) != 4 * this.field8337) {
                    if (Class8983.method31980(this.field8341) == 2 * this.field8337) {
                        for (long n = 0L; n < Class8983.method31978(this.field8341); ++n) {
                            final long n2 = n * Class8983.method31980(this.field8341) + 2L * this.field8338;
                            final long n3 = 2L * n;
                            class17.method171(n3, this.field8339.method137(n2));
                            class17.method171(n3 + 1L, this.field8339.method137(n2 + 1L));
                        }
                        Class8983.method31977(this.field8341).method26079(class17, 0L, this.field8340);
                        for (long n4 = 0L; n4 < Class8983.method31978(this.field8341); ++n4) {
                            final long n5 = n4 * Class8983.method31980(this.field8341) + 2L * this.field8338;
                            final long n6 = 2L * n4;
                            this.field8339.method171(n5, class17.method137(n6));
                            this.field8339.method171(n5 + 1L, class17.method137(n6 + 1L));
                        }
                    }
                }
                else {
                    for (long n7 = 0L; n7 < Class8983.method31978(this.field8341); ++n7) {
                        final long n8 = n7 * Class8983.method31980(this.field8341) + 4L * this.field8338;
                        final long n9 = 2L * n7;
                        final long n10 = 2L * Class8983.method31978(this.field8341) + 2L * n7;
                        class17.method171(n9, this.field8339.method137(n8));
                        class17.method171(n9 + 1L, this.field8339.method137(n8 + 1L));
                        class17.method171(n10, this.field8339.method137(n8 + 2L));
                        class17.method171(n10 + 1L, this.field8339.method137(n8 + 3L));
                    }
                    Class8983.method31977(this.field8341).method26079(class17, 0L, this.field8340);
                    Class8983.method31977(this.field8341).method26079(class17, 2L * Class8983.method31978(this.field8341), this.field8340);
                    for (long n11 = 0L; n11 < Class8983.method31978(this.field8341); ++n11) {
                        final long n12 = n11 * Class8983.method31980(this.field8341) + 4L * this.field8338;
                        final long n13 = 2L * n11;
                        final long n14 = 2L * Class8983.method31978(this.field8341) + 2L * n11;
                        this.field8339.method171(n12, class17.method137(n13));
                        this.field8339.method171(n12 + 1L, class17.method137(n13 + 1L));
                        this.field8339.method171(n12 + 2L, class17.method137(n14));
                        this.field8339.method171(n12 + 3L, class17.method137(n14 + 1L));
                    }
                }
            }
            else {
                for (long n15 = 8L * this.field8338; n15 < Class8983.method31980(this.field8341); n15 += 8L * this.field8337) {
                    for (long n16 = 0L; n16 < Class8983.method31978(this.field8341); ++n16) {
                        final long n17 = n16 * Class8983.method31980(this.field8341) + n15;
                        final long n18 = 2L * n16;
                        final long n19 = 2L * Class8983.method31978(this.field8341) + 2L * n16;
                        final long n20 = n19 + 2L * Class8983.method31978(this.field8341);
                        final long n21 = n20 + 2L * Class8983.method31978(this.field8341);
                        class17.method171(n18, this.field8339.method137(n17));
                        class17.method171(n18 + 1L, this.field8339.method137(n17 + 1L));
                        class17.method171(n19, this.field8339.method137(n17 + 2L));
                        class17.method171(n19 + 1L, this.field8339.method137(n17 + 3L));
                        class17.method171(n20, this.field8339.method137(n17 + 4L));
                        class17.method171(n20 + 1L, this.field8339.method137(n17 + 5L));
                        class17.method171(n21, this.field8339.method137(n17 + 6L));
                        class17.method171(n21 + 1L, this.field8339.method137(n17 + 7L));
                    }
                    Class8983.method31977(this.field8341).method26079(class17, 0L, this.field8340);
                    Class8983.method31977(this.field8341).method26079(class17, 2L * Class8983.method31978(this.field8341), this.field8340);
                    Class8983.method31977(this.field8341).method26079(class17, 4L * Class8983.method31978(this.field8341), this.field8340);
                    Class8983.method31977(this.field8341).method26079(class17, 6L * Class8983.method31978(this.field8341), this.field8340);
                    for (long n22 = 0L; n22 < Class8983.method31978(this.field8341); ++n22) {
                        final long n23 = n22 * Class8983.method31980(this.field8341) + n15;
                        final long n24 = 2L * n22;
                        final long n25 = 2L * Class8983.method31978(this.field8341) + 2L * n22;
                        final long n26 = n25 + 2L * Class8983.method31978(this.field8341);
                        final long n27 = n26 + 2L * Class8983.method31978(this.field8341);
                        this.field8339.method171(n23, class17.method137(n24));
                        this.field8339.method171(n23 + 1L, class17.method137(n24 + 1L));
                        this.field8339.method171(n23 + 2L, class17.method137(n25));
                        this.field8339.method171(n23 + 3L, class17.method137(n25 + 1L));
                        this.field8339.method171(n23 + 4L, class17.method137(n26));
                        this.field8339.method171(n23 + 5L, class17.method137(n26 + 1L));
                        this.field8339.method171(n23 + 6L, class17.method137(n27));
                        this.field8339.method171(n23 + 7L, class17.method137(n27 + 1L));
                    }
                }
            }
        }
        else if (Class8983.method31980(this.field8341) <= 4 * this.field8337) {
            if (Class8983.method31980(this.field8341) != 4 * this.field8337) {
                if (Class8983.method31980(this.field8341) == 2 * this.field8337) {
                    for (long n28 = 0L; n28 < Class8983.method31978(this.field8341); ++n28) {
                        final long n29 = n28 * Class8983.method31980(this.field8341) + 2L * this.field8338;
                        final long n30 = 2L * n28;
                        class17.method171(n30, this.field8339.method137(n29));
                        class17.method171(n30 + 1L, this.field8339.method137(n29 + 1L));
                    }
                    Class8983.method31977(this.field8341).method26075(class17, 0L);
                    for (long n31 = 0L; n31 < Class8983.method31978(this.field8341); ++n31) {
                        final long n32 = n31 * Class8983.method31980(this.field8341) + 2L * this.field8338;
                        final long n33 = 2L * n31;
                        this.field8339.method171(n32, class17.method137(n33));
                        this.field8339.method171(n32 + 1L, class17.method137(n33 + 1L));
                    }
                }
            }
            else {
                for (long n34 = 0L; n34 < Class8983.method31978(this.field8341); ++n34) {
                    final long n35 = n34 * Class8983.method31980(this.field8341) + 4L * this.field8338;
                    final long n36 = 2L * n34;
                    final long n37 = 2L * Class8983.method31978(this.field8341) + 2L * n34;
                    class17.method171(n36, this.field8339.method137(n35));
                    class17.method171(n36 + 1L, this.field8339.method137(n35 + 1L));
                    class17.method171(n37, this.field8339.method137(n35 + 2L));
                    class17.method171(n37 + 1L, this.field8339.method137(n35 + 3L));
                }
                Class8983.method31977(this.field8341).method26075(class17, 0L);
                Class8983.method31977(this.field8341).method26075(class17, 2L * Class8983.method31978(this.field8341));
                for (long n38 = 0L; n38 < Class8983.method31978(this.field8341); ++n38) {
                    final long n39 = n38 * Class8983.method31980(this.field8341) + 4L * this.field8338;
                    final long n40 = 2L * n38;
                    final long n41 = 2L * Class8983.method31978(this.field8341) + 2L * n38;
                    this.field8339.method171(n39, class17.method137(n40));
                    this.field8339.method171(n39 + 1L, class17.method137(n40 + 1L));
                    this.field8339.method171(n39 + 2L, class17.method137(n41));
                    this.field8339.method171(n39 + 3L, class17.method137(n41 + 1L));
                }
            }
        }
        else {
            for (long n42 = 8L * this.field8338; n42 < Class8983.method31980(this.field8341); n42 += 8L * this.field8337) {
                for (long n43 = 0L; n43 < Class8983.method31978(this.field8341); ++n43) {
                    final long n44 = n43 * Class8983.method31980(this.field8341) + n42;
                    final long n45 = 2L * n43;
                    final long n46 = 2L * Class8983.method31978(this.field8341) + 2L * n43;
                    final long n47 = n46 + 2L * Class8983.method31978(this.field8341);
                    final long n48 = n47 + 2L * Class8983.method31978(this.field8341);
                    class17.method171(n45, this.field8339.method137(n44));
                    class17.method171(n45 + 1L, this.field8339.method137(n44 + 1L));
                    class17.method171(n46, this.field8339.method137(n44 + 2L));
                    class17.method171(n46 + 1L, this.field8339.method137(n44 + 3L));
                    class17.method171(n47, this.field8339.method137(n44 + 4L));
                    class17.method171(n47 + 1L, this.field8339.method137(n44 + 5L));
                    class17.method171(n48, this.field8339.method137(n44 + 6L));
                    class17.method171(n48 + 1L, this.field8339.method137(n44 + 7L));
                }
                Class8983.method31977(this.field8341).method26075(class17, 0L);
                Class8983.method31977(this.field8341).method26075(class17, 2L * Class8983.method31978(this.field8341));
                Class8983.method31977(this.field8341).method26075(class17, 4L * Class8983.method31978(this.field8341));
                Class8983.method31977(this.field8341).method26075(class17, 6L * Class8983.method31978(this.field8341));
                for (long n49 = 0L; n49 < Class8983.method31978(this.field8341); ++n49) {
                    final long n50 = n49 * Class8983.method31980(this.field8341) + n42;
                    final long n51 = 2L * n49;
                    final long n52 = 2L * Class8983.method31978(this.field8341) + 2L * n49;
                    final long n53 = n52 + 2L * Class8983.method31978(this.field8341);
                    final long n54 = n53 + 2L * Class8983.method31978(this.field8341);
                    this.field8339.method171(n50, class17.method137(n51));
                    this.field8339.method171(n50 + 1L, class17.method137(n51 + 1L));
                    this.field8339.method171(n50 + 2L, class17.method137(n52));
                    this.field8339.method171(n50 + 3L, class17.method137(n52 + 1L));
                    this.field8339.method171(n50 + 4L, class17.method137(n53));
                    this.field8339.method171(n50 + 5L, class17.method137(n53 + 1L));
                    this.field8339.method171(n50 + 6L, class17.method137(n54));
                    this.field8339.method171(n50 + 7L, class17.method137(n54 + 1L));
                }
            }
        }
    }
}
