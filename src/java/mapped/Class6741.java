// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Class6741
{
    public String field26502;
    private int field26503;
    private int field26504;
    private int field26505;
    private int field26506;
    private int field26507;
    private boolean field26508;
    private float field26509;
    private float[] field26510;
    private Class7740 field26511;
    private int field26512;
    private boolean field26513;
    private boolean field26514;
    private boolean field26515;
    public Class3090[] field26516;
    public Class7740 field26517;
    private float field26518;
    private Class8690 field26519;
    public int field26520;
    private Class1847 field26521;
    public static final float[] field26522;
    private static final String field26523 = "clear";
    private static final String field26524 = "rain";
    private static final String field26525 = "thunder";
    
    public Class6741(final Properties properties, final String defaultValue) {
        this.field26502 = null;
        this.field26503 = -1;
        this.field26504 = -1;
        this.field26505 = -1;
        this.field26506 = -1;
        this.field26507 = 1;
        this.field26508 = false;
        this.field26509 = 1.0f;
        this.field26510 = Class6741.field26522;
        this.field26511 = null;
        this.field26512 = 8;
        this.field26513 = true;
        this.field26514 = false;
        this.field26515 = false;
        this.field26516 = null;
        this.field26517 = null;
        this.field26518 = 1.0f;
        this.field26519 = null;
        this.field26520 = -1;
        this.field26521 = null;
        final Class8652 class8652 = new Class8652("CustomSky");
        this.field26502 = properties.getProperty("source", defaultValue);
        this.field26503 = this.method20513(properties.getProperty("startFadeIn"));
        this.field26504 = this.method20513(properties.getProperty("endFadeIn"));
        this.field26505 = this.method20513(properties.getProperty("startFadeOut"));
        this.field26506 = this.method20513(properties.getProperty("endFadeOut"));
        this.field26507 = Class9540.method35615(properties.getProperty("blend"));
        this.field26508 = this.method20514(properties.getProperty("rotate"), true);
        this.field26509 = this.method20515(properties.getProperty("speed"), 1.0f);
        this.field26510 = this.method20516(properties.getProperty("axis"), Class6741.field26522);
        this.field26511 = class8652.method29462(properties.getProperty("days"));
        this.field26512 = class8652.method29456(properties.getProperty("daysLoop"), 8);
        final List<String> method20512 = this.method20512(properties.getProperty("weather", "clear"));
        this.field26513 = method20512.contains("clear");
        this.field26514 = method20512.contains("rain");
        this.field26515 = method20512.contains("thunder");
        this.field26516 = class8652.method29454(properties.getProperty("biomes"));
        this.field26517 = class8652.method29462(properties.getProperty("heights"));
        this.field26518 = this.method20515(properties.getProperty("transition"), 1.0f);
    }
    
    private List<String> method20512(final String s) {
        final List<String> list = Arrays.asList("clear", "rain", "thunder");
        final ArrayList list2 = new ArrayList();
        final String[] method28937 = Class8571.method28937(s, " ");
        for (int i = 0; i < method28937.length; ++i) {
            final String str = method28937[i];
            if (list.contains(str)) {
                list2.add(str);
            }
            else {
                Class8571.method28848("Unknown weather: " + str);
            }
        }
        return list2;
    }
    
    private int method20513(final String s) {
        if (s == null) {
            return -1;
        }
        final String[] method28937 = Class8571.method28937(s, ":");
        if (method28937.length == 2) {
            final String s2 = method28937[0];
            final String s3 = method28937[1];
            final int method28938 = Class8571.method28933(s2, -1);
            final int method28939 = Class8571.method28933(s3, -1);
            if (method28938 >= 0) {
                if (method28938 <= 23) {
                    if (method28939 >= 0) {
                        if (method28939 <= 59) {
                            int n = method28938 - 6;
                            if (n < 0) {
                                n += 24;
                            }
                            return n * 1000 + (int)(method28939 / 60.0 * 1000.0);
                        }
                    }
                }
            }
            Class8571.method28848("Invalid time: " + s);
            return -1;
        }
        Class8571.method28848("Invalid time: " + s);
        return -1;
    }
    
    private boolean method20514(final String str, final boolean b) {
        if (str == null) {
            return b;
        }
        if (str.toLowerCase().equals("true")) {
            return true;
        }
        if (!str.toLowerCase().equals("false")) {
            Class8571.method28848("Unknown boolean: " + str);
            return b;
        }
        return false;
    }
    
    private float method20515(final String str, final float n) {
        if (str == null) {
            return n;
        }
        final float method28934 = Class8571.method28934(str, Float.MIN_VALUE);
        if (method28934 != Float.MIN_VALUE) {
            return method28934;
        }
        Class8571.method28848("Invalid value: " + str);
        return n;
    }
    
    private float[] method20516(final String str, final float[] array) {
        if (str == null) {
            return array;
        }
        final String[] method28937 = Class8571.method28937(str, " ");
        if (method28937.length != 3) {
            Class8571.method28848("Invalid axis: " + str);
            return array;
        }
        final float[] array2 = new float[3];
        for (int i = 0; i < method28937.length; ++i) {
            array2[i] = Class8571.method28934(method28937[i], Float.MIN_VALUE);
            if (array2[i] == Float.MIN_VALUE) {
                Class8571.method28848("Invalid axis: " + str);
                return array;
            }
        }
        final float n = array2[0];
        final float n2 = array2[1];
        final float n3 = array2[2];
        if (n * n + n2 * n2 + n3 * n3 >= 1.0E-5f) {
            return new float[] { n3, n2, -n };
        }
        Class8571.method28848("Invalid axis values: " + str);
        return array;
    }
    
    public boolean method20517(final String str) {
        if (this.field26502 != null) {
            this.field26502 = Class8969.method31832(this.field26502, Class8969.method31833(str));
            if (this.field26503 >= 0) {
                if (this.field26504 >= 0) {
                    if (this.field26506 >= 0) {
                        final int method20518 = this.method20518(this.field26504 - this.field26503);
                        if (this.field26505 < 0) {
                            this.field26505 = this.method20518(this.field26506 - method20518);
                            if (this.method20526(this.field26505, this.field26503, this.field26504)) {
                                this.field26505 = this.field26504;
                            }
                        }
                        final int i = method20518 + this.method20518(this.field26505 - this.field26504) + this.method20518(this.field26506 - this.field26505) + this.method20518(this.field26503 - this.field26506);
                        if (i != 24000) {
                            Class8571.method28848("Invalid fadeIn/fadeOut times, sum is not 24h: " + i);
                            return false;
                        }
                        if (this.field26509 < 0.0f) {
                            Class8571.method28848("Invalid speed: " + this.field26509);
                            return false;
                        }
                        if (this.field26512 > 0) {
                            return true;
                        }
                        Class8571.method28848("Invalid daysLoop: " + this.field26512);
                        return false;
                    }
                }
            }
            Class8571.method28848("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            return false;
        }
        Class8571.method28848("No source texture: " + str);
        return false;
    }
    
    private int method20518(int i) {
        while (i >= 24000) {
            i -= 24000;
        }
        while (i < 0) {
            i += 24000;
        }
        return i;
    }
    
    public void method20519(final Class1847 class1847, final Class7351 class1848, final int n, final float n2, final float n3, final float n4) {
        final float method28866 = Class8571.method28866(this.method20520(class1847) * this.method20522(n3, n4) * this.method20523(n), 0.0f, 1.0f);
        if (method28866 >= 1.0E-4f) {
            Class8933.method31617(this.field26520);
            Class9540.method35616(this.field26507, method28866);
            Class8933.method31635();
            Class8933.method31645(class1848.method22569().method32111());
            if (this.field26508) {
                float n5 = 0.0f;
                if (this.field26509 != Math.round(this.field26509)) {
                    n5 = (float)((class1847.method6755() + 18000L) / 24000L * (double)(this.field26509 % 1.0f) % 1.0);
                }
                Class8933.method31639(360.0f * (n5 + n2 * this.field26509), this.field26510[0], this.field26510[1], this.field26510[2]);
            }
            final Class7392 method28867 = Class7392.method22694();
            Class8933.method31639(90.0f, 1.0f, 0.0f, 0.0f);
            Class8933.method31639(-90.0f, 0.0f, 0.0f, 1.0f);
            this.method20524(method28867, 4);
            Class8933.method31635();
            Class8933.method31639(90.0f, 1.0f, 0.0f, 0.0f);
            this.method20524(method28867, 1);
            Class8933.method31636();
            Class8933.method31635();
            Class8933.method31639(-90.0f, 1.0f, 0.0f, 0.0f);
            this.method20524(method28867, 0);
            Class8933.method31636();
            Class8933.method31639(90.0f, 0.0f, 0.0f, 1.0f);
            this.method20524(method28867, 5);
            Class8933.method31639(90.0f, 0.0f, 0.0f, 1.0f);
            this.method20524(method28867, 2);
            Class8933.method31639(90.0f, 0.0f, 0.0f, 1.0f);
            this.method20524(method28867, 3);
            Class8933.method31636();
        }
    }
    
    private float method20520(final Class1847 class1847) {
        if (this.field26516 == null && this.field26517 == null) {
            return 1.0f;
        }
        final float method20521 = this.method20521(class1847);
        if (this.field26519 == null) {
            this.field26519 = new Class8690(method20521, this.field26518);
        }
        return this.field26519.method29790(method20521);
    }
    
    private float method20521(final Class1847 class1847) {
        final Class399 method5303 = Class869.method5277().method5303();
        if (method5303 != null) {
            final Class354 method5304 = method5303.method1894();
            if (this.field26516 != null) {
                final Class3090 method5305 = class1847.method6959(method5304);
                if (method5305 == null) {
                    return 0.0f;
                }
                if (!Class7980.method26019(method5305, this.field26516)) {
                    return 0.0f;
                }
            }
            return (this.field26517 != null && !this.field26517.method24697(method5304.method1075())) ? 0.0f : 1.0f;
        }
        return 0.0f;
    }
    
    private float method20522(final float n, final float n2) {
        final float n3 = 1.0f - n;
        final float n4 = n - n2;
        float n5 = 0.0f;
        if (this.field26513) {
            n5 += n3;
        }
        if (this.field26514) {
            n5 += n4;
        }
        if (this.field26515) {
            n5 += n2;
        }
        return Class3444.method11011(n5, 0.0f, 1.0f);
    }
    
    private float method20523(final int n) {
        if (this.method20526(n, this.field26503, this.field26504)) {
            return this.method20518(n - this.field26503) / (float)this.method20518(this.field26504 - this.field26503);
        }
        if (this.method20526(n, this.field26504, this.field26505)) {
            return 1.0f;
        }
        if (!this.method20526(n, this.field26505, this.field26506)) {
            return 0.0f;
        }
        return 1.0f - this.method20518(n - this.field26505) / (float)this.method20518(this.field26506 - this.field26505);
    }
    
    private void method20524(final Class7392 class7392, final int n) {
        final Class4148 method22696 = class7392.method22696();
        final float n2 = n % 3 / 3.0f;
        final float n3 = n / 3 / 2.0f;
        method22696.method12390(7, Class9237.field39617);
        method22696.method12432(-100.0, -100.0, -100.0).method12391(n2, n3).method12397();
        method22696.method12432(-100.0, -100.0, 100.0).method12391(n2, n3 + 0.5f).method12397();
        method22696.method12432(100.0, -100.0, 100.0).method12391(n2 + 0.33333334f, n3 + 0.5f).method12397();
        method22696.method12432(100.0, -100.0, -100.0).method12391(n2 + 0.33333334f, n3).method12397();
        class7392.method22695();
    }
    
    public boolean method20525(final Class1847 field26521, final int n) {
        if (field26521 != this.field26521) {
            this.field26521 = field26521;
            this.field26519 = null;
        }
        if (!this.method20526(n, this.field26506, this.field26503)) {
            if (this.field26511 != null) {
                long n2;
                for (n2 = field26521.method6755() - this.field26503; n2 < 0L; n2 += 24000 * this.field26512) {}
                if (!this.field26511.method24697((int)(n2 / 24000L) % this.field26512)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method20526(final int n, final int n2, final int n3) {
        if (n2 > n3) {
            return n >= n2 || n <= n3;
        }
        return n >= n2 && n <= n3;
    }
    
    @Override
    public String toString() {
        return "" + this.field26502 + ", " + this.field26503 + "-" + this.field26504 + " " + this.field26505 + "-" + this.field26506;
    }
    
    static {
        field26522 = new float[] { 1.0f, 0.0f, 0.0f };
    }
}
