package remapped;

import java.io.File;
import java.util.HashMap;

public class class_2800 implements Cloneable {
   private static String[] field_13751;
   private HashMap<Integer, class_9036> field_13750 = new HashMap<Integer, class_9036>();
   private short field_13752;
   private short field_13747;
   private String field_13755;
   private File field_13745;
   private String field_13754;
   private String field_13753;
   private float field_13748;
   private float field_13749;
   private class_3566[] field_13744;
   private int field_13746;

   public class_2800(class_2800 var1) {
      this(
         var1.method_12737(),
         var1.method_12735(),
         var1.method_12734(),
         var1.method_12736(),
         var1.method_12741(),
         var1.method_12740(),
         var1.method_12738(),
         var1.method_12733(),
         var1.method_12739(),
         var1.method_12742()
      );
   }

   /** @deprecated */
   public class_2800(float var1, HashMap<Integer, class_9036> var2, short var3, short var4, String var5, String var6, String var7, File var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, class_9418.method_43607(), new class_3566[0]);
   }

   /** @deprecated */
   public class_2800(float var1, HashMap<Integer, class_9036> var2, short var3, short var4, String var5, String var6, String var7, File var8, class_3566[] var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, class_9418.method_43607(), var9);
   }

   public class_2800(float var1, HashMap<Integer, class_9036> var2, short var3, short var4, String var5, String var6, String var7, File var8, int var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, new class_3566[0]);
   }

   public class_2800(
      float var1, HashMap<Integer, class_9036> var2, short var3, short var4, String var5, String var6, String var7, File var8, int var9, class_3566[] var10
   ) {
      this.field_13748 = var1;
      this.method_12743(20.0F / var1);
      this.field_13750 = var2;
      this.field_13752 = var3;
      this.field_13747 = var4;
      this.field_13755 = var5;
      this.field_13754 = var6;
      this.field_13753 = var7;
      this.field_13745 = var8;
      this.field_13746 = var9;
      this.field_13744 = var10;
   }

   public HashMap<Integer, class_9036> method_12735() {
      return this.field_13750;
   }

   public short method_12734() {
      return this.field_13752;
   }

   public short method_12736() {
      return this.field_13747;
   }

   public String method_12741() {
      return this.field_13755;
   }

   public String method_12740() {
      return this.field_13754;
   }

   public File method_12733() {
      return this.field_13745;
   }

   public String method_12738() {
      return this.field_13753;
   }

   public float method_12737() {
      return this.field_13748;
   }

   public float method_12744() {
      return this.field_13749;
   }

   public class_3566[] method_12742() {
      return this.field_13744;
   }

   public class_2800 clone() {
      return new class_2800(this);
   }

   public int method_12739() {
      return this.field_13746;
   }

   public void method_12743(float var1) {
      this.field_13749 = var1;
   }
}
