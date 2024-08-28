package mapped;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import net.minecraft.util.text.*;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;
import net.minecraft.util.text.filter.IChatFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;

public class Class878 extends PlayerEntity implements Class876 {
   private static final Logger field4854 = LogManager.getLogger();
   public Class5111 field4855;
   public final Class314 field4856;
   public final Class9081 field4857;
   private final List<Integer> field4858 = Lists.newLinkedList();
   private final Class8019 field4859;
   private final Class8287 field4860;
   private float field4861 = Float.MIN_VALUE;
   private int field4862 = Integer.MIN_VALUE;
   private int field4863 = Integer.MIN_VALUE;
   private int field4864 = Integer.MIN_VALUE;
   private int field4865 = Integer.MIN_VALUE;
   private int field4866 = Integer.MIN_VALUE;
   private float field4867 = -1.0E8F;
   private int field4868 = -99999999;
   private boolean field4869 = true;
   private int field4870 = -99999999;
   private int field4871 = 60;
   private Class2153 field4872;
   private boolean field4873 = true;
   private long field4874 = Util.method38487();
   private Entity field4875;
   private boolean field4876;
   private boolean field4877;
   private final Class6942 field4878 = new Class6942();
   private Vector3d field4879;
   private int field4880;
   private boolean field4881;
   private Vector3d field4882;
   private Class2002 field4883 = Class2002.method8389(0, 0, 0);
   private Class8705<Class1655> field4884 = Class1655.field8999;
   private BlockPos field4885;
   private boolean field4886;
   private float field4887;
   private final IChatFilter field4888;
   private int field4889;
   public boolean field4890;
   public int field4891;
   public boolean field4892;

   public Class878(Class314 var1, Class1657 var2, GameProfile var3, Class9081 var4) {
      super(var2, var2.method6947(), var2.method6948(), var3);
      var4.field41571 = this;
      this.field4857 = var4;
      this.field4856 = var1;
      this.field4860 = var1.method1367().method19485(this);
      this.field4859 = var1.method1367().method19486(this);
      this.field5051 = 1.0F;
      this.method2721(var2);
      this.field4888 = var1.method1438(this);
   }

   private void method2721(Class1657 var1) {
      BlockPos var4 = var1.method6947();
      if (var1.method6812().method36875() && var1.method6715().method1436().method20067() != Class1894.field11104) {
         int var5 = Math.max(0, this.field4856.method1395(var1));
         int var6 = Class9679.method37769(var1.method6810().method24528((double)var4.method8304(), (double)var4.method8306()));
         if (var6 < var5) {
            var5 = var6;
         }

         if (var6 <= 1) {
            var5 = 1;
         }

         long var7 = (long)(var5 * 2 + 1);
         long var9 = var7 * var7;
         int var11 = var9 <= 2147483647L ? (int)var9 : Integer.MAX_VALUE;
         int var12 = this.method2722(var11);
         int var13 = new Random().nextInt(var11);

         for (int var14 = 0; var14 < var11; var14++) {
            int var15 = (var13 + var12 * var14) % var11;
            int var16 = var15 % (var5 * 2 + 1);
            int var17 = var15 / (var5 * 2 + 1);
            BlockPos var18 = Class6878.method20940(var1, var4.method8304() + var16 - var5, var4.method8306() + var17 - var5, false);
            if (var18 != null) {
               this.method3272(var18, 0.0F, 0.0F);
               if (var1.method7052(this)) {
                  break;
               }
            }
         }
      } else {
         this.method3272(var4, 0.0F, 0.0F);

         while (!var1.method7052(this) && this.getPosY() < 255.0) {
            this.method3215(this.getPosX(), this.getPosY() + 1.0, this.getPosZ());
         }
      }
   }

   private int method2722(int var1) {
      return var1 > 16 ? 17 : var1 - 1;
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method119("playerGameType", 99)) {
         if (!this.method3396().method1380()) {
            this.field4857
               .method33862(
                  Class1894.method8159(var1.method122("playerGameType")),
                  !var1.method119("previousPlayerGameType", 3) ? Class1894.field11101 : Class1894.method8159(var1.method122("previousPlayerGameType"))
               );
         } else {
            this.field4857.method33862(this.method3396().method1286(), Class1894.field11101);
         }
      }

      if (var1.method119("enteredNetherPosition", 10)) {
         Class39 var4 = var1.method130("enteredNetherPosition");
         this.field4882 = new Vector3d(var4.method125("x"), var4.method125("y"), var4.method125("z"));
      }

      this.field4877 = var1.method132("seenCredits");
      if (var1.method119("recipeBook", 10)) {
         this.field4878.method21380(var1.method130("recipeBook"), this.field4856.method1407());
      }

      if (this.method3176()) {
         this.method2907();
      }

      if (var1.method119("SpawnX", 99) && var1.method119("SpawnY", 99) && var1.method119("SpawnZ", 99)) {
         this.field4885 = new BlockPos(var1.method122("SpawnX"), var1.method122("SpawnY"), var1.method122("SpawnZ"));
         this.field4886 = var1.method132("SpawnForced");
         this.field4887 = var1.method124("SpawnAngle");
         if (var1.method118("SpawnDimension")) {
            this.field4884 = Class1655.field8998
               .parse(Class8063.field34602, var1.method116("SpawnDimension"))
               .resultOrPartial(field4854::error)
               .orElse(Class1655.field8999);
         }
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("playerGameType", this.field4857.method33863().method8152());
      var1.method102("previousPlayerGameType", this.field4857.method33864().method8152());
      var1.method115("seenCredits", this.field4877);
      if (this.field4882 != null) {
         Class39 var4 = new Class39();
         var4.method108("x", this.field4882.field18048);
         var4.method108("y", this.field4882.field18049);
         var4.method108("z", this.field4882.field18050);
         var1.method99("enteredNetherPosition", var4);
      }

      Entity var8 = this.method3415();
      Entity var5 = this.method3421();
      if (var5 != null && var8 != this && var8.method3413()) {
         Class39 var6 = new Class39();
         Class39 var7 = new Class39();
         var8.method3293(var7);
         var6.method104("Attach", var5.method3375());
         var6.method99("Entity", var7);
         var1.method99("RootVehicle", var6);
      }

      var1.method99("recipeBook", this.field4878.method21379());
      var1.method109("Dimension", this.field5024.method6813().method31399().toString());
      if (this.field4885 != null) {
         var1.method102("SpawnX", this.field4885.method8304());
         var1.method102("SpawnY", this.field4885.getY());
         var1.method102("SpawnZ", this.field4885.method8306());
         var1.method115("SpawnForced", this.field4886);
         var1.method107("SpawnAngle", this.field4887);
         ResourceLocation.field13020
            .encodeStart(Class8063.field34602, this.field4884.method31399())
            .resultOrPartial(field4854::error)
            .ifPresent(var1x -> var1.method99("SpawnDimension", var1x));
      }
   }

   public void method2725(int var1) {
      float var4 = (float)this.method2930();
      float var5 = (var4 - 1.0F) / var4;
      this.field4922 = Class9679.method37777((float)var1 / var4, 0.0F, var5);
      this.field4870 = -1;
   }

   public void method2726(int var1) {
      this.field4920 = var1;
      this.field4870 = -1;
   }

   @Override
   public void method2727(int var1) {
      super.method2727(var1);
      this.field4870 = -1;
   }

   @Override
   public void method2728(Class8848 var1, int var2) {
      super.method2728(var1, var2);
      this.field4870 = -1;
   }

   public void method2729() {
      this.field4905.method18127(this);
   }

   @Override
   public void method2730() {
      super.method2730();
      this.field4855.method15671(new Class5565(this.method3073(), Class1900.field11155));
   }

   @Override
   public void method2731() {
      super.method2731();
      this.field4855.method15671(new Class5565(this.method3073(), Class1900.field11156));
   }

   @Override
   public void method2732(Class7380 var1) {
      Class9551.field44468.method15169(this, var1);
   }

   @Override
   public Class6462 method2733() {
      return new Class6461(this);
   }

   @Override
   public void tick() {
      this.field4857.method33856();
      this.field4871--;
      if (this.field5061 > 0) {
         this.field5061--;
      }

      this.field4905.method18130();
      if (!this.field5024.field9020 && !this.field4905.method18103(this)) {
         this.method2772();
         this.field4905 = this.field4904;
      }

      while (!this.field4858.isEmpty()) {
         int var3 = Math.min(this.field4858.size(), Integer.MAX_VALUE);
         int[] var4 = new int[var3];
         Iterator var5 = this.field4858.iterator();
         int var6 = 0;

         while (var5.hasNext() && var6 < var3) {
            var4[var6++] = (Integer)var5.next();
            var5.remove();
         }

         this.field4855.method15671(new Class5484(var4));
      }

      Entity var7 = this.method2814();
      if (var7 != this) {
         if (!var7.method3066()) {
            this.method2815(this);
         } else {
            this.method3269(var7.getPosX(), var7.getPosY(), var7.getPosZ(), var7.field5031, var7.field5032);
            this.method2798().method6883().method7376(this);
            if (this.method2852()) {
               this.method2815(this);
            }
         }
      }

      Class9551.field44487.method15046(this);
      if (this.field4879 != null) {
         Class9551.field44485.method15118(this, this.field4879, this.field5055 - this.field4880);
      }

      this.field4859.method27414(this);
   }

   public void method2735() {
      try {
         if (!this.method2800() || this.field5024.method7017(this.method3432())) {
            super.tick();
         }

         for (int var3 = 0; var3 < this.field4902.method3629(); var3++) {
            Class8848 var7 = this.field4902.method3618(var3);
            if (var7.method32107().method11726()) {
               Packet var8 = ((Class3314)var7.method32107()).method11858(var7, this.field5024, this);
               if (var8 != null) {
                  this.field4855.method15671(var8);
               }
            }
         }

         if (this.method3042() != this.field4867 || this.field4868 != this.field4906.method37574() || this.field4906.method37577() == 0.0F != this.field4869) {
            this.field4855.method15671(new Class5592(this.method3042(), this.field4906.method37574(), this.field4906.method37577()));
            this.field4867 = this.method3042();
            this.field4868 = this.field4906.method37574();
            this.field4869 = this.field4906.method37577() == 0.0F;
         }

         if (this.method3042() + this.method2959() != this.field4861) {
            this.field4861 = this.method3042() + this.method2959();
            this.method2736(Class9008.field41194, Class9679.method37773(this.field4861));
         }

         if (this.field4906.method37574() != this.field4862) {
            this.field4862 = this.field4906.method37574();
            this.method2736(Class9008.field41195, Class9679.method37773((float)this.field4862));
         }

         if (this.method3351() != this.field4863) {
            this.field4863 = this.method3351();
            this.method2736(Class9008.field41196, Class9679.method37773((float)this.field4863));
         }

         if (this.method3070() != this.field4864) {
            this.field4864 = this.method3070();
            this.method2736(Class9008.field41197, Class9679.method37773((float)this.field4864));
         }

         if (this.field4921 != this.field4866) {
            this.field4866 = this.field4921;
            this.method2736(Class9008.field41198, Class9679.method37773((float)this.field4866));
         }

         if (this.field4920 != this.field4865) {
            this.field4865 = this.field4920;
            this.method2736(Class9008.field41199, Class9679.method37773((float)this.field4865));
         }

         if (this.field4921 != this.field4870) {
            this.field4870 = this.field4921;
            this.field4855.method15671(new Class5507(this.field4922, this.field4921, this.field4920));
         }

         if (this.field5055 % 20 == 0) {
            Class9551.field44480.method15062(this);
         }
      } catch (Throwable var6) {
         Class4526 var4 = Class4526.method14413(var6, "Ticking player");
         Class8965 var5 = var4.method14410("Player being ticked");
         this.method3372(var5);
         throw new Class2506(var4);
      }
   }

   private void method2736(Class9008 var1, int var2) {
      this.method2953().method20978(var1, this.method2956(), var1x -> var1x.method36052(var2));
   }

   @Override
   public void method2737(Class8654 var1) {
      boolean var4 = this.field5024.method6789().method17135(Class5462.field24234);
      if (!var4) {
         this.field4855.method15671(new Class5565(this.method3073(), Class1900.field11157));
      } else {
         ITextComponent var5 = this.method3073().method27600();
         this.field4855
            .method15672(
               new Class5565(this.method3073(), Class1900.field11157, var5),
               var2 -> {
                  if (!var2.isSuccess()) {
                     short var5x = 256;
                     String var6x = var5.getStringTruncated(256);
                     TranslationTextComponent var7x = new TranslationTextComponent(
                        "death.attack.message_too_long", new StringTextComponent(var6x).mergeStyle(TextFormatting.YELLOW)
                     );
                     IFormattableTextComponent var8 = new TranslationTextComponent("death.attack.even_more_magic", this.method2954())
                        .modifyStyle(var1xx -> var1xx.setHoverEvent(new HoverEvent(HoverEvent$Action.SHOW_TEXT, var7x)));
                     this.field4855.method15671(new Class5565(this.method3073(), Class1900.field11157, var8));
                  }
               }
            );
         Class8219 var6 = this.method3344();
         if (var6 == null || var6.method28583() == Class2225.field14554) {
            this.field4856.method1367().method19484(var5, ChatType.SYSTEM, Util.field45724);
         } else if (var6.method28583() != Class2225.field14556) {
            if (var6.method28583() == Class2225.field14557) {
               this.field4856.method1367().method19459(this, var5);
            }
         } else {
            this.field4856.method1367().method19458(this, var5);
         }
      }

      this.method2949();
      if (this.field5024.method6789().method17135(Class5462.field24254)) {
         this.method2738();
      }

      if (!this.method2800()) {
         this.method3052(var1);
      }

      this.method2953().method20978(Class9008.field41191, this.method2956(), Class9411::method36049);
      Class880 var7 = this.method3074();
      if (var7 != null) {
         this.method2913(Class8876.field40103.method172(var7.method3204()));
         var7.method2739(this, this.field4979, var1);
         this.method3051(var7);
      }

      this.field5024.method6786(this, (byte)3);
      this.method2911(Class8876.field40134);
      this.method2777(Class8876.field40104.method172(Class8876.field40107));
      this.method2777(Class8876.field40104.method172(Class8876.field40108));
      this.method3223();
      this.method3349(0, false);
      this.method3073().method27606();
   }

   private void method2738() {
      Class6488 var3 = new Class6488(this.method3432()).method19663(32.0, 10.0, 32.0);
      this.field5024
         .<Class1006>method7183(Class1006.class, var3)
         .stream()
         .filter(var0 -> var0 instanceof Class1011)
         .forEach(var1 -> ((Class1011)var1).method4370(this));
   }

   @Override
   public void method2739(Entity var1, int var2, Class8654 var3) {
      if (var1 != this) {
         super.method2739(var1, var2, var3);
         this.method2876(var2);
         String var6 = this.method2956();
         String var7 = var1.method2956();
         this.method2953().method20978(Class9008.field41193, var6, Class9411::method36049);
         if (!(var1 instanceof PlayerEntity)) {
            this.method2911(Class8876.field40135);
         } else {
            this.method2911(Class8876.field40137);
            this.method2953().method20978(Class9008.field41192, var6, Class9411::method36049);
         }

         this.method2740(var6, var7, Class9008.field41200);
         this.method2740(var7, var6, Class9008.field41201);
         Class9551.field44466.method15158(this, var1, var3);
      }
   }

   private void method2740(String var1, String var2, Class9008[] var3) {
      Class8218 var6 = this.method2953().method20998(var2);
      if (var6 != null) {
         int var7 = var6.method28591().getColorIndex();
         if (var7 >= 0 && var7 < var3.length) {
            this.method2953().method20978(var3[var7], var1, Class9411::method36049);
         }
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method2760(var1)) {
         return false;
      } else {
         boolean var5 = this.field4856.method1348() && this.method2743() && "fall".equals(var1.field39022);
         if (!var5 && this.field4871 > 0 && var1 != Class8654.field39004) {
            return false;
         } else {
            if (var1 instanceof Class8652) {
               Entity var6 = var1.method31109();
               if (var6 instanceof PlayerEntity && !this.method2742((PlayerEntity)var6)) {
                  return false;
               }

               if (var6 instanceof Class884) {
                  Class884 var7 = (Class884)var6;
                  Entity var8 = var7.method3460();
                  if (var8 instanceof PlayerEntity && !this.method2742((PlayerEntity)var8)) {
                     return false;
                  }
               }
            }

            return super.method2741(var1, var2);
         }
      }
   }

   @Override
   public boolean method2742(PlayerEntity var1) {
      return this.method2743() ? super.method2742(var1) : false;
   }

   private boolean method2743() {
      return this.field4856.method1357();
   }

   @Nullable
   @Override
   public Class9761 method2744(Class1657 var1) {
      Class9761 var4 = super.method2744(var1);
      if (var4 != null && this.field5024.method6813() == Class1655.field8999 && var1.method6813() == Class1655.field9001) {
         Vector3d var5 = var4.field45665.method11339(0.0, -1.0, 0.0);
         return new Class9761(var5, Vector3d.field18047, 90.0F, 0.0F);
      } else {
         return var4;
      }
   }

   @Nullable
   @Override
   public Entity method2745(Class1657 var1) {
      this.field4876 = true;
      Class1657 var4 = this.method2798();
      Class8705 var5 = var4.method6813();
      if (var5 == Class1655.field9001 && var1.method6813() == Class1655.field8999) {
         this.method3200();
         this.method2798().method6934(this);
         if (!this.field4892) {
            this.field4892 = true;
            this.field4855.method15671(new Class5534(Class5534.field24564, !this.field4877 ? 1.0F : 0.0F));
            this.field4877 = true;
         }

         return this;
      } else {
         Class6612 var6 = var1.method6788();
         this.field4855
            .method15671(
               new Class5545(
                  var1.method6812(),
                  var1.method6813(),
                  Class6668.method20321(var1.method6967()),
                  this.field4857.method33863(),
                  this.field4857.method33864(),
                  var1.method6823(),
                  var1.method6966(),
                  true
               )
            );
         this.field4855.method15671(new Class5535(var6.method20047(), var6.method20048()));
         Class6395 var7 = this.field4856.method1367();
         var7.method19454(this);
         var4.method6934(this);
         this.field5041 = false;
         Class9761 var8 = this.method2744(var1);
         if (var8 != null) {
            var4.method6820().method22503("moving");
            if (var5 == Class1655.field8999 && var1.method6813() == Class1655.field9000) {
               this.field4882 = this.method3431();
            } else if (var1.method6813() == Class1655.field9001) {
               this.method2746(var1, new BlockPos(var8.field45665));
            }

            var4.method6820().method22505();
            var4.method6820().method22503("placing");
            this.method3268(var1);
            var1.method6920(this);
            this.method3214(var8.field45667, var8.field45668);
            this.method2794(var8.field45665.field18048, var8.field45665.field18049, var8.field45665.field18050);
            var4.method6820().method22505();
            this.method2748(var4);
            this.field4857.method33871(var1);
            this.field4855.method15671(new Class5599(this.field4919));
            var7.method19472(this, var1);
            var7.method19473(this);

            for (Class2023 var10 : this.method3031()) {
               this.field4855.method15671(new Class5537(this.method3205(), var10));
            }

            this.field4855.method15671(new Class5481(1032, BlockPos.field13032, 0, false));
            this.field4870 = -1;
            this.field4867 = -1.0F;
            this.field4868 = -1;
         }

         return this;
      }
   }

   private void method2746(Class1657 var1, BlockPos var2) {
      Mutable var5 = var2.method8354();

      for (int var6 = -2; var6 <= 2; var6++) {
         for (int var7 = -2; var7 <= 2; var7++) {
            for (int var8 = -1; var8 < 3; var8++) {
               Class7380 var9 = var8 != -1 ? Class8487.field36387.method11579() : Class8487.field36527.method11579();
               var1.method6730(var5.method8374(var2).method8381(var7, var8, var6), var9);
            }
         }
      }
   }

   @Override
   public Optional<Class9502> method2747(Class1657 var1, BlockPos var2, boolean var3) {
      Optional var6 = super.method2747(var1, var2, var3);
      if (!var6.isPresent()) {
         Class113 var7 = this.field5024.method6738(this.field5082).<Class113>method23464(Class3401.field19060).orElse(Class113.field413);
         Optional var8 = var1.method6937().method12332(var2, var7);
         if (!var8.isPresent()) {
            field4854.error("Unable to create a portal, likely target out of worldborder");
         }

         return var8;
      } else {
         return var6;
      }
   }

   private void method2748(Class1657 var1) {
      Class8705 var4 = var1.method6813();
      Class8705 var5 = this.field5024.method6813();
      Class9551.field44486.method15146(this, var4, var5);
      if (var4 == Class1655.field9000 && var5 == Class1655.field8999 && this.field4882 != null) {
         Class9551.field44493.method15143(this, this.field4882);
      }

      if (var5 != Class1655.field9000) {
         this.field4882 = null;
      }
   }

   @Override
   public boolean method2749(Class878 var1) {
      if (!var1.method2800()) {
         return !this.method2800() ? super.method2749(var1) : false;
      } else {
         return this.method2814() == this;
      }
   }

   private void method2750(Class944 var1) {
      if (var1 != null) {
         Class5610 var4 = var1.method3776();
         if (var4 != null) {
            this.field4855.method15671(var4);
         }
      }
   }

   @Override
   public void method2751(Entity var1, int var2) {
      super.method2751(var1, var2);
      this.field4905.method18130();
   }

   @Override
   public Either<Class2104, Class2341> method2752(BlockPos var1) {
      Direction var4 = this.field5024.method6738(var1).<Direction>method23463(Class3198.field18484);
      if (this.method3176() || !this.method3066()) {
         return Either.left(Class2104.field13718);
      } else if (!this.field5024.method6812().method36878()) {
         return Either.left(Class2104.field13714);
      } else if (!this.method2754(var1, var4)) {
         return Either.left(Class2104.field13716);
      } else if (!this.method2756(var1, var4)) {
         this.method2829(this.field5024.method6813(), var1, this.field5031, false, true);
         if (!this.field5024.method6740()) {
            if (!this.method2801()) {
               double var6 = 8.0;
               double var8 = 5.0;
               Vector3d var10 = Vector3d.method11330(var1);
               List var11 = this.field5024
                  .<Class1009>method6772(
                     Class1009.class,
                     new Class6488(
                        var10.method11320() - 8.0,
                        var10.method11321() - 5.0,
                        var10.method11322() - 8.0,
                        var10.method11320() + 8.0,
                        var10.method11321() + 5.0,
                        var10.method11322() + 8.0
                     ),
                     var1x -> var1x.method4344(this)
                  );
               if (!var11.isEmpty()) {
                  return Either.left(Class2104.field13719);
               }
            }

            Either var5 = super.method2752(var1).ifRight(var1x -> {
               this.method2911(Class8876.field40162);
               Class9551.field44481.method15062(this);
            });
            ((Class1657)this.field5024).method6902();
            return var5;
         } else {
            return Either.left(Class2104.field13715);
         }
      } else {
         return Either.left(Class2104.field13717);
      }
   }

   @Override
   public void method2753(BlockPos var1) {
      this.method2777(Class8876.field40104.method172(Class8876.field40108));
      super.method2753(var1);
   }

   private boolean method2754(BlockPos var1, Direction var2) {
      return this.method2755(var1) || this.method2755(var1.method8349(var2.method536()));
   }

   private boolean method2755(BlockPos var1) {
      Vector3d var4 = Vector3d.method11330(var1);
      return Math.abs(this.getPosX() - var4.method11320()) <= 3.0
         && Math.abs(this.getPosY() - var4.method11321()) <= 2.0
         && Math.abs(this.getPosZ() - var4.method11322()) <= 3.0;
   }

   private boolean method2756(BlockPos var1, Direction var2) {
      BlockPos var5 = var1.method8311();
      return !this.method2917(var5) || !this.method2917(var5.method8349(var2.method536()));
   }

   @Override
   public void method2757(boolean var1, boolean var2) {
      if (this.method3176()) {
         this.method2798().method6883().method7379(this, new Class5469(this, 2));
      }

      super.method2757(var1, var2);
      if (this.field4855 != null) {
         this.field4855.method15668(this.getPosX(), this.getPosY(), this.getPosZ(), this.field5031, this.field5032);
      }
   }

   @Override
   public boolean method2758(Entity var1, boolean var2) {
      Entity var5 = this.method3421();
      if (super.method2758(var1, var2)) {
         Entity var6 = this.method3421();
         if (var6 != var5 && this.field4855 != null) {
            this.field4855.method15668(this.getPosX(), this.getPosY(), this.getPosZ(), this.field5031, this.field5032);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method2759() {
      Entity var3 = this.method3421();
      super.method2759();
      Entity var4 = this.method3421();
      if (var4 != var3 && this.field4855 != null) {
         this.field4855.method15668(this.getPosX(), this.getPosY(), this.getPosZ(), this.field5031, this.field5032);
      }
   }

   @Override
   public boolean method2760(Class8654 var1) {
      return super.method2760(var1) || this.method2821() || this.field4919.field29606 && var1 == Class8654.field39007;
   }

   @Override
   public void method2761(double var1, boolean var3, Class7380 var4, BlockPos var5) {
   }

   @Override
   public void method2762(BlockPos var1) {
      if (!this.method2800()) {
         super.method2762(var1);
      }
   }

   public void method2763(double var1, boolean var3) {
      BlockPos var6 = this.method3228();
      if (this.field5024.method7017(var6)) {
         super.method2761(var1, var3, this.field5024.method6738(var6), var6);
      }
   }

   @Override
   public void method2764(Class954 var1) {
      var1.method3840(this);
      this.field4855.method15671(new Class5491(var1.method3774()));
   }

   private void method2765() {
      this.field4889 = this.field4889 % 100 + 1;
   }

   @Override
   public OptionalInt method2766(Class949 var1) {
      if (var1 != null) {
         if (this.field4905 != this.field4904) {
            this.method2772();
         }

         this.method2765();
         Class5812 var4 = var1.method3627(this.field4889, this.field4902, this);
         if (var4 != null) {
            this.field4855.method15671(new Class5498(var4.field25471, var4.method18109(), var1.method2954()));
            var4.method18127(this);
            this.field4905 = var4;
            return OptionalInt.of(this.field4889);
         } else {
            if (this.method2800()) {
               this.method2785(new TranslationTextComponent("container.spectatorCantOpen").mergeStyle(TextFormatting.RED), true);
            }

            return OptionalInt.empty();
         }
      } else {
         return OptionalInt.empty();
      }
   }

   @Override
   public void method2767(int var1, Class46 var2, int var3, int var4, boolean var5, boolean var6) {
      this.field4855.method15671(new Class5504(var1, var2, var3, var4, var5, var6));
   }

   @Override
   public void method2768(Class1068 var1, Class920 var2) {
      if (this.field4905 != this.field4904) {
         this.method2772();
      }

      this.method2765();
      this.field4855.method15671(new Class5508(this.field4889, var2.method3629(), var1.method3205()));
      this.field4905 = new Class5827(this.field4889, this.field4902, var2, var1);
      this.field4905.method18127(this);
   }

   @Override
   public void method2769(Class8848 var1, Class79 var2) {
      Class3257 var5 = var1.method32107();
      if (var5 == Class8514.field38048) {
         if (Class3285.method11820(var1, this.method3423(), this)) {
            this.field4905.method18130();
         }

         this.field4855.method15671(new Class5509(var2));
      }
   }

   @Override
   public void method2770(Class969 var1) {
      var1.method4019(true);
      this.method2750(var1);
   }

   @Override
   public void method2720(Class5812 var1, int var2, Class8848 var3) {
      if (!(var1.method18131(var2) instanceof Class5856)) {
         if (var1 == this.field4904) {
            Class9551.field44469.method15086(this, this.field4902, var3);
         }

         if (!this.field4890) {
            this.field4855.method15671(new Class5501(var1.field25471, var2, var3));
         }
      }
   }

   public void method2771(Class5812 var1) {
      this.method2718(var1, var1.method18129());
   }

   @Override
   public void method2718(Class5812 var1, Class25<Class8848> var2) {
      this.field4855.method15671(new Class5614(var1.field25471, var2));
      this.field4855.method15671(new Class5501(-1, -1, this.field4902.method4057()));
   }

   @Override
   public void method2719(Class5812 var1, int var2, int var3) {
      this.field4855.method15671(new Class5480(var1.field25471, var2, var3));
   }

   @Override
   public void method2772() {
      this.field4855.method15671(new Class5586(this.field4905.field25471));
      this.method2774();
   }

   public void method2773() {
      if (!this.field4890) {
         this.field4855.method15671(new Class5501(-1, -1, this.field4902.method4057()));
      }
   }

   public void method2774() {
      this.field4905.method18113(this);
      this.field4905 = this.field4904;
   }

   public void method2775(float var1, float var2, boolean var3, boolean var4) {
      if (this.method3328()) {
         if (var1 >= -1.0F && var1 <= 1.0F) {
            this.field4982 = var1;
         }

         if (var2 >= -1.0F && var2 <= 1.0F) {
            this.field4984 = var2;
         }

         this.field4981 = var3;
         this.method3330(var4);
      }
   }

   @Override
   public void method2776(Class9007<?> var1, int var2) {
      this.field4860.method28958(this, var1, var2);
      this.method2953().method20978(var1, this.method2956(), var1x -> var1x.method36048(var2));
   }

   @Override
   public void method2777(Class9007<?> var1) {
      this.field4860.method28959(this, var1, 0);
      this.method2953().method20978(var1, this.method2956(), Class9411::method36051);
   }

   @Override
   public int method2778(Collection<Class4843<?>> var1) {
      return this.field4878.method21376(var1, this);
   }

   @Override
   public void method2779(ResourceLocation[] var1) {
      ArrayList var4 = Lists.newArrayList();

      for (ResourceLocation var8 : var1) {
         this.field4856.method1407().method1035(var8).ifPresent(var4::add);
      }

      this.method2778(var4);
   }

   @Override
   public int method2780(Collection<Class4843<?>> var1) {
      return this.field4878.method21377(var1, this);
   }

   @Override
   public void method2781(int var1) {
      super.method2781(var1);
      this.field4870 = -1;
   }

   public void method2782() {
      this.field4881 = true;
      this.method3315();
      if (this.method3176()) {
         this.method2757(true, false);
      }
   }

   public boolean method2783() {
      return this.field4881;
   }

   public void method2784() {
      this.field4867 = -1.0E8F;
   }

   @Override
   public void method2785(ITextComponent var1, boolean var2) {
      this.field4855.method15671(new Class5616(var1, !var2 ? ChatType.CHAT : ChatType.GAME_INFO, Util.field45724));
   }

   @Override
   public void method2786() {
      if (!this.field5001.method32105() && this.method3148()) {
         this.field4855.method15671(new Class5464(this, (byte)9));
         super.method2786();
      }
   }

   @Override
   public void method2787(Class2062 var1, Vector3d var2) {
      super.method2787(var1, var2);
      this.field4855.method15671(new Class5602(var1, var2.field18048, var2.field18049, var2.field18050));
   }

   public void method2788(Class2062 var1, Entity var2, Class2062 var3) {
      Vector3d var6 = var3.method8711(var2);
      super.method2787(var1, var6);
      this.field4855.method15671(new Class5602(var1, var2, var3));
   }

   public void method2789(Class878 var1, boolean var2) {
      if (!var2) {
         if (this.field5024.method6789().method17135(Class5462.field24225) || var1.method2800()) {
            this.field4902.method4060(var1.field4902);
            this.field4920 = var1.field4920;
            this.field4921 = var1.field4921;
            this.field4922 = var1.field4922;
            this.method2875(var1.method2874());
         }
      } else {
         this.field4902.method4060(var1.field4902);
         this.method3043(var1.method3042());
         this.field4906 = var1.field4906;
         this.field4920 = var1.field4920;
         this.field4921 = var1.field4921;
         this.field4922 = var1.field4922;
         this.method2875(var1.method2874());
         this.field5082 = var1.field5082;
      }

      this.field4923 = var1.field4923;
      this.field4903 = var1.field4903;
      this.method3210().method35446(field4897, var1.method3210().<Byte>method35445(field4897));
      this.field4870 = -1;
      this.field4867 = -1.0F;
      this.field4868 = -1;
      this.field4878.method21357(var1.field4878);
      this.field4858.addAll(var1.field4858);
      this.field4877 = var1.field4877;
      this.field4882 = var1.field4882;
      this.method2970(var1.method2969());
      this.method2972(var1.method2971());
   }

   @Override
   public void method2790(Class2023 var1) {
      super.method2790(var1);
      this.field4855.method15671(new Class5537(this.method3205(), var1));
      if (var1.method8627() == Class8254.field35491) {
         this.field4880 = this.field5055;
         this.field4879 = this.method3431();
      }

      Class9551.field44491.method15083(this);
   }

   @Override
   public void method2791(Class2023 var1, boolean var2) {
      super.method2791(var1, var2);
      this.field4855.method15671(new Class5537(this.method3205(), var1));
      Class9551.field44491.method15083(this);
   }

   @Override
   public void method2792(Class2023 var1) {
      super.method2792(var1);
      this.field4855.method15671(new Class5518(this.method3205(), var1.method8627()));
      if (var1.method8627() == Class8254.field35491) {
         this.field4879 = null;
      }

      Class9551.field44491.method15083(this);
   }

   @Override
   public void method2793(double var1, double var3, double var5) {
      this.field4855.method15668(var1, var3, var5, this.field5031, this.field5032);
   }

   @Override
   public void method2794(double var1, double var3, double var5) {
      this.method2793(var1, var3, var5);
      this.field4855.method15656();
   }

   @Override
   public void method2795(Entity var1) {
      this.method2798().method6883().method7379(this, new Class5469(var1, 4));
   }

   @Override
   public void method2796(Entity var1) {
      this.method2798().method6883().method7379(this, new Class5469(var1, 5));
   }

   @Override
   public void method2797() {
      if (this.field4855 != null) {
         this.field4855.method15671(new Class5599(this.field4919));
         this.method2813();
      }
   }

   public Class1657 method2798() {
      return (Class1657)this.field5024;
   }

   @Override
   public void method2799(Class1894 var1) {
      this.field4857.method33861(var1);
      this.field4855.method15671(new Class5534(Class5534.field24563, (float)var1.method8152()));
      if (var1 != Class1894.field11105) {
         this.method2815(this);
      } else {
         this.method2949();
         this.method2759();
      }

      this.method2797();
      this.method3147();
   }

   @Override
   public boolean method2800() {
      return this.field4857.method33863() == Class1894.field11105;
   }

   @Override
   public boolean method2801() {
      return this.field4857.method33863() == Class1894.field11103;
   }

   @Override
   public void method1328(ITextComponent var1, UUID var2) {
      this.method2802(var1, ChatType.SYSTEM, var2);
   }

   public void method2802(ITextComponent var1, ChatType var2, UUID var3) {
      this.field4855
         .method15672(
            new Class5616(var1, var2, var3),
            var4 -> {
               if (!var4.isSuccess() && (var2 == ChatType.GAME_INFO || var2 == ChatType.SYSTEM)) {
                  short var7 = 256;
                  String var8 = var1.getStringTruncated(256);
                  IFormattableTextComponent var9 = new StringTextComponent(var8).mergeStyle(TextFormatting.YELLOW);
                  this.field4855
                     .method15671(
                        new Class5616(
                           new TranslationTextComponent("multiplayer.message_not_delivered", var9).mergeStyle(TextFormatting.RED), ChatType.SYSTEM, var3
                        )
                     );
               }
            }
         );
   }

   public String method2803() {
      String var3 = this.field4855.field23224.method30700().toString();
      var3 = var3.substring(var3.indexOf("/") + 1);
      return var3.substring(0, var3.indexOf(":"));
   }

   public void method2804(Class5561 var1) {
      this.field4872 = var1.method17481();
      this.field4873 = var1.method17482();
      this.method3210().method35446(field4897, (byte)var1.method17483());
      this.method3210().method35446(field4898, (byte)(var1.method17484() != Class2205.field14417 ? 1 : 0));
   }

   public Class2153 method2805() {
      return this.field4872;
   }

   public void method2806(String var1, String var2) {
      this.field4855.method15671(new Class5528(var1, var2));
   }

   @Override
   public int method2807() {
      return this.field4856.method1418(this.method2906());
   }

   public void method2808() {
      this.field4874 = Util.method38487();
   }

   public Class8287 method2809() {
      return this.field4860;
   }

   public Class6942 method2810() {
      return this.field4878;
   }

   public void method2811(Entity var1) {
      if (!(var1 instanceof PlayerEntity)) {
         this.field4858.add(var1.method3205());
      } else {
         this.field4855.method15671(new Class5484(var1.method3205()));
      }
   }

   public void method2812(Entity var1) {
      this.field4858.remove(Integer.valueOf(var1.method3205()));
   }

   @Override
   public void method2813() {
      if (!this.method2800()) {
         super.method2813();
      } else {
         this.method3029();
         this.method3347(true);
      }
   }

   public Entity method2814() {
      return (Entity)(this.field4875 != null ? this.field4875 : this);
   }

   public void method2815(Entity var1) {
      Entity var4 = this.method2814();
      this.field4875 = (Entity)(var1 != null ? var1 : this);
      if (var4 != this.field4875) {
         this.field4855.method15671(new Class5560(this.field4875));
         this.method2793(this.field4875.getPosX(), this.field4875.getPosY(), this.field4875.getPosZ());
      }
   }

   @Override
   public void method2816() {
      if (!this.field4876) {
         super.method2816();
      }
   }

   @Override
   public void method2817(Entity var1) {
      if (this.field4857.method33863() != Class1894.field11105) {
         super.method2817(var1);
      } else {
         this.method2815(var1);
      }
   }

   public long method2818() {
      return this.field4874;
   }

   @Nullable
   public ITextComponent method2819() {
      return null;
   }

   @Override
   public void method2820(Class79 var1) {
      super.method2820(var1);
      this.method2975();
   }

   public boolean method2821() {
      return this.field4876;
   }

   public void method2822() {
      this.field4876 = false;
   }

   public Class8019 method2823() {
      return this.field4859;
   }

   public void method2824(Class1657 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method2815(this);
      this.method2759();
      if (var1 != this.field5024) {
         Class1657 var12 = this.method2798();
         Class6612 var13 = var1.method6788();
         this.field4855
            .method15671(
               new Class5545(
                  var1.method6812(),
                  var1.method6813(),
                  Class6668.method20321(var1.method6967()),
                  this.field4857.method33863(),
                  this.field4857.method33864(),
                  var1.method6823(),
                  var1.method6966(),
                  true
               )
            );
         this.field4855.method15671(new Class5535(var13.method20047(), var13.method20048()));
         this.field4856.method1367().method19454(this);
         var12.method6934(this);
         this.field5041 = false;
         this.method3273(var2, var4, var6, var8, var9);
         this.method3268(var1);
         var1.method6919(this);
         this.method2748(var12);
         this.field4855.method15668(var2, var4, var6, var8, var9);
         this.field4857.method33871(var1);
         this.field4856.method1367().method19472(this, var1);
         this.field4856.method1367().method19473(this);
      } else {
         this.field4855.method15668(var2, var4, var6, var8, var9);
      }
   }

   @Nullable
   public BlockPos method2825() {
      return this.field4885;
   }

   public float method2826() {
      return this.field4887;
   }

   public Class8705<Class1655> method2827() {
      return this.field4884;
   }

   public boolean method2828() {
      return this.field4886;
   }

   public void method2829(Class8705<Class1655> var1, BlockPos var2, float var3, boolean var4, boolean var5) {
      if (var2 == null) {
         this.field4885 = null;
         this.field4884 = Class1655.field8999;
         this.field4887 = 0.0F;
         this.field4886 = false;
      } else {
         boolean var8 = var2.equals(this.field4885) && var1.equals(this.field4884);
         if (var5 && !var8) {
            this.method1328(new TranslationTextComponent("block.minecraft.set_spawn"), Util.field45724);
         }

         this.field4885 = var2;
         this.field4884 = var1;
         this.field4887 = var3;
         this.field4886 = var4;
      }
   }

   public void method2830(Class7481 var1, Packet<?> var2, Packet<?> var3) {
      this.field4855.method15671(var3);
      this.field4855.method15671(var2);
   }

   public void method2831(Class7481 var1) {
      if (this.method3066()) {
         this.field4855.method15671(new Class5567(var1.field32174, var1.field32175));
      }
   }

   public Class2002 method2832() {
      return this.field4883;
   }

   public void method2833(Class2002 var1) {
      this.field4883 = var1;
   }

   @Override
   public void method2834(Class9455 var1, Class2266 var2, float var3, float var4) {
      this.field4855.method15671(new Class5584(var1, var2, this.getPosX(), this.getPosY(), this.getPosZ(), var3, var4));
   }

   @Override
   public Packet<?> method2835() {
      return new Class5596(this);
   }

   @Override
   public Class1000 method2836(Class8848 var1, boolean var2, boolean var3) {
      Class1000 var6 = super.method2836(var1, var2, var3);
      if (var6 != null) {
         this.field5024.method6916(var6);
         Class8848 var7 = var6.method4124();
         if (var3) {
            if (!var7.method32105()) {
               this.method2776(Class8876.field40101.method172(var7.method32107()), var1.method32179());
            }

            this.method2911(Class8876.field40126);
         }

         return var6;
      } else {
         return null;
      }
   }

   @Nullable
   public IChatFilter method2837() {
      return this.field4888;
   }
}
