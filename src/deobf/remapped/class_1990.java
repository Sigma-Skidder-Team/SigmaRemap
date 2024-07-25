package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class class_1990 extends class_3266 {
   private static String[] field_10082;
   public static final class_6720 field_10077 = class_6023.field_30672;
   public static final class_4190 field_10079 = class_6414.method_29292(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   public static final class_4190 field_10080 = class_6414.method_29292(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_10076 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   public static final class_4190 field_10083 = class_6414.method_29292(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_10081 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final class_4190 field_10084 = class_6414.method_29292(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean field_10078;

   public class_1990(boolean var1, class_3073 var2) {
      super(var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_16180, class_240.field_818).method_10308(field_10077, Boolean.valueOf(false)));
      this.field_10078 = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      if (var1.<Boolean>method_10313(field_10077)) {
         switch ((class_240)var1.method_10313(field_16180)) {
            case field_802:
               return field_10084;
            case field_817:
            default:
               return field_10081;
            case field_818:
               return field_10083;
            case field_800:
               return field_10076;
            case field_809:
               return field_10080;
            case field_804:
               return field_10079;
         }
      } else {
         return class_3370.method_15524();
      }
   }

   @Override
   public void method_29257(class_6486 var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      if (!var1.field_33055) {
         this.method_9170(var1, var2, var3);
      }
   }

   @Override
   public void method_10801(class_2522 var1, class_6486 var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      if (!var2.field_33055) {
         this.method_9170(var2, var3, var1);
      }
   }

   @Override
   public void method_10760(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360()) && !var2.field_33055 && var2.method_28260(var3) == null) {
         this.method_9170(var2, var3, var1);
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_16180, var1.method_1782().method_1046()).method_10308(field_10077, Boolean.valueOf(false));
   }

   private void method_9170(class_6486 var1, class_1331 var2, class_2522 var3) {
      class_240 var6 = var3.<class_240>method_10313(field_16180);
      boolean var7 = this.method_9172(var1, var2, var6);
      if (var7 && !var3.<Boolean>method_10313(field_10077)) {
         if (new class_7442(var1, var2, var6, true).method_33869()) {
            var1.method_29521(var2, this, 0, var6.method_1050());
         }
      } else if (!var7 && var3.<Boolean>method_10313(field_10077)) {
         class_1331 var8 = var2.method_6099(var6, 2);
         class_2522 var9 = var1.method_28262(var8);
         byte var10 = 1;
         if (var9.method_8350(class_4783.field_23833) && var9.<class_240>method_10313(field_16180) == var6) {
            class_3757 var11 = var1.method_28260(var8);
            if (var11 instanceof class_3420) {
               class_3420 var12 = (class_3420)var11;
               if (var12.method_15786()
                  && (var12.method_15785(0.0F) < 0.5F || var1.method_29546() == var12.method_15796() || ((class_6331)var1).method_28965())) {
                  var10 = 2;
               }
            }
         }

         var1.method_29521(var2, this, var10, var6.method_1050());
      }
   }

   private boolean method_9172(class_6486 var1, class_1331 var2, class_240 var3) {
      for (class_240 var9 : class_240.values()) {
         if (var9 != var3 && var1.method_29588(var2.method_6098(var9), var9)) {
            return true;
         }
      }

      if (!var1.method_29588(var2, class_240.field_802)) {
         class_1331 var11 = var2.method_6081();

         for (class_240 var10 : class_240.values()) {
            if (var10 != class_240.field_802 && var1.method_29588(var11.method_6098(var10), var10)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public boolean method_10800(class_2522 var1, class_6486 var2, class_1331 var3, int var4, int var5) {
      class_240 var8 = var1.<class_240>method_10313(field_16180);
      if (!var2.field_33055) {
         boolean var9 = this.method_9172(var2, var3, var8);
         if (var9 && (var4 == 1 || var4 == 2)) {
            var2.method_7513(var3, var1.method_10308(field_10077, Boolean.valueOf(true)), 2);
            return false;
         }

         if (!var9 && var4 == 0) {
            return false;
         }
      }

      if (var4 != 0) {
         if (var4 == 1 || var4 == 2) {
            class_3757 var16 = var2.method_28260(var3.method_6098(var8));
            if (var16 instanceof class_3420) {
               ((class_3420)var16).method_15795();
            }

            class_2522 var10 = class_4783.field_23833
               .method_29260()
               .method_10308(class_7804.field_39514, var8)
               .method_10308(class_7804.field_39512, !this.field_10078 ? class_989.field_5039 : class_989.field_5035);
            var2.method_7513(var3, var10, 20);
            var2.method_29558(var3, class_7804.method_35382(this.method_29260().method_10308(field_16180, class_240.method_1033(var5 & 7)), var8, false, true));
            var2.method_43369(var3, var10.method_8360());
            var10.method_8367(var2, var3, 2);
            if (!this.field_10078) {
               var2.method_7508(var3.method_6098(var8), false);
            } else {
               class_1331 var11 = var3.method_6104(var8.method_1041() * 2, var8.method_1054() * 2, var8.method_1034() * 2);
               class_2522 var12 = var2.method_28262(var11);
               boolean var13 = false;
               if (var12.method_8350(class_4783.field_23833)) {
                  class_3757 var14 = var2.method_28260(var11);
                  if (var14 instanceof class_3420) {
                     class_3420 var15 = (class_3420)var14;
                     if (var15.method_15787() == var8 && var15.method_15786()) {
                        var15.method_15795();
                        var13 = true;
                     }
                  }
               }

               if (!var13) {
                  if (var4 == 1
                     && !var12.method_8345()
                     && method_9171(var12, var2, var11, var8.method_1046(), false, var8)
                     && (var12.method_8366() == class_718.field_3913 || var12.method_8350(class_4783.field_23649) || var12.method_8350(class_4783.field_23861))
                     )
                   {
                     this.method_9173(var2, var3, var8, false);
                  } else {
                     var2.method_7508(var3.method_6098(var8), false);
                  }
               }
            }

            var2.method_43359((class_704)null, var3, class_463.field_2862, class_562.field_3322, 0.5F, var2.field_33033.nextFloat() * 0.15F + 0.6F);
         }
      } else {
         if (!this.method_9173(var2, var3, var8, true)) {
            return false;
         }

         var2.method_7513(var3, var1.method_10308(field_10077, Boolean.valueOf(true)), 67);
         var2.method_43359((class_704)null, var3, class_463.field_2143, class_562.field_3322, 0.5F, var2.field_33033.nextFloat() * 0.25F + 0.6F);
      }

      return true;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean method_9171(class_2522 var0, class_6486 var1, class_1331 var2, class_240 var3, boolean var4, class_240 var5) {
      if (var2.method_12165() < 0 || var2.method_12165() > var1.method_28261() - 1 || !var1.method_6673().method_9813(var2)) {
         return false;
      } else if (var0.method_8345()) {
         return true;
      } else if (var0.method_8350(class_4783.field_23881) || var0.method_8350(class_4783.field_23222) || var0.method_8350(class_4783.field_23807)) {
         return false;
      } else if (var3 == class_240.field_802 && var2.method_12165() == 0) {
         return false;
      } else if (var3 == class_240.field_817 && var2.method_12165() == var1.method_28261() - 1) {
         return false;
      } else {
         if (!var0.method_8350(class_4783.field_23649) && !var0.method_8350(class_4783.field_23861)) {
            if (var0.method_8341(var1, var2) == -1.0F) {
               return false;
            }

            switch (var0.method_8366()) {
               case field_3910:
                  return false;
               case field_3916:
                  return var4;
               case field_3915:
                  return var3 == var5;
            }
         } else if (var0.<Boolean>method_10313(field_10077)) {
            return false;
         }

         return !var0.method_8360().method_10802();
      }
   }

   private boolean method_9173(class_6486 var1, class_1331 var2, class_240 var3, boolean var4) {
      class_1331 var7 = var2.method_6098(var3);
      if (!var4 && var1.method_28262(var7).method_8350(class_4783.field_23336)) {
         var1.method_7513(var7, class_4783.field_23184.method_29260(), 20);
      }

      class_7442 var8 = new class_7442(var1, var2, var3, var4);
      if (!var8.method_33869()) {
         return false;
      } else {
         HashMap var9 = Maps.newHashMap();
         List var10 = var8.method_33866();
         ArrayList var11 = Lists.newArrayList();

         for (int var12 = 0; var12 < var10.size(); var12++) {
            class_1331 var13 = (class_1331)var10.get(var12);
            class_2522 var14 = var1.method_28262(var13);
            var11.add(var14);
            var9.put(var13, var14);
         }

         List var21 = var8.method_33862();
         class_2522[] var22 = new class_2522[var10.size() + var21.size()];
         class_240 var23 = !var4 ? var3.method_1046() : var3;
         int var15 = 0;

         for (int var16 = var21.size() - 1; var16 >= 0; var16--) {
            class_1331 var17 = (class_1331)var21.get(var16);
            class_2522 var18 = var1.method_28262(var17);
            class_3757 var19 = !var18.method_8360().method_10802() ? null : var1.method_28260(var17);
            method_29296(var18, var1, var17, var19);
            var1.method_7513(var17, class_4783.field_23184.method_29260(), 18);
            var22[var15++] = var18;
         }

         for (int var25 = var10.size() - 1; var25 >= 0; var25--) {
            class_1331 var28 = (class_1331)var10.get(var25);
            class_2522 var35 = var1.method_28262(var28);
            var28 = var28.method_6098(var23);
            var9.remove(var28);
            var1.method_7513(var28, class_4783.field_23833.method_29260().method_10308(field_16180, var3), 68);
            var1.method_29558(var28, class_7804.method_35382((class_2522)var11.get(var25), var3, var4, false));
            var22[var15++] = var35;
         }

         if (var4) {
            class_989 var26 = !this.field_10078 ? class_989.field_5039 : class_989.field_5035;
            class_2522 var30 = class_4783.field_23336.method_29260().method_10308(class_1166.field_16180, var3).method_10308(class_1166.field_6616, var26);
            class_2522 var36 = class_4783.field_23833
               .method_29260()
               .method_10308(class_7804.field_39514, var3)
               .method_10308(class_7804.field_39512, !this.field_10078 ? class_989.field_5039 : class_989.field_5035);
            var9.remove(var7);
            var1.method_7513(var7, var36, 68);
            var1.method_29558(var7, class_7804.method_35382(var30, var3, true, true));
         }

         class_2522 var27 = class_4783.field_23184.method_29260();

         for (class_1331 var37 : var9.keySet()) {
            var1.method_7513(var37, var27, 82);
         }

         for (Entry var38 : var9.entrySet()) {
            class_1331 var40 = (class_1331)var38.getKey();
            class_2522 var20 = (class_2522)var38.getValue();
            var20.method_8303(var1, var40, 2);
            var27.method_8367(var1, var40, 2);
            var27.method_8303(var1, var40, 2);
         }

         var15 = 0;

         for (int var33 = var21.size() - 1; var33 >= 0; var33--) {
            class_2522 var39 = var22[var15++];
            class_1331 var41 = (class_1331)var21.get(var33);
            var39.method_8303(var1, var41, 2);
            var1.method_29563(var41, var39.method_8360());
         }

         for (int var34 = var10.size() - 1; var34 >= 0; var34--) {
            var1.method_29563((class_1331)var10.get(var34), var22[var15++].method_8360());
         }

         if (var4) {
            var1.method_29563(var7, class_4783.field_23336);
         }

         return true;
      }
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_16180, var2.method_30489(var1.<class_240>method_10313(field_16180)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<class_240>method_10313(field_16180)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_16180, field_10077);
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return var1.<Boolean>method_10313(field_10077);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
