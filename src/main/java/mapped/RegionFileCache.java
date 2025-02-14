package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.util.math.ChunkPos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import javax.annotation.Nullable;

public final class RegionFileCache implements AutoCloseable {
   private final Long2ObjectLinkedOpenHashMap<RegionFile> field9235 = new Long2ObjectLinkedOpenHashMap();
   private final File field9236;
   private final boolean field9237;

   public RegionFileCache(File var1, boolean var2) {
      this.field9236 = var1;
      this.field9237 = var2;
   }

   private RegionFile loadFile(ChunkPos var1) throws IOException {
      long var4 = ChunkPos.asLong(var1.getRegionCoordX(), var1.getRegionCoordZ());
      RegionFile var6 = (RegionFile)this.field9235.getAndMoveToFirst(var4);
      if (var6 == null) {
         if (this.field9235.size() >= 256) {
            ((RegionFile)this.field9235.removeLast()).close();
         }

         if (!this.field9236.exists()) {
            this.field9236.mkdirs();
         }

         File var7 = new File(this.field9236, "r." + var1.getRegionCoordX() + "." + var1.getRegionCoordZ() + ".mca");
         RegionFile var8 = new RegionFile(var7, this.field9236, this.field9237);
         this.field9235.putAndMoveToFirst(var4, var8);
         return var8;
      } else {
         return var6;
      }
   }

   @Nullable
   public CompoundNBT readChunk(ChunkPos var1) throws IOException {
      RegionFile var4 = this.loadFile(var1);

      CompoundNBT var7;
      try (DataInputStream var5 = var4.func_222666_a(var1)) {
         if (var5 == null) {
            Object var9 = null;
            return (CompoundNBT)var9;
         }

         var7 = CompressedStreamTools.read(var5);
      }

      return var7;
   }

   public void writeChunk(ChunkPos var1, CompoundNBT var2) throws IOException {
      RegionFile var5 = this.loadFile(var1);

      try (DataOutputStream var6 = var5.method7258(var1)) {
         CompressedStreamTools.write(var2, var6);
      }
   }

   @Override
   public void close() throws IOException {
      Class7132 var3 = new Class7132();

       for (RegionFile var5 : this.field9235.values()) {
           try {
               var5.close();
           } catch (IOException var7) {
               var3.method22240(var7);
           }
       }

       try {
           var3.method22241();
       } catch (Throwable e) {
           throw new RuntimeException(e);
       }
   }

   public void func_235987_a_() throws IOException {
      ObjectIterator var3 = this.field9235.values().iterator();

      while (var3.hasNext()) {
         RegionFile var4 = (RegionFile)var3.next();
         var4.method7259();
      }
   }
}
