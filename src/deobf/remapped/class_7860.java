package remapped;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7860 {
   private static final Logger field_39979 = LogManager.getLogger();
   private static boolean field_39935 = method_35548("*** Reflector Forge ***");
   public static class_9859 field_40181 = new class_9859("mods.betterfoliage.client.BetterFoliageClient");
   public static class_9859 field_39875 = new class_9859("net.minecraftforge.fml.BrandingControl");
   public static class_817 field_40027 = new class_817(field_39875, "getBrandings");
   public static class_817 field_39963 = new class_817(field_39875, "forEachLine");
   public static class_817 field_40125 = new class_817(field_39875, "forEachAboveCopyrightLine");
   public static class_9859 field_40146 = new class_9859("net.minecraftforge.common.capabilities.ICapabilityProvider");
   public static class_9859 field_40095 = new class_9859("net.minecraftforge.common.capabilities.CapabilityProvider");
   public static class_817 field_39863 = new class_817(field_40095, "gatherCapabilities", new Class[0]);
   public static class_9859 field_40171 = new class_9859("net.minecraftforge.fml.client.ClientModLoader");
   public static class_817 field_39853 = new class_817(field_40171, "isLoading");
   public static class_817 field_40010 = new class_817(field_40171, "renderProgressText");
   public static class_9859 field_40206 = new class_9859("net.minecraftforge.event.world.ChunkDataEvent$Save");
   public static class_4911 field_39941 = new class_4911(field_40206, new Class[]{class_5990.class, class_9379.class, class_5734.class});
   public static class_9859 field_39913 = new class_9859("net.minecraftforge.event.world.ChunkEvent$Load");
   public static class_4911 field_39925 = new class_4911(field_39913, new Class[]{class_5990.class});
   public static class_9859 field_40159 = new class_9859("net.minecraftforge.event.world.ChunkEvent$Unload");
   public static class_4911 field_40024 = new class_4911(field_40159, new Class[]{class_5990.class});
   public static class_9859 field_39990 = new class_9859("net.minecraftforge.fml.client.ClientHooks");
   public static class_817 field_39959 = new class_817(field_39990, "trackBrokenTexture");
   public static class_817 field_40076 = new class_817(field_39990, "trackMissingTexture");
   public static class_9859 field_40180 = new class_9859("net.minecraftforge.fml.CrashReportExtender");
   public static class_817 field_40246 = new class_817(field_40180, "enhanceCrashReport");
   public static class_817 field_40202 = new class_817(field_40180, "addCrashReportHeader");
   public static class_817 field_39893 = new class_817(field_40180, "generateEnhancedStackTrace", new Class[]{Throwable.class});
   public static class_817 field_40244 = new class_817(field_40180, "generateEnhancedStackTrace", new Class[]{StackTraceElement[].class});
   public static class_9859 field_39864 = new class_9859("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre");
   public static class_4911 field_39910 = new class_4911(field_39864, new Class[]{Screen.class, class_7966.class, int.class, int.class, float.class});
   public static class_9859 field_39881 = new class_9859("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post");
   public static class_4911 field_39859 = new class_4911(field_39881, new Class[]{Screen.class, class_7966.class, int.class, int.class, float.class});
   public static class_9859 field_40227 = new class_9859("net.minecraftforge.fml.loading.progress.EarlyProgressVisualization");
   public static class_1790 field_40082 = new class_1790(field_40227, "INSTANCE");
   public static class_817 field_40035 = new class_817(field_40227, "handOffWindow");
   public static class_9859 field_39974 = new class_9859("net.minecraftforge.event.entity.EntityLeaveWorldEvent");
   public static class_4911 field_40099 = new class_4911(field_39974, new Class[]{Entity.class, World.class});
   public static class_9859 field_40116 = new class_9859("net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup");
   public static class_817 field_40063 = new class_817(field_40116, "getYaw");
   public static class_817 field_39841 = new class_817(field_40116, "getPitch");
   public static class_817 field_40004 = new class_817(field_40116, "getRoll");
   public static class_9859 field_39972 = new class_9859("net.minecraftforge.client.event.EntityViewRenderEvent$FogColors");
   public static class_4911 field_40155 = new class_4911(field_39972, new Class[]{Camera.class, float.class, float.class, float.class, float.class});
   public static class_817 field_39977 = new class_817(field_39972, "getRed");
   public static class_817 field_40020 = new class_817(field_39972, "getGreen");
   public static class_817 field_40226 = new class_817(field_39972, "getBlue");
   public static class_9859 field_40034 = new class_9859("net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent");
   public static class_4911 field_39848 = new class_4911(field_40034, new Class[]{class_1026.class, Camera.class, float.class, float.class});
   public static class_9859 field_39981 = new class_9859("net.minecraftforge.event.entity.EntityJoinWorldEvent");
   public static class_4911 field_40165 = new class_4911(field_39981, new Class[]{Entity.class, World.class});
   public static class_9859 field_40079 = new class_9859("net.minecraftforge.eventbus.api.Event");
   public static class_817 field_40233 = new class_817(field_40079, "isCanceled");
   public static class_817 field_40148 = new class_817(field_40079, "getResult");
   public static class_9859 field_40149 = new class_9859("net.minecraftforge.eventbus.api.IEventBus");
   public static class_817 field_39978 = new class_817(field_40149, "post");
   public static class_9859 field_39921 = new class_9859("net.minecraftforge.eventbus.api.Event$Result");
   public static class_1790 field_40071 = new class_1790(field_39921, "DENY");
   public static class_1790 field_39912 = new class_1790(field_39921, "ALLOW");
   public static class_1790 field_40245 = new class_1790(field_39921, "DEFAULT");
   public static class_9859 field_39934 = new class_9859("net.minecraftforge.common.extensions.IForgeBlock");
   public static class_817 field_40138 = new class_817(field_39934, "getTags");
   public static class_9859 field_40136 = new class_9859("net.minecraftforge.client.model.pipeline.ForgeBlockModelRenderer");
   public static class_4911 field_39870 = new class_4911(field_40136, new Class[]{class_4468.class});
   public static class_9859 field_39997 = new class_9859(class_9524.class);
   public static class_817 field_40137 = new class_817(field_39997, "getTexture", new Class[]{class_2522.class, World.class, class_1331.class});
   public static class_9859 field_40078 = new class_9859("net.minecraftforge.common.extensions.IForgeBlockState");
   public static class_817 field_40197 = new class_817(field_40078, "addDestroyEffects");
   public static class_817 field_39850 = new class_817(field_40078, "addHitEffects");
   public static class_817 field_40163 = new class_817(field_40078, "getLightValue", new Class[]{class_6163.class, class_1331.class});
   public static class_817 field_40208 = new class_817(field_40078, "getSoundType", new Class[]{class_4924.class, class_1331.class, Entity.class});
   public static class_817 field_40199 = new class_817(field_40078, "getStateAtViewpoint");
   public static class_817 field_40213 = new class_817(field_40078, "hasTileEntity");
   public static class_817 field_39999 = new class_817(field_40078, "isAir", new Class[]{class_6163.class, class_1331.class});
   public static class_817 field_40080 = new class_817(field_40078, "shouldDisplayFluidOverlay");
   public static class_9859 field_39938 = new class_9859("net.minecraftforge.common.extensions.IForgeFluid");
   public static class_817 field_39950 = new class_817(field_39938, "getAttributes");
   public static class_9859 field_39975 = new class_9859("net.minecraftforge.common.extensions.IForgeEntity");
   public static class_817 field_39966 = new class_817(field_39975, "canUpdate", new Class[0]);
   public static class_817 field_40228 = new class_817(field_39975, "onAddedToWorld");
   public static class_817 field_40160 = new class_817(field_39975, "onRemovedFromWorld");
   public static class_817 field_40084 = new class_817(field_39975, "shouldRiderSit");
   public static class_9859 field_40051 = new class_9859("net.minecraftforge.fluids.FluidAttributes");
   public static class_817 field_40042 = new class_817(field_40051, "getColor", new Class[]{class_5561.class, class_1331.class});
   public static class_9859 field_39872 = new class_9859(class_6629.class);
   public static class_817 field_39843 = new class_817(field_39872, "getTags");
   public static class_9859 field_40117 = new class_9859("net.minecraftforge.event.ForgeEventFactory");
   public static class_817 field_39867 = new class_817(field_40117, "canEntityDespawn");
   public static class_817 field_39857 = new class_817(
      field_40117, "fireChunkWatch", new Class[]{boolean.class, boolean.class, class_9359.class, class_2034.class, class_6331.class}
   );
   public static class_817 field_39907 = new class_817(field_40117, "getMaxSpawnPackSize");
   public static class_817 field_40243 = new class_817(field_40117, "getMobGriefingEvent");
   public static class_817 field_39943 = new class_817(field_40117, "onPlaySoundAtEntity");
   public static class_817 field_40092 = new class_817(field_40117, "renderBlockOverlay");
   public static class_817 field_39929 = new class_817(field_40117, "renderFireOverlay");
   public static class_817 field_40021 = new class_817(field_40117, "renderWaterOverlay");
   public static class_9859 field_39967 = new class_9859(class_2340.class);
   public static class_817 field_39971 = new class_817(field_39967, "getTags");
   public static class_9859 field_39926 = new class_9859("net.minecraftforge.common.ForgeHooks");
   public static class_817 field_39892 = new class_817(field_39926, "onDifficultyChange");
   public static class_817 field_39954 = new class_817(field_39926, "onLivingAttack");
   public static class_817 field_39896 = new class_817(field_39926, "onLivingDeath");
   public static class_817 field_40085 = new class_817(field_39926, "onLivingDrops");
   public static class_817 field_40126 = new class_817(field_39926, "onLivingFall");
   public static class_817 field_40190 = new class_817(field_39926, "onLivingHurt");
   public static class_817 field_40234 = new class_817(field_39926, "onLivingJump");
   public static class_817 field_40009 = new class_817(field_39926, "onLivingSetAttackTarget");
   public static class_817 field_40232 = new class_817(field_39926, "onLivingUpdate");
   public static class_9859 field_40161 = new class_9859("net.minecraftforge.client.ForgeHooksClient");
   public static class_817 field_40045 = new class_817(
      field_40161, "dispatchRenderLast", new Class[]{WorldRenderer.class, class_7966.class, float.class, class_8107.class, long.class}
   );
   public static class_817 field_39839 = new class_817(field_40161, "drawItemLayered");
   public static class_817 field_39933 = new class_817(field_40161, "drawScreen");
   public static class_817 field_39996 = new class_817(field_40161, "fillNormal");
   public static class_817 field_39866 = new class_817(field_40161, "fireKeyInput");
   public static class_817 field_39856 = new class_817(field_40161, "handleCameraTransforms");
   public static class_817 field_40007 = new class_817(field_40161, "handlePerspective");
   public static class_817 field_40122 = new class_817(field_40161, "gatherFluidTextures");
   public static class_817 field_40132 = new class_817(field_40161, "getArmorModel");
   public static class_817 field_39899 = new class_817(field_40161, "getArmorTexture");
   public static class_817 field_40001 = new class_817(field_40161, "getFluidSprites");
   public static class_817 field_39889 = new class_817(field_40161, "getFogDensity");
   public static class_817 field_39920 = new class_817(field_40161, "getFOVModifier");
   public static class_817 field_40182 = new class_817(field_40161, "getOffsetFOV");
   public static class_817 field_40106 = new class_817(field_40161, "isNameplateInRenderDistance");
   public static class_817 field_40090 = new class_817(field_40161, "loadEntityShader");
   public static class_817 field_40044 = new class_817(field_40161, "onCameraSetup");
   public static class_817 field_39840 = new class_817(field_40161, "onDrawBlockHighlight");
   public static class_817 field_39952 = new class_817(field_40161, "onFogRender");
   public static class_817 field_40145 = new class_817(field_40161, "onGuiCharTypedPre");
   public static class_817 field_39923 = new class_817(field_40161, "onGuiCharTypedPost");
   public static class_817 field_40177 = new class_817(field_40161, "onGuiKeyPressedPre");
   public static class_817 field_39845 = new class_817(field_40161, "onGuiKeyPressedPost");
   public static class_817 field_39946 = new class_817(field_40161, "onGuiKeyReleasedPre");
   public static class_817 field_39918 = new class_817(field_40161, "onGuiKeyReleasedPost");
   public static class_817 field_40240 = new class_817(field_40161, "onScreenshot");
   public static class_817 field_40019 = new class_817(field_40161, "onTextureStitchedPre");
   public static class_817 field_40114 = new class_817(field_40161, "onTextureStitchedPost");
   public static class_817 field_40140 = new class_817(field_40161, "renderMainMenu");
   public static class_817 field_40073 = new class_817(field_40161, "renderSpecificFirstPersonHand");
   public static class_817 field_40031 = new class_817(field_40161, "setRenderLayer");
   public static class_817 field_40064 = new class_817(field_40161, "shouldCauseReequipAnimation");
   public static class_9859 field_39886 = new class_9859("net.minecraftforge.common.ForgeConfig");
   public static class_1790 field_39897 = new class_1790(field_39886, "CLIENT");
   public static class_9859 field_39852 = new class_9859("net.minecraftforge.common.ForgeConfig$Client");
   public static class_1790 field_40043 = new class_1790(field_39852, "forgeLightPipelineEnabled");
   public static class_9859 field_40187 = new class_9859("net.minecraftforge.common.ForgeConfigSpec");
   public static class_1790 field_39962 = new class_1790(field_40187, "childConfig");
   public static class_9859 field_40056 = new class_9859("net.minecraftforge.common.ForgeConfigSpec$ConfigValue");
   public static class_1790 field_39909 = new class_1790(field_40056, "defaultSupplier");
   public static class_1790 field_40038 = new class_1790(field_40056, "spec");
   public static class_817 field_39851 = new class_817(field_40056, "get");
   public static class_9859 field_39973 = new class_9859(class_5990.class);
   public static class_817 field_40175 = new class_817(field_39973, "getWorldForge");
   public static class_9859 field_40195 = new class_9859("net.minecraftforge.common.extensions.IForgeItem");
   public static class_817 field_39914 = new class_817(field_40195, "getDurabilityForDisplay");
   public static class_817 field_39904 = new class_817(field_40195, "getEquipmentSlot");
   public static class_817 field_40211 = new class_817(field_40195, "getFontRenderer");
   public static class_817 field_39949 = new class_817(field_40195, "getItemStackTileEntityRenderer");
   public static class_817 field_39876 = new class_817(field_40195, "getRGBDurabilityForDisplay");
   public static class_817 field_40121 = new class_817(field_40195, "isDamageable", new Class[]{ItemStack.class});
   public static class_817 field_39965 = new class_817(field_40195, "isShield");
   public static class_817 field_40238 = new class_817(field_40195, "onEntitySwing");
   public static class_817 field_40218 = new class_817(field_40195, "shouldCauseReequipAnimation");
   public static class_817 field_40192 = new class_817(field_40195, "showDurabilityBar");
   public static class_9859 field_40235 = new class_9859("net.minecraftforge.common.extensions.IForgeItemStack");
   public static class_817 field_40018 = new class_817(field_40235, "canDisableShield");
   public static class_817 field_40096 = new class_817(field_40235, "getEquipmentSlot");
   public static class_817 field_40139 = new class_817(field_40235, "getShareTag");
   public static class_817 field_40201 = new class_817(field_40235, "getHighlightTip");
   public static class_817 field_40025 = new class_817(field_40235, "isShield");
   public static class_817 field_40052 = new class_817(field_40235, "readShareTag");
   public static class_9859 field_40103 = new class_9859("net.minecraftforge.fml.ForgeI18n");
   public static class_817 field_40167 = new class_817(field_40103, "loadLanguageData");
   public static class_9859 field_39932 = new class_9859(class_5916.class);
   public static class_817 field_40068 = new class_817(field_39932, "setKeyConflictContext");
   public static class_817 field_39865 = new class_817(field_39932, "setKeyModifierAndCode");
   public static class_817 field_39844 = new class_817(field_39932, "getKeyModifier");
   public static class_9859 field_40011 = new class_9859("net.minecraftforge.common.extensions.IForgeEffectInstance");
   public static class_817 field_40120 = new class_817(field_40011, "isCurativeItem");
   public static class_817 field_40209 = new class_817(field_40011, "shouldRenderHUD");
   public static class_817 field_39873 = field_40011.method_45473("renderHUDEffect");
   public static class_9859 field_39985 = new class_9859("net.minecraftforge.registries.ForgeRegistryEntry");
   public static class_817 field_40006 = new class_817(field_39985, "getRegistryName");
   public static class_9859 field_39890 = new class_9859(class_6416.class);
   public static class_817 field_40075 = new class_817(field_39890, "canRenderInLayer", new Class[]{class_2522.class, RenderLayer.class});
   public static class_817 field_39908 = new class_817(field_39890, "canRenderInLayer", new Class[]{class_4774.class, RenderLayer.class});
   public static class_9859 field_40050 = new class_9859("net.minecraftforge.common.extensions.IForgeTileEntity");
   public static class_817 field_40135 = new class_817(field_40050, "getRenderBoundingBox");
   public static class_1790 field_39887 = new class_1790(
      new class_7880(World.class, new Class[]{List.class}, Set.class, new Class[]{Thread.class}, "World.tileEntitiesToBeRemoved")
   );
   public static class_9859 field_40070 = new class_9859(class_7513.class);
   public static class_817 field_39862 = field_40070.method_45473("getCloudRenderHandler");
   public static class_817 field_40239 = field_40070.method_45473("getSkyRenderHandler");
   public static class_817 field_40157 = field_40070.method_45473("getWeatherRenderHandler");
   public static class_9859 field_40029 = new class_9859("net.minecraftforge.client.IRenderHandler");
   public static class_817 field_40168 = new class_817(field_40029, "render");
   public static class_9859 field_40179 = new class_9859("net.minecraftforge.client.ItemModelMesherForge");
   public static class_4911 field_40017 = new class_4911(field_40179, new Class[]{class_7458.class});
   public static class_9859 field_40049 = new class_9859("net.minecraftforge.client.settings.KeyConflictContext");
   public static class_1790 field_40013 = new class_1790(field_40049, "IN_GAME");
   public static class_9859 field_40231 = new class_9859("net.minecraftforge.client.settings.KeyModifier");
   public static class_817 field_39927 = new class_817(field_40231, "valueFromString");
   public static class_1790 field_39991 = new class_1790(field_40231, "NONE");
   public static class_9859 field_39955 = new class_9859("net.minecraft.launchwrapper.Launch");
   public static class_1790 field_40093 = new class_1790(field_39955, "blackboard");
   public static class_9859 field_40023 = new class_9859("net.minecraftforge.client.model.pipeline.LightUtil");
   public static class_1790 field_40214 = new class_1790(field_40023, "itemConsumer");
   public static class_1790 field_39960 = new class_1790(field_40023, "tessellator");
   public static class_817 field_39917 = new class_817(field_40023, "putBakedQuad");
   public static class_9859 field_39885 = new class_9859("net.minecraftforge.fml.common.Loader");
   public static class_817 field_39861 = new class_817(field_39885, "getActiveModList");
   public static class_817 field_40066 = new class_817(field_39885, "instance");
   public static class_9859 field_40032 = new class_9859("net.minecraftforge.common.MinecraftForge");
   public static class_1790 field_39915 = new class_1790(field_40032, "EVENT_BUS");
   public static class_9859 field_40144 = new class_9859("net.minecraftforge.client.MinecraftForgeClient");
   public static class_817 field_40065 = new class_817(field_40144, "getImageLayer");
   public static class_9859 field_40089 = new class_9859("net.minecraftforge.fml.common.ModContainer");
   public static class_817 field_40108 = new class_817(field_40089, "getModId");
   public static class_9859 field_40193 = new class_9859("net.minecraftforge.client.model.ModelLoaderRegistry");
   public static class_817 field_40039 = field_40193.method_45473("onModelLoadingStart");
   public static class_9859 field_40166 = new class_9859("net.minecraftforge.fml.client.gui.screen.ModListScreen");
   public static class_4911 field_39987 = new class_4911(field_40166, new Class[]{Screen.class});
   public static class_9859 field_39858 = new class_9859("net.minecraftforge.client.gui.NotificationModUpdateScreen");
   public static class_817 field_40098 = new class_817(field_39858, "init", new Class[]{class_1876.class, class_9521.class});
   public static class_9859 field_39969 = new class_9859("net.minecraftforge.event.entity.PlaySoundAtEntityEvent");
   public static class_817 field_39895 = new class_817(field_39969, "getSound");
   public static class_817 field_40154 = new class_817(field_39969, "getCategory");
   public static class_817 field_39894 = new class_817(field_39969, "getVolume");
   public static class_9859 field_39964 = new class_9859("net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType");
   public static class_1790 field_40055 = new class_1790(field_39964, "BLOCK");
   public static class_9859 field_40204 = new class_9859("net.minecraftforge.fml.client.registry.RenderingRegistry");
   public static class_817 field_40100 = new class_817(field_40204, "loadEntityRenderers", new Class[]{EntityRenderDispatcher.class});
   public static class_9859 field_40229 = new class_9859("net.minecraftforge.client.event.RenderItemInFrameEvent");
   public static class_4911 field_39846 = new class_4911(
      field_40229, new Class[]{class_7451.class, class_6823.class, class_7966.class, class_2565.class, int.class}
   );
   public static class_9859 field_39944 = new class_9859("net.minecraftforge.client.event.RenderLivingEvent$Pre");
   public static class_4911 field_40097 = new class_4911(
      field_39944, new Class[]{class_5834.class, class_6353.class, float.class, class_7966.class, class_2565.class, int.class}
   );
   public static class_9859 field_39847 = new class_9859("net.minecraftforge.client.event.RenderLivingEvent$Post");
   public static class_4911 field_40037 = new class_4911(
      field_39847, new Class[]{class_5834.class, class_6353.class, float.class, class_7966.class, class_2565.class, int.class}
   );
   public static class_9859 field_39958 = new class_9859("net.minecraftforge.client.event.RenderNameplateEvent");
   public static class_4911 field_40248 = new class_4911(
      field_39958, new Class[]{Entity.class, ITextComponent.class, class_7067.class, class_7966.class, class_2565.class, int.class, float.class}
   );
   public static class_817 field_40074 = new class_817(field_39958, "getContent");
   public static class_9859 field_40141 = new class_9859("net.minecraftforge.client.event.ScreenshotEvent");
   public static class_817 field_40047 = new class_817(field_40141, "getCancelMessage");
   public static class_817 field_40176 = new class_817(field_40141, "getScreenshotFile");
   public static class_817 field_39984 = new class_817(field_40141, "getResultMessage");
   public static class_9859 field_39900 = new class_9859("net.minecraftforge.fml.server.ServerLifecycleHooks");
   public static class_817 field_40158 = new class_817(field_39900, "handleServerAboutToStart");
   public static class_817 field_39924 = new class_817(field_39900, "handleServerStarting");
   public static class_9859 field_39957 = new class_9859("net.minecraftforge.event.world.WorldEvent$Load");
   public static class_4911 field_40005 = new class_4911(field_39957, new Class[]{class_9379.class});
   private static boolean field_40123 = method_35548("*** Reflector Vanilla ***");
   public static class_9859 field_40207 = new class_9859(class_91.class);
   public static class_1790 field_40217 = new class_1790(field_40207, class_7821.class);
   public static class_9859 field_39951 = new class_9859(class_3867.class);
   public static class_1790 field_40118 = new class_1790(field_39951, class_170.class);
   public static class_9859 field_39992 = new class_9859(class_1876.class);
   public static class_1790 field_40022 = new class_1790(field_39992, String.class);
   public static class_9859 field_40188 = new class_9859(class_2729.class);
   public static class_1790 field_40172 = new class_1790(field_40188, Map.class);
   public static class_9859 field_39994 = new class_9859(class_2127.class);
   public static class_1790 field_39842 = new class_1790(field_39994, class_8169.class);
   public static class_9859 field_40152 = new class_9859(class_3300.class);
   public static class_1790 field_40046 = new class_1790(field_40152, class_8169.class);
   public static class_9859 field_40230 = new class_9859(MinecraftClient.class);
   public static class_1790 field_40105 = new class_1790(
      new class_7880(MinecraftClient.class, new Class[]{class_159.class}, int.class, new Class[]{String.class}, "debugFPS")
   );
   public static class_1790 field_39860 = new class_1790(field_40230, class_950.class);
   public static class_9859 field_40186 = new class_9859(class_600.class);
   public static class_1790 field_39931 = new class_1790(field_40186, class_1549.class);
   public static class_9859 field_40077 = new class_9859(class_3851.class);
   public static class_8522 field_40220 = new class_8522(field_40077, class_1549.class, 4);
   public static class_9859 field_39855 = new class_9859(class_5301.class);
   public static class_8522 field_40014 = new class_8522(field_39855, class_1549.class, 6);
   public static class_9859 field_39948 = new class_9859(class_5107.class);
   public static class_1790 field_40115 = new class_1790(field_39948, class_1549.class);
   public static class_1790 field_40134 = new class_1790(field_39948, class_1549[].class);
   public static class_9859 field_40150 = new class_9859(class_8197.class);
   public static class_8522 field_40133 = new class_8522(field_40150, class_1549.class, 7);
   public static class_9859 field_40237 = new class_9859(class_472.class);
   public static class_8522 field_40040 = new class_8522(field_40237, class_1549.class, 8);
   public static class_9859 field_40224 = new class_9859(class_6094.class);
   public static class_8522 field_40048 = new class_8522(field_40224, class_1549.class, 7);
   public static class_9859 field_40205 = new class_9859(class_7236.class);
   public static class_8522 field_40110 = new class_8522(field_40205, class_1549.class, 7);
   public static class_9859 field_40083 = new class_9859(class_170.class);
   public static class_8522 field_40147 = new class_8522(field_40083, class_1549.class, 20);
   public static class_9859 field_40131 = new class_9859(class_8205.class);
   public static class_8522 field_40062 = new class_8522(field_40131, class_1549.class, 3);
   public static class_9859 field_39922 = new class_9859(class_7974.class);
   public static class_1790 field_40153 = new class_1790(field_39922, class_1549[].class);
   public static class_9859 field_40091 = new class_9859(class_8883.class);
   public static class_8522 field_40033 = new class_8522(field_40091, class_1549.class, 3);
   public static class_9859 field_39988 = new class_9859(class_2574.class);
   public static class_1790 field_39928 = new class_1790(field_39988, class_1549.class, 0);
   public static class_1790 field_40002 = new class_1790(field_39988, class_1549.class, 1);
   public static class_1790 field_40069 = new class_1790(field_39988, class_1549[].class, 0);
   public static class_1790 field_39868 = new class_1790(field_39988, class_1549[].class, 1);
   public static class_9859 field_40183 = new class_9859(class_7840.class);
   public static class_1790 field_40088 = new class_1790(field_40183, class_1549.class, 0);
   public static class_1790 field_39902 = new class_1790(field_40183, class_1549.class, 1);
   public static class_9859 field_40173 = new class_9859(class_3192.class);
   public static class_8522 field_40223 = new class_8522(field_40173, class_1549.class, 11);
   public static class_9859 field_40156 = new class_9859(class_4094.class);
   public static class_8522 field_39916 = new class_8522(field_40156, class_1549.class, 2);
   public static class_9859 field_40008 = new class_9859(class_5723.class);
   public static class_8522 field_40081 = new class_8522(field_40008, class_1549.class, 8);
   public static class_9859 field_40194 = new class_9859(class_7946.class);
   public static class_8522 field_40128 = new class_8522(field_40194, class_1549.class, 6);
   public static class_9859 field_40212 = new class_9859(class_6980.class);
   public static class_8522 field_39883 = new class_8522(field_40212, class_1549.class, 10);
   public static class_9859 field_40015 = new class_9859(class_2743.class);
   public static class_1790 field_39982 = new class_1790(field_40015, class_1549.class);
   public static class_9859 field_39869 = new class_9859(class_6073.class);
   public static class_1790 field_39906 = new class_1790(field_39869, class_2743.class);
   public static class_9859 field_40107 = new class_9859(class_9166.class);
   public static class_8522 field_39891 = new class_8522(field_40107, class_1549.class, 8);
   public static class_9859 field_40041 = new class_9859(class_1921.class);
   public static class_1790 field_39976 = new class_1790(field_40041, class_1549[].class);
   public static class_9859 field_40112 = new class_9859(class_7307.class);
   public static class_1790 field_40113 = new class_1790(field_40112, class_1549.class);
   public static class_1790 field_40162 = new class_1790(field_40112, class_1549[].class);
   public static class_9859 field_39919 = new class_9859(class_9067.class);
   public static class_8522 field_40247 = new class_8522(field_39919, class_1549.class, 8);
   public static class_9859 field_40143 = new class_9859(class_5861.class);
   public static class_8522 field_40036 = new class_8522(field_40143, class_1549.class, 7);
   public static class_9859 field_39879 = new class_9859(class_151.class);
   public static class_8522 field_40060 = new class_8522(field_39879, class_1549.class, 11);
   public static class_9859 field_39882 = new class_9859(class_1085.class);
   public static class_8522 field_39953 = new class_8522(field_39882, class_1549.class, 13);
   public static class_9859 field_39849 = new class_9859(class_1652.class);
   public static class_8522 field_40026 = new class_8522(field_39849, class_1549.class, 11);
   public static class_9859 field_40127 = new class_9859(class_6802.class);
   public static class_8522 field_39905 = new class_8522(field_40127, class_1549.class, 6);
   public static class_9859 field_39998 = new class_9859(class_6484.class);
   public static class_8522 field_39930 = new class_8522(field_39998, class_1549.class, 6);
   public static class_9859 field_40151 = new class_9859(class_4490.class);
   public static class_8522 field_40170 = new class_8522(field_40151, class_1549.class, 12);
   public static class_9859 field_39956 = new class_9859(class_8575.class);
   public static class_8522 field_40203 = new class_8522(field_39956, class_1549.class, 8);
   public static class_9859 field_39970 = new class_9859(class_3363.class);
   public static class_8522 field_40111 = new class_8522(field_39970, class_1549.class, 5);
   public static class_9859 field_39838 = new class_9859(class_7916.class);
   public static class_8522 field_40216 = new class_8522(field_39838, class_1549.class, 3);
   public static class_9859 field_40028 = new class_9859(class_7834.class);
   public static class_1790 field_40210 = new class_1790(field_40028, class_1549.class);
   public static class_9859 field_40130 = new class_9859(class_6679.class);
   public static class_8522 field_40242 = new class_8522(field_40130, class_1549.class, 2);
   public static class_9859 field_40241 = new class_9859(class_1570.class);
   public static class_1790 field_39983 = new class_1790(field_40241, class_1549.class);
   public static class_9859 field_39940 = new class_9859(class_7661.class);
   public static class_1790 field_40101 = new class_1790(field_39940, class_1549[].class, 0);
   public static class_1790 field_40225 = new class_1790(field_39940, class_1549[].class, 1);
   public static class_9859 field_39874 = new class_9859(class_1290.class);
   public static class_8522 field_39947 = new class_8522(field_39874, class_1549.class, 4);
   public static class_9859 field_39989 = new class_9859(class_7749.class);
   public static class_8522 field_40219 = new class_8522(field_39989, class_1549.class, 5);
   public static class_9859 field_39961 = new class_9859(class_1207.class);
   public static class_8522 field_40000 = new class_8522(field_39961, class_1549.class, 11);
   public static class_9859 field_39878 = new class_9859(class_4217.class);
   public static class_1790 field_40129 = new class_1790(field_39878, class_1549.class);
   public static class_1790 field_40185 = new class_1790(field_39878, class_1549[].class);
   public static class_9859 field_39945 = new class_9859(class_1818.class);
   public static class_8522 field_40200 = new class_8522(field_39945, class_1549.class, 5);
   public static class_9859 field_40104 = new class_9859(class_2313.class);
   public static class_8522 field_39995 = new class_8522(field_40104, class_1549.class, 6);
   public static class_9859 field_40142 = new class_9859(class_7677.class);
   public static class_1790 field_40067 = new class_1790(field_40142, class_1549.class, 0);
   public static class_9859 field_40057 = new class_9859(class_8071.class);
   public static class_1790 field_39854 = new class_1790(field_40057, class_1549.class, 0);
   public static class_1790 field_39877 = new class_1790(field_40057, class_1549.class, 1);
   public static class_9859 field_40086 = new class_9859(class_5103.class);
   public static class_8522 field_40174 = new class_8522(field_40086, class_1549.class, 9);
   public static class_9859 field_40030 = new class_9859(class_4845.class);
   public static class_1790 field_39980 = new class_1790(field_40030, class_1549.class, 0);
   public static class_9859 field_39968 = new class_9859(class_379.class);
   public static class_1790 field_39937 = new class_1790(field_39968, class_1549[].class, 0);
   public static class_1790 field_40189 = new class_1790(field_39968, class_1549[].class, 1);
   public static class_9859 field_39901 = new class_9859(class_8875.class);
   public static class_8522 field_40087 = new class_8522(field_39901, class_1549.class, 10);
   public static class_9859 field_40102 = class_8835.method_40639();
   public static class_817 field_40196 = new class_817(field_40102, "getOptiFineResourceStream");
   public static class_9859 field_40003 = new class_9859(class_1133.class);
   public static class_1790 field_40221 = new class_1790(field_40003, class_4803.class);
   public static class_9859 field_39936 = new class_9859(class_1312.class);
   public static class_1790 field_40059 = new class_1790(field_39936, class_8883.class);
   public static class_9859 field_40109 = new class_9859(class_2207.class);
   public static class_1790 field_39888 = new class_1790(field_40109, class_6802.class);
   public static class_1790 field_40236 = new class_1790(field_40109, class_1652.class);
   public static class_1790 field_40054 = new class_1790(field_40109, class_1085.class);
   public static class_9859 field_40184 = new class_9859(class_6906.class);
   public static class_1790 field_40053 = new class_1790(field_40184, class_6521.class);
   public static class_9859 field_39884 = new class_9859(class_6792.class);
   public static class_1790 field_39903 = new class_1790(field_39884, class_7834.class);
   public static class_9859 field_40061 = new class_9859(class_5008.class);
   public static class_1790 field_40012 = new class_1790(field_40061, class_1818.class);
   public static class_1790 field_39880 = new class_1790(field_40061, class_2313.class);
   public static class_9859 field_40178 = new class_9859(class_9133.class);
   public static class_1790 field_40119 = new class_1790(field_40178, class_1570.class);
   public static class_9859 field_40058 = new class_9859(class_9429.class);
   public static class_8522 field_40222 = new class_8522(field_40058, class_1549.class, 3);
   public static class_9859 field_40164 = new class_9859(class_1365.class);
   public static class_1790 field_40198 = new class_1790(field_40164, class_1549.class, 0);
   public static class_1790 field_39898 = new class_1790(field_40164, class_1549.class, 1);
   public static class_1790 field_39986 = new class_1790(field_40164, class_1549[].class);
   public static class_9859 field_40016 = new class_9859(class_1100.class);
   public static class_1790 field_40094 = new class_1790(field_40016, ITextComponent.class);
   public static class_9859 field_39939 = new class_9859(class_4732.class);
   public static class_8522 field_40191 = new class_8522(field_39939, class_1549.class, 9);
   public static class_9859 field_39993 = new class_9859(class_4293.class);
   public static class_1790 field_40072 = new class_1790(field_39993, class_8197.class);
   public static class_9859 field_40169 = new class_9859(class_6963.class);
   public static class_1790 field_40249 = new class_1790(field_40169, class_7916.class);
   public static class_9859 field_39911 = new class_9859(class_3913.class);
   public static class_1790 field_39871 = new class_1790(field_39911, class_6679.class);
   public static class_9859 field_39942 = new class_9859(class_903.class);
   public static class_1790 field_40215 = new class_1790(field_39942, Map.class, 0);

   public static void method_35547(class_817 var0, Object... var1) {
      try {
         Method var4 = var0.method_3580();
         if (var4 == null) {
            return;
         }

         var4.invoke(null, var1);
      } catch (Throwable var5) {
         method_35587(var5, null, var0, var1);
      }
   }

   public static boolean method_35566(class_817 var0, Object... var1) {
      try {
         Method var4 = var0.method_3580();
         if (var4 == null) {
            return false;
         } else {
            Boolean var5 = (Boolean)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method_35587(var6, null, var0, var1);
         return false;
      }
   }

   public static int method_35570(class_817 var0, Object... var1) {
      try {
         Method var4 = var0.method_3580();
         if (var4 == null) {
            return 0;
         } else {
            Integer var5 = (Integer)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method_35587(var6, null, var0, var1);
         return 0;
      }
   }

   public static long method_35572(class_817 var0, Object... var1) {
      try {
         Method var4 = var0.method_3580();
         if (var4 == null) {
            return 0L;
         } else {
            Long var5 = (Long)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method_35587(var6, null, var0, var1);
         return 0L;
      }
   }

   public static float method_35586(class_817 var0, Object... var1) {
      try {
         Method var4 = var0.method_3580();
         if (var4 == null) {
            return 0.0F;
         } else {
            Float var5 = (Float)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method_35587(var6, null, var0, var1);
         return 0.0F;
      }
   }

   public static double method_35579(class_817 var0, Object... var1) {
      try {
         Method var4 = var0.method_3580();
         if (var4 == null) {
            return 0.0;
         } else {
            Double var5 = (Double)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method_35587(var6, null, var0, var1);
         return 0.0;
      }
   }

   public static String method_35576(class_817 var0, Object... var1) {
      try {
         Method var4 = var0.method_3580();
         return var4 == null ? null : (String)var4.invoke(null, var1);
      } catch (Throwable var5) {
         method_35587(var5, null, var0, var1);
         return null;
      }
   }

   public static Object method_35556(class_817 var0, Object... var1) {
      try {
         Method var4 = var0.method_3580();
         return var4 == null ? null : var4.invoke(null, var1);
      } catch (Throwable var5) {
         method_35587(var5, null, var0, var1);
         return null;
      }
   }

   public static void method_35546(Object var0, class_817 var1, Object... var2) {
      try {
         if (var0 == null) {
            return;
         }

         Method var5 = var1.method_3580();
         if (var5 == null) {
            return;
         }

         var5.invoke(var0, var2);
      } catch (Throwable var6) {
         method_35587(var6, var0, var1, var2);
      }
   }

   public static boolean method_35565(Object var0, class_817 var1, Object... var2) {
      try {
         Method var5 = var1.method_3580();
         if (var5 == null) {
            return false;
         } else {
            Boolean var6 = (Boolean)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method_35587(var7, var0, var1, var2);
         return false;
      }
   }

   public static int method_35569(Object var0, class_817 var1, Object... var2) {
      try {
         Method var5 = var1.method_3580();
         if (var5 == null) {
            return 0;
         } else {
            Integer var6 = (Integer)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method_35587(var7, var0, var1, var2);
         return 0;
      }
   }

   public static long method_35571(Object var0, class_817 var1, Object... var2) {
      try {
         Method var5 = var1.method_3580();
         if (var5 == null) {
            return 0L;
         } else {
            Long var6 = (Long)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method_35587(var7, var0, var1, var2);
         return 0L;
      }
   }

   public static float method_35585(Object var0, class_817 var1, Object... var2) {
      try {
         Method var5 = var1.method_3580();
         if (var5 == null) {
            return 0.0F;
         } else {
            Float var6 = (Float)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method_35587(var7, var0, var1, var2);
         return 0.0F;
      }
   }

   public static double method_35578(Object var0, class_817 var1, Object... var2) {
      try {
         Method var5 = var1.method_3580();
         if (var5 == null) {
            return 0.0;
         } else {
            Double var6 = (Double)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method_35587(var7, var0, var1, var2);
         return 0.0;
      }
   }

   public static String method_35575(Object var0, class_817 var1, Object... var2) {
      try {
         Method var5 = var1.method_3580();
         return var5 == null ? null : (String)var5.invoke(var0, var2);
      } catch (Throwable var6) {
         method_35587(var6, var0, var1, var2);
         return null;
      }
   }

   public static Object method_35555(Object var0, class_817 var1, Object... var2) {
      try {
         Method var5 = var1.method_3580();
         return var5 == null ? null : var5.invoke(var0, var2);
      } catch (Throwable var6) {
         method_35587(var6, var0, var1, var2);
         return null;
      }
   }

   public static Object method_35559(class_1790 var0) {
      return method_35557(null, var0);
   }

   public static Object method_35557(Object var0, class_1790 var1) {
      try {
         Field var4 = var1.method_7977();
         return var4 == null ? null : var4.get(var0);
      } catch (Throwable var5) {
         class_9569.method_44220("", var5);
         return null;
      }
   }

   public static boolean method_35551(Object var0, class_1790 var1, boolean var2) {
      try {
         Field var5 = var1.method_7977();
         return var5 == null ? var2 : var5.getBoolean(var0);
      } catch (Throwable var6) {
         class_9569.method_44220("", var6);
         return var2;
      }
   }

   public static Object method_35560(class_8522 var0, int var1) {
      class_1790 var4 = var0.method_39233(var1);
      return var4 != null ? method_35559(var4) : null;
   }

   public static Object method_35558(Object var0, class_8522 var1, int var2) {
      class_1790 var5 = var1.method_39233(var2);
      return var5 != null ? method_35557(var0, var5) : null;
   }

   public static float method_35584(Object var0, class_1790 var1, float var2) {
      try {
         Field var5 = var1.method_7977();
         return var5 == null ? var2 : var5.getFloat(var0);
      } catch (Throwable var6) {
         class_9569.method_44220("", var6);
         return var2;
      }
   }

   public static int method_35553(class_1790 var0, int var1) {
      return method_35552(null, var0, var1);
   }

   public static int method_35552(Object var0, class_1790 var1, int var2) {
      try {
         Field var5 = var1.method_7977();
         return var5 == null ? var2 : var5.getInt(var0);
      } catch (Throwable var6) {
         class_9569.method_44220("", var6);
         return var2;
      }
   }

   public static long method_35583(Object var0, class_1790 var1, long var2) {
      try {
         Field var6 = var1.method_7977();
         return var6 == null ? var2 : var6.getLong(var0);
      } catch (Throwable var7) {
         class_9569.method_44220("", var7);
         return var2;
      }
   }

   public static boolean method_35563(class_1790 var0, Object var1) {
      return method_35561(null, var0, var1);
   }

   public static boolean method_35562(Object var0, class_8522 var1, int var2, Object var3) {
      class_1790 var6 = var1.method_39233(var2);
      if (var6 != null) {
         method_35561(var0, var6, var3);
         return true;
      } else {
         return false;
      }
   }

   public static boolean method_35561(Object var0, class_1790 var1, Object var2) {
      try {
         Field var5 = var1.method_7977();
         if (var5 == null) {
            return false;
         } else {
            var5.set(var0, var2);
            return true;
         }
      } catch (Throwable var6) {
         class_9569.method_44220("", var6);
         return false;
      }
   }

   public static boolean method_35550(class_1790 var0, int var1) {
      return method_35549(null, var0, var1);
   }

   public static boolean method_35549(Object var0, class_1790 var1, int var2) {
      try {
         Field var5 = var1.method_7977();
         if (var5 == null) {
            return false;
         } else {
            var5.setInt(var0, var2);
            return true;
         }
      } catch (Throwable var6) {
         class_9569.method_44220("", var6);
         return false;
      }
   }

   public static boolean method_35568(class_4911 var0, Object... var1) {
      Object var4 = method_35574(var0, var1);
      return var4 != null ? method_35567(var4) : false;
   }

   public static boolean method_35567(Object var0) {
      if (var0 != null) {
         Object var3 = method_35559(field_39915);
         if (var3 != null) {
            Object var4 = method_35555(var3, field_39978, var0);
            if (var4 instanceof Boolean) {
               Boolean var5 = (Boolean)var4;
               return var5;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static Object method_35574(class_4911 var0, Object... var1) {
      Constructor var4 = var0.method_22502();
      if (var4 == null) {
         return null;
      } else {
         try {
            return var4.newInstance(var1);
         } catch (Throwable var6) {
            method_35588(var6, var0, var1);
            return null;
         }
      }
   }

   public static boolean method_35577(Class[] var0, Class[] var1) {
      if (var0.length != var1.length) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            Class var5 = var0[var4];
            Class var6 = var1[var4];
            if (var5 != var6) {
               return false;
            }
         }

         return true;
      }
   }

   private static void method_35564(boolean var0, String var1, class_817 var2, Object[] var3, Object var4) {
      String var7 = var2.method_3580().getDeclaringClass().getName();
      String var8 = var2.method_3580().getName();
      String var9 = "";
      if (var0) {
         var9 = " static";
      }

      class_9569.method_44223(var1 + var9 + " " + var7 + "." + var8 + "(" + class_5657.method_25595(var3) + ") => " + var4);
   }

   private static void method_35581(boolean var0, String var1, class_817 var2, Object[] var3) {
      String var6 = var2.method_3580().getDeclaringClass().getName();
      String var7 = var2.method_3580().getName();
      String var8 = "";
      if (var0) {
         var8 = " static";
      }

      class_9569.method_44223(var1 + var8 + " " + var6 + "." + var7 + "(" + class_5657.method_25595(var3) + ")");
   }

   private static void method_35554(boolean var0, String var1, class_1790 var2, Object var3) {
      String var6 = var2.method_7977().getDeclaringClass().getName();
      String var7 = var2.method_7977().getName();
      String var8 = "";
      if (var0) {
         var8 = " static";
      }

      class_9569.method_44223(var1 + var8 + " " + var6 + "." + var7 + " => " + var3);
   }

   private static void method_35587(Throwable var0, Object var1, class_817 var2, Object[] var3) {
      if (!(var0 instanceof InvocationTargetException)) {
         class_9569.method_44224("*** Exception outside of method ***");
         class_9569.method_44224("Method deactivated: " + var2.method_3580());
         var2.method_3583();
         if (var0 instanceof IllegalArgumentException) {
            class_9569.method_44224("*** IllegalArgumentException ***");
            class_9569.method_44224("Method: " + var2.method_3580());
            class_9569.method_44224("Object: " + var1);
            class_9569.method_44224("Parameter classes: " + class_5657.method_25595(method_35573(var3)));
            class_9569.method_44224("Parameters: " + class_5657.method_25595(var3));
         }

         class_9569.method_44225("", var0);
      } else {
         Throwable var6 = var0.getCause();
         if (var6 instanceof RuntimeException) {
            RuntimeException var7 = (RuntimeException)var6;
            throw var7;
         }

         class_9569.method_44220("", var0);
      }
   }

   private static void method_35588(Throwable var0, class_4911 var1, Object[] var2) {
      if (!(var0 instanceof InvocationTargetException)) {
         class_9569.method_44224("*** Exception outside of constructor ***");
         class_9569.method_44224("Constructor deactivated: " + var1.method_22502());
         var1.method_22498();
         if (var0 instanceof IllegalArgumentException) {
            class_9569.method_44224("*** IllegalArgumentException ***");
            class_9569.method_44224("Constructor: " + var1.method_22502());
            class_9569.method_44224("Parameter classes: " + class_5657.method_25595(method_35573(var2)));
            class_9569.method_44224("Parameters: " + class_5657.method_25595(var2));
         }

         class_9569.method_44225("", var0);
      } else {
         class_9569.method_44220("", var0);
      }
   }

   private static Object[] method_35573(Object[] var0) {
      if (var0 != null) {
         Class[] var3 = new Class[var0.length];

         for (int var4 = 0; var4 < var3.length; var4++) {
            Object var5 = var0[var4];
            if (var5 != null) {
               var3[var4] = var5.getClass();
            }
         }

         return var3;
      } else {
         return new Class[0];
      }
   }

   private static class_1790[] method_35582(class_9859 var0, Class var1, int var2) {
      class_1790[] var5 = new class_1790[var2];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = new class_1790(var0, var1, var6);
      }

      return var5;
   }

   private static boolean method_35548(String var0) {
      class_3414 var4 = new class_3414(var0);
      class_9696.method_44804(var4);
      return true;
   }
}
