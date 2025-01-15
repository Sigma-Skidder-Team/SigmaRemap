// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8405 implements Class8404
{
    private static String[] field34455;
    public final double field34456 = 1.3333333333333333;
    public int[] field34457;
    private int field34458;
    private int[] field34459;
    private float[][][] field34460;
    private float[][][] field34461;
    private float[] field34462;
    private float[][] field34463;
    private float[][] field34464;
    private int[] field34465;
    private Class2341 field34466;
    private Class8664 field34467;
    private Class8560 field34468;
    private Class8560 field34469;
    private Class7037 field34470;
    private int field34471;
    private Class9487 field34472;
    private Class8012 field34473;
    private Class8273[] field34474;
    private Class8273[] field34475;
    private int field34476;
    private int field34477;
    private int field34478;
    private int field34479;
    private int field34480;
    private int field34481;
    private int field34482;
    private float[] field34483;
    private float[] field34484;
    private final int[] field34485;
    public int[] field34486;
    public int[] field34487;
    public int[] field34488;
    public int[] field34489;
    public int[] field34490;
    public float[] field34491;
    public float[] field34492;
    public float[] field34493;
    private int field34494;
    private static final int field34495 = 18;
    private static final int field34496 = 32;
    private static final int[][] field34497;
    public static final int[] field34498;
    private Class9590[] field34499;
    public static final float[] field34500;
    public static final float[] field34501;
    public static final float[][] field34502;
    public static final float[] field34503;
    private static int[][] field34504;
    private static final float[] field34505;
    private static final float[] field34506;
    public static final float[][] field34507;
    public Class8267 field34508;
    public static final int[][][] field34509;
    
    public Class8405(final Class2341 field34466, final Class8664 field34467, final Class8560 field34468, final Class8560 field34469, final Class7037 field34470, final int field34471) {
        this.field34458 = 0;
        this.field34483 = new float[32];
        this.field34484 = new float[32];
        this.field34485 = new int[4];
        this.field34486 = new int[] { 0 };
        this.field34487 = new int[] { 0 };
        this.field34488 = new int[] { 0 };
        this.field34489 = new int[] { 0 };
        this.field34490 = new int[576];
        this.field34491 = new float[576];
        this.field34492 = new float[18];
        this.field34493 = new float[36];
        this.field34494 = 0;
        Class7461.method22985();
        this.field34459 = new int[580];
        this.field34460 = new float[2][32][18];
        this.field34461 = new float[2][32][18];
        this.field34462 = new float[576];
        this.field34463 = new float[2][576];
        this.field34464 = new float[2][576];
        this.field34465 = new int[2];
        (this.field34474 = new Class8273[2])[0] = new Class8273();
        this.field34474[1] = new Class8273();
        this.field34475 = this.field34474;
        this.field34499 = new Class9590[9];
        final int[] array = { 0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576 };
        final int[] array2 = { 0, 4, 8, 12, 18, 24, 32, 42, 56, 74, 100, 132, 174, 192 };
        final int[] array3 = { 0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 114, 136, 162, 194, 232, 278, 330, 394, 464, 540, 576 };
        final int[] array4 = { 0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 136, 180, 192 };
        final int[] array5 = { 0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576 };
        final int[] array6 = { 0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, 174, 192 };
        final int[] array7 = { 0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 52, 62, 74, 90, 110, 134, 162, 196, 238, 288, 342, 418, 576 };
        final int[] array8 = { 0, 4, 8, 12, 16, 22, 30, 40, 52, 66, 84, 106, 136, 192 };
        final int[] array9 = { 0, 4, 8, 12, 16, 20, 24, 30, 36, 42, 50, 60, 72, 88, 106, 128, 156, 190, 230, 276, 330, 384, 576 };
        final int[] array10 = { 0, 4, 8, 12, 16, 22, 28, 38, 50, 64, 80, 100, 126, 192 };
        final int[] array11 = { 0, 4, 8, 12, 16, 20, 24, 30, 36, 44, 54, 66, 82, 102, 126, 156, 194, 240, 296, 364, 448, 550, 576 };
        final int[] array12 = { 0, 4, 8, 12, 16, 22, 30, 42, 58, 78, 104, 138, 180, 192 };
        final int[] array13 = { 0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576 };
        final int[] array14 = { 0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, 174, 192 };
        final int[] array15 = { 0, 6, 12, 18, 24, 30, 36, 44, 54, 66, 80, 96, 116, 140, 168, 200, 238, 284, 336, 396, 464, 522, 576 };
        final int[] array16 = { 0, 4, 8, 12, 18, 26, 36, 48, 62, 80, 104, 134, 174, 192 };
        final int[] array17 = { 0, 12, 24, 36, 48, 60, 72, 88, 108, 132, 160, 192, 232, 280, 336, 400, 476, 566, 568, 570, 572, 574, 576 };
        final int[] array18 = { 0, 8, 16, 24, 36, 52, 72, 96, 124, 160, 162, 164, 166, 192 };
        this.field34499[0] = new Class9590(array, array2);
        this.field34499[1] = new Class9590(array3, array4);
        this.field34499[2] = new Class9590(array5, array6);
        this.field34499[3] = new Class9590(array7, array8);
        this.field34499[4] = new Class9590(array9, array10);
        this.field34499[5] = new Class9590(array11, array12);
        this.field34499[6] = new Class9590(array13, array14);
        this.field34499[7] = new Class9590(array15, array16);
        this.field34499[8] = new Class9590(array17, array18);
        if (Class8405.field34504 == null) {
            Class8405.field34504 = new int[9][];
            for (int i = 0; i < 9; ++i) {
                Class8405.field34504[i] = method28048(this.field34499[i].field41803);
            }
        }
        this.field34508 = new Class8267(this, new int[] { 0, 6, 11, 16, 21 }, new int[] { 0, 6, 12 });
        this.field34457 = new int[54];
        this.field34466 = field34466;
        this.field34467 = field34467;
        this.field34468 = field34468;
        this.field34469 = field34469;
        this.field34470 = field34470;
        this.field34471 = field34471;
        this.field34477 = 0;
        this.field34479 = ((this.field34467.method29642() == 3) ? 1 : 2);
        this.field34476 = ((this.field34467.method29637() == 1) ? 2 : 1);
        this.field34482 = this.field34467.method29640() + ((this.field34467.method29637() == 1) ? 3 : ((this.field34467.method29637() == 2) ? 6 : 0));
        if (this.field34479 == 2) {
            switch (this.field34471) {
                case 1:
                case 3: {
                    final int n = 0;
                    this.field34481 = n;
                    this.field34480 = n;
                    break;
                }
                case 2: {
                    final int n2 = 1;
                    this.field34481 = n2;
                    this.field34480 = n2;
                    break;
                }
                default: {
                    this.field34480 = 0;
                    this.field34481 = 1;
                    break;
                }
            }
        }
        else {
            final int n3 = 0;
            this.field34481 = n3;
            this.field34480 = n3;
        }
        for (int j = 0; j < 2; ++j) {
            for (int k = 0; k < 576; ++k) {
                this.field34463[j][k] = 0.0f;
            }
        }
        this.field34465[0] = (this.field34465[1] = 576);
        this.field34472 = new Class9487();
        this.field34473 = new Class8012();
    }
    
    public void method28032() {
        this.field34477 = 0;
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 576; ++j) {
                this.field34463[i][j] = 0.0f;
            }
        }
        this.field34472 = new Class9487();
    }
    
    @Override
    public void method28031() {
        this.method28033();
    }
    
    public void method28033() {
        final int method29651 = this.field34467.method29651();
        this.method28034();
        for (int i = 0; i < method29651; ++i) {
            this.field34472.method35315(this.field34466.method9474(8));
        }
        int n = this.field34472.method35312() >>> 3;
        final int n2;
        if ((n2 = (this.field34472.method35312() & 0x7)) != 0) {
            this.field34472.method35313(8 - n2);
            ++n;
        }
        int j = this.field34477 - n - this.field34473.field32981;
        this.field34477 += method29651;
        if (j >= 0) {
            if (n > 4096) {
                this.field34477 -= 4096;
                this.field34472.method35317(4096);
            }
            while (j > 0) {
                this.field34472.method35313(8);
                --j;
            }
            for (int k = 0; k < this.field34476; ++k) {
                for (int l = 0; l < this.field34479; ++l) {
                    this.field34478 = this.field34472.method35312();
                    if (this.field34467.method29637() != 1) {
                        this.method28037(l, k);
                    }
                    else {
                        this.method28035(l, k);
                    }
                    this.method28038(l, k);
                    this.method28040(this.field34460[l], l, k);
                }
                this.method28042(k);
                if (this.field34471 == 3) {
                    if (this.field34479 > 1) {
                        this.method28045();
                    }
                }
                for (int field34480 = this.field34480; field34480 <= this.field34481; ++field34480) {
                    this.method28041(this.field34461[field34480], field34480, k);
                    this.method28043(field34480, k);
                    this.method28044(field34480, k);
                    for (int n3 = 18; n3 < 576; n3 += 36) {
                        for (int n4 = 1; n4 < 18; n4 += 2) {
                            this.field34462[n3 + n4] = -this.field34462[n3 + n4];
                        }
                    }
                    if (field34480 != 0 && this.field34471 != 2) {
                        for (int n5 = 0; n5 < 18; ++n5) {
                            int n6 = 0;
                            for (int n7 = 0; n7 < 576; n7 += 18) {
                                this.field34484[n6] = this.field34462[n7 + n5];
                                ++n6;
                            }
                            this.field34469.method28755(this.field34484);
                            this.field34469.method28775(this.field34470);
                        }
                    }
                    else {
                        for (int n8 = 0; n8 < 18; ++n8) {
                            int n9 = 0;
                            for (int n10 = 0; n10 < 576; n10 += 18) {
                                this.field34483[n9] = this.field34462[n10 + n8];
                                ++n9;
                            }
                            this.field34468.method28755(this.field34483);
                            this.field34468.method28775(this.field34470);
                        }
                    }
                }
            }
            ++this.field34494;
            this.field34470.method21525(1);
        }
    }
    
    private boolean method28034() {
        if (this.field34467.method29637() != 1) {
            this.field34473.field32981 = this.field34466.method9474(8);
            if (this.field34479 != 1) {
                this.field34473.field32982 = this.field34466.method9474(2);
            }
            else {
                this.field34473.field32982 = this.field34466.method9474(1);
            }
            for (int i = 0; i < this.field34479; ++i) {
                this.field34473.field32983[i].field34145[0].field34127 = this.field34466.method9474(12);
                this.field34473.field32983[i].field34145[0].field34128 = this.field34466.method9474(9);
                this.field34473.field32983[i].field34145[0].field34129 = this.field34466.method9474(8);
                this.field34473.field32983[i].field34145[0].field34130 = this.field34466.method9474(9);
                this.field34473.field32983[i].field34145[0].field34131 = this.field34466.method9474(1);
                if (this.field34473.field32983[i].field34145[0].field34131 == 0) {
                    this.field34473.field32983[i].field34145[0].field34134[0] = this.field34466.method9474(5);
                    this.field34473.field32983[i].field34145[0].field34134[1] = this.field34466.method9474(5);
                    this.field34473.field32983[i].field34145[0].field34134[2] = this.field34466.method9474(5);
                    this.field34473.field32983[i].field34145[0].field34136 = this.field34466.method9474(4);
                    this.field34473.field32983[i].field34145[0].field34137 = this.field34466.method9474(3);
                    this.field34473.field32983[i].field34145[0].field34132 = 0;
                }
                else {
                    this.field34473.field32983[i].field34145[0].field34132 = this.field34466.method9474(2);
                    this.field34473.field32983[i].field34145[0].field34133 = this.field34466.method9474(1);
                    this.field34473.field32983[i].field34145[0].field34134[0] = this.field34466.method9474(5);
                    this.field34473.field32983[i].field34145[0].field34134[1] = this.field34466.method9474(5);
                    this.field34473.field32983[i].field34145[0].field34135[0] = this.field34466.method9474(3);
                    this.field34473.field32983[i].field34145[0].field34135[1] = this.field34466.method9474(3);
                    this.field34473.field32983[i].field34145[0].field34135[2] = this.field34466.method9474(3);
                    if (this.field34473.field32983[i].field34145[0].field34132 == 0) {
                        return false;
                    }
                    if (this.field34473.field32983[i].field34145[0].field34132 == 2 && this.field34473.field32983[i].field34145[0].field34133 == 0) {
                        this.field34473.field32983[i].field34145[0].field34136 = 8;
                    }
                    else {
                        this.field34473.field32983[i].field34145[0].field34136 = 7;
                        this.field34473.field32983[i].field34145[0].field34137 = 20 - this.field34473.field32983[i].field34145[0].field34136;
                    }
                }
                this.field34473.field32983[i].field34145[0].field34139 = this.field34466.method9474(1);
                this.field34473.field32983[i].field34145[0].field34140 = this.field34466.method9474(1);
            }
        }
        else {
            this.field34473.field32981 = this.field34466.method9474(9);
            if (this.field34479 != 1) {
                this.field34473.field32982 = this.field34466.method9474(3);
            }
            else {
                this.field34473.field32982 = this.field34466.method9474(5);
            }
            for (int j = 0; j < this.field34479; ++j) {
                this.field34473.field32983[j].field34144[0] = this.field34466.method9474(1);
                this.field34473.field32983[j].field34144[1] = this.field34466.method9474(1);
                this.field34473.field32983[j].field34144[2] = this.field34466.method9474(1);
                this.field34473.field32983[j].field34144[3] = this.field34466.method9474(1);
            }
            for (int k = 0; k < 2; ++k) {
                for (int l = 0; l < this.field34479; ++l) {
                    this.field34473.field32983[l].field34145[k].field34127 = this.field34466.method9474(12);
                    this.field34473.field32983[l].field34145[k].field34128 = this.field34466.method9474(9);
                    this.field34473.field32983[l].field34145[k].field34129 = this.field34466.method9474(8);
                    this.field34473.field32983[l].field34145[k].field34130 = this.field34466.method9474(4);
                    this.field34473.field32983[l].field34145[k].field34131 = this.field34466.method9474(1);
                    if (this.field34473.field32983[l].field34145[k].field34131 == 0) {
                        this.field34473.field32983[l].field34145[k].field34134[0] = this.field34466.method9474(5);
                        this.field34473.field32983[l].field34145[k].field34134[1] = this.field34466.method9474(5);
                        this.field34473.field32983[l].field34145[k].field34134[2] = this.field34466.method9474(5);
                        this.field34473.field32983[l].field34145[k].field34136 = this.field34466.method9474(4);
                        this.field34473.field32983[l].field34145[k].field34137 = this.field34466.method9474(3);
                        this.field34473.field32983[l].field34145[k].field34132 = 0;
                    }
                    else {
                        this.field34473.field32983[l].field34145[k].field34132 = this.field34466.method9474(2);
                        this.field34473.field32983[l].field34145[k].field34133 = this.field34466.method9474(1);
                        this.field34473.field32983[l].field34145[k].field34134[0] = this.field34466.method9474(5);
                        this.field34473.field32983[l].field34145[k].field34134[1] = this.field34466.method9474(5);
                        this.field34473.field32983[l].field34145[k].field34135[0] = this.field34466.method9474(3);
                        this.field34473.field32983[l].field34145[k].field34135[1] = this.field34466.method9474(3);
                        this.field34473.field32983[l].field34145[k].field34135[2] = this.field34466.method9474(3);
                        if (this.field34473.field32983[l].field34145[k].field34132 == 0) {
                            return false;
                        }
                        if (this.field34473.field32983[l].field34145[k].field34132 == 2 && this.field34473.field32983[l].field34145[k].field34133 == 0) {
                            this.field34473.field32983[l].field34145[k].field34136 = 8;
                        }
                        else {
                            this.field34473.field32983[l].field34145[k].field34136 = 7;
                        }
                        this.field34473.field32983[l].field34145[k].field34137 = 20 - this.field34473.field32983[l].field34145[k].field34136;
                    }
                    this.field34473.field32983[l].field34145[k].field34138 = this.field34466.method9474(1);
                    this.field34473.field32983[l].field34145[k].field34139 = this.field34466.method9474(1);
                    this.field34473.field32983[l].field34145[k].field34140 = this.field34466.method9474(1);
                }
            }
        }
        return true;
    }
    
    private void method28035(final int n, final int n2) {
        final Class8307 class8307 = this.field34473.field32983[n].field34145[n2];
        final int field34130 = class8307.field34130;
        final int n3 = Class8405.field34497[0][field34130];
        final int n4 = Class8405.field34497[1][field34130];
        if (class8307.field34131 != 0 && class8307.field34132 == 2) {
            if (class8307.field34133 == 0) {
                this.field34475[n].field33968[0][0] = this.field34472.method35313(n3);
                this.field34475[n].field33968[1][0] = this.field34472.method35313(n3);
                this.field34475[n].field33968[2][0] = this.field34472.method35313(n3);
                this.field34475[n].field33968[0][1] = this.field34472.method35313(n3);
                this.field34475[n].field33968[1][1] = this.field34472.method35313(n3);
                this.field34475[n].field33968[2][1] = this.field34472.method35313(n3);
                this.field34475[n].field33968[0][2] = this.field34472.method35313(n3);
                this.field34475[n].field33968[1][2] = this.field34472.method35313(n3);
                this.field34475[n].field33968[2][2] = this.field34472.method35313(n3);
                this.field34475[n].field33968[0][3] = this.field34472.method35313(n3);
                this.field34475[n].field33968[1][3] = this.field34472.method35313(n3);
                this.field34475[n].field33968[2][3] = this.field34472.method35313(n3);
                this.field34475[n].field33968[0][4] = this.field34472.method35313(n3);
                this.field34475[n].field33968[1][4] = this.field34472.method35313(n3);
                this.field34475[n].field33968[2][4] = this.field34472.method35313(n3);
                this.field34475[n].field33968[0][5] = this.field34472.method35313(n3);
                this.field34475[n].field33968[1][5] = this.field34472.method35313(n3);
                this.field34475[n].field33968[2][5] = this.field34472.method35313(n3);
                this.field34475[n].field33968[0][6] = this.field34472.method35313(n4);
                this.field34475[n].field33968[1][6] = this.field34472.method35313(n4);
                this.field34475[n].field33968[2][6] = this.field34472.method35313(n4);
                this.field34475[n].field33968[0][7] = this.field34472.method35313(n4);
                this.field34475[n].field33968[1][7] = this.field34472.method35313(n4);
                this.field34475[n].field33968[2][7] = this.field34472.method35313(n4);
                this.field34475[n].field33968[0][8] = this.field34472.method35313(n4);
                this.field34475[n].field33968[1][8] = this.field34472.method35313(n4);
                this.field34475[n].field33968[2][8] = this.field34472.method35313(n4);
                this.field34475[n].field33968[0][9] = this.field34472.method35313(n4);
                this.field34475[n].field33968[1][9] = this.field34472.method35313(n4);
                this.field34475[n].field33968[2][9] = this.field34472.method35313(n4);
                this.field34475[n].field33968[0][10] = this.field34472.method35313(n4);
                this.field34475[n].field33968[1][10] = this.field34472.method35313(n4);
                this.field34475[n].field33968[2][10] = this.field34472.method35313(n4);
                this.field34475[n].field33968[0][11] = this.field34472.method35313(n4);
                this.field34475[n].field33968[1][11] = this.field34472.method35313(n4);
                this.field34475[n].field33968[2][11] = this.field34472.method35313(n4);
                this.field34475[n].field33968[0][12] = 0;
                this.field34475[n].field33968[1][12] = 0;
                this.field34475[n].field33968[2][12] = 0;
            }
            else {
                for (int i = 0; i < 8; ++i) {
                    this.field34475[n].field33967[i] = this.field34472.method35313(Class8405.field34497[0][class8307.field34130]);
                }
                for (int j = 3; j < 6; ++j) {
                    for (int k = 0; k < 3; ++k) {
                        this.field34475[n].field33968[k][j] = this.field34472.method35313(Class8405.field34497[0][class8307.field34130]);
                    }
                }
                for (int l = 6; l < 12; ++l) {
                    for (int n5 = 0; n5 < 3; ++n5) {
                        this.field34475[n].field33968[n5][l] = this.field34472.method35313(Class8405.field34497[1][class8307.field34130]);
                    }
                }
                final int n6 = 12;
                for (int n7 = 0; n7 < 3; ++n7) {
                    this.field34475[n].field33968[n7][n6] = 0;
                }
            }
        }
        else {
            if (this.field34473.field32983[n].field34144[0] == 0 || n2 == 0) {
                this.field34475[n].field33967[0] = this.field34472.method35313(n3);
                this.field34475[n].field33967[1] = this.field34472.method35313(n3);
                this.field34475[n].field33967[2] = this.field34472.method35313(n3);
                this.field34475[n].field33967[3] = this.field34472.method35313(n3);
                this.field34475[n].field33967[4] = this.field34472.method35313(n3);
                this.field34475[n].field33967[5] = this.field34472.method35313(n3);
            }
            if (this.field34473.field32983[n].field34144[1] == 0 || n2 == 0) {
                this.field34475[n].field33967[6] = this.field34472.method35313(n3);
                this.field34475[n].field33967[7] = this.field34472.method35313(n3);
                this.field34475[n].field33967[8] = this.field34472.method35313(n3);
                this.field34475[n].field33967[9] = this.field34472.method35313(n3);
                this.field34475[n].field33967[10] = this.field34472.method35313(n3);
            }
            if (this.field34473.field32983[n].field34144[2] == 0 || n2 == 0) {
                this.field34475[n].field33967[11] = this.field34472.method35313(n4);
                this.field34475[n].field33967[12] = this.field34472.method35313(n4);
                this.field34475[n].field33967[13] = this.field34472.method35313(n4);
                this.field34475[n].field33967[14] = this.field34472.method35313(n4);
                this.field34475[n].field33967[15] = this.field34472.method35313(n4);
            }
            if (this.field34473.field32983[n].field34144[3] == 0 || n2 == 0) {
                this.field34475[n].field33967[16] = this.field34472.method35313(n4);
                this.field34475[n].field33967[17] = this.field34472.method35313(n4);
                this.field34475[n].field33967[18] = this.field34472.method35313(n4);
                this.field34475[n].field33967[19] = this.field34472.method35313(n4);
                this.field34475[n].field33967[20] = this.field34472.method35313(n4);
            }
            this.field34475[n].field33967[21] = 0;
            this.field34475[n].field33967[22] = 0;
        }
    }
    
    private void method28036(final int n, final int n2) {
        final int method29652 = this.field34467.method29652();
        int n3 = 0;
        final Class8307 class8307 = this.field34473.field32983[n].field34145[n2];
        final int field34130 = class8307.field34130;
        int n4;
        if (class8307.field34132 != 2) {
            n4 = 0;
        }
        else if (class8307.field34133 != 0) {
            if (class8307.field34133 != 1) {
                n4 = 0;
            }
            else {
                n4 = 2;
            }
        }
        else {
            n4 = 1;
        }
        if ((method29652 != 1 && method29652 != 3) || n != 1) {
            if (field34130 >= 400) {
                if (field34130 >= 500) {
                    if (field34130 < 512) {
                        this.field34485[0] = (field34130 - 500) / 3;
                        this.field34485[1] = (field34130 - 500) % 3;
                        this.field34485[2] = 0;
                        this.field34485[3] = 0;
                        this.field34473.field32983[n].field34145[n2].field34138 = 1;
                        n3 = 2;
                    }
                }
                else {
                    this.field34485[0] = (field34130 - 400 >>> 2) / 5;
                    this.field34485[1] = (field34130 - 400 >>> 2) % 5;
                    this.field34485[2] = (field34130 - 400 & 0x3);
                    this.field34485[3] = 0;
                    this.field34473.field32983[n].field34145[n2].field34138 = 0;
                    n3 = 1;
                }
            }
            else {
                this.field34485[0] = (field34130 >>> 4) / 5;
                this.field34485[1] = (field34130 >>> 4) % 5;
                this.field34485[2] = (field34130 & 0xF) >>> 2;
                this.field34485[3] = (field34130 & 0x3);
                this.field34473.field32983[n].field34145[n2].field34138 = 0;
                n3 = 0;
            }
        }
        if (method29652 == 1 || method29652 == 3) {
            if (n == 1) {
                final int n5 = field34130 >>> 1;
                if (n5 >= 180) {
                    if (n5 >= 244) {
                        if (n5 < 255) {
                            this.field34485[0] = (n5 - 244) / 3;
                            this.field34485[1] = (n5 - 244) % 3;
                            this.field34485[2] = 0;
                            this.field34485[3] = 0;
                            this.field34473.field32983[n].field34145[n2].field34138 = 0;
                            n3 = 5;
                        }
                    }
                    else {
                        this.field34485[0] = (n5 - 180 & 0x3F) >>> 4;
                        this.field34485[1] = (n5 - 180 & 0xF) >>> 2;
                        this.field34485[2] = (n5 - 180 & 0x3);
                        this.field34485[3] = 0;
                        this.field34473.field32983[n].field34145[n2].field34138 = 0;
                        n3 = 4;
                    }
                }
                else {
                    this.field34485[0] = n5 / 36;
                    this.field34485[1] = n5 % 36 / 6;
                    this.field34485[2] = n5 % 36 % 6;
                    this.field34485[3] = 0;
                    this.field34473.field32983[n].field34145[n2].field34138 = 0;
                    n3 = 3;
                }
            }
        }
        for (int i = 0; i < 45; ++i) {
            this.field34457[i] = 0;
        }
        int n6 = 0;
        for (int j = 0; j < 4; ++j) {
            for (int k = 0; k < Class8405.field34509[n3][n4][j]; ++k) {
                this.field34457[n6] = ((this.field34485[j] != 0) ? this.field34472.method35313(this.field34485[j]) : 0);
                ++n6;
            }
        }
    }
    
    private void method28037(final int n, final int n2) {
        int n3 = 0;
        final Class8307 class8307 = this.field34473.field32983[n].field34145[n2];
        this.method28036(n, n2);
        if (class8307.field34131 != 0 && class8307.field34132 == 2) {
            if (class8307.field34133 == 0) {
                for (int i = 0; i < 12; ++i) {
                    for (int j = 0; j < 3; ++j) {
                        this.field34475[n].field33968[j][i] = this.field34457[n3];
                        ++n3;
                    }
                }
                for (int k = 0; k < 3; ++k) {
                    this.field34475[n].field33968[k][12] = 0;
                }
            }
            else {
                for (int l = 0; l < 8; ++l) {
                    this.field34475[n].field33967[l] = this.field34457[n3];
                    ++n3;
                }
                for (int n4 = 3; n4 < 12; ++n4) {
                    for (int n5 = 0; n5 < 3; ++n5) {
                        this.field34475[n].field33968[n5][n4] = this.field34457[n3];
                        ++n3;
                    }
                }
                for (int n6 = 0; n6 < 3; ++n6) {
                    this.field34475[n].field33968[n6][12] = 0;
                }
            }
        }
        else {
            for (int n7 = 0; n7 < 21; ++n7) {
                this.field34475[n].field33967[n7] = this.field34457[n3];
                ++n3;
            }
            this.field34475[n].field33967[21] = 0;
            this.field34475[n].field33967[22] = 0;
        }
    }
    
    private void method28038(final int n, final int n2) {
        this.field34486[0] = 0;
        this.field34487[0] = 0;
        this.field34488[0] = 0;
        this.field34489[0] = 0;
        final int n3 = this.field34478 + this.field34473.field32983[n].field34145[n2].field34127;
        int n4;
        int n5;
        if (this.field34473.field32983[n].field34145[n2].field34131 != 0 && this.field34473.field32983[n].field34145[n2].field34132 == 2) {
            n4 = ((this.field34482 != 8) ? 36 : 72);
            n5 = 576;
        }
        else {
            final int n6 = this.field34473.field32983[n].field34145[n2].field34136 + 1;
            int n7 = n6 + this.field34473.field32983[n].field34145[n2].field34137 + 1;
            if (n7 > this.field34499[this.field34482].field41802.length - 1) {
                n7 = this.field34499[this.field34482].field41802.length - 1;
            }
            n4 = this.field34499[this.field34482].field41802[n6];
            n5 = this.field34499[this.field34482].field41802[n7];
        }
        int i = 0;
        for (int j = 0; j < this.field34473.field32983[n].field34145[n2].field34128 << 1; j += 2) {
            Class7461 class7461;
            if (j >= n4) {
                if (j >= n5) {
                    class7461 = Class7461.field28812[this.field34473.field32983[n].field34145[n2].field34134[2]];
                }
                else {
                    class7461 = Class7461.field28812[this.field34473.field32983[n].field34145[n2].field34134[1]];
                }
            }
            else {
                class7461 = Class7461.field28812[this.field34473.field32983[n].field34145[n2].field34134[0]];
            }
            Class7461.method22984(class7461, this.field34486, this.field34487, this.field34488, this.field34489, this.field34472);
            this.field34459[i++] = this.field34486[0];
            this.field34459[i++] = this.field34487[0];
            this.field34458 = this.field34458 + this.field34486[0] + this.field34487[0];
        }
        final Class7461 class7462 = Class7461.field28812[this.field34473.field32983[n].field34145[n2].field34140 + 32];
        int n8;
        for (n8 = this.field34472.method35312(); n8 < n3 && i < 576; this.field34459[i++] = this.field34488[0], this.field34459[i++] = this.field34489[0], this.field34459[i++] = this.field34486[0], this.field34459[i++] = this.field34487[0], this.field34458 = this.field34458 + this.field34488[0] + this.field34489[0] + this.field34486[0] + this.field34487[0], n8 = this.field34472.method35312()) {
            Class7461.method22984(class7462, this.field34486, this.field34487, this.field34488, this.field34489, this.field34472);
        }
        if (n8 > n3) {
            this.field34472.method35316(n8 - n3);
            i -= 4;
        }
        final int method35312 = this.field34472.method35312();
        if (method35312 < n3) {
            this.field34472.method35313(n3 - method35312);
        }
        if (i >= 576) {
            this.field34465[n] = 576;
        }
        else {
            this.field34465[n] = i;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < 576) {
            this.field34459[i] = 0;
            ++i;
        }
    }
    
    private void method28039(final int n, final int n2, final int n3) {
        if (n != 0) {
            if ((n & 0x1) == 0x0) {
                this.field34464[0][n3] = 1.0f;
                this.field34464[1][n3] = Class8405.field34502[n2][n >>> 1];
            }
            else {
                this.field34464[0][n3] = Class8405.field34502[n2][n + 1 >>> 1];
                this.field34464[1][n3] = 1.0f;
            }
        }
        else {
            this.field34464[0][n3] = 1.0f;
            this.field34464[1][n3] = 1.0f;
        }
    }
    
    private void method28040(final float[][] array, final int n, final int n2) {
        final Class8307 class8307 = this.field34473.field32983[n].field34145[n2];
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7;
        if (class8307.field34131 != 0 && class8307.field34132 == 2) {
            if (class8307.field34133 == 0) {
                n5 = this.field34499[this.field34482].field41803[1];
                n7 = (n5 << 2) - n5;
                n4 = 0;
            }
            else {
                n7 = this.field34499[this.field34482].field41802[1];
            }
        }
        else {
            n7 = this.field34499[this.field34482].field41802[1];
        }
        final float n8 = (float)Math.pow(2.0, 0.25 * (class8307.field34129 - 210.0));
        for (int i = 0; i < this.field34465[n]; ++i) {
            final int n9 = i % 18;
            final int n10 = (i - n9) / 18;
            if (this.field34459[i] != 0) {
                final int n11 = this.field34459[i];
                if (n11 >= Class8405.field34501.length) {
                    if (this.field34459[i] <= 0) {
                        array[n10][n9] = -n8 * (float)Math.pow(-n11, 1.3333333333333333);
                    }
                    else {
                        array[n10][n9] = n8 * (float)Math.pow(n11, 1.3333333333333333);
                    }
                }
                else if (this.field34459[i] <= 0) {
                    if (-n11 >= Class8405.field34501.length) {
                        array[n10][n9] = -n8 * (float)Math.pow(-n11, 1.3333333333333333);
                    }
                    else {
                        array[n10][n9] = -n8 * Class8405.field34501[-n11];
                    }
                }
                else {
                    array[n10][n9] = n8 * Class8405.field34501[n11];
                }
            }
            else {
                array[n10][n9] = 0.0f;
            }
        }
        for (int j = 0; j < this.field34465[n]; ++j) {
            final int n12 = j % 18;
            final int n13 = (j - n12) / 18;
            if (n6 == n7) {
                if (class8307.field34131 != 0 && class8307.field34132 == 2) {
                    if (class8307.field34133 == 0) {
                        final int n14 = this.field34499[this.field34482].field41803[++n3 + 1];
                        n7 = (n14 << 2) - n14;
                        final int n15 = this.field34499[this.field34482].field41803[n3];
                        n5 = this.field34499[this.field34482].field41803[n3 + 1] - n15;
                        n4 = (n15 << 2) - n15;
                    }
                    else if (n6 != this.field34499[this.field34482].field41802[8]) {
                        if (n6 >= this.field34499[this.field34482].field41802[8]) {
                            final int n16 = this.field34499[this.field34482].field41803[++n3 + 1];
                            n7 = (n16 << 2) - n16;
                            final int n17 = this.field34499[this.field34482].field41803[n3];
                            n5 = this.field34499[this.field34482].field41803[n3 + 1] - n17;
                            n4 = (n17 << 2) - n17;
                        }
                        else {
                            n7 = this.field34499[this.field34482].field41802[++n3 + 1];
                        }
                    }
                    else {
                        final int n18 = this.field34499[this.field34482].field41803[4];
                        n7 = (n18 << 2) - n18;
                        n3 = 3;
                        n5 = this.field34499[this.field34482].field41803[4] - this.field34499[this.field34482].field41803[3];
                        final int n19 = this.field34499[this.field34482].field41803[3];
                        n4 = (n19 << 2) - n19;
                    }
                }
                else {
                    n7 = this.field34499[this.field34482].field41802[++n3 + 1];
                }
            }
            Label_1014: {
                Label_0441: {
                    if (class8307.field34131 != 0) {
                        if (class8307.field34132 != 2 || class8307.field34133 != 0) {
                            if (class8307.field34132 != 2) {
                                break Label_0441;
                            }
                            if (class8307.field34133 == 0) {
                                break Label_0441;
                            }
                            if (j < 36) {
                                break Label_0441;
                            }
                        }
                        final int n20 = (n6 - n4) / n5;
                        final int n21 = (this.field34475[n].field33968[n20][n3] << class8307.field34139) + (class8307.field34135[n20] << 2);
                        final float[] array2 = array[n13];
                        final int n22 = n12;
                        array2[n22] *= Class8405.field34500[n21];
                        break Label_1014;
                    }
                }
                int n23 = this.field34475[n].field33967[n3];
                if (class8307.field34138 != 0) {
                    n23 += Class8405.field34498[n3];
                }
                final int n24 = n23 << class8307.field34139;
                final float[] array3 = array[n13];
                final int n25 = n12;
                array3[n25] *= Class8405.field34500[n24];
            }
            ++n6;
        }
        for (int k = this.field34465[n]; k < 576; ++k) {
            int n26 = k % 18;
            int n27 = (k - n26) / 18;
            if (n26 < 0) {
                n26 = 0;
            }
            if (n27 < 0) {
                n27 = 0;
            }
            array[n27][n26] = 0.0f;
        }
    }
    
    private void method28041(final float[][] array, final int n, final int n2) {
        final Class8307 class8307 = this.field34473.field32983[n].field34145[n2];
        if (class8307.field34131 != 0 && class8307.field34132 == 2) {
            for (int i = 0; i < 576; ++i) {
                this.field34462[i] = 0.0f;
            }
            if (class8307.field34133 == 0) {
                for (int j = 0; j < 576; ++j) {
                    final int n3 = Class8405.field34504[this.field34482][j];
                    final int n4 = n3 % 18;
                    this.field34462[j] = array[(n3 - n4) / 18][n4];
                }
            }
            else {
                for (int k = 0; k < 36; ++k) {
                    final int n5 = k % 18;
                    this.field34462[k] = array[(k - n5) / 18][n5];
                }
                for (int l = 3; l < 13; ++l) {
                    final int n6 = this.field34499[this.field34482].field41803[l];
                    final int n7 = this.field34499[this.field34482].field41803[l + 1] - n6;
                    final int n8 = (n6 << 2) - n6;
                    for (int n9 = 0, n10 = 0; n9 < n7; ++n9, n10 += 3) {
                        final int n11 = n8 + n9;
                        int n12 = n8 + n10;
                        final int n13 = n11 % 18;
                        this.field34462[n12] = array[(n11 - n13) / 18][n13];
                        final int n14 = n11 + n7;
                        ++n12;
                        final int n15 = n14 % 18;
                        this.field34462[n12] = array[(n14 - n15) / 18][n15];
                        final int n16 = n14 + n7;
                        ++n12;
                        final int n17 = n16 % 18;
                        this.field34462[n12] = array[(n16 - n17) / 18][n17];
                    }
                }
            }
        }
        else {
            for (int n18 = 0; n18 < 576; ++n18) {
                final int n19 = n18 % 18;
                this.field34462[n18] = array[(n18 - n19) / 18][n19];
            }
        }
    }
    
    private void method28042(final int n) {
        if (this.field34479 != 1) {
            final Class8307 class8307 = this.field34473.field32983[0].field34145[n];
            final int method29652 = this.field34467.method29652();
            final boolean b = this.field34467.method29642() == 1 && (method29652 & 0x2) != 0x0;
            final boolean b2 = this.field34467.method29642() == 1 && (method29652 & 0x1) != 0x0;
            final boolean b3 = this.field34467.method29637() == 0 || this.field34467.method29637() == 2;
            final int n2 = class8307.field34130 & 0x1;
            for (int i = 0; i < 576; ++i) {
                this.field34490[i] = 7;
                this.field34491[i] = 0.0f;
            }
            if (b2) {
                if (class8307.field34131 != 0 && class8307.field34132 == 2) {
                    if (class8307.field34133 == 0) {
                        for (int j = 0; j < 3; ++j) {
                            int n3 = -1;
                            for (int k = 12; k >= 0; --k) {
                                final int n4 = this.field34499[this.field34482].field41803[k];
                                for (int l = this.field34499[this.field34482].field41803[k + 1] - n4, n5 = (n4 << 2) - n4 + (j + 1) * l - 1; l > 0; --l, --n5) {
                                    if (this.field34460[1][n5 / 18][n5 % 18] != 0.0f) {
                                        n3 = k;
                                        k = -10;
                                        l = -10;
                                    }
                                }
                            }
                            for (int n6 = n3 + 1; n6 < 12; ++n6) {
                                final int n7 = this.field34499[this.field34482].field41803[n6];
                                int n8 = this.field34499[this.field34482].field41803[n6 + 1] - n7;
                                int n9 = (n7 << 2) - n7 + j * n8;
                                while (n8 > 0) {
                                    this.field34490[n9] = this.field34475[1].field33968[j][n6];
                                    if (this.field34490[n9] != 7) {
                                        if (!b3) {
                                            this.field34491[n9] = Class8405.field34503[this.field34490[n9]];
                                        }
                                        else {
                                            this.method28039(this.field34490[n9], n2, n9);
                                        }
                                    }
                                    ++n9;
                                    --n8;
                                }
                            }
                            final int n10 = this.field34499[this.field34482].field41803[10];
                            final int n11 = this.field34499[this.field34482].field41803[11];
                            final int n12 = (n10 << 2) - n10 + j * (n11 - n10);
                            int n13 = this.field34499[this.field34482].field41803[12] - n11;
                            int n14 = (n11 << 2) - n11 + j * n13;
                            while (n13 > 0) {
                                this.field34490[n14] = this.field34490[n12];
                                if (!b3) {
                                    this.field34491[n14] = this.field34491[n12];
                                }
                                else {
                                    this.field34464[0][n14] = this.field34464[0][n12];
                                    this.field34464[1][n14] = this.field34464[1][n12];
                                }
                                ++n14;
                                --n13;
                            }
                        }
                    }
                    else {
                        int n15 = 0;
                        for (int n16 = 0; n16 < 3; ++n16) {
                            int n17 = 2;
                            for (int n18 = 12; n18 >= 3; --n18) {
                                final int n19 = this.field34499[this.field34482].field41803[n18];
                                for (int n20 = this.field34499[this.field34482].field41803[n18 + 1] - n19, n21 = (n19 << 2) - n19 + (n16 + 1) * n20 - 1; n20 > 0; --n20, --n21) {
                                    if (this.field34460[1][n21 / 18][n21 % 18] != 0.0f) {
                                        n17 = n18;
                                        n18 = -10;
                                        n20 = -10;
                                    }
                                }
                            }
                            int n22 = n17 + 1;
                            if (n22 > n15) {
                                n15 = n22;
                            }
                            while (n22 < 12) {
                                final int n23 = this.field34499[this.field34482].field41803[n22];
                                int n24 = this.field34499[this.field34482].field41803[n22 + 1] - n23;
                                int n25 = (n23 << 2) - n23 + n16 * n24;
                                while (n24 > 0) {
                                    this.field34490[n25] = this.field34475[1].field33968[n16][n22];
                                    if (this.field34490[n25] != 7) {
                                        if (!b3) {
                                            this.field34491[n25] = Class8405.field34503[this.field34490[n25]];
                                        }
                                        else {
                                            this.method28039(this.field34490[n25], n2, n25);
                                        }
                                    }
                                    ++n25;
                                    --n24;
                                }
                                ++n22;
                            }
                            final int n26 = this.field34499[this.field34482].field41803[10];
                            final int n27 = (n26 << 2) - n26 + n16 * (this.field34499[this.field34482].field41803[11] - n26);
                            final int n28 = this.field34499[this.field34482].field41803[11];
                            int n29 = this.field34499[this.field34482].field41803[12] - n28;
                            int n30 = (n28 << 2) - n28 + n16 * n29;
                            while (n29 > 0) {
                                this.field34490[n30] = this.field34490[n27];
                                if (!b3) {
                                    this.field34491[n30] = this.field34491[n27];
                                }
                                else {
                                    this.field34464[0][n30] = this.field34464[0][n27];
                                    this.field34464[1][n30] = this.field34464[1][n27];
                                }
                                ++n30;
                                --n29;
                            }
                        }
                        if (n15 <= 3) {
                            int n31 = 2;
                            int n32 = 17;
                            int n33 = -1;
                            while (n31 >= 0) {
                                if (this.field34460[1][n31][n32] == 0.0f) {
                                    if (--n32 >= 0) {
                                        continue;
                                    }
                                    --n31;
                                    n32 = 17;
                                }
                                else {
                                    n33 = (n31 << 4) + (n31 << 1) + n32;
                                    n31 = -1;
                                }
                            }
                            int n34;
                            for (n34 = 0; this.field34499[this.field34482].field41802[n34] <= n33; ++n34) {}
                            int n35 = n34;
                            int n36 = this.field34499[this.field34482].field41802[n34];
                            while (n35 < 8) {
                                for (int n37 = this.field34499[this.field34482].field41802[n35 + 1] - this.field34499[this.field34482].field41802[n35]; n37 > 0; --n37) {
                                    this.field34490[n36] = this.field34475[1].field33967[n35];
                                    if (this.field34490[n36] != 7) {
                                        if (!b3) {
                                            this.field34491[n36] = Class8405.field34503[this.field34490[n36]];
                                        }
                                        else {
                                            this.method28039(this.field34490[n36], n2, n36);
                                        }
                                    }
                                    ++n36;
                                }
                                ++n35;
                            }
                        }
                    }
                }
                else {
                    int n38 = 31;
                    int n39 = 17;
                    int n40 = 0;
                    while (n38 >= 0) {
                        if (this.field34460[1][n38][n39] == 0.0f) {
                            if (--n39 >= 0) {
                                continue;
                            }
                            --n38;
                            n39 = 17;
                        }
                        else {
                            n40 = (n38 << 4) + (n38 << 1) + n39;
                            n38 = -1;
                        }
                    }
                    int n41;
                    for (n41 = 0; this.field34499[this.field34482].field41802[n41] <= n40; ++n41) {}
                    int n42 = n41;
                    int n43 = this.field34499[this.field34482].field41802[n41];
                    while (n42 < 21) {
                        for (int n44 = this.field34499[this.field34482].field41802[n42 + 1] - this.field34499[this.field34482].field41802[n42]; n44 > 0; --n44) {
                            this.field34490[n43] = this.field34475[1].field33967[n42];
                            if (this.field34490[n43] != 7) {
                                if (!b3) {
                                    this.field34491[n43] = Class8405.field34503[this.field34490[n43]];
                                }
                                else {
                                    this.method28039(this.field34490[n43], n2, n43);
                                }
                            }
                            ++n43;
                        }
                        ++n42;
                    }
                    final int n45 = this.field34499[this.field34482].field41802[20];
                    for (int n46 = 576 - this.field34499[this.field34482].field41802[21]; n46 > 0; --n46) {
                        if (n43 >= 576) {
                            break;
                        }
                        this.field34490[n43] = this.field34490[n45];
                        if (!b3) {
                            this.field34491[n43] = this.field34491[n45];
                        }
                        else {
                            this.field34464[0][n43] = this.field34464[0][n45];
                            this.field34464[1][n43] = this.field34464[1][n45];
                        }
                        ++n43;
                    }
                }
            }
            int n47 = 0;
            for (int n48 = 0; n48 < 32; ++n48) {
                for (int n49 = 0; n49 < 18; ++n49) {
                    if (this.field34490[n47] != 7) {
                        if (b2) {
                            if (!b3) {
                                this.field34461[1][n48][n49] = this.field34460[0][n48][n49] / (1.0f + this.field34491[n47]);
                                this.field34461[0][n48][n49] = this.field34461[1][n48][n49] * this.field34491[n47];
                            }
                            else {
                                this.field34461[0][n48][n49] = this.field34460[0][n48][n49] * this.field34464[0][n47];
                                this.field34461[1][n48][n49] = this.field34460[0][n48][n49] * this.field34464[1][n47];
                            }
                        }
                    }
                    else if (!b) {
                        this.field34461[0][n48][n49] = this.field34460[0][n48][n49];
                        this.field34461[1][n48][n49] = this.field34460[1][n48][n49];
                    }
                    else {
                        this.field34461[0][n48][n49] = (this.field34460[0][n48][n49] + this.field34460[1][n48][n49]) * 0.70710677f;
                        this.field34461[1][n48][n49] = (this.field34460[0][n48][n49] - this.field34460[1][n48][n49]) * 0.70710677f;
                    }
                    ++n47;
                }
            }
        }
        else {
            for (int n50 = 0; n50 < 32; ++n50) {
                for (int n51 = 0; n51 < 18; n51 += 3) {
                    this.field34461[0][n50][n51] = this.field34460[0][n50][n51];
                    this.field34461[0][n50][n51 + 1] = this.field34460[0][n50][n51 + 1];
                    this.field34461[0][n50][n51 + 2] = this.field34460[0][n50][n51 + 2];
                }
            }
        }
    }
    
    private void method28043(final int n, final int n2) {
        final Class8307 class8307 = this.field34473.field32983[n].field34145[n2];
        if (class8307.field34131 != 0) {
            if (class8307.field34132 == 2) {
                if (class8307.field34133 == 0) {
                    return;
                }
            }
        }
        int n3 = 0;
        Label_0097: {
            if (class8307.field34131 != 0) {
                if (class8307.field34133 != 0) {
                    if (class8307.field34132 == 2) {
                        n3 = 18;
                        break Label_0097;
                    }
                }
            }
            n3 = 558;
        }
        for (int i = 0; i < n3; i += 18) {
            for (int j = 0; j < 8; ++j) {
                final int n4 = i + 17 - j;
                final int n5 = i + 18 + j;
                final float n6 = this.field34462[n4];
                final float n7 = this.field34462[n5];
                this.field34462[n4] = n6 * Class8405.field34505[j] - n7 * Class8405.field34506[j];
                this.field34462[n5] = n7 * Class8405.field34505[j] + n6 * Class8405.field34506[j];
            }
        }
    }
    
    private void method28044(final int n, final int n2) {
        final Class8307 class8307 = this.field34473.field32983[n].field34145[n2];
        for (int i = 0; i < 576; i += 18) {
            int field34132 = 0;
            Label_0070: {
                if (class8307.field34131 != 0) {
                    if (class8307.field34133 != 0) {
                        if (i < 36) {
                            field34132 = 0;
                            break Label_0070;
                        }
                    }
                }
                field34132 = class8307.field34132;
            }
            final int n3 = field34132;
            final float[] field34133 = this.field34462;
            for (int j = 0; j < 18; ++j) {
                this.field34492[j] = field34133[j + i];
            }
            this.method28046(this.field34492, this.field34493, n3);
            for (int k = 0; k < 18; ++k) {
                field34133[k + i] = this.field34492[k];
            }
            final float[][] field34134 = this.field34463;
            field34133[0 + i] = this.field34493[0] + field34134[n][i + 0];
            field34134[n][i + 0] = this.field34493[18];
            field34133[1 + i] = this.field34493[1] + field34134[n][i + 1];
            field34134[n][i + 1] = this.field34493[19];
            field34133[2 + i] = this.field34493[2] + field34134[n][i + 2];
            field34134[n][i + 2] = this.field34493[20];
            field34133[3 + i] = this.field34493[3] + field34134[n][i + 3];
            field34134[n][i + 3] = this.field34493[21];
            field34133[4 + i] = this.field34493[4] + field34134[n][i + 4];
            field34134[n][i + 4] = this.field34493[22];
            field34133[5 + i] = this.field34493[5] + field34134[n][i + 5];
            field34134[n][i + 5] = this.field34493[23];
            field34133[6 + i] = this.field34493[6] + field34134[n][i + 6];
            field34134[n][i + 6] = this.field34493[24];
            field34133[7 + i] = this.field34493[7] + field34134[n][i + 7];
            field34134[n][i + 7] = this.field34493[25];
            field34133[8 + i] = this.field34493[8] + field34134[n][i + 8];
            field34134[n][i + 8] = this.field34493[26];
            field34133[9 + i] = this.field34493[9] + field34134[n][i + 9];
            field34134[n][i + 9] = this.field34493[27];
            field34133[10 + i] = this.field34493[10] + field34134[n][i + 10];
            field34134[n][i + 10] = this.field34493[28];
            field34133[11 + i] = this.field34493[11] + field34134[n][i + 11];
            field34134[n][i + 11] = this.field34493[29];
            field34133[12 + i] = this.field34493[12] + field34134[n][i + 12];
            field34134[n][i + 12] = this.field34493[30];
            field34133[13 + i] = this.field34493[13] + field34134[n][i + 13];
            field34134[n][i + 13] = this.field34493[31];
            field34133[14 + i] = this.field34493[14] + field34134[n][i + 14];
            field34134[n][i + 14] = this.field34493[32];
            field34133[15 + i] = this.field34493[15] + field34134[n][i + 15];
            field34134[n][i + 15] = this.field34493[33];
            field34133[16 + i] = this.field34493[16] + field34134[n][i + 16];
            field34134[n][i + 16] = this.field34493[34];
            field34133[17 + i] = this.field34493[17] + field34134[n][i + 17];
            field34134[n][i + 17] = this.field34493[35];
        }
    }
    
    private void method28045() {
        for (int i = 0; i < 18; ++i) {
            for (int j = 0; j < 18; j += 3) {
                this.field34461[0][i][j] = (this.field34461[0][i][j] + this.field34461[1][i][j]) * 0.5f;
                this.field34461[0][i][j + 1] = (this.field34461[0][i][j + 1] + this.field34461[1][i][j + 1]) * 0.5f;
                this.field34461[0][i][j + 2] = (this.field34461[0][i][j + 2] + this.field34461[1][i][j + 2]) * 0.5f;
            }
        }
    }
    
    public void method28046(final float[] array, final float[] array2, final int n) {
        if (n != 2) {
            final int n2 = 17;
            array[n2] += array[16];
            final int n3 = 16;
            array[n3] += array[15];
            final int n4 = 15;
            array[n4] += array[14];
            final int n5 = 14;
            array[n5] += array[13];
            final int n6 = 13;
            array[n6] += array[12];
            final int n7 = 12;
            array[n7] += array[11];
            final int n8 = 11;
            array[n8] += array[10];
            final int n9 = 10;
            array[n9] += array[9];
            final int n10 = 9;
            array[n10] += array[8];
            final int n11 = 8;
            array[n11] += array[7];
            final int n12 = 7;
            array[n12] += array[6];
            final int n13 = 6;
            array[n13] += array[5];
            final int n14 = 5;
            array[n14] += array[4];
            final int n15 = 4;
            array[n15] += array[3];
            final int n16 = 3;
            array[n16] += array[2];
            final int n17 = 2;
            array[n17] += array[1];
            final int n18 = 1;
            array[n18] += array[0];
            final int n19 = 17;
            array[n19] += array[15];
            final int n20 = 15;
            array[n20] += array[13];
            final int n21 = 13;
            array[n21] += array[11];
            final int n22 = 11;
            array[n22] += array[9];
            final int n23 = 9;
            array[n23] += array[7];
            final int n24 = 7;
            array[n24] += array[5];
            final int n25 = 5;
            array[n25] += array[3];
            final int n26 = 3;
            array[n26] += array[1];
            final float n27 = array[0] + array[0];
            final float n28 = n27 + array[12];
            final float n29 = n28 + array[4] * 1.8793852f + array[8] * 1.5320889f + array[16] * 0.34729636f;
            final float n30 = n27 + array[4] - array[8] - array[12] - array[12] - array[16];
            final float n31 = n28 - array[4] * 0.34729636f - array[8] * 1.8793852f + array[16] * 1.5320889f;
            final float n32 = n28 - array[4] * 1.5320889f + array[8] * 0.34729636f - array[16] * 1.8793852f;
            final float n33 = array[0] - array[4] + array[8] - array[12] + array[16];
            final float n34 = array[6] * 1.7320508f;
            final float n35 = array[2] * 1.9696155f + n34 + array[10] * 1.2855753f + array[14] * 0.6840403f;
            final float n36 = (array[2] - array[10] - array[14]) * 1.7320508f;
            final float n37 = array[2] * 1.2855753f - n34 - array[10] * 0.6840403f + array[14] * 1.9696155f;
            final float n38 = array[2] * 0.6840403f - n34 + array[10] * 1.9696155f - array[14] * 1.2855753f;
            final float n39 = array[1] + array[1];
            final float n40 = n39 + array[13];
            final float n41 = n40 + array[5] * 1.8793852f + array[9] * 1.5320889f + array[17] * 0.34729636f;
            final float n42 = n39 + array[5] - array[9] - array[13] - array[13] - array[17];
            final float n43 = n40 - array[5] * 0.34729636f - array[9] * 1.8793852f + array[17] * 1.5320889f;
            final float n44 = n40 - array[5] * 1.5320889f + array[9] * 0.34729636f - array[17] * 1.8793852f;
            final float n45 = (array[1] - array[5] + array[9] - array[13] + array[17]) * 0.70710677f;
            final float n46 = array[7] * 1.7320508f;
            final float n47 = array[3] * 1.9696155f + n46 + array[11] * 1.2855753f + array[15] * 0.6840403f;
            final float n48 = (array[3] - array[11] - array[15]) * 1.7320508f;
            final float n49 = array[3] * 1.2855753f - n46 - array[11] * 0.6840403f + array[15] * 1.9696155f;
            final float n50 = array[3] * 0.6840403f - n46 + array[11] * 1.9696155f - array[15] * 1.2855753f;
            final float n51 = n29 + n35;
            final float n52 = (n41 + n47) * 0.5019099f;
            final float n53 = n51 + n52;
            final float n54 = n51 - n52;
            final float n55 = n30 + n36;
            final float n56 = (n42 + n48) * 0.5176381f;
            final float n57 = n55 + n56;
            final float n58 = n55 - n56;
            final float n59 = n31 + n37;
            final float n60 = (n43 + n49) * 0.55168897f;
            final float n61 = n59 + n60;
            final float n62 = n59 - n60;
            final float n63 = n32 + n38;
            final float n64 = (n44 + n50) * 0.61038727f;
            final float n65 = n63 + n64;
            final float n66 = n63 - n64;
            final float n67 = n33 + n45;
            final float n68 = n33 - n45;
            final float n69 = n32 - n38;
            final float n70 = (n44 - n50) * 0.8717234f;
            final float n71 = n69 + n70;
            final float n72 = n69 - n70;
            final float n73 = n31 - n37;
            final float n74 = (n43 - n49) * 1.1831008f;
            final float n75 = n73 + n74;
            final float n76 = n73 - n74;
            final float n77 = n30 - n36;
            final float n78 = (n42 - n48) * 1.9318516f;
            final float n79 = n77 + n78;
            final float n80 = n77 - n78;
            final float n81 = n29 - n35;
            final float n82 = (n41 - n47) * 5.7368565f;
            final float n83 = n81 + n82;
            final float n84 = n81 - n82;
            final float[] array3 = Class8405.field34507[n];
            array2[0] = -n84 * array3[0];
            array2[1] = -n80 * array3[1];
            array2[2] = -n76 * array3[2];
            array2[3] = -n72 * array3[3];
            array2[4] = -n68 * array3[4];
            array2[5] = -n66 * array3[5];
            array2[6] = -n62 * array3[6];
            array2[7] = -n58 * array3[7];
            array2[8] = -n54 * array3[8];
            array2[9] = n54 * array3[9];
            array2[10] = n58 * array3[10];
            array2[11] = n62 * array3[11];
            array2[12] = n66 * array3[12];
            array2[13] = n68 * array3[13];
            array2[14] = n72 * array3[14];
            array2[15] = n76 * array3[15];
            array2[16] = n80 * array3[16];
            array2[17] = n84 * array3[17];
            array2[18] = n83 * array3[18];
            array2[19] = n79 * array3[19];
            array2[20] = n75 * array3[20];
            array2[21] = n71 * array3[21];
            array2[22] = n67 * array3[22];
            array2[23] = n65 * array3[23];
            array2[24] = n61 * array3[24];
            array2[25] = n57 * array3[25];
            array2[26] = n53 * array3[26];
            array2[27] = n53 * array3[27];
            array2[28] = n57 * array3[28];
            array2[29] = n61 * array3[29];
            array2[30] = n65 * array3[30];
            array2[31] = n67 * array3[31];
            array2[32] = n71 * array3[32];
            array2[33] = n75 * array3[33];
            array2[34] = n79 * array3[34];
            array2[35] = n83 * array3[35];
        }
        else {
            array2[1] = (array2[0] = 0.0f);
            array2[3] = (array2[2] = 0.0f);
            array2[5] = (array2[4] = 0.0f);
            array2[7] = (array2[6] = 0.0f);
            array2[9] = (array2[8] = 0.0f);
            array2[11] = (array2[10] = 0.0f);
            array2[13] = (array2[12] = 0.0f);
            array2[15] = (array2[14] = 0.0f);
            array2[17] = (array2[16] = 0.0f);
            array2[19] = (array2[18] = 0.0f);
            array2[21] = (array2[20] = 0.0f);
            array2[23] = (array2[22] = 0.0f);
            array2[25] = (array2[24] = 0.0f);
            array2[27] = (array2[26] = 0.0f);
            array2[29] = (array2[28] = 0.0f);
            array2[31] = (array2[30] = 0.0f);
            array2[33] = (array2[32] = 0.0f);
            array2[35] = (array2[34] = 0.0f);
            int n85 = 0;
            for (int i = 0; i < 3; ++i) {
                final int n86 = 15 + i;
                array[n86] += array[12 + i];
                final int n87 = 12 + i;
                array[n87] += array[9 + i];
                final int n88 = 9 + i;
                array[n88] += array[6 + i];
                final int n89 = 6 + i;
                array[n89] += array[3 + i];
                final int n90 = 3 + i;
                array[n90] += array[0 + i];
                final int n91 = 15 + i;
                array[n91] += array[9 + i];
                final int n92 = 9 + i;
                array[n92] += array[3 + i];
                final float n93 = array[12 + i] * 0.5f;
                final float n94 = array[6 + i] * 0.8660254f;
                final float n95 = array[0 + i] + n93;
                final float n96 = array[0 + i] - array[12 + i];
                final float n97 = n95 + n94;
                final float n98 = n95 - n94;
                final float n99 = array[15 + i] * 0.5f;
                final float n100 = array[9 + i] * 0.8660254f;
                final float n101 = array[3 + i] + n99;
                final float n102 = array[3 + i] - array[15 + i];
                final float n103 = n101 + n100;
                final float n104 = (n101 - n100) * 1.9318516f;
                final float n105 = n102 * 0.70710677f;
                final float n106 = n103 * 0.5176381f;
                final float n107 = n97;
                final float n108 = n97 + n106;
                final float n109 = n107 - n106;
                final float n110 = n96;
                final float n111 = n96 + n105;
                final float n112 = n110 - n105;
                final float n113 = n98;
                final float n114 = n98 + n104;
                final float n115 = n113 - n104;
                final float n116 = n108 * 0.5043145f;
                final float n117 = n111 * 0.5411961f;
                final float n118 = n114 * 0.6302362f;
                final float n119 = n115 * 0.8213398f;
                final float n120 = n112 * 1.306563f;
                final float n121 = n109 * 3.830649f;
                final float n122 = -n116 * 0.7933533f;
                final float n123 = -n116 * 0.6087614f;
                final float n124 = -n117 * 0.9238795f;
                final float n125 = -n117 * 0.38268343f;
                final float n126 = -n118 * 0.9914449f;
                final float n127 = -n118 * 0.13052619f;
                final float n128 = n119;
                final float n129 = n120 * 0.38268343f;
                final float n130 = n121 * 0.6087614f;
                final float n131 = -n121 * 0.7933533f;
                final float n132 = -n120 * 0.9238795f;
                final float n133 = -n128 * 0.9914449f;
                final float n134 = n128 * 0.13052619f;
                final int n135 = n85 + 6;
                array2[n135] += n134;
                final int n136 = n85 + 7;
                array2[n136] += n129;
                final int n137 = n85 + 8;
                array2[n137] += n130;
                final int n138 = n85 + 9;
                array2[n138] += n131;
                final int n139 = n85 + 10;
                array2[n139] += n132;
                final int n140 = n85 + 11;
                array2[n140] += n133;
                final int n141 = n85 + 12;
                array2[n141] += n126;
                final int n142 = n85 + 13;
                array2[n142] += n124;
                final int n143 = n85 + 14;
                array2[n143] += n122;
                final int n144 = n85 + 15;
                array2[n144] += n123;
                final int n145 = n85 + 16;
                array2[n145] += n125;
                final int n146 = n85 + 17;
                array2[n146] += n127;
                n85 += 6;
            }
        }
    }
    
    private static float[] method28047() {
        final float[] array = new float[8192];
        for (int i = 0; i < 8192; ++i) {
            array[i] = (float)Math.pow(i, 1.3333333333333333);
        }
        return array;
    }
    
    public static int[] method28048(final int[] array) {
        int n = 0;
        final int[] array2 = new int[576];
        for (int i = 0; i < 13; ++i) {
            final int n2 = array[i];
            final int n3 = array[i + 1];
            for (int j = 0; j < 3; ++j) {
                for (int k = n2; k < n3; ++k) {
                    array2[3 * k + j] = n++;
                }
            }
        }
        return array2;
    }
    
    static {
        field34497 = new int[][] { { 0, 0, 0, 0, 3, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4 }, { 0, 1, 2, 3, 0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 2, 3 } };
        field34498 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3, 2, 0 };
        field34500 = new float[] { 1.0f, 0.70710677f, 0.5f, 0.35355338f, 0.25f, 0.17677669f, 0.125f, 0.088388346f, 0.0625f, 0.044194173f, 0.03125f, 0.022097087f, 0.015625f, 0.011048543f, 0.0078125f, 0.0055242716f, 0.00390625f, 0.0027621358f, 0.001953125f, 0.0013810679f, 9.765625E-4f, 6.9053395E-4f, 4.8828125E-4f, 3.4526698E-4f, 2.4414062E-4f, 1.7263349E-4f, 1.2207031E-4f, 8.6316744E-5f, 6.1035156E-5f, 4.3158372E-5f, 3.0517578E-5f, 2.1579186E-5f, 1.5258789E-5f, 1.0789593E-5f, 7.6293945E-6f, 5.3947965E-6f, 3.8146973E-6f, 2.6973983E-6f, 1.9073486E-6f, 1.3486991E-6f, 9.536743E-7f, 6.7434956E-7f, 4.7683716E-7f, 3.3717478E-7f, 2.3841858E-7f, 1.6858739E-7f, 1.1920929E-7f, 8.4293696E-8f, 5.9604645E-8f, 4.2146848E-8f, 2.9802322E-8f, 2.1073424E-8f, 1.4901161E-8f, 1.0536712E-8f, 7.450581E-9f, 5.268356E-9f, 3.7252903E-9f, 2.634178E-9f, 1.8626451E-9f, 1.317089E-9f, 9.313226E-10f, 6.585445E-10f, 4.656613E-10f, 3.2927225E-10f };
        field34501 = method28047();
        field34502 = new float[][] { { 1.0f, 0.8408964f, 0.70710677f, 0.59460354f, 0.5f, 0.4204482f, 0.35355338f, 0.29730177f, 0.25f, 0.2102241f, 0.17677669f, 0.14865088f, 0.125f, 0.10511205f, 0.088388346f, 0.07432544f, 0.0625f, 0.052556027f, 0.044194173f, 0.03716272f, 0.03125f, 0.026278013f, 0.022097087f, 0.01858136f, 0.015625f, 0.013139007f, 0.011048543f, 0.00929068f, 0.0078125f, 0.0065695033f, 0.0055242716f, 0.00464534f }, { 1.0f, 0.70710677f, 0.5f, 0.35355338f, 0.25f, 0.17677669f, 0.125f, 0.088388346f, 0.0625f, 0.044194173f, 0.03125f, 0.022097087f, 0.015625f, 0.011048543f, 0.0078125f, 0.0055242716f, 0.00390625f, 0.0027621358f, 0.001953125f, 0.0013810679f, 9.765625E-4f, 6.9053395E-4f, 4.8828125E-4f, 3.4526698E-4f, 2.4414062E-4f, 1.7263349E-4f, 1.2207031E-4f, 8.6316744E-5f, 6.1035156E-5f, 4.3158372E-5f, 3.0517578E-5f, 2.1579186E-5f } };
        field34503 = new float[] { 0.0f, 0.2679492f, 0.57735026f, 1.0f, 1.7320508f, 3.732051f, 1.0E11f, -3.732051f, -1.7320508f, -1.0f, -0.57735026f, -0.2679492f, 0.0f, 0.2679492f, 0.57735026f, 1.0f };
        field34505 = new float[] { 0.8574929f, 0.881742f, 0.94962865f, 0.9833146f, 0.9955178f, 0.9991606f, 0.9998992f, 0.99999315f };
        field34506 = new float[] { -0.51449573f, -0.47173196f, -0.31337744f, -0.1819132f, -0.09457419f, -0.040965583f, -0.014198569f, -0.0036999746f };
        field34507 = new float[][] { { -0.016141215f, -0.05360318f, -0.100707136f, -0.16280818f, -0.5f, -0.38388735f, -0.6206114f, -1.1659756f, -3.8720753f, -4.225629f, -1.519529f, -0.97416484f, -0.73744076f, -1.2071068f, -0.5163616f, -0.45426053f, -0.40715656f, -0.3696946f, -0.3387627f, -0.31242222f, -0.28939587f, -0.26880082f, -0.5f, -0.23251417f, -0.21596715f, -0.20004979f, -0.18449493f, -0.16905846f, -0.15350361f, -0.13758625f, -0.12103922f, -0.20710678f, -0.084752575f, -0.06415752f, -0.041131172f, -0.014790705f }, { -0.016141215f, -0.05360318f, -0.100707136f, -0.16280818f, -0.5f, -0.38388735f, -0.6206114f, -1.1659756f, -3.8720753f, -4.225629f, -1.519529f, -0.97416484f, -0.73744076f, -1.2071068f, -0.5163616f, -0.45426053f, -0.40715656f, -0.3696946f, -0.33908543f, -0.3151181f, -0.29642227f, -0.28184548f, -0.5411961f, -0.2621323f, -0.25387916f, -0.2329629f, -0.19852729f, -0.15233535f, -0.0964964f, -0.03342383f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f }, { -0.0483008f, -0.15715657f, -0.28325045f, -0.42953748f, -1.2071068f, -0.8242648f, -1.1451749f, -1.769529f, -4.5470223f, -3.489053f, -0.7329629f, -0.15076515f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f }, { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.15076514f, -0.7329629f, -3.489053f, -4.5470223f, -1.769529f, -1.1451749f, -0.8313774f, -1.306563f, -0.54142016f, -0.46528974f, -0.4106699f, -0.3700468f, -0.3387627f, -0.31242222f, -0.28939587f, -0.26880082f, -0.5f, -0.23251417f, -0.21596715f, -0.20004979f, -0.18449493f, -0.16905846f, -0.15350361f, -0.13758625f, -0.12103922f, -0.20710678f, -0.084752575f, -0.06415752f, -0.041131172f, -0.014790705f } };
        field34509 = new int[][][] { { { 6, 5, 5, 5 }, { 9, 9, 9, 9 }, { 6, 9, 9, 9 } }, { { 6, 5, 7, 3 }, { 9, 9, 12, 6 }, { 6, 9, 12, 6 } }, { { 11, 10, 0, 0 }, { 18, 18, 0, 0 }, { 15, 18, 0, 0 } }, { { 7, 7, 7, 0 }, { 12, 12, 12, 0 }, { 6, 15, 12, 0 } }, { { 6, 6, 6, 3 }, { 12, 9, 9, 6 }, { 6, 12, 9, 6 } }, { { 8, 8, 5, 0 }, { 15, 12, 9, 0 }, { 6, 18, 9, 0 } } };
    }
}
