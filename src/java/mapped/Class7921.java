// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.io.IOException;
import java.util.ArrayList;
import java.io.DataInputStream;
import java.util.List;

public class Class7921
{
    private static String[] field32529;
    private static final int field32530 = 4801587;
    private static final int field32531 = 4;
    private final List<Class9447> field32532;
    private final int field32533;
    private final int field32534;
    private final int field32535;
    
    public Class7921(final DataInputStream dataInputStream) throws IOException {
        this.field32532 = new ArrayList<Class9447>();
        this.field32533 = (dataInputStream.read() << 16 | dataInputStream.read() << 8 | dataInputStream.read());
        final int read = dataInputStream.read();
        dataInputStream.read();
        this.field32534 = dataInputStream.read();
        this.field32535 = method25665(dataInputStream);
        if (this.field32533 == 4801587) {
            if (read <= 4) {
                if ((this.field32534 & 0x40) == 0x40) {
                    dataInputStream.skipBytes(method25665(dataInputStream) - 6);
                }
                Class9447 class9447;
                for (int i = this.field32535; i > 0; i -= (int)class9447.method35086()) {
                    class9447 = new Class9447(dataInputStream);
                    this.field32532.add(class9447);
                }
            }
        }
    }
    
    public List<Class9447> method25664() {
        return Collections.unmodifiableList((List<? extends Class9447>)this.field32532);
    }
    
    public static int method25665(final DataInputStream dataInputStream) throws IOException {
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            n |= (dataInputStream.read() & 0x7F);
        }
        return n;
    }
}
