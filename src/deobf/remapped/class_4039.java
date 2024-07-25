package remapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class class_4039 implements class_6310<class_392> {
   private int field_19603;
   private final List<class_3032> field_19604 = Lists.newArrayList();

   public class_4039() {
   }

   public class_4039(int var1, Collection<class_9747> var2) {
      this.field_19603 = var1;

      for (class_9747 var6 : var2) {
         this.field_19604.add(new class_3032(this, (double)var6.method_44993(), var6.method_44996(), var6.method_45001()));
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_19603 = var1.method_37778();
      int var4 = var1.readInt();

      for (int var5 = 0; var5 < var4; var5++) {
         class_4639 var6 = var1.method_37768();
         class_225 var7 = class_8669.field_44403.method_39806(var6);
         double var8 = var1.readDouble();
         ArrayList var10 = Lists.newArrayList();
         int var11 = var1.method_37778();

         for (int var12 = 0; var12 < var11; var12++) {
            UUID var13 = var1.method_37753();
            var10.add(new class_9343(var13, "Unknown synced attribute modifier", var1.readDouble(), class_9342.method_43116(var1.readByte())));
         }

         this.field_19604.add(new class_3032(this, (double)var7, var8, var10));
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_19603);
      var1.writeInt(this.field_19604.size());

      for (class_3032 var5 : this.field_19604) {
         var1.method_37780(class_8669.field_44403.method_39797(var5.method_13835()));
         var1.writeDouble(var5.method_13834());
         var1.method_37743(var5.method_13837().size());

         for (class_9343 var7 : var5.method_13837()) {
            var1.method_37746(var7.method_43122());
            var1.writeDouble(var7.method_43123());
            var1.writeByte(var7.method_43121().method_43115());
         }
      }
   }

   public void method_18583(class_392 var1) {
      var1.method_1913(this);
   }

   public int method_18581() {
      return this.field_19603;
   }

   public List<class_3032> method_18582() {
      return this.field_19604;
   }
}
