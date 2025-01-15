// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Logger;
import java.util.Iterator;
import java.util.UUID;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class9392
{
    public static void method34924(final Class1974 obj, final List<Class7276> c) {
        int shortValue = -1;
        int byteValue = -1;
        for (final Class7276 class7276 : new ArrayList(c)) {
            final Class324 method999 = Class324.method999(obj, class7276.method22294());
            try {
                if (method999 != null) {
                    if (method999.method1002() != Class1968.field10771) {
                        if (method999.method1002() != Class1968.field10770 || (shortValue != -1 && byteValue == -1) || (shortValue == -1 && byteValue != -1)) {
                            class7276.method22297(method999.method1001());
                            class7276.method22298(method999.method1002());
                        }
                        final Object method1000 = class7276.method22296();
                        switch (Class6666.field26337[method999.method1002().ordinal()]) {
                            case 1: {
                                if (method999.method1003() == Class1972.field10833) {
                                    class7276.method22299(method1000);
                                }
                                if (method999.method1003() == Class1972.field10835) {
                                    class7276.method22299(((Integer)method1000).byteValue());
                                }
                                if (method999 == Class324.field1932 && obj == Class1974.field10937) {
                                    Byte b = 0;
                                    if (((byte)method1000 & 0x10) == 0x10) {
                                        b = 1;
                                    }
                                    c.add(new Class7276(Class324.field1954.method1001(), Class324.field1954.method1002(), b));
                                    continue;
                                }
                                continue;
                            }
                            case 2: {
                                final String name = (String)method1000;
                                Object fromString = null;
                                if (name.length() != 0) {
                                    try {
                                        fromString = UUID.fromString(name);
                                    }
                                    catch (final Exception ex) {}
                                }
                                class7276.method22299(fromString);
                                continue;
                            }
                            case 3: {
                                if (method999.method1003() == Class1972.field10833) {
                                    byteValue = (byte)method1000;
                                }
                                if (method999.method1003() == Class1972.field10834) {
                                    shortValue = (short)method1000;
                                }
                                if (shortValue != -1 && byteValue != -1) {
                                    final int i = shortValue | (byteValue & 0xF);
                                    byteValue = -1;
                                    shortValue = -1;
                                    class7276.method22299(i);
                                    continue;
                                }
                                c.remove(class7276);
                                continue;
                            }
                            case 4: {
                                if (method999.method1003() == Class1972.field10833) {
                                    class7276.method22299((int)method1000);
                                }
                                if (method999.method1003() == Class1972.field10834) {
                                    class7276.method22299((int)method1000);
                                }
                                if (method999.method1003() == Class1972.field10835) {
                                    class7276.method22299(method1000);
                                    continue;
                                }
                                continue;
                            }
                            case 5: {
                                class7276.method22299(method1000);
                                continue;
                            }
                            case 6: {
                                class7276.method22299(method1000);
                                continue;
                            }
                            case 7: {
                                if (method999 == Class324.field1942) {
                                    class7276.method22299((byte)method1000 < 0);
                                    continue;
                                }
                                class7276.method22299((byte)method1000 != 0);
                                continue;
                            }
                            case 8: {
                                class7276.method22299(method1000);
                                Class8458.method28227((Class7562)class7276.method22296());
                                continue;
                            }
                            case 9: {
                                class7276.method22299(method1000);
                                continue;
                            }
                            case 10: {
                                class7276.method22299(method1000);
                                continue;
                            }
                            case 11: {
                                class7276.method22299(Class5224.method16340((String)method1000));
                                continue;
                            }
                            default: {
                                Class8563.method28793().method34742().warning("[Out] Unhandled MetaDataType: " + method999.method1002());
                                c.remove(class7276);
                                continue;
                            }
                        }
                    }
                    else {
                        c.remove(class7276);
                    }
                }
                else {
                    c.remove(class7276);
                }
            }
            catch (final Exception ex2) {
                c.remove(class7276);
                if (Class8563.method28792().method23266() && !Class8563.method28794().method33559()) {
                    continue;
                }
                final Logger method1001 = Class8563.method28793().method34742();
                method1001.warning("This is most likely down to one of your plugins sending bad datawatchers. Please test if this occurs without any plugins except ViaVersion before reporting it on GitHub");
                method1001.warning("Also make sure that all your plugins are compatible with your server version.");
                if (obj != null) {
                    method1001.severe("An error occurred with entity meta data for " + obj + " OldID: " + class7276.method22294());
                }
                else {
                    method1001.severe("An error occurred with entity meta data for UNKNOWN_ENTITY OldID: " + class7276.method22294());
                }
                if (method999 != null) {
                    method1001.severe("Value: " + class7276.method22296());
                    method1001.severe("Old ID: " + method999.method1004() + " New ID: " + method999.method1001());
                    method1001.severe("Old Type: " + method999.method1003() + " New Type: " + method999.method1002());
                }
                ex2.printStackTrace();
            }
        }
    }
}
