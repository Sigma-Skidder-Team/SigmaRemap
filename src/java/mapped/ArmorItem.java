package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

public class ArmorItem extends Item implements Class3255 {
   private static final UUID[] ARMOR_MODIFIERS = new UUID[]{
      UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
      UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
      UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
      UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
   };
   public static final IDispenseItemBehavior DISPENSER_BEHAVIOR = new DefaultDispenseItemBehavior();
   public final EquipmentSlotType slot;
   public final int damageReduceAmount;
   private final float toughness;
   public final float knockbackResistance;
   public final Class2115 material;
   private final Multimap<Attribute, AttributeModifier> field_234656_m_;

   public static boolean func_226626_a_(IBlockSource var0, ItemStack var1) {
      BlockPos var4 = var0.method11323().method8349(var0.method11324().<Direction>method23463(Class3357.field18899));
      List var5 = var0.method11326().<Entity>getEntitiesInAABBexcluding(LivingEntity.class, new AxisAlignedBB(var4), Class8088.field34763.and(new Class165(var1)));
      if (!var5.isEmpty()) {
         LivingEntity var6 = (LivingEntity)var5.get(0);
         EquipmentSlotType var7 = MobEntity.method4271(var1);
         ItemStack var8 = var1.split(1);
         var6.setItemStackToSlot(var7, var8);
         if (var6 instanceof MobEntity) {
            ((MobEntity)var6).method4279(var7, 2.0F);
            ((MobEntity)var6).method4278();
         }

         return true;
      } else {
         return false;
      }
   }

   public ArmorItem(Class2115 var1, EquipmentSlotType var2, Properties var3) {
      super(var3.method17776(var1.method8785(var2)));
      this.material = var1;
      this.slot = var2;
      this.damageReduceAmount = var1.method8786(var2);
      this.toughness = var1.method8791();
      this.knockbackResistance = var1.method8792();
      Class3357.method11931(this, DISPENSER_BEHAVIOR);
      Builder var6 = ImmutableMultimap.builder();
      UUID var7 = ARMOR_MODIFIERS[var2.getIndex()];
      var6.put(Attributes.field42113, new AttributeModifier(var7, "Armor modifier", (double)this.damageReduceAmount, AttributeModifier.Operation.ADDITION));
      var6.put(Attributes.field42114, new AttributeModifier(var7, "Armor toughness", (double)this.toughness, AttributeModifier.Operation.ADDITION));
      if (var1 == Class2114.field13779) {
         var6.put(Attributes.field42107, new AttributeModifier(var7, "Armor knockback resistance", (double)this.knockbackResistance, AttributeModifier.Operation.ADDITION));
      }

      this.field_234656_m_ = var6.build();
   }

   public EquipmentSlotType getType() {
      return this.slot;
   }

   @Override
   public int method11736() {
      return this.material.method8787();
   }

   public Class2115 getArmorMaterial() {
      return this.material;
   }

   @Override
   public boolean method11699(ItemStack var1, ItemStack var2) {
      return this.material.method8789().test(var2) || super.method11699(var1, var2);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      EquipmentSlotType var7 = MobEntity.method4271(var6);
      ItemStack var8 = var2.getItemStackFromSlot(var7);
      if (!var8.isEmpty()) {
         return Class6794.<ItemStack>method20699(var6);
      } else {
         var2.setItemStackToSlot(var7, var6.copy());
         var6.setCount(0);
         return Class6794.<ItemStack>method20700(var6, var1.isRemote());
      }
   }

   @Override
   public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType var1) {
      return var1 != this.slot ? super.getAttributeModifiers(var1) : this.field_234656_m_;
   }

   public int method11807() {
      return this.damageReduceAmount;
   }

   public float method11808() {
      return this.toughness;
   }
}
