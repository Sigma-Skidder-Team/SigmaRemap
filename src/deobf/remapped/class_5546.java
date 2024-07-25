package remapped;

public class class_5546 extends class_2733 {
   public class_5546() {
      super(class_6629.field_34307, "guardian", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_2574();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (!(var1 instanceof class_2574)) {
         return null;
      } else {
         class_2574 var5 = (class_2574)var1;
         if (!var2.equals("body")) {
            if (var2.equals("eye")) {
               return (class_1549)class_7860.method_35557(var5, class_7860.field_40002);
            } else {
               String var6 = "spine";
               if (!var2.startsWith(var6)) {
                  String var11 = "tail";
                  if (!var2.startsWith(var11)) {
                     return null;
                  } else {
                     class_1549[] var12 = (class_1549[])class_7860.method_35557(var5, class_7860.field_39868);
                     if (var12 == null) {
                        return null;
                     } else {
                        String var14 = var2.substring(var11.length());
                        int var10 = class_3111.method_14361(var14, -1);
                        var10--;
                        return var10 >= 0 && var10 < var12.length ? var12[var10] : null;
                     }
                  }
               } else {
                  class_1549[] var7 = (class_1549[])class_7860.method_35557(var5, class_7860.field_40069);
                  if (var7 == null) {
                     return null;
                  } else {
                     String var8 = var2.substring(var6.length());
                     int var9 = class_3111.method_14361(var8, -1);
                     var9--;
                     return var9 >= 0 && var9 < var7.length ? var7[var9] : null;
                  }
               }
            }
         } else {
            return (class_1549)class_7860.method_35557(var5, class_7860.field_39928);
         }
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{
         "body",
         "eye",
         "spine1",
         "spine2",
         "spine3",
         "spine4",
         "spine5",
         "spine6",
         "spine7",
         "spine8",
         "spine9",
         "spine10",
         "spine11",
         "spine12",
         "tail1",
         "tail2",
         "tail3"
      };
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_763 var6 = new class_763(var5);
      var6.field_32487 = (class_2574)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
