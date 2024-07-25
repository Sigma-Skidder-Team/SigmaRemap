package remapped;

import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class class_7934 {
   private static String[] field_40592;
   private final int field_40593;
   public final class_6867 field_40591;
   public int field_40588;
   public final int field_40589;
   public final int field_40590;

   public class_7934(class_6867 var1, int var2, int var3, int var4) {
      this.field_40591 = var1;
      this.field_40593 = var2;
      this.field_40589 = var3;
      this.field_40590 = var4;
   }

   public void method_35888(ItemStack var1, ItemStack var2) {
      int var5 = var2.method_27997() - var1.method_27997();
      if (var5 > 0) {
         this.method_35894(var2, var5);
      }
   }

   public void method_35894(ItemStack var1, int var2) {
   }

   public void method_35885(int var1) {
   }

   public void method_35893(ItemStack var1) {
   }

   public ItemStack method_35892(class_704 var1, ItemStack var2) {
      this.method_35887();
      return var2;
   }

   public boolean method_35889(ItemStack var1) {
      return true;
   }

   public ItemStack method_35898() {
      return this.field_40591.method_31498(this.field_40593);
   }

   public boolean method_35884() {
      return !this.method_35898().method_28022();
   }

   public void method_35896(ItemStack var1) {
      this.field_40591.method_31503(this.field_40593, var1);
      this.method_35887();
   }

   public void method_35887() {
      this.field_40591.method_17407();
   }

   public int method_35897() {
      return this.field_40591.method_31506();
   }

   public int method_35890(ItemStack var1) {
      return this.method_35897();
   }

   @Nullable
   public Pair<Identifier, Identifier> method_35900() {
      return null;
   }

   public ItemStack method_35899(int var1) {
      return this.field_40591.method_31497(this.field_40593, var1);
   }

   public boolean method_35895(class_704 var1) {
      return true;
   }

   public boolean method_35886() {
      return true;
   }
}
