// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.ObjectArrays;
import java.util.HashMap;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Map;

public class Class6111
{
    public static Map<String, String[]> field24816;
    public static Map<String, String[]> field24817;
    public static Map<Integer, String> field24818;
    
    public static void method18268() {
        final InputStreamReader inputStreamReader = new InputStreamReader(Class9526.class.getClassLoader().getResourceAsStream("assets/viaversion/data/blockIds1.12to1.13.json"));
        try {
            Class6111.field24816 = new HashMap<String, String[]>((Map<?, ?>)Class8557.method28750().fromJson(inputStreamReader, new Class7515().getType()));
            Class6111.field24817 = new HashMap<String, String[]>();
            for (final Map.Entry<K, String[]> entry : Class6111.field24816.entrySet()) {
                for (final String s : entry.getValue()) {
                    String[] array2 = Class6111.field24817.get(s);
                    if (array2 == null) {
                        array2 = new String[0];
                    }
                    Class6111.field24817.put(s, (String[])ObjectArrays.concat(array2, (Object)entry.getKey()));
                }
            }
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
        final InputStreamReader inputStreamReader2 = new InputStreamReader(Class9526.class.getClassLoader().getResourceAsStream("assets/viaversion/data/blockNumberToString1.12.json"));
        try {
            Class6111.field24818 = new HashMap<Integer, String>((Map<?, ?>)Class8557.method28750().fromJson(inputStreamReader2, new Class7513().getType()));
            try {
                inputStreamReader2.close();
            }
            catch (final IOException ex3) {}
        }
        finally {
            try {
                inputStreamReader2.close();
            }
            catch (final IOException ex4) {}
        }
    }
}
