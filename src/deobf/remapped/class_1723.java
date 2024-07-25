package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class class_1723 extends class_1859 {
   private List<String> field_8895 = new ArrayList<String>();
   private class_2612 field_8896;
   private class_3004 field_8897;
   private boolean field_8899;

   public class_1723(class_7038 var1, String var2, int var3, int var4, int var5, int var6, boolean var7, String... var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_8899 = var7;
      this.method_32148(this.field_8897 = new class_3004(this, "textbox", 0, 0, var5, 32, class_3004.field_14738, "", "Search...", class_5320.field_27138));
      this.field_8897.method_32144(class_5320.field_27139);
      this.field_8897.method_13721(var1x -> this.method_7718(this.field_8897.method_32165()));
      this.method_7721(var8);
      this.method_7718("");
   }

   public void method_7718(String var1) {
      this.method_32102(() -> {
         if (this.field_8896 != null) {
            this.method_32179(this.field_8896);
         }

         this.method_32148(this.field_8896 = new class_2612(this, "scrollview", 0, 40, this.field_36278, this.field_36257 - 40));
         byte var4 = 40;
         ArrayList var5 = new ArrayList();

         for (class_2451 var7 : class_8669.field_44382) {
            var5.add(var7);
         }

         var5.add(new class_6201(class_4783.field_23588, new class_317().method_1474(class_8230.field_42261)));
         var5.add(new class_6201(class_4783.field_23258, new class_317().method_1474(class_8230.field_42261)));

         for (class_2451 var13 : method_7720(var5, var1)) {
            if (var13 != class_4897.field_25302 && (!this.field_8899 || var13 instanceof class_6201)) {
               class_4639 var8 = class_8669.field_44382.method_39797(var13);
               String var9;
               if (var13 instanceof class_6201 && var8.method_21456().equals("air")) {
                  var9 = class_8669.field_44462.method_39797(((class_6201)var13).method_28392()).toString();
               } else {
                  var9 = var8.toString();
               }

               class_4792 var10;
               this.field_8896.method_32148(var10 = new class_4792(this, "btn" + var9, 0, 0, var4, var4, var13.method_11207()));
               var10.method_22099(this.field_8895.contains(var9), false);
               var10.method_8236(var3 -> {
                  int var6 = this.field_8895.size();
                  this.field_8895.remove(var9);
                  if (var10.method_22100()) {
                     this.field_8895.add(var9);
                  }

                  if (var6 != this.field_8895.size()) {
                     this.method_8235();
                  }
               });
            }
         }

         this.field_8896.method_11850().method_32153(new class_1616(0));
      });
   }

   public static List<class_2451> method_7720(List<class_2451> var0, String var1) {
      var1 = var1.toLowerCase();
      if (var1.length() != 0) {
         ArrayList var4 = new ArrayList();
         Iterator var5 = var0.iterator();

         while (var5.hasNext()) {
            class_2451 var6 = (class_2451)var5.next();
            if (var6.method_11219().getString().toLowerCase().startsWith(var1.toLowerCase())) {
               var4.add(var6);
               var5.remove();
            }
         }

         Iterator var9 = var0.iterator();

         while (var9.hasNext()) {
            class_2451 var7 = (class_2451)var9.next();
            if (var7.method_11219().getString().toLowerCase().contains(var1.toLowerCase())) {
               var4.add(var7);
               var9.remove();
            }
         }

         var4.addAll(var0);
         return var4;
      } else {
         return var0;
      }
   }

   @Override
   public void method_32178(float var1) {
      super.method_32178(var1);
   }

   public void method_7721(String... var1) {
      this.field_8895.clear();
      this.field_8895.addAll(Arrays.asList(var1));
   }

   public List<String> method_7719() {
      return this.field_8895;
   }
}
