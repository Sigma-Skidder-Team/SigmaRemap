package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Predicate;

public class Class1030 extends Class1025 {
   private static final Predicate<Class2197> field5731 = var0 -> var0 == Class2197.field14353 || var0 == Class2197.field14354;
   private boolean field5732;

   public Class1030(Class8992<? extends Class1030> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2644(this));
      this.field5600.method20002(2, new Class2646(this, this));
      this.field5600.method20002(3, new Class2759(this, this, 10.0F));
      this.field5600.method20002(4, new Class2656(this, this));
      this.field5601.method20002(1, new Class2704(this, Class1026.class).method10918());
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.method20002(3, new Class2709<Class1043>(this, Class1043.class, true));
      this.field5601.method20002(3, new Class2709<Class1058>(this, Class1058.class, true));
      this.field5601.method20002(4, new Class2713(this));
      this.field5600.method20002(8, new Class2736(this, 0.6));
      this.field5600.method20002(9, new Class2612(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.method20002(10, new Class2612(this, Class1006.class, 8.0F));
   }

   @Override
   public void method4258() {
      if (!this.method4305() && Class8100.method28053(this)) {
         boolean var3 = ((ServerWorld)this.field5024).method6958(this.method3432());
         ((Class6991)this.method4230()).method21682(var3);
      }

      super.method4258();
   }

   public static Class7037 method4589() {
      return Class1009.method4343()
         .method21849(Class9173.field42108, 0.35F)
         .method21849(Class9173.field42106, 12.0)
         .method21849(Class9173.field42105, 24.0)
         .method21849(Class9173.field42110, 5.0);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      if (this.field5732) {
         var1.method115("Johnny", true);
      }
   }

   @Override
   public Class2117 method4543() {
      if (!this.method4307()) {
         return !this.method4555() ? Class2117.field13794 : Class2117.field13800;
      } else {
         return Class2117.field13795;
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method119("Johnny", 99)) {
         this.field5732 = var1.method132("Johnny");
      }
   }

   @Override
   public Class9455 method4546() {
      return Class6067.field27210;
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      Class5093 var8 = super.method4276(var1, var2, var3, var4, var5);
      ((Class6991)this.method4230()).method21682(true);
      this.method4270(var2);
      this.method4273(var2);
      return var8;
   }

   @Override
   public void method4270(Class9755 var1) {
      if (this.method4551() == null) {
         this.method2944(Class2106.field13731, new ItemStack(Class8514.field37823));
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
   public void method3379(ITextComponent var1) {
      super.method3379(var1);
      if (!this.field5732 && var1 != null && var1.getString().equals("Johnny")) {
         this.field5732 = true;
      }
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27209;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27211;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27212;
   }

   @Override
   public void method4545(int var1, boolean var2) {
      ItemStack var5 = new ItemStack(Class8514.field37823);
      Class7699 var6 = this.method4551();
      byte var7 = 1;
      if (var1 > var6.method25435(Class2197.field14353)) {
         var7 = 2;
      }

      boolean var8 = this.field5054.nextFloat() <= var6.method25436();
      if (var8) {
         HashMap var9 = Maps.newHashMap();
         var9.put(Class8122.field34908, Integer.valueOf(var7));
         Class7858.method26314(var9, var5);
      }

      this.method2944(Class2106.field13731, var5);
   }

   // $VF: synthetic method
   public static Predicate method4591() {
      return field5731;
   }

   // $VF: synthetic method
   public static Random method4592(Class1030 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static boolean method4593(Class1030 var0) {
      return var0.field5732;
   }
}
