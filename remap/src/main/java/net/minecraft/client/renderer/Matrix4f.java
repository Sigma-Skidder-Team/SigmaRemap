// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.client.renderer;

import java.util.Random;
import java.nio.FloatBuffer;

public final class Matrix4f
{
    public float m00;
    public float m01;
    public float m02;
    public float field26692;
    public float m10;
    public float m11;
    public float m12;
    public float field26696;
    public float m20;
    public float m21;
    public float m22;
    public float field26700;
    public float field26701;
    public float field26702;
    public float field26703;
    public float field26704;
    
    public Matrix4f() {
    }
    
    public Matrix4f(final Matrix4f class6789) {
        this.m00 = class6789.m00;
        this.m01 = class6789.m01;
        this.m02 = class6789.m02;
        this.field26692 = class6789.field26692;
        this.m10 = class6789.m10;
        this.m11 = class6789.m11;
        this.m12 = class6789.m12;
        this.field26696 = class6789.field26696;
        this.m20 = class6789.m20;
        this.m21 = class6789.m21;
        this.m22 = class6789.m22;
        this.field26700 = class6789.field26700;
        this.field26701 = class6789.field26701;
        this.field26702 = class6789.field26702;
        this.field26703 = class6789.field26703;
        this.field26704 = class6789.field26704;
    }
    
    public Matrix4f(final Quaternion class9389) {
        final float method34899 = class9389.getX();
        final float method34900 = class9389.getY();
        final float method34901 = class9389.getZ();
        final float method34902 = class9389.getW();
        final float n = 2.0f * method34899 * method34899;
        final float n2 = 2.0f * method34900 * method34900;
        final float n3 = 2.0f * method34901 * method34901;
        this.m00 = 1.0f - n2 - n3;
        this.m11 = 1.0f - n3 - n;
        this.m22 = 1.0f - n - n2;
        this.field26704 = 1.0f;
        final float n4 = method34899 * method34900;
        final float n5 = method34900 * method34901;
        final float n6 = method34901 * method34899;
        final float n7 = method34899 * method34902;
        final float n8 = method34900 * method34902;
        final float n9 = method34901 * method34902;
        this.m10 = 2.0f * (n4 + n9);
        this.m01 = 2.0f * (n4 - n9);
        this.m20 = 2.0f * (n6 - n8);
        this.m02 = 2.0f * (n6 + n8);
        this.m21 = 2.0f * (n5 + n7);
        this.m12 = 2.0f * (n5 - n7);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Matrix4f class6789 = (Matrix4f)o;
            if (Float.compare(class6789.m00, this.m00) == 0) {
                if (Float.compare(class6789.m01, this.m01) == 0) {
                    if (Float.compare(class6789.m02, this.m02) == 0) {
                        if (Float.compare(class6789.field26692, this.field26692) == 0) {
                            if (Float.compare(class6789.m10, this.m10) == 0) {
                                if (Float.compare(class6789.m11, this.m11) == 0) {
                                    if (Float.compare(class6789.m12, this.m12) == 0) {
                                        if (Float.compare(class6789.field26696, this.field26696) == 0) {
                                            if (Float.compare(class6789.m20, this.m20) == 0) {
                                                if (Float.compare(class6789.m21, this.m21) == 0) {
                                                    if (Float.compare(class6789.m22, this.m22) == 0) {
                                                        if (Float.compare(class6789.field26700, this.field26700) == 0) {
                                                            if (Float.compare(class6789.field26701, this.field26701) == 0) {
                                                                if (Float.compare(class6789.field26702, this.field26702) == 0) {
                                                                    if (Float.compare(class6789.field26703, this.field26703) == 0) {
                                                                        if (Float.compare(class6789.field26704, this.field26704) == 0) {
                                                                            return true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * ((this.m00 == 0.0f) ? 0 : Float.floatToIntBits(this.m00)) + ((this.m01 == 0.0f) ? 0 : Float.floatToIntBits(this.m01))) + ((this.m02 == 0.0f) ? 0 : Float.floatToIntBits(this.m02))) + ((this.field26692 == 0.0f) ? 0 : Float.floatToIntBits(this.field26692))) + ((this.m10 == 0.0f) ? 0 : Float.floatToIntBits(this.m10))) + ((this.m11 == 0.0f) ? 0 : Float.floatToIntBits(this.m11))) + ((this.m12 == 0.0f) ? 0 : Float.floatToIntBits(this.m12))) + ((this.field26696 == 0.0f) ? 0 : Float.floatToIntBits(this.field26696))) + ((this.m20 == 0.0f) ? 0 : Float.floatToIntBits(this.m20))) + ((this.m21 == 0.0f) ? 0 : Float.floatToIntBits(this.m21))) + ((this.m22 == 0.0f) ? 0 : Float.floatToIntBits(this.m22))) + ((this.field26700 == 0.0f) ? 0 : Float.floatToIntBits(this.field26700))) + ((this.field26701 == 0.0f) ? 0 : Float.floatToIntBits(this.field26701))) + ((this.field26702 == 0.0f) ? 0 : Float.floatToIntBits(this.field26702))) + ((this.field26703 == 0.0f) ? 0 : Float.floatToIntBits(this.field26703))) + ((this.field26704 == 0.0f) ? 0 : Float.floatToIntBits(this.field26704));
    }
    
    private static int method20746(final int n, final int n2) {
        return n2 * 4 + n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Matrix4f:\n");
        sb.append(this.m00);
        sb.append(" ");
        sb.append(this.m01);
        sb.append(" ");
        sb.append(this.m02);
        sb.append(" ");
        sb.append(this.field26692);
        sb.append("\n");
        sb.append(this.m10);
        sb.append(" ");
        sb.append(this.m11);
        sb.append(" ");
        sb.append(this.m12);
        sb.append(" ");
        sb.append(this.field26696);
        sb.append("\n");
        sb.append(this.m20);
        sb.append(" ");
        sb.append(this.m21);
        sb.append(" ");
        sb.append(this.m22);
        sb.append(" ");
        sb.append(this.field26700);
        sb.append("\n");
        sb.append(this.field26701);
        sb.append(" ");
        sb.append(this.field26702);
        sb.append(" ");
        sb.append(this.field26703);
        sb.append(" ");
        sb.append(this.field26704);
        sb.append("\n");
        return sb.toString();
    }
    
    public void method20747(final FloatBuffer floatBuffer) {
        floatBuffer.put(method20746(0, 0), this.m00);
        floatBuffer.put(method20746(0, 1), this.m01);
        floatBuffer.put(method20746(0, 2), this.m02);
        floatBuffer.put(method20746(0, 3), this.field26692);
        floatBuffer.put(method20746(1, 0), this.m10);
        floatBuffer.put(method20746(1, 1), this.m11);
        floatBuffer.put(method20746(1, 2), this.m12);
        floatBuffer.put(method20746(1, 3), this.field26696);
        floatBuffer.put(method20746(2, 0), this.m20);
        floatBuffer.put(method20746(2, 1), this.m21);
        floatBuffer.put(method20746(2, 2), this.m22);
        floatBuffer.put(method20746(2, 3), this.field26700);
        floatBuffer.put(method20746(3, 0), this.field26701);
        floatBuffer.put(method20746(3, 1), this.field26702);
        floatBuffer.put(method20746(3, 2), this.field26703);
        floatBuffer.put(method20746(3, 3), this.field26704);
    }
    
    public void method20748() {
        this.m00 = 1.0f;
        this.m01 = 0.0f;
        this.m02 = 0.0f;
        this.field26692 = 0.0f;
        this.m10 = 0.0f;
        this.m11 = 1.0f;
        this.m12 = 0.0f;
        this.field26696 = 0.0f;
        this.m20 = 0.0f;
        this.m21 = 0.0f;
        this.m22 = 1.0f;
        this.field26700 = 0.0f;
        this.field26701 = 0.0f;
        this.field26702 = 0.0f;
        this.field26703 = 0.0f;
        this.field26704 = 1.0f;
    }
    
    public float method20749() {
        final float n = this.m00 * this.m11 - this.m01 * this.m10;
        final float n2 = this.m00 * this.m12 - this.m02 * this.m10;
        final float n3 = this.m00 * this.field26696 - this.field26692 * this.m10;
        final float n4 = this.m01 * this.m12 - this.m02 * this.m11;
        final float n5 = this.m01 * this.field26696 - this.field26692 * this.m11;
        final float n6 = this.m02 * this.field26696 - this.field26692 * this.m12;
        final float n7 = this.m20 * this.field26702 - this.m21 * this.field26701;
        final float n8 = this.m20 * this.field26703 - this.m22 * this.field26701;
        final float n9 = this.m20 * this.field26704 - this.field26700 * this.field26701;
        final float n10 = this.m21 * this.field26703 - this.m22 * this.field26702;
        final float n11 = this.m21 * this.field26704 - this.field26700 * this.field26702;
        final float n12 = this.m22 * this.field26704 - this.field26700 * this.field26703;
        final float field26689 = this.m11 * n12 - this.m12 * n11 + this.field26696 * n10;
        final float field26690 = -this.m10 * n12 + this.m12 * n9 - this.field26696 * n8;
        final float field26691 = this.m10 * n11 - this.m11 * n9 + this.field26696 * n7;
        final float field26692 = -this.m10 * n10 + this.m11 * n8 - this.m12 * n7;
        final float field26693 = -this.m01 * n12 + this.m02 * n11 - this.field26692 * n10;
        final float field26694 = this.m00 * n12 - this.m02 * n9 + this.field26692 * n8;
        final float field26695 = -this.m00 * n11 + this.m01 * n9 - this.field26692 * n7;
        final float field26696 = this.m00 * n10 - this.m01 * n8 + this.m02 * n7;
        final float field26697 = this.field26702 * n6 - this.field26703 * n5 + this.field26704 * n4;
        final float field26698 = -this.field26701 * n6 + this.field26703 * n3 - this.field26704 * n2;
        final float field26699 = this.field26701 * n5 - this.field26702 * n3 + this.field26704 * n;
        final float field26700 = -this.field26701 * n4 + this.field26702 * n2 - this.field26703 * n;
        final float field26701 = -this.m21 * n6 + this.m22 * n5 - this.field26700 * n4;
        final float field26702 = this.m20 * n6 - this.m22 * n3 + this.field26700 * n2;
        final float field26703 = -this.m20 * n5 + this.m21 * n3 - this.field26700 * n;
        final float field26704 = this.m20 * n4 - this.m21 * n2 + this.m22 * n;
        this.m00 = field26689;
        this.m10 = field26690;
        this.m20 = field26691;
        this.field26701 = field26692;
        this.m01 = field26693;
        this.m11 = field26694;
        this.m21 = field26695;
        this.field26702 = field26696;
        this.m02 = field26697;
        this.m12 = field26698;
        this.m22 = field26699;
        this.field26703 = field26700;
        this.field26692 = field26701;
        this.field26696 = field26702;
        this.field26700 = field26703;
        this.field26704 = field26704;
        return n * n12 - n2 * n11 + n3 * n10 + n4 * n9 - n5 * n8 + n6 * n7;
    }
    
    public void method20750() {
        final float field26693 = this.m10;
        this.m10 = this.m01;
        this.m01 = field26693;
        final float field26694 = this.m20;
        this.m20 = this.m02;
        this.m02 = field26694;
        final float field26695 = this.m21;
        this.m21 = this.m12;
        this.m12 = field26695;
        final float field26696 = this.field26701;
        this.field26701 = this.field26692;
        this.field26692 = field26696;
        final float field26697 = this.field26702;
        this.field26702 = this.field26696;
        this.field26696 = field26697;
        final float field26698 = this.field26703;
        this.field26703 = this.field26700;
        this.field26700 = field26698;
    }
    
    public boolean method20751() {
        final float method20749 = this.method20749();
        if (Math.abs(method20749) <= 1.0E-6f) {
            return false;
        }
        this.method20754(method20749);
        return true;
    }
    
    public void method20752(final Matrix4f class6789) {
        final float field26689 = this.m00 * class6789.m00 + this.m01 * class6789.m10 + this.m02 * class6789.m20 + this.field26692 * class6789.field26701;
        final float field26690 = this.m00 * class6789.m01 + this.m01 * class6789.m11 + this.m02 * class6789.m21 + this.field26692 * class6789.field26702;
        final float field26691 = this.m00 * class6789.m02 + this.m01 * class6789.m12 + this.m02 * class6789.m22 + this.field26692 * class6789.field26703;
        final float field26692 = this.m00 * class6789.field26692 + this.m01 * class6789.field26696 + this.m02 * class6789.field26700 + this.field26692 * class6789.field26704;
        final float field26693 = this.m10 * class6789.m00 + this.m11 * class6789.m10 + this.m12 * class6789.m20 + this.field26696 * class6789.field26701;
        final float field26694 = this.m10 * class6789.m01 + this.m11 * class6789.m11 + this.m12 * class6789.m21 + this.field26696 * class6789.field26702;
        final float field26695 = this.m10 * class6789.m02 + this.m11 * class6789.m12 + this.m12 * class6789.m22 + this.field26696 * class6789.field26703;
        final float field26696 = this.m10 * class6789.field26692 + this.m11 * class6789.field26696 + this.m12 * class6789.field26700 + this.field26696 * class6789.field26704;
        final float field26697 = this.m20 * class6789.m00 + this.m21 * class6789.m10 + this.m22 * class6789.m20 + this.field26700 * class6789.field26701;
        final float field26698 = this.m20 * class6789.m01 + this.m21 * class6789.m11 + this.m22 * class6789.m21 + this.field26700 * class6789.field26702;
        final float field26699 = this.m20 * class6789.m02 + this.m21 * class6789.m12 + this.m22 * class6789.m22 + this.field26700 * class6789.field26703;
        final float field26700 = this.m20 * class6789.field26692 + this.m21 * class6789.field26696 + this.m22 * class6789.field26700 + this.field26700 * class6789.field26704;
        final float field26701 = this.field26701 * class6789.m00 + this.field26702 * class6789.m10 + this.field26703 * class6789.m20 + this.field26704 * class6789.field26701;
        final float field26702 = this.field26701 * class6789.m01 + this.field26702 * class6789.m11 + this.field26703 * class6789.m21 + this.field26704 * class6789.field26702;
        final float field26703 = this.field26701 * class6789.m02 + this.field26702 * class6789.m12 + this.field26703 * class6789.m22 + this.field26704 * class6789.field26703;
        final float field26704 = this.field26701 * class6789.field26692 + this.field26702 * class6789.field26696 + this.field26703 * class6789.field26700 + this.field26704 * class6789.field26704;
        this.m00 = field26689;
        this.m01 = field26690;
        this.m02 = field26691;
        this.field26692 = field26692;
        this.m10 = field26693;
        this.m11 = field26694;
        this.m12 = field26695;
        this.field26696 = field26696;
        this.m20 = field26697;
        this.m21 = field26698;
        this.m22 = field26699;
        this.field26700 = field26700;
        this.field26701 = field26701;
        this.field26702 = field26702;
        this.field26703 = field26703;
        this.field26704 = field26704;
    }
    
    public void method20753(final Quaternion class9389) {
        final float method34899 = class9389.getX();
        final float method34900 = class9389.getY();
        final float method34901 = class9389.getZ();
        final float method34902 = class9389.getW();
        final float n = 2.0f * method34899 * method34899;
        final float n2 = 2.0f * method34900 * method34900;
        final float n3 = 2.0f * method34901 * method34901;
        final float n4 = method34899 * method34900;
        final float n5 = method34900 * method34901;
        final float n6 = method34901 * method34899;
        final float n7 = method34899 * method34902;
        final float n8 = method34900 * method34902;
        final float n9 = method34901 * method34902;
        final float n10 = 1.0f - n2 - n3;
        final float n11 = 2.0f * (n4 - n9);
        final float n12 = 2.0f * (n6 + n8);
        final float n13 = 0.0f;
        final float n14 = 2.0f * (n4 + n9);
        final float n15 = 1.0f - n3 - n;
        final float n16 = 2.0f * (n5 - n7);
        final float n17 = 0.0f;
        final float n18 = 2.0f * (n6 - n8);
        final float n19 = 2.0f * (n5 + n7);
        final float n20 = 1.0f - n - n2;
        final float n21 = 0.0f;
        final float n22 = 0.0f;
        final float n23 = 0.0f;
        final float n24 = 0.0f;
        final float n25 = 1.0f;
        final float field26689 = this.m00 * n10 + this.m01 * n14 + this.m02 * n18 + this.field26692 * n22;
        final float field26690 = this.m00 * n11 + this.m01 * n15 + this.m02 * n19 + this.field26692 * n23;
        final float field26691 = this.m00 * n12 + this.m01 * n16 + this.m02 * n20 + this.field26692 * n24;
        final float field26692 = this.m00 * n13 + this.m01 * n17 + this.m02 * n21 + this.field26692 * n25;
        final float field26693 = this.m10 * n10 + this.m11 * n14 + this.m12 * n18 + this.field26696 * n22;
        final float field26694 = this.m10 * n11 + this.m11 * n15 + this.m12 * n19 + this.field26696 * n23;
        final float field26695 = this.m10 * n12 + this.m11 * n16 + this.m12 * n20 + this.field26696 * n24;
        final float field26696 = this.m10 * n13 + this.m11 * n17 + this.m12 * n21 + this.field26696 * n25;
        final float field26697 = this.m20 * n10 + this.m21 * n14 + this.m22 * n18 + this.field26700 * n22;
        final float field26698 = this.m20 * n11 + this.m21 * n15 + this.m22 * n19 + this.field26700 * n23;
        final float field26699 = this.m20 * n12 + this.m21 * n16 + this.m22 * n20 + this.field26700 * n24;
        final float field26700 = this.m20 * n13 + this.m21 * n17 + this.m22 * n21 + this.field26700 * n25;
        final float field26701 = this.field26701 * n10 + this.field26702 * n14 + this.field26703 * n18 + this.field26704 * n22;
        final float field26702 = this.field26701 * n11 + this.field26702 * n15 + this.field26703 * n19 + this.field26704 * n23;
        final float field26703 = this.field26701 * n12 + this.field26702 * n16 + this.field26703 * n20 + this.field26704 * n24;
        final float field26704 = this.field26701 * n13 + this.field26702 * n17 + this.field26703 * n21 + this.field26704 * n25;
        this.m00 = field26689;
        this.m01 = field26690;
        this.m02 = field26691;
        this.field26692 = field26692;
        this.m10 = field26693;
        this.m11 = field26694;
        this.m12 = field26695;
        this.field26696 = field26696;
        this.m20 = field26697;
        this.m21 = field26698;
        this.m22 = field26699;
        this.field26700 = field26700;
        this.field26701 = field26701;
        this.field26702 = field26702;
        this.field26703 = field26703;
        this.field26704 = field26704;
    }
    
    public void method20754(final float n) {
        this.m00 *= n;
        this.m01 *= n;
        this.m02 *= n;
        this.field26692 *= n;
        this.m10 *= n;
        this.m11 *= n;
        this.m12 *= n;
        this.field26696 *= n;
        this.m20 *= n;
        this.m21 *= n;
        this.m22 *= n;
        this.field26700 *= n;
        this.field26701 *= n;
        this.field26702 *= n;
        this.field26703 *= n;
        this.field26704 *= n;
    }
    
    public static Matrix4f method20755(final double n, final float n2, final float n3, final float n4) {
        final float field26694 = (float)(1.0 / Math.tan(n * 0.01745329238474369 / 2.0));
        final Matrix4f class6789 = new Matrix4f();
        class6789.m00 = field26694 / n2;
        class6789.m11 = field26694;
        class6789.m22 = (n4 + n3) / (n3 - n4);
        class6789.field26703 = -1.0f;
        class6789.field26700 = 2.0f * n4 * n3 / (n3 - n4);
        return class6789;
    }
    
    public static Matrix4f method20756(final float n, final float n2, final float n3, final float n4) {
        final Matrix4f class6789 = new Matrix4f();
        class6789.m00 = 2.0f / n;
        class6789.m11 = 2.0f / n2;
        final float n5 = n4 - n3;
        class6789.m22 = -2.0f / n5;
        class6789.field26704 = 1.0f;
        class6789.field26692 = -1.0f;
        class6789.field26696 = -1.0f;
        class6789.field26700 = -(n4 + n3) / n5;
        return class6789;
    }
    
    public void method20757(final Vector3f class9138) {
        this.field26692 += class9138.getX();
        this.field26696 += class9138.getY();
        this.field26700 += class9138.getZ();
    }
    
    public Matrix4f method20758() {
        return new Matrix4f(this);
    }
    
    public static Matrix4f method20759(final float field26689, final float field26690, final float field26691) {
        final Matrix4f class6789 = new Matrix4f();
        class6789.m00 = field26689;
        class6789.m11 = field26690;
        class6789.m22 = field26691;
        class6789.field26704 = 1.0f;
        return class6789;
    }
    
    public static Matrix4f method20760(final float field26692, final float field26693, final float field26694) {
        final Matrix4f class6789 = new Matrix4f();
        class6789.m00 = 1.0f;
        class6789.m11 = 1.0f;
        class6789.m22 = 1.0f;
        class6789.field26704 = 1.0f;
        class6789.field26692 = field26692;
        class6789.field26696 = field26693;
        class6789.field26700 = field26694;
        return class6789;
    }
    
    public float method20761(final float n, final float n2, final float n3, final float n4) {
        return this.m00 * n + this.m01 * n2 + this.m02 * n3 + this.field26692 * n4;
    }
    
    public float method20762(final float n, final float n2, final float n3, final float n4) {
        return this.m10 * n + this.m11 * n2 + this.m12 * n3 + this.field26696 * n4;
    }
    
    public float method20763(final float n, final float n2, final float n3, final float n4) {
        return this.m20 * n + this.m21 * n2 + this.m22 * n3 + this.field26700 * n4;
    }
    
    public float method20764(final float n, final float n2, final float n3, final float n4) {
        return this.field26701 * n + this.field26702 * n2 + this.field26703 * n3 + this.field26704 * n4;
    }
    
    public void method20765(final float n, final float n2, final float n3) {
        this.field26692 += this.m00 * n + this.m01 * n2 + this.m02 * n3;
        this.field26696 += this.m10 * n + this.m11 * n2 + this.m12 * n3;
        this.field26700 += this.m20 * n + this.m21 * n2 + this.m22 * n3;
        this.field26704 += this.field26701 * n + this.field26702 * n2 + this.field26703 * n3;
    }
    
    public void method20766(final float n, final float n2, final float n3) {
        this.m00 *= n;
        this.m01 *= n2;
        this.m02 *= n3;
        this.m10 *= n;
        this.m11 *= n2;
        this.m12 *= n3;
        this.m20 *= n;
        this.m21 *= n2;
        this.m22 *= n3;
        this.field26701 *= n;
        this.field26702 *= n2;
        this.field26703 *= n3;
    }
    
    public void method20767(final Random random) {
        this.m00 = random.nextFloat();
        this.m01 = random.nextFloat();
        this.m02 = random.nextFloat();
        this.field26692 = random.nextFloat();
        this.m10 = random.nextFloat();
        this.m11 = random.nextFloat();
        this.m12 = random.nextFloat();
        this.field26696 = random.nextFloat();
        this.m20 = random.nextFloat();
        this.m21 = random.nextFloat();
        this.m22 = random.nextFloat();
        this.field26700 = random.nextFloat();
        this.field26701 = random.nextFloat();
        this.field26702 = random.nextFloat();
        this.field26703 = random.nextFloat();
        this.field26704 = random.nextFloat();
    }
    
    public void method20768(final float[] array) {
        array[0] = this.m00;
        array[1] = this.m01;
        array[2] = this.m02;
        array[3] = this.field26692;
        array[4] = this.m10;
        array[5] = this.m11;
        array[6] = this.m12;
        array[7] = this.field26696;
        array[8] = this.m20;
        array[9] = this.m21;
        array[10] = this.m22;
        array[11] = this.field26700;
        array[12] = this.field26701;
        array[13] = this.field26702;
        array[14] = this.field26703;
        array[15] = this.field26704;
    }
    
    public Matrix4f(final float[] array) {
        this.m00 = array[0];
        this.m01 = array[1];
        this.m02 = array[2];
        this.field26692 = array[3];
        this.m10 = array[4];
        this.m11 = array[5];
        this.m12 = array[6];
        this.field26696 = array[7];
        this.m20 = array[8];
        this.m21 = array[9];
        this.m22 = array[10];
        this.field26700 = array[11];
        this.field26701 = array[12];
        this.field26702 = array[13];
        this.field26703 = array[14];
        this.field26704 = array[15];
    }
    
    public void method20769(final Matrix4f class6789) {
        this.m00 = class6789.m00;
        this.m01 = class6789.m01;
        this.m02 = class6789.m02;
        this.field26692 = class6789.field26692;
        this.m10 = class6789.m10;
        this.m11 = class6789.m11;
        this.m12 = class6789.m12;
        this.field26696 = class6789.field26696;
        this.m20 = class6789.m20;
        this.m21 = class6789.m21;
        this.m22 = class6789.m22;
        this.field26700 = class6789.field26700;
        this.field26701 = class6789.field26701;
        this.field26702 = class6789.field26702;
        this.field26703 = class6789.field26703;
        this.field26704 = class6789.field26704;
    }
    
    public void method20770(final Matrix4f class6789) {
        this.m00 += class6789.m00;
        this.m01 += class6789.m01;
        this.m02 += class6789.m02;
        this.field26692 += class6789.field26692;
        this.m10 += class6789.m10;
        this.m11 += class6789.m11;
        this.m12 += class6789.m12;
        this.field26696 += class6789.field26696;
        this.m20 += class6789.m20;
        this.m21 += class6789.m21;
        this.m22 += class6789.m22;
        this.field26700 += class6789.field26700;
        this.field26701 += class6789.field26701;
        this.field26702 += class6789.field26702;
        this.field26703 += class6789.field26703;
        this.field26704 += class6789.field26704;
    }
    
    public void method20771(final Matrix4f class6789) {
        final Matrix4f method20758 = class6789.method20758();
        method20758.method20752(this);
        this.method20769(method20758);
    }
    
    public void method20772(final float field26692, final float field26693, final float field26694) {
        this.m00 = 1.0f;
        this.m11 = 1.0f;
        this.m22 = 1.0f;
        this.field26704 = 1.0f;
        this.field26692 = field26692;
        this.field26696 = field26693;
        this.field26700 = field26694;
    }
}
