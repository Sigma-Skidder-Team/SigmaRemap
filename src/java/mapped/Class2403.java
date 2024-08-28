package mapped;

import java.io.File;
import java.util.HashMap;

public class Class2403 implements Cloneable {
   private static String[] field16337;
   private HashMap<Integer, Class9616> field16338 = new HashMap<Integer, Class9616>();
   private short field16339;
   private short field16340;
   private String field16341;
   private File field16342;
   private String field16343;
   private String field16344;
   private float field16345;
   private float field16346;
   private Class8084[] field16347;
   private int field16348;

   public Class2403(Class2403 var1) {
      this(
         var1.method9957(),
         var1.method9950(),
         var1.method9951(),
         var1.method9952(),
         var1.method9953(),
         var1.method9954(),
         var1.method9956(),
         var1.method9955(),
         var1.method9960(),
         var1.method9959()
      );
   }

   /** @deprecated */
   public Class2403(float var1, HashMap<Integer, Class9616> var2, short var3, short var4, String var5, String var6, String var7, File var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, Class9705.method38024(), new Class8084[0]);
   }

   /** @deprecated */
   public Class2403(float var1, HashMap<Integer, Class9616> var2, short var3, short var4, String var5, String var6, String var7, File var8, Class8084[] var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, Class9705.method38024(), var9);
   }

   public Class2403(float var1, HashMap<Integer, Class9616> var2, short var3, short var4, String var5, String var6, String var7, File var8, int var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, new Class8084[0]);
   }

   public Class2403(
      float var1, HashMap<Integer, Class9616> var2, short var3, short var4, String var5, String var6, String var7, File var8, int var9, Class8084[] var10
   ) {
      this.field16345 = var1;
      this.method9961(20.0F / var1);
      this.field16338 = var2;
      this.field16339 = var3;
      this.field16340 = var4;
      this.field16341 = var5;
      this.field16343 = var6;
      this.field16344 = var7;
      this.field16342 = var8;
      this.field16348 = var9;
      this.field16347 = var10;
   }

   public HashMap<Integer, Class9616> method9950() {
      return this.field16338;
   }

   public short method9951() {
      return this.field16339;
   }

   public short method9952() {
      return this.field16340;
   }

   public String method9953() {
      return this.field16341;
   }

   public String method9954() {
      return this.field16343;
   }

   public File method9955() {
      return this.field16342;
   }

   public String method9956() {
      return this.field16344;
   }

   public float method9957() {
      return this.field16345;
   }

   public float method9958() {
      return this.field16346;
   }

   public Class8084[] method9959() {
      return this.field16347;
   }

   public Class2403 clone() {
      return new Class2403(this);
   }

   public int method9960() {
      return this.field16348;
   }

   public void method9961(float var1) {
      this.field16346 = var1;
   }
}
