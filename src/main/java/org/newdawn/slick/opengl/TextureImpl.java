package org.newdawn.slick.opengl;

import org.lwjgl.BufferUtils;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.util.Log;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public class TextureImpl implements Texture {
    public static SGL GL = Renderer.get();
    public static Texture lastBind;
    private int target;
    private int textureID;
    private int height;
    private int width;
    private int texWidth;
    private int texHeight;
    private float widthRatio;
    private float heightRatio;
    private boolean alpha;
    private String ref;
    private String cacheName;
    private ReloadData reloadData;

    public static Texture method36176() {
        return lastBind;
    }

    public TextureImpl() {
    }

    public TextureImpl(String var1, int var2, int var3) {
        this.target = var2;
        this.ref = var1;
        this.textureID = var3;
        lastBind = this;
    }

    public void setCacheName(String var1) {
        this.cacheName = var1;
    }

    @Override
    public boolean hasAlpha() {
        return this.alpha;
    }

    @Override
    public String getTextureRef() {
        return this.ref;
    }

    public void setAlpha(boolean var1) {
        this.alpha = var1;
    }

    public static void bindNone() {
        lastBind = null;
        GL.glDisable(3553);
    }

    public static void unbind() {
        lastBind = null;
    }

    @Override
    public void bind() {
        if (lastBind != this) {
            lastBind = this;
            GL.glEnable(3553);
            GL.glBindTexture(this.target, this.textureID);
        }
    }

    public void setHeight(int var1) {
        this.height = var1;
        this.setHeight();
    }

    public void setWidth(int var1) {
        this.width = var1;
        this.setWidth();
    }

    @Override
    public int getImageHeight() {
        return this.height;
    }

    @Override
    public int getImageWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.heightRatio;
    }

    @Override
    public float getWidth() {
        return this.widthRatio;
    }

    @Override
    public int getTextureHeight() {
        return this.texHeight;
    }

    @Override
    public int getTextureWidth() {
        return this.texWidth;
    }

    public void setTextureHeight(int var1) {
        this.texHeight = var1;
        this.setHeight();
    }

    public void setTextureWidth(int var1) {
        this.texWidth = var1;
        this.setWidth();
    }

    private void setHeight() {
        if (this.texHeight != 0) {
            this.heightRatio = (float) this.height / (float) this.texHeight;
        }
    }

    private void setWidth() {
        if (this.texWidth != 0) {
            this.widthRatio = (float) this.width / (float) this.texWidth;
        }
    }

    @Override
    public void release() {
        IntBuffer var3 = this.createIntBuffer(1);
        var3.put(this.textureID);
        var3.flip();
        GL.glDeleteTextures(var3);
        if (lastBind == this) {
            bindNone();
        }

        if (this.cacheName == null) {
            InternalTextureLoader.get().clear(this.ref);
        } else {
            InternalTextureLoader.get().clear(this.cacheName);
        }
    }

    @Override
    public int getTextureID() {
        return this.textureID;
    }

    public void setTextureID(int var1) {
        this.textureID = var1;
    }

    public IntBuffer createIntBuffer(int var1) {
        ByteBuffer var4 = ByteBuffer.allocateDirect(4 * var1);
        var4.order(ByteOrder.nativeOrder());
        return var4.asIntBuffer();
    }

    @Override
    public byte[] getTextureData() {
        ByteBuffer var3 = BufferUtils.createByteBuffer((!this.hasAlpha() ? 3 : 4) * this.texWidth * this.texHeight);
        this.bind();
        GL.glGetTexImage(3553, 0, !this.hasAlpha() ? 6407 : 6408, 5121, var3);
        byte[] var4 = new byte[var3.limit()];
        var3.get(var4);
        ((Buffer) var3).clear();
        return var4;
    }

    @Override
    public void setTextureFilter(int var1) {
        this.bind();
        GL.glTexParameteri(this.target, 10241, var1);
        GL.glTexParameteri(this.target, 10240, var1);
    }

    public void setTextureData(int srcPixelFormat, int componentCount,
                               int minFilter, int magFilter, ByteBuffer textureBuffer) {
        reloadData = new ReloadData();
        reloadData.srcPixelFormat = srcPixelFormat;
        reloadData.componentCount = componentCount;
        reloadData.minFilter = minFilter;
        reloadData.magFilter = magFilter;
        reloadData.textureBuffer = textureBuffer;
    }

    public void reload() {
        if (this.reloadData != null) {
            this.textureID = this.reloadData.reload();
        }
    }

    private class ReloadData {
        private int srcPixelFormat;
        private int componentCount;
        private int minFilter;
        private int magFilter;
        private ByteBuffer textureBuffer;

        public int reload() {
            Log.error("Reloading texture: " + ref);
            return InternalTextureLoader.get().reload(TextureImpl.this, srcPixelFormat, componentCount, minFilter, magFilter, textureBuffer);
        }
    }
}
