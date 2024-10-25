package net.sourceforge.jaad.mp4.api;

import mapped.*;
import net.sourceforge.jaad.mp4.boxes.Box;

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

public class MetaData {
   private static final String[] field41217 = new String[]{
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
   private static final String[] field41218 = new String[]{
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
   private Map<Class8076<?>, Object> field41219 = new HashMap<Class8076<?>, Object>();

   public void method33301(Box var1, Box var2) {
      if (var2.method15437(1668313716L)) {
         Class5017 var5 = (Class5017)var2.getChild(1668313716L);
         this.method33306(Class8076.field34710, new Locale(var5.method15376()));
         this.method33306(Class8076.field34687, var5.method15377());
      }

      if (var1 != null) {
         this.method33302(var1);
      }

      if (var2.method15437(1768174386L)) {
         this.method33304((Class5079)var2.getChild(1768174386L));
      }

      if (var2.method15437(1768715124L)) {
         this.method33303(var2.getChild(1768715124L));
      }

      if (var2.method15437(1952540531L)) {
         this.method33305((Class5044)var2.getChild(1952540531L));
      }
   }

   private void method33302(Box var1) {
      if (var1.method15437(1634493037L)) {
         Class5025 var4 = (Class5025)var1.getChild(1634493037L);
         this.method33306(Class8076.field34673, var4.method15386());
         this.method33306(Class8076.field34674, var4.method15389());
      }

      if (var1.method15437(1685283696L)) {
         this.method33306(Class8076.field34700, ((Class5023)var1.getChild(1685283696L)).method15386());
      }

      if (var1.method15437(1803122532L)) {
         this.method33306(Class8076.field34698, ((Class5023)var1.getChild(1803122532L)).method15386());
      }

      if (var1.method15437(1819239273L)) {
         this.method33306(Class8076.field34692, ((Class5026)var1.getChild(1819239273L)).method15390());
      }

      if (var1.method15437(1885696614L)) {
         this.method33306(Class8076.field34670, ((Class5023)var1.getChild(1885696614L)).method15386());
      }

      if (var1.method15437(2037543523L)) {
         String var7 = ((Class5023)var1.getChild(2037543523L)).method15386();

         try {
            this.method33306(Class8076.field34682, new Date((long)Integer.parseInt(var7)));
         } catch (NumberFormatException var6) {
            Logger.getLogger("MP4 API").log(Level.INFO, "unable to parse 3GPP metadata: recording year value: {0}", var7);
         }
      }

      if (var1.method15437(1953068140L)) {
         this.method33306(Class8076.field34671, ((Class5023)var1.getChild(1953068140L)).method15386());
      }
   }

   private void method33303(Box var1) {
      for (Box var6 : var1.method15439()) {
         long var7 = var6.method15431();
         Class4982 var9 = (Class4982)var6.getChild(1684108385L);
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
                                          if (var9.method15281() != Class2086.field13582) {
                                             int var14 = var9.method15285();
                                             if (var14 > 0 && var14 < field41217.length) {
                                                var12 = field41217[var9.method15285()];
                                             }
                                          } else {
                                             var12 = var9.method15283();
                                          }

                                          if (var12 != null) {
                                             this.method33306(Class8076.field34683, var12);
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
                                                                                                                  this.method33306(
                                                                                                                     Class8076.field34713, var9.method15283()
                                                                                                                  );
                                                                                                               }
                                                                                                            } else {
                                                                                                               this.method33306(
                                                                                                                  Class8076.field34712, var9.method15283()
                                                                                                               );
                                                                                                            }
                                                                                                         } else {
                                                                                                            this.method33306(
                                                                                                               Class8076.field34711, var9.method15283()
                                                                                                            );
                                                                                                         }
                                                                                                      } else {
                                                                                                         this.method33306(
                                                                                                            Class8076.field34709, var9.method15286()
                                                                                                         );
                                                                                                      }
                                                                                                   } else {
                                                                                                      this.method33306(Class8076.field34708, var9.method15283());
                                                                                                   }
                                                                                                } else {
                                                                                                   this.method33306(Class8076.field34707, var9.method15283());
                                                                                                }
                                                                                             } else {
                                                                                                this.method33306(Class8076.field34705, var9.method15285());
                                                                                             }
                                                                                          } else {
                                                                                             this.method33306(Class8076.field34704, var9.method15285());
                                                                                          }
                                                                                       } else {
                                                                                          this.method33306(Class8076.field34703, var9.method15283());
                                                                                       }
                                                                                    } else {
                                                                                       this.method33306(Class8076.field34702, var9.method15283());
                                                                                    }
                                                                                 } else {
                                                                                    this.method33306(Class8076.field34701, var9.method15283());
                                                                                 }
                                                                              } else {
                                                                                 this.method33306(Class8076.field34700, var9.method15283());
                                                                              }
                                                                           } else {
                                                                              this.method33306(Class8076.field34700, var9.method15283());
                                                                           }
                                                                        } else {
                                                                           this.method33306(Class8076.field34698, var9.method15283());
                                                                        }
                                                                     } else {
                                                                        this.method33306(Class8076.field34697, var9.method15283());
                                                                     }
                                                                  } else {
                                                                     this.method33306(Class8076.field34696, var9.method15283());
                                                                  }
                                                               } else {
                                                                  this.method33306(Class8076.field34695, var9.method15285());
                                                               }
                                                            } else {
                                                               this.method33306(Class8076.field34694, var9.method15285());
                                                            }
                                                         } else {
                                                            this.method33306(Class8076.field34693, var9.method15283());
                                                         }
                                                      } else {
                                                         this.method33306(Class8076.field34691, var9.method15283());
                                                      }
                                                   } else {
                                                      Class9152 var10 = new Class9152(Class2226.method8962(var9.method15281()), var9.method15282());
                                                      if (!this.field41219.containsKey(Class8076.field34690)) {
                                                         ArrayList var11 = new ArrayList();
                                                         var11.add(var10);
                                                         this.method33306(Class8076.field34690, var11);
                                                      } else {
                                                         this.<List<Class9152>>method33308(Class8076.field34690).add(var10);
                                                      }
                                                   }
                                                } else {
                                                   this.method33306(Class8076.field34689, var9.method15286());
                                                }
                                             } else {
                                                this.method33306(Class8076.field34687, var9.method15283());
                                             }
                                          } else {
                                             this.method33306(Class8076.field34685, var9.method15283());
                                          }
                                       } else {
                                          this.method33306(Class8076.field34684, var9.method15283());
                                       }
                                    } else {
                                       this.method33306(Class8076.field34682, var9.method15287());
                                    }
                                 } else {
                                    this.method33306(Class8076.field34680, var9.method15285());
                                 }
                              } else {
                                 this.method33306(Class8076.field34679, var9.method15283());
                              }
                           } else {
                              this.method33306(Class8076.field34678, var9.method15283());
                           }
                        } else {
                           this.method33306(Class8076.field34676, var9.method15285());
                        }
                     } else {
                        byte[] var13 = var9.method15282();
                        this.method33306(Class8076.field34674, new Integer(var13[3]));
                        this.method33306(Class8076.field34675, new Integer(var13[5]));
                     }
                  } else {
                     this.method33306(Class8076.field34673, var9.method15283());
                  }
               } else {
                  this.method33306(Class8076.field34672, var9.method15283());
               }
            } else {
               this.method33306(Class8076.field34671, var9.method15283());
            }
         } else {
            this.method33306(Class8076.field34670, var9.method15283());
         }
      }
   }

   private void method33304(Class5079 var1) {
      try {
         DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var1.method15528()));
         Class9230 var5 = new Class9230(var4);

         for (Class5940 var7 : var5.method34717()) {
            switch (var7.method18444()) {
               case 1413565506:
                  this.method33306(Class8076.field34673, var7.method18453());
                  break;
               case 1413632077:
                  this.method33306(Class8076.field34680, var7.method18454());
                  break;
               case 1413697357:
                  this.method33306(Class8076.field34678, var7.method18453());
                  break;
               case 1413697360:
                  this.method33306(Class8076.field34687, var7.method18453());
                  break;
               case 1413760334:
                  this.method33306(Class8076.field34686, var7.method18456());
                  break;
               case 1413763660:
                  this.method33306(Class8076.field34682, var7.method18456());
                  break;
               case 1414091826:
                  this.method33306(Class8076.field34671, var7.method18453());
                  break;
               case 1414283598:
                  this.method33306(Class8076.field34710, var7.method18457());
                  break;
               case 1414284622:
                  this.method33306(Class8076.field34681, var7.method18454());
                  break;
               case 1414546737:
                  this.method33306(Class8076.field34670, var7.method18453());
                  break;
               case 1414550850:
                  this.method33306(Class8076.field34688, var7.method18453());
                  break;
               case 1414677323:
                  int[] var8 = var7.method18455();
                  this.method33306(Class8076.field34674, var8[0]);
                  if (var8.length > 1) {
                     this.method33306(Class8076.field34675, var8[1]);
                  }
                  break;
               case 1414681422:
                  this.method33306(Class8076.field34706, var7.method18453());
                  break;
               case 1414745921:
                  this.method33306(Class8076.field34713, var7.method18453());
                  break;
               case 1414745936:
                  this.method33306(Class8076.field34711, var7.method18453());
                  break;
               case 1414745940:
                  this.method33306(Class8076.field34712, var7.method18453());
                  break;
               case 1414746949:
                  this.method33306(Class8076.field34685, var7.method18453());
            }
         }
      } catch (IOException var9) {
         Logger.getLogger("MP4 API").log(Level.SEVERE, "Exception in MetaData.parseID3: {0}", var9.toString());
      }
   }

   private void method33305(Class5044 var1) {
      Map<String, String> var4 = var1.method15447();

      for (String var6 : var4.keySet()) {
         String var7 = (String)var4.get(var6);

         try {
            if (var6.equals(field41218[0])) {
               this.method33306(Class8076.field34670, var7);
            }

            if (var6.equals(field41218[1])) {
               this.method33306(Class8076.field34671, var7);
            }

            if (var6.equals(field41218[2])) {
               this.method33306(Class8076.field34673, var7);
            }

            if (var6.equals(field41218[3])) {
               this.method33306(Class8076.field34674, Integer.parseInt(var7));
            }

            if (var6.equals(field41218[4])) {
               this.method33306(Class8076.field34675, Integer.parseInt(var7));
            }

            if (var6.equals(field41218[5])) {
               Calendar var8 = Calendar.getInstance();
               var8.set(1, Integer.parseInt(var7));
               this.method33306(Class8076.field34682, var8.getTime());
            }

            if (var6.equals(field41218[6])) {
               this.method33306(Class8076.field34683, var7);
            }

            if (var6.equals(field41218[7])) {
               this.method33306(Class8076.field34676, Integer.parseInt(var7));
            }

            if (var6.equals(field41218[8])) {
               this.method33306(Class8076.field34677, Integer.parseInt(var7));
            }

            if (var6.equals(field41218[9])) {
            }

            if (var6.equals(field41218[10])) {
               this.method33306(Class8076.field34687, var7);
            }

            if (var6.equals(field41218[11])) {
               this.method33306(Class8076.field34679, var7);
            }

            if (var6.equals(field41218[12])) {
               this.method33306(Class8076.field34693, var7);
            }

            if (var6.equals(field41218[13])) {
            }

            if (var6.equals(field41218[14])) {
               this.method33306(Class8076.field34694, Integer.parseInt(var7));
            }

            if (var6.equals(field41218[15])) {
               this.method33306(Class8076.field34688, var7);
            }

            if (var6.equals(field41218[16])) {
               this.method33306(Class8076.field34678, var7);
            }

            if (var6.equals(field41218[17])) {
            }

            if (var6.equals(field41218[18])) {
            }

            if (var6.equals(field41218[19])) {
               this.method33306(Class8076.field34680, Integer.parseInt(var7));
            }
         } catch (NumberFormatException var9) {
            Logger.getLogger("MP4 API").log(Level.SEVERE, "Exception in MetaData.parseNeroTags: {0}", var9.toString());
         }
      }
   }

   private <T> void method33306(Class8076<T> var1, T var2) {
      this.field41219.put(var1, var2);
   }

   public boolean method33307() {
      return !this.field41219.isEmpty();
   }

   public <T> T method33308(Class8076<T> var1) {
      return (T)this.field41219.get(var1);
   }

   public Map<Class8076<?>, Object> method33309() {
      return Collections.<Class8076<?>, Object>unmodifiableMap(this.field41219);
   }
}
