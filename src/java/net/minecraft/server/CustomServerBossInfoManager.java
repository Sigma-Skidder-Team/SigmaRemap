package net.minecraft.server;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;

import javax.annotation.Nullable;

import net.minecraft.server.CustomServerBossInfo;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class CustomServerBossInfoManager {
    private final Map<ResourceLocation, CustomServerBossInfo> field36104 = Maps.newHashMap();

   @Nullable
   public CustomServerBossInfo get(ResourceLocation var1) {
      return this.field36104.get(var1);
   }

   public CustomServerBossInfo add(ResourceLocation var1, ITextComponent var2) {
      CustomServerBossInfo var5 = new CustomServerBossInfo(var1, var2);
      this.field36104.put(var1, var5);
      return var5;
   }

   public void remove(CustomServerBossInfo var1) {
      this.field36104.remove(var1.getID());
   }

   public Collection<ResourceLocation> getIDs() {
      return this.field36104.keySet();
   }

   public Collection<CustomServerBossInfo> getBossbars() {
      return this.field36104.values();
   }

   public CompoundNBT method29605() {
      CompoundNBT var3 = new CompoundNBT();

      for (CustomServerBossInfo var5 : this.field36104.values()) {
         var3.put(var5.getID().toString(), var5.write());
      }

      return var3;
   }

   public void method29606(CompoundNBT var1) {
      for (String var5 : var1.keySet()) {
         ResourceLocation var6 = new ResourceLocation(var5);
         this.field36104.put(var6, CustomServerBossInfo.read(var1.getCompound(var5), var6));
      }
   }

   public void method29607(ServerPlayerEntity var1) {
      for (CustomServerBossInfo var5 : this.field36104.values()) {
         var5.onPlayerLogin(var1);
      }
   }

   public void method29608(ServerPlayerEntity var1) {
      for (CustomServerBossInfo var5 : this.field36104.values()) {
         var5.onPlayerLogout(var1);
      }
   }
}
