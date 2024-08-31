package mapped;

import net.minecraft.network.INetHandler;

public interface IServerPlayNetHandler extends INetHandler {
   void handleAnimation(CAnimateHandPacket var1);

   void method15611(Class5522 var1);

   void processClientStatus(CClientStatusPacket var1);

   void method15613(Class5561 var1);

   void method15614(Class5493 var1);

   void method15615(Class5533 var1);

   void method15616(Class5594 var1);

   void method15617(Class5613 var1);

   void method15618(Class5482 var1);

   void method15619(Class5527 var1);

   void processUseEntity(CUseEntityPacket var1);

   void method15621(Class5600 var1);

   void method15622(Class5603 var1);

   void method15623(Class5612 var1);

   void method15624(CPlayerDiggingPacket var1);

   void processEntityAction(CEntityActionPacket var1);

   void method15626(Class5471 var1);

   void method15627(Class5539 var1);

   void method15628(Class5514 var1);

   void method15629(Class5519 var1);

   void method15630(Class5570 var1);

   void method15631(Class5555 var1);

   void method15632(Class5497 var1);

   void method15633(Class5557 var1);

   void method15634(Class5538 var1);

   void method15635(Class5483 var1);

   void method15636(Class5580 var1);

   void method15637(Class5506 var1);

   void method15638(Class5573 var1);

   void method15639(Class5466 var1);

   void method15640(Class5562 var1);

   void method15641(Class5578 var1);

   void method15642(Class5529 var1);

   void method15643(Class5568 var1);

   void method15644(Class5558 var1);

   void method15645(Class5597 var1);

   void method15646(Class5601 var1);

   void method15647(Class5541 var1);

   void method15648(Class5551 var1);

   void method15649(Class5559 var1);

   void method15650(Class5486 var1);

   void method15651(Class5544 var1);

   void method15652(Class5468 var1);

   void method15653(Class5517 var1);

   void method15654(CLockDifficultyPacket var1);
}
