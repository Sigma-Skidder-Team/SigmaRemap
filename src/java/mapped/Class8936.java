// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;

public class Class8936
{
    public static String method31696(final String s, final boolean b) {
        return (!b && !Class869.method5277().field4648.field23416) ? Class2116.method8259(s) : s;
    }
    
    public static List<Class2250> method31697(final Class2250 class2250, final int n, final Class1844 class2251, final boolean b, final boolean b2) {
        int n2 = 0;
        Class2260 class2252 = new Class2260("");
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList((Iterable)class2250);
        for (int i = 0; i < arrayList2.size(); ++i) {
            final Class2250 class2253 = (Class2250)arrayList2.get(i);
            String str = class2253.method8459();
            boolean b3 = false;
            if (str.contains("\n")) {
                final int index = str.indexOf(10);
                final String substring = str.substring(index + 1);
                str = str.substring(0, index + 1);
                arrayList2.add(i + 1, new Class2260(substring).method8455(class2253.method8456().method30425()));
                b3 = true;
            }
            final String method31696 = method31696(class2253.method8456().method30423() + str, b2);
            final String s = method31696.endsWith("\n") ? method31696.substring(0, method31696.length() - 1) : method31696;
            int n3 = class2251.method6617(s);
            Class2250 method31697 = new Class2260(s).method8455(class2253.method8456().method30425());
            if (n2 + n3 > n) {
                String s2 = class2251.method6620(method31696, n - n2, false);
                String substring2 = (s2.length() >= method31696.length()) ? null : method31696.substring(s2.length());
                if (substring2 != null) {
                    if (!substring2.isEmpty()) {
                        int beginIndex = (substring2.charAt(0) == ' ') ? s2.length() : s2.lastIndexOf(32);
                        if (beginIndex >= 0 && class2251.method6617(method31696.substring(0, beginIndex)) > 0) {
                            s2 = method31696.substring(0, beginIndex);
                            if (b) {
                                ++beginIndex;
                            }
                            substring2 = method31696.substring(beginIndex);
                        }
                        else if (n2 > 0) {
                            if (!method31696.contains(" ")) {
                                s2 = "";
                                substring2 = method31696;
                            }
                        }
                        arrayList2.add(i + 1, new Class2260(substring2).method8455(class2253.method8456().method30425()));
                    }
                }
                n3 = class2251.method6617(s2);
                method31697 = new Class2260(s2);
                method31697.method8455(class2253.method8456().method30425());
                b3 = true;
            }
            if (n2 + n3 > n) {
                b3 = true;
            }
            else {
                n2 += n3;
                class2252.method8458(method31697);
            }
            if (b3) {
                arrayList.add(class2252);
                n2 = 0;
                class2252 = new Class2260("");
            }
        }
        arrayList.add(class2252);
        return arrayList;
    }
}
