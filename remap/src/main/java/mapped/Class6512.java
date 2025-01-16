// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.io.File;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import java.nio.file.Path;
import org.apache.logging.log4j.Logger;

public class Class6512
{
    private static final Logger field25888;
    
    public static boolean method19598(final Path path, final DataFixer dataFixer, final String child, final Class732 class732) {
        class732.method4039(0);
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList();
        final ArrayList arrayList3 = Lists.newArrayList();
        final File parent = new File(path.toFile(), child);
        final File method1272 = DimensionType.field2224.method1272(parent);
        final File method1273 = DimensionType.field2225.method1272(parent);
        Class6512.field25888.info("Scanning folders...");
        method19602(parent, arrayList);
        if (method1272.exists()) {
            method19602(method1272, arrayList2);
        }
        if (method1273.exists()) {
            method19602(method1273, arrayList3);
        }
        final int i = arrayList.size() + arrayList2.size() + arrayList3.size();
        Class6512.field25888.info("Total conversion count is {}", (Object)i);
        final WorldInfo method1274 = Class7952.method25792(path, dataFixer, child);
        final Class7768<Class5471, Class1869> field31769 = Class7768.field31769;
        final Class7768<Class5469, Class1871> field31770 = Class7768.field31770;
        Class1868 class733;
        if (method1274 != null && method1274.method29570() == Class9505.field40893) {
            class733 = field31769.method24875(field31769.method24876(method1274).method16709(Class7102.field27633));
        }
        else {
            class733 = field31770.method24875(field31770.method24876(method1274));
        }
        method19600(new File(parent, "region"), arrayList, class733, 0, i, class732);
        method19600(new File(method1272, "region"), arrayList2, field31769.method24875(field31769.method24876(method1274).method16709(Class7102.field27640)), arrayList.size(), i, class732);
        method19600(new File(method1273, "region"), arrayList3, field31769.method24875(field31769.method24876(method1274).method16709(Class7102.field27641)), arrayList.size() + arrayList2.size(), i, class732);
        method1274.method29552(19133);
        if (method1274.method29570() == Class9505.field40899) {
            method1274.method29571(Class9505.field40892);
        }
        method19599(path, child);
        Class7952.method25788(path, dataFixer, child, null).method29395(method1274);
        return true;
    }
    
    private static void method19599(final Path path, final String child) {
        final File file = new File(path.toFile(), child);
        if (file.exists()) {
            final File file2 = new File(file, "level.dat");
            if (file2.exists()) {
                if (!file2.renameTo(new File(file, "level.dat_mcr"))) {
                    Class6512.field25888.warn("Unable to create level.dat_mcr backup");
                }
            }
            else {
                Class6512.field25888.warn("Unable to create level.dat_mcr backup");
            }
        }
        else {
            Class6512.field25888.warn("Unable to create level.dat_mcr backup");
        }
    }
    
    private static void method19600(final File file, final Iterable<File> iterable, final Class1868 class1868, int n, final int n2, final Class732 class1869) {
        final Iterator<File> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            method19601(file, iterator.next(), class1868, n, n2, class1869);
            ++n;
            class1869.method4039((int)Math.round(100.0 * n / n2));
        }
    }
    
    private static void method19601(final File parent, final File file, final Class1868 class1868, final int n, final int n2, final Class732 class1869) {
        final String name = file.getName();
        try (final Class1924 class1870 = new Class1924(file, parent);
             final Class1924 class1871 = new Class1924(new File(parent, name.substring(0, name.length() - ".mcr".length()) + ".mca"), parent)) {
            for (int i = 0; i < 32; ++i) {
                for (int j = 0; j < 32; ++j) {
                    final Class7859 class1872 = new Class7859(i, j);
                    if (class1870.method7656(class1872) && !class1871.method7656(class1872)) {
                        CompoundNBT method7640;
                        try (final DataInputStream method7639 = class1870.method7639(class1872)) {
                            if (method7639 == null) {
                                Class6512.field25888.warn("Failed to fetch input stream for chunk {}", (Object)class1872);
                                continue;
                            }
                            method7640 = Class8097.method26595(method7639);
                        }
                        catch (final IOException ex) {
                            Class6512.field25888.warn("Failed to read data for chunk {}", (Object)class1872, (Object)ex);
                            continue;
                        }
                        final Class6822 method7641 = Class6774.method20679(method7640.getCompound("Level"));
                        final CompoundNBT class1873 = new CompoundNBT();
                        final CompoundNBT class1874 = new CompoundNBT();
                        class1873.put("Level", class1874);
                        Class6774.method20680(method7641, class1874, class1868);
                        try (final DataOutputStream method7642 = class1871.method7650(class1872)) {
                            Class8097.method26597(class1873, method7642);
                        }
                    }
                }
                final int n3 = (int)Math.round(100.0 * (n * 1024) / (n2 * 1024));
                final int n4 = (int)Math.round(100.0 * ((i + 1) * 32 + n * 1024) / (n2 * 1024));
                if (n4 > n3) {
                    class1869.method4039(n4);
                }
            }
        }
        catch (final IOException ex2) {
            Class6512.field25888.error("Failed to upgrade region file {}", (Object)file, (Object)ex2);
        }
    }
    
    private static void method19602(final File parent, final Collection<File> c) {
        final File[] listFiles = new File(parent, "region").listFiles((p0, s) -> s.endsWith(".mcr"));
        if (listFiles != null) {
            Collections.addAll(c, listFiles);
        }
    }
    
    static {
        field25888 = LogManager.getLogger();
    }
}
