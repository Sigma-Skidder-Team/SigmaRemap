// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import com.mojang.datafixers.types.DynamicOps;
import java.util.function.Consumer;
import java.util.Collections;
import java.util.Random;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;
import java.util.Collection;
import java.util.List;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.BlockPos;

public class Class8227 extends Class8228
{
    public final ResourceLocation field33789;
    public final ImmutableList<Class4107> field33790;
    
    @Deprecated
    public Class8227(final String s, final List<Class4107> list) {
        this(s, list, Class261.field1247);
    }
    
    public Class8227(final String s, final List<Class4107> list, final Class261 class261) {
        super(class261);
        this.field33789 = new ResourceLocation(s);
        this.field33790 = (ImmutableList<Class4107>)ImmutableList.copyOf((Collection)list);
    }
    
    @Deprecated
    public Class8227(final String s) {
        this(s, (List<Class4107>)ImmutableList.of());
    }
    
    public Class8227(final Dynamic<?> dynamic) {
        super(dynamic);
        this.field33789 = new ResourceLocation(dynamic.get("location").asString(""));
        this.field33790 = (ImmutableList<Class4107>)ImmutableList.copyOf((Collection)dynamic.get("processors").asList(dynamic2 -> Class7754.method24753((com.mojang.datafixers.Dynamic<Object>)dynamic2, Registry.field233, "processor_type", Class4111.field18215)));
    }
    
    public List<Class9038> method27252(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final boolean b) {
        final List<Class9038> method19951 = class1795.method6518(this.field33789).method19951(class1796, new Class9092().method32845(class1797), Class7521.field29820, b);
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class9038 class1798 : method19951) {
            if (class1798.field38250 == null) {
                continue;
            }
            if (Class102.valueOf(class1798.field38250.getString("mode")) != Class102.field308) {
                continue;
            }
            arrayList.add(class1798);
        }
        return arrayList;
    }
    
    @Override
    public List<Class9038> method27253(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797, final Random rnd) {
        final List<Class9038> method19951 = class1795.method6518(this.field33789).method19951(class1796, new Class9092().method32845(class1797), Class7521.field29821, true);
        Collections.shuffle(method19951, rnd);
        return method19951;
    }
    
    @Override
    public MutableBoundingBox method27254(final Class1795 class1795, final BlockPos class1796, final Class2052 class1797) {
        return class1795.method6518(this.field33789).method19966(new Class9092().method32845(class1797), class1796);
    }
    
    @Override
    public boolean method27255(final Class1795 class1795, final Class1851 class1796, final Class6346<?> class1797, final BlockPos class1798, final Class2052 class1799, final MutableBoundingBox class1800, final Random random) {
        final Class6585 method6518 = class1795.method6518(this.field33789);
        final Class9092 method6519 = this.method27256(class1799, class1800);
        if (method6518.method19956(class1796, class1798, method6519, 18)) {
            final Iterator<Class9038> iterator = Class6585.method19958(class1796, class1798, method6519, this.method27252(class1795, class1798, class1799, false)).iterator();
            while (iterator.hasNext()) {
                this.method27261(class1796, iterator.next(), class1798, class1799, random, class1800);
            }
            return true;
        }
        return false;
    }
    
    public Class9092 method27256(final Class2052 class2052, final MutableBoundingBox class2053) {
        final Class9092 class2054 = new Class9092();
        class2054.method32849(class2053);
        class2054.method32845(class2052);
        class2054.method32851(true);
        class2054.method32847(false);
        class2054.method32853(Class4106.field18209);
        class2054.method32853(Class4109.field18212);
        this.field33790.forEach((Consumer)class2054::method32853);
        this.method27263().method900().forEach((Consumer)class2054::method32853);
        return class2054;
    }
    
    @Override
    public Class7755 method27257() {
        return Class7755.field31688;
    }
    
    @Override
    public <T> Dynamic<T> method27258(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("location"), dynamicOps.createString(this.field33789.toString()), dynamicOps.createString("processors"), dynamicOps.createList((Stream)this.field33790.stream().map(class4107 -> class4107.method12355((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2).getValue())))));
    }
    
    @Override
    public String toString() {
        return "Single[" + this.field33789 + "]";
    }
}
