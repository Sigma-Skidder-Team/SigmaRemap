// 
// Decompiled by Procyon v0.6.0
// 

package slick2d;

public interface Texture
{
    boolean hasAlpha();
    
    String getTextureRef();
    
    void bind();
    
    int getImageHeight();
    
    int getImageWidth();
    
    float getHeight();
    
    float getWidth();
    
    int getTextureHeight();
    
    int getTextureWidth();
    
    void release();
    
    int getTextureID();
    
    byte[] getTextureData();
    
    void setTextureFilter(final int textureFilter);
}
