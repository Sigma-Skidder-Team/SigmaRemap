package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.IChunkLightProvider;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.world.lighting.IWorldLightListener;
import net.minecraft.world.lighting.LightEngine;

public class WorldLightManager implements Class197 {
   private final LightEngine<?, ?> blockLight;
   private final LightEngine<?, ?> skyLight;

   public WorldLightManager(IChunkLightProvider var1, boolean var2, boolean var3) {
      this.blockLight = !var2 ? null : new Class201(var1);
      this.skyLight = !var3 ? null : new Class212(var1);
   }

   public void checkBlock(BlockPos var1) {
      if (this.blockLight != null) {
         this.blockLight.checkLight(var1);
      }

      if (this.skyLight != null) {
         this.skyLight.checkLight(var1);
      }
   }

   public void onBlockEmissionIncrease(BlockPos var1, int var2) {
      if (this.blockLight != null) {
         this.blockLight.func_215623_a(var1, var2);
      }
   }

   public boolean hasLightWork() {
      if (this.skyLight != null && this.skyLight.func_215619_a())
      {
         return true;
      }
      else
      {
         return this.blockLight != null && this.blockLight.func_215619_a();
      }
   }

   public int tick(int toUpdateCount, boolean updateSkyLight, boolean updateBlockLight) {
      if (this.blockLight != null && this.skyLight != null) {
         int i = toUpdateCount / 2;
         int j = this.blockLight.tick(i, updateSkyLight, updateBlockLight);
         int k = toUpdateCount - i + j;
         int l = this.skyLight.tick(k, updateSkyLight, updateBlockLight);
         return j == 0 && l > 0 ? this.blockLight.tick(l, updateSkyLight, updateBlockLight) : l;
      } else if (this.blockLight == null) {
         return this.skyLight == null ? toUpdateCount : this.skyLight.tick(toUpdateCount, updateSkyLight, updateBlockLight);
      } else {
         return this.blockLight.tick(toUpdateCount, updateSkyLight, updateBlockLight);
      }
   }

   public void updateSectionStatus(SectionPos var1, boolean var2) {
      if (this.blockLight != null) {
         this.blockLight.updateSectionStatus(var1, var2);
      }

      if (this.skyLight != null) {
         this.skyLight.updateSectionStatus(var1, var2);
      }
   }

   public void method605(ChunkPos var1, boolean var2) {
      if (this.blockLight != null) {
         this.blockLight.func_215620_a(var1, var2);
      }

      if (this.skyLight != null) {
         this.skyLight.func_215620_a(var1, var2);
      }
   }

   public IWorldLightListener getLightEngine(LightType var1) {
      if (var1 != LightType.BLOCK) {
         return (IWorldLightListener)(this.skyLight != null ? this.skyLight : Class199.field743);
      } else {
         return (IWorldLightListener)(this.blockLight != null ? this.blockLight : Class199.field743);
      }
   }

   public String method639(LightType var1, SectionPos var2) {
      if (var1 != LightType.BLOCK) {
         if (this.skyLight != null) {
            return this.skyLight.method659(var2.asLong());
         }
      } else if (this.blockLight != null) {
         return this.blockLight.method659(var2.asLong());
      }

      return "n/a";
   }

   public void method606(LightType var1, SectionPos var2, NibbleArray var3, boolean var4) {
      if (var1 != LightType.BLOCK) {
         if (this.skyLight != null) {
            this.skyLight.method658(var2.asLong(), var3, var4);
         }
      } else if (this.blockLight != null) {
         this.blockLight.method658(var2.asLong(), var3, var4);
      }
   }

   public void method609(ChunkPos var1, boolean var2) {
      if (this.blockLight != null) {
         this.blockLight.retainChunkData(var1, var2);
      }

      if (this.skyLight != null) {
         this.skyLight.retainChunkData(var1, var2);
      }
   }

   public int method640(BlockPos var1, int var2) {
      int var5 = this.skyLight != null ? this.skyLight.method643(var1) - var2 : 0;
      int var6 = this.blockLight != null ? this.blockLight.method643(var1) : 0;
      return Math.max(var6, var5);
   }
}
