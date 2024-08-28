package mapped;

import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;

public class Class887 extends Class884 {
   private static final Class9289<Integer> field5116 = Class9361.<Integer>method35441(Class887.class, Class7784.field33391);
   private Class8812 field5117 = Class8137.field34976;
   private final Set<Class2023> field5118 = Sets.newHashSet();
   private boolean field5119;

   public Class887(Class8992<? extends Class887> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class887(Class1655 var1, double var2, double var4, double var6) {
      super(Class8992.field41007, var2, var4, var6, var1);
   }

   public Class887(Class1655 var1, Class880 var2) {
      super(Class8992.field41007, var2, var1);
   }

   public void method3497(ItemStack var1) {
      if (var1.method32107() != Class8514.field38117) {
         if (var1.method32107() == Class8514.field37797) {
            this.field5117 = Class8137.field34976;
            this.field5118.clear();
            this.field5063.method35446(field5116, -1);
         }
      } else {
         this.field5117 = Class9741.method38185(var1);
         List<Class2023> var4 = Class9741.method38179(var1);
         if (!var4.isEmpty()) {
            for (Class2023 var6 : var4) {
               this.field5118.add(new Class2023(var6));
            }
         }

         int var7 = method3498(var1);
         if (var7 != -1) {
            this.method3503(var7);
         } else {
            this.method3499();
         }
      }
   }

   public static int method3498(ItemStack var0) {
      Class39 var3 = var0.method32142();
      return var3 != null && var3.method119("CustomPotionColor", 99) ? var3.method122("CustomPotionColor") : -1;
   }

   private void method3499() {
      this.field5119 = false;
      if (this.field5117 == Class8137.field34976 && this.field5118.isEmpty()) {
         this.field5063.method35446(field5116, -1);
      } else {
         this.field5063.method35446(field5116, Class9741.method38184(Class9741.method38177(this.field5117, this.field5118)));
      }
   }

   public void method3500(Class2023 var1) {
      this.field5118.add(var1);
      this.method3210().method35446(field5116, Class9741.method38184(Class9741.method38177(this.field5117, this.field5118)));
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5116, -1);
   }

   @Override
   public void tick() {
      super.tick();
      if (!this.field5024.field9020) {
         if (this.field5100 && this.field5101 != 0 && !this.field5118.isEmpty() && this.field5101 >= 600) {
            this.field5024.method6786(this, (byte)0);
            this.field5117 = Class8137.field34976;
            this.field5118.clear();
            this.field5063.method35446(field5116, -1);
         }
      } else if (!this.field5100) {
         this.method3501(2);
      } else if (this.field5101 % 5 == 0) {
         this.method3501(1);
      }
   }

   private void method3501(int var1) {
      int var4 = this.method3502();
      if (var4 != -1 && var1 > 0) {
         double var5 = (double)(var4 >> 16 & 0xFF) / 255.0;
         double var7 = (double)(var4 >> 8 & 0xFF) / 255.0;
         double var9 = (double)(var4 >> 0 & 0xFF) / 255.0;

         for (int var11 = 0; var11 < var1; var11++) {
            this.field5024.method6746(Class7940.field34068, this.method3438(0.5), this.method3441(), this.method3445(0.5), var5, var7, var9);
         }
      }
   }

   public int method3502() {
      return this.field5063.<Integer>method35445(field5116);
   }

   private void method3503(int var1) {
      this.field5119 = true;
      this.field5063.method35446(field5116, var1);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (this.field5117 != Class8137.field34976 && this.field5117 != null) {
         var1.method109("Potion", Class2348.field16076.method9181(this.field5117).toString());
      }

      if (this.field5119) {
         var1.method102("Color", this.method3502());
      }

      if (!this.field5118.isEmpty()) {
         Class41 var4 = new Class41();

         for (Class2023 var6 : this.field5118) {
            var4.add(var6.method8637(new Class39()));
         }

         var1.method99("CustomPotionEffects", var4);
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method119("Potion", 8)) {
         this.field5117 = Class9741.method38186(var1);
      }

      for (Class2023 var5 : Class9741.method38180(var1)) {
         this.method3500(var5);
      }

      if (!var1.method119("Color", 99)) {
         this.method3499();
      } else {
         this.method3503(var1.method122("Color"));
      }
   }

   @Override
   public void method3478(Class880 var1) {
      super.method3478(var1);

      for (Class2023 var5 : this.field5117.method31816()) {
         var1.method3035(new Class2023(var5.method8627(), Math.max(var5.method8628() / 8, 1), var5.method8629(), var5.method8630(), var5.method8631()));
      }

      if (!this.field5118.isEmpty()) {
         for (Class2023 var7 : this.field5118) {
            var1.method3035(var7);
         }
      }
   }

   @Override
   public ItemStack method3480() {
      if (this.field5118.isEmpty() && this.field5117 == Class8137.field34976) {
         return new ItemStack(Class8514.field37797);
      } else {
         ItemStack var3 = new ItemStack(Class8514.field38117);
         Class9741.method38187(var3, this.field5117);
         Class9741.method38188(var3, this.field5118);
         if (this.field5119) {
            var3.method32143().method102("CustomPotionColor", this.method3502());
         }

         return var3;
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 0) {
         super.method2866(var1);
      } else {
         int var4 = this.method3502();
         if (var4 != -1) {
            double var5 = (double)(var4 >> 16 & 0xFF) / 255.0;
            double var7 = (double)(var4 >> 8 & 0xFF) / 255.0;
            double var9 = (double)(var4 >> 0 & 0xFF) / 255.0;

            for (int var11 = 0; var11 < 20; var11++) {
               this.field5024.method6746(Class7940.field34068, this.method3438(0.5), this.method3441(), this.method3445(0.5), var5, var7, var9);
            }
         }
      }
   }
}
