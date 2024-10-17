package mapped;

import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;

import java.util.Random;

public class Class8846 {
   public static Random field39967 = new Random();

   public static void main(String[] var0) {
      int var3 = 1000000;
      method32096("Test math: " + var3);

      for (int var4 = 0; var4 < 1000000; var4++) {
         method32090();
         method32091();
         method32092();
         method32093();
         method32095();
         method32094();
      }

      method32096("Done");
   }

   private static void method32090() {
      Matrix4f var2 = new Matrix4f();
      var2.method35523(field39967);
      Matrix4f var3 = var2.method35514();
      float var4 = field39967.nextFloat();
      float var5 = field39967.nextFloat();
      float var6 = field39967.nextFloat();
      var2.method35508(Matrix4f.method35516(var4, var5, var6));
      var3.method35521(var4, var5, var6);
      if (!var3.equals(var2)) {
         method32096("*** DIFFERENT ***");
         method32096(var2.toString());
         method32096(var3.toString());
      }
   }

   private static void method32091() {
      Matrix4f var2 = new Matrix4f();
      var2.method35523(field39967);
      Matrix4f var3 = var2.method35514();
      float var4 = field39967.nextFloat();
      float var5 = field39967.nextFloat();
      float var6 = field39967.nextFloat();
      var2.method35508(Matrix4f.method35515(var4, var5, var6));
      var3.method35522(var4, var5, var6);
      if (!var3.equals(var2)) {
         method32096("*** DIFFERENT ***");
         method32096(var2.toString());
         method32096(var3.toString());
      }
   }

   private static void method32092() {
      Matrix4f var2 = new Matrix4f();
      var2.method35523(field39967);
      Matrix4f var3 = var2.method35514();
      Quaternion var4 = new Quaternion(field39967.nextFloat(), field39967.nextFloat(), field39967.nextFloat(), field39967.nextFloat());
      var2.method35508(new Matrix4f(var4));
      var3.method35509(var4);
      if (!var3.equals(var2)) {
         method32096("*** DIFFERENT ***");
         method32096(var2.toString());
         method32096(var3.toString());
      }
   }

   private static void method32093() {
      Matrix3f var2 = new Matrix3f();
      var2.method32835(field39967);
      Matrix3f var3 = var2.method32831();
      Quaternion var4 = new Quaternion(field39967.nextFloat(), field39967.nextFloat(), field39967.nextFloat(), field39967.nextFloat());
      var2.method32828(new Matrix3f(var4));
      var3.method32829(var4);
      if (!var3.equals(var2)) {
         method32096("*** DIFFERENT ***");
         method32096(var2.toString());
         method32096(var3.toString());
      }
   }

   private static void method32094() {
      Vector3f var2 = new Vector3f(field39967.nextFloat(), field39967.nextFloat(), field39967.nextFloat());
      Vector3f var3 = var2.method25287();
      Matrix3f var4 = new Matrix3f();
      var4.method32835(field39967);
      var2.method25282(var4);
      float var5 = var4.method32832(var3.method25269(), var3.method25270(), var3.method25271());
      float var6 = var4.method32833(var3.method25269(), var3.method25270(), var3.method25271());
      float var7 = var4.method32834(var3.method25269(), var3.method25270(), var3.method25271());
      var3 = new Vector3f(var5, var6, var7);
      if (!var3.equals(var2)) {
         method32096("*** DIFFERENT ***");
         method32096(var2.toString());
         method32096(var3.toString());
      }
   }

   private static void method32095() {
      Class7755 var2 = new Class7755(field39967.nextFloat(), field39967.nextFloat(), field39967.nextFloat(), field39967.nextFloat());
      Class7755 var3 = new Class7755(var2.method25701(), var2.method25702(), var2.method25703(), var2.method25704());
      Matrix4f var4 = new Matrix4f();
      var4.method35523(field39967);
      var2.method25709(var4);
      float var5 = var4.method35517(var3.method25701(), var3.method25702(), var3.method25703(), var3.method25704());
      float var6 = var4.method35518(var3.method25701(), var3.method25702(), var3.method25703(), var3.method25704());
      float var7 = var4.method35519(var3.method25701(), var3.method25702(), var3.method25703(), var3.method25704());
      float var8 = var4.method35520(var3.method25701(), var3.method25702(), var3.method25703(), var3.method25704());
      var3 = new Class7755(var5, var6, var7, var8);
      if (!var3.equals(var2)) {
         method32096("*** DIFFERENT ***");
         method32096(var2.toString());
         method32096(var3.toString());
      }
   }

   private static void method32096(String var0) {
      System.out.println(var0);
   }
}
