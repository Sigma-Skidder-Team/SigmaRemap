package mapped;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class Class1096 extends Class1018 implements Class1011 {
   private static String[] field6009;
   private static final Class9289<Boolean> field6010 = Class9361.<Boolean>method35441(Class1096.class, Class7784.field33398);
   private float field6011;
   private float field6012;
   private int field6013;
   private static final Class8369 field6014 = Class8763.method31620(20, 39);
   private int field6015;
   private UUID field6016;

   public Class1096(Class8992<? extends Class1096> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return Class8992.field41068.method33215(var1);
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return false;
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2658(this));
      this.field5600.method20002(1, new Class2752(this));
      this.field5600.method20002(4, new Class2764(this, 1.25));
      this.field5600.method20002(5, new Class2736(this, 1.0));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(7, new Class2668(this));
      this.field5601.method20002(1, new Class2707(this));
      this.field5601.method20002(2, new Class2720(this));
      this.field5601.method20002(3, new Class2709<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4367));
      this.field5601.method20002(4, new Class2709<Class1095>(this, Class1095.class, 10, true, true, (Predicate<Class880>)null));
      this.field5601.method20002(5, new Class2779<Class1096>(this, false));
   }

   public static Class7037 method5180() {
      return Class1006.method4220()
         .method21849(Class9173.field42105, 30.0)
         .method21849(Class9173.field42106, 20.0)
         .method21849(Class9173.field42108, 0.25)
         .method21849(Class9173.field42110, 6.0);
   }

   public static boolean method5181(Class8992<Class1096> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      Optional var7 = var1.method7178(var3);
      return !Objects.equals(var7, Optional.<RegistryKey<Biome>>of(Class9495.field44131))
            && !Objects.equals(var7, Optional.<RegistryKey<Biome>>of(Class9495.field44171))
         ? method4500(var0, var1, var2, var3, var4)
         : var1.method7021(var3, 0) > 8 && var1.method6738(var3.method8313()).method23448(Blocks.ICE);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4365((ServerWorld)this.field5024, var1);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      this.method4364(var1);
   }

   @Override
   public void method4346() {
      this.method4347(field6014.method29319(this.field5054));
   }

   @Override
   public void method4347(int var1) {
      this.field6015 = var1;
   }

   @Override
   public int method4348() {
      return this.field6015;
   }

   @Override
   public void method4349(UUID var1) {
      this.field6016 = var1;
   }

   @Override
   public UUID method4350() {
      return this.field6016;
   }

   @Override
   public Class9455 method4241() {
      return !this.method3005() ? Class6067.field26970 : Class6067.field26971;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26973;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26972;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26974, 0.15F, 1.0F);
   }

   public void method5182() {
      if (this.field6013 <= 0) {
         this.method2863(Class6067.field26975, 1.0F, this.method3100());
         this.field6013 = 40;
      }
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field6010, false);
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5024.field9020) {
         if (this.field6012 != this.field6011) {
            this.method3385();
         }

         this.field6011 = this.field6012;
         if (!this.method5183()) {
            this.field6012 = MathHelper.method37777(this.field6012 - 1.0F, 0.0F, 6.0F);
         } else {
            this.field6012 = MathHelper.method37777(this.field6012 + 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.field6013 > 0) {
         this.field6013--;
      }

      if (!this.field5024.field9020) {
         this.method4366((ServerWorld)this.field5024, true);
      }
   }

   @Override
   public Class8847 method2981(Class2090 var1) {
      if (!(this.field6012 > 0.0F)) {
         return super.method2981(var1);
      } else {
         float var4 = this.field6012 / 6.0F;
         float var5 = 1.0F + var4;
         return super.method2981(var1).method32100(1.0F, var5);
      }
   }

   @Override
   public boolean method3114(Entity var1) {
      boolean var4 = var1.method2741(Class8654.method31115(this), (float)((int)this.method3086(Class9173.field42110)));
      if (var4) {
         this.method3399(this, var1);
      }

      return var4;
   }

   public boolean method5183() {
      return this.field5063.<Boolean>method35445(field6010);
   }

   public void method5184(boolean var1) {
      this.field5063.method35446(field6010, var1);
   }

   public float method5185(float var1) {
      return MathHelper.method37821(var1, this.field6011, this.field6012) / 6.0F;
   }

   @Override
   public float method3106() {
      return 0.98F;
   }

   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      if (var4 == null) {
         var4 = new Class5097(1.0F);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }
}
