// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5707 extends Class5706
{
    private static String[] field23169;
    public int field23210;
    public int field23211;
    public float field23212;
    public float field23213;
    public float field23214;
    public int[] field23215;
    public float[] field23216;
    public float[] field23217;
    public float[] field23218;
    public float[] field23219;
    
    public Class5707(final int n) {
        super(n);
        this.field23215 = new int[] { 0 };
        this.field23216 = new float[] { 0.0f };
        this.field23218 = new float[] { 0.0f };
        this.field23219 = new float[] { 0.0f };
        this.field23217 = new float[3];
    }
    
    @Override
    public void method16954(final Class2341 class2341, final Class8664 class2342, final Class9410 class2343) {
        final int method16958 = this.method16958(class2342);
        this.field23197 = class2341.method9474(method16958);
        this.field23210 = class2341.method9474(method16958);
        if (class2343 != null) {
            class2343.method35005(this.field23197, method16958);
            class2343.method35005(this.field23210, method16958);
        }
    }
    
    @Override
    public void method16960(final Class2341 class2341, final Class9410 class2342) {
        if (this.field23197 != 0) {
            this.field23198 = class2341.method9474(2);
            if (class2342 != null) {
                class2342.method35005(this.field23198, 2);
            }
        }
        if (this.field23210 != 0) {
            this.field23211 = class2341.method9474(2);
            if (class2342 != null) {
                class2342.method35005(this.field23211, 2);
            }
        }
    }
    
    @Override
    public void method16955(final Class2341 class2341, final Class8664 class2342) {
        super.method16955(class2341, class2342);
        if (this.field23210 != 0) {
            switch (this.field23211) {
                case 0: {
                    this.field23212 = Class5707.field23168[class2341.method9474(6)];
                    this.field23213 = Class5707.field23168[class2341.method9474(6)];
                    this.field23214 = Class5707.field23168[class2341.method9474(6)];
                    break;
                }
                case 1: {
                    final float n = Class5707.field23168[class2341.method9474(6)];
                    this.field23213 = n;
                    this.field23212 = n;
                    this.field23214 = Class5707.field23168[class2341.method9474(6)];
                    break;
                }
                case 2: {
                    final float field23212 = Class5707.field23168[class2341.method9474(6)];
                    this.field23214 = field23212;
                    this.field23213 = field23212;
                    this.field23212 = field23212;
                    break;
                }
                case 3: {
                    this.field23212 = Class5707.field23168[class2341.method9474(6)];
                    final float n2 = Class5707.field23168[class2341.method9474(6)];
                    this.field23214 = n2;
                    this.field23213 = n2;
                    break;
                }
            }
            this.method16959(class2342, this.field23210, 1, this.field23216, this.field23215, this.field23218, this.field23219);
        }
    }
    
    @Override
    public boolean method16956(final Class2341 class2341) {
        final boolean method16956 = super.method16956(class2341);
        if (this.field23210 != 0) {
            if (this.field23203[1] == null) {
                this.field23217[0] = (float)(class2341.method9474(this.field23215[0]) * this.field23216[0] - 1.0);
                this.field23217[1] = (float)(class2341.method9474(this.field23215[0]) * this.field23216[0] - 1.0);
                this.field23217[2] = (float)(class2341.method9474(this.field23215[0]) * this.field23216[0] - 1.0);
            }
            else {
                final int method16957 = class2341.method9474(this.field23215[0]);
                final int n = method16957 + (method16957 << 1);
                final float[] field23217 = this.field23217;
                final float[] array = this.field23203[1];
                int n2 = 0;
                int n3 = n;
                field23217[n2] = array[n3];
                ++n3;
                ++n2;
                field23217[n2] = array[n3];
                ++n3;
                ++n2;
                field23217[n2] = array[n3];
            }
        }
        return method16956;
    }
    
    @Override
    public boolean method16957(final int n, final Class8560 class8560, final Class8560 class8561) {
        final boolean method16957 = super.method16957(n, class8560, class8561);
        if (this.field23210 != 0) {
            if (n != 1) {
                float n2 = this.field23217[this.field23206 - 1];
                if (this.field23203[1] == null) {
                    n2 = (n2 + this.field23219[0]) * this.field23218[0];
                }
                float n3;
                if (this.field23205 > 4) {
                    if (this.field23205 > 8) {
                        n3 = n2 * this.field23214;
                    }
                    else {
                        n3 = n2 * this.field23213;
                    }
                }
                else {
                    n3 = n2 * this.field23212;
                }
                if (n != 0) {
                    class8560.method28754(n3, this.field23196);
                }
                else {
                    class8561.method28754(n3, this.field23196);
                }
            }
        }
        return method16957;
    }
}
