// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import sun.misc.Unsafe;

public class Class8601
{
    public static final Unsafe field36113;
    
    private Class8601() {
    }
    
    public static void method29137(final Class11 class11, final long n, final Class11 class12, final long n2, final long n3) {
        if (class11.method119() != class12.method119()) {
            throw new IllegalArgumentException("The type of source array is different than the type of destimation array.");
        }
        switch (Class9207.field39004[class11.method119().ordinal()]) {
            case 1: {
                method29139((Class23)class11, n, (Class23)class12, n2, n3);
                break;
            }
            case 2: {
                method29143((Class12)class11, n, (Class12)class12, n2, n3);
                break;
            }
            case 3: {
                method29146((Class16)class11, n, (Class16)class12, n2, n3);
                break;
            }
            case 4: {
                method29148((Class19)class11, n, (Class19)class12, n2, n3);
                break;
            }
            case 5: {
                method29150((Class15)class11, n, (Class15)class12, n2, n3);
                break;
            }
            case 6: {
                method29152((Class22)class11, n, (Class22)class12, n2, n3);
                break;
            }
            case 7: {
                method29154((Class17)class11, n, (Class17)class12, n2, n3);
                break;
            }
            case 8: {
                method29156((Class14)class11, n, (Class14)class12, n2, n3);
                break;
            }
            case 9: {
                method29158((Class21)class11, n, (Class21)class12, n2, n3);
                break;
            }
            case 10: {
                method29160((Class13)class11, n, (Class13)class12, n2, n3);
                break;
            }
            case 11: {
                method29162((Class20)class11, n, (Class20)class12, n2, n3);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid array type.");
            }
        }
    }
    
    public static void method29138(final Object o, final long n, final Class11 class11, final long n2, final long n3) {
        switch (Class9207.field39004[class11.method119().ordinal()]) {
            case 1: {
                method29140((boolean[])o, (int)n, (Class23)class11, n2, n3);
                break;
            }
            case 2: {
                method29142((byte[])o, (int)n, (Class18)class11, n2, n3);
                break;
            }
            case 12: {
                if (o.getClass().getComponentType() == Byte.TYPE) {
                    method29144((byte[])o, (int)n, (Class12)class11, n2, n3);
                    break;
                }
                method29145((short[])o, (int)n, (Class12)class11, n2, n3);
                break;
            }
            case 3: {
                method29147((short[])o, (int)n, (Class16)class11, n2, n3);
                break;
            }
            case 4: {
                method29149((int[])o, (int)n, (Class19)class11, n2, n3);
                break;
            }
            case 5: {
                method29151((long[])o, (int)n, (Class15)class11, n2, n3);
                break;
            }
            case 6: {
                method29153((float[])o, (int)n, (Class22)class11, n2, n3);
                break;
            }
            case 7: {
                method29155((double[])o, (int)n, (Class17)class11, n2, n3);
                break;
            }
            case 8: {
                method29157((float[])o, (int)n, (Class14)class11, n2, n3);
                break;
            }
            case 9: {
                method29159((double[])o, (int)n, (Class21)class11, n2, n3);
                break;
            }
            case 10: {
                method29161((String[])o, (int)n, (Class13)class11, n2, n3);
                break;
            }
            case 11: {
                method29163((Object[])o, (int)n, (Class20)class11, n2, n3);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid array type.");
            }
        }
    }
    
    public static void method29139(final Class23 class23, final long n, final Class23 class24, final long n2, final long n3) {
        if (n < 0L || n >= class23.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class24.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class24.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class24.method159(n6, class23.method125(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1322(n8, (i == n4 - 1) ? n3 : (n8 + n7), class24, n2, class23, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class24.method159(n10, class23.method125(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class24.method159(n12, class23.method125(n11));
                }
            }
        }
    }
    
    public static void method29140(final boolean[] array, final int n, final Class23 class23, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class23.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class23.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class23.method157(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1220(n8, (i == n5 - 1) ? n3 : (n8 + n7), class23, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class23.method157(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class23.method157(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29141(final Class18 class18, final long n, final Class18 class19, final long n2, final long n3) {
        if (n < 0L || n >= class18.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class19.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class19.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class19.method159(n6, class18.method125(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1645(n8, (i == n4 - 1) ? n3 : (n8 + n7), class19, n2, class18, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class19.method159(n10, class18.method125(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class19.method159(n12, class18.method125(n11));
                }
            }
        }
    }
    
    public static void method29142(final byte[] array, final int n, final Class18 class18, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class18.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class18.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class18.method159(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1421(n8, (i == n5 - 1) ? n3 : (n8 + n7), class18, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class18.method159(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class18.method159(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29143(final Class12 class12, final long n, final Class12 class13, final long n2, final long n3) {
        if (n < 0L || n >= class12.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class13.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class13.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class13.method159(n6, class12.method125(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1495(n8, (i == n4 - 1) ? n3 : (n8 + n7), class13, n2, class12, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class13.method159(n10, class12.method125(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class13.method159(n12, class12.method125(n11));
                }
            }
        }
    }
    
    public static void method29144(final byte[] array, final int n, final Class12 class12, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class12.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class12.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class12.method159(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1536(n8, (i == n5 - 1) ? n3 : (n8 + n7), class12, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class12.method159(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class12.method159(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29145(final short[] array, final int n, final Class12 class12, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class12.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class12.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class12.method161(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1404(n8, (i == n5 - 1) ? n3 : (n8 + n7), class12, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class12.method161(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class12.method161(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29146(final Class16 class16, final long n, final Class16 class17, final long n2, final long n3) {
        if (n < 0L || n >= class16.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class17.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class17.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class17.method163(n6, class16.method129(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1609(n8, (i == n4 - 1) ? n3 : (n8 + n7), class17, n2, class16, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class17.method163(n10, class16.method129(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class17.method163(n12, class16.method129(n11));
                }
            }
        }
    }
    
    public static void method29147(final short[] array, final int n, final Class16 class16, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class16.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class16.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class16.method163(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1077(n8, (i == n5 - 1) ? n3 : (n8 + n7), class16, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class16.method163(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class16.method163(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29148(final Class19 class19, final long n, final Class19 class20, final long n2, final long n3) {
        if (n < 0L || n >= class19.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class20.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class20.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class20.method165(n6, class19.method131(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1504(n8, (i == n4 - 1) ? n3 : (n8 + n7), class20, n2, class19, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class20.method165(n10, class19.method131(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class20.method165(n12, class19.method131(n11));
                }
            }
        }
    }
    
    public static void method29149(final int[] array, final int n, final Class19 class19, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class19.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class19.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class19.method165(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1059(n8, (i == n5 - 1) ? n3 : (n8 + n7), class19, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class19.method165(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class19.method165(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29150(final Class15 class15, final long n, final Class15 class16, final long n2, final long n3) {
        if (n < 0L || n >= class15.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class16.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class16.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class16.method167(n6, class15.method133(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1181(n8, (i == n4 - 1) ? n3 : (n8 + n7), class16, n2, class15, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class16.method167(n10, class15.method133(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class16.method167(n12, class15.method133(n11));
                }
            }
        }
    }
    
    public static void method29151(final long[] array, final int n, final Class15 class15, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class15.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class15.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class15.method167(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1177(n8, (i == n5 - 1) ? n3 : (n8 + n7), class15, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class15.method167(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class15.method167(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29152(final Class22 class22, final long n, final Class22 class23, final long n2, final long n3) {
        if (n < 0L || n >= class22.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class23.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class23.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class23.method169(n6, class22.method135(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1067(n8, (i == n4 - 1) ? n3 : (n8 + n7), class23, n2, class22, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class23.method169(n10, class22.method135(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class23.method169(n12, class22.method135(n11));
                }
            }
        }
    }
    
    public static void method29153(final float[] array, final int n, final Class22 class22, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class22.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class22.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class22.method169(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1012(n8, (i == n5 - 1) ? n3 : (n8 + n7), class22, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class22.method169(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class22.method169(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29154(final Class17 class17, final long n, final Class17 class18, final long n2, final long n3) {
        if (n < 0L || n >= class17.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class18.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class18.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class18.method171(n6, class17.method137(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1005(n8, (i == n4 - 1) ? n3 : (n8 + n7), class18, n2, class17, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class18.method171(n10, class17.method137(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class18.method171(n12, class17.method137(n11));
                }
            }
        }
    }
    
    public static void method29155(final double[] array, final int n, final Class17 class17, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class17.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class17.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class17.method171(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1369(n8, (i == n5 - 1) ? n3 : (n8 + n7), class17, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class17.method171(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class17.method171(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29156(final Class14 class14, final long n, final Class14 class15, final long n2, final long n3) {
        if (n < 0L || n >= class14.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class15.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class15.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class15.method197(n6, class14.method192(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1155(n8, (i == n4 - 1) ? n3 : (n8 + n7), class15, n2, class14, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class15.method197(n10, class14.method192(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class15.method197(n12, class14.method192(n11));
                }
            }
        }
    }
    
    public static void method29157(final float[] array, final int n, final Class14 class14, final long n2, final long n3) {
        if (array.length % 2 != 0) {
            throw new IllegalArgumentException("The length of the source array must be even.");
        }
        if (n < 0 || n >= array.length / 2) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length / 2");
        }
        if (n2 < 0L || n2 >= class14.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class14.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            final float[] array2 = new float[2];
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                array2[0] = array[2 * n4];
                array2[1] = array[2 * n4 + 1];
                class14.method197(n6, array2);
                ++n4;
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array3 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array3[i] = Class8216.method27227(new Class1603(n8, (i == n5 - 1) ? n3 : (n8 + n7), array, n, class14, n2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException ex) {
                final float[] array4 = new float[2];
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    array4[0] = array[2 * n4];
                    array4[1] = array[2 * n4 + 1];
                    class14.method197(n9, array4);
                    ++n4;
                }
            }
            catch (final ExecutionException ex2) {
                final float[] array5 = new float[2];
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    array5[0] = array[2 * n4];
                    array5[1] = array[2 * n4 + 1];
                    class14.method197(n10, array5);
                    ++n4;
                }
            }
        }
    }
    
    public static void method29158(final Class21 class21, final long n, final Class21 class22, final long n2, final long n3) {
        if (n < 0L || n >= class21.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class22.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class22.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class22.method227(n6, class21.method222(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1472(n8, (i == n4 - 1) ? n3 : (n8 + n7), class22, n2, class21, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class22.method227(n10, class21.method222(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class22.method227(n12, class21.method222(n11));
                }
            }
        }
    }
    
    public static void method29159(final double[] array, final int n, final Class21 class21, final long n2, final long n3) {
        if (array.length % 2 != 0) {
            throw new IllegalArgumentException("The length of the source array must be even.");
        }
        if (n < 0 || n >= array.length / 2) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length / 2");
        }
        if (n2 < 0L || n2 >= class21.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class21.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            final double[] array2 = new double[2];
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                array2[0] = array[2 * n4];
                array2[1] = array[2 * n4 + 1];
                class21.method227(n6, array2);
                ++n4;
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array3 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array3[i] = Class8216.method27227(new Class1616(n8, (i == n5 - 1) ? n3 : (n8 + n7), array, n, class21, n2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException ex) {
                final double[] array4 = new double[2];
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    array4[0] = array[2 * n4];
                    array4[1] = array[2 * n4 + 1];
                    class21.method227(n9, array4);
                    ++n4;
                }
            }
            catch (final ExecutionException ex2) {
                final double[] array5 = new double[2];
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    array5[0] = array[2 * n4];
                    array5[1] = array[2 * n4 + 1];
                    class21.method227(n10, array5);
                    ++n4;
                }
            }
        }
    }
    
    public static void method29160(final Class13 class13, final long n, final Class13 class14, final long n2, final long n3) {
        if (n < 0L || n >= class13.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class14.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class14.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class14.method154(n6, class13.method182(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1223(n8, (i == n4 - 1) ? n3 : (n8 + n7), class14, n2, class13, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class14.method154(n10, class13.method182(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class14.method154(n12, class13.method182(n11));
                }
            }
        }
    }
    
    public static void method29161(final String[] array, final int n, final Class13 class13, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class13.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class13.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class13.method154(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1026(n8, (i == n5 - 1) ? n3 : (n8 + n7), class13, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class13.method154(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class13.method154(n10, array[n4++]);
                }
            }
        }
    }
    
    public static void method29162(final Class20 class20, final long n, final Class20 class21, final long n2, final long n3) {
        if (n < 0L || n >= class20.method118()) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (n2 < 0L || n2 >= class21.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class21.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        final int n4 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n4 < 2 || n3 < Class8216.method27221()) {
            for (long n5 = n, n6 = n2; n5 < n + n3; ++n5, ++n6) {
                class21.method154(n6, class20.method120(n5));
            }
        }
        else {
            final long n7 = n3 / n4;
            final Future[] array = new Future[n4];
            for (int i = 0; i < n4; ++i) {
                final long n8 = i * n7;
                array[i] = Class8216.method27227(new Class1564(n8, (i == n4 - 1) ? n3 : (n8 + n7), class21, n2, class20, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n, n10 = n2; n9 < n + n3; ++n9, ++n10) {
                    class21.method154(n10, class20.method120(n9));
                }
            }
            catch (final ExecutionException ex2) {
                for (long n11 = n, n12 = n2; n11 < n + n3; ++n11, ++n12) {
                    class21.method154(n12, class20.method120(n11));
                }
            }
        }
    }
    
    public static void method29163(final Object[] array, final int n, final Class20 class20, final long n2, final long n3) {
        if (n < 0 || n >= array.length) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length");
        }
        if (n2 < 0L || n2 >= class20.method118()) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (n3 < 0L) {
            throw new IllegalArgumentException("length < 0");
        }
        if (class20.method175()) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int n4 = n;
        final int n5 = (int)Class7640.method24129(n3, Class8216.method27224());
        if (n5 < 2 || n3 < Class8216.method27221()) {
            for (long n6 = n2; n6 < n2 + n3; ++n6) {
                class20.method154(n6, array[n4++]);
            }
        }
        else {
            final long n7 = n3 / n5;
            final Future[] array2 = new Future[n5];
            for (int i = 0; i < n5; ++i) {
                final long n8 = i * n7;
                array2[i] = Class8216.method27227(new Class1537(n8, (i == n5 - 1) ? n3 : (n8 + n7), class20, n2, array, n));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException ex) {
                for (long n9 = n2; n9 < n2 + n3; ++n9) {
                    class20.method154(n9, array[n4++]);
                }
            }
            catch (final ExecutionException ex2) {
                for (long n10 = n2; n10 < n2 + n3; ++n10) {
                    class20.method154(n10, array[n4++]);
                }
            }
        }
    }
    
    public static Class11 method29164(final Class273 class273, final long n, final Object o) {
        switch (Class9207.field39004[class273.ordinal()]) {
            case 1: {
                byte b;
                if (o instanceof Boolean) {
                    b = (byte)(((boolean)o) ? 1 : 0);
                }
                else if (o instanceof Byte) {
                    b = (byte)o;
                }
                else if (o instanceof Short) {
                    b = ((Short)o).byteValue();
                }
                else if (o instanceof Integer) {
                    b = ((Integer)o).byteValue();
                }
                else if (o instanceof Long) {
                    b = ((Long)o).byteValue();
                }
                else if (o instanceof Float) {
                    b = ((Float)o).byteValue();
                }
                else {
                    if (!(o instanceof Double)) {
                        throw new IllegalArgumentException("Invalid value type.");
                    }
                    b = ((Double)o).byteValue();
                }
                return new Class23(n, b);
            }
            case 2: {
                byte b2;
                if (o instanceof Boolean) {
                    b2 = (byte)(((boolean)o) ? 1 : 0);
                }
                else if (o instanceof Byte) {
                    b2 = (byte)o;
                }
                else if (o instanceof Short) {
                    b2 = ((Short)o).byteValue();
                }
                else if (o instanceof Integer) {
                    b2 = ((Integer)o).byteValue();
                }
                else if (o instanceof Long) {
                    b2 = ((Long)o).byteValue();
                }
                else if (o instanceof Float) {
                    b2 = ((Float)o).byteValue();
                }
                else {
                    if (!(o instanceof Double)) {
                        throw new IllegalArgumentException("Invalid value type.");
                    }
                    b2 = ((Double)o).byteValue();
                }
                return new Class18(n, b2);
            }
            case 12: {
                short n2;
                if (o instanceof Boolean) {
                    n2 = (short)(((boolean)o) ? 1 : 0);
                }
                else if (o instanceof Byte) {
                    n2 = (short)o;
                }
                else if (o instanceof Short) {
                    n2 = (short)o;
                }
                else if (o instanceof Integer) {
                    n2 = ((Integer)o).shortValue();
                }
                else if (o instanceof Long) {
                    n2 = ((Long)o).shortValue();
                }
                else if (o instanceof Float) {
                    n2 = ((Float)o).shortValue();
                }
                else {
                    if (!(o instanceof Double)) {
                        throw new IllegalArgumentException("Invalid value type.");
                    }
                    n2 = ((Double)o).shortValue();
                }
                return new Class12(n, n2);
            }
            case 3: {
                short n3;
                if (o instanceof Boolean) {
                    n3 = (short)(((boolean)o) ? 1 : 0);
                }
                else if (o instanceof Byte) {
                    n3 = (short)o;
                }
                else if (o instanceof Short) {
                    n3 = (short)o;
                }
                else if (o instanceof Integer) {
                    n3 = ((Integer)o).shortValue();
                }
                else if (o instanceof Long) {
                    n3 = ((Long)o).shortValue();
                }
                else if (o instanceof Float) {
                    n3 = ((Float)o).shortValue();
                }
                else {
                    if (!(o instanceof Double)) {
                        throw new IllegalArgumentException("Invalid value type.");
                    }
                    n3 = ((Double)o).shortValue();
                }
                return new Class16(n, n3);
            }
            case 4: {
                int n4;
                if (o instanceof Boolean) {
                    n4 = (((boolean)o) ? 1 : 0);
                }
                else if (o instanceof Byte) {
                    n4 = (int)o;
                }
                else if (o instanceof Short) {
                    n4 = (int)o;
                }
                else if (o instanceof Integer) {
                    n4 = (int)o;
                }
                else if (o instanceof Long) {
                    n4 = ((Long)o).intValue();
                }
                else if (o instanceof Float) {
                    n4 = ((Float)o).intValue();
                }
                else {
                    if (!(o instanceof Double)) {
                        throw new IllegalArgumentException("Invalid value type.");
                    }
                    n4 = ((Double)o).intValue();
                }
                return new Class19(n, n4);
            }
            case 5: {
                long n5;
                if (o instanceof Boolean) {
                    n5 = (((boolean)o) ? 1 : 0);
                }
                else if (o instanceof Byte) {
                    n5 = (long)o;
                }
                else if (o instanceof Short) {
                    n5 = (long)o;
                }
                else if (o instanceof Integer) {
                    n5 = (long)o;
                }
                else if (o instanceof Long) {
                    n5 = (long)o;
                }
                else if (o instanceof Float) {
                    n5 = ((Float)o).longValue();
                }
                else {
                    if (!(o instanceof Double)) {
                        throw new IllegalArgumentException("Invalid value type.");
                    }
                    n5 = ((Double)o).longValue();
                }
                return new Class15(n, n5);
            }
            case 6: {
                float n6;
                if (o instanceof Boolean) {
                    n6 = (o ? 1.0f : 0.0f);
                }
                else if (o instanceof Byte) {
                    n6 = (float)o;
                }
                else if (o instanceof Short) {
                    n6 = (float)o;
                }
                else if (o instanceof Integer) {
                    n6 = (float)o;
                }
                else if (o instanceof Long) {
                    n6 = (float)o;
                }
                else if (o instanceof Float) {
                    n6 = (float)o;
                }
                else {
                    if (!(o instanceof Double)) {
                        throw new IllegalArgumentException("Invalid value type.");
                    }
                    n6 = ((Double)o).floatValue();
                }
                return new Class22(n, n6);
            }
            case 7: {
                double n7;
                if (o instanceof Boolean) {
                    n7 = (o ? 1.0 : 0.0);
                }
                else if (o instanceof Byte) {
                    n7 = (double)o;
                }
                else if (o instanceof Short) {
                    n7 = (double)o;
                }
                else if (o instanceof Integer) {
                    n7 = (double)o;
                }
                else if (o instanceof Long) {
                    n7 = (double)o;
                }
                else if (o instanceof Float) {
                    n7 = (double)o;
                }
                else {
                    if (!(o instanceof Double)) {
                        throw new IllegalArgumentException("Invalid value type.");
                    }
                    n7 = (double)o;
                }
                return new Class17(n, n7);
            }
            case 8: {
                if (o.getClass().getComponentType() == Float.TYPE) {
                    return new Class14(n, (float[])o);
                }
                throw new IllegalArgumentException("Invalid value type.");
            }
            case 9: {
                if (o.getClass().getComponentType() == Double.TYPE) {
                    return new Class21(n, (double[])o);
                }
                throw new IllegalArgumentException("Invalid value type.");
            }
            case 10: {
                if (o instanceof String) {
                    return new Class13(n, (String)o);
                }
                throw new IllegalArgumentException("Invalid value type.");
            }
            case 11: {
                return new Class20(n, o);
            }
            default: {
                throw new IllegalArgumentException("Invalid array type.");
            }
        }
    }
    
    public static Class11 method29165(final Class273 class273, final long n) {
        return method29166(class273, n, true);
    }
    
    public static Class11 method29166(final Class273 class273, final long n, final boolean b) {
        switch (Class9207.field39004[class273.ordinal()]) {
            case 1: {
                return new Class23(n, b);
            }
            case 2: {
                return new Class18(n, b);
            }
            case 12: {
                return new Class12(n, b);
            }
            case 3: {
                return new Class16(n, b);
            }
            case 4: {
                return new Class19(n, b);
            }
            case 5: {
                return new Class15(n, b);
            }
            case 6: {
                return new Class22(n, b);
            }
            case 7: {
                return new Class17(n, b);
            }
            case 8: {
                return new Class14(n, b);
            }
            case 9: {
                return new Class21(n, b);
            }
            case 10: {
                return new Class13(n, 100, b);
            }
            case 11: {
                return new Class20(n, 100, b);
            }
            default: {
                throw new IllegalArgumentException("Invalid array type.");
            }
        }
    }
    
    public static Class11 method29167(final Class273 class273, final long n) {
        final Class11 method29166 = method29166(class273, n, false);
        final Random random = new Random();
        switch (Class9207.field39004[class273.ordinal()]) {
            case 1: {
                for (long n2 = 0L; n2 < n; ++n2) {
                    method29166.method157(n2, random.nextBoolean());
                }
                break;
            }
            case 2:
            case 12: {
                long n3;
                for (n3 = 0L; n3 < n / 4L; n3 += 4L) {
                    final int n4;
                    method29166.method159(n3, (byte)(n4 = random.nextInt() >> 8));
                    final int n5;
                    method29166.method159(n3 + 1L, (byte)(n5 = n4 >> 8));
                    final int n6;
                    method29166.method159(n3 + 2L, (byte)(n6 = n5 >> 8));
                    method29166.method159(n3 + 3L, (byte)(n6 >> 8));
                }
                int nextInt = random.nextInt();
                while (n3 < n) {
                    method29166.method159(n3, (byte)(nextInt >>= 8));
                    ++n3;
                }
                break;
            }
            case 3: {
                long n7;
                for (n7 = 0L; n7 < n / 2L; n7 += 2L) {
                    final int n8;
                    method29166.method163(n7, (short)(n8 = random.nextInt() >> 16));
                    method29166.method163(n7 + 1L, (short)(n8 >> 16));
                }
                int nextInt2 = random.nextInt();
                while (n7 < n) {
                    method29166.method163(n7, (short)(nextInt2 >>= 16));
                    ++n7;
                }
                break;
            }
            case 4: {
                for (long n9 = 0L; n9 < n; ++n9) {
                    method29166.method165(n9, random.nextInt());
                }
                break;
            }
            case 5: {
                for (long n10 = 0L; n10 < n; ++n10) {
                    method29166.method167(n10, random.nextLong());
                }
                break;
            }
            case 6: {
                for (long n11 = 0L; n11 < n; ++n11) {
                    method29166.method169(n11, random.nextFloat());
                }
                break;
            }
            case 7: {
                for (long n12 = 0L; n12 < n; ++n12) {
                    method29166.method171(n12, random.nextDouble());
                }
                break;
            }
            case 8: {
                final Class14 class274 = (Class14)method29166;
                final float[] array = new float[2];
                for (long n13 = 0L; n13 < n; ++n13) {
                    array[0] = random.nextFloat();
                    array[1] = random.nextFloat();
                    class274.method197(n13, array);
                }
                break;
            }
            case 9: {
                final Class21 class275 = (Class21)method29166;
                final double[] array2 = new double[2];
                for (long n14 = 0L; n14 < n; ++n14) {
                    array2[0] = random.nextDouble();
                    array2[1] = random.nextDouble();
                    class275.method227(n14, array2);
                }
                break;
            }
            case 10: {
                for (long n15 = 0L; n15 < n; ++n15) {
                    method29166.method169(n15, random.nextFloat());
                }
                break;
            }
            case 11: {
                for (long n16 = 0L; n16 < n; ++n16) {
                    method29166.method154(n16, random.nextFloat());
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid array type.");
            }
        }
        return method29166;
    }
    
    public static Class11 method29168(final Class11 class11, final Class273 class12) {
        if (class11.method119() == class12) {
            return class11;
        }
        if (!class11.method175()) {
            final long field30 = class11.field30;
            final Class11 method29166 = method29166(class12, field30, false);
            final int n = (int)Class7640.method24129(field30, Class8216.method27224());
            if (n < 2 || field30 < Class8216.method27221()) {
                switch (Class9207.field39004[class12.ordinal()]) {
                    case 1:
                    case 2: {
                        for (long n2 = 0L; n2 < field30; ++n2) {
                            method29166.method159(n2, class11.method125(n2));
                        }
                        break;
                    }
                    case 12: {
                        for (long n3 = 0L; n3 < field30; ++n3) {
                            method29166.method161(n3, class11.method127(n3));
                        }
                        break;
                    }
                    case 3: {
                        for (long n4 = 0L; n4 < field30; ++n4) {
                            method29166.method163(n4, class11.method129(n4));
                        }
                        break;
                    }
                    case 4: {
                        for (long n5 = 0L; n5 < field30; ++n5) {
                            method29166.method165(n5, class11.method131(n5));
                        }
                        break;
                    }
                    case 5: {
                        for (long n6 = 0L; n6 < field30; ++n6) {
                            method29166.method167(n6, class11.method133(n6));
                        }
                        break;
                    }
                    case 6: {
                        for (long n7 = 0L; n7 < field30; ++n7) {
                            method29166.method169(n7, class11.method135(n7));
                        }
                        break;
                    }
                    case 7: {
                        for (long n8 = 0L; n8 < field30; ++n8) {
                            method29166.method171(n8, class11.method137(n8));
                        }
                        break;
                    }
                    case 8: {
                        if (class11.method119() == Class273.field1493) {
                            for (long n9 = 0L; n9 < field30; ++n9) {
                                ((Class14)method29166).method198(n9, ((Class21)class11).method222(n9));
                            }
                            break;
                        }
                        for (long n10 = 0L; n10 < field30; ++n10) {
                            method29166.method169(n10, class11.method135(n10));
                        }
                        break;
                    }
                    case 9: {
                        if (class11.method119() == Class273.field1492) {
                            for (long n11 = 0L; n11 < field30; ++n11) {
                                ((Class21)method29166).method226(n11, ((Class14)class11).method192(n11));
                            }
                            break;
                        }
                        for (long n12 = 0L; n12 < field30; ++n12) {
                            method29166.method171(n12, class11.method137(n12));
                        }
                        break;
                    }
                    case 10: {
                        for (long n13 = 0L; n13 < field30; ++n13) {
                            method29166.method154(n13, class11.method120(n13).toString());
                        }
                        break;
                    }
                    case 11: {
                        for (long n14 = 0L; n14 < field30; ++n14) {
                            method29166.method154(n14, class11.method120(n14));
                        }
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Invalid array type.");
                    }
                }
            }
            else {
                final long n15 = field30 / n;
                final Future[] array = new Future[n];
                for (int i = 0; i < n; ++i) {
                    final long n16 = i * n15;
                    array[i] = Class8216.method27227(new Class1453(class12, n16, (i == n - 1) ? field30 : (n16 + n15), method29166, class11));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException ex) {
                    switch (Class9207.field39004[class12.ordinal()]) {
                        case 1:
                        case 2: {
                            for (long n17 = 0L; n17 < field30; ++n17) {
                                method29166.method159(n17, class11.method125(n17));
                            }
                            break;
                        }
                        case 12: {
                            for (long n18 = 0L; n18 < field30; ++n18) {
                                method29166.method161(n18, class11.method127(n18));
                            }
                            break;
                        }
                        case 3: {
                            for (long n19 = 0L; n19 < field30; ++n19) {
                                method29166.method163(n19, class11.method129(n19));
                            }
                            break;
                        }
                        case 4: {
                            for (long n20 = 0L; n20 < field30; ++n20) {
                                method29166.method165(n20, class11.method131(n20));
                            }
                            break;
                        }
                        case 5: {
                            for (long n21 = 0L; n21 < field30; ++n21) {
                                method29166.method167(n21, class11.method133(n21));
                            }
                            break;
                        }
                        case 6: {
                            for (long n22 = 0L; n22 < field30; ++n22) {
                                method29166.method169(n22, class11.method135(n22));
                            }
                            break;
                        }
                        case 7: {
                            for (long n23 = 0L; n23 < field30; ++n23) {
                                method29166.method171(n23, class11.method137(n23));
                            }
                            break;
                        }
                        case 8: {
                            if (class11.method119() == Class273.field1493) {
                                for (long n24 = 0L; n24 < field30; ++n24) {
                                    ((Class14)method29166).method198(n24, ((Class21)class11).method222(n24));
                                }
                                break;
                            }
                            for (long n25 = 0L; n25 < field30; ++n25) {
                                method29166.method169(n25, class11.method135(n25));
                            }
                            break;
                        }
                        case 9: {
                            if (class11.method119() == Class273.field1492) {
                                for (long n26 = 0L; n26 < field30; ++n26) {
                                    ((Class21)method29166).method226(n26, ((Class14)class11).method192(n26));
                                }
                                break;
                            }
                            for (long n27 = 0L; n27 < field30; ++n27) {
                                method29166.method171(n27, class11.method137(n27));
                            }
                            break;
                        }
                        case 10: {
                            for (long n28 = 0L; n28 < field30; ++n28) {
                                method29166.method154(n28, class11.method120(n28).toString());
                            }
                            break;
                        }
                        case 11: {
                            for (long n29 = 0L; n29 < field30; ++n29) {
                                method29166.method154(n29, class11.method120(n29));
                            }
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid array type.");
                        }
                    }
                }
                catch (final ExecutionException ex2) {
                    switch (Class9207.field39004[class12.ordinal()]) {
                        case 1:
                        case 2: {
                            for (long n30 = 0L; n30 < field30; ++n30) {
                                method29166.method159(n30, class11.method125(n30));
                            }
                            break;
                        }
                        case 12: {
                            for (long n31 = 0L; n31 < field30; ++n31) {
                                method29166.method161(n31, class11.method127(n31));
                            }
                            break;
                        }
                        case 3: {
                            for (long n32 = 0L; n32 < field30; ++n32) {
                                method29166.method163(n32, class11.method129(n32));
                            }
                            break;
                        }
                        case 4: {
                            for (long n33 = 0L; n33 < field30; ++n33) {
                                method29166.method165(n33, class11.method131(n33));
                            }
                            break;
                        }
                        case 5: {
                            for (long n34 = 0L; n34 < field30; ++n34) {
                                method29166.method167(n34, class11.method133(n34));
                            }
                            break;
                        }
                        case 6: {
                            for (long n35 = 0L; n35 < field30; ++n35) {
                                method29166.method169(n35, class11.method135(n35));
                            }
                            break;
                        }
                        case 7: {
                            for (long n36 = 0L; n36 < field30; ++n36) {
                                method29166.method171(n36, class11.method137(n36));
                            }
                            break;
                        }
                        case 8: {
                            if (class11.method119() == Class273.field1493) {
                                for (long n37 = 0L; n37 < field30; ++n37) {
                                    ((Class14)method29166).method198(n37, ((Class21)class11).method222(n37));
                                }
                                break;
                            }
                            for (long n38 = 0L; n38 < field30; ++n38) {
                                method29166.method169(n38, class11.method135(n38));
                            }
                            break;
                        }
                        case 9: {
                            if (class11.method119() == Class273.field1492) {
                                for (long n39 = 0L; n39 < field30; ++n39) {
                                    ((Class21)method29166).method226(n39, ((Class14)class11).method192(n39));
                                }
                                break;
                            }
                            for (long n40 = 0L; n40 < field30; ++n40) {
                                method29166.method171(n40, class11.method137(n40));
                            }
                            break;
                        }
                        case 10: {
                            for (long n41 = 0L; n41 < field30; ++n41) {
                                method29166.method154(n41, class11.method120(n41).toString());
                            }
                            break;
                        }
                        case 11: {
                            for (long n42 = 0L; n42 < field30; ++n42) {
                                method29166.method154(n42, class11.method120(n42));
                            }
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid array type.");
                        }
                    }
                }
            }
            return method29166;
        }
        switch (Class9207.field39004[class12.ordinal()]) {
            case 1: {
                return new Class23(class11.method118(), class11.method125(0L));
            }
            case 2: {
                return new Class18(class11.method118(), class11.method125(0L));
            }
            case 12: {
                return new Class12(class11.method118(), class11.method127(0L));
            }
            case 3: {
                return new Class16(class11.method118(), class11.method129(0L));
            }
            case 4: {
                return new Class19(class11.method118(), class11.method131(0L));
            }
            case 5: {
                return new Class15(class11.method118(), class11.method133(0L));
            }
            case 6: {
                return new Class22(class11.method118(), class11.method135(0L));
            }
            case 7: {
                return new Class17(class11.method118(), class11.method137(0L));
            }
            case 8: {
                return new Class14(class11.method118(), ((Class14)class11).method192(0L));
            }
            case 9: {
                return new Class21(class11.method118(), ((Class21)class11).method222(0L));
            }
            case 10: {
                return new Class13(class11.method118(), class11.method120(0L).toString());
            }
            case 11: {
                return new Class20(class11.method118(), class11.method120(0L));
            }
            default: {
                throw new IllegalArgumentException("Invalid array type.");
            }
        }
    }
    
    public static Class11 method29169(final Class11 class11, final Class23 class12) {
        if (class11.field30 != class12.field30) {
            throw new IllegalArgumentException("src.length != mask.length");
        }
        final long field30 = class11.field30;
        long n = 0L;
        final int n2 = (int)Class7640.method24129(field30, Class8216.method27224());
        final long n3 = field30 / n2;
        final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            final long n4 = i * n3;
            array[i] = cachedThreadPool.submit(new Class7076(n4, (i == n2 - 1) ? field30 : (n4 + n3), class12));
        }
        try {
            for (int j = 0; j < n2; ++j) {
                n += (long)array[j].get();
            }
        }
        catch (final Exception ex) {
            for (long n5 = 0L; n5 < field30; ++n5) {
                if (class12.method125(n5) == 1) {
                    ++n;
                }
            }
        }
        if (n <= 0L) {
            return null;
        }
        final Class11 method29166 = method29166(class11.method119(), n, false);
        long n6 = 0L;
        for (long n7 = 0L; n7 < field30; ++n7) {
            if (class12.method125(n7) == 1) {
                method29166.method154(n6++, class11.method120(n7));
            }
        }
        return method29166;
    }
    
    static {
        Object value = null;
        Throwable cause = null;
        try {
            final Class<?> forName = Class.forName("sun.misc.Unsafe");
            final Field declaredField = forName.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            value = declaredField.get(forName);
        }
        catch (final ClassNotFoundException ex) {
            cause = ex;
        }
        catch (final IllegalAccessException ex2) {
            cause = ex2;
        }
        catch (final IllegalArgumentException ex3) {
            cause = ex3;
        }
        catch (final NoSuchFieldException ex4) {
            cause = ex4;
        }
        catch (final SecurityException ex5) {
            cause = ex5;
        }
        field36113 = (Unsafe)value;
        if (Class8601.field36113 == null) {
            throw new Error("Could not obtain access to sun.misc.Unsafe", cause);
        }
    }
}
