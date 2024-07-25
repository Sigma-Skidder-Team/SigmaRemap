package net.optifine.entity.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.SkullBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.EntityType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;
import net.optifine.entity.model.anim.ModelResolver;
import net.optifine.entity.model.anim.ModelUpdater;
import net.optifine.reflect.Reflector;
import net.optifine.util.Either;

public class CustomEntityModels
{
    private static boolean active = false;
    private static Map<EntityType, EntityRenderer> originalEntityRenderMap = null;
    private static Map<TileEntityType, TileEntityRenderer> originalTileEntityRenderMap = null;
    private static Map<SkullBlock.ISkullType, Model> originalSkullModelMap = null;

    public static void update()
    {
        Map<EntityType, EntityRenderer> map = getEntityRenderMap();
        Map<TileEntityType, TileEntityRenderer> map1 = getTileEntityRenderMap();
        Map<SkullBlock.ISkullType, Model> map2 = getSkullModelMap();

        if (map == null)
        {
            Config.warn("Entity render map not found, custom entity models are DISABLED.");
        }
        else if (map1 == null)
        {
            Config.warn("Tile entity render map not found, custom entity models are DISABLED.");
        }
        else
        {
            active = false;
            map.clear();
            map1.clear();
            map2.clear();
            map.putAll(originalEntityRenderMap);
            map1.putAll(originalTileEntityRenderMap);
            map2.putAll(originalSkullModelMap);

            if (Config.isCustomEntityModels())
            {
                ResourceLocation[] aresourcelocation = getModelLocations();

                for (int i = 0; i < aresourcelocation.length; ++i)
                {
                    ResourceLocation resourcelocation = aresourcelocation[i];
                    Config.dbg("CustomEntityModel: " + resourcelocation.getPath());
                    IEntityRenderer ientityrenderer = parseEntityRender(resourcelocation);

                    if (ientityrenderer != null)
                    {
                        Either<EntityType, TileEntityType> either = ientityrenderer.getType();

                        if (ientityrenderer instanceof EntityRenderer)
                        {
                            map.put(either.getLeft().get(), (EntityRenderer)ientityrenderer);
                        }
                        else if (ientityrenderer instanceof TileEntityRenderer)
                        {
                            map1.put(either.getRight().get(), (TileEntityRenderer)ientityrenderer);
                        }
                        else
                        {
                            Config.warn("Unknown renderer type: " + ientityrenderer.getClass().getName());
                        }

                        active = true;
                    }
                }
            }
        }
    }

    private static Map<EntityType, EntityRenderer> getEntityRenderMap()
    {
        EntityRendererManager entityrenderermanager = Minecraft.getInstance().getRenderManager();
        Map<EntityType, EntityRenderer> map = entityrenderermanager.getEntityRenderMap();

        if (map == null)
        {
            return null;
        }
        else
        {
            if (originalEntityRenderMap == null)
            {
                originalEntityRenderMap = new HashMap<>(map);
            }

            return map;
        }
    }

    private static Map<TileEntityType, TileEntityRenderer> getTileEntityRenderMap()
    {
        Map map = TileEntityRendererDispatcher.instance.renderers;

        if (originalTileEntityRenderMap == null)
        {
            originalTileEntityRenderMap = new HashMap<>(map);
        }

        return map;
    }

    private static Map<SkullBlock.ISkullType, Model> getSkullModelMap()
    {
        Map<SkullBlock.ISkullType, Model> map = (Map)Reflector.TileEntitySkullRenderer_MODELS.getValue();

        if (map == null)
        {
            Config.warn("Field not found: TileEntitySkullRenderer.MODELS");
            map = new HashMap<>();
        }

        if (originalSkullModelMap == null)
        {
            originalSkullModelMap = new HashMap<>(map);
        }

        return map;
    }

    private static ResourceLocation[] getModelLocations()
    {
        String s = "optifine/cem/";
        String s1 = ".jem";
        List<ResourceLocation> list = new ArrayList<>();
        String[] astring = CustomModelRegistry.getModelNames();

        for (int i = 0; i < astring.length; ++i)
        {
            String s2 = astring[i];
            String s3 = s + s2 + s1;
            ResourceLocation resourcelocation = new ResourceLocation(s3);

            if (Config.hasResource(resourcelocation))
            {
                list.add(resourcelocation);
            }
        }

        return list.toArray(new ResourceLocation[list.size()]);
    }

    private static IEntityRenderer parseEntityRender(ResourceLocation location)
    {
        try
        {
            JsonObject jsonobject = CustomEntityModelParser.loadJson(location);
            return parseEntityRender(jsonobject, location.getPath());
        }
        catch (IOException ioexception)
        {
            Config.error("" + ioexception.getClass().getName() + ": " + ioexception.getMessage());
            return null;
        }
        catch (JsonParseException jsonparseexception)
        {
            Config.error("" + jsonparseexception.getClass().getName() + ": " + jsonparseexception.getMessage());
            return null;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }

    private static IEntityRenderer parseEntityRender(JsonObject obj, String path)
    {
        CustomEntityRenderer customentityrenderer = CustomEntityModelParser.parseEntityRender(obj, path);
        String s = customentityrenderer.getName();
        ModelAdapter modeladapter = CustomModelRegistry.getModelAdapter(s);
        checkNull(modeladapter, "Entity not found: " + s);
        Either<EntityType, TileEntityType> either = modeladapter.getType();
        checkNull(either, "Entity type not found: " + s);
        IEntityRenderer ientityrenderer = makeEntityRender(modeladapter, customentityrenderer);

        if (ientityrenderer == null)
        {
            return null;
        }
        else
        {
            ientityrenderer.setType(either);
            return ientityrenderer;
        }
    }

    private static IEntityRenderer makeEntityRender(ModelAdapter modelAdapter, CustomEntityRenderer cer)
    {
        ResourceLocation resourcelocation = cer.getTextureLocation();
        CustomModelRenderer[] acustommodelrenderer = cer.getCustomModelRenderers();
        float f = cer.getShadowSize();

        if (f < 0.0F)
        {
            f = modelAdapter.getShadowSize();
        }

        Model model = modelAdapter.makeModel();

        if (model == null)
        {
            return null;
        }
        else
        {
            ModelResolver modelresolver = new ModelResolver(modelAdapter, model, acustommodelrenderer);

            if (!modifyModel(modelAdapter, model, acustommodelrenderer, modelresolver))
            {
                return null;
            }
            else
            {
                IEntityRenderer ientityrenderer = modelAdapter.makeEntityRender(model, f);

                if (ientityrenderer == null)
                {
                    throw new JsonParseException("Entity renderer is null, model: " + modelAdapter.getName() + ", adapter: " + modelAdapter.getClass().getName());
                }
                else
                {
                    if (resourcelocation != null)
                    {
                        ientityrenderer.setLocationTextureCustom(resourcelocation);
                    }

                    return ientityrenderer;
                }
            }
        }
    }

    private static boolean modifyModel(ModelAdapter modelAdapter, Model model, CustomModelRenderer[] modelRenderers, ModelResolver mr)
    {
        for (int i = 0; i < modelRenderers.length; ++i)
        {
            CustomModelRenderer custommodelrenderer = modelRenderers[i];

            if (!modifyModel(modelAdapter, model, custommodelrenderer, mr))
            {
                return false;
            }
        }

        return true;
    }

    private static boolean modifyModel(ModelAdapter modelAdapter, Model model, CustomModelRenderer customModelRenderer, ModelResolver modelResolver)
    {
        String s = customModelRenderer.getModelPart();
        ModelRenderer modelrenderer = modelAdapter.getModelRenderer(model, s);

        if (modelrenderer == null)
        {
            Config.warn("Model part not found: " + s + ", model: " + model);
            return false;
        }
        else
        {
            if (!customModelRenderer.isAttach())
            {
                if (modelrenderer.cubeList != null)
                {
                    modelrenderer.cubeList.clear();
                }

                if (modelrenderer.spriteList != null)
                {
                    modelrenderer.spriteList.clear();
                }

                if (modelrenderer.childModels != null)
                {
                    ModelRenderer[] amodelrenderer = modelAdapter.getModelRenderers(model);
                    Set<ModelRenderer> set = Collections.newSetFromMap(new IdentityHashMap<>());
                    set.addAll(Arrays.asList(amodelrenderer));
                    List<ModelRenderer> list = modelrenderer.childModels;
                    Iterator iterator = list.iterator();

                    while (iterator.hasNext())
                    {
                        ModelRenderer modelrenderer1 = (ModelRenderer)iterator.next();

                        if (!set.contains(modelrenderer1))
                        {
                            iterator.remove();
                        }
                    }
                }
            }

            modelrenderer.addChild(customModelRenderer.getModelRenderer());
            ModelUpdater modelupdater = customModelRenderer.getModelUpdater();

            if (modelupdater != null)
            {
                modelResolver.setThisModelRenderer(customModelRenderer.getModelRenderer());
                modelResolver.setPartModelRenderer(modelrenderer);

                if (!modelupdater.initialize(modelResolver))
                {
                    return false;
                }

                customModelRenderer.getModelRenderer().setModelUpdater(modelupdater);
            }

            return true;
        }
    }

    private static void checkNull(Object obj, String msg)
    {
        if (obj == null)
        {
            throw new JsonParseException(msg);
        }
    }

    public static boolean isActive()
    {
        return active;
    }
}
