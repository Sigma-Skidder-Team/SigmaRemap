package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9278 {
   private static final Logger field42666 = LogManager.getLogger();
   private final ServerWorld field42667;
   private final Entity field42668;
   private final int field42669;
   private final boolean field42670;
   private final Consumer<Packet<?>> field42671;
   private long field42672;
   private long field42673;
   private long field42674;
   private int field42675;
   private int field42676;
   private int field42677;
   private Vector3d field42678 = Vector3d.ZERO;
   private int field42679;
   private int field42680;
   private List<Entity> field42681 = Collections.<Entity>emptyList();
   private boolean field42682;
   private boolean field42683;

   public Class9278(ServerWorld var1, Entity var2, int var3, boolean var4, Consumer<Packet<?>> var5) {
      this.field42667 = var1;
      this.field42671 = var5;
      this.field42668 = var2;
      this.field42669 = var3;
      this.field42670 = var4;
      this.method34974();
      this.field42675 = MathHelper.method37767(var2.rotationYaw * 256.0F / 360.0F);
      this.field42676 = MathHelper.method37767(var2.rotationPitch * 256.0F / 360.0F);
      this.field42677 = MathHelper.method37767(var2.method3142() * 256.0F / 360.0F);
      this.field42683 = var2.method3226();
   }

   public void method34969() {
      List var3 = this.field42668.method3408();
      if (!var3.equals(this.field42681)) {
         this.field42681 = var3;
         this.field42671.accept(new SSetPassengersPacket(this.field42668));
      }

      if (this.field42668 instanceof ItemFrameEntity && this.field42679 % 10 == 0) {
         ItemFrameEntity var4 = (ItemFrameEntity)this.field42668;
         ItemStack var5 = var4.method4090();
         if (var5.getItem() instanceof Class3316) {
            Class7529 var6 = Class3316.method11861(var5, this.field42667);

            for (ServerPlayerEntity var8 : this.field42667.method6870()) {
               var6.method24594(var8, var5);
               Packet var9 = ((Class3316)var5.getItem()).method11858(var5, this.field42667, var8);
               if (var9 != null) {
                  var8.field4855.sendPacket(var9);
               }
            }
         }

         this.method34973();
      }

      if (this.field42679 % this.field42669 == 0 || this.field42668.isAirBorne || this.field42668.method3210().method35447()) {
         if (!this.field42668.isPassenger()) {
            this.field42680++;
            int var22 = MathHelper.method37767(this.field42668.rotationYaw * 256.0F / 360.0F);
            int var25 = MathHelper.method37767(this.field42668.rotationPitch * 256.0F / 360.0F);
            Vector3d var27 = this.field42668.getPositionVec().method11336(SEntityPacket.method17232(this.field42672, this.field42673, this.field42674));
            boolean var28 = var27.method11349() >= 7.6293945E-6F;
            Object var29 = null;
            boolean var30 = var28 || this.field42679 % 60 == 0;
            boolean var10 = Math.abs(var22 - this.field42675) >= 1 || Math.abs(var25 - this.field42676) >= 1;
            if (this.field42679 > 0 || this.field42668 instanceof AbstractArrowEntity) {
               long var11 = SEntityPacket.method17229(var27.x);
               long var13 = SEntityPacket.method17229(var27.y);
               long var15 = SEntityPacket.method17229(var27.z);
               boolean var17 = var11 < -32768L || var11 > 32767L || var13 < -32768L || var13 > 32767L || var15 < -32768L || var15 > 32767L;
               if (var17 || this.field42680 > 400 || this.field42682 || this.field42683 != this.field42668.method3226()) {
                  this.field42683 = this.field42668.method3226();
                  this.field42680 = 0;
                  var29 = new SEntityTeleportPacket(this.field42668);
               } else if ((!var30 || !var10) && !(this.field42668 instanceof AbstractArrowEntity)) {
                  if (!var30) {
                     if (var10) {
                        var29 = new SEntityPacket.LookPacket(this.field42668.getEntityId(), (byte)var22, (byte)var25, this.field42668.method3226());
                     }
                  } else {
                     var29 = new SEntityPacket.RelativeMovePacket(
                        this.field42668.getEntityId(), (short)((int)var11), (short)((int)var13), (short)((int)var15), this.field42668.method3226()
                     );
                  }
               } else {
                  var29 = new SEntityPacket.MovePacket(
                     this.field42668.getEntityId(),
                     (short)((int)var11),
                     (short)((int)var13),
                     (short)((int)var15),
                     (byte)var22,
                     (byte)var25,
                     this.field42668.method3226()
                  );
               }
            }

            if ((this.field42670 || this.field42668.isAirBorne || this.field42668 instanceof LivingEntity && ((LivingEntity)this.field42668).method3165())
               && this.field42679 > 0) {
               Vector3d var18 = this.field42668.getVec();
               double var19 = var18.method11342(this.field42678);
               if (var19 > 1.0E-7 || var19 > 0.0 && var18.method11349() == 0.0) {
                  this.field42678 = var18;
                  this.field42671.accept(new SEntityVelocityPacket(this.field42668.getEntityId(), this.field42678));
               }
            }

            if (var29 != null) {
               this.field42671.accept((Packet<?>)var29);
            }

            this.method34973();
            if (var30) {
               this.method34974();
            }

            if (var10) {
               this.field42675 = var22;
               this.field42676 = var25;
            }

            this.field42682 = false;
         } else {
            int var21 = MathHelper.method37767(this.field42668.rotationYaw * 256.0F / 360.0F);
            int var24 = MathHelper.method37767(this.field42668.rotationPitch * 256.0F / 360.0F);
            boolean var26 = Math.abs(var21 - this.field42675) >= 1 || Math.abs(var24 - this.field42676) >= 1;
            if (var26) {
               this.field42671.accept(new SEntityPacket.LookPacket(this.field42668.getEntityId(), (byte)var21, (byte)var24, this.field42668.method3226()));
               this.field42675 = var21;
               this.field42676 = var24;
            }

            this.method34974();
            this.method34973();
            this.field42682 = true;
         }

         int var23 = MathHelper.method37767(this.field42668.method3142() * 256.0F / 360.0F);
         if (Math.abs(var23 - this.field42677) >= 1) {
            this.field42671.accept(new SEntityHeadLookPacket(this.field42668, (byte)var23));
            this.field42677 = var23;
         }

         this.field42668.isAirBorne = false;
      }

      this.field42679++;
      if (this.field42668.velocityChanged) {
         this.method34976(new SEntityVelocityPacket(this.field42668));
         this.field42668.velocityChanged = false;
      }
   }

   public void method34970(ServerPlayerEntity var1) {
      this.field42668.method3401(var1);
      var1.method2811(this.field42668);
   }

   public void method34971(ServerPlayerEntity var1) {
      this.method34972(var1.field4855::sendPacket);
      this.field42668.method3400(var1);
      var1.method2812(this.field42668);
   }

   public void method34972(Consumer<Packet<?>> var1) {
      if (this.field42668.removed) {
         field42666.warn("Fetching packet for removed entity " + this.field42668);
      }

      Packet var4 = this.field42668.method2835();
      this.field42677 = MathHelper.method37767(this.field42668.method3142() * 256.0F / 360.0F);
      var1.accept(var4);
      if (!this.field42668.method3210().method35456()) {
         var1.accept(new SEntityMetadataPacket(this.field42668.getEntityId(), this.field42668.method3210(), true));
      }

      boolean var5 = this.field42670;
      if (this.field42668 instanceof LivingEntity) {
         Collection var6 = ((LivingEntity)this.field42668).method3088().method33379();
         if (!var6.isEmpty()) {
            var1.accept(new SEntityPropertiesPacket(this.field42668.getEntityId(), var6));
         }

         if (((LivingEntity)this.field42668).method3165()) {
            var5 = true;
         }
      }

      this.field42678 = this.field42668.getVec();
      if (var5 && !(var4 instanceof SSpawnMobPacket)) {
         var1.accept(new SEntityVelocityPacket(this.field42668.getEntityId(), this.field42678));
      }

      if (this.field42668 instanceof LivingEntity) {
         ArrayList var12 = Lists.newArrayList();

         for (Class2106 var10 : Class2106.values()) {
            ItemStack var11 = ((LivingEntity)this.field42668).method2943(var10);
            if (!var11.isEmpty()) {
               var12.add(Pair.of(var10, var11.copy()));
            }
         }

         if (!var12.isEmpty()) {
            var1.accept(new SEntityEquipmentPacket(this.field42668.getEntityId(), var12));
         }
      }

      if (this.field42668 instanceof LivingEntity) {
         LivingEntity var13 = (LivingEntity)this.field42668;

         for (Class2023 var16 : var13.method3031()) {
            var1.accept(new SPlayEntityEffectPacket(this.field42668.getEntityId(), var16));
         }
      }

      if (!this.field42668.method3408().isEmpty()) {
         var1.accept(new SSetPassengersPacket(this.field42668));
      }

      if (this.field42668.isPassenger()) {
         var1.accept(new SSetPassengersPacket(this.field42668.getRidingEntity()));
      }

      if (this.field42668 instanceof Class1006) {
         Class1006 var14 = (Class1006)this.field42668;
         if (var14.method4296()) {
            var1.accept(new SMountEntityPacket(var14, var14.method4297()));
         }
      }
   }

   private void method34973() {
      EntityDataManager var3 = this.field42668.method3210();
      if (var3.method35447()) {
         this.method34976(new SEntityMetadataPacket(this.field42668.getEntityId(), var3, false));
      }

      if (this.field42668 instanceof LivingEntity) {
         Set var4 = ((LivingEntity)this.field42668).method3088().method33378();
         if (!var4.isEmpty()) {
            this.method34976(new SEntityPropertiesPacket(this.field42668.getEntityId(), var4));
         }

         var4.clear();
      }
   }

   private void method34974() {
      this.field42672 = SEntityPacket.method17229(this.field42668.getPosX());
      this.field42673 = SEntityPacket.method17229(this.field42668.getPosY());
      this.field42674 = SEntityPacket.method17229(this.field42668.getPosZ());
   }

   public Vector3d method34975() {
      return SEntityPacket.method17232(this.field42672, this.field42673, this.field42674);
   }

   private void method34976(Packet<?> var1) {
      this.field42671.accept(var1);
      if (this.field42668 instanceof ServerPlayerEntity) {
         ((ServerPlayerEntity)this.field42668).field4855.sendPacket(var1);
      }
   }
}
