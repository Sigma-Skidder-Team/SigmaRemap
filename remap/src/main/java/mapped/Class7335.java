// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.dimension.DimensionType;

import java.util.Locale;

public class Class7335
{
    private final Minecraft field28331;
    private boolean field28332;
    private final Class9239 field28333;
    private long field28334;
    private long field28335;
    private long field28336;
    private boolean field28337;
    
    public Class7335(final Minecraft field28331) {
        this.field28333 = new Class9239();
        this.field28334 = -1L;
        this.field28335 = -1L;
        this.field28336 = -1L;
        this.field28331 = field28331;
    }
    
    private void method22497(final String s, final Object... array) {
        this.field28331.field4647.method3807().method3761(new StringTextComponent("").appendSibling(new Class2259("debug.prefix", new Object[0]).applyTextStyles(TextFormatting.YELLOW, TextFormatting.BOLD)).appendText(" ").appendSibling(new Class2259(s, array)));
    }
    
    private void method22498(final String s, final Object... array) {
        this.field28331.field4647.method3807().method3761(new StringTextComponent("").appendSibling(new Class2259("debug.prefix", new Object[0]).applyTextStyles(TextFormatting.RED, TextFormatting.BOLD)).appendText(" ").appendSibling(new Class2259(s, array)));
    }
    
    private boolean method22499(final int n) {
        if (this.field28334 > 0L && this.field28334 < Util.method27837() - 100L) {
            return true;
        }
        switch (n) {
            case 65: {
                this.field28331.worldRenderer.loadRenderers();
                this.method22497("debug.reload_chunks.message", new Object[0]);
                return true;
            }
            case 66: {
                final boolean b = !this.field28331.method5306().method28704();
                this.field28331.method5306().method28703(b);
                this.method22497(b ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off", new Object[0]);
                return true;
            }
            case 67: {
                if (this.field28331.player.method2896()) {
                    return false;
                }
                this.method22497("debug.copy_location.message", new Object[0]);
                this.method22508(String.format(Locale.ROOT, "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f", DimensionType.method1276(this.field28331.player.world.dimension.getType()), this.field28331.player.getPosX(), this.field28331.player.getPosY(), this.field28331.player.getPosZ(), this.field28331.player.rotationYaw, this.field28331.player.rotationPitch));
                return true;
            }
            case 68: {
                if (this.field28331.field4647 != null) {
                    this.field28331.field4647.method3807().method3760(false);
                }
                return true;
            }
            default: {
                return false;
            }
            case 70: {
                Class6469.field25717.method19475(this.field28331.gameSettings, MathHelper.clamp(this.field28331.gameSettings.field23382 + (Screen.hasShiftDown() ? -1 : 1), Class6469.field25717.method19472(), Class6469.field25717.method19473()));
                this.method22497("debug.cycle_renderdistance.message", this.field28331.gameSettings.field23382);
                return true;
            }
            case 71: {
                this.method22497(this.field28331.field4645.method22331() ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off", new Object[0]);
                return true;
            }
            case 72: {
                this.field28331.gameSettings.advancedItemTooltips = !this.field28331.gameSettings.advancedItemTooltips;
                this.method22497(this.field28331.gameSettings.advancedItemTooltips ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off", new Object[0]);
                this.field28331.gameSettings.method17121();
                return true;
            }
            case 73: {
                if (!this.field28331.player.method2896()) {
                    this.method22500(this.field28331.player.method1926(2), !Screen.hasShiftDown());
                }
                return true;
            }
            case 76: {
                final Minecraft method28894 = Config.method28894();
                method28894.worldRenderer.field9366 = 1;
                method28894.field4647.method3807().method3762(new StringTextComponent(Class8822.method30773("of.message.loadingVisibleChunks", new Object[0])), 201435902);
                return true;
            }
            case 78: {
                if (!this.field28331.player.method1926(2)) {
                    this.method22497("debug.creative_spectator.error", new Object[0]);
                }
                else if (this.field28331.player.method2889()) {
                    this.field28331.player.method4114("/gamemode spectator");
                }
                else {
                    this.field28331.player.method4114("/gamemode creative");
                }
                return true;
            }
            case 79: {
                if (Config.method28955()) {
                    Config.method28894().displayGuiScreen(new Class713(null, Config.method28962()));
                }
                return true;
            }
            case 80: {
                this.field28331.gameSettings.field23395 = !this.field28331.gameSettings.field23395;
                this.field28331.gameSettings.method17121();
                this.method22497(this.field28331.gameSettings.field23395 ? "debug.pause_focus.on" : "debug.pause_focus.off", new Object[0]);
                return true;
            }
            case 81: {
                this.method22497("debug.help.message", new Object[0]);
                final Class684 method28895 = this.field28331.field4647.method3807();
                method28895.method3761(new Class2259("debug.reload_chunks.help", new Object[0]));
                method28895.method3761(new Class2259("debug.show_hitboxes.help", new Object[0]));
                method28895.method3761(new Class2259("debug.copy_location.help", new Object[0]));
                method28895.method3761(new Class2259("debug.clear_chat.help", new Object[0]));
                method28895.method3761(new Class2259("debug.cycle_renderdistance.help", new Object[0]));
                method28895.method3761(new Class2259("debug.chunk_boundaries.help", new Object[0]));
                method28895.method3761(new Class2259("debug.advanced_tooltips.help", new Object[0]));
                method28895.method3761(new Class2259("debug.inspect.help", new Object[0]));
                method28895.method3761(new Class2259("debug.creative_spectator.help", new Object[0]));
                method28895.method3761(new Class2259("debug.pause_focus.help", new Object[0]));
                method28895.method3761(new Class2259("debug.help.help", new Object[0]));
                method28895.method3761(new Class2259("debug.reload_resourcepacks.help", new Object[0]));
                method28895.method3761(new Class2259("debug.pause.help", new Object[0]));
                return true;
            }
            case 82: {
                if (Config.method28955()) {
                    Class9216.method33788();
                    Class9216.method33708();
                }
                return true;
            }
            case 84: {
                this.method22497("debug.reload_resourcepacks.message", new Object[0]);
                this.field28331.method5241();
                return true;
            }
        }
    }
    
    private void method22500(final boolean b, final boolean b2) {
        final RayTraceResult field4691 = this.field28331.field4691;
        if (field4691 != null) {
            switch (Class8540.field35858[field4691.getType().ordinal()]) {
                case 1: {
                    final BlockPos method21447 = ((BlockRayTraceResult)field4691).getPos();
                    final BlockState method21448 = this.field28331.player.world.getBlockState(method21447);
                    if (!b) {
                        this.method22501(method21448, method21447, null);
                        this.method22497("debug.inspect.client.block", new Object[0]);
                        break;
                    }
                    if (b2) {
                        this.field28331.player.field4069.method17378().method26648(method21447, class7098 -> {
                            this.method22501(class7096, class7097, class7098);
                            this.method22497("debug.inspect.server.block", new Object[0]);
                            return;
                        });
                        break;
                    }
                    final TileEntity method21449 = this.field28331.player.world.getTileEntity(method21447);
                    this.method22501(method21448, method21447, (method21449 != null) ? method21449.method2180(new CompoundNBT()) : null);
                    this.method22497("debug.inspect.client.block", new Object[0]);
                    break;
                }
                case 2: {
                    final Entity method21450 = ((EntityRayTraceResult)field4691).getEntity();
                    final ResourceLocation method21451 = Registry.field210.getKey(method21450.getType());
                    if (!b) {
                        this.method22502(method21451, method21450.method1934(), null);
                        this.method22497("debug.inspect.client.entity", new Object[0]);
                        break;
                    }
                    if (b2) {
                        this.field28331.player.field4069.method17378().method26647(method21450.getEntityId(), class7101 -> {
                            this.method22502(class7099, class7100.method1934(), class7101);
                            this.method22497("debug.inspect.server.entity", new Object[0]);
                            return;
                        });
                        break;
                    }
                    this.method22502(method21451, method21450.method1934(), method21450.method1756(new CompoundNBT()));
                    this.method22497("debug.inspect.client.entity", new Object[0]);
                    break;
                }
            }
        }
    }
    
    private void method22501(final BlockState class7096, final BlockPos class7097, final CompoundNBT obj) {
        if (obj != null) {
            obj.remove("x");
            obj.remove("y");
            obj.remove("z");
            obj.remove("id");
        }
        final StringBuilder sb = new StringBuilder(Class7572.toString(class7096));
        if (obj != null) {
            sb.append(obj);
        }
        this.method22508(String.format(Locale.ROOT, "/setblock %d %d %d %s", class7097.getX(), class7097.getY(), class7097.getZ(), sb));
    }
    
    private void method22502(final ResourceLocation class1932, final Vec3d class1933, final CompoundNBT class1934) {
        String s;
        if (class1934 == null) {
            s = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", class1932.toString(), class1933.x, class1933.y, class1933.z);
        }
        else {
            class1934.remove("UUIDMost");
            class1934.remove("UUIDLeast");
            class1934.remove("Pos");
            class1934.remove("Dimension");
            s = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", class1932.toString(), class1933.x, class1933.y, class1933.z, class1934.toFormattedComponent().getString());
        }
        this.method22508(s);
    }
    
    public void method22503(final long n, final int i, final int j, final int k, final int l) {
        if (n == this.field28331.method5332().getHandle()) {
            if (Client.getInstance().getGuimanager().method32154() != null) {
                Client.getInstance().getGuimanager().method32127(i, k);
                return;
            }
            if (this.field28331.currentScreen != null) {
                if (this.field28331.currentScreen instanceof ChatScreen) {
                    if (i == 258) {
                        final Class5752 class5752 = new Class5752(i, k == 2, null);
                        Client.getInstance().getEventBus().method21097(class5752);
                        if (class5752.isCancelled()) {
                            return;
                        }
                    }
                }
            }
            else if (k != 1 && k != 2) {
                if (k == 0) {
                    Class8004.method26200(i);
                }
            }
            else {
                Class8004.method26199(i);
                final Class5752 class5753 = new Class5752(i, k == 2, null);
                Client.getInstance().getEventBus().method21097(class5753);
                if (class5753.isCancelled()) {
                    return;
                }
            }
            if (this.field28334 <= 0L) {
                if (Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 67)) {
                    if (Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 292)) {
                        this.field28337 = true;
                        this.field28334 = Util.method27837();
                        this.field28335 = Util.method27837();
                        this.field28336 = 0L;
                    }
                }
            }
            else if (!Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 67) || !Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 292)) {
                this.field28334 = -1L;
            }
            final Screen field4700 = this.field28331.currentScreen;
            if (!(this.field28331.currentScreen instanceof Class705) || ((Class705)field4700).field3875 <= Util.method27837() - 20L) {
                if (k != 1) {
                    if (k == 0) {
                        if (this.field28331.currentScreen instanceof Class705) {
                            ((Class705)this.field28331.currentScreen).field3874 = null;
                        }
                    }
                }
                else {
                    if (this.field28331.gameSettings.field23454.method1066(i, j)) {
                        this.field28331.method5332().method7685();
                        this.field28331.gameSettings.field23430 = this.field28331.method5332().method7691();
                        return;
                    }
                    if (this.field28331.gameSettings.field23451.method1066(i, j)) {
                        if (!Screen.method3046()) {}
                        Class8283.method27524(this.field28331.field4652, this.field28331.method5332().method7692(), this.field28331.method5332().method7693(), this.field28331.method5234(), p0 -> this.field28331.execute(() -> this.field28331.field4647.method3807().method3761(class5754)));
                        return;
                    }
                }
            }
            boolean b = false;
            Label_0616: {
                if (field4700 != null) {
                    if (field4700.getFocused() instanceof Class576) {
                        if (((Class576)field4700.getFocused()).method3394()) {
                            b = false;
                            break Label_0616;
                        }
                    }
                }
                b = true;
            }
            final boolean b2 = b;
            if (k != 0) {
                if (i == 66) {
                    if (Screen.method3046()) {
                        if (b2) {
                            Class6469.field25726.method19485(this.field28331.gameSettings, 1);
                            if (field4700 instanceof Class707) {
                                ((Class707)field4700).method3913();
                            }
                            if (field4700 instanceof Class710) {
                                ((Class710)field4700).method3922();
                            }
                        }
                    }
                }
            }
            if (field4700 != null) {
                final boolean[] array = { false };
                Screen.method3053(() -> {
                    if (n3 != 1 && (n3 != 2 || !this.field28332)) {
                        if (n3 == 0) {
                            if (!(!Class9570.field41304.method22605())) {
                                if (!(!(array2[0] = Class9570.method35812(Class9570.field41304, this.field28331.currentScreen, n4, n5, n6)))) {
                                    return;
                                }
                            }
                            array2[0] = class5755.method3007(n4, n5, n6);
                            if (!(!Class9570.field41305.method22605())) {
                                if (!array2[0]) {
                                    array2[0] = Class9570.method35812(Class9570.field41305, this.field28331.currentScreen, n4, n5, n6);
                                }
                            }
                        }
                    }
                    else {
                        if (!(!Class9570.field41302.method22605())) {
                            if (!(!(array2[0] = Class9570.method35812(Class9570.field41302, this.field28331.currentScreen, n4, n5, n6)))) {
                                return;
                            }
                        }
                        array2[0] = class5755.method2972(n4, n5, n6);
                        if (!(!Class9570.field41303.method22605())) {
                            if (!array2[0]) {
                                array2[0] = Class9570.method35812(Class9570.field41303, this.field28331.currentScreen, n4, n5, n6);
                            }
                        }
                    }
                    return;
                }, "keyPressed event handler", ((Class710)field4700).getClass().getCanonicalName());
                if (array[0]) {
                    return;
                }
            }
            if (this.field28331.currentScreen == null || this.field28331.currentScreen.passEvents) {
                final Class7985 method27796 = Class8341.method27796(i, j);
                if (k != 0) {
                    if (i == 293) {
                        if (this.field28331.field4644 != null) {
                            this.field28331.field4644.method5801();
                        }
                    }
                    boolean b3 = false;
                    if (this.field28331.currentScreen == null) {
                        if (i == 256) {
                            this.field28331.method5255(Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 292));
                        }
                        b3 = (Class8341.method27798(Minecraft.method5277().method5332().getHandle(), 292) && this.method22499(i));
                        this.field28337 |= b3;
                        if (i == 290) {
                            this.field28331.gameSettings.field23464 = !this.field28331.gameSettings.field23464;
                        }
                    }
                    if (!b3) {
                        Class350.method1052(method27796, true);
                        Class350.method1051(method27796);
                    }
                    else {
                        Class350.method1052(method27796, false);
                    }
                    if (this.field28331.gameSettings.field23467) {
                        if (i == 48) {
                            this.field28331.method5251(0);
                        }
                        for (int n2 = 0; n2 < 9; ++n2) {
                            if (i == 49 + n2) {
                                this.field28331.method5251(n2 + 1);
                            }
                        }
                    }
                }
                else {
                    Class350.method1052(method27796, false);
                    if (i == 292) {
                        if (!this.field28337) {
                            this.field28331.gameSettings.field23466 = !this.field28331.gameSettings.field23466;
                            this.field28331.gameSettings.field23467 = (this.field28331.gameSettings.field23466 && Screen.hasShiftDown());
                            this.field28331.gameSettings.field23468 = (this.field28331.gameSettings.field23466 && Screen.method3048());
                            if (this.field28331.gameSettings.field23466) {
                                if (this.field28331.gameSettings.field23496) {
                                    this.field28331.gameSettings.field23468 = true;
                                }
                                if (this.field28331.gameSettings.field23497) {
                                    this.field28331.gameSettings.field23467 = true;
                                }
                            }
                        }
                        else {
                            this.field28337 = false;
                        }
                    }
                }
            }
            Class9570.field41286.method22608(i, j, k, l);
        }
    }
    
    private void method22504(final long p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        mapped/Class7335.field28331:Lmapped/Class869;
        //     5: invokevirtual   mapped/Class869.method5332:()Lmapped/Class1925;
        //     8: invokevirtual   mapped/Class1925.method7690:()J
        //    11: lcmp           
        //    12: ifeq            17
        //    15: return         
        //    16: athrow         
        //    17: invokestatic    mapped/Class9463.method35173:()Lmapped/Class9463;
        //    20: invokevirtual   mapped/Class9463.method35193:()Lmapped/Class9000;
        //    23: invokevirtual   mapped/Class9000.method32154:()Lmapped/Class4800;
        //    26: ifnonnull       47
        //    29: aload_0        
        //    30: getfield        mapped/Class7335.field28331:Lmapped/Class869;
        //    33: getfield        mapped/Class869.field4700:Lmapped/Class527;
        //    36: astore          7
        //    38: aload           7
        //    40: ifnonnull       61
        //    43: goto            15
        //    46: athrow         
        //    47: invokestatic    mapped/Class9463.method35173:()Lmapped/Class9463;
        //    50: invokevirtual   mapped/Class9463.method35193:()Lmapped/Class9000;
        //    53: iload_3        
        //    54: iload           4
        //    56: invokevirtual   mapped/Class9000.method32128:(II)V
        //    59: return         
        //    60: athrow         
        //    61: aload_0        
        //    62: getfield        mapped/Class7335.field28331:Lmapped/Class869;
        //    65: invokevirtual   mapped/Class869.method5330:()Lmapped/Class566;
        //    68: ifnull          75
        //    71: goto            15
        //    74: athrow         
        //    75: iload_3        
        //    76: invokestatic    java/lang/Character.charCount:(I)I
        //    79: iconst_1       
        //    80: if_icmpeq       101
        //    83: iload_3        
        //    84: invokestatic    java/lang/Character.toChars:(I)[C
        //    87: astore          8
        //    89: aload           8
        //    91: arraylength    
        //    92: istore          9
        //    94: iconst_0       
        //    95: istore          10
        //    97: goto            130
        //   100: athrow         
        //   101: aload_0        
        //   102: iload_3        
        //   103: iload           4
        //   105: aload           7
        //   107: invokedynamic   BootstrapMethod #4, run:(Lmapped/Class7335;IILmapped/Class574;)Ljava/lang/Runnable;
        //   112: ldc_w           "charTyped event handler"
        //   115: aload           7
        //   117: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   120: invokevirtual   java/lang/Class.getCanonicalName:()Ljava/lang/String;
        //   123: invokestatic    mapped/Class527.method3053:(Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/String;)V
        //   126: goto            15
        //   129: athrow         
        //   130: iload           10
        //   132: iload           9
        //   134: if_icmplt       141
        //   137: goto            15
        //   140: athrow         
        //   141: aload           8
        //   143: iload           10
        //   145: caload         
        //   146: istore          11
        //   148: aload_0        
        //   149: iload           11
        //   151: iload           4
        //   153: aload           7
        //   155: invokedynamic   BootstrapMethod #5, run:(Lmapped/Class7335;CILmapped/Class574;)Ljava/lang/Runnable;
        //   160: ldc_w           "charTyped event handler"
        //   163: aload           7
        //   165: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   168: invokevirtual   java/lang/Class.getCanonicalName:()Ljava/lang/String;
        //   171: invokestatic    mapped/Class527.method3053:(Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/String;)V
        //   174: iinc            10, 1
        //   177: goto            130
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot invoke "com.strobel.assembler.metadata.TypeReference.getSimpleType()" because the return value of "com.strobel.decompiler.ast.Variable.getType()" is null
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.generateNameForVariable(NameVariables.java:252)
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.assignNamesToVariables(NameVariables.java:185)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.nameVariables(AstMethodBodyBuilder.java:1482)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.populateVariables(AstMethodBodyBuilder.java:1411)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void method22505(final boolean field4701) {
        this.field28332 = field4701;
    }
    
    public void method22506(final long n4) {
        Class8341.method27799(n4, (n4, n5, n6, n7, n8) -> this.field28331.execute(() -> this.method22503(n9, n10, n11, n12, n13)), (n4, n5, n6) -> this.field28331.execute(() -> this.method22504(n7, n8, n9)));
    }
    
    public String method22507() {
        return this.field28333.method34063(this.field28331.method5332().getHandle(), (n4, n5) -> {
            if (n4 != 65545) {
                this.field28331.method5332().method7670(n4, n5);
            }
        });
    }
    
    public void method22508(final String s) {
        this.field28333.method34065(this.field28331.method5332().getHandle(), s);
    }
    
    public void method22509() {
        if (this.field28334 > 0L) {
            final long method27837 = Util.method27837();
            final long n4 = 10000L - (method27837 - this.field28334);
            final long n5 = method27837 - this.field28335;
            if (n4 < 0L) {
                if (Screen.method3046()) {
                    Class9491.method35320();
                }
                throw new ReportedException(new CrashReport("Manually triggered debug crash", new Throwable()));
            }
            if (n5 >= 1000L) {
                if (this.field28336 != 0L) {
                    this.method22498("debug.crash.warning", MathHelper.ceil(n4 / 1000.0f));
                }
                else {
                    this.method22497("debug.crash.message", new Object[0]);
                }
                this.field28335 = method27837;
                ++this.field28336;
            }
        }
    }
}
