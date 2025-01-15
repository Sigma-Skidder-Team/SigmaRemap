// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Class7838
{
    private File field32086;
    public Class1941 field32087;
    private short field32088;
    private short field32089;
    private short field32090;
    private String field32091;
    private List<Class8951> field32092;
    
    public Class7838(final File field32086) {
        this.field32087 = null;
        this.field32092 = new ArrayList<Class8951>();
        this.field32086 = field32086;
    }
    
    public boolean method25316() {
        Class51 method26590;
        try {
            method26590 = Class8097.method26590(new FileInputStream(this.field32086));
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            return false;
        }
        this.field32088 = method26590.method318("Width");
        this.field32089 = method26590.method318("Height");
        this.field32090 = method26590.method318("Length");
        try {
            this.field32087 = new Class1941(method26590.method319("WEOriginX"), method26590.method319("WEOriginY"), method26590.method319("WEOriginZ")).method7851(new Class1941(method26590.method319("WEOffsetX"), method26590.method319("WEOffsetY"), method26590.method319("WEOffsetZ")));
        }
        catch (final Exception ex2) {
            this.field32087 = new Class1941(0, 0, 0);
            System.out.println("Whoops, not alpha schematic?");
        }
        this.field32091 = method26590.method323("Materials");
        final byte[] method26591 = method26590.method324("Blocks");
        final byte[] method26592 = method26590.method324("Data");
        byte[] method26593 = new byte[0];
        final short[] array = new short[method26591.length];
        if (method26590.method315("AddBlocks")) {
            method26593 = method26590.method324("AddBlocks");
        }
        for (int i = 0; i < method26591.length; ++i) {
            if (i >> 1 >= method26593.length) {
                array[i] = (short)(method26591[i] & 0xFF);
            }
            else if ((i & 0x1) == 0x0) {
                array[i] = (short)(((method26593[i >> 1] & 0xF) << 8) + (method26591[i] & 0xFF));
            }
            else {
                array[i] = (short)(((method26593[i >> 1] & 0xF0) << 4) + (method26591[i] & 0xFF));
            }
        }
        for (short n = 0; n < this.field32089; ++n) {
            for (short n2 = 0; n2 < this.field32088; ++n2) {
                for (short n3 = 0; n3 < this.field32090; ++n3) {
                    final int n4 = n * this.field32088 * this.field32090 + n3 * this.field32088 + n2;
                    final Class1942 class1942 = new Class1942(n2, n, n3);
                    final short n5 = array[n4];
                    final byte b = method26592[n4];
                    if (n5 != 0) {
                        this.field32092.add(new Class8951(n5, b, class1942));
                    }
                }
            }
        }
        return true;
    }
    
    public File method25317() {
        return this.field32086;
    }
    
    public short method25318() {
        return this.field32088;
    }
    
    public short method25319() {
        return this.field32089;
    }
    
    public short method25320() {
        return this.field32090;
    }
    
    public String method25321() {
        return this.field32091;
    }
    
    public Class1941 method25322() {
        return this.field32087;
    }
    
    public List<Class8951> method25323() {
        return this.field32092;
    }
}
