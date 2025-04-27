// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.RandomAccessFile;

public class Class8036
{
    private static final String field33093 = "usage:\nnet.sourceforge.jaad.MP4Info [options] <infile>\n\n\t-b\talso print all boxes";
    
    public static void main(final String[] array) {
        try {
            if (array.length < 1) {
                method26365();
            }
            else {
                boolean b = false;
                String pathname;
                if (array.length > 1) {
                    if (array[0].equals("-b")) {
                        b = true;
                    }
                    else {
                        method26365();
                    }
                    pathname = array[1];
                }
                else {
                    pathname = array[0];
                }
                final Class7828 class7828 = new Class7828(new RandomAccessFile(pathname, "r"));
                final Class6476 method25294 = class7828.method25294();
                System.out.println("Movie:");
                final List<Class6889> method25295 = method25294.method19491();
                for (int i = 0; i < method25295.size(); ++i) {
                    final Class6889 class7829 = method25295.get(i);
                    System.out.println("\tTrack " + i + ": " + class7829.method21158() + " (language: " + class7829.method21175() + ", created: " + class7829.method21173() + ")");
                    final Class6915 method25296 = class7829.method21180();
                    if (method25296 != null) {
                        System.out.println("\t\tprotection: " + method25296.method21282());
                    }
                }
                if (method25294.method19494()) {
                    System.out.println("\tMetadata:");
                    final Map<Class7017<?>, Object> method25297 = method25294.method19495().method34094();
                    for (final Class7017 class7830 : method25297.keySet()) {
                        if (class7830.equals(Class7017.field27375)) {
                            System.out.println("\t\t" + ((List)method25297.get(Class7017.field27375)).size() + " Cover Artworks present");
                        }
                        else {
                            System.out.println("\t\t" + class7830.method21479() + " = " + method25297.get(class7830));
                        }
                    }
                }
                final List<Class6915> method25298 = method25294.method19496();
                if (method25298.size() > 0) {
                    System.out.println("\tprotections:");
                    final Iterator<Class6915> iterator2 = method25298.iterator();
                    while (iterator2.hasNext()) {
                        System.out.println("\t\t" + iterator2.next().method21282());
                    }
                }
                if (b) {
                    System.out.println("================================");
                    final Iterator<Class3746> iterator3 = class7828.method25295().iterator();
                    while (iterator3.hasNext()) {
                        method26366(iterator3.next(), 0);
                    }
                }
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            System.err.println("error while reading file: " + ex);
        }
    }
    
    private static void method26365() {
        System.out.println("usage:\nnet.sourceforge.jaad.MP4Info [options] <infile>\n\n\t-b\talso print all boxes");
        System.exit(1);
    }
    
    private static void method26366(final Class3746 class3746, final int n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append("  ");
        }
        sb.append(class3746.toString());
        System.out.println(sb);
        final Iterator<Class3746> iterator = class3746.method11500().iterator();
        while (iterator.hasNext()) {
            method26366(iterator.next(), n + 1);
        }
    }
}
