// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.stream.Collector;
import com.google.common.collect.ImmutableList;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.Map;
import java.util.List;

public class Class8752
{
    public static final Class1932 field36734;
    public static final Class1932 field36735;
    public static final Class1932 field36736;
    public static final Class1932 field36737;
    public static final Class1932 field36738;
    public static final Class1932 field36739;
    private static final Class6332 field36740;
    private static final Class6332 field36741;
    private static final Class6332 field36742;
    private static final Class6332 field36743;
    private static final Class6332 field36744;
    private static final Class6332 field36745;
    private static final Class6332 field36746;
    private static final Class6332 field36747;
    private static final Class6332 field36748;
    private static final Class6332 field36749;
    public static final Class3687 field36750;
    public static final List<Class3687> field36751;
    public static final Map<Class8289, Class3687> field36752;
    public static final Class3687[] field36753;
    public static final Class3687 field36754;
    public static final Class3687 field36755;
    public static final Class3687 field36756;
    public static final Class3687 field36757;
    public static final Class3687 field36758;
    public static final Class3687 field36759;
    public static final Class3687 field36760;
    public static final Class3687 field36761;
    public static final Class3687 field36762;
    public static final Class3687 field36763;
    
    public static Class6332 method30257() {
        return Class8752.field36742;
    }
    
    public static Class6332 method30258() {
        return Class8752.field36743;
    }
    
    public static Class6332 method30259() {
        return Class8752.field36741;
    }
    
    public static Class6332 method30260() {
        return Class8752.field36740;
    }
    
    public static Class6332 method30261() {
        return Class8752.field36744;
    }
    
    public static Class6332 method30262() {
        return Class8752.field36745;
    }
    
    public static Class6332 method30263() {
        return Class8752.field36746;
    }
    
    public static Class6332 method30264() {
        return Class8752.field36747;
    }
    
    public static Class6332 method30265() {
        return Class8752.field36748;
    }
    
    public static Class6332 method30266() {
        return Class8752.field36749;
    }
    
    public static void method30267(final Consumer<Class3687> consumer) {
        consumer.accept(Class8752.field36750);
        Class8752.field36751.forEach(consumer);
        for (final Class230 class230 : Class230.values()) {
            consumer.accept((Object)new Class3687(Class8752.field36736, class230.method857(true)));
            consumer.accept((Object)new Class3687(Class8752.field36737, class230.method857(false)));
        }
        Class8752.field36752.values().forEach(consumer);
        final Class3687[] field36753 = Class8752.field36753;
        for (int length2 = field36753.length, j = 0; j < length2; ++j) {
            consumer.accept(field36753[j]);
        }
        consumer.accept(Class8752.field36754);
        consumer.accept(Class8752.field36755);
        consumer.accept(Class8752.field36756);
        consumer.accept(Class8752.field36757);
        consumer.accept(Class8752.field36758);
        consumer.accept(Class8752.field36759);
        consumer.accept(Class8752.field36760);
        consumer.accept(Class8752.field36761);
        consumer.accept(Class8752.field36762);
        consumer.accept(Class8752.field36763);
    }
    
    public static Class3687 method30268(final Class8289 class8289) {
        return new Class3687(Class8752.field36738, new Class1932("entity/signs/" + class8289.method27557()));
    }
    
    private static Class3687 method30269(final String str) {
        return new Class3687(Class8752.field36739, new Class1932("entity/chest/" + str));
    }
    
    public static Class3687 method30270(final TileEntity tileEntity, final Class180 class437, final boolean b) {
        if (b) {
            return method30271(class437, Class8752.field36757, Class8752.field36758, Class8752.field36759);
        }
        if (!(tileEntity instanceof Class478)) {
            return (tileEntity instanceof Class477) ? Class8752.field36763 : method30271(class437, Class8752.field36760, Class8752.field36761, Class8752.field36762);
        }
        return method30271(class437, Class8752.field36754, Class8752.field36755, Class8752.field36756);
    }
    
    private static Class3687 method30271(final Class180 class180, final Class3687 class181, final Class3687 class182, final Class3687 class183) {
        switch (Class8694.field36538[class180.ordinal()]) {
            case 1: {
                return class182;
            }
            case 2: {
                return class183;
            }
            default: {
                return class181;
            }
        }
    }
    
    static {
        field36734 = new Class1932("textures/atlas/shulker_boxes.png");
        field36735 = new Class1932("textures/atlas/beds.png");
        field36736 = new Class1932("textures/atlas/banner_patterns.png");
        field36737 = new Class1932("textures/atlas/shield_patterns.png");
        field36738 = new Class1932("textures/atlas/signs.png");
        field36739 = new Class1932("textures/atlas/chest.png");
        field36740 = Class6332.method18770(Class8752.field36734);
        field36741 = Class6332.method18767(Class8752.field36735);
        field36742 = Class6332.method18777(Class8752.field36736);
        field36743 = Class6332.method18777(Class8752.field36737);
        field36744 = Class6332.method18770(Class8752.field36738);
        field36745 = Class6332.method18768(Class8752.field36739);
        field36746 = Class6332.method18767(Class1774.field9853);
        field36747 = Class6332.method18768(Class1774.field9853);
        field36748 = Class6332.method18773(Class1774.field9853);
        field36749 = Class6332.method18771(Class1774.field9853);
        field36750 = new Class3687(Class8752.field36734, new Class1932("entity/shulker/shulker"));
        field36751 = Stream.of(new String[] { "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black" }).map(str -> {
            new(mapped.Class3687.class)();
            final Class1932 field36764 = Class8752.field36734;
            new Class1932("entity/shulker/shulker_" + str);
            final Class1932 class1932;
            new Class3687(field36764, class1932);
            return;
        }).collect((Collector<? super Object, Object, List<Class3687>>)ImmutableList.toImmutableList());
        field36752 = Class8289.method27556().collect(Collectors.toMap((Function<? super Class8289, ? extends Class8289>)Function.identity(), (Function<? super Class8289, ? extends Class3687>)Class8752::method30268));
        field36753 = Arrays.stream(Class181.values()).sorted(Comparator.comparingInt(Class181::method813)).map(class1933 -> {
            new(mapped.Class3687.class)();
            final Class1932 field36765 = Class8752.field36735;
            new Class1932("entity/bed/" + class1933.method814());
            final Class1932 class1934;
            new Class3687(field36765, class1934);
            return;
        }).toArray(Class3687[]::new);
        field36754 = method30269("trapped");
        field36755 = method30269("trapped_left");
        field36756 = method30269("trapped_right");
        field36757 = method30269("christmas");
        field36758 = method30269("christmas_left");
        field36759 = method30269("christmas_right");
        field36760 = method30269("normal");
        field36761 = method30269("normal_left");
        field36762 = method30269("normal_right");
        field36763 = method30269("ender");
    }
}
