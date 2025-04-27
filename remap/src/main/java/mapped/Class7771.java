// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Dimension;

public class Class7771
{
    private Dimension field31813;
    private boolean field31814;
    private Class8882[] field31815;
    private ResourceLocation field31816;
    private Class1846 field31817;
    private Class1773 field31818;
    private final ResourceLocation field31819;
    public static final int field31820 = 0;
    public static final int field31821 = 1;
    public static final int field31822 = 2;
    public static final int field31823 = 3;
    public static final int field31824 = 4;
    public static final int field31825 = 5;
    public static final int field31826 = 6;
    
    public Class7771(final Dimension field31813, final boolean field31814, final Class8882[] field31815) {
        this.field31813 = null;
        this.field31814 = false;
        this.field31815 = new Class8882[0];
        this.field31816 = null;
        this.field31817 = null;
        this.field31818 = null;
        this.field31819 = new ResourceLocation("textures/block/red_wool.png");
        this.field31813 = field31813;
        this.field31814 = field31814;
        this.field31815 = field31815;
    }
    
    public void method24880(final Class5853 class5853, final AbstractClientPlayerEntity class5854, final MatrixStack class5855, final IRenderTypeBuffer class5856, final int n, final int n2) {
        final Class1663 method28895 = Config.method28895();
        if (!this.field31814) {
            if (this.field31816 == null) {
                method28895.method5849(this.field31819);
            }
            else {
                if (this.field31818 == null) {
                    if (this.field31817 != null) {
                        this.field31818 = new Class1773(this.field31817);
                        Minecraft.getInstance().method5290().method5851(this.field31816, this.field31818);
                    }
                }
                method28895.method5849(this.field31816);
            }
        }
        else {
            method28895.method5849(class5854.method4097());
        }
        for (int i = 0; i < this.field31815.length; ++i) {
            final Class8882 class5857 = this.field31815[i];
            Class8933.method31635();
            if (class5854.method1814()) {
                Class8933.method31642(0.0f, 0.2f, 0.0f);
            }
            class5857.method31266(class5853, class5855, class5856.method25214(Class6332.method18770(this.field31816)), n, n2);
            Class8933.method31636();
        }
    }
    
    public static Class6300 method24881(final Class5853 class5853, final int n) {
        switch (n) {
            case 0: {
                return class5853.field23995;
            }
            case 1: {
                return class5853.field23993;
            }
            case 2: {
                return class5853.field23997;
            }
            case 3: {
                return class5853.field23996;
            }
            case 4: {
                return class5853.field23999;
            }
            case 5: {
                return class5853.field23998;
            }
            default: {
                return null;
            }
        }
    }
    
    public Class1846 method24882() {
        return this.field31817;
    }
    
    public void method24883(final Class1846 field31817) {
        this.field31817 = field31817;
    }
    
    public Class1773 method24884() {
        return this.field31818;
    }
    
    public ResourceLocation method24885() {
        return this.field31816;
    }
    
    public void method24886(final ResourceLocation field31816) {
        this.field31816 = field31816;
    }
    
    public boolean method24887() {
        return this.field31814;
    }
}
