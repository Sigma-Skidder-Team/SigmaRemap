// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2274 implements Serializable, Cloneable
{
    public static final long field13844 = 6837536777072402710L;
    public double field13845;
    public double field13846;
    public double field13847;
    public double field13848;
    public double field13849;
    public double field13850;
    public double field13851;
    public double field13852;
    public double field13853;
    private static final double field13854 = 1.110223024E-16;
    private static final double field13855 = 1.0E-8;
    private static double field13856;
    private static double field13857;
    private static double field13858;
    private static double field13859;
    private static double field13860;
    private static double field13861;
    
    public Class2274(final double field13845, final double field13846, final double field13847, final double field13848, final double field13849, final double field13850, final double field13851, final double field13852, final double field13853) {
        this.field13845 = field13845;
        this.field13846 = field13846;
        this.field13847 = field13847;
        this.field13848 = field13848;
        this.field13849 = field13849;
        this.field13850 = field13850;
        this.field13851 = field13851;
        this.field13852 = field13852;
        this.field13853 = field13853;
    }
    
    public Class2274(final double[] array) {
        this.field13845 = array[0];
        this.field13846 = array[1];
        this.field13847 = array[2];
        this.field13848 = array[3];
        this.field13849 = array[4];
        this.field13850 = array[5];
        this.field13851 = array[6];
        this.field13852 = array[7];
        this.field13853 = array[8];
    }
    
    public Class2274(final Class2274 class2274) {
        this.field13845 = class2274.field13845;
        this.field13846 = class2274.field13846;
        this.field13847 = class2274.field13847;
        this.field13848 = class2274.field13848;
        this.field13849 = class2274.field13849;
        this.field13850 = class2274.field13850;
        this.field13851 = class2274.field13851;
        this.field13852 = class2274.field13852;
        this.field13853 = class2274.field13853;
    }
    
    public Class2274(final Class2296 class2296) {
        this.field13845 = class2296.field13935;
        this.field13846 = class2296.field13936;
        this.field13847 = class2296.field13937;
        this.field13848 = class2296.field13938;
        this.field13849 = class2296.field13939;
        this.field13850 = class2296.field13940;
        this.field13851 = class2296.field13941;
        this.field13852 = class2296.field13942;
        this.field13853 = class2296.field13943;
    }
    
    public Class2274() {
        this.field13845 = 0.0;
        this.field13846 = 0.0;
        this.field13847 = 0.0;
        this.field13848 = 0.0;
        this.field13849 = 0.0;
        this.field13850 = 0.0;
        this.field13851 = 0.0;
        this.field13852 = 0.0;
        this.field13853 = 0.0;
    }
    
    @Override
    public String toString() {
        return this.field13845 + ", " + this.field13846 + ", " + this.field13847 + "\n" + this.field13848 + ", " + this.field13849 + ", " + this.field13850 + "\n" + this.field13851 + ", " + this.field13852 + ", " + this.field13853 + "\n";
    }
    
    public final void method8563() {
        this.field13845 = 1.0;
        this.field13846 = 0.0;
        this.field13847 = 0.0;
        this.field13848 = 0.0;
        this.field13849 = 1.0;
        this.field13850 = 0.0;
        this.field13851 = 0.0;
        this.field13852 = 0.0;
        this.field13853 = 1.0;
    }
    
    public final void method8564(final double n) {
        final double[] array = new double[9];
        this.method8622(new double[3], array);
        this.field13845 = array[0] * n;
        this.field13846 = array[1] * n;
        this.field13847 = array[2] * n;
        this.field13848 = array[3] * n;
        this.field13849 = array[4] * n;
        this.field13850 = array[5] * n;
        this.field13851 = array[6] * n;
        this.field13852 = array[7] * n;
        this.field13853 = array[8] * n;
    }
    
    public final void method8565(final int n, final int n2, final double field13853) {
        Label_0248: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            this.field13845 = field13853;
                            break Label_0248;
                        }
                        case 1: {
                            this.field13846 = field13853;
                            break Label_0248;
                        }
                        case 2: {
                            this.field13847 = field13853;
                            break Label_0248;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d0"));
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            this.field13848 = field13853;
                            break Label_0248;
                        }
                        case 1: {
                            this.field13849 = field13853;
                            break Label_0248;
                        }
                        case 2: {
                            this.field13850 = field13853;
                            break Label_0248;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d0"));
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            this.field13851 = field13853;
                            break Label_0248;
                        }
                        case 1: {
                            this.field13852 = field13853;
                            break Label_0248;
                        }
                        case 2: {
                            this.field13853 = field13853;
                            break Label_0248;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d0"));
                        }
                    }
                    break;
                }
                default: {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d0"));
                }
            }
        }
    }
    
    public final double method8566(final int n, final int n2) {
        Label_0179: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            return this.field13845;
                        }
                        case 1: {
                            return this.field13846;
                        }
                        case 2: {
                            return this.field13847;
                        }
                        default: {
                            break Label_0179;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            return this.field13848;
                        }
                        case 1: {
                            return this.field13849;
                        }
                        case 2: {
                            return this.field13850;
                        }
                        default: {
                            break Label_0179;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            return this.field13851;
                        }
                        case 1: {
                            return this.field13852;
                        }
                        case 2: {
                            return this.field13853;
                        }
                        default: {
                            break Label_0179;
                        }
                    }
                    break;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d1"));
    }
    
    public final void method8567(final int n, final Class2273 class2273) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d2"));
                }
                class2273.field13839 = this.field13851;
                class2273.field13840 = this.field13852;
                class2273.field13841 = this.field13853;
            }
            else {
                class2273.field13839 = this.field13848;
                class2273.field13840 = this.field13849;
                class2273.field13841 = this.field13850;
            }
        }
        else {
            class2273.field13839 = this.field13845;
            class2273.field13840 = this.field13846;
            class2273.field13841 = this.field13847;
        }
    }
    
    public final void method8568(final int n, final double[] array) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d2"));
                }
                array[0] = this.field13851;
                array[1] = this.field13852;
                array[2] = this.field13853;
            }
            else {
                array[0] = this.field13848;
                array[1] = this.field13849;
                array[2] = this.field13850;
            }
        }
        else {
            array[0] = this.field13845;
            array[1] = this.field13846;
            array[2] = this.field13847;
        }
    }
    
    public final void method8569(final int n, final Class2273 class2273) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d4"));
                }
                class2273.field13839 = this.field13847;
                class2273.field13840 = this.field13850;
                class2273.field13841 = this.field13853;
            }
            else {
                class2273.field13839 = this.field13846;
                class2273.field13840 = this.field13849;
                class2273.field13841 = this.field13852;
            }
        }
        else {
            class2273.field13839 = this.field13845;
            class2273.field13840 = this.field13848;
            class2273.field13841 = this.field13851;
        }
    }
    
    public final void method8570(final int n, final double[] array) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d4"));
                }
                array[0] = this.field13847;
                array[1] = this.field13850;
                array[2] = this.field13853;
            }
            else {
                array[0] = this.field13846;
                array[1] = this.field13849;
                array[2] = this.field13852;
            }
        }
        else {
            array[0] = this.field13845;
            array[1] = this.field13848;
            array[2] = this.field13851;
        }
    }
    
    public final void method8571(final int n, final double field13851, final double field13852, final double field13853) {
        switch (n) {
            case 0: {
                this.field13845 = field13851;
                this.field13846 = field13852;
                this.field13847 = field13853;
                break;
            }
            case 1: {
                this.field13848 = field13851;
                this.field13849 = field13852;
                this.field13850 = field13853;
                break;
            }
            case 2: {
                this.field13851 = field13851;
                this.field13852 = field13852;
                this.field13853 = field13853;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d6"));
            }
        }
    }
    
    public final void method8572(final int n, final Class2273 class2273) {
        switch (n) {
            case 0: {
                this.field13845 = class2273.field13839;
                this.field13846 = class2273.field13840;
                this.field13847 = class2273.field13841;
                break;
            }
            case 1: {
                this.field13848 = class2273.field13839;
                this.field13849 = class2273.field13840;
                this.field13850 = class2273.field13841;
                break;
            }
            case 2: {
                this.field13851 = class2273.field13839;
                this.field13852 = class2273.field13840;
                this.field13853 = class2273.field13841;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d6"));
            }
        }
    }
    
    public final void method8573(final int n, final double[] array) {
        switch (n) {
            case 0: {
                this.field13845 = array[0];
                this.field13846 = array[1];
                this.field13847 = array[2];
                break;
            }
            case 1: {
                this.field13848 = array[0];
                this.field13849 = array[1];
                this.field13850 = array[2];
                break;
            }
            case 2: {
                this.field13851 = array[0];
                this.field13852 = array[1];
                this.field13853 = array[2];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d6"));
            }
        }
    }
    
    public final void method8574(final int n, final double field13847, final double field13848, final double field13849) {
        switch (n) {
            case 0: {
                this.field13845 = field13847;
                this.field13848 = field13848;
                this.field13851 = field13849;
                break;
            }
            case 1: {
                this.field13846 = field13847;
                this.field13849 = field13848;
                this.field13852 = field13849;
                break;
            }
            case 2: {
                this.field13847 = field13847;
                this.field13850 = field13848;
                this.field13853 = field13849;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d9"));
            }
        }
    }
    
    public final void method8575(final int n, final Class2273 class2273) {
        switch (n) {
            case 0: {
                this.field13845 = class2273.field13839;
                this.field13848 = class2273.field13840;
                this.field13851 = class2273.field13841;
                break;
            }
            case 1: {
                this.field13846 = class2273.field13839;
                this.field13849 = class2273.field13840;
                this.field13852 = class2273.field13841;
                break;
            }
            case 2: {
                this.field13847 = class2273.field13839;
                this.field13850 = class2273.field13840;
                this.field13853 = class2273.field13841;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d9"));
            }
        }
    }
    
    public final void method8576(final int n, final double[] array) {
        switch (n) {
            case 0: {
                this.field13845 = array[0];
                this.field13848 = array[1];
                this.field13851 = array[2];
                break;
            }
            case 1: {
                this.field13846 = array[0];
                this.field13849 = array[1];
                this.field13852 = array[2];
                break;
            }
            case 2: {
                this.field13847 = array[0];
                this.field13850 = array[1];
                this.field13853 = array[2];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3d9"));
            }
        }
    }
    
    public final double method8577() {
        final double[] array = new double[3];
        this.method8622(array, new double[9]);
        return method8636(array);
    }
    
    public final void method8578(final double n) {
        this.field13845 += n;
        this.field13846 += n;
        this.field13847 += n;
        this.field13848 += n;
        this.field13849 += n;
        this.field13850 += n;
        this.field13851 += n;
        this.field13852 += n;
        this.field13853 += n;
    }
    
    public final void method8579(final double n, final Class2274 class2274) {
        this.field13845 = class2274.field13845 + n;
        this.field13846 = class2274.field13846 + n;
        this.field13847 = class2274.field13847 + n;
        this.field13848 = class2274.field13848 + n;
        this.field13849 = class2274.field13849 + n;
        this.field13850 = class2274.field13850 + n;
        this.field13851 = class2274.field13851 + n;
        this.field13852 = class2274.field13852 + n;
        this.field13853 = class2274.field13853 + n;
    }
    
    public final void method8580(final Class2274 class2274, final Class2274 class2275) {
        this.field13845 = class2274.field13845 + class2275.field13845;
        this.field13846 = class2274.field13846 + class2275.field13846;
        this.field13847 = class2274.field13847 + class2275.field13847;
        this.field13848 = class2274.field13848 + class2275.field13848;
        this.field13849 = class2274.field13849 + class2275.field13849;
        this.field13850 = class2274.field13850 + class2275.field13850;
        this.field13851 = class2274.field13851 + class2275.field13851;
        this.field13852 = class2274.field13852 + class2275.field13852;
        this.field13853 = class2274.field13853 + class2275.field13853;
    }
    
    public final void method8581(final Class2274 class2274) {
        this.field13845 += class2274.field13845;
        this.field13846 += class2274.field13846;
        this.field13847 += class2274.field13847;
        this.field13848 += class2274.field13848;
        this.field13849 += class2274.field13849;
        this.field13850 += class2274.field13850;
        this.field13851 += class2274.field13851;
        this.field13852 += class2274.field13852;
        this.field13853 += class2274.field13853;
    }
    
    public final void method8582(final Class2274 class2274, final Class2274 class2275) {
        this.field13845 = class2274.field13845 - class2275.field13845;
        this.field13846 = class2274.field13846 - class2275.field13846;
        this.field13847 = class2274.field13847 - class2275.field13847;
        this.field13848 = class2274.field13848 - class2275.field13848;
        this.field13849 = class2274.field13849 - class2275.field13849;
        this.field13850 = class2274.field13850 - class2275.field13850;
        this.field13851 = class2274.field13851 - class2275.field13851;
        this.field13852 = class2274.field13852 - class2275.field13852;
        this.field13853 = class2274.field13853 - class2275.field13853;
    }
    
    public final void method8583(final Class2274 class2274) {
        this.field13845 -= class2274.field13845;
        this.field13846 -= class2274.field13846;
        this.field13847 -= class2274.field13847;
        this.field13848 -= class2274.field13848;
        this.field13849 -= class2274.field13849;
        this.field13850 -= class2274.field13850;
        this.field13851 -= class2274.field13851;
        this.field13852 -= class2274.field13852;
        this.field13853 -= class2274.field13853;
    }
    
    public final void method8584() {
        final double field13848 = this.field13848;
        this.field13848 = this.field13846;
        this.field13846 = field13848;
        final double field13849 = this.field13851;
        this.field13851 = this.field13847;
        this.field13847 = field13849;
        final double field13850 = this.field13852;
        this.field13852 = this.field13850;
        this.field13850 = field13850;
    }
    
    public final void method8585(final Class2274 class2274) {
        if (this == class2274) {
            this.method8584();
        }
        else {
            this.field13845 = class2274.field13845;
            this.field13846 = class2274.field13848;
            this.field13847 = class2274.field13851;
            this.field13848 = class2274.field13846;
            this.field13849 = class2274.field13849;
            this.field13850 = class2274.field13852;
            this.field13851 = class2274.field13847;
            this.field13852 = class2274.field13850;
            this.field13853 = class2274.field13853;
        }
    }
    
    public final void method8586(final Class8 class8) {
        this.field13845 = 1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20;
        this.field13848 = 2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20);
        this.field13851 = 2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19);
        this.field13846 = 2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20);
        this.field13849 = 1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20;
        this.field13852 = 2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18);
        this.field13847 = 2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19);
        this.field13850 = 2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18);
        this.field13853 = 1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19;
    }
    
    public final void method8587(final Class24 class24) {
        final double sqrt = Math.sqrt(class24.field67 * class24.field67 + class24.field68 * class24.field68 + class24.field69 * class24.field69);
        if (sqrt >= 1.110223024E-16) {
            final double n = 1.0 / sqrt;
            final double n2 = class24.field67 * n;
            final double n3 = class24.field68 * n;
            final double n4 = class24.field69 * n;
            final double sin = Math.sin(class24.field70);
            final double cos = Math.cos(class24.field70);
            final double n5 = 1.0 - cos;
            final double n6 = n2 * n4;
            final double n7 = n2 * n3;
            final double n8 = n3 * n4;
            this.field13845 = n5 * n2 * n2 + cos;
            this.field13846 = n5 * n7 - sin * n4;
            this.field13847 = n5 * n6 + sin * n3;
            this.field13848 = n5 * n7 + sin * n4;
            this.field13849 = n5 * n3 * n3 + cos;
            this.field13850 = n5 * n8 - sin * n2;
            this.field13851 = n5 * n6 - sin * n3;
            this.field13852 = n5 * n8 + sin * n2;
            this.field13853 = n5 * n4 * n4 + cos;
        }
        else {
            this.field13845 = 1.0;
            this.field13846 = 0.0;
            this.field13847 = 0.0;
            this.field13848 = 0.0;
            this.field13849 = 1.0;
            this.field13850 = 0.0;
            this.field13851 = 0.0;
            this.field13852 = 0.0;
            this.field13853 = 1.0;
        }
    }
    
    public final void method8588(final Class2278 class2278) {
        this.field13845 = 1.0 - 2.0 * class2278.field13864 * class2278.field13864 - 2.0 * class2278.field13865 * class2278.field13865;
        this.field13848 = 2.0 * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865);
        this.field13851 = 2.0 * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864);
        this.field13846 = 2.0 * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865);
        this.field13849 = 1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13865 * class2278.field13865;
        this.field13852 = 2.0 * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863);
        this.field13847 = 2.0 * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864);
        this.field13850 = 2.0 * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863);
        this.field13853 = 1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13864 * class2278.field13864;
    }
    
    public final void method8589(final Class2307 class2307) {
        final double sqrt = Math.sqrt(class2307.field13985 * class2307.field13985 + class2307.field13986 * class2307.field13986 + class2307.field13987 * class2307.field13987);
        if (sqrt >= 1.110223024E-16) {
            final double n = 1.0 / sqrt;
            final double n2 = class2307.field13985 * n;
            final double n3 = class2307.field13986 * n;
            final double n4 = class2307.field13987 * n;
            final double sin = Math.sin(class2307.field13988);
            final double cos = Math.cos(class2307.field13988);
            final double n5 = 1.0 - cos;
            final double n6 = n2 * n4;
            final double n7 = n2 * n3;
            final double n8 = n3 * n4;
            this.field13845 = n5 * n2 * n2 + cos;
            this.field13846 = n5 * n7 - sin * n4;
            this.field13847 = n5 * n6 + sin * n3;
            this.field13848 = n5 * n7 + sin * n4;
            this.field13849 = n5 * n3 * n3 + cos;
            this.field13850 = n5 * n8 - sin * n2;
            this.field13851 = n5 * n6 - sin * n3;
            this.field13852 = n5 * n8 + sin * n2;
            this.field13853 = n5 * n4 * n4 + cos;
        }
        else {
            this.field13845 = 1.0;
            this.field13846 = 0.0;
            this.field13847 = 0.0;
            this.field13848 = 0.0;
            this.field13849 = 1.0;
            this.field13850 = 0.0;
            this.field13851 = 0.0;
            this.field13852 = 0.0;
            this.field13853 = 1.0;
        }
    }
    
    public final void method8590(final Class2296 class2296) {
        this.field13845 = class2296.field13935;
        this.field13846 = class2296.field13936;
        this.field13847 = class2296.field13937;
        this.field13848 = class2296.field13938;
        this.field13849 = class2296.field13939;
        this.field13850 = class2296.field13940;
        this.field13851 = class2296.field13941;
        this.field13852 = class2296.field13942;
        this.field13853 = class2296.field13943;
    }
    
    public final void method8591(final Class2274 class2274) {
        this.field13845 = class2274.field13845;
        this.field13846 = class2274.field13846;
        this.field13847 = class2274.field13847;
        this.field13848 = class2274.field13848;
        this.field13849 = class2274.field13849;
        this.field13850 = class2274.field13850;
        this.field13851 = class2274.field13851;
        this.field13852 = class2274.field13852;
        this.field13853 = class2274.field13853;
    }
    
    public final void method8592(final double[] array) {
        this.field13845 = array[0];
        this.field13846 = array[1];
        this.field13847 = array[2];
        this.field13848 = array[3];
        this.field13849 = array[4];
        this.field13850 = array[5];
        this.field13851 = array[6];
        this.field13852 = array[7];
        this.field13853 = array[8];
    }
    
    public final void method8593(final Class2274 class2274) {
        this.method8595(class2274);
    }
    
    public final void method8594() {
        this.method8595(this);
    }
    
    private final void method8595(final Class2274 class2274) {
        final double[] array = new double[9];
        final int[] array2 = new int[3];
        final double[] array3 = { class2274.field13845, class2274.field13846, class2274.field13847, class2274.field13848, class2274.field13849, class2274.field13850, class2274.field13851, class2274.field13852, class2274.field13853 };
        if (method8596(array3, array2)) {
            for (int i = 0; i < 9; ++i) {
                array[i] = 0.0;
            }
            array[0] = 1.0;
            array[8] = (array[4] = 1.0);
            method8597(array3, array2, array);
            this.field13845 = array[0];
            this.field13846 = array[1];
            this.field13847 = array[2];
            this.field13848 = array[3];
            this.field13849 = array[4];
            this.field13850 = array[5];
            this.field13851 = array[6];
            this.field13852 = array[7];
            this.field13853 = array[8];
            return;
        }
        throw new Class2383(Class9531.method35584("Matrix3d12"));
    }
    
    public static boolean method8596(final double[] array, final int[] array2) {
        final double[] array3 = new double[3];
        int n = 0;
        int n2 = 0;
        int n3 = 3;
        while (n3-- != 0) {
            double n4 = 0.0;
            int n5 = 3;
            while (n5-- != 0) {
                final double abs = Math.abs(array[n++]);
                if (abs <= n4) {
                    continue;
                }
                n4 = abs;
            }
            if (n4 == 0.0) {
                return false;
            }
            array3[n2++] = 1.0 / n4;
        }
        final int n6 = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i; ++j) {
                final int n7 = n6 + 3 * j + i;
                double n8 = array[n7];
                int n9 = j;
                int n10 = n6 + 3 * j;
                int n11 = n6 + i;
                while (n9-- != 0) {
                    n8 -= array[n10] * array[n11];
                    ++n10;
                    n11 += 3;
                }
                array[n7] = n8;
            }
            double n12 = 0.0;
            int n13 = -1;
            for (int k = i; k < 3; ++k) {
                final int n14 = n6 + 3 * k + i;
                double a = array[n14];
                int n15 = i;
                int n16 = n6 + 3 * k;
                int n17 = n6 + i;
                while (n15-- != 0) {
                    a -= array[n16] * array[n17];
                    ++n16;
                    n17 += 3;
                }
                array[n14] = a;
                final double n18;
                if ((n18 = array3[k] * Math.abs(a)) >= n12) {
                    n12 = n18;
                    n13 = k;
                }
            }
            if (n13 < 0) {
                throw new RuntimeException(Class9531.method35584("Matrix3d13"));
            }
            if (i != n13) {
                int n19 = 3;
                int n20 = n6 + 3 * n13;
                int n21 = n6 + 3 * i;
                while (n19-- != 0) {
                    final double n22 = array[n20];
                    array[n20++] = array[n21];
                    array[n21++] = n22;
                }
                array3[n13] = array3[i];
            }
            array2[i] = n13;
            if (array[n6 + 3 * i + i] == 0.0) {
                return false;
            }
            if (i != 2) {
                final double n23 = 1.0 / array[n6 + 3 * i + i];
                int n24 = n6 + 3 * (i + 1) + i;
                int n25 = 2 - i;
                while (n25-- != 0) {
                    final int n26 = n24;
                    array[n26] *= n23;
                    n24 += 3;
                }
            }
        }
        return true;
    }
    
    public static void method8597(final double[] array, final int[] array2, final double[] array3) {
        final int n = 0;
        for (int i = 0; i < 3; ++i) {
            final int n2 = i;
            int n3 = -1;
            for (int j = 0; j < 3; ++j) {
                final int n4 = array2[n + j];
                double n5 = array3[n2 + 3 * n4];
                array3[n2 + 3 * n4] = array3[n2 + 3 * j];
                if (n3 < 0) {
                    if (n5 != 0.0) {
                        n3 = j;
                    }
                }
                else {
                    final int n6 = j * 3;
                    for (int k = n3; k <= j - 1; ++k) {
                        n5 -= array[n6 + k] * array3[n2 + 3 * k];
                    }
                }
                array3[n2 + 3 * j] = n5;
            }
            int n7 = 6;
            final int n8 = n2 + 6;
            array3[n8] /= array[n7 + 2];
            n7 -= 3;
            array3[n2 + 3] = (array3[n2 + 3] - array[n7 + 2] * array3[n2 + 6]) / array[n7 + 1];
            n7 -= 3;
            array3[n2] = (array3[n2] - array[n7 + 1] * array3[n2 + 3] - array[n7 + 2] * array3[n2 + 6]) / array[n7];
        }
    }
    
    public final double method8598() {
        return this.field13845 * (this.field13849 * this.field13853 - this.field13850 * this.field13852) + this.field13846 * (this.field13850 * this.field13851 - this.field13848 * this.field13853) + this.field13847 * (this.field13848 * this.field13852 - this.field13849 * this.field13851);
    }
    
    public final void method8599(final double field13853) {
        this.field13845 = field13853;
        this.field13846 = 0.0;
        this.field13847 = 0.0;
        this.field13848 = 0.0;
        this.field13849 = field13853;
        this.field13850 = 0.0;
        this.field13851 = 0.0;
        this.field13852 = 0.0;
        this.field13853 = field13853;
    }
    
    public final void method8600(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.field13845 = 1.0;
        this.field13846 = 0.0;
        this.field13847 = 0.0;
        this.field13848 = 0.0;
        this.field13849 = cos;
        this.field13850 = -sin;
        this.field13851 = 0.0;
        this.field13852 = sin;
        this.field13853 = cos;
    }
    
    public final void method8601(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.field13845 = cos;
        this.field13846 = 0.0;
        this.field13847 = sin;
        this.field13848 = 0.0;
        this.field13849 = 1.0;
        this.field13850 = 0.0;
        this.field13851 = -sin;
        this.field13852 = 0.0;
        this.field13853 = cos;
    }
    
    public final void method8602(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.field13845 = cos;
        this.field13846 = -sin;
        this.field13847 = 0.0;
        this.field13848 = sin;
        this.field13849 = cos;
        this.field13850 = 0.0;
        this.field13851 = 0.0;
        this.field13852 = 0.0;
        this.field13853 = 1.0;
    }
    
    public final void method8603(final double n) {
        this.field13845 *= n;
        this.field13846 *= n;
        this.field13847 *= n;
        this.field13848 *= n;
        this.field13849 *= n;
        this.field13850 *= n;
        this.field13851 *= n;
        this.field13852 *= n;
        this.field13853 *= n;
    }
    
    public final void method8604(final double n, final Class2274 class2274) {
        this.field13845 = n * class2274.field13845;
        this.field13846 = n * class2274.field13846;
        this.field13847 = n * class2274.field13847;
        this.field13848 = n * class2274.field13848;
        this.field13849 = n * class2274.field13849;
        this.field13850 = n * class2274.field13850;
        this.field13851 = n * class2274.field13851;
        this.field13852 = n * class2274.field13852;
        this.field13853 = n * class2274.field13853;
    }
    
    public final void method8605(final Class2274 class2274) {
        final double field13845 = this.field13845 * class2274.field13845 + this.field13846 * class2274.field13848 + this.field13847 * class2274.field13851;
        final double field13846 = this.field13845 * class2274.field13846 + this.field13846 * class2274.field13849 + this.field13847 * class2274.field13852;
        final double field13847 = this.field13845 * class2274.field13847 + this.field13846 * class2274.field13850 + this.field13847 * class2274.field13853;
        final double field13848 = this.field13848 * class2274.field13845 + this.field13849 * class2274.field13848 + this.field13850 * class2274.field13851;
        final double field13849 = this.field13848 * class2274.field13846 + this.field13849 * class2274.field13849 + this.field13850 * class2274.field13852;
        final double field13850 = this.field13848 * class2274.field13847 + this.field13849 * class2274.field13850 + this.field13850 * class2274.field13853;
        final double field13851 = this.field13851 * class2274.field13845 + this.field13852 * class2274.field13848 + this.field13853 * class2274.field13851;
        final double field13852 = this.field13851 * class2274.field13846 + this.field13852 * class2274.field13849 + this.field13853 * class2274.field13852;
        final double field13853 = this.field13851 * class2274.field13847 + this.field13852 * class2274.field13850 + this.field13853 * class2274.field13853;
        this.field13845 = field13845;
        this.field13846 = field13846;
        this.field13847 = field13847;
        this.field13848 = field13848;
        this.field13849 = field13849;
        this.field13850 = field13850;
        this.field13851 = field13851;
        this.field13852 = field13852;
        this.field13853 = field13853;
    }
    
    public final void method8606(final Class2274 class2274, final Class2274 class2275) {
        if (this != class2274 && this != class2275) {
            this.field13845 = class2274.field13845 * class2275.field13845 + class2274.field13846 * class2275.field13848 + class2274.field13847 * class2275.field13851;
            this.field13846 = class2274.field13845 * class2275.field13846 + class2274.field13846 * class2275.field13849 + class2274.field13847 * class2275.field13852;
            this.field13847 = class2274.field13845 * class2275.field13847 + class2274.field13846 * class2275.field13850 + class2274.field13847 * class2275.field13853;
            this.field13848 = class2274.field13848 * class2275.field13845 + class2274.field13849 * class2275.field13848 + class2274.field13850 * class2275.field13851;
            this.field13849 = class2274.field13848 * class2275.field13846 + class2274.field13849 * class2275.field13849 + class2274.field13850 * class2275.field13852;
            this.field13850 = class2274.field13848 * class2275.field13847 + class2274.field13849 * class2275.field13850 + class2274.field13850 * class2275.field13853;
            this.field13851 = class2274.field13851 * class2275.field13845 + class2274.field13852 * class2275.field13848 + class2274.field13853 * class2275.field13851;
            this.field13852 = class2274.field13851 * class2275.field13846 + class2274.field13852 * class2275.field13849 + class2274.field13853 * class2275.field13852;
            this.field13853 = class2274.field13851 * class2275.field13847 + class2274.field13852 * class2275.field13850 + class2274.field13853 * class2275.field13853;
        }
        else {
            final double field13845 = class2274.field13845 * class2275.field13845 + class2274.field13846 * class2275.field13848 + class2274.field13847 * class2275.field13851;
            final double field13846 = class2274.field13845 * class2275.field13846 + class2274.field13846 * class2275.field13849 + class2274.field13847 * class2275.field13852;
            final double field13847 = class2274.field13845 * class2275.field13847 + class2274.field13846 * class2275.field13850 + class2274.field13847 * class2275.field13853;
            final double field13848 = class2274.field13848 * class2275.field13845 + class2274.field13849 * class2275.field13848 + class2274.field13850 * class2275.field13851;
            final double field13849 = class2274.field13848 * class2275.field13846 + class2274.field13849 * class2275.field13849 + class2274.field13850 * class2275.field13852;
            final double field13850 = class2274.field13848 * class2275.field13847 + class2274.field13849 * class2275.field13850 + class2274.field13850 * class2275.field13853;
            final double field13851 = class2274.field13851 * class2275.field13845 + class2274.field13852 * class2275.field13848 + class2274.field13853 * class2275.field13851;
            final double field13852 = class2274.field13851 * class2275.field13846 + class2274.field13852 * class2275.field13849 + class2274.field13853 * class2275.field13852;
            final double field13853 = class2274.field13851 * class2275.field13847 + class2274.field13852 * class2275.field13850 + class2274.field13853 * class2275.field13853;
            this.field13845 = field13845;
            this.field13846 = field13846;
            this.field13847 = field13847;
            this.field13848 = field13848;
            this.field13849 = field13849;
            this.field13850 = field13850;
            this.field13851 = field13851;
            this.field13852 = field13852;
            this.field13853 = field13853;
        }
    }
    
    public final void method8607(final Class2274 class2274) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = this.field13845 * class2274.field13845 + this.field13846 * class2274.field13848 + this.field13847 * class2274.field13851;
        array[1] = this.field13845 * class2274.field13846 + this.field13846 * class2274.field13849 + this.field13847 * class2274.field13852;
        array[2] = this.field13845 * class2274.field13847 + this.field13846 * class2274.field13850 + this.field13847 * class2274.field13853;
        array[3] = this.field13848 * class2274.field13845 + this.field13849 * class2274.field13848 + this.field13850 * class2274.field13851;
        array[4] = this.field13848 * class2274.field13846 + this.field13849 * class2274.field13849 + this.field13850 * class2274.field13852;
        array[5] = this.field13848 * class2274.field13847 + this.field13849 * class2274.field13850 + this.field13850 * class2274.field13853;
        array[6] = this.field13851 * class2274.field13845 + this.field13852 * class2274.field13848 + this.field13853 * class2274.field13851;
        array[7] = this.field13851 * class2274.field13846 + this.field13852 * class2274.field13849 + this.field13853 * class2274.field13852;
        array[8] = this.field13851 * class2274.field13847 + this.field13852 * class2274.field13850 + this.field13853 * class2274.field13853;
        method8623(array, array3, array2);
        this.field13845 = array2[0];
        this.field13846 = array2[1];
        this.field13847 = array2[2];
        this.field13848 = array2[3];
        this.field13849 = array2[4];
        this.field13850 = array2[5];
        this.field13851 = array2[6];
        this.field13852 = array2[7];
        this.field13853 = array2[8];
    }
    
    public final void method8608(final Class2274 class2274, final Class2274 class2275) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = class2274.field13845 * class2275.field13845 + class2274.field13846 * class2275.field13848 + class2274.field13847 * class2275.field13851;
        array[1] = class2274.field13845 * class2275.field13846 + class2274.field13846 * class2275.field13849 + class2274.field13847 * class2275.field13852;
        array[2] = class2274.field13845 * class2275.field13847 + class2274.field13846 * class2275.field13850 + class2274.field13847 * class2275.field13853;
        array[3] = class2274.field13848 * class2275.field13845 + class2274.field13849 * class2275.field13848 + class2274.field13850 * class2275.field13851;
        array[4] = class2274.field13848 * class2275.field13846 + class2274.field13849 * class2275.field13849 + class2274.field13850 * class2275.field13852;
        array[5] = class2274.field13848 * class2275.field13847 + class2274.field13849 * class2275.field13850 + class2274.field13850 * class2275.field13853;
        array[6] = class2274.field13851 * class2275.field13845 + class2274.field13852 * class2275.field13848 + class2274.field13853 * class2275.field13851;
        array[7] = class2274.field13851 * class2275.field13846 + class2274.field13852 * class2275.field13849 + class2274.field13853 * class2275.field13852;
        array[8] = class2274.field13851 * class2275.field13847 + class2274.field13852 * class2275.field13850 + class2274.field13853 * class2275.field13853;
        method8623(array, array3, array2);
        this.field13845 = array2[0];
        this.field13846 = array2[1];
        this.field13847 = array2[2];
        this.field13848 = array2[3];
        this.field13849 = array2[4];
        this.field13850 = array2[5];
        this.field13851 = array2[6];
        this.field13852 = array2[7];
        this.field13853 = array2[8];
    }
    
    public final void method8609(final Class2274 class2274, final Class2274 class2275) {
        if (this != class2274 && this != class2275) {
            this.field13845 = class2274.field13845 * class2275.field13845 + class2274.field13848 * class2275.field13846 + class2274.field13851 * class2275.field13847;
            this.field13846 = class2274.field13845 * class2275.field13848 + class2274.field13848 * class2275.field13849 + class2274.field13851 * class2275.field13850;
            this.field13847 = class2274.field13845 * class2275.field13851 + class2274.field13848 * class2275.field13852 + class2274.field13851 * class2275.field13853;
            this.field13848 = class2274.field13846 * class2275.field13845 + class2274.field13849 * class2275.field13846 + class2274.field13852 * class2275.field13847;
            this.field13849 = class2274.field13846 * class2275.field13848 + class2274.field13849 * class2275.field13849 + class2274.field13852 * class2275.field13850;
            this.field13850 = class2274.field13846 * class2275.field13851 + class2274.field13849 * class2275.field13852 + class2274.field13852 * class2275.field13853;
            this.field13851 = class2274.field13847 * class2275.field13845 + class2274.field13850 * class2275.field13846 + class2274.field13853 * class2275.field13847;
            this.field13852 = class2274.field13847 * class2275.field13848 + class2274.field13850 * class2275.field13849 + class2274.field13853 * class2275.field13850;
            this.field13853 = class2274.field13847 * class2275.field13851 + class2274.field13850 * class2275.field13852 + class2274.field13853 * class2275.field13853;
        }
        else {
            final double field13845 = class2274.field13845 * class2275.field13845 + class2274.field13848 * class2275.field13846 + class2274.field13851 * class2275.field13847;
            final double field13846 = class2274.field13845 * class2275.field13848 + class2274.field13848 * class2275.field13849 + class2274.field13851 * class2275.field13850;
            final double field13847 = class2274.field13845 * class2275.field13851 + class2274.field13848 * class2275.field13852 + class2274.field13851 * class2275.field13853;
            final double field13848 = class2274.field13846 * class2275.field13845 + class2274.field13849 * class2275.field13846 + class2274.field13852 * class2275.field13847;
            final double field13849 = class2274.field13846 * class2275.field13848 + class2274.field13849 * class2275.field13849 + class2274.field13852 * class2275.field13850;
            final double field13850 = class2274.field13846 * class2275.field13851 + class2274.field13849 * class2275.field13852 + class2274.field13852 * class2275.field13853;
            final double field13851 = class2274.field13847 * class2275.field13845 + class2274.field13850 * class2275.field13846 + class2274.field13853 * class2275.field13847;
            final double field13852 = class2274.field13847 * class2275.field13848 + class2274.field13850 * class2275.field13849 + class2274.field13853 * class2275.field13850;
            final double field13853 = class2274.field13847 * class2275.field13851 + class2274.field13850 * class2275.field13852 + class2274.field13853 * class2275.field13853;
            this.field13845 = field13845;
            this.field13846 = field13846;
            this.field13847 = field13847;
            this.field13848 = field13848;
            this.field13849 = field13849;
            this.field13850 = field13850;
            this.field13851 = field13851;
            this.field13852 = field13852;
            this.field13853 = field13853;
        }
    }
    
    public final void method8610(final Class2274 class2274, final Class2274 class2275) {
        if (this != class2274 && this != class2275) {
            this.field13845 = class2274.field13845 * class2275.field13845 + class2274.field13846 * class2275.field13846 + class2274.field13847 * class2275.field13847;
            this.field13846 = class2274.field13845 * class2275.field13848 + class2274.field13846 * class2275.field13849 + class2274.field13847 * class2275.field13850;
            this.field13847 = class2274.field13845 * class2275.field13851 + class2274.field13846 * class2275.field13852 + class2274.field13847 * class2275.field13853;
            this.field13848 = class2274.field13848 * class2275.field13845 + class2274.field13849 * class2275.field13846 + class2274.field13850 * class2275.field13847;
            this.field13849 = class2274.field13848 * class2275.field13848 + class2274.field13849 * class2275.field13849 + class2274.field13850 * class2275.field13850;
            this.field13850 = class2274.field13848 * class2275.field13851 + class2274.field13849 * class2275.field13852 + class2274.field13850 * class2275.field13853;
            this.field13851 = class2274.field13851 * class2275.field13845 + class2274.field13852 * class2275.field13846 + class2274.field13853 * class2275.field13847;
            this.field13852 = class2274.field13851 * class2275.field13848 + class2274.field13852 * class2275.field13849 + class2274.field13853 * class2275.field13850;
            this.field13853 = class2274.field13851 * class2275.field13851 + class2274.field13852 * class2275.field13852 + class2274.field13853 * class2275.field13853;
        }
        else {
            final double field13845 = class2274.field13845 * class2275.field13845 + class2274.field13846 * class2275.field13846 + class2274.field13847 * class2275.field13847;
            final double field13846 = class2274.field13845 * class2275.field13848 + class2274.field13846 * class2275.field13849 + class2274.field13847 * class2275.field13850;
            final double field13847 = class2274.field13845 * class2275.field13851 + class2274.field13846 * class2275.field13852 + class2274.field13847 * class2275.field13853;
            final double field13848 = class2274.field13848 * class2275.field13845 + class2274.field13849 * class2275.field13846 + class2274.field13850 * class2275.field13847;
            final double field13849 = class2274.field13848 * class2275.field13848 + class2274.field13849 * class2275.field13849 + class2274.field13850 * class2275.field13850;
            final double field13850 = class2274.field13848 * class2275.field13851 + class2274.field13849 * class2275.field13852 + class2274.field13850 * class2275.field13853;
            final double field13851 = class2274.field13851 * class2275.field13845 + class2274.field13852 * class2275.field13846 + class2274.field13853 * class2275.field13847;
            final double field13852 = class2274.field13851 * class2275.field13848 + class2274.field13852 * class2275.field13849 + class2274.field13853 * class2275.field13850;
            final double field13853 = class2274.field13851 * class2275.field13851 + class2274.field13852 * class2275.field13852 + class2274.field13853 * class2275.field13853;
            this.field13845 = field13845;
            this.field13846 = field13846;
            this.field13847 = field13847;
            this.field13848 = field13848;
            this.field13849 = field13849;
            this.field13850 = field13850;
            this.field13851 = field13851;
            this.field13852 = field13852;
            this.field13853 = field13853;
        }
    }
    
    public final void method8611(final Class2274 class2274, final Class2274 class2275) {
        if (this != class2274 && this != class2275) {
            this.field13845 = class2274.field13845 * class2275.field13845 + class2274.field13848 * class2275.field13848 + class2274.field13851 * class2275.field13851;
            this.field13846 = class2274.field13845 * class2275.field13846 + class2274.field13848 * class2275.field13849 + class2274.field13851 * class2275.field13852;
            this.field13847 = class2274.field13845 * class2275.field13847 + class2274.field13848 * class2275.field13850 + class2274.field13851 * class2275.field13853;
            this.field13848 = class2274.field13846 * class2275.field13845 + class2274.field13849 * class2275.field13848 + class2274.field13852 * class2275.field13851;
            this.field13849 = class2274.field13846 * class2275.field13846 + class2274.field13849 * class2275.field13849 + class2274.field13852 * class2275.field13852;
            this.field13850 = class2274.field13846 * class2275.field13847 + class2274.field13849 * class2275.field13850 + class2274.field13852 * class2275.field13853;
            this.field13851 = class2274.field13847 * class2275.field13845 + class2274.field13850 * class2275.field13848 + class2274.field13853 * class2275.field13851;
            this.field13852 = class2274.field13847 * class2275.field13846 + class2274.field13850 * class2275.field13849 + class2274.field13853 * class2275.field13852;
            this.field13853 = class2274.field13847 * class2275.field13847 + class2274.field13850 * class2275.field13850 + class2274.field13853 * class2275.field13853;
        }
        else {
            final double field13845 = class2274.field13845 * class2275.field13845 + class2274.field13848 * class2275.field13848 + class2274.field13851 * class2275.field13851;
            final double field13846 = class2274.field13845 * class2275.field13846 + class2274.field13848 * class2275.field13849 + class2274.field13851 * class2275.field13852;
            final double field13847 = class2274.field13845 * class2275.field13847 + class2274.field13848 * class2275.field13850 + class2274.field13851 * class2275.field13853;
            final double field13848 = class2274.field13846 * class2275.field13845 + class2274.field13849 * class2275.field13848 + class2274.field13852 * class2275.field13851;
            final double field13849 = class2274.field13846 * class2275.field13846 + class2274.field13849 * class2275.field13849 + class2274.field13852 * class2275.field13852;
            final double field13850 = class2274.field13846 * class2275.field13847 + class2274.field13849 * class2275.field13850 + class2274.field13852 * class2275.field13853;
            final double field13851 = class2274.field13847 * class2275.field13845 + class2274.field13850 * class2275.field13848 + class2274.field13853 * class2275.field13851;
            final double field13852 = class2274.field13847 * class2275.field13846 + class2274.field13850 * class2275.field13849 + class2274.field13853 * class2275.field13852;
            final double field13853 = class2274.field13847 * class2275.field13847 + class2274.field13850 * class2275.field13850 + class2274.field13853 * class2275.field13853;
            this.field13845 = field13845;
            this.field13846 = field13846;
            this.field13847 = field13847;
            this.field13848 = field13848;
            this.field13849 = field13849;
            this.field13850 = field13850;
            this.field13851 = field13851;
            this.field13852 = field13852;
            this.field13853 = field13853;
        }
    }
    
    public final void method8612() {
        final double[] array = new double[9];
        this.method8622(new double[3], array);
        this.field13845 = array[0];
        this.field13846 = array[1];
        this.field13847 = array[2];
        this.field13848 = array[3];
        this.field13849 = array[4];
        this.field13850 = array[5];
        this.field13851 = array[6];
        this.field13852 = array[7];
        this.field13853 = array[8];
    }
    
    public final void method8613(final Class2274 class2274) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = class2274.field13845;
        array[1] = class2274.field13846;
        array[2] = class2274.field13847;
        array[3] = class2274.field13848;
        array[4] = class2274.field13849;
        array[5] = class2274.field13850;
        array[6] = class2274.field13851;
        array[7] = class2274.field13852;
        array[8] = class2274.field13853;
        method8623(array, array3, array2);
        this.field13845 = array2[0];
        this.field13846 = array2[1];
        this.field13847 = array2[2];
        this.field13848 = array2[3];
        this.field13849 = array2[4];
        this.field13850 = array2[5];
        this.field13851 = array2[6];
        this.field13852 = array2[7];
        this.field13853 = array2[8];
    }
    
    public final void method8614() {
        final double n = 1.0 / Math.sqrt(this.field13845 * this.field13845 + this.field13848 * this.field13848 + this.field13851 * this.field13851);
        this.field13845 *= n;
        this.field13848 *= n;
        this.field13851 *= n;
        final double n2 = 1.0 / Math.sqrt(this.field13846 * this.field13846 + this.field13849 * this.field13849 + this.field13852 * this.field13852);
        this.field13846 *= n2;
        this.field13849 *= n2;
        this.field13852 *= n2;
        this.field13847 = this.field13848 * this.field13852 - this.field13849 * this.field13851;
        this.field13850 = this.field13846 * this.field13851 - this.field13845 * this.field13852;
        this.field13853 = this.field13845 * this.field13849 - this.field13846 * this.field13848;
    }
    
    public final void method8615(final Class2274 class2274) {
        final double n = 1.0 / Math.sqrt(class2274.field13845 * class2274.field13845 + class2274.field13848 * class2274.field13848 + class2274.field13851 * class2274.field13851);
        this.field13845 = class2274.field13845 * n;
        this.field13848 = class2274.field13848 * n;
        this.field13851 = class2274.field13851 * n;
        final double n2 = 1.0 / Math.sqrt(class2274.field13846 * class2274.field13846 + class2274.field13849 * class2274.field13849 + class2274.field13852 * class2274.field13852);
        this.field13846 = class2274.field13846 * n2;
        this.field13849 = class2274.field13849 * n2;
        this.field13852 = class2274.field13852 * n2;
        this.field13847 = this.field13848 * this.field13852 - this.field13849 * this.field13851;
        this.field13850 = this.field13846 * this.field13851 - this.field13845 * this.field13852;
        this.field13853 = this.field13845 * this.field13849 - this.field13846 * this.field13848;
    }
    
    public boolean equals(final Class2274 class2274) {
        try {
            return this.field13845 == class2274.field13845 && this.field13846 == class2274.field13846 && this.field13847 == class2274.field13847 && this.field13848 == class2274.field13848 && this.field13849 == class2274.field13849 && this.field13850 == class2274.field13850 && this.field13851 == class2274.field13851 && this.field13852 == class2274.field13852 && this.field13853 == class2274.field13853;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2274 class2274 = (Class2274)o;
            return this.field13845 == class2274.field13845 && this.field13846 == class2274.field13846 && this.field13847 == class2274.field13847 && this.field13848 == class2274.field13848 && this.field13849 == class2274.field13849 && this.field13850 == class2274.field13850 && this.field13851 == class2274.field13851 && this.field13852 == class2274.field13852 && this.field13853 == class2274.field13853;
        }
        catch (final ClassCastException ex) {
            return false;
        }
        catch (final NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean method8616(final Class2274 class2274, final double n) {
        final double n2 = this.field13845 - class2274.field13845;
        if (((n2 >= 0.0) ? n2 : (-n2)) > n) {
            return false;
        }
        final double n3 = this.field13846 - class2274.field13846;
        if (((n3 >= 0.0) ? n3 : (-n3)) > n) {
            return false;
        }
        final double n4 = this.field13847 - class2274.field13847;
        if (((n4 >= 0.0) ? n4 : (-n4)) > n) {
            return false;
        }
        final double n5 = this.field13848 - class2274.field13848;
        if (((n5 >= 0.0) ? n5 : (-n5)) > n) {
            return false;
        }
        final double n6 = this.field13849 - class2274.field13849;
        if (((n6 >= 0.0) ? n6 : (-n6)) > n) {
            return false;
        }
        final double n7 = this.field13850 - class2274.field13850;
        if (((n7 >= 0.0) ? n7 : (-n7)) > n) {
            return false;
        }
        final double n8 = this.field13851 - class2274.field13851;
        if (((n8 >= 0.0) ? n8 : (-n8)) > n) {
            return false;
        }
        final double n9 = this.field13852 - class2274.field13852;
        if (((n9 >= 0.0) ? n9 : (-n9)) <= n) {
            final double n10 = this.field13853 - class2274.field13853;
            return ((n10 >= 0.0) ? n10 : (-n10)) <= n;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L + Class9427.method35031(this.field13845)) + Class9427.method35031(this.field13846)) + Class9427.method35031(this.field13847)) + Class9427.method35031(this.field13848)) + Class9427.method35031(this.field13849)) + Class9427.method35031(this.field13850)) + Class9427.method35031(this.field13851)) + Class9427.method35031(this.field13852)) + Class9427.method35031(this.field13853);
        return (int)(n ^ n >> 32);
    }
    
    public final void method8617() {
        this.field13845 = 0.0;
        this.field13846 = 0.0;
        this.field13847 = 0.0;
        this.field13848 = 0.0;
        this.field13849 = 0.0;
        this.field13850 = 0.0;
        this.field13851 = 0.0;
        this.field13852 = 0.0;
        this.field13853 = 0.0;
    }
    
    public final void method8618() {
        this.field13845 = -this.field13845;
        this.field13846 = -this.field13846;
        this.field13847 = -this.field13847;
        this.field13848 = -this.field13848;
        this.field13849 = -this.field13849;
        this.field13850 = -this.field13850;
        this.field13851 = -this.field13851;
        this.field13852 = -this.field13852;
        this.field13853 = -this.field13853;
    }
    
    public final void method8619(final Class2274 class2274) {
        this.field13845 = -class2274.field13845;
        this.field13846 = -class2274.field13846;
        this.field13847 = -class2274.field13847;
        this.field13848 = -class2274.field13848;
        this.field13849 = -class2274.field13849;
        this.field13850 = -class2274.field13850;
        this.field13851 = -class2274.field13851;
        this.field13852 = -class2274.field13852;
        this.field13853 = -class2274.field13853;
    }
    
    public final void method8620(final Class2271 class2271) {
        class2271.method8509(this.field13845 * class2271.field13839 + this.field13846 * class2271.field13840 + this.field13847 * class2271.field13841, this.field13848 * class2271.field13839 + this.field13849 * class2271.field13840 + this.field13850 * class2271.field13841, this.field13851 * class2271.field13839 + this.field13852 * class2271.field13840 + this.field13853 * class2271.field13841);
    }
    
    public final void method8621(final Class2271 class2271, final Class2271 class2272) {
        final double field13839 = this.field13845 * class2271.field13839 + this.field13846 * class2271.field13840 + this.field13847 * class2271.field13841;
        final double field13840 = this.field13848 * class2271.field13839 + this.field13849 * class2271.field13840 + this.field13850 * class2271.field13841;
        class2272.field13841 = this.field13851 * class2271.field13839 + this.field13852 * class2271.field13840 + this.field13853 * class2271.field13841;
        class2272.field13839 = field13839;
        class2272.field13840 = field13840;
    }
    
    public final void method8622(final double[] array, final double[] array2) {
        method8623(new double[] { this.field13845, this.field13846, this.field13847, this.field13848, this.field13849, this.field13850, this.field13851, this.field13852, this.field13853 }, array, array2);
    }
    
    public static void method8623(final double[] array, final double[] array2, final double[] array3) {
        final double[] array4 = new double[9];
        final double[] array5 = new double[9];
        final double[] array6 = new double[9];
        final double[] array7 = new double[9];
        final double[] array8 = array6;
        final double[] array9 = array7;
        final double[] array10 = new double[9];
        final double[] array11 = new double[3];
        final double[] array12 = new double[3];
        int n = 0;
        System.arraycopy(array, 0, array10, 0, 9);
        if (array[3] * array[3] >= 1.110223024E-16) {
            if (array[0] * array[0] >= 1.110223024E-16) {
                final double n2 = 1.0 / Math.sqrt(array[0] * array[0] + array[3] * array[3]);
                final double n3 = array[0] * n2;
                final double n4 = array[3] * n2;
                array8[0] = n3 * array[0] + n4 * array[3];
                array8[1] = n3 * array[1] + n4 * array[4];
                array8[2] = n3 * array[2] + n4 * array[5];
                array[3] = -n4 * array[0] + n3 * array[3];
                array[4] = -n4 * array[1] + n3 * array[4];
                array[5] = -n4 * array[2] + n3 * array[5];
                array[0] = array8[0];
                array[1] = array8[1];
                array[2] = array8[2];
                array4[0] = n3;
                array4[1] = n4;
                array4[2] = 0.0;
                array4[3] = -n4;
                array4[4] = n3;
                array4[5] = 0.0;
                array4[7] = (array4[6] = 0.0);
                array4[8] = 1.0;
            }
            else {
                array8[0] = array[0];
                array8[1] = array[1];
                array8[2] = array[2];
                array[0] = array[3];
                array[1] = array[4];
                array[2] = array[5];
                array[3] = -array8[0];
                array[4] = -array8[1];
                array[5] = -array8[2];
                array4[0] = 0.0;
                array4[1] = 1.0;
                array4[2] = 0.0;
                array4[3] = -1.0;
                array4[5] = (array4[4] = 0.0);
                array4[7] = (array4[6] = 0.0);
                array4[8] = 1.0;
            }
        }
        else {
            array4[0] = 1.0;
            array4[1] = 0.0;
            array4[3] = (array4[2] = 0.0);
            array4[4] = 1.0;
            array4[5] = 0.0;
            array4[7] = (array4[6] = 0.0);
            array4[8] = 1.0;
        }
        if (array[6] * array[6] >= 1.110223024E-16) {
            if (array[0] * array[0] >= 1.110223024E-16) {
                final double n5 = 1.0 / Math.sqrt(array[0] * array[0] + array[6] * array[6]);
                final double n6 = array[0] * n5;
                final double n7 = array[6] * n5;
                array8[0] = n6 * array[0] + n7 * array[6];
                array8[1] = n6 * array[1] + n7 * array[7];
                array8[2] = n6 * array[2] + n7 * array[8];
                array[6] = -n7 * array[0] + n6 * array[6];
                array[7] = -n7 * array[1] + n6 * array[7];
                array[8] = -n7 * array[2] + n6 * array[8];
                array[0] = array8[0];
                array[1] = array8[1];
                array[2] = array8[2];
                array8[0] = n6 * array4[0];
                array8[1] = n6 * array4[1];
                array4[2] = n7;
                array8[6] = -array4[0] * n7;
                array8[7] = -array4[1] * n7;
                array4[8] = n6;
                array4[0] = array8[0];
                array4[1] = array8[1];
                array4[6] = array8[6];
                array4[7] = array8[7];
            }
            else {
                array8[0] = array[0];
                array8[1] = array[1];
                array8[2] = array[2];
                array[0] = array[6];
                array[1] = array[7];
                array[2] = array[8];
                array[6] = -array8[0];
                array[7] = -array8[1];
                array[8] = -array8[2];
                array8[0] = array4[0];
                array8[1] = array4[1];
                array8[2] = array4[2];
                array4[0] = array4[6];
                array4[1] = array4[7];
                array4[2] = array4[8];
                array4[6] = -array8[0];
                array4[7] = -array8[1];
                array4[8] = -array8[2];
            }
        }
        if (array[2] * array[2] >= 1.110223024E-16) {
            if (array[1] * array[1] >= 1.110223024E-16) {
                final double n8 = 1.0 / Math.sqrt(array[1] * array[1] + array[2] * array[2]);
                final double n9 = array[1] * n8;
                final double n10 = array[2] * n8;
                array8[1] = n9 * array[1] + n10 * array[2];
                array[2] = -n10 * array[1] + n9 * array[2];
                array[1] = array8[1];
                array8[4] = n9 * array[4] + n10 * array[5];
                array[5] = -n10 * array[4] + n9 * array[5];
                array[4] = array8[4];
                array8[7] = n9 * array[7] + n10 * array[8];
                array[8] = -n10 * array[7] + n9 * array[8];
                array[7] = array8[7];
                array5[0] = 1.0;
                array5[1] = 0.0;
                array5[3] = (array5[2] = 0.0);
                array5[4] = n9;
                array5[5] = -n10;
                array5[6] = 0.0;
                array5[7] = n10;
                array5[8] = n9;
            }
            else {
                array8[2] = array[2];
                array8[5] = array[5];
                array8[8] = array[8];
                array[2] = -array[1];
                array[5] = -array[4];
                array[8] = -array[7];
                array[1] = array8[2];
                array[4] = array8[5];
                array[7] = array8[8];
                array5[0] = 1.0;
                array5[2] = (array5[1] = 0.0);
                array5[4] = (array5[3] = 0.0);
                array5[5] = -1.0;
                array5[6] = 0.0;
                array5[7] = 1.0;
                array5[8] = 0.0;
            }
        }
        else {
            array5[0] = 1.0;
            array5[1] = 0.0;
            array5[3] = (array5[2] = 0.0);
            array5[4] = 1.0;
            array5[5] = 0.0;
            array5[7] = (array5[6] = 0.0);
            array5[8] = 1.0;
        }
        if (array[7] * array[7] >= 1.110223024E-16) {
            if (array[4] * array[4] >= 1.110223024E-16) {
                final double n11 = 1.0 / Math.sqrt(array[4] * array[4] + array[7] * array[7]);
                final double n12 = array[4] * n11;
                final double n13 = array[7] * n11;
                array8[3] = n12 * array[3] + n13 * array[6];
                array[6] = -n13 * array[3] + n12 * array[6];
                array[3] = array8[3];
                array8[4] = n12 * array[4] + n13 * array[7];
                array[7] = -n13 * array[4] + n12 * array[7];
                array[4] = array8[4];
                array8[5] = n12 * array[5] + n13 * array[8];
                array[8] = -n13 * array[5] + n12 * array[8];
                array[5] = array8[5];
                array8[3] = n12 * array4[3] + n13 * array4[6];
                array4[6] = -n13 * array4[3] + n12 * array4[6];
                array4[3] = array8[3];
                array8[4] = n12 * array4[4] + n13 * array4[7];
                array4[7] = -n13 * array4[4] + n12 * array4[7];
                array4[4] = array8[4];
                array8[5] = n12 * array4[5] + n13 * array4[8];
                array4[8] = -n13 * array4[5] + n12 * array4[8];
                array4[5] = array8[5];
            }
            else {
                array8[3] = array[3];
                array8[4] = array[4];
                array8[5] = array[5];
                array[3] = array[6];
                array[4] = array[7];
                array[5] = array[8];
                array[6] = -array8[3];
                array[7] = -array8[4];
                array[8] = -array8[5];
                array8[3] = array4[3];
                array8[4] = array4[4];
                array8[5] = array4[5];
                array4[3] = array4[6];
                array4[4] = array4[7];
                array4[5] = array4[8];
                array4[6] = -array8[3];
                array4[7] = -array8[4];
                array4[8] = -array8[5];
            }
        }
        array9[0] = array[0];
        array9[1] = array[4];
        array9[2] = array[8];
        array11[0] = array[1];
        array11[1] = array[5];
        if (array11[0] * array11[0] >= 1.110223024E-16 || array11[1] * array11[1] >= 1.110223024E-16) {
            method8625(array9, array11, array4, array5);
        }
        array12[0] = array9[0];
        array12[1] = array9[1];
        array12[2] = array9[2];
        if (method8637(Math.abs(array12[0]), 1.0)) {
            if (method8637(Math.abs(array12[1]), 1.0)) {
                if (method8637(Math.abs(array12[2]), 1.0)) {
                    for (int j = 0; j < 3; ++j) {
                        if (array12[j] < 0.0) {
                            ++n;
                        }
                    }
                    if (n == 0 || n == 2) {
                        final int n14 = 0;
                        final int n15 = 1;
                        final int n16 = 2;
                        final double n17 = 1.0;
                        array2[n16] = n17;
                        array2[n14] = (array2[n15] = n17);
                        System.arraycopy(array10, 0, array3, 0, 9);
                        return;
                    }
                }
            }
        }
        method8635(array4, array6);
        method8635(array5, array7);
        method8624(array, array6, array7, array12, array3, array2);
    }
    
    public static void method8624(final double[] array, final double[] array2, final double[] array3, final double[] array4, final double[] array5, final double[] array6) {
        final int[] array7 = new int[3];
        final int[] array8 = new int[3];
        final double[] array9 = new double[3];
        final double[] array10 = new double[9];
        if (array4[0] < 0.0) {
            array4[0] = -array4[0];
            array3[0] = -array3[0];
            array3[1] = -array3[1];
            array3[2] = -array3[2];
        }
        if (array4[1] < 0.0) {
            array4[1] = -array4[1];
            array3[3] = -array3[3];
            array3[4] = -array3[4];
            array3[5] = -array3[5];
        }
        if (array4[2] < 0.0) {
            array4[2] = -array4[2];
            array3[6] = -array3[6];
            array3[7] = -array3[7];
            array3[8] = -array3[8];
        }
        method8634(array2, array3, array10);
        if (method8637(Math.abs(array4[0]), Math.abs(array4[1])) && method8637(Math.abs(array4[1]), Math.abs(array4[2]))) {
            System.arraycopy(array10, 0, array5, 0, 9);
            System.arraycopy(array4, 0, array6, 0, 3);
        }
        else {
            if (array4[0] <= array4[1]) {
                if (array4[1] <= array4[2]) {
                    array7[0] = 2;
                    array7[1] = 1;
                    array7[2] = 0;
                }
                else if (array4[2] <= array4[0]) {
                    array7[array7[0] = 1] = 0;
                    array7[2] = 2;
                }
                else {
                    array7[0] = 1;
                    array7[array7[1] = 2] = 0;
                }
            }
            else if (array4[0] <= array4[2]) {
                array7[0] = 2;
                array7[1] = 0;
                array7[2] = 1;
            }
            else if (array4[2] <= array4[1]) {
                array7[0] = 0;
                array7[1] = 1;
                array7[2] = 2;
            }
            else {
                array7[0] = 0;
                array7[array7[1] = 2] = 1;
            }
            array9[0] = array[0] * array[0] + array[1] * array[1] + array[2] * array[2];
            array9[1] = array[3] * array[3] + array[4] * array[4] + array[5] * array[5];
            array9[2] = array[6] * array[6] + array[7] * array[7] + array[8] * array[8];
            int n;
            int n2;
            int n3;
            if (array9[0] <= array9[1]) {
                if (array9[1] <= array9[2]) {
                    n = 0;
                    n2 = 1;
                    n3 = 2;
                }
                else if (array9[2] <= array9[0]) {
                    n2 = 0;
                    n3 = 1;
                    n = 2;
                }
                else {
                    n2 = 0;
                    n = 1;
                    n3 = 2;
                }
            }
            else if (array9[0] <= array9[2]) {
                n = 0;
                n3 = 1;
                n2 = 2;
            }
            else if (array9[2] <= array9[1]) {
                n3 = 0;
                n2 = 1;
                n = 2;
            }
            else {
                n3 = 0;
                n = 1;
                n2 = 2;
            }
            array6[0] = array4[array7[n3]];
            array6[1] = array4[array7[n2]];
            array6[2] = array4[array7[n]];
            array5[0] = array10[array7[n3]];
            array5[3] = array10[array7[n3] + 3];
            array5[6] = array10[array7[n3] + 6];
            array5[1] = array10[array7[n2]];
            array5[4] = array10[array7[n2] + 3];
            array5[7] = array10[array7[n2] + 6];
            array5[2] = array10[array7[n]];
            array5[5] = array10[array7[n] + 3];
            array5[8] = array10[array7[n] + 6];
        }
    }
    
    public static int method8625(final double[] array, final double[] array2, final double[] array3, final double[] array4) {
        final double[] array5 = new double[2];
        final double[] array6 = new double[2];
        final double[] array7 = new double[2];
        final double[] array8 = new double[2];
        final double[] array9 = new double[9];
        final double n = 1.0;
        int n2 = 0;
        int n3 = 1;
        if (Math.abs(array2[1]) < 4.89E-15 || Math.abs(array2[0]) < 4.89E-15) {
            n2 = 1;
        }
        for (int n4 = 0; n4 < 10 && n2 == 0; ++n4) {
            final double method8629 = method8629(array[1], array2[1], array[2]);
            method8631((Math.abs(array[0]) - method8629) * (method8628(n, array[0]) + method8629 / array[0]), array2[0], array8, array6, 0, n3);
            final double n5 = array6[0] * array[0] + array8[0] * array2[0];
            array2[0] = array6[0] * array2[0] - array8[0] * array[0];
            final double n6 = array8[0] * array[1];
            array[1] *= array6[0];
            final double method8630 = method8631(n5, n6, array7, array5, 0, n3);
            n3 = 0;
            array[0] = method8630;
            final double n7 = array5[0] * array2[0] + array7[0] * array[1];
            array[1] = array5[0] * array[1] - array7[0] * array2[0];
            final double n8 = array7[0] * array2[1];
            array2[1] *= array5[0];
            array2[0] = method8631(n7, n8, array8, array6, 1, n3);
            final double n9 = array6[1] * array[1] + array8[1] * array2[1];
            array2[1] = array6[1] * array2[1] - array8[1] * array[1];
            final double n10 = array8[1] * array[2];
            array[2] *= array6[1];
            array[1] = method8631(n9, n10, array7, array5, 1, n3);
            final double n11 = array5[1] * array2[1] + array7[1] * array[2];
            array[2] = array5[1] * array[2] - array7[1] * array2[1];
            array2[1] = n11;
            final double n12 = array3[0];
            array3[0] = array5[0] * n12 + array7[0] * array3[3];
            array3[3] = -array7[0] * n12 + array5[0] * array3[3];
            final double n13 = array3[1];
            array3[1] = array5[0] * n13 + array7[0] * array3[4];
            array3[4] = -array7[0] * n13 + array5[0] * array3[4];
            final double n14 = array3[2];
            array3[2] = array5[0] * n14 + array7[0] * array3[5];
            array3[5] = -array7[0] * n14 + array5[0] * array3[5];
            final double n15 = array3[3];
            array3[3] = array5[1] * n15 + array7[1] * array3[6];
            array3[6] = -array7[1] * n15 + array5[1] * array3[6];
            final double n16 = array3[4];
            array3[4] = array5[1] * n16 + array7[1] * array3[7];
            array3[7] = -array7[1] * n16 + array5[1] * array3[7];
            final double n17 = array3[5];
            array3[5] = array5[1] * n17 + array7[1] * array3[8];
            array3[8] = -array7[1] * n17 + array5[1] * array3[8];
            final double n18 = array4[0];
            array4[0] = array6[0] * n18 + array8[0] * array4[1];
            array4[1] = -array8[0] * n18 + array6[0] * array4[1];
            final double n19 = array4[3];
            array4[3] = array6[0] * n19 + array8[0] * array4[4];
            array4[4] = -array8[0] * n19 + array6[0] * array4[4];
            final double n20 = array4[6];
            array4[6] = array6[0] * n20 + array8[0] * array4[7];
            array4[7] = -array8[0] * n20 + array6[0] * array4[7];
            final double n21 = array4[1];
            array4[1] = array6[1] * n21 + array8[1] * array4[2];
            array4[2] = -array8[1] * n21 + array6[1] * array4[2];
            final double n22 = array4[4];
            array4[4] = array6[1] * n22 + array8[1] * array4[5];
            array4[5] = -array8[1] * n22 + array6[1] * array4[5];
            final double n23 = array4[7];
            array4[7] = array6[1] * n23 + array8[1] * array4[8];
            array4[8] = -array8[1] * n23 + array6[1] * array4[8];
            array9[0] = array[0];
            array9[1] = array2[0];
            array9[3] = (array9[2] = 0.0);
            array9[4] = array[1];
            array9[5] = array2[1];
            array9[7] = (array9[6] = 0.0);
            array9[8] = array[2];
            if (Math.abs(array2[1]) < 4.89E-15 || Math.abs(array2[0]) < 4.89E-15) {
                n2 = 1;
            }
        }
        if (Math.abs(array2[1]) >= 4.89E-15) {
            method8630(array[1], array2[1], array[2], array, array7, array5, array8, array6, 1);
            final double n24 = array3[3];
            array3[3] = array5[0] * n24 + array7[0] * array3[6];
            array3[6] = -array7[0] * n24 + array5[0] * array3[6];
            final double n25 = array3[4];
            array3[4] = array5[0] * n25 + array7[0] * array3[7];
            array3[7] = -array7[0] * n25 + array5[0] * array3[7];
            final double n26 = array3[5];
            array3[5] = array5[0] * n26 + array7[0] * array3[8];
            array3[8] = -array7[0] * n26 + array5[0] * array3[8];
            final double n27 = array4[1];
            array4[1] = array6[0] * n27 + array8[0] * array4[2];
            array4[2] = -array8[0] * n27 + array6[0] * array4[2];
            final double n28 = array4[4];
            array4[4] = array6[0] * n28 + array8[0] * array4[5];
            array4[5] = -array8[0] * n28 + array6[0] * array4[5];
            final double n29 = array4[7];
            array4[7] = array6[0] * n29 + array8[0] * array4[8];
            array4[8] = -array8[0] * n29 + array6[0] * array4[8];
        }
        else {
            method8630(array[0], array2[0], array[1], array, array7, array5, array8, array6, 0);
            final double n30 = array3[0];
            array3[0] = array5[0] * n30 + array7[0] * array3[3];
            array3[3] = -array7[0] * n30 + array5[0] * array3[3];
            final double n31 = array3[1];
            array3[1] = array5[0] * n31 + array7[0] * array3[4];
            array3[4] = -array7[0] * n31 + array5[0] * array3[4];
            final double n32 = array3[2];
            array3[2] = array5[0] * n32 + array7[0] * array3[5];
            array3[5] = -array7[0] * n32 + array5[0] * array3[5];
            final double n33 = array4[0];
            array4[0] = array6[0] * n33 + array8[0] * array4[1];
            array4[1] = -array8[0] * n33 + array6[0] * array4[1];
            final double n34 = array4[3];
            array4[3] = array6[0] * n34 + array8[0] * array4[4];
            array4[4] = -array8[0] * n34 + array6[0] * array4[4];
            final double n35 = array4[6];
            array4[6] = array6[0] * n35 + array8[0] * array4[7];
            array4[7] = -array8[0] * n35 + array6[0] * array4[7];
        }
        return 0;
    }
    
    public static double method8626(final double n, final double n2) {
        if (n <= n2) {
            return n2;
        }
        return n;
    }
    
    public static double method8627(final double n, final double n2) {
        if (n >= n2) {
            return n2;
        }
        return n;
    }
    
    public static double method8628(final double n, final double n2) {
        final double n3 = (n < 0.0) ? (-n) : n;
        return (n2 < 0.0) ? (-n3) : n3;
    }
    
    public static double method8629(final double a, final double a2, final double a3) {
        final double abs = Math.abs(a);
        final double abs2 = Math.abs(a2);
        final double abs3 = Math.abs(a3);
        final double method8627 = method8627(abs, abs3);
        final double method8628 = method8626(abs, abs3);
        double n7;
        if (method8627 != 0.0) {
            if (abs2 >= method8628) {
                final double n = method8628 / abs2;
                if (n != 0.0) {
                    final double n2 = method8627 / method8628 + 1.0;
                    final double n3 = (method8628 - method8627) / method8628;
                    final double n4 = n2 * n;
                    final double n5 = n3 * n;
                    final double n6 = method8627 * (1.0 / (Math.sqrt(n4 * n4 + 1.0) + Math.sqrt(n5 * n5 + 1.0))) * n;
                    n7 = n6 + n6;
                }
                else {
                    n7 = method8627 * method8628 / abs2;
                }
            }
            else {
                final double n8 = method8627 / method8628 + 1.0;
                final double n9 = (method8628 - method8627) / method8628;
                final double n10 = abs2 / method8628;
                final double n11 = n10 * n10;
                n7 = method8627 * (2.0 / (Math.sqrt(n8 * n8 + n11) + Math.sqrt(n9 * n9 + n11)));
            }
        }
        else {
            n7 = 0.0;
            if (method8628 != 0.0) {
                final double n12 = method8627(method8628, abs2) / method8626(method8628, abs2);
            }
        }
        return n7;
    }
    
    public static int method8630(final double n, final double a, final double a2, final double[] array, final double[] array2, final double[] array3, final double[] array4, final double[] array5, final int n2) {
        final double n3 = 2.0;
        final double n4 = 1.0;
        double n5 = array[0];
        double n6 = array[1];
        double n7 = 0.0;
        double n8 = 0.0;
        double n9 = 0.0;
        double n10 = 0.0;
        double n11 = 0.0;
        double a3 = n;
        double abs = Math.abs(a3);
        double n12 = a2;
        double abs2 = Math.abs(a2);
        int n13 = 1;
        final boolean b = abs2 > abs;
        if (b) {
            n13 = 3;
            final double n14 = a3;
            a3 = n12;
            n12 = n14;
            final double n15 = abs;
            abs = abs2;
            abs2 = n15;
        }
        final double abs3 = Math.abs(a);
        if (abs3 != 0.0) {
            int n16 = 1;
            if (abs3 > abs) {
                n13 = 2;
                if (abs / abs3 < 1.110223024E-16) {
                    n16 = 0;
                    n5 = abs3;
                    if (abs2 <= 1.0) {
                        n6 = abs / abs3 * abs2;
                    }
                    else {
                        n6 = abs / (abs3 / abs2);
                    }
                    n7 = 1.0;
                    n9 = n12 / a;
                    n10 = 1.0;
                    n8 = a3 / a;
                }
            }
            if (n16 != 0) {
                final double n17 = abs - abs2;
                double n18;
                if (n17 != abs) {
                    n18 = n17 / abs;
                }
                else {
                    n18 = 1.0;
                }
                final double a4 = a / a3;
                final double n19 = 2.0 - n18;
                final double n20 = a4 * a4;
                Math.sqrt(n19 * n19 + n20);
                if (n18 != 0.0) {
                    Math.sqrt(n18 * n18 + n20);
                }
                else {
                    Math.abs(a4);
                }
                if (abs3 > abs) {
                    n13 = 2;
                    if (abs / abs3 < 1.110223024E-16) {
                        n16 = 0;
                        n5 = abs3;
                        if (abs2 <= 1.0) {
                            n6 = abs / abs3 * abs2;
                        }
                        else {
                            n6 = abs / (abs3 / abs2);
                        }
                        n7 = 1.0;
                        n9 = n12 / a;
                        n10 = 1.0;
                        n8 = a3 / a;
                    }
                }
                if (n16 != 0) {
                    final double n21 = abs - abs2;
                    double n22;
                    if (n21 != abs) {
                        n22 = n21 / abs;
                    }
                    else {
                        n22 = 1.0;
                    }
                    final double a5 = a / a3;
                    final double n23 = 2.0 - n22;
                    final double n24 = a5 * a5;
                    final double sqrt = Math.sqrt(n23 * n23 + n24);
                    double n25;
                    if (n22 != 0.0) {
                        n25 = Math.sqrt(n22 * n22 + n24);
                    }
                    else {
                        n25 = Math.abs(a5);
                    }
                    final double n26 = (sqrt + n25) * 0.5;
                    n6 = abs2 / n26;
                    n5 = abs * n26;
                    double n27;
                    if (n24 != 0.0) {
                        n27 = (a5 / (sqrt + n23) + a5 / (n25 + n22)) * (n26 + 1.0);
                    }
                    else if (n22 != 0.0) {
                        n27 = a / method8628(n21, a3) + a5 / n23;
                    }
                    else {
                        n27 = method8628(n3, a3) * method8628(n4, a);
                    }
                    final double sqrt2 = Math.sqrt(n27 * n27 + 4.0);
                    n8 = 2.0 / sqrt2;
                    n10 = n27 / sqrt2;
                    n7 = (n8 + n10 * a5) / n26;
                    n9 = n12 / a3 * n10 / n26;
                }
            }
            if (!b) {
                array3[0] = n7;
                array2[0] = n9;
                array5[0] = n8;
                array4[0] = n10;
            }
            else {
                array3[0] = n10;
                array2[0] = n8;
                array5[0] = n9;
                array4[0] = n7;
            }
            if (n13 == 1) {
                n11 = method8628(n4, array5[0]) * method8628(n4, array3[0]) * method8628(n4, n);
            }
            if (n13 == 2) {
                n11 = method8628(n4, array4[0]) * method8628(n4, array3[0]) * method8628(n4, a);
            }
            if (n13 == 3) {
                n11 = method8628(n4, array4[0]) * method8628(n4, array2[0]) * method8628(n4, a2);
            }
            array[n2] = method8628(n5, n11);
            array[n2 + 1] = method8628(n6, n11 * method8628(n4, n) * method8628(n4, a2));
        }
        else {
            array[1] = abs2;
            array[0] = abs;
        }
        return 0;
    }
    
    public static double method8631(final double a, final double a2, final double[] array, final double[] array2, final int n, final int n2) {
        double n4;
        double n5;
        double n6;
        if (a2 != 0.0) {
            if (a != 0.0) {
                double a3 = a;
                double a4 = a2;
                double n3 = method8626(Math.abs(a3), Math.abs(a4));
                if (n3 < 4.994797680505588E145) {
                    if (n3 > 2.002083095183101E-146) {
                        n4 = Math.sqrt(a3 * a3 + a4 * a4);
                        n5 = a3 / n4;
                        n6 = a4 / n4;
                    }
                    else {
                        int n7 = 0;
                        while (n3 <= 2.002083095183101E-146) {
                            ++n7;
                            a3 *= 4.994797680505588E145;
                            a4 *= 4.994797680505588E145;
                            n3 = method8626(Math.abs(a3), Math.abs(a4));
                        }
                        n4 = Math.sqrt(a3 * a3 + a4 * a4);
                        n5 = a3 / n4;
                        n6 = a4 / n4;
                        for (int i = 1; i <= n7; ++i) {
                            n4 *= 2.002083095183101E-146;
                        }
                    }
                }
                else {
                    int n8 = 0;
                    while (n3 >= 4.994797680505588E145) {
                        ++n8;
                        a3 *= 2.002083095183101E-146;
                        a4 *= 2.002083095183101E-146;
                        n3 = method8626(Math.abs(a3), Math.abs(a4));
                    }
                    n4 = Math.sqrt(a3 * a3 + a4 * a4);
                    n5 = a3 / n4;
                    n6 = a4 / n4;
                    for (int j = 1; j <= n8; ++j) {
                        n4 *= 4.994797680505588E145;
                    }
                }
                if (Math.abs(a) > Math.abs(a2)) {
                    if (n5 < 0.0) {
                        n5 = -n5;
                        n6 = -n6;
                        n4 = -n4;
                    }
                }
            }
            else {
                n5 = 0.0;
                n6 = 1.0;
                n4 = a2;
            }
        }
        else {
            n5 = 1.0;
            n6 = 0.0;
            n4 = a;
        }
        array[n] = n6;
        array2[n] = n5;
        return n4;
    }
    
    public static void method8632(final double[] array) {
        for (int i = 0; i < 3; ++i) {
            System.out.println(array[i * 3] + " " + array[i * 3 + 1] + " " + array[i * 3 + 2] + "\n");
        }
    }
    
    public static void method8633(final double[] array) {
        System.out.println("det= " + (array[0] * array[4] * array[8] + array[1] * array[5] * array[6] + array[2] * array[3] * array[7] - array[2] * array[4] * array[6] - array[0] * array[5] * array[7] - array[1] * array[3] * array[8]));
    }
    
    public static void method8634(final double[] array, final double[] array2, final double[] array3) {
        final double[] array4 = { array[0] * array2[0] + array[1] * array2[3] + array[2] * array2[6], array[0] * array2[1] + array[1] * array2[4] + array[2] * array2[7], array[0] * array2[2] + array[1] * array2[5] + array[2] * array2[8], array[3] * array2[0] + array[4] * array2[3] + array[5] * array2[6], array[3] * array2[1] + array[4] * array2[4] + array[5] * array2[7], array[3] * array2[2] + array[4] * array2[5] + array[5] * array2[8], array[6] * array2[0] + array[7] * array2[3] + array[8] * array2[6], array[6] * array2[1] + array[7] * array2[4] + array[8] * array2[7], array[6] * array2[2] + array[7] * array2[5] + array[8] * array2[8] };
        System.arraycopy(array4, 0, array3, 0, 9);
    }
    
    public static void method8635(final double[] array, final double[] array2) {
        array2[0] = array[0];
        array2[1] = array[3];
        array2[2] = array[6];
        array2[3] = array[1];
        array2[4] = array[4];
        array2[5] = array[7];
        array2[6] = array[2];
        array2[7] = array[5];
        array2[8] = array[8];
    }
    
    public static double method8636(final double[] array) {
        if (array[0] <= array[1]) {
            if (array[1] <= array[2]) {
                return array[2];
            }
            return array[1];
        }
        else {
            if (array[0] <= array[2]) {
                return array[2];
            }
            return array[0];
        }
    }
    
    private static final boolean method8637(final double a, final double a2) {
        if (a != a2) {
            final double abs = Math.abs(a - a2);
            final double abs2 = Math.abs(a);
            final double abs3 = Math.abs(a2);
            final double n = (abs2 < abs3) ? abs3 : abs2;
            return abs < 1.0E-6 || abs / n < 1.0E-4;
        }
        return true;
    }
    
    public Object clone() {
        Class2274 class2274;
        try {
            class2274 = (Class2274)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
        return class2274;
    }
    
    public final double method8638() {
        return this.field13845;
    }
    
    public final void method8639(final double field13845) {
        this.field13845 = field13845;
    }
    
    public final double method8640() {
        return this.field13846;
    }
    
    public final void method8641(final double field13846) {
        this.field13846 = field13846;
    }
    
    public final double method8642() {
        return this.field13847;
    }
    
    public final void method8643(final double field13847) {
        this.field13847 = field13847;
    }
    
    public final double method8644() {
        return this.field13848;
    }
    
    public final void method8645(final double field13848) {
        this.field13848 = field13848;
    }
    
    public final double method8646() {
        return this.field13849;
    }
    
    public final void method8647(final double field13849) {
        this.field13849 = field13849;
    }
    
    public final double method8648() {
        return this.field13850;
    }
    
    public final void method8649(final double field13850) {
        this.field13850 = field13850;
    }
    
    public final double method8650() {
        return this.field13851;
    }
    
    public final void method8651(final double field13851) {
        this.field13851 = field13851;
    }
    
    public final double method8652() {
        return this.field13852;
    }
    
    public final void method8653(final double field13852) {
        this.field13852 = field13852;
    }
    
    public final double method8654() {
        return this.field13853;
    }
    
    public final void method8655(final double field13853) {
        this.field13853 = field13853;
    }
}
