package mapped;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;

public class Class3623 extends Class3624 {
   private final ResourceLocation field19625;
   private final Set<UUID> field19626 = Sets.newHashSet();
   private int field19627;
   private int field19628 = 100;

   public Class3623(ResourceLocation var1, ITextComponent var2) {
      super(var2, Class2303.field15726, Class2300.field15703);
      this.field19625 = var1;
      this.method12278(0.0F);
   }

   public ResourceLocation method12262() {
      return this.field19625;
   }

   @Override
   public void method12263(ServerPlayerEntity var1) {
      super.method12263(var1);
      this.field19626.add(var1.getUniqueID());
   }

   public void method12264(UUID var1) {
      this.field19626.add(var1);
   }

   @Override
   public void method12265(ServerPlayerEntity var1) {
      super.method12265(var1);
      this.field19626.remove(var1.getUniqueID());
   }

   @Override
   public void method12266() {
      super.method12266();
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
      this.method12278(MathHelper.clamp((float)var1 / (float)this.field19628, 0.0F, 1.0F));
   }

   public void method12270(int var1) {
      this.field19628 = var1;
      this.method12278(MathHelper.clamp((float)this.field19627 / (float)var1, 0.0F, 1.0F));
   }

   public final ITextComponent method12271() {
      return TextComponentUtils.wrapWithSquareBrackets(this.method12290())
         .modifyStyle(
            var1 -> var1.setFormatting(this.method12292().method9069())
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
         for (ServerPlayerEntity var20 : this.method12288()) {
            if (var20.getUniqueID().equals(var15)) {
               this.method12265(var20);
               break;
            }
         }

         this.field19626.remove(var15);
      }

      for (ServerPlayerEntity var16 : var5) {
         this.method12263(var16);
      }

      return !var4.isEmpty() || !var5.isEmpty();
   }

   public CompoundNBT method12273() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method109("Name", ITextComponent$Serializer.toJson(this.field19634));
      var3.putBoolean("Visible", this.method12286());
      var3.putInt("Value", this.field19627);
      var3.putInt("Max", this.field19628);
      var3.method109("Color", this.method12292().method9070());
      var3.method109("Overlay", this.method12293().method9067());
      var3.putBoolean("DarkenScreen", this.method12294());
      var3.putBoolean("PlayBossMusic", this.method12295());
      var3.putBoolean("CreateWorldFog", this.method12296());
      ListNBT var4 = new ListNBT();

      for (UUID var6 : this.field19626) {
         var4.add(Class8354.method29281(var6));
      }

      var3.put("Players", var4);
      return var3;
   }

   public static Class3623 method12274(CompoundNBT var0, ResourceLocation var1) {
      Class3623 var4 = new Class3623(var1, ITextComponent$Serializer.func_240643_a_(var0.getString("Name")));
      var4.method12287(var0.getBoolean("Visible"));
      var4.method12269(var0.getInt("Value"));
      var4.method12270(var0.getInt("Max"));
      var4.method12279(Class2303.method9071(var0.getString("Color")));
      var4.method12280(Class2300.method9068(var0.getString("Overlay")));
      var4.method12281(var0.getBoolean("DarkenScreen"));
      var4.method12282(var0.getBoolean("PlayBossMusic"));
      var4.method12283(var0.getBoolean("CreateWorldFog"));
      ListNBT var5 = var0.method131("Players", 11);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         var4.method12264(Class8354.method29282(var5.get(var6)));
      }

      return var4;
   }

   public void method12275(ServerPlayerEntity var1) {
      if (this.field19626.contains(var1.getUniqueID())) {
         this.method12263(var1);
      }
   }

   public void method12276(ServerPlayerEntity var1) {
      super.method12265(var1);
   }
}
