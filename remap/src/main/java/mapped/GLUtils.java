// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Renderer;

public final class GLUtils
{
    public static void checkGLContext() {
        try {
            Renderer.get().method19296();
        }
        catch (final NullPointerException ex) {
            throw new RuntimeException("OpenGL based resources (images, fonts, sprites etc) must be loaded as part of init() or the game loop. They cannot be loaded before initialisation.");
        }
    }
}
