package remapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class class_4234 implements class_6310<class_392> {
   private static String[] field_20551;
   private int field_20548;
   private int field_20552;
   private int field_20546;
   private int field_20550;
   private int field_20549;
   private int field_20544;
   private List<byte[]> field_20547;
   private List<byte[]> field_20545;
   private boolean field_20553;

   public class_4234() {
   }

   public class_4234(class_2034 var1, class_4663 var2, boolean var3) {
      this.field_20548 = var1.field_10328;
      this.field_20552 = var1.field_10327;
      this.field_20553 = var3;
      this.field_20547 = Lists.newArrayList();
      this.field_20545 = Lists.newArrayList();

      for (int var6 = 0; var6 < 18; var6++) {
         class_1201 var7 = var2.method_21562(class_2957.field_14437).method_45336(class_6979.method_31922(var1, -1 + var6));
         class_1201 var8 = var2.method_21562(class_2957.field_14440).method_45336(class_6979.method_31922(var1, -1 + var6));
         if (var7 != null) {
            if (!var7.method_5315()) {
               this.field_20546 |= 1 << var6;
               this.field_20547.add((byte[])var7.method_5317().clone());
            } else {
               this.field_20549 |= 1 << var6;
            }
         }

         if (var8 != null) {
            if (!var8.method_5315()) {
               this.field_20550 |= 1 << var6;
               this.field_20545.add((byte[])var8.method_5317().clone());
            } else {
               this.field_20544 |= 1 << var6;
            }
         }
      }
   }

   public class_4234(class_2034 var1, class_4663 var2, int var3, int var4, boolean var5) {
      this.field_20548 = var1.field_10328;
      this.field_20552 = var1.field_10327;
      this.field_20553 = var5;
      this.field_20546 = var3;
      this.field_20550 = var4;
      this.field_20547 = Lists.newArrayList();
      this.field_20545 = Lists.newArrayList();

      for (int var8 = 0; var8 < 18; var8++) {
         if ((this.field_20546 & 1 << var8) != 0) {
            class_1201 var9 = var2.method_21562(class_2957.field_14437).method_45336(class_6979.method_31922(var1, -1 + var8));
            if (var9 != null && !var9.method_5315()) {
               this.field_20547.add((byte[])var9.method_5317().clone());
            } else {
               this.field_20546 &= ~(1 << var8);
               if (var9 != null) {
                  this.field_20549 |= 1 << var8;
               }
            }
         }

         if ((this.field_20550 & 1 << var8) != 0) {
            class_1201 var10 = var2.method_21562(class_2957.field_14440).method_45336(class_6979.method_31922(var1, -1 + var8));
            if (var10 != null && !var10.method_5315()) {
               this.field_20545.add((byte[])var10.method_5317().clone());
            } else {
               this.field_20550 &= ~(1 << var8);
               if (var10 != null) {
                  this.field_20544 |= 1 << var8;
               }
            }
         }
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_20548 = var1.method_37778();
      this.field_20552 = var1.method_37778();
      this.field_20553 = var1.readBoolean();
      this.field_20546 = var1.method_37778();
      this.field_20550 = var1.method_37778();
      this.field_20549 = var1.method_37778();
      this.field_20544 = var1.method_37778();
      this.field_20547 = Lists.newArrayList();

      for (int var4 = 0; var4 < 18; var4++) {
         if ((this.field_20546 & 1 << var4) != 0) {
            this.field_20547.add(var1.method_37758(2048));
         }
      }

      this.field_20545 = Lists.newArrayList();

      for (int var5 = 0; var5 < 18; var5++) {
         if ((this.field_20550 & 1 << var5) != 0) {
            this.field_20545.add(var1.method_37758(2048));
         }
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_20548);
      var1.method_37743(this.field_20552);
      var1.writeBoolean(this.field_20553);
      var1.method_37743(this.field_20546);
      var1.method_37743(this.field_20550);
      var1.method_37743(this.field_20549);
      var1.method_37743(this.field_20544);

      for (byte[] var5 : this.field_20547) {
         var1.method_37767(var5);
      }

      for (byte[] var7 : this.field_20545) {
         var1.method_37767(var7);
      }
   }

   public void method_19743(class_392 var1) {
      var1.method_1916(this);
   }

   public int method_19744() {
      return this.field_20548;
   }

   public int method_19742() {
      return this.field_20552;
   }

   public int method_19740() {
      return this.field_20546;
   }

   public int method_19741() {
      return this.field_20549;
   }

   public List<byte[]> method_19736() {
      return this.field_20547;
   }

   public int method_19739() {
      return this.field_20550;
   }

   public int method_19735() {
      return this.field_20544;
   }

   public List<byte[]> method_19734() {
      return this.field_20545;
   }

   public boolean method_19738() {
      return this.field_20553;
   }
}
