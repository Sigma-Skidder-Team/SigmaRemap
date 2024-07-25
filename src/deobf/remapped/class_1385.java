package remapped;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

public class class_1385 {
   public String field_7563 = null;
   public String field_7541 = null;
   public class_9491[] field_7515 = null;
   public int[] field_7559 = null;
   public String[] field_7498 = null;
   public int field_7551 = 0;
   public String[] field_7542 = null;
   public int field_7509 = 0;
   public int field_7530 = 63;
   public class_4859[] field_7525 = null;
   public class_8750 field_7517 = null;
   public int field_7533 = 0;
   public boolean field_7552 = false;
   public int[] field_7504 = null;
   public int field_7520 = 0;
   public int field_7506 = 0;
   public int[] field_7522 = null;
   public int field_7538 = 0;
   public int field_7516 = 1;
   public boolean field_7529 = false;
   public class_1719 field_7560 = null;
   public int[] field_7508 = null;
   public int field_7547 = 1;
   public class_5155[] field_7512 = null;
   public class_5155[] field_7503 = null;
   public class_9491[] field_7535 = null;
   public String[] field_7514 = null;
   public class_5155[] field_7532 = null;
   public int field_7523 = -1;
   public class_2522 field_7561 = class_4783.field_23184.method_29260();
   public RenderLayer field_7502 = null;
   public static final int field_7537 = 0;
   public static final int field_7521 = 1;
   public static final int field_7527 = 2;
   public static final int field_7534 = 3;
   public static final int field_7526 = 4;
   public static final int field_7505 = 5;
   public static final int field_7548 = 6;
   public static final int field_7507 = 7;
   public static final int field_7556 = 8;
   public static final int field_7558 = 9;
   public static final int field_7499 = 10;
   public static final int field_7545 = 11;
   public static final int field_7562 = 12;
   public static final int field_7540 = 13;
   public static final int field_7536 = 14;
   public static final int field_7549 = 15;
   public static final int field_7501 = 0;
   public static final int field_7565 = 1;
   public static final int field_7531 = 2;
   public static final int field_7553 = 3;
   public static final int field_7566 = 4;
   public static final int field_7546 = 128;
   public static final int field_7510 = 1;
   public static final int field_7500 = 2;
   public static final int field_7528 = 4;
   public static final int field_7511 = 8;
   public static final int field_7513 = 16;
   public static final int field_7539 = 32;
   public static final int field_7544 = 60;
   public static final int field_7543 = 63;
   public static final int field_7564 = 128;
   public static final int field_7554 = 1;
   public static final int field_7555 = 2;
   public static final int field_7524 = 6;
   public static final int field_7557 = 128;
   public static final String field_7550 = "<skip>.png";
   public static final String field_7519 = "<default>.png";

   public class_1385(Properties var1, String var2) {
      class_6284 var5 = new class_6284("ConnectedTextures");
      this.field_7563 = var5.method_28678(var2);
      this.field_7541 = var5.method_28649(var2);
      this.field_7515 = var5.method_28680(var1.getProperty("matchBlocks"));
      this.field_7559 = var5.method_28667(var1.getProperty("metadata"));
      this.field_7498 = this.method_6413(var1.getProperty("matchTiles"));
      this.field_7551 = method_6379(var1.getProperty("method"));
      this.field_7542 = this.method_6401(var1.getProperty("tiles"));
      this.field_7509 = method_6396(var1.getProperty("connect"));
      this.field_7530 = method_6399(var1.getProperty("faces"));
      this.field_7525 = var5.method_28644(var1.getProperty("biomes"));
      this.field_7517 = var5.method_28653(var1.getProperty("heights"));
      if (this.field_7517 == null) {
         int var6 = var5.method_28676(var1.getProperty("minHeight"), -1);
         int var7 = var5.method_28676(var1.getProperty("maxHeight"), 1024);
         if (var6 != -1 || var7 != 1024) {
            this.field_7517 = new class_8750(new class_2279(var6, var7));
         }
      }

      this.field_7533 = var5.method_28676(var1.getProperty("renderPass"), -1);
      this.field_7552 = var5.method_28684(var1.getProperty("innerSeams"), false);
      this.field_7504 = this.method_6411(var1);
      this.field_7520 = var5.method_28676(var1.getProperty("width"), -1);
      this.field_7506 = var5.method_28676(var1.getProperty("height"), -1);
      this.field_7522 = var5.method_28667(var1.getProperty("weights"));
      this.field_7538 = var5.method_28676(var1.getProperty("randomLoops"), 0);
      this.field_7516 = method_6388(var1.getProperty("symmetry"));
      this.field_7529 = var5.method_28684(var1.getProperty("linked"), false);
      this.field_7560 = var5.method_28665("name", var1.getProperty("name"));
      this.field_7535 = var5.method_28680(var1.getProperty("connectBlocks"));
      this.field_7514 = this.method_6413(var1.getProperty("connectTiles"));
      this.field_7523 = var5.method_28676(var1.getProperty("tintIndex"), -1);
      this.field_7561 = var5.method_28659(var1.getProperty("tintBlock"), class_4783.field_23184.method_29260());
      this.field_7502 = var5.method_28672(var1.getProperty("layer"), class_6727.field_34746);
   }

   private int[] method_6411(Properties var1) {
      if (this.field_7542 == null) {
         return null;
      } else {
         HashMap var4 = new HashMap();

         for (Object var6 : var1.keySet()) {
            if (var6 instanceof String) {
               String var7 = (String)var6;
               String var8 = "ctm.";
               if (var7.startsWith(var8)) {
                  String var9 = var7.substring(var8.length());
                  String var10 = var1.getProperty(var7);
                  if (var10 != null) {
                     var10 = var10.trim();
                     int var11 = Config.method_14361(var9, -1);
                     if (var11 >= 0 && var11 <= 46) {
                        int var12 = Config.method_14361(var10, -1);
                        if (var12 >= 0 && var12 < this.field_7542.length) {
                           var4.put(var11, var12);
                        } else {
                           Config.method_14317("Invalid CTM tile index: " + var10);
                        }
                     } else {
                        Config.method_14317("Invalid CTM index: " + var9);
                     }
                  }
               }
            }
         }

         if (!var4.isEmpty()) {
            int[] var13 = new int[47];

            for (int var14 = 0; var14 < var13.length; var14++) {
               var13[var14] = -1;
               if (var4.containsKey(var14)) {
                  var13[var14] = (Integer)var4.get(var14);
               }
            }

            return var13;
         } else {
            return null;
         }
      }
   }

   private String[] method_6413(String var1) {
      if (var1 != null) {
         String[] var4 = Config.method_14302(var1, " ");

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            if (var6.endsWith(".png")) {
               var6 = var6.substring(0, var6.length() - 4);
            }

            var6 = class_5525.method_25096(var6, this.field_7541);
            var4[var5] = var6;
         }

         return var4;
      } else {
         return null;
      }
   }

   private static String method_6372(String var0) {
      String var3 = var0;
      int var4 = var0.lastIndexOf(47);
      if (var4 >= 0) {
         var3 = var0.substring(var4 + 1);
      }

      int var5 = var3.lastIndexOf(46);
      if (var5 >= 0) {
         var3 = var3.substring(0, var5);
      }

      return var3;
   }

   private static String method_6412(String var0) {
      int var3 = var0.lastIndexOf(47);
      return var3 >= 0 ? var0.substring(0, var3) : "";
   }

   private String[] method_6401(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();
         String[] var5 = Config.method_14302(var1, " ,");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.contains("-")) {
               String[] var8 = Config.method_14302(var7, "-");
               if (var8.length == 2) {
                  int var9 = Config.method_14361(var8[0], -1);
                  int var10 = Config.method_14361(var8[1], -1);
                  if (var9 >= 0 && var10 >= 0) {
                     if (var9 <= var10) {
                        for (int var11 = var9; var11 <= var10; var11++) {
                           var4.add(String.valueOf(var11));
                        }
                        continue;
                     }

                     Config.method_14317("Invalid interval: " + var7 + ", when parsing: " + var1);
                     continue;
                  }
               }
            }

            var4.add(var7);
         }

         String[] var12 = var4.<String>toArray(new String[var4.size()]);

         for (int var13 = 0; var13 < var12.length; var13++) {
            String var14 = var12[var13];
            var14 = class_5525.method_25096(var14, this.field_7541);
            if (!var14.startsWith(this.field_7541) && !var14.startsWith("textures/") && !var14.startsWith("optifine/")) {
               var14 = this.field_7541 + "/" + var14;
            }

            if (var14.endsWith(".png")) {
               var14 = var14.substring(0, var14.length() - 4);
            }

            if (var14.startsWith("/")) {
               var14 = var14.substring(1);
            }

            var12[var13] = var14;
         }

         return var12;
      }
   }

   private static int method_6388(String var0) {
      if (var0 != null) {
         var0 = var0.trim();
         if (!var0.equals("opposite")) {
            if (!var0.equals("all")) {
               Config.method_14317("Unknown symmetry: " + var0);
               return 1;
            } else {
               return 6;
            }
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }

   private static int method_6399(String var0) {
      if (var0 == null) {
         return 63;
      } else {
         String[] var3 = Config.method_14302(var0, " ,");
         int var4 = 0;

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            int var7 = method_6414(var6);
            var4 |= var7;
         }

         return var4;
      }
   }

   private static int method_6414(String var0) {
      var0 = var0.toLowerCase();
      if (var0.equals("bottom") || var0.equals("down")) {
         return 1;
      } else if (var0.equals("top") || var0.equals("up")) {
         return 2;
      } else if (var0.equals("north")) {
         return 4;
      } else if (var0.equals("south")) {
         return 8;
      } else if (var0.equals("east")) {
         return 32;
      } else if (var0.equals("west")) {
         return 16;
      } else if (var0.equals("sides")) {
         return 60;
      } else if (!var0.equals("all")) {
         Config.method_14317("Unknown face: " + var0);
         return 128;
      } else {
         return 63;
      }
   }

   private static int method_6396(String var0) {
      if (var0 != null) {
         var0 = var0.trim();
         if (!var0.equals("block")) {
            if (!var0.equals("tile")) {
               if (!var0.equals("material")) {
                  if (!var0.equals("state")) {
                     Config.method_14317("Unknown connect: " + var0);
                     return 128;
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   public static class_5019 method_6387(String var0, Collection<class_5019> var1) {
      for (class_5019 var5 : var1) {
         if (var0.equals(var5.method_23109())) {
            return var5;
         }
      }

      return null;
   }

   private static int method_6379(String var0) {
      if (var0 != null) {
         var0 = var0.trim();
         if (var0.equals("ctm") || var0.equals("glass")) {
            return 1;
         } else if (var0.equals("ctm_compact")) {
            return 10;
         } else if (var0.equals("horizontal") || var0.equals("bookshelf")) {
            return 2;
         } else if (var0.equals("vertical")) {
            return 6;
         } else if (var0.equals("top")) {
            return 3;
         } else if (var0.equals("random")) {
            return 4;
         } else if (var0.equals("repeat")) {
            return 5;
         } else if (var0.equals("fixed")) {
            return 7;
         } else if (var0.equals("horizontal+vertical") || var0.equals("h+v")) {
            return 8;
         } else if (var0.equals("vertical+horizontal") || var0.equals("v+h")) {
            return 9;
         } else if (var0.equals("overlay")) {
            return 11;
         } else if (var0.equals("overlay_fixed")) {
            return 12;
         } else if (var0.equals("overlay_random")) {
            return 13;
         } else if (var0.equals("overlay_repeat")) {
            return 14;
         } else if (!var0.equals("overlay_ctm")) {
            Config.method_14317("Unknown method: " + var0);
            return 0;
         } else {
            return 15;
         }
      } else {
         return 1;
      }
   }

   public boolean method_6404(String var1) {
      if (this.field_7563 == null || this.field_7563.length() <= 0) {
         Config.method_14317("No name found: " + var1);
         return false;
      } else if (this.field_7541 == null) {
         Config.method_14317("No base path found: " + var1);
         return false;
      } else {
         if (this.field_7515 == null) {
            this.field_7515 = this.method_6384();
         }

         if (this.field_7498 == null && this.field_7515 == null) {
            this.field_7498 = this.method_6394();
         }

         if (this.field_7515 == null && this.field_7498 == null) {
            Config.method_14317("No matchBlocks or matchTiles specified: " + var1);
            return false;
         } else if (this.field_7559 != null) {
            Config.method_14317("Metadata is not supported: " + Config.method_14287(this.field_7559));
            return false;
         } else if (this.field_7551 == 0) {
            Config.method_14317("No method: " + var1);
            return false;
         } else if (this.field_7542 != null && this.field_7542.length > 0) {
            if (this.field_7509 == 0) {
               this.field_7509 = this.method_6385();
            }

            if (this.field_7509 == 128) {
               Config.method_14317("Invalid connect in: " + var1);
               return false;
            } else if (this.field_7533 > 0) {
               Config.method_14317("Render pass not supported: " + this.field_7533);
               return false;
            } else if ((this.field_7530 & 128) != 0) {
               Config.method_14317("Invalid faces in: " + var1);
               return false;
            } else if ((this.field_7516 & 128) != 0) {
               Config.method_14317("Invalid symmetry in: " + var1);
               return false;
            } else {
               switch (this.field_7551) {
                  case 1:
                     return this.method_6393(var1);
                  case 2:
                     return this.method_6390(var1);
                  case 3:
                     return this.method_6380(var1);
                  case 4:
                     return this.method_6389(var1);
                  case 5:
                     return this.method_6410(var1);
                  case 6:
                     return this.method_6382(var1);
                  case 7:
                     return this.method_6409(var1);
                  case 8:
                     return this.method_6391(var1);
                  case 9:
                     return this.method_6400(var1);
                  case 10:
                     return this.method_6392(var1);
                  case 11:
                     return this.method_6407(var1);
                  case 12:
                     return this.method_6376(var1);
                  case 13:
                     return this.method_6406(var1);
                  case 14:
                     return this.method_6408(var1);
                  case 15:
                     return this.method_6397(var1);
                  default:
                     Config.method_14317("Unknown method: " + var1);
                     return false;
               }
            }
         } else {
            Config.method_14317("No tiles specified: " + var1);
            return false;
         }
      }
   }

   private int method_6385() {
      if (this.field_7515 == null) {
         return this.field_7498 == null ? 128 : 2;
      } else {
         return 1;
      }
   }

   private class_9491[] method_6384() {
      int[] var3 = this.method_6378();
      if (var3 == null) {
         return null;
      } else {
         class_9491[] var4 = new class_9491[var3.length];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = new class_9491(var3[var5]);
         }

         return var4;
      }
   }

   private int[] method_6378() {
      String var3 = "block_";
      if (this.field_7563.startsWith(var3)) {
         String var4 = this.field_7563.substring(var3.length());
         Identifier var5 = new Identifier(var4);
         class_6414 var6 = class_9451.method_43712(var5);
         if (var6 != null) {
            int var7 = class_9451.method_43710(var6);
            return new int[]{var7};
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private String[] method_6394() {
      class_5155 var3 = method_6373(this.field_7563);
      return var3 != null ? new String[]{this.field_7563} : null;
   }

   private static class_5155 method_6373(String var0) {
      class_8359 var3 = Config.method_14295();
      class_5155 var4 = var3.method_38509(var0);
      return var4 == null ? var3.method_38509("block/" + var0) : var4;
   }

   private boolean method_6393(String var1) {
      if (this.field_7542 == null) {
         this.field_7542 = this.method_6401("0-11 16-27 32-43 48-58");
      }

      if (this.field_7542.length >= 47) {
         return true;
      } else {
         Config.method_14317("Invalid tiles, must be at least 47: " + var1);
         return false;
      }
   }

   private boolean method_6392(String var1) {
      if (this.field_7542 == null) {
         this.field_7542 = this.method_6401("0-4");
      }

      if (this.field_7542.length >= 5) {
         return true;
      } else {
         Config.method_14317("Invalid tiles, must be at least 5: " + var1);
         return false;
      }
   }

   private boolean method_6407(String var1) {
      if (this.field_7542 == null) {
         this.field_7542 = this.method_6401("0-16");
      }

      if (this.field_7542.length >= 17) {
         if (this.field_7502 != null && this.field_7502 != class_6727.field_34745) {
            return true;
         } else {
            Config.method_14317("Invalid overlay layer: " + this.field_7502);
            return false;
         }
      } else {
         Config.method_14317("Invalid tiles, must be at least 17: " + var1);
         return false;
      }
   }

   private boolean method_6376(String var1) {
      if (this.method_6409(var1)) {
         if (this.field_7502 != null && this.field_7502 != class_6727.field_34745) {
            return true;
         } else {
            Config.method_14317("Invalid overlay layer: " + this.field_7502);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method_6406(String var1) {
      if (this.method_6389(var1)) {
         if (this.field_7502 != null && this.field_7502 != class_6727.field_34745) {
            return true;
         } else {
            Config.method_14317("Invalid overlay layer: " + this.field_7502);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method_6408(String var1) {
      if (this.method_6410(var1)) {
         if (this.field_7502 != null && this.field_7502 != class_6727.field_34745) {
            return true;
         } else {
            Config.method_14317("Invalid overlay layer: " + this.field_7502);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method_6397(String var1) {
      if (this.method_6393(var1)) {
         if (this.field_7502 != null && this.field_7502 != class_6727.field_34745) {
            return true;
         } else {
            Config.method_14317("Invalid overlay layer: " + this.field_7502);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method_6390(String var1) {
      if (this.field_7542 == null) {
         this.field_7542 = this.method_6401("12-15");
      }

      if (this.field_7542.length == 4) {
         return true;
      } else {
         Config.method_14317("Invalid tiles, must be exactly 4: " + var1);
         return false;
      }
   }

   private boolean method_6382(String var1) {
      if (this.field_7542 != null) {
         if (this.field_7542.length == 4) {
            return true;
         } else {
            Config.method_14317("Invalid tiles, must be exactly 4: " + var1);
            return false;
         }
      } else {
         Config.method_14317("No tiles defined for vertical: " + var1);
         return false;
      }
   }

   private boolean method_6391(String var1) {
      if (this.field_7542 != null) {
         if (this.field_7542.length == 7) {
            return true;
         } else {
            Config.method_14317("Invalid tiles, must be exactly 7: " + var1);
            return false;
         }
      } else {
         Config.method_14317("No tiles defined for horizontal+vertical: " + var1);
         return false;
      }
   }

   private boolean method_6400(String var1) {
      if (this.field_7542 != null) {
         if (this.field_7542.length == 7) {
            return true;
         } else {
            Config.method_14317("Invalid tiles, must be exactly 7: " + var1);
            return false;
         }
      } else {
         Config.method_14317("No tiles defined for vertical+horizontal: " + var1);
         return false;
      }
   }

   private boolean method_6389(String var1) {
      if (this.field_7542 != null && this.field_7542.length > 0) {
         if (this.field_7522 != null) {
            if (this.field_7522.length > this.field_7542.length) {
               Config.method_14317("More weights defined than tiles, trimming weights: " + var1);
               int[] var4 = new int[this.field_7542.length];
               System.arraycopy(this.field_7522, 0, var4, 0, var4.length);
               this.field_7522 = var4;
            }

            if (this.field_7522.length < this.field_7542.length) {
               Config.method_14317("Less weights defined than tiles, expanding weights: " + var1);
               int[] var7 = new int[this.field_7542.length];
               System.arraycopy(this.field_7522, 0, var7, 0, this.field_7522.length);
               int var5 = MathUtils.method_7797(this.field_7522);

               for (int var6 = this.field_7522.length; var6 < var7.length; var6++) {
                  var7[var6] = var5;
               }

               this.field_7522 = var7;
            }

            this.field_7508 = new int[this.field_7522.length];
            int var8 = 0;

            for (int var9 = 0; var9 < this.field_7522.length; var9++) {
               var8 += this.field_7522[var9];
               this.field_7508[var9] = var8;
            }

            this.field_7547 = var8;
            if (this.field_7547 <= 0) {
               Config.method_14317("Invalid sum of all weights: " + var8);
               this.field_7547 = 1;
            }
         }

         if (this.field_7538 >= 0 && this.field_7538 <= 9) {
            return true;
         } else {
            Config.method_14317("Invalid randomLoops: " + this.field_7538);
            return false;
         }
      } else {
         Config.method_14317("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean method_6410(String var1) {
      if (this.field_7542 != null) {
         if (this.field_7520 > 0) {
            if (this.field_7506 > 0) {
               if (this.field_7542.length == this.field_7520 * this.field_7506) {
                  return true;
               } else {
                  Config.method_14317("Number of tiles does not equal width x height: " + var1);
                  return false;
               }
            } else {
               Config.method_14317("Invalid height: " + var1);
               return false;
            }
         } else {
            Config.method_14317("Invalid width: " + var1);
            return false;
         }
      } else {
         Config.method_14317("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean method_6409(String var1) {
      if (this.field_7542 != null) {
         if (this.field_7542.length == 1) {
            return true;
         } else {
            Config.method_14317("Number of tiles should be 1 for method: fixed.");
            return false;
         }
      } else {
         Config.method_14317("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean method_6380(String var1) {
      if (this.field_7542 == null) {
         this.field_7542 = this.method_6401("66");
      }

      if (this.field_7542.length == 1) {
         return true;
      } else {
         Config.method_14317("Invalid tiles, must be exactly 1: " + var1);
         return false;
      }
   }

   public void method_6403(class_8359 var1) {
      if (this.field_7498 != null) {
         this.field_7512 = method_6402(this.field_7498, var1, false, false);
      }

      if (this.field_7514 != null) {
         this.field_7532 = method_6402(this.field_7514, var1, false, false);
      }

      if (this.field_7542 != null) {
         this.field_7503 = method_6402(this.field_7542, var1, true, !method_6381(this.field_7551));
      }
   }

   public void method_6374(class_8359 var1) {
      this.method_6375(this.field_7512, var1);
      this.method_6375(this.field_7532, var1);
      this.method_6375(this.field_7503, var1);
   }

   private void method_6375(class_5155[] var1, class_8359 var2) {
      if (var1 != null) {
         for (int var5 = 0; var5 < var1.length; var5++) {
            class_5155 var6 = var1[var5];
            if (var6 != null) {
               Identifier var7 = var6.method_23644();
               class_5155 var8 = var2.method_38528(var7);
               if (var8 == null || var8 instanceof class_2008) {
                  Config.method_14317("Missing CTM sprite: " + var7 + ", properties: " + this.field_7541);
               }

               var1[var5] = var8;
            }
         }
      }
   }

   private static boolean method_6381(int var0) {
      switch (var0) {
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
            return true;
         default:
            return false;
      }
   }

   private static class_5155[] method_6402(String[] var0, class_8359 var1, boolean var2, boolean var3) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList var6 = new ArrayList();

         for (int var7 = 0; var7 < var0.length; var7++) {
            String var8 = var0[var7];
            Identifier var9 = new Identifier(var8);
            String var10 = var9.method_21461();
            String var11 = var9.method_21456();
            if (!var11.contains("/")) {
               var11 = "textures/block/" + var11;
            }

            String var12 = var11 + ".png";
            if (var2 && var12.endsWith("<skip>.png")) {
               var6.add(null);
            } else if (var3 && var12.endsWith("<default>.png")) {
               var6.add(class_9049.field_46340);
            } else {
               Identifier var13 = new Identifier(var10, var12);
               boolean var14 = Config.method_14362(var13);
               if (!var14) {
                  Config.method_14317("File not found: " + var12);
               }

               String var15 = "textures/";
               String var16 = var11;
               if (var11.startsWith(var15)) {
                  var16 = var11.substring(var15.length());
               }

               Identifier var17 = new Identifier(var10, var16);
               class_5155 var18 = var1.method_38515(var17);
               var6.add(var18);
            }
         }

         return var6.<class_5155>toArray(new class_5155[var6.size()]);
      }
   }

   public boolean method_6398(int var1) {
      return class_2164.method_10063(var1, this.field_7515);
   }

   public boolean method_6386(int var1, int var2) {
      return class_2164.method_10065(var1, var2, this.field_7515);
   }

   public boolean method_6377(class_5155 var1) {
      return class_2164.method_10060(var1, this.field_7512);
   }

   @Override
   public String toString() {
      return "CTM name: "
         + this.field_7563
         + ", basePath: "
         + this.field_7541
         + ", matchBlocks: "
         + Config.method_14289(this.field_7515)
         + ", matchTiles: "
         + Config.method_14289(this.field_7498);
   }

   public boolean method_6383(class_6325 var1) {
      return class_2164.method_10062(var1, this.field_7525);
   }

   private static int method_6395(int[] var0, int var1) {
      if (var0 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            int var5 = var0[var4];
            if (var5 > var1) {
               var1 = var5;
            }
         }

         return var1;
      } else {
         return var1;
      }
   }
}
