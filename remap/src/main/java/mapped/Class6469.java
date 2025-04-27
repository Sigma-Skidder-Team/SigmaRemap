// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public abstract class Class6469
{
    public static final Class6470 field25705;
    public static final Class6470 field25706;
    public static final Class6470 field25707;
    public static final Class6470 field25708;
    public static final Class6470 field25709;
    public static final Class6470 field25710;
    public static final Class6470 field25711;
    public static final Class6470 field25712;
    public static final Class6470 field25713;
    public static final Class6470 field25714;
    public static final Class6470 field25715;
    public static final Class6468 field25716;
    public static final Class6470 field25717;
    public static final Class6470 field25718;
    public static final Class6470 field25719;
    public static final Class6474 field25720;
    public static final Class6474 field25721;
    public static final Class6474 field25722;
    public static final Class6474 field25723;
    public static final Class6474 field25724;
    public static final Class6474 field25725;
    public static final Class6474 field25726;
    public static final Class6474 field25727;
    public static final Class6474 field25728;
    public static final Class6474 field25729;
    public static final Class6468 field25730;
    public static final Class6468 field25731;
    public static final Class6468 field25732;
    public static final Class6468 field25733;
    public static final Class6468 field25734;
    public static final Class6468 field25735;
    public static final Class6468 field25736;
    public static final Class6468 field25737;
    public static final Class6468 field25738;
    public static final Class6468 field25739;
    public static final Class6468 field25740;
    public static final Class6468 field25741;
    public static final Class6468 field25742;
    public static final Class6468 field25743;
    public static final Class6474 field25744;
    public static final Class6474 field25745;
    public static final Class6468 field25746;
    public static final Class6468 field25747;
    public static final Class6468 field25748;
    private final String field25749;
    public static final Class6474 field25750;
    public static final Class6474 field25751;
    public static final Class6470 field25752;
    public static final Class6474 field25753;
    public static final Class6474 field25754;
    public static final Class6470 field25755;
    public static final Class6474 field25756;
    public static final Class6474 field25757;
    public static final Class6474 field25758;
    public static final Class6474 field25759;
    public static final Class6474 field25760;
    public static final Class6474 field25761;
    public static final Class6470 field25762;
    public static final Class6474 field25763;
    public static final Class6474 field25764;
    public static final Class6474 field25765;
    public static final Class6474 field25766;
    public static final Class6474 field25767;
    public static final Class6474 field25768;
    public static final Class6474 field25769;
    public static final Class6474 field25770;
    public static final Class6474 field25771;
    public static final Class6474 field25772;
    public static final Class6474 field25773;
    public static final Class6474 field25774;
    public static final Class6474 field25775;
    public static final Class6474 field25776;
    public static final Class6474 field25777;
    public static final Class6474 field25778;
    public static final Class6474 field25779;
    public static final Class6474 field25780;
    public static final Class6474 field25781;
    public static final Class6474 field25782;
    public static final Class6474 field25783;
    public static final Class6474 field25784;
    public static final Class6474 field25785;
    public static final Class6474 field25786;
    public static final Class6474 field25787;
    public static final Class6474 field25788;
    public static final Class6474 field25789;
    public static final Class6474 field25790;
    public static final Class6474 field25791;
    public static final Class6474 field25792;
    public static final Class6474 field25793;
    public static final Class6474 field25794;
    public static final Class6474 field25795;
    public static final Class6474 field25796;
    public static final Class6474 field25797;
    public static final Class6470 field25798;
    public static final Class6470 field25799;
    public static final Class6474 field25800;
    public static final Class6474 field25801;
    public static final Class6474 field25802;
    public static final Class6474 field25803;
    public static final Class6474 field25804;
    public static final Class6474 field25805;
    public static final Class6474 field25806;
    public static final Class6474 field25807;
    public static final Class6474 field25808;
    public static final Class6474 field25809;
    public static final Class6474 field25810;
    public static final Class6474 field25811;
    public static final Class6474 field25812;
    public static final Class6474 field25813;
    public static final Class6474 field25814;
    public static final Class6474 field25815;
    public static final Class6474 field25816;
    public static final Class6474 field25817;
    public static final Class6474 field25818;
    public static final Class6474 field25819;
    public static final Class6474 field25820;
    public static final Class6474 field25821;
    public static final Class6474 field25822;
    
    public Class6469(final String field25749) {
        this.field25749 = field25749;
    }
    
    public abstract Widget method19362(final Class5760 p0, final int p1, final int p2, final int p3);
    
    public String method19365() {
        return Class8822.method30773(this.field25749) + ": ";
    }
    
    public String method19366() {
        return this.field25749;
    }
    
    static {
        field25705 = new Class6470("options.biomeBlendRadius", 0.0, 7.0, 1.0f, class5760 -> Double.valueOf(class5760.field23410), (class5762, n) -> {
            class5762.field23410 = MathHelper.method35651(n.intValue(), 0, 7);
            Minecraft.getInstance().worldRenderer.loadRenderers();
        }, (class5763, class5765) -> class5765.method19365() + Class8822.method30773("options.biomeBlendRadius." + ((int)class5765.method19476(class5763) * 2 + 1)));
        field25706 = new Class6470("options.chat.height.focused", 0.0, 1.0, 0.0f, class5767 -> class5767.field23404, (class5769, n2) -> {
            class5769.field23404 = n2;
            Minecraft.getInstance().field4647.method3807().method3764();
        }, (class5770, class5772) -> class5772.method19365() + Class684.method3776(class5772.method19469(class5772.method19476(class5770))) + "px");
        field25707 = new Class6470("options.chat.height.unfocused", 0.0, 1.0, 0.0f, class5774 -> class5774.field23403, (class5776, n3) -> {
            class5776.field23403 = n3;
            Minecraft.getInstance().field4647.method3807().method3764();
        }, (class5777, class5779) -> class5779.method19365() + Class684.method3776(class5779.method19469(class5779.method19476(class5777))) + "px");
        field25708 = new Class6470("options.chat.opacity", 0.0, 1.0, 0.0f, class5781 -> class5781.field23390, (class5783, n4) -> {
            class5783.field23390 = n4;
            Minecraft.getInstance().field4647.method3807().method3764();
        }, (class5784, class5786) -> class5786.method19365() + (int)(class5786.method19469(class5786.method19476(class5784)) * 90.0 + 10.0) + "%");
        field25709 = new Class6470("options.chat.scale", 0.0, 1.0, 0.0f, class5788 -> class5788.field23401, (class5790, n5) -> {
            class5790.field23401 = n5;
            Minecraft.getInstance().field4647.method3807().method3764();
        }, (class5791, class5793) -> {
            class5793.method19469(class5793.method19476(class5791));
            class5793.method19365();
            final double n6;
            String s;
            if (n6 != 0.0) {
                final String s2;
                s = s2 + (int)(n6 * 100.0) + "%";
            }
            else {
                final String s2;
                s = s2 + Class8822.method30773("options.off");
            }
            return s;
        });
        field25710 = new Class6470("options.chat.width", 0.0, 1.0, 0.0f, class5795 -> class5795.field23402 / 4.0571431, (class5797, value) -> {
            value *= 4.0571431;
            class5797.field23402 = value;
            Minecraft.getInstance().field4647.method3807().method3764();
        }, (class5798, class5800) -> class5800.method19365() + Class684.method3775(class5800.method19469(class5800.method19476(class5798)) * 4.0571431) + "px");
        field25711 = new Class6470("options.fov", 30.0, 110.0, 1.0f, class5802 -> class5802.field23471, (class5804, n7) -> class5804.field23471 = n7, (class5805, class5806) -> {
            class5806.method19476(class5805);
            class5806.method19365();
            final double n8;
            if (n8 != 70.0) {
                String s3;
                if (n8 != class5806.method19473()) {
                    final String str;
                    s3 = str + (int)n8;
                }
                else {
                    final String str;
                    s3 = str + Class8822.method30773("options.fov.max");
                }
                return s3;
            }
            else {
                final String str;
                return str + Class8822.method30773("options.fov.min");
            }
        });
        field25712 = new Class6470("options.framerateLimit", 0.0, 260.0, 5.0f, class5807 -> class5807.field23419 ? Class6469.field25712.method19472() : class5807.field23383, (class5809, n9) -> {
            class5809.field23383 = n9.intValue();
            class5809.field23419 = false;
            if (class5809.field23383 <= 0) {
                class5809.field23383 = (int)Class6469.field25712.method19473();
                class5809.field23419 = true;
            }
            class5809.method17138();
            Minecraft.getInstance().method5332().method7678(class5809.field23383);
        }, (class5810, class5811) -> {
            class5811.method19476(class5810);
            class5811.method19365();
            if (!class5810.field23419) {
                final double n10;
                String s4;
                if (n10 != class5811.method19473()) {
                    final String str2;
                    s4 = str2 + Class8822.method30773("options.framerate", (int)n10);
                }
                else {
                    final String str2;
                    s4 = str2 + Class8822.method30773("options.framerateLimit.max");
                }
                return s4;
            }
            else {
                final String str2;
                return str2 + Class4647.method13876("of.options.framerateLimit.vsync");
            }
        });
        field25713 = new Class6470("options.gamma", 0.0, 1.0, 0.0f, class5812 -> class5812.field23472, (class5814, n11) -> class5814.field23472 = n11, (class5815, class5816) -> {
            class5816.method19469(class5816.method19476(class5815));
            class5816.method19365();
            final double n12;
            if (n12 != 0.0) {
                String s5;
                if (n12 != 1.0) {
                    final String str3;
                    s5 = str3 + "+" + (int)(n12 * 100.0) + "%";
                }
                else {
                    final String str3;
                    s5 = str3 + Class8822.method30773("options.gamma.max");
                }
                return s5;
            }
            else {
                final String str3;
                return str3 + Class8822.method30773("options.gamma.min");
            }
        });
        field25714 = new Class6470("options.mipmapLevels", 0.0, 4.0, 1.0f, class5817 -> Double.valueOf(class5817.field23405), (class5819, n13) -> {
            class5819.field23405 = n13.intValue();
            class5819.method17139();
        }, (class5820, class5821) -> {
            class5821.method19476(class5820);
            class5821.method19365();
            final double n14;
            if (n14 < 4.0) {
                String s6;
                if (n14 != 0.0) {
                    final String str4;
                    s6 = str4 + (int)n14;
                }
                else {
                    final String str4;
                    s6 = str4 + Class8822.method30773("options.off");
                }
                return s6;
            }
            else {
                final String str4;
                return str4 + Class4647.method13876("of.general.max");
            }
        });
        field25715 = new Class6471("options.mouseWheelSensitivity", 0.01, 10.0, 0.01f, class5822 -> class5822.field23411, (class5824, n15) -> class5824.field23411 = n15, (class5825, class5827) -> {
            class5827.method19469(class5827.method19476(class5825));
            final double n16;
            return class5827.method19365() + String.format("%.2f", class5827.method19470(n16));
        });
        field25716 = new Class6468("options.rawMouseInput", class5829 -> class5829.field23412, (class5830, b) -> {
            class5830.field23412 = b;
            Minecraft.getInstance().method5332();
            final Class1925 class5831;
            if (class5831 != null) {
                class5831.method7702(b);
            }
        });
        field25717 = new Class6470("options.renderDistance", 2.0, 16.0, 1.0f, class5832 -> Double.valueOf(class5832.field23382), (class5834, n17) -> {
            class5834.field23382 = n17.intValue();
            Minecraft.getInstance().worldRenderer.method5755();
        }, (class5835, class5837) -> {
            class5837.method19476(class5835);
            final double n18;
            return class5837.method19365() + Class8822.method30773("options.chunks", (int)n18);
        });
        field25718 = new Class6470("options.sensitivity", 0.0, 1.0, 0.0f, class5839 -> class5839.field23381, (class5841, n19) -> class5841.field23381 = n19, (class5842, class5843) -> {
            class5843.method19469(class5843.method19476(class5842));
            class5843.method19365();
            final double n20;
            if (n20 != 0.0) {
                String s7;
                if (n20 != 1.0) {
                    final String str5;
                    s7 = str5 + (int)(n20 * 200.0) + "%";
                }
                else {
                    final String str5;
                    s7 = str5 + Class8822.method30773("options.sensitivity.max");
                }
                return s7;
            }
            else {
                final String str5;
                return str5 + Class8822.method30773("options.sensitivity.min");
            }
        });
        field25719 = new Class6470("options.accessibility.text_background_opacity", 0.0, 1.0, 0.0f, class5844 -> class5844.field23391, (class5846, n21) -> {
            class5846.field23391 = n21;
            Minecraft.getInstance().field4647.method3807().method3764();
        }, (class5847, class5849) -> class5849.method19365() + (int)(class5849.method19469(class5849.method19476(class5847)) * 100.0) + "%");
        field25720 = new Class6474("options.ao", (class5851, n22) -> {
            class5851.field23386 = Class2007.method8041(class5851.field23386.method8039() + n22);
            Minecraft.getInstance().worldRenderer.loadRenderers();
        }, (class5852, class5854) -> class5854.method19365() + Class8822.method30773(class5852.field23386.method8040()));
        field25721 = new Class6474("options.attackIndicator", (class5856, n23) -> class5856.field23408 = Class323.method996(class5856.field23408.method994() + n23), (class5857, class5859) -> class5859.method19365() + Class8822.method30773(class5857.field23408.method995()));
        field25722 = new Class6474("options.chat.visibility", (class5861, n24) -> class5861.field23389 = Class2047.method8134((class5861.field23389.method8132() + n24) % 3), (class5862, class5864) -> class5864.method19365() + Class8822.method30773(class5862.field23389.method8133()));
        field25723 = new Class6474("options.graphics", (class5866, p1) -> {
            class5866.field23385 = !class5866.field23385;
            class5866.method17136();
            Minecraft.getInstance().worldRenderer.loadRenderers();
        }, (class5867, class5869) -> {
            String s8;
            if (!class5867.field23385) {
                s8 = class5869.method19365() + Class8822.method30773("options.graphics.fast");
            }
            else {
                s8 = class5869.method19365() + Class8822.method30773("options.graphics.fancy");
            }
            return s8;
        });
        field25724 = new Class6474("options.guiScale", (class5871, n25) -> class5871.field23473 = MathHelper.method35664(class5871.field23473 + n25, Minecraft.getInstance().method5332().method7687(0, Minecraft.getInstance().method5240()) + 1), (class5872, class5874) -> class5874.method19365() + ((class5872.field23473 != 0) ? Integer.valueOf(class5872.field23473) : Class8822.method30773("options.guiScale.auto")));
        field25725 = new Class6474("options.mainHand", (class5876, p1) -> class5876.field23397 = class5876.field23397.method8419(), (class5877, class5879) -> class5879.method19365() + class5877.field23397);
        field25726 = new Class6474("options.narrator", (class5881, n26) -> {
            if (!NarratorChatListener.field32404.method25560()) {
                class5881.field23475 = Class2051.field11699;
            }
            else {
                class5881.field23475 = Class2051.method8139(class5881.field23475.method8137() + n26);
            }
            NarratorChatListener.field32404.method25559(class5881.field23475);
        }, (class5882, class5884) -> {
            String s9;
            if (!NarratorChatListener.field32404.method25560()) {
                s9 = class5884.method19365() + Class8822.method30773("options.narrator.notavailable");
            }
            else {
                s9 = class5884.method19365() + Class8822.method30773(class5882.field23475.method8138());
            }
            return s9;
        });
        field25727 = new Class6474("options.particles", (class5886, n27) -> class5886.field23474 = Class2159.method8327(class5886.field23474.method8326() + n27), (class5887, class5889) -> class5889.method19365() + Class8822.method30773(class5887.field23474.method8325()));
        field25728 = new Class6474("options.renderClouds", (class5891, n28) -> class5891.field23384 = Class2202.method8378(class5891.field23384.method8376() + n28), (class5892, class5894) -> class5894.method19365() + Class8822.method30773(class5892.field23384.method8377()));
        field25729 = new Class6474("options.accessibility.text_background", (class5896, p1) -> class5896.field23428 = !class5896.field23428, (class5897, class5899) -> class5899.method19365() + Class8822.method30773(class5897.field23428 ? "options.accessibility.text_background.chat" : "options.accessibility.text_background.everywhere"));
        field25730 = new Class6468("options.autoJump", class5901 -> class5901.field23414, (class5902, b2) -> class5902.field23414 = b2);
        field25731 = new Class6468("options.autoSuggestCommands", class5903 -> class5903.field23415, (class5904, b3) -> class5904.field23415 = b3);
        field25732 = new Class6468("options.chat.color", class5905 -> class5905.field23416, (class5906, b4) -> class5906.field23416 = b4);
        field25733 = new Class6468("options.chat.links", class5907 -> class5907.field23417, (class5908, b5) -> class5908.field23417 = b5);
        field25734 = new Class6468("options.chat.links.prompt", class5909 -> class5909.field23418, (class5910, b6) -> class5910.field23418 = b6);
        field25735 = new Class6468("options.discrete_mouse_scroll", class5911 -> class5911.field23423, (class5912, b7) -> class5912.field23423 = b7);
        field25736 = new Class6468("options.vsync", class5913 -> class5913.field23419, (class5914, b8) -> {
            class5914.field23419 = b8;
            if (Minecraft.getInstance().method5332() != null) {
                Minecraft.getInstance().method5332().method7672(class5914.field23419);
            }
        });
        field25737 = new Class6468("options.entityShadows", class5915 -> class5915.field23420, (class5916, b9) -> class5916.field23420 = b9);
        field25738 = new Class6468("options.forceUnicodeFont", class5917 -> class5917.field23421, (class5918, b10) -> {
            class5918.field23421 = b10;
            Minecraft.getInstance();
            final Minecraft class5919;
            if (class5919.method5323() != null) {
                class5919.method5323().method7377(class5918.field23421, Util.method27841(), class5919);
            }
        });
        field25739 = new Class6468("options.invertMouse", class5920 -> class5920.field23422, (class5921, b11) -> class5921.field23422 = b11);
        field25740 = new Class6468("options.realmsNotifications", class5922 -> class5922.field23424, (class5923, b12) -> class5923.field23424 = b12);
        field25741 = new Class6468("options.reducedDebugInfo", class5924 -> class5924.field23425, (class5925, b13) -> class5925.field23425 = b13);
        field25742 = new Class6468("options.showSubtitles", class5926 -> class5926.field23427, (class5927, b14) -> class5927.field23427 = b14);
        field25743 = new Class6468("options.snooper", class5928 -> {
            if (!class5928.field23426) {}
            return false;
        }, (class5929, b15) -> class5929.field23426 = b15);
        field25744 = new Class6474("key.sneak", (class5930, p1) -> class5930.field23432 = !class5930.field23432, (class5931, class5933) -> class5933.method19365() + Class8822.method30773(class5931.field23432 ? "options.key.toggle" : "options.key.hold"));
        field25745 = new Class6474("key.sprint", (class5935, p1) -> class5935.field23433 = !class5935.field23433, (class5936, class5938) -> class5938.method19365() + Class8822.method30773(class5936.field23433 ? "options.key.toggle" : "options.key.hold"));
        field25746 = new Class6468("options.touchscreen", class5940 -> class5940.field23429, (class5941, b16) -> class5941.field23429 = b16);
        field25747 = new Class6468("options.fullscreen", class5942 -> class5942.field23430, (class5943, b17) -> {
            class5943.field23430 = b17;
            Minecraft.getInstance();
            final Minecraft class5944;
            if (class5944.method5332() != null) {
                if (class5944.method5332().method7691() != class5943.field23430) {
                    class5944.method5332().method7685();
                    class5943.field23430 = class5944.method5332().method7691();
                }
            }
        });
        field25748 = new Class6468("options.viewBobbing", class5945 -> class5945.field23431, (class5946, b18) -> class5946.field23431 = b18);
        field25750 = new Class6475("of.options.FOG_FANCY");
        field25751 = new Class6475("of.options.FOG_START");
        field25752 = new Class6472("of.options.MIPMAP_TYPE", 0.0, 3.0, 1.0f);
        field25753 = new Class6475("of.options.SMOOTH_FPS");
        field25754 = new Class6475("of.options.CLOUDS");
        field25755 = new Class6472("of.options.CLOUD_HEIGHT");
        field25756 = new Class6475("of.options.TREES");
        field25757 = new Class6475("of.options.RAIN");
        field25758 = new Class6475("of.options.ANIMATED_WATER");
        field25759 = new Class6475("of.options.ANIMATED_LAVA");
        field25760 = new Class6475("of.options.ANIMATED_FIRE");
        field25761 = new Class6475("of.options.ANIMATED_PORTAL");
        field25762 = new Class6472("of.options.AO_LEVEL");
        field25763 = new Class6475("of.options.LAGOMETER");
        field25764 = new Class6475("of.options.SHOW_FPS");
        field25765 = new Class6475("of.options.AUTOSAVE_TICKS");
        field25766 = new Class6475("of.options.BETTER_GRASS");
        field25767 = new Class6475("of.options.ANIMATED_REDSTONE");
        field25768 = new Class6475("of.options.ANIMATED_EXPLOSION");
        field25769 = new Class6475("of.options.ANIMATED_FLAME");
        field25770 = new Class6475("of.options.ANIMATED_SMOKE");
        field25771 = new Class6475("of.options.WEATHER");
        field25772 = new Class6475("of.options.SKY");
        field25773 = new Class6475("of.options.STARS");
        field25774 = new Class6475("of.options.SUN_MOON");
        field25775 = new Class6475("of.options.VIGNETTE");
        field25776 = new Class6475("of.options.CHUNK_UPDATES");
        field25777 = new Class6475("of.options.CHUNK_UPDATES_DYNAMIC");
        field25778 = new Class6475("of.options.TIME");
        field25779 = new Class6475("of.options.SMOOTH_WORLD");
        field25780 = new Class6475("of.options.VOID_PARTICLES");
        field25781 = new Class6475("of.options.WATER_PARTICLES");
        field25782 = new Class6475("of.options.RAIN_SPLASH");
        field25783 = new Class6475("of.options.PORTAL_PARTICLES");
        field25784 = new Class6475("of.options.POTION_PARTICLES");
        field25785 = new Class6475("of.options.FIREWORK_PARTICLES");
        field25786 = new Class6475("of.options.PROFILER");
        field25787 = new Class6475("of.options.DRIPPING_WATER_LAVA");
        field25788 = new Class6475("of.options.BETTER_SNOW");
        field25789 = new Class6475("of.options.ANIMATED_TERRAIN");
        field25790 = new Class6475("of.options.SWAMP_COLORS");
        field25791 = new Class6475("of.options.RANDOM_ENTITIES");
        field25792 = new Class6475("of.options.SMOOTH_BIOMES");
        field25793 = new Class6475("of.options.CUSTOM_FONTS");
        field25794 = new Class6475("of.options.CUSTOM_COLORS");
        field25795 = new Class6475("of.options.SHOW_CAPES");
        field25796 = new Class6475("of.options.CONNECTED_TEXTURES");
        field25797 = new Class6475("of.options.CUSTOM_ITEMS");
        field25798 = new Class6472("of.options.AA_LEVEL", 0.0, 16.0, 1.0f);
        field25799 = new Class6472("of.options.AF_LEVEL", 1.0, 16.0, 1.0f);
        field25800 = new Class6475("of.options.ANIMATED_TEXTURES");
        field25801 = new Class6475("of.options.NATURAL_TEXTURES");
        field25802 = new Class6475("of.options.EMISSIVE_TEXTURES");
        field25803 = new Class6475("of.options.HELD_ITEM_TOOLTIPS");
        field25804 = new Class6475("of.options.DROPPED_ITEMS");
        field25805 = new Class6475("of.options.LAZY_CHUNK_LOADING");
        field25806 = new Class6475("of.options.CUSTOM_SKY");
        field25807 = new Class6475("of.options.FAST_MATH");
        field25808 = new Class6475("of.options.FAST_RENDER");
        field25809 = new Class6475("of.options.TRANSLUCENT_BLOCKS");
        field25810 = new Class6475("of.options.DYNAMIC_FOV");
        field25811 = new Class6475("of.options.DYNAMIC_LIGHTS");
        field25812 = new Class6475("of.options.ALTERNATE_BLOCKS");
        field25813 = new Class6475("of.options.CUSTOM_ENTITY_MODELS");
        field25814 = new Class6475("of.options.ADVANCED_TOOLTIPS");
        field25815 = new Class6475("of.options.SCREENSHOT_SIZE");
        field25816 = new Class6475("of.options.CUSTOM_GUIS");
        field25817 = new Class6475("of.options.RENDER_REGIONS");
        field25818 = new Class6475("of.options.SHOW_GL_ERRORS");
        field25819 = new Class6475("of.options.SMART_ANIMATIONS");
        field25820 = new Class6475("of.options.CHAT_BACKGROUND");
        field25821 = new Class6475("of.options.CHAT_SHADOW");
        field25822 = new Class6475("options.vbo");
    }
}
