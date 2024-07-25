package remapped;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class class_2380 extends class_6788 {
   private static String[] field_11890;
   public static final class_7360<class_3665> field_11889 = class_6023.field_30760;
   public static final class_6720 field_11888 = class_6023.field_30696;

   public class_2380(class_3073 var1) {
      super(true, var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_11888, Boolean.valueOf(false)).method_10308(field_11889, class_3665.field_17829));
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return true;
   }

   @Override
   public void method_10784(class_2522 var1, class_6486 var2, class_1331 var3, class_8145 var4) {
      if (!var2.field_33055 && !var1.<Boolean>method_10313(field_11888)) {
         this.method_10869(var2, var3, var1);
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var1.<Boolean>method_10313(field_11888)) {
         this.method_10869(var2, var3, var1);
      }
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      return !var1.<Boolean>method_10313(field_11888) ? 0 : 15;
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, class_1331 var3, class_240 var4) {
      if (var1.<Boolean>method_10313(field_11888)) {
         return var4 != class_240.field_817 ? 0 : 15;
      } else {
         return 0;
      }
   }

   private void method_10869(class_6486 var1, class_1331 var2, class_2522 var3) {
      if (this.method_10787(var3, var1, var2)) {
         boolean var6 = var3.<Boolean>method_10313(field_11888);
         boolean var7 = false;
         List var8 = this.<class_1080>method_10872(var1, var2, class_1080.class, (Predicate<class_8145>)null);
         if (!var8.isEmpty()) {
            var7 = true;
         }

         if (var7 && !var6) {
            class_2522 var9 = var3.method_10308(field_11888, Boolean.valueOf(true));
            var1.method_7513(var2, var9, 3);
            this.method_10870(var1, var2, var9, true);
            var1.method_29563(var2, this);
            var1.method_29563(var2.method_6100(), this);
            var1.method_29567(var2, var3, var9);
         }

         if (!var7 && var6) {
            class_2522 var10 = var3.method_10308(field_11888, Boolean.valueOf(false));
            var1.method_7513(var2, var10, 3);
            this.method_10870(var1, var2, var10, false);
            var1.method_29563(var2, this);
            var1.method_29563(var2.method_6100(), this);
            var1.method_29567(var2, var3, var10);
         }

         if (var7) {
            var1.method_43367().method_14011(var2, this, 20);
         }

         var1.method_29523(var2, this);
      }
   }

   public void method_10870(class_6486 var1, class_1331 var2, class_2522 var3, boolean var4) {
      class_8360 var7 = new class_8360(var1, var2, var3);

      for (class_1331 var9 : var7.method_38542()) {
         class_2522 var10 = var1.method_28262(var9);
         var10.method_8343(var1, var9, var10.method_8360(), var2, false);
      }
   }

   @Override
   public void method_10760(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360())) {
         this.method_10869(var2, var3, this.method_31120(var1, var2, var3, var5));
      }
   }

   @Override
   public class_5019<class_3665> method_31121() {
      return field_11889;
   }

   @Override
   public boolean method_10770(class_2522 var1) {
      return true;
   }

   @Override
   public int method_10795(class_2522 var1, class_6486 var2, class_1331 var3) {
      if (var1.<Boolean>method_10313(field_11888)) {
         List var6 = this.<class_4648>method_10872(var2, var3, class_4648.class, (Predicate<class_8145>)null);
         if (!var6.isEmpty()) {
            return ((class_4648)var6.get(0)).method_21499().method_36926();
         }

         List var7 = this.<class_1080>method_10872(var2, var3, class_1080.class, class_3572.field_17485);
         if (!var7.isEmpty()) {
            return class_4088.method_18870((class_6867)var7.get(0));
         }
      }

      return 0;
   }

   public <T extends class_1080> List<T> method_10872(class_6486 var1, class_1331 var2, Class<T> var3, Predicate<class_8145> var4) {
      return var1.<T>method_25869(var3, this.method_10871(var2), var4);
   }

   private class_4092 method_10871(class_1331 var1) {
      double var4 = 0.2;
      return new class_4092(
         (double)var1.method_12173() + 0.2,
         (double)var1.method_12165(),
         (double)var1.method_12185() + 0.2,
         (double)(var1.method_12173() + 1) - 0.2,
         (double)(var1.method_12165() + 1) - 0.2,
         (double)(var1.method_12185() + 1) - 0.2
      );
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34338:
            switch ((class_3665)var1.method_10313(field_11889)) {
               case field_17835:
                  return var1.method_10308(field_11889, class_3665.field_17826);
               case field_17826:
                  return var1.method_10308(field_11889, class_3665.field_17835);
               case field_17833:
                  return var1.method_10308(field_11889, class_3665.field_17836);
               case field_17836:
                  return var1.method_10308(field_11889, class_3665.field_17833);
               case field_17830:
                  return var1.method_10308(field_11889, class_3665.field_17837);
               case field_17825:
                  return var1.method_10308(field_11889, class_3665.field_17832);
               case field_17837:
                  return var1.method_10308(field_11889, class_3665.field_17830);
               case field_17832:
                  return var1.method_10308(field_11889, class_3665.field_17825);
            }
         case field_34335:
            switch ((class_3665)var1.method_10313(field_11889)) {
               case field_17835:
                  return var1.method_10308(field_11889, class_3665.field_17833);
               case field_17826:
                  return var1.method_10308(field_11889, class_3665.field_17836);
               case field_17833:
                  return var1.method_10308(field_11889, class_3665.field_17826);
               case field_17836:
                  return var1.method_10308(field_11889, class_3665.field_17835);
               case field_17830:
                  return var1.method_10308(field_11889, class_3665.field_17832);
               case field_17825:
                  return var1.method_10308(field_11889, class_3665.field_17830);
               case field_17837:
                  return var1.method_10308(field_11889, class_3665.field_17825);
               case field_17832:
                  return var1.method_10308(field_11889, class_3665.field_17837);
               case field_17829:
                  return var1.method_10308(field_11889, class_3665.field_17831);
               case field_17831:
                  return var1.method_10308(field_11889, class_3665.field_17829);
            }
         case field_34334:
            switch ((class_3665)var1.method_10313(field_11889)) {
               case field_17835:
                  return var1.method_10308(field_11889, class_3665.field_17836);
               case field_17826:
                  return var1.method_10308(field_11889, class_3665.field_17833);
               case field_17833:
                  return var1.method_10308(field_11889, class_3665.field_17835);
               case field_17836:
                  return var1.method_10308(field_11889, class_3665.field_17826);
               case field_17830:
                  return var1.method_10308(field_11889, class_3665.field_17825);
               case field_17825:
                  return var1.method_10308(field_11889, class_3665.field_17837);
               case field_17837:
                  return var1.method_10308(field_11889, class_3665.field_17832);
               case field_17832:
                  return var1.method_10308(field_11889, class_3665.field_17830);
               case field_17829:
                  return var1.method_10308(field_11889, class_3665.field_17831);
               case field_17831:
                  return var1.method_10308(field_11889, class_3665.field_17829);
            }
         default:
            return var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      class_3665 var5 = var1.<class_3665>method_10313(field_11889);
      switch (var2) {
         case field_46148:
            switch (var5) {
               case field_17833:
                  return var1.method_10308(field_11889, class_3665.field_17836);
               case field_17836:
                  return var1.method_10308(field_11889, class_3665.field_17833);
               case field_17830:
                  return var1.method_10308(field_11889, class_3665.field_17832);
               case field_17825:
                  return var1.method_10308(field_11889, class_3665.field_17837);
               case field_17837:
                  return var1.method_10308(field_11889, class_3665.field_17825);
               case field_17832:
                  return var1.method_10308(field_11889, class_3665.field_17830);
               default:
                  return super.method_10773(var1, var2);
            }
         case field_46144:
            switch (var5) {
               case field_17835:
                  return var1.method_10308(field_11889, class_3665.field_17826);
               case field_17826:
                  return var1.method_10308(field_11889, class_3665.field_17835);
               case field_17833:
               case field_17836:
               default:
                  break;
               case field_17830:
                  return var1.method_10308(field_11889, class_3665.field_17825);
               case field_17825:
                  return var1.method_10308(field_11889, class_3665.field_17830);
               case field_17837:
                  return var1.method_10308(field_11889, class_3665.field_17832);
               case field_17832:
                  return var1.method_10308(field_11889, class_3665.field_17837);
            }
         default:
            return super.method_10773(var1, var2);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_11889, field_11888);
   }
}
