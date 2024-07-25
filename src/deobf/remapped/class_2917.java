package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class class_2917 extends class_1097 {
   private static String[] field_14240;
   private final class_341 field_14238;
   private final Set<class_4399> field_14241 = Sets.newHashSet();
   private Runnable[] field_14239 = new Runnable[0];

   public class_2917(class_341 var1) {
      this.field_14238 = var1;
   }

   @Override
   public void method_4868(class_8274 var1) {
      super.method_4868(var1);
      if (this.field_14241.contains(var1.method_38149())) {
         this.field_14238
            .method_1600()
            .method_39972(new class_1625(class_9120.field_46678, var1.method_38149().method_20490(), var1.method_38147(), var1.method_38146()));
      }

      this.method_13349();
   }

   @Override
   public void method_4838(String var1) {
      super.method_4838(var1);
      this.field_14238.method_1600().method_39972(new class_1625(class_9120.field_46675, (String)null, var1, 0));
      this.method_13349();
   }

   @Override
   public void method_4839(String var1, class_4399 var2) {
      super.method_4839(var1, var2);
      if (this.field_14241.contains(var2)) {
         this.field_14238.method_1600().method_39972(new class_1625(class_9120.field_46675, var2.method_20490(), var1, 0));
      }

      this.method_13349();
   }

   @Override
   public void method_4831(int var1, class_4399 var2) {
      class_4399 var5 = this.method_4833(var1);
      super.method_4831(var1, var2);
      if (var5 != var2 && var5 != null) {
         if (this.method_13351(var5) <= 0) {
            this.method_13353(var5);
         } else {
            this.field_14238.method_1600().method_39972(new class_624(var1, var2));
         }
      }

      if (var2 != null) {
         if (!this.field_14241.contains(var2)) {
            this.method_13348(var2);
         } else {
            this.field_14238.method_1600().method_39972(new class_624(var1, var2));
         }
      }

      this.method_13349();
   }

   @Override
   public boolean method_4842(String var1, class_3903 var2) {
      if (!super.method_4842(var1, var2)) {
         return false;
      } else {
         this.field_14238.method_1600().method_39972(new class_8077(var2, Arrays.<String>asList(var1), 3));
         this.method_13349();
         return true;
      }
   }

   @Override
   public void method_4860(String var1, class_3903 var2) {
      super.method_4860(var1, var2);
      this.field_14238.method_1600().method_39972(new class_8077(var2, Arrays.<String>asList(var1), 4));
      this.method_13349();
   }

   @Override
   public void method_4864(class_4399 var1) {
      super.method_4864(var1);
      this.method_13349();
   }

   @Override
   public void method_4845(class_4399 var1) {
      super.method_4845(var1);
      if (this.field_14241.contains(var1)) {
         this.field_14238.method_1600().method_39972(new class_3263(var1, 2));
      }

      this.method_13349();
   }

   @Override
   public void method_4844(class_4399 var1) {
      super.method_4844(var1);
      if (this.field_14241.contains(var1)) {
         this.method_13353(var1);
      }

      this.method_13349();
   }

   @Override
   public void method_4846(class_3903 var1) {
      super.method_4846(var1);
      this.field_14238.method_1600().method_39972(new class_8077(var1, 0));
      this.method_13349();
   }

   @Override
   public void method_4862(class_3903 var1) {
      super.method_4862(var1);
      this.field_14238.method_1600().method_39972(new class_8077(var1, 2));
      this.method_13349();
   }

   @Override
   public void method_4840(class_3903 var1) {
      super.method_4840(var1);
      this.field_14238.method_1600().method_39972(new class_8077(var1, 1));
      this.method_13349();
   }

   public void method_13352(Runnable var1) {
      this.field_14239 = Arrays.<Runnable>copyOf(this.field_14239, this.field_14239.length + 1);
      this.field_14239[this.field_14239.length - 1] = var1;
   }

   public void method_13349() {
      for (Runnable var6 : this.field_14239) {
         var6.run();
      }
   }

   public List<class_6310<?>> method_13354(class_4399 var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.add(new class_3263(var1, 0));

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method_4833(var5) == var1) {
            var4.add(new class_624(var5, var1));
         }
      }

      for (class_8274 var6 : this.method_4863(var1)) {
         var4.add(new class_1625(class_9120.field_46678, var6.method_38149().method_20490(), var6.method_38147(), var6.method_38146()));
      }

      return var4;
   }

   public void method_13348(class_4399 var1) {
      List var4 = this.method_13354(var1);

      for (class_9359 var6 : this.field_14238.method_1600().method_39951()) {
         for (class_6310 var8 : var4) {
            var6.field_47794.method_4156(var8);
         }
      }

      this.field_14241.add(var1);
   }

   public List<class_6310<?>> method_13350(class_4399 var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.add(new class_3263(var1, 1));

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method_4833(var5) == var1) {
            var4.add(new class_624(var5, var1));
         }
      }

      return var4;
   }

   public void method_13353(class_4399 var1) {
      List var4 = this.method_13350(var1);

      for (class_9359 var6 : this.field_14238.method_1600().method_39951()) {
         for (class_6310 var8 : var4) {
            var6.field_47794.method_4156(var8);
         }
      }

      this.field_14241.remove(var1);
   }

   public int method_13351(class_4399 var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method_4833(var5) == var1) {
            var4++;
         }
      }

      return var4;
   }
}
