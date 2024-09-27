package mapped;

import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.SChangeBlockPacket;
import net.minecraft.network.play.server.SChunkDataPacket;
import net.minecraft.network.play.server.SMultiBlockChangePacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.ChunkSection;

public class Class8920 {
   private static String[] field40380;

   public static void method32597(ReceivePacketEvent var0, ViaVersionFixer var1) {
      if (var0.getPacket() instanceof SChangeBlockPacket) {
         SChangeBlockPacket var4 = (SChangeBlockPacket)var0.getPacket();
         var1.method33183(var4.method17632(), var4.method17631());
         if (var1 != null) {
            var1.method33174();
         }

         var1.method33180(var0.getPacket());
         var0.setCancelled(true);
      }

      if (var0.getPacket() instanceof SMultiBlockChangePacket) {
         SMultiBlockChangePacket var17 = (SMultiBlockChangePacket)var0.getPacket();

         for (int var5 = 0; var5 < var17.field24643.length; var5++) {
            BlockPos var6 = var17.field24642.method8405(var17.field24643[var5]);
            if (var1.method33182(var17.field24644[var5])) {
               var1.method33183(var6, var17.field24644[var5]);
            }
         }

         var1.method33174();
         var1.method33180(var0.getPacket());
         var0.setCancelled(true);
      }

      if (var0.getPacket() instanceof SChunkDataPacket && Minecraft.getInstance().world != null) {
         SChunkDataPacket var18 = (SChunkDataPacket)var0.getPacket();

         try {
            while (Minecraft.getInstance().getConnection() == null) {
               Thread.sleep(100L);
            }
         } catch (InterruptedException var16) {
         }

         BiomeContainer var19 = var18.method17384() == null
            ? null
            : new BiomeContainer(Minecraft.getInstance().getConnection().field23287.<Biome>getRegistry(Registry.BIOME_KEY), var18.method17384());
         Chunk var20 = new Chunk(Minecraft.getInstance().world, new ChunkPos(var18.getChunkX(), var18.getChunkZ()), null);
         var20.method7142(var19, new PacketBuffer(var18.method17374().copy()), var18.method17382(), var18.method17380());
         if (var20 != null) {
            int var7 = 0;

            for (ChunkSection var11 : var20.getSections()) {
               if (var11 != null && !var11.method21858()) {
                  for (float var12 = 0.0F; var12 <= 15.0F; var12++) {
                     for (float var13 = 0.0F; var13 <= 15.0F; var13++) {
                        for (float var14 = 0.0F; var14 <= 15.0F; var14++) {
                           BlockState var15 = var20.getBlockState(new BlockPos((double)var13, (double)((float)(var7 * 16) + var12), (double)var14));
                           if (var1.method33182(var15)) {
                              var1.method33183(
                                 new BlockPos(
                                    (double)((float)(var20.getPos().x * 16) + var13),
                                    (double)((float)(var7 * 16) + var12),
                                    (double)((float)(var20.getPos().z * 16) + var14)
                                 ),
                                 var15
                              );
                           }
                        }
                     }
                  }
               }

               var7++;
            }

            var1.method33174();
            var1.method33185(var20);
            if (var20 == null) {
               return;
            }

            SChunkDataPacket var21 = new SChunkDataPacket(var20, var20.getBiomes() == null ? '\ufffe' : '\uffff');
            var21.field24521 = var18.isFullChunk();
            var21.field24520 = var18.method17383();
            var0.method13899(var21);
         }
      }
   }
}
