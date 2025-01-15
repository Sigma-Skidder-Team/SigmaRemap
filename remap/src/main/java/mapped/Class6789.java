// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.nio.FloatBuffer;

public final class Class6789
{
    public float field26689;
    public float field26690;
    public float field26691;
    public float field26692;
    public float field26693;
    public float field26694;
    public float field26695;
    public float field26696;
    public float field26697;
    public float field26698;
    public float field26699;
    public float field26700;
    public float field26701;
    public float field26702;
    public float field26703;
    public float field26704;
    
    public Class6789() {
    }
    
    public Class6789(final Class6789 class6789) {
        this.field26689 = class6789.field26689;
        this.field26690 = class6789.field26690;
        this.field26691 = class6789.field26691;
        this.field26692 = class6789.field26692;
        this.field26693 = class6789.field26693;
        this.field26694 = class6789.field26694;
        this.field26695 = class6789.field26695;
        this.field26696 = class6789.field26696;
        this.field26697 = class6789.field26697;
        this.field26698 = class6789.field26698;
        this.field26699 = class6789.field26699;
        this.field26700 = class6789.field26700;
        this.field26701 = class6789.field26701;
        this.field26702 = class6789.field26702;
        this.field26703 = class6789.field26703;
        this.field26704 = class6789.field26704;
    }
    
    public Class6789(final Quaternion class9389) {
        final float method34899 = class9389.method34899();
        final float method34900 = class9389.method34900();
        final float method34901 = class9389.method34901();
        final float method34902 = class9389.method34902();
        final float n = 2.0f * method34899 * method34899;
        final float n2 = 2.0f * method34900 * method34900;
        final float n3 = 2.0f * method34901 * method34901;
        this.field26689 = 1.0f - n2 - n3;
        this.field26694 = 1.0f - n3 - n;
        this.field26699 = 1.0f - n - n2;
        this.field26704 = 1.0f;
        final float n4 = method34899 * method34900;
        final float n5 = method34900 * method34901;
        final float n6 = method34901 * method34899;
        final float n7 = method34899 * method34902;
        final float n8 = method34900 * method34902;
        final float n9 = method34901 * method34902;
        this.field26693 = 2.0f * (n4 + n9);
        this.field26690 = 2.0f * (n4 - n9);
        this.field26697 = 2.0f * (n6 - n8);
        this.field26691 = 2.0f * (n6 + n8);
        this.field26698 = 2.0f * (n5 + n7);
        this.field26695 = 2.0f * (n5 - n7);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class6789 class6789 = (Class6789)o;
            if (Float.compare(class6789.field26689, this.field26689) == 0) {
                if (Float.compare(class6789.field26690, this.field26690) == 0) {
                    if (Float.compare(class6789.field26691, this.field26691) == 0) {
                        if (Float.compare(class6789.field26692, this.field26692) == 0) {
                            if (Float.compare(class6789.field26693, this.field26693) == 0) {
                                if (Float.compare(class6789.field26694, this.field26694) == 0) {
                                    if (Float.compare(class6789.field26695, this.field26695) == 0) {
                                        if (Float.compare(class6789.field26696, this.field26696) == 0) {
                                            if (Float.compare(class6789.field26697, this.field26697) == 0) {
                                                if (Float.compare(class6789.field26698, this.field26698) == 0) {
                                                    if (Float.compare(class6789.field26699, this.field26699) == 0) {
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
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * ((this.field26689 == 0.0f) ? 0 : Float.floatToIntBits(this.field26689)) + ((this.field26690 == 0.0f) ? 0 : Float.floatToIntBits(this.field26690))) + ((this.field26691 == 0.0f) ? 0 : Float.floatToIntBits(this.field26691))) + ((this.field26692 == 0.0f) ? 0 : Float.floatToIntBits(this.field26692))) + ((this.field26693 == 0.0f) ? 0 : Float.floatToIntBits(this.field26693))) + ((this.field26694 == 0.0f) ? 0 : Float.floatToIntBits(this.field26694))) + ((this.field26695 == 0.0f) ? 0 : Float.floatToIntBits(this.field26695))) + ((this.field26696 == 0.0f) ? 0 : Float.floatToIntBits(this.field26696))) + ((this.field26697 == 0.0f) ? 0 : Float.floatToIntBits(this.field26697))) + ((this.field26698 == 0.0f) ? 0 : Float.floatToIntBits(this.field26698))) + ((this.field26699 == 0.0f) ? 0 : Float.floatToIntBits(this.field26699))) + ((this.field26700 == 0.0f) ? 0 : Float.floatToIntBits(this.field26700))) + ((this.field26701 == 0.0f) ? 0 : Float.floatToIntBits(this.field26701))) + ((this.field26702 == 0.0f) ? 0 : Float.floatToIntBits(this.field26702))) + ((this.field26703 == 0.0f) ? 0 : Float.floatToIntBits(this.field26703))) + ((this.field26704 == 0.0f) ? 0 : Float.floatToIntBits(this.field26704));
    }
    
    private static int method20746(final int n, final int n2) {
        return n2 * 4 + n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Matrix4f:\n");
        sb.append(this.field26689);
        sb.append(" ");
        sb.append(this.field26690);
        sb.append(" ");
        sb.append(this.field26691);
        sb.append(" ");
        sb.append(this.field26692);
        sb.append("\n");
        sb.append(this.field26693);
        sb.append(" ");
        sb.append(this.field26694);
        sb.append(" ");
        sb.append(this.field26695);
        sb.append(" ");
        sb.append(this.field26696);
        sb.append("\n");
        sb.append(this.field26697);
        sb.append(" ");
        sb.append(this.field26698);
        sb.append(" ");
        sb.append(this.field26699);
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
        floatBuffer.put(method20746(0, 0), this.field26689);
        floatBuffer.put(method20746(0, 1), this.field26690);
        floatBuffer.put(method20746(0, 2), this.field26691);
        floatBuffer.put(method20746(0, 3), this.field26692);
        floatBuffer.put(method20746(1, 0), this.field26693);
        floatBuffer.put(method20746(1, 1), this.field26694);
        floatBuffer.put(method20746(1, 2), this.field26695);
        floatBuffer.put(method20746(1, 3), this.field26696);
        floatBuffer.put(method20746(2, 0), this.field26697);
        floatBuffer.put(method20746(2, 1), this.field26698);
        floatBuffer.put(method20746(2, 2), this.field26699);
        floatBuffer.put(method20746(2, 3), this.field26700);
        floatBuffer.put(method20746(3, 0), this.field26701);
        floatBuffer.put(method20746(3, 1), this.field26702);
        floatBuffer.put(method20746(3, 2), this.field26703);
        floatBuffer.put(method20746(3, 3), this.field26704);
    }
    
    public void method20748() {
        this.field26689 = 1.0f;
        this.field26690 = 0.0f;
        this.field26691 = 0.0f;
        this.field26692 = 0.0f;
        this.field26693 = 0.0f;
        this.field26694 = 1.0f;
        this.field26695 = 0.0f;
        this.field26696 = 0.0f;
        this.field26697 = 0.0f;
        this.field26698 = 0.0f;
        this.field26699 = 1.0f;
        this.field26700 = 0.0f;
        this.field26701 = 0.0f;
        this.field26702 = 0.0f;
        this.field26703 = 0.0f;
        this.field26704 = 1.0f;
    }
    
    public float method20749() {
        final float n = this.field26689 * this.field26694 - this.field26690 * this.field26693;
        final float n2 = this.field26689 * this.field26695 - this.field26691 * this.field26693;
        final float n3 = this.field26689 * this.field26696 - this.field26692 * this.field26693;
        final float n4 = this.field26690 * this.field26695 - this.field26691 * this.field26694;
        final float n5 = this.field26690 * this.field26696 - this.field26692 * this.field26694;
        final float n6 = this.field26691 * this.field26696 - this.field26692 * this.field26695;
        final float n7 = this.field26697 * this.field26702 - this.field26698 * this.field26701;
        final float n8 = this.field26697 * this.field26703 - this.field26699 * this.field26701;
        final float n9 = this.field26697 * this.field26704 - this.field26700 * this.field26701;
        final float n10 = this.field26698 * this.field26703 - this.field26699 * this.field26702;
        final float n11 = this.field26698 * this.field26704 - this.field26700 * this.field26702;
        final float n12 = this.field26699 * this.field26704 - this.field26700 * this.field26703;
        final float field26689 = this.field26694 * n12 - this.field26695 * n11 + this.field26696 * n10;
        final float field26690 = -this.field26693 * n12 + this.field26695 * n9 - this.field26696 * n8;
        final float field26691 = this.field26693 * n11 - this.field26694 * n9 + this.field26696 * n7;
        final float field26692 = -this.field26693 * n10 + this.field26694 * n8 - this.field26695 * n7;
        final float field26693 = -this.field26690 * n12 + this.field26691 * n11 - this.field26692 * n10;
        final float field26694 = this.field26689 * n12 - this.field26691 * n9 + this.field26692 * n8;
        final float field26695 = -this.field26689 * n11 + this.field26690 * n9 - this.field26692 * n7;
        final float field26696 = this.field26689 * n10 - this.field26690 * n8 + this.field26691 * n7;
        final float field26697 = this.field26702 * n6 - this.field26703 * n5 + this.field26704 * n4;
        final float field26698 = -this.field26701 * n6 + this.field26703 * n3 - this.field26704 * n2;
        final float field26699 = this.field26701 * n5 - this.field26702 * n3 + this.field26704 * n;
        final float field26700 = -this.field26701 * n4 + this.field26702 * n2 - this.field26703 * n;
        final float field26701 = -this.field26698 * n6 + this.field26699 * n5 - this.field26700 * n4;
        final float field26702 = this.field26697 * n6 - this.field26699 * n3 + this.field26700 * n2;
        final float field26703 = -this.field26697 * n5 + this.field26698 * n3 - this.field26700 * n;
        final float field26704 = this.field26697 * n4 - this.field26698 * n2 + this.field26699 * n;
        this.field26689 = field26689;
        this.field26693 = field26690;
        this.field26697 = field26691;
        this.field26701 = field26692;
        this.field26690 = field26693;
        this.field26694 = field26694;
        this.field26698 = field26695;
        this.field26702 = field26696;
        this.field26691 = field26697;
        this.field26695 = field26698;
        this.field26699 = field26699;
        this.field26703 = field26700;
        this.field26692 = field26701;
        this.field26696 = field26702;
        this.field26700 = field26703;
        this.field26704 = field26704;
        return n * n12 - n2 * n11 + n3 * n10 + n4 * n9 - n5 * n8 + n6 * n7;
    }
    
    public void method20750() {
        final float field26693 = this.field26693;
        this.field26693 = this.field26690;
        this.field26690 = field26693;
        final float field26694 = this.field26697;
        this.field26697 = this.field26691;
        this.field26691 = field26694;
        final float field26695 = this.field26698;
        this.field26698 = this.field26695;
        this.field26695 = field26695;
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
    
    public void method20752(final Class6789 class6789) {
        final float field26689 = this.field26689 * class6789.field26689 + this.field26690 * class6789.field26693 + this.field26691 * class6789.field26697 + this.field26692 * class6789.field26701;
        final float field26690 = this.field26689 * class6789.field26690 + this.field26690 * class6789.field26694 + this.field26691 * class6789.field26698 + this.field26692 * class6789.field26702;
        final float field26691 = this.field26689 * class6789.field26691 + this.field26690 * class6789.field26695 + this.field26691 * class6789.field26699 + this.field26692 * class6789.field26703;
        final float field26692 = this.field26689 * class6789.field26692 + this.field26690 * class6789.field26696 + this.field26691 * class6789.field26700 + this.field26692 * class6789.field26704;
        final float field26693 = this.field26693 * class6789.field26689 + this.field26694 * class6789.field26693 + this.field26695 * class6789.field26697 + this.field26696 * class6789.field26701;
        final float field26694 = this.field26693 * class6789.field26690 + this.field26694 * class6789.field26694 + this.field26695 * class6789.field26698 + this.field26696 * class6789.field26702;
        final float field26695 = this.field26693 * class6789.field26691 + this.field26694 * class6789.field26695 + this.field26695 * class6789.field26699 + this.field26696 * class6789.field26703;
        final float field26696 = this.field26693 * class6789.field26692 + this.field26694 * class6789.field26696 + this.field26695 * class6789.field26700 + this.field26696 * class6789.field26704;
        final float field26697 = this.field26697 * class6789.field26689 + this.field26698 * class6789.field26693 + this.field26699 * class6789.field26697 + this.field26700 * class6789.field26701;
        final float field26698 = this.field26697 * class6789.field26690 + this.field26698 * class6789.field26694 + this.field26699 * class6789.field26698 + this.field26700 * class6789.field26702;
        final float field26699 = this.field26697 * class6789.field26691 + this.field26698 * class6789.field26695 + this.field26699 * class6789.field26699 + this.field26700 * class6789.field26703;
        final float field26700 = this.field26697 * class6789.field26692 + this.field26698 * class6789.field26696 + this.field26699 * class6789.field26700 + this.field26700 * class6789.field26704;
        final float field26701 = this.field26701 * class6789.field26689 + this.field26702 * class6789.field26693 + this.field26703 * class6789.field26697 + this.field26704 * class6789.field26701;
        final float field26702 = this.field26701 * class6789.field26690 + this.field26702 * class6789.field26694 + this.field26703 * class6789.field26698 + this.field26704 * class6789.field26702;
        final float field26703 = this.field26701 * class6789.field26691 + this.field26702 * class6789.field26695 + this.field26703 * class6789.field26699 + this.field26704 * class6789.field26703;
        final float field26704 = this.field26701 * class6789.field26692 + this.field26702 * class6789.field26696 + this.field26703 * class6789.field26700 + this.field26704 * class6789.field26704;
        this.field26689 = field26689;
        this.field26690 = field26690;
        this.field26691 = field26691;
        this.field26692 = field26692;
        this.field26693 = field26693;
        this.field26694 = field26694;
        this.field26695 = field26695;
        this.field26696 = field26696;
        this.field26697 = field26697;
        this.field26698 = field26698;
        this.field26699 = field26699;
        this.field26700 = field26700;
        this.field26701 = field26701;
        this.field26702 = field26702;
        this.field26703 = field26703;
        this.field26704 = field26704;
    }
    
    public void method20753(final Quaternion class9389) {
        final float method34899 = class9389.method34899();
        final float method34900 = class9389.method34900();
        final float method34901 = class9389.method34901();
        final float method34902 = class9389.method34902();
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
        final float field26689 = this.field26689 * n10 + this.field26690 * n14 + this.field26691 * n18 + this.field26692 * n22;
        final float field26690 = this.field26689 * n11 + this.field26690 * n15 + this.field26691 * n19 + this.field26692 * n23;
        final float field26691 = this.field26689 * n12 + this.field26690 * n16 + this.field26691 * n20 + this.field26692 * n24;
        final float field26692 = this.field26689 * n13 + this.field26690 * n17 + this.field26691 * n21 + this.field26692 * n25;
        final float field26693 = this.field26693 * n10 + this.field26694 * n14 + this.field26695 * n18 + this.field26696 * n22;
        final float field26694 = this.field26693 * n11 + this.field26694 * n15 + this.field26695 * n19 + this.field26696 * n23;
        final float field26695 = this.field26693 * n12 + this.field26694 * n16 + this.field26695 * n20 + this.field26696 * n24;
        final float field26696 = this.field26693 * n13 + this.field26694 * n17 + this.field26695 * n21 + this.field26696 * n25;
        final float field26697 = this.field26697 * n10 + this.field26698 * n14 + this.field26699 * n18 + this.field26700 * n22;
        final float field26698 = this.field26697 * n11 + this.field26698 * n15 + this.field26699 * n19 + this.field26700 * n23;
        final float field26699 = this.field26697 * n12 + this.field26698 * n16 + this.field26699 * n20 + this.field26700 * n24;
        final float field26700 = this.field26697 * n13 + this.field26698 * n17 + this.field26699 * n21 + this.field26700 * n25;
        final float field26701 = this.field26701 * n10 + this.field26702 * n14 + this.field26703 * n18 + this.field26704 * n22;
        final float field26702 = this.field26701 * n11 + this.field26702 * n15 + this.field26703 * n19 + this.field26704 * n23;
        final float field26703 = this.field26701 * n12 + this.field26702 * n16 + this.field26703 * n20 + this.field26704 * n24;
        final float field26704 = this.field26701 * n13 + this.field26702 * n17 + this.field26703 * n21 + this.field26704 * n25;
        this.field26689 = field26689;
        this.field26690 = field26690;
        this.field26691 = field26691;
        this.field26692 = field26692;
        this.field26693 = field26693;
        this.field26694 = field26694;
        this.field26695 = field26695;
        this.field26696 = field26696;
        this.field26697 = field26697;
        this.field26698 = field26698;
        this.field26699 = field26699;
        this.field26700 = field26700;
        this.field26701 = field26701;
        this.field26702 = field26702;
        this.field26703 = field26703;
        this.field26704 = field26704;
    }
    
    public void method20754(final float n) {
        this.field26689 *= n;
        this.field26690 *= n;
        this.field26691 *= n;
        this.field26692 *= n;
        this.field26693 *= n;
        this.field26694 *= n;
        this.field26695 *= n;
        this.field26696 *= n;
        this.field26697 *= n;
        this.field26698 *= n;
        this.field26699 *= n;
        this.field26700 *= n;
        this.field26701 *= n;
        this.field26702 *= n;
        this.field26703 *= n;
        this.field26704 *= n;
    }
    
    public static Class6789 method20755(final double n, final float n2, final float n3, final float n4) {
        final float field26694 = (float)(1.0 / Math.tan(n * 0.01745329238474369 / 2.0));
        final Class6789 class6789 = new Class6789();
        class6789.field26689 = field26694 / n2;
        class6789.field26694 = field26694;
        class6789.field26699 = (n4 + n3) / (n3 - n4);
        class6789.field26703 = -1.0f;
        class6789.field26700 = 2.0f * n4 * n3 / (n3 - n4);
        return class6789;
    }
    
    public static Class6789 method20756(final float n, final float n2, final float n3, final float n4) {
        final Class6789 class6789 = new Class6789();
        class6789.field26689 = 2.0f / n;
        class6789.field26694 = 2.0f / n2;
        final float n5 = n4 - n3;
        class6789.field26699 = -2.0f / n5;
        class6789.field26704 = 1.0f;
        class6789.field26692 = -1.0f;
        class6789.field26696 = -1.0f;
        class6789.field26700 = -(n4 + n3) / n5;
        return class6789;
    }
    
    public void method20757(final Vector3f class9138) {
        this.field26692 += class9138.method33311();
        this.field26696 += class9138.method33312();
        this.field26700 += class9138.method33313();
    }
    
    public Class6789 method20758() {
        return new Class6789(this);
    }
    
    public static Class6789 method20759(final float field26689, final float field26690, final float field26691) {
        final Class6789 class6789 = new Class6789();
        class6789.field26689 = field26689;
        class6789.field26694 = field26690;
        class6789.field26699 = field26691;
        class6789.field26704 = 1.0f;
        return class6789;
    }
    
    public static Class6789 method20760(final float field26692, final float field26693, final float field26694) {
        final Class6789 class6789 = new Class6789();
        class6789.field26689 = 1.0f;
        class6789.field26694 = 1.0f;
        class6789.field26699 = 1.0f;
        class6789.field26704 = 1.0f;
        class6789.field26692 = field26692;
        class6789.field26696 = field26693;
        class6789.field26700 = field26694;
        return class6789;
    }
    
    public float method20761(final float n, final float n2, final float n3, final float n4) {
        return this.field26689 * n + this.field26690 * n2 + this.field26691 * n3 + this.field26692 * n4;
    }
    
    public float method20762(final float n, final float n2, final float n3, final float n4) {
        return this.field26693 * n + this.field26694 * n2 + this.field26695 * n3 + this.field26696 * n4;
    }
    
    public float method20763(final float n, final float n2, final float n3, final float n4) {
        return this.field26697 * n + this.field26698 * n2 + this.field26699 * n3 + this.field26700 * n4;
    }
    
    public float method20764(final float n, final float n2, final float n3, final float n4) {
        return this.field26701 * n + this.field26702 * n2 + this.field26703 * n3 + this.field26704 * n4;
    }
    
    public void method20765(final float n, final float n2, final float n3) {
        this.field26692 += this.field26689 * n + this.field26690 * n2 + this.field26691 * n3;
        this.field26696 += this.field26693 * n + this.field26694 * n2 + this.field26695 * n3;
        this.field26700 += this.field26697 * n + this.field26698 * n2 + this.field26699 * n3;
        this.field26704 += this.field26701 * n + this.field26702 * n2 + this.field26703 * n3;
    }
    
    public void method20766(final float n, final float n2, final float n3) {
        this.field26689 *= n;
        this.field26690 *= n2;
        this.field26691 *= n3;
        this.field26693 *= n;
        this.field26694 *= n2;
        this.field26695 *= n3;
        this.field26697 *= n;
        this.field26698 *= n2;
        this.field26699 *= n3;
        this.field26701 *= n;
        this.field26702 *= n2;
        this.field26703 *= n3;
    }
    
    public void method20767(final Random random) {
        this.field26689 = random.nextFloat();
        this.field26690 = random.nextFloat();
        this.field26691 = random.nextFloat();
        this.field26692 = random.nextFloat();
        this.field26693 = random.nextFloat();
        this.field26694 = random.nextFloat();
        this.field26695 = random.nextFloat();
        this.field26696 = random.nextFloat();
        this.field26697 = random.nextFloat();
        this.field26698 = random.nextFloat();
        this.field26699 = random.nextFloat();
        this.field26700 = random.nextFloat();
        this.field26701 = random.nextFloat();
        this.field26702 = random.nextFloat();
        this.field26703 = random.nextFloat();
        this.field26704 = random.nextFloat();
    }
    
    public void method20768(final float[] array) {
        array[0] = this.field26689;
        array[1] = this.field26690;
        array[2] = this.field26691;
        array[3] = this.field26692;
        array[4] = this.field26693;
        array[5] = this.field26694;
        array[6] = this.field26695;
        array[7] = this.field26696;
        array[8] = this.field26697;
        array[9] = this.field26698;
        array[10] = this.field26699;
        array[11] = this.field26700;
        array[12] = this.field26701;
        array[13] = this.field26702;
        array[14] = this.field26703;
        array[15] = this.field26704;
    }
    
    public Class6789(final float[] array) {
        this.field26689 = array[0];
        this.field26690 = array[1];
        this.field26691 = array[2];
        this.field26692 = array[3];
        this.field26693 = array[4];
        this.field26694 = array[5];
        this.field26695 = array[6];
        this.field26696 = array[7];
        this.field26697 = array[8];
        this.field26698 = array[9];
        this.field26699 = array[10];
        this.field26700 = array[11];
        this.field26701 = array[12];
        this.field26702 = array[13];
        this.field26703 = array[14];
        this.field26704 = array[15];
    }
    
    public void method20769(final Class6789 class6789) {
        this.field26689 = class6789.field26689;
        this.field26690 = class6789.field26690;
        this.field26691 = class6789.field26691;
        this.field26692 = class6789.field26692;
        this.field26693 = class6789.field26693;
        this.field26694 = class6789.field26694;
        this.field26695 = class6789.field26695;
        this.field26696 = class6789.field26696;
        this.field26697 = class6789.field26697;
        this.field26698 = class6789.field26698;
        this.field26699 = class6789.field26699;
        this.field26700 = class6789.field26700;
        this.field26701 = class6789.field26701;
        this.field26702 = class6789.field26702;
        this.field26703 = class6789.field26703;
        this.field26704 = class6789.field26704;
    }
    
    public void method20770(final Class6789 class6789) {
        this.field26689 += class6789.field26689;
        this.field26690 += class6789.field26690;
        this.field26691 += class6789.field26691;
        this.field26692 += class6789.field26692;
        this.field26693 += class6789.field26693;
        this.field26694 += class6789.field26694;
        this.field26695 += class6789.field26695;
        this.field26696 += class6789.field26696;
        this.field26697 += class6789.field26697;
        this.field26698 += class6789.field26698;
        this.field26699 += class6789.field26699;
        this.field26700 += class6789.field26700;
        this.field26701 += class6789.field26701;
        this.field26702 += class6789.field26702;
        this.field26703 += class6789.field26703;
        this.field26704 += class6789.field26704;
    }
    
    public void method20771(final Class6789 class6789) {
        final Class6789 method20758 = class6789.method20758();
        method20758.method20752(this);
        this.method20769(method20758);
    }
    
    public void method20772(final float field26692, final float field26693, final float field26694) {
        this.field26689 = 1.0f;
        this.field26694 = 1.0f;
        this.field26699 = 1.0f;
        this.field26704 = 1.0f;
        this.field26692 = field26692;
        this.field26696 = field26693;
        this.field26700 = field26694;
    }
}
