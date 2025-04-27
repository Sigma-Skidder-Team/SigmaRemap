// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class Class6779
{
    public String field26611;
    public String field26612;
    public Class8802[] field26613;
    public int[] field26614;
    public String[] field26615;
    public int field26616;
    public String[] field26617;
    public int field26618;
    public int field26619;
    public Class3090[] field26620;
    public Class7740 field26621;
    public int field26622;
    public boolean field26623;
    public int[] field26624;
    public int field26625;
    public int field26626;
    public int[] field26627;
    public int field26628;
    public int field26629;
    public boolean field26630;
    public Class8998 field26631;
    public int[] field26632;
    public int field26633;
    public TextureAtlasSprite[] field26634;
    public TextureAtlasSprite[] field26635;
    public Class8802[] field26636;
    public String[] field26637;
    public TextureAtlasSprite[] field26638;
    public int field26639;
    public BlockState field26640;
    public Class6332 field26641;
    public static final int field26642 = 0;
    public static final int field26643 = 1;
    public static final int field26644 = 2;
    public static final int field26645 = 3;
    public static final int field26646 = 4;
    public static final int field26647 = 5;
    public static final int field26648 = 6;
    public static final int field26649 = 7;
    public static final int field26650 = 8;
    public static final int field26651 = 9;
    public static final int field26652 = 10;
    public static final int field26653 = 11;
    public static final int field26654 = 12;
    public static final int field26655 = 13;
    public static final int field26656 = 14;
    public static final int field26657 = 15;
    public static final int field26658 = 0;
    public static final int field26659 = 1;
    public static final int field26660 = 2;
    public static final int field26661 = 3;
    public static final int field26662 = 4;
    public static final int field26663 = 128;
    public static final int field26664 = 1;
    public static final int field26665 = 2;
    public static final int field26666 = 4;
    public static final int field26667 = 8;
    public static final int field26668 = 16;
    public static final int field26669 = 32;
    public static final int field26670 = 60;
    public static final int field26671 = 63;
    public static final int field26672 = 128;
    public static final int field26673 = 1;
    public static final int field26674 = 2;
    public static final int field26675 = 6;
    public static final int field26676 = 128;
    public static final String field26677 = "<skip>.png";
    public static final String field26678 = "<default>.png";
    
    public Class6779(final Properties properties, final String s) {
        this.field26611 = null;
        this.field26612 = null;
        this.field26613 = null;
        this.field26614 = null;
        this.field26615 = null;
        this.field26616 = 0;
        this.field26617 = null;
        this.field26618 = 0;
        this.field26619 = 63;
        this.field26620 = null;
        this.field26621 = null;
        this.field26622 = 0;
        this.field26623 = false;
        this.field26624 = null;
        this.field26625 = 0;
        this.field26626 = 0;
        this.field26627 = null;
        this.field26628 = 0;
        this.field26629 = 1;
        this.field26630 = false;
        this.field26631 = null;
        this.field26632 = null;
        this.field26633 = 1;
        this.field26634 = null;
        this.field26635 = null;
        this.field26636 = null;
        this.field26637 = null;
        this.field26638 = null;
        this.field26639 = -1;
        this.field26640 = Blocks.AIR.getDefaultState();
        this.field26641 = null;
        final Class8652 class8652 = new Class8652("ConnectedTextures");
        this.field26611 = class8652.method29440(s);
        this.field26612 = class8652.method29441(s);
        this.field26613 = class8652.method29442(properties.getProperty("matchBlocks"));
        this.field26614 = class8652.method29457(properties.getProperty("metadata"));
        this.field26615 = this.method20696(properties.getProperty("matchTiles"));
        this.field26616 = method20705(properties.getProperty("method"));
        this.field26617 = this.method20699(properties.getProperty("tiles"));
        this.field26618 = method20703(properties.getProperty("connect"));
        this.field26619 = method20701(properties.getProperty("faces"));
        this.field26620 = class8652.method29454(properties.getProperty("biomes"));
        this.field26621 = class8652.method29462(properties.getProperty("heights"));
        if (this.field26621 == null) {
            final int method29456 = class8652.method29456(properties.getProperty("minHeight"), -1);
            final int method29457 = class8652.method29456(properties.getProperty("maxHeight"), 1024);
            if (method29456 != -1 || method29457 != 1024) {
                this.field26621 = new Class7740(new Class7356(method29456, method29457));
            }
        }
        this.field26622 = class8652.method29456(properties.getProperty("renderPass"), -1);
        this.field26623 = class8652.method29464(properties.getProperty("innerSeams"), false);
        this.field26624 = this.method20695(properties);
        this.field26625 = class8652.method29456(properties.getProperty("width"), -1);
        this.field26626 = class8652.method29456(properties.getProperty("height"), -1);
        this.field26627 = class8652.method29457(properties.getProperty("weights"));
        this.field26628 = class8652.method29456(properties.getProperty("randomLoops"), 0);
        this.field26629 = method20700(properties.getProperty("symmetry"));
        this.field26630 = class8652.method29464(properties.getProperty("linked"), false);
        this.field26631 = class8652.method29475("name", properties.getProperty("name"));
        this.field26636 = class8652.method29442(properties.getProperty("connectBlocks"));
        this.field26637 = this.method20696(properties.getProperty("connectTiles"));
        this.field26639 = class8652.method29456(properties.getProperty("tintIndex"), -1);
        this.field26640 = class8652.method29443(properties.getProperty("tintBlock"), Blocks.AIR.getDefaultState());
        this.field26641 = class8652.method29468(properties.getProperty("layer"), Class9484.field40760);
    }
    
    private int[] method20695(final Properties properties) {
        if (this.field26617 == null) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        for (final String next : properties.keySet()) {
            if (!(next instanceof String)) {
                continue;
            }
            final String key = next;
            final String prefix = "ctm.";
            if (!key.startsWith(prefix)) {
                continue;
            }
            final String substring = key.substring(prefix.length());
            final String property = properties.getProperty(key);
            if (property == null) {
                continue;
            }
            final String trim = property.trim();
            final int method28933 = Config.method28933(substring, -1);
            if (method28933 >= 0 && method28933 <= 46) {
                final int method28934 = Config.method28933(trim, -1);
                if (method28934 >= 0 && method28934 < this.field26617.length) {
                    hashMap.put(method28933, method28934);
                }
                else {
                    Config.warn("Invalid CTM tile index: " + trim);
                }
            }
            else {
                Config.warn("Invalid CTM index: " + substring);
            }
        }
        if (!hashMap.isEmpty()) {
            final int[] array = new int[47];
            for (int i = 0; i < array.length; ++i) {
                array[i] = -1;
                if (hashMap.containsKey(i)) {
                    array[i] = (int)hashMap.get(i);
                }
            }
            return array;
        }
        return null;
    }
    
    private String[] method20696(final String s) {
        if (s != null) {
            final String[] method28937 = Config.method28937(s, " ");
            for (int i = 0; i < method28937.length; ++i) {
                String substring = method28937[i];
                if (substring.endsWith(".png")) {
                    substring = substring.substring(0, substring.length() - 4);
                }
                method28937[i] = Class8969.method31832(substring, this.field26612);
            }
            return method28937;
        }
        return null;
    }
    
    private static String method20697(final String s) {
        String s2 = s;
        final int lastIndex = s.lastIndexOf(47);
        if (lastIndex >= 0) {
            s2 = s.substring(lastIndex + 1);
        }
        final int lastIndex2 = s2.lastIndexOf(46);
        if (lastIndex2 >= 0) {
            s2 = s2.substring(0, lastIndex2);
        }
        return s2;
    }
    
    private static String method20698(final String s) {
        final int lastIndex = s.lastIndexOf(47);
        return (lastIndex >= 0) ? s.substring(0, lastIndex) : "";
    }
    
    private String[] method20699(final String str) {
        if (str != null) {
            final ArrayList list = new ArrayList();
            final String[] method28937 = Config.method28937(str, " ,");
            for (int i = 0; i < method28937.length; ++i) {
                final String str2 = method28937[i];
                if (str2.contains("-")) {
                    final String[] method28938 = Config.method28937(str2, "-");
                    if (method28938.length == 2) {
                        final int method28939 = Config.method28933(method28938[0], -1);
                        final int method28940 = Config.method28933(method28938[1], -1);
                        if (method28939 >= 0) {
                            if (method28940 >= 0) {
                                if (method28939 <= method28940) {
                                    for (int j = method28939; j <= method28940; ++j) {
                                        list.add(String.valueOf(j));
                                    }
                                    continue;
                                }
                                Config.warn("Invalid interval: " + str2 + ", when parsing: " + str);
                                continue;
                            }
                        }
                    }
                }
                list.add(str2);
            }
            final String[] array = (String[])list.toArray(new String[list.size()]);
            for (int k = 0; k < array.length; ++k) {
                String str3 = Class8969.method31832(array[k], this.field26612);
                if (!str3.startsWith(this.field26612)) {
                    if (!str3.startsWith("textures/")) {
                        if (!str3.startsWith("optifine/")) {
                            str3 = this.field26612 + "/" + str3;
                        }
                    }
                }
                if (str3.endsWith(".png")) {
                    str3 = str3.substring(0, str3.length() - 4);
                }
                if (str3.startsWith("/")) {
                    str3 = str3.substring(1);
                }
                array[k] = str3;
            }
            return array;
        }
        return null;
    }
    
    private static int method20700(String trim) {
        if (trim == null) {
            return 1;
        }
        trim = trim.trim();
        if (trim.equals("opposite")) {
            return 2;
        }
        if (!trim.equals("all")) {
            Config.warn("Unknown symmetry: " + trim);
            return 1;
        }
        return 6;
    }
    
    private static int method20701(final String s) {
        if (s != null) {
            final String[] method28937 = Config.method28937(s, " ,");
            int n = 0;
            for (int i = 0; i < method28937.length; ++i) {
                n |= method20702(method28937[i]);
            }
            return n;
        }
        return 63;
    }
    
    private static int method20702(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.equals("bottom") || lowerCase.equals("down")) {
            return 1;
        }
        if (lowerCase.equals("top") || lowerCase.equals("up")) {
            return 2;
        }
        if (lowerCase.equals("north")) {
            return 4;
        }
        if (lowerCase.equals("south")) {
            return 8;
        }
        if (lowerCase.equals("east")) {
            return 32;
        }
        if (lowerCase.equals("west")) {
            return 16;
        }
        if (lowerCase.equals("sides")) {
            return 60;
        }
        if (!lowerCase.equals("all")) {
            Config.warn("Unknown face: " + lowerCase);
            return 128;
        }
        return 63;
    }
    
    private static int method20703(String trim) {
        if (trim == null) {
            return 0;
        }
        trim = trim.trim();
        if (trim.equals("block")) {
            return 1;
        }
        if (trim.equals("tile")) {
            return 2;
        }
        if (trim.equals("material")) {
            return 3;
        }
        if (!trim.equals("state")) {
            Config.warn("Unknown connect: " + trim);
            return 128;
        }
        return 4;
    }
    
    public static IProperty method20704(final String s, final Collection<IProperty> collection) {
        for (final IProperty class7111 : collection) {
            if (!s.equals(class7111.getName())) {
                continue;
            }
            return class7111;
        }
        return null;
    }
    
    private static int method20705(String trim) {
        if (trim == null) {
            return 1;
        }
        trim = trim.trim();
        if (trim.equals("ctm") || trim.equals("glass")) {
            return 1;
        }
        if (trim.equals("ctm_compact")) {
            return 10;
        }
        if (trim.equals("horizontal") || trim.equals("bookshelf")) {
            return 2;
        }
        if (trim.equals("vertical")) {
            return 6;
        }
        if (trim.equals("top")) {
            return 3;
        }
        if (trim.equals("random")) {
            return 4;
        }
        if (trim.equals("repeat")) {
            return 5;
        }
        if (trim.equals("fixed")) {
            return 7;
        }
        if (trim.equals("horizontal+vertical") || trim.equals("h+v")) {
            return 8;
        }
        if (trim.equals("vertical+horizontal") || trim.equals("v+h")) {
            return 9;
        }
        if (trim.equals("overlay")) {
            return 11;
        }
        if (trim.equals("overlay_fixed")) {
            return 12;
        }
        if (trim.equals("overlay_random")) {
            return 13;
        }
        if (trim.equals("overlay_repeat")) {
            return 14;
        }
        if (!trim.equals("overlay_ctm")) {
            Config.warn("Unknown method: " + trim);
            return 0;
        }
        return 15;
    }
    
    public boolean method20706(final String str) {
        if (this.field26611 == null || this.field26611.length() <= 0) {
            Config.warn("No name found: " + str);
            return false;
        }
        if (this.field26612 == null) {
            Config.warn("No base path found: " + str);
            return false;
        }
        if (this.field26613 == null) {
            this.field26613 = this.method20708();
        }
        if (this.field26615 == null && this.field26613 == null) {
            this.field26615 = this.method20710();
        }
        if (this.field26613 == null && this.field26615 == null) {
            Config.warn("No matchBlocks or matchTiles specified: " + str);
            return false;
        }
        if (this.field26614 != null) {
            Config.warn("Metadata is not supported: " + Config.method28890(this.field26614));
            return false;
        }
        if (this.field26616 == 0) {
            Config.warn("No method: " + str);
            return false;
        }
        if (this.field26617 == null || this.field26617.length <= 0) {
            Config.warn("No tiles specified: " + str);
            return false;
        }
        if (this.field26618 == 0) {
            this.field26618 = this.method20707();
        }
        if (this.field26618 == 128) {
            Config.warn("Invalid connect in: " + str);
            return false;
        }
        if (this.field26622 > 0) {
            Config.warn("Render pass not supported: " + this.field26622);
            return false;
        }
        if ((this.field26619 & 0x80) != 0x0) {
            Config.warn("Invalid faces in: " + str);
            return false;
        }
        if ((this.field26629 & 0x80) != 0x0) {
            Config.warn("Invalid symmetry in: " + str);
            return false;
        }
        switch (this.field26616) {
            case 1: {
                return this.method20712(str);
            }
            case 2: {
                return this.method20719(str);
            }
            case 3: {
                return this.method20726(str);
            }
            case 4: {
                return this.method20723(str);
            }
            case 5: {
                return this.method20724(str);
            }
            case 6: {
                return this.method20720(str);
            }
            case 7: {
                return this.method20725(str);
            }
            case 8: {
                return this.method20721(str);
            }
            case 9: {
                return this.method20722(str);
            }
            case 10: {
                return this.method20713(str);
            }
            case 11: {
                return this.method20714(str);
            }
            case 12: {
                return this.method20715(str);
            }
            case 13: {
                return this.method20716(str);
            }
            case 14: {
                return this.method20717(str);
            }
            case 15: {
                return this.method20718(str);
            }
            default: {
                Config.warn("Unknown method: " + str);
                return false;
            }
        }
    }
    
    private int method20707() {
        if (this.field26613 == null) {
            return (this.field26615 == null) ? 128 : 2;
        }
        return 1;
    }
    
    private Class8802[] method20708() {
        final int[] method20709 = this.method20709();
        if (method20709 != null) {
            final Class8802[] array = new Class8802[method20709.length];
            for (int i = 0; i < array.length; ++i) {
                array[i] = new Class8802(method20709[i]);
            }
            return array;
        }
        return null;
    }
    
    private int[] method20709() {
        final String prefix = "block_";
        if (!this.field26611.startsWith(prefix)) {
            return null;
        }
        final Block method20650 = BlockUtils.method20650(new ResourceLocation(this.field26611.substring(prefix.length())));
        if (method20650 != null) {
            return new int[] { BlockUtils.method20649(method20650) };
        }
        return null;
    }
    
    private String[] method20710() {
        return (method20711(this.field26611) != null) ? new String[] { this.field26611 } : null;
    }
    
    private static TextureAtlasSprite method20711(final String str) {
        final Class1774 method29001 = Config.method29001();
        final TextureAtlasSprite method29002 = method29001.method6344(str);
        if (method29002 == null) {
            return method29001.method6344("block/" + str);
        }
        return method29002;
    }
    
    private boolean method20712(final String str) {
        if (this.field26617 == null) {
            this.field26617 = this.method20699("0-11 16-27 32-43 48-58");
        }
        if (this.field26617.length >= 47) {
            return true;
        }
        Config.warn("Invalid tiles, must be at least 47: " + str);
        return false;
    }
    
    private boolean method20713(final String str) {
        if (this.field26617 == null) {
            this.field26617 = this.method20699("0-4");
        }
        if (this.field26617.length >= 5) {
            return true;
        }
        Config.warn("Invalid tiles, must be at least 5: " + str);
        return false;
    }
    
    private boolean method20714(final String str) {
        if (this.field26617 == null) {
            this.field26617 = this.method20699("0-16");
        }
        if (this.field26617.length < 17) {
            Config.warn("Invalid tiles, must be at least 17: " + str);
            return false;
        }
        if (this.field26641 != null && this.field26641 != Class9484.field40759) {
            return true;
        }
        Config.warn("Invalid overlay layer: " + this.field26641);
        return false;
    }
    
    private boolean method20715(final String s) {
        if (!this.method20725(s)) {
            return false;
        }
        if (this.field26641 != null && this.field26641 != Class9484.field40759) {
            return true;
        }
        Config.warn("Invalid overlay layer: " + this.field26641);
        return false;
    }
    
    private boolean method20716(final String s) {
        if (!this.method20723(s)) {
            return false;
        }
        if (this.field26641 != null && this.field26641 != Class9484.field40759) {
            return true;
        }
        Config.warn("Invalid overlay layer: " + this.field26641);
        return false;
    }
    
    private boolean method20717(final String s) {
        if (!this.method20724(s)) {
            return false;
        }
        if (this.field26641 != null && this.field26641 != Class9484.field40759) {
            return true;
        }
        Config.warn("Invalid overlay layer: " + this.field26641);
        return false;
    }
    
    private boolean method20718(final String s) {
        if (!this.method20712(s)) {
            return false;
        }
        if (this.field26641 != null && this.field26641 != Class9484.field40759) {
            return true;
        }
        Config.warn("Invalid overlay layer: " + this.field26641);
        return false;
    }
    
    private boolean method20719(final String str) {
        if (this.field26617 == null) {
            this.field26617 = this.method20699("12-15");
        }
        if (this.field26617.length == 4) {
            return true;
        }
        Config.warn("Invalid tiles, must be exactly 4: " + str);
        return false;
    }
    
    private boolean method20720(final String s) {
        if (this.field26617 == null) {
            Config.warn("No tiles defined for vertical: " + s);
            return false;
        }
        if (this.field26617.length == 4) {
            return true;
        }
        Config.warn("Invalid tiles, must be exactly 4: " + s);
        return false;
    }
    
    private boolean method20721(final String s) {
        if (this.field26617 == null) {
            Config.warn("No tiles defined for horizontal+vertical: " + s);
            return false;
        }
        if (this.field26617.length == 7) {
            return true;
        }
        Config.warn("Invalid tiles, must be exactly 7: " + s);
        return false;
    }
    
    private boolean method20722(final String s) {
        if (this.field26617 == null) {
            Config.warn("No tiles defined for vertical+horizontal: " + s);
            return false;
        }
        if (this.field26617.length == 7) {
            return true;
        }
        Config.warn("Invalid tiles, must be exactly 7: " + s);
        return false;
    }
    
    private boolean method20723(final String str) {
        if (this.field26617 == null || this.field26617.length <= 0) {
            Config.warn("Tiles not defined: " + str);
            return false;
        }
        if (this.field26627 != null) {
            if (this.field26627.length > this.field26617.length) {
                Config.warn("More weights defined than tiles, trimming weights: " + str);
                final int[] field26627 = new int[this.field26617.length];
                System.arraycopy(this.field26627, 0, field26627, 0, field26627.length);
                this.field26627 = field26627;
            }
            if (this.field26627.length < this.field26617.length) {
                Config.warn("Less weights defined than tiles, expanding weights: " + str);
                final int[] field26628 = new int[this.field26617.length];
                System.arraycopy(this.field26627, 0, field26628, 0, this.field26627.length);
                final int method28403 = Class8500.method28403(this.field26627);
                for (int i = this.field26627.length; i < field26628.length; ++i) {
                    field26628[i] = method28403;
                }
                this.field26627 = field26628;
            }
            this.field26632 = new int[this.field26627.length];
            int n = 0;
            for (int j = 0; j < this.field26627.length; ++j) {
                n += this.field26627[j];
                this.field26632[j] = n;
            }
            this.field26633 = n;
            if (this.field26633 <= 0) {
                Config.warn("Invalid sum of all weights: " + n);
                this.field26633 = 1;
            }
        }
        if (this.field26628 >= 0 && this.field26628 <= 9) {
            return true;
        }
        Config.warn("Invalid randomLoops: " + this.field26628);
        return false;
    }
    
    private boolean method20724(final String s) {
        if (this.field26617 == null) {
            Config.warn("Tiles not defined: " + s);
            return false;
        }
        if (this.field26625 <= 0) {
            Config.warn("Invalid width: " + s);
            return false;
        }
        if (this.field26626 <= 0) {
            Config.warn("Invalid height: " + s);
            return false;
        }
        if (this.field26617.length == this.field26625 * this.field26626) {
            return true;
        }
        Config.warn("Number of tiles does not equal width x height: " + s);
        return false;
    }
    
    private boolean method20725(final String str) {
        if (this.field26617 == null) {
            Config.warn("Tiles not defined: " + str);
            return false;
        }
        if (this.field26617.length == 1) {
            return true;
        }
        Config.warn("Number of tiles should be 1 for method: fixed.");
        return false;
    }
    
    private boolean method20726(final String str) {
        if (this.field26617 == null) {
            this.field26617 = this.method20699("66");
        }
        if (this.field26617.length == 1) {
            return true;
        }
        Config.warn("Invalid tiles, must be exactly 1: " + str);
        return false;
    }
    
    public void method20727(final Class1774 class1774) {
        if (this.field26615 != null) {
            this.field26634 = method20731(this.field26615, class1774, false, false);
        }
        if (this.field26637 != null) {
            this.field26638 = method20731(this.field26637, class1774, false, false);
        }
        if (this.field26617 != null) {
            this.field26635 = method20731(this.field26617, class1774, true, !method20730(this.field26616));
        }
    }
    
    public void method20728(final Class1774 class1774) {
        this.method20729(this.field26634, class1774);
        this.method20729(this.field26638, class1774);
        this.method20729(this.field26635, class1774);
    }
    
    private void method20729(final TextureAtlasSprite[] array, final Class1774 class1774) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final TextureAtlasSprite class1775 = array[i];
                if (class1775 != null) {
                    final ResourceLocation method7503 = class1775.method7503();
                    final TextureAtlasSprite method7504 = class1774.method6338(method7503);
                    if (method7504 == null || method7504 instanceof Class1913) {
                        Config.warn("Missing CTM sprite: " + method7503 + ", properties: " + this.field26612);
                    }
                    array[i] = method7504;
                }
            }
        }
    }
    
    private static boolean method20730(final int n) {
        switch (n) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private static TextureAtlasSprite[] method20731(final String[] array, final Class1774 class1774, final boolean b, final boolean b2) {
        if (array != null) {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < array.length; ++i) {
                final ResourceLocation class1775 = new ResourceLocation(array[i]);
                final String method7798 = class1775.method7798();
                String s = class1775.method7797();
                if (!s.contains("/")) {
                    s = "textures/block/" + s;
                }
                final String string = s + ".png";
                if (b && string.endsWith("<skip>.png")) {
                    list.add(null);
                }
                else if (b2 && string.endsWith("<default>.png")) {
                    list.add(Class7970.field32785);
                }
                else {
                    if (!Config.method28900(new ResourceLocation(method7798, string))) {
                        Config.warn("File not found: " + string);
                    }
                    final String prefix = "textures/";
                    String substring = s;
                    if (s.startsWith(prefix)) {
                        substring = s.substring(prefix.length());
                    }
                    list.add(class1774.method6359(new ResourceLocation(method7798, substring)));
                }
            }
            return (TextureAtlasSprite[])list.toArray(new TextureAtlasSprite[list.size()]);
        }
        return null;
    }
    
    public boolean method20732(final int n) {
        return Class7980.method26016(n, this.field26613);
    }
    
    public boolean method20733(final int n, final int n2) {
        return Class7980.method26015(n, n2, this.field26613);
    }
    
    public boolean method20734(final TextureAtlasSprite class1912) {
        return Class7980.method26018(class1912, this.field26634);
    }
    
    @Override
    public String toString() {
        return "CTM name: " + this.field26611 + ", basePath: " + this.field26612 + ", matchBlocks: " + Config.method28888(this.field26613) + ", matchTiles: " + Config.method28888(this.field26615);
    }
    
    public boolean method20735(final Class3090 class3090) {
        return Class7980.method26019(class3090, this.field26620);
    }
    
    private static int method20736(final int[] array, int n) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final int n2 = array[i];
                if (n2 > n) {
                    n = n2;
                }
            }
            return n;
        }
        return n;
    }
}
