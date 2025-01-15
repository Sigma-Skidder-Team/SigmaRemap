// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6019 implements Class6020
{
    private static String[] field24496;
    private Class6448 field24497;
    public static int field24498;
    private boolean field24499;
    private float field24500;
    private float[] field24501;
    private float[] field24502;
    private int field24503;
    private int field24504;
    private Class6021 field24505;
    private boolean field24506;
    private boolean field24507;
    
    public Class6019() {
        this.field24497 = Class7840.method25330();
        this.field24500 = 1.0f;
        this.field24505 = new Class6021();
        this.field24507 = false;
        this.field24501 = new float[Class6019.field24498 * 2];
        this.field24502 = new float[Class6019.field24498 * 4];
    }
    
    @Override
    public void method17931(final boolean field24507) {
        this.field24507 = field24507;
    }
    
    @Override
    public void method17932() {
        if (this.field24500 != 1.0f) {
            this.field24503 = 0;
            this.field24504 = 0;
            this.field24497.method19250();
            final float[] method19277 = this.field24497.method19277();
            this.method17940(method19277[0], method19277[1], method19277[2], method19277[3]);
            return;
        }
        this.field24505.method17932();
    }
    
    @Override
    public void method17933() {
        if (this.field24500 != 1.0f) {
            this.method17937(this.field24501, this.field24503);
            return;
        }
        this.field24505.method17933();
    }
    
    @Override
    public void method17934(final float n, final float n2) {
        if (this.field24500 != 1.0f) {
            this.field24501[this.field24503 * 2] = n;
            this.field24501[this.field24503 * 2 + 1] = n2;
            ++this.field24503;
            final int n3 = this.field24503 - 1;
            this.method17940(this.field24502[n3 * 4], this.field24502[n3 * 4 + 1], this.field24502[n3 * 4 + 2], this.field24502[n3 * 4 + 3]);
            return;
        }
        this.field24505.method17934(n, n2);
    }
    
    @Override
    public void method17935(final float field24500) {
        this.field24500 = field24500;
    }
    
    @Override
    public void method17936(final boolean field24499) {
        this.field24505.method17936(field24499);
        this.field24499 = field24499;
    }
    
    public void method17937(final float[] array, final int n) {
        if (this.field24499) {
            this.field24497.method19265(2881);
            this.method17938(array, n, this.field24500 + 1.0f);
        }
        this.field24497.method19264(2881);
        this.method17938(array, n, this.field24500);
        if (this.field24499) {
            this.field24497.method19265(2881);
        }
    }
    
    public void method17938(final float[] array, final int n, final float n2) {
        final float n3 = n2 / 2.0f;
        float n4 = 0.0f;
        float n5 = 0.0f;
        float n6 = 0.0f;
        float n7 = 0.0f;
        this.field24497.method19251(7);
        for (int i = 0; i < n + 1; ++i) {
            int n8 = i;
            int n9 = i + 1;
            int n10 = i - 1;
            if (n10 < 0) {
                n10 += n;
            }
            if (n9 >= n) {
                n9 -= n;
            }
            if (n8 >= n) {
                n8 -= n;
            }
            final float n11 = array[n8 * 2];
            final float n12 = array[n8 * 2 + 1];
            final float n13 = array[n9 * 2];
            final float n14 = array[n9 * 2 + 1];
            final float n15 = n13 - n11;
            final float n16 = n14 - n12;
            if (n15 != 0.0f || n16 != 0.0f) {
                final float n17 = (float)Math.sqrt(n15 * n15 + n16 * n16);
                final float n18 = n15 * n3;
                final float n19 = n16 * n3;
                final float n20 = n18 / n17;
                final float n21 = n19 / n17;
                final float n22 = -n20;
                if (i != 0) {
                    this.method17939(n10);
                    this.field24497.method19256(n4, n5, 0.0f);
                    this.field24497.method19256(n6, n7, 0.0f);
                    this.method17939(n8);
                    this.field24497.method19256(n11 + n21, n12 + n22, 0.0f);
                    this.field24497.method19256(n11 - n21, n12 - n22, 0.0f);
                }
                n4 = n13 - n21;
                n5 = n14 - n22;
                n6 = n13 + n21;
                n7 = n14 + n22;
                if (i < n - 1) {
                    this.method17939(n8);
                    this.field24497.method19256(n11 + n21, n12 + n22, 0.0f);
                    this.field24497.method19256(n11 - n21, n12 - n22, 0.0f);
                    this.method17939(n9);
                    this.field24497.method19256(n13 - n21, n14 - n22, 0.0f);
                    this.field24497.method19256(n13 + n21, n14 + n22, 0.0f);
                }
            }
        }
        this.field24497.method19253();
        final float n23 = (n3 > 12.5f) ? (180.0f / (float)Math.ceil(n3 / 2.5)) : 5.0f;
        if (this.field24507) {
            final float n24 = array[2] - array[0];
            final float n25 = array[3] - array[1];
            final float n26 = (float)Math.toDegrees(Math.atan2(n25, n24)) + 90.0f;
            if (n24 != 0.0f || n25 != 0.0f) {
                this.field24497.method19251(6);
                this.method17939(0);
                this.field24497.method19255(array[0], array[1]);
                for (int n27 = 0; n27 < 180.0f + n23; n27 += (int)n23) {
                    final float n28 = (float)Math.toRadians(n26 + n27);
                    this.field24497.method19255(array[0] + (float)(Math.cos(n28) * n3), array[1] + (float)(Math.sin(n28) * n3));
                }
                this.field24497.method19253();
            }
        }
        if (this.field24507) {
            final float n29 = array[n * 2 - 2] - array[n * 2 - 4];
            final float n30 = array[n * 2 - 1] - array[n * 2 - 3];
            final float n31 = (float)Math.toDegrees(Math.atan2(n30, n29)) - 90.0f;
            if (n29 != 0.0f || n30 != 0.0f) {
                this.field24497.method19251(6);
                this.method17939(n - 1);
                this.field24497.method19255(array[n * 2 - 2], array[n * 2 - 1]);
                for (int n32 = 0; n32 < 180.0f + n23; n32 += (int)n23) {
                    final float n33 = (float)Math.toRadians(n31 + n32);
                    this.field24497.method19255(array[n * 2 - 2] + (float)(Math.cos(n33) * n3), array[n * 2 - 1] + (float)(Math.sin(n33) * n3));
                }
                this.field24497.method19253();
            }
        }
    }
    
    private void method17939(final int n) {
        if (n < this.field24504) {
            if (!this.field24506) {
                this.field24497.method19252(this.field24502[n * 4], this.field24502[n * 4 + 1], this.field24502[n * 4 + 2], this.field24502[n * 4 + 3]);
            }
            else {
                this.field24497.method19252(this.field24502[n * 4] * 0.5f, this.field24502[n * 4 + 1] * 0.5f, this.field24502[n * 4 + 2] * 0.5f, this.field24502[n * 4 + 3] * 0.5f);
            }
        }
    }
    
    @Override
    public void method17940(final float n, final float n2, final float n3, final float n4) {
        if (this.field24500 != 1.0f) {
            this.field24502[this.field24503 * 4] = n;
            this.field24502[this.field24503 * 4 + 1] = n2;
            this.field24502[this.field24503 * 4 + 2] = n3;
            this.field24502[this.field24503 * 4 + 3] = n4;
            ++this.field24504;
            return;
        }
        this.field24505.method17940(n, n2, n3, n4);
    }
    
    @Override
    public boolean method17941() {
        if (this.field24500 != 1.0f) {
            return this.field24505.method17941();
        }
        return this.field24505.method17941();
    }
    
    static {
        Class6019.field24498 = 10000;
    }
}
