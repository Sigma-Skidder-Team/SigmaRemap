// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class3655 extends Class3651
{
    public static List<Class7220> method11248() {
        final ArrayList list = new ArrayList();
        list.add(new Class3655("fenceConnections").method11237("minecraft:oak_fence"));
        list.add(new Class3655("fenceConnections").method11237("minecraft:birch_fence"));
        list.add(new Class3655("fenceConnections").method11237("minecraft:jungle_fence"));
        list.add(new Class3655("fenceConnections").method11237("minecraft:dark_oak_fence"));
        list.add(new Class3655("fenceConnections").method11237("minecraft:acacia_fence"));
        list.add(new Class3655("fenceConnections").method11237("minecraft:spruce_fence"));
        return list;
    }
    
    public Class3655(final String s) {
        super(s);
    }
}
