// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutputStream;
import java.io.DataOutput;
import java.io.DataInputStream;
import java.io.DataInput;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class Class8089
{
    public static Class74 method26569(final String pathname) throws IOException {
        return method26570(new File(pathname));
    }
    
    public static Class74 method26570(final File file) throws IOException {
        return method26572(file, true, false);
    }
    
    public static Class74 method26571(final String pathname, final boolean b, final boolean b2) throws IOException {
        return method26572(new File(pathname), b, b2);
    }
    
    public static Class74 method26572(final File file, final boolean b, final boolean b2) throws IOException {
        InputStream in = new FileInputStream(file);
        if (b) {
            in = new GZIPInputStream(in);
        }
        final Class61 method26578 = method26578(in, b2);
        if (method26578 instanceof Class74) {
            return (Class74)method26578;
        }
        throw new IOException("Root tag is not a CompoundTag!");
    }
    
    public static void method26573(final Class74 class74, final String pathname) throws IOException {
        method26574(class74, new File(pathname));
    }
    
    public static void method26574(final Class74 class74, final File file) throws IOException {
        method26576(class74, file, true, false);
    }
    
    public static void method26575(final Class74 class74, final String pathname, final boolean b, final boolean b2) throws IOException {
        method26576(class74, new File(pathname), b, b2);
    }
    
    public static void method26576(final Class74 class74, final File file, final boolean b, final boolean b2) throws IOException {
        if (!file.exists()) {
            if (file.getParentFile() != null) {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
            }
            file.createNewFile();
        }
        OutputStream out = new FileOutputStream(file);
        if (b) {
            out = new GZIPOutputStream(out);
        }
        method26581(out, class74, b2);
        out.close();
    }
    
    public static Class61 method26577(final InputStream inputStream) throws IOException {
        return method26578(inputStream, false);
    }
    
    public static Class61 method26578(final InputStream in, final boolean b) throws IOException {
        return method26579(b ? new Class1749(in) : new DataInputStream(in));
    }
    
    public static Class61 method26579(final DataInput dataInput) throws IOException {
        final int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 0) {
            return null;
        }
        final String utf = dataInput.readUTF();
        Class61 method26705;
        try {
            method26705 = Class8116.method26705(unsignedByte, utf);
        }
        catch (final Class2336 cause) {
            throw new IOException("Failed to create tag.", cause);
        }
        method26705.method372(dataInput);
        return method26705;
    }
    
    public static void method26580(final OutputStream outputStream, final Class61 class61) throws IOException {
        method26581(outputStream, class61, false);
    }
    
    public static void method26581(final OutputStream out, final Class61 class61, final boolean b) throws IOException {
        method26582(b ? new Class1720(out) : new DataOutputStream(out), class61);
    }
    
    public static void method26582(final DataOutput dataOutput, final Class61 class61) throws IOException {
        dataOutput.writeByte(Class8116.method26704(class61.getClass()));
        dataOutput.writeUTF(class61.method375());
        class61.method373(dataOutput);
    }
}
