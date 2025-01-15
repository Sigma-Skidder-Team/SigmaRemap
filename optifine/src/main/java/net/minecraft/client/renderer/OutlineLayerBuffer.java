package net.minecraft.client.renderer;

import com.mojang.blaze3d.vertex.DefaultColorVertexBuilder;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.vertex.VertexBuilderUtils;
import java.util.Optional;

public class OutlineLayerBuffer implements IRenderTypeBuffer
{
    private final IRenderTypeBuffer.Impl buffer;
    private final IRenderTypeBuffer.Impl outlineBuffer = IRenderTypeBuffer.getImpl(new BufferBuilder(256));
    private int red = 255;
    private int green = 255;
    private int blue = 255;
    private int alpha = 255;

    public OutlineLayerBuffer(IRenderTypeBuffer.Impl p_i3721_1_)
    {
        this.buffer = p_i3721_1_;
    }

    public IVertexBuilder getBuffer(RenderType p_getBuffer_1_)
    {
        if (p_getBuffer_1_.func_230041_s_())
        {
            IVertexBuilder ivertexbuilder2 = this.outlineBuffer.getBuffer(p_getBuffer_1_);
            return new OutlineLayerBuffer.ColoredOutline(ivertexbuilder2, this.red, this.green, this.blue, this.alpha);
        }
        else
        {
            IVertexBuilder ivertexbuilder = this.buffer.getBuffer(p_getBuffer_1_);
            Optional<RenderType> optional = p_getBuffer_1_.getOutline();

            if (optional.isPresent())
            {
                IVertexBuilder ivertexbuilder1 = this.outlineBuffer.getBuffer(optional.get());
                OutlineLayerBuffer.ColoredOutline outlinelayerbuffer$coloredoutline = new OutlineLayerBuffer.ColoredOutline(ivertexbuilder1, this.red, this.green, this.blue, this.alpha);
                return VertexBuilderUtils.newDelegate(outlinelayerbuffer$coloredoutline, ivertexbuilder);
            }
            else
            {
                return ivertexbuilder;
            }
        }
    }

    public void setColor(int redIn, int greenIn, int blueIn, int alphaIn)
    {
        this.red = redIn;
        this.green = greenIn;
        this.blue = blueIn;
        this.alpha = alphaIn;
    }

    public void finish()
    {
        this.outlineBuffer.finish();
    }

    static class ColoredOutline extends DefaultColorVertexBuilder
    {
        private final IVertexBuilder coloredBuffer;
        private double x;
        private double y;
        private double z;
        private float u;
        private float v;

        private ColoredOutline(IVertexBuilder p_i4023_1_, int p_i4023_2_, int p_i4023_3_, int p_i4023_4_, int p_i4023_5_)
        {
            this.coloredBuffer = p_i4023_1_;
            super.setDefaultColor(p_i4023_2_, p_i4023_3_, p_i4023_4_, p_i4023_5_);
        }

        public void setDefaultColor(int red, int green, int blue, int alpha)
        {
        }

        public IVertexBuilder pos(double x, double y, double z)
        {
            this.x = x;
            this.y = y;
            this.z = z;
            return this;
        }

        public IVertexBuilder color(int red, int green, int blue, int alpha)
        {
            return this;
        }

        public IVertexBuilder tex(float u, float v)
        {
            this.u = u;
            this.v = v;
            return this;
        }

        public IVertexBuilder overlay(int u, int v)
        {
            return this;
        }

        public IVertexBuilder lightmap(int u, int v)
        {
            return this;
        }

        public IVertexBuilder normal(float x, float y, float z)
        {
            return this;
        }

        public void addVertex(float x, float y, float z, float red, float green, float blue, float alpha, float texU, float texV, int overlayUV, int lightmapUV, float normalX, float normalY, float normalZ)
        {
            this.coloredBuffer.pos((double)x, (double)y, (double)z).color(this.defaultRed, this.defaultGreen, this.defaultBlue, this.defaultAlpha).tex(texU, texV).endVertex();
        }

        public void endVertex()
        {
            this.coloredBuffer.pos(this.x, this.y, this.z).color(this.defaultRed, this.defaultGreen, this.defaultBlue, this.defaultAlpha).tex(this.u, this.v).endVertex();
        }
    }
}
