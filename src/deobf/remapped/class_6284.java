package remapped;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class class_6284 {
   private String field_32119 = null;
   public static final class_9438[] field_32117 = new class_9438[0];
   public static final class_9077[] field_32118 = new class_9077[0];
   private static Map<Identifier, class_4859> field_32116 = null;
   private static final class_2930<Enum> field_32121 = new class_8331();
   private static final class_2930<class_9077> field_32122 = new class_5898();

   public class_6284(String var1) {
      this.field_32119 = var1;
   }

   public String method_28678(String var1) {
      String var4 = var1;
      int var5 = var1.lastIndexOf(47);
      if (var5 >= 0) {
         var4 = var1.substring(var5 + 1);
      }

      int var6 = var4.lastIndexOf(46);
      if (var6 >= 0) {
         var4 = var4.substring(0, var6);
      }

      return var4;
   }

   public String method_28649(String var1) {
      int var4 = var1.lastIndexOf(47);
      return var4 >= 0 ? var1.substring(0, var4) : "";
   }

   public class_9491[] method_28680(String var1) {
      if (var1 != null) {
         ArrayList var4 = new ArrayList();
         String[] var5 = class_3111.method_14302(var1, " ");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            class_9491[] var8 = this.method_28671(var7);
            if (var8 != null) {
               var4.addAll(Arrays.asList(var8));
            }
         }

         return var4.<class_9491>toArray(new class_9491[var4.size()]);
      } else {
         return null;
      }
   }

   public class_2522 method_28659(String var1, class_2522 var2) {
      class_9491[] var5 = this.method_28671(var1);
      if (var5 != null) {
         if (var5.length == 1) {
            class_9491 var6 = var5[0];
            int var7 = var6.method_43838();
            class_6414 var8 = class_8669.field_44462.method_14040(var7);
            return var8.method_29260();
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public class_9491[] method_28671(String var1) {
      if (var1 != null) {
         var1 = var1.trim();
         if (var1.length() <= 0) {
            return null;
         } else {
            String[] var4 = class_3111.method_14302(var1, ":");
            String var5 = "minecraft";
            byte var6 = 0;
            if (var4.length > 1 && this.method_28643(var4)) {
               var5 = var4[0];
               var6 = 1;
            } else {
               var5 = "minecraft";
               var6 = 0;
            }

            String var7 = var4[var6];
            String[] var8 = Arrays.<String>copyOfRange(var4, var6 + 1, var4.length);
            class_6414[] var9 = this.method_28656(var5, var7);
            if (var9 != null) {
               class_9491[] var10 = new class_9491[var9.length];

               for (int var11 = 0; var11 < var9.length; var11++) {
                  class_6414 var12 = var9[var11];
                  int var13 = class_8669.field_44462.method_14041(var12);
                  int[] var14 = null;
                  if (var8.length > 0) {
                     var14 = this.method_28677(var12, var8);
                     if (var14 == null) {
                        return null;
                     }
                  }

                  class_9491 var15 = new class_9491(var13, var14);
                  var10[var11] = var15;
               }

               return var10;
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public boolean method_28643(String[] var1) {
      if (var1.length > 1) {
         String var4 = var1[1];
         return var4.length() >= 1 ? !var4.contains("=") : false;
      } else {
         return false;
      }
   }

   public boolean method_28660(String var1) {
      if (var1 != null) {
         if (var1.length() >= 1) {
            char var4 = var1.charAt(0);
            return Character.isDigit(var4);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public class_6414[] method_28656(String var1, String var2) {
      String var5 = var1 + ":" + var2;
      Identifier var6 = new Identifier(var5);
      class_6414 var7 = class_9451.method_43712(var6);
      if (var7 != null) {
         return new class_6414[]{var7};
      } else {
         this.method_28663("Block not found for name: " + var5);
         return null;
      }
   }

   public int[] method_28677(class_6414 var1, String[] var2) {
      if (var2.length <= 0) {
         return null;
      } else {
         class_2522 var5 = var1.method_29260();
         Collection var6 = var5.method_10310();
         HashMap var7 = new HashMap();

         for (int var8 = 0; var8 < var2.length; var8++) {
            String var9 = var2[var8];
            if (var9.length() > 0) {
               String[] var10 = class_3111.method_14302(var9, "=");
               if (var10.length != 2) {
                  this.method_28663("Invalid block property: " + var9);
                  return null;
               }

               String var11 = var10[0];
               String var12 = var10[1];
               class_5019 var13 = class_1385.method_6387(var11, var6);
               if (var13 == null) {
                  this.method_28663("Property not found: " + var11 + ", block: " + var1);
                  return null;
               }

               Object var14 = (List)var7.get(var11);
               if (var14 == null) {
                  var14 = new ArrayList();
                  var7.put(var13, var14);
               }

               String[] var15 = class_3111.method_14302(var12, ",");

               for (int var16 = 0; var16 < var15.length; var16++) {
                  String var17 = var15[var16];
                  Comparable var18 = method_28670(var13, var17);
                  if (var18 == null) {
                     this.method_28663("Property value not found: " + var17 + ", property: " + var11 + ", block: " + var1);
                     return null;
                  }

                  var14.add(var18);
               }
            }
         }

         if (var7.isEmpty()) {
            return null;
         } else {
            ArrayList var20 = new ArrayList();
            int var21 = class_9451.method_43713(var1);

            for (int var22 = 0; var22 < var21; var22++) {
               try {
                  class_2522 var24 = class_9451.method_43708(var1, var22);
                  if (this.method_28683(var24, var7)) {
                     var20.add(var22);
                  }
               } catch (IllegalArgumentException var19) {
               }
            }

            if (var20.size() == var21) {
               return null;
            } else {
               int[] var23 = new int[var20.size()];

               for (int var25 = 0; var25 < var23.length; var25++) {
                  var23[var25] = (Integer)var20.get(var25);
               }

               return var23;
            }
         }
      }
   }

   public static Comparable method_28670(class_5019 var0, String var1) {
      Class var4 = var0.method_23112();
      Comparable var5 = method_28645(var1, var4);
      if (var5 == null) {
         Collection var6 = var0.method_23105();
         var5 = method_28655(var1, var6);
      }

      return var5;
   }

   public static Comparable method_28655(String var0, Collection<Comparable> var1) {
      for (Comparable var5 : var1) {
         if (method_28647(var5).equals(var0)) {
            return var5;
         }
      }

      return null;
   }

   private static Object method_28647(Comparable var0) {
      if (!(var0 instanceof class_4530)) {
         return var0.toString();
      } else {
         class_4530 var3 = (class_4530)var0;
         return var3.method_21049();
      }
   }

   public static Comparable method_28645(String var0, Class var1) {
      if (var1 != String.class) {
         if (var1 != Boolean.class) {
            if (var1 != Float.class) {
               if (var1 != Double.class) {
                  if (var1 != Integer.class) {
                     return var1 != Long.class ? null : Long.valueOf(var0);
                  } else {
                     return Integer.valueOf(var0);
                  }
               } else {
                  return Double.valueOf(var0);
               }
            } else {
               return Float.valueOf(var0);
            }
         } else {
            return Boolean.valueOf(var0);
         }
      } else {
         return var0;
      }
   }

   public boolean method_28683(class_2522 var1, Map<class_5019, List<Comparable>> var2) {
      for (class_5019 var6 : var2.keySet()) {
         List var7 = (List)var2.get(var6);
         Comparable var8 = var1.<Comparable>method_10313(var6);
         if (var8 == null) {
            return false;
         }

         if (!var7.contains(var8)) {
            return false;
         }
      }

      return true;
   }

   public class_4859[] method_28644(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         boolean var4 = false;
         if (var1.startsWith("!")) {
            var4 = true;
            var1 = var1.substring(1);
         }

         String[] var5 = class_3111.method_14302(var1, " ");
         Object var6 = new ArrayList();

         for (int var7 = 0; var7 < var5.length; var7++) {
            String var8 = var5[var7];
            class_4859 var9 = this.method_28657(var8);
            if (var9 != null) {
               var6.add(var9);
            } else {
               this.method_28663("Biome not found: " + var8);
            }
         }

         if (var4) {
            HashSet var11 = new HashSet<Identifier>(class_5630.method_25515());

            for (class_4859 var13 : var6) {
               var11.remove(var13.method_22352());
            }

            var6 = class_5630.method_25514(var11);
         }

         return var6.<class_4859>toArray(new class_4859[var6.size()]);
      }
   }

   public class_4859 method_28657(String var1) {
      var1 = var1.toLowerCase();
      Identifier var4 = new Identifier(var1);
      class_4859 var5 = class_5630.method_25523(var4);
      if (var5 != null) {
         return var5;
      } else {
         String var6 = var1.replace(" ", "").replace("_", "");
         Identifier var7 = new Identifier(var6);
         if (field_32116 == null) {
            field_32116 = new HashMap<Identifier, class_4859>();

            for (Identifier var9 : class_5630.method_25515()) {
               class_4859 var10 = class_5630.method_25523(var9);
               if (var10 != null) {
                  String var11 = var9.method_21456().replace(" ", "").replace("_", "").toLowerCase();
                  Identifier var12 = new Identifier(var9.method_21461(), var11);
                  field_32116.put(var12, var10);
               }
            }
         }

         var5 = field_32116.get(var7);
         return var5 == null ? null : var5;
      }
   }

   public int method_28676(String var1, int var2) {
      if (var1 != null) {
         var1 = var1.trim();
         int var5 = class_3111.method_14361(var1, -1);
         if (var5 >= 0) {
            return var5;
         } else {
            this.method_28663("Invalid number: " + var1);
            return var2;
         }
      } else {
         return var2;
      }
   }

   public int[] method_28667(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();
         String[] var5 = class_3111.method_14302(var1, " ,");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (!var7.contains("-")) {
               int var14 = class_3111.method_14361(var7, -1);
               if (var14 >= 0) {
                  var4.add(var14);
               } else {
                  this.method_28663("Invalid number: " + var7 + ", when parsing: " + var1);
               }
            } else {
               String[] var8 = class_3111.method_14302(var7, "-");
               if (var8.length == 2) {
                  int var9 = class_3111.method_14361(var8[0], -1);
                  int var10 = class_3111.method_14361(var8[1], -1);
                  if (var9 >= 0 && var10 >= 0 && var9 <= var10) {
                     for (int var11 = var9; var11 <= var10; var11++) {
                        var4.add(var11);
                     }
                  } else {
                     this.method_28663("Invalid interval: " + var7 + ", when parsing: " + var1);
                  }
               } else {
                  this.method_28663("Invalid interval: " + var7 + ", when parsing: " + var1);
               }
            }
         }

         int[] var12 = new int[var4.size()];

         for (int var13 = 0; var13 < var12.length; var13++) {
            var12[var13] = (Integer)var4.get(var13);
         }

         return var12;
      }
   }

   public boolean[] method_28668(String var1, boolean[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         EnumSet var5 = EnumSet.<Direction>allOf(Direction.class);
         String[] var6 = class_3111.method_14302(var1, " ,");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (!var8.equals("sides")) {
               if (!var8.equals("all")) {
                  Direction var9 = this.method_28658(var8);
                  if (var9 != null) {
                     var5.add(var9);
                  }
               } else {
                  var5.addAll(Arrays.asList(Direction.field_803));
               }
            } else {
               var5.add(Direction.field_818);
               var5.add(Direction.field_800);
               var5.add(Direction.field_809);
               var5.add(Direction.field_804);
            }
         }

         boolean[] var10 = new boolean[Direction.field_803.length];

         for (int var11 = 0; var11 < var10.length; var11++) {
            var10[var11] = var5.contains(Direction.field_803[var11]);
         }

         return var10;
      }
   }

   public Direction method_28658(String var1) {
      var1 = var1.toLowerCase();
      if (var1.equals("bottom") || var1.equals("down")) {
         return Direction.field_802;
      } else if (var1.equals("top") || var1.equals("up")) {
         return Direction.field_817;
      } else if (var1.equals("north")) {
         return Direction.field_818;
      } else if (var1.equals("south")) {
         return Direction.field_800;
      } else if (var1.equals("east")) {
         return Direction.field_804;
      } else if (!var1.equals("west")) {
         class_3111.method_14317("Unknown face: " + var1);
         return null;
      } else {
         return Direction.field_809;
      }
   }

   public void method_28682(String var1) {
      class_3111.method_14277("" + this.field_32119 + ": " + var1);
   }

   public void method_28663(String var1) {
      class_3111.method_14317("" + this.field_32119 + ": " + var1);
   }

   public class_8750 method_28653(String var1) {
      if (var1 == null) {
         return null;
      } else {
         class_8750 var4 = new class_8750();
         String[] var5 = class_3111.method_14302(var1, " ,");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            class_2279 var8 = this.method_28673(var7);
            if (var8 == null) {
               return null;
            }

            var4.method_40162(var8);
         }

         return var4;
      }
   }

   private class_2279 method_28673(String var1) {
      if (var1 != null) {
         if (var1.indexOf(45) < 0) {
            int var7 = class_3111.method_14361(var1, -1);
            if (var7 >= 0) {
               return new class_2279(var7, var7);
            } else {
               this.method_28663("Invalid integer: " + var1);
               return null;
            }
         } else {
            String[] var4 = class_3111.method_14302(var1, "-");
            if (var4.length == 2) {
               int var5 = class_3111.method_14361(var4[0], -1);
               int var6 = class_3111.method_14361(var4[1], -1);
               if (var5 >= 0 && var6 >= 0) {
                  return new class_2279(var5, var6);
               } else {
                  this.method_28663("Invalid range: " + var1);
                  return null;
               }
            } else {
               this.method_28663("Invalid range: " + var1);
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public boolean method_28684(String var1, boolean var2) {
      if (var1 != null) {
         String var5 = var1.toLowerCase().trim();
         if (!var5.equals("true")) {
            if (!var5.equals("false")) {
               this.method_28663("Invalid boolean: " + var1);
               return var2;
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return var2;
      }
   }

   public Boolean method_28666(String var1) {
      if (var1 != null) {
         String var4 = var1.toLowerCase().trim();
         if (!var4.equals("true")) {
            if (!var4.equals("false")) {
               this.method_28663("Invalid boolean: " + var1);
               return null;
            } else {
               return Boolean.FALSE;
            }
         } else {
            return Boolean.TRUE;
         }
      } else {
         return null;
      }
   }

   public static int method_28648(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var5) {
            return var1;
         }
      }
   }

   public static int method_28664(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return (int)(Long.parseLong(var0, 16) & -1L);
         } catch (NumberFormatException var5) {
            return var1;
         }
      }
   }

   public RenderLayer method_28672(String var1, RenderLayer var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.toLowerCase().trim();
         RenderLayer[] var5 = RenderLayer.field_17580;

         for (int var6 = 0; var6 < var5.length; var6++) {
            RenderLayer var7 = var5[var6];
            if (var1.equals(var7.method_24421().toLowerCase())) {
               return var7;
            }
         }

         return var2;
      }
   }

   public <T> T method_28651(String var1, T[] var2, class_2930 var3, String var4) {
      if (var1 != null) {
         String var7 = var1.toLowerCase().trim();

         for (int var8 = 0; var8 < var2.length; var8++) {
            Object var9 = var2[var8];
            String var10 = var3.method_13389(var9);
            if (var10 != null && var10.toLowerCase().equals(var7)) {
               return (T)var9;
            }
         }

         this.method_28663("Invalid " + var4 + ": " + var1);
         return null;
      } else {
         return null;
      }
   }

   public <T> T[] method_28679(String var1, T[] var2, class_2930 var3, String var4, T[] var5) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.toLowerCase().trim();
         String[] var8 = class_3111.method_14302(var1, " ");
         Object[] var9 = (Object[])Array.newInstance(var2.getClass().getComponentType(), var8.length);

         for (int var10 = 0; var10 < var8.length; var10++) {
            String var11 = var8[var10];
            Object var12 = this.<Object>method_28651(var11, var2, var3, var4);
            if (var12 == null) {
               return (T[])var5;
            }

            var9[var10] = var12;
         }

         return (T[])var9;
      }
   }

   public Enum method_28652(String var1, Enum[] var2, String var3) {
      return this.<Enum>method_28651(var1, var2, field_32121, var3);
   }

   public Enum[] method_28675(String var1, Enum[] var2, String var3, Enum[] var4) {
      return this.<Enum>method_28679(var1, var2, field_32121, var3, var4);
   }

   public class_9077[] method_28646(String var1, String var2, class_9077[] var3) {
      return this.<class_9077>method_28679(var1, class_9077.values(), field_32122, var2, var3);
   }

   public class_9614[] method_28674(String var1, String var2, class_9614[] var3) {
      return this.<class_9614>method_28679(var1, class_9614.values(), field_32121, var2, var3);
   }

   public class_1719 method_28665(String var1, String var2) {
      return var1 != null && var2 != null ? new class_1719(var1, var2) : null;
   }

   public class_9438[] method_28662(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();
         String[] var5 = class_3111.method_14302(var1, " ");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            class_9438 var8 = this.method_28654(var7);
            if (var8 == null) {
               this.method_28663("Invalid profession: " + var7);
               return field_32117;
            }

            var4.add(var8);
         }

         return !var4.isEmpty() ? var4.<class_9438>toArray(new class_9438[var4.size()]) : null;
      }
   }

   private class_9438 method_28654(String var1) {
      String var4 = var1;
      String var5 = null;
      int var6 = var1.lastIndexOf(58);
      if (var6 >= 0) {
         String var7 = var1.substring(0, var6);
         String var8 = var1.substring(var6 + 1);
         if (var8.isEmpty() || var8.matches("[0-9].*")) {
            var4 = var7;
            var5 = var8;
         }
      }

      class_4466 var9 = this.method_28661(var4);
      if (var9 != null) {
         int[] var10 = this.method_28667(var5);
         return new class_9438(var9, var10);
      } else {
         return null;
      }
   }

   private class_4466 method_28661(String var1) {
      if (var1 != null) {
         var1 = var1.toLowerCase();
         Identifier var4 = new Identifier(var1);
         class_3991 var5 = class_8669.field_44425;
         return var5.method_39814(var4) ? (class_4466)var5.method_39806(var4) : null;
      } else {
         return null;
      }
   }

   public int[] method_28681(String var1) {
      var1 = var1.trim();
      TreeSet var4 = new TreeSet();
      String[] var5 = class_3111.method_14302(var1, " ");

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         Identifier var8 = new Identifier(var7);
         class_2451 var9 = class_4354.method_20213(var8);
         if (var9 != null) {
            int var10 = class_4354.method_20212(var9);
            if (var10 >= 0) {
               var4.add(new Integer(var10));
            } else {
               this.method_28663("Item has no ID: " + var9 + ", name: " + var7);
            }
         } else {
            this.method_28663("Item not found: " + var7);
         }
      }

      Integer[] var12 = var4.<Integer>toArray(new Integer[var4.size()]);
      return class_3111.method_14267(var12);
   }

   public int[] method_28669(String var1) {
      var1 = var1.trim();
      TreeSet var4 = new TreeSet();
      String[] var5 = class_3111.method_14302(var1, " ");

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         Identifier var8 = new Identifier(var7);
         class_6629 var9 = class_3057.method_13956(var8);
         if (var9 != null) {
            int var10 = class_8669.field_44400.method_14041(var9);
            if (var10 >= 0) {
               var4.add(new Integer(var10));
            } else {
               this.method_28663("Entity has no ID: " + var9 + ", name: " + var7);
            }
         } else {
            this.method_28663("Entity not found: " + var7);
         }
      }

      Integer[] var12 = var4.<Integer>toArray(new Integer[var4.size()]);
      return class_3111.method_14267(var12);
   }
}
