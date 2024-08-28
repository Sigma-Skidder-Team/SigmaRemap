package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class Class924 extends Class932 implements Class930, Class923, Class925, Class935 {
   private static final int[] field5244 = new int[]{0};
   private static final int[] field5245 = new int[]{2, 1};
   private static final int[] field5246 = new int[]{1};
   public Class25<ItemStack> field5247 = Class25.<ItemStack>method68(3, ItemStack.EMPTY);
   private int field5248;
   private int field5249;
   private int field5250;
   private int field5251;
   public final Class8202 field5252 = new Class8204(this);
   private final Object2IntOpenHashMap<ResourceLocation> field5253 = new Object2IntOpenHashMap();
   public final Class7207<? extends Class4847> field5254;

   public Class924(Class4387<?> var1, Class7207<? extends Class4847> var2) {
      super(var1);
      this.field5254 = var2;
   }

   public static Map<Class3257, Integer> method3640() {
      LinkedHashMap var2 = Maps.newLinkedHashMap();
      method3643(var2, Class8514.field37884, 20000);
      method3643(var2, Blocks.field36795, 16000);
      method3643(var2, Class8514.field37967, 2400);
      method3643(var2, Class8514.field37798, 1600);
      method3643(var2, Class8514.field37799, 1600);
      method3642(var2, Class5985.field26085, 300);
      method3642(var2, Class5985.field26071, 300);
      method3642(var2, Class5985.field26077, 300);
      method3642(var2, Class5985.field26078, 150);
      method3642(var2, Class5985.field26081, 300);
      method3642(var2, Class5985.field26080, 300);
      method3643(var2, Blocks.OAK_FENCE, 300);
      method3643(var2, Blocks.field36868, 300);
      method3643(var2, Blocks.field36867, 300);
      method3643(var2, Blocks.field36869, 300);
      method3643(var2, Blocks.field36871, 300);
      method3643(var2, Blocks.field36870, 300);
      method3643(var2, Blocks.OAK_FENCE_GATE, 300);
      method3643(var2, Blocks.field36863, 300);
      method3643(var2, Blocks.field36862, 300);
      method3643(var2, Blocks.field36864, 300);
      method3643(var2, Blocks.field36866, 300);
      method3643(var2, Blocks.field36865, 300);
      method3643(var2, Blocks.NOTE_BLOCK, 300);
      method3643(var2, Blocks.field36525, 300);
      method3643(var2, Blocks.field37061, 300);
      method3643(var2, Blocks.JUKEBOX, 300);
      method3643(var2, Blocks.CHEST, 300);
      method3643(var2, Blocks.TRAPPED_CHEST, 300);
      method3643(var2, Blocks.CRAFTING_TABLE, 300);
      method3643(var2, Blocks.field36720, 300);
      method3642(var2, Class5985.field26094, 300);
      method3643(var2, Class8514.field37796, 300);
      method3643(var2, Class8514.field37906, 300);
      method3643(var2, Blocks.LADDER, 300);
      method3642(var2, Class5985.field26115, 200);
      method3643(var2, Class8514.field37806, 200);
      method3643(var2, Class8514.field37805, 200);
      method3643(var2, Class8514.field37809, 200);
      method3643(var2, Class8514.field37808, 200);
      method3643(var2, Class8514.field37807, 200);
      method3642(var2, Class5985.field26076, 200);
      method3642(var2, Class5985.field26113, 1200);
      method3642(var2, Class5985.field26070, 100);
      method3642(var2, Class5985.field26073, 100);
      method3643(var2, Class8514.field37835, 100);
      method3642(var2, Class5985.field26083, 100);
      method3643(var2, Class8514.field37836, 100);
      method3642(var2, Class5985.field26075, 67);
      method3643(var2, Blocks.field36963, 4001);
      method3643(var2, Class8514.field38148, 300);
      method3643(var2, Blocks.field37009, 50);
      method3643(var2, Blocks.DEAD_BUSH, 100);
      method3643(var2, Blocks.field37053, 400);
      method3643(var2, Blocks.field37054, 300);
      method3643(var2, Blocks.field37055, 300);
      method3643(var2, Blocks.field37058, 300);
      method3643(var2, Blocks.field37059, 300);
      method3643(var2, Blocks.field37062, 300);
      method3643(var2, Blocks.field37115, 300);
      return var2;
   }

   private static boolean method3641(Class3257 var0) {
      return Class5985.field26111.method24917(var0);
   }

   private static void method3642(Map<Class3257, Integer> var0, Class7608<Class3257> var1, int var2) {
      for (Class3257 var6 : var1.method24918()) {
         if (!method3641(var6)) {
            var0.put(var6, var2);
         }
      }
   }

   private static void method3643(Map<Class3257, Integer> var0, Class3303 var1, int var2) {
      Class3257 var5 = var1.method11581();
      if (!method3641(var5)) {
         var0.put(var5, var2);
      } else if (SharedConstants.field42545) {
         throw (IllegalStateException) Util.method38516(
            new IllegalStateException(
               "A developer tried to explicitly make fire resistant item "
                  + var5.method11731((ItemStack)null).getString()
                  + " a furnace fuel. That will not work!"
            )
         );
      }
   }

   private boolean method3644() {
      return this.field5248 > 0;
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5247 = Class25.<ItemStack>method68(this.method3629(), ItemStack.EMPTY);
      Class7920.method26567(var2, this.field5247);
      this.field5248 = var2.method121("BurnTime");
      this.field5250 = var2.method121("CookTime");
      this.field5251 = var2.method121("CookTimeTotal");
      this.field5249 = this.method3650(this.field5247.get(1));
      Class39 var5 = var2.method130("RecipesUsed");

      for (String var7 : var5.method97()) {
         this.field5253.put(new ResourceLocation(var7), var5.method122(var7));
      }
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      var1.method101("BurnTime", (short)this.field5248);
      var1.method101("CookTime", (short)this.field5250);
      var1.method101("CookTimeTotal", (short)this.field5251);
      Class7920.method26565(var1, this.field5247);
      Class39 var4 = new Class39();
      this.field5253.forEach((var1x, var2) -> var4.method102(var1x.toString(), var2));
      var1.method99("RecipesUsed", var4);
      return var1;
   }

   @Override
   public void method3647() {
      boolean var3 = this.method3644();
      boolean var4 = false;
      if (this.method3644()) {
         this.field5248--;
      }

      if (!this.field5324.field9020) {
         ItemStack var5 = this.field5247.get(1);
         if (this.method3644() || !var5.method32105() && !this.field5247.get(0).method32105()) {
            Class4843 var6 = this.field5324.method6816().method1030(this.field5254, this, this.field5324).orElse(null);
            if (!this.method3644() && this.method3648(var6)) {
               this.field5248 = this.method3650(var5);
               this.field5249 = this.field5248;
               if (this.method3644()) {
                  var4 = true;
                  if (!var5.method32105()) {
                     Class3257 var7 = var5.method32107();
                     var5.method32182(1);
                     if (var5.method32105()) {
                        Class3257 var8 = var7.method11722();
                        this.field5247.set(1, var8 != null ? new ItemStack(var8) : ItemStack.EMPTY);
                     }
                  }
               }
            }

            if (this.method3644() && this.method3648(var6)) {
               this.field5250++;
               if (this.field5250 == this.field5251) {
                  this.field5250 = 0;
                  this.field5251 = this.method3651();
                  this.method3649(var6);
                  var4 = true;
               }
            } else {
               this.field5250 = 0;
            }
         } else if (!this.method3644() && this.field5250 > 0) {
            this.field5250 = MathHelper.method37775(this.field5250 - 2, 0, this.field5251);
         }

         if (var3 != this.method3644()) {
            var4 = true;
            this.field5324
               .method6725(this.field5325, this.field5324.method6738(this.field5325).method23465(Class3350.field18876, Boolean.valueOf(this.method3644())), 3);
         }
      }

      if (var4) {
         this.method3622();
      }
   }

   public boolean method3648(Class4843<?> var1) {
      if (!this.field5247.get(0).method32105() && var1 != null) {
         ItemStack var4 = var1.method14966();
         if (!var4.method32105()) {
            ItemStack var5 = this.field5247.get(2);
            if (var5.method32105()) {
               return true;
            } else if (var5.method32132(var4)) {
               return var5.method32179() < this.method3630() && var5.method32179() < var5.method32113() ? true : var5.method32179() < var4.method32113();
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method3649(Class4843<?> var1) {
      if (var1 != null && this.method3648(var1)) {
         ItemStack var4 = this.field5247.get(0);
         ItemStack var5 = var1.method14966();
         ItemStack var6 = this.field5247.get(2);
         if (!var6.method32105()) {
            if (var6.method32107() == var5.method32107()) {
               var6.method32181(1);
            }
         } else {
            this.field5247.set(2, var5.copy());
         }

         if (!this.field5324.field9020) {
            this.method3636(var1);
         }

         if (var4.method32107() == Blocks.field36453.method11581()
            && !this.field5247.get(1).method32105()
            && this.field5247.get(1).method32107() == Class8514.field37882) {
            this.field5247.set(1, new ItemStack(Class8514.field37883));
         }

         var4.method32182(1);
      }
   }

   public int method3650(ItemStack var1) {
      if (!var1.method32105()) {
         Class3257 var4 = var1.method32107();
         return method3640().getOrDefault(var4, 0);
      } else {
         return 0;
      }
   }

   public int method3651() {
      return this.field5324.method6816().method1030(this.field5254, this, this.field5324).<Integer>map(Class4847::method14977).orElse(200);
   }

   public static boolean method3652(ItemStack var0) {
      return method3640().containsKey(var0.method32107());
   }

   @Override
   public int[] method3653(Direction var1) {
      if (var1 != Direction.field672) {
         return var1 != Direction.field673 ? field5246 : field5244;
      } else {
         return field5245;
      }
   }

   @Override
   public boolean method3654(int var1, ItemStack var2, Direction var3) {
      return this.method3633(var1, var2);
   }

   @Override
   public boolean method3655(int var1, ItemStack var2, Direction var3) {
      if (var3 == Direction.field672 && var1 == 1) {
         Class3257 var6 = var2.method32107();
         if (var6 != Class8514.field37883 && var6 != Class8514.field37882) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int method3629() {
      return this.field5247.size();
   }

   @Override
   public boolean method3617() {
      for (ItemStack var4 : this.field5247) {
         if (!var4.method32105()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack method3618(int var1) {
      return this.field5247.get(var1);
   }

   @Override
   public ItemStack method3619(int var1, int var2) {
      return Class7920.method26563(this.field5247, var1, var2);
   }

   @Override
   public ItemStack method3620(int var1) {
      return Class7920.method26564(this.field5247, var1);
   }

   @Override
   public void method3621(int var1, ItemStack var2) {
      ItemStack var5 = this.field5247.get(var1);
      boolean var6 = !var2.method32105() && var2.method32132(var5) && ItemStack.method32127(var2, var5);
      this.field5247.set(var1, var2);
      if (var2.method32179() > this.method3630()) {
         var2.method32180(this.method3630());
      }

      if (var1 == 0 && !var6) {
         this.field5251 = this.method3651();
         this.field5250 = 0;
         this.method3622();
      }
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return this.field5324.method6759(this.field5325) == this
         ? var1.method3276((double)this.field5325.method8304() + 0.5, (double)this.field5325.getY() + 0.5, (double)this.field5325.method8306() + 0.5)
            <= 64.0
         : false;
   }

   @Override
   public boolean method3633(int var1, ItemStack var2) {
      if (var1 != 2) {
         if (var1 != 1) {
            return true;
         } else {
            ItemStack var5 = this.field5247.get(1);
            return method3652(var2) || var2.method32107() == Class8514.field37882 && var5.method32107() != Class8514.field37882;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method3625() {
      this.field5247.clear();
   }

   @Override
   public void method3636(Class4843<?> var1) {
      if (var1 != null) {
         ResourceLocation var4 = var1.method14964();
         this.field5253.addTo(var4, 1);
      }
   }

   @Nullable
   @Override
   public Class4843<?> method3637() {
      return null;
   }

   @Override
   public void method3638(PlayerEntity var1) {
   }

   public void method3656(PlayerEntity var1) {
      List var4 = this.method3657(var1.field5024, var1.getPositionVec());
      var1.method2778(var4);
      this.field5253.clear();
   }

   public List<Class4843<?>> method3657(World var1, Vector3d var2) {
      ArrayList var5 = Lists.newArrayList();
      ObjectIterator var6 = this.field5253.object2IntEntrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         var1.method6816().method1035((ResourceLocation)var7.getKey()).ifPresent(var4 -> {
            var5.add(var4);
            method3658(var1, var2, var7.getIntValue(), ((Class4847)var4).method14976());
         });
      }

      return var5;
   }

   private static void method3658(World var0, Vector3d var1, int var2, float var3) {
      int var6 = MathHelper.method37767((float)var2 * var3);
      float var7 = MathHelper.method37807((float)var2 * var3);
      if (var7 != 0.0F && Math.random() < (double)var7) {
         var6++;
      }

      while (var6 > 0) {
         int var8 = ExperienceOrbEntity.method4179(var6);
         var6 -= var8;
         var0.method6916(new ExperienceOrbEntity(var0, var1.field18048, var1.field18049, var1.field18050, var8));
      }
   }

   @Override
   public void method3659(Class6207 var1) {
      for (ItemStack var5 : this.field5247) {
         var1.method19117(var5);
      }
   }

   // $VF: synthetic method
   public static int method3662(Class924 var0) {
      return var0.field5248;
   }

   // $VF: synthetic method
   public static int method3663(Class924 var0) {
      return var0.field5249;
   }

   // $VF: synthetic method
   public static int method3664(Class924 var0) {
      return var0.field5250;
   }

   // $VF: synthetic method
   public static int method3665(Class924 var0) {
      return var0.field5251;
   }

   // $VF: synthetic method
   public static int method3666(Class924 var0, int var1) {
      return var0.field5248 = var1;
   }

   // $VF: synthetic method
   public static int method3667(Class924 var0, int var1) {
      return var0.field5249 = var1;
   }

   // $VF: synthetic method
   public static int method3668(Class924 var0, int var1) {
      return var0.field5250 = var1;
   }

   // $VF: synthetic method
   public static int method3669(Class924 var0, int var1) {
      return var0.field5251 = var1;
   }
}