// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.stream.StreamSupport;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Spliterator;
import com.mojang.datafixers.Dynamic;
import org.apache.logging.log4j.Logger;
import javax.annotation.concurrent.Immutable;

@Immutable
public class Class354 extends Class352 implements Class356
{
    private static String[] field2171;
    private static final Logger field2172;
    public static final Class354 field2173;
    private static final int field2174;
    private static final int field2175;
    private static final int field2176;
    private static final long field2177;
    private static final long field2178;
    private static final long field2179;
    private static final int field2180;
    private static final int field2181;
    
    public Class354(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    public Class354(final double n, final double n2, final double n3) {
        super(n, n2, n3);
    }
    
    public Class354(final Class399 class399) {
        this(class399.method1938(), class399.method1941(), class399.method1945());
    }
    
    public Class354(final Class5487 class5487) {
        this(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public Class354(final Class5488 class5488) {
        this(class5488.method16760(), class5488.method16761(), class5488.method16762());
    }
    
    public Class354(final Class352 class352) {
        this(class352.method1074(), class352.method1075(), class352.method1076());
    }
    
    public static <T> Class354 method1122(final Dynamic<T> dynamic) {
        final Spliterator.OfInt spliterator = dynamic.asIntStream().spliterator();
        final int[] array = new int[3];
        if (spliterator.tryAdvance(n -> array2[0] = n)) {
            if (spliterator.tryAdvance(n2 -> array3[1] = n2)) {
                spliterator.tryAdvance(n3 -> array4[2] = n3);
            }
        }
        return new Class354(array[0], array[1], array[2]);
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createIntList(IntStream.of(this.method1074(), this.method1075(), this.method1076()));
    }
    
    public static long method1124(final long n, final Class179 class179) {
        return method1125(n, class179.method785(), class179.method786(), class179.method787());
    }
    
    public static long method1125(final long n, final int n2, final int n3, final int n4) {
        return method1130(method1126(n) + n2, method1127(n) + n3, method1128(n) + n4);
    }
    
    public static int method1126(final long n) {
        return (int)(n << 64 - Class354.field2181 - Class354.field2174 >> 64 - Class354.field2174);
    }
    
    public static int method1127(final long n) {
        return (int)(n << 64 - Class354.field2176 >> 64 - Class354.field2176);
    }
    
    public static int method1128(final long n) {
        return (int)(n << 64 - Class354.field2180 - Class354.field2175 >> 64 - Class354.field2175);
    }
    
    public static Class354 method1129(final long n) {
        return new Class354(method1126(n), method1127(n), method1128(n));
    }
    
    public static long method1130(final int n, final int n2, final int n3) {
        return 0x0L | ((long)n & Class354.field2177) << Class354.field2181 | ((long)n2 & Class354.field2178) << 0 | ((long)n3 & Class354.field2179) << Class354.field2180;
    }
    
    public static long method1131(final long n) {
        return n & 0xFFFFFFFFFFFFFFF0L;
    }
    
    public long method1132() {
        return method1130(this.method1074(), this.method1075(), this.method1076());
    }
    
    public Class354 method1133(final double n, final double n2, final double n3) {
        if (n == 0.0) {
            if (n2 == 0.0) {
                if (n3 == 0.0) {
                    return this;
                }
            }
        }
        return new Class354(this.method1074() + n, this.method1075() + n2, this.method1076() + n3);
    }
    
    public Class354 method1134(final int n, final int n2, final int n3) {
        if (n == 0) {
            if (n2 == 0) {
                if (n3 == 0) {
                    return this;
                }
            }
        }
        return new Class354(this.method1074() + n, this.method1075() + n2, this.method1076() + n3);
    }
    
    public Class354 method1135(final Class352 class352) {
        return this.method1134(class352.method1074(), class352.method1075(), class352.method1076());
    }
    
    public Class354 method1136(final Class352 class352) {
        return this.method1134(-class352.method1074(), -class352.method1075(), -class352.method1076());
    }
    
    public Class354 method1137() {
        return this.method1149(Class179.field512);
    }
    
    public Class354 method1138(final int n) {
        return this.method1150(Class179.field512, n);
    }
    
    public Class354 method1139() {
        return this.method1149(Class179.field511);
    }
    
    public Class354 method1140(final int n) {
        return this.method1150(Class179.field511, n);
    }
    
    public Class354 method1141() {
        return this.method1149(Class179.field513);
    }
    
    public Class354 method1142(final int n) {
        return this.method1150(Class179.field513, n);
    }
    
    public Class354 method1143() {
        return this.method1149(Class179.field514);
    }
    
    public Class354 method1144(final int n) {
        return this.method1150(Class179.field514, n);
    }
    
    public Class354 method1145() {
        return this.method1149(Class179.field515);
    }
    
    public Class354 method1146(final int n) {
        return this.method1150(Class179.field515, n);
    }
    
    public Class354 method1147() {
        return this.method1149(Class179.field516);
    }
    
    public Class354 method1148(final int n) {
        return this.method1150(Class179.field516, n);
    }
    
    public Class354 method1149(final Class179 class179) {
        return new Class354(this.method1074() + class179.method785(), this.method1075() + class179.method786(), this.method1076() + class179.method787());
    }
    
    public Class354 method1150(final Class179 class179, final int n) {
        return (n != 0) ? new Class354(this.method1074() + class179.method785() * n, this.method1075() + class179.method786() * n, this.method1076() + class179.method787() * n) : this;
    }
    
    public Class354 method1151(final Class2052 class2052) {
        switch (Class7867.field32310[class2052.ordinal()]) {
            default: {
                return this;
            }
            case 2: {
                return new Class354(-this.method1076(), this.method1075(), this.method1074());
            }
            case 3: {
                return new Class354(-this.method1074(), this.method1075(), -this.method1076());
            }
            case 4: {
                return new Class354(this.method1076(), this.method1075(), -this.method1074());
            }
        }
    }
    
    public Class354 method1152(final Class352 class352) {
        return new Class354(this.method1075() * class352.method1076() - this.method1076() * class352.method1075(), this.method1076() * class352.method1074() - this.method1074() * class352.method1076(), this.method1074() * class352.method1075() - this.method1075() * class352.method1074());
    }
    
    public Class354 method1153() {
        return this;
    }
    
    public static Iterable<Class354> method1154(final Class354 class354, final Class354 class355) {
        return method1158(Math.min(class354.method1074(), class355.method1074()), Math.min(class354.method1075(), class355.method1075()), Math.min(class354.method1076(), class355.method1076()), Math.max(class354.method1074(), class355.method1074()), Math.max(class354.method1075(), class355.method1075()), Math.max(class354.method1076(), class355.method1076()));
    }
    
    public static Stream<Class354> method1155(final Class354 class354, final Class354 class355) {
        return method1157(Math.min(class354.method1074(), class355.method1074()), Math.min(class354.method1075(), class355.method1075()), Math.min(class354.method1076(), class355.method1076()), Math.max(class354.method1074(), class355.method1074()), Math.max(class354.method1075(), class355.method1075()), Math.max(class354.method1076(), class355.method1076()));
    }
    
    public static Stream<Class354> method1156(final Class6997 class6997) {
        return method1157(Math.min(class6997.field27293, class6997.field27296), Math.min(class6997.field27294, class6997.field27297), Math.min(class6997.field27295, class6997.field27298), Math.max(class6997.field27293, class6997.field27296), Math.max(class6997.field27294, class6997.field27297), Math.max(class6997.field27295, class6997.field27298));
    }
    
    public static Stream<Class354> method1157(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return StreamSupport.stream((Spliterator<Class354>)new Class7580((n4 - n + 1) * (n5 - n2 + 1) * (n6 - n3 + 1), 64, n, n2, n3, n4, n5, n6), false);
    }
    
    public static Iterable<Class354> method1158(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return () -> new Class7248(n7, n8, n9, n10, n11, n12);
    }
    
    static {
        field2172 = LogManager.getLogger();
        field2173 = new Class354(0, 0, 0);
        field2174 = 1 + Class9546.method35682(Class9546.method35679(30000000));
        field2175 = Class354.field2174;
        field2176 = 64 - Class354.field2174 - Class354.field2175;
        field2177 = (1L << Class354.field2174) - 1L;
        field2178 = (1L << Class354.field2176) - 1L;
        field2179 = (1L << Class354.field2175) - 1L;
        field2180 = Class354.field2176;
        field2181 = Class354.field2176 + Class354.field2175;
    }
}
