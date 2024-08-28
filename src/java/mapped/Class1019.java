package mapped;

import com.google.common.collect.Maps;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Class1019 extends Class1018 implements Class1020 {
   private static final Class9289<Byte> field5704 = Class9361.<Byte>method35441(Class1019.class, Class7784.field33390);
   private static final Map<Class112, Class3303> field5705 = Util.<Map<Class112, Class3303>>method38508(Maps.newEnumMap(Class112.class), var0 -> {
      var0.put(Class112.field386, Class8487.field36489);
      var0.put(Class112.field387, Class8487.field36490);
      var0.put(Class112.field388, Class8487.field36491);
      var0.put(Class112.field389, Class8487.field36492);
      var0.put(Class112.field390, Class8487.field36493);
      var0.put(Class112.field391, Class8487.field36494);
      var0.put(Class112.field392, Class8487.field36495);
      var0.put(Class112.field393, Class8487.field36496);
      var0.put(Class112.field394, Class8487.field36497);
      var0.put(Class112.field395, Class8487.field36498);
      var0.put(Class112.field396, Class8487.field36499);
      var0.put(Class112.field397, Class8487.field36500);
      var0.put(Class112.field398, Class8487.field36501);
      var0.put(Class112.field399, Class8487.field36502);
      var0.put(Class112.field400, Class8487.field36503);
      var0.put(Class112.field401, Class8487.field36504);
   });

   private static final Map<Class112, float[]> field5706 = Maps.newEnumMap(Arrays.stream(Class112.values())
           .collect(Collectors.toMap((Class112 p_200204_0_) -> p_200204_0_, Class1019::method4510)));

   private int field5707;
   private Class2597 field5708;

   private static float[] method4510(Class112 var0) {
      if (var0 != Class112.field386) {
         float[] var3 = var0.method311();
         float var4 = 0.75F;
         return new float[]{var3[0] * 0.75F, var3[1] * 0.75F, var3[2] * 0.75F};
      } else {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      }
   }

   public static float[] method4511(Class112 var0) {
      return field5706.get(var0);
   }

   public Class1019(Class8992<? extends Class1019> var1, Class1655 var2) {
      super(var1, var2);
   }

   @Override
   public void method4219() {
      this.field5708 = new Class2597(this);
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2747(this, 1.25));
      this.field5600.method20002(2, new Class2785(this, 1.0));
      this.field5600.method20002(3, new Class2680(this, 1.1, Class120.method339(Class8514.field37842), false));
      this.field5600.method20002(4, new Class2764(this, 1.1));
      this.field5600.method20002(5, this.field5708);
      this.field5600.method20002(6, new Class2737(this, 1.0));
      this.field5600.method20002(7, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(8, new Class2668(this));
   }

   @Override
   public void method4258() {
      this.field5707 = this.field5708.method10811();
      super.method4258();
   }

   @Override
   public void method2871() {
      if (this.field5024.field9020) {
         this.field5707 = Math.max(0, this.field5707 - 1);
      }

      super.method2871();
   }

   public static Class7037 method4512() {
      return Class1006.method4220().method21849(Class9173.field42105, 8.0).method21849(Class9173.field42108, 0.23F);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5704, (byte)0);
   }

   @Override
   public ResourceLocation method4242() {
      if (this.method4519()) {
         return this.method3204().method33212();
      } else {
         switch (Class8608.field38723[this.method4517().ordinal()]) {
            case 1:
            default:
               return Class8793.field39575;
            case 2:
               return Class8793.field39576;
            case 3:
               return Class8793.field39577;
            case 4:
               return Class8793.field39578;
            case 5:
               return Class8793.field39579;
            case 6:
               return Class8793.field39580;
            case 7:
               return Class8793.field39581;
            case 8:
               return Class8793.field39582;
            case 9:
               return Class8793.field39583;
            case 10:
               return Class8793.field39584;
            case 11:
               return Class8793.field39585;
            case 12:
               return Class8793.field39586;
            case 13:
               return Class8793.field39587;
            case 14:
               return Class8793.field39588;
            case 15:
               return Class8793.field39589;
            case 16:
               return Class8793.field39590;
         }
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 10) {
         super.method2866(var1);
      } else {
         this.field5707 = 40;
      }
   }

   public float method4513(float var1) {
      if (this.field5707 > 0) {
         if (this.field5707 >= 4 && this.field5707 <= 36) {
            return 1.0F;
         } else {
            return this.field5707 >= 4 ? -((float)(this.field5707 - 40) - var1) / 4.0F : ((float)this.field5707 - var1) / 4.0F;
         }
      } else {
         return 0.0F;
      }
   }

   public float method4514(float var1) {
      if (this.field5707 > 4 && this.field5707 <= 36) {
         float var4 = ((float)(this.field5707 - 4) - var1) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * Class9679.method37763(var4 * 28.7F);
      } else {
         return this.field5707 <= 0 ? this.field5032 * (float) (Math.PI / 180.0) : (float) (Math.PI / 5);
      }
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Class79 var2) {
      Class8848 var5 = var1.method3094(var2);
      if (var5.method32107() != Class8514.field37956) {
         return super.method4285(var1, var2);
      } else if (!this.field5024.field9020 && this.method4516()) {
         this.method4515(Class2266.field14735);
         var5.method32121(1, var1, var1x -> var1x.method3185(var2));
         return Class2274.field14818;
      } else {
         return Class2274.field14819;
      }
   }

   @Override
   public void method4515(Class2266 var1) {
      this.field5024.method6744((PlayerEntity)null, this, Class6067.field27033, var1, 1.0F, 1.0F);
      this.method4520(true);
      int var4 = 1 + this.field5054.nextInt(3);

      for (int var5 = 0; var5 < var4; var5++) {
         Class1000 var6 = this.method3301(field5705.get(this.method4517()), 1);
         if (var6 != null) {
            var6.method3434(
               var6.method3433()
                  .method11339(
                     (double)((this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.1F),
                     (double)(this.field5054.nextFloat() * 0.05F),
                     (double)((this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.1F)
                  )
            );
         }
      }
   }

   @Override
   public boolean method4516() {
      return this.method3066() && !this.method4519() && !this.method3005();
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method115("Sheared", this.method4519());
      var1.method100("Color", (byte)this.method4517().method309());
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4520(var1.method132("Sheared"));
      this.method4518(Class112.method315(var1.method120("Color")));
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27030;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27032;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27031;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field27034, 0.15F, 1.0F);
   }

   public Class112 method4517() {
      return Class112.method315(this.field5063.<Byte>method35445(field5704) & 15);
   }

   public void method4518(Class112 var1) {
      byte var4 = this.field5063.<Byte>method35445(field5704);
      this.field5063.method35446(field5704, (byte)(var4 & 240 | var1.method309() & 15));
   }

   public boolean method4519() {
      return (this.field5063.<Byte>method35445(field5704) & 16) != 0;
   }

   public void method4520(boolean var1) {
      byte var4 = this.field5063.<Byte>method35445(field5704);
      if (!var1) {
         this.field5063.method35446(field5704, (byte)(var4 & -17));
      } else {
         this.field5063.method35446(field5704, (byte)(var4 | 16));
      }
   }

   public static Class112 method4521(Random var0) {
      int var3 = var0.nextInt(100);
      if (var3 >= 5) {
         if (var3 >= 10) {
            if (var3 >= 15) {
               if (var3 >= 18) {
                  return var0.nextInt(500) != 0 ? Class112.field386 : Class112.field392;
               } else {
                  return Class112.field398;
               }
            } else {
               return Class112.field394;
            }
         } else {
            return Class112.field393;
         }
      } else {
         return Class112.field401;
      }
   }

   public Class1019 method4389(Class1657 var1, Class1045 var2) {
      Class1019 var5 = (Class1019)var2;
      Class1019 var6 = Class8992.field41074.method33215(var1);
      var6.method4518(this.method4522(this, var5));
      return var6;
   }

   @Override
   public void method4235() {
      this.method4520(false);
      if (this.method3005()) {
         this.method4769(60);
      }
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method4518(method4521(var1.method6814()));
      return super.method4276(var1, var2, var3, var4, var5);
   }

   private Class112 method4522(Class1018 var1, Class1018 var2) {
      Class112 var5 = ((Class1019)var1).method4517();
      Class112 var6 = ((Class1019)var2).method4517();
      Class926 var7 = method4523(var5, var6);
      return this.field5024
         .method6816()
         .<Class926, Class4842>method1030(Class7207.field30935, var7, this.field5024)
         .<Class8848>map(var1x -> var1x.method14962(var7))
         .<Class3257>map(Class8848::method32107)
         .filter(Class3321.class::isInstance)
         .<Class3321>map(Class3321.class::cast)
         .<Class112>map(Class3321::method11876)
         .orElseGet(() -> !this.field5024.field9016.nextBoolean() ? var6 : var5);
   }

   private static Class926 method4523(Class112 var0, Class112 var1) {
      Class926 var4 = new Class926(new Class5835((Class8298)null, -1), 2, 1);
      var4.method3621(0, new Class8848(Class3321.method11877(var0)));
      var4.method3621(1, new Class8848(Class3321.method11877(var1)));
      return var4;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 0.95F * var2.field39969;
   }
}
