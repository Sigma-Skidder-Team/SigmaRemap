package mapped;

import com.google.common.collect.Lists;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.ISeedReader;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class Class5444<C extends Class4698> {
   public static final Class5444<?> field24194 = new Class5443(Structure.field18059, 0, 0, Class9764.method38386(), 0, 0L);
   private final Structure<C> field24195;
   public final List<Class4178> field24196 = Lists.newArrayList();
   public Class9764 field24197;
   private final int field24198;
   private final int field24199;
   private int field24200;
   public final Class2420 field24201;

   public Class5444(Structure<C> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      this.field24195 = var1;
      this.field24198 = var2;
      this.field24199 = var3;
      this.field24200 = var5;
      this.field24201 = new Class2420();
      this.field24201.method10373(var6, var2, var3);
      this.field24197 = var4;
   }

   public abstract void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, C var7);

   public Class9764 method17110() {
      return this.field24197;
   }

   public List<Class4178> method17111() {
      return this.field24196;
   }

   public void method17112(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6) {
      synchronized (this.field24196) {
         if (!this.field24196.isEmpty()) {
            Class9764 var10 = this.field24196.get(0).field20444;
            Vector3i var11 = var10.method38401();
            BlockPos var12 = new BlockPos(var11.getX(), var10.field45679, var11.getZ());
            Iterator var13 = this.field24196.iterator();

            while (var13.hasNext()) {
               Class4178 var14 = (Class4178)var13.next();
               if (var14.method12915().method38390(var5) && !var14.method12896(var1, var2, var3, var4, var5, var6, var12)) {
                  var13.remove();
               }
            }

            this.method17113();
         }
      }
   }

   public void method17113() {
      this.field24197 = Class9764.method38386();

      for (Class4178 var4 : this.field24196) {
         this.field24197.method38392(var4.method12915());
      }
   }

   public CompoundNBT method17114(int var1, int var2) {
      CompoundNBT var5 = new CompoundNBT();
      if (this.method17117()) {
         var5.method109("id", Registry.field16114.getKey(this.method17125()).toString());
         var5.putInt("ChunkX", var1);
         var5.putInt("ChunkZ", var2);
         var5.putInt("references", this.field24200);
         var5.put("BB", this.field24197.method38402());
         ListNBT var6 = new ListNBT();
         synchronized (this.field24196) {
            for (Class4178 var9 : this.field24196) {
               var6.add(var9.method12914());
            }
         }

         var5.put("Children", var6);
         return var5;
      } else {
         var5.method109("id", "INVALID");
         return var5;
      }
   }

   public void method17115(int var1, Random var2, int var3) {
      int var6 = var1 - var3;
      int var7 = this.field24197.method38399() + 1;
      if (var7 < var6) {
         var7 += var2.nextInt(var6 - var7);
      }

      int var8 = var7 - this.field24197.field45682;
      this.field24197.method38393(0, var8, 0);

      for (Class4178 var10 : this.field24196) {
         var10.method12937(0, var8, 0);
      }
   }

   public void method17116(Random var1, int var2, int var3) {
      int var6 = var3 - var2 + 1 - this.field24197.method38399();
      int var7;
      if (var6 <= 1) {
         var7 = var2;
      } else {
         var7 = var2 + var1.nextInt(var6);
      }

      int var8 = var7 - this.field24197.field45679;
      this.field24197.method38393(0, var8, 0);

      for (Class4178 var10 : this.field24196) {
         var10.method12937(0, var8, 0);
      }
   }

   public boolean method17117() {
      return !this.field24196.isEmpty();
   }

   public int method17118() {
      return this.field24198;
   }

   public int method17119() {
      return this.field24199;
   }

   public BlockPos method17120() {
      return new BlockPos(this.field24198 << 4, 0, this.field24199 << 4);
   }

   public boolean method17121() {
      return this.field24200 < this.method17124();
   }

   public void method17122() {
      this.field24200++;
   }

   public int method17123() {
      return this.field24200;
   }

   public int method17124() {
      return 1;
   }

   public Structure<?> method17125() {
      return this.field24195;
   }
}
