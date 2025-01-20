package mapped;

import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.ClientColors;

public class ColorHelper {
   private static String[] field27960;
   public static final ColorHelper field27961 = new ColorHelper(-12871171);
   public int field27962;
   public int field27963;
   public int field27964;
   public int field27965;
   public Class2218 field27966;
   public Class2218 field27967;

   public ColorHelper(int var1) {
      this(var1, MultiUtilities.method17691(var1, 0.05F));
   }

   public ColorHelper(int var1, int var2) {
      this(var1, var2, ClientColors.DEEP_TEAL.getColor);
   }

   public ColorHelper(int var1, int var2, int var3) {
      this(var1, var2, var3, ClientColors.LIGHT_GREYISH_BLUE.getColor);
   }

   public ColorHelper(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, Class2218.field14492, Class2218.field14492);
   }

   public ColorHelper(int var1, int var2, int var3, int var4, Class2218 var5, Class2218 var6) {
      this.field27962 = var1;
      this.field27963 = var2;
      this.field27964 = var3;
      this.field27965 = var4;
      this.field27966 = var5;
      this.field27967 = var6;
   }

   public ColorHelper(ColorHelper var1) {
      this(var1.field27962, var1.field27963, var1.field27964, var1.field27965, var1.field27966, var1.field27967);
   }

   public int method19403() {
      return this.field27963;
   }

   public ColorHelper method19404(int var1) {
      this.field27963 = var1;
      return this;
   }

   public int method19405() {
      return this.field27962;
   }

   public ColorHelper method19406(int var1) {
      this.field27962 = var1;
      return this;
   }

   public int method19407() {
      return this.field27964;
   }

   public ColorHelper method19408(int var1) {
      this.field27964 = var1;
      return this;
   }

   public int getTextColor() {
      return this.field27965;
   }

   public ColorHelper method19410(int var1) {
      this.field27965 = var1;
      return this;
   }

   public Class2218 method19411() {
      return this.field27966;
   }

   public ColorHelper method19412(Class2218 var1) {
      this.field27966 = var1;
      return this;
   }

   public Class2218 method19413() {
      return this.field27967;
   }

   public ColorHelper method19414(Class2218 var1) {
      this.field27967 = var1;
      return this;
   }

   public ColorHelper method19415() {
      return new ColorHelper(this.field27962, this.field27963, this.field27964, this.field27965, this.field27966, this.field27967);
   }
}
