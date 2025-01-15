// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.Logger;

public class Class9049
{
    private static final Logger field38299;
    private final Class1849 field38300;
    private final Entity field38301;
    private final int field38302;
    private final boolean field38303;
    private final Consumer<Class4252<?>> field38304;
    private long field38305;
    private long field38306;
    private long field38307;
    private int field38308;
    private int field38309;
    private int field38310;
    private Vec3d field38311;
    private int field38312;
    private int field38313;
    private List<Entity> field38314;
    private boolean field38315;
    private boolean field38316;
    
    public Class9049(final Class1849 field38300, final Entity field38301, final int field38302, final boolean field38303, final Consumer<Class4252<?>> field38304) {
        this.field38311 = Vec3d.ZERO;
        this.field38314 = Collections.emptyList();
        this.field38300 = field38300;
        this.field38304 = field38304;
        this.field38301 = field38301;
        this.field38302 = field38302;
        this.field38303 = field38303;
        this.method32543();
        this.field38308 = MathHelper.method35642(field38301.field2399 * 256.0f / 360.0f);
        this.field38309 = MathHelper.method35642(field38301.field2400 * 256.0f / 360.0f);
        this.field38310 = MathHelper.method35642(field38301.method1844() * 256.0f / 360.0f);
        this.field38316 = field38301.field2404;
    }
    
    public void method32538() {
        final List<Entity> method1908 = this.field38301.method1908();
        if (!method1908.equals(this.field38314)) {
            this.field38314 = method1908;
            this.field38304.accept(new Class4286(this.field38301));
        }
        if (this.field38301 instanceof Class862) {
            if (this.field38312 % 10 == 0) {
                final Class8321 method1909 = ((Class862)this.field38301).method5198();
                if (method1909.method27622() instanceof Class4094) {
                    final Class6356 method1910 = Class4094.method12328(method1909, this.field38300);
                    for (final Class513 class513 : this.field38300.method6840()) {
                        method1910.method18916(class513, method1909);
                        final Class4252<?> method1911 = ((Class4094)method1909.method27622()).method12325(method1909, this.field38300, class513);
                        if (method1911 == null) {
                            continue;
                        }
                        class513.field3039.method17469(method1911);
                    }
                }
                this.method32542();
            }
        }
        Label_0352: {
            if (this.field38312 % this.field38302 != 0) {
                if (!this.field38301.field2448) {
                    if (!this.field38301.method1650().method33570()) {
                        break Label_0352;
                    }
                }
            }
            if (!this.field38301.method1805()) {
                ++this.field38313;
                final int method1912 = MathHelper.method35642(this.field38301.field2399 * 256.0f / 360.0f);
                final int method1913 = MathHelper.method35642(this.field38301.field2400 * 256.0f / 360.0f);
                final Vec3d method1914 = this.field38301.method1934().subtract(Class4370.method13141(this.field38305, this.field38306, this.field38307));
                final boolean b = method1914.lengthSquared() >= 7.62939453125E-6;
                Class4252<?> class514 = null;
                final boolean b2 = b || this.field38312 % 60 == 0;
                final boolean b3 = Math.abs(method1912 - this.field38308) >= 1 || Math.abs(method1913 - this.field38309) >= 1;
                Label_0674: {
                    if (this.field38312 > 0 || this.field38301 instanceof Class402) {
                        final long method1915 = Class4370.method13140(method1914.x);
                        final long method1916 = Class4370.method13140(method1914.y);
                        final long method1917 = Class4370.method13140(method1914.z);
                        boolean b4 = false;
                        Label_0790: {
                            if (method1915 >= -32768L) {
                                if (method1915 <= 32767L) {
                                    if (method1916 >= -32768L) {
                                        if (method1916 <= 32767L) {
                                            if (method1917 >= -32768L) {
                                                if (method1917 <= 32767L) {
                                                    b4 = false;
                                                    break Label_0790;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            b4 = true;
                        }
                        if (!b4) {
                            if (this.field38313 <= 400) {
                                if (!this.field38315) {
                                    if (this.field38316 == this.field38301.field2404) {
                                        if (!b2 || !b3) {
                                            if (!(this.field38301 instanceof Class402)) {
                                                if (b2) {
                                                    class514 = new Class4372(this.field38301.method1643(), (short)method1915, (short)method1916, (short)method1917, this.field38301.field2404);
                                                    break Label_0674;
                                                }
                                                if (!b3) {
                                                    break Label_0674;
                                                }
                                                class514 = new Class4373(this.field38301.method1643(), (byte)method1912, (byte)method1913, this.field38301.field2404);
                                                break Label_0674;
                                            }
                                        }
                                        class514 = new Class4371(this.field38301.method1643(), (short)method1915, (short)method1916, (short)method1917, (byte)method1912, (byte)method1913, this.field38301.field2404);
                                        break Label_0674;
                                    }
                                }
                            }
                        }
                        this.field38316 = this.field38301.field2404;
                        this.field38313 = 0;
                        class514 = new Class4258(this.field38301);
                    }
                }
                Label_0688: {
                    if (!this.field38303) {
                        if (!this.field38301.field2448) {
                            if (!(this.field38301 instanceof Class511)) {
                                break Label_0688;
                            }
                            if (!((Class511)this.field38301).method2773()) {
                                break Label_0688;
                            }
                        }
                    }
                    if (this.field38312 > 0) {
                        final Vec3d method1918 = this.field38301.method1935();
                        final double method1919 = method1918.squareDistanceTo(this.field38311);
                        if (method1919 <= 1.0E-7) {
                            if (method1919 <= 0.0) {
                                break Label_0688;
                            }
                            if (method1918.lengthSquared() != 0.0) {
                                break Label_0688;
                            }
                        }
                        this.field38311 = method1918;
                        this.field38304.accept(new Class4273(this.field38301.method1643(), this.field38311));
                    }
                }
                if (class514 != null) {
                    this.field38304.accept(class514);
                }
                this.method32542();
                if (b2) {
                    this.method32543();
                }
                if (b3) {
                    this.field38308 = method1912;
                    this.field38309 = method1913;
                }
                this.field38315 = false;
            }
            else {
                final int method1920 = MathHelper.method35642(this.field38301.field2399 * 256.0f / 360.0f);
                final int method1921 = MathHelper.method35642(this.field38301.field2400 * 256.0f / 360.0f);
                if (Math.abs(method1920 - this.field38308) >= 1 || Math.abs(method1921 - this.field38309) >= 1) {
                    this.field38304.accept(new Class4373(this.field38301.method1643(), (byte)method1920, (byte)method1921, this.field38301.field2404));
                    this.field38308 = method1920;
                    this.field38309 = method1921;
                }
                this.method32543();
                this.method32542();
                this.field38315 = true;
            }
            final int method1922 = MathHelper.method35642(this.field38301.method1844() * 256.0f / 360.0f);
            if (Math.abs(method1922 - this.field38310) >= 1) {
                this.field38304.accept(new Class4364(this.field38301, (byte)method1922));
                this.field38310 = method1922;
            }
            this.field38301.field2448 = false;
        }
        ++this.field38312;
        if (this.field38301.field2408) {
            this.method32545(new Class4273(this.field38301));
            this.field38301.field2408 = false;
        }
    }
    
    public void method32539(final Class513 class513) {
        this.field38301.method1902(class513);
        class513.method2949(this.field38301);
    }
    
    public void method32540(final Class513 class513) {
        this.method32541(class513.field3039::method17469);
        this.field38301.method1901(class513);
        class513.method2950(this.field38301);
    }
    
    public void method32541(final Consumer<Class4252<?>> consumer) {
        if (this.field38301.field2410) {
            Class9049.field38299.warn("Fetching packet for removed entity " + this.field38301);
        }
        final Class4252<?> method1932 = this.field38301.method1932();
        this.field38310 = MathHelper.method35642(this.field38301.method1844() * 256.0f / 360.0f);
        consumer.accept(method1932);
        if (!this.field38301.method1650().method33579()) {
            consumer.accept(new Class4268(this.field38301.method1643(), this.field38301.method1650(), true));
        }
        int field38303 = this.field38303 ? 1 : 0;
        if (this.field38301 instanceof Class511) {
            final Collection<Class7619> method1933 = ((Class6820)((Class511)this.field38301).method2711()).method20877();
            if (!method1933.isEmpty()) {
                consumer.accept(new Class4347(this.field38301.method1643(), method1933));
            }
            if (((Class511)this.field38301).method2773()) {
                field38303 = 1;
            }
        }
        this.field38311 = this.field38301.method1935();
        if (field38303 != 0) {
            if (!(method1932 instanceof Class4276)) {
                consumer.accept(new Class4273(this.field38301.method1643(), this.field38311));
            }
        }
        if (this.field38301 instanceof Class511) {
            for (final Class2215 class2215 : Class2215.values()) {
                final Class8321 method1934 = ((Class511)this.field38301).method2718(class2215);
                if (!method1934.method27620()) {
                    consumer.accept(new Class4402(this.field38301.method1643(), class2215, method1934));
                }
            }
        }
        if (this.field38301 instanceof Class511) {
            final Iterator<Class1948> iterator = ((Class511)this.field38301).method2651().iterator();
            while (iterator.hasNext()) {
                consumer.accept(new Class4384(this.field38301.method1643(), iterator.next()));
            }
        }
        if (!this.field38301.method1908().isEmpty()) {
            consumer.accept(new Class4286(this.field38301));
        }
        if (this.field38301.method1805()) {
            consumer.accept(new Class4286(this.field38301.method1920()));
        }
        if (this.field38301 instanceof Class759) {
            final Class759 class2216 = (Class759)this.field38301;
            if (class2216.method4205()) {
                consumer.accept(new Class4305(class2216, class2216.method4206()));
            }
        }
    }
    
    private void method32542() {
        final Class9184 method1650 = this.field38301.method1650();
        if (method1650.method33570()) {
            this.method32545(new Class4268(this.field38301.method1643(), method1650, false));
        }
        if (this.field38301 instanceof Class511) {
            final Set<Class7619> method1651 = ((Class6820)((Class511)this.field38301).method2711()).method20876();
            if (!method1651.isEmpty()) {
                this.method32545(new Class4347(this.field38301.method1643(), method1651));
            }
            method1651.clear();
        }
    }
    
    private void method32543() {
        this.field38305 = Class4370.method13140(this.field38301.getPosX());
        this.field38306 = Class4370.method13140(this.field38301.getPosY());
        this.field38307 = Class4370.method13140(this.field38301.getPosZ());
    }
    
    public Vec3d method32544() {
        return Class4370.method13141(this.field38305, this.field38306, this.field38307);
    }
    
    private void method32545(final Class4252<?> class4252) {
        this.field38304.accept(class4252);
        if (this.field38301 instanceof Class513) {
            ((Class513)this.field38301).field3039.method17469(class4252);
        }
    }
    
    static {
        field38299 = LogManager.getLogger();
    }
}
