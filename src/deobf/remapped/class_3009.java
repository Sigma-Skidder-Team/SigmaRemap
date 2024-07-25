package remapped;

import java.nio.IntBuffer;
import java.util.Arrays;

public class class_3009 {
   private final int field_14773;
   private final String field_14768;
   private final class_4349 field_14771;
   private final class_3009 field_14779;
   private class_2412 field_14778;
   private class_3525 field_14767;
   private class_1400 field_14765;
   private final Boolean[] field_14766 = new Boolean[8];
   private int field_14763;
   private int field_14776;
   private String field_14774;
   private IntBuffer field_14777;
   private IntBuffer field_14770;
   private int field_14764;
   private int field_14769;
   private final boolean[] field_14775 = new boolean[8];

   public class_3009(int var1, String var2, class_4349 var3, class_3009 var4) {
      this.field_14773 = var1;
      this.field_14768 = var2;
      this.field_14771 = var3;
      this.field_14779 = var4;
   }

   public class_3009(int var1, String var2, class_4349 var3, boolean var4) {
      this.field_14773 = var1;
      this.field_14768 = var2;
      this.field_14771 = var3;
      this.field_14779 = !var4 ? null : this;
   }

   public void method_13736() {
      this.field_14778 = null;
      this.field_14767 = null;
      this.field_14765 = null;
      Arrays.fill(this.field_14766, null);
   }

   public void method_13749() {
      this.field_14763 = 0;
      this.field_14776 = 0;
   }

   public void method_13747() {
      this.field_14774 = null;
      this.field_14764 = 0;
      this.field_14769 = 0;
      if (this.field_14770 == null) {
         this.field_14770 = class_6588.method_30186(8);
      }
   }

   public void method_13753(class_3009 var1) {
      this.field_14763 = var1.method_13759();
      this.field_14778 = var1.method_13738();
      this.field_14767 = var1.method_13762();
      this.field_14765 = var1.method_13742();
      System.arraycopy(var1.method_13748(), 0, this.field_14766, 0, this.field_14766.length);
      this.field_14774 = var1.method_13751();
      this.field_14777 = var1.method_13766();
      this.field_14764 = var1.method_13752();
      this.field_14769 = var1.method_13756();
      System.arraycopy(var1.method_13764(), 0, this.field_14775, 0, this.field_14775.length);
   }

   public int method_13743() {
      return this.field_14773;
   }

   public String method_13763() {
      return this.field_14768;
   }

   public class_4349 method_13754() {
      return this.field_14771;
   }

   public class_3009 method_13757() {
      return this.field_14779;
   }

   public int method_13759() {
      return this.field_14763;
   }

   public int method_13760() {
      return this.field_14776;
   }

   public String method_13751() {
      return this.field_14774;
   }

   public IntBuffer method_13766() {
      return this.field_14777;
   }

   public IntBuffer method_13739() {
      return this.field_14770;
   }

   public int method_13752() {
      return this.field_14764;
   }

   public int method_13756() {
      return this.field_14769;
   }

   public class_2412 method_13738() {
      return this.field_14778;
   }

   public class_3525 method_13762() {
      return this.field_14767;
   }

   public class_1400 method_13742() {
      return this.field_14765;
   }

   public Boolean[] method_13748() {
      return this.field_14766;
   }

   public boolean[] method_13764() {
      return this.field_14775;
   }

   public void method_13758(int var1) {
      this.field_14763 = var1;
   }

   public void method_13755(int var1) {
      this.field_14776 = var1;
   }

   public void method_13740(String var1) {
      this.field_14774 = var1;
   }

   public void method_13746(IntBuffer var1) {
      this.field_14777 = var1;
   }

   public void method_13741(int var1) {
      this.field_14764 = var1;
   }

   public void method_13745(int var1) {
      this.field_14769 = var1;
   }

   public void method_13744(class_2412 var1) {
      this.field_14778 = var1;
   }

   public void method_13765(class_3525 var1) {
      this.field_14767 = var1;
   }

   public void method_13761(class_1400 var1) {
      this.field_14765 = var1;
   }

   public String method_13737() {
      if (this.field_14763 == 0) {
         return "none";
      } else {
         class_3009 var3;
         for (var3 = this; var3.method_13760() != this.field_14763; var3 = var3.method_13757()) {
            if (var3.method_13757() == null || var3.method_13757() == var3) {
               return "unknown";
            }
         }

         return var3.method_13763();
      }
   }

   @Override
   public String toString() {
      return "name: " + this.field_14768 + ", id: " + this.field_14763 + ", ref: " + this.field_14776 + ", real: " + this.method_13737();
   }
}
