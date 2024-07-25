package remapped;

import java.util.ArrayList;
import java.util.List;

public class BlinkModule extends Module {
   public static class_9745 field_27898;
   private List<Packet<?>> packetList = new ArrayList<Packet<?>>();
   private class_1343 field_27899;
   public float field_27900;
   public float field_27901;

   public BlinkModule() {
      super(Category.PLAYER, "Blink", "Stops your packets to blink");
   }

   @Override
   public void onEnable() {
      this.field_27899 = new class_1343(client.thePlayer.method_37302(), client.thePlayer.method_37309(), client.thePlayer.method_37156());
      this.field_27900 = client.thePlayer.field_41701;
      this.field_27901 = client.thePlayer.field_41755;
      field_27898 = new class_9745(client.theWorld, client.thePlayer.method_3247());
      field_27898.inventory = client.thePlayer.inventory;
      field_27898.method_37249(this.field_27899.field_7336, this.field_27899.field_7333, this.field_27899.field_7334, this.field_27900, this.field_27901);
      field_27898.field_29618 = client.thePlayer.field_29618;
      client.theWorld.method_725(-1, field_27898);
   }

   @Override
   public void onDisable() {
      int var3 = this.packetList.size();

      for (int var4 = 0; var4 < var3; var4++) {
         client.method_8614().method_4813(this.packetList.get(var4));
      }

      this.packetList.clear();
      client.theWorld.method_754(-1);
   }

   @EventListen
   private void method_24894(class_2157 var1) {
      if (this.method_42015()) {
         if (client.thePlayer != null && var1.method_10047() instanceof class_2317
            || var1.method_10047() instanceof class_4609
            || var1.method_10047() instanceof class_3398
            || var1.method_10047() instanceof class_3195
            || var1.method_10047() instanceof class_1022) {
            this.packetList.add(var1.method_10047());
            var1.method_29715(true);
         }
      }
   }
}
