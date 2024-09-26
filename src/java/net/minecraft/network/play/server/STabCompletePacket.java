package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.io.IOException;
import java.util.ArrayList;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;

public class STabCompletePacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24604;
   private int transactionId;
   private Suggestions sugestions;

   public STabCompletePacket() {
   }

   public STabCompletePacket(int var1, Suggestions var2) {
      this.transactionId = var1;
      this.sugestions = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.transactionId = var1.readVarInt();
      int var4 = var1.readVarInt();
      int var5 = var1.readVarInt();
      StringRange var6 = StringRange.between(var4, var4 + var5);
      int var7 = var1.readVarInt();
      ArrayList var8 = Lists.newArrayListWithCapacity(var7);

      for (int var9 = 0; var9 < var7; var9++) {
         String var10 = var1.readString(32767);
         ITextComponent var11 = !var1.readBoolean() ? null : var1.readTextComponent();
         var8.add(new Suggestion(var6, var10, var11));
      }

      this.sugestions = new Suggestions(var6, var8);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.transactionId);
      var1.writeVarInt(this.sugestions.getRange().getStart());
      var1.writeVarInt(this.sugestions.getRange().getLength());
      var1.writeVarInt(this.sugestions.getList().size());

      for (Suggestion var5 : this.sugestions.getList()) {
         var1.writeString(var5.getText());
         var1.writeBoolean(var5.getTooltip() != null);
         if (var5.getTooltip() != null) {
            var1.writeTextComponent(TextComponentUtils.toTextComponent(var5.getTooltip()));
         }
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleTabComplete(this);
   }

   public int getTransactionId() {
      return this.transactionId;
   }

   public Suggestions getSugestions() {
      return this.sugestions;
   }
}
