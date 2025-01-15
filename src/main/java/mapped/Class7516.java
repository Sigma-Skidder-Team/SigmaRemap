// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.SlickException;
import org.w3c.dom.NodeList;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayInputStream;
import org.w3c.dom.Element;
import java.util.Properties;

public class Class7516
{
    private static byte[] field29117;
    private final Class5025 field29118;
    public int field29119;
    public String field29120;
    public int[][][] field29121;
    public int field29122;
    public int field29123;
    public Properties field29124;
    
    public Class7516(final Class5025 field29118, final Element element) throws SlickException {
        this.field29118 = field29118;
        this.field29120 = element.getAttribute("name");
        this.field29122 = Integer.parseInt(element.getAttribute("width"));
        this.field29123 = Integer.parseInt(element.getAttribute("height"));
        this.field29121 = new int[this.field29122][this.field29123][3];
        final Element element2 = (Element)element.getElementsByTagName("properties").item(0);
        if (element2 != null) {
            final NodeList elementsByTagName = element2.getElementsByTagName("property");
            if (elementsByTagName != null) {
                this.field29124 = new Properties();
                for (int i = 0; i < elementsByTagName.getLength(); ++i) {
                    final Element element3 = (Element)elementsByTagName.item(i);
                    this.field29124.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
                }
            }
        }
        final Element element4 = (Element)element.getElementsByTagName("data").item(0);
        final String attribute = element4.getAttribute("encoding");
        final String attribute2 = element4.getAttribute("compression");
        if (attribute.equals("base64") && attribute2.equals("gzip")) {
            try {
                final GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(this.method23446(element4.getFirstChild().getNodeValue().trim().toCharArray())));
                for (int j = 0; j < this.field29123; ++j) {
                    for (int k = 0; k < this.field29122; ++k) {
                        final int n = 0x0 | gzipInputStream.read() | gzipInputStream.read() << 8 | gzipInputStream.read() << 16 | gzipInputStream.read() << 24;
                        if (n == 0) {
                            this.field29121[k][j][0] = -1;
                            this.field29121[k][j][1] = 0;
                            this.field29121[k][j][2] = 0;
                        }
                        else {
                            final Class9029 method15283 = field29118.method15283(n);
                            if (method15283 != null) {
                                this.field29121[k][j][0] = method15283.field38172;
                                this.field29121[k][j][1] = n - method15283.field38174;
                            }
                            this.field29121[k][j][2] = n;
                        }
                    }
                }
                return;
            }
            catch (final IOException ex) {
                Class8452.method28203(ex);
                throw new Class2324("Unable to decode base 64 block");
            }
            throw new Class2324("Unsupport tiled map type: " + attribute + "," + attribute2 + " (only gzip base64 supported)");
        }
        throw new Class2324("Unsupport tiled map type: " + attribute + "," + attribute2 + " (only gzip base64 supported)");
    }
    
    public int method23443(final int n, final int n2) {
        return this.field29121[n][n2][2];
    }
    
    public void method23444(final int n, final int n2, final int n3) {
        if (n3 != 0) {
            final Class9029 method15283 = this.field29118.method15283(n3);
            this.field29121[n][n2][0] = method15283.field38172;
            this.field29121[n][n2][1] = n3 - method15283.field38174;
            this.field29121[n][n2][2] = n3;
        }
        else {
            this.field29121[n][n2][0] = -1;
            this.field29121[n][n2][1] = 0;
            this.field29121[n][n2][2] = 0;
        }
    }
    
    public void method23445(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final int n7, final int n8) {
        for (int i = 0; i < this.field29118.method15280(); ++i) {
            Class9029 method15281 = null;
            for (int j = 0; j < n5; ++j) {
                if (n3 + j >= 0) {
                    if (n4 + n6 >= 0) {
                        if (n3 + j < this.field29122) {
                            if (n4 + n6 < this.field29123) {
                                if (this.field29121[n3 + j][n4 + n6][0] == i) {
                                    if (method15281 == null) {
                                        method15281 = this.field29118.method15281(i);
                                        method15281.field38178.method24851();
                                    }
                                    method15281.field38178.method24863(n + j * n7, n2 + n6 * n8 - (method15281.field38177 - n8), method15281.method32360(this.field29121[n3 + j][n4 + n6][1]), method15281.method32361(this.field29121[n3 + j][n4 + n6][1]));
                                }
                            }
                        }
                    }
                }
            }
            if (b) {
                if (method15281 != null) {
                    method15281.field38178.method24850();
                    method15281 = null;
                }
                this.field29118.method15284(n6, n6 + n4, this.field29119);
            }
            if (method15281 != null) {
                method15281.field38178.method24850();
            }
        }
    }
    
    private byte[] method23446(final char[] array) {
        int length = array.length;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > '\u00ff' || Class7516.field29117[array[i]] < 0) {
                --length;
            }
        }
        int n = length / 4 * 3;
        if (length % 4 == 3) {
            n += 2;
        }
        if (length % 4 == 2) {
            ++n;
        }
        final byte[] array2 = new byte[n];
        int n2 = 0;
        int n3 = 0;
        int j = 0;
        for (int k = 0; k < array.length; ++k) {
            final byte b = (byte)((array[k] <= '\u00ff') ? Class7516.field29117[array[k]] : -1);
            if (b >= 0) {
                final int n4 = n3 << 6;
                n2 += 6;
                n3 = (n4 | b);
                if (n2 >= 8) {
                    n2 -= 8;
                    array2[j++] = (byte)(n3 >> n2 & 0xFF);
                }
            }
        }
        if (j == array2.length) {
            return array2;
        }
        throw new RuntimeException("Data length appears to be wrong (wrote " + j + " should be " + array2.length + ")");
    }
    
    static {
        Class7516.field29117 = new byte[256];
        for (int i = 0; i < 256; ++i) {
            Class7516.field29117[i] = -1;
        }
        for (int j = 65; j <= 90; ++j) {
            Class7516.field29117[j] = (byte)(j - 65);
        }
        for (int k = 97; k <= 122; ++k) {
            Class7516.field29117[k] = (byte)(26 + k - 97);
        }
        for (int l = 48; l <= 57; ++l) {
            Class7516.field29117[l] = (byte)(52 + l - 48);
        }
        Class7516.field29117[43] = 62;
        Class7516.field29117[47] = 63;
    }
}
