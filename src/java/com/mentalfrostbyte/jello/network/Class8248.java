package com.mentalfrostbyte.jello.network;

import com.mentalfrostbyte.jello.unmapped.Class6812;
import mapped.Class2455;
import mapped.Class2499;
import mapped.JSONObject;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Class8248 {
    public String field35440;
    public String field35441;
    public String field35442;

    public Class8248(String var1, String var2, String var3) {
        this.field35440 = var1;
        this.field35441 = var2;
        this.field35442 = var3;
    }

    public Class8248(byte[] var1) {
        byte[] var4 = Arrays.copyOf(Class6812.method20755("mcAzMFSvCM6wFCHcgzOn"), 16);
        byte[] var5 = "jelloconnectvect".getBytes();
        SecretKeySpec var6 = new SecretKeySpec(var4, "AES");

        try {
            Cipher var7 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            var7.init(2, var6, new IvParameterSpec(var5));
            JSONObject var8 = new JSONObject(new String(var7.doFinal(var1)));
            if (var8.has("username")) {
                this.field35440 = var8.method21773("username");
            }

            if (var8.has("authToken")) {
                this.field35441 = var8.method21773("authToken");
            }

            if (var8.has("agoraToken")) {
                this.field35442 = var8.method21773("agoraToken");
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchPaddingException | Class2499 |
                 IllegalBlockSizeException | BadPaddingException | InvalidKeyException var9) {
        } catch (Class2455 e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] method28761() {
        byte[] var3 = Arrays.copyOf(Class6812.method20755("mcAzMFSvCM6wFCHcgzOn"), 16);
        byte[] var4 = "jelloconnectvect".getBytes();
        SecretKeySpec var5 = new SecretKeySpec(var3, "AES");

        try {
            Cipher var6 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            var6.init(1, var5, new IvParameterSpec(var4));
            return var6.doFinal(this.method28762().toString().getBytes());
        } catch (NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException |
                 IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public JSONObject method28762() {
        JSONObject var3 = new JSONObject();
        var3.method21806("username", this.field35440);
        var3.method21806("authToken", this.field35441);
        var3.method21806("agoraToken", this.field35442);
        return var3;
    }
}
