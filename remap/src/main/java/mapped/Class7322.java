// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Map;

public class Class7322
{
    public static Map<String, Class9566> field28313;
    
    public static void method22474() {
        final InputStreamReader inputStreamReader = new InputStreamReader(Class9526.class.getClassLoader().getResourceAsStream("assets/viaversion/data/itemrecipes1_12_2to1_13.json"));
        try {
            Class7322.field28313 = Class8557.method28750().fromJson(inputStreamReader, new Class7512().getType());
            try {
                inputStreamReader.close();
            }
            catch (final IOException ex) {}
        }
        finally {
            try {
                inputStreamReader.close();
            }
            catch (final IOException ex2) {}
        }
    }
}
