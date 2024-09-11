package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.EntityType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public abstract class Class5942<T extends TileEntity> {
   public final TileEntityRendererDispatcher field25928;
   private TileEntityType field25929 = null;
   private ResourceLocation field25930 = null;

   public Class5942(TileEntityRendererDispatcher var1) {
      this.field25928 = var1;
   }

   public abstract void method18462(T var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6);

   public boolean method18461(T var1) {
      return false;
   }

   public Class4862<EntityType, TileEntityType> method18463() {
      return this.field25929 != null ? Class4862.method15006(this.field25929) : null;
   }

   public void method18464(Class4862<EntityType, TileEntityType> var1) {
      this.field25929 = (TileEntityType)var1.method15004().get();
   }

   public ResourceLocation method18465() {
      return this.field25930;
   }

   public void method18466(ResourceLocation var1) {
      this.field25930 = var1;
   }
}
