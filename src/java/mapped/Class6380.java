package mapped;

import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class6380 extends ViaVersion7<Class1914, Class1932, Class1924, Class1921> {
   private static String[] field27946;
   public static final Class5980 field27947 = new Class5980();
   public static final Class2982 field27948 = var0 -> {
      Class9695 var3 = var0.<Class9695>method30559(Class4750.field22551);
      var0.method30560(Class4750.field22526, var3.method37962());
      var0.method30560(Class4750.field22526, Integer.valueOf(var3.method37963()));
      var0.method30560(Class4750.field22526, var3.method37964());
   };
   private static final Class2982 field27949 = var0 -> {
      var0.method30574(17, new Class3018()).method30570(Class6380.class);
      var0.method30574(85, new Class3022()).method30570(Class6380.class);
   };
   public static final Map<Class2307, Character> field27950 = new HashMap<Class2307, Character>();
   private static final Set<Class2307> field27951 = Sets.newHashSet(
      new Class2307[]{Class2307.field15783, Class2307.field15784, Class2307.field15785, Class2307.field15786, Class2307.field15787, Class2307.field15788}
   );

   public Class6380() {
      super(Class1914.class, Class1932.class, Class1924.class, Class1921.class);
   }

   @Override
   public void method19341() {
      new Class6908(this);
      Class9440.method36290(this);
      Class7795.method25885(this);
      Class9687.method37922(this);
      this.method19356(Class187.field701, 0, 0, new Class4011(this));
      this.method19356(Class187.field700, 0, 0, new Class3902(this));
      this.method19360(Class1914.field11363, new Class3895(this));
      this.method19360(Class1914.field11368, new Class3933(this));
      this.method19360(Class1914.field11371, new Class3827(this));
      this.method19360(Class1914.field11370, new Class3863(this));
      this.method19360(Class1914.field11375, new Class3873(this));
      this.method19360(Class1914.field11379, new Class3898(this));
      this.method19360(Class1914.field11382, new Class3868(this));
      this.method19360(Class1914.field11389, new Class3937(this));
      this.method19360(Class1914.field11391, new Class4002(this));
      this.method19360(Class1914.field11399, new Class3872(this));
      this.method19360(Class1914.field11401, new Class3820(this));
      this.method19360(Class1914.field11392, new Class4042(this));
      this.method19360(Class1914.field11405, new Class3877(this));
      this.method19360(Class1914.field11409, new Class3964(this));
      this.method19360(Class1914.field11422, new Class3828(this));
      this.method19360(Class1914.field11424, new Class4017(this));
      this.method19360(Class1914.field11425, new Class3764(this));
      this.method19360(Class1914.field11428, new Class3938(this));
      new Class5150(this).method15951(Class1914.field11429);
      this.method19360(Class1914.field11430, new Class3776(this));
      this.method19360(Class1914.field11433, new Class3826(this));
      this.method19354(Class187.field701, 2);
      this.method19366(Class1921.field11773);
      this.method19364(Class1921.field11777, new Class3886(this));
      this.method19365(Class1921.field11783, Class1924.field11902, new Class3817(this));
      this.method19366(Class1921.field11784);
      this.method19365(Class1921.field11793, Class1924.field11902, new Class4013(this));
      this.method19364(Class1921.field11794, new Class3989(this));
      this.method19364(Class1921.field11799, new Class3864(this));
      this.method19365(Class1921.field11800, Class1924.field11902, new Class4003(this));
      this.method19365(Class1921.field11803, Class1924.field11902, new Class3890(this));
      this.method19365(Class1921.field11804, Class1924.field11902, new Class4010(this));
      this.method19365(Class1921.field11806, Class1924.field11902, new Class3784(this));
      this.method19365(Class1921.field11807, Class1924.field11902, new Class4005(this));
      this.method19365(Class1921.field11809, Class1924.field11902, new Class3853(this));
   }

   @Override
   public void method19348() {
      Class9322.method35229();
      Class8029.method27529();
      Class9123.method34035();
   }

   @Override
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6054(var1));
      var1.method22440(new Class6043(var1));
      if (!var1.method22439(Class6047.class)) {
         var1.method22440(new Class6047(var1));
      }

      var1.method22440(new Class6039(var1));
      if (ViaVersion3.method27612().method21925() && ViaVersion3.method27614().method34424().<Class5404>method31084(Class5404.class) instanceof Class5406) {
         var1.method22440(new Class6041(var1));
      }
   }

   @Override
   public void method19349(ViaVersion6 var1) {
      var1.method31082(Class5412.class, new Class5412());
      var1.method31082(Class5403.class, new Class5403());
   }

   public Class2307 method19395(String var1) {
      int var4 = var1.length();

      for (int var5 = var4 - 1; var5 > -1; var5--) {
         char var6 = var1.charAt(var5);
         if (var6 == 167 && var5 < var4 - 1) {
            char var7 = var1.charAt(var5 + 1);
            Class2307 var8 = Class2307.method9079(var7);
            if (var8 != null && !field27951.contains(var8)) {
               return var8;
            }
         }
      }

      return Class2307.field15788;
   }

   public String method19396(String var1) {
      if (Class2307.method9077(var1).isEmpty()) {
         StringBuilder var4 = new StringBuilder();

         for (int var5 = 1; var5 < var1.length(); var5 += 2) {
            char var6 = var1.charAt(var5);
            Character var7 = field27950.get(Class2307.method9079(var6));
            if (var7 == null) {
               var7 = var6;
            }

            var4.append('§').append(var7);
         }

         var1 = var4.toString();
      }

      return var1;
   }

   public static int[] method19397(Integer[] var0) {
      int[] var3 = new int[var0.length];

      for (int var4 = 0; var4 < var0.length; var4++) {
         var3[var4] = var0[var4];
      }

      return var3;
   }

   public Class5980 method19376() {
      return field27947;
   }

   // $VF: synthetic method
   public static Class2982 method19400() {
      return field27949;
   }

   static {
      field27950.put(Class2307.field15767, 'g');
      field27950.put(Class2307.field15768, 'h');
      field27950.put(Class2307.field15769, 'i');
      field27950.put(Class2307.field15770, 'j');
      field27950.put(Class2307.field15771, 'p');
      field27950.put(Class2307.field15772, 'q');
      field27950.put(Class2307.field15773, 's');
      field27950.put(Class2307.field15774, 't');
      field27950.put(Class2307.field15775, 'u');
      field27950.put(Class2307.field15776, 'v');
      field27950.put(Class2307.field15777, 'w');
      field27950.put(Class2307.field15778, 'x');
      field27950.put(Class2307.field15779, 'y');
      field27950.put(Class2307.field15780, 'z');
      field27950.put(Class2307.field15781, '!');
      field27950.put(Class2307.field15782, '?');
      field27950.put(Class2307.field15783, '#');
      field27950.put(Class2307.field15784, '(');
      field27950.put(Class2307.field15785, ')');
      field27950.put(Class2307.field15786, ':');
      field27950.put(Class2307.field15787, ';');
      field27950.put(Class2307.field15788, '/');
   }
}
