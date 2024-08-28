package mapped;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

import java.util.List;
import java.util.UUID;

public class Class3279 extends Class3257 implements Class3255 {
   private static final UUID[] field18779 = new UUID[]{
      UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
      UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
      UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
      UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
   };
   public static final Class6226 field18780 = new Class6224();
   public final Class2106 field18781;
   public final int field18782;
   private final float field18783;
   public final float field18784;
   public final Class2115 field18785;
   private final Multimap<Class4869, Class9689> field18786;

   public static boolean method11804(Class2956 var0, ItemStack var1) {
      BlockPos var4 = var0.method11323().method8349(var0.method11324().<Direction>method23463(Class3357.field18899));
      List var5 = var0.method11326().<Entity>method6772(Class880.class, new Class6488(var4), Class8088.field34763.and(new Class165(var1)));
      if (!var5.isEmpty()) {
         Class880 var6 = (Class880)var5.get(0);
         Class2106 var7 = Class1006.method4271(var1);
         ItemStack var8 = var1.method32106(1);
         var6.method2944(var7, var8);
         if (var6 instanceof Class1006) {
            ((Class1006)var6).method4279(var7, 2.0F);
            ((Class1006)var6).method4278();
         }

         return true;
      } else {
         return false;
      }
   }

   public Class3279(Class2115 var1, Class2106 var2, Class5643 var3) {
      super(var3.method17776(var1.method8785(var2)));
      this.field18785 = var1;
      this.field18781 = var2;
      this.field18782 = var1.method8786(var2);
      this.field18783 = var1.method8791();
      this.field18784 = var1.method8792();
      Class3357.method11931(this, field18780);
      Builder var6 = ImmutableMultimap.builder();
      UUID var7 = field18779[var2.method8773()];
      var6.put(Class9173.field42113, new Class9689(var7, "Armor modifier", (double)this.field18782, Class2045.field13352));
      var6.put(Class9173.field42114, new Class9689(var7, "Armor toughness", (double)this.field18783, Class2045.field13352));
      if (var1 == Class2114.field13779) {
         var6.put(Class9173.field42107, new Class9689(var7, "Armor knockback resistance", (double)this.field18784, Class2045.field13352));
      }

      this.field18786 = var6.build();
   }

   public Class2106 method11805() {
      return this.field18781;
   }

   @Override
   public int method11736() {
      return this.field18785.method8787();
   }

   public Class2115 method11806() {
      return this.field18785;
   }

   @Override
   public boolean method11699(ItemStack var1, ItemStack var2) {
      return this.field18785.method8789().test(var2) || super.method11699(var1, var2);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      Class2106 var7 = Class1006.method4271(var6);
      ItemStack var8 = var2.method2943(var7);
      if (!var8.method32105()) {
         return Class6794.<ItemStack>method20699(var6);
      } else {
         var2.method2944(var7, var6.copy());
         var6.method32180(0);
         return Class6794.<ItemStack>method20700(var6, var1.method6714());
      }
   }

   @Override
   public Multimap<Class4869, Class9689> method11740(Class2106 var1) {
      return var1 != this.field18781 ? super.method11740(var1) : this.field18786;
   }

   public int method11807() {
      return this.field18782;
   }

   public float method11808() {
      return this.field18783;
   }
}
