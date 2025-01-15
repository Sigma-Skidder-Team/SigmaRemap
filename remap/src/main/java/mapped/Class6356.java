// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import net.minecraft.util.math.MathHelper;

import java.util.Map;
import java.util.List;

public class Class6356 extends Class6354
{
    public int field25420;
    public int field25421;
    public Class383 field25422;
    public boolean field25423;
    public boolean field25424;
    public byte field25425;
    public byte[] field25426;
    public boolean field25427;
    public final List<Class9244> field25428;
    private final Map<Class512, Class9244> field25429;
    private final Map<String, Class8843> field25430;
    public final Map<String, Class9323> field25431;
    private final Map<String, Class8525> field25432;
    
    public Class6356(final String s) {
        super(s);
        this.field25426 = new byte[16384];
        this.field25428 = Lists.newArrayList();
        this.field25429 = Maps.newHashMap();
        this.field25430 = Maps.newHashMap();
        this.field25431 = Maps.newLinkedHashMap();
        this.field25432 = Maps.newHashMap();
    }
    
    public void method18913(final int n, final int n2, final int n3, final boolean field25423, final boolean field25424, final Class383 field25425) {
        this.field25425 = (byte)n3;
        this.method18914(n, n2, this.field25425);
        this.field25422 = field25425;
        this.field25423 = field25423;
        this.field25424 = field25424;
        this.method18903();
    }
    
    public void method18914(final double n, final double n2, final int n3) {
        final int n4 = 128 * (1 << n3);
        final int method35644 = MathHelper.floor((n + 64.0) / n4);
        final int method35645 = MathHelper.floor((n2 + 64.0) / n4);
        this.field25420 = method35644 * n4 + n4 / 2 - 64;
        this.field25421 = method35645 * n4 + n4 / 2 - 64;
    }
    
    @Override
    public void method18901(final Class51 class51) {
        final int method319 = class51.method319("dimension");
        final Class383 method320 = Class383.method1274(method319);
        if (method320 != null) {
            this.field25422 = method320;
            this.field25420 = class51.method319("xCenter");
            this.field25421 = class51.method319("zCenter");
            this.field25425 = (byte) MathHelper.method35651(class51.method317("scale"), 0, 4);
            this.field25423 = (!class51.method316("trackingPosition", 1) || class51.method329("trackingPosition"));
            this.field25424 = class51.method329("unlimitedTracking");
            this.field25427 = class51.method329("locked");
            this.field25426 = class51.method324("colors");
            if (this.field25426.length != 16384) {
                this.field25426 = new byte[16384];
            }
            final Class52 method321 = class51.method328("banners", 10);
            for (int i = 0; i < method321.size(); ++i) {
                final Class8843 method322 = Class8843.method30895(method321.method346(i));
                this.field25430.put(method322.method30901(), method322);
                this.method18918(method322.method30898(), null, method322.method30901(), method322.method30897().getX(), method322.method30897().getZ(), 180.0, method322.method30899());
            }
            final Class52 method323 = class51.method328("frames", 10);
            for (int j = 0; j < method323.size(); ++j) {
                final Class8525 method324 = Class8525.method28588(method323.method346(j));
                this.field25432.put(method324.method28593(), method324);
                this.method18918(Class2095.field12112, null, "frame-" + method324.method28592(), method324.method28590().getX(), method324.method28590().getZ(), method324.method28591(), null);
            }
            return;
        }
        throw new IllegalArgumentException("Invalid map dimension: " + method319);
    }
    
    @Override
    public Class51 method18902(final Class51 class51) {
        class51.method298("dimension", this.field25422.method1270());
        class51.method298("xCenter", this.field25420);
        class51.method298("zCenter", this.field25421);
        class51.method296("scale", this.field25425);
        class51.method307("colors", this.field25426);
        class51.method312("trackingPosition", this.field25423);
        class51.method312("unlimitedTracking", this.field25424);
        class51.method312("locked", this.field25427);
        final Class52 class52 = new Class52();
        final Iterator<Class8843> iterator = this.field25430.values().iterator();
        while (iterator.hasNext()) {
            ((AbstractList<Class51>)class52).add(iterator.next().method30900());
        }
        class51.method295("banners", class52);
        final Class52 class53 = new Class52();
        final Iterator<Class8525> iterator2 = this.field25432.values().iterator();
        while (iterator2.hasNext()) {
            ((AbstractList<Class51>)class53).add(iterator2.next().method28589());
        }
        class51.method295("frames", class53);
        return class51;
    }
    
    public void method18915(final Class6356 class6356) {
        this.field25427 = true;
        this.field25420 = class6356.field25420;
        this.field25421 = class6356.field25421;
        this.field25430.putAll(class6356.field25430);
        this.field25431.putAll(class6356.field25431);
        System.arraycopy(class6356.field25426, 0, this.field25426, 0, class6356.field25426.length);
        this.method18903();
    }
    
    public void method18916(final Class512 class512, final Class8321 class513) {
        if (!this.field25429.containsKey(class512)) {
            final Class9244 class514 = new Class9244(this, class512);
            this.field25429.put(class512, class514);
            this.field25428.add(class514);
        }
        if (!class512.field3006.method2376(class513)) {
            this.field25431.remove(class512.method1841().getString());
        }
        for (int i = 0; i < this.field25428.size(); ++i) {
            final Class9244 class515 = this.field25428.get(i);
            final String string = class515.field39643.method1841().getString();
            if (!class515.field39643.field2410 && (class515.field39643.field3006.method2376(class513) || class513.method27677())) {
                if (!class513.method27677()) {
                    if (class515.field39643.field2452 == this.field25422) {
                        if (this.field25423) {
                            this.method18918(Class2095.field12111, class515.field39643.field2391, string, class515.field39643.getPosX(), class515.field39643.getPosZ(), class515.field39643.field2399, null);
                        }
                    }
                }
            }
            else {
                this.field25429.remove(class515.field39643);
                this.field25428.remove(class515);
                this.field25431.remove(string);
            }
        }
        if (class513.method27677()) {
            if (this.field25423) {
                final Class862 method27679 = class513.method27679();
                final BlockPos method27680 = method27679.method5194();
                final Class8525 class516 = this.field25432.get(Class8525.method28594(method27680));
                if (class516 != null) {
                    if (method27679.method1643() != class516.method28592()) {
                        if (this.field25432.containsKey(class516.method28593())) {
                            this.field25431.remove("frame-" + class516.method28592());
                        }
                    }
                }
                final Class8525 class517 = new Class8525(method27680, method27679.method1882().getHorizontalIndex() * 90, method27679.method1643());
                this.method18918(Class2095.field12112, class512.field2391, "frame-" + method27679.method1643(), method27680.getX(), method27680.getZ(), method27679.method1882().getHorizontalIndex() * 90, null);
                this.field25432.put(class517.method28593(), class517);
            }
        }
        final Class51 method27681 = class513.method27657();
        if (method27681 != null) {
            if (method27681.method316("Decorations", 9)) {
                final Class52 method27682 = method27681.method328("Decorations", 10);
                for (int j = 0; j < method27682.size(); ++j) {
                    final Class51 method27683 = method27682.method346(j);
                    if (!this.field25431.containsKey(method27683.method323("id"))) {
                        this.method18918(Class2095.method8216(method27683.method317("type")), class512.field2391, method27683.method323("id"), method27683.method322("x"), method27683.method322("z"), method27683.method322("rot"), null);
                    }
                }
            }
        }
    }
    
    public static void method18917(final Class8321 class8321, final BlockPos class8322, final String s, final Class2095 class8323) {
        Class52 method328;
        if (class8321.method27656() && class8321.method27657().method316("Decorations", 9)) {
            method328 = class8321.method27657().method328("Decorations", 10);
        }
        else {
            method328 = new Class52();
            class8321.method27676("Decorations", method328);
        }
        final Class51 e = new Class51();
        e.method296("type", class8323.method8212());
        e.method306("id", s);
        e.method305("x", class8322.getX());
        e.method305("z", class8322.getZ());
        e.method305("rot", 180.0);
        ((AbstractList<Class51>)method328).add(e);
        if (class8323.method8214()) {
            class8321.method27659("display").method298("MapColor", class8323.method8215());
        }
    }
    
    private void method18918(Class2095 class2095, final Class1851 class2096, final String s, final double n, final double n2, double n3, final Class2250 class2097) {
        final int n4 = 1 << this.field25425;
        final float a = (float)(n - this.field25420) / n4;
        final float a2 = (float)(n2 - this.field25421) / n4;
        byte b = (byte)(a * 2.0f + 0.5);
        byte b2 = (byte)(a2 * 2.0f + 0.5);
        byte b3 = 0;
        Label_0201: {
            if (a >= -63.0f) {
                if (a2 >= -63.0f) {
                    if (a <= 63.0f) {
                        if (a2 <= 63.0f) {
                            n3 += ((n3 >= 0.0) ? 8.0 : -8.0);
                            b3 = (byte)(n3 * 16.0 / 360.0);
                            if (this.field25422 != Class383.field2224) {
                                break Label_0201;
                            }
                            if (class2096 == null) {
                                break Label_0201;
                            }
                            final int n5 = (int)(class2096.method6764().method29540() / 10L);
                            b3 = (byte)(n5 * n5 * 34187121 + n5 * 121 >> 15 & 0xF);
                            break Label_0201;
                        }
                    }
                }
            }
            if (class2095 != Class2095.field12111) {
                this.field25431.remove(s);
                return;
            }
            if (Math.abs(a) < 320.0f && Math.abs(a2) < 320.0f) {
                class2095 = Class2095.field12117;
            }
            else {
                if (!this.field25424) {
                    this.field25431.remove(s);
                    return;
                }
                class2095 = Class2095.field12118;
            }
            b3 = 0;
            if (a <= -63.0f) {
                b = -128;
            }
            if (a2 <= -63.0f) {
                b2 = -128;
            }
            if (a >= 63.0f) {
                b = 127;
            }
            if (a2 >= 63.0f) {
                b2 = 127;
            }
        }
        this.field25431.put(s, new Class9323(class2095, b, b2, b3, class2097));
    }
    
    @Nullable
    public Class4252<?> method18919(final Class8321 class8321, final Class1855 class8322, final Class512 class8323) {
        final Class9244 class8324 = this.field25429.get(class8323);
        return (class8324 != null) ? class8324.method34084(class8321) : null;
    }
    
    public void method18920(final int n, final int n2) {
        this.method18903();
        final Iterator<Class9244> iterator = this.field25428.iterator();
        while (iterator.hasNext()) {
            iterator.next().method34085(n, n2);
        }
    }
    
    public Class9244 method18921(final Class512 class512) {
        Class9244 class513 = this.field25429.get(class512);
        if (class513 == null) {
            class513 = new Class9244(this, class512);
            this.field25429.put(class512, class513);
            this.field25428.add(class513);
        }
        return class513;
    }
    
    public void method18922(final Class1851 class1851, final BlockPos class1852) {
        final float n = class1852.getX() + 0.5f;
        final float n2 = class1852.getZ() + 0.5f;
        final int n3 = 1 << this.field25425;
        final float n4 = (n - this.field25420) / n3;
        final float n5 = (n2 - this.field25421) / n3;
        int n6 = 0;
        if (n4 >= -63.0f) {
            if (n5 >= -63.0f) {
                if (n4 <= 63.0f) {
                    if (n5 <= 63.0f) {
                        final Class8843 method30896 = Class8843.method30896(class1851, class1852);
                        if (method30896 == null) {
                            return;
                        }
                        int n7 = 1;
                        if (this.field25430.containsKey(method30896.method30901())) {
                            if (this.field25430.get(method30896.method30901()).equals(method30896)) {
                                this.field25430.remove(method30896.method30901());
                                this.field25431.remove(method30896.method30901());
                                n7 = 0;
                                n6 = 1;
                            }
                        }
                        if (n7 != 0) {
                            this.field25430.put(method30896.method30901(), method30896);
                            this.method18918(method30896.method30898(), class1851, method30896.method30901(), n, n2, 180.0, method30896.method30899());
                            n6 = 1;
                        }
                        if (n6 != 0) {
                            this.method18903();
                        }
                    }
                }
            }
        }
    }
    
    public void method18923(final Class1855 class1855, final int n, final int n2) {
        final Iterator<Class8843> iterator = this.field25430.values().iterator();
        while (iterator.hasNext()) {
            final Class8843 class1856 = iterator.next();
            if (class1856.method30897().getX() != n) {
                continue;
            }
            if (class1856.method30897().getZ() != n2) {
                continue;
            }
            if (class1856.equals(Class8843.method30896(class1855, class1856.method30897()))) {
                continue;
            }
            iterator.remove();
            this.field25431.remove(class1856.method30901());
        }
    }
    
    public void method18924(final BlockPos class354, final int i) {
        this.field25431.remove("frame-" + i);
        this.field25432.remove(Class8525.method28594(class354));
    }
}
