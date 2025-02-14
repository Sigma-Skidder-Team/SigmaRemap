package net.minecraft.network.play;

import net.minecraft.network.INetHandler;
import net.minecraft.network.play.client.*;

public interface IServerPlayNetHandler extends INetHandler {
   void handleAnimation(CAnimateHandPacket var1);

   void processChatMessage(CChatMessagePacket var1);

   void processClientStatus(CClientStatusPacket var1);

   void processClientSettings(CClientSettingsPacket var1);

   void processConfirmTransaction(CConfirmTransactionPacket var1);

   void processEnchantItem(CEnchantItemPacket var1);

   void processClickWindow(CClickWindowPacket var1);

   void processPlaceRecipe(CPlaceRecipePacket var1);

   void processCloseWindow(CCloseWindowPacket var1);

   void processCustomPayload(CCustomPayloadPacket var1);

   void processUseEntity(CUseEntityPacket var1);

   void processKeepAlive(CKeepAlivePacket var1);

   void processPlayer(CPlayerPacket var1);

   void processPlayerAbilities(CPlayerAbilitiesPacket var1);

   void processPlayerDigging(CPlayerDiggingPacket var1);

   void processEntityAction(CEntityActionPacket var1);

   void processInput(CInputPacket var1);

   void processHeldItemChange(CHeldItemChangePacket var1);

   void processCreativeInventoryAction(CCreativeInventoryActionPacket var1);

   void processUpdateSign(CUpdateSignPacket var1);

   void processTryUseItemOnBlock(CPlayerTryUseItemOnBlockPacket var1);

   void processTryUseItem(CPlayerTryUseItemPacket var1);

   void handleSpectate(CSpectatePacket var1);

   void handleResourcePackStatus(CResourcePackStatusPacket var1);

   void processSteerBoat(CSteerBoatPacket var1);

   void processVehicleMove(CMoveVehiclePacket var1);

   void processConfirmTeleport(CConfirmTeleportPacket var1);

   void handleRecipeBookUpdate(CMarkRecipeSeenPacket var1);

   void func_241831_a(CUpdateRecipeBookStatusPacket var1);

   void handleSeenAdvancements(CSeenAdvancementsPacket var1);

   void processTabComplete(CTabCompletePacket var1);

   void processUpdateCommandBlock(CUpdateCommandBlockPacket var1);

   void processUpdateCommandMinecart(CUpdateMinecartCommandBlockPacket var1);

   void processPickItem(CPickItemPacket var1);

   void processRenameItem(CRenameItemPacket var1);

   void processUpdateBeacon(CUpdateBeaconPacket var1);

   void processUpdateStructureBlock(CUpdateStructureBlockPacket var1);

   void processSelectTrade(CSelectTradePacket var1);

   void processEditBook(CEditBookPacket var1);

   void processNBTQueryEntity(CQueryEntityNBTPacket var1);

   void processNBTQueryBlockEntity(CQueryTileEntityNBTPacket var1);

   void func_217262_a(CUpdateJigsawBlockPacket var1);

   void func_230549_a_(CJigsawBlockGeneratePacket var1);

   void func_217263_a(CSetDifficultyPacket var1);

   void func_217261_a(CLockDifficultyPacket var1);
}
