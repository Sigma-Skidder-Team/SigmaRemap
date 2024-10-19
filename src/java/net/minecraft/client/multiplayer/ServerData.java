package net.minecraft.client.multiplayer;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

import mapped.Class2168;
import net.minecraft.util.SharedConstants;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class ServerData {
   public String serverName;
   public String serverIP;
   public ITextComponent populationInfo;
   public ITextComponent serverMOTD;
   public long pingToServer;
   public int field33193 = SharedConstants.getVersion().getProtocolVersion();
   public ITextComponent field33194 = new StringTextComponent(SharedConstants.getVersion().getName());
   public boolean pinged;
   public List<ITextComponent> field33196 = Collections.<ITextComponent>emptyList();
   private Class2168 field33197 = Class2168.field14236;
   private String field33198;
   private boolean field33199;

   public ServerData(String var1, String var2, boolean var3) {
      this.serverName = var1;
      this.serverIP = var2;
      this.field33199 = var3;
   }

   public CompoundNBT method25576() {
      CompoundNBT var3 = new CompoundNBT();
      var3.putString("name", this.serverName);
      var3.putString("ip", this.serverIP);
      if (this.field33198 != null) {
         var3.putString("icon", this.field33198);
      }

      if (this.field33197 != Class2168.field14234) {
         if (this.field33197 == Class2168.field14235) {
            var3.putBoolean("acceptTextures", false);
         }
      } else {
         var3.putBoolean("acceptTextures", true);
      }

      return var3;
   }

   public Class2168 method25577() {
      return this.field33197;
   }

   public void method25578(Class2168 var1) {
      this.field33197 = var1;
   }

   public static ServerData method25579(CompoundNBT var0) {
      ServerData var3 = new ServerData(var0.getString("name"), var0.getString("ip"), false);
      if (var0.contains("icon", 8)) {
         var3.method25581(var0.getString("icon"));
      }

      if (!var0.contains("acceptTextures", 1)) {
         var3.method25578(Class2168.field14236);
      } else if (!var0.getBoolean("acceptTextures")) {
         var3.method25578(Class2168.field14235);
      } else {
         var3.method25578(Class2168.field14234);
      }

      return var3;
   }

   @Nullable
   public String method25580() {
      return this.field33198;
   }

   public void method25581(String var1) {
      this.field33198 = var1;
   }

   public boolean isOnLAN() {
      return this.field33199;
   }

   public void copyFrom(ServerData var1) {
      this.serverIP = var1.serverIP;
      this.serverName = var1.serverName;
      this.method25578(var1.method25577());
      this.field33198 = var1.field33198;
      this.field33199 = var1.field33199;
   }
}
