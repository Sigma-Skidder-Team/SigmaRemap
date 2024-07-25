package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class class_65 {
   private final List<class_2069> field_79 = Lists.newArrayListWithCapacity(20);
   private class_2069 field_82;
   private final class_9205 field_72 = new class_9205();
   private class_1893 field_81;
   private final List<class_5140> field_76 = Lists.newArrayList();
   private List<class_7735> field_78;
   private class_5986 field_73;
   private class_5986 field_71;
   private int field_74;
   private int field_75;
   private class_1147 field_77;
   private class_8932<?> field_70;
   private class_7735 field_80;

   public class_65() {
      for (int var3 = 0; var3 < 20; var3++) {
         this.field_79.add(new class_2069());
      }
   }

   public void method_49(class_1893 var1, int var2, int var3) {
      this.field_81 = var1;
      this.field_77 = var1.field_9632.method_27334();

      for (int var6 = 0; var6 < this.field_79.size(); var6++) {
         this.field_79.get(var6).method_9668(var2 + 11 + 25 * (var6 % 5), var3 + 31 + 25 * (var6 / 5));
      }

      this.field_73 = new class_5986(var2 + 93, var3 + 137, 12, 17, false);
      this.field_73.method_27297(1, 208, 13, 18, class_8002.field_40990);
      this.field_71 = new class_5986(var2 + 38, var3 + 137, 12, 17, true);
      this.field_71.method_27297(1, 208, 13, 18, class_8002.field_40990);
   }

   public void method_52(class_8002 var1) {
      this.field_76.remove(var1);
      this.field_76.add(var1);
   }

   public void method_58(List<class_7735> var1, boolean var2) {
      this.field_78 = var1;
      this.field_74 = (int)Math.ceil((double)var1.size() / 20.0);
      if (this.field_74 <= this.field_75 || var2) {
         this.field_75 = 0;
      }

      this.method_46();
   }

   private void method_46() {
      int var3 = 20 * this.field_75;

      for (int var4 = 0; var4 < this.field_79.size(); var4++) {
         class_2069 var5 = this.field_79.get(var4);
         if (var3 + var4 >= this.field_78.size()) {
            var5.field_36677 = false;
         } else {
            class_7735 var6 = this.field_78.get(var3 + var4);
            var5.method_9666(var6, this);
            var5.field_36677 = true;
         }
      }

      this.method_50();
   }

   private void method_50() {
      this.field_73.field_36677 = this.field_74 > 1 && this.field_75 < this.field_74 - 1;
      this.field_71.field_36677 = this.field_74 > 1 && this.field_75 > 0;
   }

   public void method_45(class_7966 var1, int var2, int var3, int var4, int var5, float var6) {
      if (this.field_74 > 1) {
         String var9 = this.field_75 + 1 + "/" + this.field_74;
         int var10 = this.field_81.field_9668.method_45395(var9);
         this.field_81.field_9668.method_45385(var1, var9, (float)(var2 - var10 / 2 + 73), (float)(var3 + 141), -1);
      }

      this.field_82 = null;

      for (class_2069 var12 : this.field_79) {
         var12.method_6767(var1, var4, var5, var6);
         if (var12.field_36677 && var12.method_32703()) {
            this.field_82 = var12;
         }
      }

      this.field_71.method_6767(var1, var4, var5, var6);
      this.field_73.method_6767(var1, var4, var5, var6);
      this.field_72.method_6767(var1, var4, var5, var6);
   }

   public void method_54(class_7966 var1, int var2, int var3) {
      if (this.field_81.field_9623 != null && this.field_82 != null && !this.field_72.method_42468()) {
         this.field_81.field_9623.method_1160(var1, this.field_82.method_9665(this.field_81.field_9623), var2, var3);
      }
   }

   @Nullable
   public class_8932<?> method_55() {
      return this.field_70;
   }

   @Nullable
   public class_7735 method_57() {
      return this.field_80;
   }

   public void method_51() {
      this.field_72.method_42474(false);
   }

   public boolean method_53(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      this.field_70 = null;
      this.field_80 = null;
      if (this.field_72.method_42468()) {
         if (!this.field_72.method_26940(var1, var3, var5)) {
            this.field_72.method_42474(false);
         } else {
            this.field_70 = this.field_72.method_42471();
            this.field_80 = this.field_72.method_42466();
         }

         return true;
      } else if (this.field_73.method_26940(var1, var3, var5)) {
         this.field_75++;
         this.method_46();
         return true;
      } else if (this.field_71.method_26940(var1, var3, var5)) {
         this.field_75--;
         this.method_46();
         return true;
      } else {
         for (class_2069 var13 : this.field_79) {
            if (var13.method_26940(var1, var3, var5)) {
               if (var5 != 0) {
                  if (var5 == 1 && !this.field_72.method_42468() && !var13.method_9667()) {
                     this.field_72
                        .method_42465(
                           this.field_81,
                           var13.method_9663(),
                           var13.field_36670,
                           var13.field_36674,
                           var6 + var8 / 2,
                           var7 + 13 + var9 / 2,
                           (float)var13.method_32699()
                        );
                  }
               } else {
                  this.field_70 = var13.method_9662();
                  this.field_80 = var13.method_9663();
               }

               return true;
            }
         }

         return false;
      }
   }

   public void method_56(List<class_8932<?>> var1) {
      for (class_5140 var5 : this.field_76) {
         var5.method_23554(var1);
      }
   }

   public class_1893 method_48() {
      return this.field_81;
   }

   public class_1147 method_59() {
      return this.field_77;
   }
}
