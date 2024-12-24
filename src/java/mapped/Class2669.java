package mapped;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.server.ServerWorld;

public class Class2669 extends Class2595 {
   private final Class1076 field17046;

   public Class2669(Class1076 var1) {
      this.field17046 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17046.world.method7187(this.field17046.getPosX(), this.field17046.getPosY(), this.field17046.getPosZ(), 10.0);
   }

   @Override
   public void method10805() {
      ServerWorld var3 = (ServerWorld)this.field17046.world;
      Class9755 var4 = var3.method6807(this.field17046.getPosition());
      this.field17046.method5001(false);
      this.field17046.method4936(true);
      this.field17046.method4770(0);
      Class906 var5 = EntityType.LIGHTNING_BOLT.create(var3);
      var5.moveForced(this.field17046.getPosX(), this.field17046.getPosY(), this.field17046.getPosZ());
      var5.method3549(true);
      var3.addEntity(var5);
      Class1085 var6 = this.method10887(var4, this.field17046);
      var6.method3311(this.field17046);
      var3.method6995(var6);

      for (int var7 = 0; var7 < 3; var7++) {
         AbstractHorseEntity var8 = this.method10886(var4);
         Class1085 var9 = this.method10887(var4, var8);
         var9.method3311(var8);
         var8.addVelocity(this.field17046.getRNG().nextGaussian() * 0.5, 0.0, this.field17046.getRNG().nextGaussian() * 0.5);
         var3.method6995(var8);
      }
   }

   private AbstractHorseEntity method10886(Class9755 var1) {
      Class1076 var4 = EntityType.SKELETON_HORSE.create(this.field17046.world);
      var4.method4276((ServerWorld)this.field17046.world, var1, SpawnReason.field14401, (Class5093)null, (CompoundNBT)null);
      var4.setPosition(this.field17046.getPosX(), this.field17046.getPosY(), this.field17046.getPosZ());
      var4.hurtResistantTime = 60;
      var4.method4278();
      var4.method4936(true);
      var4.method4770(0);
      return var4;
   }

   private Class1085 method10887(Class9755 var1, AbstractHorseEntity var2) {
      Class1085 var5 = EntityType.SKELETON.create(var2.world);
      var5.method4276((ServerWorld)var2.world, var1, SpawnReason.field14401, (Class5093)null, (CompoundNBT)null);
      var5.setPosition(var2.getPosX(), var2.getPosY(), var2.getPosZ());
      var5.hurtResistantTime = 60;
      var5.method4278();
      if (var5.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty()) {
         var5.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(Items.field37852));
      }

      var5.setItemStackToSlot(
         EquipmentSlotType.MAINHAND,
         EnchantmentHelper.method26342(
            var5.getRNG(), this.method10888(var5.getHeldItemMainhand()), (int)(5.0F + var1.method38330() * (float)var5.getRNG().nextInt(18)), false
         )
      );
      var5.setItemStackToSlot(
         EquipmentSlotType.HEAD,
         EnchantmentHelper.method26342(
            var5.getRNG(),
            this.method10888(var5.getItemStackFromSlot(EquipmentSlotType.HEAD)),
            (int)(5.0F + var1.method38330() * (float)var5.getRNG().nextInt(18)),
            false
         )
      );
      return var5;
   }

   private ItemStack method10888(ItemStack var1) {
      var1.method32146("Enchantments");
      return var1;
   }
}
