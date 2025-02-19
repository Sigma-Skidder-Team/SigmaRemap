package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.server.ServerBossInfo;

public class CustomServerBossInfo extends ServerBossInfo
{
   private final ResourceLocation id;
   private final Set<UUID> players = Sets.newHashSet();
   private int value;
   private int max = 100;

   public CustomServerBossInfo(ResourceLocation idIn, ITextComponent nameIn)
   {
      super(nameIn, BossInfo.Color.WHITE, BossInfo.Overlay.PROGRESS);
      this.id = idIn;
      this.setPercent(0.0F);
   }

   public ResourceLocation getID()
   {
      return this.id;
   }

   /**
    * Makes the boss visible to the given player.
    */
   public void addPlayer(ServerPlayerEntity player)
   {
      super.addPlayer(player);
      this.players.add(player.getUniqueID());
   }

   public void addPlayer(UUID player)
   {
      this.players.add(player);
   }

   /**
    * Makes the boss non-visible to the given player.
    */
   public void removePlayer(ServerPlayerEntity player)
   {
      super.removePlayer(player);
      this.players.remove(player.getUniqueID());
   }

   public void removeAllPlayers()
   {
      super.removeAllPlayers();
      this.players.clear();
   }

   public int getValue()
   {
      return this.value;
   }

   public int getMax()
   {
      return this.max;
   }

   public void setValue(int value)
   {
      this.value = value;
      this.setPercent(MathHelper.clamp((float)value / (float)this.max, 0.0F, 1.0F));
   }

   public void setMax(int max)
   {
      this.max = max;
      this.setPercent(MathHelper.clamp((float)this.value / (float)max, 0.0F, 1.0F));
   }

   public final ITextComponent getFormattedName()
   {
      return TextComponentUtils.wrapWithSquareBrackets(this.getName()).modifyStyle((p_211569_1_) ->
      {
         return p_211569_1_.setFormatting(this.getColor().getFormatting()).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new StringTextComponent(this.getID().toString()))).setInsertion(this.getID().toString());
      });
   }

   public boolean setPlayers(Collection<ServerPlayerEntity> serverPlayerList)
   {
      Set<UUID> set = Sets.newHashSet();
      Set<ServerPlayerEntity> set1 = Sets.newHashSet();

      for (UUID uuid : this.players)
      {
         boolean flag = false;

         for (ServerPlayerEntity serverplayerentity : serverPlayerList)
         {
            if (serverplayerentity.getUniqueID().equals(uuid))
            {
               flag = true;
               break;
            }
         }

         if (!flag)
         {
            set.add(uuid);
         }
      }

      for (ServerPlayerEntity serverplayerentity1 : serverPlayerList)
      {
         boolean flag1 = false;

         for (UUID uuid2 : this.players)
         {
            if (serverplayerentity1.getUniqueID().equals(uuid2))
            {
               flag1 = true;
               break;
            }
         }

         if (!flag1)
         {
            set1.add(serverplayerentity1);
         }
      }

      for (UUID uuid1 : set)
      {
         for (ServerPlayerEntity serverplayerentity3 : this.getPlayers())
         {
            if (serverplayerentity3.getUniqueID().equals(uuid1))
            {
               this.removePlayer(serverplayerentity3);
               break;
            }
         }

         this.players.remove(uuid1);
      }

      for (ServerPlayerEntity serverplayerentity2 : set1)
      {
         this.addPlayer(serverplayerentity2);
      }

      return !set.isEmpty() || !set1.isEmpty();
   }

   public CompoundNBT write()
   {
      CompoundNBT compoundnbt = new CompoundNBT();
      compoundnbt.putString("Name", ITextComponent.Serializer.toJson(this.name));
      compoundnbt.putBoolean("Visible", this.isVisible());
      compoundnbt.putInt("Value", this.value);
      compoundnbt.putInt("Max", this.max);
      compoundnbt.putString("Color", this.getColor().getName());
      compoundnbt.putString("Overlay", this.getOverlay().getName());
      compoundnbt.putBoolean("DarkenScreen", this.shouldDarkenSky());
      compoundnbt.putBoolean("PlayBossMusic", this.shouldPlayEndBossMusic());
      compoundnbt.putBoolean("CreateWorldFog", this.shouldCreateFog());
      ListNBT listnbt = new ListNBT();

      for (UUID uuid : this.players)
      {
         listnbt.add(NBTUtil.valueOf(uuid));
      }

      compoundnbt.put("Players", listnbt);
      return compoundnbt;
   }

   public static CustomServerBossInfo read(CompoundNBT nbt, ResourceLocation idIn)
   {
      CustomServerBossInfo customserverbossinfo = new CustomServerBossInfo(idIn, ITextComponent.Serializer.getComponentFromJson(nbt.getString("Name")));
      customserverbossinfo.setVisible(nbt.getBoolean("Visible"));
      customserverbossinfo.setValue(nbt.getInt("Value"));
      customserverbossinfo.setMax(nbt.getInt("Max"));
      customserverbossinfo.setColor(BossInfo.Color.byName(nbt.getString("Color")));
      customserverbossinfo.setOverlay(BossInfo.Overlay.byName(nbt.getString("Overlay")));
      customserverbossinfo.setDarkenSky(nbt.getBoolean("DarkenScreen"));
      customserverbossinfo.setPlayEndBossMusic(nbt.getBoolean("PlayBossMusic"));
      customserverbossinfo.setCreateFog(nbt.getBoolean("CreateWorldFog"));
      ListNBT listnbt = nbt.getList("Players", 11);

      for (int i = 0; i < listnbt.size(); ++i)
      {
         customserverbossinfo.addPlayer(NBTUtil.readUniqueID(listnbt.get(i)));
      }

      return customserverbossinfo;
   }

   public void onPlayerLogin(ServerPlayerEntity player)
   {
      if (this.players.contains(player.getUniqueID()))
      {
         this.addPlayer(player);
      }
   }

   public void onPlayerLogout(ServerPlayerEntity player)
   {
      super.removePlayer(player);
   }
}