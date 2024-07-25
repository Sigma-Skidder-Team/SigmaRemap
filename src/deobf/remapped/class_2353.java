package remapped;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_2353 {
   public static final Direction[] field_11817 = new Direction[]{
      Direction.field_809, Direction.field_804, Direction.field_818, Direction.field_800, Direction.field_802, Direction.field_817
   };
   public final class_5371 field_11820;
   public final boolean field_11822;
   public final float field_11824;
   public final boolean field_11818;
   public final class_4618 field_11819;
   public final float field_11816;
   public final float field_11814;
   public final float field_11825;
   public final boolean field_11823;
   public final class_3073 field_11821;
   public Identifier field_11815;

   public class_2353(class_3073 var1) {
      this.field_11820 = class_3073.method_14064(var1);
      this.field_11822 = class_3073.method_14090(var1);
      this.field_11815 = class_3073.method_14082(var1);
      this.field_11824 = class_3073.method_14076(var1);
      this.field_11818 = class_3073.method_14092(var1);
      this.field_11819 = class_3073.method_14072(var1);
      this.field_11816 = class_3073.method_14089(var1);
      this.field_11814 = class_3073.method_14091(var1);
      this.field_11825 = class_3073.method_14086(var1);
      this.field_11823 = class_3073.method_14063(var1);
      this.field_11821 = var1;
   }

   @Deprecated
   public void method_10804(class_2522 var1, class_9379 var2, class_1331 var3, int var4, int var5) {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Deprecated
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      switch (var4) {
         case field_14271:
            return !var1.method_8306(var2, var3);
         case field_14272:
            return var2.method_28258(var3).method_22007(class_6503.field_33094);
         case field_14275:
            return !var1.method_8306(var2, var3);
         default:
            return false;
      }
   }

   @Deprecated
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var1;
   }

   @Deprecated
   public boolean method_10764(class_2522 var1, class_2522 var2, Direction var3) {
      return false;
   }

   @Deprecated
   public void method_10801(class_2522 var1, World var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      class_1892.method_8430(var2, var3);
   }

   @Deprecated
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
   }

   @Deprecated
   public void method_10761(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (this.method_10802() && !var1.method_8350(var4.method_8360())) {
         var2.method_29597(var3);
      }
   }

   @Deprecated
   public class_6910 method_10777(class_2522 var1, World var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      return class_6910.field_35521;
   }

   @Deprecated
   public boolean method_10800(class_2522 var1, World var2, class_1331 var3, int var4, int var5) {
      return false;
   }

   @Deprecated
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Deprecated
   public boolean method_10768(class_2522 var1) {
      return false;
   }

   @Deprecated
   public boolean method_10771(class_2522 var1) {
      return false;
   }

   @Deprecated
   public class_718 method_10780(class_2522 var1) {
      return this.field_11820.method_24500();
   }

   @Deprecated
   public class_4774 method_10762(class_2522 var1) {
      return class_8532.field_43673.method_10710();
   }

   @Deprecated
   public boolean method_10770(class_2522 var1) {
      return false;
   }

   public class_7971 method_10772() {
      return class_7971.field_40823;
   }

   @Deprecated
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1;
   }

   @Deprecated
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1;
   }

   @Deprecated
   public boolean method_10781(class_2522 var1, class_353 var2) {
      return this.field_11820.method_24497() && (var2.method_21867().method_28022() || var2.method_21867().method_27960() != this.method_10803());
   }

   @Deprecated
   public boolean method_10782(class_2522 var1, class_2340 var2) {
      return this.field_11820.method_24497() || !this.field_11820.method_24499();
   }

   @Deprecated
   public List<ItemStack> method_10796(class_2522 var1, class_8480 var2) {
      Identifier var5 = this.method_10786();
      if (var5 != class_5931.field_30157) {
         class_2792 var6 = var2.method_39065(class_8712.field_44677, var1).method_39064(class_4933.field_25572);
         class_6331 var7 = var6.method_12694();
         class_1758 var8 = var7.method_29522().method_1722().method_4604(var5);
         return var8.method_7862(var6);
      } else {
         return Collections.<ItemStack>emptyList();
      }
   }

   @Deprecated
   public long method_10759(class_2522 var1, class_1331 var2) {
      return class_9299.method_42802(var2);
   }

   @Deprecated
   public class_4190 method_10790(class_2522 var1, class_6163 var2, class_1331 var3) {
      return var1.method_8334(var2, var3);
   }

   @Deprecated
   public class_4190 method_10774(class_2522 var1, class_6163 var2, class_1331 var3) {
      return this.method_10775(var1, var2, var3, class_214.method_928());
   }

   @Deprecated
   public class_4190 method_10776(class_2522 var1, class_6163 var2, class_1331 var3) {
      return class_3370.method_15536();
   }

   @Deprecated
   public int method_10794(class_2522 var1, class_6163 var2, class_1331 var3) {
      if (!var1.method_8321(var2, var3)) {
         return !var1.method_8369(var2, var3) ? 1 : 0;
      } else {
         return var2.method_28255();
      }
   }

   @Nullable
   @Deprecated
   public class_4259 method_10767(class_2522 var1, World var2, class_1331 var3) {
      return null;
   }

   @Deprecated
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return true;
   }

   @Deprecated
   public float method_10779(class_2522 var1, class_6163 var2, class_1331 var3) {
      return !var1.method_8306(var2, var3) ? 1.0F : 0.2F;
   }

   @Deprecated
   public int method_10795(class_2522 var1, World var2, class_1331 var3) {
      return 0;
   }

   @Deprecated
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return class_3370.method_15524();
   }

   @Deprecated
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return !this.field_11822 ? class_3370.method_15536() : var1.method_8334(var2, var3);
   }

   @Deprecated
   public class_4190 method_10757(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.method_10775(var1, var2, var3, var4);
   }

   @Deprecated
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      this.method_10797(var1, var2, var3, var4);
   }

   @Deprecated
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
   }

   @Deprecated
   public float method_10799(class_2522 var1, class_704 var2, class_6163 var3, class_1331 var4) {
      float var7 = var1.method_8341(var3, var4);
      if (var7 != -1.0F) {
         int var8 = !var2.method_3232(var1) ? 100 : 30;
         return var2.method_3239(var1) / var7 / (float)var8;
      } else {
         return 0.0F;
      }
   }

   @Deprecated
   public void method_10765(class_2522 var1, class_6331 var2, class_1331 var3, ItemStack var4) {
   }

   @Deprecated
   public void method_10791(class_2522 var1, World var2, class_1331 var3, class_704 var4) {
   }

   @Deprecated
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, Direction var4) {
      return 0;
   }

   @Deprecated
   public void method_10784(class_2522 var1, World var2, class_1331 var3, Entity var4) {
   }

   @Deprecated
   public int method_10778(class_2522 var1, class_6163 var2, class_1331 var3, Direction var4) {
      return 0;
   }

   public final boolean method_10802() {
      return this instanceof class_724;
   }

   public final Identifier method_10786() {
      if (this.field_11815 == null) {
         Identifier var3 = class_8669.field_44462.method_39797(this.method_10792());
         this.field_11815 = new Identifier(var3.method_21461(), "blocks/" + var3.method_21456());
      }

      return this.field_11815;
   }

   @Deprecated
   public void method_10758(World var1, class_2522 var2, class_9529 var3, class_5783 var4) {
   }

   public abstract class_2451 method_10803();

   public abstract class_6414 method_10792();

   public class_1513 method_10789() {
      return (class_1513)class_3073.method_14062(this.field_11821).apply(this.method_10792().method_29260());
   }
}
