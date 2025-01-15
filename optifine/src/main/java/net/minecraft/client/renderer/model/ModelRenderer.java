package net.minecraft.client.renderer.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;
import net.optifine.entity.model.anim.ModelUpdater;
import net.optifine.model.ModelSprite;

public class ModelRenderer
{
    public float textureWidth = 64.0F;
    public float textureHeight = 32.0F;
    private int textureOffsetX;
    private int textureOffsetY;
    public float rotationPointX;
    public float rotationPointY;
    public float rotationPointZ;
    public float rotateAngleX;
    public float rotateAngleY;
    public float rotateAngleZ;
    public boolean mirror;
    public boolean showModel = true;
    public final ObjectList<ModelRenderer.ModelBox> cubeList = new ObjectArrayList<>();
    public final ObjectList<ModelRenderer> childModels = new ObjectArrayList<>();
    public List spriteList = new ArrayList();
    public boolean mirrorV = false;
    public float scaleX = 1.0F;
    public float scaleY = 1.0F;
    public float scaleZ = 1.0F;
    private ResourceLocation textureLocation = null;
    private String id = null;
    private ModelUpdater modelUpdater;
    private WorldRenderer renderGlobal = Config.getRenderGlobal();

    public ModelRenderer(Model p_i64_1_)
    {
        p_i64_1_.accept(this);
        this.setTextureSize(p_i64_1_.textureWidth, p_i64_1_.textureHeight);
    }

    public ModelRenderer(Model p_i65_1_, int p_i65_2_, int p_i65_3_)
    {
        this(p_i65_1_.textureWidth, p_i65_1_.textureHeight, p_i65_2_, p_i65_3_);
        p_i65_1_.accept(this);
    }

    public ModelRenderer(int p_i66_1_, int p_i66_2_, int p_i66_3_, int p_i66_4_)
    {
        this.setTextureSize(p_i66_1_, p_i66_2_);
        this.setTextureOffset(p_i66_3_, p_i66_4_);
    }

    public void copyModelAngles(ModelRenderer modelRendererIn)
    {
        this.rotateAngleX = modelRendererIn.rotateAngleX;
        this.rotateAngleY = modelRendererIn.rotateAngleY;
        this.rotateAngleZ = modelRendererIn.rotateAngleZ;
        this.rotationPointX = modelRendererIn.rotationPointX;
        this.rotationPointY = modelRendererIn.rotationPointY;
        this.rotationPointZ = modelRendererIn.rotationPointZ;
    }

    public void addChild(ModelRenderer renderer)
    {
        this.childModels.add(renderer);
    }

    public ModelRenderer setTextureOffset(int x, int y)
    {
        this.textureOffsetX = x;
        this.textureOffsetY = y;
        return this;
    }

    public ModelRenderer addBox(String partName, float x, float y, float z, int width, int height, int depth, float delta, int texX, int texY)
    {
        this.setTextureOffset(texX, texY);
        this.addBox(this.textureOffsetX, this.textureOffsetY, x, y, z, (float)width, (float)height, (float)depth, delta, delta, delta, this.mirror, false);
        return this;
    }

    public ModelRenderer addBox(float x, float y, float z, float width, float height, float depth)
    {
        this.addBox(this.textureOffsetX, this.textureOffsetY, x, y, z, width, height, depth, 0.0F, 0.0F, 0.0F, this.mirror, false);
        return this;
    }

    public ModelRenderer addBox(float x, float y, float z, float width, float height, float depth, boolean mirrorIn)
    {
        this.addBox(this.textureOffsetX, this.textureOffsetY, x, y, z, width, height, depth, 0.0F, 0.0F, 0.0F, mirrorIn, false);
        return this;
    }

    public void addBox(float x, float y, float z, float width, float height, float depth, float delta)
    {
        this.addBox(this.textureOffsetX, this.textureOffsetY, x, y, z, width, height, depth, delta, delta, delta, this.mirror, false);
    }

    public void addBox(float x, float y, float z, float width, float height, float depth, float deltaX, float deltaY, float deltaZ)
    {
        this.addBox(this.textureOffsetX, this.textureOffsetY, x, y, z, width, height, depth, deltaX, deltaY, deltaZ, this.mirror, false);
    }

    public void addBox(float x, float y, float z, float width, float height, float depth, float delta, boolean mirrorIn)
    {
        this.addBox(this.textureOffsetX, this.textureOffsetY, x, y, z, width, height, depth, delta, delta, delta, mirrorIn, false);
    }

    private void addBox(int texOffX, int texOffY, float x, float y, float z, float width, float height, float depth, float deltaX, float deltaY, float deltaZ, boolean mirorIn, boolean p_228305_13_)
    {
        this.cubeList.add(new ModelRenderer.ModelBox(texOffX, texOffY, x, y, z, width, height, depth, deltaX, deltaY, deltaZ, mirorIn, this.textureWidth, this.textureHeight));
    }

    public void setRotationPoint(float rotationPointXIn, float rotationPointYIn, float rotationPointZIn)
    {
        this.rotationPointX = rotationPointXIn;
        this.rotationPointY = rotationPointYIn;
        this.rotationPointZ = rotationPointZIn;
    }

    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn)
    {
        this.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
    }

    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
        if (this.showModel && (!this.cubeList.isEmpty() || !this.childModels.isEmpty() || !this.spriteList.isEmpty()))
        {
            RenderType rendertype = null;
            IRenderTypeBuffer.Impl irendertypebuffer$impl = null;

            if (this.textureLocation != null && bufferIn instanceof BufferBuilder)
            {
                BufferBuilder bufferbuilder = (BufferBuilder)bufferIn;
                irendertypebuffer$impl = bufferbuilder.getRenderTypeBuffer();

                if (irendertypebuffer$impl != null)
                {
                    rendertype = irendertypebuffer$impl.getLastRenderType();
                    bufferIn = irendertypebuffer$impl.getBuffer(this.textureLocation);
                }
            }

            if (this.modelUpdater != null)
            {
                this.modelUpdater.update();
            }

            matrixStackIn.push();
            this.translateRotate(matrixStackIn);
            this.doRender(matrixStackIn.getLast(), bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            int j = this.childModels.size();

            for (int i = 0; i < j; ++i)
            {
                ModelRenderer modelrenderer = this.childModels.get(i);
                modelrenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            }

            int k = this.spriteList.size();

            for (int l = 0; l < k; ++l)
            {
                ModelSprite modelsprite = (ModelSprite)this.spriteList.get(l);
                modelsprite.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            }

            matrixStackIn.pop();

            if (rendertype != null)
            {
                irendertypebuffer$impl.getBuffer(rendertype);
            }
        }
    }

    public void translateRotate(MatrixStack matrixStackIn)
    {
        matrixStackIn.translate((double)(this.rotationPointX / 16.0F), (double)(this.rotationPointY / 16.0F), (double)(this.rotationPointZ / 16.0F));

        if (this.rotateAngleZ != 0.0F)
        {
            matrixStackIn.rotate(Vector3f.ZP.rotation(this.rotateAngleZ));
        }

        if (this.rotateAngleY != 0.0F)
        {
            matrixStackIn.rotate(Vector3f.YP.rotation(this.rotateAngleY));
        }

        if (this.rotateAngleX != 0.0F)
        {
            matrixStackIn.rotate(Vector3f.XP.rotation(this.rotateAngleX));
        }
    }

    private void doRender(MatrixStack.Entry matrixEntryIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
        Matrix4f matrix4f = matrixEntryIn.getMatrix();
        Matrix3f matrix3f = matrixEntryIn.getNormal();
        int i = this.cubeList.size();

        for (int j = 0; j < i; ++j)
        {
            ModelRenderer.ModelBox modelrenderer$modelbox = this.cubeList.get(j);
            int k = modelrenderer$modelbox.quads.length;

            for (int l = 0; l < k; ++l)
            {
                ModelRenderer.TexturedQuad modelrenderer$texturedquad = modelrenderer$modelbox.quads[l];

                if (modelrenderer$texturedquad != null)
                {
                    Vector3f vector3f = bufferIn.getTempVec3f(modelrenderer$texturedquad.normal);
                    vector3f.transform(matrix3f);
                    float f = vector3f.getX();
                    float f1 = vector3f.getY();
                    float f2 = vector3f.getZ();

                    for (int i1 = 0; i1 < 4; ++i1)
                    {
                        ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex = modelrenderer$texturedquad.vertexPositions[i1];
                        float f3 = modelrenderer$positiontexturevertex.position.getX() / 16.0F;
                        float f4 = modelrenderer$positiontexturevertex.position.getY() / 16.0F;
                        float f5 = modelrenderer$positiontexturevertex.position.getZ() / 16.0F;
                        float f6 = matrix4f.getTransformX(f3, f4, f5, 1.0F);
                        float f7 = matrix4f.getTransformY(f3, f4, f5, 1.0F);
                        float f8 = matrix4f.getTransformZ(f3, f4, f5, 1.0F);
                        bufferIn.addVertex(f6, f7, f8, red, green, blue, alpha, modelrenderer$positiontexturevertex.textureU, modelrenderer$positiontexturevertex.textureV, packedOverlayIn, packedLightIn, f, f1, f2);
                    }
                }
            }
        }
    }

    public ModelRenderer setTextureSize(int textureWidthIn, int textureHeightIn)
    {
        this.textureWidth = (float)textureWidthIn;
        this.textureHeight = (float)textureHeightIn;
        return this;
    }

    public ModelRenderer.ModelBox getRandomCube(Random randomIn)
    {
        return this.cubeList.get(randomIn.nextInt(this.cubeList.size()));
    }

    public void addSprite(float p_addSprite_1_, float p_addSprite_2_, float p_addSprite_3_, int p_addSprite_4_, int p_addSprite_5_, int p_addSprite_6_, float p_addSprite_7_)
    {
        this.spriteList.add(new ModelSprite(this, this.textureOffsetX, this.textureOffsetY, p_addSprite_1_, p_addSprite_2_, p_addSprite_3_, p_addSprite_4_, p_addSprite_5_, p_addSprite_6_, p_addSprite_7_));
    }

    public ResourceLocation getTextureLocation()
    {
        return this.textureLocation;
    }

    public void setTextureLocation(ResourceLocation p_setTextureLocation_1_)
    {
        this.textureLocation = p_setTextureLocation_1_;
    }

    public String getId()
    {
        return this.id;
    }

    public void setId(String p_setId_1_)
    {
        this.id = p_setId_1_;
    }

    public void addBox(int[][] p_addBox_1_, float p_addBox_2_, float p_addBox_3_, float p_addBox_4_, float p_addBox_5_, float p_addBox_6_, float p_addBox_7_, float p_addBox_8_)
    {
        this.cubeList.add(new ModelRenderer.ModelBox(p_addBox_1_, p_addBox_2_, p_addBox_3_, p_addBox_4_, p_addBox_5_, p_addBox_6_, p_addBox_7_, p_addBox_8_, p_addBox_8_, p_addBox_8_, this.mirror, this.textureWidth, this.textureHeight));
    }

    public ModelRenderer getChild(int p_getChild_1_)
    {
        if (this.childModels == null)
        {
            return null;
        }
        else
        {
            return p_getChild_1_ >= 0 && p_getChild_1_ < this.childModels.size() ? this.childModels.get(p_getChild_1_) : null;
        }
    }

    public ModelRenderer getChild(String p_getChild_1_)
    {
        if (p_getChild_1_ == null)
        {
            return null;
        }
        else
        {
            if (this.childModels != null)
            {
                for (int i = 0; i < this.childModels.size(); ++i)
                {
                    ModelRenderer modelrenderer = this.childModels.get(i);

                    if (p_getChild_1_.equals(modelrenderer.getId()))
                    {
                        return modelrenderer;
                    }
                }
            }

            return null;
        }
    }

    public ModelRenderer getChildDeep(String p_getChildDeep_1_)
    {
        if (p_getChildDeep_1_ == null)
        {
            return null;
        }
        else
        {
            ModelRenderer modelrenderer = this.getChild(p_getChildDeep_1_);

            if (modelrenderer != null)
            {
                return modelrenderer;
            }
            else
            {
                if (this.childModels != null)
                {
                    for (int i = 0; i < this.childModels.size(); ++i)
                    {
                        ModelRenderer modelrenderer1 = this.childModels.get(i);
                        ModelRenderer modelrenderer2 = modelrenderer1.getChildDeep(p_getChildDeep_1_);

                        if (modelrenderer2 != null)
                        {
                            return modelrenderer2;
                        }
                    }
                }

                return null;
            }
        }
    }

    public void setModelUpdater(ModelUpdater p_setModelUpdater_1_)
    {
        this.modelUpdater = p_setModelUpdater_1_;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("id: " + this.id + ", boxes: " + (this.cubeList != null ? this.cubeList.size() : null) + ", submodels: " + (this.childModels != null ? this.childModels.size() : null));
        return stringbuffer.toString();
    }

    public static class ModelBox
    {
        private final ModelRenderer.TexturedQuad[] quads;
        public final float posX1;
        public final float posY1;
        public final float posZ1;
        public final float posX2;
        public final float posY2;
        public final float posZ2;

        public ModelBox(int p_i92_1_, int p_i92_2_, float p_i92_3_, float p_i92_4_, float p_i92_5_, float p_i92_6_, float p_i92_7_, float p_i92_8_, float p_i92_9_, float p_i92_10_, float p_i92_11_, boolean p_i92_12_, float p_i92_13_, float p_i92_14_)
        {
            this.posX1 = p_i92_3_;
            this.posY1 = p_i92_4_;
            this.posZ1 = p_i92_5_;
            this.posX2 = p_i92_3_ + p_i92_6_;
            this.posY2 = p_i92_4_ + p_i92_7_;
            this.posZ2 = p_i92_5_ + p_i92_8_;
            this.quads = new ModelRenderer.TexturedQuad[6];
            float f = p_i92_3_ + p_i92_6_;
            float f1 = p_i92_4_ + p_i92_7_;
            float f2 = p_i92_5_ + p_i92_8_;
            p_i92_3_ = p_i92_3_ - p_i92_9_;
            p_i92_4_ = p_i92_4_ - p_i92_10_;
            p_i92_5_ = p_i92_5_ - p_i92_11_;
            f = f + p_i92_9_;
            f1 = f1 + p_i92_10_;
            f2 = f2 + p_i92_11_;

            if (p_i92_12_)
            {
                float f3 = f;
                f = p_i92_3_;
                p_i92_3_ = f3;
            }

            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex7 = new ModelRenderer.PositionTextureVertex(p_i92_3_, p_i92_4_, p_i92_5_, 0.0F, 0.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex = new ModelRenderer.PositionTextureVertex(f, p_i92_4_, p_i92_5_, 0.0F, 8.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex1 = new ModelRenderer.PositionTextureVertex(f, f1, p_i92_5_, 8.0F, 8.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex2 = new ModelRenderer.PositionTextureVertex(p_i92_3_, f1, p_i92_5_, 8.0F, 0.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex3 = new ModelRenderer.PositionTextureVertex(p_i92_3_, p_i92_4_, f2, 0.0F, 0.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex4 = new ModelRenderer.PositionTextureVertex(f, p_i92_4_, f2, 0.0F, 8.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex5 = new ModelRenderer.PositionTextureVertex(f, f1, f2, 8.0F, 8.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex6 = new ModelRenderer.PositionTextureVertex(p_i92_3_, f1, f2, 8.0F, 0.0F);
            float f4 = (float)p_i92_1_;
            float f5 = (float)p_i92_1_ + p_i92_8_;
            float f6 = (float)p_i92_1_ + p_i92_8_ + p_i92_6_;
            float f7 = (float)p_i92_1_ + p_i92_8_ + p_i92_6_ + p_i92_6_;
            float f8 = (float)p_i92_1_ + p_i92_8_ + p_i92_6_ + p_i92_8_;
            float f9 = (float)p_i92_1_ + p_i92_8_ + p_i92_6_ + p_i92_8_ + p_i92_6_;
            float f10 = (float)p_i92_2_;
            float f11 = (float)p_i92_2_ + p_i92_8_;
            float f12 = (float)p_i92_2_ + p_i92_8_ + p_i92_7_;
            this.quads[2] = new ModelRenderer.TexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex}, f5, f10, f6, f11, p_i92_13_, p_i92_14_, p_i92_12_, Direction.DOWN);
            this.quads[3] = new ModelRenderer.TexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex1, modelrenderer$positiontexturevertex2, modelrenderer$positiontexturevertex6, modelrenderer$positiontexturevertex5}, f6, f11, f7, f10, p_i92_13_, p_i92_14_, p_i92_12_, Direction.UP);
            this.quads[1] = new ModelRenderer.TexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex6, modelrenderer$positiontexturevertex2}, f4, f11, f5, f12, p_i92_13_, p_i92_14_, p_i92_12_, Direction.WEST);
            this.quads[4] = new ModelRenderer.TexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex, modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex2, modelrenderer$positiontexturevertex1}, f5, f11, f6, f12, p_i92_13_, p_i92_14_, p_i92_12_, Direction.NORTH);
            this.quads[0] = new ModelRenderer.TexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex, modelrenderer$positiontexturevertex1, modelrenderer$positiontexturevertex5}, f6, f11, f8, f12, p_i92_13_, p_i92_14_, p_i92_12_, Direction.EAST);
            this.quads[5] = new ModelRenderer.TexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex5, modelrenderer$positiontexturevertex6}, f8, f11, f9, f12, p_i92_13_, p_i92_14_, p_i92_12_, Direction.SOUTH);
        }

        public ModelBox(int[][] p_i93_1_, float p_i93_2_, float p_i93_3_, float p_i93_4_, float p_i93_5_, float p_i93_6_, float p_i93_7_, float p_i93_8_, float p_i93_9_, float p_i93_10_, boolean p_i93_11_, float p_i93_12_, float p_i93_13_)
        {
            this.posX1 = p_i93_2_;
            this.posY1 = p_i93_3_;
            this.posZ1 = p_i93_4_;
            this.posX2 = p_i93_2_ + p_i93_5_;
            this.posY2 = p_i93_3_ + p_i93_6_;
            this.posZ2 = p_i93_4_ + p_i93_7_;
            this.quads = new ModelRenderer.TexturedQuad[6];
            float f = p_i93_2_ + p_i93_5_;
            float f1 = p_i93_3_ + p_i93_6_;
            float f2 = p_i93_4_ + p_i93_7_;
            p_i93_2_ = p_i93_2_ - p_i93_8_;
            p_i93_3_ = p_i93_3_ - p_i93_9_;
            p_i93_4_ = p_i93_4_ - p_i93_10_;
            f = f + p_i93_8_;
            f1 = f1 + p_i93_9_;
            f2 = f2 + p_i93_10_;

            if (p_i93_11_)
            {
                float f3 = f;
                f = p_i93_2_;
                p_i93_2_ = f3;
            }

            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex7 = new ModelRenderer.PositionTextureVertex(p_i93_2_, p_i93_3_, p_i93_4_, 0.0F, 0.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex = new ModelRenderer.PositionTextureVertex(f, p_i93_3_, p_i93_4_, 0.0F, 8.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex1 = new ModelRenderer.PositionTextureVertex(f, f1, p_i93_4_, 8.0F, 8.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex2 = new ModelRenderer.PositionTextureVertex(p_i93_2_, f1, p_i93_4_, 8.0F, 0.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex3 = new ModelRenderer.PositionTextureVertex(p_i93_2_, p_i93_3_, f2, 0.0F, 0.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex4 = new ModelRenderer.PositionTextureVertex(f, p_i93_3_, f2, 0.0F, 8.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex5 = new ModelRenderer.PositionTextureVertex(f, f1, f2, 8.0F, 8.0F);
            ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex6 = new ModelRenderer.PositionTextureVertex(p_i93_2_, f1, f2, 8.0F, 0.0F);
            this.quads[2] = this.makeTexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex}, p_i93_1_[1], true, p_i93_12_, p_i93_13_, p_i93_11_, Direction.DOWN);
            this.quads[3] = this.makeTexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex1, modelrenderer$positiontexturevertex2, modelrenderer$positiontexturevertex6, modelrenderer$positiontexturevertex5}, p_i93_1_[0], true, p_i93_12_, p_i93_13_, p_i93_11_, Direction.UP);
            this.quads[1] = this.makeTexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex6, modelrenderer$positiontexturevertex2}, p_i93_1_[5], false, p_i93_12_, p_i93_13_, p_i93_11_, Direction.WEST);
            this.quads[4] = this.makeTexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex, modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex2, modelrenderer$positiontexturevertex1}, p_i93_1_[2], false, p_i93_12_, p_i93_13_, p_i93_11_, Direction.NORTH);
            this.quads[0] = this.makeTexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex, modelrenderer$positiontexturevertex1, modelrenderer$positiontexturevertex5}, p_i93_1_[4], false, p_i93_12_, p_i93_13_, p_i93_11_, Direction.EAST);
            this.quads[5] = this.makeTexturedQuad(new ModelRenderer.PositionTextureVertex[] {modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex5, modelrenderer$positiontexturevertex6}, p_i93_1_[3], false, p_i93_12_, p_i93_13_, p_i93_11_, Direction.SOUTH);
        }

        private ModelRenderer.TexturedQuad makeTexturedQuad(ModelRenderer.PositionTextureVertex[] p_makeTexturedQuad_1_, int[] p_makeTexturedQuad_2_, boolean p_makeTexturedQuad_3_, float p_makeTexturedQuad_4_, float p_makeTexturedQuad_5_, boolean p_makeTexturedQuad_6_, Direction p_makeTexturedQuad_7_)
        {
            if (p_makeTexturedQuad_2_ == null)
            {
                return null;
            }
            else
            {
                return p_makeTexturedQuad_3_ ? new ModelRenderer.TexturedQuad(p_makeTexturedQuad_1_, (float)p_makeTexturedQuad_2_[2], (float)p_makeTexturedQuad_2_[3], (float)p_makeTexturedQuad_2_[0], (float)p_makeTexturedQuad_2_[1], p_makeTexturedQuad_4_, p_makeTexturedQuad_5_, p_makeTexturedQuad_6_, p_makeTexturedQuad_7_) : new ModelRenderer.TexturedQuad(p_makeTexturedQuad_1_, (float)p_makeTexturedQuad_2_[0], (float)p_makeTexturedQuad_2_[1], (float)p_makeTexturedQuad_2_[2], (float)p_makeTexturedQuad_2_[3], p_makeTexturedQuad_4_, p_makeTexturedQuad_5_, p_makeTexturedQuad_6_, p_makeTexturedQuad_7_);
            }
        }
    }

    static class PositionTextureVertex
    {
        public final Vector3f position;
        public final float textureU;
        public final float textureV;

        public PositionTextureVertex(float p_i156_1_, float p_i156_2_, float p_i156_3_, float p_i156_4_, float p_i156_5_)
        {
            this(new Vector3f(p_i156_1_, p_i156_2_, p_i156_3_), p_i156_4_, p_i156_5_);
        }

        public ModelRenderer.PositionTextureVertex setTextureUV(float texU, float texV)
        {
            return new ModelRenderer.PositionTextureVertex(this.position, texU, texV);
        }

        public PositionTextureVertex(Vector3f p_i157_1_, float p_i157_2_, float p_i157_3_)
        {
            this.position = p_i157_1_;
            this.textureU = p_i157_2_;
            this.textureV = p_i157_3_;
        }
    }

    static class TexturedQuad
    {
        public final ModelRenderer.PositionTextureVertex[] vertexPositions;
        public final Vector3f normal;

        public TexturedQuad(ModelRenderer.PositionTextureVertex[] p_i178_1_, float p_i178_2_, float p_i178_3_, float p_i178_4_, float p_i178_5_, float p_i178_6_, float p_i178_7_, boolean p_i178_8_, Direction p_i178_9_)
        {
            this.vertexPositions = p_i178_1_;
            float f = 0.0F / p_i178_6_;
            float f1 = 0.0F / p_i178_7_;
            p_i178_1_[0] = p_i178_1_[0].setTextureUV(p_i178_4_ / p_i178_6_ - f, p_i178_3_ / p_i178_7_ + f1);
            p_i178_1_[1] = p_i178_1_[1].setTextureUV(p_i178_2_ / p_i178_6_ + f, p_i178_3_ / p_i178_7_ + f1);
            p_i178_1_[2] = p_i178_1_[2].setTextureUV(p_i178_2_ / p_i178_6_ + f, p_i178_5_ / p_i178_7_ - f1);
            p_i178_1_[3] = p_i178_1_[3].setTextureUV(p_i178_4_ / p_i178_6_ - f, p_i178_5_ / p_i178_7_ - f1);

            if (p_i178_8_)
            {
                int i = p_i178_1_.length;

                for (int j = 0; j < i / 2; ++j)
                {
                    ModelRenderer.PositionTextureVertex modelrenderer$positiontexturevertex = p_i178_1_[j];
                    p_i178_1_[j] = p_i178_1_[i - 1 - j];
                    p_i178_1_[i - 1 - j] = modelrenderer$positiontexturevertex;
                }
            }

            this.normal = p_i178_9_.toVector3f();

            if (p_i178_8_)
            {
                this.normal.mul(-1.0F, 1.0F, 1.0F);
            }
        }
    }
}
