// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class7380
{
    public static void method22654(final int i, final Class266 class266, final List<Class7276> c, final Class6108 class267) {
        for (final Class7276 obj : new ArrayList(c)) {
            try {
                obj.method22298(Class1966.method7967(obj.method22295().method7968()));
                final Class6639 class268 = class267.method18207(Class6639.class);
                if (obj.method22295() == Class1966.field10741) {
                    Class8378.method27918((Class7562)obj.method22296());
                }
                else if (obj.method22295() == Class1966.field10748) {
                    obj.method22299(Class5213.method16325((int)obj.method22296()));
                }
                if (class266 == null) {
                    continue;
                }
                if (obj.method22294() > 5) {
                    obj.method22297(obj.method22294() + 1);
                }
                if (obj.method22294() == 8 && class266.method910(Class266.field1307) && Float.isNaN(((Number)obj.method22296()).floatValue()) && Class8563.method28792().method23311()) {
                    obj.method22299(1.0f);
                }
                if (obj.method22294() > 11 && class266.method910(Class266.field1307)) {
                    obj.method22297(obj.method22294() + 1);
                }
                if (class266.method910(Class266.field1310) && obj.method22294() == 13) {
                    class268.method20141(i, (byte)((((Number)obj.method22296()).byteValue() & 0xFFFFFFFB) | (class268.method20140(i) & 0x4)));
                    obj.method22299(class268.method20140(i));
                }
                if (class266.method910(Class266.field1309)) {
                    if (i != class268.method20153()) {
                        if (obj.method22294() == 0) {
                            class268.method20150(i, ((Number)obj.method22296()).byteValue());
                        }
                        else if (obj.method22294() == 7) {
                            class268.method20146(i, (((Number)obj.method22296()).byteValue() & 0x4) != 0x0);
                        }
                        if (obj.method22294() == 0 || obj.method22294() == 7) {
                            c.add(new Class7276(6, Class1966.field10753, method22659(i, class268)));
                        }
                    }
                }
                else if (class266.method910(Class266.field1377)) {
                    if (obj.method22294() == 16) {
                        class268.method20141(i, (byte)((class268.method20140(i) & 0xFFFFFFFB) | (obj.method22296() ? 4 : 0)));
                        c.remove(obj);
                        c.add(new Class7276(13, Class1966.field10735, class268.method20140(i)));
                    }
                    else if (obj.method22294() > 16) {
                        obj.method22297(obj.method22294() - 1);
                    }
                }
                if (class266.method910(Class266.field1412)) {
                    if (obj.method22294() == 10) {
                        obj.method22299(Class5213.method16325((int)obj.method22296()));
                    }
                }
                else if (class266.method909(Class266.field1340)) {
                    if (obj.method22294() == 18) {
                        c.remove(obj);
                        final int intValue = (int)obj.method22296();
                        Class7562 class269 = null;
                        if (intValue == 1) {
                            class269 = new Class7562(Class8378.method27919(727), (byte)1, (short)0, null);
                        }
                        else if (intValue == 2) {
                            class269 = new Class7562(Class8378.method27919(728), (byte)1, (short)0, null);
                        }
                        else if (intValue == 3) {
                            class269 = new Class7562(Class8378.method27919(729), (byte)1, (short)0, null);
                        }
                        final Class8699 class270 = new Class8699(70, null, class267);
                        class270.method29823(Class5260.field22312, i);
                        class270.method29823(Class5260.field22312, 4);
                        class270.method29823(Class5260.field22334, class269);
                        class270.method29833(Class5213.class);
                    }
                }
                else if (class266.method909(Class266.field1314)) {
                    if (obj.method22294() == 15) {
                        obj.method22299(new Class6768(2, method22657((int)obj.method22296()), 0));
                        obj.method22298(Class1966.field10751);
                    }
                }
                else if (class266.method909(Class266.field1381)) {
                    if (obj.method22294() == 18) {
                        obj.method22299(new Class6768(2, method22657((int)obj.method22296()), 0));
                        obj.method22298(Class1966.field10751);
                    }
                }
                else if (class266.method910(Class266.field1397)) {
                    if (obj.method22294() >= 9) {
                        obj.method22297(obj.method22294() + 1);
                    }
                }
                else if (class266.method909(Class266.field1301)) {
                    if (obj.method22294() == 8) {
                        if (obj.method22296().equals(0)) {
                            obj.method22299(null);
                        }
                        obj.method22298(Class1966.field10752);
                    }
                }
                else if (class266.method910(Class266.field1369)) {
                    if (obj.method22294() == 14) {
                        class268.method20141(i, (byte)((class268.method20140(i) & 0xFFFFFFFB) | (obj.method22296() ? 4 : 0)));
                        c.remove(obj);
                        c.add(new Class7276(13, Class1966.field10735, class268.method20140(i)));
                    }
                }
                else if (class266.method909(Class266.field1295) && obj.method22294() == 10) {
                    final Class8087 class271 = (Class8087)obj.method22296();
                    class271.method26551(method22660(class271.method26549()));
                }
                if (class266.method910(Class266.field1363) && obj.method22294() == 14) {
                    class268.method20141(i, (byte)((class268.method20140(i) & 0xFFFFFFFB) | ((((Number)obj.method22296()).byteValue() != 0) ? 4 : 0)));
                    c.remove(obj);
                    c.add(new Class7276(13, Class1966.field10735, class268.method20140(i)));
                }
                if ((!class266.method909(Class266.field1360) && !class266.method909(Class266.field1362) && !class266.method910(Class266.field1363)) || obj.method22294() < 14) {
                    continue;
                }
                obj.method22297(obj.method22294() + 1);
            }
            catch (final Exception ex) {
                c.remove(obj);
                if (Class8563.method28792().method23266() && !Class8563.method28794().method33559()) {
                    continue;
                }
                Class8563.method28793().method34742().warning("An error occurred with entity metadata handler");
                Class8563.method28793().method34742().warning("Metadata: " + obj);
                ex.printStackTrace();
            }
        }
    }
    
    private static boolean method22655(final byte b) {
        return false;
    }
    
    private static boolean method22656(final byte b) {
        return false;
    }
    
    private static int method22657(final int n) {
        switch (n) {
            case 0: {
                return 5;
            }
            case 1: {
                return 9;
            }
            case 2: {
                return 4;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 5: {
                return 11;
            }
            default: {
                return 0;
            }
        }
    }
    
    private static boolean method22658(final int n) {
        return false;
    }
    
    public static int method22659(final int n, final Class6639 class6639) {
        final byte method20149 = class6639.method20149(n);
        int n2 = 0;
        if (method22658(method20149)) {
            n2 = 1;
        }
        else if (class6639.method20143(n)) {
            n2 = 2;
        }
        else if (method22656(method20149)) {
            n2 = 3;
        }
        else if (class6639.method20145(n)) {
            n2 = 4;
        }
        else if (method22655(method20149)) {
            n2 = 5;
        }
        return n2;
    }
    
    public static int method22660(int n) {
        if (n >= 10) {
            n += 2;
        }
        if (n >= 13) {
            ++n;
        }
        if (n >= 27) {
            ++n;
        }
        if (n >= 29) {
            ++n;
        }
        if (n >= 44) {
            ++n;
        }
        return n;
    }
}
