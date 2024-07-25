package remapped;

import java.util.List;

public class class_3816 implements class_6545 {
   private static String[] field_18665;
   public final int field_18673;
   public final int field_18671;
   public final boolean field_18668;
   public boolean field_18670;
   public final int field_18674;
   public final class_3929[] field_18669;
   public int[] field_18667;
   public class_5531 field_18666;
   public final List<class_5531> field_18672;

   public class_3816(int var1, int var2, boolean var3, boolean var4, int var5, class_3929[] var6, int[] var7, class_5531 var8, List<class_5531> var9) {
      this.field_18673 = var1;
      this.field_18671 = var2;
      this.field_18668 = var3;
      this.field_18670 = var4;
      this.field_18674 = var5;
      this.field_18669 = var6;
      this.field_18667 = var7;
      this.field_18666 = var8;
      this.field_18672 = var9;
   }

   public class_3816(int var1, int var2, boolean var3, boolean var4, int var5, class_3929[] var6, int[] var7, List<class_5531> var8) {
      this(var1, var2, var3, var4, var5, var6, var7, null, var8);
   }

   @Override
   public boolean method_29866() {
      return this.field_18667 != null;
   }

   @Override
   public int method_29858() {
      return this.field_18673;
   }

   @Override
   public int method_29860() {
      return this.field_18671;
   }

   @Override
   public boolean method_29863() {
      return this.field_18668;
   }

   @Override
   public boolean method_29865() {
      return this.field_18670;
   }

   @Override
   public void method_29856(boolean var1) {
      this.field_18670 = var1;
   }

   @Override
   public int method_29868() {
      return this.field_18674;
   }

   @Override
   public class_3929[] method_29869() {
      return this.field_18669;
   }

   @Override
   public int[] method_29867() {
      return this.field_18667;
   }

   @Override
   public void method_29859(int[] var1) {
      this.field_18667 = var1;
   }

   @Override
   public class_5531 method_29864() {
      return this.field_18666;
   }

   @Override
   public void method_29857(class_5531 var1) {
      this.field_18666 = var1;
   }

   @Override
   public List<class_5531> method_29862() {
      return this.field_18672;
   }
}
