package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class1901 implements Class1902 {
   field11159(0, 0),
   field11160(0, 90),
   field11161(0, 180),
   field11162(0, 270),
   field11163(90, 0),
   field11164(90, 90),
   field11165(90, 180),
   field11166(90, 270),
   field11167(180, 0),
   field11168(180, 90),
   field11169(180, 180),
   field11170(180, 270),
   field11171(270, 0),
   field11172(270, 90),
   field11173(270, 180),
   field11174(270, 270);

   private static final Map<Integer, Class1901> field11175 = Arrays.<Class1901>stream(values())
      .collect(Collectors.toMap(var0 -> var0.field11178, var0 -> (Class1901)var0));
   private final Class6979 field11176;
   private final Class178 field11177;
   private final int field11178;
   private static final Class1901[] field11179 = new Class1901[]{
      field11159,
      field11160,
      field11161,
      field11162,
      field11163,
      field11164,
      field11165,
      field11166,
      field11167,
      field11168,
      field11169,
      field11170,
      field11171,
      field11172,
      field11173,
      field11174
   };

   private static int method8165(int var0, int var1) {
      return var0 * 360 + var1;
   }

   private Class1901(int var3, int var4) {
      this.field11178 = method8165(var3, var4);
      Quaternion var7 = new Quaternion(new Vector3f(0.0F, 1.0F, 0.0F), (float)(-var4), true);
      var7.method31182(new Quaternion(new Vector3f(1.0F, 0.0F, 0.0F), (float)(-var3), true));
      Class178 var8 = Class178.field565;

      for (int var9 = 0; var9 < var4; var9 += 90) {
         var8 = var8.method507(Class178.field585);
      }

      for (int var10 = 0; var10 < var3; var10 += 90) {
         var8 = var8.method507(Class178.field583);
      }

      this.field11176 = new Class6979((Vector3f)null, var7, (Vector3f)null, (Quaternion)null);
      this.field11177 = var8;
   }

   @Override
   public Class6979 method8166() {
      return this.field11176;
   }

   public static Class1901 method8167(int var0, int var1) {
      return field11175.get(method8165(MathHelper.normalizeAngle(var0, 360), MathHelper.normalizeAngle(var1, 360)));
   }
}
