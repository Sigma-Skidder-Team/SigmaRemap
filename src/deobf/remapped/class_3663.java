package remapped;

import java.util.UUID;

public class class_3663 {
   public static void method_17002(class_757 var0) {
      class_3672 var3 = new class_3672(var0, class_3663::method_17004, class_3663::method_17006);
      var0.method_19015(class_2786.field_13620, new class_6379());
      var0.method_19015(class_2786.field_13636, new class_5777());
      var0.method_19015(class_2786.field_13624, new class_810());
      var3.method_17042(class_2786.field_13674);
      var3.method_17040(class_2786.field_13623, class_8039.field_41134);
      var3.method_17041(class_2786.field_13685, class_8039.field_41162);
      var3.method_17038(class_2786.field_13643, class_8039.field_41162);
      var3.method_17045(class_2786.field_13660, class_8039.field_41162);
      var0.method_19015(class_2786.field_13596, new class_7992());
      new class_6195(var0, class_3663::method_17004).method_24893(class_2786.field_13603);
      var3.method_17036(class_4805.field_24044, class_8039.field_41162);
      var3.method_17039(class_4805.field_24003, class_8039.field_41162);
      var0.method_18992(class_4805.field_24032, new class_6812());
      var0.method_18992(class_4805.field_24051, new class_8419());
      var3.method_17034(class_2786.field_13617, class_8039.field_41162, class_8039.field_41147);
   }

   public static void method_17004(class_9530 var0) {
      if (var0 != null) {
         if (var0.method_43963() == 771 && var0.method_43959() != null) {
            class_5531 var3 = var0.method_43959();
            class_5287 var4 = var3.<class_5287>method_25123("SkullOwner");
            if (var4 instanceof class_5531) {
               class_5531 var5 = (class_5531)var4;
               class_5287 var6 = var5.<class_5287>method_25123("Id");
               if (var6 instanceof class_887) {
                  UUID var7 = UUID.fromString((String)var6.method_24129());
                  var5.<class_7356>method_25122(new class_7356("Id", class_8326.method_38360(var7)));
               }
            }
         }

         method_17007(var0);
         var0.method_43965(class_757.field_4103.method_28210(var0.method_43963()));
      }
   }

   public static void method_17006(class_9530 var0) {
      if (var0 != null) {
         var0.method_43965(class_757.field_4103.method_28204(var0.method_43963()));
         if (var0.method_43963() == 771 && var0.method_43959() != null) {
            class_5531 var3 = var0.method_43959();
            class_5287 var4 = var3.<class_5287>method_25123("SkullOwner");
            if (var4 instanceof class_5531) {
               class_5531 var5 = (class_5531)var4;
               class_5287 var6 = var5.<class_5287>method_25123("Id");
               if (var6 instanceof class_7356) {
                  UUID var7 = class_8326.method_38362((int[])var6.method_24129());
                  var5.<class_887>method_25122(new class_887("Id", var7.toString()));
               }
            }
         }

         method_17008(var0);
      }
   }

   public static void method_17007(class_9530 var0) {
      if (var0.method_43959() != null) {
         class_913 var3 = var0.method_43959().<class_913>method_25123("AttributeModifiers");
         if (var3 != null) {
            for (class_5287 var5 : var3) {
               class_5531 var6 = (class_5531)var5;
               method_17005(var6, "AttributeName", false);
               method_17005(var6, "Name", false);
               class_5287 var7 = var6.<class_5287>method_25123("UUIDLeast");
               if (var7 != null) {
                  class_5287 var8 = var6.<class_5287>method_25123("UUIDMost");
                  int[] var9 = class_8326.method_38359(((Number)var7.method_24129()).longValue(), ((Number)var8.method_24129()).longValue());
                  var6.<class_7356>method_25122(new class_7356("UUID", var9));
               }
            }
         }
      }
   }

   public static void method_17008(class_9530 var0) {
      if (var0.method_43959() != null) {
         class_913 var3 = var0.method_43959().<class_913>method_25123("AttributeModifiers");
         if (var3 != null) {
            for (class_5287 var5 : var3) {
               class_5531 var6 = (class_5531)var5;
               method_17005(var6, "AttributeName", true);
               method_17005(var6, "Name", true);
               class_7356 var7 = var6.<class_7356>method_25123("UUID");
               if (var7 != null) {
                  UUID var8 = class_8326.method_38362(var7.method_33512());
                  var6.<class_8735>method_25122(new class_8735("UUIDLeast", var8.getLeastSignificantBits()));
                  var6.<class_8735>method_25122(new class_8735("UUIDMost", var8.getMostSignificantBits()));
               }
            }
         }
      }
   }

   public static void method_17005(class_5531 var0, String var1, boolean var2) {
      class_887 var5 = var0.<class_887>method_25123(var1);
      if (var5 != null) {
         String var6 = var5.method_3809();
         if (var2 && !var6.startsWith("minecraft:")) {
            var6 = "minecraft:" + var6;
         }

         String var7 = (String)(!var2 ? class_757.field_4103.method_8667() : class_757.field_4103.method_8667().inverse()).get(var6);
         if (var7 != null) {
            var5.method_3808(var7);
         }
      }
   }
}
