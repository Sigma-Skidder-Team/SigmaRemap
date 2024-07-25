package remapped;

import java.util.List;
import java.util.UUID;

public class class_1206 extends class_7238 {
   public class_1206(class_6890 var1) {
      super(var1, class_1189.class);
   }

   @Override
   public void method_33132(int var1, class_754 var2, class_5407 var3, List<class_5407> var4, class_1455 var5) throws Exception {
      class_3164 var8 = class_3164.method_14602(var2, var3.method_24602());
      if (var8 == null) {
         throw new Exception("Could not find valid metadata");
      } else if (var8.method_14601() == class_4907.field_25375) {
         var4.remove(var3);
      } else {
         var3.method_24605(var8.method_14606());
         var3.method_24608(var8.method_14601());
         Object var9 = var3.method_24609();
         switch (var8.method_14601()) {
            case field_25378:
               if (var8.method_14605() == class_7616.field_38760) {
                  var3.method_24607(var9);
               }

               if (var8.method_14605() == class_7616.field_38759) {
                  var3.method_24607(((Integer)var9).byteValue());
               }

               if (var8 == class_3164.field_15744 && var2 == class_5813.field_29404) {
                  Byte var16 = (byte)0;
                  if (((Byte)var9 & 16) == 16) {
                     var16 = (byte)1;
                  }

                  int var17 = class_3164.field_15750.method_14606();
                  class_4907 var18 = class_3164.field_15750.method_14601();
                  var4.add(new class_5407(var17, var18, var16));
               }
               break;
            case field_25376:
               String var10 = (String)var9;
               UUID var11 = null;
               if (!var10.isEmpty()) {
                  try {
                     var11 = UUID.fromString(var10);
                  } catch (Exception var14) {
                  }
               }

               var3.method_24607(var11);
               break;
            case field_25390:
               if (var8.method_14605() == class_7616.field_38760) {
                  var3.method_24607(((Byte)var9).intValue());
               }

               if (var8.method_14605() == class_7616.field_38764) {
                  var3.method_24607(((Short)var9).intValue());
               }

               if (var8.method_14605() == class_7616.field_38759) {
                  var3.method_24607(var9);
               }
               break;
            case field_25382:
               var3.method_24607(var9);
               break;
            case field_25386:
               var3.method_24607(var9);
               break;
            case field_25380:
               if (var8 == class_3164.field_15754) {
                  var3.method_24607((Byte)var9 < 0);
               } else {
                  var3.method_24607((Byte)var9 != 0);
               }
               break;
            case field_25383:
               var3.method_24607(var9);
               class_5825.method_26375((class_9530)var3.method_24609());
               break;
            case field_25385:
               class_9348 var12 = (class_9348)var9;
               var3.method_24607(var12);
               break;
            case field_25388:
               class_5434 var13 = (class_5434)var9;
               var3.method_24607(var13);
               break;
            case field_25374:
               var9 = class_6890.method_31574(var9.toString());
               var3.method_24607(var9);
               break;
            case field_25391:
               var3.method_24607(((Number)var9).intValue());
               break;
            default:
               var4.remove(var3);
               throw new Exception("Unhandled MetaDataType: " + var8.method_14601());
         }
      }
   }

   @Override
   public class_754 method_33127(int var1) {
      return class_6624.method_30444(var1, false);
   }

   @Override
   public class_754 method_33114(int var1) {
      return class_6624.method_30444(var1, true);
   }
}
