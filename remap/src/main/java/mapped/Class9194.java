// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;

public class Class9194
{
    private static String[] field38967;
    private Minecraft field38968;
    private CombatTracker field38969;
    private HashMap<String, Class8502> field38970;
    
    public Class9194(final CombatTracker field38969) {
        this.field38968 = Minecraft.getInstance();
        this.field38970 = new HashMap<String, Class8502>();
        this.field38969 = field38969;
    }
    
    public void method33644(final String s, final String s2, final long l) {
        this.field38970.computeIfAbsent(s, p0 -> new Class8502()).method28415(l, s2);
        System.out.println(this.field38970.get(s).field34902);
    }
    
    public Class8502 method33645(final String key) {
        return this.field38970.computeIfAbsent(key, p0 -> new Class8502());
    }
}
