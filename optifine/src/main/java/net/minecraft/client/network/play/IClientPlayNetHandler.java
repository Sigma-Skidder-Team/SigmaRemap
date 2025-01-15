package net.minecraft.client.network.play;

import net.minecraft.network.INetHandler;
import net.minecraft.network.play.server.SAdvancementInfoPacket;
import net.minecraft.network.play.server.SAnimateBlockBreakPacket;
import net.minecraft.network.play.server.SAnimateHandPacket;
import net.minecraft.network.play.server.SBlockActionPacket;
import net.minecraft.network.play.server.SCameraPacket;
import net.minecraft.network.play.server.SChangeBlockPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.network.play.server.SChatPacket;
import net.minecraft.network.play.server.SChunkDataPacket;
import net.minecraft.network.play.server.SCloseWindowPacket;
import net.minecraft.network.play.server.SCollectItemPacket;
import net.minecraft.network.play.server.SCombatPacket;
import net.minecraft.network.play.server.SCommandListPacket;
import net.minecraft.network.play.server.SConfirmTransactionPacket;
import net.minecraft.network.play.server.SCooldownPacket;
import net.minecraft.network.play.server.SCustomPayloadPlayPacket;
import net.minecraft.network.play.server.SDestroyEntitiesPacket;
import net.minecraft.network.play.server.SDisconnectPacket;
import net.minecraft.network.play.server.SDisplayObjectivePacket;
import net.minecraft.network.play.server.SEntityEquipmentPacket;
import net.minecraft.network.play.server.SEntityHeadLookPacket;
import net.minecraft.network.play.server.SEntityMetadataPacket;
import net.minecraft.network.play.server.SEntityPacket;
import net.minecraft.network.play.server.SEntityPropertiesPacket;
import net.minecraft.network.play.server.SEntityStatusPacket;
import net.minecraft.network.play.server.SEntityTeleportPacket;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import net.minecraft.network.play.server.SExplosionPacket;
import net.minecraft.network.play.server.SHeldItemChangePacket;
import net.minecraft.network.play.server.SJoinGamePacket;
import net.minecraft.network.play.server.SKeepAlivePacket;
import net.minecraft.network.play.server.SMapDataPacket;
import net.minecraft.network.play.server.SMerchantOffersPacket;
import net.minecraft.network.play.server.SMountEntityPacket;
import net.minecraft.network.play.server.SMoveVehiclePacket;
import net.minecraft.network.play.server.SMultiBlockChangePacket;
import net.minecraft.network.play.server.SOpenBookWindowPacket;
import net.minecraft.network.play.server.SOpenHorseWindowPacket;
import net.minecraft.network.play.server.SOpenSignMenuPacket;
import net.minecraft.network.play.server.SOpenWindowPacket;
import net.minecraft.network.play.server.SPlaceGhostRecipePacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SPlaySoundEffectPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlaySoundPacket;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlayerDiggingPacket;
import net.minecraft.network.play.server.SPlayerListHeaderFooterPacket;
import net.minecraft.network.play.server.SPlayerListItemPacket;
import net.minecraft.network.play.server.SPlayerLookPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.network.play.server.SQueryNBTResponsePacket;
import net.minecraft.network.play.server.SRecipeBookPacket;
import net.minecraft.network.play.server.SRemoveEntityEffectPacket;
import net.minecraft.network.play.server.SRespawnPacket;
import net.minecraft.network.play.server.SScoreboardObjectivePacket;
import net.minecraft.network.play.server.SSelectAdvancementsTabPacket;
import net.minecraft.network.play.server.SSendResourcePackPacket;
import net.minecraft.network.play.server.SServerDifficultyPacket;
import net.minecraft.network.play.server.SSetExperiencePacket;
import net.minecraft.network.play.server.SSetPassengersPacket;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.network.play.server.SSpawnExperienceOrbPacket;
import net.minecraft.network.play.server.SSpawnGlobalEntityPacket;
import net.minecraft.network.play.server.SSpawnMobPacket;
import net.minecraft.network.play.server.SSpawnMovingSoundEffectPacket;
import net.minecraft.network.play.server.SSpawnObjectPacket;
import net.minecraft.network.play.server.SSpawnPaintingPacket;
import net.minecraft.network.play.server.SSpawnParticlePacket;
import net.minecraft.network.play.server.SSpawnPlayerPacket;
import net.minecraft.network.play.server.SSpawnPositionPacket;
import net.minecraft.network.play.server.SStatisticsPacket;
import net.minecraft.network.play.server.SStopSoundPacket;
import net.minecraft.network.play.server.STabCompletePacket;
import net.minecraft.network.play.server.STagsListPacket;
import net.minecraft.network.play.server.STeamsPacket;
import net.minecraft.network.play.server.STitlePacket;
import net.minecraft.network.play.server.SUnloadChunkPacket;
import net.minecraft.network.play.server.SUpdateBossInfoPacket;
import net.minecraft.network.play.server.SUpdateChunkPositionPacket;
import net.minecraft.network.play.server.SUpdateHealthPacket;
import net.minecraft.network.play.server.SUpdateLightPacket;
import net.minecraft.network.play.server.SUpdateRecipesPacket;
import net.minecraft.network.play.server.SUpdateScorePacket;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.network.play.server.SUpdateTimePacket;
import net.minecraft.network.play.server.SUpdateViewDistancePacket;
import net.minecraft.network.play.server.SWindowItemsPacket;
import net.minecraft.network.play.server.SWindowPropertyPacket;
import net.minecraft.network.play.server.SWorldBorderPacket;

public interface IClientPlayNetHandler extends INetHandler
{
    void handleSpawnObject(SSpawnObjectPacket packetIn);

    void handleSpawnExperienceOrb(SSpawnExperienceOrbPacket packetIn);

    void handleSpawnGlobalEntity(SSpawnGlobalEntityPacket packetIn);

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

    void handleOpenHorseWindow(SOpenHorseWindowPacket p_217271_1_);

    void handleWindowProperty(SWindowPropertyPacket packetIn);

    void handleSetSlot(SSetSlotPacket packetIn);

    void handleCustomPayload(SCustomPayloadPlayPacket packetIn);

    void handleDisconnect(SDisconnectPacket packetIn);

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

    void handleSpawnPosition(SSpawnPositionPacket packetIn);

    void handleTimeUpdate(SUpdateTimePacket packetIn);

    void handleSoundEffect(SPlaySoundEffectPacket packetIn);

    void func_217266_a(SSpawnMovingSoundEffectPacket p_217266_1_);

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

    void func_225312_a(SPlayerDiggingPacket p_225312_1_);
}
