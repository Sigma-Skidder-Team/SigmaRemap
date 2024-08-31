package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;

import java.lang.reflect.Array;
import java.util.*;

public class Class8896 {
   private String field40258 = null;
   public static final Class9710[] field40259 = new Class9710[0];
   public static final Class112[] field40260 = new Class112[0];
   private static Map<ResourceLocation, Class8507> field40261 = null;
   private static final Class7855<Enum> field40262 = new Class7856();
   private static final Class7855<Class112> field40263 = new Class7857();

   public Class8896(String var1) {
      this.field40258 = var1;
   }

   public String method32382(String var1) {
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

   public String method32383(String var1) {
      int var4 = var1.lastIndexOf(47);
      return var4 >= 0 ? var1.substring(0, var4) : "";
   }

   public Class9727[] method32384(String var1) {
      if (var1 != null) {
         List<Class9727> var4 = new ArrayList();
         String[] var5 = Class7944.method26903(var1, " ");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            Class9727[] var8 = this.method32386(var7);
            if (var8 != null) {
               var4.addAll(Arrays.asList(var8));
            }
         }

         return var4.toArray(new Class9727[var4.size()]);
      } else {
         return null;
      }
   }

   public BlockState method32385(String var1, BlockState var2) {
      Class9727[] var5 = this.method32386(var1);
      if (var5 != null) {
         if (var5.length == 1) {
            Class9727 var6 = var5[0];
            int var7 = var6.method38103();
            Block var8 = Registry.BLOCK.method9172(var7);
            return var8.method11579();
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public Class9727[] method32386(String var1) {
      if (var1 != null) {
         var1 = var1.trim();
         if (var1.length() <= 0) {
            return null;
         } else {
            String[] var4 = Class7944.method26903(var1, ":");
            String var5 = "minecraft";
            byte var6 = 0;
            if (var4.length > 1 && this.method32387(var4)) {
               var5 = var4[0];
               var6 = 1;
            } else {
               var5 = "minecraft";
               var6 = 0;
            }

            String var7 = var4[var6];
            String[] var8 = Arrays.<String>copyOfRange(var4, var6 + 1, var4.length);
            Block[] var9 = this.method32389(var5, var7);
            if (var9 != null) {
               Class9727[] var10 = new Class9727[var9.length];

               for (int var11 = 0; var11 < var9.length; var11++) {
                  Block var12 = var9[var11];
                  int var13 = Registry.BLOCK.method9171(var12);
                  int[] var14 = null;
                  if (var8.length > 0) {
                     var14 = this.method32390(var12, var8);
                     if (var14 == null) {
                        return null;
                     }
                  }

                  Class9727 var15 = new Class9727(var13, var14);
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

   public boolean method32387(String[] var1) {
      if (var1.length > 1) {
         String var4 = var1[1];
         return var4.length() >= 1 ? !var4.contains("=") : false;
      } else {
         return false;
      }
   }

   public boolean method32388(String var1) {
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

   public Block[] method32389(String var1, String var2) {
      String var5 = var1 + ":" + var2;
      ResourceLocation var6 = new ResourceLocation(var5);
      Block var7 = Class9716.method38066(var6);
      if (var7 != null) {
         return new Block[]{var7};
      } else {
         this.method32403("Block not found for name: " + var5);
         return null;
      }
   }

   public int[] method32390(Block var1, String[] var2) {
      if (var2.length <= 0) {
         return null;
      } else {
         BlockState var5 = var1.method11579();
         Collection var6 = var5.method23461();
         HashMap var7 = new HashMap();

         for (int var8 = 0; var8 < var2.length; var8++) {
            String var9 = var2[var8];
            if (var9.length() > 0) {
               String[] var10 = Class7944.method26903(var9, "=");
               if (var10.length != 2) {
                  this.method32403("Invalid block property: " + var9);
                  return null;
               }

               String var11 = var10[0];
               String var12 = var10[1];
               Class8550 var13 = Class7104.method22099(var11, var6);
               if (var13 == null) {
                  this.method32403("Property not found: " + var11 + ", block: " + var1);
                  return null;
               }

               List var14 = (List) var7.get(var11);
               if (var14 == null) {
                  var14 = new ArrayList();
                  var7.put(var13, var14);
               }

               String[] var15 = Class7944.method26903(var12, ",");

               for (int var16 = 0; var16 < var15.length; var16++) {
                  String var17 = var15[var16];
                  Comparable var18 = method32391(var13, var17);
                  if (var18 == null) {
                     this.method32403("Property value not found: " + var17 + ", property: " + var11 + ", block: " + var1);
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
            int var21 = Class9716.method38068(var1);

            for (int var22 = 0; var22 < var21; var22++) {
               try {
                  BlockState var24 = Class9716.method38069(var1, var22);
                  if (this.method32395(var24, var7)) {
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

   public static Comparable method32391(Class8550 var0, String var1) {
      Class var4 = var0.method30473();
      Comparable var5 = method32394(var1, var4);
      if (var5 == null) {
         Collection var6 = var0.method30474();
         var5 = method32392(var1, var6);
      }

      return var5;
   }

   public static Comparable method32392(String var0, Collection<Comparable> var1) {
      for (Comparable var5 : var1) {
         if (method32393(var5).equals(var0)) {
            return var5;
         }
      }

      return null;
   }

   private static Object method32393(Comparable var0) {
      if (!(var0 instanceof Class83)) {
         return var0.toString();
      } else {
         Class83 var3 = (Class83)var0;
         return var3.method257();
      }
   }

   public static Comparable method32394(String var0, Class var1) {
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

   public boolean method32395(BlockState var1, Map<Class8550, List<Comparable>> var2) {
      for (Class8550 var6 : var2.keySet()) {
         List var7 = (List)var2.get(var6);
         Comparable var8 = var1.<Comparable>method23463(var6);
         if (var8 == null) {
            return false;
         }

         if (!var7.contains(var8)) {
            return false;
         }
      }

      return true;
   }

   public Class8507[] method32396(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         boolean var4 = false;
         if (var1.startsWith("!")) {
            var4 = true;
            var1 = var1.substring(1);
         }

         String[] var5 = Class7944.method26903(var1, " ");
         List<Class8507> var6 = new ArrayList();

         for (int var7 = 0; var7 < var5.length; var7++) {
            String var8 = var5[var7];
            Class8507 var9 = this.method32397(var8);
            if (var9 != null) {
               var6.add(var9);
            } else {
               this.method32403("Biome not found: " + var8);
            }
         }

         if (var4) {
            HashSet var11 = new HashSet<ResourceLocation>(Class8708.method31411());

            for (Class8507 var13 : var6) {
               var11.remove(var13.method30137());
            }

            var6 = Class8708.method31414(var11);
         }

         return var6.toArray(new Class8507[var6.size()]);
      }
   }

   public Class8507 method32397(String var1) {
      var1 = var1.toLowerCase();
      ResourceLocation var4 = new ResourceLocation(var1);
      Class8507 var5 = Class8708.method31409(var4);
      if (var5 != null) {
         return var5;
      } else {
         String var6 = var1.replace(" ", "").replace("_", "");
         ResourceLocation var7 = new ResourceLocation(var6);
         if (field40261 == null) {
            field40261 = new HashMap<ResourceLocation, Class8507>();

            for (ResourceLocation var9 : Class8708.method31411()) {
               Class8507 var10 = Class8708.method31409(var9);
               if (var10 != null) {
                  String var11 = var9.getPath().replace(" ", "").replace("_", "").toLowerCase();
                  ResourceLocation var12 = new ResourceLocation(var9.getNamespace(), var11);
                  field40261.put(var12, var10);
               }
            }
         }

         var5 = field40261.get(var7);
         return var5 == null ? null : var5;
      }
   }

   public int method32398(String var1, int var2) {
      if (var1 != null) {
         var1 = var1.trim();
         int var5 = Class7944.method26899(var1, -1);
         if (var5 >= 0) {
            return var5;
         } else {
            this.method32403("Invalid number: " + var1);
            return var2;
         }
      } else {
         return var2;
      }
   }

   public int[] method32399(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();
         String[] var5 = Class7944.method26903(var1, " ,");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (!var7.contains("-")) {
               int var14 = Class7944.method26899(var7, -1);
               if (var14 >= 0) {
                  var4.add(var14);
               } else {
                  this.method32403("Invalid number: " + var7 + ", when parsing: " + var1);
               }
            } else {
               String[] var8 = Class7944.method26903(var7, "-");
               if (var8.length == 2) {
                  int var9 = Class7944.method26899(var8[0], -1);
                  int var10 = Class7944.method26899(var8[1], -1);
                  if (var9 >= 0 && var10 >= 0 && var9 <= var10) {
                     for (int var11 = var9; var11 <= var10; var11++) {
                        var4.add(var11);
                     }
                  } else {
                     this.method32403("Invalid interval: " + var7 + ", when parsing: " + var1);
                  }
               } else {
                  this.method32403("Invalid interval: " + var7 + ", when parsing: " + var1);
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

   public boolean[] method32400(String var1, boolean[] var2) {
      if (var1 == null) {
         return var2;
      } else {
         EnumSet var5 = EnumSet.<Direction>allOf(Direction.class);
         String[] var6 = Class7944.method26903(var1, " ,");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            if (!var8.equals("sides")) {
               if (!var8.equals("all")) {
                  Direction var9 = this.method32401(var8);
                  if (var9 != null) {
                     var5.add(var9);
                  }
               } else {
                  var5.addAll(Arrays.asList(Direction.field685));
               }
            } else {
               var5.add(Direction.NORTH);
               var5.add(Direction.SOUTH);
               var5.add(Direction.WEST);
               var5.add(Direction.EAST);
            }
         }

         boolean[] var10 = new boolean[Direction.field685.length];

         for (int var11 = 0; var11 < var10.length; var11++) {
            var10[var11] = var5.contains(Direction.field685[var11]);
         }

         return var10;
      }
   }

   public Direction method32401(String var1) {
      var1 = var1.toLowerCase();
      if (var1.equals("bottom") || var1.equals("down")) {
         return Direction.DOWN;
      } else if (var1.equals("top") || var1.equals("up")) {
         return Direction.field673;
      } else if (var1.equals("north")) {
         return Direction.NORTH;
      } else if (var1.equals("south")) {
         return Direction.SOUTH;
      } else if (var1.equals("east")) {
         return Direction.EAST;
      } else if (!var1.equals("west")) {
         Class7944.method26811("Unknown face: " + var1);
         return null;
      } else {
         return Direction.WEST;
      }
   }

   public void method32402(String var1) {
      Class7944.method26810("" + this.field40258 + ": " + var1);
   }

   public void method32403(String var1) {
      Class7944.method26811("" + this.field40258 + ": " + var1);
   }

   public Class9532 method32404(String var1) {
      if (var1 == null) {
         return null;
      } else {
         Class9532 var4 = new Class9532();
         String[] var5 = Class7944.method26903(var1, " ,");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            Class7589 var8 = this.method32405(var7);
            if (var8 == null) {
               return null;
            }

            var4.method36837(var8);
         }

         return var4;
      }
   }

   private Class7589 method32405(String var1) {
      if (var1 != null) {
         if (var1.indexOf(45) < 0) {
            int var7 = Class7944.method26899(var1, -1);
            if (var7 >= 0) {
               return new Class7589(var7, var7);
            } else {
               this.method32403("Invalid integer: " + var1);
               return null;
            }
         } else {
            String[] var4 = Class7944.method26903(var1, "-");
            if (var4.length == 2) {
               int var5 = Class7944.method26899(var4[0], -1);
               int var6 = Class7944.method26899(var4[1], -1);
               if (var5 >= 0 && var6 >= 0) {
                  return new Class7589(var5, var6);
               } else {
                  this.method32403("Invalid range: " + var1);
                  return null;
               }
            } else {
               this.method32403("Invalid range: " + var1);
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public boolean method32406(String var1, boolean var2) {
      if (var1 != null) {
         String var5 = var1.toLowerCase().trim();
         if (!var5.equals("true")) {
            if (!var5.equals("false")) {
               this.method32403("Invalid boolean: " + var1);
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

   public Boolean method32407(String var1) {
      if (var1 != null) {
         String var4 = var1.toLowerCase().trim();
         if (!var4.equals("true")) {
            if (!var4.equals("false")) {
               this.method32403("Invalid boolean: " + var1);
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

   public static int method32408(String var0, int var1) {
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

   public static int method32409(String var0, int var1) {
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

   public RenderType method32410(String var1, RenderType var2) {
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.toLowerCase().trim();
         RenderType[] var5 = RenderType.field21819;

         for (int var6 = 0; var6 < var5.length; var6++) {
            RenderType var7 = var5[var6];
            if (var1.equals(var7.method14234().toLowerCase())) {
               return var7;
            }
         }

         return var2;
      }
   }

   public <T> T method32411(String var1, T[] var2, Class7855 var3, String var4) {
      if (var1 != null) {
         String var7 = var1.toLowerCase().trim();

         for (int var8 = 0; var8 < var2.length; var8++) {
            Object var9 = var2[var8];
            String var10 = var3.method26310(var9);
            if (var10 != null && var10.toLowerCase().equals(var7)) {
               return (T)var9;
            }
         }

         this.method32403("Invalid " + var4 + ": " + var1);
         return null;
      } else {
         return null;
      }
   }

   public <T> T[] method32412(String var1, T[] var2, Class7855 var3, String var4, T[] var5) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.toLowerCase().trim();
         String[] var8 = Class7944.method26903(var1, " ");
         Object[] var9 = (Object[])Array.newInstance(var2.getClass().getComponentType(), var8.length);

         for (int var10 = 0; var10 < var8.length; var10++) {
            String var11 = var8[var10];
            Object var12 = this.<Object>method32411(var11, var2, var3, var4);
            if (var12 == null) {
               return (T[])var5;
            }

            var9[var10] = var12;
         }

         return (T[])var9;
      }
   }

   public Enum method32413(String var1, Enum[] var2, String var3) {
      return this.<Enum>method32411(var1, var2, field40262, var3);
   }

   public Enum[] method32414(String var1, Enum[] var2, String var3, Enum[] var4) {
      return this.<Enum>method32412(var1, var2, field40262, var3, var4);
   }

   public Class112[] method32415(String var1, String var2, Class112[] var3) {
      return this.<Class112>method32412(var1, Class112.values(), field40263, var2, var3);
   }

   public Class1989[] method32416(String var1, String var2, Class1989[] var3) {
      return this.<Class1989>method32412(var1, Class1989.values(), field40262, var2, var3);
   }

   public Class7305 method32417(String var1, String var2) {
      return var1 != null && var2 != null ? new Class7305(var1, var2) : null;
   }

   public Class9710[] method32418(String var1) {
      if (var1 == null) {
         return null;
      } else {
         List<Class9710> var4 = new ArrayList();
         String[] var5 = Class7944.method26903(var1, " ");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            Class9710 var8 = this.method32419(var7);
            if (var8 == null) {
               this.method32403("Invalid profession: " + var7);
               return field40259;
            }

            var4.add(var8);
         }

         return !var4.isEmpty() ? var4.toArray(new Class9710[var4.size()]) : null;
      }
   }

   private Class9710 method32419(String var1) {
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

      Class8395 var9 = this.method32420(var4);
      if (var9 != null) {
         int[] var10 = this.method32399(var5);
         return new Class9710(var9, var10);
      } else {
         return null;
      }
   }

   private Class8395 method32420(String var1) {
      if (var1 != null) {
         var1 = var1.toLowerCase();
         ResourceLocation var4 = new ResourceLocation(var1);
         Class2351 var5 = Registry.field16090;
         return var5.method9193(var4) ? (Class8395)var5.method9184(var4) : null;
      } else {
         return null;
      }
   }

   public int[] method32421(String var1) {
      var1 = var1.trim();
      Set<Integer> var4 = new TreeSet();
      String[] var5 = Class7944.method26903(var1, " ");

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         ResourceLocation var8 = new ResourceLocation(var7);
         Item var9 = Class8365.method29304(var8);
         if (var9 != null) {
            int var10 = Class8365.method29305(var9);
            if (var10 >= 0) {
               var4.add(new Integer(var10));
            } else {
               this.method32403("Item has no ID: " + var9 + ", name: " + var7);
            }
         } else {
            this.method32403("Item not found: " + var7);
         }
      }

      Integer[] var12 = var4.toArray(new Integer[var4.size()]);
      return Class7944.method26976(var12);
   }

   public int[] method32422(String var1) {
      var1 = var1.trim();
      Set<Integer> var4 = new TreeSet();
      String[] var5 = Class7944.method26903(var1, " ");

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         ResourceLocation var8 = new ResourceLocation(var7);
         EntityType var9 = Class7926.method26598(var8);
         if (var9 != null) {
            int var10 = Registry.ENTITY_TYPE.method9171(var9);
            if (var10 >= 0) {
               var4.add(new Integer(var10));
            } else {
               this.method32403("Entity has no ID: " + var9 + ", name: " + var7);
            }
         } else {
            this.method32403("Entity not found: " + var7);
         }
      }

      Integer[] var12 = var4.toArray(new Integer[var4.size()]);
      return Class7944.method26976(var12);
   }
}
