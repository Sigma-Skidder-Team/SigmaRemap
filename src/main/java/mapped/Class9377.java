// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.io.IOException;
import java.io.EOFException;
import java.util.Collection;
import java.util.Arrays;
import java.io.DataInputStream;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;

public class Class9377
{
    public static Class2308 method34814(final File file) {
        try {
            return method34816(new FileInputStream(file), file);
        }
        catch (final FileNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static Class2308 method34815(final InputStream inputStream) {
        return method34816(inputStream, null);
    }
    
    private static Class2308 method34816(final InputStream in, final File file) {
        final HashMap hashMap = new HashMap();
        try {
            final DataInputStream dataInputStream = new DataInputStream(in);
            short n = method34818(dataInputStream);
            int byte1 = 10;
            int byte2 = 0;
            if (n == 0) {
                byte2 = dataInputStream.readByte();
                byte1 = dataInputStream.readByte();
                if (byte2 >= 3) {
                    n = method34818(dataInputStream);
                }
            }
            final int n2 = Class6524.method19742() - byte1;
            final short method34818 = method34818(dataInputStream);
            final String method34819 = method34820(dataInputStream);
            final String method34820 = method34820(dataInputStream);
            method34820(dataInputStream);
            final String method34821 = method34820(dataInputStream);
            final float n3 = method34818(dataInputStream) / 100.0f;
            dataInputStream.readBoolean();
            dataInputStream.readByte();
            dataInputStream.readByte();
            method34819(dataInputStream);
            method34819(dataInputStream);
            method34819(dataInputStream);
            method34819(dataInputStream);
            method34819(dataInputStream);
            method34820(dataInputStream);
            short n4 = -1;
            while (true) {
                final short method34822 = method34818(dataInputStream);
                if (method34822 == 0) {
                    break;
                }
                n4 += method34822;
                short n5 = -1;
                while (true) {
                    final short method34823 = method34818(dataInputStream);
                    if (method34823 == 0) {
                        break;
                    }
                    n5 += method34823;
                    byte byte3 = dataInputStream.readByte();
                    if (n2 > 0 && byte3 >= byte1) {
                        byte3 += (byte)n2;
                    }
                    method34817(n5, n4, byte3, dataInputStream.readByte(), hashMap);
                }
            }
            if (byte2 > 0 && byte2 < 3) {
                n = n4;
            }
            for (short i = 0; i < method34818; ++i) {
                final Class9501 class9501 = hashMap.get((int)i);
                final String method34824 = method34820(dataInputStream);
                final byte byte4 = dataInputStream.readByte();
                if (byte2 >= 2) {
                    dataInputStream.readByte();
                }
                if (class9501 != null) {
                    class9501.method35384(method34824);
                    class9501.method35388(byte4);
                }
            }
            final byte byte5 = dataInputStream.readByte();
            Class7117[] array = new Class7117[byte5];
            for (byte b = 0; b < byte5; ++b) {
                array[b] = new Class7117(b, method34820(dataInputStream), method34820(dataInputStream));
                dataInputStream.readByte();
                dataInputStream.readByte();
            }
            if (n2 < 0) {
                final ArrayList<Class7117> method34825 = Class8167.method27004(byte1);
                method34825.addAll(Arrays.asList(array));
                array = method34825.toArray(array);
            }
            else {
                byte1 += n2;
            }
            return new Class2308(n3, hashMap, method34818, n, method34819, method34820, method34821, file, byte1, array);
        }
        catch (final FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (final EOFException ex2) {
            if (file != null) {
                file.getName();
            }
        }
        catch (final IOException ex3) {
            ex3.printStackTrace();
        }
        return null;
    }
    
    private static void method34817(final int n, final int n2, final byte b, final byte b2, final HashMap<Integer, Class9501> hashMap) {
        Class9501 value = hashMap.get(n);
        if (value == null) {
            value = new Class9501();
            hashMap.put(n, value);
        }
        value.method35386(n2, new Class9110(b, b2));
    }
    
    private static short method34818(final DataInputStream dataInputStream) throws IOException {
        return (short)(dataInputStream.readUnsignedByte() + (dataInputStream.readUnsignedByte() << 8));
    }
    
    private static int method34819(final DataInputStream dataInputStream) throws IOException {
        return dataInputStream.readUnsignedByte() + (dataInputStream.readUnsignedByte() << 8) + (dataInputStream.readUnsignedByte() << 16) + (dataInputStream.readUnsignedByte() << 24);
    }
    
    private static String method34820(final DataInputStream dataInputStream) throws IOException {
        int i = method34819(dataInputStream);
        final StringBuilder sb = new StringBuilder(i);
        while (i > 0) {
            char c = (char)dataInputStream.readByte();
            if (c == '\r') {
                c = ' ';
            }
            sb.append(c);
            --i;
        }
        return sb.toString();
    }
}
