package mapped;

import com.google.common.collect.Maps;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class Class1024 extends Class1025 implements Class1023 {
   private static final Class9289<Boolean> field5710 = Class9361.<Boolean>method35441(Class1024.class, Class7784.field33398);
   private final Class927 field5711 = new Class927(5);

   public Class1024(Class8992<? extends Class1024> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(2, new Class2759(this, this, 10.0F));
      this.field5600.method20002(3, new Class2691<Class1024>(this, 1.0, 8.0F));
      this.field5600.method20002(8, new Class2736(this, 0.6));
      this.field5600.method20002(9, new Class2612(this, PlayerEntity.class, 15.0F, 1.0F));
      this.field5600.method20002(10, new Class2612(this, Class1006.class, 15.0F));
      this.field5601.method20002(1, new Class2704(this, Class1026.class).method10918());
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.method20002(3, new Class2709<Class1043>(this, Class1043.class, false));
      this.field5601.method20002(3, new Class2709<Class1058>(this, Class1058.class, true));
   }

   public static Class7037 method4541() {
      return Class1009.method4343()
         .method21849(Class9173.field42108, 0.35F)
         .method21849(Class9173.field42105, 24.0)
         .method21849(Class9173.field42110, 5.0)
         .method21849(Class9173.field42106, 32.0);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5710, false);
   }

   @Override
   public boolean method4234(Class3262 var1) {
      return var1 == Class8514.field38148;
   }

   public boolean method4542() {
      return this.field5063.<Boolean>method35445(field5710);
   }

   @Override
   public void method4535(boolean var1) {
      this.field5063.method35446(field5710, var1);
   }

   @Override
   public void method4537() {
      this.field4973 = 0;
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      Class41 var4 = new Class41();

      for (int var5 = 0; var5 < this.field5711.method3629(); var5++) {
         ItemStack var6 = this.field5711.method3618(var5);
         if (!var6.method32105()) {
            var4.add(var6.method32112(new Class39()));
         }
      }

      var1.method99("Inventory", var4);
   }

   @Override
   public Class2117 method4543() {
      if (!this.method4542()) {
         if (!this.method3092(Class8514.field38148)) {
            return !this.method4307() ? Class2117.field13801 : Class2117.field13795;
         } else {
            return Class2117.field13798;
         }
      } else {
         return Class2117.field13799;
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      Class41 var4 = var1.method131("Inventory", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         ItemStack var6 = ItemStack.method32104(var4.method153(var5));
         if (!var6.method32105()) {
            this.field5711.method3676(var6);
         }
      }

      this.method4281(true);
   }

   @Override
   public float method4339(BlockPos var1, Class1662 var2) {
      Class7380 var5 = var2.method6738(var1.method8313());
      return !var5.method23448(Blocks.field36395) && !var5.method23448(Blocks.SAND) ? 0.5F - var2.method7009(var1) : 10.0F;
   }

   @Override
   public int method4267() {
      return 1;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method4270(var2);
      this.method4273(var2);
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public void method4270(Class9755 var1) {
      this.method2944(Class2106.field13731, new ItemStack(Class8514.field38148));
   }

   @Override
   public void method4274(float var1) {
      super.method4274(var1);
      if (this.field5054.nextInt(300) == 0) {
         ItemStack var4 = this.method3090();
         if (var4.method32107() == Class8514.field38148) {
            Map var5 = Class7858.method26312(var4);
            var5.putIfAbsent(Class8122.field34931, 1);
            Class7858.method26314(var5, var4);
            this.method2944(Class2106.field13731, var4);
         }
      }
   }

   @Override
   public boolean method3345(Entity var1) {
      if (super.method3345(var1)) {
         return true;
      } else {
         return var1 instanceof Class880 && ((Class880)var1).method3089() == Class7809.field33508
            ? this.method3344() == null && var1.method3344() == null
            : false;
      }
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26945;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26947;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26948;
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      this.method4538(this, 1.6F);
   }

   @Override
   public void method4536(Class880 var1, ItemStack var2, Class882 var3, float var4) {
      this.method4539(this, var1, var3, var4, 1.6F);
   }

   @Override
   public void method4246(ItemEntity var1) {
      ItemStack var4 = var1.method4124();
      if (!(var4.method32107() instanceof Class3301)) {
         Class3257 var5 = var4.method32107();
         if (this.method4544(var5)) {
            this.method3134(var1);
            ItemStack var6 = this.field5711.method3676(var4);
            if (!var6.method32105()) {
               var4.method32180(var6.method32179());
            } else {
               var1.method2904();
            }
         }
      } else {
         super.method4246(var1);
      }
   }

   private boolean method4544(Class3257 var1) {
      return this.method4552() && var1 == Class8514.field38092;
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (!super.method2963(var1, var2)) {
         int var5 = var1 - 300;
         if (var5 >= 0 && var5 < this.field5711.method3629()) {
            this.field5711.method3621(var5, var2);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method4545(int var1, boolean var2) {
      Class7699 var5 = this.method4551();
      boolean var6 = this.field5054.nextFloat() <= var5.method25436();
      if (var6) {
         ItemStack var7 = new ItemStack(Class8514.field38148);
         HashMap var8 = Maps.newHashMap();
         if (var1 <= var5.method25435(Class2197.field14353)) {
            if (var1 > var5.method25435(Class2197.field14352)) {
               var8.put(Class8122.field34930, 1);
            }
         } else {
            var8.put(Class8122.field34930, 2);
         }

         var8.put(Class8122.field34929, 1);
         Class7858.method26314(var8, var7);
         this.method2944(Class2106.field13731, var7);
      }
   }

   @Override
   public Class9455 method4546() {
      return Class6067.field26946;
   }
}