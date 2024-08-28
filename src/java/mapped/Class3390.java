package mapped;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class3390 {
   public static final Direction[] field19003 = new Direction[]{
      Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH, Direction.field672, Direction.field673
   };
   public final Class8649 field19004;
   public final boolean field19005;
   public final float field19006;
   public final boolean field19007;
   public final Class8447 field19008;
   public final float field19009;
   public final float field19010;
   public final float field19011;
   public final boolean field19012;
   public final Class7929 field19013;
   public ResourceLocation field19014;

   public Class3390(Class7929 var1) {
      this.field19004 = Class7929.method26643(var1);
      this.field19005 = Class7929.method26644(var1);
      this.field19014 = Class7929.method26645(var1);
      this.field19006 = Class7929.method26646(var1);
      this.field19007 = Class7929.method26647(var1);
      this.field19008 = Class7929.method26648(var1);
      this.field19009 = Class7929.method26649(var1);
      this.field19010 = Class7929.method26650(var1);
      this.field19011 = Class7929.method26651(var1);
      this.field19012 = Class7929.method26652(var1);
      this.field19013 = var1;
   }

   @Deprecated
   public void method11618(Class7380 var1, Class1660 var2, BlockPos var3, int var4, int var5) {
   }

   @Deprecated
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      switch (Class8735.field39385[var4.ordinal()]) {
         case 1:
            return !var1.method23456(var2, var3);
         case 2:
            return var2.method6739(var3).method23486(Class8953.field40469);
         case 3:
            return !var1.method23456(var2, var3);
         default:
            return false;
      }
   }

   @Deprecated
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var1;
   }

   @Deprecated
   public boolean method11634(Class7380 var1, Class7380 var2, Direction var3) {
      return false;
   }

   @Deprecated
   public void method11506(Class7380 var1, Class1655 var2, BlockPos var3, Class3209 var4, BlockPos var5, boolean var6) {
      Class7393.method23618(var2, var3);
   }

   @Deprecated
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
   }

   @Deprecated
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (this.method11998() && !var1.method23448(var4.method23383())) {
         var2.method6762(var3);
      }
   }

   @Deprecated
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      return Class2274.field14820;
   }

   @Deprecated
   public boolean method11647(Class7380 var1, Class1655 var2, BlockPos var3, int var4, int var5) {
      return false;
   }

   @Deprecated
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Deprecated
   public boolean method11534(Class7380 var1) {
      return false;
   }

   @Deprecated
   public boolean method11516(Class7380 var1) {
      return false;
   }

   @Deprecated
   public Class2315 method11689(Class7380 var1) {
      return this.field19004.method31091();
   }

   @Deprecated
   public Class7379 method11498(Class7380 var1) {
      return Class9479.field44064.method25049();
   }

   @Deprecated
   public boolean method11648(Class7380 var1) {
      return false;
   }

   public Class2260 method11994() {
      return Class2260.field14702;
   }

   @Deprecated
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1;
   }

   @Deprecated
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1;
   }

   @Deprecated
   public boolean method11497(Class7380 var1, Class5909 var2) {
      return this.field19004.method31089() && (var2.method18357().method32105() || var2.method18357().method32107() != this.method11581());
   }

   @Deprecated
   public boolean method11650(Class7380 var1, Class7631 var2) {
      return this.field19004.method31089() || !this.field19004.method31086();
   }

   @Deprecated
   public List<Class8848> method11697(Class7380 var1, Class9464 var2) {
      ResourceLocation var5 = this.method11999();
      if (var5 != Class8793.field39533) {
         Class7812 var6 = var2.method36454(Class9525.field44336, var1).method36460(Class8524.field38292);
         Class1657 var7 = var6.method26090();
         Class7318 var8 = var7.method6715().method1411().method1058(var5);
         return var8.method23182(var6);
      } else {
         return Collections.<Class8848>emptyList();
      }
   }

   @Deprecated
   public long method11691(Class7380 var1, BlockPos var2) {
      return Class9679.method37809(var2);
   }

   @Deprecated
   public Class6408 method11503(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23412(var2, var3);
   }

   @Deprecated
   public Class6408 method11995(Class7380 var1, Class1665 var2, BlockPos var3) {
      return this.method11502(var1, var2, var3, Class4832.method14947());
   }

   @Deprecated
   public Class6408 method11938(Class7380 var1, Class1665 var2, BlockPos var3) {
      return Class8022.method27425();
   }

   @Deprecated
   public int method11996(Class7380 var1, Class1665 var2, BlockPos var3) {
      if (!var1.method23409(var2, var3)) {
         return !var1.method23386(var2, var3) ? 1 : 0;
      } else {
         return var2.method7033();
      }
   }

   @Nullable
   @Deprecated
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      return null;
   }

   @Deprecated
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return true;
   }

   @Deprecated
   public float method11636(Class7380 var1, Class1665 var2, BlockPos var3) {
      return !var1.method23456(var2, var3) ? 1.0F : 0.2F;
   }

   @Deprecated
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      return 0;
   }

   @Deprecated
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return Class8022.method27426();
   }

   @Deprecated
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return !this.field19005 ? Class8022.method27425() : var1.method23412(var2, var3);
   }

   @Deprecated
   public Class6408 method11635(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.method11502(var1, var2, var3, var4);
   }

   @Deprecated
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      this.method11522(var1, var2, var3, var4);
   }

   @Deprecated
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
   }

   @Deprecated
   public float method11997(Class7380 var1, PlayerEntity var2, Class1665 var3, BlockPos var4) {
      float var7 = var1.method23405(var3, var4);
      if (var7 != -1.0F) {
         int var8 = !var2.method2884(var1) ? 100 : 30;
         return var2.method2883(var1) / var7 / (float)var8;
      } else {
         return 0.0F;
      }
   }

   @Deprecated
   public void method11965(Class7380 var1, Class1657 var2, BlockPos var3, Class8848 var4) {
   }

   @Deprecated
   public void method11602(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4) {
   }

   @Deprecated
   public int method11514(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return 0;
   }

   @Deprecated
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
   }

   @Deprecated
   public int method11515(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return 0;
   }

   public final boolean method11998() {
      return this instanceof Class3245;
   }

   public final ResourceLocation method11999() {
      if (this.field19014 == null) {
         ResourceLocation var3 = Class2348.field16072.method9181(this.method11584());
         this.field19014 = new ResourceLocation(var3.method8293(), "blocks/" + var3.method8292());
      }

      return this.field19014;
   }

   @Deprecated
   public void method11595(Class1655 var1, Class7380 var2, Class8711 var3, Class882 var4) {
   }

   public abstract Class3257 method11581();

   public abstract Class3209 method11584();

   public Class7210 method12000() {
      return (Class7210)Class7929.method26653(this.field19013).apply(this.method11584().method11579());
   }
}
