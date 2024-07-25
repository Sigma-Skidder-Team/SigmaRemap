package com.mojang.blaze3d.vertex;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.math.vector.Vector3f;

public class VertexBuilderUtils
{
    public static IVertexBuilder newDelegate(IVertexBuilder vertexBuilder, IVertexBuilder delegateBuilder)
    {
        return new VertexBuilderUtils.DelegatingVertexBuilder(vertexBuilder, delegateBuilder);
    }

    static class DelegatingVertexBuilder implements IVertexBuilder
    {
        private final IVertexBuilder vertexBuilder;
        private final IVertexBuilder delegateBuilder;

        public DelegatingVertexBuilder(IVertexBuilder vertexBuilder, IVertexBuilder delegateBuilder)
        {
            if (vertexBuilder == delegateBuilder)
            {
                throw new IllegalArgumentException("Duplicate delegates");
            }
            else
            {
                this.vertexBuilder = vertexBuilder;
                this.delegateBuilder = delegateBuilder;
            }
        }

        public IVertexBuilder pos(double x, double y, double z)
        {
            this.vertexBuilder.pos(x, y, z);
            this.delegateBuilder.pos(x, y, z);
            return this;
        }

        public IVertexBuilder color(int red, int green, int blue, int alpha)
        {
            this.vertexBuilder.color(red, green, blue, alpha);
            this.delegateBuilder.color(red, green, blue, alpha);
            return this;
        }

        public IVertexBuilder tex(float u, float v)
        {
            this.vertexBuilder.tex(u, v);
            this.delegateBuilder.tex(u, v);
            return this;
        }

        public IVertexBuilder overlay(int u, int v)
        {
            this.vertexBuilder.overlay(u, v);
            this.delegateBuilder.overlay(u, v);
            return this;
        }

        public IVertexBuilder lightmap(int u, int v)
        {
            this.vertexBuilder.lightmap(u, v);
            this.delegateBuilder.lightmap(u, v);
            return this;
        }

        public IVertexBuilder normal(float x, float y, float z)
        {
            this.vertexBuilder.normal(x, y, z);
            this.delegateBuilder.normal(x, y, z);
            return this;
        }

        public void addVertex(float x, float y, float z, float red, float green, float blue, float alpha, float texU, float texV, int overlayUV, int lightmapUV, float normalX, float normalY, float normalZ)
        {
            this.vertexBuilder.addVertex(x, y, z, red, green, blue, alpha, texU, texV, overlayUV, lightmapUV, normalX, normalY, normalZ);
            this.delegateBuilder.addVertex(x, y, z, red, green, blue, alpha, texU, texV, overlayUV, lightmapUV, normalX, normalY, normalZ);
        }

        public void endVertex()
        {
            this.vertexBuilder.endVertex();
            this.delegateBuilder.endVertex();
        }

        public void putSprite(TextureAtlasSprite p_putSprite_1_)
        {
            this.vertexBuilder.putSprite(p_putSprite_1_);
            this.delegateBuilder.putSprite(p_putSprite_1_);
        }

        public void setSprite(TextureAtlasSprite p_setSprite_1_)
        {
            this.vertexBuilder.setSprite(p_setSprite_1_);
            this.delegateBuilder.setSprite(p_setSprite_1_);
        }

        public void setBlockLayer(RenderType p_setBlockLayer_1_)
        {
            this.vertexBuilder.setBlockLayer(p_setBlockLayer_1_);
            this.delegateBuilder.setBlockLayer(p_setBlockLayer_1_);
        }

        public Vector3f getTempVec3f(Vector3f p_getTempVec3f_1_)
        {
            return this.delegateBuilder.getTempVec3f(p_getTempVec3f_1_);
        }

        public Vector3f getTempVec3f(float p_getTempVec3f_1_, float p_getTempVec3f_2_, float p_getTempVec3f_3_)
        {
            return this.delegateBuilder.getTempVec3f(p_getTempVec3f_1_, p_getTempVec3f_2_, p_getTempVec3f_3_);
        }

        public float[] getTempFloat4(float p_getTempFloat4_1_, float p_getTempFloat4_2_, float p_getTempFloat4_3_, float p_getTempFloat4_4_)
        {
            return this.delegateBuilder.getTempFloat4(p_getTempFloat4_1_, p_getTempFloat4_2_, p_getTempFloat4_3_, p_getTempFloat4_4_);
        }

        public int[] getTempInt4(int p_getTempInt4_1_, int p_getTempInt4_2_, int p_getTempInt4_3_, int p_getTempInt4_4_)
        {
            return this.delegateBuilder.getTempInt4(p_getTempInt4_1_, p_getTempInt4_2_, p_getTempInt4_3_, p_getTempInt4_4_);
        }

        public IRenderTypeBuffer.Impl getRenderTypeBuffer()
        {
            return this.delegateBuilder.getRenderTypeBuffer();
        }
    }
}
