package remapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class class_9626 {
   private final class_6743 field_49029;
   private final class_1862 field_49031;
   private boolean field_49036;
   private boolean field_49037;
   private class_7826 field_49027;
   private Map<String, String> field_49033;
   private Set<class_1621> field_49035;
   private Map<class_1621, String> field_49034;
   private class_1889 field_49030;
   private Boolean field_49028;
   private class_9592 field_49026;

   public class_9626(class_6743 var1, class_1862 var2, class_4251 var3, class_9592 var4) {
      this.field_49029 = var1;
      this.field_49031 = var2;
      this.field_49036 = var3.method_19806();
      this.field_49037 = var3.method_19803();
      if (var3.method_19793() != null) {
         this.field_49027 = var3.method_19793();
      }

      this.field_49033 = var3.method_19800();
      this.field_49035 = new HashSet<class_1621>();
      this.field_49034 = new HashMap<class_1621, String>();
      this.field_49030 = var3.method_19824();
      this.field_49028 = null;
      this.field_49026 = var4;
   }

   public void method_44425() throws IOException {
      if (this.field_49028 != null) {
         if (!Boolean.TRUE.equals(this.field_49028)) {
            throw new class_637("serializer is already opened");
         } else {
            throw new class_637("serializer is closed");
         }
      } else {
         this.field_49029.method_30889(new class_6137(null, null));
         this.field_49028 = Boolean.FALSE;
      }
   }

   public void method_44430() throws IOException {
      if (this.field_49028 != null) {
         if (!Boolean.TRUE.equals(this.field_49028)) {
            this.field_49029.method_30889(new class_2946(null, null));
            this.field_49028 = Boolean.TRUE;
         }
      } else {
         throw new class_637("serializer is not opened");
      }
   }

   public void method_44428(class_1621 var1) throws IOException {
      if (this.field_49028 != null) {
         if (!this.field_49028) {
            this.field_49029.method_30889(new class_922(null, null, this.field_49036, this.field_49027, this.field_49033));
            this.method_44426(var1);
            if (this.field_49026 != null) {
               var1.method_7227(this.field_49026);
            }

            this.method_44427(var1, null);
            this.field_49029.method_30889(new class_1927(null, null, this.field_49037));
            this.field_49035.clear();
            this.field_49034.clear();
         } else {
            throw new class_637("serializer is closed");
         }
      } else {
         throw new class_637("serializer is not opened");
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_44426(class_1621 var1) {
      if (var1.method_7221() == class_99.field_231) {
         var1 = ((class_2158)var1).method_10049();
      }

      if (this.field_49034.containsKey(var1)) {
         String var4 = this.field_49034.get(var1);
         if (null == var4) {
            var4 = this.field_49030.method_8428(var1);
            this.field_49034.put(var1, var4);
         }
      } else {
         this.field_49034.put(var1, null);
         switch (var1.method_7221()) {
            case field_234:
               class_1596 var13 = (class_1596)var1;

               for (class_1621 var15 : var13.method_10282()) {
                  this.method_44426(var15);
               }
               break;
            case field_233:
               class_7984 var6 = (class_7984)var1;

               for (class_8473 var9 : var6.method_10282()) {
                  class_1621 var10 = var9.method_38998();
                  class_1621 var11 = var9.method_38999();
                  this.method_44426(var10);
                  this.method_44426(var11);
               }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_44427(class_1621 var1, class_1621 var2) throws IOException {
      if (var1.method_7221() == class_99.field_231) {
         var1 = ((class_2158)var1).method_10049();
      }

      String var5 = this.field_49034.get(var1);
      if (this.field_49035.contains(var1)) {
         this.field_49029.method_30889(new class_8788(var5, null, null));
      } else {
         this.field_49035.add(var1);
         switch (var1.method_7221()) {
            case field_234:
               class_1596 var11 = (class_1596)var1;
               boolean var12 = var1.method_7232().equals(this.field_49031.method_8244(class_99.field_234, null, true));
               this.field_49029.method_30889(new class_2410(var5, var1.method_7232().method_44298(), var12, null, null, var11.method_10280()));

               for (class_1621 var23 : var11.method_10282()) {
                  this.method_44427(var23, var1);
               }

               this.field_49029.method_30889(new class_6130(null, null));
               break;
            case field_235:
               class_8437 var6 = (class_8437)var1;
               class_9592 var7 = this.field_49031.method_8244(class_99.field_235, var6.method_38816(), true);
               class_9592 var8 = this.field_49031.method_8244(class_99.field_235, var6.method_38816(), false);
               class_2798 var9 = new class_2798(var1.method_7232().equals(var7), var1.method_7232().equals(var8));
               class_4417 var10 = new class_4417(var5, var1.method_7232().method_44298(), var9, var6.method_38816(), null, null, var6.method_38817());
               this.field_49029.method_30889(var10);
               break;
            default:
               class_9592 var14 = this.field_49031.method_8244(class_99.field_233, null, true);
               boolean var15 = var1.method_7232().equals(var14);
               this.field_49029.method_30889(new class_3659(var5, var1.method_7232().method_44298(), var15, null, null, ((class_2233)var1).method_10280()));
               class_7984 var16 = (class_7984)var1;

               for (class_8473 var19 : var16.method_10282()) {
                  class_1621 var20 = var19.method_38998();
                  class_1621 var21 = var19.method_38999();
                  this.method_44427(var20, var16);
                  this.method_44427(var21, var16);
               }

               this.field_49029.method_30889(new class_4363(null, null));
         }
      }
   }
}
