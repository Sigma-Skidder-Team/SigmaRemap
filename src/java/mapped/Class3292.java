package mapped;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class Class3292 extends Class3257 {
   /** @deprecated */
   private final Block field18801;

   public Class3292(Block var1, Class5643 var2) {
      super(var2);
      this.field18801 = var1;
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      ActionResultType var4 = this.method11834(new Class5909(var1));
      return !var4.isSuccessOrConsume() && this.method11744() ? this.method11700(var1.method18360(), var1.method18358(), var1.method18359()).method20694() : var4;
   }

   public ActionResultType method11834(Class5909 var1) {
      if (!var1.method18346()) {
         return ActionResultType.field14821;
      } else {
         Class5909 var4 = this.method11836(var1);
         if (var4 != null) {
            Class7380 var5 = this.method11838(var4);
            if (var5 == null) {
               return ActionResultType.field14821;
            } else if (this.method11843(var4, var5)) {
               BlockPos var6 = var4.method18345();
               World var7 = var4.method18360();
               PlayerEntity var8 = var4.method18358();
               ItemStack var9 = var4.method18357();
               Class7380 var10 = var7.method6738(var6);
               Block var11 = var10.method23383();
               if (var11 == var5.method23383()) {
                  var10 = this.method11839(var6, var7, var9, var10);
                  this.method11837(var6, var7, var8, var9, var10);
                  var11.method11563(var7, var6, var10, var8, var9);
                  if (var8 instanceof ServerPlayerEntity) {
                     CriteriaTriggers.field44489.method15138((ServerPlayerEntity)var8, var6, var9);
                  }
               }

               Class8447 var12 = var10.method23452();
               var7.method6742(var8, var6, this.method11835(var10), Class2266.field14732, (var12.method29710() + 1.0F) / 2.0F, var12.method29711() * 0.8F);
               if (var8 == null || !var8.field4919.field29609) {
                  var9.method32182(1);
               }

               return ActionResultType.method9002(var7.field9020);
            } else {
               return ActionResultType.field14821;
            }
         } else {
            return ActionResultType.field14821;
         }
      }
   }

   public Class9455 method11835(Class7380 var1) {
      return var1.method23452().method29714();
   }

   @Nullable
   public Class5909 method11836(Class5909 var1) {
      return var1;
   }

   public boolean method11837(BlockPos var1, World var2, PlayerEntity var3, ItemStack var4, Class7380 var5) {
      return method11844(var2, var3, var1, var4);
   }

   @Nullable
   public Class7380 method11838(Class5909 var1) {
      Class7380 var4 = this.method11845().method11495(var1);
      return var4 != null && this.method11841(var1, var4) ? var4 : null;
   }

   private Class7380 method11839(BlockPos var1, World var2, ItemStack var3, Class7380 var4) {
      Class7380 var7 = var4;
      Class39 var8 = var3.method32142();
      if (var8 != null) {
         Class39 var9 = var8.method130("BlockStateTag");
         Class9348 var10 = var4.method23383().method11577();

         for (String var12 : var9.method97()) {
            Class8550 var13 = var10.method35396(var12);
            if (var13 != null) {
               String var14 = var9.method116(var12).method81();
               var7 = method11840(var7, var13, var14);
            }
         }
      }

      if (var7 != var4) {
         var2.method6725(var1, var7, 2);
      }

      return var7;
   }

   private static <T extends Comparable<T>> Class7380 method11840(Class7380 var0, Class8550<T> var1, String var2) {
      return var1.method30476(var2).<Class7380>map(var2x -> var0.method23465(var1, var2x)).orElse(var0);
   }

   public boolean method11841(Class5909 var1, Class7380 var2) {
      PlayerEntity var5 = var1.method18358();
      Class4832 var6 = var5 != null ? Class4832.method14948(var5) : Class4832.method14947();
      return (!this.method11842() || var2.method23443(var1.method18360(), var1.method18345())) && var1.method18360().method7049(var2, var1.method18345(), var6);
   }

   public boolean method11842() {
      return true;
   }

   public boolean method11843(Class5909 var1, Class7380 var2) {
      return var1.method18360().method6725(var1.method18345(), var2, 11);
   }

   public static boolean method11844(World var0, PlayerEntity var1, BlockPos var2, ItemStack var3) {
      MinecraftServer var6 = var0.method6715();
      if (var6 == null) {
         return false;
      } else {
         Class39 var7 = var3.method32145("BlockEntityTag");
         if (var7 != null) {
            Class944 var8 = var0.method6759(var2);
            if (var8 != null) {
               if (!var0.field9020 && var8.method3783() && (var1 == null || !var1.method2979())) {
                  return false;
               }

               Class39 var9 = var8.method3646(new Class39());
               Class39 var10 = var9.method79();
               var9.method140(var7);
               var9.method102("x", var2.method8304());
               var9.method102("y", var2.getY());
               var9.method102("z", var2.method8306());
               if (!var9.equals(var10)) {
                  var8.method3645(var0.method6738(var2), var9);
                  var8.method3622();
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public String method11719() {
      return this.method11845().method11566();
   }

   @Override
   public void method11737(Class7401 var1, Class25<ItemStack> var2) {
      if (this.method11738(var1)) {
         this.method11845().method11570(var1, var2);
      }
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      super.method11730(var1, var2, var3, var4);
      this.method11845().method11583(var1, var2, var3, var4);
   }

   public Block method11845() {
      return this.field18801;
   }

   public void method11846(Map<Block, Class3257> var1, Class3257 var2) {
      var1.put(this.method11845(), var2);
   }
}
