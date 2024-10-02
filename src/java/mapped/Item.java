package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Item implements IItemProvider {
   public static final Map<Block, Item> field18732 = Maps.newHashMap();
   public static final UUID ATTACK_DAMAGE_MODIFIER = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID ATTACK_SPEED_MODIFIER = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final Random field18735 = new Random();
   public final ItemGroup field18736;
   private final Class1978 field18737;
   private final int maxStackSize;
   private final int maxDamage;
   private final boolean field18740;
   private final Item field18741;
   private String field18742;
   private final Class9427 field18743;

   public static int method11701(Item var0) {
      return var0 != null ? Registry.ITEM.getId(var0) : 0;
   }

   public static Item method11702(int var0) {
      return Registry.ITEM.getByValue(var0);
   }

   @Deprecated
   public static Item method11703(Block var0) {
      return field18732.getOrDefault(var0, Items.AIR);
   }

   public Item(Properties var1) {
      this.field18736 = Properties.method17782(var1);
      this.field18737 = Properties.method17783(var1);
      this.field18741 = Properties.method17784(var1);
      this.maxDamage = Properties.method17785(var1);
      this.maxStackSize = Properties.method17786(var1);
      this.field18743 = Properties.method17787(var1);
      this.field18740 = Properties.method17788(var1);
   }

   public void method11704(World var1, LivingEntity var2, ItemStack var3, int var4) {
   }

   public boolean method11705(CompoundNBT var1) {
      return false;
   }

   public boolean canPlayerBreakBlockWhileHolding(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      return true;
   }

   @Override
   public Item method11581() {
      return this;
   }

   public ActionResultType method11707(ItemUseContext var1) {
      return ActionResultType.field14820;
   }

   public float getDestroySpeed(ItemStack var1, BlockState var2) {
      return 1.0F;
   }

   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      if (!this.isFood()) {
         return Class6794.<ItemStack>method20698(var2.getHeldItem(var3));
      } else {
         ItemStack var6 = var2.getHeldItem(var3);
         if (!var2.method2933(this.method11745().method36160())) {
            return Class6794.<ItemStack>method20699(var6);
         } else {
            var2.setActiveHand(var3);
            return Class6794.<ItemStack>method20697(var6);
         }
      }
   }

   public ItemStack onItemUseFinish(ItemStack var1, World var2, LivingEntity var3) {
      return !this.isFood() ? var1 : var3.onFoodEaten(var2, var1);
   }

   public final int getMaxStackSize() {
      return this.maxStackSize;
   }

   public final int getMaxDamage() {
      return this.maxDamage;
   }

   public boolean isDamageable() {
      return this.maxDamage > 0;
   }

   public boolean hitEntity(ItemStack var1, LivingEntity var2, LivingEntity var3) {
      return false;
   }

   public boolean onBlockDestroyed(ItemStack var1, World var2, BlockState var3, BlockPos var4, LivingEntity var5) {
      return false;
   }

   public boolean canHarvestBlock(BlockState var1) {
      return false;
   }

   public ActionResultType method11716(ItemStack var1, PlayerEntity var2, LivingEntity var3, Hand var4) {
      return ActionResultType.field14820;
   }

   public ITextComponent method11717() {
      return new TranslationTextComponent(this.getTranslationKey());
   }

   @Override
   public String toString() {
      return Registry.ITEM.getKey(this).getPath();
   }

   public String method11718() {
      if (this.field18742 == null) {
         this.field18742 = Util.makeTranslationKey("item", Registry.ITEM.getKey(this));
      }

      return this.field18742;
   }

   public String getTranslationKey() {
      return this.method11718();
   }

   public String method11720(ItemStack var1) {
      return this.getTranslationKey();
   }

   public boolean method11721() {
      return true;
   }

   @Nullable
   public final Item method11722() {
      return this.field18741;
   }

   public boolean method11723() {
      return this.field18741 != null;
   }

   public void method11724(ItemStack var1, World var2, Entity var3, int var4, boolean var5) {
   }

   public void method11725(ItemStack var1, World var2, PlayerEntity var3) {
   }

   public boolean method11726() {
      return false;
   }

   public UseAction method11727(ItemStack var1) {
      return !var1.getItem().isFood() ? UseAction.field13706 : UseAction.field13707;
   }

   public int method11728(ItemStack var1) {
      if (!var1.getItem().isFood()) {
         return 0;
      } else {
         return !this.method11745().method36161() ? 32 : 16;
      }
   }

   public void method11729(ItemStack var1, World var2, LivingEntity var3, int var4) {
   }

   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
   }

   public ITextComponent method11731(ItemStack var1) {
      return new TranslationTextComponent(this.method11720(var1));
   }

   public boolean method11732(ItemStack var1) {
      return var1.method32163();
   }

   public Class1978 method11733(ItemStack var1) {
      if (!var1.method32163()) {
         return this.field18737;
      } else {
         switch (Class9591.field44867[this.field18737.ordinal()]) {
            case 1:
            case 2:
               return Class1978.field12887;
            case 3:
               return Class1978.field12888;
            case 4:
            default:
               return this.field18737;
         }
      }
   }

   public boolean method11734(ItemStack var1) {
      return this.getMaxStackSize() == 1 && this.isDamageable();
   }

   public static BlockRayTraceResult method11735(World var0, PlayerEntity var1, RayTraceContext.FluidMode var2) {
      float var5 = var1.rotationPitch;
      float var6 = var1.rotationYaw;
      Vector3d var7 = var1.getEyePosition(1.0F);
      float var8 = MathHelper.cos(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var9 = MathHelper.sin(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var10 = -MathHelper.cos(-var5 * (float) (Math.PI / 180.0));
      float var11 = MathHelper.sin(-var5 * (float) (Math.PI / 180.0));
      float var12 = var9 * var10;
      float var13 = var8 * var10;
      double var14 = 5.0;
      Vector3d var16 = var7.add((double)var12 * 5.0, (double)var11 * 5.0, (double)var13 * 5.0);
      return var0.rayTraceBlocks(new RayTraceContext(var7, var16, RayTraceContext.BlockMode.OUTLINE, var2, var1));
   }

   public int method11736() {
      return 0;
   }

   public void fillItemGroup(ItemGroup var1, NonNullList<ItemStack> var2) {
      if (this.method11738(var1)) {
         var2.add(new ItemStack(this));
      }
   }

   public boolean method11738(ItemGroup var1) {
      ItemGroup var4 = this.method11739();
      return var4 != null && (var1 == ItemGroup.SEARCH || var1 == var4);
   }

   @Nullable
   public final ItemGroup method11739() {
      return this.field18736;
   }

   public boolean method11699(ItemStack var1, ItemStack var2) {
      return false;
   }

   public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType var1) {
      return ImmutableMultimap.of();
   }

   public boolean method11741(ItemStack var1) {
      return var1.getItem() == Items.CROSSBOW;
   }

   public ItemStack method11742() {
      return new ItemStack(this);
   }

   public boolean method11743(ITag<Item> var1) {
      return var1.method24917(this);
   }

   public boolean isFood() {
      return this.field18743 != null;
   }

   @Nullable
   public Class9427 method11745() {
      return this.field18743;
   }

   public SoundEvent method11746() {
      return SoundEvents.field26608;
   }

   public SoundEvent method11747() {
      return SoundEvents.field26609;
   }

   public boolean method11748() {
      return this.field18740;
   }

   public boolean method11749(DamageSource var1) {
      return !this.field18740 || !var1.method31141();
   }

   public static class Properties {
      private int field24956 = 64;
      private int field24957;
      private Item field24958;
      private ItemGroup field24959;
      private Class1978 field24960 = Class1978.field12885;
      private Class9427 field24961;
      private boolean field24962;

      public Properties method17774(Class9427 var1) {
         this.field24961 = var1;
         return this;
      }

      public Properties method17775(int var1) {
         if (this.field24957 <= 0) {
            this.field24956 = var1;
            return this;
         } else {
            throw new RuntimeException("Unable to have damage AND stack.");
         }
      }

      public Properties method17776(int var1) {
         return this.field24957 != 0 ? this : this.method17777(var1);
      }

      public Properties method17777(int var1) {
         this.field24957 = var1;
         this.field24956 = 1;
         return this;
      }

      public Properties method17778(Item var1) {
         this.field24958 = var1;
         return this;
      }

      public Properties method17779(ItemGroup var1) {
         this.field24959 = var1;
         return this;
      }

      public Properties method17780(Class1978 var1) {
         this.field24960 = var1;
         return this;
      }

      public Properties method17781() {
         this.field24962 = true;
         return this;
      }

      // $VF: synthetic method
      public static ItemGroup method17782(Properties var0) {
         return var0.field24959;
      }

      // $VF: synthetic method
      public static Class1978 method17783(Properties var0) {
         return var0.field24960;
      }

      // $VF: synthetic method
      public static Item method17784(Properties var0) {
         return var0.field24958;
      }

      // $VF: synthetic method
      public static int method17785(Properties var0) {
         return var0.field24957;
      }

      // $VF: synthetic method
      public static int method17786(Properties var0) {
         return var0.field24956;
      }

      // $VF: synthetic method
      public static Class9427 method17787(Properties var0) {
         return var0.field24961;
      }

      // $VF: synthetic method
      public static boolean method17788(Properties var0) {
         return var0.field24962;
      }
   }
}
