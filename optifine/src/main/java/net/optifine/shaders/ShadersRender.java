package net.optifine.shaders;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.FirstPersonRenderer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.tileentity.SignTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.tileentity.EndPortalTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.optifine.reflect.Reflector;
import net.optifine.render.GlBlendState;
import net.optifine.render.GlCullState;
import net.optifine.render.ICamera;
import net.optifine.render.RenderTypes;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class ShadersRender
{
    private static final ResourceLocation END_PORTAL_TEXTURE = new ResourceLocation("textures/entity/end_portal.png");

    public static void setFrustrumPosition(ICamera frustum, double x, double y, double z)
    {
        frustum.setCameraPosition(x, y, z);
    }

    public static void beginTerrainSolid()
    {
        if (Shaders.isRenderingWorld)
        {
            Shaders.fogEnabled = true;
            Shaders.useProgram(Shaders.ProgramTerrain);
        }
    }

    public static void beginTerrainCutoutMipped()
    {
        if (Shaders.isRenderingWorld)
        {
            Shaders.useProgram(Shaders.ProgramTerrain);
        }
    }

    public static void beginTerrainCutout()
    {
        if (Shaders.isRenderingWorld)
        {
            Shaders.useProgram(Shaders.ProgramTerrain);
        }
    }

    public static void endTerrain()
    {
        if (Shaders.isRenderingWorld)
        {
            Shaders.useProgram(Shaders.ProgramTexturedLit);
        }
    }

    public static void beginTranslucent()
    {
        if (Shaders.isRenderingWorld)
        {
            Shaders.useProgram(Shaders.ProgramWater);
        }
    }

    public static void endTranslucent()
    {
        if (Shaders.isRenderingWorld)
        {
            Shaders.useProgram(Shaders.ProgramTexturedLit);
        }
    }

    public static void renderHand0(GameRenderer er, MatrixStack matrixStackIn, ActiveRenderInfo activeRenderInfo, float partialTicks)
    {
        if (!Shaders.isShadowPass)
        {
            boolean flag = Shaders.isItemToRenderMainTranslucent();
            boolean flag1 = Shaders.isItemToRenderOffTranslucent();

            if (!flag || !flag1)
            {
                Shaders.readCenterDepth();
                Shaders.beginHand(matrixStackIn, false);
                GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                Shaders.setSkipRenderHands(flag, flag1);
                er.renderHand(matrixStackIn, activeRenderInfo, partialTicks, true, false, false);
                Shaders.endHand(matrixStackIn);
                Shaders.setHandsRendered(!flag, !flag1);
                Shaders.setSkipRenderHands(false, false);
            }
        }
    }

    public static void renderHand1(GameRenderer er, MatrixStack matrixStackIn, ActiveRenderInfo activeRenderInfo, float partialTicks)
    {
        if (!Shaders.isShadowPass && !Shaders.isBothHandsRendered())
        {
            Shaders.readCenterDepth();
            GlStateManager.enableBlend();
            Shaders.beginHand(matrixStackIn, true);
            GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            Shaders.setSkipRenderHands(Shaders.isHandRenderedMain(), Shaders.isHandRenderedOff());
            er.renderHand(matrixStackIn, activeRenderInfo, partialTicks, true, false, true);
            Shaders.endHand(matrixStackIn);
            Shaders.setHandsRendered(true, true);
            Shaders.setSkipRenderHands(false, false);
        }
    }

    public static void renderItemFP(FirstPersonRenderer itemRenderer, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer.Impl bufferIn, ClientPlayerEntity playerEntityIn, int combinedLightIn, boolean renderTranslucent)
    {
        GlStateManager.depthMask(true);

        if (renderTranslucent)
        {
            GlStateManager.depthFunc(519);
            matrixStackIn.push();
            IntBuffer intbuffer = Shaders.activeDrawBuffers;
            Shaders.setDrawBuffers(Shaders.drawBuffersNone);
            Shaders.renderItemKeepDepthMask = true;
            itemRenderer.renderItemInFirstPerson(partialTicks, matrixStackIn, bufferIn, playerEntityIn, combinedLightIn);
            Shaders.renderItemKeepDepthMask = false;
            Shaders.setDrawBuffers(intbuffer);
            matrixStackIn.pop();
        }

        GlStateManager.depthFunc(515);
        GL30.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        itemRenderer.renderItemInFirstPerson(partialTicks, matrixStackIn, bufferIn, playerEntityIn, combinedLightIn);
    }

    public static void renderFPOverlay(GameRenderer er, MatrixStack matrixStackIn, ActiveRenderInfo activeRenderInfo, float partialTicks)
    {
        if (!Shaders.isShadowPass)
        {
            Shaders.beginFPOverlay();
            er.renderHand(matrixStackIn, activeRenderInfo, partialTicks, false, true, false);
            Shaders.endFPOverlay();
        }
    }

    public static void beginBlockDamage()
    {
        if (Shaders.isRenderingWorld)
        {
            Shaders.useProgram(Shaders.ProgramDamagedBlock);

            if (Shaders.ProgramDamagedBlock.getId() == Shaders.ProgramTerrain.getId())
            {
                Shaders.setDrawBuffers(Shaders.drawBuffersColorAtt0);
                GlStateManager.depthMask(false);
            }
        }
    }

    public static void endBlockDamage()
    {
        if (Shaders.isRenderingWorld)
        {
            GlStateManager.depthMask(true);
            Shaders.useProgram(Shaders.ProgramTexturedLit);
        }
    }

    public static void renderShadowMap(GameRenderer entityRenderer, ActiveRenderInfo activeRenderInfo, int pass, float partialTicks, long finishTimeNano)
    {
        if (Shaders.usedShadowDepthBuffers > 0 && --Shaders.shadowPassCounter <= 0)
        {
            Minecraft minecraft = Minecraft.getInstance();
            minecraft.getProfiler().endStartSection("shadow pass");
            WorldRenderer worldrenderer = minecraft.worldRenderer;
            Shaders.isShadowPass = true;
            Shaders.shadowPassCounter = Shaders.shadowPassInterval;
            Shaders.checkGLError("pre shadow");
            GL30.glMatrixMode(5889);
            GL11.glPushMatrix();
            GL30.glMatrixMode(5888);
            GL11.glPushMatrix();
            minecraft.getProfiler().endStartSection("shadow clear");
            EXTFramebufferObject.glBindFramebufferEXT(36160, Shaders.sfb);
            Shaders.checkGLError("shadow bind sfb");
            minecraft.getProfiler().endStartSection("shadow camera");
            updateActiveRenderInfo(activeRenderInfo, minecraft, partialTicks);
            MatrixStack matrixstack = new MatrixStack();
            Shaders.setCameraShadow(matrixstack, activeRenderInfo, partialTicks);
            Shaders.checkGLError("shadow camera");
            Shaders.useProgram(Shaders.ProgramShadow);
            GL30.glDrawBuffers(Shaders.sfbDrawBuffers);
            Shaders.checkGLError("shadow drawbuffers");
            GL30.glReadBuffer(0);
            Shaders.checkGLError("shadow readbuffer");
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Shaders.sfbDepthTextures.get(0), 0);

            if (Shaders.usedShadowColorBuffers != 0)
            {
                EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, Shaders.sfbColorTextures.get(0), 0);
            }

            Shaders.checkFramebufferStatus("shadow fb");
            GL30.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
            GL30.glClear(Shaders.usedShadowColorBuffers != 0 ? 16640 : 256);
            Shaders.checkGLError("shadow clear");
            minecraft.getProfiler().endStartSection("shadow frustum");
            ClippingHelperImpl clippinghelperimpl = new ClippingHelperDummy();
            minecraft.getProfiler().endStartSection("shadow culling");
            Vec3d vec3d = activeRenderInfo.getProjectedView();
            clippinghelperimpl.setCameraPosition(vec3d.x, vec3d.y, vec3d.z);
            GlStateManager.shadeModel(7425);
            GlStateManager.enableDepthTest();
            GlStateManager.depthFunc(515);
            GlStateManager.depthMask(true);
            GlStateManager.colorMask(true, true, true, true);
            GlStateManager.lockCull(new GlCullState(false));
            GlStateManager.lockBlend(new GlBlendState(false));
            minecraft.getProfiler().endStartSection("shadow prepareterrain");
            minecraft.getTextureManager().bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
            minecraft.getProfiler().endStartSection("shadow setupterrain");
            int i = minecraft.worldRenderer.getNextFrameCount();
            worldrenderer.setupTerrain(activeRenderInfo, clippinghelperimpl, false, i, minecraft.player.isSpectator());
            minecraft.getProfiler().endStartSection("shadow updatechunks");
            minecraft.getProfiler().endStartSection("shadow terrain");
            double d0 = vec3d.getX();
            double d1 = vec3d.getY();
            double d2 = vec3d.getZ();
            GlStateManager.matrixMode(5888);
            GlStateManager.pushMatrix();
            GlStateManager.disableAlphaTest();
            worldrenderer.renderBlockLayer(RenderTypes.SOLID, matrixstack, d0, d1, d2);
            Shaders.checkGLError("shadow terrain solid");
            GlStateManager.enableAlphaTest();
            worldrenderer.renderBlockLayer(RenderTypes.CUTOUT_MIPPED, matrixstack, d0, d1, d2);
            Shaders.checkGLError("shadow terrain cutoutmipped");
            minecraft.getTextureManager().getTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE).setBlurMipmapDirect(false, false);
            worldrenderer.renderBlockLayer(RenderTypes.CUTOUT, matrixstack, d0, d1, d2);
            Shaders.checkGLError("shadow terrain cutout");
            minecraft.getTextureManager().getTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
            GlStateManager.shadeModel(7424);
            GlStateManager.alphaFunc(516, 0.1F);
            GlStateManager.matrixMode(5888);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            minecraft.getProfiler().endStartSection("shadow entities");
            WorldRenderer worldrenderer1 = minecraft.worldRenderer;
            EntityRendererManager entityrenderermanager = minecraft.getRenderManager();
            IRenderTypeBuffer.Impl irendertypebuffer$impl = worldrenderer1.getRenderTypeTextures().getBufferSource();
            boolean flag = Shaders.isShadowPass && !minecraft.player.isSpectator();

            for (Entity entity : minecraft.world.getAllEntities())
            {
                if ((entityrenderermanager.shouldRender(entity, clippinghelperimpl, d0, d1, d2) || entity.isRidingOrBeingRiddenBy(minecraft.player)) && (entity != activeRenderInfo.getRenderViewEntity() || flag || activeRenderInfo.isThirdPerson() || activeRenderInfo.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)activeRenderInfo.getRenderViewEntity()).isSleeping()) && (!(entity instanceof ClientPlayerEntity) || activeRenderInfo.getRenderViewEntity() == entity))
                {
                    worldrenderer1.renderedEntity = entity;
                    Shaders.nextEntity(entity);
                    worldrenderer1.renderEntity(entity, d0, d1, d2, partialTicks, matrixstack, irendertypebuffer$impl);
                    worldrenderer1.renderedEntity = null;
                }
            }

            worldrenderer1.checkMatrixStack(matrixstack);
            irendertypebuffer$impl.finish(RenderType.getEntitySolid(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
            irendertypebuffer$impl.finish(RenderType.getEntityCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
            irendertypebuffer$impl.finish(RenderType.getEntityCutoutNoCull(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
            irendertypebuffer$impl.finish(RenderType.getEntitySmoothCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
            Shaders.endEntities();
            Shaders.beginBlockEntities();
            SignTileEntityRenderer.updateTextRenderDistance();
            boolean flag1 = Reflector.IForgeTileEntity_getRenderBoundingBox.exists();
            ClippingHelperImpl clippinghelperimpl1 = clippinghelperimpl;
            label120:

            for (WorldRenderer.LocalRenderInformationContainer worldrenderer$localrenderinformationcontainer : worldrenderer1.getRenderInfosTileEntities())
            {
                List<TileEntity> list = worldrenderer$localrenderinformationcontainer.renderChunk.getCompiledChunk().getTileEntities();

                if (!list.isEmpty())
                {
                    Iterator iterator = list.iterator();

                    while (true)
                    {
                        TileEntity tileentity;

                        while (true)
                        {
                            if (!iterator.hasNext())
                            {
                                continue label120;
                            }

                            tileentity = (TileEntity)iterator.next();

                            if (!flag1)
                            {
                                break;
                            }

                            AxisAlignedBB axisalignedbb = (AxisAlignedBB)Reflector.call(tileentity, Reflector.IForgeTileEntity_getRenderBoundingBox);

                            if (axisalignedbb == null || clippinghelperimpl1.isBoundingBoxInFrustum(axisalignedbb))
                            {
                                break;
                            }
                        }

                        Shaders.nextBlockEntity(tileentity);
                        BlockPos blockpos = tileentity.getPos();
                        matrixstack.push();
                        matrixstack.translate((double)blockpos.getX() - d0, (double)blockpos.getY() - d1, (double)blockpos.getZ() - d2);
                        TileEntityRendererDispatcher.instance.renderTileEntity(tileentity, partialTicks, matrixstack, irendertypebuffer$impl);
                        matrixstack.pop();
                    }
                }
            }

            worldrenderer1.checkMatrixStack(matrixstack);
            irendertypebuffer$impl.finish(RenderType.getSolid());
            irendertypebuffer$impl.finish(Atlases.getSolidBlockType());
            irendertypebuffer$impl.finish(Atlases.getCutoutBlockType());
            irendertypebuffer$impl.finish(Atlases.getBedType());
            irendertypebuffer$impl.finish(Atlases.getShulkerBoxType());
            irendertypebuffer$impl.finish(Atlases.getSignType());
            irendertypebuffer$impl.finish(Atlases.getChestType());
            irendertypebuffer$impl.finish();
            Shaders.checkGLError("shadow entities");
            GlStateManager.matrixMode(5888);
            GlStateManager.popMatrix();
            GlStateManager.depthMask(true);
            GlStateManager.disableBlend();
            GlStateManager.unlockCull();
            GlStateManager.enableCull();
            GlStateManager.blendFuncSeparate(770, 771, 1, 0);
            GlStateManager.alphaFunc(516, 0.1F);

            if (Shaders.usedShadowDepthBuffers >= 2)
            {
                GlStateManager.activeTexture(33989);
                Shaders.checkGLError("pre copy shadow depth");
                GL11.glCopyTexSubImage2D(GL11.GL_TEXTURE_2D, 0, 0, 0, 0, 0, Shaders.shadowMapWidth, Shaders.shadowMapHeight);
                Shaders.checkGLError("copy shadow depth");
                GlStateManager.activeTexture(33984);
            }

            GlStateManager.disableBlend();
            GlStateManager.depthMask(true);
            minecraft.getTextureManager().bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
            GlStateManager.shadeModel(7425);
            Shaders.checkGLError("shadow pre-translucent");
            GL30.glDrawBuffers(Shaders.sfbDrawBuffers);
            Shaders.checkGLError("shadow drawbuffers pre-translucent");
            Shaders.checkFramebufferStatus("shadow pre-translucent");

            if (Shaders.isRenderShadowTranslucent())
            {
                minecraft.getProfiler().endStartSection("shadow translucent");
                worldrenderer.renderBlockLayer(RenderTypes.TRANSLUCENT, matrixstack, d0, d1, d2);
                Shaders.checkGLError("shadow translucent");
            }

            GlStateManager.unlockBlend();
            GlStateManager.shadeModel(7424);
            GlStateManager.depthMask(true);
            GlStateManager.enableCull();
            GlStateManager.disableBlend();
            GL30.glFlush();
            Shaders.checkGLError("shadow flush");
            Shaders.isShadowPass = false;
            minecraft.getProfiler().endStartSection("shadow postprocess");

            if (Shaders.hasGlGenMipmap)
            {
                if (Shaders.usedShadowDepthBuffers >= 1)
                {
                    if (Shaders.shadowMipmapEnabled[0])
                    {
                        GlStateManager.activeTexture(33988);
                        GlStateManager.bindTexture(Shaders.sfbDepthTextures.get(0));
                        GL30.glGenerateMipmap(3553);
                        GL30.glTexParameteri(3553, 10241, Shaders.shadowFilterNearest[0] ? 9984 : 9987);
                    }

                    if (Shaders.usedShadowDepthBuffers >= 2 && Shaders.shadowMipmapEnabled[1])
                    {
                        GlStateManager.activeTexture(33989);
                        GlStateManager.bindTexture(Shaders.sfbDepthTextures.get(1));
                        GL30.glGenerateMipmap(3553);
                        GL30.glTexParameteri(3553, 10241, Shaders.shadowFilterNearest[1] ? 9984 : 9987);
                    }

                    GlStateManager.activeTexture(33984);
                }

                if (Shaders.usedShadowColorBuffers >= 1)
                {
                    if (Shaders.shadowColorMipmapEnabled[0])
                    {
                        GlStateManager.activeTexture(33997);
                        GlStateManager.bindTexture(Shaders.sfbColorTextures.get(0));
                        GL30.glGenerateMipmap(3553);
                        GL30.glTexParameteri(3553, 10241, Shaders.shadowColorFilterNearest[0] ? 9984 : 9987);
                    }

                    if (Shaders.usedShadowColorBuffers >= 2 && Shaders.shadowColorMipmapEnabled[1])
                    {
                        GlStateManager.activeTexture(33998);
                        GlStateManager.bindTexture(Shaders.sfbColorTextures.get(1));
                        GL30.glGenerateMipmap(3553);
                        GL30.glTexParameteri(3553, 10241, Shaders.shadowColorFilterNearest[1] ? 9984 : 9987);
                    }

                    GlStateManager.activeTexture(33984);
                }
            }

            Shaders.checkGLError("shadow postprocess");
            EXTFramebufferObject.glBindFramebufferEXT(36160, Shaders.dfb);
            GL11.glViewport(0, 0, Shaders.renderWidth, Shaders.renderHeight);
            Shaders.activeDrawBuffers = null;
            minecraft.getTextureManager().bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
            Shaders.useProgram(Shaders.ProgramTerrain);
            GL30.glMatrixMode(5888);
            GL11.glPopMatrix();
            GL30.glMatrixMode(5889);
            GL11.glPopMatrix();
            GL30.glMatrixMode(5888);
            Shaders.checkGLError("shadow end");
        }
    }

    public static void updateActiveRenderInfo(ActiveRenderInfo activeRenderInfo, Minecraft mc, float partialTicks)
    {
        activeRenderInfo.update(mc.world, (Entity)(mc.getRenderViewEntity() == null ? mc.player : mc.getRenderViewEntity()), mc.gameSettings.thirdPersonView > 0, mc.gameSettings.thirdPersonView == 2, partialTicks);
    }

    public static void preRenderChunkLayer(RenderType blockLayerIn)
    {
        if (blockLayerIn == RenderTypes.SOLID)
        {
            beginTerrainSolid();
        }

        if (blockLayerIn == RenderTypes.CUTOUT_MIPPED)
        {
            beginTerrainCutoutMipped();
        }

        if (blockLayerIn == RenderTypes.CUTOUT)
        {
            beginTerrainCutout();
        }

        if (blockLayerIn == RenderTypes.TRANSLUCENT)
        {
            beginTranslucent();
        }

        if (Shaders.isRenderBackFace(blockLayerIn))
        {
            GlStateManager.disableCull();
        }

        if (GLX.useVbo())
        {
            GL20.glEnableVertexAttribArray(Shaders.midTexCoordAttrib);
            GL20.glEnableVertexAttribArray(Shaders.tangentAttrib);
            GL20.glEnableVertexAttribArray(Shaders.entityAttrib);
        }
    }

    public static void postRenderChunkLayer(RenderType blockLayerIn)
    {
        if (GLX.useVbo())
        {
            GL20.glDisableVertexAttribArray(Shaders.midTexCoordAttrib);
            GL20.glDisableVertexAttribArray(Shaders.tangentAttrib);
            GL20.glDisableVertexAttribArray(Shaders.entityAttrib);
        }

        if (Shaders.isRenderBackFace(blockLayerIn))
        {
            GlStateManager.enableCull();
        }
    }

    public static void preRender(RenderType renderType, BufferBuilder buffer)
    {
        if (Shaders.isRenderingWorld)
        {
            if (!Shaders.isShadowPass)
            {
                if (renderType == RenderType.getGlint())
                {
                    renderEnchantedGlintBegin();
                }
                else if (renderType == RenderType.getEntityGlint())
                {
                    renderEnchantedGlintBegin();
                }
                else if (renderType.getName().equals("eyes"))
                {
                    Shaders.beginSpiderEyes();
                }
                else if (renderType.getName().equals("crumbling"))
                {
                    beginBlockDamage();
                }
                else if (renderType == RenderType.LINES)
                {
                    Shaders.beginLeash();
                }
            }
        }
    }

    public static void postRender(RenderType renderType, BufferBuilder buffer)
    {
        if (Shaders.isRenderingWorld)
        {
            if (!Shaders.isShadowPass)
            {
                if (renderType == RenderType.getGlint())
                {
                    renderEnchantedGlintEnd();
                }
                else if (renderType == RenderType.getEntityGlint())
                {
                    renderEnchantedGlintEnd();
                }
                else if (renderType.getName().equals("eyes"))
                {
                    Shaders.endSpiderEyes();
                }
                else if (renderType.getName().equals("crumbling"))
                {
                    endBlockDamage();
                }
                else if (renderType == RenderType.LINES)
                {
                    Shaders.endLeash();
                }
            }
        }
    }

    public static void setupArrayPointersVbo()
    {
        int i = 16;
        GL20.glVertexAttribPointer(Shaders.midTexCoordAttrib, 2, GL11.GL_FLOAT, false, 64, 36L);
        GL20.glVertexAttribPointer(Shaders.tangentAttrib, 4, GL11.GL_SHORT, false, 64, 44L);
        GL20.glVertexAttribPointer(Shaders.entityAttrib, 3, GL11.GL_SHORT, false, 64, 52L);
    }

    public static void beaconBeamBegin()
    {
        Shaders.useProgram(Shaders.ProgramBeaconBeam);
    }

    public static void beaconBeamStartQuad1()
    {
    }

    public static void beaconBeamStartQuad2()
    {
    }

    public static void beaconBeamDraw1()
    {
    }

    public static void beaconBeamDraw2()
    {
        GlStateManager.disableBlend();
    }

    public static void renderEnchantedGlintBegin()
    {
        Shaders.useProgram(Shaders.ProgramArmorGlint);
    }

    public static void renderEnchantedGlintEnd()
    {
        if (Shaders.isRenderingWorld)
        {
            if (Shaders.isRenderingFirstPersonHand() && Shaders.isRenderBothHands())
            {
                Shaders.useProgram(Shaders.ProgramHand);
            }
            else
            {
                Shaders.useProgram(Shaders.ProgramEntities);
            }
        }
        else
        {
            Shaders.useProgram(Shaders.ProgramNone);
        }
    }

    public static boolean renderEndPortal(EndPortalTileEntity te, float partialTicks, float offset, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn)
    {
        if (!Shaders.isShadowPass && Shaders.activeProgram.getId() == 0)
        {
            return false;
        }
        else
        {
            GlStateManager.disableLighting();
            MatrixStack.Entry matrixstack$entry = matrixStackIn.getLast();
            Matrix4f matrix4f = matrixstack$entry.getMatrix();
            Matrix3f matrix3f = matrixstack$entry.getNormal();
            IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEntitySolid(END_PORTAL_TEXTURE));
            float f = 0.5F;
            float f1 = f * 0.15F;
            float f2 = f * 0.3F;
            float f3 = f * 0.4F;
            float f4 = 0.0F;
            float f5 = 0.2F;
            float f6 = (float)(System.currentTimeMillis() % 100000L) / 100000.0F;
            float f7 = 0.0F;
            float f8 = 0.0F;
            float f9 = 0.0F;

            if (te.shouldRenderFace(Direction.SOUTH))
            {
                Vec3i vec3i = Direction.SOUTH.getDirectionVec();
                float f10 = (float)vec3i.getX();
                float f11 = (float)vec3i.getY();
                float f12 = (float)vec3i.getZ();
                float f13 = matrix3f.getTransformX(f10, f11, f12);
                float f14 = matrix3f.getTransformY(f10, f11, f12);
                float f15 = matrix3f.getTransformZ(f10, f11, f12);
                ivertexbuilder.pos(matrix4f, f7, f8, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f4 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f13, f14, f15).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f4 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f13, f14, f15).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8 + 1.0F, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f5 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f13, f14, f15).endVertex();
                ivertexbuilder.pos(matrix4f, f7, f8 + 1.0F, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f5 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f13, f14, f15).endVertex();
            }

            if (te.shouldRenderFace(Direction.NORTH))
            {
                Vec3i vec3i1 = Direction.NORTH.getDirectionVec();
                float f16 = (float)vec3i1.getX();
                float f21 = (float)vec3i1.getY();
                float f26 = (float)vec3i1.getZ();
                float f31 = matrix3f.getTransformX(f16, f21, f26);
                float f36 = matrix3f.getTransformY(f16, f21, f26);
                float f41 = matrix3f.getTransformZ(f16, f21, f26);
                ivertexbuilder.pos(matrix4f, f7, f8 + 1.0F, f9).color(f1, f2, f3, 1.0F).tex(f5 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f31, f36, f41).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8 + 1.0F, f9).color(f1, f2, f3, 1.0F).tex(f5 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f31, f36, f41).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8, f9).color(f1, f2, f3, 1.0F).tex(f4 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f31, f36, f41).endVertex();
                ivertexbuilder.pos(matrix4f, f7, f8, f9).color(f1, f2, f3, 1.0F).tex(f4 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f31, f36, f41).endVertex();
            }

            if (te.shouldRenderFace(Direction.EAST))
            {
                Vec3i vec3i2 = Direction.EAST.getDirectionVec();
                float f17 = (float)vec3i2.getX();
                float f22 = (float)vec3i2.getY();
                float f27 = (float)vec3i2.getZ();
                float f32 = matrix3f.getTransformX(f17, f22, f27);
                float f37 = matrix3f.getTransformY(f17, f22, f27);
                float f42 = matrix3f.getTransformZ(f17, f22, f27);
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8 + 1.0F, f9).color(f1, f2, f3, 1.0F).tex(f5 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f32, f37, f42).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8 + 1.0F, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f5 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f32, f37, f42).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f4 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f32, f37, f42).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8, f9).color(f1, f2, f3, 1.0F).tex(f4 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f32, f37, f42).endVertex();
            }

            if (te.shouldRenderFace(Direction.WEST))
            {
                Vec3i vec3i3 = Direction.WEST.getDirectionVec();
                float f18 = (float)vec3i3.getX();
                float f23 = (float)vec3i3.getY();
                float f28 = (float)vec3i3.getZ();
                float f33 = matrix3f.getTransformX(f18, f23, f28);
                float f38 = matrix3f.getTransformY(f18, f23, f28);
                float f43 = matrix3f.getTransformZ(f18, f23, f28);
                ivertexbuilder.pos(matrix4f, f7, f8, f9).color(f1, f2, f3, 1.0F).tex(f4 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f33, f38, f43).endVertex();
                ivertexbuilder.pos(matrix4f, f7, f8, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f4 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f33, f38, f43).endVertex();
                ivertexbuilder.pos(matrix4f, f7, f8 + 1.0F, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f5 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f33, f38, f43).endVertex();
                ivertexbuilder.pos(matrix4f, f7, f8 + 1.0F, f9).color(f1, f2, f3, 1.0F).tex(f5 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f33, f38, f43).endVertex();
            }

            if (te.shouldRenderFace(Direction.DOWN))
            {
                Vec3i vec3i4 = Direction.DOWN.getDirectionVec();
                float f19 = (float)vec3i4.getX();
                float f24 = (float)vec3i4.getY();
                float f29 = (float)vec3i4.getZ();
                float f34 = matrix3f.getTransformX(f19, f24, f29);
                float f39 = matrix3f.getTransformY(f19, f24, f29);
                float f44 = matrix3f.getTransformZ(f19, f24, f29);
                ivertexbuilder.pos(matrix4f, f7, f8, f9).color(f1, f2, f3, 1.0F).tex(f4 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f34, f39, f44).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8, f9).color(f1, f2, f3, 1.0F).tex(f4 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f34, f39, f44).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f5 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f34, f39, f44).endVertex();
                ivertexbuilder.pos(matrix4f, f7, f8, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f5 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f34, f39, f44).endVertex();
            }

            if (te.shouldRenderFace(Direction.UP))
            {
                Vec3i vec3i5 = Direction.UP.getDirectionVec();
                float f20 = (float)vec3i5.getX();
                float f25 = (float)vec3i5.getY();
                float f30 = (float)vec3i5.getZ();
                float f35 = matrix3f.getTransformX(f20, f25, f30);
                float f40 = matrix3f.getTransformY(f20, f25, f30);
                float f45 = matrix3f.getTransformZ(f20, f25, f30);
                ivertexbuilder.pos(matrix4f, f7, f8 + offset, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f4 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f35, f40, f45).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8 + offset, f9 + 1.0F).color(f1, f2, f3, 1.0F).tex(f4 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f35, f40, f45).endVertex();
                ivertexbuilder.pos(matrix4f, f7 + 1.0F, f8 + offset, f9).color(f1, f2, f3, 1.0F).tex(f5 + f6, f5 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f35, f40, f45).endVertex();
                ivertexbuilder.pos(matrix4f, f7, f8 + offset, f9).color(f1, f2, f3, 1.0F).tex(f5 + f6, f4 + f6).overlay(combinedOverlayIn).lightmap(combinedLightIn).normal(f35, f40, f45).endVertex();
            }

            GlStateManager.enableLighting();
            return true;
        }
    }
}
