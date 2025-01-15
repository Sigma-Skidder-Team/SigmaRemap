// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public enum Class230
{
    field812("base", "b"), 
    field813("square_bottom_left", "bl", "   ", "   ", "#  "), 
    field814("square_bottom_right", "br", "   ", "   ", "  #"), 
    field815("square_top_left", "tl", "#  ", "   ", "   "), 
    field816("square_top_right", "tr", "  #", "   ", "   "), 
    field817("stripe_bottom", "bs", "   ", "   ", "###"), 
    field818("stripe_top", "ts", "###", "   ", "   "), 
    field819("stripe_left", "ls", "#  ", "#  ", "#  "), 
    field820("stripe_right", "rs", "  #", "  #", "  #"), 
    field821("stripe_center", "cs", " # ", " # ", " # "), 
    field822("stripe_middle", "ms", "   ", "###", "   "), 
    field823("stripe_downright", "drs", "#  ", " # ", "  #"), 
    field824("stripe_downleft", "dls", "  #", " # ", "#  "), 
    field825("small_stripes", "ss", "# #", "# #", "   "), 
    field826("cross", "cr", "# #", " # ", "# #"), 
    field827("straight_cross", "sc", " # ", "###", " # "), 
    field828("triangle_bottom", "bt", "   ", " # ", "# #"), 
    field829("triangle_top", "tt", "# #", " # ", "   "), 
    field830("triangles_bottom", "bts", "   ", "# #", " # "), 
    field831("triangles_top", "tts", " # ", "# #", "   "), 
    field832("diagonal_left", "ld", "## ", "#  ", "   "), 
    field833("diagonal_up_right", "rd", "   ", "  #", " ##"), 
    field834("diagonal_up_left", "lud", "   ", "#  ", "## "), 
    field835("diagonal_right", "rud", " ##", "  #", "   "), 
    field836("circle", "mc", "   ", " # ", "   "), 
    field837("rhombus", "mr", " # ", "# #", " # "), 
    field838("half_vertical", "vh", "## ", "## ", "## "), 
    field839("half_horizontal", "hh", "###", "###", "   "), 
    field840("half_vertical_right", "vhr", " ##", " ##", " ##"), 
    field841("half_horizontal_bottom", "hhb", "   ", "###", "###"), 
    field842("border", "bo", "###", "# #", "###"), 
    field843("curly_border", "cbo", new ItemStack(Class7521.field29388)),
    field844("gradient", "gra", "# #", " # ", " # "), 
    field845("gradient_up", "gru", " # ", " # ", "# #"), 
    field846("bricks", "bri", new ItemStack(Class7521.field29282)),
    field847("globe", "glb"), 
    field848("creeper", "cre", new ItemStack(Items.field31527)),
    field849("skull", "sku", new ItemStack(Items.field31524)),
    field850("flower", "flo", new ItemStack(Class7521.field29274)),
    field851("mojang", "moj", new ItemStack(Items.field31342));
    
    public static final int field852;
    public static final int field853;
    private final String field854;
    private final String field855;
    private final String[] field856;
    private ItemStack field857;
    
    private Class230(final String field854, final String field855) {
        this.field856 = new String[3];
        this.field857 = ItemStack.field34174;
        this.field854 = field854;
        this.field855 = field855;
    }
    
    private Class230(final String s2, final String s3, final ItemStack field857) {
        this(s2, s3);
        this.field857 = field857;
    }
    
    private Class230(final String s2, final String s3, final String s4, final String s5, final String s6) {
        this(s2, s3);
        this.field856[0] = s4;
        this.field856[1] = s5;
        this.field856[2] = s6;
    }
    
    public Class1932 method857(final boolean b) {
        return new Class1932("entity/" + (b ? "banner" : "shield") + "/" + this.method858());
    }
    
    public String method858() {
        return this.field854;
    }
    
    public String method859() {
        return this.field855;
    }
    
    @Nullable
    public static Class230 method860(final String anObject) {
        for (final Class230 class230 : values()) {
            if (class230.field855.equals(anObject)) {
                return class230;
            }
        }
        return null;
    }
    
    static {
        field852 = values().length;
        field853 = Class230.field852 - 5 - 1;
    }
}
