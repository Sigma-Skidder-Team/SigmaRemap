// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.BufferedReader;

public class Class8064
{
    private static String[] field33218;
    public int field33219;
    public int field33220;
    public int field33221;
    public int field33222;
    public int field33223;
    public int field33224;
    public String field33225;
    public final /* synthetic */ Class7548 field33226;
    
    public Class8064(final Class7548 field33226, final BufferedReader bufferedReader) throws IOException {
        this.field33226 = field33226;
        this.field33225 = bufferedReader.readLine().trim();
        this.field33219 = Integer.parseInt(bufferedReader.readLine().trim());
        this.field33220 = Integer.parseInt(bufferedReader.readLine().trim());
        this.field33221 = Integer.parseInt(bufferedReader.readLine().trim());
        this.field33222 = Integer.parseInt(bufferedReader.readLine().trim());
        this.field33223 = Integer.parseInt(bufferedReader.readLine().trim());
        this.field33224 = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.readLine().trim();
        bufferedReader.readLine().trim();
        this.field33223 = Math.max(1, this.field33223);
        this.field33224 = Math.max(1, this.field33224);
    }
}
