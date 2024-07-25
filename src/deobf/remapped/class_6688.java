package remapped;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_6688 {
   private static final String[] field_34557 = new String[]{
      "undefined",
      "blues",
      "classic rock",
      "country",
      "dance",
      "disco",
      "funk",
      "grunge",
      "hip hop",
      "jazz",
      "metal",
      "new age",
      "oldies",
      "other",
      "pop",
      "r and b",
      "rap",
      "reggae",
      "rock",
      "techno",
      "industrial",
      "alternative",
      "ska",
      "death metal",
      "pranks",
      "soundtrack",
      "euro techno",
      "ambient",
      "trip hop",
      "vocal",
      "jazz funk",
      "fusion",
      "trance",
      "classical",
      "instrumental",
      "acid",
      "house",
      "game",
      "sound clip",
      "gospel",
      "noise",
      "alternrock",
      "bass",
      "soul",
      "punk",
      "space",
      "meditative",
      "instrumental pop",
      "instrumental rock",
      "ethnic",
      "gothic",
      "darkwave",
      "techno industrial",
      "electronic",
      "pop folk",
      "eurodance",
      "dream",
      "southern rock",
      "comedy",
      "cult",
      "gangsta",
      "top ",
      "christian rap",
      "pop funk",
      "jungle",
      "native american",
      "cabaret",
      "new wave",
      "psychedelic",
      "rave",
      "showtunes",
      "trailer",
      "lo fi",
      "tribal",
      "acid punk",
      "acid jazz",
      "polka",
      "retro",
      "musical",
      "rock and roll",
      "hard rock",
      "folk",
      "folk rock",
      "national folk",
      "swing",
      "fast fusion",
      "bebob",
      "latin",
      "revival",
      "celtic",
      "bluegrass",
      "avantgarde",
      "gothic rock",
      "progressive rock",
      "psychedelic rock",
      "symphonic rock",
      "slow rock",
      "big band",
      "chorus",
      "easy listening",
      "acoustic",
      "humour",
      "speech",
      "chanson",
      "opera",
      "chamber music",
      "sonata",
      "symphony",
      "booty bass",
      "primus",
      "porn groove",
      "satire",
      "slow jam",
      "club",
      "tango",
      "samba",
      "folklore",
      "ballad",
      "power ballad",
      "rhythmic soul",
      "freestyle",
      "duet",
      "punk rock",
      "drum solo",
      "a capella",
      "euro house",
      "dance hall"
   };
   private static final String[] field_34554 = new String[]{
      "artist",
      "title",
      "album",
      "track",
      "totaltracks",
      "year",
      "genre",
      "disc",
      "totaldiscs",
      "url",
      "copyright",
      "comment",
      "lyrics",
      "credits",
      "rating",
      "label",
      "composer",
      "isrc",
      "mood",
      "tempo"
   };
   private Map<class_3553<?>, Object> field_34556 = new HashMap<class_3553<?>, Object>();

   public void method_30672(class_7641 var1, class_7641 var2) {
      if (var2.method_34608(1668313716L)) {
         class_5460 var5 = (class_5460)var2.method_34607(1668313716L);
         this.method_30671(class_3553.field_17377, new Locale(var5.method_24851()));
         this.method_30671(class_3553.field_17398, var5.method_24852());
      }

      if (var1 != null) {
         this.method_30667(var1);
      }

      if (var2.method_34608(1768174386L)) {
         this.method_30668((class_5267)var2.method_34607(1768174386L));
      }

      if (var2.method_34608(1768715124L)) {
         this.method_30669(var2.method_34607(1768715124L));
      }

      if (var2.method_34608(1952540531L)) {
         this.method_30663((class_5889)var2.method_34607(1952540531L));
      }
   }

   private void method_30667(class_7641 var1) {
      if (var1.method_34608(1634493037L)) {
         class_8030 var4 = (class_8030)var1.method_34607(1634493037L);
         this.method_30671(class_3553.field_17389, var4.method_25142());
         this.method_30671(class_3553.field_17421, var4.method_36462());
      }

      if (var1.method_34608(1685283696L)) {
         this.method_30671(class_3553.field_17407, ((class_5535)var1.method_34607(1685283696L)).method_25142());
      }

      if (var1.method_34608(1803122532L)) {
         this.method_30671(class_3553.field_17412, ((class_5535)var1.method_34607(1803122532L)).method_25142());
      }

      if (var1.method_34608(1819239273L)) {
         this.method_30671(class_3553.field_17391, ((class_9673)var1.method_34607(1819239273L)).method_44735());
      }

      if (var1.method_34608(1885696614L)) {
         this.method_30671(class_3553.field_17386, ((class_5535)var1.method_34607(1885696614L)).method_25142());
      }

      if (var1.method_34608(2037543523L)) {
         String var7 = ((class_5535)var1.method_34607(2037543523L)).method_25142();

         try {
            this.method_30671(class_3553.field_17419, new Date((long)Integer.parseInt(var7)));
         } catch (NumberFormatException var6) {
            Logger.getLogger("MP4 API").log(Level.INFO, "unable to parse 3GPP metadata: recording year value: {0}", var7);
         }
      }

      if (var1.method_34608(1953068140L)) {
         this.method_30671(class_3553.field_17420, ((class_5535)var1.method_34607(1953068140L)).method_25142());
      }
   }

   private void method_30669(class_7641 var1) {
      for (class_7641 var6 : var1.method_34611()) {
         long var7 = var6.method_34615();
         class_400 var9 = (class_400)var6.method_34607(1684108385L);
         if (var7 != 2839630420L) {
            if (var7 != 2842583405L) {
               if (var7 != 1631670868L) {
                  if (var7 != 2841734242L) {
                     if (var7 != 1953655662L) {
                        if (var7 != 1684632427L) {
                           if (var7 != 2843177588L) {
                              if (var7 != 2841865588L) {
                                 if (var7 != 1953329263L) {
                                    if (var7 != 2841928057L) {
                                       if (var7 == 1735291493L || var7 == 2842125678L) {
                                          String var12 = null;
                                          if (var9.method_2002() != class_8215.field_42038) {
                                             int var14 = var9.method_1999();
                                             if (var14 > 0 && var14 < field_34557.length) {
                                                var12 = field_34557[var9.method_1999()];
                                             }
                                          } else {
                                             var12 = var9.method_1996();
                                          }

                                          if (var12 != null) {
                                             this.method_30671(class_3553.field_17384, var12);
                                          }
                                       } else if (var7 != 2841996899L) {
                                          if (var7 != 2842980207L) {
                                             if (var7 != 1668313716L) {
                                                if (var7 != 1668311404L) {
                                                   if (var7 != 1668249202L) {
                                                      if (var7 != 2842129008L) {
                                                         if (var7 != 2842458482L) {
                                                            if (var7 != 1920233063L) {
                                                               if (var7 != 1885565812L) {
                                                                  if (var7 != 1886745196L) {
                                                                     if (var7 != 1667331175L) {
                                                                        if (var7 != 1801812343L) {
                                                                           if (var7 != 1684370275L) {
                                                                              if (var7 != 1818518899L) {
                                                                                 if (var7 != 1953919848L) {
                                                                                    if (var7 != 1953918574L) {
                                                                                       if (var7 != 1953916275L) {
                                                                                          if (var7 != 1953916270L) {
                                                                                             if (var7 != 1953919854L) {
                                                                                                if (var7 != 1886745188L) {
                                                                                                   if (var7 != 1885823344L) {
                                                                                                      if (var7 != 1751414372L) {
                                                                                                         if (var7 != 1936679282L) {
                                                                                                            if (var7 != 1936682605L) {
                                                                                                               if (var7 == 1936679276L) {
                                                                                                                  this.method_30671(
                                                                                                                     class_3553.field_17390, var9.method_1996()
                                                                                                                  );
                                                                                                               }
                                                                                                            } else {
                                                                                                               this.method_30671(
                                                                                                                  class_3553.field_17383, var9.method_1996()
                                                                                                               );
                                                                                                            }
                                                                                                         } else {
                                                                                                            this.method_30671(
                                                                                                               class_3553.field_17409, var9.method_1996()
                                                                                                            );
                                                                                                         }
                                                                                                      } else {
                                                                                                         this.method_30671(
                                                                                                            class_3553.field_17406, var9.method_1998()
                                                                                                         );
                                                                                                      }
                                                                                                   } else {
                                                                                                      this.method_30671(
                                                                                                         class_3553.field_17418, var9.method_1996()
                                                                                                      );
                                                                                                   }
                                                                                                } else {
                                                                                                   this.method_30671(class_3553.field_17411, var9.method_1996());
                                                                                                }
                                                                                             } else {
                                                                                                this.method_30671(class_3553.field_17385, var9.method_1999());
                                                                                             }
                                                                                          } else {
                                                                                             this.method_30671(class_3553.field_17379, var9.method_1999());
                                                                                          }
                                                                                       } else {
                                                                                          this.method_30671(class_3553.field_17413, var9.method_1996());
                                                                                       }
                                                                                    } else {
                                                                                       this.method_30671(class_3553.field_17400, var9.method_1996());
                                                                                    }
                                                                                 } else {
                                                                                    this.method_30671(class_3553.field_17395, var9.method_1996());
                                                                                 }
                                                                              } else {
                                                                                 this.method_30671(class_3553.field_17407, var9.method_1996());
                                                                              }
                                                                           } else {
                                                                              this.method_30671(class_3553.field_17407, var9.method_1996());
                                                                           }
                                                                        } else {
                                                                           this.method_30671(class_3553.field_17412, var9.method_1996());
                                                                        }
                                                                     } else {
                                                                        this.method_30671(class_3553.field_17396, var9.method_1996());
                                                                     }
                                                                  } else {
                                                                     this.method_30671(class_3553.field_17408, var9.method_1996());
                                                                  }
                                                               } else {
                                                                  this.method_30671(class_3553.field_17402, var9.method_1999());
                                                               }
                                                            } else {
                                                               this.method_30671(class_3553.field_17416, var9.method_1999());
                                                            }
                                                         } else {
                                                            this.method_30671(class_3553.field_17414, var9.method_1996());
                                                         }
                                                      } else {
                                                         this.method_30671(class_3553.field_17401, var9.method_1996());
                                                      }
                                                   } else {
                                                      class_7241 var10 = new class_7241(class_5918.method_27075(var9.method_2002()), var9.method_1997());
                                                      if (!this.field_34556.containsKey(class_3553.field_17415)) {
                                                         ArrayList var11 = new ArrayList();
                                                         var11.add(var10);
                                                         this.method_30671(class_3553.field_17415, var11);
                                                      } else {
                                                         this.<List<class_7241>>method_30665(class_3553.field_17415).add(var10);
                                                      }
                                                   }
                                                } else {
                                                   this.method_30671(class_3553.field_17382, var9.method_1998());
                                                }
                                             } else {
                                                this.method_30671(class_3553.field_17398, var9.method_1996());
                                             }
                                          } else {
                                             this.method_30671(class_3553.field_17387, var9.method_1996());
                                          }
                                       } else {
                                          this.method_30671(class_3553.field_17417, var9.method_1996());
                                       }
                                    } else {
                                       this.method_30671(class_3553.field_17419, var9.method_2001());
                                    }
                                 } else {
                                    this.method_30671(class_3553.field_17376, var9.method_1999());
                                 }
                              } else {
                                 this.method_30671(class_3553.field_17405, var9.method_1996());
                              }
                           } else {
                              this.method_30671(class_3553.field_17404, var9.method_1996());
                           }
                        } else {
                           this.method_30671(class_3553.field_17393, var9.method_1999());
                        }
                     } else {
                        byte[] var13 = var9.method_1997();
                        this.method_30671(class_3553.field_17421, new Integer(var13[3]));
                        this.method_30671(class_3553.field_17394, new Integer(var13[5]));
                     }
                  } else {
                     this.method_30671(class_3553.field_17389, var9.method_1996());
                  }
               } else {
                  this.method_30671(class_3553.field_17388, var9.method_1996());
               }
            } else {
               this.method_30671(class_3553.field_17420, var9.method_1996());
            }
         } else {
            this.method_30671(class_3553.field_17386, var9.method_1996());
         }
      }
   }

   private void method_30668(class_5267 var1) {
      try {
         DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var1.method_24032()));
         class_7575 var5 = new class_7575(var4);

         for (class_371 var7 : var5.method_34433()) {
            switch (var7.method_1831()) {
               case 1413565506:
                  this.method_30671(class_3553.field_17389, var7.method_1819());
                  break;
               case 1413632077:
                  this.method_30671(class_3553.field_17376, var7.method_1825());
                  break;
               case 1413697357:
                  this.method_30671(class_3553.field_17404, var7.method_1819());
                  break;
               case 1413697360:
                  this.method_30671(class_3553.field_17398, var7.method_1819());
                  break;
               case 1413760334:
                  this.method_30671(class_3553.field_17410, var7.method_1821());
                  break;
               case 1413763660:
                  this.method_30671(class_3553.field_17419, var7.method_1821());
                  break;
               case 1414091826:
                  this.method_30671(class_3553.field_17420, var7.method_1819());
                  break;
               case 1414283598:
                  this.method_30671(class_3553.field_17377, var7.method_1829());
                  break;
               case 1414284622:
                  this.method_30671(class_3553.field_17380, var7.method_1825());
                  break;
               case 1414546737:
                  this.method_30671(class_3553.field_17386, var7.method_1819());
                  break;
               case 1414550850:
                  this.method_30671(class_3553.field_17397, var7.method_1819());
                  break;
               case 1414677323:
                  int[] var8 = var7.method_1830();
                  this.method_30671(class_3553.field_17421, var8[0]);
                  if (var8.length > 1) {
                     this.method_30671(class_3553.field_17394, var8[1]);
                  }
                  break;
               case 1414681422:
                  this.method_30671(class_3553.field_17378, var7.method_1819());
                  break;
               case 1414745921:
                  this.method_30671(class_3553.field_17390, var7.method_1819());
                  break;
               case 1414745936:
                  this.method_30671(class_3553.field_17409, var7.method_1819());
                  break;
               case 1414745940:
                  this.method_30671(class_3553.field_17383, var7.method_1819());
                  break;
               case 1414746949:
                  this.method_30671(class_3553.field_17387, var7.method_1819());
            }
         }
      } catch (IOException var9) {
         Logger.getLogger("MP4 API").log(Level.SEVERE, "Exception in MetaData.parseID3: {0}", var9.toString());
      }
   }

   private void method_30663(class_5889 var1) {
      Map var4 = var1.method_26947();

      for (String var6 : var4.keySet()) {
         String var7 = (String)var4.get(var6);

         try {
            if (var6.equals(field_34554[0])) {
               this.method_30671(class_3553.field_17386, var7);
            }

            if (var6.equals(field_34554[1])) {
               this.method_30671(class_3553.field_17420, var7);
            }

            if (var6.equals(field_34554[2])) {
               this.method_30671(class_3553.field_17389, var7);
            }

            if (var6.equals(field_34554[3])) {
               this.method_30671(class_3553.field_17421, Integer.parseInt(var7));
            }

            if (var6.equals(field_34554[4])) {
               this.method_30671(class_3553.field_17394, Integer.parseInt(var7));
            }

            if (var6.equals(field_34554[5])) {
               Calendar var8 = Calendar.getInstance();
               var8.set(1, Integer.parseInt(var7));
               this.method_30671(class_3553.field_17419, var8.getTime());
            }

            if (var6.equals(field_34554[6])) {
               this.method_30671(class_3553.field_17384, var7);
            }

            if (var6.equals(field_34554[7])) {
               this.method_30671(class_3553.field_17393, Integer.parseInt(var7));
            }

            if (var6.equals(field_34554[8])) {
               this.method_30671(class_3553.field_17381, Integer.parseInt(var7));
            }

            if (var6.equals(field_34554[9])) {
            }

            if (var6.equals(field_34554[10])) {
               this.method_30671(class_3553.field_17398, var7);
            }

            if (var6.equals(field_34554[11])) {
               this.method_30671(class_3553.field_17405, var7);
            }

            if (var6.equals(field_34554[12])) {
               this.method_30671(class_3553.field_17414, var7);
            }

            if (var6.equals(field_34554[13])) {
            }

            if (var6.equals(field_34554[14])) {
               this.method_30671(class_3553.field_17416, Integer.parseInt(var7));
            }

            if (var6.equals(field_34554[15])) {
               this.method_30671(class_3553.field_17397, var7);
            }

            if (var6.equals(field_34554[16])) {
               this.method_30671(class_3553.field_17404, var7);
            }

            if (var6.equals(field_34554[17])) {
            }

            if (var6.equals(field_34554[18])) {
            }

            if (var6.equals(field_34554[19])) {
               this.method_30671(class_3553.field_17376, Integer.parseInt(var7));
            }
         } catch (NumberFormatException var9) {
            Logger.getLogger("MP4 API").log(Level.SEVERE, "Exception in MetaData.parseNeroTags: {0}", var9.toString());
         }
      }
   }

   private <T> void method_30671(class_3553<T> var1, T var2) {
      this.field_34556.put(var1, var2);
   }

   public boolean method_30664() {
      return !this.field_34556.isEmpty();
   }

   public <T> T method_30665(class_3553<T> var1) {
      return (T)this.field_34556.get(var1);
   }

   public Map<class_3553<?>, Object> method_30666() {
      return Collections.<class_3553<?>, Object>unmodifiableMap(this.field_34556);
   }
}
