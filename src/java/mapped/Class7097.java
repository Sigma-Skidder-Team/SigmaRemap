package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import javax.annotation.Nullable;

public class Class7097 extends Class7092 {
   public static final Codec<Class7097> field30533 = Codec.FLOAT.fieldOf("mossiness").xmap(Class7097::new, var0 -> var0.field30534).codec();
   private final float field30534;

   public Class7097(float var1) {
      this.field30534 = var1;
   }

   @Nullable
   @Override
   public Class8266 method22068(Class1662 var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      Random var9 = var6.method36439(var5.field35530);
      Class7380 var10 = var5.field35531;
      BlockPos var11 = var5.field35530;
      Class7380 var12 = null;
      if (var10.method23448(Class8487.field36615) || var10.method23448(Class8487.field36388) || var10.method23448(Class8487.field36618)) {
         var12 = this.method22076(var9);
      } else if (!var10.method23446(Class7645.field32762)) {
         if (!var10.method23446(Class7645.field32763)) {
            if (!var10.method23446(Class7645.field32764)) {
               if (var10.method23448(Class8487.field36527)) {
                  var12 = this.method22080(var9);
               }
            } else {
               var12 = this.method22079(var9);
            }
         } else {
            var12 = this.method22078(var9);
         }
      } else {
         var12 = this.method22077(var9, var5.field35531);
      }

      return var12 == null ? var5 : new Class8266(var11, var12, var5.field35532);
   }

   @Nullable
   private Class7380 method22076(Random var1) {
      if (!(var1.nextFloat() >= 0.5F)) {
         Class7380[] var4 = new Class7380[]{Class8487.field36617.method11579(), method22081(var1, Class8487.field36639)};
         Class7380[] var5 = new Class7380[]{Class8487.field36616.method11579(), method22081(var1, Class8487.field37016)};
         return this.method22082(var1, var4, var5);
      } else {
         return null;
      }
   }

   @Nullable
   private Class7380 method22077(Random var1, Class7380 var2) {
      Direction var5 = var2.<Direction>method23463(Class3421.field19131);
      Class99 var6 = var2.<Class99>method23463(Class3421.field19132);
      if (!(var1.nextFloat() >= 0.5F)) {
         Class7380[] var7 = new Class7380[]{Class8487.field36845.method11579(), Class8487.field36852.method11579()};
         Class7380[] var8 = new Class7380[]{
            Class8487.field37016.method11579().method23465(Class3421.field19131, var5).method23465(Class3421.field19132, var6),
            Class8487.field37030.method11579()
         };
         return this.method22082(var1, var7, var8);
      } else {
         return null;
      }
   }

   @Nullable
   private Class7380 method22078(Random var1) {
      return !(var1.nextFloat() < this.field30534) ? null : Class8487.field37030.method11579();
   }

   @Nullable
   private Class7380 method22079(Random var1) {
      return !(var1.nextFloat() < this.field30534) ? null : Class8487.field37044.method11579();
   }

   @Nullable
   private Class7380 method22080(Random var1) {
      return !(var1.nextFloat() < 0.15F) ? null : Class8487.field37123.method11579();
   }

   private static Class7380 method22081(Random var0, Class3209 var1) {
      return var1.method11579()
         .method23465(Class3421.field19131, Class76.field161.method247(var0))
         .method23465(Class3421.field19132, Class99.values()[var0.nextInt(Class99.values().length)]);
   }

   private Class7380 method22082(Random var1, Class7380[] var2, Class7380[] var3) {
      return !(var1.nextFloat() < this.field30534) ? method22083(var1, var2) : method22083(var1, var3);
   }

   private static Class7380 method22083(Random var0, Class7380[] var1) {
      return var1[var0.nextInt(var1.length)];
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32300;
   }
}
