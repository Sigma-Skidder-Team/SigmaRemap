// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.FloatBuffer;
import java.security.PrivilegedAction;
import java.security.AccessController;
import org.lwjgl.BufferUtils;
import slick2d.Color;
import slick2d.Font;
import slick2d.Renderer;

import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class Class8519
{
    public static SGL field34937;
    private static Class6020 field34938;
    public static int field34939;
    public static int field34940;
    public static int field34941;
    public static int field34942;
    public static int field34943;
    public static int field34944;
    private static final int field34945 = 50;
    public static Class8519 field34946;
    public static Font field34947;
    private float field34948;
    private float field34949;
    private Font field34950;
    private Color field34951;
    public int field34952;
    public int field34953;
    private boolean field34954;
    private Class2403 field34955;
    private DoubleBuffer field34956;
    private ByteBuffer field34957;
    private boolean field34958;
    private Class2403 field34959;
    private int field34960;
    private float field34961;
    private ArrayList field34962;
    private int field34963;
    
    public static void method28457(final Class8519 field34946) {
        if (Class8519.field34946 != field34946) {
            if (Class8519.field34946 != null) {
                Class8519.field34946.method28451();
            }
            (Class8519.field34946 = field34946).method28452();
        }
    }
    
    public Class8519() {
        this.field34948 = 1.0f;
        this.field34949 = 1.0f;
        this.field34951 = Color.field14355;
        this.field34956 = BufferUtils.createDoubleBuffer(4);
        this.field34957 = BufferUtils.createByteBuffer(4);
        this.field34960 = Class8519.field34939;
        this.field34961 = 1.0f;
        this.field34962 = new ArrayList();
    }
    
    public Class8519(final int field34952, final int field34953) {
        this.field34948 = 1.0f;
        this.field34949 = 1.0f;
        this.field34951 = Color.field14355;
        this.field34956 = BufferUtils.createDoubleBuffer(4);
        this.field34957 = BufferUtils.createByteBuffer(4);
        this.field34960 = Class8519.field34939;
        this.field34961 = 1.0f;
        this.field34962 = new ArrayList();
        if (Class8519.field34947 == null) {
            AccessController.doPrivileged((PrivilegedAction<Object>)new Class2431(this));
        }
        this.field34950 = Class8519.field34947;
        this.field34952 = field34952;
        this.field34953 = field34953;
    }
    
    public void method28458(final int field34952, final int field34953) {
        this.field34952 = field34952;
        this.field34953 = field34953;
    }
    
    public void method28459(final int field34960) {
        this.method28461();
        this.field34960 = field34960;
        if (this.field34960 == Class8519.field34939) {
            Class8519.field34937.method19265(3042);
            Class8519.field34937.method19263(true, true, true, true);
            Class8519.field34937.method19259(770, 771);
        }
        if (this.field34960 == Class8519.field34940) {
            Class8519.field34937.method19264(3042);
            Class8519.field34937.method19263(false, false, false, true);
        }
        if (this.field34960 == Class8519.field34941) {
            Class8519.field34937.method19265(3042);
            Class8519.field34937.method19263(true, true, true, false);
            Class8519.field34937.method19259(772, 773);
        }
        if (this.field34960 == Class8519.field34942) {
            Class8519.field34937.method19265(3042);
            Class8519.field34937.method19263(true, true, true, true);
            Class8519.field34937.method19259(769, 768);
        }
        if (this.field34960 == Class8519.field34943) {
            Class8519.field34937.method19265(3042);
            Class8519.field34937.method19263(true, true, true, true);
            Class8519.field34937.method19259(1, 1);
        }
        if (this.field34960 == Class8519.field34944) {
            Class8519.field34937.method19265(3042);
            Class8519.field34937.method19263(true, true, true, true);
            Class8519.field34937.method19259(1, 769);
        }
        this.method28462();
    }
    
    public void method28460() {
        this.method28530();
        Class8519.field34937.method19287();
        final int field34960 = this.field34960;
        this.method28459(Class8519.field34940);
        this.method28474(new Color(0, 0, 0, 0));
        this.method28497(0.0f, 0.0f, (float)this.field34952, (float)this.field34953);
        this.method28474(this.field34951);
        this.method28459(field34960);
        this.method28531();
    }
    
    private void method28461() {
        method28457(this);
    }
    
    private void method28462() {
    }
    
    public void method28452() {
    }
    
    public void method28456() {
        if (Class8519.field34946 == this) {
            Class8519.field34946.method28451();
            Class8519.field34946 = null;
        }
    }
    
    public void method28451() {
    }
    
    public Font method28463() {
        return this.field34950;
    }
    
    public void method28464(final Color color) {
        this.method28461();
        Class8519.field34937.method19280(color.field14368, color.field14369, color.field14370, color.field14371);
        this.method28462();
    }
    
    public Color method28465() {
        this.method28461();
        final FloatBuffer floatBuffer = BufferUtils.createFloatBuffer(16);
        Class8519.field34937.method19284(3106, floatBuffer);
        this.method28462();
        return new Color(floatBuffer);
    }
    
    public void method28466() {
        this.method28461();
        Class8519.field34937.method19261(16384);
        this.method28462();
    }
    
    public void method28467() {
        this.field34948 = 1.0f;
        this.field34949 = 1.0f;
        if (this.field34954) {
            this.method28461();
            Class8519.field34937.method19268();
            this.field34954 = false;
            this.method28462();
        }
    }
    
    private void method28468() {
        if (!this.field34954) {
            this.method28461();
            Class8519.field34937.method19269();
            this.field34954 = true;
            this.method28462();
        }
    }
    
    public void method28469(final float n, final float n2) {
        this.field34948 *= n;
        this.field34949 *= n2;
        this.method28468();
        this.method28461();
        Class8519.field34937.method19271(n, n2, 1.0f);
        this.method28462();
    }
    
    public void method28470(final float n, final float n2, final float n3) {
        this.method28468();
        this.method28461();
        this.method28471(n, n2);
        Class8519.field34937.method19270(n3, 0.0f, 0.0f, 1.0f);
        this.method28471(-n, -n2);
        this.method28462();
    }
    
    public void method28471(final float n, final float n2) {
        this.method28468();
        this.method28461();
        Class8519.field34937.method19274(n, n2, 0.0f);
        this.method28462();
    }
    
    public void method28472(final Font field34950) {
        this.field34950 = field34950;
    }
    
    public void method28473() {
        this.field34950 = Class8519.field34947;
    }
    
    public void method28474(final Color color) {
        if (color != null) {
            this.field34951 = new Color(color);
            this.method28461();
            this.field34951.bind();
            this.method28462();
        }
    }
    
    public Color method28475() {
        return new Color(this.field34951);
    }
    
    public void method28476(float n, float n2, float n3, float n4) {
        final float n5 = this.field34961 - 1.0f;
        if (Class8519.field34938.method17941()) {
            if (n == n3) {
                if (n2 > n4) {
                    final float n6 = n4;
                    n4 = n2;
                    n2 = n6;
                }
                final float n7 = 1.0f / this.field34949;
                final float n8 = n5 / this.field34949;
                this.method28497(n - n8 / 2.0f, n2 - n8 / 2.0f, n8 + n7, n4 - n2 + n8 + n7);
                return;
            }
            if (n2 == n4) {
                if (n > n3) {
                    final float n9 = n3;
                    n3 = n;
                    n = n9;
                }
                final float n10 = 1.0f / this.field34948;
                final float n11 = n5 / this.field34948;
                this.method28497(n - n11 / 2.0f, n2 - n11 / 2.0f, n3 - n + n11 + n10, n11 + n10);
                return;
            }
        }
        this.method28461();
        this.field34951.bind();
        Class7777.method24930();
        Class8519.field34938.method17932();
        Class8519.field34938.method17934(n, n2);
        Class8519.field34938.method17934(n3, n4);
        Class8519.field34938.method17933();
        this.method28462();
    }
    
    public void method28477(final Class2400 class2400, final Class7471 class2401) {
        this.method28461();
        Class7777.method24930();
        Class6044.method17967(class2400, class2401);
        this.field34951.bind();
        this.method28462();
    }
    
    public void method28478(final Class2400 class2400, final Class7471 class2401) {
        this.method28461();
        Class7777.method24930();
        Class6044.method17975(class2400, class2401);
        this.field34951.bind();
        this.method28462();
    }
    
    public void method28479(final Class2400 class2400) {
        this.method28461();
        Class7777.method24930();
        this.field34951.bind();
        Class6044.method17966(class2400);
        this.method28462();
    }
    
    public void method28480(final Class2400 class2400) {
        this.method28461();
        Class7777.method24930();
        this.field34951.bind();
        Class6044.method17969(class2400);
        this.method28462();
    }
    
    public void method28481(final Class2400 class2400, final Class7764 class2401) {
        this.method28485(class2400, class2401, 0.01f, 0.01f, false);
    }
    
    public void method28482(final Class2400 class2400, final Class7764 class2401, final Class7471 class2402) {
        this.method28486(class2400, class2401, 0.01f, 0.01f, class2402);
    }
    
    public void method28483(final Class2400 class2400, final Class7764 class2401, final boolean b) {
        if (!b) {
            this.method28485(class2400, class2401, 0.01f, 0.01f, false);
        }
        else {
            this.method28485(class2400, class2401, 1.0f, 1.0f, true);
        }
    }
    
    public void method28484(final Class2400 class2400, final Class7764 class2401, final float n, final float n2) {
        this.method28485(class2400, class2401, n, n2, false);
    }
    
    public void method28485(final Class2400 class2400, final Class7764 class2401, final float n, final float n2, final boolean b) {
        this.method28461();
        Class7777.method24930();
        this.field34951.bind();
        if (!b) {
            Class6044.method17973(class2400, class2401, n, n2);
        }
        else {
            Class6044.method17974(class2400, class2401, n, n2);
        }
        this.method28462();
    }
    
    public void method28486(final Class2400 class2400, final Class7764 class2401, final float n, final float n2, final Class7471 class2402) {
        this.method28461();
        Class7777.method24930();
        this.field34951.bind();
        Class6044.method17976(class2400, class2401, n, n2, class2402);
        this.method28462();
    }
    
    public void method28487(final float n, final float n2, final float n3, final float n4) {
        this.method28511();
        this.method28476(n, n2, n + n3, n2);
        this.method28476(n + n3, n2, n + n3, n2 + n4);
        this.method28476(n + n3, n2 + n4, n, n2 + n4);
        this.method28476(n, n2 + n4, n, n2);
    }
    
    public void method28488() {
        this.field34955 = null;
        this.method28461();
        Class8519.field34937.method19264(3089);
        this.method28462();
    }
    
    public void method28489(final float n, final float n2, final float n3, final float n4) {
        this.method28461();
        this.field34959 = new Class2403(n, n2, n3, n4);
        Class8519.field34937.method19265(12288);
        this.field34956.put(1.0).put(0.0).put(0.0).put(-n).flip();
        Class8519.field34937.method19262(12288, this.field34956);
        Class8519.field34937.method19265(12289);
        this.field34956.put(-1.0).put(0.0).put(0.0).put(n + n3).flip();
        Class8519.field34937.method19262(12289, this.field34956);
        Class8519.field34937.method19265(12290);
        this.field34956.put(0.0).put(1.0).put(0.0).put(-n2).flip();
        Class8519.field34937.method19262(12290, this.field34956);
        Class8519.field34937.method19265(12291);
        this.field34956.put(0.0).put(-1.0).put(0.0).put(n2 + n4).flip();
        Class8519.field34937.method19262(12291, this.field34956);
        this.method28462();
    }
    
    public void method28490() {
        this.method28461();
        this.field34959 = null;
        Class8519.field34937.method19264(12288);
        Class8519.field34937.method19264(12289);
        Class8519.field34937.method19264(12290);
        Class8519.field34937.method19264(12291);
        this.method28462();
    }
    
    public void method28491(final Class2403 class2403) {
        if (class2403 != null) {
            this.method28489(class2403.method9521(), class2403.method9524(), class2403.method9558(), class2403.method9559());
        }
        else {
            this.method28490();
        }
    }
    
    public Class2403 method28492() {
        return this.field34959;
    }
    
    public void method28493(final int n, final int n2, final int n3, final int n4) {
        this.method28461();
        if (this.field34955 != null) {
            this.field34955.method9588((float)n, (float)n2, (float)n3, (float)n4);
        }
        else {
            Class8519.field34937.method19265(3089);
            this.field34955 = new Class2403((float)n, (float)n2, (float)n3, (float)n4);
        }
        Class8519.field34937.method19272(n, this.field34953 - n2 - n4, n3, n4);
        this.method28462();
    }
    
    public void method28494(final Class2403 class2403) {
        if (class2403 != null) {
            this.method28493((int)class2403.method9521(), (int)class2403.method9524(), (int)class2403.method9558(), (int)class2403.method9559());
            return;
        }
        this.method28488();
    }
    
    public Class2403 method28495() {
        return this.field34955;
    }
    
    public void method28496(final float n, final float n2, final float n3, final float n4, final Class7764 class7764, final float n5, final float n6) {
        final int n7 = (int)Math.ceil(n3 / class7764.method24843()) + 2;
        final int n8 = (int)Math.ceil(n4 / class7764.method24844()) + 2;
        final Class2403 method28492 = this.method28492();
        this.method28489(n, n2, n3, n4);
        this.method28461();
        for (int i = 0; i < n7; ++i) {
            for (int j = 0; j < n8; ++j) {
                class7764.method24775(i * class7764.method24843() + n - n5, j * class7764.method24844() + n2 - n6);
            }
        }
        this.method28462();
        this.method28491(method28492);
    }
    
    public void method28497(final float n, final float n2, final float n3, final float n4) {
        this.method28461();
        Class7777.method24930();
        this.field34951.bind();
        Class8519.field34937.glBegin(7);
        Class8519.field34937.glVertex2f(n, n2);
        Class8519.field34937.glVertex2f(n + n3, n2);
        Class8519.field34937.glVertex2f(n + n3, n2 + n4);
        Class8519.field34937.glVertex2f(n, n2 + n4);
        Class8519.field34937.method19253();
        this.method28462();
    }
    
    public void method28498(final float n, final float n2, final float n3, final float n4) {
        this.method28499(n, n2, n3, n4, 50);
    }
    
    public void method28499(final float n, final float n2, final float n3, final float n4, final int n5) {
        this.method28501(n, n2, n3, n4, n5, 0.0f, 360.0f);
    }
    
    public void method28500(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.method28501(n, n2, n3, n4, 50, n5, n6);
    }
    
    public void method28501(final float n, final float n2, final float n3, final float n4, final int n5, final float n6, float n7) {
        this.method28461();
        Class7777.method24930();
        this.field34951.bind();
        while (n7 < n6) {
            n7 += 360.0f;
        }
        final float n8 = n + n3 / 2.0f;
        final float n9 = n2 + n4 / 2.0f;
        Class8519.field34938.method17932();
        for (int n10 = 360 / n5, i = (int)n6; i < (int)(n7 + n10); i += n10) {
            float n11 = (float)i;
            if (n11 > n7) {
                n11 = n7;
            }
            Class8519.field34938.method17934((float)(n8 + Class6882.method21086(Math.toRadians(n11)) * n3 / 2.0), (float)(n9 + Class6882.method21085(Math.toRadians(n11)) * n4 / 2.0));
        }
        Class8519.field34938.method17933();
        this.method28462();
    }
    
    public void method28502(final float n, final float n2, final float n3, final float n4) {
        this.method28503(n, n2, n3, n4, 50);
    }
    
    public void method28503(final float n, final float n2, final float n3, final float n4, final int n5) {
        this.method28505(n, n2, n3, n4, n5, 0.0f, 360.0f);
    }
    
    public void method28504(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.method28505(n, n2, n3, n4, 50, n5, n6);
    }
    
    public void method28505(final float n, final float n2, final float n3, final float n4, final int n5, final float n6, float n7) {
        this.method28461();
        Class7777.method24930();
        this.field34951.bind();
        while (n7 < n6) {
            n7 += 360.0f;
        }
        final float n8 = n + n3 / 2.0f;
        final float n9 = n2 + n4 / 2.0f;
        Class8519.field34937.glBegin(6);
        final int n10 = 360 / n5;
        Class8519.field34937.glVertex2f(n8, n9);
        for (int i = (int)n6; i < (int)(n7 + n10); i += n10) {
            float n11 = (float)i;
            if (n11 > n7) {
                n11 = n7;
            }
            Class8519.field34937.glVertex2f((float)(n8 + Class6882.method21086(Math.toRadians(n11)) * n3 / 2.0), (float)(n9 + Class6882.method21085(Math.toRadians(n11)) * n4 / 2.0));
        }
        Class8519.field34937.method19253();
        if (this.field34958) {
            Class8519.field34937.glBegin(6);
            Class8519.field34937.glVertex2f(n8, n9);
            if (n7 != 360.0f) {
                n7 -= 10.0f;
            }
            for (int j = (int)n6; j < (int)(n7 + n10); j += n10) {
                float n12 = (float)j;
                if (n12 > n7) {
                    n12 = n7;
                }
                Class8519.field34937.glVertex2f((float)(n8 + Class6882.method21086(Math.toRadians(n12 + 10.0f)) * n3 / 2.0), (float)(n9 + Class6882.method21085(Math.toRadians(n12 + 10.0f)) * n4 / 2.0));
            }
            Class8519.field34937.method19253();
        }
        this.method28462();
    }
    
    public void method28506(final float n, final float n2, final float n3, final float n4, final int n5) {
        this.method28507(n, n2, n3, n4, n5, 50);
    }
    
    public void method28507(final float n, final float n2, final float a, final float b, int n3, final int n4) {
        if (n3 < 0) {
            throw new IllegalArgumentException("corner radius must be > 0");
        }
        if (n3 != 0) {
            final int n5 = (int)Math.min(a, b) / 2;
            if (n3 > n5) {
                n3 = n5;
            }
            this.method28476(n + n3, n2, n + a - n3, n2);
            this.method28476(n, n2 + n3, n, n2 + b - n3);
            this.method28476(n + a, n2 + n3, n + a, n2 + b - n3);
            this.method28476(n + n3, n2 + b, n + a - n3, n2 + b);
            final float n6 = (float)(n3 * 2);
            this.method28501(n + a - n6, n2 + b - n6, n6, n6, n4, 0.0f, 90.0f);
            this.method28501(n, n2 + b - n6, n6, n6, n4, 90.0f, 180.0f);
            this.method28501(n + a - n6, n2, n6, n6, n4, 270.0f, 360.0f);
            this.method28501(n, n2, n6, n6, n4, 180.0f, 270.0f);
            return;
        }
        this.method28487(n, n2, a, b);
    }
    
    public void method28508(final float n, final float n2, final float n3, final float n4, final int n5) {
        this.method28509(n, n2, n3, n4, n5, 50);
    }
    
    public void method28509(final float n, final float n2, final float a, final float b, int n3, final int n4) {
        if (n3 < 0) {
            throw new IllegalArgumentException("corner radius must be > 0");
        }
        if (n3 != 0) {
            final int n5 = (int)Math.min(a, b) / 2;
            if (n3 > n5) {
                n3 = n5;
            }
            final float n6 = (float)(n3 * 2);
            this.method28497(n + n3, n2, a - n6, (float)n3);
            this.method28497(n, n2 + n3, (float)n3, b - n6);
            this.method28497(n + a - n3, n2 + n3, (float)n3, b - n6);
            this.method28497(n + n3, n2 + b - n3, a - n6, (float)n3);
            this.method28497(n + n3, n2 + n3, a - n6, b - n6);
            this.method28505(n + a - n6, n2 + b - n6, n6, n6, n4, 0.0f, 90.0f);
            this.method28505(n, n2 + b - n6, n6, n6, n4, 90.0f, 180.0f);
            this.method28505(n + a - n6, n2, n6, n6, n4, 270.0f, 360.0f);
            this.method28505(n, n2, n6, n6, n4, 180.0f, 270.0f);
            return;
        }
        this.method28497(n, n2, a, b);
    }
    
    public void method28510(final float field34961) {
        this.method28461();
        this.field34961 = field34961;
        Class8519.field34938.method17935(field34961);
        Class8519.field34937.method19267(field34961);
        this.method28462();
    }
    
    public float method28511() {
        return this.field34961;
    }
    
    public void method28512() {
        this.method28461();
        Renderer.method25331().method17935(1.0f);
        Class8519.field34937.method19266(1.0f);
        Class8519.field34937.method19267(1.0f);
        this.method28462();
    }
    
    public void method28513(final boolean field34958) {
        this.method28461();
        this.field34958 = field34958;
        Class8519.field34938.method17936(field34958);
        if (!field34958) {
            Class8519.field34937.method19264(2881);
        }
        else {
            Class8519.field34937.method19265(2881);
        }
        this.method28462();
    }
    
    public boolean method28514() {
        return this.field34958;
    }
    
    public void method28515(final String s, final float n, final float n2) {
        this.method28461();
        this.field34950.drawString(n, n2, s, this.field34951);
        this.method28462();
    }
    
    public void method28516(final Class7764 class7764, final float n, final float n2, final Color class7765) {
        this.method28461();
        class7764.method24776(n, n2, class7765);
        this.field34951.bind();
        this.method28462();
    }
    
    public void method28517(final Class7762 class7762, final float n, final float n2) {
        this.method28518(class7762, n, n2, Color.field14355);
    }
    
    public void method28518(final Class7762 class7762, final float n, final float n2, final Color class7763) {
        this.method28461();
        class7762.method24776(n, n2, class7763);
        this.field34951.bind();
        this.method28462();
    }
    
    public void method28519(final Class7764 class7764, final float n, final float n2) {
        this.method28516(class7764, n, n2, Color.field14355);
    }
    
    public void method28520(final Class7764 class7764, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        this.method28461();
        class7764.method24838(n, n2, n3, n4, n5, n6, n7, n8);
        this.field34951.bind();
        this.method28462();
    }
    
    public void method28521(final Class7764 class7764, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.method28520(class7764, n, n2, n + class7764.method24843(), n2 + class7764.method24844(), n3, n4, n5, n6);
    }
    
    public void method28522(final Class7764 class7764, final int n, final int n2) {
        final int n3 = class7764.method24852().method24914() ? 6408 : 6407;
        class7764.method24811();
        Class8519.field34937.method19281(3553, 0, n3, n, this.field34953 - (n2 + class7764.method24844()), class7764.method24852().method24922(), class7764.method24852().method24921(), 0);
        class7764.method24848();
    }
    
    private int method28523(final byte b) {
        if (b >= 0) {
            return b;
        }
        return 256 + b;
    }
    
    public Color method28524(final int n, final int n2) {
        this.method28461();
        Class8519.field34937.method19288(n, this.field34953 - n2, 1, 1, 6408, 5121, this.field34957);
        this.method28462();
        return new Color(this.method28523(this.field34957.get(0)), this.method28523(this.field34957.get(1)), this.method28523(this.field34957.get(2)), this.method28523(this.field34957.get(3)));
    }
    
    public void method28525(final int n, final int n2, final int n3, final int n4, final ByteBuffer byteBuffer) {
        if (byteBuffer.capacity() >= n3 * n4 * 4) {
            this.method28461();
            Class8519.field34937.method19288(n, this.field34953 - n2 - n4, n3, n4, 6408, 5121, byteBuffer);
            this.method28462();
            return;
        }
        throw new IllegalArgumentException("Byte buffer provided to get area is not big enough");
    }
    
    public void method28526(final Class7764 class7764, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final Color class7765) {
        this.method28461();
        class7764.method24839(n, n2, n3, n4, n5, n6, n7, n8, class7765);
        this.field34951.bind();
        this.method28462();
    }
    
    public void method28527(final Class7764 class7764, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final Color class7765) {
        this.method28526(class7764, n, n2, n + class7764.method24843(), n2 + class7764.method24844(), n3, n4, n5, n6, class7765);
    }
    
    public void method28528(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final float n11, final float n12) {
        this.method28461();
        Class7777.method24930();
        Class8519.field34937.glBegin(1);
        Class8519.field34937.method19252(n3, n4, n5, n6);
        Class8519.field34937.glVertex2f(n, n2);
        Class8519.field34937.method19252(n9, n10, n11, n12);
        Class8519.field34937.glVertex2f(n7, n8);
        Class8519.field34937.method19253();
        this.method28462();
    }
    
    public void method28529(final float n, final float n2, final Color color, final float n3, final float n4, final Color class2428) {
        this.method28461();
        Class7777.method24930();
        Class8519.field34937.glBegin(1);
        color.bind();
        Class8519.field34937.glVertex2f(n, n2);
        class2428.bind();
        Class8519.field34937.glVertex2f(n3, n4);
        Class8519.field34937.method19253();
        this.method28462();
    }
    
    public void method28530() {
        this.method28461();
        FloatBuffer floatBuffer;
        if (this.field34963 < this.field34962.size()) {
            floatBuffer = this.field34962.get(this.field34963);
        }
        else {
            floatBuffer = BufferUtils.createFloatBuffer(18);
            this.field34962.add(floatBuffer);
        }
        Class8519.field34937.method19284(2982, floatBuffer);
        floatBuffer.put(16, this.field34948);
        floatBuffer.put(17, this.field34949);
        ++this.field34963;
        this.method28462();
    }
    
    public void method28531() {
        if (this.field34963 != 0) {
            this.method28461();
            --this.field34963;
            final FloatBuffer floatBuffer = this.field34962.get(this.field34963);
            Class8519.field34937.method19278(floatBuffer);
            this.field34948 = floatBuffer.get(16);
            this.field34949 = floatBuffer.get(17);
            this.method28462();
            return;
        }
        throw new RuntimeException("Attempt to pop a transform that hasn't be pushed");
    }
    
    public void method28455() {
    }
    
    static {
        Class8519.field34937 = Renderer.get();
        Class8519.field34938 = Renderer.method25331();
        Class8519.field34939 = 1;
        Class8519.field34940 = 2;
        Class8519.field34941 = 3;
        Class8519.field34942 = 4;
        Class8519.field34943 = 5;
        Class8519.field34944 = 6;
        Class8519.field34946 = null;
    }
}
