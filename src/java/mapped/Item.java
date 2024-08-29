package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Item implements Class3303 {
   public static final Map<Block, Item> field18732 = Maps.newHashMap();
   public static final UUID field18733 = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID field18734 = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final Random field18735 = new Random();
   public final ItemGroup field18736;
   private final Class1978 field18737;
   private final int field18738;
   private final int field18739;
   private final boolean field18740;
   private final Item field18741;
   private String field18742;
   private final Class9427 field18743;

   public static int method11701(Item var0) {
      return var0 != null ? Registry.ITEM.method9171(var0) : 0;
   }

   public static Item method11702(int var0) {
      return Registry.ITEM.method9172(var0);
   }

   @Deprecated
   public static Item method11703(Block var0) {
      return field18732.getOrDefault(var0, Items.field37222);
   }

   public Item(Class5643 var1) {
      this.field18736 = Class5643.method17782(var1);
      this.field18737 = Class5643.method17783(var1);
      this.field18741 = Class5643.method17784(var1);
      this.field18739 = Class5643.method17785(var1);
      this.field18738 = Class5643.method17786(var1);
      this.field18743 = Class5643.method17787(var1);
      this.field18740 = Class5643.method17788(var1);
   }

   public void method11704(World var1, Class880 var2, ItemStack var3, int var4) {
   }

   public boolean method11705(CompoundNBT var1) {
      return false;
   }

   public boolean method11706(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      return true;
   }

   @Override
   public Item method11581() {
      return this;
   }

   public ActionResultType method11707(Class5911 var1) {
      return ActionResultType.field14820;
   }

   public float method11708(ItemStack var1, BlockState var2) {
      return 1.0F;
   }

   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      if (!this.method11744()) {
         return Class6794.<ItemStack>method20698(var2.getHeldItem(var3));
      } else {
         ItemStack var6 = var2.getHeldItem(var3);
         if (!var2.method2933(this.method11745().method36160())) {
            return Class6794.<ItemStack>method20699(var6);
         } else {
            var2.method3154(var3);
            return Class6794.<ItemStack>method20697(var6);
         }
      }
   }

   public ItemStack method11709(ItemStack var1, World var2, Class880 var3) {
      return !this.method11744() ? var1 : var3.method2984(var2, var1);
   }

   public final int method11710() {
      return this.field18738;
   }

   public final int method11711() {
      return this.field18739;
   }

   public boolean method11712() {
      return this.field18739 > 0;
   }

   public boolean method11713(ItemStack var1, Class880 var2, Class880 var3) {
      return false;
   }

   public boolean method11714(ItemStack var1, World var2, BlockState var3, BlockPos var4, Class880 var5) {
      return false;
   }

   public boolean method11715(BlockState var1) {
      return false;
   }

   public ActionResultType method11716(ItemStack var1, PlayerEntity var2, Class880 var3, Hand var4) {
      return ActionResultType.field14820;
   }

   public ITextComponent method11717() {
      return new TranslationTextComponent(this.getTranslationKey());
   }

   @Override
   public String toString() {
      return Registry.ITEM.getKey(this).method8292();
   }

   public String method11718() {
      if (this.field18742 == null) {
         this.field18742 = Util.method38486("item", Registry.ITEM.getKey(this));
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

   public Class2103 method11727(ItemStack var1) {
      return !var1.getItem().method11744() ? Class2103.field13706 : Class2103.field13707;
   }

   public int method11728(ItemStack var1) {
      if (!var1.getItem().method11744()) {
         return 0;
      } else {
         return !this.method11745().method36161() ? 32 : 16;
      }
   }

   public void method11729(ItemStack var1, World var2, Class880 var3, int var4) {
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
      return this.method11710() == 1 && this.method11712();
   }

   public static BlockRayTraceResult method11735(World var0, PlayerEntity var1, Class1985 var2) {
      float var5 = var1.field5032;
      float var6 = var1.field5031;
      Vector3d var7 = var1.method3286(1.0F);
      float var8 = MathHelper.cos(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var9 = MathHelper.sin(-var6 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var10 = -MathHelper.cos(-var5 * (float) (Math.PI / 180.0));
      float var11 = MathHelper.sin(-var5 * (float) (Math.PI / 180.0));
      float var12 = var9 * var10;
      float var13 = var8 * var10;
      double var14 = 5.0;
      Vector3d var16 = var7.method11339((double)var12 * 5.0, (double)var11 * 5.0, (double)var13 * 5.0);
      return var0.method7036(new Class6809(var7, var16, Class2271.field14775, var2, var1));
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

   public Multimap<Class4869, Class9689> method11740(Class2106 var1) {
      return ImmutableMultimap.of();
   }

   public boolean method11741(ItemStack var1) {
      return var1.getItem() == Items.field38148;
   }

   public ItemStack method11742() {
      return new ItemStack(this);
   }

   public boolean method11743(Class7608<Item> var1) {
      return var1.method24917(this);
   }

   public boolean method11744() {
      return this.field18743 != null;
   }

   @Nullable
   public Class9427 method11745() {
      return this.field18743;
   }

   public Class9455 method11746() {
      return Class6067.field26608;
   }

   public Class9455 method11747() {
      return Class6067.field26609;
   }

   public boolean method11748() {
      return this.field18740;
   }

   public boolean method11749(Class8654 var1) {
      return !this.field18740 || !var1.method31141();
   }
}
