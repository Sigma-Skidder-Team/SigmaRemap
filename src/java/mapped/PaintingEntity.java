package mapped;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.server.SSpawnPaintingPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Iterator;

public class PaintingEntity extends Class995 {
   public Class9078 field5496;

   public PaintingEntity(EntityType<? extends PaintingEntity> var1, World var2) {
      super(var1, var2);
   }

   public PaintingEntity(World var1, BlockPos var2, Direction var3) {
      super(EntityType.PAINTING, var1, var2);
      ArrayList var6 = Lists.newArrayList();
      int var7 = 0;

      for (Class9078 var9 : Registry.field16079) {
         this.field5496 = var9;
         this.method4077(var3);
         if (this.method4080()) {
            var6.add(var9);
            int var10 = var9.method33825() * var9.method33826();
            if (var10 > var7) {
               var7 = var10;
            }
         }
      }

      if (!var6.isEmpty()) {
         Iterator var11 = var6.iterator();

         while (var11.hasNext()) {
            Class9078 var12 = (Class9078)var11.next();
            if (var12.method33825() * var12.method33826() < var7) {
               var11.remove();
            }
         }

         this.field5496 = (Class9078)var6.get(this.rand.nextInt(var6.size()));
      }

      this.method4077(var3);
   }

   public PaintingEntity(World var1, BlockPos var2, Direction var3, Class9078 var4) {
      this(var1, var2, var3);
      this.field5496 = var4;
      this.method4077(var3);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      var1.method109("Motive", Registry.field16079.getKey(this.field5496).toString());
      var1.method100("Facing", (byte)this.field5489.getHorizontalIndex());
      super.writeAdditional(var1);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      this.field5496 = Registry.field16079.getOrDefault(ResourceLocation.method8289(var1.getString("Motive")));
      this.field5489 = Direction.byHorizontalIndex(var1.getByte("Facing"));
      super.readAdditional(var1);
      this.method4077(this.field5489);
   }

   @Override
   public int method4081() {
      return this.field5496 != null ? this.field5496.method33825() : 1;
   }

   @Override
   public int method4082() {
      return this.field5496 != null ? this.field5496.method33826() : 1;
   }

   @Override
   public void method4083(Entity var1) {
      if (this.world.getGameRules().getBoolean(GameRules.field24229)) {
         this.playSound(SoundEvents.field26867, 1.0F, 1.0F);
         if (var1 instanceof PlayerEntity) {
            PlayerEntity var4 = (PlayerEntity)var1;
            if (var4.abilities.isCreativeMode) {
               return;
            }
         }

         this.entityDropItem(Items.PAINTING);
      }
   }

   @Override
   public void method4084() {
      this.playSound(SoundEvents.field26868, 1.0F, 1.0F);
   }

   @Override
   public void setLocationAndAngles(double var1, double var3, double var5, float var7, float var8) {
      this.setPosition(var1, var3, var5);
   }

   @Override
   public void setPositionAndRotationDirect(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      BlockPos var13 = this.field5488.method8335(var1 - this.getPosX(), var3 - this.getPosY(), var5 - this.getPosZ());
      this.setPosition((double)var13.getX(), (double)var13.getY(), (double)var13.getZ());
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnPaintingPacket(this);
   }
}
