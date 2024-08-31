package net.minecraft.client.network.play;

import net.minecraft.network.INetHandler;
import net.minecraft.network.play.server.*;

public interface IClientPlayNetHandler extends INetHandler {
   void handleSpawnObject(SSpawnObjectPacket packetIn);

   void handleSpawnExperienceOrb(SSpawnExperienceOrbPacket packetIn);

   void handleSpawnMob(SSpawnMobPacket packetIn);

   void handleScoreboardObjective(SScoreboardObjectivePacket packetIn);

   void handleSpawnPainting(SSpawnPaintingPacket packetIn);

   void handleSpawnPlayer(SSpawnPlayerPacket packetIn);

   void handleAnimation(SAnimateHandPacket packetIn);

   void handleStatistics(SStatisticsPacket packetIn);

   void handleRecipeBook(SRecipeBookPacket packetIn);

   void handleBlockBreakAnim(SAnimateBlockBreakPacket packetIn);

   void handleSignEditorOpen(SOpenSignMenuPacket packetIn);

   void handleUpdateTileEntity(SUpdateTileEntityPacket packetIn);

   void handleBlockAction(SBlockActionPacket packetIn);

   void handleBlockChange(SChangeBlockPacket packetIn);

   void handleChat(SChatPacket packetIn);

   void handleMultiBlockChange(SMultiBlockChangePacket packetIn);

   void handleMaps(SMapDataPacket packetIn);

   void handleConfirmTransaction(SConfirmTransactionPacket packetIn);

   void handleCloseWindow(SCloseWindowPacket packetIn);

   void handleWindowItems(SWindowItemsPacket packetIn);

   void handleOpenHorseWindow(SOpenHorseWindowPacket packetIn);

   void handleWindowProperty(SWindowPropertyPacket packetIn);

   void handleSetSlot(SSetSlotPacket packetIn);

   void handleCustomPayload(SCustomPayloadPlayPacket packetIn);

   void handleDisconnect(SDisconnectPacket packetIn);

   /**
    * Invokes the entities' handleUpdateHealth method which is implemented in LivingBase (hurt/death),
    * MinecartMobSpawner (spawn delay), FireworkRocket & MinecartTNT (explosion), IronGolem (throwing,...), Witch
    * (spawn particles), Zombie (villager transformation), Animal (breeding mode particles), Horse (breeding/smoke
    * particles), Sheep (...), Tameable (...), Villager (particles for breeding mode, angry and happy), Wolf (...)
    */
   void handleEntityStatus(SEntityStatusPacket packetIn);

   void handleEntityAttach(SMountEntityPacket packetIn);

   void handleSetPassengers(SSetPassengersPacket packetIn);

   void handleExplosion(SExplosionPacket packetIn);

   void handleChangeGameState(SChangeGameStatePacket packetIn);

   void handleKeepAlive(SKeepAlivePacket packetIn);

   void handleChunkData(SChunkDataPacket packetIn);

   void processChunkUnload(SUnloadChunkPacket packetIn);

   void handleEffect(SPlaySoundEventPacket packetIn);

   void handleJoinGame(SJoinGamePacket packetIn);

   void handleEntityMovement(SEntityPacket packetIn);

   void handlePlayerPosLook(SPlayerPositionLookPacket packetIn);

   void handleParticles(SSpawnParticlePacket packetIn);

   void handlePlayerAbilities(SPlayerAbilitiesPacket packetIn);

   void handlePlayerListItem(SPlayerListItemPacket packetIn);

   void handleDestroyEntities(SDestroyEntitiesPacket packetIn);

   void handleRemoveEntityEffect(SRemoveEntityEffectPacket packetIn);

   void handleRespawn(SRespawnPacket packetIn);

   void handleEntityHeadLook(SEntityHeadLookPacket packetIn);

   void handleHeldItemChange(SHeldItemChangePacket packetIn);

   void handleDisplayObjective(SDisplayObjectivePacket packetIn);

   void handleEntityMetadata(SEntityMetadataPacket packetIn);

   void handleEntityVelocity(SEntityVelocityPacket packetIn);

   void handleEntityEquipment(SEntityEquipmentPacket packetIn);

   void handleSetExperience(SSetExperiencePacket packetIn);

   void handleUpdateHealth(SUpdateHealthPacket packetIn);

   void handleTeams(STeamsPacket packetIn);

   void handleUpdateScore(SUpdateScorePacket packetIn);

   void func_230488_a_(SWorldSpawnChangedPacket packetIn);

   void handleTimeUpdate(SUpdateTimePacket packetIn);

   void handleSoundEffect(SPlaySoundEffectPacket packetIn);

   void handleSpawnMovingSoundEffect(SSpawnMovingSoundEffectPacket packetIn);

   void handleCustomSound(SPlaySoundPacket packetIn);

   void handleCollectItem(SCollectItemPacket packetIn);

   void handleEntityTeleport(SEntityTeleportPacket packetIn);

   void handleEntityProperties(SEntityPropertiesPacket packetIn);

   void handleEntityEffect(SPlayEntityEffectPacket packetIn);

   void handleTags(STagsListPacket packetIn);

   void handleCombatEvent(SCombatPacket packetIn);

   void handleServerDifficulty(SServerDifficultyPacket packetIn);

   void handleCamera(SCameraPacket packetIn);

   void handleWorldBorder(SWorldBorderPacket packetIn);

   void handleTitle(STitlePacket packetIn);

   void handlePlayerListHeaderFooter(SPlayerListHeaderFooterPacket packetIn);

   void handleResourcePack(SSendResourcePackPacket packetIn);

   void handleUpdateBossInfo(SUpdateBossInfoPacket packetIn);

   void handleCooldown(SCooldownPacket packetIn);

   void handleMoveVehicle(SMoveVehiclePacket packetIn);

   void handleAdvancementInfo(SAdvancementInfoPacket packetIn);

   void handleSelectAdvancementsTab(SSelectAdvancementsTabPacket packetIn);

   void handlePlaceGhostRecipe(SPlaceGhostRecipePacket packetIn);

   void handleCommandList(SCommandListPacket packetIn);

   void handleStopSound(SStopSoundPacket packetIn);

   void handleTabComplete(STabCompletePacket packetIn);

   void handleUpdateRecipes(SUpdateRecipesPacket packetIn);

   void handlePlayerLook(SPlayerLookPacket packetIn);

   void handleNBTQueryResponse(SQueryNBTResponsePacket packetIn);

   void handleUpdateLight(SUpdateLightPacket packetIn);

   void handleOpenBookPacket(SOpenBookWindowPacket packetIn);

   void handleOpenWindowPacket(SOpenWindowPacket packetIn);

   void handleMerchantOffers(SMerchantOffersPacket packetIn);

   void handleUpdateViewDistancePacket(SUpdateViewDistancePacket packetIn);

   void handleChunkPositionPacket(SUpdateChunkPositionPacket packetIn);

   void handleAcknowledgePlayerDigging(SPlayerDiggingPacket packetIn);
}
