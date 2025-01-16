// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5579 extends Class5509
{
    public Class5579() {
        super(Class5412.field22552, "book", 0.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5917();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5917)) {
            return null;
        }
        final Class5917 class5902 = (Class5917)class5901;
        if (s.equals("cover_right")) {
            return (Class6300)Class9570.field41459.method21625(class5902, 0);
        }
        if (s.equals("cover_left")) {
            return (Class6300)Class9570.field41459.method21625(class5902, 1);
        }
        if (s.equals("pages_right")) {
            return (Class6300)Class9570.field41459.method21625(class5902, 2);
        }
        if (s.equals("pages_left")) {
            return (Class6300)Class9570.field41459.method21625(class5902, 3);
        }
        if (s.equals("flipping_page_right")) {
            return (Class6300)Class9570.field41459.method21625(class5902, 4);
        }
        if (!s.equals("flipping_page_left")) {
            return s.equals("book_spine") ? ((Class6300)Class9570.field41459.method21625(class5902, 6)) : null;
        }
        return (Class6300)Class9570.field41459.method21625(class5902, 5);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float n) {
        final Class9550 field41126 = Class9550.field41126;
        Class4158 method35732 = field41126.method35732(Class5412.field22552);
        if (!(method35732 instanceof Class4173)) {
            return null;
        }
        if (method35732.method12456() == null) {
            method35732 = new Class4173(field41126);
        }
        if (Class9570.field41595.method22634()) {
            Class9570.method35837(method35732, Class9570.field41595, class5901);
            return (Class9559)method35732;
        }
        Config.warn("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
        return null;
    }
}
