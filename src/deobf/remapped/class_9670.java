package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;

public final class class_9670 {
   private final class_8669<class_8115> field_49258;
   private final int field_49260;
   private final class_1242 field_49255;
   private final class_6541 field_49259;
   private final class_5799 field_49254;
   private final List<? super class_7624> field_49261;
   private final Random field_49262;
   private final Deque<class_1522> field_49257 = Queues.newArrayDeque();

   private class_9670(class_8669<class_8115> var1, int var2, class_1242 var3, class_6541 var4, class_5799 var5, List<? super class_7624> var6, Random var7) {
      this.field_49258 = var1;
      this.field_49260 = var2;
      this.field_49255 = var3;
      this.field_49259 = var4;
      this.field_49254 = var5;
      this.field_49261 = var6;
      this.field_49262 = var7;
   }

   private void method_44721(class_7624 var1, MutableObject<class_4190> var2, int var3, int var4, boolean var5) {
      class_2609 var8 = var1.method_34553();
      class_1331 var9 = var1.method_34555();
      class_6631 var10 = var1.method_32528();
      class_7599 var11 = var8.method_11834();
      boolean var12 = var11 == class_7599.field_38708;
      MutableObject var13 = new MutableObject();
      class_9616 var14 = var1.method_32512();
      int var15 = var14.field_48995;

      label174:
      for (class_4099 var17 : var8.method_11829(this.field_49254, var9, var10, this.field_49262)) {
         class_240 var18 = class_195.method_860(var17.field_19967);
         class_1331 var19 = var17.field_19965;
         class_1331 var20 = var19.method_6098(var18);
         int var21 = var19.method_12165() - var15;
         int var22 = -1;
         class_4639 var23 = new class_4639(var17.field_19968.method_25965("pool"));
         Optional var24 = this.field_49258.method_39794(var23);
         if (!var24.isPresent() || ((class_8115)var24.get()).method_36914() == 0 && !Objects.equals(var23, class_9863.field_49908.method_25499())) {
            class_6006.method_27410().warn("Empty or none existent pool: {}", var23);
         } else {
            class_4639 var25 = ((class_8115)var24.get()).method_36911();
            Optional var26 = this.field_49258.method_39794(var25);
            if (var26.isPresent() && (((class_8115)var26.get()).method_36914() != 0 || Objects.equals(var25, class_9863.field_49908.method_25499()))) {
               boolean var27 = var14.method_44395(var20);
               MutableObject var28;
               int var29;
               if (!var27) {
                  var28 = var2;
                  var29 = var3;
               } else {
                  var28 = var13;
                  var29 = var15;
                  if (var13.getValue() == null) {
                     var13.setValue(class_3370.method_15523(class_4092.method_18912(var14)));
                  }
               }

               ArrayList var30 = Lists.newArrayList();
               if (var4 != this.field_49260) {
                  var30.addAll(((class_8115)var24.get()).method_36917(this.field_49262));
               }

               var30.addAll(((class_8115)var26.get()).method_36917(this.field_49262));

               for (class_2609 var32 : var30) {
                  if (var32 == class_2044.field_10352) {
                     break;
                  }

                  for (class_6631 var34 : class_6631.method_30487(this.field_49262)) {
                     List var35 = var32.method_11829(this.field_49254, class_1331.field_7306, var34, this.field_49262);
                     class_9616 var36 = var32.method_11832(this.field_49254, class_1331.field_7306, var34);
                     int var37;
                     if (var5 && var36.method_44398() <= 16) {
                        var37 = var35.stream().mapToInt(var2x -> {
                           if (var36.method_44395(var2x.field_19965.method_6098(class_195.method_860(var2x.field_19967)))) {
                              class_4639 var5x = new class_4639(var2x.field_19968.method_25965("pool"));
                              Optional var6 = this.field_49258.method_39794(var5x);
                              Optional var7 = var6.<class_8115>flatMap(var1xx -> this.field_49258.method_39794(var1xx.method_36911()));
                              int var8x = var6.<Integer>map(var1xx -> var1xx.method_36913(this.field_49254)).orElse(0);
                              int var9x = var7.<Integer>map(var1xx -> var1xx.method_36913(this.field_49254)).orElse(0);
                              return Math.max(var8x, var9x);
                           } else {
                              return 0;
                           }
                        }).max().orElse(0);
                     } else {
                        var37 = 0;
                     }

                     for (class_4099 var39 : var35) {
                        if (class_195.method_862(var17, var39)) {
                           class_1331 var40 = var39.field_19965;
                           class_1331 var41 = new class_1331(
                              var20.method_12173() - var40.method_12173(),
                              var20.method_12165() - var40.method_12165(),
                              var20.method_12185() - var40.method_12185()
                           );
                           class_9616 var42 = var32.method_11832(this.field_49254, var41, var34);
                           int var43 = var42.field_48995;
                           class_7599 var44 = var32.method_11834();
                           boolean var45 = var44 == class_7599.field_38708;
                           int var46 = var40.method_12165();
                           int var47 = var21 - var46 + class_195.method_860(var17.field_19967).method_1054();
                           int var48;
                           if (var12 && var45) {
                              var48 = var15 + var47;
                           } else {
                              if (var22 == -1) {
                                 var22 = this.field_49259.method_29831(var19.method_12173(), var19.method_12185(), class_3801.field_18598);
                              }

                              var48 = var22 - var46;
                           }

                           int var49 = var48 - var43;
                           class_9616 var50 = var42.method_44399(0, var49, 0);
                           class_1331 var51 = var41.method_6104(0, var49, 0);
                           if (var37 > 0) {
                              int var52 = Math.max(var37 + 1, var50.field_48993 - var50.field_48995);
                              var50.field_48993 = var50.field_48995 + var52;
                           }

                           if (!class_3370.method_15537(
                              (class_4190)var28.getValue(), class_3370.method_15523(class_4092.method_18912(var50).method_18924(0.25)), class_8529.field_43654
                           )) {
                              var28.setValue(
                                 class_3370.method_15529(
                                    (class_4190)var28.getValue(), class_3370.method_15523(class_4092.method_18912(var50)), class_8529.field_43656
                                 )
                              );
                              int var56 = var1.method_34558();
                              int var53;
                              if (!var45) {
                                 var53 = var32.method_11833();
                              } else {
                                 var53 = var56 - var47;
                              }

                              class_7624 var54 = this.field_49255.method_5536(this.field_49254, var32, var51, var53, var34, var50);
                              int var55;
                              if (!var12) {
                                 if (!var45) {
                                    if (var22 == -1) {
                                       var22 = this.field_49259.method_29831(var19.method_12173(), var19.method_12185(), class_3801.field_18598);
                                    }

                                    var55 = var22 + var47 / 2;
                                 } else {
                                    var55 = var48 + var46;
                                 }
                              } else {
                                 var55 = var15 + var21;
                              }

                              var1.method_34556(new class_98(var20.method_12173(), var55 - var21 + var56, var20.method_12185(), var47, var44));
                              var54.method_34556(new class_98(var19.method_12173(), var55 - var46 + var53, var19.method_12185(), -var47, var11));
                              this.field_49261.add(var54);
                              if (var4 + 1 <= this.field_49260) {
                                 this.field_49257.addLast(new class_1522(var54, var28, var29, var4 + 1, null));
                              }
                              continue label174;
                           }
                        }
                     }
                  }
               }
            } else {
               class_6006.method_27410().warn("Empty or none existent fallback pool: {}", var25);
            }
         }
      }
   }
}
