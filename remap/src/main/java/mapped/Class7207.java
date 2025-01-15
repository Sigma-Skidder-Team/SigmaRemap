// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public abstract class Class7207
{
    public static final Class7207[] field27992;
    public static final Class7207 field27993;
    public static final Class7207 field27994;
    public static final Class7207 field27995;
    public static final Class7207 field27996;
    public static final Class7207 field27997;
    public static final Class7207 field27998;
    public static final Class7207 field27999;
    public static final Class7207 field28000;
    public static final Class7207 field28001;
    public static final Class7207 field28002;
    public static final Class7207 field28003;
    public static final Class7207 field28004;
    public static final Class7207 field28005;
    private final int field28006;
    private final String field28007;
    private String field28008;
    private String field28009;
    private boolean field28010;
    private boolean field28011;
    private Class242[] field28012;
    private ItemStack field28013;
    
    public Class7207(final int field28006, final String field28007) {
        this.field28009 = "items.png";
        this.field28010 = true;
        this.field28011 = true;
        this.field28012 = new Class242[0];
        this.field28006 = field28006;
        this.field28007 = field28007;
        this.field28013 = ItemStack.field34174;
        Class7207.field27992[field28006] = this;
    }
    
    public int method22108() {
        return this.field28006;
    }
    
    public String method22109() {
        return this.field28007;
    }
    
    public String method22110() {
        return (this.field28008 != null) ? this.field28008 : this.field28007;
    }
    
    public String method22111() {
        return "itemGroup." + this.method22109();
    }
    
    public ItemStack method22112() {
        if (this.field28013.method27620()) {
            this.field28013 = this.method22107();
        }
        return this.field28013;
    }
    
    public abstract ItemStack method22107();
    
    public String method22113() {
        return this.field28009;
    }
    
    public Class7207 method22114(final String field28009) {
        this.field28009 = field28009;
        return this;
    }
    
    public Class7207 method22115(final String field28008) {
        this.field28008 = field28008;
        return this;
    }
    
    public boolean method22116() {
        return this.field28011;
    }
    
    public Class7207 method22117() {
        this.field28011 = false;
        return this;
    }
    
    public boolean method22118() {
        return this.field28010;
    }
    
    public Class7207 method22119() {
        this.field28010 = false;
        return this;
    }
    
    public int method22120() {
        return this.field28006 % 6;
    }
    
    public boolean method22121() {
        return this.field28006 < 6;
    }
    
    public boolean method22122() {
        return this.method22120() == 5;
    }
    
    public Class242[] method22123() {
        return this.field28012;
    }
    
    public Class7207 method22124(final Class242... field28012) {
        this.field28012 = field28012;
        return this;
    }
    
    public boolean method22125(final Class242 class242) {
        if (class242 != null) {
            final Class242[] field28012 = this.field28012;
            for (int length = field28012.length, i = 0; i < length; ++i) {
                if (field28012[i] == class242) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void method22126(final Class2265<ItemStack> class2265) {
        final Iterator<Object> iterator = Class90.field211.iterator();
        while (iterator.hasNext()) {
            iterator.next().method11735(this, class2265);
        }
    }
    
    static {
        field27992 = new Class7207[12];
        field27993 = new Class7209(0, "buildingBlocks").method22115("building_blocks");
        field27994 = new Class7217(1, "decorations");
        field27995 = new Class7211(2, "redstone");
        field27996 = new Class7213(3, "transportation");
        field27997 = new Class7210(6, "misc");
        field27998 = new Class7212(5, "search").method22114("item_search.png");
        field27999 = new Class7216(7, "food");
        field28000 = new Class7215(8, "tools").method22124(Class242.field1190, Class242.field1197, Class242.field1198, Class242.field1200);
        field28001 = new Class7214(9, "combat").method22124(Class242.field1190, Class242.field1191, Class242.field1192, Class242.field1195, Class242.field1193, Class242.field1194, Class242.field1201, Class242.field1196, Class242.field1202, Class242.field1200, Class242.field1199, Class242.field1203);
        field28002 = new Class7206(10, "brewing");
        field28003 = Class7207.field27997;
        field28004 = new Class7208(4, "hotbar");
        field28005 = new Class7218(11, "inventory").method22114("inventory.png").method22119().method22117();
    }
}
