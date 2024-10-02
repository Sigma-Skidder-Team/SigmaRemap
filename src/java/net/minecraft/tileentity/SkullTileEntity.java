package net.minecraft.tileentity;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.server.management.PlayerProfileCache;

import javax.annotation.Nullable;
import java.util.UUID;

public class SkullTileEntity extends TileEntity implements ITickableTileEntity {
   private static PlayerProfileCache field5424;
   private static MinecraftSessionService field5425;
   private GameProfile field5426;
   private int field5427;
   private boolean field5428;

   public SkullTileEntity() {
      super(TileEntityType.field21435);
   }

   public static void setProfileCache(PlayerProfileCache var0) {
      field5424 = var0;
   }

   public static void setSessionService(MinecraftSessionService var0) {
      field5425 = var0;
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (this.field5426 != null) {
         CompoundNBT var4 = new CompoundNBT();
         Class8354.method29279(var4, this.field5426);
         var1.put("SkullOwner", var4);
      }

      return var1;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      if (!var2.contains("SkullOwner", 10)) {
         if (var2.contains("ExtraType", 8)) {
            String var5 = var2.getString("ExtraType");
            if (!Class9001.method33256(var5)) {
               this.method4006(new GameProfile((UUID)null, var5));
            }
         }
      } else {
         this.method4006(Class8354.method29278(var2.getCompound("SkullOwner")));
      }
   }

   @Override
   public void tick() {
      BlockState var3 = this.getBlockState();
      if (var3.isIn(Blocks.DRAGON_HEAD) || var3.isIn(Blocks.DRAGON_WALL_HEAD)) {
         if (!this.world.method6780(this.pos)) {
            this.field5428 = false;
         } else {
            this.field5428 = true;
            this.field5427++;
         }
      }
   }

   public float method4004(float var1) {
      return !this.field5428 ? (float)this.field5427 : (float)this.field5427 + var1;
   }

   @Nullable
   public GameProfile method4005() {
      return this.field5426;
   }

   @Nullable
   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.pos, 4, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   public void method4006(GameProfile var1) {
      this.field5426 = var1;
      this.method4007();
   }

   private void method4007() {
      this.field5426 = method4008(this.field5426);
      this.markDirty();
   }

   @Nullable
   public static GameProfile method4008(GameProfile var0) {
      if (var0 != null && !Class9001.method33256(var0.getName())) {
         if (var0.isComplete() && var0.getProperties().containsKey("textures")) {
            return var0;
         } else if (field5424 != null && field5425 != null) {
            GameProfile var3 = field5424.method31792(var0.getName());
            if (var3 != null) {
               Property var4 = (Property)Iterables.getFirst(var3.getProperties().get("textures"), (Property)null);
               if (var4 == null) {
                  var3 = field5425.fillProfileProperties(var3, true);
               }

               return var3;
            } else {
               return var0;
            }
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }
}
