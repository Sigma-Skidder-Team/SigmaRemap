// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.io.IOUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.Optional;

public class Class8787
{
    public static String field36936;
    
    public static Class6221 method30573(final Class501 class501) {
        final Class354 method1135 = class501.method2193().method1135(class501.method2560());
        return new Class6221(method1135, method1135.method1135(class501.method2562()));
    }
    
    public static void method30574(final Class354 class354, final Class1849 class355) {
        class355.method6692(class354, Class7521.field29416.method11878());
        ((Class500)class355.method6727(class354)).method2539().method5211("test runthis");
        class355.method6692(class354.method1134(0, 0, -1), Class7521.field29328.method11878());
    }
    
    public static void method30575(final String s, final Class354 class354, final Class354 class355, final int n, final Class1849 class356) {
        method30578(method30579(class354, class355, n), class354.method1075(), class356);
        class356.method6692(class354, Class7521.field29820.method11878());
        final Class501 class357 = (Class501)class356.method6727(class354);
        class357.method2574(false);
        class357.method2558(new Class1932(s));
        class357.method2563(class355);
        class357.method2571(Class102.field305);
        class357.method2596(true);
    }
    
    public static Class501 method30576(final String s, final Class354 class354, final int n, final Class1849 class355, final boolean b) {
        final Class6997 method30579 = method30579(class354, method30583(s, class355).method19945(), n);
        method30577(class354, class355);
        method30578(method30579, class354.method1075(), class355);
        final Class501 method30580 = method30584(s, class354, class355, b);
        class355.method6907().method21348(method30579, true, false);
        class355.method6933(method30579);
        return method30580;
    }
    
    private static void method30577(final Class354 class354, final Class1849 class355) {
        final Class7859 class356 = new Class7859(class354);
        for (int i = -1; i < 4; ++i) {
            for (int j = -1; j < 4; ++j) {
                class355.method6920(class356.field32290 + i, class356.field32291 + j, true);
            }
        }
    }
    
    public static void method30578(final Class6997 class6997, final int n, final Class1849 class6998) {
        Class354.method1156(class6997).forEach(class7000 -> method30586(n2, class7000, class6999));
        class6998.method6907().method21348(class6997, true, false);
        class6998.method6933(class6997);
        class6998.method6739((Class<? extends Class399>)Class399.class, new Class6221(class6997.field27293, class6997.field27294, class6997.field27295, class6997.field27296, class6997.field27297, class6997.field27298), class7001 -> !(class7001 instanceof Class512)).forEach(Class399::method1652);
    }
    
    public static Class6997 method30579(final Class354 class354, final Class354 class355, final int n) {
        final Class354 method1134 = class354.method1134(-n, -3, -n);
        final Class354 method1135 = class354.method1135(class355).method1134(n - 1, 30, n - 1);
        return Class6997.method21409(method1134.method1074(), method1134.method1075(), method1134.method1076(), method1135.method1074(), method1135.method1075(), method1135.method1076());
    }
    
    public static Optional<Class354> method30580(final Class354 class354, final int n, final Class1849 class355) {
        return method30582(class354, n, class355).stream().filter(class358 -> method30587(class358, class356, class357)).findFirst();
    }
    
    @Nullable
    public static Class354 method30581(final Class354 class354, final int n, final Class1849 class355) {
        return method30582(class354, n, class355).stream().min(Comparator.comparingInt(class357 -> class357.method1086(class356))).orElse(null);
    }
    
    public static Collection<Class354> method30582(final Class354 class354, final int n, final Class1849 class355) {
        final ArrayList arrayList = Lists.newArrayList();
        final Class6221 method18496 = new Class6221(class354).method18496(n);
        for (int i = (int)method18496.field25073; i <= (int)method18496.field25076; ++i) {
            for (int j = (int)method18496.field25074; j <= (int)method18496.field25077; ++j) {
                for (int k = (int)method18496.field25075; k <= (int)method18496.field25078; ++k) {
                    final Class354 class356 = new Class354(i, j, k);
                    if (class355.method6701(class356).method21696() == Class7521.field29820) {
                        arrayList.add(class356);
                    }
                }
            }
        }
        return arrayList;
    }
    
    private static Class6585 method30583(final String str, final Class1849 class1849) {
        final Class1795 method6910 = class1849.method6910();
        final Class6585 method6911 = method6910.method6519(new Class1932(str));
        if (method6911 != null) {
            return method6911;
        }
        final Path value = Paths.get(Class8787.field36936, str + ".snbt");
        final Class51 method6912 = method30585(value);
        if (method6912 != null) {
            return method6910.method6523(method6912);
        }
        throw new RuntimeException("Could not find structure file " + value + ", and the structure is not available in the world structures either.");
    }
    
    private static Class501 method30584(final String str, final Class354 class354, final Class1849 class355, final boolean b) {
        class355.method6692(class354, Class7521.field29820.method11878());
        final Class501 class356 = (Class501)class355.method6727(class354);
        class356.method2571(Class102.field306);
        class356.method2574(false);
        class356.method2558(new Class1932(str));
        class356.method2587(b);
        if (class356.method2562() != Class354.field2173) {
            return class356;
        }
        class356.method2588(b, method30583(str, class355));
        if (class356.method2562() != Class354.field2173) {
            return class356;
        }
        throw new RuntimeException("Failed to load structure " + str);
    }
    
    @Nullable
    private static Class51 method30585(final Path path) {
        try {
            return Class5704.method16938(IOUtils.toString((Reader)Files.newBufferedReader(path)));
        }
        catch (final IOException ex) {
            return null;
        }
        catch (final CommandSyntaxException cause) {
            throw new RuntimeException("Error while trying to load structure " + path, (Throwable)cause);
        }
    }
    
    private static void method30586(final int n, final Class354 class354, final Class1849 class355) {
        final Object method18876 = class355.method6904().method7438().method18876();
        Class7096 class356;
        if (!(method18876 instanceof Class7067)) {
            if (class354.method1075() != n - 1) {
                if (class354.method1075() >= n - 1) {
                    class356 = Class7521.field29147.method11878();
                }
                else {
                    class356 = class355.method6959(class354).method9872().method13339();
                }
            }
            else {
                class356 = class355.method6959(class354).method9872().method13338();
            }
        }
        else {
            final Class7096[] method18877 = ((Class7067)method18876).method21601();
            if (class354.method1075() >= n) {
                class356 = Class7521.field29147.method11878();
            }
            else {
                class356 = method18877[class354.method1075() - 1];
            }
        }
        new Class118(class356, Collections.emptySet(), null).method610(class355, class354, 2);
        class355.method6694(class354, class356.method21696());
    }
    
    private static boolean method30587(final Class354 class354, final Class354 class355, final Class1849 class356) {
        return method30573((Class501)class356.method6727(class354)).method18505(new Class5487(class355));
    }
    
    static {
        Class8787.field36936 = "gameteststructures";
    }
}
