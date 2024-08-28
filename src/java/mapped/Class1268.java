package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4407;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.text.*;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class Class1268 extends Class1193 {
    private static final ResourceLocation field6711 = new ResourceLocation("textures/misc/vignette.png");
    private static final ResourceLocation field6712 = new ResourceLocation("textures/gui/widgets.png");
    private static final ResourceLocation field6713 = new ResourceLocation("textures/misc/pumpkinblur.png");
    private static final ITextComponent field6714 = new TranslationTextComponent("demo.demoExpired");
    private final Random field6715 = new Random();
    private final Minecraft field6716;
    private final Class216 field6717;
    private final Class1266 field6718;
    private int field6719;
    private ITextComponent field6720;
    private int field6721;
    private boolean field6722;
    public float field6723 = 1.0F;
    private int field6724;
    private Class8848 field6725 = Class8848.field39973;
    public final Class1262 field6726;
    private final Class1269 field6727;
    private final Class1195 field6728;
    private final Class1265 field6729;
    private final Class1267 field6730;
    private int field6731;
    private ITextComponent field6732;
    private ITextComponent field6733;
    private int field6734;
    private int field6735;
    private int field6736;
    private int field6737;
    private int field6738;
    private long field6739;
    private long field6740;
    private int field6741;
    private int field6742;
    private final Map<ChatType, List<Class6687>> field6743 = Maps.newHashMap();

    public Class1268(Minecraft var1) {
        this.field6716 = var1;
        this.field6717 = var1.method1555();
        this.field6726 = new Class1262(var1);
        this.field6728 = new Class1195(var1);
        this.field6718 = new Class1266(var1);
        this.field6729 = new Class1265(var1, this);
        this.field6730 = new Class1267(var1);
        this.field6727 = new Class1269(var1);

        for (ChatType var7 : ChatType.values()) {
            this.field6743.put(var7, Lists.newArrayList());
        }

        Class6688 var8 = Class6688.field29302;
        this.field6743.get(ChatType.CHAT).add(new Class6686(var1));
        this.field6743.get(ChatType.CHAT).add(var8);
        this.field6743.get(ChatType.SYSTEM).add(new Class6686(var1));
        this.field6743.get(ChatType.SYSTEM).add(var8);
        this.field6743.get(ChatType.GAME_INFO).add(new Class6689(var1));
        this.method5960();
    }

    public void method5960() {
        this.field6734 = 10;
        this.field6735 = 70;
        this.field6736 = 20;
    }

    public void method5961(Class9332 var1, float var2) {
        this.field6741 = this.field6716.method1580().method8045();
        this.field6742 = this.field6716.method1580().method8046();
        Class9834 var5 = this.method5991();
        RenderSystem.enableBlend();
        if (!Class7944.method26883()) {
            RenderSystem.enableDepthTest();
            RenderSystem.method27938();
        } else {
            this.method5980(this.field6716.method1550());
        }

        Client.getInstance().method19926();
        Class8848 var6 = this.field6716.field1339.field4902.method4052(3);
        if (this.field6716.field1299.method37173().method8246() && var6.method32107() == Class8487.field36589.method11581()) {
            this.method5978();
        }

        float var7 = Class9679.method37821(var2, this.field6716.field1339.field6142, this.field6716.field1339.field6141);
        if (var7 > 0.0F && !this.field6716.field1339.method3033(Class8254.field35475)) {
            this.method5981(var7);
        }

        if (this.field6716.field1337.method23157() != Class1894.field11105) {
            if (!this.field6716.field1299.field44662) {
                this.method5966(var2, var1);
            }
        } else {
            this.field6728.method5720(var1, var2);
        }

        if (!this.field6716.field1299.field44662) {
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
            this.field6716.getTextureManager().bindTexture(field6453);
            RenderSystem.enableBlend();
            RenderSystem.disableAlphaTest();
            this.method5963(var1);
            Class7414.method23696();
            RenderSystem.method27938();
            this.field6716.method1574().method22503("bossHealth");
            this.field6730.method5953(var1);
            this.field6716.method1574().method22505();
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
            this.field6716.getTextureManager().bindTexture(field6453);
            if (this.field6716.field1337.method23130()) {
                this.method5976(var1);
            }

            this.method5977(var1);
            RenderSystem.disableBlend();
            int var8 = this.field6741 / 2 - 91;
            if (!this.field6716.field1339.method5405()) {
                if (this.field6716.field1337.method23150()) {
                    this.method5968(var1, var8);
                }
            } else {
                this.method5967(var1, var8);
            }

            if (this.field6716.field1299.field44594 && this.field6716.field1337.method23157() != Class1894.field11105) {
                this.method5969(var1);
            } else if (this.field6716.field1339.method2800()) {
                this.field6728.method5723(var1);
            }
        }

        if (this.field6716.field1339.method2910() > 0) {
            this.field6716.method1574().method22503("sleep");
            RenderSystem.disableDepthTest();
            RenderSystem.method27817();
            float var14 = (float) this.field6716.field1339.method2910();
            float var9 = var14 / 100.0F;
            if (var9 > 1.0F) {
                var9 = 1.0F - (var14 - 100.0F) / 10.0F;
            }

            int var10 = (int) (220.0F * var9) << 24 | 1052704;
            method5686(var1, 0, 0, this.field6741, this.field6742, var10);
            RenderSystem.disableAlphaTest();
            RenderSystem.enableDepthTest();
            this.field6716.method1574().method22505();
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
        }

        if (this.field6716.method1513()) {
            this.method5970(var1);
        }

        this.method5965(var1);
        if (this.field6716.field1299.field44664) {
            this.field6726.method5878(var1);
        }

        if (!this.field6716.field1299.field44662) {
            if (this.field6720 != null && this.field6721 > 0) {
                this.field6716.method1574().method22503("overlayMessage");
                float var15 = (float) this.field6721 - var2;
                int var18 = (int) (var15 * 255.0F / 20.0F);
                if (var18 > 255) {
                    var18 = 255;
                }

                if (var18 > 8) {
                    RenderSystem.pushMatrix();
                    RenderSystem.translatef((float) (this.field6741 / 2), (float) (this.field6742 - 68), 0.0F);
                    RenderSystem.enableBlend();
                    RenderSystem.method27938();
                    int var22 = 16777215;
                    if (this.field6722) {
                        var22 = Class9679.method37818(var15 / 50.0F, 0.7F, 0.6F) & 16777215;
                    }

                    int var11 = var18 << 24 & 0xFF000000;
                    int var12 = var5.method38821(this.field6720);
                    this.method5962(var1, var5, -4, var12, 16777215 | var11);
                    var5.method38805(var1, this.field6720, (float) (-var12 / 2), -4.0F, var22 | var11);
                    RenderSystem.disableBlend();
                    RenderSystem.popMatrix();
                }

                this.field6716.method1574().method22505();
            }

            if (this.field6732 != null && this.field6731 > 0) {
                this.field6716.method1574().method22503("titleAndSubtitle");
                float var16 = (float) this.field6731 - var2;
                int var19 = 255;
                if (this.field6731 > this.field6736 + this.field6735) {
                    float var23 = (float) (this.field6734 + this.field6735 + this.field6736) - var16;
                    var19 = (int) (var23 * 255.0F / (float) this.field6734);
                }

                if (this.field6731 <= this.field6736) {
                    var19 = (int) (var16 * 255.0F / (float) this.field6736);
                }

                var19 = Class9679.method37775(var19, 0, 255);
                if (var19 > 8) {
                    RenderSystem.pushMatrix();
                    RenderSystem.translatef((float) (this.field6741 / 2), (float) (this.field6742 / 2), 0.0F);
                    RenderSystem.enableBlend();
                    RenderSystem.method27938();
                    RenderSystem.pushMatrix();
                    RenderSystem.scalef(4.0F, 4.0F, 4.0F);
                    int var24 = var19 << 24 & 0xFF000000;
                    int var26 = var5.method38821(this.field6732);
                    this.method5962(var1, var5, -10, var26, 16777215 | var24);
                    var5.method38803(var1, this.field6732, (float) (-var26 / 2), -10.0F, 16777215 | var24);
                    RenderSystem.popMatrix();
                    if (this.field6733 != null) {
                        RenderSystem.pushMatrix();
                        RenderSystem.scalef(2.0F, 2.0F, 2.0F);
                        int var30 = var5.method38821(this.field6733);
                        this.method5962(var1, var5, 5, var30, 16777215 | var24);
                        var5.method38803(var1, this.field6733, (float) (-var30 / 2), 5.0F, 16777215 | var24);
                        RenderSystem.popMatrix();
                    }

                    RenderSystem.disableBlend();
                    RenderSystem.popMatrix();
                }

                this.field6716.method1574().method22505();
            }

            this.field6727.method5999(var1);
            Class6886 var17 = this.field6716.field1338.method6805();
            Class8375 var21 = null;
            Class8218 var25 = var17.method20998(this.field6716.field1339.method2956());
            if (var25 != null) {
                int var27 = var25.method28591().getColorIndex();
                if (var27 >= 0) {
                    var21 = var17.method20989(3 + var27);
                }
            }

            Class8375 var28 = var21 == null ? var17.method20989(1) : var21;
            if (var28 != null) {
                Class4407 var31 = new Class4407(true);
                Client.getInstance().getEventManager().call(var31);
                if (var31.isCancelled()) {
                    return;
                }

                this.method5971(var1, var28);
                Class4407 var13 = new Class4407(false);
                Client.getInstance().getEventManager().call(var13);
            }

            RenderSystem.enableBlend();
            RenderSystem.method27938();
            RenderSystem.method27817();
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0F, (float) (this.field6742 - 48), 0.0F);
            this.field6716.method1574().method22503("chat");
            this.field6718.method5926(var1, this.field6719);
            this.field6716.method1574().method22505();
            RenderSystem.popMatrix();
            var28 = var17.method20989(0);
            if (this.field6716.field1299.field44646.method8509()
                    && (!this.field6716.method1529() || this.field6716.field1339.connection.method15790().size() > 1 || var28 != null)) {
                this.field6729.method5919(true);
                this.field6729.method5920(var1, this.field6741, var17, var28);
            } else {
                this.field6729.method5919(false);
            }
        }

        RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.disableAlphaTest();
    }

    private void method5962(Class9332 var1, Class9834 var2, int var3, int var4, int var5) {
        int var8 = this.field6716.field1299.method37140(0.0F);
        if (var8 != 0) {
            int var9 = -var4 / 2;
            method5686(var1, var9 - 2, var3 - 2, var9 + var4 + 2, var3 + 9 + 2, Class9470.method36521(var8, var5));
        }
    }

    private void method5963(Class9332 var1) {
        Class9574 var4 = this.field6716.field1299;
        if (var4.method37173().method8246() && (this.field6716.field1337.method23157() != Class1894.field11105 || this.method5964(this.field6716.field1346))) {
            if (var4.field44664 && !var4.field44662 && !this.field6716.field1339.method2964() && !var4.field44621) {
                RenderSystem.pushMatrix();
                RenderSystem.translatef((float) (this.field6741 / 2), (float) (this.field6742 / 2), (float) this.method5702());
                Class9624 var11 = this.field6716.field1295.method768();
                RenderSystem.method27883(var11.method37506(), -1.0F, 0.0F, 0.0F);
                RenderSystem.method27883(var11.method37507(), 0.0F, 1.0F, 0.0F);
                RenderSystem.scalef(-1.0F, -1.0F, -1.0F);
                RenderSystem.method27903(10);
                RenderSystem.popMatrix();
            } else {
                RenderSystem.method27836(Class2339.field15994, Class1981.field12933, Class2339.field15990, Class1981.field12936);
                byte var5 = 15;
                this.method5696(var1, (this.field6741 - 15) / 2, (this.field6742 - 15) / 2, 0, 0, 15, 15);
                if (this.field6716.field1299.field44603 == Class2207.field14426) {
                    float var6 = this.field6716.field1339.method2974(0.0F);
                    boolean var7 = false;
                    if (this.field6716.field1345 != null && this.field6716.field1345 instanceof Class880 && var6 >= 1.0F) {
                        var7 = this.field6716.field1339.method2973() > 5.0F;
                        var7 &= this.field6716.field1345.method3066();
                    }

                    int var8 = this.field6742 / 2 - 7 + 16;
                    int var9 = this.field6741 / 2 - 8;
                    if (!var7) {
                        if (var6 < 1.0F) {
                            int var10 = (int) (var6 * 17.0F);
                            this.method5696(var1, var9, var8, 36, 94, 16, 4);
                            this.method5696(var1, var9, var8, 52, 94, var10, 4);
                        }
                    } else {
                        this.method5696(var1, var9, var8, 68, 94, 16, 16);
                    }
                }
            }
        }
    }

    private boolean method5964(Class8710 var1) {
        if (var1 != null) {
            if (var1.method31417() != Class2100.field13691) {
                if (var1.method31417() != Class2100.field13690) {
                    return false;
                } else {
                    BlockPos var4 = ((Class8711) var1).method31423();
                    Class1656 var5 = this.field6716.field1338;
                    return var5.method6738(var4).method23445(var5, var4) != null;
                }
            } else {
                return ((Class8709) var1).method31416() instanceof Class949;
            }
        } else {
            return false;
        }
    }

    public void method5965(Class9332 var1) {
        Collection<Class2023> var4 = this.field6716.field1339.method3031();
        if (!var4.isEmpty()) {
            RenderSystem.enableBlend();
            int var5 = 0;
            int var6 = 0;
            Class279 var7 = this.field6716.method1572();
            List<Runnable> var8 = Lists.newArrayListWithExpectedSize(var4.size());
            this.field6716.getTextureManager().bindTexture(Class851.field4720);

            for (Class2023 var10 : Ordering.natural().reverse().sortedCopy(var4)) {
                Class7144 var11 = var10.method8627();
                if (Class9299.field42935.method20214()) {
                    if (!Class9299.method35064(var10, Class9299.field42935)) {
                        continue;
                    }

                    this.field6716.getTextureManager().bindTexture(Class851.field4720);
                }

                if (var10.method8632()) {
                    int var12 = this.field6741;
                    byte var13 = 1;
                    if (this.field6716.method1513()) {
                        var13 += 15;
                    }

                    if (!var11.method22303()) {
                        var6++;
                        var12 -= 25 * var6;
                        var13 += 26;
                    } else {
                        var5++;
                        var12 -= 25 * var5;
                    }

                    RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
                    float var14 = 1.0F;
                    if (!var10.method8630()) {
                        this.method5696(var1, var12, var13, 141, 166, 24, 24);
                        if (var10.method8628() <= 200) {
                            int var15 = 10 - var10.method8628() / 20;
                            var14 = Class9679.method37777((float) var10.method8628() / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F)
                                    + Class9679.method37764((float) var10.method8628() * (float) Math.PI / 5.0F)
                                    * Class9679.method37777((float) var15 / 10.0F * 0.25F, 0.0F, 0.25F);
                        }
                    } else {
                        this.method5696(var1, var12, var13, 165, 166, 24, 24);
                    }

                    Class1713 var20 = var7.method1022(var11);
                    int var16 = var12;
                    byte var17 = var13;
                    float var18 = var14;
                    var8.add(() -> {
                        this.field6716.getTextureManager().bindTexture(var20.method7466().method1100());
                        RenderSystem.method27889(1.0F, 1.0F, 1.0F, var18);
                        method5695(var1, var16 + 3, var17 + 3, this.method5702(), 18, 18, var20);
                    });
                    if (Class9299.field42936.method20214()) {
                        Class9299.method35070(var10, Class9299.field42936, this, var1, var12, Integer.valueOf(var13), this.method5702(), var14);
                    }
                }
            }

            var8.forEach(Runnable::run);
        }
    }

    public void method5966(float var1, Class9332 var2) {
        PlayerEntity var5 = this.method5972();
        if (var5 != null) {
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
            this.field6716.getTextureManager().bindTexture(field6712);
            Class8848 var6 = var5.method3091();
            Class2205 var7 = var5.method2967().method8920();
            int var8 = this.field6741 / 2;
            int var9 = this.method5702();
            short var10 = 182;
            byte var11 = 91;
            this.method5703(-90);
            this.method5696(var2, var8 - 91, this.field6742 - 22, 0, 0, 182, 22);
            this.method5696(var2, var8 - 91 - 1 + var5.field4902.field5443 * 20, this.field6742 - 22 - 1, 0, 22, 24, 22);
            if (!var6.method32105()) {
                if (var7 != Class2205.field14417) {
                    this.method5696(var2, var8 + 91, this.field6742 - 23, 53, 22, 29, 24);
                } else {
                    this.method5696(var2, var8 - 91 - 29, this.field6742 - 23, 24, 22, 29, 24);
                }
            }

            this.method5703(var9);
            RenderSystem.method27867();
            RenderSystem.enableBlend();
            RenderSystem.method27938();
            Class7992.method27282(false);

            for (int var12 = 0; var12 < 9; var12++) {
                int var13 = var8 - 90 + var12 * 20 + 2;
                int var14 = this.field6742 - 16 - 3;
                this.method5982(var13, var14, var1, var5, var5.field4902.field5439.get(var12));
            }

            if (!var6.method32105()) {
                Class7992.method27282(true);
                int var16 = this.field6742 - 16 - 3;
                if (var7 != Class2205.field14417) {
                    this.method5982(var8 + 91 + 10, var16, var1, var5, var6);
                } else {
                    this.method5982(var8 - 91 - 26, var16, var1, var5, var6);
                }

                Class7992.method27282(false);
            }

            if (this.field6716.field1299.field44603 == Class2207.field14427) {
                float var17 = this.field6716.field1339.method2974(0.0F);
                if (var17 < 1.0F) {
                    int var18 = this.field6742 - 20;
                    int var19 = var8 + 91 + 6;
                    if (var7 == Class2205.field14418) {
                        var19 = var8 - 91 - 22;
                    }

                    this.field6716.getTextureManager().bindTexture(Class1193.field6453);
                    int var15 = (int) (var17 * 19.0F);
                    RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
                    this.method5696(var2, var19, var18, 0, 94, 18, 18);
                    this.method5696(var2, var19, var18 + 18 - var15, 18, 112 - var15, 18, var15);
                }
            }

            RenderSystem.method27868();
            RenderSystem.disableBlend();
        }
    }

    public void method5967(Class9332 var1, int var2) {
        this.field6716.method1574().method22503("jumpBar");
        this.field6716.getTextureManager().bindTexture(Class1193.field6453);
        float var5 = this.field6716.field1339.method5406();
        short var6 = 182;
        int var7 = (int) (var5 * 183.0F);
        int var8 = this.field6742 - 32 + 3;
        this.method5696(var1, var2, var8, 0, 84, 182, 5);
        if (var7 > 0) {
            this.method5696(var1, var2, var8, 0, 89, var7, 5);
        }

        this.field6716.method1574().method22505();
    }

    public void method5968(Class9332 var1, int var2) {
        this.field6716.method1574().method22503("expBar");
        this.field6716.getTextureManager().bindTexture(Class1193.field6453);
        int var5 = this.field6716.field1339.method2930();
        if (var5 > 0) {
            short var6 = 182;
            int var7 = (int) (this.field6716.field1339.field4922 * 183.0F);
            int var8 = this.field6742 - 32 + 3;
            this.method5696(var1, var2, var8, 0, 64, 182, 5);
            if (var7 > 0) {
                this.method5696(var1, var2, var8, 0, 69, var7, 5);
            }
        }

        this.field6716.method1574().method22505();
        if (this.field6716.field1339.field4920 > 0) {
            this.field6716.method1574().method22503("expLevel");
            int var10 = 8453920;
            if (Class7944.method26911()) {
                var10 = Class9680.method37898(var10);
            }

            String var11 = "" + this.field6716.field1339.field4920;
            int var12 = (this.field6741 - this.method5991().method38820(var11)) / 2;
            int var9 = this.field6742 - 31 - 4;
            this.method5991().method38801(var1, var11, (float) (var12 + 1), (float) var9, 0);
            this.method5991().method38801(var1, var11, (float) (var12 - 1), (float) var9, 0);
            this.method5991().method38801(var1, var11, (float) var12, (float) (var9 + 1), 0);
            this.method5991().method38801(var1, var11, (float) var12, (float) (var9 - 1), 0);
            this.method5991().method38801(var1, var11, (float) var12, (float) var9, var10);
            this.field6716.method1574().method22505();
        }
    }

    public void method5969(Class9332 var1) {
        this.field6716.method1574().method22503("selectedItemName");
        if (this.field6724 > 0 && !this.field6725.method32105()) {
            IFormattableTextComponent var4 = new StringTextComponent("").append(this.field6725.method32149()).mergeStyle(this.field6725.method32160().field12889);
            if (this.field6725.method32152()) {
                var4.mergeStyle(TextFormatting.ITALIC);
            }

            Object var5 = var4;
            if (Class9299.field42924.method20214()) {
                var5 = (ITextComponent) Class9299.method35070(this.field6725, Class9299.field42924, var4);
            }

            int var6 = this.method5991().method38821((ITextProperties) var5);
            int var7 = (this.field6741 - var6) / 2;
            int var8 = this.field6742 - 59;
            if (!this.field6716.field1337.method23130()) {
                var8 += 14;
            }

            int var9 = (int) ((float) this.field6724 * 256.0F / 10.0F);
            if (var9 > 255) {
                var9 = 255;
            }

            if (var9 > 0) {
                RenderSystem.pushMatrix();
                RenderSystem.enableBlend();
                RenderSystem.method27938();
                method5686(var1, var7 - 2, var8 - 2, var7 + var6 + 2, var8 + 9 + 2, this.field6716.field1299.method37141(0));
                Class9834 var10 = null;
                if (Class9299.field42912.method20214()) {
                    var10 = (Class9834) Class9299.method35070(this.field6725.method32107(), Class9299.field42912, this.field6725);
                }

                if (var10 == null) {
                    this.method5991().method38803(var1, (ITextComponent) var5, (float) var7, (float) var8, 16777215 + (var9 << 24));
                } else {
                    var6 = (this.field6741 - var10.method38821((ITextProperties) var5)) / 2;
                    var10.method38804(var1, ((ITextComponent) var5).func_241878_f(), (float) var7, (float) var8, 16777215 + (var9 << 24));
                }

                RenderSystem.disableBlend();
                RenderSystem.popMatrix();
            }
        }

        this.field6716.method1574().method22505();
    }

    public void method5970(Class9332 var1) {
        this.field6716.method1574().method22503("demo");
        Object var4;
        if (this.field6716.field1338.method6783() < 120500L) {
            var4 = new TranslationTextComponent("demo.remainingTime", Class9001.method33254((int) (120500L - this.field6716.field1338.method6783())));
        } else {
            var4 = field6714;
        }

        int var5 = this.method5991().method38821((ITextProperties) var4);
        this.method5991().method38803(var1, (ITextComponent) var4, (float) (this.field6741 - var5 - 10), 5.0F, 16777215);
        this.field6716.method1574().method22505();
    }

    private void method5971(Class9332 var1, Class8375 var2) {
        Class6886 var5 = var2.method29335();
        Collection<Class9411> var6 = var5.method20981(var2);
        List var7 = var6.stream().filter(var0 -> var0.method36054() != null && !var0.method36054().startsWith("#")).collect(Collectors.toList());
        if (var7.size() <= 15) {
            var6 = var7;
        } else {
            var6 = Lists.newArrayList(Iterables.skip(var7, var6.size() - 15));
        }

        List<Pair> var8 = Lists.newArrayListWithCapacity(var6.size());
        ITextComponent var9 = var2.method29338();
        int var10 = this.method5991().method38821(var9);
        int var11 = var10;
        int var12 = this.method5991().method38820(": ");

        for (Class9411 var14 : var6) {
            Class8218 var15 = var5.method20998(var14.method36054());
            IFormattableTextComponent var16 = Class8218.method28577(var15, new StringTextComponent(var14.method36054()));
            var8.add(Pair.of(var14, var16));
            var11 = Math.max(var11, this.method5991().method38821(var16) + var12 + this.method5991().method38820(Integer.toString(var14.method36050())));
        }

        int var28 = var6.size() * 9;
        int var29 = this.field6742 / 2 + var28 / 3;
        byte var30 = 3;
        int var31 = this.field6741 - var11 - 3;
        int var17 = 0;
        int var18 = this.field6716.field1299.method37140(0.3F);
        int var19 = this.field6716.field1299.method37140(0.4F);

        for (Pair var21 : var8) {
            var17++;
            Class9411 var22 = (Class9411) var21.getFirst();
            ITextComponent var23 = (ITextComponent) var21.getSecond();
            String var24 = TextFormatting.RED + "" + var22.method36050();
            int var25 = var29 - var17 * 9;
            int var26 = this.field6741 - 3 + 2;
            method5686(var1, var31 - 2, var25, var26, var25 + 9, var18);
            this.method5991().method38805(var1, var23, (float) var31, (float) var25, -1);
            this.method5991().method38801(var1, var24, (float) (var26 - this.method5991().method38820(var24)), (float) var25, -1);
            if (var17 == var6.size()) {
                method5686(var1, var31 - 2, var25 - 9 - 1, var26, var25 - 1, var19);
                method5686(var1, var31 - 2, var25 - 1, var26, var25, var18);
                this.method5991().method38805(var1, var9, (float) (var31 + var11 / 2 - var10 / 2), (float) (var25 - 9), -1);
            }
        }
    }

    private PlayerEntity method5972() {
        return this.field6716.method1550() instanceof PlayerEntity ? (PlayerEntity) this.field6716.method1550() : null;
    }

    private Class880 method5973() {
        PlayerEntity var3 = this.method5972();
        if (var3 != null) {
            Entity var4 = var3.method3421();
            if (var4 == null) {
                return null;
            }

            if (var4 instanceof Class880) {
                return (Class880) var4;
            }
        }

        return null;
    }

    private int method5974(Class880 var1) {
        if (var1 != null && var1.method3312()) {
            float var4 = var1.method3075();
            int var5 = (int) (var4 + 0.5F) / 2;
            if (var5 > 30) {
                var5 = 30;
            }

            return var5;
        } else {
            return 0;
        }
    }

    private int method5975(int var1) {
        return (int) Math.ceil((double) var1 / 10.0);
    }

    private void method5976(Class9332 var1) {
        PlayerEntity var4 = this.method5972();
        if (var4 != null) {
            int var5 = Class9679.method37773(var4.method3042());
            boolean var6 = this.field6740 > (long) this.field6719 && (this.field6740 - (long) this.field6719) / 3L % 2L == 1L;
            long var7 = Util.method38487();
            if (var5 < this.field6737 && var4.field5061 > 0) {
                this.field6739 = var7;
                this.field6740 = (long) (this.field6719 + 20);
            } else if (var5 > this.field6737 && var4.field5061 > 0) {
                this.field6739 = var7;
                this.field6740 = (long) (this.field6719 + 10);
            }

            if (var7 - this.field6739 > 1000L) {
                this.field6737 = var5;
                this.field6738 = var5;
                this.field6739 = var7;
            }

            this.field6737 = var5;
            int var9 = this.field6738;
            this.field6715.setSeed((long) (this.field6719 * 312871));
            Class9640 var10 = var4.method2932();
            int var11 = var10.method37574();
            int var12 = this.field6741 / 2 - 91;
            int var13 = this.field6741 / 2 + 91;
            int var14 = this.field6742 - 39;
            float var15 = (float) var4.method3086(Class9173.field42105);
            int var16 = Class9679.method37773(var4.method2959());
            int var17 = Class9679.method37773((var15 + (float) var16) / 2.0F / 10.0F);
            int var18 = Math.max(10 - (var17 - 2), 3);
            int var19 = var14 - (var17 - 1) * var18 - 10;
            int var20 = var14 - 10;
            int var21 = var16;
            int var22 = var4.method3070();
            int var23 = -1;
            if (var4.method3033(Class8254.field35476)) {
                var23 = this.field6719 % Class9679.method37773(var15 + 5.0F);
            }

            this.field6716.method1574().method22503("armor");

            for (int var24 = 0; var24 < 10; var24++) {
                if (var22 > 0) {
                    int var25 = var12 + var24 * 8;
                    if (var24 * 2 + 1 < var22) {
                        this.method5696(var1, var25, var19, 34, 9, 9, 9);
                    }

                    if (var24 * 2 + 1 == var22) {
                        this.method5696(var1, var25, var19, 25, 9, 9, 9);
                    }

                    if (var24 * 2 + 1 > var22) {
                        this.method5696(var1, var25, var19, 16, 9, 9, 9);
                    }
                }
            }

            this.field6716.method1574().method22506("health");

            for (int var33 = Class9679.method37773((var15 + (float) var16) / 2.0F) - 1; var33 >= 0; var33--) {
                byte var35 = 16;
                if (!var4.method3033(Class8254.field35485)) {
                    if (var4.method3033(Class8254.field35486)) {
                        var35 += 72;
                    }
                } else {
                    var35 += 36;
                }

                byte var26 = 0;
                if (var6) {
                    var26 = 1;
                }

                int var27 = Class9679.method37773((float) (var33 + 1) / 10.0F) - 1;
                int var28 = var12 + var33 % 10 * 8;
                int var29 = var14 - var27 * var18;
                if (var5 <= 4) {
                    var29 += this.field6715.nextInt(2);
                }

                if (var21 <= 0 && var33 == var23) {
                    var29 -= 2;
                }

                byte var30 = 0;
                if (var4.field5024.method6788().method20045()) {
                    var30 = 5;
                }

                this.method5696(var1, var28, var29, 16 + var26 * 9, 9 * var30, 9, 9);
                if (var6) {
                    if (var33 * 2 + 1 < var9) {
                        this.method5696(var1, var28, var29, var35 + 54, 9 * var30, 9, 9);
                    }

                    if (var33 * 2 + 1 == var9) {
                        this.method5696(var1, var28, var29, var35 + 63, 9 * var30, 9, 9);
                    }
                }

                if (var21 <= 0) {
                    if (var33 * 2 + 1 < var5) {
                        this.method5696(var1, var28, var29, var35 + 36, 9 * var30, 9, 9);
                    }

                    if (var33 * 2 + 1 == var5) {
                        this.method5696(var1, var28, var29, var35 + 45, 9 * var30, 9, 9);
                    }
                } else if (var21 == var16 && var16 % 2 == 1) {
                    this.method5696(var1, var28, var29, var35 + 153, 9 * var30, 9, 9);
                    var21--;
                } else {
                    this.method5696(var1, var28, var29, var35 + 144, 9 * var30, 9, 9);
                    var21 -= 2;
                }
            }

            Class880 var34 = this.method5973();
            int var36 = this.method5974(var34);
            if (var36 == 0) {
                this.field6716.method1574().method22506("food");

                for (int var37 = 0; var37 < 10; var37++) {
                    int var39 = var14;
                    byte var41 = 16;
                    byte var43 = 0;
                    if (var4.method3033(Class8254.field35483)) {
                        var41 += 36;
                        var43 = 13;
                    }

                    if (var4.method2932().method37577() <= 0.0F && this.field6719 % (var11 * 3 + 1) == 0) {
                        var39 = var14 + (this.field6715.nextInt(3) - 1);
                    }

                    int var45 = var13 - var37 * 8 - 9;
                    this.method5696(var1, var45, var39, 16 + var43 * 9, 27, 9, 9);
                    if (var37 * 2 + 1 < var11) {
                        this.method5696(var1, var45, var39, var41 + 36, 27, 9, 9);
                    }

                    if (var37 * 2 + 1 == var11) {
                        this.method5696(var1, var45, var39, var41 + 45, 27, 9, 9);
                    }
                }

                var20 -= 10;
            }

            this.field6716.method1574().method22506("air");
            int var38 = var4.method3350();
            int var40 = Math.min(var4.method3351(), var38);
            if (var4.method3263(Class8953.field40469) || var40 < var38) {
                int var42 = this.method5975(var36) - 1;
                var20 -= var42 * 10;
                int var44 = Class9679.method37774((double) (var40 - 2) * 10.0 / (double) var38);
                int var46 = Class9679.method37774((double) var40 * 10.0 / (double) var38) - var44;

                for (int var31 = 0; var31 < var44 + var46; var31++) {
                    if (var31 >= var44) {
                        this.method5696(var1, var13 - var31 * 8 - 9, var20, 25, 18, 9, 9);
                    } else {
                        this.method5696(var1, var13 - var31 * 8 - 9, var20, 16, 18, 9, 9);
                    }
                }
            }

            this.field6716.method1574().method22505();
        }
    }

    private void method5977(Class9332 var1) {
        Class880 var4 = this.method5973();
        if (var4 != null) {
            int var5 = this.method5974(var4);
            if (var5 != 0) {
                int var6 = (int) Math.ceil((double) var4.method3042());
                this.field6716.method1574().method22506("mountHealth");
                int var7 = this.field6742 - 39;
                int var8 = this.field6741 / 2 + 91;
                int var9 = var7;
                byte var10 = 0;

                for (boolean var11 = false; var5 > 0; var10 += 20) {
                    int var12 = Math.min(var5, 10);
                    var5 -= var12;

                    for (int var13 = 0; var13 < var12; var13++) {
                        byte var14 = 52;
                        byte var15 = 0;
                        int var16 = var8 - var13 * 8 - 9;
                        this.method5696(var1, var16, var9, 52 + var15 * 9, 9, 9, 9);
                        if (var13 * 2 + 1 + var10 < var6) {
                            this.method5696(var1, var16, var9, 88, 9, 9, 9);
                        }

                        if (var13 * 2 + 1 + var10 == var6) {
                            this.method5696(var1, var16, var9, 97, 9, 9, 9);
                        }
                    }

                    var9 -= 10;
                }
            }
        }
    }

    private void method5978() {
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.method27938();
        RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.method27817();
        this.field6716.getTextureManager().bindTexture(field6713);
        Class9352 var3 = Class9352.method35409();
        Class5425 var4 = var3.method35411();
        var4.method17063(7, Class9337.field43344);
        var4.method17025(0.0, (double) this.field6742, -90.0).method17027(0.0F, 1.0F).method17031();
        var4.method17025((double) this.field6741, (double) this.field6742, -90.0).method17027(1.0F, 1.0F).method17031();
        var4.method17025((double) this.field6741, 0.0, -90.0).method17027(1.0F, 0.0F).method17031();
        var4.method17025(0.0, 0.0, -90.0).method17027(0.0F, 0.0F).method17031();
        var3.method35410();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        RenderSystem.disableAlphaTest();
        RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void method5979(Entity var1) {
        if (var1 != null) {
            float var4 = Class9679.method37777(1.0F - var1.method3267(), 0.0F, 1.0F);
            this.field6723 = (float) ((double) this.field6723 + (double) (var4 - this.field6723) * 0.01);
        }
    }

    private void method5980(Entity var1) {
        if (Class7944.method26883()) {
            Class7522 var4 = this.field6716.field1338.method6810();
            float var5 = (float) var4.method24526(var1);
            double var6 = Math.min(var4.method24550() * (double) var4.method24551() * 1000.0, Math.abs(var4.method24539() - var4.method24537()));
            double var8 = Math.max((double) var4.method24553(), var6);
            if (!((double) var5 < var8)) {
                var5 = 0.0F;
            } else {
                var5 = 1.0F - (float) ((double) var5 / var8);
            }

            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            RenderSystem.method27836(Class2339.field16000, Class1981.field12933, Class2339.field15990, Class1981.field12936);
            if (!(var5 > 0.0F)) {
                RenderSystem.method27889(this.field6723, this.field6723, this.field6723, 1.0F);
            } else {
                RenderSystem.method27889(0.0F, var5, var5, 1.0F);
            }

            this.field6716.getTextureManager().bindTexture(field6711);
            Class9352 var10 = Class9352.method35409();
            Class5425 var11 = var10.method35411();
            var11.method17063(7, Class9337.field43344);
            var11.method17025(0.0, (double) this.field6742, -90.0).method17027(0.0F, 1.0F).method17031();
            var11.method17025((double) this.field6741, (double) this.field6742, -90.0).method17027(1.0F, 1.0F).method17031();
            var11.method17025((double) this.field6741, 0.0, -90.0).method17027(1.0F, 0.0F).method17031();
            var11.method17025(0.0, 0.0, -90.0).method17027(0.0F, 0.0F).method17031();
            var10.method35410();
            RenderSystem.depthMask(true);
            RenderSystem.enableDepthTest();
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.method27938();
        } else {
            RenderSystem.enableDepthTest();
            RenderSystem.method27836(Class2339.field15997, Class1981.field12932, Class2339.field15990, Class1981.field12936);
        }
    }

    private void method5981(float var1) {
        if (var1 < 1.0F) {
            var1 *= var1;
            var1 *= var1;
            var1 = var1 * 0.8F + 0.2F;
        }

        RenderSystem.method27817();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.method27938();
        RenderSystem.method27889(1.0F, 1.0F, 1.0F, var1);
        this.field6716.getTextureManager().bindTexture(Class289.field1102);
        Class1713 var4 = this.field6716.method1553().method806().method38152(Class8487.field36588.method11579());
        float var5 = var4.method7459();
        float var6 = var4.method7462();
        float var7 = var4.method7460();
        float var8 = var4.method7463();
        Class9352 var9 = Class9352.method35409();
        Class5425 var10 = var9.method35411();
        var10.method17063(7, Class9337.field43344);
        var10.method17025(0.0, (double) this.field6742, -90.0).method17027(var5, var8).method17031();
        var10.method17025((double) this.field6741, (double) this.field6742, -90.0).method17027(var7, var8).method17031();
        var10.method17025((double) this.field6741, 0.0, -90.0).method17027(var7, var6).method17031();
        var10.method17025(0.0, 0.0, -90.0).method17027(var5, var6).method17031();
        var9.method35410();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        RenderSystem.disableAlphaTest();
        RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void method5982(int var1, int var2, float var3, PlayerEntity var4, Class8848 var5) {
        if (!var5.method32105()) {
            float var8 = (float) var5.method32177() - var3;
            if (var8 > 0.0F) {
                RenderSystem.pushMatrix();
                float var9 = 1.0F + var8 / 5.0F;
                RenderSystem.translatef((float) (var1 + 8), (float) (var2 + 12), 0.0F);
                RenderSystem.scalef(1.0F / var9, (var9 + 1.0F) / 2.0F, 1.0F);
                RenderSystem.translatef((float) (-(var1 + 8)), (float) (-(var2 + 12)), 0.0F);
            }

            this.field6717.method795(var4, var5, var1, var2);
            if (var8 > 0.0F) {
                RenderSystem.popMatrix();
            }

            this.field6717.method797(this.field6716.field1294, var5, var1, var2);
        }
    }

    public void method5983() {
        if (this.field6716.field1338 == null) {
            Class8389.method29394();
        }

        if (this.field6721 > 0) {
            this.field6721--;
        }

        if (this.field6731 > 0) {
            this.field6731--;
            if (this.field6731 <= 0) {
                this.field6732 = null;
                this.field6733 = null;
            }
        }

        this.field6719++;
        Entity var3 = this.field6716.method1550();
        if (var3 != null) {
            this.method5979(var3);
        }

        if (this.field6716.field1339 != null) {
            Class8848 var4 = this.field6716.field1339.field4902.method4028();
            boolean var5 = true;
            if (Class9299.field42924.method20214()) {
                ITextComponent var6 = (ITextComponent) Class9299.method35070(var4, Class9299.field42924, var4.method32149());
                ITextComponent var7 = (ITextComponent) Class9299.method35070(this.field6725, Class9299.field42924, this.field6725.method32149());
                var5 = Class7944.equals(var6, var7);
            }

            if (!var4.method32105()) {
                if (this.field6725.method32105()
                        || var4.method32107() != this.field6725.method32107()
                        || !var4.method32149().equals(this.field6725.method32149())
                        || !var5) {
                    this.field6724 = 40;
                } else if (this.field6724 > 0) {
                    this.field6724--;
                }
            } else {
                this.field6724 = 0;
            }

            this.field6725 = var4;
        }
    }

    public void method5984(ITextComponent var1) {
        this.method5985(new TranslationTextComponent("record.nowPlaying", var1), true);
    }

    public void method5985(ITextComponent var1, boolean var2) {
        this.field6720 = var1;
        this.field6721 = 60;
        this.field6722 = var2;
    }

    public void method5986(ITextComponent var1, ITextComponent var2, int var3, int var4, int var5) {
        if (var1 == null && var2 == null && var3 < 0 && var4 < 0 && var5 < 0) {
            this.field6732 = null;
            this.field6733 = null;
            this.field6731 = 0;
        } else if (var1 == null) {
            if (var2 == null) {
                if (var3 >= 0) {
                    this.field6734 = var3;
                }

                if (var4 >= 0) {
                    this.field6735 = var4;
                }

                if (var5 >= 0) {
                    this.field6736 = var5;
                }

                if (this.field6731 > 0) {
                    this.field6731 = this.field6734 + this.field6735 + this.field6736;
                }
            } else {
                this.field6733 = var2;
            }
        } else {
            this.field6732 = var1;
            this.field6731 = this.field6734 + this.field6735 + this.field6736;
        }
    }

    public UUID method5987(ITextComponent var1) {
        String var4 = TextProcessing.func_244782_a(var1);
        String var5 = StringUtils.substringBetween(var4, "<", ">");
        return var5 != null ? this.field6716.method1578().method37610(var5) : Util.field45724;
    }

    public void method5988(ChatType var1, ITextComponent var2, UUID var3) {
        if (!this.field6716.method1511(var3) && (!this.field6716.field1299.field44631 || !this.field6716.method1511(this.method5987(var2)))) {
            for (Class6687 var7 : this.field6743.get(var1)) {
                var7.method20400(var1, var2, var3);
            }
        }
    }

    public Class1266 method5989() {
        return this.field6718;
    }

    public int method5990() {
        return this.field6719;
    }

    public Class9834 method5991() {
        return this.field6716.field1294;
    }

    public Class1195 method5992() {
        return this.field6728;
    }

    public Class1265 method5993() {
        return this.field6729;
    }

    public void method5994() {
        this.field6729.method5925();
        this.field6730.method5956();
        this.field6716.method1566().method5913();
    }

    public Class1267 method5995() {
        return this.field6730;
    }

    public void method5996() {
        this.field6726.method5877();
    }
}
