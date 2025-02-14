package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;

import net.minecraft.scoreboard.Team;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class STeamsPacket implements IPacket<IClientPlayNetHandler> {
   private String name = "";
   private ITextComponent displayName = StringTextComponent.EMPTY;
   private ITextComponent prefix = StringTextComponent.EMPTY;
   private ITextComponent suffix = StringTextComponent.EMPTY;
   private String nameTagVisibility = Team.Visible.ALWAYS.internalName;
   private String collisionRule = Team.CollisionRule.ALWAYS.name;
   private TextFormatting color = TextFormatting.RESET;
   private final Collection<String> players = Lists.newArrayList();
   private int action;
   private int friendlyFlags;

   public STeamsPacket() {
   }

   public STeamsPacket(ScorePlayerTeam var1, int var2) {
      this.name = var1.method28567();
      this.action = var2;
      if (var2 == 0 || var2 == 2) {
         this.displayName = var1.method28568();
         this.friendlyFlags = var1.method28588();
         this.nameTagVisibility = var1.method28582().internalName;
         this.collisionRule = var1.method28586().name;
         this.color = var1.getColor();
         this.prefix = var1.method28572();
         this.suffix = var1.method28574();
      }

      if (var2 == 0) {
         this.players.addAll(var1.method28575());
      }
   }

   public STeamsPacket(ScorePlayerTeam var1, Collection<String> var2, int var3) {
      if (var3 != 3 && var3 != 4) {
         throw new IllegalArgumentException("Method must be join or leave for player constructor");
      } else if (var2 != null && !var2.isEmpty()) {
         this.action = var3;
         this.name = var1.method28567();
         this.players.addAll(var2);
      } else {
         throw new IllegalArgumentException("Players cannot be null/empty");
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.name = var1.readString(16);
      this.action = var1.readByte();
      if (this.action == 0 || this.action == 2) {
         this.displayName = var1.readTextComponent();
         this.friendlyFlags = var1.readByte();
         this.nameTagVisibility = var1.readString(40);
         this.collisionRule = var1.readString(40);
         this.color = var1.<TextFormatting>readEnumValue(TextFormatting.class);
         this.prefix = var1.readTextComponent();
         this.suffix = var1.readTextComponent();
      }

      if (this.action == 0 || this.action == 3 || this.action == 4) {
         int var4 = var1.readVarInt();

         for (int var5 = 0; var5 < var4; var5++) {
            this.players.add(var1.readString(40));
         }
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.name);
      var1.writeByte(this.action);
      if (this.action == 0 || this.action == 2) {
         var1.writeTextComponent(this.displayName);
         var1.writeByte(this.friendlyFlags);
         var1.writeString(this.nameTagVisibility);
         var1.writeString(this.collisionRule);
         var1.writeEnumValue(this.color);
         var1.writeTextComponent(this.prefix);
         var1.writeTextComponent(this.suffix);
      }

      if (this.action == 0 || this.action == 3 || this.action == 4) {
         var1.writeVarInt(this.players.size());

         for (String var5 : this.players) {
            var1.writeString(var5);
         }
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleTeams(this);
   }

   public String getName() {
      return this.name;
   }

   public ITextComponent getDisplayName() {
      return this.displayName;
   }

   public Collection<String> getPlayers() {
      return this.players;
   }

   public int getAction() {
      return this.action;
   }

   public int getFriendlyFlags() {
      return this.friendlyFlags;
   }

   public TextFormatting getColor() {
      return this.color;
   }

   public String getNameTagVisibility() {
      return this.nameTagVisibility;
   }

   public String getCollisionRule() {
      return this.collisionRule;
   }

   public ITextComponent getPrefix() {
      return this.prefix;
   }

   public ITextComponent getSuffix() {
      return this.suffix;
   }
}
