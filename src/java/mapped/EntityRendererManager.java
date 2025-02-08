package mapped;

import com.google.common.collect.Maps;
import com.mentalfrostbyte.jello.module.impl.render.FPSBooster;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.block.BlockState;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonPartEntity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.optifine.Config;
import net.optifine.DynamicLights;
import net.optifine.entity.model.CustomEntityModels;
import net.optifine.shaders.Shaders;

import java.util.Collections;
import java.util.Map;

public class EntityRendererManager {
    private static final RenderType field40010 = RenderType.method14323(new ResourceLocation("textures/misc/shadow.png"));
    private final Map<EntityType<?>, EntityRenderer<?>> field40011 = Maps.newHashMap();
    private final Map<String, PlayerRenderer> field40012 = Maps.newHashMap();
    private final PlayerRenderer field40013;
    private final FontRenderer field40014;
    public final TextureManager field40015;
    private World world;
    public ActiveRenderInfo info;
    private Quaternion field40018;
    public Entity field40019;
    public final GameSettings options;
    private boolean renderShadow = true;
    private boolean debugBoundingBox;
    public EntityRenderer renderRender = null;

    public <E extends Entity> int method32208(E var1, float var2) {
        int var5 = this.<Entity>getRenderer(var1).method17894(var1, var2);
        if (Config.isDynamicLights()) {
            var5 = DynamicLights.method36315(var1, var5);
        }

        return var5;
    }

    private <T extends Entity> void method32209(EntityType<T> var1, EntityRenderer<? super T> var2) {
        this.field40011.put(var1, var2);
    }

    private void method32210(ItemRenderer var1, IReloadableResourceManager var2) {
        this.method32209(EntityType.AREA_EFFECT_CLOUD, new Class5741(this));
        this.method32209(EntityType.ARMOR_STAND, new Class5742(this));
        this.method32209(EntityType.ARROW, new Class5728(this));
        this.method32209(EntityType.BAT, new Class5653(this));
        this.method32209(EntityType.BEE, new Class5705(this));
        this.method32209(EntityType.BLAZE, new Class5710(this));
        this.method32209(EntityType.BOAT, new Class5725(this));
        this.method32209(EntityType.CAT, new Class5747(this));
        this.method32209(EntityType.CAVE_SPIDER, new Class5703(this));
        this.method32209(EntityType.CHEST_MINECART, new Class5732(this));
        this.method32209(EntityType.CHICKEN, new Class5745(this));
        this.method32209(EntityType.COD, new Class5695(this));
        this.method32209(EntityType.COMMAND_BLOCK_MINECART, new Class5732(this));
        this.method32209(EntityType.COW, new Class5699(this));
        this.method32209(EntityType.CREEPER, new Class5698(this));
        this.method32209(EntityType.DOLPHIN, new Class5654(this));
        this.method32209(EntityType.DONKEY, new Class5687(this, 0.87F));
        this.method32209(EntityType.DRAGON_FIREBALL, new Class5720(this));
        this.method32209(EntityType.DROWNED, new Class5665(this));
        this.method32209(EntityType.EGG, new Class5735(this, var1));
        this.method32209(EntityType.ELDER_GUARDIAN, new Class5659(this));
        this.method32209(EntityType.field41023, new Class5723(this));
        this.method32209(EntityType.ENDER_DRAGON, new Class5718(this));
        this.method32209(EntityType.ENDERMAN, new Class5674(this));
        this.method32209(EntityType.ENDERMITE, new Class5673(this));
        this.method32209(EntityType.ENDER_PEARL, new Class5735(this, var1));
        this.method32209(EntityType.EVOKER_FANGS, new Class5722(this));
        this.method32209(EntityType.EVOKER, new Class5677(this));
        this.method32209(EntityType.EXPERIENCE_BOTTLE, new Class5735(this, var1));
        this.method32209(EntityType.EXPERIENCE_ORB, new Class5731(this));
        this.method32209(EntityType.EYE_OF_ENDER, new Class5735(this, var1, 1.0F, true));
        this.method32209(EntityType.FALLING_BLOCK, new Class5721(this));
        this.method32209(EntityType.FIREBALL, new Class5735(this, var1, 3.0F, true));
        this.method32209(EntityType.FIREWORK_ROCKET, new Class5726(this, var1));
        this.method32209(EntityType.FISHING_BOBBER, new Class5738(this));
        this.method32209(EntityType.FOX, new Class5650(this));
        this.method32209(EntityType.FURNACE_MINECART, new Class5732(this));
        this.method32209(EntityType.GHAST, new Class5684(this));
        this.method32209(EntityType.GIANT, new Class5744(this, 6.0F));
        this.method32209(EntityType.GUARDIAN, new Class5658(this));
        this.method32209(EntityType.HOGLIN, new Class5706(this));
        this.method32209(EntityType.HOPPER_MINECART, new Class5732(this));
        this.method32209(EntityType.HORSE, new Class5688(this));
        this.method32209(EntityType.HUSK, new Class5664(this));
        this.method32209(EntityType.ILLUSIONER, new Class5679(this));
        this.method32209(EntityType.IRON_GOLEM, new Class5746(this));
        this.method32209(EntityType.ITEM, new Class5724(this, var1));
        this.method32209(EntityType.ITEM_FRAME, new Class5736(this, var1));
        this.method32209(EntityType.LEASH_KNOT, new Class5739(this));
        this.method32209(EntityType.LIGHTNING_BOLT, new Class5719(this));
        this.method32209(EntityType.LLAMA, new Class5709(this));
        this.method32209(EntityType.LLAMA_SPIT, new Class5717(this));
        this.method32209(EntityType.MAGMA_CUBE, new Class5652(this));
        this.method32209(EntityType.MINECART, new Class5732(this));
        this.method32209(EntityType.MOOSHROOM, new Class5694(this));
        this.method32209(EntityType.MULE, new Class5687(this, 0.92F));
        this.method32209(EntityType.OCELOT, new Class5711(this));
        this.method32209(EntityType.PAINTING, new Class5737(this));
        this.method32209(EntityType.PANDA, new Class5696(this));
        this.method32209(EntityType.PARROT, new Class5697(this));
        this.method32209(EntityType.PHANTOM, new Class5681(this));
        this.method32209(EntityType.PIG, new Class5691(this));
        this.method32209(EntityType.PIGLIN, new Class5671(this, false));
        this.method32209(EntityType.PIGLIN_BRUTE, new Class5671(this, false));
        this.method32209(EntityType.PILLAGER, new Class5680(this));
        this.method32209(EntityType.POLAR_BEAR, new Class5700(this));
        this.method32209(EntityType.POTION, new Class5735(this, var1));
        this.method32209(EntityType.PUFFERFISH, new Class5748(this));
        this.method32209(EntityType.RABBIT, new Class5656(this));
        this.method32209(EntityType.RAVAGER, new Class5701(this));
        this.method32209(EntityType.SALMON, new Class5750(this));
        this.method32209(EntityType.SHEEP, new Class5749(this));
        this.method32209(EntityType.SHULKER_BULLET, new Class5730(this));
        this.method32209(EntityType.SHULKER, new Class5683(this));
        this.method32209(EntityType.SILVERFISH, new Class5704(this));
        this.method32209(EntityType.SKELETON_HORSE, new Class5686(this));
        this.method32209(EntityType.SKELETON, new Class5666(this));
        this.method32209(EntityType.SLIME, new Class5675(this));
        this.method32209(EntityType.SMALL_FIREBALL, new Class5735(this, var1, 0.75F, true));
        this.method32209(EntityType.SNOWBALL, new Class5735(this, var1));
        this.method32209(EntityType.SNOW_GOLEM, new Class5660(this));
        this.method32209(EntityType.SPAWNER_MINECART, new Class5732(this));
        this.method32209(EntityType.SPECTRAL_ARROW, new Class5729(this));
        this.method32209(EntityType.SPIDER, new Class5702(this));
        this.method32209(EntityType.SQUID, new Class5682(this));
        this.method32209(EntityType.STRAY, new Class5668(this));
        this.method32209(EntityType.TNT_MINECART, new Class5733(this));
        this.method32209(EntityType.TNT, new Class5740(this));
        this.method32209(EntityType.TRADER_LLAMA, new Class5709(this));
        this.method32209(EntityType.TRIDENT, new Class5716(this));
        this.method32209(EntityType.TROPICAL_FISH, new Class5655(this));
        this.method32209(EntityType.TURTLE, new Class5689(this));
        this.method32209(EntityType.VEX, new Class5670(this));
        this.method32209(EntityType.VILLAGER, new Class5692(this, var2));
        this.method32209(EntityType.VINDICATOR, new Class5678(this));
        this.method32209(EntityType.WANDERING_TRADER, new Class5707(this));
        this.method32209(EntityType.WITCH, new Class5708(this));
        this.method32209(EntityType.WITHER, new Class5693(this));
        this.method32209(EntityType.WITHER_SKELETON, new Class5667(this));
        this.method32209(EntityType.WITHER_SKULL, new Class5734(this));
        this.method32209(EntityType.WOLF, new Class5690(this));
        this.method32209(EntityType.ZOGLIN, new Class5672(this));
        this.method32209(EntityType.ZOMBIE_HORSE, new Class5686(this));
        this.method32209(EntityType.ZOMBIE, new Class5663(this));
        this.method32209(EntityType.ZOMBIFIED_PIGLIN, new Class5671(this, true));
        this.method32209(EntityType.ZOMBIE_VILLAGER, new Class5669(this, var2));
        this.method32209(EntityType.STRIDER, new Class5657(this));
    }

    public EntityRendererManager(TextureManager var1, ItemRenderer var2, IReloadableResourceManager var3, FontRenderer var4, GameSettings var5) {
        this.field40015 = var1;
        this.field40014 = var4;
        this.options = var5;
        this.method32210(var2, var3);
        this.field40013 = new PlayerRenderer(this);
        this.field40012.put("default", this.field40013);
        this.field40012.put("slim", new PlayerRenderer(this, true));
        Class222.method830(this.field40012);
    }

    public void method32211() {
        for (EntityType var4 : Registry.ENTITY_TYPE) {
            if (var4 != EntityType.PLAYER && !this.field40011.containsKey(var4)) {
                throw new IllegalStateException("No renderer registered for " + Registry.ENTITY_TYPE.getKey(var4));
            }
        }
    }

    public <T extends Entity> EntityRenderer<? super T> getRenderer(T var1) {
        if (!(var1 instanceof AbstractClientPlayerEntity)) {
            return (EntityRenderer<? super T>) this.field40011.get(var1.getType());
        } else {
            String var4 = ((AbstractClientPlayerEntity) var1).method5377();
            PlayerRenderer var5 = this.field40012.get(var4);
            return (EntityRenderer<? super T>) (var5 == null ? this.field40013 : var5);
        }
    }

    public void method32213(World var1, ActiveRenderInfo var2, Entity var3) {
        this.world = var1;
        this.info = var2;
        this.field40018 = var2.getRotation();
        this.field40019 = var3;
    }

    public void setCameraOrientation(Quaternion var1) {
        this.field40018 = var1;
    }

    public void setRenderShadow(boolean var1) {
        this.renderShadow = var1;
    }

    public void method32216(boolean var1) {
        this.debugBoundingBox = var1;
    }

    public boolean method32217() {
        return this.debugBoundingBox;
    }

    public <E extends Entity> boolean method32218(E var1, Class7647 var2, double var3, double var5, double var7) {
        EntityRenderer var11 = this.<Entity>getRenderer(var1);
        return var11.method17854(var1, var2, var3, var5, var7);
    }

    public <E extends Entity> void renderEntityStatic(E entityIn, double xIn, double yIn, double zIn, float rotationYawIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        if (!FPSBooster.isEnabled || !(entityIn instanceof ArmorStandEntity) && !(entityIn instanceof GiantEntity) && !(entityIn instanceof ItemFrameEntity)) {
            if (this.info != null) {
                EntityRenderer<? super E> entityrenderer = this.getRenderer(entityIn);

                try {
                    Vector3d vector3d = entityrenderer.getRenderOffset(entityIn, partialTicks);
                    double d2 = xIn + vector3d.getX();
                    double d3 = yIn + vector3d.getY();
                    double d0 = zIn + vector3d.getZ();
                    matrixStackIn.push();
                    matrixStackIn.translate(d2, d3, d0);

                    if (CustomEntityModels.isActive()) {
                        this.renderRender = entityrenderer;
                    }

                    if (EmissiveTextures.isActive()) {
                        EmissiveTextures.beginRender();
                    }

                    entityrenderer.render(entityIn, rotationYawIn, partialTicks, matrixStackIn, bufferIn, packedLightIn);
                    if (EmissiveTextures.isActive()) {
                        if (EmissiveTextures.hasEmissive()) {
                            EmissiveTextures.beginRenderEmissive();
                            entityrenderer.render(entityIn, rotationYawIn, partialTicks, matrixStackIn, bufferIn, LightTexture.MAX_BRIGHTNESS);
                            EmissiveTextures.endRenderEmissive();
                        }

                        EmissiveTextures.endRender();
                    }

                    if (entityIn.canRenderOnFire()) {
                        this.renderFire(matrixStackIn, bufferIn, entityIn);
                    }

                    matrixStackIn.translate(-vector3d.getX(), -vector3d.getY(), -vector3d.getZ());
                    if (this.options.entityShadows && this.renderShadow && entityrenderer.shadowSize > 0.0F && !entityIn.isInvisible()) {
                        double d1 = this.getDistanceToCamera(entityIn.getPosX(), entityIn.getPosY(), entityIn.getPosZ());
                        float f = (float) ((1.0 - d1 / 256.0) * (double) entityrenderer.shadowOpaque);

                        if (f > 0.0F) {
                            renderShadow(matrixStackIn, bufferIn, entityIn, f, partialTicks, this.world, entityrenderer.shadowSize);
                        }
                    }

                    if (this.debugBoundingBox && !entityIn.isInvisible() && !Minecraft.getInstance().isReducedDebug()) {
                        this.renderDebugBoundingBox(matrixStackIn, bufferIn.getBuffer(RenderType.getLines()), entityIn, partialTicks);
                    }

                    matrixStackIn.pop();
                } catch (Throwable var29) {
                    CrashReport crashreport = CrashReport.makeCrashReport(var29, "Rendering entity in world");
                    CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being rendered");
                    entityIn.fillCrashReport(crashreportcategory);
                    CrashReportCategory crashreportcategory1 = crashreport.makeCategory("Renderer details");
                    crashreportcategory1.addDetail("Assigned renderer", entityrenderer);
                    crashreportcategory1.addDetail("Location", CrashReportCategory.getCoordinateInfo(xIn, yIn, zIn));
                    crashreportcategory1.addDetail("Rotation", rotationYawIn);
                    crashreportcategory1.addDetail("Delta", partialTicks);
                    throw new ReportedException(crashreport);
                }
            }
        }
    }

    private void renderDebugBoundingBox(MatrixStack var1, IVertexBuilder var2, Entity var3, float var4) {
        if (!Shaders.isShadowPass) {
            float var7 = var3.getWidth() / 2.0F;
            this.method32221(var1, var2, var3, 1.0F, 1.0F, 1.0F);
            if (var3 instanceof EnderDragonEntity) {
                double var10 = -MathHelper.lerp((double) var4, var3.lastTickPosX, var3.getPosX());
                double var12 = -MathHelper.lerp((double) var4, var3.lastTickPosY, var3.getPosY());
                double var14 = -MathHelper.lerp((double) var4, var3.lastTickPosZ, var3.getPosZ());

                for (EnderDragonPartEntity var19 : ((EnderDragonEntity) var3).method4332()) {
                    var1.push();
                    double var20 = var10 + MathHelper.lerp((double) var4, var19.lastTickPosX, var19.getPosX());
                    double var22 = var12 + MathHelper.lerp((double) var4, var19.lastTickPosY, var19.getPosY());
                    double var24 = var14 + MathHelper.lerp((double) var4, var19.lastTickPosZ, var19.getPosZ());
                    var1.translate(var20, var22, var24);
                    this.method32221(var1, var2, var19, 0.25F, 1.0F, 0.0F);
                    var1.pop();
                }
            }

            if (var3 instanceof LivingEntity) {
                float var8 = 0.01F;
                WorldRenderer.method898(
                        var1,
                        var2,
                        (double) (-var7),
                        (double) (var3.getEyeHeight() - 0.01F),
                        (double) (-var7),
                        (double) var7,
                        (double) (var3.getEyeHeight() + 0.01F),
                        (double) var7,
                        1.0F,
                        0.0F,
                        0.0F,
                        1.0F
                );
            }

            Vector3d var26 = var3.getLook(var4);
            Matrix4f var9 = var1.getLast().getMatrix();
            var2.pos(var9, 0.0F, var3.getEyeHeight(), 0.0F).color(0, 0, 255, 255).endVertex();
            var2.pos(var9, (float) (var26.x * 2.0), (float) ((double) var3.getEyeHeight() + var26.y * 2.0), (float) (var26.z * 2.0))
                    .color(0, 0, 255, 255)
                    .endVertex();
        }
    }

    private void method32221(MatrixStack var1, IVertexBuilder var2, Entity var3, float var4, float var5, float var6) {
        AxisAlignedBB var9 = var3.getBoundingBox().offset(-var3.getPosX(), -var3.getPosY(), -var3.getPosZ());
        WorldRenderer.method897(var1, var2, var9, var4, var5, var6, 1.0F);
    }

    private void renderFire(MatrixStack var1, IRenderTypeBuffer var2, Entity var3) {
        TextureAtlasSprite var6 = ModelBakery.field40508.getSprite();
        TextureAtlasSprite var7 = ModelBakery.LOCATION_FIRE_1.getSprite();
        var1.push();
        float var8 = var3.getWidth() * 1.4F;
        var1.scale(var8, var8, var8);
        float var9 = 0.5F;
        float var10 = 0.0F;
        float var11 = var3.getHeight() / var8;
        float var12 = 0.0F;
        var1.rotate(Vector3f.YP.rotationDegrees(-this.info.getYaw()));
        var1.translate(0.0, 0.0, (double) (-0.3F + (float) ((int) var11) * 0.02F));
        float var13 = 0.0F;
        int var14 = 0;
        IVertexBuilder var15 = var2.getBuffer(Class8624.method30907());
        boolean var16 = Config.method26894();
        if (var16) {
            var15.method17044(Class9025.field41288);
        }

        for (Class8892 var17 = var1.getLast(); var11 > 0.0F; var14++) {
            TextureAtlasSprite var18 = var14 % 2 != 0 ? var7 : var6;
            var15.method17043(var18);
            float var19 = var18.getMinU();
            float var20 = var18.getMinV();
            float var21 = var18.getMaxU();
            float var22 = var18.getMaxV();
            if (var14 / 2 % 2 == 0) {
                float var23 = var21;
                var21 = var19;
                var19 = var23;
            }

            method32223(var17, var15, var9 - 0.0F, 0.0F - var12, var13, var21, var22);
            method32223(var17, var15, -var9 - 0.0F, 0.0F - var12, var13, var19, var22);
            method32223(var17, var15, -var9 - 0.0F, 1.4F - var12, var13, var19, var20);
            method32223(var17, var15, var9 - 0.0F, 1.4F - var12, var13, var21, var20);
            var11 -= 0.45F;
            var12 -= 0.45F;
            var9 *= 0.9F;
            var13 += 0.03F;
        }

        if (var16) {
            var15.method17044((RenderType) null);
            GlStateManager.method23864();
        }

        var1.pop();
    }

    private static void method32223(Class8892 var0, IVertexBuilder var1, float var2, float var3, float var4, float var5, float var6) {
        var1.pos(var0.getMatrix(), var2, var3, var4)
                .color(255, 255, 255, 255)
                .tex(var5, var6)
                .method17028(0, 10)
                .method17034(240)
                .method17041(var0.method32362(), 0.0F, 1.0F, 0.0F)
                .endVertex();
    }

    private static void renderShadow(MatrixStack var0, IRenderTypeBuffer var1, Entity var2, float var3, float var4, IWorldReader var5, float var6) {
        if (!Config.isShaders() || !Shaders.field40794) {
            float var9 = var6;
            if (var2 instanceof MobEntity) {
                MobEntity var25 = (MobEntity) var2;
                if (var25.isChild()) {
                    var9 = var6 * 0.5F;
                }
            }

            double var10 = MathHelper.lerp((double) var4, var2.lastTickPosX, var2.getPosX());
            double var12 = MathHelper.lerp((double) var4, var2.lastTickPosY, var2.getPosY());
            double var14 = MathHelper.lerp((double) var4, var2.lastTickPosZ, var2.getPosZ());
            int var16 = MathHelper.floor(var10 - (double) var9);
            int var17 = MathHelper.floor(var10 + (double) var9);
            int var18 = MathHelper.floor(var12 - (double) var9);
            int var19 = MathHelper.floor(var12);
            int var20 = MathHelper.floor(var14 - (double) var9);
            int var21 = MathHelper.floor(var14 + (double) var9);
            Class8892 var22 = var0.getLast();
            IVertexBuilder var23 = var1.getBuffer(field40010);

            for (BlockPos var26 : BlockPos.method8359(new BlockPos(var16, var18, var20), new BlockPos(var17, var19, var21))) {
                method32225(var22, var23, var5, var26, var10, var12, var14, var9, var3);
            }
        }
    }

    private static void method32225(
            Class8892 var0, IVertexBuilder var1, IWorldReader var2, BlockPos var3, double var4, double var6, double var8, float var10, float var11
    ) {
        BlockPos var14 = var3.down();
        BlockState var15 = var2.getBlockState(var14);
        if (var15.getRenderType() != BlockRenderType.field9885 && var2.method7015(var3) > 3 && var15.method23456(var2, var14)) {
            VoxelShape var16 = var15.getShape(var2, var3.down());
            if (!var16.isEmpty()) {
                float var17 = (float) (((double) var11 - (var6 - (double) var3.getY()) / 2.0) * 0.5 * (double) var2.method7009(var3));
                if (var17 >= 0.0F) {
                    if (var17 > 1.0F) {
                        var17 = 1.0F;
                    }

                    AxisAlignedBB var18 = var16.getBoundingBox();
                    double var19 = (double) var3.getX() + var18.minX;
                    double var21 = (double) var3.getX() + var18.maxX;
                    double var23 = (double) var3.getY() + var18.minY;
                    double var25 = (double) var3.getZ() + var18.minZ;
                    double var27 = (double) var3.getZ() + var18.maxZ;
                    float var29 = (float) (var19 - var4);
                    float var30 = (float) (var21 - var4);
                    float var31 = (float) (var23 - var6);
                    float var32 = (float) (var25 - var8);
                    float var33 = (float) (var27 - var8);
                    float var34 = -var29 / 2.0F / var10 + 0.5F;
                    float var35 = -var30 / 2.0F / var10 + 0.5F;
                    float var36 = -var32 / 2.0F / var10 + 0.5F;
                    float var37 = -var33 / 2.0F / var10 + 0.5F;
                    method32226(var0, var1, var17, var29, var31, var32, var34, var36);
                    method32226(var0, var1, var17, var29, var31, var33, var34, var37);
                    method32226(var0, var1, var17, var30, var31, var33, var35, var37);
                    method32226(var0, var1, var17, var30, var31, var32, var35, var36);
                }
            }
        }
    }

    private static void method32226(Class8892 var0, IVertexBuilder var1, float var2, float var3, float var4, float var5, float var6, float var7) {
        var1.pos(var0.getMatrix(), var3, var4, var5)
                .color(1.0F, 1.0F, 1.0F, var2)
                .tex(var6, var7)
                .method17035(OverlayTexture.NO_OVERLAY)
                .method17034(15728880)
                .method17041(var0.method32362(), 0.0F, 1.0F, 0.0F)
                .endVertex();
    }

    public void setWorld(World var1) {
        this.world = var1;
        if (var1 == null) {
            this.info = null;
        }
    }

    public double method32228(Entity var1) {
        return this.info.getPos().squareDistanceTo(var1.getPositionVec());
    }

    public double getDistanceToCamera(double var1, double var3, double var5) {
        return this.info.getPos().method11343(var1, var3, var5);
    }

    public Quaternion method32230() {
        return this.field40018;
    }

    public FontRenderer method32231() {
        return this.field40014;
    }

    public Map<EntityType<?>, EntityRenderer<?>> method32232() {
        return this.field40011;
    }

    public Map<String, PlayerRenderer> method32233() {
        return Collections.<String, PlayerRenderer>unmodifiableMap(this.field40012);
    }
}
