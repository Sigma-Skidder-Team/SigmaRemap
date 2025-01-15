// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Class8735
{
    public static final Pattern field36703;
    public static final Pattern field36704;
    public static final Pattern field36705;
    public static final Pattern field36706;
    public static final Pattern field36707;
    public static final Pattern field36708;
    public static final Pattern field36709;
    public static final Pattern field36710;
    public static final Pattern field36711;
    public Map<Character, List<Class8616>> field36712;
    
    public void method30181() {
        this.method30182(Class8542.field35873, Class8735.field36703, "yYnNtTfFoO");
        this.method30182(Class8542.field35870, Class8735.field36705, "-+0123456789");
        this.method30182(Class8542.field35871, Class8735.field36704, "-+0123456789.");
        this.method30182(Class8542.field35865, Class8735.field36706, "<");
        this.method30182(Class8542.field35874, Class8735.field36707, "~nN\u0000");
        this.method30182(Class8542.field35874, Class8735.field36708, null);
        this.method30182(Class8542.field35872, Class8735.field36709, "0123456789");
        this.method30182(Class8542.field35864, Class8735.field36711, "!&*");
    }
    
    public Class8735() {
        this.field36712 = new HashMap<Character, List<Class8616>>();
        this.method30181();
    }
    
    public void method30182(final Class8542 class8542, final Pattern pattern, final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; ++i) {
                Character value = charArray[i];
                if (value == '\0') {
                    value = null;
                }
                List list = this.field36712.get(value);
                if (list == null) {
                    list = new ArrayList();
                    this.field36712.put(value, list);
                }
                list.add(new Class8616(class8542, pattern));
            }
        }
        else {
            List list2 = this.field36712.get(null);
            if (list2 == null) {
                list2 = new ArrayList();
                this.field36712.put(null, list2);
            }
            list2.add(new Class8616(class8542, pattern));
        }
    }
    
    public Class8542 method30183(final Class2085 class2085, final String s, final boolean b) {
        if (class2085 == Class2085.field12055 && b) {
            List list;
            if (s.length() == 0) {
                list = this.field36712.get('\0');
            }
            else {
                list = this.field36712.get(s.charAt(0));
            }
            if (list != null) {
                for (final Class8616 class2086 : list) {
                    final Class8542 method29221 = class2086.method29221();
                    if (class2086.method29222().matcher(s).matches()) {
                        return method29221;
                    }
                }
            }
            if (this.field36712.containsKey(null)) {
                for (final Class8616 class2087 : this.field36712.get(null)) {
                    final Class8542 method29222 = class2087.method29221();
                    if (class2087.method29222().matcher(s).matches()) {
                        return method29222;
                    }
                }
            }
        }
        switch (Class7016.field27354[class2085.ordinal()]) {
            case 1: {
                return Class8542.field35875;
            }
            case 2: {
                return Class8542.field35876;
            }
            default: {
                return Class8542.field35877;
            }
        }
    }
    
    static {
        field36703 = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
        field36704 = Pattern.compile("^([-+]?(\\.[0-9]+|[0-9_]+(\\.[0-9_]*)?)([eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$");
        field36705 = Pattern.compile("^(?:[-+]?0b[0-1_]+|[-+]?0[0-7_]+|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x[0-9a-fA-F_]+|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$");
        field36706 = Pattern.compile("^(?:<<)$");
        field36707 = Pattern.compile("^(?:~|null|Null|NULL| )$");
        field36708 = Pattern.compile("^$");
        field36709 = Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$");
        field36710 = Pattern.compile("^(?:=)$");
        field36711 = Pattern.compile("^(?:!|&|\\*)$");
    }
}
