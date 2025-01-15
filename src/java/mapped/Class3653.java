// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class3653 extends Class3651
{
    public static List<Class7220> method11245() {
        final ArrayList list = new ArrayList(18);
        list.add(new Class3653("paneConnections").method11237("minecraft:white_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:orange_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:magenta_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:light_blue_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:yellow_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:lime_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:pink_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:gray_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:light_gray_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:cyan_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:purple_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:blue_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:brown_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:green_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:red_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:black_stained_glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:glass_pane"));
        list.add(new Class3653("paneConnections").method11237("minecraft:iron_bars"));
        return list;
    }
    
    public Class3653(final String s) {
        super(s);
    }
    
    @Override
    public byte method11239(final Class6108 class6108, final Class8322 class6109, final int n) {
        final byte method11239 = super.method11239(class6108, class6109, n);
        if (method11239 == 0) {
            if (class6108.method18207(Class6651.class).method20208() <= 47) {
                if (class6108.method18207(Class6651.class).method20208() != -1) {
                    final int n2 = 15;
                    return (byte)n2;
                }
            }
        }
        final int n2 = method11239;
        return (byte)n2;
    }
}
