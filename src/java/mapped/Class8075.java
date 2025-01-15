// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Class8075
{
    public static void main(final String[] array) throws Exception {
        final Class7186 class7186 = new Class7186(null);
    Label_0012_Outer:
        while (true) {
            while (true) {
                try {
                    while (true) {
                        final String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
                        if (line.length() <= 0) {
                            break;
                        }
                        final Class327 method22032 = class7186.method22032(line);
                        if (method22032 instanceof Class328) {
                            System.out.println("" + ((Class328)method22032).method1009());
                        }
                        if (!(method22032 instanceof Class326)) {
                            continue Label_0012_Outer;
                        }
                        System.out.println("" + ((Class326)method22032).method1006());
                    }
                    return;
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                    continue Label_0012_Outer;
                }
                continue;
            }
        }
    }
}
