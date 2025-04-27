// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class8614
{
    private final Map<String, boolean[]> field36150;
    
    public Class8614() {
        this.field36150 = new HashMap<String, boolean[]>();
    }
    
    public void method29215(final String s, final boolean[] array) {
        this.field36150.put(s, array);
    }
    
    public boolean method29216(final String s, final Class222 class222, final boolean b) {
        boolean[] array = null;
        if (b) {
            array = this.field36150.get("allFalseIfStairPre1_12");
        }
        if (array == null) {
            array = this.field36150.get(s);
        }
        return array != null && array[class222.ordinal()];
    }
}
