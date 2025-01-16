// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector4f;
import net.minecraft.util.math.AxisAlignedBB;

public class Class6664
{
    private static String[] field26323;
    private final Vector4f[] field26324;
    private double field26325;
    private double field26326;
    private double field26327;
    public boolean field26328;
    
    public Class6664(final Matrix4f class6789, final Matrix4f class6790) {
        this.field26324 = new Vector4f[6];
        this.field26328 = false;
        this.method20263(class6789, class6790);
    }
    
    public void method20262(final double field26325, final double field26326, final double field26327) {
        this.field26325 = field26325;
        this.field26326 = field26326;
        this.field26327 = field26327;
    }
    
    private void method20263(final Matrix4f class6789, final Matrix4f class6790) {
        final Matrix4f method20758 = class6790.method20758();
        method20758.method20752(class6789);
        method20758.method20750();
        this.method20264(method20758, -1, 0, 0, 0);
        this.method20264(method20758, 1, 0, 0, 1);
        this.method20264(method20758, 0, -1, 0, 2);
        this.method20264(method20758, 0, 1, 0, 3);
        this.method20264(method20758, 0, 0, -1, 4);
        this.method20264(method20758, 0, 0, 1, 5);
    }
    
    private void method20264(final Matrix4f class6789, final int n, final int n2, final int n3, final int n4) {
        final Vector4f class6790 = new Vector4f((float)n, (float)n2, (float)n3, 1.0f);
        class6790.method28603(class6789);
        class6790.method28602();
        this.field26324[n4] = class6790;
    }
    
    public boolean method20261(final AxisAlignedBB class6221) {
        return this.method20265(class6221.minX, class6221.minY, class6221.minZ, class6221.maxX, class6221.maxY, class6221.maxZ);
    }
    
    private boolean method20265(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return this.field26328 || this.method20266((float)(n - this.field26325), (float)(n2 - this.field26326), (float)(n3 - this.field26327), (float)(n4 - this.field26325), (float)(n5 - this.field26326), (float)(n6 - this.field26327));
    }
    
    private boolean method20266(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        for (int i = 0; i < 6; ++i) {
            final Vector4f class8526 = this.field26324[i];
            final float method28595 = class8526.method28595();
            final float method28596 = class8526.method28596();
            final float method28597 = class8526.method28597();
            final float method28598 = class8526.method28598();
            if (method28595 * n + method28596 * n2 + method28597 * n3 + method28598 <= 0.0f) {
                if (method28595 * n4 + method28596 * n2 + method28597 * n3 + method28598 <= 0.0f) {
                    if (method28595 * n + method28596 * n5 + method28597 * n3 + method28598 <= 0.0f) {
                        if (method28595 * n4 + method28596 * n5 + method28597 * n3 + method28598 <= 0.0f) {
                            if (method28595 * n + method28596 * n2 + method28597 * n6 + method28598 <= 0.0f) {
                                if (method28595 * n4 + method28596 * n2 + method28597 * n6 + method28598 <= 0.0f) {
                                    if (method28595 * n + method28596 * n5 + method28597 * n6 + method28598 <= 0.0f) {
                                        if (method28595 * n4 + method28596 * n5 + method28597 * n6 + method28598 <= 0.0f) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public boolean method20267(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        if (!this.field26328) {
            final float n7 = (float)n;
            final float n8 = (float)n2;
            final float n9 = (float)n3;
            final float n10 = (float)n4;
            final float n11 = (float)n5;
            final float n12 = (float)n6;
            for (int i = 0; i < 6; ++i) {
                final Vector4f class8526 = this.field26324[i];
                final float method28595 = class8526.method28595();
                final float method28596 = class8526.method28596();
                final float method28597 = class8526.method28597();
                final float method28598 = class8526.method28598();
                if (i < 4) {
                    if (method28595 * n7 + method28596 * n8 + method28597 * n9 + method28598 > 0.0f) {
                        if (method28595 * n10 + method28596 * n8 + method28597 * n9 + method28598 > 0.0f) {
                            if (method28595 * n7 + method28596 * n11 + method28597 * n9 + method28598 > 0.0f) {
                                if (method28595 * n10 + method28596 * n11 + method28597 * n9 + method28598 > 0.0f) {
                                    if (method28595 * n7 + method28596 * n8 + method28597 * n12 + method28598 > 0.0f) {
                                        if (method28595 * n10 + method28596 * n8 + method28597 * n12 + method28598 > 0.0f) {
                                            if (method28595 * n7 + method28596 * n11 + method28597 * n12 + method28598 > 0.0f) {
                                                if (method28595 * n10 + method28596 * n11 + method28597 * n12 + method28598 > 0.0f) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                if (method28595 * n7 + method28596 * n8 + method28597 * n9 + method28598 <= 0.0f) {
                    if (method28595 * n10 + method28596 * n8 + method28597 * n9 + method28598 <= 0.0f) {
                        if (method28595 * n7 + method28596 * n11 + method28597 * n9 + method28598 <= 0.0f) {
                            if (method28595 * n10 + method28596 * n11 + method28597 * n9 + method28598 <= 0.0f) {
                                if (method28595 * n7 + method28596 * n8 + method28597 * n12 + method28598 <= 0.0f) {
                                    if (method28595 * n10 + method28596 * n8 + method28597 * n12 + method28598 <= 0.0f) {
                                        if (method28595 * n7 + method28596 * n11 + method28597 * n12 + method28598 <= 0.0f) {
                                            if (method28595 * n10 + method28596 * n11 + method28597 * n12 + method28598 <= 0.0f) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return true;
    }
    
    public Vector4f[] method20268() {
        return this.field26324;
    }
}
