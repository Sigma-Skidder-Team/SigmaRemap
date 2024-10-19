package mapped;

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
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;
import net.minecraft.world.server.ServerBossInfo;

public class Class3623 extends ServerBossInfo {
   private final ResourceLocation field19625;
   private final Set<UUID> field19626 = Sets.newHashSet();
   private int field19627;
   private int field19628 = 100;

   public Class3623(ResourceLocation var1, ITextComponent var2) {
      super(var2, BossInfo.Color.WHITE, BossInfo.Overlay.PROGRESS);
      this.field19625 = var1;
      this.setPercent(0.0F);
   }

   public ResourceLocation method12262() {
      return this.field19625;
   }

   @Override
   public void addPlayer(ServerPlayerEntity var1) {
      super.addPlayer(var1);
      this.field19626.add(var1.getUniqueID());
   }

   public void method12264(UUID var1) {
      this.field19626.add(var1);
   }

   @Override
   public void removePlayer(ServerPlayerEntity var1) {
      super.removePlayer(var1);
      this.field19626.remove(var1.getUniqueID());
   }

   @Override
   public void removeAllPlayers() {
      super.removeAllPlayers();
      this.field19626.clear();
   }

   public int method12267() {
      return this.field19627;
   }

   public int method12268() {
      return this.field19628;
   }

   public void method12269(int var1) {
      this.field19627 = var1;
      this.setPercent(MathHelper.clamp((float)var1 / (float)this.field19628, 0.0F, 1.0F));
   }

   public void method12270(int var1) {
      this.field19628 = var1;
      this.setPercent(MathHelper.clamp((float)this.field19627 / (float)var1, 0.0F, 1.0F));
   }

   public final ITextComponent method12271() {
      return TextComponentUtils.wrapWithSquareBrackets(this.getName())
         .modifyStyle(
            var1 -> var1.setFormatting(this.getColor().getFormatting())
                  .setHoverEvent(new HoverEvent(HoverEvent$Action.SHOW_TEXT, new StringTextComponent(this.method12262().toString())))
                  .setInsertion(this.method12262().toString())
         );
   }

   public boolean method12272(Collection<ServerPlayerEntity> var1) {
      Set<UUID> var4 = Sets.newHashSet();
      Set<ServerPlayerEntity> var5 = Sets.newHashSet();

      for (UUID var7 : this.field19626) {
         boolean var8 = false;

         for (ServerPlayerEntity var10 : var1) {
            if (var10.getUniqueID().equals(var7)) {
               var8 = true;
               break;
            }
         }

         if (!var8) {
            var4.add(var7);
         }
      }

      for (ServerPlayerEntity var14 : var1) {
         boolean var17 = false;

         for (UUID var21 : this.field19626) {
            if (var14.getUniqueID().equals(var21)) {
               var17 = true;
               break;
            }
         }

         if (!var17) {
            var5.add(var14);
         }
      }

      for (UUID var15 : var4) {
         for (ServerPlayerEntity var20 : this.getPlayers()) {
            if (var20.getUniqueID().equals(var15)) {
               this.removePlayer(var20);
               break;
            }
         }

         this.field19626.remove(var15);
      }

      for (ServerPlayerEntity var16 : var5) {
         this.addPlayer(var16);
      }

      return !var4.isEmpty() || !var5.isEmpty();
   }

   public CompoundNBT method12273() {
      CompoundNBT var3 = new CompoundNBT();
      var3.putString("Name", ITextComponent$Serializer.toJson(this.field19634));
      var3.putBoolean("Visible", this.isVisible());
      var3.putInt("Value", this.field19627);
      var3.putInt("Max", this.field19628);
      var3.putString("Color", this.getColor().getName());
      var3.putString("Overlay", this.getOverlay().getName());
      var3.putBoolean("DarkenScreen", this.shouldDarkenSky());
      var3.putBoolean("PlayBossMusic", this.shouldPlayEndBossMusic());
      var3.putBoolean("CreateWorldFog", this.shouldCreateFog());
      ListNBT var4 = new ListNBT();

      for (UUID var6 : this.field19626) {
         var4.add(NBTUtil.valueOf(var6));
      }

      var3.put("Players", var4);
      return var3;
   }

   public static Class3623 method12274(CompoundNBT var0, ResourceLocation var1) {
      Class3623 var4 = new Class3623(var1, ITextComponent$Serializer.getComponentFromJson(var0.getString("Name")));
      var4.setVisible(var0.getBoolean("Visible"));
      var4.method12269(var0.getInt("Value"));
      var4.method12270(var0.getInt("Max"));
      var4.setColor(BossInfo.Color.byName(var0.getString("Color")));
      var4.setOverlay(BossInfo.Overlay.byName(var0.getString("Overlay")));
      var4.setDarkenSky(var0.getBoolean("DarkenScreen"));
      var4.setPlayEndBossMusic(var0.getBoolean("PlayBossMusic"));
      var4.setCreateFog(var0.getBoolean("CreateWorldFog"));
      ListNBT var5 = var0.getList("Players", 11);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         var4.method12264(NBTUtil.readUniqueID(var5.get(var6)));
      }

      return var4;
   }

   public void method12275(ServerPlayerEntity var1) {
      if (this.field19626.contains(var1.getUniqueID())) {
         this.addPlayer(var1);
      }
   }

   public void method12276(ServerPlayerEntity var1) {
      super.removePlayer(var1);
   }
}
