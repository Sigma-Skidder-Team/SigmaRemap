package mapped;

import javax.annotation.Nullable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8652 extends Class8654 {
   public final Entity field38989;
   private boolean field38990;

   public Class8652(String var1, Entity var2) {
      super(var1);
      this.field38989 = var2;
   }

   public Class8652 method31107() {
      this.field38990 = true;
      return this;
   }

   public boolean method31108() {
      return this.field38990;
   }

   @Nullable
   @Override
   public Entity method31109() {
      return this.field38989;
   }

   @Override
   public ITextComponent method31110(LivingEntity var1) {
      ItemStack var4 = !(this.field38989 instanceof LivingEntity) ? ItemStack.EMPTY : ((LivingEntity)this.field38989).getHeldItemMainhand();
      String var5 = "death.attack." + this.field39022;
      return !var4.isEmpty() && var4.method32152()
         ? new TranslationTextComponent(var5 + ".item", var1.getDisplayName(), this.field38989.getDisplayName(), var4.method32173())
         : new TranslationTextComponent(var5, var1.getDisplayName(), this.field38989.getDisplayName());
   }

   @Override
   public boolean method31111() {
      return this.field38989 != null && this.field38989 instanceof LivingEntity && !(this.field38989 instanceof PlayerEntity);
   }

   @Nullable
   @Override
   public Vector3d method31112() {
      return this.field38989 == null ? null : this.field38989.getPositionVec();
   }

   @Override
   public String toString() {
      return "EntityDamageSource (" + this.field38989 + ")";
   }
}
