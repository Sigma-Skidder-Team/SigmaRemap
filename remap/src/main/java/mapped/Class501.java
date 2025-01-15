// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.util.math.MathHelper;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Objects;
import java.util.List;
import javax.annotation.Nullable;

public class Class501 extends Class436
{
    private Class1932 field2864;
    private String field2865;
    private String field2866;
    private BlockPos field2867;
    private BlockPos field2868;
    private Class2181 field2869;
    private Class2052 field2870;
    private Class102 field2871;
    private boolean field2872;
    private boolean field2873;
    private boolean field2874;
    private boolean field2875;
    private float field2876;
    private long field2877;
    
    public Class501() {
        super(Class5412.field22560);
        this.field2865 = "";
        this.field2866 = "";
        this.field2867 = new BlockPos(0, 1, 0);
        this.field2868 = BlockPos.ZERO;
        this.field2869 = Class2181.field12917;
        this.field2870 = Class2052.field11707;
        this.field2871 = Class102.field308;
        this.field2872 = true;
        this.field2875 = true;
        this.field2876 = 1.0f;
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        class51.method306("name", this.method2554());
        class51.method306("author", this.field2865);
        class51.method306("metadata", this.field2866);
        class51.method298("posX", this.field2867.getX());
        class51.method298("posY", this.field2867.getY());
        class51.method298("posZ", this.field2867.getZ());
        class51.method298("sizeX", this.field2868.getX());
        class51.method298("sizeY", this.field2868.getY());
        class51.method298("sizeZ", this.field2868.getZ());
        class51.method306("rotation", this.field2870.toString());
        class51.method306("mirror", this.field2869.toString());
        class51.method306("mode", this.field2871.toString());
        class51.method312("ignoreEntities", this.field2872);
        class51.method312("powered", this.field2873);
        class51.method312("showair", this.field2874);
        class51.method312("showboundingbox", this.field2875);
        class51.method304("integrity", this.field2876);
        class51.method299("seed", this.field2877);
        return class51;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        this.method2557(class51.method323("name"));
        this.field2865 = class51.method323("author");
        this.field2866 = class51.method323("metadata");
        this.field2867 = new BlockPos(MathHelper.method35651(class51.method319("posX"), -32, 32), MathHelper.method35651(class51.method319("posY"), -32, 32), MathHelper.method35651(class51.method319("posZ"), -32, 32));
        this.field2868 = new BlockPos(MathHelper.method35651(class51.method319("sizeX"), 0, 32), MathHelper.method35651(class51.method319("sizeY"), 0, 32), MathHelper.method35651(class51.method319("sizeZ"), 0, 32));
        try {
            this.field2870 = Class2052.valueOf(class51.method323("rotation"));
        }
        catch (final IllegalArgumentException ex) {
            this.field2870 = Class2052.field11707;
        }
        try {
            this.field2869 = Class2181.valueOf(class51.method323("mirror"));
        }
        catch (final IllegalArgumentException ex2) {
            this.field2869 = Class2181.field12917;
        }
        try {
            this.field2871 = Class102.valueOf(class51.method323("mode"));
        }
        catch (final IllegalArgumentException ex3) {
            this.field2871 = Class102.field308;
        }
        this.field2872 = class51.method329("ignoreEntities");
        this.field2873 = class51.method329("powered");
        this.field2874 = class51.method329("showair");
        this.field2875 = class51.method329("showboundingbox");
        if (class51.method315("integrity")) {
            this.field2876 = class51.method321("integrity");
        }
        else {
            this.field2876 = 1.0f;
        }
        this.field2877 = class51.method320("seed");
        this.method2552();
    }
    
    private void method2552() {
        if (this.field2656 != null) {
            final BlockPos method2193 = this.method2193();
            final Class7096 method2194 = this.field2656.method6701(method2193);
            if (method2194.method21696() == Class7521.field29820) {
                this.field2656.method6688(method2193, ((Class7097<O, Class7096>)method2194).method21773(Class3941.field17831, this.field2871), 2);
            }
        }
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 7, this.method2196());
    }
    
    @Override
    public Class51 method2196() {
        return this.method2180(new Class51());
    }
    
    public boolean method2553(final Class512 class512) {
        if (class512.method2908()) {
            if (class512.method1896().field10067) {
                class512.method2830(this);
            }
            return true;
        }
        return false;
    }
    
    public String method2554() {
        return (this.field2864 != null) ? this.field2864.toString() : "";
    }
    
    public String method2555() {
        return (this.field2864 != null) ? this.field2864.method7797() : "";
    }
    
    public boolean method2556() {
        return this.field2864 != null;
    }
    
    public void method2557(final String s) {
        this.method2558(Class8272.method27500(s) ? null : Class1932.method7795(s));
    }
    
    public void method2558(final Class1932 field2864) {
        this.field2864 = field2864;
    }
    
    public void method2559(final Class511 class511) {
        this.field2865 = class511.method1841().getString();
    }
    
    public BlockPos method2560() {
        return this.field2867;
    }
    
    public void method2561(final BlockPos field2867) {
        this.field2867 = field2867;
    }
    
    public BlockPos method2562() {
        return this.field2868;
    }
    
    public void method2563(final BlockPos field2868) {
        this.field2868 = field2868;
    }
    
    public Class2181 method2564() {
        return this.field2869;
    }
    
    public void method2565(final Class2181 field2869) {
        this.field2869 = field2869;
    }
    
    public Class2052 method2566() {
        return this.field2870;
    }
    
    public void method2567(final Class2052 field2870) {
        this.field2870 = field2870;
    }
    
    public String method2568() {
        return this.field2866;
    }
    
    public void method2569(final String field2866) {
        this.field2866 = field2866;
    }
    
    public Class102 method2570() {
        return this.field2871;
    }
    
    public void method2571(final Class102 field2871) {
        this.field2871 = field2871;
        final Class7096 method6701 = this.field2656.method6701(this.method2193());
        if (method6701.method21696() == Class7521.field29820) {
            this.field2656.method6688(this.method2193(), ((Class7097<O, Class7096>)method6701).method21773(Class3941.field17831, field2871), 2);
        }
    }
    
    public void method2572() {
        switch (Class8313.field34152[this.method2570().ordinal()]) {
            case 1: {
                this.method2571(Class102.field306);
                break;
            }
            case 2: {
                this.method2571(Class102.field307);
                break;
            }
            case 3: {
                this.method2571(Class102.field308);
                break;
            }
            case 4: {
                this.method2571(Class102.field305);
                break;
            }
        }
    }
    
    public boolean method2573() {
        return this.field2872;
    }
    
    public void method2574(final boolean field2872) {
        this.field2872 = field2872;
    }
    
    public float method2575() {
        return this.field2876;
    }
    
    public void method2576(final float field2876) {
        this.field2876 = field2876;
    }
    
    public long method2577() {
        return this.field2877;
    }
    
    public void method2578(final long field2877) {
        this.field2877 = field2877;
    }
    
    public boolean method2579() {
        if (this.field2871 != Class102.field305) {
            return false;
        }
        final BlockPos method2193 = this.method2193();
        final List<Class501> method2194 = this.method2580(this.method2581(new BlockPos(method2193.getX() - 80, 0, method2193.getZ() - 80), new BlockPos(method2193.getX() + 80, 255, method2193.getZ() + 80)));
        if (method2194.size() >= 1) {
            final Class6997 method2195 = this.method2582(method2193, method2194);
            if (method2195.field27296 - method2195.field27293 > 1) {
                if (method2195.field27297 - method2195.field27294 > 1) {
                    if (method2195.field27298 - method2195.field27295 > 1) {
                        this.field2867 = new BlockPos(method2195.field27293 - method2193.getX() + 1, method2195.field27294 - method2193.getY() + 1, method2195.field27295 - method2193.getZ() + 1);
                        this.field2868 = new BlockPos(method2195.field27296 - method2195.field27293 - 1, method2195.field27297 - method2195.field27294 - 1, method2195.field27298 - method2195.field27295 - 1);
                        this.method2161();
                        final Class7096 method2196 = this.field2656.method6701(method2193);
                        this.field2656.method6693(method2193, method2196, method2196, 3);
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    private List<Class501> method2580(final List<Class501> list) {
        return list.stream().filter(class501 -> class501.field2871 == Class102.field307 && Objects.equals(this.field2864, class501.field2864)).collect((Collector<? super Object, ?, List<Class501>>)Collectors.toList());
    }
    
    private List<Class501> method2581(final BlockPos class354, final BlockPos class355) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final BlockPos class356 : BlockPos.method1154(class354, class355)) {
            if (this.field2656.method6701(class356).method21696() != Class7521.field29820) {
                continue;
            }
            final Class436 method6727 = this.field2656.method6727(class356);
            if (method6727 == null) {
                continue;
            }
            if (!(method6727 instanceof Class501)) {
                continue;
            }
            arrayList.add(method6727);
        }
        return arrayList;
    }
    
    private Class6997 method2582(final BlockPos class354, final List<Class501> list) {
        Class6997 class355;
        if (list.size() <= 1) {
            class355 = new Class6997(class354, class354);
        }
        else {
            final BlockPos method2193 = list.get(0).method2193();
            class355 = new Class6997(method2193, method2193);
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final BlockPos method2194 = ((Class501)iterator.next()).method2193();
            if (method2194.getX() >= class355.field27293) {
                if (method2194.getX() > class355.field27296) {
                    class355.field27296 = method2194.getX();
                }
            }
            else {
                class355.field27293 = method2194.getX();
            }
            if (method2194.getY() >= class355.field27294) {
                if (method2194.getY() > class355.field27297) {
                    class355.field27297 = method2194.getY();
                }
            }
            else {
                class355.field27294 = method2194.getY();
            }
            if (method2194.getZ() >= class355.field27295) {
                if (method2194.getZ() <= class355.field27298) {
                    continue;
                }
                class355.field27298 = method2194.getZ();
            }
            else {
                class355.field27295 = method2194.getZ();
            }
        }
        return class355;
    }
    
    public boolean method2583() {
        return this.method2584(true);
    }
    
    public boolean method2584(final boolean b) {
        if (this.field2871 == Class102.field305 && !this.field2656.field10067 && this.field2864 != null) {
            final BlockPos method1135 = this.method2193().method1135(this.field2867);
            final Class1795 method1136 = ((Class1849)this.field2656).method6910();
            Class6585 method1137;
            try {
                method1137 = method1136.method6518(this.field2864);
            }
            catch (final Class2357 class2357) {
                return false;
            }
            method1137.method19948(this.field2656, method1135, this.field2868, !this.field2872, Class7521.field29646);
            method1137.method19946(this.field2865);
            if (b) {
                try {
                    return method1136.method6524(this.field2864);
                }
                catch (final Class2357 class2358) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method2585() {
        return this.method2587(true);
    }
    
    private static Random method2586(final long seed) {
        return (seed != 0L) ? new Random(seed) : new Random(Class8349.method27837());
    }
    
    public boolean method2587(final boolean b) {
        if (this.field2871 == Class102.field306 && !this.field2656.field10067 && this.field2864 != null) {
            final Class1795 method6910 = ((Class1849)this.field2656).method6910();
            Class6585 method6911;
            try {
                method6911 = method6910.method6519(this.field2864);
            }
            catch (final Class2357 class2357) {
                return false;
            }
            return method6911 != null && this.method2588(b, method6911);
        }
        return false;
    }
    
    public boolean method2588(final boolean b, final Class6585 class6585) {
        final BlockPos method2193 = this.method2193();
        if (!Class8272.method27500(class6585.method19947())) {
            this.field2865 = class6585.method19947();
        }
        final BlockPos method2194 = class6585.method19945();
        final boolean equals = this.field2868.equals(method2194);
        if (!equals) {
            this.field2868 = method2194;
            this.method2161();
            final Class7096 method2195 = this.field2656.method6701(method2193);
            this.field2656.method6693(method2193, method2195, method2195, 3);
        }
        if (b && !equals) {
            return false;
        }
        final Class9092 method2196 = new Class9092().method32844(this.field2869).method32845(this.field2870).method32847(this.field2872).method32848(null);
        if (this.field2876 < 1.0f) {
            method2196.method32852().method32853(new Class4108(MathHelper.clamp(this.field2876, 0.0f, 1.0f))).method32850(method2586(this.field2877));
        }
        class6585.method19954(this.field2656, method2193.method1135(this.field2867), method2196);
        return true;
    }
    
    public void method2589() {
        if (this.field2864 != null) {
            ((Class1849)this.field2656).method6910().method6527(this.field2864);
        }
    }
    
    public boolean method2590() {
        if (this.field2871 == Class102.field306 && !this.field2656.field10067 && this.field2864 != null) {
            final Class1795 method6910 = ((Class1849)this.field2656).method6910();
            try {
                return method6910.method6519(this.field2864) != null;
            }
            catch (final Class2357 class2357) {
                return false;
            }
        }
        return false;
    }
    
    public boolean method2591() {
        return this.field2873;
    }
    
    public void method2592(final boolean field2873) {
        this.field2873 = field2873;
    }
    
    public boolean method2593() {
        return this.field2874;
    }
    
    public void method2594(final boolean field2874) {
        this.field2874 = field2874;
    }
    
    public boolean method2595() {
        return this.field2875;
    }
    
    public void method2596(final boolean field2875) {
        this.field2875 = field2875;
    }
}
