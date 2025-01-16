// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class628 extends Class624
{
    public final Class7430 field3611;
    public final /* synthetic */ Class5045 field3612;
    
    public Class628(final Class5045 field3612, final Class7430 field3613) {
        this.field3612 = field3612;
        this.field3611 = field3613;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3630(this.field3611, n3, n2, n6, n7);
    }
    
    private void method3630(final Class7430 class7430, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n + 45 + 20;
        this.field3612.method15407(class7430.field28650, n5, n2 + 2, 16777215);
        this.field3612.method15407(class7430.field28652, n5, n2 + 15, 8421504);
        this.field3612.method15407(class7430.field28651, n5 + 227 - this.field3612.method15424(class7430.field28651), n2 + 1, 8421504);
        Label_0152: {
            if ("".equals(class7430.field28653)) {
                if ("".equals(class7430.field28655)) {
                    if ("".equals(class7430.field28656)) {
                        break Label_0152;
                    }
                }
            }
            this.method3632(n5 - 1, n2 + 25, n3, n4, class7430.field28653, class7430.field28655, class7430.field28656);
        }
        this.method3631(n, n2 + 1, n3, n4, class7430);
    }
    
    private void method3631(final int n, final int n2, final int n3, final int n4, final Class7430 class7430) {
        Class8952.method31758(class7430.field28649, class7430.field28654);
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RealmsScreen.method15411(n + 1, n2 + 1, 0.0f, 0.0f, 38, 38, 38, 38);
        RealmsScreen.method15419("realms:textures/gui/realms/slot_frame.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RealmsScreen.method15411(n, n2, 0.0f, 0.0f, 40, 40, 40, 40);
    }
    
    private void method3632(final int n, final int n2, final int n3, final int n4, final String anObject, final String s, final String s2) {
        if (!"".equals(s2)) {
            this.field3612.method15407(s2, n, n2 + 4, 8421504);
        }
        final int n5 = "".equals(s2) ? 0 : (this.field3612.method15424(s2) + 2);
        boolean b = false;
        boolean b2 = false;
        if (n3 >= n + n5) {
            if (n3 <= n + n5 + 32) {
                if (n4 >= n2) {
                    if (n4 <= n2 + 15) {
                        if (n4 < this.field3612.height() - 15) {
                            if (n4 > 32) {
                                if (n3 <= n + 15 + n5 && n3 > n5) {
                                    if (!"".equals(anObject)) {
                                        b = true;
                                    }
                                    else {
                                        b2 = true;
                                    }
                                }
                                else if (!"".equals(anObject)) {
                                    b2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!"".equals(anObject)) {
            RealmsScreen.method15419("realms:textures/gui/realms/link_icons.png");
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.method30059();
            RenderSystem.method30063(1.0f, 1.0f, 1.0f);
            RealmsScreen.method15411(n + n5, n2, (!b) ? 0.0f : 15.0f, 0.0f, 15, 15, 30, 15);
            RenderSystem.method30060();
        }
        if (!"".equals(s)) {
            RealmsScreen.method15419("realms:textures/gui/realms/trailer_icons.png");
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.method30059();
            RenderSystem.method30063(1.0f, 1.0f, 1.0f);
            RealmsScreen.method15411(n + n5 + ("".equals(anObject) ? 0 : 17), n2, (!b2) ? 0.0f : 15.0f, 0.0f, 15, 15, 30, 15);
            RenderSystem.method30060();
        }
        if (b && !"".equals(anObject)) {
            Class5045.method15395(this.field3612, RealmsScreen.getLocalizedString("mco.template.info.tooltip"));
            Class5045.method15396(this.field3612, anObject);
        }
        else if (b2) {
            if (!"".equals(s)) {
                Class5045.method15395(this.field3612, RealmsScreen.getLocalizedString("mco.template.trailer.tooltip"));
                Class5045.method15396(this.field3612, s);
            }
        }
    }
}
