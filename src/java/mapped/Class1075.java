package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;

import javax.annotation.Nullable;

public class Class1075 extends AbstractHorseEntity {
   private static String[] field5918;

   public Class1075(EntityType<? extends Class1075> var1, World var2) {
      super(var1, var2);
   }

   public static Class7037 method4998() {
      return method4951().method21849(Attributes.field42105, 15.0).method21849(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   @Override
   public void method4925() {
      this.method3085(Attributes.field42117).method38661(this.method4972());
   }

   @Override
   public Class7809 method3089() {
      return Class7809.field33506;
   }

   @Override
   public SoundEvent method4241() {
      super.method4241();
      return Sounds.field27289;
   }

   @Override
   public SoundEvent method2880() {
      super.method2880();
      return Sounds.field27290;
   }

   @Override
   public SoundEvent method2879(Class8654 var1) {
      super.method2879(var1);
      return Sounds.field27291;
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return EntityType.field41108.method33215(var1);
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (this.method4932()) {
         if (!this.method3005()) {
            if (!var1.method2851()) {
               if (!this.isBeingRidden()) {
                  if (!var5.isEmpty()) {
                     if (var5.getItem() == Items.field37886 && !this.method4943()) {
                        this.openGUI(var1);
                        return ActionResultType.method9002(this.world.isRemote);
                     }

                     ActionResultType var6 = var5.method32125(var1, this, var2);
                     if (var6.isSuccessOrConsume()) {
                        return var6;
                     }
                  }

                  this.method4920(var1);
                  return ActionResultType.method9002(this.world.isRemote);
               } else {
                  return super.method4285(var1, var2);
               }
            } else {
               this.openGUI(var1);
               return ActionResultType.method9002(this.world.isRemote);
            }
         } else {
            return super.method4285(var1, var2);
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public void method4929() {
   }
}
