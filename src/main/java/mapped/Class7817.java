// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;

public class Class7817
{
    private static byte[] field32025;
    
    public static int method25257() {
        return Class7817.field32025.length;
    }
    
    public static byte[] method25258() {
        return Class7817.field32025;
    }
    
    public static void method25259() throws IOException {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (final DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(out))) {
            dataOutputStream.writeByte(10);
            dataOutputStream.writeUTF("");
            for (int i = 0; i < 300; ++i) {
                method25260(dataOutputStream, 0);
            }
            dataOutputStream.writeByte(0);
        }
        Class7817.field32025 = out.toByteArray();
    }
    
    private static void method25260(final DataOutputStream dataOutputStream, final int n) throws IOException {
        if (n <= 4) {
            dataOutputStream.writeByte(9);
            dataOutputStream.writeUTF("");
            dataOutputStream.writeByte(9);
            dataOutputStream.writeInt(10);
            for (int i = 1; i < 10; ++i) {
                method25260(dataOutputStream, n + 1);
            }
        }
    }
}
