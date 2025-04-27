// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;

public final class Class1913 extends TextureAtlasSprite
{
    private static final ResourceLocation field10402;
    private static Class1773 field10403;
    private static final Class8656<Class1846> field10404;
    private static final Class9336 field10405;
    
    public Class1913(final Class1774 class1774, final Class9336 class1775, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(class1774, class1775, n, n2, n3, n4, n5, method7554(class1775.method34592(), class1775.method34593()));
    }
    
    private Class1913(final Class1774 class1774, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(class1774, Class1913.field10405, n, n2, n3, n4, n5, Class1913.field10404.method29528());
    }
    
    public static Class1913 method7550(final Class1774 class1774, final int n, final int n2, final int n3, final int n4, final int n5) {
        return new Class1913(class1774, n, n2, n3, n4, n5);
    }
    
    public static ResourceLocation method7551() {
        return Class1913.field10402;
    }
    
    public static Class9336 method7552() {
        return Class1913.field10405;
    }
    
    @Override
    public void close() {
        super.close();
    }
    
    public static Class1773 method7553() {
        if (Class1913.field10403 == null) {
            Class1913.field10403 = new Class1773(Class1913.field10404.method29528());
            Minecraft.getInstance().method5290().method5851(Class1913.field10402, Class1913.field10403);
        }
        return Class1913.field10403;
    }
    
    private static Class1846 method7554(final int n, final int n2) {
        final int n3 = n / 2;
        final int n4 = n2 / 2;
        final Class1846 class1846 = new Class1846(n, n2, false);
        final int n5 = -16777216;
        final int n6 = -524040;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i < n4 == j < n3) {
                    class1846.method6648(j, i, n5);
                }
                else {
                    class1846.method6648(j, i, n6);
                }
            }
        }
        return class1846;
    }
    
    static {
        field10402 = new ResourceLocation("missingno");
        field10404 = new Class8656<Class1846>(() -> {
            final Class1846 class1846 = new Class1846(16, 16, false);
            int i = 0;
            while (i < 16) {
                int j = 0;
                while (j < 16) {
                    if (i < 8 == j < 8) {
                        class1846.method6648(j, i, -16777216);
                    }
                    else {
                        class1846.method6648(j, i, -524040);
                    }
                    ++j;
                }
                ++i;
            }
            class1846.method6667();
            return class1846;
        });
        field10405 = new Class9336(Class1913.field10402, 16, 16, new Class8637(Lists.newArrayList((Object[])new Class7272[] { new Class7272(0, -1) }), 16, 16, 1, false));
    }
}
