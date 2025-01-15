// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class8936
{
    public static String method31696(final String s, final boolean b) {
        return (!b && !Class869.method5277().field4648.field23416) ? TextFormatting.getTextWithoutFormattingCodes(s) : s;
    }
    
    public static List<ITextComponent> method31697(final ITextComponent class2250, final int n, final Class1844 class2251, final boolean b, final boolean b2) {
        int n2 = 0;
        StringTextComponent class2252 = new StringTextComponent("");
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList((Iterable)class2250);
        for (int i = 0; i < arrayList2.size(); ++i) {
            final ITextComponent class2253 = (ITextComponent)arrayList2.get(i);
            String str = class2253.getUnformattedComponentText();
            boolean b3 = false;
            if (str.contains("\n")) {
                final int index = str.indexOf(10);
                final String substring = str.substring(index + 1);
                str = str.substring(0, index + 1);
                arrayList2.add(i + 1, new StringTextComponent(substring).setStyle(class2253.getStyle().createShallowCopy()));
                b3 = true;
            }
            final String method31696 = method31696(class2253.getStyle().getFormattingCode() + str, b2);
            final String s = method31696.endsWith("\n") ? method31696.substring(0, method31696.length() - 1) : method31696;
            int n3 = class2251.method6617(s);
            ITextComponent method31697 = new StringTextComponent(s).setStyle(class2253.getStyle().createShallowCopy());
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
                        arrayList2.add(i + 1, new StringTextComponent(substring2).setStyle(class2253.getStyle().createShallowCopy()));
                    }
                }
                n3 = class2251.method6617(s2);
                method31697 = new StringTextComponent(s2);
                method31697.setStyle(class2253.getStyle().createShallowCopy());
                b3 = true;
            }
            if (n2 + n3 > n) {
                b3 = true;
            }
            else {
                n2 += n3;
                class2252.appendSibling(method31697);
            }
            if (b3) {
                arrayList.add(class2252);
                n2 = 0;
                class2252 = new StringTextComponent("");
            }
        }
        arrayList.add(class2252);
        return arrayList;
    }
}
