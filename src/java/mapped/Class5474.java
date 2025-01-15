// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class5474
{
    public static void method16716() {
        try {
            Class7840.method25330().method19296();
        }
        catch (final NullPointerException ex) {
            throw new RuntimeException("OpenGL based resources (images, fonts, sprites etc) must be loaded as part of init() or the game loop. They cannot be loaded before initialisation.");
        }
    }
}
