// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.Locale;
import com.google.common.primitives.Ints;

public class Class8748
{
    private static String field36732;
    
    public static void method30242(final Class5207 class5207) {
        Class8748.field36732 = "ViaVersion|" + class5207.getClass().getSimpleName();
        class5207.method16316(Class2044.field11648, 22, 23, new Class3038());
        class5207.method16316(Class2044.field11648, 20, 21, new Class2850());
        class5207.method16316(Class2044.field11648, 21, 22, new Class3009());
        class5207.method16316(Class2044.field11648, 24, 25, new Class3078());
        class5207.method16316(Class2044.field11648, 63, 66, new Class3046());
        class5207.method16313(Class2044.field11648, 7, 8, new Class2947());
        class5207.method16313(Class2044.field11648, 9, 10, new Class2927());
        class5207.method16313(Class2044.field11648, 27, 36, new Class2867());
    }
    
    public static void method30243(final Class7562 class7562) {
        if (class7562 != null) {
            Class74 method23743 = class7562.method23743();
            final int n = class7562.method23740() << 16 | (class7562.method23742() & 0xFFFF);
            int method23744 = class7562.method23740() << 4 | (class7562.method23742() & 0xF);
            if (method30247(class7562.method23740())) {
                if (method23743 == null) {
                    class7562.method23747(method23743 = new Class74("tag"));
                }
                method23743.method420(new Class68("Damage", class7562.method23742()));
            }
            if (class7562.method23740() == 358) {
                if (method23743 == null) {
                    class7562.method23747(method23743 = new Class74("tag"));
                }
                method23743.method420(new Class68("map", class7562.method23742()));
            }
            if (method23743 != null) {
                if (class7562.method23740() == 442 || class7562.method23740() == 425) {
                    if (method23743.method419("BlockEntityTag") instanceof Class74) {
                        final Class74 class7563 = method23743.method419("BlockEntityTag");
                        if (class7563.method419("Base") instanceof Class68) {
                            final Class68 class7564 = class7563.method419("Base");
                            class7564.method401(15 - class7564.method400());
                        }
                        if (class7563.method419("Patterns") instanceof Class60) {
                            for (final Class61 class7565 : class7563.method419("Patterns")) {
                                if (!(class7565 instanceof Class74)) {
                                    continue;
                                }
                                final Class68 class7566 = ((Class74)class7565).method419("Color");
                                class7566.method401(15 - class7566.method400());
                            }
                        }
                    }
                }
                if (method23743.method419("display") instanceof Class74) {
                    final Class74 class7567 = method23743.method419("display");
                    if (class7567.method419("Name") instanceof Class71) {
                        final Class71 class7568 = class7567.method419("Name");
                        class7567.method420(new Class71(Class8748.field36732 + "|Name", class7568.method406()));
                        class7568.method407(Class8672.method29685(class7568.method406()));
                    }
                }
                if (method23743.method419("ench") instanceof Class60) {
                    final Class60 class7569 = method23743.method419("ench");
                    final Class60 class7570 = new Class60("Enchantments", Class74.class);
                    for (final Class61 class7571 : class7569) {
                        if (!(class7571 instanceof Class74)) {
                            continue;
                        }
                        final Class74 class7572 = new Class74("");
                        final short shortValue = ((Number)((Class74)class7571).method419("id").method374()).shortValue();
                        String string = (String)Class9526.field41009.get((Object)shortValue);
                        if (string == null) {
                            string = "viaversion:legacy/" + shortValue;
                        }
                        class7572.method420(new Class71("id", string));
                        class7572.method420(new Class70("lvl", ((Number)((Class74)class7571).method419("lvl").method374()).shortValue()));
                        class7570.method368(class7572);
                    }
                    method23743.method421("ench");
                    method23743.method420(class7570);
                }
                if (method23743.method419("StoredEnchantments") instanceof Class60) {
                    final Class60 class7573 = method23743.method419("StoredEnchantments");
                    final Class60 class7574 = new Class60("StoredEnchantments", Class74.class);
                    for (final Class61 class7575 : class7573) {
                        if (!(class7575 instanceof Class74)) {
                            continue;
                        }
                        final Class74 class7576 = new Class74("");
                        final short shortValue2 = ((Number)((Class74)class7575).method419("id").method374()).shortValue();
                        String string2 = (String)Class9526.field41009.get((Object)shortValue2);
                        if (string2 == null) {
                            string2 = "viaversion:legacy/" + shortValue2;
                        }
                        class7576.method420(new Class71("id", string2));
                        class7576.method420(new Class70("lvl", ((Number)((Class74)class7575).method419("lvl").method374()).shortValue()));
                        class7574.method368(class7576);
                    }
                    method23743.method421("StoredEnchantments");
                    method23743.method420(class7574);
                }
                if (method23743.method419("CanPlaceOn") instanceof Class60) {
                    final Class60 class7577 = method23743.method419("CanPlaceOn");
                    final Class60 class7578 = new Class60("CanPlaceOn", Class71.class);
                    method23743.method420(Class7185.method22027(Class8748.field36732 + "|CanPlaceOn", Class7185.method22026(class7577)));
                    final Iterator<Class61> iterator4 = class7577.iterator();
                    while (iterator4.hasNext()) {
                        String replace = iterator4.next().method374().toString().replace("minecraft:", "");
                        final String s = Class6111.field24818.get(Ints.tryParse(replace));
                        if (s != null) {
                            replace = s;
                        }
                        final String[] array = Class6111.field24816.get(replace.toLowerCase(Locale.ROOT));
                        if (array == null) {
                            class7578.method368(new Class71("", replace.toLowerCase(Locale.ROOT)));
                        }
                        else {
                            final String[] array2 = array;
                            for (int length = array2.length, i = 0; i < length; ++i) {
                                class7578.method368(new Class71("", array2[i]));
                            }
                        }
                    }
                    method23743.method420(class7578);
                }
                if (method23743.method419("CanDestroy") instanceof Class60) {
                    final Class60 class7579 = method23743.method419("CanDestroy");
                    final Class60 class7580 = new Class60("CanDestroy", Class71.class);
                    method23743.method420(Class7185.method22027(Class8748.field36732 + "|CanDestroy", Class7185.method22026(class7579)));
                    final Iterator<Class61> iterator5 = class7579.iterator();
                    while (iterator5.hasNext()) {
                        String replace2 = iterator5.next().method374().toString().replace("minecraft:", "");
                        final String s2 = Class6111.field24818.get(Ints.tryParse(replace2));
                        if (s2 != null) {
                            replace2 = s2;
                        }
                        final String[] array3 = Class6111.field24816.get(replace2.toLowerCase(Locale.ROOT));
                        if (array3 == null) {
                            class7580.method368(new Class71("", replace2.toLowerCase(Locale.ROOT)));
                        }
                        else {
                            final String[] array4 = array3;
                            for (int length2 = array4.length, j = 0; j < length2; ++j) {
                                class7580.method368(new Class71("", array4[j]));
                            }
                        }
                    }
                    method23743.method420(class7580);
                }
                if (class7562.method23740() == 383) {
                    if (!(method23743.method419("EntityTag") instanceof Class74)) {
                        method23744 = 25100288;
                    }
                    else {
                        final Class74 class7581 = method23743.method419("EntityTag");
                        if (!(class7581.method419("id") instanceof Class71)) {
                            method23744 = 25100288;
                        }
                        else {
                            method23744 = Class9126.method33112(((Class71)class7581.method419("id")).method406());
                            if (method23744 != -1) {
                                class7581.method421("id");
                                if (class7581.method417()) {
                                    method23743.method421("EntityTag");
                                }
                            }
                            else {
                                method23744 = 25100288;
                            }
                        }
                    }
                }
                if (method23743.method417()) {
                    class7562.method23747(method23743 = null);
                }
            }
            if (!Class9526.field41005.containsKey((Object)method23744)) {
                if (!method30247(class7562.method23740())) {
                    if (class7562.method23740() != 358) {
                        if (method23743 == null) {
                            class7562.method23747(method23743 = new Class74("tag"));
                        }
                        method23743.method420(new Class68(Class8748.field36732, n));
                    }
                }
                if (class7562.method23740() == 31 && class7562.method23742() == 0) {
                    method23744 = 512;
                }
                else if (!Class9526.field41005.containsKey((Object)(method23744 & 0xFFFFFFF0))) {
                    if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                        Class8563.method28793().method34742().warning("Failed to get 1.13 item for " + class7562.method23740());
                    }
                    method23744 = 16;
                }
                else {
                    method23744 &= 0xFFFFFFF0;
                }
            }
            class7562.method23744(((Integer)Class9526.field41005.get((Object)method23744)).shortValue());
            class7562.method23746((short)0);
        }
    }
    
    public static String method30244(final String s) {
        switch (s) {
            case "MC|TrList": {
                return "minecraft:trader_list";
            }
            case "MC|Brand": {
                return "minecraft:brand";
            }
            case "MC|BOpen": {
                return "minecraft:book_open";
            }
            case "MC|DebugPath": {
                return "minecraft:debug/paths";
            }
            case "MC|DebugNeighborsUpdate": {
                return "minecraft:debug/neighbors_update";
            }
            case "REGISTER": {
                return "minecraft:register";
            }
            case "UNREGISTER": {
                return "minecraft:unregister";
            }
            case "BungeeCord": {
                return "bungeecord:main";
            }
            case "WDL|INIT": {
                return "wdl:init";
            }
            case "WDL|CONTROL": {
                return "wdl:control";
            }
            case "WDL|REQUEST": {
                return "wdl:request";
            }
            case "bungeecord:main": {
                return null;
            }
            case "FML|MP": {
                return "fml:mp";
            }
            case "FML|HS": {
                return "fml:hs";
            }
            default: {
                return s.matches("([0-9a-z_.-]+):([0-9a-z_/.-]+)") ? s : null;
            }
        }
    }
    
    public static void method30245(final Class7562 class7562) {
        if (class7562 != null) {
            Integer n = null;
            boolean b = false;
            Class74 method23743 = class7562.method23743();
            if (method23743 != null) {
                if (method23743.method419(Class8748.field36732) instanceof Class68) {
                    n = (Integer)method23743.method419(Class8748.field36732).method374();
                    method23743.method421(Class8748.field36732);
                    b = true;
                }
            }
            if (n == null) {
                final Integer n2 = (Integer)Class9526.field41005.inverse().get((Object)class7562.method23740());
                if (n2 != null) {
                    final Optional<String> method23744 = Class9126.method33113(n2);
                    if (!method23744.isPresent()) {
                        n = (n2 >> 4 << 16 | (n2 & 0xF));
                    }
                    else {
                        n = 25100288;
                        if (method23743 == null) {
                            class7562.method23747(method23743 = new Class74("tag"));
                        }
                        if (!method23743.method418("EntityTag")) {
                            final Class74 class7563 = new Class74("EntityTag");
                            class7563.method420(new Class71("id", (String)method23744.get()));
                            method23743.method420(class7563);
                        }
                    }
                }
            }
            if (n == null) {
                if (!Class8563.method28792().method23296() || Class8563.method28794().method33559()) {
                    Class8563.method28793().method34742().warning("Failed to get 1.12 item for " + class7562.method23740());
                }
                n = 65536;
            }
            class7562.method23744((short)(n >> 16));
            class7562.method23746((short)(n & 0xFFFF));
            if (method23743 != null) {
                if (method30247(class7562.method23740())) {
                    if (method23743.method419("Damage") instanceof Class68) {
                        if (!b) {
                            class7562.method23746((short)(int)method23743.method419("Damage").method374());
                        }
                        method23743.method421("Damage");
                    }
                }
                if (class7562.method23740() == 358) {
                    if (method23743.method419("map") instanceof Class68) {
                        if (!b) {
                            class7562.method23746((short)(int)method23743.method419("map").method374());
                        }
                        method23743.method421("map");
                    }
                }
                if (class7562.method23740() == 442 || class7562.method23740() == 425) {
                    if (method23743.method419("BlockEntityTag") instanceof Class74) {
                        final Class74 class7564 = method23743.method419("BlockEntityTag");
                        if (class7564.method419("Base") instanceof Class68) {
                            final Class68 class7565 = class7564.method419("Base");
                            class7565.method401(15 - class7565.method400());
                        }
                        if (class7564.method419("Patterns") instanceof Class60) {
                            for (final Class61 class7566 : class7564.method419("Patterns")) {
                                if (!(class7566 instanceof Class74)) {
                                    continue;
                                }
                                final Class68 class7567 = ((Class74)class7566).method419("Color");
                                class7567.method401(15 - class7567.method400());
                            }
                        }
                    }
                }
                if (method23743.method419("display") instanceof Class74) {
                    final Class74 class7568 = method23743.method419("display");
                    if (((Class74)method23743.method419("display")).method419("Name") instanceof Class71) {
                        final Class71 class7569 = class7568.method419("Name");
                        final Class71 class7570 = class7568.method419(Class8748.field36732 + "|Name");
                        class7569.method407((class7570 == null) ? Class8672.method29686(class7569.method406()) : class7570.method406());
                        class7568.method421(Class8748.field36732 + "|Name");
                    }
                }
                if (method23743.method419("Enchantments") instanceof Class60) {
                    final Class60 class7571 = method23743.method419("Enchantments");
                    final Class60 class7572 = new Class60("ench", Class74.class);
                    for (final Class61 class7573 : class7571) {
                        if (!(class7573 instanceof Class74)) {
                            continue;
                        }
                        final Class74 class7574 = new Class74("");
                        final String s = (String)((Class74)class7573).method419("id").method374();
                        Short value = (Short)Class9526.field41009.inverse().get((Object)s);
                        if (value == null) {
                            if (s.startsWith("viaversion:legacy/")) {
                                value = Short.valueOf(s.substring(18));
                            }
                        }
                        class7574.method420(new Class70("id", value));
                        class7574.method420(new Class70("lvl", (short)((Class74)class7573).method419("lvl").method374()));
                        class7572.method368(class7574);
                    }
                    method23743.method421("Enchantments");
                    method23743.method420(class7572);
                }
                if (method23743.method419("StoredEnchantments") instanceof Class60) {
                    final Class60 class7575 = method23743.method419("StoredEnchantments");
                    final Class60 class7576 = new Class60("StoredEnchantments", Class74.class);
                    for (final Class61 class7577 : class7575) {
                        if (!(class7577 instanceof Class74)) {
                            continue;
                        }
                        final Class74 class7578 = new Class74("");
                        final String s2 = (String)((Class74)class7577).method419("id").method374();
                        Short value2 = (Short)Class9526.field41009.inverse().get((Object)s2);
                        if (value2 == null) {
                            if (s2.startsWith("viaversion:legacy/")) {
                                value2 = Short.valueOf(s2.substring(18));
                            }
                        }
                        class7578.method420(new Class70("id", value2));
                        class7578.method420(new Class70("lvl", (short)((Class74)class7577).method419("lvl").method374()));
                        class7576.method368(class7578);
                    }
                    method23743.method421("StoredEnchantments");
                    method23743.method420(class7576);
                }
                if (!(method23743.method419(Class8748.field36732 + "|CanPlaceOn") instanceof Class60)) {
                    if (method23743.method419("CanPlaceOn") instanceof Class60) {
                        final Class60 class7579 = method23743.method419("CanPlaceOn");
                        final Class60 class7580 = new Class60("CanPlaceOn", Class71.class);
                        for (final Class61 class7581 : class7579) {
                            final Object method23745 = class7581.method374();
                            final String[] array = Class6111.field24817.get((method23745 instanceof String) ? ((String)method23745).replace("minecraft:", "") : null);
                            if (array == null) {
                                class7580.method368(class7581);
                            }
                            else {
                                final String[] array2 = array;
                                for (int length = array2.length, i = 0; i < length; ++i) {
                                    class7580.method368(new Class71("", array2[i]));
                                }
                            }
                        }
                        method23743.method420(class7580);
                    }
                }
                else {
                    method23743.method420(Class7185.method22027("CanPlaceOn", Class7185.method22026(method23743.method419(Class8748.field36732 + "|CanPlaceOn"))));
                    method23743.method421(Class8748.field36732 + "|CanPlaceOn");
                }
                if (!(method23743.method419(Class8748.field36732 + "|CanDestroy") instanceof Class60)) {
                    if (method23743.method419("CanDestroy") instanceof Class60) {
                        final Class60 class7582 = method23743.method419("CanDestroy");
                        final Class60 class7583 = new Class60("CanDestroy", Class71.class);
                        for (final Class61 class7584 : class7582) {
                            final Object method23746 = class7584.method374();
                            final String[] array3 = Class6111.field24817.get((method23746 instanceof String) ? ((String)method23746).replace("minecraft:", "") : null);
                            if (array3 == null) {
                                class7583.method368(class7584);
                            }
                            else {
                                final String[] array4 = array3;
                                for (int length2 = array4.length, j = 0; j < length2; ++j) {
                                    class7583.method368(new Class71("", array4[j]));
                                }
                            }
                        }
                        method23743.method420(class7583);
                    }
                }
                else {
                    method23743.method420(Class7185.method22027("CanDestroy", Class7185.method22026(method23743.method419(Class8748.field36732 + "|CanDestroy"))));
                    method23743.method421(Class8748.field36732 + "|CanDestroy");
                }
            }
        }
    }
    
    public static String method30246(String string) {
        if (!string.matches("([0-9a-z_.-]+):([0-9a-z_/.-]+)")) {
            return null;
        }
        final int index = string.indexOf(58);
        if ((index == -1 || index == 0) && string.length() <= 10) {
            string = "minecraft:" + string;
        }
        final String s = string;
        switch (s) {
            case "minecraft:trader_list": {
                return "MC|TrList";
            }
            case "minecraft:book_open": {
                return "MC|BOpen";
            }
            case "minecraft:debug/paths": {
                return "MC|DebugPath";
            }
            case "minecraft:debug/neighbors_update": {
                return "MC|DebugNeighborsUpdate";
            }
            case "minecraft:register": {
                return "REGISTER";
            }
            case "minecraft:unregister": {
                return "UNREGISTER";
            }
            case "minecraft:brand": {
                return "MC|Brand";
            }
            case "bungeecord:main": {
                return "BungeeCord";
            }
            case "wdl:init": {
                return "WDL|INIT";
            }
            case "wdl:control": {
                return "WDL|CONTROL";
            }
            case "wdl:request": {
                return "WDL|REQUEST";
            }
            case "fml:hs": {
                return "FML|HS";
            }
            case "fml:mp": {
                return "FML:MP";
            }
            default: {
                return (string.length() > 20) ? string.substring(0, 20) : string;
            }
        }
    }
    
    public static boolean method30247(final int n) {
        if (n < 256 || n > 259) {
            if (n != 261) {
                if (n < 267 || n > 279) {
                    if (n < 283 || n > 286) {
                        if (n < 290 || n > 294) {
                            if (n < 298 || n > 317) {
                                if (n != 346) {
                                    if (n != 359) {
                                        if (n != 398) {
                                            if (n != 442) {
                                                if (n != 443) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
