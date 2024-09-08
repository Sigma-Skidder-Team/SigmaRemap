package mapped;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.optifine.reflect.FieldLocatorTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9299 {
   private static final Logger field42759 = LogManager.getLogger();
   private static boolean field42760 = method35096("*** Reflector Forge ***");
   public static Class6636 field42761 = new Class6636("mods.betterfoliage.client.BetterFoliageClient");
   public static Class6636 field42762 = new Class6636("net.minecraftforge.fml.BrandingControl");
   public static Class6631 field42763 = new Class6631(field42762, "getBrandings");
   public static Class6631 field42764 = new Class6631(field42762, "forEachLine");
   public static Class6631 field42765 = new Class6631(field42762, "forEachAboveCopyrightLine");
   public static Class6636 field42766 = new Class6636("net.minecraftforge.common.capabilities.ICapabilityProvider");
   public static Class6636 field42767 = new Class6636("net.minecraftforge.common.capabilities.CapabilityProvider");
   public static Class6631 field42768 = new Class6631(field42767, "gatherCapabilities", new Class[0]);
   public static Class6636 field42769 = new Class6636("net.minecraftforge.fml.client.ClientModLoader");
   public static Class6631 field42770 = new Class6631(field42769, "isLoading");
   public static Class6631 field42771 = new Class6631(field42769, "renderProgressText");
   public static Class6636 field42772 = new Class6636("net.minecraftforge.event.world.ChunkDataEvent$Save");
   public static Class6634 field42773 = new Class6634(field42772, new Class[]{IChunk.class, Class1660.class, CompoundNBT.class});
   public static Class6636 field42774 = new Class6636("net.minecraftforge.event.world.ChunkEvent$Load");
   public static Class6634 field42775 = new Class6634(field42774, new Class[]{IChunk.class});
   public static Class6636 field42776 = new Class6636("net.minecraftforge.event.world.ChunkEvent$Unload");
   public static Class6634 field42777 = new Class6634(field42776, new Class[]{IChunk.class});
   public static Class6636 field42778 = new Class6636("net.minecraftforge.fml.client.ClientHooks");
   public static Class6631 field42779 = new Class6631(field42778, "trackBrokenTexture");
   public static Class6631 field42780 = new Class6631(field42778, "trackMissingTexture");
   public static Class6636 field42781 = new Class6636("net.minecraftforge.fml.CrashReportExtender");
   public static Class6631 field42782 = new Class6631(field42781, "enhanceCrashReport");
   public static Class6631 field42783 = new Class6631(field42781, "addCrashReportHeader");
   public static Class6631 field42784 = new Class6631(field42781, "generateEnhancedStackTrace", new Class[]{Throwable.class});
   public static Class6631 field42785 = new Class6631(field42781, "generateEnhancedStackTrace", new Class[]{StackTraceElement[].class});
   public static Class6636 field42786 = new Class6636("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre");
   public static Class6634 field42787 = new Class6634(field42786, new Class[]{Screen.class, MatrixStack.class, int.class, int.class, float.class});
   public static Class6636 field42788 = new Class6636("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post");
   public static Class6634 field42789 = new Class6634(field42788, new Class[]{Screen.class, MatrixStack.class, int.class, int.class, float.class});
   public static Class6636 field42790 = new Class6636("net.minecraftforge.fml.loading.progress.EarlyProgressVisualization");
   public static Class6633 field42791 = new Class6633(field42790, "INSTANCE");
   public static Class6631 field42792 = new Class6631(field42790, "handOffWindow");
   public static Class6636 field42793 = new Class6636("net.minecraftforge.event.entity.EntityLeaveWorldEvent");
   public static Class6634 field42794 = new Class6634(field42793, new Class[]{Entity.class, World.class});
   public static Class6636 field42795 = new Class6636("net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup");
   public static Class6631 field42796 = new Class6631(field42795, "getYaw");
   public static Class6631 field42797 = new Class6631(field42795, "getPitch");
   public static Class6631 field42798 = new Class6631(field42795, "getRoll");
   public static Class6636 field42799 = new Class6636("net.minecraftforge.client.event.EntityViewRenderEvent$FogColors");
   public static Class6634 field42800 = new Class6634(field42799, new Class[]{ActiveRenderInfo.class, float.class, float.class, float.class, float.class});
   public static Class6631 field42801 = new Class6631(field42799, "getRed");
   public static Class6631 field42802 = new Class6631(field42799, "getGreen");
   public static Class6631 field42803 = new Class6631(field42799, "getBlue");
   public static Class6636 field42804 = new Class6636("net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent");
   public static Class6634 field42805 = new Class6634(field42804, new Class[]{Class2040.class, ActiveRenderInfo.class, float.class, float.class});
   public static Class6636 field42806 = new Class6636("net.minecraftforge.event.entity.EntityJoinWorldEvent");
   public static Class6634 field42807 = new Class6634(field42806, new Class[]{Entity.class, World.class});
   public static Class6636 field42808 = new Class6636("net.minecraftforge.eventbus.api.Event");
   public static Class6631 field42809 = new Class6631(field42808, "isCanceled");
   public static Class6631 field42810 = new Class6631(field42808, "getResult");
   public static Class6636 field42811 = new Class6636("net.minecraftforge.eventbus.api.IEventBus");
   public static Class6631 field42812 = new Class6631(field42811, "post");
   public static Class6636 field42813 = new Class6636("net.minecraftforge.eventbus.api.Event$Result");
   public static Class6633 field42814 = new Class6633(field42813, "DENY");
   public static Class6633 field42815 = new Class6633(field42813, "ALLOW");
   public static Class6633 field42816 = new Class6633(field42813, "DEFAULT");
   public static Class6636 field42817 = new Class6636("net.minecraftforge.common.extensions.IForgeBlock");
   public static Class6631 field42818 = new Class6631(field42817, "getTags");
   public static Class6636 field42819 = new Class6636("net.minecraftforge.client.model.pipeline.ForgeBlockModelRenderer");
   public static Class6634 field42820 = new Class6634(field42819, new Class[]{BlockColors.class});
   public static Class6636 field42821 = new Class6636(BlockModelShapes.class);
   public static Class6631 field42822 = new Class6631(field42821, "getTexture", new Class[]{BlockState.class, World.class, BlockPos.class});
   public static Class6636 field42823 = new Class6636("net.minecraftforge.common.extensions.IForgeBlockState");
   public static Class6631 field42824 = new Class6631(field42823, "addDestroyEffects");
   public static Class6631 field42825 = new Class6631(field42823, "addHitEffects");
   public static Class6631 field42826 = new Class6631(field42823, "getLightValue", new Class[]{IBlockReader.class, BlockPos.class});
   public static Class6631 field42827 = new Class6631(field42823, "getSoundType", new Class[]{Class1662.class, BlockPos.class, Entity.class});
   public static Class6631 field42828 = new Class6631(field42823, "getStateAtViewpoint");
   public static Class6631 field42829 = new Class6631(field42823, "hasTileEntity");
   public static Class6631 field42830 = new Class6631(field42823, "isAir", new Class[]{IBlockReader.class, BlockPos.class});
   public static Class6631 field42831 = new Class6631(field42823, "shouldDisplayFluidOverlay");
   public static Class6636 field42832 = new Class6636("net.minecraftforge.common.extensions.IForgeFluid");
   public static Class6631 field42833 = new Class6631(field42832, "getAttributes");
   public static Class6636 field42834 = new Class6636("net.minecraftforge.common.extensions.IForgeEntity");
   public static Class6631 field42835 = new Class6631(field42834, "canUpdate", new Class[0]);
   public static Class6631 field42836 = new Class6631(field42834, "onAddedToWorld");
   public static Class6631 field42837 = new Class6631(field42834, "onRemovedFromWorld");
   public static Class6631 field42838 = new Class6631(field42834, "shouldRiderSit");
   public static Class6636 field42839 = new Class6636("net.minecraftforge.fluids.FluidAttributes");
   public static Class6631 field42840 = new Class6631(field42839, "getColor", new Class[]{Class1663.class, BlockPos.class});
   public static Class6636 field42841 = new Class6636(EntityType.class);
   public static Class6631 field42842 = new Class6631(field42841, "getTags");
   public static Class6636 field42843 = new Class6636("net.minecraftforge.event.ForgeEventFactory");
   public static Class6631 field42844 = new Class6631(field42843, "canEntityDespawn");
   public static Class6631 field42845 = new Class6631(
      field42843, "fireChunkWatch", new Class[]{boolean.class, boolean.class, ServerPlayerEntity.class, Class7481.class, ServerWorld.class}
   );
   public static Class6631 field42846 = new Class6631(field42843, "getMaxSpawnPackSize");
   public static Class6631 field42847 = new Class6631(field42843, "getMobGriefingEvent");
   public static Class6631 field42848 = new Class6631(field42843, "onPlaySoundAtEntity");
   public static Class6631 field42849 = new Class6631(field42843, "renderBlockOverlay");
   public static Class6631 field42850 = new Class6631(field42843, "renderFireOverlay");
   public static Class6631 field42851 = new Class6631(field42843, "renderWaterOverlay");
   public static Class6636 field42852 = new Class6636(Fluid.class);
   public static Class6631 field42853 = new Class6631(field42852, "getTags");
   public static Class6636 field42854 = new Class6636("net.minecraftforge.common.ForgeHooks");
   public static Class6631 field42855 = new Class6631(field42854, "onDifficultyChange");
   public static Class6631 field42856 = new Class6631(field42854, "onLivingAttack");
   public static Class6631 field42857 = new Class6631(field42854, "onLivingDeath");
   public static Class6631 field42858 = new Class6631(field42854, "onLivingDrops");
   public static Class6631 field42859 = new Class6631(field42854, "onLivingFall");
   public static Class6631 field42860 = new Class6631(field42854, "onLivingHurt");
   public static Class6631 field42861 = new Class6631(field42854, "onLivingJump");
   public static Class6631 field42862 = new Class6631(field42854, "onLivingSetAttackTarget");
   public static Class6631 field42863 = new Class6631(field42854, "onLivingUpdate");
   public static Class6636 field42864 = new Class6636("net.minecraftforge.client.ForgeHooksClient");
   public static Class6631 field42865 = new Class6631(
      field42864, "dispatchRenderLast", new Class[]{WorldRenderer.class, MatrixStack.class, float.class, Matrix4f.class, long.class}
   );
   public static Class6631 field42866 = new Class6631(field42864, "drawItemLayered");
   public static Class6631 field42867 = new Class6631(field42864, "drawScreen");
   public static Class6631 field42868 = new Class6631(field42864, "fillNormal");
   public static Class6631 field42869 = new Class6631(field42864, "fireKeyInput");
   public static Class6631 field42870 = new Class6631(field42864, "handleCameraTransforms");
   public static Class6631 field42871 = new Class6631(field42864, "handlePerspective");
   public static Class6631 field42872 = new Class6631(field42864, "gatherFluidTextures");
   public static Class6631 field42873 = new Class6631(field42864, "getArmorModel");
   public static Class6631 field42874 = new Class6631(field42864, "getArmorTexture");
   public static Class6631 field42875 = new Class6631(field42864, "getFluidSprites");
   public static Class6631 field42876 = new Class6631(field42864, "getFogDensity");
   public static Class6631 field42877 = new Class6631(field42864, "getFOVModifier");
   public static Class6631 field42878 = new Class6631(field42864, "getOffsetFOV");
   public static Class6631 field42879 = new Class6631(field42864, "isNameplateInRenderDistance");
   public static Class6631 field42880 = new Class6631(field42864, "loadEntityShader");
   public static Class6631 field42881 = new Class6631(field42864, "onCameraSetup");
   public static Class6631 field42882 = new Class6631(field42864, "onDrawBlockHighlight");
   public static Class6631 field42883 = new Class6631(field42864, "onFogRender");
   public static Class6631 field42884 = new Class6631(field42864, "onGuiCharTypedPre");
   public static Class6631 field42885 = new Class6631(field42864, "onGuiCharTypedPost");
   public static Class6631 field42886 = new Class6631(field42864, "onGuiKeyPressedPre");
   public static Class6631 field42887 = new Class6631(field42864, "onGuiKeyPressedPost");
   public static Class6631 field42888 = new Class6631(field42864, "onGuiKeyReleasedPre");
   public static Class6631 field42889 = new Class6631(field42864, "onGuiKeyReleasedPost");
   public static Class6631 field42890 = new Class6631(field42864, "onScreenshot");
   public static Class6631 field42891 = new Class6631(field42864, "onTextureStitchedPre");
   public static Class6631 field42892 = new Class6631(field42864, "onTextureStitchedPost");
   public static Class6631 field42893 = new Class6631(field42864, "renderMainMenu");
   public static Class6631 field42894 = new Class6631(field42864, "renderSpecificFirstPersonHand");
   public static Class6631 field42895 = new Class6631(field42864, "setRenderLayer");
   public static Class6631 field42896 = new Class6631(field42864, "shouldCauseReequipAnimation");
   public static Class6636 field42897 = new Class6636("net.minecraftforge.common.ForgeConfig");
   public static Class6633 field42898 = new Class6633(field42897, "CLIENT");
   public static Class6636 field42899 = new Class6636("net.minecraftforge.common.ForgeConfig$Client");
   public static Class6633 field42900 = new Class6633(field42899, "forgeLightPipelineEnabled");
   public static Class6636 field42901 = new Class6636("net.minecraftforge.common.ForgeConfigSpec");
   public static Class6633 field42902 = new Class6633(field42901, "childConfig");
   public static Class6636 field42903 = new Class6636("net.minecraftforge.common.ForgeConfigSpec$ConfigValue");
   public static Class6633 field42904 = new Class6633(field42903, "defaultSupplier");
   public static Class6633 field42905 = new Class6633(field42903, "spec");
   public static Class6631 field42906 = new Class6631(field42903, "get");
   public static Class6636 field42907 = new Class6636(IChunk.class);
   public static Class6631 field42908 = new Class6631(field42907, "getWorldForge");
   public static Class6636 field42909 = new Class6636("net.minecraftforge.common.extensions.IForgeItem");
   public static Class6631 field42910 = new Class6631(field42909, "getDurabilityForDisplay");
   public static Class6631 field42911 = new Class6631(field42909, "getEquipmentSlot");
   public static Class6631 field42912 = new Class6631(field42909, "getFontRenderer");
   public static Class6631 field42913 = new Class6631(field42909, "getItemStackTileEntityRenderer");
   public static Class6631 field42914 = new Class6631(field42909, "getRGBDurabilityForDisplay");
   public static Class6631 field42915 = new Class6631(field42909, "isDamageable", new Class[]{ItemStack.class});
   public static Class6631 field42916 = new Class6631(field42909, "isShield");
   public static Class6631 field42917 = new Class6631(field42909, "onEntitySwing");
   public static Class6631 field42918 = new Class6631(field42909, "shouldCauseReequipAnimation");
   public static Class6631 field42919 = new Class6631(field42909, "showDurabilityBar");
   public static Class6636 field42920 = new Class6636("net.minecraftforge.common.extensions.IForgeItemStack");
   public static Class6631 field42921 = new Class6631(field42920, "canDisableShield");
   public static Class6631 field42922 = new Class6631(field42920, "getEquipmentSlot");
   public static Class6631 field42923 = new Class6631(field42920, "getShareTag");
   public static Class6631 field42924 = new Class6631(field42920, "getHighlightTip");
   public static Class6631 field42925 = new Class6631(field42920, "isShield");
   public static Class6631 field42926 = new Class6631(field42920, "readShareTag");
   public static Class6636 field42927 = new Class6636("net.minecraftforge.fml.ForgeI18n");
   public static Class6631 field42928 = new Class6631(field42927, "loadLanguageData");
   public static Class6636 field42929 = new Class6636(KeyBinding.class);
   public static Class6631 field42930 = new Class6631(field42929, "setKeyConflictContext");
   public static Class6631 field42931 = new Class6631(field42929, "setKeyModifierAndCode");
   public static Class6631 field42932 = new Class6631(field42929, "getKeyModifier");
   public static Class6636 field42933 = new Class6636("net.minecraftforge.common.extensions.IForgeEffectInstance");
   public static Class6631 field42934 = new Class6631(field42933, "isCurativeItem");
   public static Class6631 field42935 = new Class6631(field42933, "shouldRenderHUD");
   public static Class6631 field42936 = field42933.method20249("renderHUDEffect");
   public static Class6636 field42937 = new Class6636("net.minecraftforge.registries.ForgeRegistryEntry");
   public static Class6631 field42938 = new Class6631(field42937, "getRegistryName");
   public static Class6636 field42939 = new Class6636(Class8928.class);
   public static Class6631 field42940 = new Class6631(field42939, "canRenderInLayer", new Class[]{BlockState.class, RenderType.class});
   public static Class6631 field42941 = new Class6631(field42939, "canRenderInLayer", new Class[]{FluidState.class, RenderType.class});
   public static Class6636 field42942 = new Class6636("net.minecraftforge.common.extensions.IForgeTileEntity");
   public static Class6631 field42943 = new Class6631(field42942, "getRenderBoundingBox");
   public static Class6633 field42944 = new Class6633(
      new FieldLocatorTypes(World.class, new Class[]{List.class}, Set.class, new Class[]{Thread.class}, "World.tileEntitiesToBeRemoved")
   );
   public static Class6636 field42945 = new Class6636(Class6349.class);
   public static Class6631 field42946 = field42945.method20249("getCloudRenderHandler");
   public static Class6631 field42947 = field42945.method20249("getSkyRenderHandler");
   public static Class6631 field42948 = field42945.method20249("getWeatherRenderHandler");
   public static Class6636 field42949 = new Class6636("net.minecraftforge.client.IRenderHandler");
   public static Class6631 field42950 = new Class6631(field42949, "render");
   public static Class6636 field42951 = new Class6636("net.minecraftforge.client.ItemModelMesherForge");
   public static Class6634 field42952 = new Class6634(field42951, new Class[]{ModelManager.class});
   public static Class6636 field42953 = new Class6636("net.minecraftforge.client.settings.KeyConflictContext");
   public static Class6633 field42954 = new Class6633(field42953, "IN_GAME");
   public static Class6636 field42955 = new Class6636("net.minecraftforge.client.settings.KeyModifier");
   public static Class6631 field42956 = new Class6631(field42955, "valueFromString");
   public static Class6633 field42957 = new Class6633(field42955, "NONE");
   public static Class6636 field42958 = new Class6636("net.minecraft.launchwrapper.Launch");
   public static Class6633 field42959 = new Class6633(field42958, "blackboard");
   public static Class6636 field42960 = new Class6636("net.minecraftforge.client.model.pipeline.LightUtil");
   public static Class6633 field42961 = new Class6633(field42960, "itemConsumer");
   public static Class6633 field42962 = new Class6633(field42960, "tessellator");
   public static Class6631 field42963 = new Class6631(field42960, "putBakedQuad");
   public static Class6636 field42964 = new Class6636("net.minecraftforge.fml.common.Loader");
   public static Class6631 field42965 = new Class6631(field42964, "getActiveModList");
   public static Class6631 field42966 = new Class6631(field42964, "instance");
   public static Class6636 field42967 = new Class6636("net.minecraftforge.common.MinecraftForge");
   public static Class6633 field42968 = new Class6633(field42967, "EVENT_BUS");
   public static Class6636 field42969 = new Class6636("net.minecraftforge.client.MinecraftForgeClient");
   public static Class6631 field42970 = new Class6631(field42969, "getImageLayer");
   public static Class6636 field42971 = new Class6636("net.minecraftforge.fml.common.ModContainer");
   public static Class6631 field42972 = new Class6631(field42971, "getModId");
   public static Class6636 field42973 = new Class6636("net.minecraftforge.client.model.ModelLoaderRegistry");
   public static Class6631 field42974 = field42973.method20249("onModelLoadingStart");
   public static Class6636 field42975 = new Class6636("net.minecraftforge.fml.client.gui.screen.ModListScreen");
   public static Class6634 field42976 = new Class6634(field42975, new Class[]{Screen.class});
   public static Class6636 field42977 = new Class6636("net.minecraftforge.client.gui.NotificationModUpdateScreen");
   public static Class6631 field42978 = new Class6631(field42977, "init", new Class[]{VanillaMainMenuScreen.class, Button.class});
   public static Class6636 field42979 = new Class6636("net.minecraftforge.event.entity.PlaySoundAtEntityEvent");
   public static Class6631 field42980 = new Class6631(field42979, "getSound");
   public static Class6631 field42981 = new Class6631(field42979, "getCategory");
   public static Class6631 field42982 = new Class6631(field42979, "getVolume");
   public static Class6636 field42983 = new Class6636("net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType");
   public static Class6633 field42984 = new Class6633(field42983, "BLOCK");
   public static Class6636 field42985 = new Class6636("net.minecraftforge.fml.client.registry.RenderingRegistry");
   public static Class6631 field42986 = new Class6631(field42985, "loadEntityRenderers", new Class[]{EntityRendererManager.class});
   public static Class6636 field42987 = new Class6636("net.minecraftforge.client.event.RenderItemInFrameEvent");
   public static Class6634 field42988 = new Class6634(field42987, new Class[]{ItemFrameEntity.class, Class5736.class, MatrixStack.class, Class7733.class, int.class});
   public static Class6636 field42989 = new Class6636("net.minecraftforge.client.event.RenderLivingEvent$Pre");
   public static Class6634 field42990 = new Class6634(
      field42989, new Class[]{LivingEntity.class, Class5712.class, float.class, MatrixStack.class, Class7733.class, int.class}
   );
   public static Class6636 field42991 = new Class6636("net.minecraftforge.client.event.RenderLivingEvent$Post");
   public static Class6634 field42992 = new Class6634(
      field42991, new Class[]{LivingEntity.class, Class5712.class, float.class, MatrixStack.class, Class7733.class, int.class}
   );
   public static Class6636 field42993 = new Class6636("net.minecraftforge.client.event.RenderNameplateEvent");
   public static Class6634 field42994 = new Class6634(
      field42993, new Class[]{Entity.class, ITextComponent.class, Class5715.class, MatrixStack.class, Class7733.class, int.class, float.class}
   );
   public static Class6631 field42995 = new Class6631(field42993, "getContent");
   public static Class6636 field42996 = new Class6636("net.minecraftforge.client.event.ScreenshotEvent");
   public static Class6631 field42997 = new Class6631(field42996, "getCancelMessage");
   public static Class6631 field42998 = new Class6631(field42996, "getScreenshotFile");
   public static Class6631 field42999 = new Class6631(field42996, "getResultMessage");
   public static Class6636 field43000 = new Class6636("net.minecraftforge.fml.server.ServerLifecycleHooks");
   public static Class6631 field43001 = new Class6631(field43000, "handleServerAboutToStart");
   public static Class6631 field43002 = new Class6631(field43000, "handleServerStarting");
   public static Class6636 field43003 = new Class6636("net.minecraftforge.event.world.WorldEvent$Load");
   public static Class6634 field43004 = new Class6634(field43003, new Class[]{Class1660.class});
   private static boolean field43005 = method35096("*** Reflector Vanilla ***");
   public static Class6636 field43006 = new Class6636(ItemEntity.class);
   public static Class6633 field43007 = new Class6633(field43006, DataParameter.class);
   public static Class6636 field43008 = new Class6636(Class5718.class);
   public static Class6633 field43009 = new Class6633(field43008, Class2875.class);
   public static Class6636 field43010 = new Class6636(VanillaMainMenuScreen.class);
   public static Class6633 field43011 = new Class6633(field43010, String.class);
   public static Class6636 field43012 = new Class6636(Class7781.class);
   public static Class6633 field43013 = new Class6633(field43012, Map.class);
   public static Class6636 field43014 = new Class6636(LegacyResourcePackWrapper.class);
   public static Class6633 field43015 = new Class6633(field43014, IResourcePack.class);
   public static Class6636 field43016 = new Class6636(LegacyResourcePackWrapperV4.class);
   public static Class6633 field43017 = new Class6633(field43016, IResourcePack.class);
   public static Class6636 field43018 = new Class6636(Minecraft.class);
   public static Class6633 field43019 = new Class6633(
      new FieldLocatorTypes(Minecraft.class, new Class[]{CrashReport.class}, int.class, new Class[]{String.class}, "debugFPS")
   );
   public static Class6633 field43020 = new Class6633(field43018, FontResourceManager.class);
   public static Class6636 field43021 = new Class6636(Class2845.class);
   public static Class6633 field43022 = new Class6633(field43021, Class7219.class);
   public static Class6636 field43023 = new Class6636(Class2893.class);
   public static Class9475 field43024 = new Class9475(field43023, Class7219.class, 4);
   public static Class6636 field43025 = new Class6636(Class2811.class);
   public static Class9475 field43026 = new Class9475(field43025, Class7219.class, 6);
   public static Class6636 field43027 = new Class6636(Class2886.class);
   public static Class6633 field43028 = new Class6633(field43027, Class7219.class);
   public static Class6633 field43029 = new Class6633(field43027, Class7219[].class);
   public static Class6636 field43030 = new Class6636(Class2850.class);
   public static Class9475 field43031 = new Class9475(field43030, Class7219.class, 7);
   public static Class6636 field43032 = new Class6636(Class2874.class);
   public static Class9475 field43033 = new Class9475(field43032, Class7219.class, 8);
   public static Class6636 field43034 = new Class6636(Class2822.class);
   public static Class9475 field43035 = new Class9475(field43034, Class7219.class, 7);
   public static Class6636 field43036 = new Class6636(Class2890.class);
   public static Class9475 field43037 = new Class9475(field43036, Class7219.class, 7);
   public static Class6636 field43038 = new Class6636(Class2875.class);
   public static Class9475 field43039 = new Class9475(field43038, Class7219.class, 20);
   public static Class6636 field43040 = new Class6636(Class5723.class);
   public static Class9475 field43041 = new Class9475(field43040, Class7219.class, 3);
   public static Class6636 field43042 = new Class6636(Class2807.class);
   public static Class6633 field43043 = new Class6633(field43042, Class7219[].class);
   public static Class6636 field43044 = new Class6636(Class2804.class);
   public static Class9475 field43045 = new Class9475(field43044, Class7219.class, 3);
   public static Class6636 field43046 = new Class6636(Class2820.class);
   public static Class6633 field43047 = new Class6633(field43046, Class7219.class, 0);
   public static Class6633 field43048 = new Class6633(field43046, Class7219.class, 1);
   public static Class6633 field43049 = new Class6633(field43046, Class7219[].class, 0);
   public static Class6633 field43050 = new Class6633(field43046, Class7219[].class, 1);
   public static Class6636 field43051 = new Class6636(Class2846.class);
   public static Class6633 field43052 = new Class6633(field43051, Class7219.class, 0);
   public static Class6633 field43053 = new Class6633(field43051, Class7219.class, 1);
   public static Class6636 field43054 = new Class6636(Class2856.class);
   public static Class9475 field43055 = new Class9475(field43054, Class7219.class, 11);
   public static Class6636 field43056 = new Class6636(Class2857.class);
   public static Class9475 field43057 = new Class9475(field43056, Class7219.class, 2);
   public static Class6636 field43058 = new Class6636(Class2823.class);
   public static Class9475 field43059 = new Class9475(field43058, Class7219.class, 8);
   public static Class6636 field43060 = new Class6636(Class2880.class);
   public static Class9475 field43061 = new Class9475(field43060, Class7219.class, 6);
   public static Class6636 field43062 = new Class6636(Class2864.class);
   public static Class9475 field43063 = new Class9475(field43062, Class7219.class, 10);
   public static Class6636 field43064 = new Class6636(Class2889.class);
   public static Class6633 field43065 = new Class6633(field43064, Class7219.class);
   public static Class6636 field43066 = new Class6636(Class5739.class);
   public static Class6633 field43067 = new Class6633(field43066, Class2889.class);
   public static Class6636 field43068 = new Class6636(Class2854.class);
   public static Class9475 field43069 = new Class9475(field43068, Class7219.class, 8);
   public static Class6636 field43070 = new Class6636(Class2818.class);
   public static Class6633 field43071 = new Class6633(field43070, Class7219[].class);
   public static Class6636 field43072 = new Class6636(Class2882.class);
   public static Class6633 field43073 = new Class6633(field43072, Class7219.class);
   public static Class6633 field43074 = new Class6633(field43072, Class7219[].class);
   public static Class6636 field43075 = new Class6636(Class2860.class);
   public static Class9475 field43076 = new Class9475(field43075, Class7219.class, 8);
   public static Class6636 field43077 = new Class6636(Class2806.class);
   public static Class9475 field43078 = new Class9475(field43077, Class7219.class, 7);
   public static Class6636 field43079 = new Class6636(Class2814.class);
   public static Class9475 field43080 = new Class9475(field43079, Class7219.class, 11);
   public static Class6636 field43081 = new Class6636(Class2812.class);
   public static Class9475 field43082 = new Class9475(field43081, Class7219.class, 13);
   public static Class6636 field43083 = new Class6636(Class2877.class);
   public static Class9475 field43084 = new Class9475(field43083, Class7219.class, 11);
   public static Class6636 field43085 = new Class6636(Class2885.class);
   public static Class9475 field43086 = new Class9475(field43085, Class7219.class, 6);
   public static Class6636 field43087 = new Class6636(Class2866.class);
   public static Class9475 field43088 = new Class9475(field43087, Class7219.class, 6);
   public static Class6636 field43089 = new Class6636(Class2876.class);
   public static Class9475 field43090 = new Class9475(field43089, Class7219.class, 12);
   public static Class6636 field43091 = new Class6636(Class2819.class);
   public static Class9475 field43092 = new Class9475(field43091, Class7219.class, 8);
   public static Class6636 field43093 = new Class6636(Class2816.class);
   public static Class9475 field43094 = new Class9475(field43093, Class7219.class, 5);
   public static Class6636 field43095 = new Class6636(Class2887.class);
   public static Class9475 field43096 = new Class9475(field43095, Class7219.class, 3);
   public static Class6636 field43097 = new Class6636(Class2821.class);
   public static Class6633 field43098 = new Class6633(field43097, Class7219.class);
   public static Class6636 field43099 = new Class6636(Class2848.class);
   public static Class9475 field43100 = new Class9475(field43099, Class7219.class, 2);
   public static Class6636 field43101 = new Class6636(Class2844.class);
   public static Class6633 field43102 = new Class6633(field43101, Class7219.class);
   public static Class6636 field43103 = new Class6636(Class2815.class);
   public static Class6633 field43104 = new Class6633(field43103, Class7219[].class, 0);
   public static Class6633 field43105 = new Class6633(field43103, Class7219[].class, 1);
   public static Class6636 field43106 = new Class6636(Class2826.class);
   public static Class9475 field43107 = new Class9475(field43106, Class7219.class, 4);
   public static Class6636 field43108 = new Class6636(Class2878.class);
   public static Class9475 field43109 = new Class9475(field43108, Class7219.class, 5);
   public static Class6636 field43110 = new Class6636(Class2813.class);
   public static Class9475 field43111 = new Class9475(field43110, Class7219.class, 11);
   public static Class6636 field43112 = new Class6636(Class2879.class);
   public static Class6633 field43113 = new Class6633(field43112, Class7219.class);
   public static Class6633 field43114 = new Class6633(field43112, Class7219[].class);
   public static Class6636 field43115 = new Class6636(Class2809.class);
   public static Class9475 field43116 = new Class9475(field43115, Class7219.class, 5);
   public static Class6636 field43117 = new Class6636(Class2810.class);
   public static Class9475 field43118 = new Class9475(field43117, Class7219.class, 6);
   public static Class6636 field43119 = new Class6636(Class2873.class);
   public static Class6633 field43120 = new Class6633(field43119, Class7219.class, 0);
   public static Class6636 field43121 = new Class6636(Class2896.class);
   public static Class6633 field43122 = new Class6633(field43121, Class7219.class, 0);
   public static Class6633 field43123 = new Class6633(field43121, Class7219.class, 1);
   public static Class6636 field43124 = new Class6636(Class2802.class);
   public static Class9475 field43125 = new Class9475(field43124, Class7219.class, 9);
   public static Class6636 field43126 = new Class6636(Class2891.class);
   public static Class6633 field43127 = new Class6633(field43126, Class7219.class, 0);
   public static Class6636 field43128 = new Class6636(Class2881.class);
   public static Class6633 field43129 = new Class6633(field43128, Class7219[].class, 0);
   public static Class6633 field43130 = new Class6633(field43128, Class7219[].class, 1);
   public static Class6636 field43131 = new Class6636(Class2859.class);
   public static Class9475 field43132 = new Class9475(field43131, Class7219.class, 10);
   public static Class6636 field43133 = Class9561.method37044();
   public static Class6631 field43134 = new Class6631(field43133, "getOptiFineResourceStream");
   public static Class6636 field43135 = new Class6636(Class5725.class);
   public static Class6633 field43136 = new Class6633(field43135, Class2883.class);
   public static Class6636 field43137 = new Class6636(Class5722.class);
   public static Class6633 field43138 = new Class6633(field43137, Class2804.class);
   public static Class6636 field43139 = new Class6636(Class5748.class);
   public static Class6633 field43140 = new Class6633(field43139, Class2885.class);
   public static Class6633 field43141 = new Class6633(field43139, Class2877.class);
   public static Class6633 field43142 = new Class6633(field43139, Class2812.class);
   public static Class6636 field43143 = new Class6636(Class5732.class);
   public static Class6633 field43144 = new Class6633(field43143, Class2827.class);
   public static Class6636 field43145 = new Class6636(Class5730.class);
   public static Class6633 field43146 = new Class6633(field43145, Class2821.class);
   public static Class6636 field43147 = new Class6636(Class5655.class);
   public static Class6633 field43148 = new Class6633(field43147, Class2809.class);
   public static Class6633 field43149 = new Class6633(field43147, Class2810.class);
   public static Class6636 field43150 = new Class6636(Class5734.class);
   public static Class6633 field43151 = new Class6633(field43150, Class2844.class);
   public static Class6636 field43152 = new Class6636(Class5948.class);
   public static Class9475 field43153 = new Class9475(field43152, Class7219.class, 3);
   public static Class6636 field43154 = new Class6636(Class5950.class);
   public static Class6633 field43155 = new Class6633(field43154, Class7219.class, 0);
   public static Class6633 field43156 = new Class6633(field43154, Class7219.class, 1);
   public static Class6633 field43157 = new Class6633(field43154, Class7219[].class);
   public static Class6636 field43158 = new Class6636(Class950.class);
   public static Class6633 field43159 = new Class6633(field43158, ITextComponent.class);
   public static Class6636 field43160 = new Class6636(Class5953.class);
   public static Class9475 field43161 = new Class9475(field43160, Class7219.class, 9);
   public static Class6636 field43162 = new Class6636(Class5951.class);
   public static Class6633 field43163 = new Class6633(field43162, Class2850.class);
   public static Class6636 field43164 = new Class6636(Class5954.class);
   public static Class6633 field43165 = new Class6633(field43164, Class2887.class);
   public static Class6636 field43166 = new Class6636(Class5947.class);
   public static Class6633 field43167 = new Class6633(field43166, Class2848.class);
   public static Class6636 field43168 = new Class6636(Class5952.class);
   public static Class6633 field43169 = new Class6633(field43168, Map.class, 0);

   public static void method35055(Class6631 var0, Object... var1) {
      try {
         Method var4 = var0.method20213();
         if (var4 == null) {
            return;
         }

         var4.invoke(null, var1);
      } catch (Throwable var5) {
         method35092(var5, null, var0, var1);
      }
   }

   public static boolean method35056(Class6631 var0, Object... var1) {
      try {
         Method var4 = var0.method20213();
         if (var4 == null) {
            return false;
         } else {
            Boolean var5 = (Boolean)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method35092(var6, null, var0, var1);
         return false;
      }
   }

   public static int method35057(Class6631 var0, Object... var1) {
      try {
         Method var4 = var0.method20213();
         if (var4 == null) {
            return 0;
         } else {
            Integer var5 = (Integer)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method35092(var6, null, var0, var1);
         return 0;
      }
   }

   public static long method35058(Class6631 var0, Object... var1) {
      try {
         Method var4 = var0.method20213();
         if (var4 == null) {
            return 0L;
         } else {
            Long var5 = (Long)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method35092(var6, null, var0, var1);
         return 0L;
      }
   }

   public static float method35059(Class6631 var0, Object... var1) {
      try {
         Method var4 = var0.method20213();
         if (var4 == null) {
            return 0.0F;
         } else {
            Float var5 = (Float)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method35092(var6, null, var0, var1);
         return 0.0F;
      }
   }

   public static double method35060(Class6631 var0, Object... var1) {
      try {
         Method var4 = var0.method20213();
         if (var4 == null) {
            return 0.0;
         } else {
            Double var5 = (Double)var4.invoke(null, var1);
            return var5;
         }
      } catch (Throwable var6) {
         method35092(var6, null, var0, var1);
         return 0.0;
      }
   }

   public static String method35061(Class6631 var0, Object... var1) {
      try {
         Method var4 = var0.method20213();
         return var4 == null ? null : (String)var4.invoke(null, var1);
      } catch (Throwable var5) {
         method35092(var5, null, var0, var1);
         return null;
      }
   }

   public static Object method35062(Class6631 var0, Object... var1) {
      try {
         Method var4 = var0.method20213();
         return var4 == null ? null : var4.invoke(null, var1);
      } catch (Throwable var5) {
         method35092(var5, null, var0, var1);
         return null;
      }
   }

   public static void method35063(Object var0, Class6631 var1, Object... var2) {
      try {
         if (var0 == null) {
            return;
         }

         Method var5 = var1.method20213();
         if (var5 == null) {
            return;
         }

         var5.invoke(var0, var2);
      } catch (Throwable var6) {
         method35092(var6, var0, var1, var2);
      }
   }

   public static boolean method35064(Object var0, Class6631 var1, Object... var2) {
      try {
         Method var5 = var1.method20213();
         if (var5 == null) {
            return false;
         } else {
            Boolean var6 = (Boolean)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method35092(var7, var0, var1, var2);
         return false;
      }
   }

   public static int method35065(Object var0, Class6631 var1, Object... var2) {
      try {
         Method var5 = var1.method20213();
         if (var5 == null) {
            return 0;
         } else {
            Integer var6 = (Integer)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method35092(var7, var0, var1, var2);
         return 0;
      }
   }

   public static long method35066(Object var0, Class6631 var1, Object... var2) {
      try {
         Method var5 = var1.method20213();
         if (var5 == null) {
            return 0L;
         } else {
            Long var6 = (Long)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method35092(var7, var0, var1, var2);
         return 0L;
      }
   }

   public static float method35067(Object var0, Class6631 var1, Object... var2) {
      try {
         Method var5 = var1.method20213();
         if (var5 == null) {
            return 0.0F;
         } else {
            Float var6 = (Float)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method35092(var7, var0, var1, var2);
         return 0.0F;
      }
   }

   public static double method35068(Object var0, Class6631 var1, Object... var2) {
      try {
         Method var5 = var1.method20213();
         if (var5 == null) {
            return 0.0;
         } else {
            Double var6 = (Double)var5.invoke(var0, var2);
            return var6;
         }
      } catch (Throwable var7) {
         method35092(var7, var0, var1, var2);
         return 0.0;
      }
   }

   public static String method35069(Object var0, Class6631 var1, Object... var2) {
      try {
         Method var5 = var1.method20213();
         return var5 == null ? null : (String)var5.invoke(var0, var2);
      } catch (Throwable var6) {
         method35092(var6, var0, var1, var2);
         return null;
      }
   }

   public static Object method35070(Object var0, Class6631 var1, Object... var2) {
      try {
         Method var5 = var1.method20213();
         return var5 == null ? null : var5.invoke(var0, var2);
      } catch (Throwable var6) {
         method35092(var6, var0, var1, var2);
         return null;
      }
   }

   public static Object method35071(Class6633 var0) {
      return method35072(null, var0);
   }

   public static Object method35072(Object var0, Class6633 var1) {
      try {
         Field var4 = var1.method20233();
         return var4 == null ? null : var4.get(var0);
      } catch (Throwable var5) {
         Class9751.method38307("", var5);
         return null;
      }
   }

   public static boolean method35073(Object var0, Class6633 var1, boolean var2) {
      try {
         Field var5 = var1.method20233();
         return var5 == null ? var2 : var5.getBoolean(var0);
      } catch (Throwable var6) {
         Class9751.method38307("", var6);
         return var2;
      }
   }

   public static Object method35074(Class9475 var0, int var1) {
      Class6633 var4 = var0.method36564(var1);
      return var4 != null ? method35071(var4) : null;
   }

   public static Object method35075(Object var0, Class9475 var1, int var2) {
      Class6633 var5 = var1.method36564(var2);
      return var5 != null ? method35072(var0, var5) : null;
   }

   public static float method35076(Object var0, Class6633 var1, float var2) {
      try {
         Field var5 = var1.method20233();
         return var5 == null ? var2 : var5.getFloat(var0);
      } catch (Throwable var6) {
         Class9751.method38307("", var6);
         return var2;
      }
   }

   public static int method35077(Class6633 var0, int var1) {
      return method35078(null, var0, var1);
   }

   public static int method35078(Object var0, Class6633 var1, int var2) {
      try {
         Field var5 = var1.method20233();
         return var5 == null ? var2 : var5.getInt(var0);
      } catch (Throwable var6) {
         Class9751.method38307("", var6);
         return var2;
      }
   }

   public static long method35079(Object var0, Class6633 var1, long var2) {
      try {
         Field var6 = var1.method20233();
         return var6 == null ? var2 : var6.getLong(var0);
      } catch (Throwable var7) {
         Class9751.method38307("", var7);
         return var2;
      }
   }

   public static boolean method35080(Class6633 var0, Object var1) {
      return method35082(null, var0, var1);
   }

   public static boolean method35081(Object var0, Class9475 var1, int var2, Object var3) {
      Class6633 var6 = var1.method36564(var2);
      if (var6 != null) {
         method35082(var0, var6, var3);
         return true;
      } else {
         return false;
      }
   }

   public static boolean method35082(Object var0, Class6633 var1, Object var2) {
      try {
         Field var5 = var1.method20233();
         if (var5 == null) {
            return false;
         } else {
            var5.set(var0, var2);
            return true;
         }
      } catch (Throwable var6) {
         Class9751.method38307("", var6);
         return false;
      }
   }

   public static boolean method35083(Class6633 var0, int var1) {
      return method35084(null, var0, var1);
   }

   public static boolean method35084(Object var0, Class6633 var1, int var2) {
      try {
         Field var5 = var1.method20233();
         if (var5 == null) {
            return false;
         } else {
            var5.setInt(var0, var2);
            return true;
         }
      } catch (Throwable var6) {
         Class9751.method38307("", var6);
         return false;
      }
   }

   public static boolean method35085(Class6634 var0, Object... var1) {
      Object var4 = method35087(var0, var1);
      return var4 != null ? method35086(var4) : false;
   }

   public static boolean method35086(Object var0) {
      if (var0 != null) {
         Object var3 = method35071(field42968);
         if (var3 != null) {
            Object var4 = method35070(var3, field42812, var0);
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

   public static Object method35087(Class6634 var0, Object... var1) {
      Constructor var4 = var0.method20239();
      if (var4 == null) {
         return null;
      } else {
         try {
            return var4.newInstance(var1);
         } catch (Throwable var6) {
            method35093(var6, var0, var1);
            return null;
         }
      }
   }

   public static boolean method35088(Class[] var0, Class[] var1) {
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

   private static void method35089(boolean var0, String var1, Class6631 var2, Object[] var3, Object var4) {
      String var7 = var2.method20213().getDeclaringClass().getName();
      String var8 = var2.method20213().getName();
      String var9 = "";
      if (var0) {
         var9 = " static";
      }

      Class9751.method38303(var1 + var9 + " " + var7 + "." + var8 + "(" + Class8720.method31471(var3) + ") => " + var4);
   }

   private static void method35090(boolean var0, String var1, Class6631 var2, Object[] var3) {
      String var6 = var2.method20213().getDeclaringClass().getName();
      String var7 = var2.method20213().getName();
      String var8 = "";
      if (var0) {
         var8 = " static";
      }

      Class9751.method38303(var1 + var8 + " " + var6 + "." + var7 + "(" + Class8720.method31471(var3) + ")");
   }

   private static void method35091(boolean var0, String var1, Class6633 var2, Object var3) {
      String var6 = var2.method20233().getDeclaringClass().getName();
      String var7 = var2.method20233().getName();
      String var8 = "";
      if (var0) {
         var8 = " static";
      }

      Class9751.method38303(var1 + var8 + " " + var6 + "." + var7 + " => " + var3);
   }

   private static void method35092(Throwable var0, Object var1, Class6631 var2, Object[] var3) {
      if (!(var0 instanceof InvocationTargetException)) {
         Class9751.method38304("*** Exception outside of method ***");
         Class9751.method38304("Method deactivated: " + var2.method20213());
         var2.method20216();
         if (var0 instanceof IllegalArgumentException) {
            Class9751.method38304("*** IllegalArgumentException ***");
            Class9751.method38304("Method: " + var2.method20213());
            Class9751.method38304("Object: " + var1);
            Class9751.method38304("Parameter classes: " + Class8720.method31471(method35094(var3)));
            Class9751.method38304("Parameters: " + Class8720.method31471(var3));
         }

         Class9751.method38305("", var0);
      } else {
         Throwable var6 = var0.getCause();
         if (var6 instanceof RuntimeException) {
            RuntimeException var7 = (RuntimeException)var6;
            throw var7;
         }

         Class9751.method38307("", var0);
      }
   }

   private static void method35093(Throwable var0, Class6634 var1, Object[] var2) {
      if (!(var0 instanceof InvocationTargetException)) {
         Class9751.method38304("*** Exception outside of constructor ***");
         Class9751.method38304("Constructor deactivated: " + var1.method20239());
         var1.method20242();
         if (var0 instanceof IllegalArgumentException) {
            Class9751.method38304("*** IllegalArgumentException ***");
            Class9751.method38304("Constructor: " + var1.method20239());
            Class9751.method38304("Parameter classes: " + Class8720.method31471(method35094(var2)));
            Class9751.method38304("Parameters: " + Class8720.method31471(var2));
         }

         Class9751.method38305("", var0);
      } else {
         Class9751.method38307("", var0);
      }
   }

   private static Object[] method35094(Object[] var0) {
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

   private static Class6633[] method35095(Class6636 var0, Class var1, int var2) {
      Class6633[] var5 = new Class6633[var2];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = new Class6633(var0, var1, var6);
      }

      return var5;
   }

   private static boolean method35096(String var0) {
      Class6635 var4 = new Class6635(var0);
      Class9787.method38574(var4);
      return true;
   }

   // $VF: synthetic method
   public static Logger method35097() {
      return field42759;
   }
}
