package net.minecraft.network.play;

import net.minecraft.network.INetHandler;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CChatMessagePacket;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.network.play.client.CClientSettingsPacket;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.network.play.client.CConfirmTeleportPacket;
import net.minecraft.network.play.client.CConfirmTransactionPacket;
import net.minecraft.network.play.client.CCreativeInventoryActionPacket;
import net.minecraft.network.play.client.CCustomPayloadPacket;
import net.minecraft.network.play.client.CEditBookPacket;
import net.minecraft.network.play.client.CEnchantItemPacket;
import net.minecraft.network.play.client.CEntityActionPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CInputPacket;
import net.minecraft.network.play.client.CKeepAlivePacket;
import net.minecraft.network.play.client.CLockDifficultyPacket;
import net.minecraft.network.play.client.CMoveVehiclePacket;
import net.minecraft.network.play.client.CPickItemPacket;
import net.minecraft.network.play.client.CPlaceRecipePacket;
import net.minecraft.network.play.client.CPlayerAbilitiesPacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.network.play.client.CQueryEntityNBTPacket;
import net.minecraft.network.play.client.CQueryTileEntityNBTPacket;
import net.minecraft.network.play.client.CRecipeInfoPacket;
import net.minecraft.network.play.client.CRenameItemPacket;
import net.minecraft.network.play.client.CResourcePackStatusPacket;
import net.minecraft.network.play.client.CSeenAdvancementsPacket;
import net.minecraft.network.play.client.CSelectTradePacket;
import net.minecraft.network.play.client.CSetDifficultyPacket;
import net.minecraft.network.play.client.CSpectatePacket;
import net.minecraft.network.play.client.CSteerBoatPacket;
import net.minecraft.network.play.client.CTabCompletePacket;
import net.minecraft.network.play.client.CUpdateBeaconPacket;
import net.minecraft.network.play.client.CUpdateCommandBlockPacket;
import net.minecraft.network.play.client.CUpdateJigsawBlockPacket;
import net.minecraft.network.play.client.CUpdateMinecartCommandBlockPacket;
import net.minecraft.network.play.client.CUpdateSignPacket;
import net.minecraft.network.play.client.CUpdateStructureBlockPacket;
import net.minecraft.network.play.client.CUseEntityPacket;

public interface IServerPlayNetHandler extends INetHandler
{
    void handleAnimation(CAnimateHandPacket packetIn);

    void processChatMessage(CChatMessagePacket packetIn);

    void processClientStatus(CClientStatusPacket packetIn);

    void processClientSettings(CClientSettingsPacket packetIn);

    void processConfirmTransaction(CConfirmTransactionPacket packetIn);

    void processEnchantItem(CEnchantItemPacket packetIn);

    void processClickWindow(CClickWindowPacket packetIn);

    void processPlaceRecipe(CPlaceRecipePacket packetIn);

    void processCloseWindow(CCloseWindowPacket packetIn);

    void processCustomPayload(CCustomPayloadPacket packetIn);

    void processUseEntity(CUseEntityPacket packetIn);

    void processKeepAlive(CKeepAlivePacket packetIn);

    void processPlayer(CPlayerPacket packetIn);

    void processPlayerAbilities(CPlayerAbilitiesPacket packetIn);

    void processPlayerDigging(CPlayerDiggingPacket packetIn);

    void processEntityAction(CEntityActionPacket packetIn);

    void processInput(CInputPacket packetIn);

    void processHeldItemChange(CHeldItemChangePacket packetIn);

    void processCreativeInventoryAction(CCreativeInventoryActionPacket packetIn);

    void processUpdateSign(CUpdateSignPacket packetIn);

    void processTryUseItemOnBlock(CPlayerTryUseItemOnBlockPacket packetIn);

    void processTryUseItem(CPlayerTryUseItemPacket packetIn);

    void handleSpectate(CSpectatePacket packetIn);

    void handleResourcePackStatus(CResourcePackStatusPacket packetIn);

    void processSteerBoat(CSteerBoatPacket packetIn);

    void processVehicleMove(CMoveVehiclePacket packetIn);

    void processConfirmTeleport(CConfirmTeleportPacket packetIn);

    void handleRecipeBookUpdate(CRecipeInfoPacket packetIn);

    void handleSeenAdvancements(CSeenAdvancementsPacket packetIn);

    void processTabComplete(CTabCompletePacket packetIn);

    void processUpdateCommandBlock(CUpdateCommandBlockPacket packetIn);

    void processUpdateCommandMinecart(CUpdateMinecartCommandBlockPacket packetIn);

    void processPickItem(CPickItemPacket packetIn);

    void processRenameItem(CRenameItemPacket packetIn);

    void processUpdateBeacon(CUpdateBeaconPacket packetIn);

    void processUpdateStructureBlock(CUpdateStructureBlockPacket packetIn);

    void processSelectTrade(CSelectTradePacket packetIn);

    void processEditBook(CEditBookPacket packetIn);

    void processNBTQueryEntity(CQueryEntityNBTPacket packetIn);

    void processNBTQueryBlockEntity(CQueryTileEntityNBTPacket packetIn);

    void func_217262_a(CUpdateJigsawBlockPacket p_217262_1_);

    void func_217263_a(CSetDifficultyPacket p_217263_1_);

    void func_217261_a(CLockDifficultyPacket p_217261_1_);
}
