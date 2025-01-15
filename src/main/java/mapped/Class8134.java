// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.IntSet;
import org.apache.logging.log4j.LogManager;
import java.util.LinkedHashSet;
import java.util.Collections;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntComparator;
import it.unimi.dsi.fastutil.Arrays;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class8134<T>
{
    private static final boolean field33507;
    private static final boolean field33508;
    private static final Logger field33509;
    public final List<T> field33510;
    private final IntList field33511;
    private final IntList field33512;
    private IntList field33513;
    private IntList field33514;
    private int field33515;
    
    public Class8134() {
        this.field33510 = Lists.newArrayList();
        this.field33511 = (IntList)new IntArrayList();
        this.field33512 = (IntList)new IntArrayList();
        this.field33513 = (IntList)new IntArrayList();
        this.field33514 = (IntList)new IntArrayList();
    }
    
    public void method26804(final T t, final String s) {
        this.field33515 = Math.max(this.field33515, s.length());
        final int size = this.field33510.size();
        this.field33510.add(t);
        this.field33512.add(this.field33511.size());
        for (int i = 0; i < s.length(); ++i) {
            this.field33513.add(size);
            this.field33514.add(i);
            this.field33511.add((int)s.charAt(i));
        }
        this.field33513.add(size);
        this.field33514.add(s.length());
        this.field33511.add(-1);
    }
    
    public void method26805() {
        final int size = this.field33511.size();
        final int[] array = new int[size];
        final int[] array2 = new int[size];
        final int[] array3 = new int[size];
        final int[] array4 = new int[size];
        final Class4451 class4451 = new Class4451(this, array2, array3);
        final Swapper swapper = (n, n2) -> {
            if (n != n2) {
                final int n3 = array2[n];
                array2[n] = array2[n2];
                array2[n2] = n3;
                final int n4 = array3[n];
                array3[n] = array3[n2];
                array3[n2] = n4;
                final int n5 = array4[n];
                array4[n] = array4[n2];
                array4[n2] = n5;
            }
        };
        for (int i = 0; i < size; ++i) {
            array[i] = this.field33511.getInt(i);
        }
        for (int n = 1; n * 2 < Math.min(size, this.field33515); n *= 2) {
            for (int j = 0; j < size; array4[j] = j++) {
                array2[j] = array[j];
                array3[j] = ((j + n >= size) ? -2 : array[j + n]);
            }
            Arrays.quickSort(0, size, (IntComparator)class4451, swapper);
            for (int k = 0; k < size; ++k) {
                if (k > 0) {
                    if (array2[k] == array2[k - 1]) {
                        if (array3[k] == array3[k - 1]) {
                            array[array4[k]] = array[array4[k - 1]];
                            continue;
                        }
                    }
                }
                array[array4[k]] = k;
            }
        }
        final IntList field33513 = this.field33513;
        final IntList field33514 = this.field33514;
        this.field33513 = (IntList)new IntArrayList(field33513.size());
        this.field33514 = (IntList)new IntArrayList(field33514.size());
        for (final int n2 : array4) {
            this.field33513.add(field33513.getInt(n2));
            this.field33514.add(field33514.getInt(n2));
        }
        if (Class8134.field33508) {
            this.method26806();
        }
    }
    
    private void method26806() {
        for (int i = 0; i < this.field33513.size(); ++i) {
            Class8134.field33509.debug("{} {}", (Object)i, (Object)this.method26807(i));
        }
        Class8134.field33509.debug("");
    }
    
    private String method26807(final int n) {
        final int int1 = this.field33514.getInt(n);
        final int int2 = this.field33512.getInt(this.field33513.getInt(n));
        final StringBuilder sb = new StringBuilder();
        for (int n2 = 0; int2 + n2 < this.field33511.size(); ++n2) {
            if (n2 == int1) {
                sb.append('^');
            }
            final int intValue = this.field33511.get(int2 + n2);
            if (intValue == -1) {
                break;
            }
            sb.append((char)intValue);
        }
        return sb.toString();
    }
    
    private int method26808(final String s, final int n) {
        final int int1 = this.field33512.getInt(this.field33513.getInt(n));
        final int int2 = this.field33514.getInt(n);
        for (int i = 0; i < s.length(); ++i) {
            final int int3 = this.field33511.getInt(int1 + int2 + i);
            if (int3 == -1) {
                return 1;
            }
            final char char1 = s.charAt(i);
            final char c = (char)int3;
            if (char1 < c) {
                return -1;
            }
            if (char1 > c) {
                return 1;
            }
        }
        return 0;
    }
    
    public List<T> method26809(final String s) {
        final int size = this.field33513.size();
        int i = 0;
        int n = size;
        while (i < n) {
            final int j = i + (n - i) / 2;
            final int method26808 = this.method26808(s, j);
            if (Class8134.field33507) {
                Class8134.field33509.debug("comparing lower \"{}\" with {} \"{}\": {}", (Object)s, (Object)j, (Object)this.method26807(j), (Object)method26808);
            }
            if (method26808 <= 0) {
                n = j;
            }
            else {
                i = j + 1;
            }
        }
        if (i >= 0 && i < size) {
            final int n2 = i;
            int n3 = size;
            while (i < n3) {
                final int k = i + (n3 - i) / 2;
                final int method26809 = this.method26808(s, k);
                if (Class8134.field33507) {
                    Class8134.field33509.debug("comparing upper \"{}\" with {} \"{}\": {}", (Object)s, (Object)k, (Object)this.method26807(k), (Object)method26809);
                }
                if (method26809 < 0) {
                    n3 = k;
                }
                else {
                    i = k + 1;
                }
            }
            final int n4 = i;
            final IntOpenHashSet set = new IntOpenHashSet();
            for (int l = n2; l < n4; ++l) {
                ((IntSet)set).add(this.field33513.getInt(l));
            }
            final int[] intArray = ((IntSet)set).toIntArray();
            java.util.Arrays.sort(intArray);
            final LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
            final int[] array = intArray;
            for (int length = array.length, n5 = 0; n5 < length; ++n5) {
                linkedHashSet.add(this.field33510.get(array[n5]));
            }
            return Lists.newArrayList((Iterable)linkedHashSet);
        }
        return Collections.emptyList();
    }
    
    static {
        field33507 = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
        field33508 = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
        field33509 = LogManager.getLogger();
    }
}
