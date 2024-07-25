package remapped;

import com.mojang.authlib.GameProfile;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class class_9762 {
   private static final class_4816[] field_49586 = Arrays.<class_9077>stream(class_9077.values())
      .sorted(Comparator.comparingInt(class_9077::method_41794))
      .<class_4816>map(class_4816::new)
      .<class_4816>toArray(class_4816[]::new);
   private static final class_4816 field_49578 = new class_4816((class_9077)null);
   public static final class_9762 field_49579 = new class_9762();
   private final class_7099 field_49584 = new class_7099();
   private final class_7099 field_49582 = new class_1962();
   private final class_9180 field_49585 = new class_9180();
   private final class_8837 field_49583 = new class_8837();
   private final class_1578 field_49581 = new class_1578();
   private final class_3756 field_49580 = new class_3756();
   private final class_4523 field_49588 = new class_4523();
   private final class_8825 field_49577 = new class_8825();

   public void method_45049(class_6098 var1, class_5612 var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      if (class_5052.method_23281()) {
         class_5052.method_23286();
      }

      this.method_45050(var1, var3, var4, var5, var6);
      if (class_5052.method_23281()) {
         if (class_5052.method_23269()) {
            class_5052.method_23282();
            this.method_45050(var1, var3, var4, class_5778.field_29187, var6);
            class_5052.method_23278();
         }

         class_5052.method_23275();
      }
   }

   public void method_45050(class_6098 var1, class_7966 var2, class_2565 var3, int var4, int var5) {
      class_2451 var8 = var1.method_27960();
      if (!(var8 instanceof class_6201)) {
         if (var8 != class_4897.field_24840) {
            if (var8 == class_4897.field_25086) {
               var2.method_36063();
               var2.method_36062(1.0F, -1.0F, -1.0F);
               class_7907 var9 = class_8765.method_40275(var3, this.field_49577.method_45498(class_8825.field_45139), false, var1.method_27977());
               this.field_49577.method_45499(var2, var9, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
               var2.method_36064();
            }
         } else {
            boolean var13 = var1.method_28021("BlockEntityTag") != null;
            var2.method_36063();
            var2.method_36062(1.0F, -1.0F, -1.0F);
            class_2843 var11 = !var13 ? class_6560.field_33457 : class_6560.field_33440;
            class_7907 var10 = var11.method_12947()
               .method_23601(class_8765.method_40275(var3, this.field_49588.method_45498(var11.method_12946()), true, var1.method_27977()));
            this.field_49588.method_21018().method_7061(var2, var10, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
            if (!var13) {
               this.field_49588.method_21019().method_7061(var2, var10, var4, var5, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
               List var12 = class_8837.method_40658(class_8440.method_38824(var1), class_8837.method_40656(var1));
               class_9429.method_43642(var2, var3, var4, var5, this.field_49588.method_21019(), var11, false, var12, var1.method_27977());
            }

            var2.method_36064();
         }
      } else {
         class_6414 var14 = ((class_6201)var8).method_28392();
         if (!(var14 instanceof class_8550)) {
            Object var17;
            if (!(var14 instanceof class_764)) {
               if (!(var14 instanceof class_3633)) {
                  if (var14 != class_4783.field_23906) {
                     if (var14 != class_4783.field_23471) {
                        if (var14 != class_4783.field_23492) {
                           if (var14 != class_4783.field_23739) {
                              if (!(var14 instanceof class_3153)) {
                                 return;
                              }

                              class_9077 var15 = class_3153.method_14553(var8);
                              if (var15 != null) {
                                 var17 = field_49586[var15.method_41794()];
                              } else {
                                 var17 = field_49578;
                              }
                           } else {
                              var17 = this.field_49582;
                           }
                        } else {
                           var17 = this.field_49585;
                        }
                     } else {
                        var17 = this.field_49584;
                     }
                  } else {
                     var17 = this.field_49580;
                  }
               } else {
                  this.field_49581.method_7116(((class_3633)var14).method_16935());
                  var17 = this.field_49581;
               }
            } else {
               this.field_49583.method_40657(var1, ((class_764)var14).method_3443());
               var17 = this.field_49583;
            }

            class_3569.field_17468.method_16592((class_3757)var17, var2, var3, var4, var5);
         } else {
            GameProfile var18 = null;
            if (var1.method_28002()) {
               class_5734 var16 = var1.method_27990();
               if (!var16.method_25939("SkullOwner", 10)) {
                  if (var16.method_25939("SkullOwner", 8) && !StringUtils.isBlank(var16.method_25965("SkullOwner"))) {
                     GameProfile var19 = new GameProfile((UUID)null, var16.method_25965("SkullOwner"));
                     var18 = class_4797.method_22108(var19);
                     var16.method_25959("SkullOwner");
                     var16.method_25946("SkullOwner", class_4338.method_20177(new class_5734(), var18));
                  }
               } else {
                  var18 = class_4338.method_20184(var16.method_25937("SkullOwner"));
               }
            }

            class_903.method_3866((class_240)null, 180.0F, ((class_8550)var14).method_39336(), var18, 0.0F, var2, var3, var4);
         }
      }
   }
}
