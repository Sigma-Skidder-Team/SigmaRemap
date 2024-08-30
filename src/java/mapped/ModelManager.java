package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;

import java.util.Map;

public class ModelManager extends Class269<ModelBakery> implements AutoCloseable {
   private Map<ResourceLocation, IBakedModel> field1062;
   private Class1694 field1063;
   private final BlockModelShapes field1064;
   private final TextureManager field1065;
   private final BlockColors field1066;
   private int field1067;
   private IBakedModel field1068;
   private Object2IntMap<BlockState> field1069;

   public ModelManager(TextureManager var1, BlockColors var2, int var3) {
      this.field1065 = var1;
      this.field1066 = var2;
      this.field1067 = var3;
      this.field1064 = new BlockModelShapes(this);
   }

   public IBakedModel method1023(Class1997 var1) {
      return this.field1062.getOrDefault(var1, this.field1068);
   }

   public IBakedModel getMissingModel() {
      return this.field1068;
   }

   public BlockModelShapes method1025() {
      return this.field1064;
   }

   public ModelBakery method970(IResourceManager var1, IProfiler var2) {
      var2.startTick();
      ModelBakery var5 = new ModelBakery(var1, this.field1066, var2, this.field1067);
      var2.endTick();
      return var5;
   }

   public void method971(ModelBakery var1, IResourceManager var2, IProfiler var3) {
      var3.startTick();
      var3.startSection("upload");
      if (this.field1063 != null) {
         this.field1063.close();
      }

      this.field1063 = var1.method32838(this.field1065, var3);
      this.field1062 = var1.method32850();
      this.field1069 = var1.method32851();
      this.field1068 = this.field1062.get(ModelBakery.field40521);
      var3.endStartSection("cache");
      this.field1064.method38155();
      var3.endSection();
      var3.endTick();
   }

   public boolean method1026(BlockState var1, BlockState var2) {
      if (var1 != var2) {
         int var5 = this.field1069.getInt(var1);
         if (var5 != -1) {
            int var6 = this.field1069.getInt(var2);
            if (var5 == var6) {
               FluidState var7 = var1.method23449();
               FluidState var8 = var2.method23449();
               return var7 != var8;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public AtlasTexture getAtlasTexture(ResourceLocation var1) {
      return this.field1063.method7288(var1);
   }

   @Override
   public void close() {
      if (this.field1063 != null) {
         this.field1063.close();
      }
   }

   public void setMaxMipmapLevel(int var1) {
      this.field1067 = var1;
   }
}
