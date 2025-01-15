// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;

public class Class7692
{
    public static List<String> method24462(final String s) {
        return Arrays.asList(s.split("\\n"));
    }
    
    public static List<Class8578> method24463(final String s, final Class6387... a) {
        return method24464(s, Arrays.asList(a));
    }
    
    private static List<Class8578> method24464(final String s, final List<Class6387> list) {
        return method24465(method24462(s), list);
    }
    
    private static List<Class8578> method24465(final List<String> list, final List<Class6387> list2) {
        int n = 0;
        final ArrayList arrayList = Lists.newArrayList();
        for (final String s : list) {
            final ArrayList arrayList2 = Lists.newArrayList();
            for (final String s2 : method24466(s, "%link")) {
                if (!s2.equals("%link")) {
                    arrayList2.add(Class6387.method19068(s2));
                }
                else {
                    arrayList2.add(list2.get(n++));
                }
            }
            arrayList.add(new Class8578(arrayList2));
        }
        return arrayList;
    }
    
    public static List<String> method24466(final String s, final String str) {
        if (!str.isEmpty()) {
            final ArrayList arrayList = Lists.newArrayList();
            int beginIndex;
            int index;
            for (beginIndex = 0; (index = s.indexOf(str, beginIndex)) != -1; beginIndex = index + str.length()) {
                if (index > beginIndex) {
                    arrayList.add(s.substring(beginIndex, index));
                }
                arrayList.add(str);
            }
            if (beginIndex < s.length()) {
                arrayList.add(s.substring(beginIndex));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Delimiter cannot be the empty string");
    }
}
