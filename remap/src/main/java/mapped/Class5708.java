// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5708 extends Class5706
{
    private static String[] field23169;
    public int field23220;
    public float field23221;
    public float field23222;
    public float field23223;
    
    public Class5708(final int n) {
        super(n);
    }
    
    @Override
    public void method16954(final Class2341 class2341, final Class8664 class2342, final Class9410 class2343) {
        super.method16954(class2341, class2342, class2343);
    }
    
    @Override
    public void method16960(final Class2341 class2341, final Class9410 class2342) {
        if (this.field23197 != 0) {
            this.field23198 = class2341.method9474(2);
            this.field23220 = class2341.method9474(2);
            if (class2342 != null) {
                class2342.method35005(this.field23198, 2);
                class2342.method35005(this.field23220, 2);
            }
        }
    }
    
    @Override
    public void method16955(final Class2341 class2341, final Class8664 class2342) {
        if (this.field23197 != 0) {
            super.method16955(class2341, class2342);
            switch (this.field23220) {
                case 0: {
                    this.field23221 = Class5708.field23168[class2341.method9474(6)];
                    this.field23222 = Class5708.field23168[class2341.method9474(6)];
                    this.field23223 = Class5708.field23168[class2341.method9474(6)];
                    break;
                }
                case 1: {
                    final float n = Class5708.field23168[class2341.method9474(6)];
                    this.field23222 = n;
                    this.field23221 = n;
                    this.field23223 = Class5708.field23168[class2341.method9474(6)];
                    break;
                }
                case 2: {
                    final float field23221 = Class5708.field23168[class2341.method9474(6)];
                    this.field23223 = field23221;
                    this.field23222 = field23221;
                    this.field23221 = field23221;
                    break;
                }
                case 3: {
                    this.field23221 = Class5708.field23168[class2341.method9474(6)];
                    final float n2 = Class5708.field23168[class2341.method9474(6)];
                    this.field23223 = n2;
                    this.field23222 = n2;
                    break;
                }
            }
        }
    }
    
    @Override
    public boolean method16956(final Class2341 class2341) {
        return super.method16956(class2341);
    }
    
    @Override
    public boolean method16957(final int n, final Class8560 class8560, final Class8560 class8561) {
        if (this.field23197 != 0) {
            float n2 = this.field23207[this.field23206];
            if (this.field23203[0] == null) {
                n2 = (n2 + this.field23209[0]) * this.field23208[0];
            }
            if (n != 0) {
                if (n != 1) {
                    float n3;
                    if (this.field23205 > 4) {
                        if (this.field23205 > 8) {
                            n3 = n2 * this.field23223;
                        }
                        else {
                            n3 = n2 * this.field23222;
                        }
                    }
                    else {
                        n3 = n2 * this.field23221;
                    }
                    class8560.method28754(n3, this.field23196);
                }
                else {
                    float n4;
                    if (this.field23205 > 4) {
                        if (this.field23205 > 8) {
                            n4 = n2 * this.field23201;
                        }
                        else {
                            n4 = n2 * this.field23200;
                        }
                    }
                    else {
                        n4 = n2 * this.field23199;
                    }
                    class8560.method28754(n4, this.field23196);
                }
            }
            else {
                final float n5 = n2;
                float n6;
                float n7;
                if (this.field23205 > 4) {
                    if (this.field23205 > 8) {
                        n6 = n2 * this.field23201;
                        n7 = n5 * this.field23223;
                    }
                    else {
                        n6 = n2 * this.field23200;
                        n7 = n5 * this.field23222;
                    }
                }
                else {
                    n6 = n2 * this.field23199;
                    n7 = n5 * this.field23221;
                }
                class8560.method28754(n6, this.field23196);
                class8561.method28754(n7, this.field23196);
            }
        }
        return ++this.field23206 == 3;
    }
}
