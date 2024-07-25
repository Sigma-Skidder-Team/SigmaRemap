package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class class_1873 extends class_2243<class_6414, class_2522> {
   private final int field_9488;
   private final boolean field_9497;
   private final boolean field_9496;
   private final class_5371 field_9485;
   private final class_1513 field_9492;
   private final float field_9487;
   private final boolean field_9494;
   private final boolean field_9484;
   private final class_5199 field_9489;
   private final class_5199 field_9493;
   private final class_5199 field_9486;
   private final class_5199 field_9490;
   private final class_5199 field_9495;
   public class_679 field_9491;

   public class_1873(class_6414 var1, ImmutableMap<class_5019<?>, Comparable<?>> var2, MapCodec<class_2522> var3) {
      super(var1, var2, var3);
      class_3073 var6 = var1.field_11821;
      this.field_9488 = class_3073.method_14065(var6).applyAsInt(this.method_8336());
      this.field_9497 = var1.method_10768(this.method_8336());
      this.field_9496 = class_3073.method_14075(var6);
      this.field_9485 = class_3073.method_14064(var6);
      this.field_9492 = (class_1513)class_3073.method_14062(var6).apply(this.method_8336());
      this.field_9487 = class_3073.method_14078(var6);
      this.field_9494 = class_3073.method_14085(var6);
      this.field_9484 = class_3073.method_14081(var6);
      this.field_9489 = class_3073.method_14073(var6);
      this.field_9493 = class_3073.method_14093(var6);
      this.field_9486 = class_3073.method_14080(var6);
      this.field_9490 = class_3073.method_14053(var6);
      this.field_9495 = class_3073.method_14088(var6);
   }

   public void method_8348() {
      if (!this.method_8360().method_29281()) {
         this.field_9491 = new class_679(this.method_8336(), null);
      }
   }

   public class_6414 method_8360() {
      return this.field_11166;
   }

   public class_5371 method_8362() {
      return this.field_9485;
   }

   public boolean method_8305(class_6163 var1, BlockPos var2, class_6629<?> var3) {
      return class_3073.method_14070(this.method_8360().field_11821).method_45136(this.method_8336(), var1, var2, var3);
   }

   public boolean method_8369(class_6163 var1, BlockPos var2) {
      return this.field_9491 == null ? this.method_8360().method_29275(this.method_8336(), var1, var2) : class_679.method_3092(this.field_9491);
   }

   public int method_8320(class_6163 var1, BlockPos var2) {
      return this.field_9491 == null ? this.method_8360().method_10794(this.method_8336(), var1, var2) : class_679.method_3094(this.field_9491);
   }

   public class_4190 method_8346(class_6163 var1, BlockPos var2, Direction var3) {
      return this.field_9491 != null && class_679.method_3093(this.field_9491) != null
         ? class_679.method_3093(this.field_9491)[var3.ordinal()]
         : class_3370.method_15526(this.method_8377(var1, var2), var3);
   }

   public class_4190 method_8377(class_6163 var1, BlockPos var2) {
      return this.method_8360().method_10790(this.method_8336(), var1, var2);
   }

   public boolean method_8357() {
      return this.field_9491 == null || this.field_9491.field_3753;
   }

   public boolean method_8358() {
      return this.field_9497;
   }

   public int method_8339() {
      class_3310 var3 = new class_3310(this);
      SigmaMainClass.getInstance().getEventManager().call(var3);
      return !var3.method_15184() ? this.field_9488 : 1;
   }

   public boolean method_8345() {
      return this.field_9496;
   }

   public class_1513 method_8323(class_6163 var1, BlockPos var2) {
      return this.field_9492;
   }

   public class_2522 method_8318(class_6631 var1) {
      return this.method_8360().method_10785(this.method_8336(), var1);
   }

   public class_2522 method_8372(class_9022 var1) {
      return this.method_8360().method_10773(this.method_8336(), var1);
   }

   public class_7537 method_8352() {
      return this.method_8360().method_10788(this.method_8336());
   }

   public boolean method_8342(class_6163 var1, BlockPos var2) {
      return this.field_9495.method_23862(this.method_8336(), var1, var2);
   }

   public float method_8315(class_6163 var1, BlockPos var2) {
      return this.method_8360().method_10779(this.method_8336(), var1, var2);
   }

   public boolean method_8356(class_6163 var1, BlockPos var2) {
      return this.field_9489.method_23862(this.method_8336(), var1, var2);
   }

   public boolean method_8355() {
      return this.method_8360().method_10771(this.method_8336());
   }

   public int method_8327(class_6163 var1, BlockPos var2, Direction var3) {
      return this.method_8360().method_10766(this.method_8336(), var1, var2, var3);
   }

   public boolean method_8344() {
      return this.method_8360().method_10770(this.method_8336());
   }

   public int method_8328(World var1, BlockPos var2) {
      return this.method_8360().method_10795(this.method_8336(), var1, var2);
   }

   public float method_8341(class_6163 var1, BlockPos var2) {
      return this.field_9487;
   }

   public float method_8311(class_704 var1, class_6163 var2, BlockPos var3) {
      return this.method_8360().method_10799(this.method_8336(), var1, var2, var3);
   }

   public int method_8370(class_6163 var1, BlockPos var2, Direction var3) {
      return this.method_8360().method_10778(this.method_8336(), var1, var2, var3);
   }

   public class_718 method_8366() {
      return this.method_8360().method_10780(this.method_8336());
   }

   public boolean method_8321(class_6163 var1, BlockPos var2) {
      if (this.field_9491 == null) {
         class_2522 var5 = this.method_8336();
         return !var5.method_8302() ? false : class_6414.method_29301(var5.method_8377(var1, var2));
      } else {
         return this.field_9491.field_3748;
      }
   }

   public boolean method_8302() {
      return this.field_9484;
   }

   public boolean method_8347(class_2522 var1, Direction var2) {
      return this.method_8360().method_10764(this.method_8336(), var1, var2);
   }

   public class_4190 method_8334(class_6163 var1, BlockPos var2) {
      return this.method_8335(var1, var2, class_214.method_928());
   }

   public class_4190 method_8335(class_6163 var1, BlockPos var2, class_214 var3) {
      return this.method_8360().method_10769(this.method_8336(), var1, var2, var3);
   }

   public class_4190 method_8324(class_6163 var1, BlockPos var2) {
      return this.field_9491 == null ? this.method_8325(var1, var2, class_214.method_928()) : this.field_9491.field_3747;
   }

   public class_4190 method_8325(class_6163 var1, BlockPos var2, class_214 var3) {
      return this.method_8360().method_10775(this.method_8336(), var1, var2, var3);
   }

   public class_4190 method_8314(class_6163 var1, BlockPos var2) {
      return this.method_8360().method_10774(this.method_8336(), var1, var2);
   }

   public class_4190 method_8340(class_6163 var1, BlockPos var2, class_214 var3) {
      return this.method_8360().method_10757(this.method_8336(), var1, var2, var3);
   }

   public class_4190 method_8351(class_6163 var1, BlockPos var2) {
      return this.method_8360().method_10776(this.method_8336(), var1, var2);
   }

   public final boolean method_8337(class_6163 var1, BlockPos var2, Entity var3) {
      return this.method_8338(var1, var2, var3, Direction.field_817);
   }

   public final boolean method_8338(class_6163 var1, BlockPos var2, Entity var3, Direction var4) {
      return class_6414.method_29303(this.method_8325(var1, var2, class_214.method_926(var3)), var4);
   }

   public class_1343 method_8353(class_6163 var1, BlockPos var2) {
      class_7971 var5 = this.method_8360().method_10772();
      if (var5 != class_7971.field_40823) {
         long var6 = class_9299.method_42839(var2.method_12173(), 0, var2.method_12185());
         return new class_1343(
            ((double)((float)(var6 & 15L) / 15.0F) - 0.5) * 0.5,
            var5 != class_7971.field_40822 ? 0.0 : ((double)((float)(var6 >> 4 & 15L) / 15.0F) - 1.0) * 0.2,
            ((double)((float)(var6 >> 8 & 15L) / 15.0F) - 0.5) * 0.5
         );
      } else {
         return class_1343.field_7335;
      }
   }

   public boolean method_8354(World var1, BlockPos var2, int var3, int var4) {
      return this.method_8360().method_10800(this.method_8336(), var1, var2, var3, var4);
   }

   public void method_8343(World var1, BlockPos var2, class_6414 var3, BlockPos var4, boolean var5) {
      this.method_8360().method_10801(this.method_8336(), var1, var2, var3, var4, var5);
   }

   public final void method_8367(class_9379 var1, BlockPos var2, int var3) {
      this.method_8368(var1, var2, var3, 512);
   }

   public final void method_8368(class_9379 var1, BlockPos var2, int var3, int var4) {
      this.method_8360();
      class_2921 var7 = new class_2921();

      for (Direction var11 : class_2353.field_11817) {
         var7.method_13371(var2, var11);
         class_2522 var12 = var1.method_28262(var7);
         class_2522 var13 = var12.method_8359(var11.method_1046(), this.method_8336(), var1, var7, var2);
         class_6414.method_29291(var12, var13, var1, var7, var3, var4);
      }
   }

   public final void method_8303(class_9379 var1, BlockPos var2, int var3) {
      this.method_8304(var1, var2, var3, 512);
   }

   public void method_8304(class_9379 var1, BlockPos var2, int var3, int var4) {
      this.method_8360().method_10804(this.method_8336(), var1, var2, var3, var4);
   }

   public void method_8363(World var1, BlockPos var2, class_2522 var3, boolean var4) {
      this.method_8360().method_10760(this.method_8336(), var1, var2, var3, var4);
   }

   public void method_8301(World var1, BlockPos var2, class_2522 var3, boolean var4) {
      this.method_8360().method_10761(this.method_8336(), var1, var2, var3, var4);
   }

   public void method_8332(class_6331 var1, BlockPos var2, Random var3) {
      this.method_8360().method_10797(this.method_8336(), var1, var2, var3);
   }

   public void method_8373(class_6331 var1, BlockPos var2, Random var3) {
      this.method_8360().method_10783(this.method_8336(), var1, var2, var3);
   }

   public void method_8326(World var1, BlockPos var2, Entity var3) {
      this.method_8360().method_10784(this.method_8336(), var1, var2, var3);
   }

   public void method_8310(class_6331 var1, BlockPos var2, ItemStack var3) {
      this.method_8360().method_10765(this.method_8336(), var1, var2, var3);
   }

   public List<ItemStack> method_8333(class_8480 var1) {
      return this.method_8360().method_10796(this.method_8336(), var1);
   }

   public class_6910 method_8322(World var1, class_704 var2, Hand var3, class_9529 var4) {
      return this.method_8360().method_10777(this.method_8336(), var1, var4.method_43955(), var2, var3, var4);
   }

   public void method_8307(World var1, BlockPos var2, class_704 var3) {
      this.method_8360().method_10791(this.method_8336(), var1, var2, var3);
   }

   public boolean method_8313(class_6163 var1, BlockPos var2) {
      return this.field_9493.method_23862(this.method_8336(), var1, var2);
   }

   public boolean method_8330(class_6163 var1, BlockPos var2) {
      return this.field_9486.method_23862(this.method_8336(), var1, var2);
   }

   public class_2522 method_8359(Direction var1, class_2522 var2, class_9379 var3, BlockPos var4, BlockPos var5) {
      return this.method_8360().method_10763(this.method_8336(), var1, var2, var3, var4, var5);
   }

   public boolean method_8319(class_6163 var1, BlockPos var2, class_2929 var3) {
      return this.method_8360().method_10793(this.method_8336(), var1, var2, var3);
   }

   public boolean method_8374(class_353 var1) {
      return this.method_8360().method_10781(this.method_8336(), var1);
   }

   public boolean method_8375(class_2340 var1) {
      return this.method_8360().method_10782(this.method_8336(), var1);
   }

   public boolean method_8309(class_4924 var1, BlockPos var2) {
      return this.method_8360().method_10787(this.method_8336(), var1, var2);
   }

   public boolean method_8365(class_6163 var1, BlockPos var2) {
      return this.field_9490.method_23862(this.method_8336(), var1, var2);
   }

   @Nullable
   public class_4259 method_8317(World var1, BlockPos var2) {
      return this.method_8360().method_10767(this.method_8336(), var1, var2);
   }

   public boolean method_8349(class_2307<class_6414> var1) {
      return this.method_8360().method_29299(var1);
   }

   public boolean method_8329(class_2307<class_6414> var1, Predicate<class_1873> var2) {
      return this.method_8360().method_29299(var1) && var2.test(this);
   }

   public boolean method_8350(class_6414 var1) {
      return this.method_8360().method_29270(var1);
   }

   public class_4774 method_8364() {
      return this.method_8360().method_10762(this.method_8336());
   }

   public boolean method_8331() {
      return this.method_8360().method_29300(this.method_8336());
   }

   public long method_8371(BlockPos var1) {
      return this.method_8360().method_10759(this.method_8336(), var1);
   }

   public class_4618 method_8316() {
      return this.method_8360().method_29261(this.method_8336());
   }

   public void method_8361(World var1, class_2522 var2, class_9529 var3, class_5783 var4) {
      this.method_8360().method_10758(var1, var2, var3, var4);
   }

   public boolean method_8308(class_6163 var1, BlockPos var2, Direction var3) {
      return this.method_8312(var1, var2, var3, class_3397.field_16732);
   }

   public boolean method_8312(class_6163 var1, BlockPos var2, Direction var3, class_3397 var4) {
      return this.field_9491 == null ? var4.method_15689(this.method_8336(), var1, var2, var3) : this.field_9491.method_3090(var3, var4);
   }

   public boolean method_8306(class_6163 var1, BlockPos var2) {
      return this.field_9491 == null ? class_6414.method_29301(this.method_8324(var1, var2)) : this.field_9491.field_3749;
   }

   public abstract class_2522 method_8336();

   public boolean method_8376() {
      return this.field_9494;
   }
}
