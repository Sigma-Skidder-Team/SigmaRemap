// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import javax.annotation.Nullable;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Iterator;
import com.google.common.collect.Maps;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.dimension.DimensionType;

import java.util.Map;

public class Class6357 extends Class6354
{
    private final Map<Integer, Class8792> field25433;
    private final Class1849 field25434;
    private int field25435;
    private int field25436;
    
    public Class6357(final Class1849 field25434) {
        super(method18930(field25434.dimension));
        this.field25433 = Maps.newHashMap();
        this.field25434 = field25434;
        this.field25435 = 1;
        this.method18903();
    }
    
    public Class8792 method18925(final int i) {
        return this.field25433.get(i);
    }
    
    public void method18926() {
        ++this.field25436;
        final Iterator<Class8792> iterator = this.field25433.values().iterator();
        while (iterator.hasNext()) {
            final Class8792 class8792 = iterator.next();
            if (this.field25434.method6765().method31216(Class8878.field37338)) {
                class8792.method30632();
            }
            if (!class8792.method30621()) {
                class8792.method30633();
            }
            else {
                iterator.remove();
                this.method18903();
            }
        }
        if (this.field25436 % 200 == 0) {
            this.method18903();
        }
        Class9324.method34539(this.field25434, this.field25433.values());
    }
    
    public static boolean method18927(final Class776 class776, final Class8792 class777) {
        if (class776 != null) {
            if (class777 != null) {
                if (class777.method30624() != null) {
                    if (class776.isAlive()) {
                        if (class776.method4288()) {
                            if (class776.method2640() <= 2400) {
                                return class776.world.method6789().getType() == class777.method30624().method6789().getType();
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    @Nullable
    public Class8792 method18928(final Class513 class513) {
        if (class513.isSpectator()) {
            return null;
        }
        if (this.field25434.method6765().method31216(Class8878.field37338)) {
            return null;
        }
        if (class513.world.method6789().getType() != DimensionType.field2224) {
            final BlockPos class514 = new BlockPos(class513);
            final List<? super Class377> list = this.field25434.method6921().method7200(Class8912.field37458, class514, 64, Class2045.field11651).collect((Collector<? super Class377, ?, List<? super Class377>>)Collectors.toList());
            int n = 0;
            Vec3d class515 = Vec3d.ZERO;
            final Iterator<? super Class377> iterator = list.iterator();
            while (iterator.hasNext()) {
                final BlockPos method1259 = iterator.next().method1259();
                class515 = class515.add(method1259.getX(), method1259.getY(), method1259.getZ());
                ++n;
            }
            BlockPos class516;
            if (n <= 0) {
                class516 = class514;
            }
            else {
                class516 = new BlockPos(class515.scale(1.0 / n));
            }
            final Class8792 method1260 = this.method18929(class513.method2940(), class516);
            boolean b = false;
            if (method1260.method30625()) {
                if (method1260.method30630() >= method1260.method30629()) {
                    class513.method2659(Class9439.field40504);
                    class513.field3039.method17469(new Class4264(class513, (byte)43));
                }
                else {
                    b = true;
                }
            }
            else {
                if (!this.field25433.containsKey(method1260.method30660())) {
                    this.field25433.put(method1260.method30660(), method1260);
                }
                b = true;
            }
            if (b) {
                method1260.method30631(class513);
                class513.field3039.method17469(new Class4264(class513, (byte)43));
                if (!method1260.method30620()) {
                    class513.method2857(Class8276.field34055);
                    Class7770.field31809.method13827(class513);
                }
            }
            this.method18903();
            return method1260;
        }
        return null;
    }
    
    private Class8792 method18929(final Class1849 class1849, final BlockPos class1850) {
        final Class8792 method6927 = class1849.method6927(class1850);
        return (method6927 == null) ? new Class8792(this.method18931(), class1849, class1850) : method6927;
    }
    
    @Override
    public void method18901(final CompoundNBT class51) {
        this.field25435 = class51.getInt("NextAvailableID");
        this.field25436 = class51.getInt("Tick");
        final ListNBT method328 = class51.getList("Raids", 10);
        for (int i = 0; i < method328.size(); ++i) {
            final Class8792 class52 = new Class8792(this.field25434, method328.method346(i));
            this.field25433.put(class52.method30660(), class52);
        }
    }
    
    @Override
    public CompoundNBT method18902(final CompoundNBT class51) {
        class51.putInt("NextAvailableID", this.field25435);
        class51.putInt("Tick", this.field25436);
        final ListNBT class52 = new ListNBT();
        for (final Class8792 class53 : this.field25433.values()) {
            final CompoundNBT e = new CompoundNBT();
            class53.method30664(e);
            class52.add(e);
        }
        class51.put("Raids", class52);
        return class51;
    }
    
    public static String method18930(final Dimension class6737) {
        return "raids" + class6737.getType().method1271();
    }
    
    private int method18931() {
        return ++this.field25435;
    }
    
    @Nullable
    public Class8792 method18932(final BlockPos class354, final int n) {
        Class8792 class355 = null;
        double n2 = n;
        for (final Class8792 class356 : this.field25433.values()) {
            final double method1083 = class356.method30658().distanceSq(class354);
            if (!class356.method30663()) {
                continue;
            }
            if (method1083 >= n2) {
                continue;
            }
            class355 = class356;
            n2 = method1083;
        }
        return class355;
    }
}
