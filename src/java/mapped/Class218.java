package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.io.IOException;

public class Class218<T extends LivingEntity & Class1041, M extends Class2827<T> & Class2801> extends Class219<T, M> implements Class215 {
   private static final Int2ObjectMap<ResourceLocation> field858 = Util.<Int2ObjectMap<ResourceLocation>>make(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(1, new ResourceLocation("stone"));
      var0.put(2, new ResourceLocation("iron"));
      var0.put(3, new ResourceLocation("gold"));
      var0.put(4, new ResourceLocation("emerald"));
      var0.put(5, new ResourceLocation("diamond"));
   });
   private final Object2ObjectMap<Class9564, Class1984> field859 = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<Class8395, Class1984> field860 = new Object2ObjectOpenHashMap();
   private final IReloadableResourceManager field861;
   private final String field862;

   public Class218(Class5714<T, M> var1, IReloadableResourceManager var2, String var3) {
      super(var1);
      this.field861 = var2;
      this.field862 = var3;
      var2.addReloadListener(this);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.isInvisible()) {
         Class7921 var13 = ((Class1041)var4).method4674();
         Class9564 var14 = var13.method26570();
         Class8395 var15 = var13.method26571();
         Class1984 var16 = this.method819(this.field859, "type", Registry.field16089, var14);
         Class1984 var17 = this.method819(this.field860, "profession", Registry.field16090, var15);
         Class2827 var18 = this.method825();
         ((Class2801)var18).method11014(var17 == Class1984.field12956 || var17 == Class1984.field12957 && var16 != Class1984.field12958);
         ResourceLocation var19 = this.method818("type", Registry.field16089.getKey(var14));
         method824(var18, var19, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
         ((Class2801)var18).method11014(true);
         if (var15 != Class8395.field36011 && !var4.isChild()) {
            ResourceLocation var20 = this.method818("profession", Registry.field16090.getKey(var15));
            method824(var18, var20, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
            if (var15 != Class8395.field36022) {
               ResourceLocation var21 = this.method818("profession_level", (ResourceLocation)field858.get(MathHelper.method37775(var13.method26572(), 1, field858.size())));
               method824(var18, var21, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private ResourceLocation method818(String var1, ResourceLocation var2) {
      return new ResourceLocation(var2.getNamespace(), "textures/entity/" + this.field862 + "/" + var1 + "/" + var2.getPath() + ".png");
   }

   public <K> Class1984 method819(Object2ObjectMap<K, Class1984> var1, String var2, Class2351<K> var3, K var4) {
      return (Class1984)var1.computeIfAbsent(var4, var4x -> {
         try (Class1783 var7 = this.field861.method580(this.method818(var2, var3.getKey(var4)))) {
            Class7469 var9 = var7.<Class7469>method7764(Class7469.field32108);
            if (var9 != null) {
               return var9.method24191();
            }
         } catch (IOException var23) {
         }

         return Class1984.field12956;
      });
   }

   @Override
   public void method737(IResourceManager var1) {
      this.field860.clear();
      this.field859.clear();
   }
}
