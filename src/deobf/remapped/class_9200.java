package remapped;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;

public class class_9200 extends class_4486 {
   private List<class_4106> field_47073;
   private class_1455 field_47072;

   public class_9200(class_1455 var1) {
      this.method_19025(var1);
   }

   @Override
   public void method_18998() {
      this.field_47073 = new CopyOnWriteArrayList<class_4106>();
      this.field_47073.add(class_6710.field_34664);
   }

   @Override
   public void method_19025(class_1455 var1) {
      this.field_47072 = var1;
      class_3790 var4 = new class_3790(var1);
      var4.method_17600(this);
      var1.method_6709(var4);

      for (class_4106 var6 : this.field_47073) {
         var6.method_19025(var1);
      }
   }

   public void method_42444(class_4106 var1) {
      if (this.field_47073 == null) {
         throw new NullPointerException("Tried to add protocol too early");
      } else {
         this.field_47073.add(var1);
         var1.method_19025(this.field_47072);
         ArrayList var4 = new ArrayList();

         for (class_4106 var6 : this.field_47073) {
            if (class_6710.method_30779(var6)) {
               var4.add(var6);
            }
         }

         this.field_47073.removeAll(var4);
         this.field_47073.addAll(var4);
      }
   }

   @Override
   public void method_18999(class_3842 var1, class_1730 var2, class_5051 var3) throws Exception {
      int var6 = var3.method_23250();
      var3.method_23238(var1, var2, 0, this.field_47073, var1 == class_3842.field_18754);
      super.method_18999(var1, var2, var3);
      if (class_3446.method_15883().method_33731()) {
         this.method_42446(var1, var2, var3, var6);
      }
   }

   private void method_42446(class_3842 var1, class_1730 var2, class_5051 var3, int var4) {
      int var7 = this.field_47072.method_6744().method_17604();
      class_7642 var8 = class_3446.method_15886();
      String var9 = var3.method_23255().method_6744().method_17602();
      String var10 = var9 == null ? "" : var9 + " ";
      var8.method_34617()
         .log(
            Level.INFO,
            "{0}{1} {2}: {3} (0x{4}) -> {5} (0x{6}) [{7}] {8}",
            new Object[]{
               var10, var1, var2, var4, Integer.toHexString(var4), var3.method_23250(), Integer.toHexString(var3.method_23250()), Integer.toString(var7), var3
            }
         );
   }

   public boolean method_42441(Class<? extends class_4106> var1) {
      for (class_4106 var5 : this.field_47073) {
         if (var5.getClass().equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public <P extends class_4106> P method_42440(Class<P> var1) {
      for (class_4106 var5 : this.field_47073) {
         if (var5.getClass() == var1) {
            return (P)var5;
         }
      }

      return null;
   }

   public boolean method_42445(Object var1, List var2) throws Exception {
      for (class_4106 var6 : this.field_47073) {
         if (var6.method_19000(var1.getClass())) {
            var6.method_19004(this.field_47072, var1, var2);
            return true;
         }
      }

      return false;
   }

   public List<class_4106> method_42443() {
      return this.field_47073;
   }

   public void method_42442() {
      this.method_42443().clear();
      this.method_18998();
   }
}
