// 
// Decompiled by Procyon v0.6.0
// 

package org.newdawn.slick.opengl.renderer;

public interface LineStripRenderer
{
    boolean applyGLLineFixes();
    
    void start();
    
    void end();
    
    void vertex(final float p0, final float p1);
    
    void color(final float p0, final float p1, final float p2, final float p3);
    
    void setWidth(final float p0);
    
    void setAntiAlias(final boolean p0);
    
    void setLineCaps(final boolean p0);
}
