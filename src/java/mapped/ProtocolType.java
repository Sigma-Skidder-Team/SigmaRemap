package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.*;

import java.util.Map;
import javax.annotation.Nullable;

public enum ProtocolType {
   field9901(-1, method8101().method31658(Class1975.SERVERBOUND, new Class7417<Class5105>().method23905(CHandshakePacket.class, CHandshakePacket::new))),
   field9902(
      0,
      method8101()
         .method31658(
            Class1975.CLIENTBOUND,
            new Class7417<IClientPlayNetHandler>()
               .method23905(SSpawnObjectPacket.class, SSpawnObjectPacket::new)
               .method23905(SSpawnExperienceOrbPacket.class, SSpawnExperienceOrbPacket::new)
               .method23905(SSpawnMobPacket.class, SSpawnMobPacket::new)
               .method23905(SSpawnPaintingPacket.class, SSpawnPaintingPacket::new)
               .method23905(SSpawnPlayerPacket.class, SSpawnPlayerPacket::new)
               .method23905(SAnimateHandPacket.class, SAnimateHandPacket::new)
               .method23905(SStatisticsPacket.class, SStatisticsPacket::new)
               .method23905(SPlayerDiggingPacket.class, SPlayerDiggingPacket::new)
               .method23905(SAnimateBlockBreakPacket.class, SAnimateBlockBreakPacket::new)
               .method23905(SUpdateTileEntityPacket.class, SUpdateTileEntityPacket::new)
               .method23905(SBlockActionPacket.class, SBlockActionPacket::new)
               .method23905(SChangeBlockPacket.class, SChangeBlockPacket::new)
               .method23905(SUpdateBossInfoPacket.class, SUpdateBossInfoPacket::new)
               .method23905(SServerDifficultyPacket.class, SServerDifficultyPacket::new)
               .method23905(SChatPacket.class, SChatPacket::new)
               .method23905(STabCompletePacket.class, STabCompletePacket::new)
               .method23905(SCommandListPacket.class, SCommandListPacket::new)
               .method23905(SConfirmTransactionPacket.class, SConfirmTransactionPacket::new)
               .method23905(SCloseWindowPacket.class, SCloseWindowPacket::new)
               .method23905(SWindowItemsPacket.class, SWindowItemsPacket::new)
               .method23905(SWindowPropertyPacket.class, SWindowPropertyPacket::new)
               .method23905(SSetSlotPacket.class, SSetSlotPacket::new)
               .method23905(SCooldownPacket.class, SCooldownPacket::new)
               .method23905(SCustomPayloadPlayPacket.class, SCustomPayloadPlayPacket::new)
               .method23905(SPlaySoundPacket.class, SPlaySoundPacket::new)
               .method23905(SDisconnectPacket.class, SDisconnectPacket::new)
               .method23905(SEntityStatusPacket.class, SEntityStatusPacket::new)
               .method23905(SExplosionPacket.class, SExplosionPacket::new)
               .method23905(SUnloadChunkPacket.class, SUnloadChunkPacket::new)
               .method23905(SChangeGameStatePacket.class, SChangeGameStatePacket::new)
               .method23905(SOpenHorseWindowPacket.class, SOpenHorseWindowPacket::new)
               .method23905(SKeepAlivePacket.class, SKeepAlivePacket::new)
               .method23905(SChunkDataPacket.class, SChunkDataPacket::new)
               .method23905(SPlaySoundEventPacket.class, SPlaySoundEventPacket::new)
               .method23905(SSpawnParticlePacket.class, SSpawnParticlePacket::new)
               .method23905(SUpdateLightPacket.class, SUpdateLightPacket::new)
               .method23905(SJoinGamePacket.class, SJoinGamePacket::new)
               .method23905(SMapDataPacket.class, SMapDataPacket::new)
               .method23905(SMerchantOffersPacket.class, SMerchantOffersPacket::new)
               .method23905(SEntityPacket.RelativeMovePacket.class, SEntityPacket.RelativeMovePacket::new)
               .method23905(SEntityPacket.MovePacket.class, SEntityPacket.MovePacket::new)
               .method23905(SEntityPacket.LookPacket.class, SEntityPacket.LookPacket::new)
               .method23905(SEntityPacket.class, SEntityPacket::new)
               .method23905(SMoveVehiclePacket.class, SMoveVehiclePacket::new)
               .method23905(SOpenBookWindowPacket.class, SOpenBookWindowPacket::new)
               .method23905(SOpenWindowPacket.class, SOpenWindowPacket::new)
               .method23905(SOpenSignMenuPacket.class, SOpenSignMenuPacket::new)
               .method23905(SPlaceGhostRecipePacket.class, SPlaceGhostRecipePacket::new)
               .method23905(SPlayerAbilitiesPacket.class, SPlayerAbilitiesPacket::new)
               .method23905(SCombatPacket.class, SCombatPacket::new)
               .method23905(SPlayerListItemPacket.class, SPlayerListItemPacket::new)
               .method23905(SPlayerLookPacket.class, SPlayerLookPacket::new)
               .method23905(SPlayerPositionLookPacket.class, SPlayerPositionLookPacket::new)
               .method23905(SRecipeBookPacket.class, SRecipeBookPacket::new)
               .method23905(SDestroyEntitiesPacket.class, SDestroyEntitiesPacket::new)
               .method23905(SRemoveEntityEffectPacket.class, SRemoveEntityEffectPacket::new)
               .method23905(SSendResourcePackPacket.class, SSendResourcePackPacket::new)
               .method23905(SRespawnPacket.class, SRespawnPacket::new)
               .method23905(SEntityHeadLookPacket.class, SEntityHeadLookPacket::new)
               .method23905(SMultiBlockChangePacket.class, SMultiBlockChangePacket::new)
               .method23905(SSelectAdvancementsTabPacket.class, SSelectAdvancementsTabPacket::new)
               .method23905(SWorldBorderPacket.class, SWorldBorderPacket::new)
               .method23905(SCameraPacket.class, SCameraPacket::new)
               .method23905(SHeldItemChangePacket.class, SHeldItemChangePacket::new)
               .method23905(SUpdateChunkPositionPacket.class, SUpdateChunkPositionPacket::new)
               .method23905(SUpdateViewDistancePacket.class, SUpdateViewDistancePacket::new)
               .method23905(SWorldSpawnChangedPacket.class, SWorldSpawnChangedPacket::new)
               .method23905(SDisplayObjectivePacket.class, SDisplayObjectivePacket::new)
               .method23905(SEntityMetadataPacket.class, SEntityMetadataPacket::new)
               .method23905(SMountEntityPacket.class, SMountEntityPacket::new)
               .method23905(SEntityVelocityPacket.class, SEntityVelocityPacket::new)
               .method23905(SEntityEquipmentPacket.class, SEntityEquipmentPacket::new)
               .method23905(SSetExperiencePacket.class, SSetExperiencePacket::new)
               .method23905(SUpdateHealthPacket.class, SUpdateHealthPacket::new)
               .method23905(SScoreboardObjectivePacket.class, SScoreboardObjectivePacket::new)
               .method23905(SSetPassengersPacket.class, SSetPassengersPacket::new)
               .method23905(STeamsPacket.class, STeamsPacket::new)
               .method23905(SUpdateScorePacket.class, SUpdateScorePacket::new)
               .method23905(SUpdateTimePacket.class, SUpdateTimePacket::new)
               .method23905(STitlePacket.class, STitlePacket::new)
               .method23905(SSpawnMovingSoundEffectPacket.class, SSpawnMovingSoundEffectPacket::new)
               .method23905(SPlaySoundEffectPacket.class, SPlaySoundEffectPacket::new)
               .method23905(SStopSoundPacket.class, SStopSoundPacket::new)
               .method23905(SPlayerListHeaderFooterPacket.class, SPlayerListHeaderFooterPacket::new)
               .method23905(SQueryNBTResponsePacket.class, SQueryNBTResponsePacket::new)
               .method23905(SCollectItemPacket.class, SCollectItemPacket::new)
               .method23905(SEntityTeleportPacket.class, SEntityTeleportPacket::new)
               .method23905(SAdvancementInfoPacket.class, SAdvancementInfoPacket::new)
               .method23905(SEntityPropertiesPacket.class, SEntityPropertiesPacket::new)
               .method23905(SPlayEntityEffectPacket.class, SPlayEntityEffectPacket::new)
               .method23905(SUpdateRecipesPacket.class, SUpdateRecipesPacket::new)
               .method23905(STagsListPacket.class, STagsListPacket::new)
         )
         .method31658(
            Class1975.SERVERBOUND,
            new Class7417<IServerPlayNetHandler>()
               .method23905(Class5580.class, Class5580::new)
               .method23905(Class5486.class, Class5486::new)
               .method23905(Class5517.class, Class5517::new)
               .method23905(Class5522.class, Class5522::new)
               .method23905(CClientStatusPacket.class, CClientStatusPacket::new)
               .method23905(Class5561.class, Class5561::new)
               .method23905(Class5562.class, Class5562::new)
               .method23905(Class5493.class, Class5493::new)
               .method23905(Class5533.class, Class5533::new)
               .method23905(Class5594.class, Class5594::new)
               .method23905(Class5482.class, Class5482::new)
               .method23905(Class5527.class, Class5527::new)
               .method23905(Class5551.class, Class5551::new)
               .method23905(Class5559.class, Class5559::new)
               .method23905(CUseEntityPacket.class, CUseEntityPacket::new)
               .method23905(Class5468.class, Class5468::new)
               .method23905(Class5600.class, Class5600::new)
               .method23905(CLockDifficultyPacket.class, CLockDifficultyPacket::new)
               .method23905(Class5605.class, Class5605::new)
               .method23905(Class5604.class, Class5604::new)
               .method23905(Class5606.class, Class5606::new)
               .method23905(Class5603.class, Class5603::new)
               .method23905(Class5483.class, Class5483::new)
               .method23905(Class5538.class, Class5538::new)
               .method23905(Class5568.class, Class5568::new)
               .method23905(Class5613.class, Class5613::new)
               .method23905(Class5612.class, Class5612::new)
               .method23905(CPlayerDiggingPacket.class, CPlayerDiggingPacket::new)
               .method23905(CEntityActionPacket.class, CEntityActionPacket::new)
               .method23905(Class5471.class, Class5471::new)
               .method23905(Class5573.class, Class5573::new)
               .method23905(Class5506.class, Class5506::new)
               .method23905(Class5558.class, Class5558::new)
               .method23905(Class5557.class, Class5557::new)
               .method23905(Class5466.class, Class5466::new)
               .method23905(Class5541.class, Class5541::new)
               .method23905(Class5597.class, Class5597::new)
               .method23905(Class5539.class, Class5539::new)
               .method23905(Class5578.class, Class5578::new)
               .method23905(Class5529.class, Class5529::new)
               .method23905(Class5514.class, Class5514::new)
               .method23905(Class5544.class, Class5544::new)
               .method23905(Class5601.class, Class5601::new)
               .method23905(Class5519.class, Class5519::new)
               .method23905(CAnimateHandPacket.class, CAnimateHandPacket::new)
               .method23905(Class5497.class, Class5497::new)
               .method23905(Class5570.class, Class5570::new)
               .method23905(Class5555.class, Class5555::new)
         )
   ),
   field9903(
      1,
      method8101()
         .method31658(
            Class1975.SERVERBOUND, new Class7417<Class5114>().method23905(Class5566.class, Class5566::new).method23905(Class5587.class, Class5587::new)
         )
         .method31658(
            Class1975.CLIENTBOUND, new Class7417<Class5112>().method23905(Class5552.class, Class5552::new).method23905(Class5489.class, Class5489::new)
         )
   ),
   LOGIN(
      2,
      method8101()
         .method31658(
            Class1975.CLIENTBOUND,
            new Class7417<Class5103>()
               .method23905(Class5490.class, Class5490::new)
               .method23905(Class5540.class, Class5540::new)
               .method23905(Class5598.class, Class5598::new)
               .method23905(Class5521.class, Class5521::new)
               .method23905(Class5496.class, Class5496::new)
         )
         .method31658(
            Class1975.SERVERBOUND,
            new Class7417<Class5108>()
               .method23905(CLoginStartPacket.class, CLoginStartPacket::new)
               .method23905(Class5569.class, Class5569::new)
               .method23905(Class5571.class, Class5571::new)
         )
   );

   private static final ProtocolType[] field9905 = new ProtocolType[4];
   private static final Map<Class<? extends Packet<?>>, ProtocolType> field9906 = Maps.newHashMap();
   private final int field9907;
   private final Map<Class1975, ? extends Class7417<?>> field9908;
   private static final ProtocolType[] field9909 = new ProtocolType[]{field9901, field9902, field9903, LOGIN};

   private static Class8779 method8101() {
      return new Class8779();
   }

   private ProtocolType(int var3, Class8779 var4) {
      this.field9907 = var3;
      this.field9908 = Class8779.method31659(var4);
   }

   @Nullable
   public Integer method8102(Class1975 var1, Packet<?> var2) {
      return this.field9908.get(var1).method23906(var2.getClass());
   }

   @Nullable
   public Packet<?> method8103(Class1975 var1, int var2) {
      return this.field9908.get(var1).method23907(var2);
   }

   public int method8104() {
      return this.field9907;
   }

   @Nullable
   public static ProtocolType method8105(int var0) {
      return var0 >= -1 && var0 <= 2 ? field9905[var0 - -1] : null;
   }

   public static ProtocolType method8106(Packet<?> var0) {
      return field9906.get(var0.getClass());
   }

   static {
      for (ProtocolType var9 : values()) {
         int var10 = var9.method8104();
         if (var10 < -1 || var10 > 2) {
            throw new Error("Invalid protocol ID " + Integer.toString(var10));
         }

         field9905[var10 - -1] = var9;
         var9.field9908
            .forEach(
               (var1, var2) -> var2.method23908()
                     .forEach(
                        var1x -> {
                           if (field9906.containsKey(var1x) && field9906.get(var1x) != var9) {
                              throw new IllegalStateException(
                                 "Packet " + var1x + " is already assigned to protocol " + field9906.get(var1x) + " - can't reassign to " + var9
                              );
                           } else {
                              field9906.put(var1x, var9);
                           }
                        }
                     )
            );
      }
   }
}
