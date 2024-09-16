package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

public class Class7104 {
   public String field30549 = null;
   public String field30550 = null;
   public Class9727[] field30551 = null;
   public int[] field30552 = null;
   public String[] field30553 = null;
   public int field30554 = 0;
   public String[] field30555 = null;
   public int field30556 = 0;
   public int field30557 = 63;
   public Class8507[] field30558 = null;
   public Class9532 field30559 = null;
   public int field30560 = 0;
   public boolean field30561 = false;
   public int[] field30562 = null;
   public int field30563 = 0;
   public int field30564 = 0;
   public int[] field30565 = null;
   public int field30566 = 0;
   public int field30567 = 1;
   public boolean field30568 = false;
   public Class7305 field30569 = null;
   public int[] field30570 = null;
   public int field30571 = 1;
   public TextureAtlasSprite[] field30572 = null;
   public TextureAtlasSprite[] field30573 = null;
   public Class9727[] field30574 = null;
   public String[] field30575 = null;
   public TextureAtlasSprite[] field30576 = null;
   public int field30577 = -1;
   public BlockState field30578 = Blocks.AIR.method11579();
   public RenderType field30579 = null;
   public static final int field30580 = 0;
   public static final int field30581 = 1;
   public static final int field30582 = 2;
   public static final int field30583 = 3;
   public static final int field30584 = 4;
   public static final int field30585 = 5;
   public static final int field30586 = 6;
   public static final int field30587 = 7;
   public static final int field30588 = 8;
   public static final int field30589 = 9;
   public static final int field30590 = 10;
   public static final int field30591 = 11;
   public static final int field30592 = 12;
   public static final int field30593 = 13;
   public static final int field30594 = 14;
   public static final int field30595 = 15;
   public static final int field30596 = 0;
   public static final int field30597 = 1;
   public static final int field30598 = 2;
   public static final int field30599 = 3;
   public static final int field30600 = 4;
   public static final int field30601 = 128;
   public static final int field30602 = 1;
   public static final int field30603 = 2;
   public static final int field30604 = 4;
   public static final int field30605 = 8;
   public static final int field30606 = 16;
   public static final int field30607 = 32;
   public static final int field30608 = 60;
   public static final int field30609 = 63;
   public static final int field30610 = 128;
   public static final int field30611 = 1;
   public static final int field30612 = 2;
   public static final int field30613 = 6;
   public static final int field30614 = 128;
   public static final String field30615 = "<skip>.png";
   public static final String field30616 = "<default>.png";

   public Class7104(Properties var1, String var2) {
      Class8896 var5 = new Class8896("ConnectedTextures");
      this.field30549 = var5.method32382(var2);
      this.field30550 = var5.method32383(var2);
      this.field30551 = var5.method32384(var1.getProperty("matchBlocks"));
      this.field30552 = var5.method32399(var1.getProperty("metadata"));
      this.field30553 = this.method22091(var1.getProperty("matchTiles"));
      this.field30554 = method22100(var1.getProperty("method"));
      this.field30555 = this.method22094(var1.getProperty("tiles"));
      this.field30556 = method22098(var1.getProperty("connect"));
      this.field30557 = method22096(var1.getProperty("faces"));
      this.field30558 = var5.method32396(var1.getProperty("biomes"));
      this.field30559 = var5.method32404(var1.getProperty("heights"));
      if (this.field30559 == null) {
         int var6 = var5.method32398(var1.getProperty("minHeight"), -1);
         int var7 = var5.method32398(var1.getProperty("maxHeight"), 1024);
         if (var6 != -1 || var7 != 1024) {
            this.field30559 = new Class9532(new Class7589(var6, var7));
         }
      }

      this.field30560 = var5.method32398(var1.getProperty("renderPass"), -1);
      this.field30561 = var5.method32406(var1.getProperty("innerSeams"), false);
      this.field30562 = this.method22090(var1);
      this.field30563 = var5.method32398(var1.getProperty("width"), -1);
      this.field30564 = var5.method32398(var1.getProperty("height"), -1);
      this.field30565 = var5.method32399(var1.getProperty("weights"));
      this.field30566 = var5.method32398(var1.getProperty("randomLoops"), 0);
      this.field30567 = method22095(var1.getProperty("symmetry"));
      this.field30568 = var5.method32406(var1.getProperty("linked"), false);
      this.field30569 = var5.method32417("name", var1.getProperty("name"));
      this.field30574 = var5.method32384(var1.getProperty("connectBlocks"));
      this.field30575 = this.method22091(var1.getProperty("connectTiles"));
      this.field30577 = var5.method32398(var1.getProperty("tintIndex"), -1);
      this.field30578 = var5.method32385(var1.getProperty("tintBlock"), Blocks.AIR.method11579());
      this.field30579 = var5.method32410(var1.getProperty("layer"), Class9025.field41289);
   }

   private int[] method22090(Properties var1) {
      if (this.field30555 == null) {
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
                     int var11 = Class7944.method26899(var9, -1);
                     if (var11 >= 0 && var11 <= 46) {
                        int var12 = Class7944.method26899(var10, -1);
                        if (var12 >= 0 && var12 < this.field30555.length) {
                           var4.put(var11, var12);
                        } else {
                           Class7944.method26811("Invalid CTM tile index: " + var10);
                        }
                     } else {
                        Class7944.method26811("Invalid CTM index: " + var9);
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

   private String[] method22091(String var1) {
      if (var1 != null) {
         String[] var4 = Class7944.method26903(var1, " ");

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            if (var6.endsWith(".png")) {
               var6 = var6.substring(0, var6.length() - 4);
            }

            var6 = Class8684.method31274(var6, this.field30550);
            var4[var5] = var6;
         }

         return var4;
      } else {
         return null;
      }
   }

   private static String method22092(String var0) {
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

   private static String method22093(String var0) {
      int var3 = var0.lastIndexOf(47);
      return var3 >= 0 ? var0.substring(0, var3) : "";
   }

   private String[] method22094(String var1) {
      if (var1 == null) {
         return null;
      } else {
         ArrayList<String> var4 = new ArrayList();
         String[] var5 = Class7944.method26903(var1, " ,");

         for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.contains("-")) {
               String[] var8 = Class7944.method26903(var7, "-");
               if (var8.length == 2) {
                  int var9 = Class7944.method26899(var8[0], -1);
                  int var10 = Class7944.method26899(var8[1], -1);
                  if (var9 >= 0 && var10 >= 0) {
                     if (var9 <= var10) {
                        for (int var11 = var9; var11 <= var10; var11++) {
                           var4.add(String.valueOf(var11));
                        }
                        continue;
                     }

                     Class7944.method26811("Invalid interval: " + var7 + ", when parsing: " + var1);
                     continue;
                  }
               }
            }

            var4.add(var7);
         }

         String[] var12 = var4.toArray(new String[var4.size()]);

         for (int var13 = 0; var13 < var12.length; var13++) {
            String var14 = var12[var13];
            var14 = Class8684.method31274(var14, this.field30550);
            if (!var14.startsWith(this.field30550) && !var14.startsWith("textures/") && !var14.startsWith("optifine/")) {
               var14 = this.field30550 + "/" + var14;
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

   private static int method22095(String var0) {
      if (var0 != null) {
         var0 = var0.trim();
         if (!var0.equals("opposite")) {
            if (!var0.equals("all")) {
               Class7944.method26811("Unknown symmetry: " + var0);
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

   private static int method22096(String var0) {
      if (var0 == null) {
         return 63;
      } else {
         String[] var3 = Class7944.method26903(var0, " ,");
         int var4 = 0;

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            int var7 = method22097(var6);
            var4 |= var7;
         }

         return var4;
      }
   }

   private static int method22097(String var0) {
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
         Class7944.method26811("Unknown face: " + var0);
         return 128;
      } else {
         return 63;
      }
   }

   private static int method22098(String var0) {
      if (var0 != null) {
         var0 = var0.trim();
         if (!var0.equals("block")) {
            if (!var0.equals("tile")) {
               if (!var0.equals("material")) {
                  if (!var0.equals("state")) {
                     Class7944.method26811("Unknown connect: " + var0);
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

   public static Class8550 method22099(String var0, Collection<Class8550> var1) {
      for (Class8550 var5 : var1) {
         if (var0.equals(var5.method30472())) {
            return var5;
         }
      }

      return null;
   }

   private static int method22100(String var0) {
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
            Class7944.method26811("Unknown method: " + var0);
            return 0;
         } else {
            return 15;
         }
      } else {
         return 1;
      }
   }

   public boolean method22101(String var1) {
      if (this.field30549 == null || this.field30549.length() <= 0) {
         Class7944.method26811("No name found: " + var1);
         return false;
      } else if (this.field30550 == null) {
         Class7944.method26811("No base path found: " + var1);
         return false;
      } else {
         if (this.field30551 == null) {
            this.field30551 = this.method22103();
         }

         if (this.field30553 == null && this.field30551 == null) {
            this.field30553 = this.method22105();
         }

         if (this.field30551 == null && this.field30553 == null) {
            Class7944.method26811("No matchBlocks or matchTiles specified: " + var1);
            return false;
         } else if (this.field30552 != null) {
            Class7944.method26811("Metadata is not supported: " + Class7944.method26856(this.field30552));
            return false;
         } else if (this.field30554 == 0) {
            Class7944.method26811("No method: " + var1);
            return false;
         } else if (this.field30555 != null && this.field30555.length > 0) {
            if (this.field30556 == 0) {
               this.field30556 = this.method22102();
            }

            if (this.field30556 == 128) {
               Class7944.method26811("Invalid connect in: " + var1);
               return false;
            } else if (this.field30560 > 0) {
               Class7944.method26811("Render pass not supported: " + this.field30560);
               return false;
            } else if ((this.field30557 & 128) != 0) {
               Class7944.method26811("Invalid faces in: " + var1);
               return false;
            } else if ((this.field30567 & 128) != 0) {
               Class7944.method26811("Invalid symmetry in: " + var1);
               return false;
            } else {
               switch (this.field30554) {
                  case 1:
                     return this.method22107(var1);
                  case 2:
                     return this.method22114(var1);
                  case 3:
                     return this.method22121(var1);
                  case 4:
                     return this.method22118(var1);
                  case 5:
                     return this.method22119(var1);
                  case 6:
                     return this.method22115(var1);
                  case 7:
                     return this.method22120(var1);
                  case 8:
                     return this.method22116(var1);
                  case 9:
                     return this.method22117(var1);
                  case 10:
                     return this.method22108(var1);
                  case 11:
                     return this.method22109(var1);
                  case 12:
                     return this.method22110(var1);
                  case 13:
                     return this.method22111(var1);
                  case 14:
                     return this.method22112(var1);
                  case 15:
                     return this.method22113(var1);
                  default:
                     Class7944.method26811("Unknown method: " + var1);
                     return false;
               }
            }
         } else {
            Class7944.method26811("No tiles specified: " + var1);
            return false;
         }
      }
   }

   private int method22102() {
      if (this.field30551 == null) {
         return this.field30553 == null ? 128 : 2;
      } else {
         return 1;
      }
   }

   private Class9727[] method22103() {
      int[] var3 = this.method22104();
      if (var3 == null) {
         return null;
      } else {
         Class9727[] var4 = new Class9727[var3.length];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = new Class9727(var3[var5]);
         }

         return var4;
      }
   }

   private int[] method22104() {
      String var3 = "block_";
      if (this.field30549.startsWith(var3)) {
         String var4 = this.field30549.substring(var3.length());
         ResourceLocation var5 = new ResourceLocation(var4);
         Block var6 = Class9716.method38066(var5);
         if (var6 != null) {
            int var7 = Class9716.method38065(var6);
            return new int[]{var7};
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private String[] method22105() {
      TextureAtlasSprite var3 = method22106(this.field30549);
      return var3 != null ? new String[]{this.field30549} : null;
   }

   private static TextureAtlasSprite method22106(String var0) {
      AtlasTexture var3 = Class7944.method26969();
      TextureAtlasSprite var4 = var3.method1104(var0);
      return var4 == null ? var3.method1104("block/" + var0) : var4;
   }

   private boolean method22107(String var1) {
      if (this.field30555 == null) {
         this.field30555 = this.method22094("0-11 16-27 32-43 48-58");
      }

      if (this.field30555.length >= 47) {
         return true;
      } else {
         Class7944.method26811("Invalid tiles, must be at least 47: " + var1);
         return false;
      }
   }

   private boolean method22108(String var1) {
      if (this.field30555 == null) {
         this.field30555 = this.method22094("0-4");
      }

      if (this.field30555.length >= 5) {
         return true;
      } else {
         Class7944.method26811("Invalid tiles, must be at least 5: " + var1);
         return false;
      }
   }

   private boolean method22109(String var1) {
      if (this.field30555 == null) {
         this.field30555 = this.method22094("0-16");
      }

      if (this.field30555.length >= 17) {
         if (this.field30579 != null && this.field30579 != Class9025.field41288) {
            return true;
         } else {
            Class7944.method26811("Invalid overlay layer: " + this.field30579);
            return false;
         }
      } else {
         Class7944.method26811("Invalid tiles, must be at least 17: " + var1);
         return false;
      }
   }

   private boolean method22110(String var1) {
      if (this.method22120(var1)) {
         if (this.field30579 != null && this.field30579 != Class9025.field41288) {
            return true;
         } else {
            Class7944.method26811("Invalid overlay layer: " + this.field30579);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method22111(String var1) {
      if (this.method22118(var1)) {
         if (this.field30579 != null && this.field30579 != Class9025.field41288) {
            return true;
         } else {
            Class7944.method26811("Invalid overlay layer: " + this.field30579);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method22112(String var1) {
      if (this.method22119(var1)) {
         if (this.field30579 != null && this.field30579 != Class9025.field41288) {
            return true;
         } else {
            Class7944.method26811("Invalid overlay layer: " + this.field30579);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method22113(String var1) {
      if (this.method22107(var1)) {
         if (this.field30579 != null && this.field30579 != Class9025.field41288) {
            return true;
         } else {
            Class7944.method26811("Invalid overlay layer: " + this.field30579);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method22114(String var1) {
      if (this.field30555 == null) {
         this.field30555 = this.method22094("12-15");
      }

      if (this.field30555.length == 4) {
         return true;
      } else {
         Class7944.method26811("Invalid tiles, must be exactly 4: " + var1);
         return false;
      }
   }

   private boolean method22115(String var1) {
      if (this.field30555 != null) {
         if (this.field30555.length == 4) {
            return true;
         } else {
            Class7944.method26811("Invalid tiles, must be exactly 4: " + var1);
            return false;
         }
      } else {
         Class7944.method26811("No tiles defined for vertical: " + var1);
         return false;
      }
   }

   private boolean method22116(String var1) {
      if (this.field30555 != null) {
         if (this.field30555.length == 7) {
            return true;
         } else {
            Class7944.method26811("Invalid tiles, must be exactly 7: " + var1);
            return false;
         }
      } else {
         Class7944.method26811("No tiles defined for horizontal+vertical: " + var1);
         return false;
      }
   }

   private boolean method22117(String var1) {
      if (this.field30555 != null) {
         if (this.field30555.length == 7) {
            return true;
         } else {
            Class7944.method26811("Invalid tiles, must be exactly 7: " + var1);
            return false;
         }
      } else {
         Class7944.method26811("No tiles defined for vertical+horizontal: " + var1);
         return false;
      }
   }

   private boolean method22118(String var1) {
      if (this.field30555 != null && this.field30555.length > 0) {
         if (this.field30565 != null) {
            if (this.field30565.length > this.field30555.length) {
               Class7944.method26811("More weights defined than tiles, trimming weights: " + var1);
               int[] var4 = new int[this.field30555.length];
               System.arraycopy(this.field30565, 0, var4, 0, var4.length);
               this.field30565 = var4;
            }

            if (this.field30565.length < this.field30555.length) {
               Class7944.method26811("Less weights defined than tiles, expanding weights: " + var1);
               int[] var7 = new int[this.field30555.length];
               System.arraycopy(this.field30565, 0, var7, 0, this.field30565.length);
               int var5 = Class7317.method23167(this.field30565);

               for (int var6 = this.field30565.length; var6 < var7.length; var6++) {
                  var7[var6] = var5;
               }

               this.field30565 = var7;
            }

            this.field30570 = new int[this.field30565.length];
            int var8 = 0;

            for (int var9 = 0; var9 < this.field30565.length; var9++) {
               var8 += this.field30565[var9];
               this.field30570[var9] = var8;
            }

            this.field30571 = var8;
            if (this.field30571 <= 0) {
               Class7944.method26811("Invalid sum of all weights: " + var8);
               this.field30571 = 1;
            }
         }

         if (this.field30566 >= 0 && this.field30566 <= 9) {
            return true;
         } else {
            Class7944.method26811("Invalid randomLoops: " + this.field30566);
            return false;
         }
      } else {
         Class7944.method26811("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean method22119(String var1) {
      if (this.field30555 != null) {
         if (this.field30563 > 0) {
            if (this.field30564 > 0) {
               if (this.field30555.length == this.field30563 * this.field30564) {
                  return true;
               } else {
                  Class7944.method26811("Number of tiles does not equal width x height: " + var1);
                  return false;
               }
            } else {
               Class7944.method26811("Invalid height: " + var1);
               return false;
            }
         } else {
            Class7944.method26811("Invalid width: " + var1);
            return false;
         }
      } else {
         Class7944.method26811("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean method22120(String var1) {
      if (this.field30555 != null) {
         if (this.field30555.length == 1) {
            return true;
         } else {
            Class7944.method26811("Number of tiles should be 1 for method: fixed.");
            return false;
         }
      } else {
         Class7944.method26811("Tiles not defined: " + var1);
         return false;
      }
   }

   private boolean method22121(String var1) {
      if (this.field30555 == null) {
         this.field30555 = this.method22094("66");
      }

      if (this.field30555.length == 1) {
         return true;
      } else {
         Class7944.method26811("Invalid tiles, must be exactly 1: " + var1);
         return false;
      }
   }

   public void method22122(AtlasTexture var1) {
      if (this.field30553 != null) {
         this.field30572 = method22126(this.field30553, var1, false, false);
      }

      if (this.field30575 != null) {
         this.field30576 = method22126(this.field30575, var1, false, false);
      }

      if (this.field30555 != null) {
         this.field30573 = method22126(this.field30555, var1, true, !method22125(this.field30554));
      }
   }

   public void method22123(AtlasTexture var1) {
      this.method22124(this.field30572, var1);
      this.method22124(this.field30576, var1);
      this.method22124(this.field30573, var1);
   }

   private void method22124(TextureAtlasSprite[] var1, AtlasTexture var2) {
      if (var1 != null) {
         for (int var5 = 0; var5 < var1.length; var5++) {
            TextureAtlasSprite var6 = var1[var5];
            if (var6 != null) {
               ResourceLocation var7 = var6.method7465();
               TextureAtlasSprite var8 = var2.getSprite(var7);
               if (var8 == null || var8 instanceof Class1714) {
                  Class7944.method26811("Missing CTM sprite: " + var7 + ", properties: " + this.field30550);
               }

               var1[var5] = var8;
            }
         }
      }
   }

   private static boolean method22125(int var0) {
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

   private static TextureAtlasSprite[] method22126(String[] var0, AtlasTexture var1, boolean var2, boolean var3) {
      if (var0 == null) {
         return null;
      } else {
         ArrayList<TextureAtlasSprite> var6 = new ArrayList();

         for (int var7 = 0; var7 < var0.length; var7++) {
            String var8 = var0[var7];
            ResourceLocation var9 = new ResourceLocation(var8);
            String var10 = var9.getNamespace();
            String var11 = var9.getPath();
            if (!var11.contains("/")) {
               var11 = "textures/block/" + var11;
            }

            String var12 = var11 + ".png";
            if (var2 && var12.endsWith("<skip>.png")) {
               var6.add(null);
            } else if (var3 && var12.endsWith("<default>.png")) {
               var6.add(Class9619.field44990);
            } else {
               ResourceLocation var13 = new ResourceLocation(var10, var12);
               boolean var14 = Class7944.method26866(var13);
               if (!var14) {
                  Class7944.method26811("File not found: " + var12);
               }

               String var15 = "textures/";
               String var16 = var11;
               if (var11.startsWith(var15)) {
                  var16 = var11.substring(var15.length());
               }

               ResourceLocation var17 = new ResourceLocation(var10, var16);
               TextureAtlasSprite var18 = var1.method1119(var17);
               var6.add(var18);
            }
         }

         return var6.toArray(new TextureAtlasSprite[var6.size()]);
      }
   }

   public boolean method22127(int var1) {
      return Class7542.method24659(var1, this.field30551);
   }

   public boolean method22128(int var1, int var2) {
      return Class7542.method24658(var1, var2, this.field30551);
   }

   public boolean method22129(TextureAtlasSprite var1) {
      return Class7542.method24661(var1, this.field30572);
   }

   @Override
   public String toString() {
      return "CTM name: "
         + this.field30549
         + ", basePath: "
         + this.field30550
         + ", matchBlocks: "
         + Class7944.method26854(this.field30551)
         + ", matchTiles: "
         + Class7944.method26854(this.field30553);
   }

   public boolean method22130(Biome var1) {
      return Class7542.method24662(var1, this.field30558);
   }

   private static int method22131(int[] var0, int var1) {
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
